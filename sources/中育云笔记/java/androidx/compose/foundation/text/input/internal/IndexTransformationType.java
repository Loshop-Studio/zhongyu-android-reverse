package androidx.compose.foundation.text.input.internal;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IndexTransformationType {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ IndexTransformationType[] $VALUES;
    public static final IndexTransformationType Untransformed = new IndexTransformationType("Untransformed", 0);
    public static final IndexTransformationType Insertion = new IndexTransformationType("Insertion", 1);
    public static final IndexTransformationType Replacement = new IndexTransformationType("Replacement", 2);
    public static final IndexTransformationType Deletion = new IndexTransformationType("Deletion", 3);

    private static final /* synthetic */ IndexTransformationType[] $values() {
        return new IndexTransformationType[]{Untransformed, Insertion, Replacement, Deletion};
    }

    static {
        IndexTransformationType[] indexTransformationTypeArr$values = $values();
        $VALUES = indexTransformationTypeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(indexTransformationTypeArr$values);
    }

    private IndexTransformationType(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) $VALUES.clone();
    }
}
