<template>
  <div>
    <h2>this is {{this.userId}}</h2>
    <h2>this is {{$route.params.userId}}</h2>
    <p>hahahah</p>
  </div>
</template>

<script>
    export default {
        name: "user",
        computed:{
            userId(){
                return this.$route.params.userId;
            }
        },
        created() {
            console.log('user');
        },
        destroyed() {
            console.log('userDestroy');
        }
    }
</script>

<style scoped>

</style>
