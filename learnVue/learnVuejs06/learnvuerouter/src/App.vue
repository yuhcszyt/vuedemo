<template>
  <div id="app">
<!--
    <router-link to="/home" tag="button" replace>首頁</router-link>
    <router-link to="/about" tag="button" replace>关于</router-link>

    <router-view></router-view>-->
    <button @click="linkToHome">首页</button>
    <button @click="linkToAbout">关于</button>
    <router-view></router-view>

  </div>
</template>

<script>
export default {
  name: 'App',
    methods:{
        linkToHome(){
            console.log("home")
          //  this.$router.push('/home');
            this.$router.replace('/home')

        },
        linkToAbout(){
            console.log("about")
            //this.$router.push('/about');
            this.$router.replace('/about')
        }
    }
}
</script>

<style>
 .active{
   color: #ff0000;
 }
</style>
