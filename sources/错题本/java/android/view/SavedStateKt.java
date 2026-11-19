package android.view;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"androidx/savedstate/SavedStateKt__SavedStateKt", "androidx/savedstate/SavedStateKt__SavedState_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateKt {
    public static final <T> T read(@NotNull Bundle bundle, @NotNull InterfaceC6471c interfaceC6471c) {
        return (T) SavedStateKt__SavedStateKt.read(bundle, interfaceC6471c);
    }

    @NotNull
    public static final Bundle savedState(@NotNull Bundle bundle, @NotNull InterfaceC6471c interfaceC6471c) {
        return SavedStateKt__SavedState_androidKt.savedState(bundle, interfaceC6471c);
    }

    public static final <T> T write(@NotNull Bundle bundle, @NotNull InterfaceC6471c interfaceC6471c) {
        return (T) SavedStateKt__SavedStateKt.write(bundle, interfaceC6471c);
    }

    @NotNull
    public static final Bundle savedState(@NotNull Map<String, ? extends Object> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return SavedStateKt__SavedState_androidKt.savedState(map, interfaceC6471c);
    }
}
