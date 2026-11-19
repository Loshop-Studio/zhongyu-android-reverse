package androidx.navigation;

import androidx.lifecycle.SavedStateHandle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(m7879d1 = {"androidx/navigation/SavedStateHandleKt__SavedStateHandleKt"}, m7881k = 4, m7882mv = {2, 0, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateHandleKt {
    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<KType, NavType<?>> map) {
        return (T) SavedStateHandleKt__SavedStateHandleKt.toRoute(savedStateHandle, map);
    }

    public static final <T> T toRoute(SavedStateHandle savedStateHandle, KClass<T> kClass, Map<KType, NavType<?>> map) {
        return (T) SavedStateHandleKt__SavedStateHandleKt.toRoute(savedStateHandle, kClass, map);
    }
}
