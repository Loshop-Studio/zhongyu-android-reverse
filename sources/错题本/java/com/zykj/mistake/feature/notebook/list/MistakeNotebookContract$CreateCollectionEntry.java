package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry", "", "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$CreateCollectionEntry;", "EMPTY_DIRECT", "FROM_SELECT", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeNotebookContract$CreateCollectionEntry {
    public static final MistakeNotebookContract$CreateCollectionEntry EMPTY_DIRECT;
    public static final MistakeNotebookContract$CreateCollectionEntry FROM_SELECT;

    /* renamed from: a */
    public static final /* synthetic */ MistakeNotebookContract$CreateCollectionEntry[] f7443a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7444b;

    static {
        MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry = new MistakeNotebookContract$CreateCollectionEntry("EMPTY_DIRECT", 0);
        EMPTY_DIRECT = mistakeNotebookContract$CreateCollectionEntry;
        MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry2 = new MistakeNotebookContract$CreateCollectionEntry("FROM_SELECT", 1);
        FROM_SELECT = mistakeNotebookContract$CreateCollectionEntry2;
        MistakeNotebookContract$CreateCollectionEntry[] mistakeNotebookContract$CreateCollectionEntryArr = {mistakeNotebookContract$CreateCollectionEntry, mistakeNotebookContract$CreateCollectionEntry2};
        f7443a = mistakeNotebookContract$CreateCollectionEntryArr;
        f7444b = AbstractC5817a.m5310a(mistakeNotebookContract$CreateCollectionEntryArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7444b;
    }

    public static MistakeNotebookContract$CreateCollectionEntry valueOf(String str) {
        return (MistakeNotebookContract$CreateCollectionEntry) Enum.valueOf(MistakeNotebookContract$CreateCollectionEntry.class, str);
    }

    public static MistakeNotebookContract$CreateCollectionEntry[] values() {
        return (MistakeNotebookContract$CreateCollectionEntry[]) f7443a.clone();
    }
}
