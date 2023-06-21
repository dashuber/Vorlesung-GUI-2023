<script setup lang='ts'>

import {ref} from 'vue';

const name = ref('');

const props = defineProps({
  greetMessage: String,
  placeholder: String
});

const emits = defineEmits(['onGreet']);

function doGreet() {
  emits('onGreet', props.greetMessage + ' ' + name.value);
}
</script>

<template>
  <input v-bind:value='props.greetMessage' disabled>
  <input type='text' v-model='name' :placeholder='props.placeholder'>
  <button @click='doGreet'>Greet me!</button>
</template>

<style>
</style>
