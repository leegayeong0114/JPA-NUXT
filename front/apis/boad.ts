import { 
  API_GET_BOARD_ALL, 
  API_GET_BOARD_BY_BOARD_NO,
  API_MODIFY_BOARD,
  API_REGIST_BOARD,
} from '~/consts/apis/board'
import { 
  Board 
} from '~/types/board'

/**
 * 게시글 목록 가져오기
 */
export const fetchSelectBoardList = async (
) => await $fetch<Board[]>(API_GET_BOARD_ALL)

/**
 * 게시글 가져오기
 */
export const fetchSelectBoardByBoardNo = async (
  boardNo: number
) => await $fetch<Board>(API_GET_BOARD_BY_BOARD_NO, { 
  params: {
    boardNo: boardNo
  } 
})

/**
 * 게시글 등록하기
 */
export const fetchRegistBoard = async (
  data: Board
) => await $fetch<Board>(API_REGIST_BOARD, { 
  method: 'POST',
  body: data,
})

/**
 * 게시글 수정하기
 */
export const fetchModifyBoard = async (
  data: Board
) => await $fetch<Board>(API_MODIFY_BOARD, { 
  method: 'POST',
  body: data,
})
