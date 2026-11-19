package com.shuyu.gsyvideoplayer.render.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.FileUtils;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import java.io.File;
import p236l7.InterfaceC10155e;
import p236l7.InterfaceC10156f;
import p274o7.C10447a;
import p291p7.C10635a;
import p305q7.AbstractC10753a;
import p305q7.C10754b;
import p320r7.InterfaceC10911a;
import p320r7.InterfaceC10912b;
import p320r7.InterfaceC10913c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class GSYVideoGLView extends GLSurfaceView implements InterfaceC10911a, InterfaceC7529a, MeasureHelper.MeasureFormVideoParamsListener {

    /* renamed from: c */
    public AbstractC10753a f12802c;

    /* renamed from: d */
    public Context f12803d;

    /* renamed from: e */
    public InterfaceC7528c f12804e;

    /* renamed from: f */
    public MeasureHelper.MeasureFormVideoParamsListener f12805f;

    /* renamed from: g */
    public MeasureHelper f12806g;

    /* renamed from: h */
    public InterfaceC10911a f12807h;

    /* renamed from: i */
    public InterfaceC10913c f12808i;

    /* renamed from: j */
    public float[] f12809j;

    /* renamed from: k */
    public int f12810k;

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView$a */
    public class C7526a implements InterfaceC10155e {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10156f f12811a;

        /* renamed from: b */
        public final /* synthetic */ File f12812b;

        public C7526a(InterfaceC10156f interfaceC10156f, File file) {
            this.f12811a = interfaceC10156f;
            this.f12812b = file;
        }

        @Override // p236l7.InterfaceC10155e
        /* renamed from: a */
        public void mo9746a(Bitmap bitmap) {
            if (bitmap == null) {
                this.f12811a.result(false, this.f12812b);
            } else {
                FileUtils.saveBitmap(bitmap, this.f12812b);
                this.f12811a.result(true, this.f12812b);
            }
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView$b */
    public class C7527b implements InterfaceC10912b {

        /* renamed from: a */
        public final /* synthetic */ Context f12814a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f12815b;

        /* renamed from: c */
        public final /* synthetic */ int f12816c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC10913c f12817d;

        /* renamed from: e */
        public final /* synthetic */ MeasureHelper.MeasureFormVideoParamsListener f12818e;

        /* renamed from: f */
        public final /* synthetic */ int f12819f;

        public C7527b(Context context, ViewGroup viewGroup, int i10, InterfaceC10913c interfaceC10913c, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener, int i11) {
            this.f12814a = context;
            this.f12815b = viewGroup;
            this.f12816c = i10;
            this.f12817d = interfaceC10913c;
            this.f12818e = measureFormVideoParamsListener;
            this.f12819f = i11;
        }

        @Override // p320r7.InterfaceC10912b
        /* renamed from: a */
        public void mo9753a(AbstractC10753a abstractC10753a, String str, int i10, boolean z10) {
            if (z10) {
                GSYVideoGLView.m9747e(this.f12814a, this.f12815b, this.f12816c, this.f12817d, this.f12818e, abstractC10753a.mo22827d(), abstractC10753a.m22828e(), abstractC10753a, this.f12819f);
            }
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView$c */
    public interface InterfaceC7528c {
        /* renamed from: a */
        String mo9754a(GLSurfaceView gLSurfaceView);
    }

    public GSYVideoGLView(Context context) {
        super(context);
        this.f12804e = new C10635a();
        this.f12810k = 0;
        m9748f(context);
    }

    /* renamed from: e */
    public static GSYVideoGLView m9747e(Context context, ViewGroup viewGroup, int i10, InterfaceC10913c interfaceC10913c, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener, InterfaceC7528c interfaceC7528c, float[] fArr, AbstractC10753a abstractC10753a, int i11) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        GSYVideoGLView gSYVideoGLView = new GSYVideoGLView(context);
        if (abstractC10753a != null) {
            gSYVideoGLView.setCustomRenderer(abstractC10753a);
        }
        gSYVideoGLView.setEffect(interfaceC7528c);
        gSYVideoGLView.setVideoParamsListener(measureFormVideoParamsListener);
        gSYVideoGLView.setRenderMode(i11);
        gSYVideoGLView.setIGSYSurfaceListener(interfaceC10913c);
        gSYVideoGLView.setRotation(i10);
        gSYVideoGLView.m9749g();
        gSYVideoGLView.setGSYVideoGLRenderErrorListener(new C7527b(context, viewGroup, i10, interfaceC10913c, measureFormVideoParamsListener, i11));
        if (fArr != null && fArr.length == 16) {
            gSYVideoGLView.setMVPMatrix(fArr);
        } else if (i10 != 0) {
            Matrix.rotateM(gSYVideoGLView.getRenderer().m22828e(), 0, -i10, 0.0f, 0.0f, 1.0f);
        }
        C10447a.m21834a(viewGroup, gSYVideoGLView);
        return gSYVideoGLView;
    }

    /* renamed from: f */
    private void m9748f(Context context) {
        this.f12803d = context;
        setEGLContextClientVersion(2);
        this.f12802c = new C10754b();
        this.f12806g = new MeasureHelper(this, this);
        this.f12802c.m22841r(this);
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: a */
    public Bitmap mo9737a() {
        Debuger.printfLog(getClass().getSimpleName() + " not support initCover now");
        return null;
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: b */
    public void mo9738b(File file, boolean z10, InterfaceC10156f interfaceC10156f) {
        m9751i(new C7526a(interfaceC10156f, file), z10);
        m9752j();
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: c */
    public void mo9739c(InterfaceC10155e interfaceC10155e, boolean z10) {
        if (interfaceC10155e != null) {
            m9751i(interfaceC10155e, z10);
            m9752j();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: d */
    public void mo9740d() {
        requestLayout();
        onResume();
    }

    /* renamed from: g */
    public void m9749g() {
        setRenderer(this.f12802c);
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoHeight() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12805f;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getCurrentVideoHeight();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoWidth() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12805f;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getCurrentVideoWidth();
        }
        return 0;
    }

    public InterfaceC7528c getEffect() {
        return this.f12804e;
    }

    public InterfaceC10913c getIGSYSurfaceListener() {
        return this.f12808i;
    }

    public float[] getMVPMatrix() {
        return this.f12809j;
    }

    public int getMode() {
        return this.f12810k;
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public View getRenderView() {
        return this;
    }

    public AbstractC10753a getRenderer() {
        return this.f12802c;
    }

    public int getSizeH() {
        return getHeight();
    }

    public int getSizeW() {
        return getWidth();
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarDen() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12805f;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarNum() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12805f;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getVideoSarNum();
        }
        return 0;
    }

    /* renamed from: h */
    public void m9750h() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12805f;
        if (measureFormVideoParamsListener == null || this.f12810k != 1) {
            return;
        }
        try {
            int currentVideoWidth = measureFormVideoParamsListener.getCurrentVideoWidth();
            int currentVideoHeight = this.f12805f.getCurrentVideoHeight();
            AbstractC10753a abstractC10753a = this.f12802c;
            if (abstractC10753a != null) {
                abstractC10753a.m22835l(this.f12806g.getMeasuredWidth());
                this.f12802c.m22834k(this.f12806g.getMeasuredHeight());
                this.f12802c.m22833j(currentVideoWidth);
                this.f12802c.m22832i(currentVideoHeight);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m9751i(InterfaceC10155e interfaceC10155e, boolean z10) {
        this.f12802c.mo22839p(interfaceC10155e, z10);
    }

    /* renamed from: j */
    public void m9752j() {
        this.f12802c.mo22842s();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f12810k != 1) {
            this.f12806g.prepareMeasure(i10, i11, (int) getRotation());
            setMeasuredDimension(this.f12806g.getMeasuredWidth(), this.f12806g.getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
            this.f12806g.prepareMeasure(i10, i11, (int) getRotation());
            m9750h();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        AbstractC10753a abstractC10753a = this.f12802c;
        if (abstractC10753a != null) {
            abstractC10753a.m22829f();
        }
    }

    @Override // p320r7.InterfaceC10911a
    public void onSurfaceAvailable(Surface surface) {
        InterfaceC10913c interfaceC10913c = this.f12808i;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceAvailable(surface);
        }
    }

    public void setCustomRenderer(AbstractC10753a abstractC10753a) {
        this.f12802c = abstractC10753a;
        abstractC10753a.m22841r(this);
        m9750h();
    }

    public void setEffect(InterfaceC7528c interfaceC7528c) {
        if (interfaceC7528c != null) {
            this.f12804e = interfaceC7528c;
            this.f12802c.mo22836m(interfaceC7528c);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setGLEffectFilter(InterfaceC7528c interfaceC7528c) {
        setEffect(interfaceC7528c);
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setGLMVPMatrix(float[] fArr) {
        setMVPMatrix(fArr);
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setGLRenderer(AbstractC10753a abstractC10753a) {
        setCustomRenderer(abstractC10753a);
    }

    public void setGSYVideoGLRenderErrorListener(InterfaceC10912b interfaceC10912b) {
        this.f12802c.m22838o(interfaceC10912b);
    }

    public void setIGSYSurfaceListener(InterfaceC10913c interfaceC10913c) {
        setOnGSYSurfaceListener(this);
        this.f12808i = interfaceC10913c;
    }

    public void setMVPMatrix(float[] fArr) {
        if (fArr != null) {
            this.f12809j = fArr;
            this.f12802c.m22840q(fArr);
        }
    }

    public void setMode(int i10) {
        this.f12810k = i10;
    }

    public void setOnGSYSurfaceListener(InterfaceC10911a interfaceC10911a) {
        this.f12807h = interfaceC10911a;
        this.f12802c.m22837n(interfaceC10911a);
    }

    @Override // android.opengl.GLSurfaceView, com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setRenderMode(int i10) {
        setMode(i10);
    }

    public void setRenderTransform(android.graphics.Matrix matrix) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setRenderTransform now");
    }

    public void setVideoParamsListener(MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener) {
        this.f12805f = measureFormVideoParamsListener;
    }

    public GSYVideoGLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12804e = new C10635a();
        this.f12810k = 0;
        m9748f(context);
    }
}
