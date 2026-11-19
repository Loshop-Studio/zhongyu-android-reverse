package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final ModifierLocal<?> key;
    private final MutableState value$delegate;

    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }

    public final void forceValue$ui_release(Object obj) {
        setValue(obj);
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        T t10 = (T) getValue();
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.p014ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo32336set$ui_release(ModifierLocal<T> modifierLocal, T t10) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        setValue(t10);
    }
}
