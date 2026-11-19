package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p310qd.AbstractC10812s;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class PageEvent<T> {

    public static final class Drop<T> extends PageEvent<T> {
        private final LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        public static final /* synthetic */ class WhenMappings {
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
            AbstractC9979u.m20294g(loadType, "loadType");
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
            AbstractC9979u.m20294g(loadType, "loadType");
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
            return AbstractC10812s.m23223p("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.minPageOffset + "\n                    |   maxPageOffset: " + this.maxPageOffset + "\n                    |   placeholdersRemaining: " + this.placeholdersRemaining + "\n                    |)", null, 1, null);
        }
    }

    public static final class Insert<T> extends PageEvent<T> {
        public static final Companion Companion = new Companion(null);
        private final LoadType loadType;
        private final LoadStates mediatorLoadStates;
        private final List<TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final LoadStates sourceLoadStates;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
                AbstractC9979u.m20294g(pages, "pages");
                AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.APPEND, pages, -1, i10, sourceLoadStates, loadStates, null);
            }

            public final <T> Insert<T> Prepend(List<TransformablePage<T>> pages, int i10, LoadStates sourceLoadStates, LoadStates loadStates) {
                AbstractC9979u.m20294g(pages, "pages");
                AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.PREPEND, pages, i10, -1, sourceLoadStates, loadStates, null);
            }

            public final <T> Insert<T> Refresh(List<TransformablePage<T>> pages, int i10, int i11, LoadStates sourceLoadStates, LoadStates loadStates) {
                AbstractC9979u.m20294g(pages, "pages");
                AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.REFRESH, pages, i10, i11, sourceLoadStates, loadStates, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2, AbstractC9972n abstractC9972n) {
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

        private final <R> Insert<R> mapPages(InterfaceC9540l interfaceC9540l) {
            LoadType loadType = getLoadType();
            List<TransformablePage<T>> pages = getPages();
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC9540l.invoke(it.next()));
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
            AbstractC9979u.m20294g(loadType, "loadType");
            AbstractC9979u.m20294g(pages, "pages");
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
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
            return this.loadType == insert.loadType && AbstractC9979u.m20289b(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && AbstractC9979u.m20289b(this.sourceLoadStates, insert.sourceLoadStates) && AbstractC9979u.m20289b(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009e -> B:18:0x00bf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f4 -> B:27:0x0105). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object filter(p181hd.InterfaceC9544p r19, vc.InterfaceC11588c<? super androidx.paging.PageEvent<T>> r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.filter(hd.p, vc.c):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x012a A[LOOP:0: B:30:0x0120->B:32:0x012a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a4 -> B:18:0x00c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ff -> B:27:0x010b). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object flatMap(p181hd.InterfaceC9544p r18, vc.InterfaceC11588c<? super androidx.paging.PageEvent<R>> r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.flatMap(hd.p, vc.c):java.lang.Object");
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
        /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0091 -> B:18:0x00b4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00de -> B:24:0x00e6). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object map(p181hd.InterfaceC9544p r18, vc.InterfaceC11588c<? super androidx.paging.PageEvent<R>> r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.map(hd.p, vc.c):java.lang.Object");
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
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PageEvent.Insert for ");
            sb2.append(this.loadType);
            sb2.append(", with ");
            sb2.append(size);
            sb2.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) AbstractC10947g0.m23946o0(this.pages);
            sb2.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : AbstractC10947g0.m23946o0(data2));
            sb2.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) AbstractC10947g0.m23957z0(this.pages);
            sb2.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : AbstractC10947g0.m23957z0(data));
            sb2.append("\n                    |   placeholdersBefore: ");
            sb2.append(strValueOf);
            sb2.append("\n                    |   placeholdersAfter: ");
            sb2.append(strValueOf2);
            sb2.append("\n                    |   sourceLoadStates: ");
            sb2.append(this.sourceLoadStates);
            sb2.append("\n                    ");
            String string = sb2.toString();
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return AbstractC10812s.m23223p(string + "|)", null, 1, null);
        }

        public final <R> Insert<R> transformPages$paging_common(InterfaceC9540l transform) {
            AbstractC9979u.m20294g(transform, "transform");
            return new Insert<>(getLoadType(), (List) transform.invoke(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
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
            if (loadType == LoadType.PREPEND || i11 >= 0) {
                if (loadType == LoadType.REFRESH && list.isEmpty()) {
                    throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                }
            } else {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i11).toString());
            }
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2, int i12, AbstractC9972n abstractC9972n) {
            this(loadType, list, i10, i11, loadStates, (i12 & 32) != 0 ? null : loadStates2);
        }
    }

    public static final class LoadStateUpdate<T> extends PageEvent<T> {
        private final LoadStates mediator;
        private final LoadStates source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(LoadStates source, LoadStates loadStates) {
            super(null);
            AbstractC9979u.m20294g(source, "source");
            this.source = source;
            this.mediator = loadStates;
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
            AbstractC9979u.m20294g(source, "source");
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
            return AbstractC9979u.m20289b(this.source, loadStateUpdate.source) && AbstractC9979u.m20289b(this.mediator, loadStateUpdate.mediator);
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
            return AbstractC10812s.m23223p(str + "|)", null, 1, null);
        }

        public /* synthetic */ LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2, int i10, AbstractC9972n abstractC9972n) {
            this(loadStates, (i10 & 2) != 0 ? null : loadStates2);
        }
    }

    public /* synthetic */ PageEvent(AbstractC9972n abstractC9972n) {
        this();
    }

    public static /* synthetic */ <T, R> Object flatMap$suspendImpl(PageEvent<T> pageEvent, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PageEvent<R>> interfaceC11588c) {
        AbstractC9979u.m20292e(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.flatMap>");
        return pageEvent;
    }

    public static /* synthetic */ <T, R> Object map$suspendImpl(PageEvent<T> pageEvent, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PageEvent<R>> interfaceC11588c) {
        AbstractC9979u.m20292e(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return pageEvent;
    }

    public Object filter(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PageEvent<T>> interfaceC11588c) {
        return filter$suspendImpl(this, interfaceC9544p, interfaceC11588c);
    }

    public <R> Object flatMap(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PageEvent<R>> interfaceC11588c) {
        return flatMap$suspendImpl(this, interfaceC9544p, interfaceC11588c);
    }

    public <R> Object map(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PageEvent<R>> interfaceC11588c) {
        return map$suspendImpl(this, interfaceC9544p, interfaceC11588c);
    }

    private PageEvent() {
    }

    public static final class StaticList<T> extends PageEvent<T> {
        private final List<T> data;
        private final LoadStates mediatorLoadStates;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final LoadStates sourceLoadStates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StaticList(List<? extends T> data, LoadStates loadStates, LoadStates loadStates2, int i10, int i11) {
            super(null);
            AbstractC9979u.m20294g(data, "data");
            this.data = data;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            this.placeholdersBefore = i10;
            this.placeholdersAfter = i11;
        }

        public static /* synthetic */ StaticList copy$default(StaticList staticList, List list, LoadStates loadStates, LoadStates loadStates2, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = staticList.data;
            }
            if ((i12 & 2) != 0) {
                loadStates = staticList.sourceLoadStates;
            }
            if ((i12 & 4) != 0) {
                loadStates2 = staticList.mediatorLoadStates;
            }
            if ((i12 & 8) != 0) {
                i10 = staticList.placeholdersBefore;
            }
            if ((i12 & 16) != 0) {
                i11 = staticList.placeholdersAfter;
            }
            int i13 = i11;
            LoadStates loadStates3 = loadStates2;
            return staticList.copy(list, loadStates, loadStates3, i10, i13);
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

        public final int component4() {
            return this.placeholdersBefore;
        }

        public final int component5() {
            return this.placeholdersAfter;
        }

        public final StaticList<T> copy(List<? extends T> data, LoadStates loadStates, LoadStates loadStates2, int i10, int i11) {
            AbstractC9979u.m20294g(data, "data");
            return new StaticList<>(data, loadStates, loadStates2, i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticList)) {
                return false;
            }
            StaticList staticList = (StaticList) obj;
            return AbstractC9979u.m20289b(this.data, staticList.data) && AbstractC9979u.m20289b(this.sourceLoadStates, staticList.sourceLoadStates) && AbstractC9979u.m20289b(this.mediatorLoadStates, staticList.mediatorLoadStates) && this.placeholdersBefore == staticList.placeholdersBefore && this.placeholdersAfter == staticList.placeholdersAfter;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006c -> B:21:0x0070). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object filter(p181hd.InterfaceC9544p r14, vc.InterfaceC11588c<? super androidx.paging.PageEvent<T>> r15) throws java.lang.Throwable {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.paging.PageEvent$StaticList$filter$1
                if (r0 == 0) goto L13
                r0 = r15
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
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3f
                if (r2 != r3) goto L37
                java.lang.Object r14 = r0.L$3
                java.lang.Object r2 = r0.L$2
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.L$1
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.L$0
                hd.p r5 = (p181hd.InterfaceC9544p) r5
                kotlin.AbstractC9924b.m20071b(r15)
                goto L70
            L37:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L3f:
                kotlin.AbstractC9924b.m20071b(r15)
                java.util.List<T> r15 = r13.data
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r15 = r15.iterator()
                r4 = r2
                r2 = r15
            L51:
                boolean r15 = r2.hasNext()
                if (r15 == 0) goto L7d
                java.lang.Object r15 = r2.next()
                r0.L$0 = r14
                r0.L$1 = r4
                r0.L$2 = r2
                r0.L$3 = r15
                r0.label = r3
                java.lang.Object r5 = r14.invoke(r15, r0)
                if (r5 != r1) goto L6c
                return r1
            L6c:
                r12 = r5
                r5 = r14
                r14 = r15
                r15 = r12
            L70:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L7b
                r4.add(r14)
            L7b:
                r14 = r5
                goto L51
            L7d:
                r7 = r4
                java.util.List r7 = (java.util.List) r7
                androidx.paging.LoadStates r8 = r13.sourceLoadStates
                androidx.paging.LoadStates r9 = r13.mediatorLoadStates
                int r10 = r13.placeholdersBefore
                int r11 = r13.placeholdersAfter
                androidx.paging.PageEvent$StaticList r6 = new androidx.paging.PageEvent$StaticList
                r6.<init>(r7, r8, r9, r10, r11)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.filter(hd.p, vc.c):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:21:0x006c). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object flatMap(p181hd.InterfaceC9544p r13, vc.InterfaceC11588c<? super androidx.paging.PageEvent<R>> r14) throws java.lang.Throwable {
            /*
                r12 = this;
                boolean r0 = r14 instanceof androidx.paging.PageEvent$StaticList$flatMap$1
                if (r0 == 0) goto L13
                r0 = r14
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
                r0.<init>(r12, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3d
                if (r2 != r3) goto L35
                java.lang.Object r13 = r0.L$2
                java.util.Iterator r13 = (java.util.Iterator) r13
                java.lang.Object r2 = r0.L$1
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r0.L$0
                hd.p r4 = (p181hd.InterfaceC9544p) r4
                kotlin.AbstractC9924b.m20071b(r14)
                goto L6c
            L35:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L3d:
                kotlin.AbstractC9924b.m20071b(r14)
                java.util.List<T> r14 = r12.data
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r14 = r14.iterator()
                r11 = r14
                r14 = r13
                r13 = r11
            L50:
                boolean r4 = r13.hasNext()
                if (r4 == 0) goto L73
                java.lang.Object r4 = r13.next()
                r0.L$0 = r14
                r0.L$1 = r2
                r0.L$2 = r13
                r0.label = r3
                java.lang.Object r4 = r14.invoke(r4, r0)
                if (r4 != r1) goto L69
                return r1
            L69:
                r11 = r4
                r4 = r14
                r14 = r11
            L6c:
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                p325rc.AbstractC10937b0.m23857B(r2, r14)
                r14 = r4
                goto L50
            L73:
                r6 = r2
                java.util.List r6 = (java.util.List) r6
                androidx.paging.LoadStates r7 = r12.sourceLoadStates
                androidx.paging.LoadStates r8 = r12.mediatorLoadStates
                int r9 = r12.placeholdersBefore
                int r10 = r12.placeholdersAfter
                androidx.paging.PageEvent$StaticList r5 = new androidx.paging.PageEvent$StaticList
                r5.<init>(r6, r7, r8, r9, r10)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.flatMap(hd.p, vc.c):java.lang.Object");
        }

        public final List<T> getData() {
            return this.data;
        }

        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
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
            int iHashCode = this.data.hashCode() * 31;
            LoadStates loadStates = this.sourceLoadStates;
            int iHashCode2 = (iHashCode + (loadStates == null ? 0 : loadStates.hashCode())) * 31;
            LoadStates loadStates2 = this.mediatorLoadStates;
            return ((((iHashCode2 + (loadStates2 != null ? loadStates2.hashCode() : 0)) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:21:0x0079). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object map(p181hd.InterfaceC9544p r14, vc.InterfaceC11588c<? super androidx.paging.PageEvent<R>> r15) throws java.lang.Throwable {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.paging.PageEvent$StaticList$map$1
                if (r0 == 0) goto L13
                r0 = r15
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
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L41
                if (r2 != r3) goto L39
                java.lang.Object r14 = r0.L$3
                java.util.Collection r14 = (java.util.Collection) r14
                java.lang.Object r2 = r0.L$2
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.L$1
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.L$0
                hd.p r5 = (p181hd.InterfaceC9544p) r5
                kotlin.AbstractC9924b.m20071b(r15)
                goto L79
            L39:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L41:
                kotlin.AbstractC9924b.m20071b(r15)
                java.util.List<T> r15 = r13.data
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = p325rc.AbstractC10980x.m24153x(r15, r4)
                r2.<init>(r4)
                java.util.Iterator r15 = r15.iterator()
                r12 = r15
                r15 = r14
                r14 = r2
                r2 = r12
            L5b:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L7f
                java.lang.Object r4 = r2.next()
                r0.L$0 = r15
                r0.L$1 = r14
                r0.L$2 = r2
                r0.L$3 = r14
                r0.label = r3
                java.lang.Object r4 = r15.invoke(r4, r0)
                if (r4 != r1) goto L76
                return r1
            L76:
                r5 = r15
                r15 = r4
                r4 = r14
            L79:
                r14.add(r15)
                r14 = r4
                r15 = r5
                goto L5b
            L7f:
                r7 = r14
                java.util.List r7 = (java.util.List) r7
                androidx.paging.LoadStates r8 = r13.sourceLoadStates
                androidx.paging.LoadStates r9 = r13.mediatorLoadStates
                int r10 = r13.placeholdersBefore
                int r11 = r13.placeholdersAfter
                androidx.paging.PageEvent$StaticList r6 = new androidx.paging.PageEvent$StaticList
                r6.<init>(r7, r8, r9, r10, r11)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.map(hd.p, vc.c):java.lang.Object");
        }

        public String toString() {
            LoadStates loadStates = this.mediatorLoadStates;
            String str = "PageEvent.StaticList with " + this.data.size() + " items (\n                    |   first item: " + AbstractC10947g0.m23946o0(this.data) + "\n                    |   last item: " + AbstractC10947g0.m23957z0(this.data) + "\n                    |   sourceLoadStates: " + this.sourceLoadStates + ",\n                    |   placeholdersBefore: " + this.placeholdersBefore + ",\n                    |   placeholdersAfter: " + this.placeholdersAfter + ",\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return AbstractC10812s.m23223p(str + "|)", null, 1, null);
        }

        public /* synthetic */ StaticList(List list, LoadStates loadStates, LoadStates loadStates2, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
            this(list, (i12 & 2) != 0 ? null : loadStates, (i12 & 4) != 0 ? null : loadStates2, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
        }
    }

    public static /* synthetic */ <T> Object filter$suspendImpl(PageEvent<T> pageEvent, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PageEvent<T>> interfaceC11588c) {
        return pageEvent;
    }
}
