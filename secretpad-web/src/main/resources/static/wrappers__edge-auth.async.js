(self.webpackChunksecretpad=self.webpackChunksecretpad||[]).push([[8210],{96821:function(i,o,a){"use strict";a.r(o);var g=a(45332),p=a.n(g),s=a(90819),_=a.n(s),f=a(89933),c=a.n(f),m=a(60950),b=a(58757),I=a(62664),C=a(65494),O=a(19805),A=a(90634),y=a(35667),M=function(){var F=(0,A.tT)(C.r),w=(0,m.parse)(window.location.search),T=w.nodeId;if(!T)return(0,y.jsx)(I.Fg,{to:"/login"});var P=["alice","bob","tee"],N=function(){var d=c()(_()().mark(function l(){var v,x,h;return _()().wrap(function(S){for(;;)switch(S.prev=S.next){case 0:return S.next=2,F.getUserInfo();case 2:if(!((F==null||(v=F.userInfo)===null||v===void 0?void 0:v.platformType)==="CENTER"&&(F==null||(x=F.userInfo)===null||x===void 0?void 0:x.ownerType)==="CENTER"&&P.includes(T))){S.next=5;break}return n(!0),S.abrupt("return");case 5:(F==null||(h=F.userInfo)===null||h===void 0?void 0:h.platformType)!=="EDGE"&&n(!1);case 6:case"end":return S.stop()}},l)}));return function(){return d.apply(this,arguments)}}();(0,b.useEffect)(function(){N()},[]);var r=(0,b.useState)(!0),e=p()(r,2),t=e[0],n=e[1];(0,b.useEffect)(function(){T&&u(T)},[T]);var u=function(){var d=c()(_()().mark(function l(v){return _()().wrap(function(h){for(;;)switch(h.prev=h.next){case 0:return h.next=2,(0,O.get)({nodeId:v});case 2:case"end":return h.stop()}},l)}));return function(v){return d.apply(this,arguments)}}();return t?(0,y.jsx)(I.j3,{}):(0,y.jsx)(I.Fg,{to:"/login"})};o.default=M},60950:function(i,o,a){"use strict";var g=a(45332).default,p=a(86222).default,s=a(89957).default,_=a(76711).default,f=a(42366),c=a(65140),m=a(71709),b=a(22475),I=function(e){return e==null};function C(r){switch(r.arrayFormat){case"index":return function(e){return function(t,n){var u=t.length;return n===void 0||r.skipNull&&n===null||r.skipEmptyString&&n===""?t:n===null?[].concat(_(t),[[y(e,r),"[",u,"]"].join("")]):[].concat(_(t),[[y(e,r),"[",y(u,r),"]=",y(n,r)].join("")])}};case"bracket":return function(e){return function(t,n){return n===void 0||r.skipNull&&n===null||r.skipEmptyString&&n===""?t:n===null?[].concat(_(t),[[y(e,r),"[]"].join("")]):[].concat(_(t),[[y(e,r),"[]=",y(n,r)].join("")])}};case"comma":case"separator":return function(e){return function(t,n){return n==null||n.length===0?t:t.length===0?[[y(e,r),"=",y(n,r)].join("")]:[[t,y(n,r)].join(r.arrayFormatSeparator)]}};default:return function(e){return function(t,n){return n===void 0||r.skipNull&&n===null||r.skipEmptyString&&n===""?t:n===null?[].concat(_(t),[y(e,r)]):[].concat(_(t),[[y(e,r),"=",y(n,r)].join("")])}}}}function O(r){var e;switch(r.arrayFormat){case"index":return function(t,n,u){if(e=/\[(\d*)\]$/.exec(t),t=t.replace(/\[\d*\]$/,""),!e){u[t]=n;return}u[t]===void 0&&(u[t]={}),u[t][e[1]]=n};case"bracket":return function(t,n,u){if(e=/(\[\])$/.exec(t),t=t.replace(/\[\]$/,""),!e){u[t]=n;return}if(u[t]===void 0){u[t]=[n];return}u[t]=[].concat(u[t],n)};case"comma":case"separator":return function(t,n,u){var d=typeof n=="string"&&n.includes(r.arrayFormatSeparator),l=typeof n=="string"&&!d&&M(n,r).includes(r.arrayFormatSeparator);n=l?M(n,r):n;var v=d||l?n.split(r.arrayFormatSeparator).map(function(x){return M(x,r)}):n===null?n:M(n,r);u[t]=v};default:return function(t,n,u){if(u[t]===void 0){u[t]=n;return}u[t]=[].concat(u[t],n)}}}function A(r){if(typeof r!="string"||r.length!==1)throw new TypeError("arrayFormatSeparator must be single character string")}function y(r,e){return e.encode?e.strict?f(r):encodeURIComponent(r):r}function M(r,e){return e.decode?c(r):r}function R(r){return Array.isArray(r)?r.sort():s(r)==="object"?R(Object.keys(r)).sort(function(e,t){return Number(e)-Number(t)}).map(function(e){return r[e]}):r}function F(r){var e=r.indexOf("#");return e!==-1&&(r=r.slice(0,e)),r}function w(r){var e="",t=r.indexOf("#");return t!==-1&&(e=r.slice(t)),e}function T(r){r=F(r);var e=r.indexOf("?");return e===-1?"":r.slice(e+1)}function P(r,e){return e.parseNumbers&&!Number.isNaN(Number(r))&&typeof r=="string"&&r.trim()!==""?r=Number(r):e.parseBooleans&&r!==null&&(r.toLowerCase()==="true"||r.toLowerCase()==="false")&&(r=r.toLowerCase()==="true"),r}function N(r,e){e=Object.assign({decode:!0,sort:!0,arrayFormat:"none",arrayFormatSeparator:",",parseNumbers:!1,parseBooleans:!1},e),A(e.arrayFormatSeparator);var t=O(e),n=Object.create(null);if(typeof r!="string"||(r=r.trim().replace(/^[?#&]/,""),!r))return n;var u=p(r.split("&")),d;try{for(u.s();!(d=u.n()).done;){var l=d.value;if(l!==""){var v=m(e.decode?l.replace(/\+/g," "):l,"="),x=g(v,2),h=x[0],E=x[1];E=E===void 0?null:["comma","separator"].includes(e.arrayFormat)?E:M(E,e),t(M(h,e),E,n)}}}catch(j){u.e(j)}finally{u.f()}for(var S=0,W=Object.keys(n);S<W.length;S++){var K=W[S],D=n[K];if(s(D)==="object"&&D!==null)for(var L=0,$=Object.keys(D);L<$.length;L++){var H=$[L];D[H]=P(D[H],e)}else n[K]=P(D,e)}return e.sort===!1?n:(e.sort===!0?Object.keys(n).sort():Object.keys(n).sort(e.sort)).reduce(function(j,B){var U=n[B];return U&&s(U)==="object"&&!Array.isArray(U)?j[B]=R(U):j[B]=U,j},Object.create(null))}o.extract=T,o.parse=N,o.stringify=function(r,e){if(!r)return"";e=Object.assign({encode:!0,strict:!0,arrayFormat:"none",arrayFormatSeparator:","},e),A(e.arrayFormatSeparator);for(var t=function(E){return e.skipNull&&I(r[E])||e.skipEmptyString&&r[E]===""},n=C(e),u={},d=0,l=Object.keys(r);d<l.length;d++){var v=l[d];t(v)||(u[v]=r[v])}var x=Object.keys(u);return e.sort!==!1&&x.sort(e.sort),x.map(function(h){var E=r[h];return E===void 0?"":E===null?y(h,e):Array.isArray(E)?E.reduce(n(h),[]).join("&"):y(h,e)+"="+y(E,e)}).filter(function(h){return h.length>0}).join("&")},o.parseUrl=function(r,e){e=Object.assign({decode:!0},e);var t=m(r,"#"),n=g(t,2),u=n[0],d=n[1];return Object.assign({url:u.split("?")[0]||"",query:N(T(r),e)},e&&e.parseFragmentIdentifier&&d?{fragmentIdentifier:M(d,e)}:{})},o.stringifyUrl=function(r,e){e=Object.assign({encode:!0,strict:!0},e);var t=F(r.url).split("?")[0]||"",n=o.extract(r.url),u=o.parse(n,{sort:!1}),d=Object.assign(u,r.query),l=o.stringify(d,e);l&&(l="?".concat(l));var v=w(r.url);return r.fragmentIdentifier&&(v="#".concat(y(r.fragmentIdentifier,e))),"".concat(t).concat(l).concat(v)},o.pick=function(r,e,t){t=Object.assign({parseFragmentIdentifier:!0},t);var n=o.parseUrl(r,t),u=n.url,d=n.query,l=n.fragmentIdentifier;return o.stringifyUrl({url:u,query:b(d,e),fragmentIdentifier:l},t)},o.exclude=function(r,e,t){var n=Array.isArray(e)?function(u){return!e.includes(u)}:function(u,d){return!e(u,d)};return o.pick(r,n,t)}},71709:function(i){"use strict";i.exports=function(o,a){if(!(typeof o=="string"&&typeof a=="string"))throw new TypeError("Expected the arguments to be of type `string`");if(a==="")return[o];var g=o.indexOf(a);return g===-1?[o]:[o.slice(0,g),o.slice(g+a.length)]}},42366:function(i){"use strict";i.exports=function(o){return encodeURIComponent(o).replace(/[!'()*]/g,function(a){return"%".concat(a.charCodeAt(0).toString(16).toUpperCase())})}},65140:function(i){"use strict";var o="%[a-f0-9]{2}",a=new RegExp("("+o+")|([^%]+?)","gi"),g=new RegExp("("+o+")+","gi");function p(f,c){try{return[decodeURIComponent(f.join(""))]}catch(I){}if(f.length===1)return f;c=c||1;var m=f.slice(0,c),b=f.slice(c);return Array.prototype.concat.call([],p(m),p(b))}function s(f){try{return decodeURIComponent(f)}catch(b){for(var c=f.match(a)||[],m=1;m<c.length;m++)f=p(c,m).join(""),c=f.match(a)||[];return f}}function _(f){for(var c={"%FE%FF":"\uFFFD\uFFFD","%FF%FE":"\uFFFD\uFFFD"},m=g.exec(f);m;){try{c[m[0]]=decodeURIComponent(m[0])}catch(A){var b=s(m[0]);b!==m[0]&&(c[m[0]]=b)}m=g.exec(f)}c["%C2"]="\uFFFD";for(var I=Object.keys(c),C=0;C<I.length;C++){var O=I[C];f=f.replace(new RegExp(O,"g"),c[O])}return f}i.exports=function(f){if(typeof f!="string")throw new TypeError("Expected `encodedURI` to be of type `string`, got `"+typeof f+"`");try{return f=f.replace(/\+/g," "),decodeURIComponent(f)}catch(c){return _(f)}}},22475:function(i){"use strict";i.exports=function(o,a){for(var g={},p=Object.keys(o),s=Array.isArray(a),_=0;_<p.length;_++){var f=p[_],c=o[f];(s?a.indexOf(f)!==-1:a(f,c,o))&&(g[f]=c)}return g}},78445:function(i,o,a){var g=a(88513);function p(s){if(Array.isArray(s))return g(s)}i.exports=p,i.exports.__esModule=!0,i.exports.default=i.exports},86222:function(i,o,a){var g=a(15274);function p(s,_){var f=typeof Symbol!="undefined"&&s[Symbol.iterator]||s["@@iterator"];if(!f){if(Array.isArray(s)||(f=g(s))||_&&s&&typeof s.length=="number"){f&&(s=f);var c=0,m=function(){};return{s:m,n:function(){return c>=s.length?{done:!0}:{done:!1,value:s[c++]}},e:function(A){throw A},f:m}}throw new TypeError(`Invalid attempt to iterate non-iterable instance.
In order to be iterable, non-array objects must have a [Symbol.iterator]() method.`)}var b=!0,I=!1,C;return{s:function(){f=f.call(s)},n:function(){var A=f.next();return b=A.done,A},e:function(A){I=!0,C=A},f:function(){try{!b&&f.return!=null&&f.return()}finally{if(I)throw C}}}}i.exports=p,i.exports.__esModule=!0,i.exports.default=i.exports},26431:function(i){function o(a){if(typeof Symbol!="undefined"&&a[Symbol.iterator]!=null||a["@@iterator"]!=null)return Array.from(a)}i.exports=o,i.exports.__esModule=!0,i.exports.default=i.exports},93647:function(i){function o(){throw new TypeError(`Invalid attempt to spread non-iterable instance.
In order to be iterable, non-array objects must have a [Symbol.iterator]() method.`)}i.exports=o,i.exports.__esModule=!0,i.exports.default=i.exports},76711:function(i,o,a){var g=a(78445),p=a(26431),s=a(15274),_=a(93647);function f(c){return g(c)||p(c)||s(c)||_()}i.exports=f,i.exports.__esModule=!0,i.exports.default=i.exports}}]);
