package com.zykj.blackboard.core.canvas;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13412d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m13413d2 = {"<anonymous>", "", "haveCache", "", TypedValues.TransitionType.S_DURATION, "", "invoke"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class SketchRecorderView$ready$1$1$1 extends Lambda implements Function2<Boolean, Long, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SketchRecorderView f8393a;

    /* renamed from: b */
    public final /* synthetic */ Function3 f8394b;

    /* renamed from: c */
    public final /* synthetic */ BoardControl f8395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$1(SketchRecorderView sketchRecorderView, Function3 function3, BoardControl boardControl) {
        super(2);
        this.f8393a = sketchRecorderView;
        this.f8394b = function3;
        this.f8395c = boardControl;
    }

    /* renamed from: c */
    public static final void m7286c(Function3 success, BoardControl this_apply, boolean z9, long j9) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        success.invoke(this_apply, Boolean.valueOf(z9), Long.valueOf(j9));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l9) {
        invoke(bool.booleanValue(), l9.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final boolean z9, final long j9) {
        SketchRecorderView sketchRecorderView = this.f8393a;
        final Function3 function3 = this.f8394b;
        final BoardControl boardControl = this.f8395c;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.a
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$1.m7286c(function3, boardControl, z9, j9);
            }
        });
    }
}
