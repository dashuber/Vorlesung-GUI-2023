<script setup lang='ts'>
import GreetingComponent from '@/search/GreetingComponent.vue';

function doGreet(greeting: string) {
  console.log(greeting);
}
</script>

<template>
  <div>
    <greeting-component :greet-message='`Hallo`'
                        :placeholder='`Bitte gib Deinen Namen ein`'
                        @onGreet='doGreet'></greeting-component>
  </div>
</template>

<style>
</style>

