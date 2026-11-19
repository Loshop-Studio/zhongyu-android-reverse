package com.zykj.mistake.feature.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m5110d2 = {"com/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType", "", "Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "STEM", "ORIGINAL_ANSWER", "REVISED_ANSWER", "TYPICAL_RIGHT", "TYPICAL_ERROR", "BOARD_NOTE", "PICTURE_NOTE", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeAskMaterialContract$MaterialType {
    public static final MistakeAskMaterialContract$MaterialType BOARD_NOTE;
    public static final MistakeAskMaterialContract$MaterialType ORIGINAL_ANSWER;
    public static final MistakeAskMaterialContract$MaterialType PICTURE_NOTE;
    public static final MistakeAskMaterialContract$MaterialType REVISED_ANSWER;
    public static final MistakeAskMaterialContract$MaterialType STEM;
    public static final MistakeAskMaterialContract$MaterialType TYPICAL_ERROR;
    public static final MistakeAskMaterialContract$MaterialType TYPICAL_RIGHT;

    /* renamed from: a */
    public static final /* synthetic */ MistakeAskMaterialContract$MaterialType[] f6206a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6207b;

    @NotNull
    private final String title;

    static {
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType = new MistakeAskMaterialContract$MaterialType("STEM", 0, "题干");
        STEM = mistakeAskMaterialContract$MaterialType;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType2 = new MistakeAskMaterialContract$MaterialType("ORIGINAL_ANSWER", 1, "原答案");
        ORIGINAL_ANSWER = mistakeAskMaterialContract$MaterialType2;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType3 = new MistakeAskMaterialContract$MaterialType("REVISED_ANSWER", 2, "订正答案");
        REVISED_ANSWER = mistakeAskMaterialContract$MaterialType3;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType4 = new MistakeAskMaterialContract$MaterialType("TYPICAL_RIGHT", 3, "优秀解答");
        TYPICAL_RIGHT = mistakeAskMaterialContract$MaterialType4;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType5 = new MistakeAskMaterialContract$MaterialType("TYPICAL_ERROR", 4, "典型错误");
        TYPICAL_ERROR = mistakeAskMaterialContract$MaterialType5;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType6 = new MistakeAskMaterialContract$MaterialType("BOARD_NOTE", 5, "画板笔记");
        BOARD_NOTE = mistakeAskMaterialContract$MaterialType6;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType7 = new MistakeAskMaterialContract$MaterialType("PICTURE_NOTE", 6, "图片笔记");
        PICTURE_NOTE = mistakeAskMaterialContract$MaterialType7;
        MistakeAskMaterialContract$MaterialType[] mistakeAskMaterialContract$MaterialTypeArr = {mistakeAskMaterialContract$MaterialType, mistakeAskMaterialContract$MaterialType2, mistakeAskMaterialContract$MaterialType3, mistakeAskMaterialContract$MaterialType4, mistakeAskMaterialContract$MaterialType5, mistakeAskMaterialContract$MaterialType6, mistakeAskMaterialContract$MaterialType7};
        f6206a = mistakeAskMaterialContract$MaterialTypeArr;
        f6207b = AbstractC5817a.m5310a(mistakeAskMaterialContract$MaterialTypeArr);
    }

    public MistakeAskMaterialContract$MaterialType(String str, int i, String str2) {
        this.title = str2;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6207b;
    }

    public static MistakeAskMaterialContract$MaterialType valueOf(String str) {
        return (MistakeAskMaterialContract$MaterialType) Enum.valueOf(MistakeAskMaterialContract$MaterialType.class, str);
    }

    public static MistakeAskMaterialContract$MaterialType[] values() {
        return (MistakeAskMaterialContract$MaterialType[]) f6206a.clone();
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
