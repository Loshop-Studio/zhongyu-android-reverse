package androidx.compose.p014ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AutofillTree {
    public static final int $stable = 8;
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    public final C10786q performAutofill(int i10, String str) {
        InterfaceC9540l onFill;
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i10));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return C10786q.f26013a;
    }

    public final void plusAssign(AutofillNode autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
