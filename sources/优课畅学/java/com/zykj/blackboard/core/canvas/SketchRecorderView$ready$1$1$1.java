package com.zykj.blackboard.core.canvas;

import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes4.dex */
public final class SketchRecorderView$ready$1$1$1 extends Lambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10575q $success;
    final /* synthetic */ BoardControl $this_apply;
    final /* synthetic */ SketchRecorderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$1(SketchRecorderView sketchRecorderView, InterfaceC10575q interfaceC10575q, BoardControl boardControl) {
        super(2);
        this.this$0 = sketchRecorderView;
        this.$success = interfaceC10575q;
        this.$this_apply = boardControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m27423invoke$lambda0(InterfaceC10575q success, BoardControl this_apply, boolean z10, long j10) {
        AbstractC9133u.m16133g(success, "$success");
        AbstractC9133u.m16133g(this_apply, "$this_apply");
        success.invoke(this_apply, Boolean.valueOf(z10), Long.valueOf(j10));
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
        return C8736p.f16368a;
    }

    public final void invoke(final boolean z10, final long j10) {
        SketchRecorderView sketchRecorderView = this.this$0;
        final InterfaceC10575q interfaceC10575q = this.$success;
        final BoardControl boardControl = this.$this_apply;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$1.m27423invoke$lambda0(interfaceC10575q, boardControl, z10, j10);
            }
        });
    }
}
