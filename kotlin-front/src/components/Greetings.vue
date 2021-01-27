<template>
    <div id="greetings">
        <h3>Greeting</h3>
        <p>{{username}}</p>
    </div>
</template>

<script>
    import {AXIOS} from "./http-commons";

    export default {
        name: "Greetings",
        data: () => ({
            username: ''
        }),
        methods: {
            loadGreeting() {
                AXIOS.get('/greetings', {params: {name: 'Matvey'}})
                    .then(response => {
                        this.username = response.data.content;
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error.response.data);
                    })
            }
        },
        mounted() {
            this.loadGreeting();
        }
    }
</script>

<style lang="scss" scoped>
</style>
