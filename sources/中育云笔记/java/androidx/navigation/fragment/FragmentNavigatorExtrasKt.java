package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class FragmentNavigatorExtrasKt {
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(Pair<? extends View, String>... sharedElements) {
        AbstractC9979u.m20294g(sharedElements, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (Pair<? extends View, String> pair : sharedElements) {
            builder.addSharedElement((View) pair.m20048a(), (String) pair.m20049c());
        }
        return builder.build();
    }
}
