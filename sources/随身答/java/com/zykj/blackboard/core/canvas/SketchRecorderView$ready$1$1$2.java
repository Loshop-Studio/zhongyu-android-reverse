package com.zykj.blackboard.core.canvas;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m13413d2 = {"<anonymous>", "", "it", "", "invoke"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class SketchRecorderView$ready$1$1$2 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SketchRecorderView f8396a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f8397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$2(SketchRecorderView sketchRecorderView, Function1 function1) {
        super(1);
        this.f8396a = sketchRecorderView;
        this.f8397b = function1;
    }

    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m24690invoke$lambda0(Function1 error, Throwable it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "$it");
        error.invoke(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SketchRecorderView sketchRecorderView = this.f8396a;
        final Function1 function1 = this.f8397b;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.b
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$2.m24690invoke$lambda0(function1, it);
            }
        });
    }
}
