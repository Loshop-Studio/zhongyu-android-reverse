package androidx.compose.p014ui.autofill;

import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AutofillNode {
    public static final int $stable;
    public static final Companion Companion;
    private static final Object lock;
    private static int previousId;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;

    /* renamed from: id */
    private final int f1138id;
    private final InterfaceC9540l onFill;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
    public AutofillNode(List<? extends AutofillType> list, Rect rect, InterfaceC9540l interfaceC9540l) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = interfaceC9540l;
        this.f1138id = ComposeUiFlags.isSemanticAutofillEnabled ? SemanticsModifierKt.generateSemanticsId() : Companion.generateId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return AbstractC9979u.m20289b(this.autofillTypes, autofillNode.autofillTypes) && AbstractC9979u.m20289b(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.f1138id;
    }

    public final InterfaceC9540l getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l = this.onFill;
        return iHashCode2 + (interfaceC9540l != null ? interfaceC9540l.hashCode() : 0);
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? AbstractC10978w.m24136n() : list, (i10 & 2) != 0 ? null : rect, interfaceC9540l);
    }
}
