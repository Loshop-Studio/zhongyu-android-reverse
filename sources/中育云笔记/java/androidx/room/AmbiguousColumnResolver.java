package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p325rc.AbstractC10981x0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    public static final class Match {
        private final List<Integer> resultIndices;
        private final C10405j resultRange;

        public Match(C10405j resultRange, List<Integer> resultIndices) {
            AbstractC9979u.m20294g(resultRange, "resultRange");
            AbstractC9979u.m20294g(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final C10405j getResultRange() {
            return this.resultRange;
        }
    }

    public static final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String name, int i10) {
            AbstractC9979u.m20294g(name, "name");
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
            AbstractC9979u.m20294g(name, "name");
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
            return AbstractC9979u.m20289b(this.name, resultColumn.name) && this.index == resultColumn.index;
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
        private static final Solution NO_SOLUTION = new Solution(AbstractC10978w.m24136n(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final Solution build(List<Match> matches) {
                AbstractC9979u.m20294g(matches, "matches");
                List<Match> list = matches;
                int i10 = 0;
                int iM21734c = 0;
                for (Match match : list) {
                    iM21734c += ((match.getResultRange().m21734c() - match.getResultRange().m21733b()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM21733b = ((Match) it.next()).getResultRange().m21733b();
                while (it.hasNext()) {
                    int iM21733b2 = ((Match) it.next()).getResultRange().m21733b();
                    if (iM21733b > iM21733b2) {
                        iM21733b = iM21733b2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM21734c2 = ((Match) it2.next()).getResultRange().m21734c();
                while (it2.hasNext()) {
                    int iM21734c3 = ((Match) it2.next()).getResultRange().m21734c();
                    if (iM21734c2 < iM21734c3) {
                        iM21734c2 = iM21734c3;
                    }
                }
                Iterable c10405j = new C10405j(iM21733b, iM21734c2);
                if (!(c10405j instanceof Collection) || !((Collection) c10405j).isEmpty()) {
                    Iterator it3 = c10405j.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((AbstractC10961n0) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().m21739g(iNextInt)) {
                                i12++;
                            }
                            if (i12 > 1) {
                                i11++;
                                if (i11 < 0) {
                                    AbstractC10978w.m24144v();
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
                return new Solution(matches, iM21734c, i10);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            private Companion() {
            }
        }

        public Solution(List<Match> matches, int i10, int i11) {
            AbstractC9979u.m20294g(matches, "matches");
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
            AbstractC9979u.m20294g(other, "other");
            int iM20296i = AbstractC9979u.m20296i(this.overlaps, other.overlaps);
            return iM20296i != 0 ? iM20296i : AbstractC9979u.m20296i(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i10, InterfaceC9540l interfaceC9540l) {
        if (i10 == list.size()) {
            interfaceC9540l.invoke(AbstractC10947g0.m23922X0(list2));
            return;
        }
        Iterator<T> it = list.get(i10).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i10 + 1, interfaceC9540l);
            list2.remove(AbstractC10978w.m24138p(list2));
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i10, interfaceC9540l);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, InterfaceC9545q interfaceC9545q) {
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
                interfaceC9545q.invoke(Integer.valueOf(i10), Integer.valueOf(length), list.subList(i10, length));
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

    public static final int[][] resolve(List<String> resultColumns, String[][] mappings) {
        AbstractC9979u.m20294g(resultColumns, "resultColumns");
        AbstractC9979u.m20294g(mappings, "mappings");
        return resolve((String[]) resultColumns.toArray(new String[0]), mappings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q resolve$lambda$16$lambda$15(List list, int i10, List indices) {
        AbstractC9979u.m20294g(indices, "indices");
        List list2 = indices;
        Iterator it = list2.iterator();
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
        Iterator it2 = list2.iterator();
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
        ((List) list.get(i10)).add(new Match(new C10405j(iIntValue, iIntValue3), indices));
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q resolve$lambda$16$lambda$7(String[] strArr, List list, int i10, int i11, int i12, List resultColumnsSublist) {
        Object next;
        AbstractC9979u.m20294g(resultColumnsSublist, "resultColumnsSublist");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it = resultColumnsSublist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9979u.m20289b(str, ((ResultColumn) next).component1())) {
                    break;
                }
            }
            ResultColumn resultColumn = (ResultColumn) next;
            if (resultColumn == null) {
                return C10786q.f26013a;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        ((List) list.get(i10)).add(new Match(new C10405j(i11, i12 - 1), arrayList));
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q resolve$lambda$19(Ref$ObjectRef ref$ObjectRef, List it) {
        AbstractC9979u.m20294g(it, "it");
        Solution solutionBuild = Solution.Companion.build(it);
        if (solutionBuild.compareTo((Solution) ref$ObjectRef.f23402c) < 0) {
            ref$ObjectRef.f23402c = solutionBuild;
        }
        return C10786q.f26013a;
    }

    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        AbstractC9979u.m20294g(resultColumns, "resultColumns");
        AbstractC9979u.m20294g(mappings, "mappings");
        int length = resultColumns.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String strSubstring = resultColumns[i11];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
            }
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
            resultColumns[i11] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int length3 = mappings[i12].length;
            for (int i13 = 0; i13 < length3; i13++) {
                String[] strArr = mappings[i12];
                String lowerCase2 = strArr[i13].toLowerCase(Locale.ROOT);
                AbstractC9979u.m20293f(lowerCase2, "toLowerCase(...)");
                strArr[i13] = lowerCase2;
            }
        }
        Set setM24156b = AbstractC10981x0.m24156b();
        for (String[] strArr2 : mappings) {
            AbstractC10937b0.m23859D(setM24156b, strArr2);
        }
        Set setM24155a = AbstractC10981x0.m24155a(setM24156b);
        List listM24124c = AbstractC10976v.m24124c();
        int length4 = resultColumns.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length4) {
            String str = resultColumns[i14];
            int i16 = i15 + 1;
            if (setM24155a.contains(str)) {
                listM24124c.add(new ResultColumn(str, i15));
            }
            i14++;
            i15 = i16;
        }
        List<ResultColumn> listM24122a = AbstractC10976v.m24122a(listM24124c);
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
            INSTANCE.rabinKarpSearch(listM24122a, strArr3, new InterfaceC9545q() { // from class: androidx.room.a
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AmbiguousColumnResolver.resolve$lambda$16$lambda$7(strArr3, arrayList, i19, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (List) obj3);
                }
            });
            if (((List) arrayList.get(i19)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i21 = i10; i21 < length7; i21++) {
                    String str2 = strArr3[i21];
                    List listM24124c2 = AbstractC10976v.m24124c();
                    for (ResultColumn resultColumn : listM24122a) {
                        if (AbstractC9979u.m20289b(str2, resultColumn.getName())) {
                            listM24124c2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listM24122a2 = AbstractC10976v.m24122a(listM24124c2);
                    if (!listM24122a2.isEmpty()) {
                        arrayList2.add(listM24122a2);
                    } else {
                        throw new IllegalStateException(("Column " + str2 + " not found in result").toString());
                    }
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new InterfaceC9540l() { // from class: androidx.room.b
                    @Override // p181hd.InterfaceC9540l
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
            int size = arrayList.size();
            int i22 = 0;
            while (i22 < size) {
                Object obj = arrayList.get(i22);
                i22++;
                if (((List) obj).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new InterfaceC9540l() { // from class: androidx.room.c
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return AmbiguousColumnResolver.resolve$lambda$19(ref$ObjectRef, (List) obj2);
            }
        }, 6, null);
        List<Match> matches = ((Solution) ref$ObjectRef.f23402c).getMatches();
        ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(matches, 10));
        Iterator<T> it = matches.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC10947g0.m23921W0(((Match) it.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}
