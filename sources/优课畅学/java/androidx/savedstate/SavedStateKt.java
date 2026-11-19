package androidx.savedstate;

import android.os.Bundle;
import java.util.Map;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SavedStateKt {
    public static final <T> T read(Bundle bundle, InterfaceC10570l interfaceC10570l) {
        return (T) SavedStateKt__SavedStateKt.read(bundle, interfaceC10570l);
    }

    public static final Bundle savedState(Bundle bundle, InterfaceC10570l interfaceC10570l) {
        return SavedStateKt__SavedState_androidKt.savedState(bundle, interfaceC10570l);
    }

    public static final <T> T write(Bundle bundle, InterfaceC10570l interfaceC10570l) {
        return (T) SavedStateKt__SavedStateKt.write(bundle, interfaceC10570l);
    }

    public static final Bundle savedState(Map<String, ? extends Object> map, InterfaceC10570l interfaceC10570l) {
        return SavedStateKt__SavedState_androidKt.savedState(map, interfaceC10570l);
    }
}
