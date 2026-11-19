package p163u3;

import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6547q;

/* renamed from: u3.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7771c {
    /* renamed from: a */
    public static final void m9300a(Fragment fragment, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            AbstractC6547q.a aVar = AbstractC6547q.f8381a;
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            aVar.m7407a(window, z6, z7);
        }
    }
}
