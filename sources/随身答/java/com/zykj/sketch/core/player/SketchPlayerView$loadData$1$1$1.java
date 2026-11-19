package com.zykj.sketch.core.player;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m13413d2 = {"<anonymous>", "", "it", "", "invoke"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class SketchPlayerView$loadData$1$1$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ Function1<Integer, Unit> $onSuccess;
    final /* synthetic */ SketchPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SketchPlayerView$loadData$1$1$1(SketchPlayerView sketchPlayerView, Function1<? super Integer, Unit> function1) {
        super(1);
        this.this$0 = sketchPlayerView;
        this.$onSuccess = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m24740invoke$lambda1(SketchPlayerView this$0, final Function1 onSuccess, final int i9) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.t
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView$loadData$1$1$1.m24741invoke$lambda1$lambda0(onSuccess, i9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
    public static final void m24741invoke$lambda1$lambda0(Function1 onSuccess, int i9) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i9));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final int i9) {
        final SketchPlayerView sketchPlayerView = this.this$0;
        final Function1<Integer, Unit> function1 = this.$onSuccess;
        sketchPlayerView.post(new Runnable() { // from class: com.zykj.sketch.core.player.u
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView$loadData$1$1$1.m24740invoke$lambda1(sketchPlayerView, function1, i9);
            }
        });
    }
}
