package androidx.compose.p013ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long j10, int i10, ColorFilter colorFilter, AbstractC9126n abstractC9126n) {
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
        return Color.m24277equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m24187equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m24220getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m24221getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return (Color.m24283hashCodeimpl(this.color) * 31) + BlendMode.m24188hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m24284toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m24189toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j10, int i10, AbstractC9126n abstractC9126n) {
        this(j10, i10);
    }

    private BlendModeColorFilter(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j10;
        this.blendMode = i10;
    }

    private BlendModeColorFilter(long j10, int i10) {
        this(j10, i10, AndroidColorFilter_androidKt.m24142actualTintColorFilterxETnrds(j10, i10), null);
    }
}
