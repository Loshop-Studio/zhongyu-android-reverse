package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class FragmentKt {
    public static final NavController findNavController(Fragment fragment) {
        AbstractC9979u.m20294g(fragment, "<this>");
        return NavHostFragment.Companion.findNavController(fragment);
    }
}
