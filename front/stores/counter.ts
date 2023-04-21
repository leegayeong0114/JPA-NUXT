import {
  defineStore,
} from 'pinia'

export const useCounterStore = defineStore('counter', () => {

  const count = ref<number>(0)

  const plus = () => {
    console.log(count.value)
    count.value += 1
  }

  const minus = () => {
    count.value -= 1
  }

  return {
    count,
    plus,
    minus,
  }
})