package androidx.fragment.app;

import android.view.View;

/* loaded from: classes2.dex */
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        return (F) FragmentManager.findFragment(view);
    }
}
