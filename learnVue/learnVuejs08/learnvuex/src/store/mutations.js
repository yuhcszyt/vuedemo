import Vue from "vue"
import {INCREMENT} from "./mutations-types";

export default {
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
    },
    updateInfo(state){
      state.person.name='刘翔'
      //state.person.address='honganwei';
      Vue.set(state.person,'address','honganwei');
    }
}
