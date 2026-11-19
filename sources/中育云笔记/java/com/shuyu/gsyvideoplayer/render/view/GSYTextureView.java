package com.shuyu.gsyvideoplayer.render.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.FileUtils;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import java.io.File;
import p236l7.InterfaceC10155e;
import p236l7.InterfaceC10156f;
import p274o7.C10447a;
import p305q7.AbstractC10753a;
import p320r7.InterfaceC10913c;

/* loaded from: classes5.dex */
public class GSYTextureView extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC7529a, MeasureHelper.MeasureFormVideoParamsListener {

    /* renamed from: c */
    public InterfaceC10913c f12794c;

    /* renamed from: d */
    public MeasureHelper.MeasureFormVideoParamsListener f12795d;

    /* renamed from: e */
    public MeasureHelper f12796e;

    /* renamed from: f */
    public SurfaceTexture f12797f;

    /* renamed from: g */
    public Surface f12798g;

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYTextureView$a */
    public class C7525a implements InterfaceC10155e {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10156f f12799a;

        /* renamed from: b */
        public final /* synthetic */ File f12800b;

        public C7525a(InterfaceC10156f interfaceC10156f, File file) {
            this.f12799a = interfaceC10156f;
            this.f12800b = file;
        }

        @Override // p236l7.InterfaceC10155e
        /* renamed from: a */
        public void mo9746a(Bitmap bitmap) {
            if (bitmap == null) {
                this.f12799a.result(false, this.f12800b);
            } else {
                FileUtils.saveBitmap(bitmap, this.f12800b);
                this.f12799a.result(true, this.f12800b);
            }
        }
    }

    public GSYTextureView(Context context) {
        super(context);
        m9744f();
    }

    /* renamed from: e */
    public static GSYTextureView m9743e(Context context, ViewGroup viewGroup, int i10, InterfaceC10913c interfaceC10913c, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        GSYTextureView gSYTextureView = new GSYTextureView(context);
        gSYTextureView.setIGSYSurfaceListener(interfaceC10913c);
        gSYTextureView.setVideoParamsListener(measureFormVideoParamsListener);
        gSYTextureView.setRotation(i10);
        C10447a.m21834a(viewGroup, gSYTextureView);
        return gSYTextureView;
    }

    /* renamed from: f */
    private void m9744f() {
        this.f12796e = new MeasureHelper(this, this);
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: a */
    public Bitmap mo9737a() {
        if (getSizeW() <= 0 || getSizeH() <= 0) {
            return null;
        }
        return getBitmap(Bitmap.createBitmap(getSizeW(), getSizeH(), Bitmap.Config.RGB_565));
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: b */
    public void mo9738b(File file, boolean z10, InterfaceC10156f interfaceC10156f) {
        C7525a c7525a = new C7525a(interfaceC10156f, file);
        if (z10) {
            c7525a.mo9746a(m9745g());
        } else {
            c7525a.mo9746a(mo9737a());
        }
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: c */
    public void mo9739c(InterfaceC10155e interfaceC10155e, boolean z10) {
        if (z10) {
            interfaceC10155e.mo9746a(m9745g());
        } else {
            interfaceC10155e.mo9746a(mo9737a());
        }
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: d */
    public void mo9740d() {
        Debuger.printfLog(getClass().getSimpleName() + " not support onRenderResume now");
    }

    /* renamed from: g */
    public Bitmap m9745g() {
        if (getSizeW() <= 0 || getSizeH() <= 0) {
            return null;
        }
        return getBitmap(Bitmap.createBitmap(getSizeW(), getSizeH(), Bitmap.Config.ARGB_8888));
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoHeight() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12795d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getCurrentVideoHeight();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoWidth() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12795d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getCurrentVideoWidth();
        }
        return 0;
    }

    public InterfaceC10913c getIGSYSurfaceListener() {
        return this.f12794c;
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public View getRenderView() {
        return this;
    }

    public int getSizeH() {
        return getHeight();
    }

    public int getSizeW() {
        return getWidth();
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarDen() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12795d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarNum() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12795d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getVideoSarNum();
        }
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f12796e.prepareMeasure(i10, i11, (int) getRotation());
        setMeasuredDimension(this.f12796e.getMeasuredWidth(), this.f12796e.getMeasuredHeight());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!GSYVideoType.isMediaCodecTexture()) {
            Surface surface = new Surface(surfaceTexture);
            this.f12798g = surface;
            InterfaceC10913c interfaceC10913c = this.f12794c;
            if (interfaceC10913c != null) {
                interfaceC10913c.onSurfaceAvailable(surface);
                return;
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = this.f12797f;
        if (surfaceTexture2 == null) {
            this.f12797f = surfaceTexture;
            this.f12798g = new Surface(surfaceTexture);
        } else {
            setSurfaceTexture(surfaceTexture2);
        }
        InterfaceC10913c interfaceC10913c2 = this.f12794c;
        if (interfaceC10913c2 != null) {
            interfaceC10913c2.onSurfaceAvailable(this.f12798g);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        InterfaceC10913c interfaceC10913c = this.f12794c;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceDestroyed(this.f12798g);
        }
        return !GSYVideoType.isMediaCodecTexture() || this.f12797f == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        InterfaceC10913c interfaceC10913c = this.f12794c;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceSizeChanged(this.f12798g, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        InterfaceC10913c interfaceC10913c = this.f12794c;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceUpdated(this.f12798g);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setGLEffectFilter(GSYVideoGLView.InterfaceC7528c interfaceC7528c) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setGLEffectFilter now");
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setGLMVPMatrix(float[] fArr) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setGLMVPMatrix now");
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setGLRenderer(AbstractC10753a abstractC10753a) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setGLRenderer now");
    }

    public void setIGSYSurfaceListener(InterfaceC10913c interfaceC10913c) {
        setSurfaceTextureListener(this);
        this.f12794c = interfaceC10913c;
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setRenderMode(int i10) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setRenderMode now");
    }

    public void setRenderTransform(Matrix matrix) {
        setTransform(matrix);
    }

    public void setVideoParamsListener(MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener) {
        this.f12795d = measureFormVideoParamsListener;
    }

    public GSYTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9744f();
    }
}
