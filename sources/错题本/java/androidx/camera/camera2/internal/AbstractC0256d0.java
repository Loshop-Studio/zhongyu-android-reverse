package androidx.camera.camera2.internal;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* renamed from: androidx.camera.camera2.internal.d0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0256d0 {
    /* renamed from: D */
    public static /* synthetic */ void m526D() {
    }

    /* renamed from: i */
    public static /* synthetic */ MultiResolutionStreamInfo m535i(int i, int i8, String str) {
        return new MultiResolutionStreamInfo(i, i8, str);
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m536j(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* renamed from: k */
    public static /* synthetic */ ScrollCaptureTarget m537k(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ ViewTranslationCallback m541o(Object obj) {
        return (ViewTranslationCallback) obj;
    }

    /* renamed from: p */
    public static /* synthetic */ ViewTranslationRequest.Builder m542p(AutofillId autofillId, long j7) {
        return new ViewTranslationRequest.Builder(autofillId, j7);
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m544r(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* renamed from: u */
    public static /* synthetic */ void m547u() {
    }
}
