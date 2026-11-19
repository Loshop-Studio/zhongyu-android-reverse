package com.zykj.mistake.feature.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"com/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType", "", "Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;", "IMAGE", "TEXT", "WEB", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeAskMaterialContract$SourceType {
    public static final MistakeAskMaterialContract$SourceType IMAGE;
    public static final MistakeAskMaterialContract$SourceType TEXT;
    public static final MistakeAskMaterialContract$SourceType WEB;

    /* renamed from: a */
    public static final /* synthetic */ MistakeAskMaterialContract$SourceType[] f6208a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6209b;

    static {
        MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType = new MistakeAskMaterialContract$SourceType("IMAGE", 0);
        IMAGE = mistakeAskMaterialContract$SourceType;
        MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType2 = new MistakeAskMaterialContract$SourceType("TEXT", 1);
        TEXT = mistakeAskMaterialContract$SourceType2;
        MistakeAskMaterialContract$SourceType mistakeAskMaterialContract$SourceType3 = new MistakeAskMaterialContract$SourceType("WEB", 2);
        WEB = mistakeAskMaterialContract$SourceType3;
        MistakeAskMaterialContract$SourceType[] mistakeAskMaterialContract$SourceTypeArr = {mistakeAskMaterialContract$SourceType, mistakeAskMaterialContract$SourceType2, mistakeAskMaterialContract$SourceType3};
        f6208a = mistakeAskMaterialContract$SourceTypeArr;
        f6209b = AbstractC5817a.m5310a(mistakeAskMaterialContract$SourceTypeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6209b;
    }

    public static MistakeAskMaterialContract$SourceType valueOf(String str) {
        return (MistakeAskMaterialContract$SourceType) Enum.valueOf(MistakeAskMaterialContract$SourceType.class, str);
    }

    public static MistakeAskMaterialContract$SourceType[] values() {
        return (MistakeAskMaterialContract$SourceType[]) f6208a.clone();
    }
}
