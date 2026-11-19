package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.xuexiang.xui.widget.imageview.edit.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8132a {
    /* renamed from: a */
    public static Bitmap m12749a(GLSurfaceView gLSurfaceView, GL10 gl10) {
        int width = gLSurfaceView.getWidth();
        int height = gLSurfaceView.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
        intBufferWrap.position(0);
        try {
            gl10.glReadPixels(0, 0, width, height, 6408, 5121, intBufferWrap);
            for (int i11 = 0; i11 < height; i11++) {
                int i12 = i11 * width;
                int i13 = ((height - i11) - 1) * width;
                for (int i14 = 0; i14 < width; i14++) {
                    int i15 = iArr[i12 + i14];
                    iArr2[i13 + i14] = (i15 & (-16711936)) | ((i15 << 16) & 16711680) | ((i15 >> 16) & 255);
                }
            }
            return Bitmap.createBitmap(iArr2, width, height, Bitmap.Config.ARGB_8888);
        } catch (GLException unused) {
            return null;
        }
    }
}
