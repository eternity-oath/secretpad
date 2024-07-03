"use strict";(self.webpackChunksecretpad=self.webpackChunksecretpad||[]).push([[8780],{26518:function(Mt,G,c){c.d(G,{Z:function(){return Et}});var i=c(58757),V=c(51865),N=c.n(V),M=c(60279),K=c(42091),W=c(84600),w=c(97804),U=c(75354),L=c(62894),F=c(22643),X=c(81495),H=c(8610),B=c(28375),J=c(71644),Q=function(t,e){var o={};for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&e.indexOf(n)<0&&(o[n]=t[n]);if(t!=null&&typeof Object.getOwnPropertySymbols=="function")for(var a=0,n=Object.getOwnPropertySymbols(t);a<n.length;a++)e.indexOf(n[a])<0&&Object.prototype.propertyIsEnumerable.call(t,n[a])&&(o[n[a]]=t[n[a]]);return o};const wt={info:i.createElement(B.Z,null),success:i.createElement(L.Z,null),error:i.createElement(F.Z,null),warning:i.createElement(H.Z,null),loading:i.createElement(J.Z,null)};function O(t,e){return e===null||e===!1?null:e||i.createElement("span",{className:`${t}-close-x`},i.createElement(X.Z,{className:`${t}-close-icon`}))}const Y={success:L.Z,info:B.Z,error:F.Z,warning:H.Z},R=t=>{const{prefixCls:e,icon:o,type:n,message:a,description:r,btn:l,role:u="alert"}=t;let s=null;return o?s=i.createElement("span",{className:`${e}-icon`},o):n&&(s=i.createElement(Y[n]||null,{className:N()(`${e}-icon`,`${e}-icon-${n}`)})),i.createElement("div",{className:N()({[`${e}-with-icon`]:s}),role:u},s,i.createElement("div",{className:`${e}-message`},a),i.createElement("div",{className:`${e}-description`},r),l&&i.createElement("div",{className:`${e}-btn`},l))},Lt=t=>{const{prefixCls:e,className:o,icon:n,type:a,message:r,description:l,btn:u,closable:s=!0,closeIcon:d,className:g}=t,y=Q(t,["prefixCls","className","icon","type","message","description","btn","closable","closeIcon","className"]),{getPrefixCls:v}=React.useContext(ConfigContext),m=e||v("notification"),$=`${m}-notice`,p=useCSSVarCls(m),[h,C,b]=useStyle(m,p);return h(React.createElement("div",{className:classNames(`${$}-pure-panel`,C,o,b,p)},React.createElement(PurePanelStyle,{prefixCls:m}),React.createElement(Notice,Object.assign({},y,{prefixCls:m,eventKey:"pure",duration:null,closable:s,className:classNames({notificationClassName:g}),closeIcon:O(m,d),content:React.createElement(R,{prefixCls:$,icon:n,type:a,message:r,description:l,btn:u})}))))};var Ft=null,S=c(8505),k=c(9226),q=c(665),_=c(74594),T=c(37544),tt=t=>{const{componentCls:e,notificationMarginEdge:o,animationMaxHeight:n}=t,a=`${e}-notice`,r=new S.Keyframes("antNotificationFadeIn",{"0%":{transform:"translate3d(100%, 0, 0)",opacity:0},"100%":{transform:"translate3d(0, 0, 0)",opacity:1}}),l=new S.Keyframes("antNotificationTopFadeIn",{"0%":{top:-n,opacity:0},"100%":{top:0,opacity:1}}),u=new S.Keyframes("antNotificationBottomFadeIn",{"0%":{bottom:t.calc(n).mul(-1).equal(),opacity:0},"100%":{bottom:0,opacity:1}}),s=new S.Keyframes("antNotificationLeftFadeIn",{"0%":{transform:"translate3d(-100%, 0, 0)",opacity:0},"100%":{transform:"translate3d(0, 0, 0)",opacity:1}});return{[e]:{[`&${e}-top, &${e}-bottom`]:{marginInline:0,[a]:{marginInline:"auto auto"}},[`&${e}-top`]:{[`${e}-fade-enter${e}-fade-enter-active, ${e}-fade-appear${e}-fade-appear-active`]:{animationName:l}},[`&${e}-bottom`]:{[`${e}-fade-enter${e}-fade-enter-active, ${e}-fade-appear${e}-fade-appear-active`]:{animationName:u}},[`&${e}-topRight, &${e}-bottomRight`]:{[`${e}-fade-enter${e}-fade-enter-active, ${e}-fade-appear${e}-fade-appear-active`]:{animationName:r}},[`&${e}-topLeft, &${e}-bottomLeft`]:{marginRight:{value:0,_skip_check_:!0},marginLeft:{value:o,_skip_check_:!0},[a]:{marginInlineEnd:"auto",marginInlineStart:0},[`${e}-fade-enter${e}-fade-enter-active, ${e}-fade-appear${e}-fade-appear-active`]:{animationName:s}}}}};const et=["top","topLeft","topRight","bottom","bottomLeft","bottomRight"],nt={topLeft:"left",topRight:"right",bottomLeft:"left",bottomRight:"right",top:"left",bottom:"left"},ot=(t,e)=>{const{componentCls:o}=t;return{[`${o}-${e}`]:{[`&${o}-stack > ${o}-notice-wrapper`]:{[e.startsWith("top")?"top":"bottom"]:0,[nt[e]]:{value:0,_skip_check_:!0}}}}},at=t=>{const e={};for(let o=1;o<t.notificationStackLayer;o++)e[`&:nth-last-child(${o+1})`]={overflow:"hidden",[`& > ${t.componentCls}-notice`]:{opacity:0,transition:`opacity ${t.motionDurationMid}`}};return Object.assign({[`&:not(:nth-last-child(-n+${t.notificationStackLayer}))`]:{opacity:0,overflow:"hidden",color:"transparent",pointerEvents:"none"}},e)},it=t=>{const e={};for(let o=1;o<t.notificationStackLayer;o++)e[`&:nth-last-child(${o+1})`]={background:t.colorBgBlur,backdropFilter:"blur(10px)","-webkit-backdrop-filter":"blur(10px)"};return Object.assign({},e)};var st=t=>{const{componentCls:e}=t;return Object.assign({[`${e}-stack`]:{[`& > ${e}-notice-wrapper`]:Object.assign({transition:`all ${t.motionDurationSlow}, backdrop-filter 0s`,position:"absolute"},at(t))},[`${e}-stack:not(${e}-stack-expanded)`]:{[`& > ${e}-notice-wrapper`]:Object.assign({},it(t))},[`${e}-stack${e}-stack-expanded`]:{[`& > ${e}-notice-wrapper`]:{"&:not(:nth-last-child(-n + 1))":{opacity:1,overflow:"unset",color:"inherit",pointerEvents:"auto",[`& > ${t.componentCls}-notice`]:{opacity:1}},"&:after":{content:'""',position:"absolute",height:t.margin,width:"100%",insetInline:0,bottom:t.calc(t.margin).mul(-1).equal(),background:"transparent",pointerEvents:"auto"}}}},et.map(o=>ot(t,o)).reduce((o,n)=>Object.assign(Object.assign({},o),n),{}))};const ct=t=>{const{iconCls:e,componentCls:o,boxShadow:n,fontSizeLG:a,notificationMarginBottom:r,borderRadiusLG:l,colorSuccess:u,colorInfo:s,colorWarning:d,colorError:g,colorTextHeading:y,notificationBg:v,notificationPadding:m,notificationMarginEdge:$,fontSize:p,lineHeight:h,width:C,notificationIconSize:b,colorText:x}=t,f=`${o}-notice`;return{position:"relative",marginBottom:r,marginInlineStart:"auto",background:v,borderRadius:l,boxShadow:n,[f]:{padding:m,width:C,maxWidth:`calc(100vw - ${(0,S.unit)(t.calc($).mul(2).equal())})`,overflow:"hidden",lineHeight:h,wordWrap:"break-word"},[`${o}-close-icon`]:{fontSize:p,cursor:"pointer"},[`${f}-message`]:{marginBottom:t.marginXS,color:y,fontSize:a,lineHeight:t.lineHeightLG},[`${f}-description`]:{fontSize:p,color:x},[`${f}-closable ${f}-message`]:{paddingInlineEnd:t.paddingLG},[`${f}-with-icon ${f}-message`]:{marginBottom:t.marginXS,marginInlineStart:t.calc(t.marginSM).add(b).equal(),fontSize:a},[`${f}-with-icon ${f}-description`]:{marginInlineStart:t.calc(t.marginSM).add(b).equal(),fontSize:p},[`${f}-icon`]:{position:"absolute",fontSize:b,lineHeight:1,[`&-success${e}`]:{color:u},[`&-info${e}`]:{color:s},[`&-warning${e}`]:{color:d},[`&-error${e}`]:{color:g}},[`${f}-close`]:{position:"absolute",top:t.notificationPaddingVertical,insetInlineEnd:t.notificationPaddingHorizontal,color:t.colorIcon,outline:"none",width:t.notificationCloseButtonSize,height:t.notificationCloseButtonSize,borderRadius:t.borderRadiusSM,transition:`background-color ${t.motionDurationMid}, color ${t.motionDurationMid}`,display:"flex",alignItems:"center",justifyContent:"center","&:hover":{color:t.colorIconHover,backgroundColor:t.closeBtnHoverBg}},[`${f}-btn`]:{float:"right",marginTop:t.marginSM}}},rt=t=>{const{componentCls:e,notificationMarginBottom:o,notificationMarginEdge:n,motionDurationMid:a,motionEaseInOut:r}=t,l=`${e}-notice`,u=new S.Keyframes("antNotificationFadeOut",{"0%":{maxHeight:t.animationMaxHeight,marginBottom:o},"100%":{maxHeight:0,marginBottom:0,paddingTop:0,paddingBottom:0,opacity:0}});return[{[e]:Object.assign(Object.assign({},(0,q.Wf)(t)),{position:"fixed",zIndex:t.zIndexPopup,marginRight:{value:n,_skip_check_:!0},[`${e}-hook-holder`]:{position:"relative"},[`${e}-fade-appear-prepare`]:{opacity:"0 !important"},[`${e}-fade-enter, ${e}-fade-appear`]:{animationDuration:t.motionDurationMid,animationTimingFunction:r,animationFillMode:"both",opacity:0,animationPlayState:"paused"},[`${e}-fade-leave`]:{animationTimingFunction:r,animationFillMode:"both",animationDuration:a,animationPlayState:"paused"},[`${e}-fade-enter${e}-fade-enter-active, ${e}-fade-appear${e}-fade-appear-active`]:{animationPlayState:"running"},[`${e}-fade-leave${e}-fade-leave-active`]:{animationName:u,animationPlayState:"running"},"&-rtl":{direction:"rtl",[`${l}-btn`]:{float:"left"}}})},{[e]:{[`${l}-wrapper`]:Object.assign({},ct(t))}}]},lt=t=>({zIndexPopup:t.zIndexPopupBase+k.u6+50,width:384,closeBtnHoverBg:t.wireframe?"transparent":t.colorFillContent}),dt=t=>{const e=t.paddingMD,o=t.paddingLG;return(0,_.TS)(t,{notificationBg:t.colorBgElevated,notificationPaddingVertical:e,notificationPaddingHorizontal:o,notificationIconSize:t.calc(t.fontSizeLG).mul(t.lineHeightLG).equal(),notificationCloseButtonSize:t.calc(t.controlHeightLG).mul(.55).equal(),notificationMarginBottom:t.margin,notificationPadding:`${(0,S.unit)(t.paddingMD)} ${(0,S.unit)(t.paddingContentHorizontalLG)}`,notificationMarginEdge:t.marginLG,animationMaxHeight:150,notificationStackLayer:3})};var ft=(0,T.I$)("Notification",t=>{const e=dt(t);return[rt(e),tt(e),st(e)]},lt);function mt(t,e,o){let n;switch(t){case"top":n={left:"50%",transform:"translateX(-50%)",right:"auto",top:e,bottom:"auto"};break;case"topLeft":n={left:0,top:e,bottom:"auto"};break;case"topRight":n={right:0,top:e,bottom:"auto"};break;case"bottom":n={left:"50%",transform:"translateX(-50%)",right:"auto",top:"auto",bottom:o};break;case"bottomLeft":n={left:0,top:"auto",bottom:o};break;default:n={right:0,top:"auto",bottom:o};break}return n}function pt(t){return{motionName:`${t}-fade`}}var ut=c(59703),gt=c(46821),vt=function(t,e){var o={};for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&e.indexOf(n)<0&&(o[n]=t[n]);if(t!=null&&typeof Object.getOwnPropertySymbols=="function")for(var a=0,n=Object.getOwnPropertySymbols(t);a<n.length;a++)e.indexOf(n[a])<0&&Object.prototype.propertyIsEnumerable.call(t,n[a])&&(o[n[a]]=t[n[a]]);return o};const z=24,$t=4.5,Ct="topRight",yt=t=>{let{children:e,prefixCls:o}=t;const n=(0,gt.Z)(o),[a,r,l]=ft(o,n);return a(i.createElement(w.NotificationProvider,{classNames:{list:N()(r,l,n)}},e))},ht=(t,e)=>{let{prefixCls:o,key:n}=e;return i.createElement(yt,{prefixCls:o,key:n},t)},bt=i.forwardRef((t,e)=>{const{top:o,bottom:n,prefixCls:a,getContainer:r,maxCount:l,rtl:u,onAllRemoved:s,stack:d}=t,{getPrefixCls:g,getPopupContainer:y,notification:v}=i.useContext(M.E_),[,m]=(0,ut.ZP)(),$=a||g("notification"),p=f=>mt(f,o!=null?o:z,n!=null?n:z),h=()=>N()({[`${$}-rtl`]:u}),C=()=>pt($),[b,x]=(0,w.useNotification)({prefixCls:$,style:p,className:h,motion:C,closable:!0,closeIcon:O($),duration:$t,getContainer:()=>(r==null?void 0:r())||(y==null?void 0:y())||document.body,maxCount:l,onAllRemoved:s,renderNotifications:ht,stack:d===!1?!1:{threshold:typeof d=="object"?d==null?void 0:d.threshold:void 0,offset:8,gap:m.margin}});return i.useImperativeHandle(e,()=>Object.assign(Object.assign({},b),{prefixCls:$,notification:v})),x});function St(t){const e=i.useRef(null),o=(0,U.ln)("Notification");return[i.useMemo(()=>{const a=s=>{var d;if(!e.current)return;const{open:g,prefixCls:y,notification:v}=e.current,m=`${y}-notice`,{message:$,description:p,icon:h,type:C,btn:b,className:x,style:f,role:I="alert",closeIcon:E}=s,j=vt(s,["message","description","icon","type","btn","className","style","role","closeIcon"]),P=O(m,E);return g(Object.assign(Object.assign({placement:(d=t==null?void 0:t.placement)!==null&&d!==void 0?d:Ct},j),{content:i.createElement(R,{prefixCls:m,icon:h,type:C,message:$,description:p,btn:b,role:I}),className:N()(C&&`${m}-${C}`,x,v==null?void 0:v.className),style:Object.assign(Object.assign({},v==null?void 0:v.style),f),closeIcon:P,closable:!!P}))},l={open:a,destroy:s=>{var d,g;s!==void 0?(d=e.current)===null||d===void 0||d.close(s):(g=e.current)===null||g===void 0||g.destroy()}};return["success","info","warning","error"].forEach(s=>{l[s]=d=>a(Object.assign(Object.assign({},d),{type:s}))}),l},[]),i.createElement(bt,Object.assign({key:"notification-holder"},t,{ref:e}))]}function xt(t){return St(t)}const A=i.createContext({});var Z=i.createContext({message:{},notification:{},modal:{}});const Nt=t=>{const{componentCls:e,colorText:o,fontSize:n,lineHeight:a,fontFamily:r}=t;return{[e]:{color:o,fontSize:n,lineHeight:a,fontFamily:r}}},It=()=>({});var Pt=(0,T.I$)("App",Nt,It);const Ot=()=>i.useContext(Z),D=t=>{const{prefixCls:e,children:o,className:n,rootClassName:a,message:r,notification:l,style:u,component:s="div"}=t,{getPrefixCls:d}=(0,i.useContext)(M.E_),g=d("app",e),[y,v,m]=Pt(g),$=N()(v,g,n,a,m),p=(0,i.useContext)(A),h=i.useMemo(()=>({message:Object.assign(Object.assign({},p.message),r),notification:Object.assign(Object.assign({},p.notification),l)}),[r,l,p.message,p.notification]),[C,b]=(0,K.Z)(h.message),[x,f]=xt(h.notification),[I,E]=(0,W.Z)(),j=i.useMemo(()=>({message:C,notification:x,modal:I}),[C,x,I]),P=s===!1?i.Fragment:s,jt={className:$,style:u};return y(i.createElement(Z.Provider,{value:j},i.createElement(A.Provider,{value:h},i.createElement(P,Object.assign({},s===!1?void 0:jt),E,b,f,o))))};D.useApp=Ot;var Et=D}}]);