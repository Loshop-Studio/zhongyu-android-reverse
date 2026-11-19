package com.xuexiang.xui.widget.dialog.materialdialog;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StackingBehavior {
    public static final StackingBehavior ADAPTIVE;
    public static final StackingBehavior ALWAYS;
    public static final StackingBehavior NEVER;

    /* renamed from: a */
    public static final /* synthetic */ StackingBehavior[] f4256a;

    static {
        StackingBehavior stackingBehavior = new StackingBehavior("ALWAYS", 0);
        ALWAYS = stackingBehavior;
        StackingBehavior stackingBehavior2 = new StackingBehavior("ADAPTIVE", 1);
        ADAPTIVE = stackingBehavior2;
        StackingBehavior stackingBehavior3 = new StackingBehavior("NEVER", 2);
        NEVER = stackingBehavior3;
        f4256a = new StackingBehavior[]{stackingBehavior, stackingBehavior2, stackingBehavior3};
    }

    public static StackingBehavior valueOf(String str) {
        return (StackingBehavior) Enum.valueOf(StackingBehavior.class, str);
    }

    public static StackingBehavior[] values() {
        return (StackingBehavior[]) f4256a.clone();
    }
}
