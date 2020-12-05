import VueRouter from "vue-router";
import Vue from "vue";

Vue.use(VueRouter);
const Cart = () => import('../views/cart/Cart.vue');
const Category = () => import('../views/category/Category.vue');
const Home = () => import('../views/home/Home.vue');
const Profile = () => import('../views/profile/Profile.vue');


const routes = [
  {
    path: '',
    redirect: '/home'
  },
  {
    path: '/home',
    component: Home
  },
  {
    path: '/Cart',
    component: Cart
  },
  {
    path: '/Category',
    component: Category
  },
  {
    path: '/Profile',
    component: Profile
  }
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
