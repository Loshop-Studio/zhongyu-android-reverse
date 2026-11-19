package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ReflectionAccessFilter$FilterResult {
    public static final ReflectionAccessFilter$FilterResult ALLOW;
    public static final ReflectionAccessFilter$FilterResult BLOCK_ALL;
    public static final ReflectionAccessFilter$FilterResult BLOCK_INACCESSIBLE;
    public static final ReflectionAccessFilter$FilterResult INDECISIVE;

    /* renamed from: a */
    public static final /* synthetic */ ReflectionAccessFilter$FilterResult[] f2969a;

    static {
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult = new ReflectionAccessFilter$FilterResult("ALLOW", 0);
        ALLOW = reflectionAccessFilter$FilterResult;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult2 = new ReflectionAccessFilter$FilterResult("INDECISIVE", 1);
        INDECISIVE = reflectionAccessFilter$FilterResult2;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult3 = new ReflectionAccessFilter$FilterResult("BLOCK_INACCESSIBLE", 2);
        BLOCK_INACCESSIBLE = reflectionAccessFilter$FilterResult3;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult4 = new ReflectionAccessFilter$FilterResult("BLOCK_ALL", 3);
        BLOCK_ALL = reflectionAccessFilter$FilterResult4;
        f2969a = new ReflectionAccessFilter$FilterResult[]{reflectionAccessFilter$FilterResult, reflectionAccessFilter$FilterResult2, reflectionAccessFilter$FilterResult3, reflectionAccessFilter$FilterResult4};
    }

    public static ReflectionAccessFilter$FilterResult valueOf(String str) {
        return (ReflectionAccessFilter$FilterResult) Enum.valueOf(ReflectionAccessFilter$FilterResult.class, str);
    }

    public static ReflectionAccessFilter$FilterResult[] values() {
        return (ReflectionAccessFilter$FilterResult[]) f2969a.clone();
    }
}
