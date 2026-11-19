package p155s0;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import p185v7.AbstractC6675d;

/* renamed from: s0.e */
/* loaded from: classes2.dex */
public final class C6546e {

    /* renamed from: d */
    public static Integer f10923d;

    /* renamed from: a */
    public final View f10924a;

    /* renamed from: b */
    public final ArrayList f10925b = new ArrayList();

    /* renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC6545d f10926c;

    public C6546e(View view) {
        this.f10924a = view;
    }

    /* renamed from: a */
    public final int m6189a(int i, int i8, int i9) {
        int i10 = i8 - i9;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i - i9;
        if (i11 > 0) {
            return i11;
        }
        View view = this.f10924a;
        if (view.isLayoutRequested() || i8 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f10923d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC6675d.m6344f(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f10923d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f10923d.intValue();
    }
}
