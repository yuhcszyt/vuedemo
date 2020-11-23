const {sum,mul} = require('./js/mathUtils');

console.log(sum(23, 43));
console.log(mul(2, 4));

require('./css/normal.css');

require('./css/special.less');

document.writeln("liyinhe");


import Vue from 'vue'
import app from './vue/app.vue'

new Vue({
    el:'#app',
    template:'<app/>',
    components:{
        app
    }
})