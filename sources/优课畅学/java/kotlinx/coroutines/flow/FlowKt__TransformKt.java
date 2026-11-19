package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__TransformKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a */
    public static final class C9189a implements InterfaceC9266c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9266c f17901a;

        public C9189a(InterfaceC9266c interfaceC9266c) {
            this.f17901a = interfaceC9266c;
        }

        @Override // p169l8.InterfaceC9266c
        public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
            Object objCollect = this.f17901a.collect(new FlowKt__TransformKt$withIndex$1$1(interfaceC9267d, new Ref$IntRef()), interfaceC9324c);
            return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9266c m16627a(final InterfaceC9266c interfaceC9266c) {
        return new InterfaceC9266c() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2 */
            public static final class C91872 implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC9267d f17888a;

                @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m17801f = "Transform.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION}, m17803m = "emit")
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f17889a;

                    /* renamed from: b */
                    public int f17890b;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f17889a = obj;
                        this.f17890b |= Integer.MIN_VALUE;
                        return C91872.this.emit(null, this);
                    }
                }

                public C91872(InterfaceC9267d interfaceC9267d) {
                    this.f17888a = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.C91872.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.C91872.AnonymousClass1) r0
                        int r1 = r0.f17890b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f17890b = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f17889a
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.f17890b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9079b.m15926b(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9079b.m15926b(r6)
                        l8.d r6 = r4.f17888a
                        if (r5 == 0) goto L41
                        r0.f17890b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        h7.p r5 = p123h7.C8736p.f16368a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.C91872.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9266c.collect(new C91872(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        };
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16628b(final InterfaceC9266c interfaceC9266c, final InterfaceC10574p interfaceC10574p) {
        return new InterfaceC9266c() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
            public static final class C91882 implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC9267d f17894a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC10574p f17895b;

                @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m17801f = "Transform.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS}, m17803m = "emit")
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f17896a;

                    /* renamed from: b */
                    public int f17897b;

                    /* renamed from: d */
                    public Object f17899d;

                    /* renamed from: e */
                    public Object f17900e;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f17896a = obj;
                        this.f17897b |= Integer.MIN_VALUE;
                        return C91882.this.emit(null, this);
                    }
                }

                public C91882(InterfaceC9267d interfaceC9267d, InterfaceC10574p interfaceC10574p) {
                    this.f17894a = interfaceC9267d;
                    this.f17895b = interfaceC10574p;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C91882.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C91882.AnonymousClass1) r0
                        int r1 = r0.f17897b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f17897b = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f17896a
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.f17897b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.AbstractC9079b.m15926b(r7)
                        goto L6a
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.f17900e
                        l8.d r6 = (p169l8.InterfaceC9267d) r6
                        java.lang.Object r2 = r0.f17899d
                        kotlin.AbstractC9079b.m15926b(r7)
                        goto L5c
                    L3e:
                        kotlin.AbstractC9079b.m15926b(r7)
                        l8.d r7 = r5.f17894a
                        x7.p r2 = r5.f17895b
                        r0.f17899d = r6
                        r0.f17900e = r7
                        r0.f17897b = r4
                        r4 = 6
                        kotlin.jvm.internal.AbstractC9131s.m16126c(r4)
                        java.lang.Object r2 = r2.invoke(r6, r0)
                        r4 = 7
                        kotlin.jvm.internal.AbstractC9131s.m16126c(r4)
                        if (r2 != r1) goto L5a
                        goto L69
                    L5a:
                        r2 = r6
                        r6 = r7
                    L5c:
                        r7 = 0
                        r0.f17899d = r7
                        r0.f17900e = r7
                        r0.f17897b = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        h7.p r6 = p123h7.C8736p.f16368a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C91882.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9266c.collect(new C91882(interfaceC9267d, interfaceC10574p), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        };
    }

    /* renamed from: c */
    public static final InterfaceC9266c m16629c(InterfaceC9266c interfaceC9266c) {
        return new C9189a(interfaceC9266c);
    }
}
