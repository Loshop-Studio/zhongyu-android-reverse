package com.zykj.blackboard.core.canvas;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class SketchRecorderView$ready$1$1$2 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ InterfaceC10570l $error;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$2(SketchRecorderView sketchRecorderView, InterfaceC10570l interfaceC10570l) {
        super(1);
        this.this$0 = sketchRecorderView;
        this.$error = interfaceC10570l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m27424invoke$lambda0(InterfaceC10570l error, Throwable it) {
        AbstractC9133u.m16133g(error, "$error");
        AbstractC9133u.m16133g(it, "$it");
        error.invoke(it);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C8736p.f16368a;
    }

    public final void invoke(final Throwable it) {
        AbstractC9133u.m16133g(it, "it");
        SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC10570l interfaceC10570l = this.$error;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.e
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$2.m27424invoke$lambda0(interfaceC10570l, it);
            }
        });
    }
}
