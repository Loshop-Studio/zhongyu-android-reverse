package androidx.compose.p014ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long j10, int i10, ColorFilter colorFilter, AbstractC9972n abstractC9972n) {
        this(j10, i10, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m30879equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m30789equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m30822getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m30823getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return (Color.m30885hashCodeimpl(this.color) * 31) + BlendMode.m30790hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m30886toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m30791toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j10, int i10, AbstractC9972n abstractC9972n) {
        this(j10, i10);
    }

    private BlendModeColorFilter(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j10;
        this.blendMode = i10;
    }

    private BlendModeColorFilter(long j10, int i10) {
        this(j10, i10, AndroidColorFilter_androidKt.m30744actualTintColorFilterxETnrds(j10, i10), null);
    }
}
