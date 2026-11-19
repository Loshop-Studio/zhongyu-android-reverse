package androidx.compose.p014ui.text.platform;

import androidx.compose.runtime.State;

/* loaded from: classes2.dex */
final class ImmutableBool implements State<Boolean> {
    private final boolean value;

    public ImmutableBool(boolean z10) {
        this.value = z10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
