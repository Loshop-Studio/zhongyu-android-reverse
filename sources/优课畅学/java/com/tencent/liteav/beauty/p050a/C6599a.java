package com.tencent.liteav.beauty.p050a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p048c.C6565f;
import com.tencent.liteav.beauty.NativeLoad;

/* renamed from: com.tencent.liteav.beauty.a.a */
/* loaded from: classes4.dex */
public class C6599a extends C6565f {

    /* renamed from: C */
    private static float[] f5541C = {0.1826f, 0.6142f, 0.062f, -0.1006f, -0.3386f, 0.4392f, 0.4392f, -0.3989f, -0.0403f};

    /* renamed from: D */
    private static float[] f5542D = {0.256816f, 0.504154f, 0.0979137f, -0.148246f, -0.29102f, 0.439266f, 0.439271f, -0.367833f, -0.071438f};

    /* renamed from: E */
    private static float[] f5543E = {0.0625f, 0.5f, 0.5f};

    /* renamed from: A */
    private String f5544A;

    /* renamed from: B */
    private int f5545B;

    /* renamed from: r */
    private int f5546r;

    /* renamed from: s */
    private int f5547s;

    /* renamed from: t */
    private int f5548t;

    /* renamed from: u */
    private int f5549u;

    /* renamed from: v */
    private int f5550v;

    /* renamed from: w */
    private int f5551w;

    /* renamed from: x */
    private int f5552x;

    /* renamed from: y */
    private int f5553y;

    /* renamed from: z */
    private int f5554z;

    public C6599a(int i10) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f5546r = -1;
        this.f5547s = -1;
        this.f5548t = -1;
        this.f5549u = -1;
        this.f5550v = -1;
        this.f5551w = -1;
        this.f5552x = -1;
        this.f5553y = -1;
        this.f5554z = -1;
        this.f5544A = "RGBA2I420Filter";
        this.f5545B = i10;
    }

    @Override // com.tencent.liteav.basic.p048c.C6565f
    /* renamed from: a */
    public boolean mo4842a() {
        int i10 = this.f5545B;
        if (1 == i10) {
            NativeLoad.getInstance();
            this.f5237a = NativeLoad.nativeLoadGLProgram(8);
            TXCLog.m4994i(this.f5544A, "RGB-->I420 init!");
        } else if (3 == i10) {
            TXCLog.m4994i(this.f5544A, "RGB-->NV21 init!");
            NativeLoad.getInstance();
            this.f5237a = NativeLoad.nativeLoadGLProgram(11);
        } else {
            if (2 == i10) {
                TXCLog.m4994i(this.f5544A, "RGBA Format init!");
                return super.mo4842a();
            }
            TXCLog.m4994i(this.f5544A, "don't support format " + this.f5545B + " use default I420");
            NativeLoad.getInstance();
            this.f5237a = NativeLoad.nativeLoadGLProgram(8);
        }
        if (this.f5237a == 0 || !mo4845b()) {
            this.f5243g = false;
        } else {
            this.f5243g = true;
        }
        mo4846c();
        return this.f5243g;
    }

    @Override // com.tencent.liteav.basic.p048c.C6565f
    /* renamed from: b */
    public boolean mo4845b() {
        super.mo4845b();
        this.f5546r = GLES20.glGetUniformLocation(this.f5237a, "width");
        this.f5547s = GLES20.glGetUniformLocation(this.f5237a, "height");
        return true;
    }

    @Override // com.tencent.liteav.basic.p048c.C6565f
    /* renamed from: c */
    public void mo4846c() {
        super.mo4846c();
    }

    @Override // com.tencent.liteav.basic.p048c.C6565f
    /* renamed from: a */
    public void mo4835a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            if (this.f5242f == i11 && this.f5241e == i10) {
                return;
            }
            super.mo4835a(i10, i11);
            TXCLog.m4994i(this.f5544A, "RGBA2I420Filter width " + i10 + " height " + i11);
            m4834a(this.f5546r, (float) i10);
            m4834a(this.f5547s, (float) i11);
            return;
        }
        TXCLog.m4991e(this.f5544A, "width or height is error!");
    }
}
