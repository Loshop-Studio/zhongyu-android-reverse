package androidx.compose.foundation.layout;

import androidx.compose.p014ui.modifier.ModifierLocalConsumer;
import androidx.compose.p014ui.modifier.ModifierLocalProvider;
import androidx.compose.p014ui.modifier.ModifierLocalReadScope;
import androidx.compose.p014ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Stable
/* loaded from: classes.dex */
abstract class InsetsConsumingModifier implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    private final MutableState consumedInsets$delegate;

    public /* synthetic */ InsetsConsumingModifier(AbstractC9972n abstractC9972n) {
        this();
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets$delegate.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets$delegate.setValue(windowInsets);
    }

    public abstract WindowInsets calculateInsets(WindowInsets windowInsets);

    @Override // androidx.compose.p014ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        setConsumedInsets(calculateInsets((WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    private InsetsConsumingModifier() {
        this.consumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p014ui.modifier.ModifierLocalProvider
    public WindowInsets getValue() {
        return getConsumedInsets();
    }
}
