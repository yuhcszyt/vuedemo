<template>
  <div>
    <h2>this is home</h2>
    <p>hihihihi</p>
    <router-link to="/home/news">新闻</router-link>
    <router-link to="/home/message">消息</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
    export default {
        name: "home",
        data(){
            return {
                path:'/home/message'
            }
        },
        created() {
            console.log("create");
        },
        activated() {
            this.$router.push(this.path);
        },
        beforeRouteLeave(to,from,next){
            this.path=this.$route.path;
            next();
        }
    }
</script>

<style scoped>

</style>
