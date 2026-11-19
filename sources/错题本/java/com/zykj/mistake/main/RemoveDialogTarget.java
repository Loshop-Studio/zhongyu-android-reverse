package com.zykj.mistake.main;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/main/RemoveDialogTarget;", "", "NOTEBOOK", "DETAIL", "COLLECTION", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RemoveDialogTarget {
    public static final RemoveDialogTarget COLLECTION;
    public static final RemoveDialogTarget DETAIL;
    public static final RemoveDialogTarget NOTEBOOK;

    /* renamed from: a */
    public static final /* synthetic */ RemoveDialogTarget[] f7819a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7820b;

    static {
        RemoveDialogTarget removeDialogTarget = new RemoveDialogTarget("NOTEBOOK", 0);
        NOTEBOOK = removeDialogTarget;
        RemoveDialogTarget removeDialogTarget2 = new RemoveDialogTarget("DETAIL", 1);
        DETAIL = removeDialogTarget2;
        RemoveDialogTarget removeDialogTarget3 = new RemoveDialogTarget("COLLECTION", 2);
        COLLECTION = removeDialogTarget3;
        RemoveDialogTarget[] removeDialogTargetArr = {removeDialogTarget, removeDialogTarget2, removeDialogTarget3};
        f7819a = removeDialogTargetArr;
        f7820b = AbstractC5817a.m5310a(removeDialogTargetArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7820b;
    }

    public static RemoveDialogTarget valueOf(String str) {
        return (RemoveDialogTarget) Enum.valueOf(RemoveDialogTarget.class, str);
    }

    public static RemoveDialogTarget[] values() {
        return (RemoveDialogTarget[]) f7819a.clone();
    }
}
