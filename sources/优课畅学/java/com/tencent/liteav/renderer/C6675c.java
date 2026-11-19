package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.work.Data;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.renderer.c */
/* loaded from: classes4.dex */
public class C6675c {

    /* renamed from: a */
    private final float[] f6070a;

    /* renamed from: b */
    private final float[] f6071b;

    /* renamed from: c */
    private FloatBuffer f6072c;

    /* renamed from: f */
    private int f6075f;

    /* renamed from: h */
    private int f6077h;

    /* renamed from: i */
    private int f6078i;

    /* renamed from: j */
    private int f6079j;

    /* renamed from: k */
    private int f6080k;

    /* renamed from: m */
    private boolean f6082m;

    /* renamed from: d */
    private float[] f6073d = new float[16];

    /* renamed from: e */
    private float[] f6074e = new float[16];

    /* renamed from: g */
    private int f6076g = -12345;

    /* renamed from: l */
    private boolean f6081l = false;

    /* renamed from: n */
    private boolean f6083n = false;

    /* renamed from: o */
    private int f6084o = -1;

    /* renamed from: p */
    private int f6085p = 0;

    /* renamed from: q */
    private int f6086q = 0;

    public C6675c(boolean z10) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f6070a = fArr;
        float[] fArr2 = {1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
        this.f6071b = fArr2;
        this.f6082m = z10;
        if (z10) {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f6072c = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(fArr).position(0);
        } else {
            FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f6072c = floatBufferAsFloatBuffer2;
            floatBufferAsFloatBuffer2.put(fArr2).position(0);
        }
        Matrix.setIdentityM(this.f6074e, 0);
    }

    /* renamed from: b */
    private void m5456b(int i10, int i11) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        if (this.f6081l) {
            this.f6081l = false;
            return;
        }
        GLES20.glUseProgram(this.f6075f);
        m5462a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i10, i11);
        this.f6072c.position(0);
        GLES20.glVertexAttribPointer(this.f6079j, 3, 5126, false, 20, (Buffer) this.f6072c);
        m5462a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f6079j);
        m5462a("glEnableVertexAttribArray maPositionHandle");
        this.f6072c.position(3);
        GLES20.glVertexAttribPointer(this.f6080k, 2, 5126, false, 20, (Buffer) this.f6072c);
        m5462a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f6080k);
        m5462a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f6073d, 0);
        GLES20.glUniformMatrix4fv(this.f6077h, 1, false, this.f6073d, 0);
        if (this.f6085p % 8 != 0) {
            Matrix.scaleM(this.f6074e, 0, ((r10 - 1) * 1.0f) / (((r10 + 7) / 8) * 8), 1.0f, 1.0f);
        }
        if (this.f6086q % 8 != 0) {
            Matrix.scaleM(this.f6074e, 0, 1.0f, ((r10 - 1) * 1.0f) / (((r10 + 7) / 8) * 8), 1.0f);
        }
        GLES20.glUniformMatrix4fv(this.f6078i, 1, false, this.f6074e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m5462a("glDrawArrays");
        GLES20.glFinish();
    }

    /* renamed from: d */
    private void m5457d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i10 = iArr[0];
        this.f6076g = i10;
        GLES20.glBindTexture(36197, i10);
        m5462a("glBindTexture mTextureID");
    }

    /* renamed from: a */
    public int m5458a() {
        return this.f6076g;
    }

    /* renamed from: c */
    public void m5464c() {
        int i10 = this.f6075f;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        GLES20.glDeleteTextures(1, new int[]{this.f6076g}, 0);
        this.f6076g = -1;
    }

    /* renamed from: a */
    public void m5461a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return;
        }
        m5462a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f6074e);
        m5456b(36197, this.f6076g);
    }

    /* renamed from: a */
    public void m5459a(int i10, int i11) {
        this.f6085p = i10;
        this.f6086q = i11;
    }

    /* renamed from: a */
    public void m5460a(int i10, boolean z10, int i11) {
        if (this.f6083n != z10 || this.f6084o != i11) {
            this.f6083n = z10;
            this.f6084o = i11;
            float[] fArr = new float[20];
            for (int i12 = 0; i12 < 20; i12++) {
                fArr[i12] = this.f6071b[i12];
            }
            if (this.f6083n) {
                fArr[0] = -fArr[0];
                fArr[5] = -fArr[5];
                fArr[10] = -fArr[10];
                fArr[15] = -fArr[15];
            }
            int i13 = i11 / 90;
            for (int i14 = 0; i14 < i13; i14++) {
                float f10 = fArr[3];
                float f11 = fArr[4];
                fArr[3] = fArr[8];
                fArr[4] = fArr[9];
                fArr[8] = fArr[18];
                fArr[9] = fArr[19];
                fArr[18] = fArr[13];
                fArr[19] = fArr[14];
                fArr[13] = f10;
                fArr[14] = f11;
            }
            this.f6072c.clear();
            this.f6072c.put(fArr).position(0);
        }
        m5456b(3553, i10);
    }

    /* renamed from: a */
    private int m5454a(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        m5462a("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m4991e("TXCOesTextureRender", "Could not compile shader " + i10 + ":");
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        TXCLog.m4991e("TXCOesTextureRender", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* renamed from: b */
    public void m5463b() {
        if (this.f6082m) {
            this.f6075f = m5455a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f6075f = m5455a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i10 = this.f6075f;
        if (i10 == 0) {
            TXCLog.m4991e("TXCOesTextureRender", "failed creating program");
            return;
        }
        this.f6079j = GLES20.glGetAttribLocation(i10, "aPosition");
        m5462a("glGetAttribLocation aPosition");
        if (this.f6079j == -1) {
            TXCLog.m4991e("TXCOesTextureRender", "Could not get attrib location for aPosition");
            return;
        }
        this.f6080k = GLES20.glGetAttribLocation(this.f6075f, "aTextureCoord");
        m5462a("glGetAttribLocation aTextureCoord");
        if (this.f6080k == -1) {
            TXCLog.m4991e("TXCOesTextureRender", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f6077h = GLES20.glGetUniformLocation(this.f6075f, "uMVPMatrix");
        m5462a("glGetUniformLocation uMVPMatrix");
        if (this.f6077h == -1) {
            TXCLog.m4991e("TXCOesTextureRender", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f6078i = GLES20.glGetUniformLocation(this.f6075f, "uSTMatrix");
        m5462a("glGetUniformLocation uSTMatrix");
        if (this.f6078i == -1) {
            TXCLog.m4991e("TXCOesTextureRender", "Could not get attrib location for uSTMatrix");
            return;
        }
        if (this.f6082m) {
            m5457d();
        }
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m5462a("glTexParameter");
    }

    /* renamed from: a */
    private int m5455a(String str, String str2) {
        int iM5454a;
        int iM5454a2 = m5454a(35633, str);
        if (iM5454a2 == 0 || (iM5454a = m5454a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m5462a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            TXCLog.m4991e("TXCOesTextureRender", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM5454a2);
        m5462a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM5454a);
        m5462a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        TXCLog.m4991e("TXCOesTextureRender", "Could not link program: ");
        TXCLog.m4991e("TXCOesTextureRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* renamed from: a */
    public void m5462a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            TXCLog.m4991e("TXCOesTextureRender", str + ": glError " + iGlGetError);
        }
    }
}
