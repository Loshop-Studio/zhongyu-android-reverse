package com.zykj.view.board.board;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.GraphType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphToolState;", "", "galleryVisible", "", "cameraVisible", "textVisible", "graphVisible", "graphType", "Lcom/zykj/view/board/board/GraphType;", "<init>", "(ZZZZLcom/zykj/view/board/board/GraphType;)V", "getGalleryVisible", "()Z", "getCameraVisible", "getTextVisible", "getGraphVisible", "getGraphType", "()Lcom/zykj/view/board/board/GraphType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class GraphToolState {
    private final boolean cameraVisible;
    private final boolean galleryVisible;

    @NotNull
    private final GraphType graphType;
    private final boolean graphVisible;
    private final boolean textVisible;

    public GraphToolState() {
        this(false, false, false, false, null, 31, null);
    }

    public static /* synthetic */ GraphToolState copy$default(GraphToolState graphToolState, boolean z8, boolean z9, boolean z10, boolean z11, GraphType graphType, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = graphToolState.galleryVisible;
        }
        if ((i & 2) != 0) {
            z9 = graphToolState.cameraVisible;
        }
        if ((i & 4) != 0) {
            z10 = graphToolState.textVisible;
        }
        if ((i & 8) != 0) {
            z11 = graphToolState.graphVisible;
        }
        if ((i & 16) != 0) {
            graphType = graphToolState.graphType;
        }
        GraphType graphType2 = graphType;
        boolean z12 = z10;
        return graphToolState.copy(z8, z9, z12, z11, graphType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getGalleryVisible() {
        return this.galleryVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCameraVisible() {
        return this.cameraVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTextVisible() {
        return this.textVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getGraphVisible() {
        return this.graphVisible;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final GraphType getGraphType() {
        return this.graphType;
    }

    @NotNull
    public final GraphToolState copy(boolean galleryVisible, boolean cameraVisible, boolean textVisible, boolean graphVisible, @NotNull GraphType graphType) {
        AbstractC5830k.m5330g(graphType, "graphType");
        return new GraphToolState(galleryVisible, cameraVisible, textVisible, graphVisible, graphType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphToolState)) {
            return false;
        }
        GraphToolState graphToolState = (GraphToolState) other;
        return this.galleryVisible == graphToolState.galleryVisible && this.cameraVisible == graphToolState.cameraVisible && this.textVisible == graphToolState.textVisible && this.graphVisible == graphToolState.graphVisible && AbstractC5830k.m5325b(this.graphType, graphToolState.graphType);
    }

    public final boolean getCameraVisible() {
        return this.cameraVisible;
    }

    public final boolean getGalleryVisible() {
        return this.galleryVisible;
    }

    @NotNull
    public final GraphType getGraphType() {
        return this.graphType;
    }

    public final boolean getGraphVisible() {
        return this.graphVisible;
    }

    public final boolean getTextVisible() {
        return this.textVisible;
    }

    public int hashCode() {
        return this.graphType.hashCode() + AbstractC0584a.m908i(this.graphVisible, AbstractC0584a.m908i(this.textVisible, AbstractC0584a.m908i(this.cameraVisible, Boolean.hashCode(this.galleryVisible) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        boolean z8 = this.galleryVisible;
        boolean z9 = this.cameraVisible;
        boolean z10 = this.textVisible;
        boolean z11 = this.graphVisible;
        GraphType graphType = this.graphType;
        StringBuilder sb = new StringBuilder("GraphToolState(galleryVisible=");
        sb.append(z8);
        sb.append(", cameraVisible=");
        sb.append(z9);
        sb.append(", textVisible=");
        AbstractC1923c.m1058v(", graphVisible=", ", graphType=", sb, z10, z11);
        sb.append(graphType);
        sb.append(")");
        return sb.toString();
    }

    public GraphToolState(boolean z8, boolean z9, boolean z10, boolean z11, @NotNull GraphType graphType) {
        AbstractC5830k.m5330g(graphType, "graphType");
        this.galleryVisible = z8;
        this.cameraVisible = z9;
        this.textVisible = z10;
        this.graphVisible = z11;
        this.graphType = graphType;
    }

    public /* synthetic */ GraphToolState(boolean z8, boolean z9, boolean z10, boolean z11, GraphType graphType, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? false : z11, (i & 16) != 0 ? GraphType.Null.INSTANCE : graphType);
    }
}
