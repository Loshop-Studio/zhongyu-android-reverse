package com.xuexiang.xui.widget.imageview.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.Log;
import com.alibaba.fastjson.asm.Opcodes;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.xuexiang.xui.widget.imageview.edit.e */
/* loaded from: classes5.dex */
public class C8136e extends GLSurfaceView implements GLSurfaceView.Renderer {

    /* renamed from: c */
    public int[] f16170c;

    /* renamed from: d */
    public EffectContext f16171d;

    /* renamed from: e */
    public Effect f16172e;

    /* renamed from: f */
    public C8138g f16173f;

    /* renamed from: g */
    public int f16174g;

    /* renamed from: h */
    public int f16175h;

    /* renamed from: i */
    public boolean f16176i;

    /* renamed from: j */
    public PhotoFilter f16177j;

    /* renamed from: k */
    public Bitmap f16178k;

    /* renamed from: l */
    public boolean f16179l;

    /* renamed from: com.xuexiang.xui.widget.imageview.edit.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16180a;

        static {
            int[] iArr = new int[PhotoFilter.values().length];
            f16180a = iArr;
            try {
                iArr[PhotoFilter.AUTO_FIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16180a[PhotoFilter.BLACK_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16180a[PhotoFilter.BRIGHTNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16180a[PhotoFilter.CONTRAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16180a[PhotoFilter.CROSS_PROCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16180a[PhotoFilter.DOCUMENTARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16180a[PhotoFilter.DUE_TONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16180a[PhotoFilter.FILL_LIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16180a[PhotoFilter.FISH_EYE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16180a[PhotoFilter.FLIP_HORIZONTAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16180a[PhotoFilter.FLIP_VERTICAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16180a[PhotoFilter.GRAIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16180a[PhotoFilter.GRAY_SCALE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16180a[PhotoFilter.LOMISH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16180a[PhotoFilter.NEGATIVE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16180a[PhotoFilter.NONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16180a[PhotoFilter.POSTERIZE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16180a[PhotoFilter.ROTATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f16180a[PhotoFilter.SATURATE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16180a[PhotoFilter.SEPIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16180a[PhotoFilter.SHARPEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16180a[PhotoFilter.TEMPERATURE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16180a[PhotoFilter.TINT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16180a[PhotoFilter.VIGNETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public C8136e(Context context) {
        super(context);
        this.f16170c = new int[2];
        this.f16173f = new C8138g();
        this.f16176i = false;
        this.f16179l = false;
        m12755b();
    }

    /* renamed from: a */
    public final void m12754a() {
        Effect effect = this.f16172e;
        int[] iArr = this.f16170c;
        effect.apply(iArr[0], this.f16174g, this.f16175h, iArr[1]);
    }

    /* renamed from: b */
    public final void m12755b() {
        setEGLContextClientVersion(2);
        setRenderer(this);
        setRenderMode(0);
        m12760g(PhotoFilter.NONE);
    }

    /* renamed from: c */
    public final void m12756c() {
        Float fValueOf = Float.valueOf(0.5f);
        EffectFactory factory = this.f16171d.getFactory();
        Effect effect = this.f16172e;
        if (effect != null) {
            effect.release();
        }
        switch (a.f16180a[this.f16177j.ordinal()]) {
            case 1:
                Effect effectCreateEffect = factory.createEffect("android.media.effect.effects.AutoFixEffect");
                this.f16172e = effectCreateEffect;
                effectCreateEffect.setParameter("scale", fValueOf);
                break;
            case 2:
                Effect effectCreateEffect2 = factory.createEffect("android.media.effect.effects.BlackWhiteEffect");
                this.f16172e = effectCreateEffect2;
                effectCreateEffect2.setParameter("black", Float.valueOf(0.1f));
                this.f16172e.setParameter("white", Float.valueOf(0.7f));
                break;
            case 3:
                Effect effectCreateEffect3 = factory.createEffect("android.media.effect.effects.BrightnessEffect");
                this.f16172e = effectCreateEffect3;
                effectCreateEffect3.setParameter("brightness", Float.valueOf(2.0f));
                break;
            case 4:
                Effect effectCreateEffect4 = factory.createEffect("android.media.effect.effects.ContrastEffect");
                this.f16172e = effectCreateEffect4;
                effectCreateEffect4.setParameter("contrast", Float.valueOf(1.4f));
                break;
            case 5:
                this.f16172e = factory.createEffect("android.media.effect.effects.CrossProcessEffect");
                break;
            case 6:
                this.f16172e = factory.createEffect("android.media.effect.effects.DocumentaryEffect");
                break;
            case 7:
                Effect effectCreateEffect5 = factory.createEffect("android.media.effect.effects.DuotoneEffect");
                this.f16172e = effectCreateEffect5;
                effectCreateEffect5.setParameter("first_color", -256);
                this.f16172e.setParameter("second_color", -12303292);
                break;
            case 8:
                Effect effectCreateEffect6 = factory.createEffect("android.media.effect.effects.FillLightEffect");
                this.f16172e = effectCreateEffect6;
                effectCreateEffect6.setParameter("strength", Float.valueOf(0.8f));
                break;
            case 9:
                Effect effectCreateEffect7 = factory.createEffect("android.media.effect.effects.FisheyeEffect");
                this.f16172e = effectCreateEffect7;
                effectCreateEffect7.setParameter("scale", fValueOf);
                break;
            case 10:
                Effect effectCreateEffect8 = factory.createEffect("android.media.effect.effects.FlipEffect");
                this.f16172e = effectCreateEffect8;
                effectCreateEffect8.setParameter("horizontal", Boolean.TRUE);
                break;
            case 11:
                Effect effectCreateEffect9 = factory.createEffect("android.media.effect.effects.FlipEffect");
                this.f16172e = effectCreateEffect9;
                effectCreateEffect9.setParameter("vertical", Boolean.TRUE);
                break;
            case 12:
                Effect effectCreateEffect10 = factory.createEffect("android.media.effect.effects.GrainEffect");
                this.f16172e = effectCreateEffect10;
                effectCreateEffect10.setParameter("strength", Float.valueOf(1.0f));
                break;
            case 13:
                this.f16172e = factory.createEffect("android.media.effect.effects.GrayscaleEffect");
                break;
            case 14:
                this.f16172e = factory.createEffect("android.media.effect.effects.LomoishEffect");
                break;
            case 15:
                this.f16172e = factory.createEffect("android.media.effect.effects.NegativeEffect");
                break;
            case 17:
                this.f16172e = factory.createEffect("android.media.effect.effects.PosterizeEffect");
                break;
            case 18:
                Effect effectCreateEffect11 = factory.createEffect("android.media.effect.effects.RotateEffect");
                this.f16172e = effectCreateEffect11;
                effectCreateEffect11.setParameter("angle", Integer.valueOf(Opcodes.GETFIELD));
                break;
            case 19:
                Effect effectCreateEffect12 = factory.createEffect("android.media.effect.effects.SaturateEffect");
                this.f16172e = effectCreateEffect12;
                effectCreateEffect12.setParameter("scale", fValueOf);
                break;
            case 20:
                this.f16172e = factory.createEffect("android.media.effect.effects.SepiaEffect");
                break;
            case 21:
                this.f16172e = factory.createEffect("android.media.effect.effects.SharpenEffect");
                break;
            case 22:
                Effect effectCreateEffect13 = factory.createEffect("android.media.effect.effects.ColorTemperatureEffect");
                this.f16172e = effectCreateEffect13;
                effectCreateEffect13.setParameter("scale", Float.valueOf(0.9f));
                break;
            case 23:
                Effect effectCreateEffect14 = factory.createEffect("android.media.effect.effects.TintEffect");
                this.f16172e = effectCreateEffect14;
                effectCreateEffect14.setParameter("tint", -65281);
                break;
            case 24:
                Effect effectCreateEffect15 = factory.createEffect("android.media.effect.effects.VignetteEffect");
                this.f16172e = effectCreateEffect15;
                effectCreateEffect15.setParameter("scale", fValueOf);
                break;
        }
    }

    /* renamed from: d */
    public final void m12757d() {
        GLES20.glGenTextures(2, this.f16170c, 0);
        Bitmap bitmap = this.f16178k;
        if (bitmap != null) {
            this.f16174g = bitmap.getWidth();
            int height = this.f16178k.getHeight();
            this.f16175h = height;
            this.f16173f.m12767d(this.f16174g, height);
            GLES20.glBindTexture(3553, this.f16170c[0]);
            GLUtils.texImage2D(3553, 0, this.f16178k, 0);
            AbstractC8135d.m12752c();
        }
    }

    /* renamed from: e */
    public final void m12758e() {
        if (this.f16177j == PhotoFilter.NONE) {
            this.f16173f.m12766c(this.f16170c[0]);
        } else {
            this.f16173f.m12766c(this.f16170c[1]);
        }
    }

    /* renamed from: f */
    public void m12759f(AbstractC8134c abstractC8134c) {
        requestRender();
    }

    /* renamed from: g */
    public void m12760g(PhotoFilter photoFilter) {
        this.f16177j = photoFilter;
        requestRender();
    }

    /* renamed from: h */
    public void m12761h(Bitmap bitmap) {
        this.f16178k = bitmap;
        this.f16176i = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (!this.f16176i) {
            this.f16171d = EffectContext.createWithCurrentGlContext();
            this.f16173f.m12765b();
            m12757d();
            this.f16176i = true;
        }
        if (this.f16177j != PhotoFilter.NONE) {
            m12756c();
            m12754a();
        }
        m12758e();
        if (this.f16179l) {
            Log.e("ImageFilterView", "onDrawFrame: " + AbstractC8132a.m12749a(this, gl10));
            this.f16179l = false;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        C8138g c8138g = this.f16173f;
        if (c8138g != null) {
            c8138g.m12768e(i10, i11);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
