package org.greenrobot.essentials.collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MultimapSet$SetType {
    public static final MultimapSet$SetType REGULAR;
    public static final MultimapSet$SetType THREAD_SAFE;

    /* renamed from: a */
    public static final /* synthetic */ MultimapSet$SetType[] f10393a;

    static {
        MultimapSet$SetType multimapSet$SetType = new MultimapSet$SetType("REGULAR", 0);
        REGULAR = multimapSet$SetType;
        MultimapSet$SetType multimapSet$SetType2 = new MultimapSet$SetType("THREAD_SAFE", 1);
        THREAD_SAFE = multimapSet$SetType2;
        f10393a = new MultimapSet$SetType[]{multimapSet$SetType, multimapSet$SetType2};
    }

    public static MultimapSet$SetType valueOf(String str) {
        return (MultimapSet$SetType) Enum.valueOf(MultimapSet$SetType.class, str);
    }

    public static MultimapSet$SetType[] values() {
        return (MultimapSet$SetType[]) f10393a.clone();
    }
}
