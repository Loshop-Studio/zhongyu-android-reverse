package androidx.compose.p013ui;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifier3 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;
    private final Object key3;

    public KeyedComposedModifier3(String str, Object obj, Object obj2, Object obj3, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        super(interfaceC10570l, interfaceC10575q);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier3)) {
            return false;
        }
        KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
        return AbstractC9133u.m16128b(this.fqName, keyedComposedModifier3.fqName) && AbstractC9133u.m16128b(this.key1, keyedComposedModifier3.key1) && AbstractC9133u.m16128b(this.key2, keyedComposedModifier3.key2) && AbstractC9133u.m16128b(this.key3, keyedComposedModifier3.key3);
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

    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int iHashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.key3;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
