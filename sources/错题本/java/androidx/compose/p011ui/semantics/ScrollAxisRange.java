package androidx.compose.p011ui.semantics;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(Lr6/a;Lr6/a;Z)V", "", "toString", "()Ljava/lang/String;", "Lr6/a;", "getValue", "()Lr6/a;", "getMaxValue", "Z", "getReverseScrolling", "()Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;

    @NotNull
    private final InterfaceC6469a maxValue;
    private final boolean reverseScrolling;

    @NotNull
    private final InterfaceC6469a value;

    public ScrollAxisRange(@NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, boolean z8) {
        this.value = interfaceC6469a;
        this.maxValue = interfaceC6469a2;
        this.reverseScrolling = z8;
    }

    @NotNull
    public final InterfaceC6469a getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @NotNull
    public final InterfaceC6469a getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.value.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.maxValue.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return AbstractC0037f.m93r(sb, this.reverseScrolling, ')');
    }

    public /* synthetic */ ScrollAxisRange(InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, boolean z8, int i, AbstractC5824e abstractC5824e) {
        this(interfaceC6469a, interfaceC6469a2, (i & 4) != 0 ? false : z8);
    }
}
