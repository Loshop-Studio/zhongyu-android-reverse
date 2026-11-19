package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    public static final Modifier preferKeepClear(Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    @RequiresApi(33)
    private static final Modifier preferKeepClearT(InterfaceC9540l interfaceC9540l) {
        return new PreferKeepClearElement(interfaceC9540l);
    }

    public static final Modifier preferKeepClear(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(interfaceC9540l));
    }
}
