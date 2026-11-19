package com.zykj.blackboard.core.canvas;

import com.zykj.blackboard.core.edit.BoardControl;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes5.dex */
public final class SketchRecorderView$ready$1$1$1 extends Lambda implements InterfaceC9544p {

    /* renamed from: c */
    public final /* synthetic */ SketchRecorderView f17940c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9545q f17941d;

    /* renamed from: e */
    public final /* synthetic */ BoardControl f17942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView$ready$1$1$1(SketchRecorderView sketchRecorderView, InterfaceC9545q interfaceC9545q, BoardControl boardControl) {
        super(2);
        this.f17940c = sketchRecorderView;
        this.f17941d = interfaceC9545q;
        this.f17942e = boardControl;
    }

    /* renamed from: c */
    public static final void m13902c(InterfaceC9545q success, BoardControl this_apply, boolean z10, long j10) {
        AbstractC9979u.m20294g(success, "$success");
        AbstractC9979u.m20294g(this_apply, "$this_apply");
        success.invoke(this_apply, Boolean.valueOf(z10), Long.valueOf(j10));
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
        return C10786q.f26013a;
    }

    public final void invoke(final boolean z10, final long j10) {
        SketchRecorderView sketchRecorderView = this.f17940c;
        final InterfaceC9545q interfaceC9545q = this.f17941d;
        final BoardControl boardControl = this.f17942e;
        sketchRecorderView.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.a
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView$ready$1$1$1.m13902c(interfaceC9545q, boardControl, z10, j10);
            }
        });
    }
}
