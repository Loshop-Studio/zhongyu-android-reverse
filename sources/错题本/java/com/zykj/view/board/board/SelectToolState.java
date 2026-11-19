package com.zykj.view.board.board;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m5110d2 = {"Lcom/zykj/view/board/board/SelectToolState;", "", "penSelected", "", "highlighterSelected", "imageSelected", "textSelected", "geometrySelected", "<init>", "(ZZZZZ)V", "getPenSelected", "()Z", "getHighlighterSelected", "getImageSelected", "getTextSelected", "getGeometrySelected", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SelectToolState {
    private final boolean geometrySelected;
    private final boolean highlighterSelected;
    private final boolean imageSelected;
    private final boolean penSelected;
    private final boolean textSelected;

    public SelectToolState() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ SelectToolState copy$default(SelectToolState selectToolState, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = selectToolState.penSelected;
        }
        if ((i & 2) != 0) {
            z9 = selectToolState.highlighterSelected;
        }
        if ((i & 4) != 0) {
            z10 = selectToolState.imageSelected;
        }
        if ((i & 8) != 0) {
            z11 = selectToolState.textSelected;
        }
        if ((i & 16) != 0) {
            z12 = selectToolState.geometrySelected;
        }
        boolean z13 = z12;
        boolean z14 = z10;
        return selectToolState.copy(z8, z9, z14, z11, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPenSelected() {
        return this.penSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHighlighterSelected() {
        return this.highlighterSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getImageSelected() {
        return this.imageSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTextSelected() {
        return this.textSelected;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getGeometrySelected() {
        return this.geometrySelected;
    }

    @NotNull
    public final SelectToolState copy(boolean penSelected, boolean highlighterSelected, boolean imageSelected, boolean textSelected, boolean geometrySelected) {
        return new SelectToolState(penSelected, highlighterSelected, imageSelected, textSelected, geometrySelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectToolState)) {
            return false;
        }
        SelectToolState selectToolState = (SelectToolState) other;
        return this.penSelected == selectToolState.penSelected && this.highlighterSelected == selectToolState.highlighterSelected && this.imageSelected == selectToolState.imageSelected && this.textSelected == selectToolState.textSelected && this.geometrySelected == selectToolState.geometrySelected;
    }

    public final boolean getGeometrySelected() {
        return this.geometrySelected;
    }

    public final boolean getHighlighterSelected() {
        return this.highlighterSelected;
    }

    public final boolean getImageSelected() {
        return this.imageSelected;
    }

    public final boolean getPenSelected() {
        return this.penSelected;
    }

    public final boolean getTextSelected() {
        return this.textSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.geometrySelected) + AbstractC0584a.m908i(this.textSelected, AbstractC0584a.m908i(this.imageSelected, AbstractC0584a.m908i(this.highlighterSelected, Boolean.hashCode(this.penSelected) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        boolean z8 = this.penSelected;
        boolean z9 = this.highlighterSelected;
        boolean z10 = this.imageSelected;
        boolean z11 = this.textSelected;
        boolean z12 = this.geometrySelected;
        StringBuilder sb = new StringBuilder("SelectToolState(penSelected=");
        sb.append(z8);
        sb.append(", highlighterSelected=");
        sb.append(z9);
        sb.append(", imageSelected=");
        AbstractC1923c.m1058v(", textSelected=", ", geometrySelected=", sb, z10, z11);
        sb.append(z12);
        sb.append(")");
        return sb.toString();
    }

    public SelectToolState(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.penSelected = z8;
        this.highlighterSelected = z9;
        this.imageSelected = z10;
        this.textSelected = z11;
        this.geometrySelected = z12;
    }

    public /* synthetic */ SelectToolState(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? false : z11, (i & 16) != 0 ? false : z12);
    }
}
