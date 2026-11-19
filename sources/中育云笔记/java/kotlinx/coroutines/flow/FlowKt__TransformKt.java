package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__TransformKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a */
    public static final class C10031a implements InterfaceC11594c {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC11594c f23820c;

        public C10031a(InterfaceC11594c interfaceC11594c) {
            this.f23820c = interfaceC11594c;
        }

        @Override // p379vd.InterfaceC11594c
        public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
            Object objCollect = this.f23820c.collect(new FlowKt__TransformKt$withIndex$1$1(interfaceC11595d, new Ref$IntRef()), interfaceC11588c);
            return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC11594c m20813a(final InterfaceC11594c interfaceC11594c) {
        return new InterfaceC11594c() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2 */
            public static final class C100292 implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ InterfaceC11595d f23807c;

                @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m26211f = "Transform.kt", m26212l = {50}, m26213m = "emit")
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: c */
                    public /* synthetic */ Object f23808c;

                    /* renamed from: d */
                    public int f23809d;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f23808c = obj;
                        this.f23809d |= Integer.MIN_VALUE;
                        return C100292.this.emit(null, this);
                    }
                }

                public C100292(InterfaceC11595d interfaceC11595d) {
                    this.f23807c = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.C100292.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.C100292.AnonymousClass1) r0
                        int r1 = r0.f23809d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f23809d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f23808c
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.f23809d
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9924b.m20071b(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9924b.m20071b(r6)
                        vd.d r6 = r4.f23807c
                        if (r5 == 0) goto L41
                        r0.f23809d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        qc.q r5 = p309qc.C10786q.f26013a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.C100292.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594c.collect(new C100292(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        };
    }

    /* renamed from: b */
    public static final InterfaceC11594c m20814b(final InterfaceC11594c interfaceC11594c, final InterfaceC9544p interfaceC9544p) {
        return new InterfaceC11594c() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
            public static final class C100302 implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ InterfaceC11595d f23813c;

                /* renamed from: d */
                public final /* synthetic */ InterfaceC9544p f23814d;

                @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m26211f = "Transform.kt", m26212l = {50, 51}, m26213m = "emit")
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: c */
                    public /* synthetic */ Object f23815c;

                    /* renamed from: d */
                    public int f23816d;

                    /* renamed from: f */
                    public Object f23818f;

                    /* renamed from: g */
                    public Object f23819g;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f23815c = obj;
                        this.f23816d |= Integer.MIN_VALUE;
                        return C100302.this.emit(null, this);
                    }
                }

                public C100302(InterfaceC11595d interfaceC11595d, InterfaceC9544p interfaceC9544p) {
                    this.f23813c = interfaceC11595d;
                    this.f23814d = interfaceC9544p;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C100302.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C100302.AnonymousClass1) r0
                        int r1 = r0.f23816d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f23816d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f23815c
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.f23816d
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.AbstractC9924b.m20071b(r7)
                        goto L6a
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.f23819g
                        vd.d r6 = (p379vd.InterfaceC11595d) r6
                        java.lang.Object r2 = r0.f23818f
                        kotlin.AbstractC9924b.m20071b(r7)
                        goto L5c
                    L3e:
                        kotlin.AbstractC9924b.m20071b(r7)
                        vd.d r7 = r5.f23813c
                        hd.p r2 = r5.f23814d
                        r0.f23818f = r6
                        r0.f23819g = r7
                        r0.f23816d = r4
                        r4 = 6
                        kotlin.jvm.internal.AbstractC9977s.m20287c(r4)
                        java.lang.Object r2 = r2.invoke(r6, r0)
                        r4 = 7
                        kotlin.jvm.internal.AbstractC9977s.m20287c(r4)
                        if (r2 != r1) goto L5a
                        goto L69
                    L5a:
                        r2 = r6
                        r6 = r7
                    L5c:
                        r7 = 0
                        r0.f23818f = r7
                        r0.f23819g = r7
                        r0.f23816d = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        qc.q r6 = p309qc.C10786q.f26013a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C100302.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594c.collect(new C100302(interfaceC11595d, interfaceC9544p), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        };
    }

    /* renamed from: c */
    public static final InterfaceC11594c m20815c(InterfaceC11594c interfaceC11594c) {
        return new C10031a(interfaceC11594c);
    }
}
