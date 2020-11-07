<template>
    <div>
        <h2 class="title">{{message}}</h2>
        <cpn></cpn>
    </div>
</template>
<script>
    import cpn from './cpn.vue';
    export default {
        name:"APP",
        components:{
            cpn
        },
        data(){
            return {message:'Hello Webpack'}
        }
    }
</script>
<style scoped>
    .title {
        color: green;
    }
</style>
