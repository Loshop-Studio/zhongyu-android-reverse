package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class FragmentNavigatorExtrasKt {
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(Pair<? extends View, String>... sharedElements) {
        AbstractC9133u.m16133g(sharedElements, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (Pair<? extends View, String> pair : sharedElements) {
            builder.addSharedElement((View) pair.m15903a(), (String) pair.m15904b());
        }
        return builder.build();
    }
}
