package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m17801f = "Share.kt", m17802l = {TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, TbsListener.ErrorCode.COPY_EXCEPTION, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17867a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9198a f17868b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9266c f17869c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9270g f17870d;

    /* renamed from: e */
    public final /* synthetic */ Object f17871e;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m17801f = "Share.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    public static final class C91841 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f17872a;

        /* renamed from: b */
        public /* synthetic */ int f17873b;

        public C91841(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C91841 c91841 = new C91841(interfaceC9324c);
            c91841.f17873b = ((Number) obj).intValue();
            return c91841;
        }

        public final Object invoke(int i10, InterfaceC9324c interfaceC9324c) {
            return ((C91841) create(Integer.valueOf(i10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f17872a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(this.f17873b > 0);
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC9324c) obj2);
        }
    }

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m17801f = "Share.kt", m17802l = {TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    public static final class C91852 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f17874a;

        /* renamed from: b */
        public /* synthetic */ Object f17875b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9266c f17876c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9270g f17877d;

        /* renamed from: e */
        public final /* synthetic */ Object f17878e;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f17879a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.f17941a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.f17942b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.f17943c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f17879a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C91852(InterfaceC9266c interfaceC9266c, InterfaceC9270g interfaceC9270g, Object obj, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f17876c = interfaceC9266c;
            this.f17877d = interfaceC9270g;
            this.f17878e = obj;
        }

        @Override // p300x7.InterfaceC10574p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharingCommand sharingCommand, InterfaceC9324c interfaceC9324c) {
            return ((C91852) create(sharingCommand, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C91852 c91852 = new C91852(this.f17876c, this.f17877d, this.f17878e, interfaceC9324c);
            c91852.f17875b = obj;
            return c91852;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f17874a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                int i11 = a.f17879a[((SharingCommand) this.f17875b).ordinal()];
                if (i11 == 1) {
                    InterfaceC9266c interfaceC9266c = this.f17876c;
                    InterfaceC9270g interfaceC9270g = this.f17877d;
                    this.f17874a = 1;
                    if (interfaceC9266c.collect(interfaceC9270g, this) == objM17291f) {
                        return objM17291f;
                    }
                } else if (i11 == 3) {
                    Object obj2 = this.f17878e;
                    if (obj2 == AbstractC9276m.f18273a) {
                        this.f17877d.mo16673h();
                    } else {
                        this.f17877d.mo16670a(obj2);
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC9198a interfaceC9198a, InterfaceC9266c interfaceC9266c, InterfaceC9270g interfaceC9270g, Object obj, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17868b = interfaceC9198a;
        this.f17869c = interfaceC9266c;
        this.f17870d = interfaceC9270g;
        this.f17871e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new FlowKt__ShareKt$launchSharing$1(this.f17868b, this.f17869c, this.f17870d, this.f17871e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((FlowKt__ShareKt$launchSharing$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r8.collect(r1, r7) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (p169l8.AbstractC9268e.m17019i(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r7.f17867a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.AbstractC9079b.m15926b(r8)
            goto L5c
        L21:
            kotlin.AbstractC9079b.m15926b(r8)
            goto L8d
        L25:
            kotlin.AbstractC9079b.m15926b(r8)
            kotlinx.coroutines.flow.a r8 = r7.f17868b
            kotlinx.coroutines.flow.a$a r1 = kotlinx.coroutines.flow.InterfaceC9198a.f17984a
            kotlinx.coroutines.flow.a r6 = r1.m16693c()
            if (r8 != r6) goto L3f
            l8.c r8 = r7.f17869c
            l8.g r1 = r7.f17870d
            r7.f17867a = r5
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            goto L8c
        L3f:
            kotlinx.coroutines.flow.a r8 = r7.f17868b
            kotlinx.coroutines.flow.a r1 = r1.m16694d()
            r5 = 0
            if (r8 != r1) goto L69
            l8.g r8 = r7.f17870d
            l8.q r8 = r8.m17042b()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.f17867a = r4
            java.lang.Object r8 = p169l8.AbstractC9268e.m17035y(r8, r1, r7)
            if (r8 != r0) goto L5c
            goto L8c
        L5c:
            l8.c r8 = r7.f17869c
            l8.g r1 = r7.f17870d
            r7.f17867a = r3
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            goto L8c
        L69:
            kotlinx.coroutines.flow.a r8 = r7.f17868b
            l8.g r1 = r7.f17870d
            l8.q r1 = r1.m17042b()
            l8.c r8 = r8.mo16679a(r1)
            l8.c r8 = p169l8.AbstractC9268e.m17025o(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            l8.c r3 = r7.f17869c
            l8.g r4 = r7.f17870d
            java.lang.Object r6 = r7.f17871e
            r1.<init>(r3, r4, r6, r5)
            r7.f17867a = r2
            java.lang.Object r8 = p169l8.AbstractC9268e.m17019i(r8, r1, r7)
            if (r8 != r0) goto L8d
        L8c:
            return r0
        L8d:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
