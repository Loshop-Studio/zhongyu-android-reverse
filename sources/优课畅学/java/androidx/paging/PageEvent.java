package androidx.paging;

import androidx.paging.LoadState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8811w;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public abstract class PageEvent<T> {

    public static final class Drop<T> extends PageEvent<T> {
        private final LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drop(LoadType loadType, int i10, int i11, int i12) {
            super(null);
            AbstractC9133u.m16133g(loadType, "loadType");
            this.loadType = loadType;
            this.minPageOffset = i10;
            this.maxPageOffset = i11;
            this.placeholdersRemaining = i12;
            if (loadType == LoadType.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (getPageCount() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + getPageCount()).toString());
            }
            if (i12 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i12).toString());
        }

        public static /* synthetic */ Drop copy$default(Drop drop, LoadType loadType, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                loadType = drop.loadType;
            }
            if ((i13 & 2) != 0) {
                i10 = drop.minPageOffset;
            }
            if ((i13 & 4) != 0) {
                i11 = drop.maxPageOffset;
            }
            if ((i13 & 8) != 0) {
                i12 = drop.placeholdersRemaining;
            }
            return drop.copy(loadType, i10, i11, i12);
        }

        public final LoadType component1() {
            return this.loadType;
        }

        public final int component2() {
            return this.minPageOffset;
        }

        public final int component3() {
            return this.maxPageOffset;
        }

        public final int component4() {
            return this.placeholdersRemaining;
        }

        public final Drop<T> copy(LoadType loadType, int i10, int i11, int i12) {
            AbstractC9133u.m16133g(loadType, "loadType");
            return new Drop<>(loadType, i10, i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) obj;
            return this.loadType == drop.loadType && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public final int getPageCount() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public int hashCode() {
            return (((((this.loadType.hashCode() * 31) + Integer.hashCode(this.minPageOffset)) * 31) + Integer.hashCode(this.maxPageOffset)) * 31) + Integer.hashCode(this.placeholdersRemaining);
        }

        public String toString() {
            String str;
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.loadType.ordinal()];
            if (i10 == 1) {
                str = "end";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return AbstractC8680s.m14088p("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.minPageOffset + "\n                    |   maxPageOffset: " + this.maxPageOffset + "\n                    |   placeholdersRemaining: " + this.placeholdersRemaining + "\n                    |)", null, 1, null);
        }
    }

    public static final class Insert<T> extends PageEvent<T> {
        public static final Companion Companion;
        private static final Insert<Object> EMPTY_REFRESH_LOCAL;
        private final LoadType loadType;
        private final LoadStates mediatorLoadStates;
        private final List<TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final LoadStates sourceLoadStates;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            public static /* synthetic */ Insert Append$default(Companion companion, List list, int i10, LoadStates loadStates, LoadStates loadStates2, int i11, Object obj) {
                if ((i11 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Append(list, i10, loadStates, loadStates2);
            }

            public static /* synthetic */ Insert Prepend$default(Companion companion, List list, int i10, LoadStates loadStates, LoadStates loadStates2, int i11, Object obj) {
                if ((i11 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Prepend(list, i10, loadStates, loadStates2);
            }

            public static /* synthetic */ Insert Refresh$default(Companion companion, List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2, int i12, Object obj) {
                if ((i12 & 16) != 0) {
                    loadStates2 = null;
                }
                return companion.Refresh(list, i10, i11, loadStates, loadStates2);
            }

            public final <T> Insert<T> Append(List<TransformablePage<T>> pages, int i10, LoadStates sourceLoadStates, LoadStates loadStates) {
                AbstractC9133u.m16133g(pages, "pages");
                AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.APPEND, pages, -1, i10, sourceLoadStates, loadStates, null);
            }

            public final <T> Insert<T> Prepend(List<TransformablePage<T>> pages, int i10, LoadStates sourceLoadStates, LoadStates loadStates) {
                AbstractC9133u.m16133g(pages, "pages");
                AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.PREPEND, pages, i10, -1, sourceLoadStates, loadStates, null);
            }

            public final <T> Insert<T> Refresh(List<TransformablePage<T>> pages, int i10, int i11, LoadStates sourceLoadStates, LoadStates loadStates) {
                AbstractC9133u.m16133g(pages, "pages");
                AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.REFRESH, pages, i10, i11, sourceLoadStates, loadStates, null);
            }

            public final Insert<Object> getEMPTY_REFRESH_LOCAL() {
                return Insert.EMPTY_REFRESH_LOCAL;
            }

            private Companion() {
            }
        }

        static {
            Companion companion = new Companion(null);
            Companion = companion;
            List listM14755e = AbstractC8807u.m14755e(TransformablePage.Companion.getEMPTY_INITIAL_PAGE());
            LoadState.NotLoading.Companion companion2 = LoadState.NotLoading.Companion;
            EMPTY_REFRESH_LOCAL = Companion.Refresh$default(companion, listM14755e, 0, 0, new LoadStates(companion2.getIncomplete$paging_common_release(), companion2.getComplete$paging_common_release(), companion2.getComplete$paging_common_release()), null, 16, null);
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2, AbstractC9126n abstractC9126n) {
            this(loadType, list, i10, i11, loadStates, loadStates2);
        }

        public static /* synthetic */ Insert copy$default(Insert insert, LoadType loadType, List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                loadType = insert.loadType;
            }
            if ((i12 & 2) != 0) {
                list = insert.pages;
            }
            if ((i12 & 4) != 0) {
                i10 = insert.placeholdersBefore;
            }
            if ((i12 & 8) != 0) {
                i11 = insert.placeholdersAfter;
            }
            if ((i12 & 16) != 0) {
                loadStates = insert.sourceLoadStates;
            }
            if ((i12 & 32) != 0) {
                loadStates2 = insert.mediatorLoadStates;
            }
            LoadStates loadStates3 = loadStates;
            LoadStates loadStates4 = loadStates2;
            return insert.copy(loadType, list, i10, i11, loadStates3, loadStates4);
        }

        private final <R> Insert<R> mapPages(InterfaceC10570l interfaceC10570l) {
            LoadType loadType = getLoadType();
            List<TransformablePage<T>> pages = getPages();
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC10570l.invoke(it.next()));
            }
            return new Insert<>(loadType, arrayList, getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }

        public final LoadType component1() {
            return this.loadType;
        }

        public final List<TransformablePage<T>> component2() {
            return this.pages;
        }

        public final int component3() {
            return this.placeholdersBefore;
        }

        public final int component4() {
            return this.placeholdersAfter;
        }

        public final LoadStates component5() {
            return this.sourceLoadStates;
        }

        public final LoadStates component6() {
            return this.mediatorLoadStates;
        }

        public final Insert<T> copy(LoadType loadType, List<TransformablePage<T>> pages, int i10, int i11, LoadStates sourceLoadStates, LoadStates loadStates) {
            AbstractC9133u.m16133g(loadType, "loadType");
            AbstractC9133u.m16133g(pages, "pages");
            AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
            return new Insert<>(loadType, pages, i10, i11, sourceLoadStates, loadStates);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.loadType == insert.loadType && AbstractC9133u.m16128b(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && AbstractC9133u.m16128b(this.sourceLoadStates, insert.sourceLoadStates) && AbstractC9133u.m16128b(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009c -> B:18:0x00bb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f0 -> B:27:0x0101). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object filter(p300x7.InterfaceC10574p r19, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<T>> r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.filter(x7.p, m7.c):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011a A[LOOP:0: B:30:0x0110->B:32:0x011a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a0 -> B:18:0x00bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f1 -> B:27:0x00fb). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object flatMap(p300x7.InterfaceC10574p r18, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<R>> r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.flatMap(x7.p, m7.c):java.lang.Object");
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final List<TransformablePage<T>> getPages() {
            return this.pages;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.loadType.hashCode() * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter)) * 31) + this.sourceLoadStates.hashCode()) * 31;
            LoadStates loadStates = this.mediatorLoadStates;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008f -> B:18:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00da -> B:24:0x00e2). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object map(p300x7.InterfaceC10574p r18, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<R>> r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.map(x7.p, m7.c):java.lang.Object");
        }

        public String toString() {
            List<T> data;
            List<T> data2;
            Iterator<T> it = this.pages.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((TransformablePage) it.next()).getData().size();
            }
            int i10 = this.placeholdersBefore;
            String strValueOf = i10 != -1 ? String.valueOf(i10) : "none";
            int i11 = this.placeholdersAfter;
            String strValueOf2 = i11 != -1 ? String.valueOf(i11) : "none";
            LoadStates loadStates = this.mediatorLoadStates;
            StringBuilder sb = new StringBuilder();
            sb.append("PageEvent.Insert for ");
            sb.append(this.loadType);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) AbstractC8778f0.m14568n0(this.pages);
            sb.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : AbstractC8778f0.m14568n0(data2));
            sb.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) AbstractC8778f0.m14579y0(this.pages);
            sb.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : AbstractC8778f0.m14579y0(data));
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.sourceLoadStates);
            sb.append("\n                    ");
            String string = sb.toString();
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return AbstractC8680s.m14088p(string + "|)", null, 1, null);
        }

        public final <R> Insert<R> transformPages$paging_common_release(InterfaceC10570l transform) {
            AbstractC9133u.m16133g(transform, "transform");
            return new Insert<>(getLoadType(), (List) transform.invoke(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2, int i12, AbstractC9126n abstractC9126n) {
            this(loadType, list, i10, i11, loadStates, (i12 & 32) != 0 ? null : loadStates2);
        }

        private Insert(LoadType loadType, List<TransformablePage<T>> list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i10;
            this.placeholdersAfter = i11;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            if (loadType != LoadType.APPEND && i10 < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i10).toString());
            }
            if (loadType != LoadType.PREPEND && i11 < 0) {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i11).toString());
            }
            if (loadType == LoadType.REFRESH && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }
    }

    public static final class LoadStateUpdate<T> extends PageEvent<T> {
        private final LoadStates mediator;
        private final LoadStates source;

        public /* synthetic */ LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2, int i10, AbstractC9126n abstractC9126n) {
            this(loadStates, (i10 & 2) != 0 ? null : loadStates2);
        }

        public static /* synthetic */ LoadStateUpdate copy$default(LoadStateUpdate loadStateUpdate, LoadStates loadStates, LoadStates loadStates2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                loadStates = loadStateUpdate.source;
            }
            if ((i10 & 2) != 0) {
                loadStates2 = loadStateUpdate.mediator;
            }
            return loadStateUpdate.copy(loadStates, loadStates2);
        }

        public final LoadStates component1() {
            return this.source;
        }

        public final LoadStates component2() {
            return this.mediator;
        }

        public final LoadStateUpdate<T> copy(LoadStates source, LoadStates loadStates) {
            AbstractC9133u.m16133g(source, "source");
            return new LoadStateUpdate<>(source, loadStates);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) obj;
            return AbstractC9133u.m16128b(this.source, loadStateUpdate.source) && AbstractC9133u.m16128b(this.mediator, loadStateUpdate.mediator);
        }

        public final LoadStates getMediator() {
            return this.mediator;
        }

        public final LoadStates getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            LoadStates loadStates = this.mediator;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public String toString() {
            LoadStates loadStates = this.mediator;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.source + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return AbstractC8680s.m14088p(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(LoadStates source, LoadStates loadStates) {
            super(null);
            AbstractC9133u.m16133g(source, "source");
            this.source = source;
            this.mediator = loadStates;
        }
    }

    public static final class StaticList<T> extends PageEvent<T> {
        private final List<T> data;
        private final LoadStates mediatorLoadStates;
        private final LoadStates sourceLoadStates;

        public /* synthetic */ StaticList(List list, LoadStates loadStates, LoadStates loadStates2, int i10, AbstractC9126n abstractC9126n) {
            this(list, (i10 & 2) != 0 ? null : loadStates, (i10 & 4) != 0 ? null : loadStates2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StaticList copy$default(StaticList staticList, List list, LoadStates loadStates, LoadStates loadStates2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = staticList.data;
            }
            if ((i10 & 2) != 0) {
                loadStates = staticList.sourceLoadStates;
            }
            if ((i10 & 4) != 0) {
                loadStates2 = staticList.mediatorLoadStates;
            }
            return staticList.copy(list, loadStates, loadStates2);
        }

        public final List<T> component1() {
            return this.data;
        }

        public final LoadStates component2() {
            return this.sourceLoadStates;
        }

        public final LoadStates component3() {
            return this.mediatorLoadStates;
        }

        public final StaticList<T> copy(List<? extends T> data, LoadStates loadStates, LoadStates loadStates2) {
            AbstractC9133u.m16133g(data, "data");
            return new StaticList<>(data, loadStates, loadStates2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticList)) {
                return false;
            }
            StaticList staticList = (StaticList) obj;
            return AbstractC9133u.m16128b(this.data, staticList.data) && AbstractC9133u.m16128b(this.sourceLoadStates, staticList.sourceLoadStates) && AbstractC9133u.m16128b(this.mediatorLoadStates, staticList.mediatorLoadStates);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:21:0x0075). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object filter(p300x7.InterfaceC10574p r9, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<T>> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof androidx.paging.PageEvent$StaticList$filter$1
                if (r0 == 0) goto L13
                r0 = r10
                androidx.paging.PageEvent$StaticList$filter$1 r0 = (androidx.paging.PageEvent$StaticList$filter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$filter$1 r0 = new androidx.paging.PageEvent$StaticList$filter$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L43
                if (r2 != r3) goto L3b
                java.lang.Object r9 = r0.L$4
                java.lang.Object r2 = r0.L$3
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.L$2
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.L$1
                x7.p r5 = (p300x7.InterfaceC10574p) r5
                java.lang.Object r6 = r0.L$0
                androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent.StaticList) r6
                kotlin.AbstractC9079b.m15926b(r10)
                goto L75
            L3b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L43:
                kotlin.AbstractC9079b.m15926b(r10)
                java.util.List<T> r10 = r8.data
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r10 = r10.iterator()
                r6 = r8
                r4 = r2
                r2 = r10
            L54:
                boolean r10 = r2.hasNext()
                if (r10 == 0) goto L82
                java.lang.Object r10 = r2.next()
                r0.L$0 = r6
                r0.L$1 = r9
                r0.L$2 = r4
                r0.L$3 = r2
                r0.L$4 = r10
                r0.label = r3
                java.lang.Object r5 = r9.invoke(r10, r0)
                if (r5 != r1) goto L71
                return r1
            L71:
                r7 = r5
                r5 = r9
                r9 = r10
                r10 = r7
            L75:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L80
                r4.add(r9)
            L80:
                r9 = r5
                goto L54
            L82:
                java.util.List r4 = (java.util.List) r4
                androidx.paging.LoadStates r9 = r6.sourceLoadStates
                androidx.paging.LoadStates r10 = r6.mediatorLoadStates
                androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
                r0.<init>(r4, r9, r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.filter(x7.p, m7.c):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:21:0x0071). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object flatMap(p300x7.InterfaceC10574p r8, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<R>> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$flatMap$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.PageEvent$StaticList$flatMap$1 r0 = (androidx.paging.PageEvent$StaticList$flatMap$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$flatMap$1 r0 = new androidx.paging.PageEvent$StaticList$flatMap$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L41
                if (r2 != r3) goto L39
                java.lang.Object r8 = r0.L$3
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$2
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r0.L$1
                x7.p r4 = (p300x7.InterfaceC10574p) r4
                java.lang.Object r5 = r0.L$0
                androidx.paging.PageEvent$StaticList r5 = (androidx.paging.PageEvent.StaticList) r5
                kotlin.AbstractC9079b.m15926b(r9)
                goto L71
            L39:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L41:
                kotlin.AbstractC9079b.m15926b(r9)
                java.util.List<T> r9 = r7.data
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r9 = r9.iterator()
                r5 = r9
                r9 = r8
                r8 = r5
                r5 = r7
            L53:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L78
                java.lang.Object r4 = r8.next()
                r0.L$0 = r5
                r0.L$1 = r9
                r0.L$2 = r2
                r0.L$3 = r8
                r0.label = r3
                java.lang.Object r4 = r9.invoke(r4, r0)
                if (r4 != r1) goto L6e
                return r1
            L6e:
                r6 = r4
                r4 = r9
                r9 = r6
            L71:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                p134i7.AbstractC8768a0.m14481C(r2, r9)
                r9 = r4
                goto L53
            L78:
                java.util.List r2 = (java.util.List) r2
                androidx.paging.LoadStates r8 = r5.sourceLoadStates
                androidx.paging.LoadStates r9 = r5.mediatorLoadStates
                androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
                r0.<init>(r2, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.flatMap(x7.p, m7.c):java.lang.Object");
        }

        public final List<T> getData() {
            return this.data;
        }

        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            LoadStates loadStates = this.sourceLoadStates;
            int iHashCode2 = (iHashCode + (loadStates == null ? 0 : loadStates.hashCode())) * 31;
            LoadStates loadStates2 = this.mediatorLoadStates;
            return iHashCode2 + (loadStates2 != null ? loadStates2.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:21:0x007e). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object map(p300x7.InterfaceC10574p r8, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<R>> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$map$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.PageEvent$StaticList$map$1 r0 = (androidx.paging.PageEvent$StaticList$map$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$map$1 r0 = new androidx.paging.PageEvent$StaticList$map$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L45
                if (r2 != r3) goto L3d
                java.lang.Object r8 = r0.L$4
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.Object r2 = r0.L$3
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.L$2
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.L$1
                x7.p r5 = (p300x7.InterfaceC10574p) r5
                java.lang.Object r6 = r0.L$0
                androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent.StaticList) r6
                kotlin.AbstractC9079b.m15926b(r9)
                goto L7e
            L3d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L45:
                kotlin.AbstractC9079b.m15926b(r9)
                java.util.List<T> r9 = r7.data
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = p134i7.AbstractC8811w.m14786x(r9, r4)
                r2.<init>(r4)
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                r6 = r7
            L5e:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L84
                java.lang.Object r4 = r2.next()
                r0.L$0 = r6
                r0.L$1 = r9
                r0.L$2 = r8
                r0.L$3 = r2
                r0.L$4 = r8
                r0.label = r3
                java.lang.Object r4 = r9.invoke(r4, r0)
                if (r4 != r1) goto L7b
                return r1
            L7b:
                r5 = r9
                r9 = r4
                r4 = r8
            L7e:
                r8.add(r9)
                r8 = r4
                r9 = r5
                goto L5e
            L84:
                java.util.List r8 = (java.util.List) r8
                androidx.paging.LoadStates r9 = r6.sourceLoadStates
                androidx.paging.LoadStates r0 = r6.mediatorLoadStates
                androidx.paging.PageEvent$StaticList r1 = new androidx.paging.PageEvent$StaticList
                r1.<init>(r8, r9, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.map(x7.p, m7.c):java.lang.Object");
        }

        public String toString() {
            LoadStates loadStates = this.mediatorLoadStates;
            String str = "PageEvent.StaticList with " + this.data.size() + " items (\n                    |   first item: " + AbstractC8778f0.m14568n0(this.data) + "\n                    |   last item: " + AbstractC8778f0.m14579y0(this.data) + "\n                    |   sourceLoadStates: " + this.sourceLoadStates + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return AbstractC8680s.m14088p(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StaticList(List<? extends T> data, LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            AbstractC9133u.m16133g(data, "data");
            this.data = data;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
        }
    }

    public /* synthetic */ PageEvent(AbstractC9126n abstractC9126n) {
        this();
    }

    public static /* synthetic */ <T, R> Object flatMap$suspendImpl(PageEvent<T> pageEvent, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PageEvent<R>> interfaceC9324c) {
        AbstractC9133u.m16131e(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.flatMap>");
        return pageEvent;
    }

    public static /* synthetic */ <T, R> Object map$suspendImpl(PageEvent<T> pageEvent, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PageEvent<R>> interfaceC9324c) {
        AbstractC9133u.m16131e(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return pageEvent;
    }

    public Object filter(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PageEvent<T>> interfaceC9324c) {
        return filter$suspendImpl(this, interfaceC10574p, interfaceC9324c);
    }

    public <R> Object flatMap(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PageEvent<R>> interfaceC9324c) {
        return flatMap$suspendImpl(this, interfaceC10574p, interfaceC9324c);
    }

    public <R> Object map(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PageEvent<R>> interfaceC9324c) {
        return map$suspendImpl(this, interfaceC10574p, interfaceC9324c);
    }

    private PageEvent() {
    }

    public static /* synthetic */ <T> Object filter$suspendImpl(PageEvent<T> pageEvent, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PageEvent<T>> interfaceC9324c) {
        return pageEvent;
    }
}
