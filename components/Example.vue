<template>
  <div>
    <div class="main">
      <div class="main-header">
        <div class="nav-button but-hol">
          <span class="nos"></span>
          <span class="ncs"></span>
          <span class="nbs"></span>
          <div class="menu-button-text">Menu</div>
        </div>

        <div class="header-social">
          <ul>
            <li>
              <a target="_blank" href="https://bit.ly/2y6huFG"
                ><i class="fab fa-facebook-f"></i
              ></a>
            </li>
            <li>
              <a target="_blank" href="https://bit.ly/2y6huFG"
                ><i class="fab fa-twitter"></i
              ></a>
            </li>
            <li>
              <a target="_blank" href="https://bit.ly/2y6huFG"
                ><i class="fab fa-dribbble"></i
              ></a>
            </li>
            <li>
              <a target="_blank" href="https://bit.ly/2y6huFG"
                ><i class="fab fa-instagram"></i
              ></a>
            </li>
          </ul>
        </div>
        <div class="folio-btn">
          <a class="folio-btn-item ajax" href="" target="_blank"
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
            ><span class="folio-btn-dot"></span
          ></a>
        </div>
      </div>

      <div id="wrapper">
        <div class="content-holder">
          <div class="hero-wrap fl-wrap full-height scroll-con-sec">
            <div class="impulse-wrap">
              <div class="mm-par-wrap">
                <div class="mm-parallax" data-tilt data-tilt-max="4">
                  <div class="overlay"></div>
                  <div
                    class="bg"
                    data-bg="https://images.unsplash.com/photo-1499018658500-b21c72d7172b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80"
                    style="
                      background-image: url(https://images.unsplash.com/photo-1499018658500-b21c72d7172b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80);
                    "
                  ></div>

                  <div class="hero-wrap-item fl-wrap">
                    <div class="container">
                      <div
                        class="fl-wrap section-entry hiddec-anim"
                        style="opacity: 1"
                      >
                        <h1 class="BoardName">
                          Welcome <span> {{ count }} </span>
                          <v-btn color="primary" @click="increaseCount">
                            increase+
                          </v-btn>
                        </h1>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div
              class="hero-corner hiddec-anim"
              style="opacity: 1; transform: translate3d(0px, 0px, 0px)"
            ></div>

            <div
              class="hero-corner2 hiddec-anim"
              style="opacity: 1; transform: translate3d(0px, 0px, 0px)"
            ></div>

            <div
              class="hero-corner3 hiddec-anim"
              style="opacity: 1; transform: translate3d(0px, 0px, 0px)"
            ></div>

            <div
              class="hero-corner4 hiddec-anim"
              style="opacity: 1; transform: translate3d(0px, 0px, 0px)"
            ></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "Example",
  data() {
    return {
      count: 0,
    };
  },
  methods: {
    async increaseCount() {
      try {
        console.log("send request");
        const response = await axios.get("https://api.firas-odia.com/increase");
        this.count = response.data.count;
      } catch (error) {
        console.log("error", error.message);
      }
    },
  },
  mounted() {
    
    this.increaseCount();
  },
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

body {
  text-align: center;
}

.BoardName {
  color: white;
  text-shadow: 1px 2px 3px black;
  font-size: 35px;
  transform-style: preserve-3d;
  transform: translateZ(80px);
}

.main {
  height: 100%;
  width: 100%;
  position: absolute;
  top: 0;
  left: 0;
  z-index: 2;
  opacity: 1;
}

.main-header {
  position: fixed;
  top: 0;
  left: 0;
  width: 80px;
  bottom: 0;
  z-index: 20;
  background: #292929;
  -webkit-transform: translate3d(0, 0, 0);
}

.folio-btn {
  position: absolute;
  right: 0;
  width: 100%;
  bottom: 0;
  height: 80px;
  background: #343434;
  border-top: 1px solid rgba(255, 255, 255, 0.1);
}

.folio-btn-item {
  position: absolute;
  left: 20px;
  width: 40px;
  height: 40px;
  top: 20px;
}

.folio-btn-dot {
  float: left;
  width: 33.3%;
  height: 33.3%;
  position: relative;
}

.folio-btn-dot:before {
  content: "";
  position: absolute;
  left: 50%;
  top: 50%;
  width: 4px;
  height: 4px;
  margin: -2px 0 0 -2px;
  border-radius: 50%;
  transition: all 300ms linear;
  transform: scale(1);
}

.folio-btn-dot:before {
  background: #f68338;
}

.folio-btn:hover .folio-btn-dot:first-child:before,
.folio-btn:hover .folio-btn-dot:nth-child(3):before,
.folio-btn:hover .folio-btn-dot:nth-child(4):before,
.folio-btn:hover .folio-btn-dot:nth-child(8):before {
  transform: scale(1.8);
  opacity: 0.5;
}

/***social***/
.header-social {
  position: absolute;
  bottom: 80px;
  width: 100%;
  right: 0;
  z-index: 20;
  padding: 20px 0;
  background: #383838;
}

.header-social:before {
  background: #f68338;
}

.header-social:before {
  content: "";
  position: absolute;
  left: 50%;
  top: -3px;
  width: 36px;
  margin-left: -18px;
  height: 6px;
}

.header-social li {
  display: block;
  margin-top: 6px;
}

.header-social li a {
  width: 36px;
  height: 36px;
  line-height: 36px;
  display: inline-block;
  font-size: 12px;
  color: rgba(255, 255, 255, 0.41);
  border: 1px solid rgba(255, 255, 255, 0.08);
  transition: all 300ms linear;
}

.header-social li a:hover {
  color: #f68338;
}

ul,
li {
  border: none;
  outline: 0;
  font-weight: inherit;
  font-style: inherit;
  font-size: 100%;
  font-family: inherit;
  vertical-align: baseline;
  text-decoration: none;
  margin: 0;
  padding: 0;
}

ol,
ul {
  list-style: none;
}

.main-header:before {
  content: "";
  position: absolute;
  left: 10px;
  width: 60px;
  height: 1px;
  bottom: 120px;
  background: rgba(255, 255, 255, 0.1);
}

.nav-button {
  width: 28px;
  height: 50px;
  display: inline-block;
  cursor: pointer;
  position: relative;
  top: 120px;
}

.nav-button span {
  width: 100%;
  float: left;
  margin-bottom: 6px;
  height: 2px;
  background: #fff;
  position: relative;
  overflow: hidden;
  transition: all 0.2s ease-in-out;
}

.nav-button .ncs {
  width: 70%;
}

.nav-button .nbs,
.nav-button.cmenu:hover .nbs {
  width: 100%;
}

.menu-button-text {
  position: absolute;
  left: 0;
  width: 100%;
  bottom: -1px;
  color: rgba(255, 255, 255, 0.41);
  font-size: 10px;
  font-weight: 400;
  text-transform: uppercase;
  letter-spacing: 2px;
}

.nav-button span {
  background: #f68338;
}

.nav-button:hover span:before {
  width: 100%;
}

.nav-button:hover .ncs,
.nav-button:hover .nbs {
  width: 100%;
}

.nav-button span:before {
  content: "";
  position: absolute;
  left: 0;
  top: 0;
  width: 0;
  height: 100%;
  background: #fff;
  transition: all 0.2s ease-in-out;
}

/*****end****/

#wrapper {
  position: absolute;
  top: 0;
  left: 80px;
  right: 0;
  bottom: 0;
  z-index: 3;
}

.content-holder {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}

.hero-wrap,
.fs-slider-wrap {
  background: #292929;
  z-index: 25;
}

.full-height {
  height: 100%;
}

.fl-wrap {
  float: left;
  width: 100%;
  position: relative;
}

.impulse-wrap {
  background: #232323;
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1;
  -webkit-perspective: 1000;
}

.impulse-wrap:before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}

.mm-parallax {
  position: absolute;
  top: 100px;
  left: 100px;
  right: 100px;
  bottom: 100px;
  z-index: 20;
  transform-style: preserve-3d;
}

.impulse-wrap .bg,
.impulse-wrap .overlay {
  box-shadow: 0 20px 25px 0 rgba(18, 17, 30, 0.35);
}

.overlay {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: black;
  opacity: 0.4;
  z-index: 3;
}

.bg {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1;
  background-size: cover;
  background-attachment: scroll;
  background-position: center;
  background-repeat: repeat;
  background-origin: content-box;
}

.hero-corner {
  top: 50px;
  right: 50px;
  z-index: 21;
  border-top: 1px solid;
  border-right: 1px solid;
}

.hero-corner2 {
  top: 50px;
  left: 50px;
  border-top: 1px solid;
  border-left: 1px solid;
}

.hero-corner3 {
  bottom: 50px;
  right: 50px;
  border-bottom: 1px solid;
  border-right: 1px solid;
}

.hero-corner4 {
  bottom: 50px;
  left: 50px;
  z-index: 21;
  border-left: 1px solid;
  border-bottom: 1px solid;
}

.hero-corner,
.hero-corner2,
.hero-corner3,
.hero-corner4 {
  position: absolute;
  width: 70px;
  height: 70px;
  z-index: 21;
  border-color: rgba(255, 255, 255, 0.3);
}

.fl-wrap {
  float: left;
  width: 100%;
  position: relative;
  transform: translateZ(80px);
}

.hero-wrap-item {
  top: 45%;
}
</style>
