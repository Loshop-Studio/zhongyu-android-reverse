package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

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

    @Override // androidx.compose.p013ui.Modifier
    public boolean all(InterfaceC10570l interfaceC10570l) {
        return this.outer.all(interfaceC10570l) && this.inner.all(interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.Modifier
    public boolean any(InterfaceC10570l interfaceC10570l) {
        return this.outer.any(interfaceC10570l) || this.inner.any(interfaceC10570l);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return AbstractC9133u.m16128b(this.outer, combinedModifier.outer) && AbstractC9133u.m16128b(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.Modifier
    public <R> R foldIn(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) this.inner.foldIn(this.outer.foldIn(r10, interfaceC10574p), interfaceC10574p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.Modifier
    public <R> R foldOut(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) this.outer.foldOut(this.inner.foldOut(r10, interfaceC10574p), interfaceC10574p);
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
        return '[' + ((String) foldIn("", new InterfaceC10574p() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // p300x7.InterfaceC10574p
            public final String invoke(String str, Modifier.Element element) {
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            }
        })) + ']';
    }
}
