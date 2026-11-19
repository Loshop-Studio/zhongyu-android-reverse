package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType", "", "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;", "CREATE_COLLECTION", "EXISTING_COLLECTION_ADD", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeCollectionFilterResultContract$SourceType {
    public static final MistakeCollectionFilterResultContract$SourceType CREATE_COLLECTION;
    public static final MistakeCollectionFilterResultContract$SourceType EXISTING_COLLECTION_ADD;

    /* renamed from: a */
    public static final /* synthetic */ MistakeCollectionFilterResultContract$SourceType[] f6574a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6575b;

    static {
        MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType = new MistakeCollectionFilterResultContract$SourceType("CREATE_COLLECTION", 0);
        CREATE_COLLECTION = mistakeCollectionFilterResultContract$SourceType;
        MistakeCollectionFilterResultContract$SourceType mistakeCollectionFilterResultContract$SourceType2 = new MistakeCollectionFilterResultContract$SourceType("EXISTING_COLLECTION_ADD", 1);
        EXISTING_COLLECTION_ADD = mistakeCollectionFilterResultContract$SourceType2;
        MistakeCollectionFilterResultContract$SourceType[] mistakeCollectionFilterResultContract$SourceTypeArr = {mistakeCollectionFilterResultContract$SourceType, mistakeCollectionFilterResultContract$SourceType2};
        f6574a = mistakeCollectionFilterResultContract$SourceTypeArr;
        f6575b = AbstractC5817a.m5310a(mistakeCollectionFilterResultContract$SourceTypeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6575b;
    }

    public static MistakeCollectionFilterResultContract$SourceType valueOf(String str) {
        return (MistakeCollectionFilterResultContract$SourceType) Enum.valueOf(MistakeCollectionFilterResultContract$SourceType.class, str);
    }

    public static MistakeCollectionFilterResultContract$SourceType[] values() {
        return (MistakeCollectionFilterResultContract$SourceType[]) f6574a.clone();
    }
}
