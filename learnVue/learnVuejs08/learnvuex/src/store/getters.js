export default {
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
}
