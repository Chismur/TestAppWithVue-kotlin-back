import { createWebHistory, createRouter } from 'vue-router'
import Home from '@/components/Home'
import About from '@/components/About'
import Messages from '@/components/Messages'

const routerHistory = createWebHistory();

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/about',
        name: 'About',
        component: About
    },
    {
        path: '/messages',
        name: 'Messages',
        component: Messages
    },
];

const router = createRouter({
    history: routerHistory,
    routes,
});

export default router;
