package androidx.compose.p013ui;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifier1 extends ComposedModifier {
    private final String fqName;
    private final Object key1;

    public KeyedComposedModifier1(String str, Object obj, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        super(interfaceC10570l, interfaceC10575q);
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier1)) {
            return false;
        }
        KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
        return AbstractC9133u.m16128b(this.fqName, keyedComposedModifier1.fqName) && AbstractC9133u.m16128b(this.key1, keyedComposedModifier1.key1);
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public int hashCode() {
        int iHashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
