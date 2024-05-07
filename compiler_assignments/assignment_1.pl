alphabet(a(V)) --> var(V).
alphabet(a(C)) --> const(C).
alphabet(a(F)) --> func(F).
alphabet(a(P)) --> pred(P).
alphabet(a(S)) --> sync(S).
var(v(x)) --> [x].
var(v(y)) --> [y].
var(v(z)) --> [z].
var(v(w)) --> [w].
var(v(t)) --> [t].
const(c('J')) --> ['J'].
const(c('K')) --> ['K'].
const(c('L')) --> ['L'].
const(c('M')) --> ['M'].
const(c('N')) --> ['N'].
func(f(f)) --> [f].
func(f(g)) --> [g].
func(h(h)) --> [h].
pred(p('P')) --> ['P'].
pred(p('Q')) --> ['Q'].
pred(p('R')) --> ['R'].
pred(p('S')) --> ['S'].
pred(p('T')) --> ['T'].
sync(s('~')) --> ['~'].
sync(s('&')) --> ['&'].
sync(s('|')) --> ['|'].
sync(s('=>')) --> ['=>'].
sync(s('<=>')) --> ['<=>'].
sync(s('A')) --> ['A'].
sync(s('E')) --> ['E'].
sync(s('(')) --> ['('].
sync(s(')')) --> [')'].
sync(s(*)) --> [*].
term(t(V)) --> var(V).
term(t(C)) --> const(C).
term(t(F,s('('),PR ,s(')'))) --> func(F) , ['('] , prodterms(PR) , [')'].
atom(atom(P,s('('),PR,s(')'))) -->  pred(P), ['('] , prodterms(PR), [')'].
prodterms(T) --> term(T).
prodterms(prod(T,s(*),PR)) --> term(T) , [*] , prodterms(PR).
wffd(wffd(s('<=>'),W,D)) --> ['<=>'] , wff(W) , wffd(D).
wffd(wffd(s('<=>'),W)) --> ['<=>'] , wff(W).
wffd(wffd(s('=>'),W,D)) --> ['=>'] , wff(W) , wffd(D).
wffd(wffd(s('=>'),W)) --> ['=>'] , wff(W).
wffd(wffd(s('|'),W,D)) --> ['|'] , wff(W) , wffd(D).
wffd(wffd(s('|'),W)) --> ['|'] , wff(W).
wffd(wffd(s('&'),W,D)) --> ['&'] , wff(W) , wffd(D).
wffd(wffd(s('&'),W)) --> ['&'] , wff(W). 
wff(wff(s('~'),wff(W))) --> ['~'] , wff(W).
wff(wff(s('('),W,s(')'))) --> ['('] , wff(W) , [')'].
wff(wff(s('A'),V,s('('),W,s(')'))) --> ['A'] , var(V) , ['('] , wff(W) , [')'].
wff(wff(s('E'),V,s('('),W,s(')'))) --> ['E'] , var(V) , ['('] , wff(W) , [')'].
wff(wff(A)) --> atom(A).
wff(wff(A,D)) --> atom(A) , wffd(D).
s(s(WFF)) --> wff(WFF).








