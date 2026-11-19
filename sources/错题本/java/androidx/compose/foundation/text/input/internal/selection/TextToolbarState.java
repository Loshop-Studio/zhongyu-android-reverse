package androidx.compose.foundation.text.input.internal.selection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "(Ljava/lang/String;I)V", "None", "Cursor", "Selection", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextToolbarState {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ TextToolbarState[] $VALUES;
    public static final TextToolbarState None = new TextToolbarState("None", 0);
    public static final TextToolbarState Cursor = new TextToolbarState("Cursor", 1);
    public static final TextToolbarState Selection = new TextToolbarState("Selection", 2);

    private static final /* synthetic */ TextToolbarState[] $values() {
        return new TextToolbarState[]{None, Cursor, Selection};
    }

    static {
        TextToolbarState[] textToolbarStateArr$values = $values();
        $VALUES = textToolbarStateArr$values;
        $ENTRIES = AbstractC5817a.m5310a(textToolbarStateArr$values);
    }

    private TextToolbarState(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) $VALUES.clone();
    }
}
