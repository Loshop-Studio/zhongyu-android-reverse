package com.zykj.sketch.core.record;

import com.zykj.sketch.core.graph.Graph;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/Graph;", "it", "Ld6/s;", "invoke", "(Lcom/zykj/sketch/core/graph/Graph;)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SketchRecorderView$loadData$1$1$1 extends Lambda implements InterfaceC6471c {
    final /* synthetic */ InterfaceC6471c $finish;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$loadData$1$1$1(SketchRecorderView sketchRecorderView, InterfaceC6471c interfaceC6471c) {
        super(1);
        this.this$0 = sketchRecorderView;
        this.$finish = interfaceC6471c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m13886invoke$lambda0(InterfaceC6471c finish, Graph it, SketchRecorderView this$0) {
        AbstractC5830k.m5330g(finish, "$finish");
        AbstractC5830k.m5330g(it, "$it");
        AbstractC5830k.m5330g(this$0, "this$0");
        try {
            finish.invoke(it);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Graph) obj);
        return C5443s.f8405a;
    }

    public final void invoke(@NotNull final Graph it) {
        AbstractC5830k.m5330g(it, "it");
        final SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC6471c interfaceC6471c = this.$finish;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.sketch.core.record.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$loadData$1$1$1.m13886invoke$lambda0(interfaceC6471c, it, sketchRecorderView);
            }
        });
    }
}
