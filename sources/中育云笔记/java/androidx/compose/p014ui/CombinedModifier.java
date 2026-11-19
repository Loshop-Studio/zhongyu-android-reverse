package androidx.compose.p014ui;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    @Override // androidx.compose.p014ui.Modifier
    public boolean all(InterfaceC9540l interfaceC9540l) {
        return this.outer.all(interfaceC9540l) && this.inner.all(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.Modifier
    public boolean any(InterfaceC9540l interfaceC9540l) {
        return this.outer.any(interfaceC9540l) || this.inner.any(interfaceC9540l);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return AbstractC9979u.m20289b(this.outer, combinedModifier.outer) && AbstractC9979u.m20289b(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p014ui.Modifier
    public <R> R foldIn(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) this.inner.foldIn(this.outer.foldIn(r10, interfaceC9544p), interfaceC9544p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p014ui.Modifier
    public <R> R foldOut(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) this.outer.foldOut(this.inner.foldOut(r10, interfaceC9544p), interfaceC9544p);
    }

    public final Modifier getInner$ui_release() {
        return this.inner;
    }

    public final Modifier getOuter$ui_release() {
        return this.outer;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", new InterfaceC9544p() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // p181hd.InterfaceC9544p
            public final String invoke(String str, Modifier.Element element) {
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            }
        })) + ']';
    }
}
