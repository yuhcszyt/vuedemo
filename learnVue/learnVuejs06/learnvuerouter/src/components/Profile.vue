<template>
  <div>
    <h2>this is profile</h2>
    <p>hahahah</p>
    {{this.$route.query.age}}
    {{this.$route.query.height}}
    {{this.$route.query.name}}
  </div>
</template>

<script>
    export default {
        name: "Profile"
    }
</script>

<style scoped>

</style>
