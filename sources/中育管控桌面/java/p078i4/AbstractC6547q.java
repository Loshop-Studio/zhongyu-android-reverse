package p078i4;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.q */
/* loaded from: classes4.dex */
public abstract class AbstractC6547q {

    /* renamed from: a */
    public static final a f8381a = new a(null);

    /* renamed from: i4.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ void m7406c(a aVar, Window window, View view, boolean z6, boolean z7, int i6, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                view = window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(view, "getDecorView(...)");
            }
            View view2 = view;
            boolean z8 = (i7 & 4) != 0 ? false : z6;
            boolean z9 = (i7 & 8) != 0 ? false : z7;
            if ((i7 & 16) != 0) {
                i6 = WindowInsetsCompat.Type.statusBars();
            }
            aVar.m7408b(window, view2, z8, z9, i6);
        }

        /* renamed from: a */
        public final void m7407a(Window window, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(window, "window");
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.setAppearanceLightStatusBars(z6);
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(z7);
        }

        /* renamed from: b */
        public final void m7408b(Window window, View view, boolean z6, boolean z7, int i6) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(view, "view");
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
                window.setStatusBarContrastEnforced(false);
            }
            WindowCompat.setDecorFitsSystemWindows(window, false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
            windowInsetsControllerCompat.setAppearanceLightStatusBars(z6);
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(z7);
            windowInsetsControllerCompat.show(i6);
        }

        public a() {
        }
    }
}
