package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    public static final int $stable = 8;
    private ModifierLocalProvider<?> element;

    public BackwardsCompatLocalMap(ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.element.getKey();
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.element.getKey())) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        return (T) this.element.getValue();
    }

    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo32336set$ui_release(ModifierLocal<T> modifierLocal, T t10) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void setElement(ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }
}
