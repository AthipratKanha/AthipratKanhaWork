<template>
    <div class="card">
        Name: {{ name }} <br>
        Price: {{ price }} <br>
        <button @click="buy()">
            Buy
        </button>
    </div>
</template>

<script>
export default {
    props: {
        name: {
            type: String,
            default: ''
        },
        price: {
            type: Number,
            default: 0
        }
    },
    methods: {
        buy () {
            this.$emit('submit', {
                name: this.name,
                price: this.price
            })
        }
    }
}
</script>

<style>
    .card {
        width: 250px;
        height: 300px;
        padding: 24px;
        border: 1px solid black;
    }
</style>