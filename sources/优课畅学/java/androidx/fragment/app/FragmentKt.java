package androidx.fragment.app;

import android.os.Bundle;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(Fragment fragment, String str) {
        fragment.getParentFragmentManager().clearFragmentResult(str);
    }

    public static final void clearFragmentResultListener(Fragment fragment, String str) {
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
    }

    public static final void setFragmentResult(Fragment fragment, String str, Bundle bundle) {
        fragment.getParentFragmentManager().setFragmentResult(str, bundle);
    }

    public static final void setFragmentResultListener(Fragment fragment, String str, final InterfaceC10574p interfaceC10574p) {
        fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.p
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str2, Bundle bundle) {
                interfaceC10574p.invoke(str2, bundle);
            }
        });
    }
}
