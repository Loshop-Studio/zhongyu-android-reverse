package p290p6;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* renamed from: p6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10632a {
    /* renamed from: a */
    public static void m22482a(AppCompatActivity appCompatActivity, int i10, int i11, boolean z10) {
        m22483b(appCompatActivity, false, false, i10, i11, z10);
    }

    /* renamed from: b */
    public static void m22483b(AppCompatActivity appCompatActivity, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        try {
            Window window = appCompatActivity.getWindow();
            boolean z13 = true;
            if (z10 && z11) {
                window.clearFlags(201326592);
                AbstractC10633b.m22488d(appCompatActivity, true, true, i10 == 0, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z10 && !z11) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i10 != 0) {
                    z13 = false;
                }
                AbstractC10633b.m22488d(appCompatActivity, false, false, z13, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                if (z10) {
                    return;
                }
                window.requestFeature(1);
                window.clearFlags(201326592);
                AbstractC10633b.m22488d(appCompatActivity, false, true, i10 == 0, z12);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i10);
            window.setNavigationBarColor(i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m22484c(Activity activity, boolean z10) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        if (z10) {
            decorView.setSystemUiVisibility(9472);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        View childAt = ((ViewGroup) window.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            ViewCompat.requestApplyInsets(childAt);
        }
    }
}
