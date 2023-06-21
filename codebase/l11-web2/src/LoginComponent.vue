<script setup lang='ts'>
import {reactive} from 'vue';
import {LoginCredentials} from '@/LoginCredentials';

const loginCredentials = reactive(new LoginCredentials());
</script>

<template>
  <div class='login-dialog'>
    <h1>Login</h1>
    <div class='login-form'>
      <label>Name:</label>
      <input type='text' v-model='loginCredentials.name' />
      <label>Password:</label>
      <input type='password' />
      <div class='button-panel'>
        <button
          type='button'
          class='btn btn-sm btn-primary'
          id='save-button'
          v-on:click='save()'
        >
          Log in '{{ loginCredentials.name }}'
        </button>
      </div>
    </div>
  </div>
</template>

<style>
.login-dialog {
  margin: 1em;
}

.login-form {
  display: grid;
  grid-template-columns: auto 1fr;
  grid-gap: 0.3em;
  margin: 0.3em;
}

.button-panel {
  grid-column: span 2;
  justify-self: end;
}
</style>
