package p274o7;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.shuyu.gsyvideoplayer.render.view.GSYSurfaceView;
import com.shuyu.gsyvideoplayer.render.view.GSYTextureView;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import java.io.File;
import p236l7.InterfaceC10155e;
import p236l7.InterfaceC10156f;
import p305q7.AbstractC10753a;
import p320r7.InterfaceC10913c;

/* renamed from: o7.a */
/* loaded from: classes5.dex */
public class C10447a {

    /* renamed from: a */
    public InterfaceC7529a f24852a;

    /* renamed from: a */
    public static void m21834a(ViewGroup viewGroup, View view) {
        int iM21835f = m21835f();
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM21835f, iM21835f);
            layoutParams.addRule(13);
            viewGroup.addView(view, layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iM21835f, iM21835f);
            layoutParams2.gravity = 17;
            viewGroup.addView(view, layoutParams2);
        }
    }

    /* renamed from: f */
    public static int m21835f() {
        return GSYVideoType.getShowType() != 0 ? -2 : -1;
    }

    /* renamed from: b */
    public void m21836b(Context context, ViewGroup viewGroup, int i10, InterfaceC10913c interfaceC10913c, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener, GSYVideoGLView.InterfaceC7528c interfaceC7528c, float[] fArr, AbstractC10753a abstractC10753a, int i11) {
        if (GSYVideoType.getRenderType() == 1) {
            this.f24852a = GSYSurfaceView.m9736e(context, viewGroup, i10, interfaceC10913c, measureFormVideoParamsListener);
        } else if (GSYVideoType.getRenderType() == 2) {
            this.f24852a = GSYVideoGLView.m9747e(context, viewGroup, i10, interfaceC10913c, measureFormVideoParamsListener, interfaceC7528c, fArr, abstractC10753a, i11);
        } else {
            this.f24852a = GSYTextureView.m9743e(context, viewGroup, i10, interfaceC10913c, measureFormVideoParamsListener);
        }
    }

    /* renamed from: c */
    public int m21837c() {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            return interfaceC7529a.getRenderView().getHeight();
        }
        return 0;
    }

    /* renamed from: d */
    public ViewGroup.LayoutParams m21838d() {
        return this.f24852a.getRenderView().getLayoutParams();
    }

    /* renamed from: e */
    public View m21839e() {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            return interfaceC7529a.getRenderView();
        }
        return null;
    }

    /* renamed from: g */
    public int m21840g() {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            return interfaceC7529a.getRenderView().getWidth();
        }
        return 0;
    }

    /* renamed from: h */
    public Bitmap m21841h() {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            return interfaceC7529a.mo9737a();
        }
        return null;
    }

    /* renamed from: i */
    public void m21842i() {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.mo9740d();
        }
    }

    /* renamed from: j */
    public void m21843j() {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.getRenderView().requestLayout();
        }
    }

    /* renamed from: k */
    public void m21844k(File file, boolean z10, InterfaceC10156f interfaceC10156f) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.mo9738b(file, z10, interfaceC10156f);
        }
    }

    /* renamed from: l */
    public void m21845l(GSYVideoGLView.InterfaceC7528c interfaceC7528c) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.setGLEffectFilter(interfaceC7528c);
        }
    }

    /* renamed from: m */
    public void m21846m(int i10) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.setRenderMode(i10);
        }
    }

    /* renamed from: n */
    public void m21847n(AbstractC10753a abstractC10753a) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.setGLRenderer(abstractC10753a);
        }
    }

    /* renamed from: o */
    public void m21848o(ViewGroup.LayoutParams layoutParams) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.getRenderView().setLayoutParams(layoutParams);
        }
    }

    /* renamed from: p */
    public void m21849p(float[] fArr) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.setGLMVPMatrix(fArr);
        }
    }

    /* renamed from: q */
    public void m21850q(float f10) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.getRenderView().setRotation(f10);
        }
    }

    /* renamed from: r */
    public void m21851r(InterfaceC10155e interfaceC10155e, boolean z10) {
        InterfaceC7529a interfaceC7529a = this.f24852a;
        if (interfaceC7529a != null) {
            interfaceC7529a.mo9739c(interfaceC10155e, z10);
        }
    }
}
