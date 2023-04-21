<template>
  <div>
    regist 페이지다
    <input 
      type="text"
      v-model="title"
      ref="inputTitle"
    />
    <textarea
      v-model="contents"
    >
    </textarea>
    <Button
      :name="'등록'"
      :events="handleClickButton"
    ></Button>
  </div>
</template>

<script setup lang="ts">
import { 
  fetchRegistBoard 
} from '~/apis/boad'
import { 
  Board 
} from '~/types/board'

const router = useRouter()

const title = ref<string>('')
const contents = ref<string>('')

const handleClickButton = async () => {

  const req: Board = {
    title: title.value, 
    contents: contents.value
  }

  const data: Board = await fetchRegistBoard(req) 
    
  router.push(`/board/${data.boardNo}`)
}

onMounted(() => {

})

</script>

<style>
  
</style>