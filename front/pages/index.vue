<template>
  <div>
    index 페이지이다
    <div>
      store test : 
      <button
        @click="counterStore.plus"
      >
        +
      </button>
      <button
        @click="counterStore.minus"
      >
        -
      </button>
      : {{ counterStore.count }}
    </div>
  </div>
</template>

<script setup lang="ts">
import {
  useCounterStore
} from '~/stores/counter'

const counterStore = useCounterStore()

</script>

<style>
  
</style>