package androidx.compose.p014ui;

import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public KeyedComposedModifierN(String str, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        super(interfaceC9540l, interfaceC9545q);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifierN)) {
            return false;
        }
        KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
        return AbstractC9979u.m20289b(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys);
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
