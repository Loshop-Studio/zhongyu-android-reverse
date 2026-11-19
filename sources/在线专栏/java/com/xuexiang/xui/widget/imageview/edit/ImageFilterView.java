package com.xuexiang.xui.widget.imageview.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.Map;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
class ImageFilterView extends GLSurfaceView implements GLSurfaceView.Renderer {
    private static final String TAG = "ImageFilterView";
    private boolean isSaveImage;
    private PhotoFilter mCurrentEffect;
    private CustomEffect mCustomEffect;
    private Effect mEffect;
    private EffectContext mEffectContext;
    private int mImageHeight;
    private int mImageWidth;
    private boolean mInitialized;
    private OnBitmapSaveListener mOnBitmapSaveListener;
    private Bitmap mSourceBitmap;
    private TextureRenderer mTexRenderer;
    private int[] mTextures;

    /* renamed from: com.xuexiang.xui.widget.imageview.edit.ImageFilterView$2 */
    static /* synthetic */ class C21812 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter;

        static {
            int[] iArr = new int[PhotoFilter.values().length];
            $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter = iArr;
            try {
                iArr[PhotoFilter.AUTO_FIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.BLACK_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.BRIGHTNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.CONTRAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.CROSS_PROCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.DOCUMENTARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.DUE_TONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.FILL_LIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.FISH_EYE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.FLIP_HORIZONTAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.FLIP_VERTICAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.GRAIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.GRAY_SCALE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.LOMISH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.NEGATIVE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.NONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.POSTERIZE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.ROTATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.SATURATE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.SEPIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.SHARPEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.TEMPERATURE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.TINT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[PhotoFilter.VIGNETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.mTextures = new int[2];
        this.mTexRenderer = new TextureRenderer();
        this.mInitialized = false;
        this.isSaveImage = false;
        init();
    }

    private void applyEffect() {
        Effect effect = this.mEffect;
        int[] iArr = this.mTextures;
        effect.apply(iArr[0], this.mImageWidth, this.mImageHeight, iArr[1]);
    }

    private void init() {
        setEGLContextClientVersion(2);
        setRenderer(this);
        setRenderMode(0);
        setFilterEffect(PhotoFilter.NONE);
    }

    private void initEffect() {
        EffectFactory factory = this.mEffectContext.getFactory();
        Effect effect = this.mEffect;
        if (effect != null) {
            effect.release();
        }
        CustomEffect customEffect = this.mCustomEffect;
        if (customEffect != null) {
            this.mEffect = factory.createEffect(customEffect.getEffectName());
            for (Map.Entry<String, Object> entry : this.mCustomEffect.getParameters().entrySet()) {
                this.mEffect.setParameter(entry.getKey(), entry.getValue());
            }
            return;
        }
        switch (C21812.$SwitchMap$com$xuexiang$xui$widget$imageview$edit$PhotoFilter[this.mCurrentEffect.ordinal()]) {
            case 1:
                Effect effectCreateEffect = factory.createEffect("android.media.effect.effects.AutoFixEffect");
                this.mEffect = effectCreateEffect;
                effectCreateEffect.setParameter("scale", Float.valueOf(0.5f));
                break;
            case 2:
                Effect effectCreateEffect2 = factory.createEffect("android.media.effect.effects.BlackWhiteEffect");
                this.mEffect = effectCreateEffect2;
                effectCreateEffect2.setParameter("black", Float.valueOf(0.1f));
                this.mEffect.setParameter("white", Float.valueOf(0.7f));
                break;
            case 3:
                Effect effectCreateEffect3 = factory.createEffect("android.media.effect.effects.BrightnessEffect");
                this.mEffect = effectCreateEffect3;
                effectCreateEffect3.setParameter("brightness", Float.valueOf(2.0f));
                break;
            case 4:
                Effect effectCreateEffect4 = factory.createEffect("android.media.effect.effects.ContrastEffect");
                this.mEffect = effectCreateEffect4;
                effectCreateEffect4.setParameter("contrast", Float.valueOf(1.4f));
                break;
            case 5:
                this.mEffect = factory.createEffect("android.media.effect.effects.CrossProcessEffect");
                break;
            case 6:
                this.mEffect = factory.createEffect("android.media.effect.effects.DocumentaryEffect");
                break;
            case 7:
                Effect effectCreateEffect5 = factory.createEffect("android.media.effect.effects.DuotoneEffect");
                this.mEffect = effectCreateEffect5;
                effectCreateEffect5.setParameter("first_color", -256);
                this.mEffect.setParameter("second_color", -12303292);
                break;
            case 8:
                Effect effectCreateEffect6 = factory.createEffect("android.media.effect.effects.FillLightEffect");
                this.mEffect = effectCreateEffect6;
                effectCreateEffect6.setParameter("strength", Float.valueOf(0.8f));
                break;
            case 9:
                Effect effectCreateEffect7 = factory.createEffect("android.media.effect.effects.FisheyeEffect");
                this.mEffect = effectCreateEffect7;
                effectCreateEffect7.setParameter("scale", Float.valueOf(0.5f));
                break;
            case 10:
                Effect effectCreateEffect8 = factory.createEffect("android.media.effect.effects.FlipEffect");
                this.mEffect = effectCreateEffect8;
                effectCreateEffect8.setParameter("horizontal", Boolean.TRUE);
                break;
            case 11:
                Effect effectCreateEffect9 = factory.createEffect("android.media.effect.effects.FlipEffect");
                this.mEffect = effectCreateEffect9;
                effectCreateEffect9.setParameter("vertical", Boolean.TRUE);
                break;
            case 12:
                Effect effectCreateEffect10 = factory.createEffect("android.media.effect.effects.GrainEffect");
                this.mEffect = effectCreateEffect10;
                effectCreateEffect10.setParameter("strength", Float.valueOf(1.0f));
                break;
            case 13:
                this.mEffect = factory.createEffect("android.media.effect.effects.GrayscaleEffect");
                break;
            case 14:
                this.mEffect = factory.createEffect("android.media.effect.effects.LomoishEffect");
                break;
            case 15:
                this.mEffect = factory.createEffect("android.media.effect.effects.NegativeEffect");
                break;
            case 17:
                this.mEffect = factory.createEffect("android.media.effect.effects.PosterizeEffect");
                break;
            case 18:
                Effect effectCreateEffect11 = factory.createEffect("android.media.effect.effects.RotateEffect");
                this.mEffect = effectCreateEffect11;
                effectCreateEffect11.setParameter("angle", 180);
                break;
            case 19:
                Effect effectCreateEffect12 = factory.createEffect("android.media.effect.effects.SaturateEffect");
                this.mEffect = effectCreateEffect12;
                effectCreateEffect12.setParameter("scale", Float.valueOf(0.5f));
                break;
            case 20:
                this.mEffect = factory.createEffect("android.media.effect.effects.SepiaEffect");
                break;
            case 21:
                this.mEffect = factory.createEffect("android.media.effect.effects.SharpenEffect");
                break;
            case 22:
                Effect effectCreateEffect13 = factory.createEffect("android.media.effect.effects.ColorTemperatureEffect");
                this.mEffect = effectCreateEffect13;
                effectCreateEffect13.setParameter("scale", Float.valueOf(0.9f));
                break;
            case 23:
                Effect effectCreateEffect14 = factory.createEffect("android.media.effect.effects.TintEffect");
                this.mEffect = effectCreateEffect14;
                effectCreateEffect14.setParameter("tint", -65281);
                break;
            case 24:
                Effect effectCreateEffect15 = factory.createEffect("android.media.effect.effects.VignetteEffect");
                this.mEffect = effectCreateEffect15;
                effectCreateEffect15.setParameter("scale", Float.valueOf(0.5f));
                break;
        }
    }

    private void loadTextures() {
        GLES20.glGenTextures(2, this.mTextures, 0);
        Bitmap bitmap = this.mSourceBitmap;
        if (bitmap != null) {
            this.mImageWidth = bitmap.getWidth();
            int height = this.mSourceBitmap.getHeight();
            this.mImageHeight = height;
            this.mTexRenderer.updateTextureSize(this.mImageWidth, height);
            GLES20.glBindTexture(3553, this.mTextures[0]);
            GLUtils.texImage2D(3553, 0, this.mSourceBitmap, 0);
            GLToolbox.initTexParams();
        }
    }

    private void renderResult() {
        if (this.mCurrentEffect == PhotoFilter.NONE && this.mCustomEffect == null) {
            this.mTexRenderer.renderTexture(this.mTextures[0]);
        } else {
            this.mTexRenderer.renderTexture(this.mTextures[1]);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) throws OutOfMemoryError {
        if (!this.mInitialized) {
            this.mEffectContext = EffectContext.createWithCurrentGlContext();
            this.mTexRenderer.init();
            loadTextures();
            this.mInitialized = true;
        }
        if (this.mCurrentEffect != PhotoFilter.NONE || this.mCustomEffect != null) {
            initEffect();
            applyEffect();
        }
        renderResult();
        if (this.isSaveImage) {
            final Bitmap bitmapCreateBitmapFromGLSurface = BitmapUtil.createBitmapFromGLSurface(this, gl10);
            Log.e(TAG, "onDrawFrame: " + bitmapCreateBitmapFromGLSurface);
            this.isSaveImage = false;
            if (this.mOnBitmapSaveListener != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xuexiang.xui.widget.imageview.edit.ImageFilterView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ImageFilterView.this.mOnBitmapSaveListener.onBitmapReady(bitmapCreateBitmapFromGLSurface);
                    }
                });
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i4, int i5) {
        TextureRenderer textureRenderer = this.mTexRenderer;
        if (textureRenderer != null) {
            textureRenderer.updateViewSize(i4, i5);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    void saveBitmap(OnBitmapSaveListener onBitmapSaveListener) {
        this.mOnBitmapSaveListener = onBitmapSaveListener;
        this.isSaveImage = true;
        requestRender();
    }

    void setFilterEffect(PhotoFilter photoFilter) {
        this.mCurrentEffect = photoFilter;
        this.mCustomEffect = null;
        requestRender();
    }

    void setSourceBitmap(Bitmap bitmap) {
        this.mSourceBitmap = bitmap;
        this.mInitialized = false;
    }

    void setFilterEffect(CustomEffect customEffect) {
        this.mCustomEffect = customEffect;
        requestRender();
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextures = new int[2];
        this.mTexRenderer = new TextureRenderer();
        this.mInitialized = false;
        this.isSaveImage = false;
        init();
    }
}
