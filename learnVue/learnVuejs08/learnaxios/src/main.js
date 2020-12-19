import Vue from 'vue'
import App from './App'

Vue.config.productionTip = false
import  {request} from './network/request'



import axios from 'axios'

request({ url:'/home/multidata',
  //method:'post'
  method:'get'}).then(res=>{
  console.log(res);
})



/*axios.defaults.baseURL='http://123.207.32.32:8000'
axios.defaults.timeout=5000
axios({
    url:'/home/multidata',
    //method:'post'
     method:'get'
}).then(res=>{
  console.log(res);
})*/
/*

axios({
  url:'/home/data',
  params:{
    type:'pop',
    page:1
  }
}).then(res=>{
  console.log(res);
})

axios.all([
  axios({
           url:'/home/data',
           params:{
             type:'pop',
             page:1
           }
         }),
  axios({
    url:'/home/multidata',
    //method:'post'
    method:'get'
  })
]).then(res=>{
  console.log(res);
})
*/


/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: d => d(App)
})


