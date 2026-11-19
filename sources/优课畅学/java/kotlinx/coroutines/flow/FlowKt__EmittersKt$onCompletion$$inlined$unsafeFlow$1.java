package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements InterfaceC9266c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9266c f17745a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10575q f17746b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m17801f = "Emitters.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 120, 127}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    public static final class C91721 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f17747a;

        /* renamed from: b */
        public int f17748b;

        /* renamed from: d */
        public Object f17750d;

        /* renamed from: e */
        public Object f17751e;

        public C91721(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17747a = obj;
            this.f17748b |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(InterfaceC9266c interfaceC9266c, InterfaceC10575q interfaceC10575q) {
        this.f17745a = interfaceC9266c;
        this.f17746b = interfaceC10575q;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r9, p179m7.InterfaceC9324c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C91721
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C91721) r0
            int r1 = r0.f17748b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17748b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17747a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17748b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f17750d
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            kotlin.AbstractC9079b.m15926b(r10)     // Catch: java.lang.Throwable -> L34
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
            java.lang.Object r9 = r0.f17750d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.AbstractC9079b.m15926b(r10)
            goto Lad
        L47:
            java.lang.Object r9 = r0.f17751e
            l8.d r9 = (p169l8.InterfaceC9267d) r9
            java.lang.Object r2 = r0.f17750d
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            kotlin.AbstractC9079b.m15926b(r10)     // Catch: java.lang.Throwable -> L53
            goto L68
        L53:
            r9 = move-exception
            goto L99
        L55:
            kotlin.AbstractC9079b.m15926b(r10)
            l8.c r10 = r8.f17745a     // Catch: java.lang.Throwable -> L97
            r0.f17750d = r8     // Catch: java.lang.Throwable -> L97
            r0.f17751e = r9     // Catch: java.lang.Throwable -> L97
            r0.f17748b = r5     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L67
            goto Lac
        L67:
            r2 = r8
        L68:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r4 = r0.getContext()
            r10.<init>(r9, r4)
            x7.q r9 = r2.f17746b     // Catch: java.lang.Throwable -> L8f
            r0.f17750d = r10     // Catch: java.lang.Throwable -> L8f
            r0.f17751e = r6     // Catch: java.lang.Throwable -> L8f
            r0.f17748b = r3     // Catch: java.lang.Throwable -> L8f
            r2 = 6
            kotlin.jvm.internal.AbstractC9131s.m16126c(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 7
            kotlin.jvm.internal.AbstractC9131s.m16126c(r0)     // Catch: java.lang.Throwable -> L8f
            if (r9 != r1) goto L88
            goto Lac
        L88:
            r9 = r10
        L89:
            r9.releaseIntercepted()
            h7.p r9 = p123h7.C8736p.f16368a
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
            l8.t r10 = new l8.t
            r10.<init>(r9)
            x7.q r2 = r2.f17746b
            r0.f17750d = r9
            r0.f17751e = r6
            r0.f17748b = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__EmittersKt.m16594a(r10, r2, r9, r0)
            if (r10 != r1) goto Lad
        Lac:
            return r1
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(l8.d, m7.c):java.lang.Object");
    }
}
