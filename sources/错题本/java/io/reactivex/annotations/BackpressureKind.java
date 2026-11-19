package io.reactivex.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class BackpressureKind {
    public static final BackpressureKind ERROR;
    public static final BackpressureKind FULL;
    public static final BackpressureKind NONE;
    public static final BackpressureKind PASS_THROUGH;
    public static final BackpressureKind SPECIAL;
    public static final BackpressureKind UNBOUNDED_IN;

    /* renamed from: a */
    public static final /* synthetic */ BackpressureKind[] f8993a;

    static {
        BackpressureKind backpressureKind = new BackpressureKind("PASS_THROUGH", 0);
        PASS_THROUGH = backpressureKind;
        BackpressureKind backpressureKind2 = new BackpressureKind("FULL", 1);
        FULL = backpressureKind2;
        BackpressureKind backpressureKind3 = new BackpressureKind("SPECIAL", 2);
        SPECIAL = backpressureKind3;
        BackpressureKind backpressureKind4 = new BackpressureKind("UNBOUNDED_IN", 3);
        UNBOUNDED_IN = backpressureKind4;
        BackpressureKind backpressureKind5 = new BackpressureKind("ERROR", 4);
        ERROR = backpressureKind5;
        BackpressureKind backpressureKind6 = new BackpressureKind("NONE", 5);
        NONE = backpressureKind6;
        f8993a = new BackpressureKind[]{backpressureKind, backpressureKind2, backpressureKind3, backpressureKind4, backpressureKind5, backpressureKind6};
    }

    public static BackpressureKind valueOf(String str) {
        return (BackpressureKind) Enum.valueOf(BackpressureKind.class, str);
    }

    public static BackpressureKind[] values() {
        return (BackpressureKind[]) f8993a.clone();
    }
}
