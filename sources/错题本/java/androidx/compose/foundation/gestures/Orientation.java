package androidx.compose.foundation.gestures;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Orientation {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation Vertical = new Orientation("Vertical", 0);
    public static final Orientation Horizontal = new Orientation("Horizontal", 1);

    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{Vertical, Horizontal};
    }

    static {
        Orientation[] orientationArr$values = $values();
        $VALUES = orientationArr$values;
        $ENTRIES = AbstractC5817a.m5310a(orientationArr$values);
    }

    private Orientation(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
