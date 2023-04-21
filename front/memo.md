# nuxt 생성

    > npx nuxi init [프로젝트명]
    > cd [프로젝트명]
    > yarn install
    > yarn dev -o


# nuxt 폴더 구조

  ## `/pages`
  - nuxt3에서는 옵션임
  - 폴더 안에 vue 파일 만들면 자동으로 라우팅해줌
  - 동적 라우팅: [userNo] => $route.params.userNo

  ## `/layouts`
  - NuxtLayouts 관리

  ## `/components`
  - 컴포넌트 관리

  ## `/stores`
  - 상태관리 파일

  ## `/types`
  - 타입 정의

  ## `/composables`
  - composition(react의 hook 같은거) 관리 아직 모르겠음
  - 통신 모듈화


# nuxt 상태관리

  ## `pinia`
      yarn add pinia @pinia/nuxt


# nuxt proxy 설정

  ### - nuxt.config.ts 추가

    nitro: {
      devProxy: {
        '/api': {
          target: 'http://localhost:8060/api',
          changeOrigin: true,
        }
      }
    },
  
  
  
