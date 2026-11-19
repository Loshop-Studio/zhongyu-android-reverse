package p155s0;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import p185v7.AbstractC6675d;

/* renamed from: s0.j */
/* loaded from: classes2.dex */
public final class C6551j {

    /* renamed from: d */
    public static Integer f10930d;

    /* renamed from: a */
    public final View f10931a;

    /* renamed from: b */
    public final ArrayList f10932b = new ArrayList();

    /* renamed from: c */
    public ViewTreeObserverOnPreDrawListenerC6545d f10933c;

    public C6551j(ImageView imageView) {
        this.f10931a = imageView;
    }

    /* renamed from: a */
    public final int m6190a(int i, int i8, int i9) {
        int i10 = i8 - i9;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i - i9;
        if (i11 > 0) {
            return i11;
        }
        View view = this.f10931a;
        if (view.isLayoutRequested() || i8 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f10930d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC6675d.m6344f(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f10930d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f10930d.intValue();
    }
}
