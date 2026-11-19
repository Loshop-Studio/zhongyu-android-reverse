package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8875t;
import p135i8.InterfaceC8869r;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10576r;

/* loaded from: classes3.dex */
public final class UnbatchedFlowCombiner<T1, T2> {
    private final InterfaceC8869r initialDispatched;
    private final InterfaceC9942a lock;
    private final InterfaceC10576r send;
    private final InterfaceC8869r[] valueReceived;
    private final Object[] values;

    @InterfaceC9539d(m17800c = "androidx.paging.UnbatchedFlowCombiner", m17801f = "FlowExt.kt", m17802l = {190, 230, 207}, m17803m = "onNext")
    /* renamed from: androidx.paging.UnbatchedFlowCombiner$onNext$1 */
    public static final class C43921 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UnbatchedFlowCombiner<T1, T2> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43921(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, InterfaceC9324c<? super C43921> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = unbatchedFlowCombiner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onNext(0, null, this);
        }
    }

    public UnbatchedFlowCombiner(InterfaceC10576r send) {
        AbstractC9133u.m16133g(send, "send");
        this.send = send;
        this.initialDispatched = AbstractC8875t.m14913b(null, 1, null);
        this.lock = AbstractC9943b.m18571b(false, 1, null);
        InterfaceC8869r[] interfaceC8869rArr = new InterfaceC8869r[2];
        for (int i10 = 0; i10 < 2; i10++) {
            interfaceC8869rArr[i10] = AbstractC8875t.m14913b(null, 1, null);
        }
        this.valueReceived = interfaceC8869rArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = FlowExtKt.NULL;
        }
        this.values = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r2.mo14833u(r3) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00ac, B:36:0x00b3, B:43:0x00c4, B:45:0x00cc, B:48:0x00d6, B:50:0x00db, B:54:0x00e5, B:52:0x00e0, B:53:0x00e3, B:39:0x00bd), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00ac, B:36:0x00b3, B:43:0x00c4, B:45:0x00cc, B:48:0x00d6, B:50:0x00db, B:54:0x00e5, B:52:0x00e0, B:53:0x00e3, B:39:0x00bd), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:34:0x00ac, B:36:0x00b3, B:43:0x00c4, B:45:0x00cc, B:48:0x00d6, B:50:0x00db, B:54:0x00e5, B:52:0x00e0, B:53:0x00e3, B:39:0x00bd), top: B:64:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNext(int r17, java.lang.Object r18, p179m7.InterfaceC9324c<? super p123h7.C8736p> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.onNext(int, java.lang.Object, m7.c):java.lang.Object");
    }
}
