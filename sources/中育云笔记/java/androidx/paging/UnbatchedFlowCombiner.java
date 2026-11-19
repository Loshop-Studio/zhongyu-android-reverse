package androidx.paging;

import be.AbstractC5194f;
import be.InterfaceC5189a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9546r;
import p409xc.InterfaceC11829d;
import sd.AbstractC11165u;
import sd.InterfaceC11159s;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class UnbatchedFlowCombiner<T1, T2> {
    private final InterfaceC11159s initialDispatched;
    private final InterfaceC5189a lock;
    private final InterfaceC9546r send;
    private final InterfaceC11159s[] valueReceived;
    private final Object[] values;

    @InterfaceC11829d(m26210c = "androidx.paging.UnbatchedFlowCombiner", m26211f = "FlowExt.kt", m26212l = {174, 214, 191}, m26213m = "onNext", m26214v = 1)
    /* renamed from: androidx.paging.UnbatchedFlowCombiner$onNext$1 */
    public static final class C42951 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UnbatchedFlowCombiner<T1, T2> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42951(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, InterfaceC11588c<? super C42951> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = unbatchedFlowCombiner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onNext(0, null, this);
        }
    }

    public UnbatchedFlowCombiner(InterfaceC9546r send) {
        AbstractC9979u.m20294g(send, "send");
        this.send = send;
        this.initialDispatched = AbstractC11165u.m24807b(null, 1, null);
        this.lock = AbstractC5194f.m2745b(false, 1, null);
        InterfaceC11159s[] interfaceC11159sArr = new InterfaceC11159s[2];
        for (int i10 = 0; i10 < 2; i10++) {
            interfaceC11159sArr[i10] = AbstractC11165u.m24807b(null, 1, null);
        }
        this.valueReceived = interfaceC11159sArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = FlowExtKt.NULL;
        }
        this.values = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:32:0x0091, B:34:0x0098, B:41:0x00ab, B:43:0x00b3, B:46:0x00bd, B:48:0x00c2, B:52:0x00cc, B:50:0x00c7, B:51:0x00ca, B:37:0x00a2), top: B:62:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNext(int r13, java.lang.Object r14, vc.InterfaceC11588c<? super p309qc.C10786q> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.onNext(int, java.lang.Object, vc.c):java.lang.Object");
    }
}
