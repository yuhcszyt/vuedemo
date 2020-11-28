import VueRouter from "vue-router";
import Vue from 'vue'

import home from '../components/home'
import about from '../components/about'

//安装插件 router-link  router-view $router 全局
Vue.use(VueRouter);

const routes=[
  //default 跳转
  /*{
    path:'',
    redirect:"/home"
  },*/
  {

    path:"/home",
    component:home
  },
  {
    path:"/about",
    component:about
  }
]

const router = new VueRouter({
  mode:'history',
  routes,
  linkActiveClass:'active'
})

export  default router
