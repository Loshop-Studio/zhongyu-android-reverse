package com.zykj.merge.sketch.view;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.merge.sketch.constant.PlayStatus;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p296x3.InterfaceC10493a;
import p296x3.InterfaceC10494b;
import p296x3.InterfaceC10495c;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class MergeSketchPlayView extends RelativeLayout {

    /* renamed from: a */
    public final AttributeSet f10382a;

    /* renamed from: b */
    public InterfaceC10494b f10383b;

    /* renamed from: c */
    public Map f10384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MergeSketchPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f10384c = new LinkedHashMap();
        this.f10382a = attributeSet;
    }

    /* renamed from: c */
    public static /* synthetic */ void m9521c(MergeSketchPlayView mergeSketchPlayView, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        mergeSketchPlayView.m9524b(f10, f11);
    }

    /* renamed from: f */
    public static /* synthetic */ void m9522f(MergeSketchPlayView mergeSketchPlayView, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        mergeSketchPlayView.m9526e(f10, f11);
    }

    /* renamed from: a */
    public final void m9523a(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.mo9508a(listener);
        }
    }

    /* renamed from: b */
    public final void m9524b(Float f10, Float f11) {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b instanceof InterfaceC10493a) {
            AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((InterfaceC10493a) interfaceC10494b).areaMoveEnd(f10, f11);
        }
    }

    /* renamed from: d */
    public final void m9525d() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b instanceof InterfaceC10493a) {
            AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((InterfaceC10493a) interfaceC10494b).areaMoveStart();
        }
    }

    /* renamed from: e */
    public final void m9526e(Float f10, Float f11) {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b instanceof InterfaceC10493a) {
            AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((InterfaceC10493a) interfaceC10494b).areaMoving(f10, f11);
        }
    }

    /* renamed from: g */
    public final void m9527g() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.destroy();
        }
    }

    public final float getMoveHorizontalProgress() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (!(interfaceC10494b instanceof InterfaceC10493a)) {
            return 0.0f;
        }
        AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((InterfaceC10493a) interfaceC10494b).getMoveHorizontalProgress();
    }

    public final int getMoveMaxHeightTimes() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (!(interfaceC10494b instanceof InterfaceC10493a)) {
            return 0;
        }
        AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((InterfaceC10493a) interfaceC10494b).getMoveMaxHeightTimes();
    }

    public final int getMoveMaxWidthTimes() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (!(interfaceC10494b instanceof InterfaceC10493a)) {
            return 0;
        }
        AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((InterfaceC10493a) interfaceC10494b).getMoveMaxWidthTimes();
    }

    public final float getMoveVerticalProgress() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (!(interfaceC10494b instanceof InterfaceC10493a)) {
            return 0.0f;
        }
        AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((InterfaceC10493a) interfaceC10494b).getMoveVerticalProgress();
    }

    public final String getPath() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            return interfaceC10494b.getPath();
        }
        return null;
    }

    public final Bitmap getScreenBitmap() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (!(interfaceC10494b instanceof InterfaceC10493a)) {
            return null;
        }
        AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
        return ((InterfaceC10493a) interfaceC10494b).getCurrentScreenBitmap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:14:0x0063, B:16:0x0069, B:18:0x0070, B:20:0x0085, B:24:0x00a4, B:23:0x0096), top: B:67:0x0063 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9528h(java.lang.String r8, p300x7.InterfaceC10570l r9, p300x7.InterfaceC10570l r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.merge.sketch.view.MergeSketchPlayView.m9528h(java.lang.String, x7.l, x7.l):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/merge/sketch/view/MergeSketchPlayView.smali:564
    }

    /* renamed from: i */
    public final void m9529i() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.pause();
        }
    }

    /* renamed from: j */
    public final void m9530j() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.release();
        }
    }

    /* renamed from: k */
    public final void m9531k(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.mo9509b(listener);
        }
    }

    /* renamed from: l */
    public final void m9532l() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.resume();
        }
    }

    /* renamed from: m */
    public final void m9533m(int i10, InterfaceC10570l onSuccess, InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.seekTo(i10, onSuccess, onFailure);
        }
    }

    /* renamed from: n */
    public final boolean m9534n(double d10) {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            return interfaceC10494b.mo9510c(d10);
        }
        return false;
    }

    /* renamed from: o */
    public final void m9535o() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.start();
        }
    }

    /* renamed from: p */
    public final PlayStatus m9536p() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            return interfaceC10494b.status();
        }
        return null;
    }

    /* renamed from: q */
    public final void m9537q() {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b != null) {
            interfaceC10494b.waiting();
        }
    }

    public final void setAreaMoveListener(IAreaMoveListener iAreaMoveListener) {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b instanceof InterfaceC10493a) {
            AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((InterfaceC10493a) interfaceC10494b).setAreaMoveListener(iAreaMoveListener);
        }
    }

    public final void setScaleEnable(boolean z10) {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b instanceof InterfaceC10493a) {
            AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((InterfaceC10493a) interfaceC10494b).setScaleEnable(z10);
        }
    }

    public final void setTranslateEnable(boolean z10) {
        InterfaceC10494b interfaceC10494b = this.f10383b;
        if (interfaceC10494b instanceof InterfaceC10493a) {
            AbstractC9133u.m16131e(interfaceC10494b, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy");
            ((InterfaceC10493a) interfaceC10494b).setTranslateEnable(z10);
        }
    }
}
