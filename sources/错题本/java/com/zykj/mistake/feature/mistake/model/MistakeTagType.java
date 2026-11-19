package com.zykj.mistake.feature.mistake.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.play.C5353b;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;
import p137p4.C6387f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;", "", "Companion", "p4/f", "RED", "GREEN", "ORANGE", "BLUE", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable
/* loaded from: classes3.dex */
public final class MistakeTagType {
    public static final MistakeTagType BLUE;

    @NotNull
    public static final C6387f Companion;
    public static final MistakeTagType GREEN;
    public static final MistakeTagType ORANGE;
    public static final MistakeTagType RED;

    /* renamed from: a */
    public static final Object f6848a;

    /* renamed from: b */
    public static final /* synthetic */ MistakeTagType[] f6849b;

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC5748a f6850c;

    static {
        MistakeTagType mistakeTagType = new MistakeTagType("RED", 0);
        RED = mistakeTagType;
        MistakeTagType mistakeTagType2 = new MistakeTagType("GREEN", 1);
        GREEN = mistakeTagType2;
        MistakeTagType mistakeTagType3 = new MistakeTagType("ORANGE", 2);
        ORANGE = mistakeTagType3;
        MistakeTagType mistakeTagType4 = new MistakeTagType("BLUE", 3);
        BLUE = mistakeTagType4;
        MistakeTagType[] mistakeTagTypeArr = {mistakeTagType, mistakeTagType2, mistakeTagType3, mistakeTagType4};
        f6849b = mistakeTagTypeArr;
        f6850c = AbstractC5817a.m5310a(mistakeTagTypeArr);
        Companion = new C6387f();
        f6848a = AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C5353b(22));
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6850c;
    }

    public static MistakeTagType valueOf(String str) {
        return (MistakeTagType) Enum.valueOf(MistakeTagType.class, str);
    }

    public static MistakeTagType[] values() {
        return (MistakeTagType[]) f6849b.clone();
    }
}
