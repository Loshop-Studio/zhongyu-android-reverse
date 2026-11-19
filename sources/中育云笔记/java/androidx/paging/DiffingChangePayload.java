package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class DiffingChangePayload {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ DiffingChangePayload[] $VALUES;
    public static final DiffingChangePayload ITEM_TO_PLACEHOLDER = new DiffingChangePayload("ITEM_TO_PLACEHOLDER", 0);
    public static final DiffingChangePayload PLACEHOLDER_TO_ITEM = new DiffingChangePayload("PLACEHOLDER_TO_ITEM", 1);
    public static final DiffingChangePayload PLACEHOLDER_POSITION_CHANGE = new DiffingChangePayload("PLACEHOLDER_POSITION_CHANGE", 2);

    private static final /* synthetic */ DiffingChangePayload[] $values() {
        return new DiffingChangePayload[]{ITEM_TO_PLACEHOLDER, PLACEHOLDER_TO_ITEM, PLACEHOLDER_POSITION_CHANGE};
    }

    static {
        DiffingChangePayload[] diffingChangePayloadArr$values = $values();
        $VALUES = diffingChangePayloadArr$values;
        $ENTRIES = AbstractC9953a.m20230a(diffingChangePayloadArr$values);
    }

    private DiffingChangePayload(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static DiffingChangePayload valueOf(String str) {
        return (DiffingChangePayload) Enum.valueOf(DiffingChangePayload.class, str);
    }

    public static DiffingChangePayload[] values() {
        return (DiffingChangePayload[]) $VALUES.clone();
    }
}
