export default[
    {
        hash:"Accommodation",
        target:"routerView",
        template:(targetElm) =>
            document.getElementById(targetElm).innerHTML = document.getElementById("Accommodation").innerHTML
    },

    {
        hash:"Chat",
        target:"routerView",
        template:(targetElm) =>
            document.getElementById(targetElm).innerHTML = document.getElementById("Chat").innerHTML
    },

    {
        hash:"Swipes",
        target:"routerView",
        template:(targetElm) =>
            document.getElementById(targetElm).innerHTML = document.getElementById("Swipes").innerHTML
    },

    {
        hash:"Voting",
        target:"routerView",
        template:(targetElm) =>
            document.getElementById(targetElm).innerHTML = document.getElementById("Voting").innerHTML
    },

    {
        hash:"Profile",
        target:"routerView",
        template:(targetElm) =>
            document.getElementById(targetElm).innerHTML = document.getElementById("Profile").innerHTML
    }
];