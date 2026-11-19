package com.zykj.view.widget;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.widget.SketchProgressView$showView$1", m26211f = "SketchProgressView.kt", m26212l = {346}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SketchProgressView$showView$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20846c;

    /* renamed from: d */
    public int f20847d;

    /* renamed from: e */
    public /* synthetic */ Object f20848e;

    /* renamed from: f */
    public final /* synthetic */ SketchProgressView f20849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView$showView$1(SketchProgressView sketchProgressView, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20849f = sketchProgressView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m17428m(SketchProgressView sketchProgressView) {
        sketchProgressView.setVisibility(0);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        SketchProgressView$showView$1 sketchProgressView$showView$1 = new SketchProgressView$showView$1(this.f20849f, interfaceC11588c);
        sketchProgressView$showView$1.f20848e = obj;
        return sketchProgressView$showView$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0048 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f20848e
            sd.i0 r0 = (sd.InterfaceC11122i0) r0
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r6.f20847d
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            int r2 = r6.f20846c
            kotlin.AbstractC9924b.m20071b(r7)
        L14:
            r7 = r2
            goto L22
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.AbstractC9924b.m20071b(r7)
            r7 = 0
        L22:
            boolean r2 = kotlinx.coroutines.AbstractC10006d.m20749f(r0)
            if (r2 == 0) goto L4b
            r2 = 250(0xfa, float:3.5E-43)
            if (r7 >= r2) goto L4b
            int r2 = r7 + 25
            com.zykj.view.widget.SketchProgressView r7 = r6.f20849f
            android.graphics.Paint r7 = com.zykj.view.widget.SketchProgressView.m17411a(r7)
            r7.setAlpha(r2)
            com.zykj.view.widget.SketchProgressView r7 = r6.f20849f
            r7.postInvalidate()
            r6.f20848e = r0
            r6.f20846c = r2
            r6.f20847d = r3
            r4 = 10
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m20376b(r4, r6)
            if (r7 != r1) goto L14
            return r1
        L4b:
            com.zykj.view.widget.SketchProgressView r7 = r6.f20849f
            com.zykj.view.widget.b r0 = new com.zykj.view.widget.b
            r0.<init>()
            r7.post(r0)
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView$showView$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/view/widget/SketchProgressView$showView$1.smali:150
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SketchProgressView$showView$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
