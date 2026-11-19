package com.tencent.liteav.basic.p048c;

import android.opengl.GLES20;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* renamed from: com.tencent.liteav.basic.c.f */
/* loaded from: classes4.dex */
public class C6565f {

    /* renamed from: a */
    protected int f5237a;

    /* renamed from: b */
    protected int f5238b;

    /* renamed from: c */
    protected int f5239c;

    /* renamed from: d */
    protected int f5240d;

    /* renamed from: e */
    protected int f5241e;

    /* renamed from: f */
    protected int f5242f;

    /* renamed from: g */
    protected boolean f5243g;

    /* renamed from: h */
    protected FloatBuffer f5244h;

    /* renamed from: i */
    protected FloatBuffer f5245i;

    /* renamed from: j */
    protected float[] f5246j;

    /* renamed from: k */
    protected float[] f5247k;

    /* renamed from: l */
    protected a f5248l;

    /* renamed from: m */
    protected int f5249m;

    /* renamed from: n */
    protected int f5250n;

    /* renamed from: o */
    protected boolean f5251o;

    /* renamed from: p */
    protected boolean f5252p;

    /* renamed from: q */
    protected boolean f5253q;

    /* renamed from: r */
    private final LinkedList<Runnable> f5254r;

    /* renamed from: s */
    private final String f5255s;

    /* renamed from: t */
    private final String f5256t;

    /* renamed from: u */
    private boolean f5257u;

    /* renamed from: v */
    private int f5258v;

    /* renamed from: w */
    private float[] f5259w;

    /* renamed from: com.tencent.liteav.basic.c.f$a */
    public interface a {
        /* renamed from: a */
        void mo4699a(int i10);
    }

    public C6565f() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }

    /* renamed from: a */
    public boolean mo4842a() {
        int iM4862a = C6566g.m4862a(this.f5255s, this.f5256t);
        this.f5237a = iM4862a;
        if (iM4862a == 0 || !mo4845b()) {
            this.f5243g = false;
        } else {
            this.f5243g = true;
        }
        mo4846c();
        return this.f5243g;
    }

    /* renamed from: b */
    public boolean mo4845b() {
        this.f5238b = GLES20.glGetAttribLocation(this.f5237a, RequestParameters.POSITION);
        this.f5239c = GLES20.glGetUniformLocation(this.f5237a, "inputImageTexture");
        this.f5258v = GLES20.glGetUniformLocation(this.f5237a, "textureTransform");
        this.f5240d = GLES20.glGetAttribLocation(this.f5237a, "inputTextureCoordinate");
        return true;
    }

    /* renamed from: c */
    public void mo4846c() {
    }

    /* renamed from: d */
    public void m4847d() {
        GLES20.glDeleteProgram(this.f5237a);
        m4848e();
        this.f5243g = false;
    }

    /* renamed from: e */
    public void m4848e() {
        m4849f();
        this.f5242f = -1;
        this.f5241e = -1;
    }

    /* renamed from: f */
    public void m4849f() {
        int i10 = this.f5249m;
        if (i10 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
            this.f5249m = -1;
        }
        int i11 = this.f5250n;
        if (i11 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.f5250n = -1;
        }
    }

    /* renamed from: g */
    public void m4850g() {
        if (this.f5247k != null) {
            for (int i10 = 0; i10 < 8; i10 += 2) {
                float[] fArr = this.f5247k;
                fArr[i10] = 1.0f - fArr[i10];
            }
            m4841a(this.f5246j, this.f5247k);
        }
    }

    /* renamed from: h */
    public void m4851h() {
        if (this.f5247k != null) {
            for (int i10 = 1; i10 < 8; i10 += 2) {
                float[] fArr = this.f5247k;
                fArr[i10] = 1.0f - fArr[i10];
            }
            m4841a(this.f5246j, this.f5247k);
        }
    }

    /* renamed from: i */
    public void m4852i() {
    }

    /* renamed from: j */
    public void m4853j() {
    }

    /* renamed from: k */
    public void m4854k() {
        while (!this.f5254r.isEmpty()) {
            this.f5254r.removeFirst().run();
        }
    }

    /* renamed from: l */
    public int m4855l() {
        return this.f5250n;
    }

    /* renamed from: m */
    public int m4856m() {
        return this.f5241e;
    }

    /* renamed from: n */
    public int m4857n() {
        return this.f5242f;
    }

    public C6565f(String str, String str2) {
        this(str, str2, false);
    }

    public C6565f(String str, String str2, boolean z10) {
        this.f5257u = false;
        this.f5258v = -1;
        this.f5259w = null;
        this.f5249m = -1;
        this.f5250n = -1;
        this.f5251o = false;
        this.f5252p = false;
        this.f5253q = false;
        this.f5254r = new LinkedList<>();
        this.f5255s = str;
        this.f5256t = str2;
        this.f5253q = z10;
        if (true == z10) {
            TXCLog.m4994i("TXCGPUFilter", "set Oes fileter");
        }
        float[] fArr = C6568i.f5283e;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f5244h = floatBufferAsFloatBuffer;
        this.f5246j = fArr;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f5245i = ByteBuffer.allocateDirect(C6568i.f5279a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float[] fArrM4866a = C6568i.m4866a(EnumC6567h.NORMAL, false, true);
        this.f5247k = fArrM4866a;
        this.f5245i.put(fArrM4866a).position(0);
    }

    /* renamed from: b */
    public int m4844b(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f5243g) {
            return -1;
        }
        m4837a(i10, floatBuffer, floatBuffer2);
        if (this.f5248l == null) {
            return 1;
        }
        this.f5248l.mo4699a(i10);
        return 1;
    }

    /* renamed from: a */
    public void m4840a(boolean z10) {
        this.f5251o = z10;
    }

    /* renamed from: a */
    public void m4838a(a aVar) {
        this.f5257u = aVar != null;
        this.f5248l = aVar;
    }

    /* renamed from: b */
    public int m4843b(int i10) {
        return m4833a(i10, this.f5249m, this.f5250n);
    }

    /* renamed from: a */
    public void mo4835a(int i10, int i11) {
        if (this.f5242f == i11 && this.f5241e == i10) {
            return;
        }
        this.f5241e = i10;
        this.f5242f = i11;
        if (this.f5251o) {
            if (this.f5249m != -1) {
                m4849f();
            }
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f5249m = iArr[0];
            this.f5250n = C6566g.m4859a(i10, i11, 6408, 6408);
            GLES20.glBindFramebuffer(36160, this.f5249m);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f5250n, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* renamed from: a */
    public void m4837a(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        float[] fArr;
        GLES20.glUseProgram(this.f5237a);
        m4854k();
        if (this.f5243g) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f5238b, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f5238b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f5240d, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f5240d);
            int i11 = this.f5258v;
            if (i11 >= 0 && (fArr = this.f5259w) != null) {
                GLES20.glUniformMatrix4fv(i11, 1, false, fArr, 0);
            }
            if (i10 != -1) {
                GLES20.glActiveTexture(33984);
                if (true == this.f5253q) {
                    GLES20.glBindTexture(36197, i10);
                } else {
                    GLES20.glBindTexture(3553, i10);
                }
                GLES20.glUniform1i(this.f5239c, 0);
            }
            m4852i();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f5238b);
            GLES20.glDisableVertexAttribArray(this.f5240d);
            m4853j();
            if (true == this.f5253q) {
                GLES20.glBindTexture(36197, 0);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
        }
    }

    /* renamed from: a */
    public int m4832a(int i10) {
        return m4844b(i10, this.f5244h, this.f5245i);
    }

    /* renamed from: a */
    public int m4833a(int i10, int i11, int i12) {
        if (!this.f5243g) {
            return -1;
        }
        GLES20.glBindFramebuffer(36160, i11);
        m4837a(i10, this.f5244h, this.f5245i);
        if (this.f5248l != null) {
            this.f5248l.mo4699a(i12);
        }
        GLES20.glBindFramebuffer(36160, 0);
        return i12;
    }

    /* renamed from: a */
    public void m4841a(float[] fArr, float[] fArr2) {
        this.f5246j = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(C6568i.f5283e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f5244h = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f5247k = fArr2;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(C6568i.f5279a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f5245i = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
    }

    /* renamed from: a */
    public void m4836a(int i10, int i11, int i12, float[] fArr, float f10, boolean z10, boolean z11) {
        float[] fArrM4866a = fArr == null ? C6568i.m4866a(EnumC6567h.NORMAL, false, true) : fArr;
        int i13 = i10;
        float f11 = i13;
        int i14 = i11;
        float f12 = i14;
        float f13 = f11 / f12;
        if (f13 > f10) {
            i13 = (int) (f12 * f10);
        } else if (f13 < f10) {
            i14 = (int) (f11 / f10);
        }
        float f14 = (1.0f - (i13 / f11)) / 2.0f;
        float f15 = (1.0f - (i14 / f12)) / 2.0f;
        for (int i15 = 0; i15 < fArrM4866a.length / 2; i15++) {
            int i16 = i15 * 2;
            float f16 = fArrM4866a[i16];
            if (f16 < 0.5f) {
                fArrM4866a[i16] = f16 + f14;
            } else {
                fArrM4866a[i16] = f16 - f14;
            }
            int i17 = i16 + 1;
            float f17 = fArrM4866a[i17];
            if (f17 < 0.5f) {
                fArrM4866a[i17] = f17 + f15;
            } else {
                fArrM4866a[i17] = f17 - f15;
            }
        }
        int i18 = i12 / 90;
        for (int i19 = 0; i19 < i18; i19++) {
            float f18 = fArrM4866a[0];
            float f19 = fArrM4866a[1];
            fArrM4866a[0] = fArrM4866a[2];
            fArrM4866a[1] = fArrM4866a[3];
            fArrM4866a[2] = fArrM4866a[6];
            fArrM4866a[3] = fArrM4866a[7];
            fArrM4866a[6] = fArrM4866a[4];
            fArrM4866a[7] = fArrM4866a[5];
            fArrM4866a[4] = f18;
            fArrM4866a[5] = f19;
        }
        if (i18 == 0 || i18 == 2) {
            if (z10) {
                fArrM4866a[0] = 1.0f - fArrM4866a[0];
                fArrM4866a[2] = 1.0f - fArrM4866a[2];
                fArrM4866a[4] = 1.0f - fArrM4866a[4];
                fArrM4866a[6] = 1.0f - fArrM4866a[6];
            }
            if (z11) {
                fArrM4866a[1] = 1.0f - fArrM4866a[1];
                fArrM4866a[3] = 1.0f - fArrM4866a[3];
                fArrM4866a[5] = 1.0f - fArrM4866a[5];
                fArrM4866a[7] = 1.0f - fArrM4866a[7];
            }
        } else {
            if (z11) {
                fArrM4866a[0] = 1.0f - fArrM4866a[0];
                fArrM4866a[2] = 1.0f - fArrM4866a[2];
                fArrM4866a[4] = 1.0f - fArrM4866a[4];
                fArrM4866a[6] = 1.0f - fArrM4866a[6];
            }
            if (z10) {
                fArrM4866a[1] = 1.0f - fArrM4866a[1];
                fArrM4866a[3] = 1.0f - fArrM4866a[3];
                fArrM4866a[5] = 1.0f - fArrM4866a[5];
                fArrM4866a[7] = 1.0f - fArrM4866a[7];
            }
        }
        m4841a((float[]) C6568i.f5283e.clone(), fArrM4866a);
    }

    /* renamed from: a */
    public void m4834a(final int i10, final float f10) {
        m4839a(new Runnable() { // from class: com.tencent.liteav.basic.c.f.1
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1f(i10, f10);
            }
        });
    }

    /* renamed from: a */
    public void m4839a(Runnable runnable) {
        synchronized (this.f5254r) {
            this.f5254r.addLast(runnable);
        }
    }
}
