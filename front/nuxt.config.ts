// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  modules: [
    '@pinia/nuxt',
  ],
  nitro: {
    devProxy: {
      '/api': {
        target: 'http://localhost:8060/api',
        changeOrigin: true,
      }
    }
  },
  devServer: {
    port: 3210
  }
})
