package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.support.v4.media.AbstractC0037f;
import androidx.core.view.InputDeviceCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p185v7.AbstractC6683l;

/* renamed from: com.xuexiang.xui.widget.imageview.edit.d */
/* loaded from: classes3.dex */
public final class C4179d extends GLSurfaceView implements GLSurfaceView.Renderer {

    /* renamed from: a */
    public int[] f4406a;

    /* renamed from: b */
    public EffectContext f4407b;

    /* renamed from: c */
    public Effect f4408c;

    /* renamed from: d */
    public C4181f f4409d;

    /* renamed from: e */
    public int f4410e;

    /* renamed from: f */
    public int f4411f;

    /* renamed from: g */
    public boolean f4412g;

    /* renamed from: h */
    public PhotoFilter f4413h;

    /* renamed from: i */
    public Bitmap f4414i;

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int iM6377q;
        int iGlCreateProgram;
        int[] iArr = this.f4406a;
        C4181f c4181f = this.f4409d;
        if (!this.f4412g) {
            this.f4407b = EffectContext.createWithCurrentGlContext();
            c4181f.getClass();
            int iM6377q2 = AbstractC6683l.m6377q(35633, "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n");
            if (iM6377q2 == 0 || (iM6377q = AbstractC6683l.m6377q(35632, "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n")) == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iM6377q2);
                    AbstractC6683l.m6363c("glAttachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM6377q);
                    AbstractC6683l.m6363c("glAttachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    if (iArr2[0] != 1) {
                        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        throw new RuntimeException(AbstractC0037f.m85j("Could not link program: ", strGlGetProgramInfoLog));
                    }
                }
            }
            c4181f.f4419a = iGlCreateProgram;
            c4181f.f4420b = GLES20.glGetUniformLocation(iGlCreateProgram, "tex_sampler");
            c4181f.f4421c = GLES20.glGetAttribLocation(c4181f.f4419a, "a_texcoord");
            c4181f.f4422d = GLES20.glGetAttribLocation(c4181f.f4419a, "a_position");
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            c4181f.f4423e = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(C4181f.f4417k).position(0);
            FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            c4181f.f4424f = floatBufferAsFloatBuffer2;
            floatBufferAsFloatBuffer2.put(C4181f.f4418l).position(0);
            GLES20.glGenTextures(2, iArr, 0);
            Bitmap bitmap = this.f4414i;
            if (bitmap != null) {
                this.f4410e = bitmap.getWidth();
                int height = this.f4414i.getHeight();
                this.f4411f = height;
                c4181f.f4427i = this.f4410e;
                c4181f.f4428j = height;
                c4181f.m3503a();
                GLES20.glBindTexture(3553, iArr[0]);
                GLUtils.texImage2D(3553, 0, this.f4414i, 0);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
            }
            this.f4412g = true;
        }
        PhotoFilter photoFilter = this.f4413h;
        PhotoFilter photoFilter2 = PhotoFilter.NONE;
        if (photoFilter != photoFilter2) {
            Float fValueOf = Float.valueOf(0.5f);
            EffectFactory factory = this.f4407b.getFactory();
            Effect effect = this.f4408c;
            if (effect != null) {
                effect.release();
            }
            switch (AbstractC4178c.f4405a[this.f4413h.ordinal()]) {
                case 1:
                    Effect effectCreateEffect = factory.createEffect("android.media.effect.effects.AutoFixEffect");
                    this.f4408c = effectCreateEffect;
                    effectCreateEffect.setParameter("scale", fValueOf);
                    break;
                case 2:
                    Effect effectCreateEffect2 = factory.createEffect("android.media.effect.effects.BlackWhiteEffect");
                    this.f4408c = effectCreateEffect2;
                    effectCreateEffect2.setParameter("black", Float.valueOf(0.1f));
                    this.f4408c.setParameter("white", Float.valueOf(0.7f));
                    break;
                case 3:
                    Effect effectCreateEffect3 = factory.createEffect("android.media.effect.effects.BrightnessEffect");
                    this.f4408c = effectCreateEffect3;
                    effectCreateEffect3.setParameter("brightness", Float.valueOf(2.0f));
                    break;
                case 4:
                    Effect effectCreateEffect4 = factory.createEffect("android.media.effect.effects.ContrastEffect");
                    this.f4408c = effectCreateEffect4;
                    effectCreateEffect4.setParameter("contrast", Float.valueOf(1.4f));
                    break;
                case 5:
                    this.f4408c = factory.createEffect("android.media.effect.effects.CrossProcessEffect");
                    break;
                case 6:
                    this.f4408c = factory.createEffect("android.media.effect.effects.DocumentaryEffect");
                    break;
                case 7:
                    Effect effectCreateEffect5 = factory.createEffect("android.media.effect.effects.DuotoneEffect");
                    this.f4408c = effectCreateEffect5;
                    effectCreateEffect5.setParameter("first_color", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
                    this.f4408c.setParameter("second_color", -12303292);
                    break;
                case 8:
                    Effect effectCreateEffect6 = factory.createEffect("android.media.effect.effects.FillLightEffect");
                    this.f4408c = effectCreateEffect6;
                    effectCreateEffect6.setParameter("strength", Float.valueOf(0.8f));
                    break;
                case 9:
                    Effect effectCreateEffect7 = factory.createEffect("android.media.effect.effects.FisheyeEffect");
                    this.f4408c = effectCreateEffect7;
                    effectCreateEffect7.setParameter("scale", fValueOf);
                    break;
                case 10:
                    Effect effectCreateEffect8 = factory.createEffect("android.media.effect.effects.FlipEffect");
                    this.f4408c = effectCreateEffect8;
                    effectCreateEffect8.setParameter("horizontal", Boolean.TRUE);
                    break;
                case 11:
                    Effect effectCreateEffect9 = factory.createEffect("android.media.effect.effects.FlipEffect");
                    this.f4408c = effectCreateEffect9;
                    effectCreateEffect9.setParameter("vertical", Boolean.TRUE);
                    break;
                case 12:
                    Effect effectCreateEffect10 = factory.createEffect("android.media.effect.effects.GrainEffect");
                    this.f4408c = effectCreateEffect10;
                    effectCreateEffect10.setParameter("strength", Float.valueOf(1.0f));
                    break;
                case 13:
                    this.f4408c = factory.createEffect("android.media.effect.effects.GrayscaleEffect");
                    break;
                case 14:
                    this.f4408c = factory.createEffect("android.media.effect.effects.LomoishEffect");
                    break;
                case 15:
                    this.f4408c = factory.createEffect("android.media.effect.effects.NegativeEffect");
                    break;
                case 17:
                    this.f4408c = factory.createEffect("android.media.effect.effects.PosterizeEffect");
                    break;
                case 18:
                    Effect effectCreateEffect11 = factory.createEffect("android.media.effect.effects.RotateEffect");
                    this.f4408c = effectCreateEffect11;
                    effectCreateEffect11.setParameter("angle", 180);
                    break;
                case 19:
                    Effect effectCreateEffect12 = factory.createEffect("android.media.effect.effects.SaturateEffect");
                    this.f4408c = effectCreateEffect12;
                    effectCreateEffect12.setParameter("scale", fValueOf);
                    break;
                case 20:
                    this.f4408c = factory.createEffect("android.media.effect.effects.SepiaEffect");
                    break;
                case 21:
                    this.f4408c = factory.createEffect("android.media.effect.effects.SharpenEffect");
                    break;
                case 22:
                    Effect effectCreateEffect13 = factory.createEffect("android.media.effect.effects.ColorTemperatureEffect");
                    this.f4408c = effectCreateEffect13;
                    effectCreateEffect13.setParameter("scale", Float.valueOf(0.9f));
                    break;
                case 23:
                    Effect effectCreateEffect14 = factory.createEffect("android.media.effect.effects.TintEffect");
                    this.f4408c = effectCreateEffect14;
                    effectCreateEffect14.setParameter("tint", -65281);
                    break;
                case 24:
                    Effect effectCreateEffect15 = factory.createEffect("android.media.effect.effects.VignetteEffect");
                    this.f4408c = effectCreateEffect15;
                    effectCreateEffect15.setParameter("scale", fValueOf);
                    break;
            }
            this.f4408c.apply(iArr[0], this.f4410e, this.f4411f, iArr[1]);
        }
        if (this.f4413h == photoFilter2) {
            c4181f.m3504b(iArr[0]);
        } else {
            c4181f.m3504b(iArr[1]);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i8) {
        C4181f c4181f = this.f4409d;
        if (c4181f != null) {
            c4181f.f4425g = i;
            c4181f.f4426h = i8;
            c4181f.m3503a();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
