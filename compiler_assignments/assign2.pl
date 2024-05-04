s(diff, check) --> [a], s1(Diff1, Check1), [a], { Diff = Diff1, Check = Check1 }.
s(diff, check) --> [b], s1(Diff1, Check1), [b], { Diff = Diff1, Check = Check1 }.
s(diff, check) --> [a], s1(Diff1, Check1), [b], { Diff is Diff1 + 1, Check is Check1 + (Diff1 =:= 0) }.
s(diff, check) --> [b], s1(Diff1, Check1), [a], { Diff is Diff1 - 1, Check is Check1 - (Diff1 =:= 1) }.
s(0, 0) --> [].
s1(0, 0) --> [].
s1(Diff, Check) --> s(Diff, Check).
