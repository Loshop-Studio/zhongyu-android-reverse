package com.zykj.view.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m5110d2 = {"Lcom/zykj/view/utils/ZoomPointSolution;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "CENTER_TOP", "CENTER_LEFT", "CENTER_RIGHT", "CENTER_BOTTOM", "CENTER", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ZoomPointSolution {
    private static final /* synthetic */ InterfaceC5748a $ENTRIES;
    private static final /* synthetic */ ZoomPointSolution[] $VALUES;
    private int value;
    public static final ZoomPointSolution TOP_LEFT = new ZoomPointSolution("TOP_LEFT", 0, 0);
    public static final ZoomPointSolution TOP_RIGHT = new ZoomPointSolution("TOP_RIGHT", 1, 1);
    public static final ZoomPointSolution BOTTOM_LEFT = new ZoomPointSolution("BOTTOM_LEFT", 2, 2);
    public static final ZoomPointSolution BOTTOM_RIGHT = new ZoomPointSolution("BOTTOM_RIGHT", 3, 3);
    public static final ZoomPointSolution CENTER_TOP = new ZoomPointSolution("CENTER_TOP", 4, 4);
    public static final ZoomPointSolution CENTER_LEFT = new ZoomPointSolution("CENTER_LEFT", 5, 5);
    public static final ZoomPointSolution CENTER_RIGHT = new ZoomPointSolution("CENTER_RIGHT", 6, 6);
    public static final ZoomPointSolution CENTER_BOTTOM = new ZoomPointSolution("CENTER_BOTTOM", 7, 7);
    public static final ZoomPointSolution CENTER = new ZoomPointSolution("CENTER", 8, 8);

    private static final /* synthetic */ ZoomPointSolution[] $values() {
        return new ZoomPointSolution[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, CENTER_TOP, CENTER_LEFT, CENTER_RIGHT, CENTER_BOTTOM, CENTER};
    }

    static {
        ZoomPointSolution[] zoomPointSolutionArr$values = $values();
        $VALUES = zoomPointSolutionArr$values;
        $ENTRIES = AbstractC5817a.m5310a(zoomPointSolutionArr$values);
    }

    private ZoomPointSolution(String str, int i, int i8) {
        this.value = i8;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return $ENTRIES;
    }

    public static ZoomPointSolution valueOf(String str) {
        return (ZoomPointSolution) Enum.valueOf(ZoomPointSolution.class, str);
    }

    public static ZoomPointSolution[] values() {
        return (ZoomPointSolution[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }
}
