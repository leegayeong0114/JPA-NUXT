import {
  defineStore,
} from 'pinia'
import { 
  User 
} from '~/types/user'

export const useUserStore = defineStore('user', () => {

  const user = ref<User>()

  const setUser = (_user: User) => {
    user.value = _user
  }

  return {
    user,
    setUser,
  }
})