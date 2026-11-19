package com.zykj.mistake.platform.picker;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;", "", "DETAIL_FILTER", "FILTER_RESULT", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CollectionDatePickerTarget {
    public static final CollectionDatePickerTarget DETAIL_FILTER;
    public static final CollectionDatePickerTarget FILTER_RESULT;

    /* renamed from: a */
    public static final /* synthetic */ CollectionDatePickerTarget[] f7992a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7993b;

    static {
        CollectionDatePickerTarget collectionDatePickerTarget = new CollectionDatePickerTarget("DETAIL_FILTER", 0);
        DETAIL_FILTER = collectionDatePickerTarget;
        CollectionDatePickerTarget collectionDatePickerTarget2 = new CollectionDatePickerTarget("FILTER_RESULT", 1);
        FILTER_RESULT = collectionDatePickerTarget2;
        CollectionDatePickerTarget[] collectionDatePickerTargetArr = {collectionDatePickerTarget, collectionDatePickerTarget2};
        f7992a = collectionDatePickerTargetArr;
        f7993b = AbstractC5817a.m5310a(collectionDatePickerTargetArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7993b;
    }

    public static CollectionDatePickerTarget valueOf(String str) {
        return (CollectionDatePickerTarget) Enum.valueOf(CollectionDatePickerTarget.class, str);
    }

    public static CollectionDatePickerTarget[] values() {
        return (CollectionDatePickerTarget[]) f7992a.clone();
    }
}
