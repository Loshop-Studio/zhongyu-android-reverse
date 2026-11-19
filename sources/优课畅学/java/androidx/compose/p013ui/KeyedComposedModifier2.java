package androidx.compose.p013ui;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifier2 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;

    public KeyedComposedModifier2(String str, Object obj, Object obj2, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        super(interfaceC10570l, interfaceC10575q);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier2)) {
            return false;
        }
        KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
        return AbstractC9133u.m16128b(this.fqName, keyedComposedModifier2.fqName) && AbstractC9133u.m16128b(this.key1, keyedComposedModifier2.key1) && AbstractC9133u.m16128b(this.key2, keyedComposedModifier2.key2);
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public int hashCode() {
        int iHashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
