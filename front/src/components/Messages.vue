<template>
    <div>
        <div class="card">
            <h4>{{title}}</h4>
            <div class="form-control">
                <input
                        type="text"
                        :placeholder="placeholder"
                        :value="inputValue"
                        @input="saveInput"
                />
            </div>
            <button class="btn" @click="loadMessage">Find</button>
            <ul class="list">
                <li class="list-item" v-for="m in messages" v-bind:key="m">
                    {{m}}
                </li>
            </ul>
        </div>
        <p>{{messages}}</p>
    </div>
</template>

<script>
    import {AXIOS} from "../utils/http-commons";

    export default {
        name: "Messages",
        data: () => ({
            messages: '',
            title: "Message List",
            placeholder: "Write message id",
            inputValue: ''
        }),
        methods: {
            loadMessage() {
                console.log(this.inputValue)
                AXIOS.get('/message/' + this.inputValue)
                    .then(response => {
                        console.log(response.data)
                        this.messages = response.data;
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error.response.data);
                    })
            },
            saveInput(event) {
                this.inputValue = event.target.value
            }
        },
        mounted() {
            this.loadMessage();
        }
    }
</script>

<style lang="scss" scoped>
</style>
