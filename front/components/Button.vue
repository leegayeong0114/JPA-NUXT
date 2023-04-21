<template>
  <button 
    type="button"
    @click="events"
  >
    {{ name }}
  </button>
</template>

<script setup lang="ts">
const props = defineProps<{
  name: string,
  events: () => void
}>()

</script>

<style>
  
</style>