package androidx.savedstate;

import android.os.Bundle;
import java.util.Map;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public final class SavedStateKt {
    public static final <T> T read(Bundle bundle, InterfaceC9540l interfaceC9540l) {
        return (T) SavedStateKt__SavedStateKt.read(bundle, interfaceC9540l);
    }

    public static final Bundle savedState(Bundle bundle, InterfaceC9540l interfaceC9540l) {
        return SavedStateKt__SavedState_androidKt.savedState(bundle, interfaceC9540l);
    }

    public static final <T> T write(Bundle bundle, InterfaceC9540l interfaceC9540l) {
        return (T) SavedStateKt__SavedStateKt.write(bundle, interfaceC9540l);
    }

    public static final Bundle savedState(Map<String, ? extends Object> map, InterfaceC9540l interfaceC9540l) {
        return SavedStateKt__SavedState_androidKt.savedState(map, interfaceC9540l);
    }
}
