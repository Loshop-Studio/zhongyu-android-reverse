package androidx.compose.runtime;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class InvalidationResult {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
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
        $ENTRIES = AbstractC9953a.m20230a(invalidationResultArr$values);
    }

    private InvalidationResult(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) $VALUES.clone();
    }
}
