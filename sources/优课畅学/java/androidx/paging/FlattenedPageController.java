package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;

/* loaded from: classes3.dex */
final class FlattenedPageController<T> {
    private final FlattenedPageEventStorage<T> list = new FlattenedPageEventStorage<>();
    private final InterfaceC9942a lock = AbstractC9943b.m18571b(false, 1, null);
    private int maxEventIndex = -1;

    @InterfaceC9539d(m17800c = "androidx.paging.FlattenedPageController", m17801f = "CachedPageEventFlow.kt", m17802l = {287}, m17803m = "getStateAsEvents")
    /* renamed from: androidx.paging.FlattenedPageController$getStateAsEvents$1 */
    public static final class C42971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlattenedPageController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42971(FlattenedPageController<T> flattenedPageController, InterfaceC9324c<? super C42971> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = flattenedPageController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getStateAsEvents(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlattenedPageController", m17801f = "CachedPageEventFlow.kt", m17802l = {287}, m17803m = "record")
    /* renamed from: androidx.paging.FlattenedPageController$record$1 */
    public static final class C42981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlattenedPageController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42981(FlattenedPageController<T> flattenedPageController, InterfaceC9324c<? super C42981> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = flattenedPageController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.record(null, this);
        }
    }

    public final PageEvent.Insert<T> getCachedEvent() {
        PageEvent pageEvent = (PageEvent) AbstractC8778f0.m14568n0(this.list.getAsEvents());
        if (pageEvent != null && (pageEvent instanceof PageEvent.Insert)) {
            PageEvent.Insert<T> insert = (PageEvent.Insert) pageEvent;
            if (insert.getLoadType() == LoadType.REFRESH) {
                return insert;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getStateAsEvents(p179m7.InterfaceC9324c<? super java.util.List<? extends p134i7.C8786j0>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.FlattenedPageController.C42971
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController.C42971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = new androidx.paging.FlattenedPageController$getStateAsEvents$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            r8.a r1 = (p235r8.InterfaceC9942a) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.AbstractC9079b.m15926b(r9)
            goto L4e
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            kotlin.AbstractC9079b.m15926b(r9)
            r8.a r9 = r8.lock
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r8
            r1 = r9
        L4e:
            androidx.paging.FlattenedPageEventStorage<T> r9 = r0.list     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r9.getAsEvents()     // Catch: java.lang.Throwable -> L7e
            int r0 = r0.maxEventIndex     // Catch: java.lang.Throwable -> L7e
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 - r2
            int r0 = r0 + r3
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7e
            r3 = 10
            int r3 = p134i7.AbstractC8811w.m14786x(r9, r3)     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L7e
            r3 = 0
        L6c:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L7e
            int r6 = r3 + 1
            if (r3 >= 0) goto L80
            p134i7.AbstractC8809v.m14780w()     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r9 = move-exception
            goto L91
        L80:
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5     // Catch: java.lang.Throwable -> L7e
            i7.j0 r7 = new i7.j0     // Catch: java.lang.Throwable -> L7e
            int r3 = r3 + r0
            r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L7e
            r2.add(r7)     // Catch: java.lang.Throwable -> L7e
            r3 = r6
            goto L6c
        L8d:
            r1.unlock(r4)
            return r2
        L91:
            r1.unlock(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.getStateAsEvents(m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object record(p134i7.C8786j0 r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.FlattenedPageController.C42981
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController.C42981) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            r8.a r6 = (p235r8.InterfaceC9942a) r6
            java.lang.Object r1 = r0.L$1
            i7.j0 r1 = (p134i7.C8786j0) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.AbstractC9079b.m15926b(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.AbstractC9079b.m15926b(r7)
            r8.a r7 = r5.lock
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            int r1 = r6.m14584a()     // Catch: java.lang.Throwable -> L6e
            r0.maxEventIndex = r1     // Catch: java.lang.Throwable -> L6e
            androidx.paging.FlattenedPageEventStorage<T> r0 = r0.list     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.m14585b()     // Catch: java.lang.Throwable -> L6e
            androidx.paging.PageEvent r6 = (androidx.paging.PageEvent) r6     // Catch: java.lang.Throwable -> L6e
            r0.add(r6)     // Catch: java.lang.Throwable -> L6e
            h7.p r6 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L6e
            r7.unlock(r4)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L6e:
            r6 = move-exception
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.record(i7.j0, m7.c):java.lang.Object");
    }
}
