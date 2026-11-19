package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p077d8.C8321f;
import p123h7.C8736p;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8810v0;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    public static final class Match {
        private final List<Integer> resultIndices;
        private final C8321f resultRange;

        public Match(C8321f resultRange, List<Integer> resultIndices) {
            AbstractC9133u.m16133g(resultRange, "resultRange");
            AbstractC9133u.m16133g(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final C8321f getResultRange() {
            return this.resultRange;
        }
    }

    public static final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String name, int i10) {
            AbstractC9133u.m16133g(name, "name");
            this.name = name;
            this.index = i10;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i11 & 2) != 0) {
                i10 = resultColumn.index;
            }
            return resultColumn.copy(str, i10);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String name, int i10) {
            AbstractC9133u.m16133g(name, "name");
            return new ResultColumn(name, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return AbstractC9133u.m16128b(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    public static final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(AbstractC8809v.m14771n(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            public final Solution build(List<Match> matches) {
                AbstractC9133u.m16133g(matches, "matches");
                int i10 = 0;
                int iM13497c = 0;
                for (Match match : matches) {
                    iM13497c += ((match.getResultRange().m13497c() - match.getResultRange().m13496b()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = matches.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM13496b = ((Match) it.next()).getResultRange().m13496b();
                while (it.hasNext()) {
                    int iM13496b2 = ((Match) it.next()).getResultRange().m13496b();
                    if (iM13496b > iM13496b2) {
                        iM13496b = iM13496b2;
                    }
                }
                Iterator<T> it2 = matches.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM13497c2 = ((Match) it2.next()).getResultRange().m13497c();
                while (it2.hasNext()) {
                    int iM13497c3 = ((Match) it2.next()).getResultRange().m13497c();
                    if (iM13497c2 < iM13497c3) {
                        iM13497c2 = iM13497c3;
                    }
                }
                Iterable c8321f = new C8321f(iM13496b, iM13497c2);
                if (!(c8321f instanceof Collection) || !((Collection) c8321f).isEmpty()) {
                    Iterator it3 = c8321f.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((AbstractC8792m0) it3).nextInt();
                        Iterator<T> it4 = matches.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().m13502g(iNextInt)) {
                                i12++;
                            }
                            if (i12 > 1) {
                                i11++;
                                if (i11 < 0) {
                                    AbstractC8809v.m14779v();
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
                return new Solution(matches, iM13497c, i10);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            private Companion() {
            }
        }

        public Solution(List<Match> matches, int i10, int i11) {
            AbstractC9133u.m16133g(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i10;
            this.overlaps = i11;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            AbstractC9133u.m16133g(other, "other");
            int iM16135i = AbstractC9133u.m16135i(this.overlaps, other.overlaps);
            return iM16135i != 0 ? iM16135i : AbstractC9133u.m16135i(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i10, InterfaceC10570l interfaceC10570l) {
        if (i10 == list.size()) {
            interfaceC10570l.invoke(AbstractC8778f0.m14544U0(list2));
            return;
        }
        Iterator<T> it = list.get(i10).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i10 + 1, interfaceC10570l);
            list2.remove(AbstractC8809v.m14773p(list2));
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i10, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i10, interfaceC10570l);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, InterfaceC10575q interfaceC10575q) {
        int i10 = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                interfaceC10575q.invoke(Integer.valueOf(i10), Integer.valueOf(length), list.subList(i10, length));
            }
            int i11 = i10 + 1;
            int i12 = length + 1;
            if (i12 > list.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - list.get(i10).getName().hashCode()) + list.get(length).getName().hashCode();
            i10 = i11;
            length = i12;
        }
    }

    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        AbstractC9133u.m16133g(resultColumns, "resultColumns");
        AbstractC9133u.m16133g(mappings, "mappings");
        int length = resultColumns.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String strSubstring = resultColumns[i11];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                AbstractC9133u.m16132f(strSubstring, "substring(...)");
            }
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            resultColumns[i11] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int length3 = mappings[i12].length;
            for (int i13 = 0; i13 < length3; i13++) {
                String[] strArr = mappings[i12];
                String lowerCase2 = strArr[i13].toLowerCase(Locale.ROOT);
                AbstractC9133u.m16132f(lowerCase2, "toLowerCase(...)");
                strArr[i13] = lowerCase2;
            }
        }
        Set setM14782b = AbstractC8810v0.m14782b();
        for (String[] strArr2 : mappings) {
            AbstractC8768a0.m14482D(setM14782b, strArr2);
        }
        Set setM14781a = AbstractC8810v0.m14781a(setM14782b);
        List listM14753c = AbstractC8807u.m14753c();
        int length4 = resultColumns.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length4) {
            String str = resultColumns[i14];
            int i16 = i15 + 1;
            if (setM14781a.contains(str)) {
                listM14753c.add(new ResultColumn(str, i15));
            }
            i14++;
            i15 = i16;
        }
        List<ResultColumn> listM14751a = AbstractC8807u.m14751a(listM14753c);
        int length5 = mappings.length;
        final ArrayList arrayList = new ArrayList(length5);
        for (int i17 = 0; i17 < length5; i17++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i18 = 0;
        final int i19 = 0;
        while (i18 < length6) {
            final String[] strArr3 = mappings[i18];
            int i20 = i19 + 1;
            INSTANCE.rabinKarpSearch(listM14751a, strArr3, new InterfaceC10575q() { // from class: androidx.room.a
                @Override // p300x7.InterfaceC10575q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AmbiguousColumnResolver.resolve$lambda$16$lambda$7(strArr3, arrayList, i19, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (List) obj3);
                }
            });
            if (((List) arrayList.get(i19)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i21 = i10; i21 < length7; i21++) {
                    String str2 = strArr3[i21];
                    List listM14753c2 = AbstractC8807u.m14753c();
                    for (ResultColumn resultColumn : listM14751a) {
                        if (AbstractC9133u.m16128b(str2, resultColumn.getName())) {
                            listM14753c2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listM14751a2 = AbstractC8807u.m14751a(listM14753c2);
                    if (listM14751a2.isEmpty()) {
                        throw new IllegalStateException(("Column " + str2 + " not found in result").toString());
                    }
                    arrayList2.add(listM14751a2);
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new InterfaceC10570l() { // from class: androidx.room.b
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return AmbiguousColumnResolver.resolve$lambda$16$lambda$15(arrayList, i19, (List) obj);
                    }
                }, 6, null);
            }
            i18++;
            i19 = i20;
            i10 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new InterfaceC10570l() { // from class: androidx.room.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AmbiguousColumnResolver.resolve$lambda$19(ref$ObjectRef, (List) obj);
            }
        }, 6, null);
        List<Match> matches = ((Solution) ref$ObjectRef.f17473a).getMatches();
        ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC8778f0.m14543T0(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p resolve$lambda$16$lambda$15(List list, int i10, List indices) {
        AbstractC9133u.m16133g(indices, "indices");
        Iterator it = indices.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        Iterator it2 = indices.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        ((List) list.get(i10)).add(new Match(new C8321f(iIntValue, iIntValue3), indices));
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p resolve$lambda$16$lambda$7(String[] strArr, List list, int i10, int i11, int i12, List resultColumnsSublist) {
        Object next;
        AbstractC9133u.m16133g(resultColumnsSublist, "resultColumnsSublist");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it = resultColumnsSublist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9133u.m16128b(str, ((ResultColumn) next).component1())) {
                    break;
                }
            }
            ResultColumn resultColumn = (ResultColumn) next;
            if (resultColumn == null) {
                return C8736p.f16368a;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        ((List) list.get(i10)).add(new Match(new C8321f(i11, i12 - 1), arrayList));
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p resolve$lambda$19(Ref$ObjectRef ref$ObjectRef, List it) {
        AbstractC9133u.m16133g(it, "it");
        Solution solutionBuild = Solution.Companion.build(it);
        if (solutionBuild.compareTo((Solution) ref$ObjectRef.f17473a) < 0) {
            ref$ObjectRef.f17473a = solutionBuild;
        }
        return C8736p.f16368a;
    }

    public static final int[][] resolve(List<String> resultColumns, String[][] mappings) {
        AbstractC9133u.m16133g(resultColumns, "resultColumns");
        AbstractC9133u.m16133g(mappings, "mappings");
        return resolve((String[]) resultColumns.toArray(new String[0]), mappings);
    }
}
