package com.zykj.blackboard.core.canvas;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"", "haveCache", "", TypedValues.TransitionType.S_DURATION, "Ld6/s;", "invoke", "(ZJ)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SketchRecorderView$ready$1$1$1 extends Lambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6474f $success;
    final /* synthetic */ BoardControl $this_apply;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$1(SketchRecorderView sketchRecorderView, InterfaceC6474f interfaceC6474f, BoardControl boardControl) {
        super(2);
        this.this$0 = sketchRecorderView;
        this.$success = interfaceC6474f;
        this.$this_apply = boardControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m13752invoke$lambda0(InterfaceC6474f success, BoardControl this_apply, boolean z8, long j7) {
        AbstractC5830k.m5330g(success, "$success");
        AbstractC5830k.m5330g(this_apply, "$this_apply");
        success.invoke(this_apply, Boolean.valueOf(z8), Long.valueOf(j7));
    }

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
        return C5443s.f8405a;
    }

    public final void invoke(final boolean z8, final long j7) {
        SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC6474f interfaceC6474f = this.$success;
        final BoardControl boardControl = this.$this_apply;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.a
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$1.m13752invoke$lambda0(interfaceC6474f, boardControl, z8, j7);
            }
        });
    }
}
