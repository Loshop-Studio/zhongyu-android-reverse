package com.zykj.blackboard.core.canvas;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m13558d2 = {"<anonymous>", "", "haveCache", "", TypedValues.TransitionType.S_DURATION, "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class SketchRecorderView$ready$1$1$1 extends Lambda implements Function2<Boolean, Long, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SketchRecorderView f7110a;

    /* renamed from: b */
    public final /* synthetic */ Function3 f7111b;

    /* renamed from: c */
    public final /* synthetic */ BoardControl f7112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$1(SketchRecorderView sketchRecorderView, Function3 function3, BoardControl boardControl) {
        super(2);
        this.f7110a = sketchRecorderView;
        this.f7111b = function3;
        this.f7112c = boardControl;
    }

    /* renamed from: f */
    public static final void m6190f(Function3 success, BoardControl this_apply, boolean z9, long j10) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        success.invoke(this_apply, Boolean.valueOf(z9), Long.valueOf(j10));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l10) {
        invoke(bool.booleanValue(), l10.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final boolean z9, final long j10) {
        SketchRecorderView sketchRecorderView = this.f7110a;
        final Function3 function3 = this.f7111b;
        final BoardControl boardControl = this.f7112c;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.a
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$1.m6190f(function3, boardControl, z9, j10);
            }
        });
    }
}
