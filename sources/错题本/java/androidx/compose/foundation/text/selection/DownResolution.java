package androidx.compose.foundation.text.selection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "(Ljava/lang/String;I)V", "Up", "Drag", "Timeout", "Cancel", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DownResolution {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ DownResolution[] $VALUES;

    /* renamed from: Up */
    public static final DownResolution f785Up = new DownResolution("Up", 0);
    public static final DownResolution Drag = new DownResolution("Drag", 1);
    public static final DownResolution Timeout = new DownResolution("Timeout", 2);
    public static final DownResolution Cancel = new DownResolution("Cancel", 3);

    private static final /* synthetic */ DownResolution[] $values() {
        return new DownResolution[]{f785Up, Drag, Timeout, Cancel};
    }

    static {
        DownResolution[] downResolutionArr$values = $values();
        $VALUES = downResolutionArr$values;
        $ENTRIES = AbstractC5817a.m5310a(downResolutionArr$values);
    }

    private DownResolution(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) $VALUES.clone();
    }
}
