package com.shuyu.gsyvideoplayer.render.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.PixelCopy;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import java.io.File;
import p236l7.InterfaceC10155e;
import p236l7.InterfaceC10156f;
import p274o7.C10447a;
import p305q7.AbstractC10753a;
import p320r7.InterfaceC10913c;

/* loaded from: classes5.dex */
public class GSYSurfaceView extends SurfaceView implements SurfaceHolder.Callback2, InterfaceC7529a, MeasureHelper.MeasureFormVideoParamsListener {

    /* renamed from: c */
    public InterfaceC10913c f12787c;

    /* renamed from: d */
    public MeasureHelper.MeasureFormVideoParamsListener f12788d;

    /* renamed from: e */
    public MeasureHelper f12789e;

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYSurfaceView$a */
    public class PixelCopyOnPixelCopyFinishedListenerC7524a implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10155e f12790a;

        /* renamed from: b */
        public final /* synthetic */ Bitmap f12791b;

        /* renamed from: c */
        public final /* synthetic */ HandlerThread f12792c;

        public PixelCopyOnPixelCopyFinishedListenerC7524a(InterfaceC10155e interfaceC10155e, Bitmap bitmap, HandlerThread handlerThread) {
            this.f12790a = interfaceC10155e;
            this.f12791b = bitmap;
            this.f12792c = handlerThread;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f12790a.mo9746a(this.f12791b);
            }
            this.f12792c.quitSafely();
        }
    }

    public GSYSurfaceView(Context context) {
        super(context);
        m9741f();
    }

    /* renamed from: e */
    public static GSYSurfaceView m9736e(Context context, ViewGroup viewGroup, int i10, InterfaceC10913c interfaceC10913c, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        GSYSurfaceView gSYSurfaceView = new GSYSurfaceView(context);
        gSYSurfaceView.setIGSYSurfaceListener(interfaceC10913c);
        gSYSurfaceView.setVideoParamsListener(measureFormVideoParamsListener);
        gSYSurfaceView.setRotation(i10);
        C10447a.m21834a(viewGroup, gSYSurfaceView);
        return gSYSurfaceView;
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: a */
    public Bitmap mo9737a() {
        if (getSizeW() <= 0 || getSizeH() <= 0) {
            return null;
        }
        return Bitmap.createBitmap(getSizeW(), getSizeH(), Bitmap.Config.RGB_565);
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: b */
    public void mo9738b(File file, boolean z10, InterfaceC10156f interfaceC10156f) {
        Debuger.printfLog(getClass().getSimpleName() + " not support saveFrame now, use taskShotPic");
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: c */
    public void mo9739c(InterfaceC10155e interfaceC10155e, boolean z10) {
        Bitmap bitmapM9742g = z10 ? m9742g() : mo9737a();
        try {
            HandlerThread handlerThread = new HandlerThread("PixelCopier");
            handlerThread.start();
            PixelCopy.request(this, bitmapM9742g, new PixelCopyOnPixelCopyFinishedListenerC7524a(interfaceC10155e, bitmapM9742g, handlerThread), new Handler());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    /* renamed from: d */
    public void mo9740d() {
        Debuger.printfLog(getClass().getSimpleName() + " not support onRenderResume now");
    }

    /* renamed from: f */
    public final void m9741f() {
        this.f12789e = new MeasureHelper(this, this);
    }

    /* renamed from: g */
    public Bitmap m9742g() {
        if (getSizeW() <= 0 || getSizeH() <= 0) {
            return null;
        }
        return Bitmap.createBitmap(getSizeW(), getSizeH(), Bitmap.Config.ARGB_8888);
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoHeight() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12788d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getCurrentVideoHeight();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoWidth() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12788d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getCurrentVideoWidth();
        }
        return 0;
    }

    public InterfaceC10913c getIGSYSurfaceListener() {
        return this.f12787c;
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
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12788d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getVideoSarDen();
        }
        return 0;
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarNum() {
        MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener = this.f12788d;
        if (measureFormVideoParamsListener != null) {
            return measureFormVideoParamsListener.getVideoSarNum();
        }
        return 0;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f12789e.prepareMeasure(i10, i11, (int) getRotation());
        setMeasuredDimension(this.f12789e.getMeasuredWidth(), this.f12789e.getMeasuredHeight());
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
        getHolder().addCallback(this);
        this.f12787c = interfaceC10913c;
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.InterfaceC7529a
    public void setRenderMode(int i10) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setRenderMode now");
    }

    public void setRenderTransform(Matrix matrix) {
        Debuger.printfLog(getClass().getSimpleName() + " not support setRenderTransform now");
    }

    public void setVideoParamsListener(MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener) {
        this.f12788d = measureFormVideoParamsListener;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        InterfaceC10913c interfaceC10913c = this.f12787c;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceSizeChanged(surfaceHolder.getSurface(), i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        InterfaceC10913c interfaceC10913c = this.f12787c;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceAvailable(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        InterfaceC10913c interfaceC10913c = this.f12787c;
        if (interfaceC10913c != null) {
            interfaceC10913c.onSurfaceDestroyed(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public GSYSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9741f();
    }
}
