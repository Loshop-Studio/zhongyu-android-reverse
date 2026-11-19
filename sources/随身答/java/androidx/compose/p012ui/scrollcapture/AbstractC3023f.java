package androidx.compose.p012ui.scrollcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;

/* renamed from: androidx.compose.ui.scrollcapture.f */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3023f {
    /* renamed from: a */
    public static /* synthetic */ ScrollCaptureTarget m1261a(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }
}
