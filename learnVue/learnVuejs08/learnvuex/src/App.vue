<template>
  <div id="app">
    <h1>{{msg}}</h1>
    <hello-world counter=yu></hello-world>
    <button @click="addition()">+</button>
    <button @click="subtraction()">-</button>
    <button @click="addCount(5)">+5</button>
    <button @click="addCount(10)">+10</button>
    <button @click="addStu">添加学生</button>
    <button @click="delStu">del学生</button>


  </div>
</template>

<script>
  import HelloWorld from "./components/HelloWorld";
    export default {
        data(){
            return {msg:this.$store.state.counter}
        },
      name: 'App',
      components:{
          HelloWorld
      },
        methods:{
            addition(){
                this.$store.commit('increment');
            },
            subtraction(){
                this.$store.commit('decrement');
            },
           /* addCount(count){
                this.$store.commit('incrementCount',count);
            },*/
            addCount(count){
                this.$store.commit({
                    type:'incrementCount',
                    count
                });
            },
            addStu(){
                const stu={name:'yy',age:35}
                this.$store.commit('addStu',stu);
            },
            delStu(){
                this.$store.commit('delstu');
            }
        }
}
</script>

<style>

</style>
