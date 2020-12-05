<template>
  <div id="app">
<!--
    <router-link to="/home" tag="button" replace>首頁</router-link>
    <router-link to="/about" tag="button" replace>关于</router-link>

    <router-view></router-view>-->
    <!--<button @click="linkToHome">首页</button>
    <button @click="linkToAbout">关于</button>
    <button @click="linkToUser">用户</button>
    <router-view></router-view>-->

    <router-link to="/home" tag="button" replace>首頁</router-link>
    <router-link to="/about" tag="button" replace>关于</router-link>
   <!-- <router-link :to="'/user/'+userId" tag="button" replace>用戶</router-link>
    <router-link :to="{path:'/profile',query:{name:'yu',age:'18',height:178}}" tag="button" replace>档案</router-link>-->

    <button @click="linkToUser">用户</button>
    <button @click="linkToProfile">档案</button>

    <keep-alive exclude="Profile,user">
    <router-view></router-view>
    </keep-alive>
  </div>
</template>

<script>
export default {
  name: 'App',
    data() {
        return {
            userId: 'lisi',
            userName:'yuhc'
        }
    },
    methods:{
        linkToHome(){
            console.log("home");
            //  this.$router.push('/home');
            this.$router.replace('/home')

        },
        linkToAbout()
        {
            console.log("about")
            //this.$router.push('/about');
            this.$router.replace('/about')
        },
        linkToUser(){
            //this.$router.push('/user/'+this.userName);
            this.$router.replace('/user/'+this.userName);
        },
        linkToProfile(){
           /* this.$router.push({
                path:'/profile',
                query:{
                    name:'hc',
                    age:18,
                    height:1.80
                }
            });*/
            this.$router.replace({
                path:'/profile',
                query:{
                    name:'hc',
                    age:'18',
                    height:'1.80'
                }
            });
        }
    }
}
</script>

<style>
 .active{
   color: #ff0000;
 }
</style>
