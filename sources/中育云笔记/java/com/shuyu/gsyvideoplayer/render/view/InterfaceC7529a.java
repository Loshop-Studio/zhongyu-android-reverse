package com.shuyu.gsyvideoplayer.render.view;

import android.graphics.Bitmap;
import android.view.View;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import java.io.File;
import p236l7.InterfaceC10155e;
import p236l7.InterfaceC10156f;
import p305q7.AbstractC10753a;

/* renamed from: com.shuyu.gsyvideoplayer.render.view.a */
/* loaded from: classes5.dex */
public interface InterfaceC7529a {
    /* renamed from: a */
    Bitmap mo9737a();

    /* renamed from: b */
    void mo9738b(File file, boolean z10, InterfaceC10156f interfaceC10156f);

    /* renamed from: c */
    void mo9739c(InterfaceC10155e interfaceC10155e, boolean z10);

    /* renamed from: d */
    void mo9740d();

    View getRenderView();

    void setGLEffectFilter(GSYVideoGLView.InterfaceC7528c interfaceC7528c);

    void setGLMVPMatrix(float[] fArr);

    void setGLRenderer(AbstractC10753a abstractC10753a);

    void setRenderMode(int i10);
}
