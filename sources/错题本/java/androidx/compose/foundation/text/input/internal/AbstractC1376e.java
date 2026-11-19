package androidx.compose.foundation.text.input.internal;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;

/* renamed from: androidx.compose.foundation.text.input.internal.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1376e {
    /* renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m985B(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m986C(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m987D(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* renamed from: j */
    public static /* synthetic */ GraphemeClusterSegmentFinder m997j(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ SegmentFinder m998k(Object obj) {
        return (SegmentFinder) obj;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ HandwritingGesture m999l(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ InsertGesture m1000m(Object obj) {
        return (InsertGesture) obj;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m1001n(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m1002o(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ SelectGesture m1003p(Object obj) {
        return (SelectGesture) obj;
    }

    /* renamed from: r */
    public static /* synthetic */ void m1005r() {
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m1010w(Object obj) {
        return obj instanceof InsertGesture;
    }
}
