<template>
  <div>
    [boardNo] {{ boardNo }} 페이지이다
    <div>
      <p>제목: {{ board?.title }}</p>
      <p>내용: {{ board?.contents }}</p>
    </div>
    <Button
      :name="'수정'"
      :events="handleClickModifyButton"
    ></Button>
    <Button
      :name="'삭제'"
      :events="handleClickDeleteButton"
    ></Button>
  </div>
</template>

<script setup lang="ts">
import { 
  fetchSelectBoardByBoardNo 
} from '~/apis/boad'
import { 
  Board 
} from '~/types/board'

const route = useRoute()
const boardNo = route.params.boardNo

const router = useRouter()

const board = ref<Board>()

const handleClickModifyButton = () => {
  router.push(`/board/edit/${boardNo}`)
}

const handleClickDeleteButton = () => {

}

onMounted(async () => {
  console.log('mounted..')
  const _boardNo = parseInt(boardNo as string)
  const data: Board = await fetchSelectBoardByBoardNo(_boardNo)
  board.value = data
})
</script>

<style>
  
</style>