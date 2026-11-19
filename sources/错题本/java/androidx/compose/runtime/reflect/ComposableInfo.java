package androidx.compose.runtime.reflect;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "isComposable", "", "realParamsCount", "", "changedParams", "defaultParams", "(ZIII)V", "getChangedParams", "()I", "getDefaultParams", "()Z", "getRealParamsCount", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public ComposableInfo(boolean z8, int i, int i8, int i9) {
        this.isComposable = z8;
        this.realParamsCount = i;
        this.changedParams = i8;
        this.defaultParams = i9;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z8, int i, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = composableInfo.isComposable;
        }
        if ((i10 & 2) != 0) {
            i = composableInfo.realParamsCount;
        }
        if ((i10 & 4) != 0) {
            i8 = composableInfo.changedParams;
        }
        if ((i10 & 8) != 0) {
            i9 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z8, i, i8, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsComposable() {
        return this.isComposable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChangedParams() {
        return this.changedParams;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDefaultParams() {
        return this.defaultParams;
    }

    @NotNull
    public final ComposableInfo copy(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
        return new ComposableInfo(isComposable, realParamsCount, changedParams, defaultParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) other;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.defaultParams) + AbstractC0584a.m902c(this.changedParams, AbstractC0584a.m902c(this.realParamsCount, Boolean.hashCode(this.isComposable) * 31, 31), 31);
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ComposableInfo(isComposable=");
        sb.append(this.isComposable);
        sb.append(", realParamsCount=");
        sb.append(this.realParamsCount);
        sb.append(", changedParams=");
        sb.append(this.changedParams);
        sb.append(", defaultParams=");
        return AbstractC0037f.m88m(sb, this.defaultParams, ')');
    }
}
