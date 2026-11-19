package com.zykj.sketch.core.record;

import com.zykj.sketch.core.graph.Graph;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class SketchRecorderView$loadData$1$1$1 extends Lambda implements InterfaceC9540l {
    final /* synthetic */ InterfaceC9540l $finish;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$loadData$1$1$1(SketchRecorderView sketchRecorderView, InterfaceC9540l interfaceC9540l) {
        super(1);
        this.this$0 = sketchRecorderView;
        this.$finish = interfaceC9540l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m34089invoke$lambda0(InterfaceC9540l finish, Graph it, SketchRecorderView this$0) {
        AbstractC9979u.m20294g(finish, "$finish");
        AbstractC9979u.m20294g(it, "$it");
        AbstractC9979u.m20294g(this$0, "this$0");
        try {
            finish.invoke(it);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Graph) obj);
        return C10786q.f26013a;
    }

    public final void invoke(final Graph it) {
        AbstractC9979u.m20294g(it, "it");
        final SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC9540l interfaceC9540l = this.$finish;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.sketch.core.record.k
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$loadData$1$1$1.m34089invoke$lambda0(interfaceC9540l, it, sketchRecorderView);
            }
        });
    }
}
