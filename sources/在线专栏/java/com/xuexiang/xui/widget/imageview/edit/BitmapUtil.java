package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
class BitmapUtil {
    BitmapUtil() {
    }

    static Bitmap createBitmapFromGLSurface(GLSurfaceView gLSurfaceView, GL10 gl10) throws OutOfMemoryError {
        int width = gLSurfaceView.getWidth();
        int height = gLSurfaceView.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
        intBufferWrap.position(0);
        try {
            gl10.glReadPixels(0, 0, width, height, 6408, 5121, intBufferWrap);
            for (int i5 = 0; i5 < height; i5++) {
                int i6 = i5 * width;
                int i7 = ((height - i5) - 1) * width;
                for (int i8 = 0; i8 < width; i8++) {
                    int i9 = iArr[i6 + i8];
                    iArr2[i7 + i8] = (i9 & (-16711936)) | ((i9 << 16) & 16711680) | ((i9 >> 16) & 255);
                }
            }
            return Bitmap.createBitmap(iArr2, width, height, Bitmap.Config.ARGB_8888);
        } catch (GLException unused) {
            return null;
        }
    }

    static Bitmap removeTransparency(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i5 >= bitmap.getWidth()) {
                i5 = 0;
                break;
            }
            for (int i6 = 0; i6 < bitmap.getHeight(); i6++) {
                if (iArr[(bitmap.getWidth() * i6) + i5] != 0) {
                    break loop0;
                }
            }
            i5++;
        }
        int i7 = 0;
        loop2: while (true) {
            if (i7 >= bitmap.getHeight()) {
                break;
            }
            for (int i8 = i5; i8 < bitmap.getHeight(); i8++) {
                if (iArr[(bitmap.getWidth() * i7) + i8] != 0) {
                    i4 = i7;
                    break loop2;
                }
            }
            i7++;
        }
        int width2 = bitmap.getWidth() - 1;
        loop4: while (true) {
            if (width2 < i5) {
                break;
            }
            for (int height2 = bitmap.getHeight() - 1; height2 >= i4; height2--) {
                if (iArr[(bitmap.getWidth() * height2) + width2] != 0) {
                    width = width2;
                    break loop4;
                }
            }
            width2--;
        }
        int height3 = bitmap.getHeight() - 1;
        loop6: while (true) {
            if (height3 < i4) {
                break;
            }
            for (int width3 = bitmap.getWidth() - 1; width3 >= i5; width3--) {
                if (iArr[(bitmap.getWidth() * height3) + width3] != 0) {
                    height = height3;
                    break loop6;
                }
            }
            height3--;
        }
        return Bitmap.createBitmap(bitmap, i5, i4, width - i5, height - i4);
    }
}
