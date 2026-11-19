package androidx.compose.p013ui.autofill;

import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class AutofillNode {
    public static final int $stable;
    public static final Companion Companion;
    private static final Object lock;
    private static int previousId;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;

    /* renamed from: id */
    private final int f1208id;
    private final InterfaceC10570l onFill;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i10;
            synchronized (AutofillNode.lock) {
                AutofillNode.previousId++;
                i10 = AutofillNode.previousId;
            }
            return i10;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        $stable = 8;
        lock = companion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, InterfaceC10570l interfaceC10570l) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = interfaceC10570l;
        this.f1208id = ComposeUiFlags.isSemanticAutofillEnabled ? SemanticsModifierKt.generateSemanticsId() : Companion.generateId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return AbstractC9133u.m16128b(this.autofillTypes, autofillNode.autofillTypes) && AbstractC9133u.m16128b(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.f1208id;
    }

    public final InterfaceC10570l getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        InterfaceC10570l interfaceC10570l = this.onFill;
        return iHashCode2 + (interfaceC10570l != null ? interfaceC10570l.hashCode() : 0);
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AbstractC8809v.m14771n() : list, (i10 & 2) != 0 ? null : rect, interfaceC10570l);
    }
}
