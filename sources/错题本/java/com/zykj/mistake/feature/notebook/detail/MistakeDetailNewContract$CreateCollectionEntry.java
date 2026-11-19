package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;", "EMPTY_DIRECT", "FROM_SELECT", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$CreateCollectionEntry {
    public static final MistakeDetailNewContract$CreateCollectionEntry EMPTY_DIRECT;
    public static final MistakeDetailNewContract$CreateCollectionEntry FROM_SELECT;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$CreateCollectionEntry[] f6864a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6865b;

    static {
        MistakeDetailNewContract$CreateCollectionEntry mistakeDetailNewContract$CreateCollectionEntry = new MistakeDetailNewContract$CreateCollectionEntry("EMPTY_DIRECT", 0);
        EMPTY_DIRECT = mistakeDetailNewContract$CreateCollectionEntry;
        MistakeDetailNewContract$CreateCollectionEntry mistakeDetailNewContract$CreateCollectionEntry2 = new MistakeDetailNewContract$CreateCollectionEntry("FROM_SELECT", 1);
        FROM_SELECT = mistakeDetailNewContract$CreateCollectionEntry2;
        MistakeDetailNewContract$CreateCollectionEntry[] mistakeDetailNewContract$CreateCollectionEntryArr = {mistakeDetailNewContract$CreateCollectionEntry, mistakeDetailNewContract$CreateCollectionEntry2};
        f6864a = mistakeDetailNewContract$CreateCollectionEntryArr;
        f6865b = AbstractC5817a.m5310a(mistakeDetailNewContract$CreateCollectionEntryArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6865b;
    }

    public static MistakeDetailNewContract$CreateCollectionEntry valueOf(String str) {
        return (MistakeDetailNewContract$CreateCollectionEntry) Enum.valueOf(MistakeDetailNewContract$CreateCollectionEntry.class, str);
    }

    public static MistakeDetailNewContract$CreateCollectionEntry[] values() {
        return (MistakeDetailNewContract$CreateCollectionEntry[]) f6864a.clone();
    }
}
