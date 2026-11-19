package com.zykj.view.widget;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.widget.SketchProgressView$hideView$1", m17801f = "SketchProgressView.kt", m17802l = {360}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SketchProgressView$hideView$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15628a;

    /* renamed from: b */
    public int f15629b;

    /* renamed from: c */
    public /* synthetic */ Object f15630c;

    /* renamed from: d */
    public final /* synthetic */ SketchProgressView f15631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView$hideView$1(SketchProgressView sketchProgressView, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15631d = sketchProgressView;
    }

    /* renamed from: d */
    public static final void m13351d(SketchProgressView sketchProgressView) {
        sketchProgressView.setVisibility(8);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        SketchProgressView$hideView$1 sketchProgressView$hideView$1 = new SketchProgressView$hideView$1(this.f15631d, interfaceC9324c);
        sketchProgressView$hideView$1.f15630c = obj;
        return sketchProgressView$hideView$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SketchProgressView$hideView$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0047 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f15630c
            i8.b0 r0 = (p135i8.InterfaceC8822b0) r0
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r6.f15629b
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            int r2 = r6.f15628a
            kotlin.AbstractC9079b.m15926b(r7)
        L14:
            r7 = r2
            goto L23
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.AbstractC9079b.m15926b(r7)
            r7 = 250(0xfa, float:3.5E-43)
        L23:
            boolean r2 = kotlinx.coroutines.AbstractC9165e.m16558g(r0)
            if (r2 == 0) goto L4a
            if (r7 <= 0) goto L4a
            int r2 = r7 + (-10)
            com.zykj.view.widget.SketchProgressView r7 = r6.f15631d
            android.graphics.Paint r7 = com.zykj.view.widget.SketchProgressView.m13336a(r7)
            r7.setAlpha(r2)
            com.zykj.view.widget.SketchProgressView r7 = r6.f15631d
            r7.postInvalidate()
            r6.f15630c = r0
            r6.f15628a = r2
            r6.f15629b = r3
            r4 = 10
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m16227b(r4, r6)
            if (r7 != r1) goto L14
            return r1
        L4a:
            com.zykj.view.widget.SketchProgressView r7 = r6.f15631d
            com.zykj.view.widget.a r0 = new com.zykj.view.widget.a
            r0.<init>()
            r7.post(r0)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView$hideView$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/view/widget/SketchProgressView$hideView$1.smali:151
    }
}
