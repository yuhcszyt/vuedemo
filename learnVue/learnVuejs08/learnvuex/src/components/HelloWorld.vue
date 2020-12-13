<template>
  <div class="hello">
    <h1>{{$store.state.counter }}</h1>
    <h1>{{$store.state.person }}</h1>
    <h1>{{$store.getters.powerCount}}</h1>
    <h1>{{$store.getters.powerCount}}</h1>
    <h1>{{$store.getters.more20stu}}</h1>
    <h1>{{$store.getters.more20stuLength}}</h1>
    <h1>{{$store.getters.moreAgeStu(8)}}</h1>


    <h2>{{counter}}</h2>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
    props:{
      counter:String
    },
  data () {
    return {
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
