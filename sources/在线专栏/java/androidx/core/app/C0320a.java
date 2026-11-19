package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0332a;
import java.util.Arrays;

/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public class C0320a extends C0332a {

    /* renamed from: c */
    private static d f2638c;

    /* renamed from: androidx.core.app.a$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String[] f2639a;

        /* renamed from: b */
        final /* synthetic */ Activity f2640b;

        /* renamed from: c */
        final /* synthetic */ int f2641c;

        a(String[] strArr, Activity activity, int i4) {
            this.f2639a = strArr;
            this.f2640b = activity;
            this.f2641c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2639a.length];
            PackageManager packageManager = this.f2640b.getPackageManager();
            String packageName = this.f2640b.getPackageName();
            int length = this.f2639a.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = packageManager.checkPermission(this.f2639a[i4], packageName);
            }
            ((c) this.f2640b).onRequestPermissionsResult(this.f2641c, this.f2639a, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f2642a;

        b(Activity activity) {
            this.f2642a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2642a.isFinishing() || C0322c.m1774i(this.f2642a)) {
                return;
            }
            this.f2642a.recreate();
        }
    }

    /* renamed from: androidx.core.app.a$c */
    public interface c {
        void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$d */
    public interface d {
        /* renamed from: a */
        boolean m1765a(Activity activity, String[] strArr, int i4);
    }

    /* renamed from: androidx.core.app.a$e */
    public interface e {
        void validateRequestPermissionsRequestCode(int i4);
    }

    /* renamed from: j */
    public static void m1754j(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: k */
    public static void m1755k(Activity activity) {
        activity.finishAfterTransition();
    }

    /* renamed from: l */
    public static void m1756l(Activity activity) {
        activity.postponeEnterTransition();
    }

    /* renamed from: m */
    public static void m1757m(Activity activity) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            activity.recreate();
        } else if (i4 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else {
            if (C0322c.m1774i(activity)) {
                return;
            }
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static void m1758n(Activity activity, String[] strArr, int i4) {
        d dVar = f2638c;
        if (dVar == null || !dVar.m1765a(activity, strArr, i4)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i4);
                }
                activity.requestPermissions(strArr, i4);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i4));
            }
        }
    }

    /* renamed from: o */
    public static void m1759o(Activity activity, AbstractC0328i abstractC0328i) {
        activity.setEnterSharedElementCallback(null);
    }

    /* renamed from: p */
    public static void m1760p(Activity activity, AbstractC0328i abstractC0328i) {
        activity.setExitSharedElementCallback(null);
    }

    /* renamed from: q */
    public static boolean m1761q(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: r */
    public static void m1762r(Activity activity, Intent intent, int i4, Bundle bundle) {
        activity.startActivityForResult(intent, i4, bundle);
    }

    /* renamed from: s */
    public static void m1763s(Activity activity, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    /* renamed from: t */
    public static void m1764t(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
