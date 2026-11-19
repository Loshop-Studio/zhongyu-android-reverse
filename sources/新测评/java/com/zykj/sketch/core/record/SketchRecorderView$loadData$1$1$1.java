package com.zykj.sketch.core.record;

import com.zykj.sketch.core.graph.Graph;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m13558d2 = {"<anonymous>", "", "it", "Lcom/zykj/sketch/core/graph/Graph;", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class SketchRecorderView$loadData$1$1$1 extends Lambda implements Function1<Graph, Unit> {
    final /* synthetic */ Function1<Graph, Unit> $finish;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SketchRecorderView$loadData$1$1$1(SketchRecorderView sketchRecorderView, Function1<? super Graph, Unit> function1) {
        super(1);
        this.this$0 = sketchRecorderView;
        this.$finish = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m24293invoke$lambda0(Function1 finish, Graph it, SketchRecorderView this$0) {
        Intrinsics.checkNotNullParameter(finish, "$finish");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            finish.invoke(it);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Graph graph) {
        invoke2(graph);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Graph it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final SketchRecorderView sketchRecorderView = this.this$0;
        final Function1<Graph, Unit> function1 = this.$finish;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.sketch.core.record.k
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$loadData$1$1$1.m24293invoke$lambda0(function1, it, sketchRecorderView);
            }
        });
    }
}
