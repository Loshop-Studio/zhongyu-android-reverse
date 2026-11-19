package androidx.compose.foundation.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/compose/foundation/text/Handle;", "", "(Ljava/lang/String;I)V", "Cursor", "SelectionStart", "SelectionEnd", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Handle {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ Handle[] $VALUES;
    public static final Handle Cursor = new Handle("Cursor", 0);
    public static final Handle SelectionStart = new Handle("SelectionStart", 1);
    public static final Handle SelectionEnd = new Handle("SelectionEnd", 2);

    private static final /* synthetic */ Handle[] $values() {
        return new Handle[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        Handle[] handleArr$values = $values();
        $VALUES = handleArr$values;
        $ENTRIES = AbstractC5817a.m5310a(handleArr$values);
    }

    private Handle(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }
}
