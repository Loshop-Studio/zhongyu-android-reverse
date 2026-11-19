package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9545q;
import p379vd.InterfaceC11594c;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements InterfaceC11594c {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11594c f23672c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9545q f23673d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m26211f = "Emitters.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 117, 124}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    public static final class C100151 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23674c;

        /* renamed from: d */
        public int f23675d;

        /* renamed from: f */
        public Object f23677f;

        /* renamed from: g */
        public Object f23678g;

        public C100151(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23674c = obj;
            this.f23675d |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(InterfaceC11594c interfaceC11594c, InterfaceC9545q interfaceC9545q) {
        this.f23672c = interfaceC11594c;
        this.f23673d = interfaceC9545q;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r9, vc.InterfaceC11588c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C100151
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C100151) r0
            int r1 = r0.f23675d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23675d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23674c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23675d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f23677f
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L34
            goto L89
        L34:
            r10 = move-exception
            goto L93
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f23677f
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.AbstractC9924b.m20071b(r10)
            goto Lad
        L47:
            java.lang.Object r9 = r0.f23678g
            vd.d r9 = (p379vd.InterfaceC11595d) r9
            java.lang.Object r2 = r0.f23677f
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L53
            goto L68
        L53:
            r9 = move-exception
            goto L99
        L55:
            kotlin.AbstractC9924b.m20071b(r10)
            vd.c r10 = r8.f23672c     // Catch: java.lang.Throwable -> L97
            r0.f23677f = r8     // Catch: java.lang.Throwable -> L97
            r0.f23678g = r9     // Catch: java.lang.Throwable -> L97
            r0.f23675d = r5     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L67
            goto Lac
        L67:
            r2 = r8
        L68:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r4 = r0.getContext()
            r10.<init>(r9, r4)
            hd.q r9 = r2.f23673d     // Catch: java.lang.Throwable -> L8f
            r0.f23677f = r10     // Catch: java.lang.Throwable -> L8f
            r0.f23678g = r6     // Catch: java.lang.Throwable -> L8f
            r0.f23675d = r3     // Catch: java.lang.Throwable -> L8f
            r2 = 6
            kotlin.jvm.internal.AbstractC9977s.m20287c(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 7
            kotlin.jvm.internal.AbstractC9977s.m20287c(r0)     // Catch: java.lang.Throwable -> L8f
            if (r9 != r1) goto L88
            goto Lac
        L88:
            r9 = r10
        L89:
            r9.releaseIntercepted()
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        L8f:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L93:
            r9.releaseIntercepted()
            throw r10
        L97:
            r9 = move-exception
            r2 = r8
        L99:
            vd.x r10 = new vd.x
            r10.<init>(r9)
            hd.q r2 = r2.f23673d
            r0.f23677f = r9
            r0.f23678g = r6
            r0.f23675d = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__EmittersKt.m20782a(r10, r2, r9, r0)
            if (r10 != r1) goto Lad
        Lac:
            return r1
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(vd.d, vc.c):java.lang.Object");
    }
}
