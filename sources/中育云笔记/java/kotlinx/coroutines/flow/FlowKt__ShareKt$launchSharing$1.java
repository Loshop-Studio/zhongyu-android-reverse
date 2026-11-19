package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m26211f = "Share.kt", m26212l = {210, 214, 215, 221}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23793c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10040a f23794d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11594c f23795e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11602k f23796f;

    /* renamed from: g */
    public final /* synthetic */ Object f23797g;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m26211f = "Share.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    public static final class C100271 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f23798c;

        /* renamed from: d */
        public /* synthetic */ int f23799d;

        public C100271(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C100271 c100271 = new C100271(interfaceC11588c);
            c100271.f23799d = ((Number) obj).intValue();
            return c100271;
        }

        public final Object invoke(int i10, InterfaceC11588c interfaceC11588c) {
            return ((C100271) create(Integer.valueOf(i10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f23798c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(this.f23799d > 0);
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC11588c) obj2);
        }
    }

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m26211f = "Share.kt", m26212l = {223}, m26213m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    public static final class C100282 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f23800c;

        /* renamed from: d */
        public /* synthetic */ Object f23801d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC11594c f23802e;

        /* renamed from: f */
        public final /* synthetic */ InterfaceC11602k f23803f;

        /* renamed from: g */
        public final /* synthetic */ Object f23804g;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23805a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.f23853c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.f23854d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.f23855e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f23805a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C100282(InterfaceC11594c interfaceC11594c, InterfaceC11602k interfaceC11602k, Object obj, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f23802e = interfaceC11594c;
            this.f23803f = interfaceC11602k;
            this.f23804g = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C100282 c100282 = new C100282(this.f23802e, this.f23803f, this.f23804g, interfaceC11588c);
            c100282.f23801d = obj;
            return c100282;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharingCommand sharingCommand, InterfaceC11588c interfaceC11588c) {
            return ((C100282) create(sharingCommand, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f23800c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                int i11 = a.f23805a[((SharingCommand) this.f23801d).ordinal()];
                if (i11 == 1) {
                    InterfaceC11594c interfaceC11594c = this.f23802e;
                    InterfaceC11602k interfaceC11602k = this.f23803f;
                    this.f23800c = 1;
                    if (interfaceC11594c.collect(interfaceC11602k, this) == objM25952f) {
                        return objM25952f;
                    }
                } else if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj2 = this.f23804g;
                    if (obj2 == AbstractC11608q.f27506a) {
                        this.f23803f.mo20856f();
                    } else {
                        AbstractC11826a.m26206a(this.f23803f.mo20854a(obj2));
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC10040a interfaceC10040a, InterfaceC11594c interfaceC11594c, InterfaceC11602k interfaceC11602k, Object obj, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23794d = interfaceC10040a;
        this.f23795e = interfaceC11594c;
        this.f23796f = interfaceC11602k;
        this.f23797g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FlowKt__ShareKt$launchSharing$1(this.f23794d, this.f23795e, this.f23796f, this.f23797g, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r8.collect(r1, r7) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (p379vd.AbstractC11596e.m25559i(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r7.f23793c
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
            kotlin.AbstractC9924b.m20071b(r8)
            goto L5c
        L21:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L8d
        L25:
            kotlin.AbstractC9924b.m20071b(r8)
            kotlinx.coroutines.flow.a r8 = r7.f23794d
            kotlinx.coroutines.flow.a$a r1 = kotlinx.coroutines.flow.InterfaceC10040a.f23896a
            kotlinx.coroutines.flow.a r6 = r1.m20877c()
            if (r8 != r6) goto L3f
            vd.c r8 = r7.f23795e
            vd.k r1 = r7.f23796f
            r7.f23793c = r5
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            goto L8c
        L3f:
            kotlinx.coroutines.flow.a r8 = r7.f23794d
            kotlinx.coroutines.flow.a r1 = r1.m20878d()
            r5 = 0
            if (r8 != r1) goto L69
            vd.k r8 = r7.f23796f
            vd.u r8 = r8.m25590d()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.f23793c = r4
            java.lang.Object r8 = p379vd.AbstractC11596e.m25573w(r8, r1, r7)
            if (r8 != r0) goto L5c
            goto L8c
        L5c:
            vd.c r8 = r7.f23795e
            vd.k r1 = r7.f23796f
            r7.f23793c = r3
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            goto L8c
        L69:
            kotlinx.coroutines.flow.a r8 = r7.f23794d
            vd.k r1 = r7.f23796f
            vd.u r1 = r1.m25590d()
            vd.c r8 = r8.mo20863a(r1)
            vd.c r8 = p379vd.AbstractC11596e.m25564n(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            vd.c r3 = r7.f23795e
            vd.k r4 = r7.f23796f
            java.lang.Object r6 = r7.f23797g
            r1.<init>(r3, r4, r6, r5)
            r7.f23793c = r2
            java.lang.Object r8 = p379vd.AbstractC11596e.m25559i(r8, r1, r7)
            if (r8 != r0) goto L8d
        L8c:
            return r0
        L8d:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__ShareKt$launchSharing$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
