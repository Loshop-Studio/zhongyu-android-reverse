package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType", "", "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;", "TIME", "SUBJECT", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeCollectionFilterResultContract$SortType {
    public static final MistakeCollectionFilterResultContract$SortType SUBJECT;
    public static final MistakeCollectionFilterResultContract$SortType TIME;

    /* renamed from: a */
    public static final /* synthetic */ MistakeCollectionFilterResultContract$SortType[] f6572a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6573b;

    static {
        MistakeCollectionFilterResultContract$SortType mistakeCollectionFilterResultContract$SortType = new MistakeCollectionFilterResultContract$SortType("TIME", 0);
        TIME = mistakeCollectionFilterResultContract$SortType;
        MistakeCollectionFilterResultContract$SortType mistakeCollectionFilterResultContract$SortType2 = new MistakeCollectionFilterResultContract$SortType("SUBJECT", 1);
        SUBJECT = mistakeCollectionFilterResultContract$SortType2;
        MistakeCollectionFilterResultContract$SortType[] mistakeCollectionFilterResultContract$SortTypeArr = {mistakeCollectionFilterResultContract$SortType, mistakeCollectionFilterResultContract$SortType2};
        f6572a = mistakeCollectionFilterResultContract$SortTypeArr;
        f6573b = AbstractC5817a.m5310a(mistakeCollectionFilterResultContract$SortTypeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6573b;
    }

    public static MistakeCollectionFilterResultContract$SortType valueOf(String str) {
        return (MistakeCollectionFilterResultContract$SortType) Enum.valueOf(MistakeCollectionFilterResultContract$SortType.class, str);
    }

    public static MistakeCollectionFilterResultContract$SortType[] values() {
        return (MistakeCollectionFilterResultContract$SortType[]) f6572a.clone();
    }
}
