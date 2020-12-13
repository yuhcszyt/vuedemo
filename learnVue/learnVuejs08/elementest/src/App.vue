<template>
  <div id="app">
<!--
      <el-input-number v-model="num" :precision="2" :controls="false" :min="0" placeholder="请输入"></el-input-number>
-->
    <el-input oninput="value=value.indexOf('.') > -1?value.substring(0, value.indexOf('.') + 3):value"
              v-model="num" type="number" min="0"
              placeholder="请输入" style="text-align: right">
    </el-input>

    <el-input type="number" step="0.01" v-model.number="num" autocomplete="off"></el-input>

  </div>
</template>

<script>
export default {
  name: 'App',
    data() {
        return {
            num:undefined
        }
    }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
