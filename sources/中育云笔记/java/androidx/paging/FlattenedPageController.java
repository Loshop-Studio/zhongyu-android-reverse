package androidx.paging;

import androidx.paging.PageEvent;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p325rc.AbstractC10947g0;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final class FlattenedPageController<T> {
    private final FlattenedPageEventStorage<T> list = new FlattenedPageEventStorage<>();
    private final InterfaceC5189a lock = AbstractC5194f.m2745b(false, 1, null);
    private int maxEventIndex = -1;

    @InterfaceC11829d(m26210c = "androidx.paging.FlattenedPageController", m26211f = "CachedPageEventFlow.kt", m26212l = {274}, m26213m = "getStateAsEvents", m26214v = 1)
    /* renamed from: androidx.paging.FlattenedPageController$getStateAsEvents$1 */
    public static final class C42211 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlattenedPageController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42211(FlattenedPageController<T> flattenedPageController, InterfaceC11588c<? super C42211> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = flattenedPageController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getStateAsEvents(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlattenedPageController", m26211f = "CachedPageEventFlow.kt", m26212l = {274}, m26213m = "record", m26214v = 1)
    /* renamed from: androidx.paging.FlattenedPageController$record$1 */
    public static final class C42221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlattenedPageController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42221(FlattenedPageController<T> flattenedPageController, InterfaceC11588c<? super C42221> interfaceC11588c) {
            super(interfaceC11588c);
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
        PageEvent pageEvent = (PageEvent) AbstractC10947g0.m23946o0(this.list.getAsEvents());
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
    public final java.lang.Object getStateAsEvents(vc.InterfaceC11588c<? super java.util.List<? extends p325rc.C10955k0>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.FlattenedPageController.C42211
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController.C42211) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            be.a r0 = (be.InterfaceC5189a) r0
            kotlin.AbstractC9924b.m20071b(r9)
            goto L47
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            kotlin.AbstractC9924b.m20071b(r9)
            be.a r9 = r8.lock
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r9
        L47:
            androidx.paging.FlattenedPageEventStorage<T> r9 = r8.list     // Catch: java.lang.Throwable -> L79
            java.util.List r9 = r9.getAsEvents()     // Catch: java.lang.Throwable -> L79
            int r1 = r8.maxEventIndex     // Catch: java.lang.Throwable -> L79
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L79
            int r1 = r1 - r2
            int r1 = r1 + r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L79
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L79
            r3 = 10
            int r3 = p325rc.AbstractC10980x.m24153x(r9, r3)     // Catch: java.lang.Throwable -> L79
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L79
            r3 = 0
        L67:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L88
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L79
            int r6 = r3 + 1
            if (r3 >= 0) goto L7b
            p325rc.AbstractC10978w.m24145w()     // Catch: java.lang.Throwable -> L79
            goto L7b
        L79:
            r9 = move-exception
            goto L8c
        L7b:
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5     // Catch: java.lang.Throwable -> L79
            rc.k0 r7 = new rc.k0     // Catch: java.lang.Throwable -> L79
            int r3 = r3 + r1
            r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L79
            r2.add(r7)     // Catch: java.lang.Throwable -> L79
            r3 = r6
            goto L67
        L88:
            r0.unlock(r4)
            return r2
        L8c:
            r0.unlock(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.getStateAsEvents(vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object record(p325rc.C10955k0 r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.FlattenedPageController.C42221
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController.C42221) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            be.a r6 = (be.InterfaceC5189a) r6
            java.lang.Object r0 = r0.L$0
            rc.k0 r0 = (p325rc.C10955k0) r0
            kotlin.AbstractC9924b.m20071b(r7)
            r7 = r6
            r6 = r0
            goto L4e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.AbstractC9924b.m20071b(r7)
            be.a r7 = r5.lock
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            int r0 = r6.m23962a()     // Catch: java.lang.Throwable -> L67
            r5.maxEventIndex = r0     // Catch: java.lang.Throwable -> L67
            androidx.paging.FlattenedPageEventStorage<T> r0 = r5.list     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r6.m23963b()     // Catch: java.lang.Throwable -> L67
            androidx.paging.PageEvent r6 = (androidx.paging.PageEvent) r6     // Catch: java.lang.Throwable -> L67
            r0.add(r6)     // Catch: java.lang.Throwable -> L67
            qc.q r6 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L67
            r7.unlock(r4)
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L67:
            r6 = move-exception
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.record(rc.k0, vc.c):java.lang.Object");
    }
}
