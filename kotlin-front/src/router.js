import { createWebHistory, createRouter } from 'vue-router';
import Greeting from '@/components/Greetings'

const routerHistory = createWebHistory();

const routes = [
    {
        path: '/',
        name: 'Greeting',
        component: Greeting
    },
];

const router = createRouter({
    history: routerHistory,
    routes,
});

export default router;
