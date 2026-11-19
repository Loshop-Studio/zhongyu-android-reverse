package com.xuexiang.xui.widget.imageview.edit;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p185v7.AbstractC6683l;

/* renamed from: com.xuexiang.xui.widget.imageview.edit.f */
/* loaded from: classes3.dex */
public final class C4181f {

    /* renamed from: k */
    public static final float[] f4417k = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: l */
    public static final float[] f4418l = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f4419a;

    /* renamed from: b */
    public int f4420b;

    /* renamed from: c */
    public int f4421c;

    /* renamed from: d */
    public int f4422d;

    /* renamed from: e */
    public FloatBuffer f4423e;

    /* renamed from: f */
    public FloatBuffer f4424f;

    /* renamed from: g */
    public int f4425g;

    /* renamed from: h */
    public int f4426h;

    /* renamed from: i */
    public int f4427i;

    /* renamed from: j */
    public int f4428j;

    /* renamed from: a */
    public final void m3503a() {
        float f;
        FloatBuffer floatBuffer = this.f4424f;
        if (floatBuffer != null) {
            float f7 = (this.f4425g / this.f4426h) / (this.f4427i / this.f4428j);
            float f8 = 1.0f;
            float f9 = -1.0f;
            if (f7 > 1.0f) {
                float f10 = (-1.0f) / f7;
                float f11 = 1.0f / f7;
                f7 = 1.0f;
                f8 = f11;
                f9 = f10;
                f = -1.0f;
            } else {
                f = -f7;
            }
            floatBuffer.put(new float[]{f9, f, f8, f, f9, f7, f8, f7}).position(0);
        }
    }

    /* renamed from: b */
    public final void m3504b(int i) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(this.f4419a);
        AbstractC6683l.m6363c("glUseProgram");
        GLES20.glViewport(0, 0, this.f4425g, this.f4426h);
        AbstractC6683l.m6363c("glViewport");
        GLES20.glDisable(3042);
        GLES20.glVertexAttribPointer(this.f4421c, 2, 5126, false, 0, (Buffer) this.f4423e);
        GLES20.glEnableVertexAttribArray(this.f4421c);
        GLES20.glVertexAttribPointer(this.f4422d, 2, 5126, false, 0, (Buffer) this.f4424f);
        GLES20.glEnableVertexAttribArray(this.f4422d);
        AbstractC6683l.m6363c("vertex attribute setup");
        GLES20.glActiveTexture(33984);
        AbstractC6683l.m6363c("glActiveTexture");
        GLES20.glBindTexture(3553, i);
        AbstractC6683l.m6363c("glBindTexture");
        GLES20.glUniform1i(this.f4420b, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
    }
}
