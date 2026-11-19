package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class FragmentKt {
    public static final NavController findNavController(Fragment fragment) {
        AbstractC9133u.m16133g(fragment, "<this>");
        return NavHostFragment.Companion.findNavController(fragment);
    }
}
