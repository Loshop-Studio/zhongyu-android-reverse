package androidx.compose.p014ui;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;

@Stable
/* loaded from: classes2.dex */
final class KeyedComposedModifier1 extends ComposedModifier {
    private final String fqName;
    private final Object key1;

    public KeyedComposedModifier1(String str, Object obj, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        super(interfaceC9540l, interfaceC9545q);
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier1)) {
            return false;
        }
        KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
        return AbstractC9979u.m20289b(this.fqName, keyedComposedModifier1.fqName) && AbstractC9979u.m20289b(this.key1, keyedComposedModifier1.key1);
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
