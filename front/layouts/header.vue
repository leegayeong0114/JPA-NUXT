<template >
  <div style="height: 10vh;">
    헤더이다
    <div>

      <NuxtLink
        :to="'/'"
      >
        / index
      </NuxtLink>

      <NuxtLink
        :to="'/board'"
      >
        / board
      </NuxtLink>

    </div>
  </div>
</template>

<script setup lang="ts">

</script>

<style>

</style>