export default {
  updateInfoAction(context,payload){
    return new Promise((resolve,reject)=>{
      setTimeout(()=>{
        context.commit('updateInfo');
        resolve(payload.success);
        console.log(payload.msg);
      },1000);
    })
  }
}
