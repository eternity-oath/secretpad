!(function(){"use strict";var he=Object.defineProperty,be=Object.defineProperties;var me=Object.getOwnPropertyDescriptors;var ne=Object.getOwnPropertySymbols;var _e=Object.prototype.hasOwnProperty,we=Object.prototype.propertyIsEnumerable;var V=(S,m,b)=>m in S?he(S,m,{enumerable:!0,configurable:!0,writable:!0,value:b}):S[m]=b,ae=(S,m)=>{for(var b in m||(m={}))_e.call(m,b)&&V(S,b,m[b]);if(ne)for(var b of ne(m))we.call(m,b)&&V(S,b,m[b]);return S},oe=(S,m)=>be(S,me(m));var k=(S,m,b)=>(V(S,typeof m!="symbol"?m+"":m,b),b);var w=(S,m,b)=>new Promise((R,O)=>{var I=A=>{try{F(b.next(A))}catch(T){O(T)}},K=A=>{try{F(b.throw(A))}catch(T){O(T)}},F=A=>A.done?R(A.value):Promise.resolve(A.value).then(I,K);F((b=b.apply(S,m)).next())});(self.webpackChunksecretpad=self.webpackChunksecretpad||[]).push([[5145],{25145:function(S,m,b){b.r(m),b.d(m,{Adapter:function(){return v},CodeActionAdaptor:function(){return ee},DefinitionAdapter:function(){return Q},DiagnosticsAdapter:function(){return $},DocumentHighlightAdapter:function(){return G},FormatAdapter:function(){return Z},FormatHelper:function(){return D},FormatOnTypeAdapter:function(){return q},InlayHintsAdapter:function(){return re},Kind:function(){return u},LibFiles:function(){return U},OutlineAdapter:function(){return Y},QuickInfoAdapter:function(){return J},ReferenceAdapter:function(){return X},RenameAdapter:function(){return te},SignatureHelpAdapter:function(){return E},SuggestAdapter:function(){return L},WorkerManager:function(){return B},flattenDiagnosticMessageText:function(){return M},getJavaScriptWorker:function(){return ge},getTypeScriptWorker:function(){return de},setupJavaScript:function(){return ce},setupTypeScript:function(){return le}});var R=b(72637),O=b(91578);var I=Object.defineProperty,K=Object.getOwnPropertyDescriptor,F=Object.getOwnPropertyNames,A=Object.prototype.hasOwnProperty,T=(e,t,s)=>t in e?I(e,t,{enumerable:!0,configurable:!0,writable:!0,value:s}):e[t]=s,j=(e,t,s,n)=>{if(t&&typeof t=="object"||typeof t=="function")for(let l of F(t))!A.call(e,l)&&l!==s&&I(e,l,{get:()=>t[l],enumerable:!(n=K(t,l))||n.enumerable});return e},ue=(e,t,s)=>(j(e,t,"default"),s&&j(s,t,"default")),h=(e,t,s)=>(T(e,typeof t!="symbol"?t+"":t,s),s),a={};ue(a,R);var B=class{constructor(e,t){k(this,"_configChangeListener");k(this,"_updateExtraLibsToken");k(this,"_extraLibsChangeListener");k(this,"_worker");k(this,"_client");this._modeId=e,this._defaults=t,this._worker=null,this._client=null,this._configChangeListener=this._defaults.onDidChange(()=>this._stopWorker()),this._updateExtraLibsToken=0,this._extraLibsChangeListener=this._defaults.onDidExtraLibsChange(()=>this._updateExtraLibs())}dispose(){this._configChangeListener.dispose(),this._extraLibsChangeListener.dispose(),this._stopWorker()}_stopWorker(){this._worker&&(this._worker.dispose(),this._worker=null),this._client=null}_updateExtraLibs(){return w(this,null,function*(){if(!this._worker)return;const e=++this._updateExtraLibsToken,t=yield this._worker.getProxy();this._updateExtraLibsToken===e&&t.updateExtraLibs(this._defaults.getExtraLibs())})}_getClient(){return this._client||(this._client=(()=>w(this,null,function*(){return this._worker=a.editor.createWebWorker({moduleId:"vs/language/typescript/tsWorker",label:this._modeId,keepIdleModels:!0,createData:{compilerOptions:this._defaults.getCompilerOptions(),extraLibs:this._defaults.getExtraLibs(),customWorkerPath:this._defaults.workerOptions.customWorkerPath,inlayHintsOptions:this._defaults.inlayHintsOptions}}),this._defaults.getEagerModelSync()?yield this._worker.withSyncedResources(a.editor.getModels().filter(e=>e.getLanguageId()===this._modeId).map(e=>e.uri)):yield this._worker.getProxy()}))()),this._client}getLanguageServiceWorker(...e){return w(this,null,function*(){const t=yield this._getClient();return this._worker&&(yield this._worker.withSyncedResources(e)),t})}},i={};i["lib.d.ts"]=!0,i["lib.decorators.d.ts"]=!0,i["lib.decorators.legacy.d.ts"]=!0,i["lib.dom.d.ts"]=!0,i["lib.dom.iterable.d.ts"]=!0,i["lib.es2015.collection.d.ts"]=!0,i["lib.es2015.core.d.ts"]=!0,i["lib.es2015.d.ts"]=!0,i["lib.es2015.generator.d.ts"]=!0,i["lib.es2015.iterable.d.ts"]=!0,i["lib.es2015.promise.d.ts"]=!0,i["lib.es2015.proxy.d.ts"]=!0,i["lib.es2015.reflect.d.ts"]=!0,i["lib.es2015.symbol.d.ts"]=!0,i["lib.es2015.symbol.wellknown.d.ts"]=!0,i["lib.es2016.array.include.d.ts"]=!0,i["lib.es2016.d.ts"]=!0,i["lib.es2016.full.d.ts"]=!0,i["lib.es2017.d.ts"]=!0,i["lib.es2017.full.d.ts"]=!0,i["lib.es2017.intl.d.ts"]=!0,i["lib.es2017.object.d.ts"]=!0,i["lib.es2017.sharedmemory.d.ts"]=!0,i["lib.es2017.string.d.ts"]=!0,i["lib.es2017.typedarrays.d.ts"]=!0,i["lib.es2018.asyncgenerator.d.ts"]=!0,i["lib.es2018.asynciterable.d.ts"]=!0,i["lib.es2018.d.ts"]=!0,i["lib.es2018.full.d.ts"]=!0,i["lib.es2018.intl.d.ts"]=!0,i["lib.es2018.promise.d.ts"]=!0,i["lib.es2018.regexp.d.ts"]=!0,i["lib.es2019.array.d.ts"]=!0,i["lib.es2019.d.ts"]=!0,i["lib.es2019.full.d.ts"]=!0,i["lib.es2019.intl.d.ts"]=!0,i["lib.es2019.object.d.ts"]=!0,i["lib.es2019.string.d.ts"]=!0,i["lib.es2019.symbol.d.ts"]=!0,i["lib.es2020.bigint.d.ts"]=!0,i["lib.es2020.d.ts"]=!0,i["lib.es2020.date.d.ts"]=!0,i["lib.es2020.full.d.ts"]=!0,i["lib.es2020.intl.d.ts"]=!0,i["lib.es2020.number.d.ts"]=!0,i["lib.es2020.promise.d.ts"]=!0,i["lib.es2020.sharedmemory.d.ts"]=!0,i["lib.es2020.string.d.ts"]=!0,i["lib.es2020.symbol.wellknown.d.ts"]=!0,i["lib.es2021.d.ts"]=!0,i["lib.es2021.full.d.ts"]=!0,i["lib.es2021.intl.d.ts"]=!0,i["lib.es2021.promise.d.ts"]=!0,i["lib.es2021.string.d.ts"]=!0,i["lib.es2021.weakref.d.ts"]=!0,i["lib.es2022.array.d.ts"]=!0,i["lib.es2022.d.ts"]=!0,i["lib.es2022.error.d.ts"]=!0,i["lib.es2022.full.d.ts"]=!0,i["lib.es2022.intl.d.ts"]=!0,i["lib.es2022.object.d.ts"]=!0,i["lib.es2022.regexp.d.ts"]=!0,i["lib.es2022.sharedmemory.d.ts"]=!0,i["lib.es2022.string.d.ts"]=!0,i["lib.es2023.array.d.ts"]=!0,i["lib.es2023.d.ts"]=!0,i["lib.es2023.full.d.ts"]=!0,i["lib.es5.d.ts"]=!0,i["lib.es6.d.ts"]=!0,i["lib.esnext.d.ts"]=!0,i["lib.esnext.full.d.ts"]=!0,i["lib.esnext.intl.d.ts"]=!0,i["lib.scripthost.d.ts"]=!0,i["lib.webworker.d.ts"]=!0,i["lib.webworker.importscripts.d.ts"]=!0,i["lib.webworker.iterable.d.ts"]=!0;function M(e,t,s=0){if(typeof e=="string")return e;if(e===void 0)return"";let n="";if(s){n+=t;for(let l=0;l<s;l++)n+="  "}if(n+=e.messageText,s++,e.next)for(const l of e.next)n+=M(l,t,s);return n}function x(e){return e?e.map(t=>t.text).join(""):""}var v=class{constructor(e){this._worker=e}_textSpanToRange(e,t){let s=e.getPositionAt(t.start),n=e.getPositionAt(t.start+t.length),{lineNumber:l,column:o}=s,{lineNumber:c,column:g}=n;return{startLineNumber:l,startColumn:o,endLineNumber:c,endColumn:g}}},U=class{constructor(e){k(this,"_libFiles");k(this,"_hasFetchedLibFiles");k(this,"_fetchLibFilesPromise");this._worker=e,this._libFiles={},this._hasFetchedLibFiles=!1,this._fetchLibFilesPromise=null}isLibFile(e){return e&&e.path.indexOf("/lib.")===0?!!i[e.path.slice(1)]:!1}getOrCreateModel(e){const t=a.Uri.parse(e),s=a.editor.getModel(t);if(s)return s;if(this.isLibFile(t)&&this._hasFetchedLibFiles)return a.editor.createModel(this._libFiles[t.path.slice(1)],"typescript",t);const n=O.TG.getExtraLibs()[e];return n?a.editor.createModel(n.content,"typescript",t):null}_containsLibFile(e){for(let t of e)if(this.isLibFile(t))return!0;return!1}fetchLibFilesIfNecessary(e){return w(this,null,function*(){this._containsLibFile(e)&&(yield this._fetchLibFiles())})}_fetchLibFiles(){return this._fetchLibFilesPromise||(this._fetchLibFilesPromise=this._worker().then(e=>e.getLibFiles()).then(e=>{this._hasFetchedLibFiles=!0,this._libFiles=e})),this._fetchLibFilesPromise}},$=class extends v{constructor(t,s,n,l){super(l);k(this,"_disposables",[]);k(this,"_listener",Object.create(null));this._libFiles=t,this._defaults=s,this._selector=n;const o=r=>{if(r.getLanguageId()!==n)return;const p=()=>{const{onlyVisible:C}=this._defaults.getDiagnosticsOptions();C?r.isAttachedToEditor()&&this._doValidate(r):this._doValidate(r)};let d;const f=r.onDidChangeContent(()=>{clearTimeout(d),d=window.setTimeout(p,500)}),_=r.onDidChangeAttached(()=>{const{onlyVisible:C}=this._defaults.getDiagnosticsOptions();C&&(r.isAttachedToEditor()?p():a.editor.setModelMarkers(r,this._selector,[]))});this._listener[r.uri.toString()]={dispose(){f.dispose(),_.dispose(),clearTimeout(d)}},p()},c=r=>{a.editor.setModelMarkers(r,this._selector,[]);const p=r.uri.toString();this._listener[p]&&(this._listener[p].dispose(),delete this._listener[p])};this._disposables.push(a.editor.onDidCreateModel(r=>o(r))),this._disposables.push(a.editor.onWillDisposeModel(c)),this._disposables.push(a.editor.onDidChangeModelLanguage(r=>{c(r.model),o(r.model)})),this._disposables.push({dispose(){for(const r of a.editor.getModels())c(r)}});const g=()=>{for(const r of a.editor.getModels())c(r),o(r)};this._disposables.push(this._defaults.onDidChange(g)),this._disposables.push(this._defaults.onDidExtraLibsChange(g)),a.editor.getModels().forEach(r=>o(r))}dispose(){this._disposables.forEach(t=>t&&t.dispose()),this._disposables=[]}_doValidate(t){return w(this,null,function*(){const s=yield this._worker(t.uri);if(t.isDisposed())return;const n=[],{noSyntaxValidation:l,noSemanticValidation:o,noSuggestionDiagnostics:c}=this._defaults.getDiagnosticsOptions();l||n.push(s.getSyntacticDiagnostics(t.uri.toString())),o||n.push(s.getSemanticDiagnostics(t.uri.toString())),c||n.push(s.getSuggestionDiagnostics(t.uri.toString()));const g=yield Promise.all(n);if(!g||t.isDisposed())return;const r=g.reduce((d,f)=>f.concat(d),[]).filter(d=>(this._defaults.getDiagnosticsOptions().diagnosticCodesToIgnore||[]).indexOf(d.code)===-1),p=r.map(d=>d.relatedInformation||[]).reduce((d,f)=>f.concat(d),[]).map(d=>d.file?a.Uri.parse(d.file.fileName):null);yield this._libFiles.fetchLibFilesIfNecessary(p),!t.isDisposed()&&a.editor.setModelMarkers(t,this._selector,r.map(d=>this._convertDiagnostics(t,d)))})}_convertDiagnostics(t,s){const n=s.start||0,l=s.length||1,{lineNumber:o,column:c}=t.getPositionAt(n),{lineNumber:g,column:r}=t.getPositionAt(n+l),p=[];return s.reportsUnnecessary&&p.push(a.MarkerTag.Unnecessary),s.reportsDeprecated&&p.push(a.MarkerTag.Deprecated),{severity:this._tsDiagnosticCategoryToMarkerSeverity(s.category),startLineNumber:o,startColumn:c,endLineNumber:g,endColumn:r,message:M(s.messageText,`
`),code:s.code.toString(),tags:p,relatedInformation:this._convertRelatedInformation(t,s.relatedInformation)}}_convertRelatedInformation(t,s){if(!s)return[];const n=[];return s.forEach(l=>{let o=t;if(l.file&&(o=this._libFiles.getOrCreateModel(l.file.fileName)),!o)return;const c=l.start||0,g=l.length||1,{lineNumber:r,column:p}=o.getPositionAt(c),{lineNumber:d,column:f}=o.getPositionAt(c+g);n.push({resource:o.uri,startLineNumber:r,startColumn:p,endLineNumber:d,endColumn:f,message:M(l.messageText,`
`)})}),n}_tsDiagnosticCategoryToMarkerSeverity(t){switch(t){case 1:return a.MarkerSeverity.Error;case 3:return a.MarkerSeverity.Info;case 0:return a.MarkerSeverity.Warning;case 2:return a.MarkerSeverity.Hint}return a.MarkerSeverity.Info}},L=class extends v{get triggerCharacters(){return["."]}provideCompletionItems(e,t,s,n){return w(this,null,function*(){const l=e.getWordUntilPosition(t),o=new a.Range(t.lineNumber,l.startColumn,t.lineNumber,l.endColumn),c=e.uri,g=e.getOffsetAt(t),r=yield this._worker(c);if(e.isDisposed())return;const p=yield r.getCompletionsAtPosition(c.toString(),g);return!p||e.isDisposed()?void 0:{suggestions:p.entries.map(f=>{let _=o;if(f.replacementSpan){const N=e.getPositionAt(f.replacementSpan.start),P=e.getPositionAt(f.replacementSpan.start+f.replacementSpan.length);_=new a.Range(N.lineNumber,N.column,P.lineNumber,P.column)}const C=[];return f.kindModifiers!==void 0&&f.kindModifiers.indexOf("deprecated")!==-1&&C.push(a.languages.CompletionItemTag.Deprecated),{uri:c,position:t,offset:g,range:_,label:f.name,insertText:f.name,sortText:f.sortText,kind:L.convertKind(f.kind),tags:C}})}})}resolveCompletionItem(e,t){return w(this,null,function*(){const s=e,n=s.uri,l=s.position,o=s.offset,g=yield(yield this._worker(n)).getCompletionEntryDetails(n.toString(),o,s.label);return g?{uri:n,position:l,label:g.name,kind:L.convertKind(g.kind),detail:x(g.displayParts),documentation:{value:L.createDocumentationString(g)}}:s})}static convertKind(e){switch(e){case u.primitiveType:case u.keyword:return a.languages.CompletionItemKind.Keyword;case u.variable:case u.localVariable:return a.languages.CompletionItemKind.Variable;case u.memberVariable:case u.memberGetAccessor:case u.memberSetAccessor:return a.languages.CompletionItemKind.Field;case u.function:case u.memberFunction:case u.constructSignature:case u.callSignature:case u.indexSignature:return a.languages.CompletionItemKind.Function;case u.enum:return a.languages.CompletionItemKind.Enum;case u.module:return a.languages.CompletionItemKind.Module;case u.class:return a.languages.CompletionItemKind.Class;case u.interface:return a.languages.CompletionItemKind.Interface;case u.warning:return a.languages.CompletionItemKind.File}return a.languages.CompletionItemKind.Property}static createDocumentationString(e){let t=x(e.documentation);if(e.tags)for(const s of e.tags)t+=`

${z(s)}`;return t}};function z(e){let t=`*@${e.name}*`;if(e.name==="param"&&e.text){const[s,...n]=e.text;t+=`\`${s.text}\``,n.length>0&&(t+=` \u2014 ${n.map(l=>l.text).join(" ")}`)}else Array.isArray(e.text)?t+=` \u2014 ${e.text.map(s=>s.text).join(" ")}`:e.text&&(t+=` \u2014 ${e.text}`);return t}var E=class extends v{constructor(){super(...arguments);k(this,"signatureHelpTriggerCharacters",["(",","])}static _toSignatureHelpTriggerReason(t){switch(t.triggerKind){case a.languages.SignatureHelpTriggerKind.TriggerCharacter:return t.triggerCharacter?t.isRetrigger?{kind:"retrigger",triggerCharacter:t.triggerCharacter}:{kind:"characterTyped",triggerCharacter:t.triggerCharacter}:{kind:"invoked"};case a.languages.SignatureHelpTriggerKind.ContentChange:return t.isRetrigger?{kind:"retrigger"}:{kind:"invoked"};case a.languages.SignatureHelpTriggerKind.Invoke:default:return{kind:"invoked"}}}provideSignatureHelp(t,s,n,l){return w(this,null,function*(){const o=t.uri,c=t.getOffsetAt(s),g=yield this._worker(o);if(t.isDisposed())return;const r=yield g.getSignatureHelpItems(o.toString(),c,{triggerReason:E._toSignatureHelpTriggerReason(l)});if(!r||t.isDisposed())return;const p={activeSignature:r.selectedItemIndex,activeParameter:r.argumentIndex,signatures:[]};return r.items.forEach(d=>{const f={label:"",parameters:[]};f.documentation={value:x(d.documentation)},f.label+=x(d.prefixDisplayParts),d.parameters.forEach((_,C,N)=>{const P=x(_.displayParts),fe={label:P,documentation:{value:x(_.documentation)}};f.label+=P,f.parameters.push(fe),C<N.length-1&&(f.label+=x(d.separatorDisplayParts))}),f.label+=x(d.suffixDisplayParts),p.signatures.push(f)}),{value:p,dispose(){}}})}},J=class extends v{provideHover(e,t,s){return w(this,null,function*(){const n=e.uri,l=e.getOffsetAt(t),o=yield this._worker(n);if(e.isDisposed())return;const c=yield o.getQuickInfoAtPosition(n.toString(),l);if(!c||e.isDisposed())return;const g=x(c.documentation),r=c.tags?c.tags.map(d=>z(d)).join(`  

`):"",p=x(c.displayParts);return{range:this._textSpanToRange(e,c.textSpan),contents:[{value:"```typescript\n"+p+"\n```\n"},{value:g+(r?`

`+r:"")}]}})}},G=class extends v{provideDocumentHighlights(e,t,s){return w(this,null,function*(){const n=e.uri,l=e.getOffsetAt(t),o=yield this._worker(n);if(e.isDisposed())return;const c=yield o.getDocumentHighlights(n.toString(),l,[n.toString()]);if(!(!c||e.isDisposed()))return c.flatMap(g=>g.highlightSpans.map(r=>({range:this._textSpanToRange(e,r.textSpan),kind:r.kind==="writtenReference"?a.languages.DocumentHighlightKind.Write:a.languages.DocumentHighlightKind.Text})))})}},Q=class extends v{constructor(e,t){super(t),this._libFiles=e}provideDefinition(e,t,s){return w(this,null,function*(){const n=e.uri,l=e.getOffsetAt(t),o=yield this._worker(n);if(e.isDisposed())return;const c=yield o.getDefinitionAtPosition(n.toString(),l);if(!c||e.isDisposed()||(yield this._libFiles.fetchLibFilesIfNecessary(c.map(r=>a.Uri.parse(r.fileName))),e.isDisposed()))return;const g=[];for(let r of c){const p=this._libFiles.getOrCreateModel(r.fileName);p&&g.push({uri:p.uri,range:this._textSpanToRange(p,r.textSpan)})}return g})}},X=class extends v{constructor(e,t){super(t),this._libFiles=e}provideReferences(e,t,s,n){return w(this,null,function*(){const l=e.uri,o=e.getOffsetAt(t),c=yield this._worker(l);if(e.isDisposed())return;const g=yield c.getReferencesAtPosition(l.toString(),o);if(!g||e.isDisposed()||(yield this._libFiles.fetchLibFilesIfNecessary(g.map(p=>a.Uri.parse(p.fileName))),e.isDisposed()))return;const r=[];for(let p of g){const d=this._libFiles.getOrCreateModel(p.fileName);d&&r.push({uri:d.uri,range:this._textSpanToRange(d,p.textSpan)})}return r})}},Y=class extends v{provideDocumentSymbols(e,t){return w(this,null,function*(){const s=e.uri,n=yield this._worker(s);if(e.isDisposed())return;const l=yield n.getNavigationTree(s.toString());if(!l||e.isDisposed())return;const o=(g,r)=>{var d;return{name:g.text,detail:"",kind:y[g.kind]||a.languages.SymbolKind.Variable,range:this._textSpanToRange(e,g.spans[0]),selectionRange:this._textSpanToRange(e,g.spans[0]),tags:[],children:(d=g.childItems)==null?void 0:d.map(f=>o(f,g.text)),containerName:r}};return l.childItems?l.childItems.map(g=>o(g)):[]})}},u=class{};h(u,"unknown",""),h(u,"keyword","keyword"),h(u,"script","script"),h(u,"module","module"),h(u,"class","class"),h(u,"interface","interface"),h(u,"type","type"),h(u,"enum","enum"),h(u,"variable","var"),h(u,"localVariable","local var"),h(u,"function","function"),h(u,"localFunction","local function"),h(u,"memberFunction","method"),h(u,"memberGetAccessor","getter"),h(u,"memberSetAccessor","setter"),h(u,"memberVariable","property"),h(u,"constructorImplementation","constructor"),h(u,"callSignature","call"),h(u,"indexSignature","index"),h(u,"constructSignature","construct"),h(u,"parameter","parameter"),h(u,"typeParameter","type parameter"),h(u,"primitiveType","primitive type"),h(u,"label","label"),h(u,"alias","alias"),h(u,"const","const"),h(u,"let","let"),h(u,"warning","warning");var y=Object.create(null);y[u.module]=a.languages.SymbolKind.Module,y[u.class]=a.languages.SymbolKind.Class,y[u.enum]=a.languages.SymbolKind.Enum,y[u.interface]=a.languages.SymbolKind.Interface,y[u.memberFunction]=a.languages.SymbolKind.Method,y[u.memberVariable]=a.languages.SymbolKind.Property,y[u.memberGetAccessor]=a.languages.SymbolKind.Property,y[u.memberSetAccessor]=a.languages.SymbolKind.Property,y[u.variable]=a.languages.SymbolKind.Variable,y[u.const]=a.languages.SymbolKind.Variable,y[u.localVariable]=a.languages.SymbolKind.Variable,y[u.variable]=a.languages.SymbolKind.Variable,y[u.function]=a.languages.SymbolKind.Function,y[u.localFunction]=a.languages.SymbolKind.Function;var D=class extends v{static _convertOptions(e){return{ConvertTabsToSpaces:e.insertSpaces,TabSize:e.tabSize,IndentSize:e.tabSize,IndentStyle:2,NewLineCharacter:`
`,InsertSpaceAfterCommaDelimiter:!0,InsertSpaceAfterSemicolonInForStatements:!0,InsertSpaceBeforeAndAfterBinaryOperators:!0,InsertSpaceAfterKeywordsInControlFlowStatements:!0,InsertSpaceAfterFunctionKeywordForAnonymousFunctions:!0,InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis:!1,InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets:!1,InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces:!1,PlaceOpenBraceOnNewLineForControlBlocks:!1,PlaceOpenBraceOnNewLineForFunctions:!1}}_convertTextChanges(e,t){return{text:t.newText,range:this._textSpanToRange(e,t.span)}}},Z=class extends D{constructor(){super(...arguments);k(this,"canFormatMultipleRanges",!1)}provideDocumentRangeFormattingEdits(t,s,n,l){return w(this,null,function*(){const o=t.uri,c=t.getOffsetAt({lineNumber:s.startLineNumber,column:s.startColumn}),g=t.getOffsetAt({lineNumber:s.endLineNumber,column:s.endColumn}),r=yield this._worker(o);if(t.isDisposed())return;const p=yield r.getFormattingEditsForRange(o.toString(),c,g,D._convertOptions(n));if(!(!p||t.isDisposed()))return p.map(d=>this._convertTextChanges(t,d))})}},q=class extends D{get autoFormatTriggerCharacters(){return[";","}",`
`]}provideOnTypeFormattingEdits(e,t,s,n,l){return w(this,null,function*(){const o=e.uri,c=e.getOffsetAt(t),g=yield this._worker(o);if(e.isDisposed())return;const r=yield g.getFormattingEditsAfterKeystroke(o.toString(),c,s,D._convertOptions(n));if(!(!r||e.isDisposed()))return r.map(p=>this._convertTextChanges(e,p))})}},ee=class extends D{provideCodeActions(e,t,s,n){return w(this,null,function*(){const l=e.uri,o=e.getOffsetAt({lineNumber:t.startLineNumber,column:t.startColumn}),c=e.getOffsetAt({lineNumber:t.endLineNumber,column:t.endColumn}),g=D._convertOptions(e.getOptions()),r=s.markers.filter(_=>_.code).map(_=>_.code).map(Number),p=yield this._worker(l);if(e.isDisposed())return;const d=yield p.getCodeFixesAtPosition(l.toString(),o,c,r,g);return!d||e.isDisposed()?{actions:[],dispose:()=>{}}:{actions:d.filter(_=>_.changes.filter(C=>C.isNewFile).length===0).map(_=>this._tsCodeFixActionToMonacoCodeAction(e,s,_)),dispose:()=>{}}})}_tsCodeFixActionToMonacoCodeAction(e,t,s){const n=[];for(const o of s.changes)for(const c of o.textChanges)n.push({resource:e.uri,versionId:void 0,textEdit:{range:this._textSpanToRange(e,c.span),text:c.newText}});return{title:s.description,edit:{edits:n},diagnostics:t.markers,kind:"quickfix"}}},te=class extends v{constructor(e,t){super(t),this._libFiles=e}provideRenameEdits(e,t,s,n){return w(this,null,function*(){const l=e.uri,o=l.toString(),c=e.getOffsetAt(t),g=yield this._worker(l);if(e.isDisposed())return;const r=yield g.getRenameInfo(o,c,{allowRenameOfImportPath:!1});if(r.canRename===!1)return{edits:[],rejectReason:r.localizedErrorMessage};if(r.fileToRename!==void 0)throw new Error("Renaming files is not supported.");const p=yield g.findRenameLocations(o,c,!1,!1,!1);if(!p||e.isDisposed())return;const d=[];for(const f of p){const _=this._libFiles.getOrCreateModel(f.fileName);if(_)d.push({resource:_.uri,versionId:void 0,textEdit:{range:this._textSpanToRange(_,f.textSpan),text:s}});else throw new Error(`Unknown file ${f.fileName}.`)}return{edits:d}})}},re=class extends v{provideInlayHints(e,t,s){return w(this,null,function*(){const n=e.uri,l=n.toString(),o=e.getOffsetAt({lineNumber:t.startLineNumber,column:t.startColumn}),c=e.getOffsetAt({lineNumber:t.endLineNumber,column:t.endColumn}),g=yield this._worker(n);return e.isDisposed()?null:{hints:(yield g.provideInlayHints(l,o,c)).map(d=>oe(ae({},d),{label:d.text,position:e.getPositionAt(d.position),kind:this._convertHintKind(d.kind)})),dispose:()=>{}}})}_convertHintKind(e){switch(e){case"Parameter":return a.languages.InlayHintKind.Parameter;case"Type":return a.languages.InlayHintKind.Type;default:return a.languages.InlayHintKind.Type}}},H,W;function le(e){W=se(e,"typescript")}function ce(e){H=se(e,"javascript")}function ge(){return new Promise((e,t)=>{if(!H)return t("JavaScript not registered!");e(H)})}function de(){return new Promise((e,t)=>{if(!W)return t("TypeScript not registered!");e(W)})}function se(e,t){const s=[],n=[],l=new B(t,e);s.push(l);const o=(...r)=>l.getLanguageServiceWorker(...r),c=new U(o);function g(){const{modeConfiguration:r}=e;ie(n),r.completionItems&&n.push(a.languages.registerCompletionItemProvider(t,new L(o))),r.signatureHelp&&n.push(a.languages.registerSignatureHelpProvider(t,new E(o))),r.hovers&&n.push(a.languages.registerHoverProvider(t,new J(o))),r.documentHighlights&&n.push(a.languages.registerDocumentHighlightProvider(t,new G(o))),r.definitions&&n.push(a.languages.registerDefinitionProvider(t,new Q(c,o))),r.references&&n.push(a.languages.registerReferenceProvider(t,new X(c,o))),r.documentSymbols&&n.push(a.languages.registerDocumentSymbolProvider(t,new Y(o))),r.rename&&n.push(a.languages.registerRenameProvider(t,new te(c,o))),r.documentRangeFormattingEdits&&n.push(a.languages.registerDocumentRangeFormattingEditProvider(t,new Z(o))),r.onTypeFormattingEdits&&n.push(a.languages.registerOnTypeFormattingEditProvider(t,new q(o))),r.codeActions&&n.push(a.languages.registerCodeActionProvider(t,new ee(o))),r.inlayHints&&n.push(a.languages.registerInlayHintsProvider(t,new re(o))),r.diagnostics&&n.push(new $(c,e,t,o))}return g(),s.push(pe(n)),o}function pe(e){return{dispose:()=>ie(e)}}function ie(e){for(;e.length;)e.pop().dispose()}}}]);
}());