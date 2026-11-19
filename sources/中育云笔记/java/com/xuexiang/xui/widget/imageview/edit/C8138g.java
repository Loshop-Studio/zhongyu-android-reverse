package com.xuexiang.xui.widget.imageview.edit;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.xuexiang.xui.widget.imageview.edit.g */
/* loaded from: classes5.dex */
public class C8138g {

    /* renamed from: k */
    public static final float[] f16183k = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: l */
    public static final float[] f16184l = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f16185a;

    /* renamed from: b */
    public int f16186b;

    /* renamed from: c */
    public int f16187c;

    /* renamed from: d */
    public int f16188d;

    /* renamed from: e */
    public FloatBuffer f16189e;

    /* renamed from: f */
    public FloatBuffer f16190f;

    /* renamed from: g */
    public int f16191g;

    /* renamed from: h */
    public int f16192h;

    /* renamed from: i */
    public int f16193i;

    /* renamed from: j */
    public int f16194j;

    /* renamed from: a */
    public final void m12764a() {
        float f10;
        FloatBuffer floatBuffer = this.f16190f;
        if (floatBuffer != null) {
            float f11 = (this.f16191g / this.f16192h) / (this.f16193i / this.f16194j);
            float f12 = 1.0f;
            float f13 = -1.0f;
            if (f11 > 1.0f) {
                float f14 = (-1.0f) / f11;
                float f15 = 1.0f / f11;
                f11 = 1.0f;
                f12 = f15;
                f13 = f14;
                f10 = -1.0f;
            } else {
                f10 = -f11;
            }
            floatBuffer.put(new float[]{f13, f10, f12, f10, f13, f11, f12, f11}).position(0);
        }
    }

    /* renamed from: b */
    public void m12765b() {
        int iM12751b = AbstractC8135d.m12751b("attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n", "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n");
        this.f16185a = iM12751b;
        this.f16186b = GLES20.glGetUniformLocation(iM12751b, "tex_sampler");
        this.f16187c = GLES20.glGetAttribLocation(this.f16185a, "a_texcoord");
        this.f16188d = GLES20.glGetAttribLocation(this.f16185a, "a_position");
        float[] fArr = f16183k;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f16189e = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f16184l;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f16190f = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
    }

    /* renamed from: c */
    public void m12766c(int i10) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(this.f16185a);
        AbstractC8135d.m12750a("glUseProgram");
        GLES20.glViewport(0, 0, this.f16191g, this.f16192h);
        AbstractC8135d.m12750a("glViewport");
        GLES20.glDisable(3042);
        GLES20.glVertexAttribPointer(this.f16187c, 2, 5126, false, 0, (Buffer) this.f16189e);
        GLES20.glEnableVertexAttribArray(this.f16187c);
        GLES20.glVertexAttribPointer(this.f16188d, 2, 5126, false, 0, (Buffer) this.f16190f);
        GLES20.glEnableVertexAttribArray(this.f16188d);
        AbstractC8135d.m12750a("vertex attribute setup");
        GLES20.glActiveTexture(33984);
        AbstractC8135d.m12750a("glActiveTexture");
        GLES20.glBindTexture(3553, i10);
        AbstractC8135d.m12750a("glBindTexture");
        GLES20.glUniform1i(this.f16186b, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: d */
    public void m12767d(int i10, int i11) {
        this.f16193i = i10;
        this.f16194j = i11;
        m12764a();
    }

    /* renamed from: e */
    public void m12768e(int i10, int i11) {
        this.f16191g = i10;
        this.f16192h = i11;
        m12764a();
    }
}
