package com.friday.common.camera;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11607p;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class CameraViewModel extends ViewModel {

    /* renamed from: a */
    public final InterfaceC11602k f5652a = AbstractC11608q.m25592b(0, 0, null, 7, null);

    /* renamed from: b */
    public float f5653b = 1.0f;

    /* renamed from: c */
    public final InterfaceC11602k f5654c;

    /* renamed from: d */
    public final InterfaceC11607p f5655d;

    /* renamed from: e */
    public Bitmap f5656e;

    public CameraViewModel() {
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f5654c = interfaceC11602kM25592b;
        this.f5655d = interfaceC11602kM25592b;
    }

    /* renamed from: b */
    public final void m4824b() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new CameraViewModel$cancelInCropPage$1(this, null), 3, null);
    }

    /* renamed from: c */
    public final InterfaceC11602k m4825c() {
        return this.f5652a;
    }

    /* renamed from: d */
    public final InterfaceC11607p m4826d() {
        return this.f5655d;
    }

    /* renamed from: e */
    public final float m4827e() {
        return this.f5653b;
    }

    /* renamed from: f */
    public final void m4828f(Bitmap bitmap) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        this.f5656e = bitmap;
    }

    /* renamed from: g */
    public final void m4829g(float f10) {
        this.f5653b = f10;
    }

    /* renamed from: h */
    public final void m4830h(float f10, float f11) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new CameraViewModel$updateAutoFocus$1(this, f10, f11, null), 3, null);
    }
}
