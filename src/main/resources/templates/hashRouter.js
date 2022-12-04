export default class Router {
    constructor(routes, theHash) {
        this.routes = routes;

        window.addEventListener("hashchange", event => this.routing(event));

        window.location.hash = theHash;
        this.routing(theHash);
    }

    routing() {
        let hash = window.location.hash;
        if (hash) {
            hash = hash[0] === '#' ? hash.substr(1) : hash;
            let hashParts = hash.split("/");
            const matchingRoute = this.routes.find(route => route.hash === hashParts[0]);

            if (matchingRoute) {
                hashParts.shift();
                matchingRoute.template(matchingRoute.target, ...hashParts);
            }
        }
    }
}