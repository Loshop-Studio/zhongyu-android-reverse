package p121i5;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: i5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7667a {

    /* renamed from: a */
    public static final Pattern f12966a = Pattern.compile(";");

    /* renamed from: a */
    public static Point m12803a(Camera.Parameters parameters, Point point) {
        Camera.Size size;
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes == null) {
            Log.w("CameraConfiguration", "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        if (Log.isLoggable("CameraConfiguration", 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size2 : supportedPictureSizes) {
                sb.append(size2.width);
                sb.append('x');
                sb.append(size2.height);
                sb.append(' ');
            }
            Log.i("CameraConfiguration", "Supported camera sizes: " + ((Object) sb));
        }
        Camera.Size size3 = null;
        int i10 = 0;
        for (Camera.Size size4 : supportedPictureSizes) {
            int i11 = size4.width;
            int i12 = size4.height;
            int i13 = i11 * i12;
            if (i13 < 384000) {
                size = size3;
            } else {
                boolean z9 = i11 < i12;
                int i14 = z9 ? i12 : i11;
                int i15 = z9 ? i11 : i12;
                size = size3;
                double d10 = i14 / i15;
                Log.i("CameraConfiguration", "picture aspectRatio-->>" + d10);
                Log.i("CameraConfiguration", "picture width=" + i14 + ",height=" + i15);
                if (Math.abs(d10 - 1.41d) <= 0.15d && i14 >= 2000 && i14 <= 4000) {
                    if (i14 == point.x && i15 == point.y) {
                        Point point2 = new Point(i11, i12);
                        Log.i("CameraConfiguration", "Found camera size exactly matching screen size: " + point2);
                        return point2;
                    }
                    if (i13 > i10) {
                        size3 = size4;
                        i10 = i13;
                    }
                }
            }
            size3 = size;
        }
        Camera.Size size5 = size3;
        if (size5 != null) {
            Point point3 = new Point(size5.width, size5.height);
            Log.i("CameraConfiguration", "Using largest suitable camera size: " + point3);
            return point3;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 == null) {
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        Point point4 = new Point(previewSize2.width, previewSize2.height);
        Log.i("CameraConfiguration", "No suitable preview sizes, using default: " + point4);
        return point4;
    }

    /* renamed from: b */
    public static Point m12804b(Camera.Parameters parameters, Point point, float f10) {
        Camera.Size size;
        double d10;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Log.w("CameraConfiguration", "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        if (Log.isLoggable("CameraConfiguration", 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size2 : supportedPreviewSizes) {
                sb.append(size2.width);
                sb.append('x');
                sb.append(size2.height);
                sb.append(' ');
            }
            Log.i("CameraConfiguration", "Supported preview sizes: " + ((Object) sb));
        }
        double d11 = f10;
        Camera.Size size3 = null;
        int i10 = 0;
        for (Camera.Size size4 : supportedPreviewSizes) {
            int i11 = size4.width;
            int i12 = size4.height;
            int i13 = i11 * i12;
            if (i13 < 384000) {
                d10 = d11;
                size = size3;
            } else {
                boolean z9 = i11 < i12;
                int i14 = z9 ? i12 : i11;
                int i15 = z9 ? i11 : i12;
                size = size3;
                d10 = d11;
                double d12 = i14 / i15;
                Log.i("CameraConfiguration", "aspectRatio-->>" + d12);
                if (Math.abs(d12 - d10) <= 0.15d) {
                    if (i14 == point.x && i15 == point.y) {
                        Point point2 = new Point(i11, i12);
                        Log.i("CameraConfiguration", "Found preview size exactly matching screen size: " + point2);
                        return point2;
                    }
                    if (i13 > i10) {
                        size3 = size4;
                        i10 = i13;
                    }
                }
                d11 = d10;
            }
            size3 = size;
            d11 = d10;
        }
        Camera.Size size5 = size3;
        if (size5 != null) {
            Point point3 = new Point(size5.width, size5.height);
            Log.i("CameraConfiguration", "Using largest suitable preview size: " + point3);
            return point3;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 == null) {
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        Point point4 = new Point(previewSize2.width, previewSize2.height);
        Log.i("CameraConfiguration", "No suitable preview sizes, using default: " + point4);
        return point4;
    }
}
