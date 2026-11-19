package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    @RequiresApi(29)
    private static final Modifier excludeFromSystemGestureQ(InterfaceC9540l interfaceC9540l) {
        return new ExcludeFromSystemGestureElement(interfaceC9540l);
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(interfaceC9540l));
    }
}
