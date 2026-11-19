package androidx.compose.p011ui.text.input;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m5110d2 = {"", "right", "Lkotlin/Function0;", "defaultValue", "addExactOrElse", "(IILr6/a;)I", "subtractExactOrElse", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i8, @NotNull InterfaceC6469a interfaceC6469a) {
        int i9 = i + i8;
        return ((i ^ i9) & (i8 ^ i9)) < 0 ? ((Number) interfaceC6469a.invoke()).intValue() : i9;
    }

    public static final int subtractExactOrElse(int i, int i8, @NotNull InterfaceC6469a interfaceC6469a) {
        int i9 = i - i8;
        return ((i ^ i9) & (i8 ^ i)) < 0 ? ((Number) interfaceC6469a.invoke()).intValue() : i9;
    }
}
