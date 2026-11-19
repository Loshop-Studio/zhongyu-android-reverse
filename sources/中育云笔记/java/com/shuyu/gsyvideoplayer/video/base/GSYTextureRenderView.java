package com.shuyu.gsyvideoplayer.video.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import p274o7.C10447a;
import p291p7.C10635a;
import p305q7.AbstractC10753a;
import p320r7.InterfaceC10913c;

/* loaded from: classes5.dex */
public abstract class GSYTextureRenderView extends FrameLayout implements InterfaceC10913c, MeasureHelper.MeasureFormVideoParamsListener {
    protected GSYVideoGLView.InterfaceC7528c mEffectFilter;
    protected Bitmap mFullPauseBitmap;
    protected float[] mMatrixGL;
    protected int mMode;
    protected AbstractC10753a mRenderer;
    protected int mRotate;
    protected Surface mSurface;
    protected C10447a mTextureView;
    protected ViewGroup mTextureViewContainer;

    public GSYTextureRenderView(@NonNull Context context) {
        super(context);
        this.mEffectFilter = new C10635a();
        this.mMatrixGL = null;
        this.mMode = 0;
    }

    public void addTextureView() {
        C10447a c10447a = new C10447a();
        this.mTextureView = c10447a;
        c10447a.m21836b(getContext(), this.mTextureViewContainer, this.mRotate, this, this, this.mEffectFilter, this.mMatrixGL, this.mRenderer, this.mMode);
    }

    public void changeTextureViewShowType() {
        if (this.mTextureView != null) {
            int textureParams = getTextureParams();
            ViewGroup.LayoutParams layoutParamsM21838d = this.mTextureView.m21838d();
            layoutParamsM21838d.width = textureParams;
            layoutParamsM21838d.height = textureParams;
            this.mTextureView.m21848o(layoutParamsM21838d);
        }
    }

    public GSYVideoGLView.InterfaceC7528c getEffectFilter() {
        return this.mEffectFilter;
    }

    public C10447a getRenderProxy() {
        return this.mTextureView;
    }

    public int getTextureParams() {
        return GSYVideoType.getShowType() != 0 ? -2 : -1;
    }

    public void initCover() {
        C10447a c10447a = this.mTextureView;
        if (c10447a != null) {
            this.mFullPauseBitmap = c10447a.m21841h();
        }
    }

    @Override // p320r7.InterfaceC10913c
    public void onSurfaceAvailable(Surface surface) {
        C10447a c10447a = this.mTextureView;
        pauseLogic(surface, c10447a != null && (c10447a.m21839e() instanceof TextureView));
    }

    @Override // p320r7.InterfaceC10913c
    public boolean onSurfaceDestroyed(Surface surface) {
        setDisplay(null);
        releaseSurface(surface);
        return true;
    }

    @Override // p320r7.InterfaceC10913c
    public void onSurfaceSizeChanged(Surface surface, int i10, int i11) {
    }

    @Override // p320r7.InterfaceC10913c
    public void onSurfaceUpdated(Surface surface) {
        releasePauseCover();
    }

    public void pauseLogic(Surface surface, boolean z10) {
        this.mSurface = surface;
        if (z10) {
            showPauseCover();
        }
        setDisplay(this.mSurface);
    }

    public abstract void releasePauseCover();

    public abstract void releaseSurface(Surface surface);

    public void setCustomGLRenderer(AbstractC10753a abstractC10753a) {
        this.mRenderer = abstractC10753a;
        C10447a c10447a = this.mTextureView;
        if (c10447a != null) {
            c10447a.m21847n(abstractC10753a);
        }
    }

    public abstract void setDisplay(Surface surface);

    public void setEffectFilter(GSYVideoGLView.InterfaceC7528c interfaceC7528c) {
        this.mEffectFilter = interfaceC7528c;
        C10447a c10447a = this.mTextureView;
        if (c10447a != null) {
            c10447a.m21845l(interfaceC7528c);
        }
    }

    public void setGLRenderMode(int i10) {
        this.mMode = i10;
        C10447a c10447a = this.mTextureView;
        if (c10447a != null) {
            c10447a.m21846m(i10);
        }
    }

    public void setMatrixGL(float[] fArr) {
        this.mMatrixGL = fArr;
        C10447a c10447a = this.mTextureView;
        if (c10447a != null) {
            c10447a.m21849p(fArr);
        }
    }

    public abstract void setSmallVideoTextureView();

    public void setSmallVideoTextureView(View.OnTouchListener onTouchListener) {
        this.mTextureViewContainer.setOnTouchListener(onTouchListener);
        this.mTextureViewContainer.setOnClickListener(null);
        setSmallVideoTextureView();
    }

    public abstract void showPauseCover();

    public GSYTextureRenderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEffectFilter = new C10635a();
        this.mMatrixGL = null;
        this.mMode = 0;
    }

    public GSYTextureRenderView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        this.mEffectFilter = new C10635a();
        this.mMatrixGL = null;
        this.mMode = 0;
    }
}
