package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.work.Data;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXLiveConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.slf4j.Marker;

/* renamed from: com.tencent.liteav.renderer.h */
/* loaded from: classes4.dex */
public class C6680h {

    /* renamed from: a */
    public static int f6157a = 1;

    /* renamed from: b */
    public static int f6158b = 2;

    /* renamed from: o */
    private boolean f6171o;

    /* renamed from: p */
    private final float[] f6172p;

    /* renamed from: q */
    private FloatBuffer f6173q;

    /* renamed from: t */
    private int f6176t;

    /* renamed from: w */
    private int f6179w;

    /* renamed from: x */
    private int f6180x;

    /* renamed from: y */
    private int f6181y;

    /* renamed from: z */
    private int f6182z;

    /* renamed from: c */
    private int f6159c = 0;

    /* renamed from: d */
    private int f6160d = 0;

    /* renamed from: e */
    private int f6161e = 0;

    /* renamed from: f */
    private int f6162f = 0;

    /* renamed from: g */
    private int f6163g = f6158b;

    /* renamed from: h */
    private int f6164h = 0;

    /* renamed from: i */
    private boolean f6165i = false;

    /* renamed from: j */
    private float[] f6166j = new float[16];

    /* renamed from: k */
    private float[] f6167k = new float[16];

    /* renamed from: l */
    private float f6168l = 1.0f;

    /* renamed from: m */
    private float f6169m = 1.0f;

    /* renamed from: n */
    private boolean f6170n = false;

    /* renamed from: r */
    private float[] f6174r = new float[16];

    /* renamed from: s */
    private float[] f6175s = new float[16];

    /* renamed from: u */
    private int f6177u = -12345;

    /* renamed from: v */
    private int f6178v = -12345;

    public C6680h(Boolean bool) {
        this.f6171o = true;
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f6172p = fArr;
        this.f6171o = bool.booleanValue();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f6173q = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f6175s, 0);
    }

    /* renamed from: e */
    private void m5517e() {
        int i10 = this.f6178v;
        if (i10 != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
            this.f6178v = -12345;
        }
        int i11 = this.f6177u;
        if (i11 != -12345) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.f6177u = -12345;
        }
    }

    /* renamed from: a */
    public void m5519a(int i10, int i11) {
        if (i10 == this.f6159c && i11 == this.f6160d) {
            return;
        }
        TXCLog.m4994i("TXTweenFilter", "Output resolution change: " + this.f6159c + Marker.ANY_MARKER + this.f6160d + " -> " + i10 + Marker.ANY_MARKER + i11);
        this.f6159c = i10;
        this.f6160d = i11;
        if (i10 > i11) {
            Matrix.orthoM(this.f6166j, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f6168l = 1.0f;
            this.f6169m = 1.0f;
        } else {
            Matrix.orthoM(this.f6166j, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f6168l = 1.0f;
            this.f6169m = 1.0f;
        }
        this.f6170n = true;
    }

    /* renamed from: b */
    public void m5525b(int i10, int i11) {
        if (i10 == this.f6161e && i11 == this.f6162f) {
            return;
        }
        TXCLog.m4994i("TXTweenFilter", "Input resolution change: " + this.f6161e + Marker.ANY_MARKER + this.f6162f + " -> " + i10 + Marker.ANY_MARKER + i11);
        this.f6161e = i10;
        this.f6162f = i11;
    }

    /* renamed from: c */
    public void m5527c(int i10) {
        GLES20.glViewport(0, 0, this.f6159c, this.f6160d);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f6176t);
        m5514a("glUseProgram");
        if (this.f6171o) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
        } else {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i10);
        }
        this.f6173q.position(0);
        GLES20.glVertexAttribPointer(this.f6181y, 3, 5126, false, 20, (Buffer) this.f6173q);
        m5514a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f6181y);
        m5514a("glEnableVertexAttribArray maPositionHandle");
        this.f6173q.position(3);
        GLES20.glVertexAttribPointer(this.f6182z, 2, 5126, false, 20, (Buffer) this.f6173q);
        m5514a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f6182z);
        m5514a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f6174r, 0);
        m5515b(this.f6174r);
        GLES20.glUniformMatrix4fv(this.f6179w, 1, false, this.f6174r, 0);
        GLES20.glUniformMatrix4fv(this.f6180x, 1, false, this.f6175s, 0);
        m5514a("glDrawArrays");
        GLES20.glDrawArrays(5, 0, 4);
        m5514a("glDrawArrays");
        if (this.f6171o) {
            GLES20.glBindTexture(36197, 0);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: d */
    public int m5528d(int i10) {
        m5516d();
        int i11 = this.f6178v;
        if (i11 == -12345) {
            TXCLog.m4989d("TXTweenFilter", "invalid frame buffer id");
            return i10;
        }
        GLES20.glBindFramebuffer(36160, i11);
        m5527c(i10);
        GLES20.glBindFramebuffer(36160, 0);
        return this.f6177u;
    }

    /* renamed from: b */
    public void m5524b(int i10) {
        this.f6164h = i10;
    }

    /* renamed from: b */
    private void m5515b(float[] fArr) {
        int i10;
        int i11 = this.f6160d;
        if (i11 == 0 || (i10 = this.f6159c) == 0) {
            return;
        }
        int i12 = this.f6161e;
        int i13 = this.f6162f;
        int i14 = this.f6164h;
        if (i14 == 270 || i14 == 90) {
            i13 = i12;
            i12 = i13;
        }
        float f10 = i12;
        float f11 = (i10 * 1.0f) / f10;
        float f12 = i13;
        float f13 = (i11 * 1.0f) / f12;
        if (this.f6163g != f6157a ? f11 * f12 > i11 : f11 * f12 <= i11) {
            f11 = f13;
        }
        Matrix.setIdentityM(this.f6167k, 0);
        if (this.f6165i) {
            if (this.f6164h % TXLiveConstants.RENDER_ROTATION_180 == 0) {
                Matrix.scaleM(this.f6167k, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(this.f6167k, 0, 1.0f, -1.0f, 1.0f);
            }
        }
        Matrix.scaleM(this.f6167k, 0, ((f10 * f11) / this.f6159c) * 1.0f, ((f12 * f11) / this.f6160d) * 1.0f, 1.0f);
        Matrix.rotateM(this.f6167k, 0, this.f6164h, 0.0f, 0.0f, -1.0f);
        Matrix.multiplyMM(fArr, 0, this.f6166j, 0, this.f6167k, 0);
    }

    /* renamed from: d */
    private void m5516d() {
        if (this.f6170n) {
            TXCLog.m4994i("TXTweenFilter", "reloadFrameBuffer. size = " + this.f6159c + Marker.ANY_MARKER + this.f6160d);
            m5517e();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.f6177u = iArr[0];
            this.f6178v = iArr2[0];
            TXCLog.m4989d("TXTweenFilter", "frameBuffer id = " + this.f6178v + ", texture id = " + this.f6177u);
            GLES20.glBindTexture(3553, this.f6177u);
            m5514a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(3553, 0, 6408, this.f6159c, this.f6160d, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            m5514a("glTexParameter");
            GLES20.glBindFramebuffer(36160, this.f6178v);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f6177u, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.f6170n = false;
        }
    }

    /* renamed from: a */
    public boolean m5522a() {
        return this.f6171o;
    }

    /* renamed from: a */
    public void m5518a(int i10) {
        this.f6163g = i10;
    }

    /* renamed from: a */
    public void m5520a(boolean z10) {
        this.f6165i = z10;
    }

    /* renamed from: a */
    public void m5521a(float[] fArr) {
        this.f6175s = fArr;
    }

    /* renamed from: a */
    private int m5512a(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        m5514a("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m4991e("TXTweenFilter", "Could not compile shader " + i10 + ":");
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        TXCLog.m4991e("TXTweenFilter", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* renamed from: b */
    public void m5523b() {
        if (this.f6171o) {
            this.f6176t = m5513a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f6176t = m5513a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i10 = this.f6176t;
        if (i10 == 0) {
            TXCLog.m4991e("TXTweenFilter", "failed creating program");
            return;
        }
        this.f6181y = GLES20.glGetAttribLocation(i10, "aPosition");
        m5514a("glGetAttribLocation aPosition");
        if (this.f6181y == -1) {
            TXCLog.m4991e("TXTweenFilter", "Could not get attrib location for aPosition");
            return;
        }
        this.f6182z = GLES20.glGetAttribLocation(this.f6176t, "aTextureCoord");
        m5514a("glGetAttribLocation aTextureCoord");
        if (this.f6182z == -1) {
            TXCLog.m4991e("TXTweenFilter", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f6179w = GLES20.glGetUniformLocation(this.f6176t, "uMVPMatrix");
        m5514a("glGetUniformLocation uMVPMatrix");
        if (this.f6179w == -1) {
            TXCLog.m4991e("TXTweenFilter", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f6180x = GLES20.glGetUniformLocation(this.f6176t, "uSTMatrix");
        m5514a("glGetUniformLocation uSTMatrix");
        if (this.f6180x == -1) {
            TXCLog.m4991e("TXTweenFilter", "Could not get attrib location for uSTMatrix");
        }
    }

    /* renamed from: a */
    private int m5513a(String str, String str2) {
        int iM5512a;
        int iM5512a2 = m5512a(35633, str);
        if (iM5512a2 == 0 || (iM5512a = m5512a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m5514a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            TXCLog.m4991e("TXTweenFilter", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM5512a2);
        m5514a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM5512a);
        m5514a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        TXCLog.m4991e("TXTweenFilter", "Could not link program: ");
        TXCLog.m4991e("TXTweenFilter", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* renamed from: c */
    public void m5526c() {
        GLES20.glDeleteProgram(this.f6176t);
        m5517e();
    }

    /* renamed from: a */
    private void m5514a(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            TXCLog.m4991e("TXTweenFilter", str + ": glError " + iGlGetError);
        }
    }
}
