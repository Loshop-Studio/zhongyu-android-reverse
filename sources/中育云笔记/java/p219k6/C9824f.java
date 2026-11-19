package p219k6;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: k6.f */
/* loaded from: classes5.dex */
public final class C9824f {

    /* renamed from: a */
    public final WeakReference f23067a;

    /* renamed from: b */
    public final WeakReference f23068b;

    public C9824f(Activity activity) {
        this(activity, null);
    }

    /* renamed from: a */
    public static C9824f m19900a(Activity activity) {
        return new C9824f(activity);
    }

    /* renamed from: b */
    public static C9824f m19901b(Fragment fragment) {
        return new C9824f(fragment);
    }

    /* renamed from: e */
    public static Intent m19902e(ArrayList arrayList) {
        return new Intent().putParcelableArrayListExtra("extra_result_media", arrayList);
    }

    /* renamed from: c */
    public Activity m19903c() {
        return (Activity) this.f23067a.get();
    }

    /* renamed from: d */
    public C9823e m19904d(int i10) {
        return new C9823e(this, i10);
    }

    public C9824f(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public C9824f(Activity activity, Fragment fragment) {
        this.f23067a = new WeakReference(activity);
        this.f23068b = new WeakReference(fragment);
    }
}
