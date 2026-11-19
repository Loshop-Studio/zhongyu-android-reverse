package androidx.navigation;

import android.view.SavedStateHandle;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"androidx/navigation/SavedStateHandleKt__SavedStateHandleKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateHandleKt {
    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<InterfaceC6793q, NavType<?>> map) {
        return (T) SavedStateHandleKt__SavedStateHandleKt.toRoute(savedStateHandle, map);
    }

    @NotNull
    public static final <T> T toRoute(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map) {
        return (T) SavedStateHandleKt__SavedStateHandleKt.toRoute(savedStateHandle, interfaceC6779c, map);
    }
}
