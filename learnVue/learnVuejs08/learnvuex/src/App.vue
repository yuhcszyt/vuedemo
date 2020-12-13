<template>
  <div id="app">
    <h1>{{msg}}</h1><!--要用comput去获取，否则不是响应式-->
    <hello-world counter=yu></hello-world>
    <button @click="addition()">+</button>
    <button @click="subtraction()">-</button>
    <button @click="addCount(5)">+5</button>
    <button @click="addCount(10)">+10</button>
    <button @click="addStu">添加学生</button>
    <button @click="delStu">del学生</button>

    <button @click="updatePerson">更新人信息</button>

    <h1>-------------module--------------</h1>
    <h2>{{$store.state.a.personA}}</h2>
    <h2>{{$store.state.a.count}}</h2>
    <h2>{{$store.getters.getCount}}</h2>
    <h2>{{$store.getters.getName}}</h2>
    <h2>{{$store.getters.getRootName}}</h2>
    <button @click="addCountA(10)">+10</button>
    <button @click="updatePerAction('钟紫娟',16)">更新人信息</button>

  </div>
</template>

<script>
  import HelloWorld from "./components/HelloWorld";
  import {INCREMENT} from "@/store/mutations-types";
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
                this.$store.commit(INCREMENT);
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
            },
            updatePerson(){
                this.$store.dispatch('updateInfoAction',{
                    success:'chenggong',
                    msg:'hello'
                }).then((res)=>{
                    console.log(res);
                });
            },
            addCountA(count){
                this.$store.commit({
                    type:'addCountA',
                    count
                });
/*
                this.$store.commit('addCountA',count);
*/
            },
            updatePerAction(name,age){
                this.$store.dispatch('updateNameAction',{
                    name,
                    age,
                    msg:'test'
                }).then((res)=>{
                    console.log(res);
                })
            }
        }
}
</script>

<style>

</style>
