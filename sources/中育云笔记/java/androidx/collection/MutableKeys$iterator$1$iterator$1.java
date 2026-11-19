package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.collection.MutableKeys$iterator$1$iterator$1", m26211f = "ScatterMap.kt", m26212l = {1622}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutableKeys$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC9544p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableKeys<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableKeys$iterator$1$iterator$1(MutableKeys<K, V> mutableKeys, InterfaceC11588c<? super MutableKeys$iterator$1$iterator$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = mutableKeys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        MutableKeys$iterator$1$iterator$1 mutableKeys$iterator$1$iterator$1 = new MutableKeys$iterator$1$iterator$1(this.this$0, interfaceC11588c);
        mutableKeys$iterator$1$iterator$1.L$0 = obj;
        return mutableKeys$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:23:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            pd.i r12 = (p296pd.AbstractC10661i) r12
            kotlin.AbstractC9924b.m20071b(r20)
            goto L8f
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            kotlin.AbstractC9924b.m20071b(r20)
            java.lang.Object r2 = r0.L$0
            pd.i r2 = (p296pd.AbstractC10661i) r2
            androidx.collection.MutableKeys<K, V> r6 = r0.this$0
            androidx.collection.MutableScatterMap r6 = androidx.collection.MutableKeys.access$getParent$p(r6)
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9d
            r8 = r3
        L44:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L98
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r2
            r2 = r3
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L66:
            if (r2 >= r6) goto L92
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8f
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = p409xc.AbstractC11826a.m26208c(r13)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r13 = r12.mo22551a(r13, r0)
            if (r13 != r1) goto L8f
            return r1
        L8f:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L92:
            if (r6 != r4) goto L9d
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L98:
            if (r8 == r7) goto L9d
            int r8 = r8 + 1
            goto L44
        L9d:
            qc.q r1 = p309qc.C10786q.f26013a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((MutableKeys$iterator$1$iterator$1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
