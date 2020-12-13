import Vue from 'vue'
import Vuex from 'vuex'
import {INCREMENT} from './mutations-types'

Vue.use(Vuex)

const store=new Vuex.Store({
  state:{
    counter:1000,
    stu:[
      {name:'y1',age:21},
      {name:'y2',age:10},
      {name:'y3',age:18},
      {name:'y4',age:25}
    ]
  },
  mutations:{
    [INCREMENT](state){
      state.counter++
    },
    decrement(state){
      state.counter--
    },
    incrementCount(state,payload){
     // state.counter+=count
      console.log(payload);
      state.counter+=payload.count
    },
    addStu(state,stu){
      state.stu.push(stu);
    },
    delstu(state){
      state.stu.pop();
    }
  },
  actions:{},
  getters:{
    powerCount(state){
      return state.counter*state.counter;
    },
    more20stu(state){
        return state.stu.filter(s=>s.age>20);
    },
    more20stuLength(state,getter){
        return getter.more20stu.length;
    },
    moreAgeStu(state){
      return function (age) {
        return state.stu.filter(s=>s.age>age);
      }
    }
  },
  modules:{

  }
})

export default store
