package com.zykj.mistake.feature.collection.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode", "", "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;", "CREATED", "EXISTING", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeCollectionDetailContract$EntryMode {
    public static final MistakeCollectionDetailContract$EntryMode CREATED;
    public static final MistakeCollectionDetailContract$EntryMode EXISTING;

    /* renamed from: a */
    public static final /* synthetic */ MistakeCollectionDetailContract$EntryMode[] f6433a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6434b;

    static {
        MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode = new MistakeCollectionDetailContract$EntryMode("CREATED", 0);
        CREATED = mistakeCollectionDetailContract$EntryMode;
        MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode2 = new MistakeCollectionDetailContract$EntryMode("EXISTING", 1);
        EXISTING = mistakeCollectionDetailContract$EntryMode2;
        MistakeCollectionDetailContract$EntryMode[] mistakeCollectionDetailContract$EntryModeArr = {mistakeCollectionDetailContract$EntryMode, mistakeCollectionDetailContract$EntryMode2};
        f6433a = mistakeCollectionDetailContract$EntryModeArr;
        f6434b = AbstractC5817a.m5310a(mistakeCollectionDetailContract$EntryModeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6434b;
    }

    public static MistakeCollectionDetailContract$EntryMode valueOf(String str) {
        return (MistakeCollectionDetailContract$EntryMode) Enum.valueOf(MistakeCollectionDetailContract$EntryMode.class, str);
    }

    public static MistakeCollectionDetailContract$EntryMode[] values() {
        return (MistakeCollectionDetailContract$EntryMode[]) f6433a.clone();
    }
}
