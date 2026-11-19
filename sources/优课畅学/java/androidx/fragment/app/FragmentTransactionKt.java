package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, @IdRes int i10, String str, Bundle bundle) {
        AbstractC9133u.m16139m(4, "F");
        return fragmentTransaction.add(i10, Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        AbstractC9133u.m16139m(4, "F");
        return fragmentTransaction.add(i10, Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i10, String str, Bundle bundle) {
        AbstractC9133u.m16139m(4, "F");
        return fragmentTransaction.replace(i10, Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        AbstractC9133u.m16139m(4, "F");
        return fragmentTransaction.replace(i10, Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String str, Bundle bundle) {
        AbstractC9133u.m16139m(4, "F");
        return fragmentTransaction.add(Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        AbstractC9133u.m16139m(4, "F");
        return fragmentTransaction.add(Fragment.class, bundle, str);
    }
}
