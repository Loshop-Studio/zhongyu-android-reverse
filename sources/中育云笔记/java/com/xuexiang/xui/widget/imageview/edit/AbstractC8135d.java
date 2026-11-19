package com.xuexiang.xui.widget.imageview.edit;

import android.opengl.GLES20;
import androidx.work.Data;

/* renamed from: com.xuexiang.xui.widget.imageview.edit.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8135d {
    /* renamed from: a */
    public static void m12750a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    /* renamed from: b */
    public static int m12751b(String str, String str2) {
        int iM12753d;
        int iM12753d2 = m12753d(35633, str);
        if (iM12753d2 == 0 || (iM12753d = m12753d(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iM12753d2);
            m12750a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iM12753d);
            m12750a("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
                GLES20.glDeleteProgram(iGlCreateProgram);
                throw new RuntimeException("Could not link program: " + strGlGetProgramInfoLog);
            }
        }
        return iGlCreateProgram;
    }

    /* renamed from: c */
    public static void m12752c() {
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    /* renamed from: d */
    public static int m12753d(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader);
                throw new RuntimeException("Could not compile shader " + i10 + ":" + strGlGetShaderInfoLog);
            }
        }
        return iGlCreateShader;
    }
}
