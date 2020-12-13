import VueRouter from "vue-router";
import Vue from 'vue'

/*
import Home from '../components/Home'
import About from '../components/About'
import User from '../components/User'
*/

const Home= ()=> import('../components/Home');
const About= ()=> import('../components/About');
const User= ()=> import('../components/User');
const HomeNews= ()=> import('../components/HomeNews');
const HomeMessage= ()=> import('../components/HomeMessage');
const Profile= ()=> import('../components/Profile');


//安装插件 router-link  router-view $router 全局
Vue.use(VueRouter);

const routes=[
  //default 跳转
  {
    path:'',
    redirect:"/home"
  },
  {
    path:"/home",
    component:Home,
    name:'首页',
    meta:{
      title:'首页'
    },
    children:[
      {
        path:"",
        redirect:'message',
      },
      {
        path:"news",
        component: HomeNews,
        name:'新闻',
        meta:{
          title:'新闻'
        }
      },
      {
        path:"message",
        component: HomeMessage,
        name:'消息',
        meta:{
          title:'消息'
        }
      }
    ]
  },
  {
    path:"/profile",
    component: Profile,
    meta:{
      title:'名片'
    }
  },
  {
    path:"/about",
    component:About,
    meta:{
      title:'关于'
    }
  },
  {
    path:"/user/:userId",
   // path:"/user",
    component:User,
    meta:{
      title:'用戶'
    }
  }
]

//前置守卫
const router = new VueRouter({
  mode:'history',
  routes,
  linkActiveClass:'active'
})

router.beforeEach((to,from,next)=>{
  const vm = to;
  console.log(vm);
  document.title=to.matched[0].meta.title;
  //document.title=to.meta.title;
  next();
});

export  default router
