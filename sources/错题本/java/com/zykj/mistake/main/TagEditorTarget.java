package com.zykj.mistake.main;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/main/TagEditorTarget;", "", "NOTEBOOK", "DETAIL", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TagEditorTarget {
    public static final TagEditorTarget DETAIL;
    public static final TagEditorTarget NOTEBOOK;

    /* renamed from: a */
    public static final /* synthetic */ TagEditorTarget[] f7821a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7822b;

    static {
        TagEditorTarget tagEditorTarget = new TagEditorTarget("NOTEBOOK", 0);
        NOTEBOOK = tagEditorTarget;
        TagEditorTarget tagEditorTarget2 = new TagEditorTarget("DETAIL", 1);
        DETAIL = tagEditorTarget2;
        TagEditorTarget[] tagEditorTargetArr = {tagEditorTarget, tagEditorTarget2};
        f7821a = tagEditorTargetArr;
        f7822b = AbstractC5817a.m5310a(tagEditorTargetArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7822b;
    }

    public static TagEditorTarget valueOf(String str) {
        return (TagEditorTarget) Enum.valueOf(TagEditorTarget.class, str);
    }

    public static TagEditorTarget[] values() {
        return (TagEditorTarget[]) f7821a.clone();
    }
}
