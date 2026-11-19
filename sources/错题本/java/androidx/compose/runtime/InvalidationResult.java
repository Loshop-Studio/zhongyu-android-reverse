package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "(Ljava/lang/String;I)V", "IGNORED", "SCHEDULED", "DEFERRED", "IMMINENT", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InvalidationResult {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ InvalidationResult[] $VALUES;
    public static final InvalidationResult IGNORED = new InvalidationResult("IGNORED", 0);
    public static final InvalidationResult SCHEDULED = new InvalidationResult("SCHEDULED", 1);
    public static final InvalidationResult DEFERRED = new InvalidationResult("DEFERRED", 2);
    public static final InvalidationResult IMMINENT = new InvalidationResult("IMMINENT", 3);

    private static final /* synthetic */ InvalidationResult[] $values() {
        return new InvalidationResult[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    static {
        InvalidationResult[] invalidationResultArr$values = $values();
        $VALUES = invalidationResultArr$values;
        $ENTRIES = AbstractC5817a.m5310a(invalidationResultArr$values);
    }

    private InvalidationResult(String str, int i) {
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) $VALUES.clone();
    }
}
