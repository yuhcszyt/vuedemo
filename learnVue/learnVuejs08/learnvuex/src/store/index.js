import Vue from 'vue'
import Vuex from 'vuex'
import actions from "./actions";
import getters from "./getters";
import mutations from "./mutations";
import moduleA from "./modules/moduleA";

Vue.use(Vuex)

const store=new Vuex.Store({
  state:{
    counter:1000,
    stu:[
      {name:'y1',age:21},
      {name:'y2',age:10},
      {name:'y3',age:18},
      {name:'y4',age:25}
    ],
    person:{
      name:'梁兵',
      age:30
    }
  },
  mutations,
  actions,
  getters,
  modules:{
    a:moduleA
  }
})

export default store
