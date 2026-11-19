package android.view;

import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: androidx.activity.i */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0089i {
    /* renamed from: a */
    public static /* synthetic */ LineBreakConfig.Builder m157a() {
        return new LineBreakConfig.Builder();
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles m161e(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    /* renamed from: g */
    public static /* synthetic */ BoringLayout m163g(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f7, BoringLayout.Metrics metrics, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i8) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f7, metrics, z8, truncateAt, i8, z9);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener m164h(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    /* renamed from: j */
    public static /* synthetic */ EditorBoundsInfo.Builder m166j() {
        return new EditorBoundsInfo.Builder();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m169m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m172p(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
