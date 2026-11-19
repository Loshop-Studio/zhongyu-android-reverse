package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;", "", "ADD_ONLY", "EDIT_JOINED", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class JoinCollectionDialogMode {
    public static final JoinCollectionDialogMode ADD_ONLY;
    public static final JoinCollectionDialogMode EDIT_JOINED;

    /* renamed from: a */
    public static final /* synthetic */ JoinCollectionDialogMode[] f7441a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7442b;

    static {
        JoinCollectionDialogMode joinCollectionDialogMode = new JoinCollectionDialogMode("ADD_ONLY", 0);
        ADD_ONLY = joinCollectionDialogMode;
        JoinCollectionDialogMode joinCollectionDialogMode2 = new JoinCollectionDialogMode("EDIT_JOINED", 1);
        EDIT_JOINED = joinCollectionDialogMode2;
        JoinCollectionDialogMode[] joinCollectionDialogModeArr = {joinCollectionDialogMode, joinCollectionDialogMode2};
        f7441a = joinCollectionDialogModeArr;
        f7442b = AbstractC5817a.m5310a(joinCollectionDialogModeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7442b;
    }

    public static JoinCollectionDialogMode valueOf(String str) {
        return (JoinCollectionDialogMode) Enum.valueOf(JoinCollectionDialogMode.class, str);
    }

    public static JoinCollectionDialogMode[] values() {
        return (JoinCollectionDialogMode[]) f7441a.clone();
    }
}
