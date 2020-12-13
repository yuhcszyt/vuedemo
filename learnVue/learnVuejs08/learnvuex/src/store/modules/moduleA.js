export default
{
  state:{
    personA:{
      name:'彭佳慧',
        age:25
    },
    count:20
  },
  mutations:{
    addCountA(state,payload){
      return state.count+=payload.count;
    },
    updatePersonName(state,payload){
      console.log(payload.name);
      state.personA.name=payload.name;
    }
  },
  actions:{
    updateNameAction(context,payload){
      return new Promise((resolve, reject) => {
        setTimeout((  )=>{
          console.log(payload);
          context.commit({
            type:'updatePersonName',
            name:payload.name
          });
          resolve(payload.msg);
        })
      })
    }
  },
  getters:{
    getCount(state){
      return  state.count*state.count;
    },
    getName(state,getter){
      return  state.personA.name+getter.getCount;
    },
    getRootName(state,getter,rootState){
      return  state.personA.name+getter.getCount+rootState.counter;
    }
  }
}
