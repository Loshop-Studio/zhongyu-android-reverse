package com.zykj.sketch.core.record;

import com.zykj.sketch.core.graph.Graph;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SketchRecorderView$loadData$1$1$1 extends Lambda implements InterfaceC10570l {
    final /* synthetic */ InterfaceC10570l $finish;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$loadData$1$1$1(SketchRecorderView sketchRecorderView, InterfaceC10570l interfaceC10570l) {
        super(1);
        this.this$0 = sketchRecorderView;
        this.$finish = interfaceC10570l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m27545invoke$lambda0(InterfaceC10570l finish, Graph it, SketchRecorderView this$0) {
        AbstractC9133u.m16133g(finish, "$finish");
        AbstractC9133u.m16133g(it, "$it");
        AbstractC9133u.m16133g(this$0, "this$0");
        try {
            finish.invoke(it);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Graph) obj);
        return C8736p.f16368a;
    }

    public final void invoke(final Graph it) {
        AbstractC9133u.m16133g(it, "it");
        final SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC10570l interfaceC10570l = this.$finish;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.sketch.core.record.k
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$loadData$1$1$1.m27545invoke$lambda0(interfaceC10570l, it, sketchRecorderView);
            }
        });
    }
}
