<script setup lang='ts'>
import {ref} from 'vue';

//ref for reactive values, reactive() for objects
const message = ref('Hello world!');

function sayHello() {
  //.value if you access a ref variable in code
  alert(message.value);
}
</script>

<template>
  <button @click='sayHello'>Say hello</button>
</template>

<style></style>
