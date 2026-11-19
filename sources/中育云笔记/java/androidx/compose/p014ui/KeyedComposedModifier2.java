package androidx.compose.p014ui;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifier2 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;

    public KeyedComposedModifier2(String str, Object obj, Object obj2, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        super(interfaceC9540l, interfaceC9545q);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier2)) {
            return false;
        }
        KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
        return AbstractC9979u.m20289b(this.fqName, keyedComposedModifier2.fqName) && AbstractC9979u.m20289b(this.key1, keyedComposedModifier2.key1) && AbstractC9979u.m20289b(this.key2, keyedComposedModifier2.key2);
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
