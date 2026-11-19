package com.zykj.mistake.feature.collection.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode", "", "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;", "INITIAL_FILTER", "ADD_FILTER", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeCollectionDetailContract$DrawerMode {
    public static final MistakeCollectionDetailContract$DrawerMode ADD_FILTER;
    public static final MistakeCollectionDetailContract$DrawerMode INITIAL_FILTER;

    /* renamed from: a */
    public static final /* synthetic */ MistakeCollectionDetailContract$DrawerMode[] f6431a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6432b;

    static {
        MistakeCollectionDetailContract$DrawerMode mistakeCollectionDetailContract$DrawerMode = new MistakeCollectionDetailContract$DrawerMode("INITIAL_FILTER", 0);
        INITIAL_FILTER = mistakeCollectionDetailContract$DrawerMode;
        MistakeCollectionDetailContract$DrawerMode mistakeCollectionDetailContract$DrawerMode2 = new MistakeCollectionDetailContract$DrawerMode("ADD_FILTER", 1);
        ADD_FILTER = mistakeCollectionDetailContract$DrawerMode2;
        MistakeCollectionDetailContract$DrawerMode[] mistakeCollectionDetailContract$DrawerModeArr = {mistakeCollectionDetailContract$DrawerMode, mistakeCollectionDetailContract$DrawerMode2};
        f6431a = mistakeCollectionDetailContract$DrawerModeArr;
        f6432b = AbstractC5817a.m5310a(mistakeCollectionDetailContract$DrawerModeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6432b;
    }

    public static MistakeCollectionDetailContract$DrawerMode valueOf(String str) {
        return (MistakeCollectionDetailContract$DrawerMode) Enum.valueOf(MistakeCollectionDetailContract$DrawerMode.class, str);
    }

    public static MistakeCollectionDetailContract$DrawerMode[] values() {
        return (MistakeCollectionDetailContract$DrawerMode[]) f6431a.clone();
    }
}
