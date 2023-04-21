<template>
  <div>
    board 페이지이다
    <div>
      <Button
        :name="'등록'"
        :events="handleClickButton"
      ></Button>
      <div
        v-for="board in boardList"
      >
        <NuxtLink
          :to="`/board/${board.boardNo}`"
        >
          {{ board.boardNo }} /
          {{ board.title }} /
          {{ board.contents }}
        </NuxtLink>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { 
  fetchSelectBoardList 
} from '~/apis/boad'
import { 
  Board 
} from '~/types/board'

const router = useRouter()
const boardList = ref<Board[]>([])

const handleClickButton = () => {
  router.push('/board/regist')
}

onMounted(async () => {
  console.log('mounted..')
  const data  = await fetchSelectBoardList()
  boardList.value = data
})
</script>

<style>
  
</style>