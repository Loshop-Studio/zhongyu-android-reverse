package p099g5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.regex.Pattern;
import p121i5.AbstractC7667a;

/* renamed from: g5.b */
/* loaded from: classes4.dex */
public final class C7527b {

    /* renamed from: f */
    public static final Pattern f12419f = Pattern.compile(",");

    /* renamed from: a */
    public final Context f12420a;

    /* renamed from: b */
    public Point f12421b;

    /* renamed from: c */
    public Point f12422c;

    /* renamed from: d */
    public Point f12423d;

    /* renamed from: e */
    public Point f12424e;

    public C7527b(Context context) {
        this.f12420a = context;
    }

    /* renamed from: a */
    public static int m12296a(CharSequence charSequence, int i10) throws NumberFormatException {
        int i11 = 0;
        for (String str : f12419f.split(charSequence)) {
            try {
                double d10 = Double.parseDouble(str.trim());
                int i12 = (int) (10.0d * d10);
                if (Math.abs(i10 - d10) < Math.abs(i10 - i11)) {
                    i11 = i12;
                }
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public int m12297b() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i10 = 0;
        Camera.getCameraInfo(0, cameraInfo);
        int rotation = ((WindowManager) this.f12420a.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation == 3) {
                i10 = 270;
            }
        }
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
    }

    /* renamed from: c */
    public void m12298c(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f12420a.getSystemService("window")).getDefaultDisplay();
        this.f12421b = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Point point = new Point();
        this.f12424e = point;
        Point point2 = this.f12421b;
        point.x = point2.x;
        point.y = point2.y;
        int i10 = point2.x;
        int i11 = point2.y;
        if (i10 < i11) {
            point.x = i11;
            point.y = point2.x;
        }
        Point pointM12803a = AbstractC7667a.m12803a(parameters, point);
        this.f12423d = pointM12803a;
        int i12 = pointM12803a.x;
        int i13 = pointM12803a.y;
        float f10 = i12 / i13;
        if (i12 < i13) {
            f10 = i13 / i12;
        }
        this.f12422c = AbstractC7667a.m12804b(parameters, this.f12424e, f10);
        Log.e("ContentValues", "best preview size-->x = " + this.f12422c.x + ", y =" + this.f12422c.y);
        Log.e("ContentValues", "pictureResolution size-->x = " + this.f12423d.x + ", y =" + this.f12423d.y);
    }

    /* renamed from: d */
    public void m12299d(Camera camera) throws NumberFormatException {
        Camera.Parameters parameters = camera.getParameters();
        Point point = this.f12422c;
        parameters.setPreviewSize(point.x, point.y);
        Point point2 = this.f12423d;
        parameters.setPictureSize(point2.x, point2.y);
        m12300e(parameters);
        camera.setDisplayOrientation(m12297b());
        camera.setParameters(parameters);
    }

    /* renamed from: e */
    public final void m12300e(Camera.Parameters parameters) throws NumberFormatException {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            String str2 = parameters.get("max-zoom");
            int iM12296a = 27;
            if (str2 != null) {
                try {
                    int i10 = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 > i10) {
                        iM12296a = i10;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int i11 = Integer.parseInt(str3);
                    if (iM12296a > i11) {
                        iM12296a = i11;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                iM12296a = m12296a(str4, iM12296a);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int i12 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (i12 > 1) {
                        iM12296a -= iM12296a % i12;
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (str2 != null || str4 != null) {
                parameters.set("zoom", String.valueOf(iM12296a / 10.0d));
            }
            if (str3 != null) {
                parameters.set("taking-picture-zoom", iM12296a);
            }
        }
    }
}
