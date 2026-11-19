package androidx.compose.p014ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p296pd.InterfaceC10659g;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ValueElementSequence implements InterfaceC10659g {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // p296pd.InterfaceC10659g
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
