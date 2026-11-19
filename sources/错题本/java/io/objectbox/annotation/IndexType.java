package io.objectbox.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class IndexType {
    public static final IndexType DEFAULT;
    public static final IndexType HASH;
    public static final IndexType HASH64;
    public static final IndexType VALUE;

    /* renamed from: a */
    public static final /* synthetic */ IndexType[] f8927a;

    static {
        IndexType indexType = new IndexType("DEFAULT", 0);
        DEFAULT = indexType;
        IndexType indexType2 = new IndexType("VALUE", 1);
        VALUE = indexType2;
        IndexType indexType3 = new IndexType("HASH", 2);
        HASH = indexType3;
        IndexType indexType4 = new IndexType("HASH64", 3);
        HASH64 = indexType4;
        f8927a = new IndexType[]{indexType, indexType2, indexType3, indexType4};
    }

    public static IndexType valueOf(String str) {
        return (IndexType) Enum.valueOf(IndexType.class, str);
    }

    public static IndexType[] values() {
        return (IndexType[]) f8927a.clone();
    }
}
