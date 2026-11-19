package kotlinx.coroutines.flow.internal;

import com.taobao.sophix.PatchStatus;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10000a;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m26211f = "Combine.kt", m26212l = {51, PatchStatus.CODE_LOAD_MFITEM, PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f23938c;

    /* renamed from: d */
    public Object f23939d;

    /* renamed from: e */
    public int f23940e;

    /* renamed from: f */
    public int f23941f;

    /* renamed from: g */
    public int f23942g;

    /* renamed from: h */
    public /* synthetic */ Object f23943h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC11594c[] f23944i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC9529a f23945j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC9545q f23946k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC11595d f23947l;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m26211f = "Combine.kt", m26212l = {28}, m26213m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    public static final class C100431 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f23948c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11594c[] f23949d;

        /* renamed from: e */
        public final /* synthetic */ int f23950e;

        /* renamed from: f */
        public final /* synthetic */ AtomicInteger f23951f;

        /* renamed from: g */
        public final /* synthetic */ InterfaceC10000a f23952g;

        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1 implements InterfaceC11595d {

            /* renamed from: c */
            public final /* synthetic */ InterfaceC10000a f23953c;

            /* renamed from: d */
            public final /* synthetic */ int f23954d;

            public AnonymousClass1(InterfaceC10000a interfaceC10000a, int i10) {
                this.f23953c = interfaceC10000a;
                this.f23954d = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
            
                if (sd.AbstractC11152p2.m24789a(r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p379vd.InterfaceC11595d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.f23957e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23957e = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f23955c
                    java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                    int r2 = r0.f23957e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L56
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlin.AbstractC9924b.m20071b(r8)
                    goto L4d
                L38:
                    kotlin.AbstractC9924b.m20071b(r8)
                    kotlinx.coroutines.channels.a r8 = r6.f23953c
                    rc.k0 r2 = new rc.k0
                    int r5 = r6.f23954d
                    r2.<init>(r5, r7)
                    r0.f23957e = r4
                    java.lang.Object r7 = r8.send(r2, r0)
                    if (r7 != r1) goto L4d
                    goto L55
                L4d:
                    r0.f23957e = r3
                    java.lang.Object r7 = sd.AbstractC11152p2.m24789a(r0)
                    if (r7 != r1) goto L56
                L55:
                    return r1
                L56:
                    qc.q r7 = p309qc.C10786q.f26013a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.C100431.AnonymousClass1.emit(java.lang.Object, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C100431(InterfaceC11594c[] interfaceC11594cArr, int i10, AtomicInteger atomicInteger, InterfaceC10000a interfaceC10000a, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f23949d = interfaceC11594cArr;
            this.f23950e = i10;
            this.f23951f = atomicInteger;
            this.f23952g = interfaceC10000a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C100431(this.f23949d, this.f23950e, this.f23951f, this.f23952g, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AtomicInteger atomicInteger;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f23948c;
            try {
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11594c[] interfaceC11594cArr = this.f23949d;
                    int i11 = this.f23950e;
                    InterfaceC11594c interfaceC11594c = interfaceC11594cArr[i11];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23952g, i11);
                    this.f23948c = 1;
                    if (interfaceC11594c.collect(anonymousClass1, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    InterfaceC10005f.a.m20742a(this.f23952g, null, 1, null);
                }
                return C10786q.f26013a;
            } finally {
                if (this.f23951f.decrementAndGet() == 0) {
                    InterfaceC10005f.a.m20742a(this.f23952g, null, 1, null);
                }
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C100431) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(InterfaceC11594c[] interfaceC11594cArr, InterfaceC9529a interfaceC9529a, InterfaceC9545q interfaceC9545q, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23944i = interfaceC11594cArr;
        this.f23945j = interfaceC9529a;
        this.f23946k = interfaceC9545q;
        this.f23947l = interfaceC11595d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f23944i, this.f23945j, this.f23946k, this.f23947l, interfaceC11588c);
        combineKt$combineInternal$2.f23943h = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        if (r10.invoke(r11, r9, r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        if (r11.invoke(r12, r10, r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if (r6 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
      0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r10v5 rc.k0) = (r10v4 rc.k0), (r10v12 rc.k0) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((CombineKt$combineInternal$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
