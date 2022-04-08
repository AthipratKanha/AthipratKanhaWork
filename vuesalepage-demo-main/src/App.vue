<template>
  <div id="app">
    <div class="container">
      <my-component
        v-for="(item, index) in items" :key="index"
        :name="item.name"
        :price="item.price"
        @submit="submit($event)">
      </my-component>
    </div>

    <div v-for="(product, index) in cart" :key="index">
      <div style="border: 1px solid black; margin: 24px;">
        name: {{ product.name }}
        price: {{ product.price }}
      </div>
    </div>

  </div>
</template>

<script>
import MyComponent from './components/MyComponent.vue'

export default {
  name: 'App',
  data () {
    return {
      items: [
        {
          name: 'Product AAAA',
          price: '5000'
        },
        {
          name: 'Product BBB',
          price: '2000'
        },
        {
          name: 'Product CCCC',
          price: '4000'
        }
      ],
      cart: []
    }
  },
  components: {
    MyComponent
  },
  methods: {
    submit (value) {
      this.cart.push(value)
    }
  }
}
</script>


<style scoped>
  .container {
    display: flex;
    justify-content: space-around;
  }
</style>