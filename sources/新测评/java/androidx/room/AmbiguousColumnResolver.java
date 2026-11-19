package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0005H\u0007¢\u0006\u0002\u0010\u000bJ5\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0005H\u0007¢\u0006\u0002\u0010\fJO\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00052$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0002\u0010\u0015JV\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00172\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\b0\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0002¨\u0006 "}, m13558d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "<init>", "()V", "resolve", "", "", "resultColumns", "", "", "mappings", "(Ljava/util/List;[[Ljava/lang/String;)[[I", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "rabinKarpSearch", "", "content", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "pattern", "onHashMatch", "Lkotlin/Function3;", "", "(Ljava/util/List;[Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "dfs", ExifInterface.GPS_DIRECTION_TRUE, "current", "", "depth", "block", "Lkotlin/Function1;", "ResultColumn", "Match", "Solution", "room-common"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n37#2:274\n36#2,3:275\n37#2:300\n36#2,3:301\n1#3:278\n13402#4,2:279\n13467#4,3:281\n13467#4,2:284\n11158#4:286\n11493#4,2:287\n11495#4:291\n13469#4:292\n11158#4:306\n11493#4,2:307\n11495#4:311\n1863#5,2:289\n1734#5,3:293\n1557#5:296\n1628#5,3:297\n1863#5,2:304\n295#5,2:309\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n65#1:274\n65#1:275,3\n171#1:300\n171#1:301,3\n102#1:279,2\n104#1:281,3\n113#1:284,2\n138#1:286\n138#1:287,2\n138#1:291\n113#1:292\n120#1:306\n120#1:307,2\n120#1:311\n140#1:289,2\n161#1:293,3\n171#1:296\n171#1:297,3\n208#1:304,2\n122#1:309,2\n*E\n"})
/* loaded from: classes3.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m13558d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "resultRange", "Lkotlin/ranges/IntRange;", "resultIndices", "", "", "<init>", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "getResultRange", "()Lkotlin/ranges/IntRange;", "getResultIndices", "()Ljava/util/List;", "room-common"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Match {
        private final List<Integer> resultIndices;
        private final IntRange resultRange;

        public Match(IntRange resultRange, List<Integer> resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final IntRange getResultRange() {
            return this.resultRange;
        }
    }

    @Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m13558d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", HintConstants.AUTOFILL_HINT_NAME, "", "index", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "room-common"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final /* data */ class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String name, int i10) {
            Intrinsics.checkNotNullParameter(name, "name");
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

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final ResultColumn copy(String name, int index) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ResultColumn(name, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) other;
            return Intrinsics.areEqual(this.name, resultColumn.name) && this.index == resultColumn.index;
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

    @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0012"}, m13558d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "coverageOffset", "", "overlaps", "<init>", "(Ljava/util/List;II)V", "getMatches", "()Ljava/util/List;", "getCoverageOffset", "()I", "getOverlaps", "compareTo", "other", "Companion", "room-common"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Solution implements Comparable<Solution> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        @Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m13558d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "<init>", "()V", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "room-common"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
        @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1#2:274\n1782#3,3:275\n1863#3,2:278\n1785#3:280\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n252#1:275,3\n254#1:278,2\n252#1:280\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Solution build(List<Match> matches) {
                Intrinsics.checkNotNullParameter(matches, "matches");
                int i10 = 0;
                int last = 0;
                for (Match match : matches) {
                    last += ((match.getResultRange().getLast() - match.getResultRange().getFirst()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = matches.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((Match) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((Match) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = matches.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last2 = ((Match) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last3 = ((Match) it2.next()).getResultRange().getLast();
                    if (last2 < last3) {
                        last2 = last3;
                    }
                }
                Iterable intRange = new IntRange(first, last2);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        Iterator<T> it4 = matches.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().contains(iNextInt)) {
                                i12++;
                            }
                            if (i12 > 1) {
                                i11++;
                                if (i11 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
                return new Solution(matches, last, i10);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            private Companion() {
            }
        }

        public Solution(List<Match> matches, int i10, int i11) {
            Intrinsics.checkNotNullParameter(matches, "matches");
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
            Intrinsics.checkNotNullParameter(other, "other");
            int iCompare = Intrinsics.compare(this.overlaps, other.overlaps);
            return iCompare != 0 ? iCompare : Intrinsics.compare(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> content, List<T> current, int depth, Function1<? super List<? extends T>, Unit> block) {
        if (depth == content.size()) {
            block.invoke(CollectionsKt.toList(current));
            return;
        }
        Iterator<T> it = content.get(depth).iterator();
        while (it.hasNext()) {
            current.add(it.next());
            INSTANCE.dfs(content, current, depth + 1, block);
            current.remove(CollectionsKt.getLastIndex(current));
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i10, function1);
    }

    private final void rabinKarpSearch(List<ResultColumn> content, String[] pattern, Function3<? super Integer, ? super Integer, ? super List<ResultColumn>, Unit> onHashMatch) {
        int i10 = 0;
        int iHashCode = 0;
        for (String str : pattern) {
            iHashCode += str.hashCode();
        }
        int length = pattern.length;
        Iterator<T> it = content.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                onHashMatch.invoke(Integer.valueOf(i10), Integer.valueOf(length), content.subList(i10, length));
            }
            int i11 = i10 + 1;
            int i12 = length + 1;
            if (i12 > content.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - content.get(i10).getName().hashCode()) + content.get(length).getName().hashCode();
            i10 = i11;
            length = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String strSubstring = resultColumns[i11];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            resultColumns[i11] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int length3 = mappings[i12].length;
            for (int i13 = 0; i13 < length3; i13++) {
                String[] strArr = mappings[i12];
                String lowerCase2 = strArr[i13].toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                strArr[i13] = lowerCase2;
            }
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String[] strArr2 : mappings) {
            CollectionsKt.addAll(setCreateSetBuilder, strArr2);
        }
        Set setBuild = SetsKt.build(setCreateSetBuilder);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length4 = resultColumns.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length4) {
            String str = resultColumns[i14];
            int i16 = i15 + 1;
            if (setBuild.contains(str)) {
                listCreateListBuilder.add(new ResultColumn(str, i15));
            }
            i14++;
            i15 = i16;
        }
        List<ResultColumn> listBuild = CollectionsKt.build(listCreateListBuilder);
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
            INSTANCE.rabinKarpSearch(listBuild, strArr3, new Function3() { // from class: androidx.room.a
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AmbiguousColumnResolver.resolve$lambda$16$lambda$7(strArr3, arrayList, i19, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (List) obj3);
                }
            });
            if (((List) arrayList.get(i19)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i21 = i10; i21 < length7; i21++) {
                    String str2 = strArr3[i21];
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    for (ResultColumn resultColumn : listBuild) {
                        if (Intrinsics.areEqual(str2, resultColumn.getName())) {
                            listCreateListBuilder2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
                    if (listBuild2.isEmpty()) {
                        throw new IllegalStateException(("Column " + str2 + " not found in result").toString());
                    }
                    arrayList2.add(listBuild2);
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new Function1() { // from class: androidx.room.b
                    @Override // kotlin.jvm.functions.Function1
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
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.INSTANCE.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new Function1() { // from class: androidx.room.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AmbiguousColumnResolver.resolve$lambda$19(objectRef, (List) obj2);
            }
        }, 6, null);
        List<Match> matches = ((Solution) objectRef.element).getMatches();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(matches, 10));
        Iterator<T> it = matches.iterator();
        while (it.hasNext()) {
            arrayList3.add(CollectionsKt.toIntArray(((Match) it.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resolve$lambda$16$lambda$15(List list, int i10, List indices) {
        Intrinsics.checkNotNullParameter(indices, "indices");
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
        ((List) list.get(i10)).add(new Match(new IntRange(iIntValue, iIntValue3), indices));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resolve$lambda$16$lambda$7(String[] strArr, List list, int i10, int i11, int i12, List resultColumnsSublist) {
        Object next;
        Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it = resultColumnsSublist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(str, ((ResultColumn) next).getName())) {
                    break;
                }
            }
            ResultColumn resultColumn = (ResultColumn) next;
            if (resultColumn == null) {
                return Unit.INSTANCE;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        ((List) list.get(i10)).add(new Match(new IntRange(i11, i12 - 1), arrayList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    public static final Unit resolve$lambda$19(Ref.ObjectRef objectRef, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ?? Build = Solution.INSTANCE.build(it);
        if (Build.compareTo((Solution) objectRef.element) < 0) {
            objectRef.element = Build;
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final int[][] resolve(List<String> resultColumns, String[][] mappings) {
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        return resolve((String[]) resultColumns.toArray(new String[0]), mappings);
    }
}
