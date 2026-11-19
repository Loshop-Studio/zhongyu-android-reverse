package com.tencent.liteav.basic.p048c;

import android.opengl.GLES20;
import androidx.work.Data;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.tencent.liteav.basic.c.g */
/* loaded from: classes4.dex */
public class C6566g {

    /* renamed from: a */
    public static FloatBuffer f5263a;

    /* renamed from: f */
    private static float[] f5268f;

    /* renamed from: g */
    private static float[] f5269g = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: h */
    private static float[] f5270h = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: i */
    private static float[] f5271i = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j */
    private static float[] f5272j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: b */
    public static FloatBuffer f5264b = m4863a(f5269g);

    /* renamed from: c */
    public static FloatBuffer f5265c = m4863a(f5270h);

    /* renamed from: d */
    public static FloatBuffer f5266d = m4863a(f5271i);

    /* renamed from: e */
    public static FloatBuffer f5267e = m4863a(f5272j);

    /* renamed from: k */
    private static int f5273k = 2;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f5268f = fArr;
        f5263a = m4863a(fArr);
    }

    /* renamed from: a */
    public static FloatBuffer m4863a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* renamed from: b */
    public static int m4864b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    /* renamed from: a */
    public static int m4860a(int i10, int i11, int i12, int i13, IntBuffer intBuffer) {
        int iM4864b = m4864b();
        GLES20.glBindTexture(3553, iM4864b);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, i13, 5121, intBuffer);
        GLES20.glBindTexture(3553, 0);
        return iM4864b;
    }

    /* renamed from: a */
    public static int m4859a(int i10, int i11, int i12, int i13) {
        return m4860a(i10, i11, i12, i13, null);
    }

    /* renamed from: a */
    public static int m4858a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    /* renamed from: a */
    public static int m4861a(String str, int i10) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m4998w("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(iGlCreateShader));
        return 0;
    }

    /* renamed from: a */
    public static int m4862a(String str, String str2) {
        int[] iArr = new int[1];
        int iM4861a = m4861a(str, 35633);
        if (iM4861a == 0) {
            TXCLog.m4998w("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int iM4861a2 = m4861a(str2, 35632);
        if (iM4861a2 == 0) {
            TXCLog.m4998w("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM4861a);
        GLES20.glAttachShader(iGlCreateProgram, iM4861a2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            TXCLog.m4998w("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(iM4861a);
        GLES20.glDeleteShader(iM4861a2);
        return iGlCreateProgram;
    }
}
