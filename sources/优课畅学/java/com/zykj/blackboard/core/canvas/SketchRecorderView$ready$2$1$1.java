package com.zykj.blackboard.core.canvas;

import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes4.dex */
public final class SketchRecorderView$ready$2$1$1 extends Lambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $callBack;
    final /* synthetic */ BoardControl $this_apply;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$2$1$1(SketchRecorderView sketchRecorderView, InterfaceC10570l interfaceC10570l, BoardControl boardControl) {
        super(2);
        this.this$0 = sketchRecorderView;
        this.$callBack = interfaceC10570l;
        this.$this_apply = boardControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m27425invoke$lambda0(InterfaceC10570l callBack, BoardControl this_apply) {
        AbstractC9133u.m16133g(callBack, "$callBack");
        AbstractC9133u.m16133g(this_apply, "$this_apply");
        callBack.invoke(this_apply);
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
        return C8736p.f16368a;
    }

    public final void invoke(boolean z10, long j10) {
        SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC10570l interfaceC10570l = this.$callBack;
        final BoardControl boardControl = this.$this_apply;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.f
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$2$1$1.m27425invoke$lambda0(interfaceC10570l, boardControl);
            }
        });
    }
}
