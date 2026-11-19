package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    public static final Modifier preferKeepClear(Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    @RequiresApi(33)
    private static final Modifier preferKeepClearT(InterfaceC10570l interfaceC10570l) {
        return new PreferKeepClearElement(interfaceC10570l);
    }

    public static final Modifier preferKeepClear(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(interfaceC10570l));
    }
}
