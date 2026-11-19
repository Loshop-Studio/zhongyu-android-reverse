package androidx.compose.p013ui;

import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public KeyedComposedModifierN(String str, Object[] objArr, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        super(interfaceC10570l, interfaceC10575q);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifierN)) {
            return false;
        }
        KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
        return AbstractC9133u.m16128b(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys);
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
