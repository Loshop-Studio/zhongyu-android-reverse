package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p379vd.InterfaceC11594c;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 implements InterfaceC11594c {

    /* renamed from: c */
    public final /* synthetic */ Object[] f23609c;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", m26211f = "Builders.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_10}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 */
    public static final class C100111 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23610c;

        /* renamed from: d */
        public int f23611d;

        /* renamed from: f */
        public Object f23613f;

        /* renamed from: g */
        public Object f23614g;

        /* renamed from: h */
        public int f23615h;

        /* renamed from: i */
        public int f23616i;

        public C100111(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23610c = obj;
            this.f23611d |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(Object[] objArr) {
        this.f23609c = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.C100111
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.C100111) r0
            int r1 = r0.f23611d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23611d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23610c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23611d
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.f23616i
            int r2 = r0.f23615h
            java.lang.Object r4 = r0.f23614g
            vd.d r4 = (p379vd.InterfaceC11595d) r4
            java.lang.Object r5 = r0.f23613f
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 r5 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1) r5
            kotlin.AbstractC9924b.m20071b(r8)
            r8 = r4
            goto L60
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.AbstractC9924b.m20071b(r8)
            java.lang.Object[] r8 = r6.f23609c
            int r8 = r8.length
            r2 = 0
            r5 = r8
            r8 = r7
            r7 = r5
            r5 = r6
        L49:
            if (r2 >= r7) goto L62
            java.lang.Object[] r4 = r5.f23609c
            r4 = r4[r2]
            r0.f23613f = r5
            r0.f23614g = r8
            r0.f23615h = r2
            r0.f23616i = r7
            r0.f23611d = r3
            java.lang.Object r4 = r8.emit(r4, r0)
            if (r4 != r1) goto L60
            return r1
        L60:
            int r2 = r2 + r3
            goto L49
        L62:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.collect(vd.d, vc.c):java.lang.Object");
    }
}
