package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(28)
/* loaded from: classes.dex */
class EdgeToEdgeApi28 extends EdgeToEdgeApi26 {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        AbstractC9133u.m16133g(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
