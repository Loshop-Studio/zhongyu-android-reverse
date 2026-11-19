package androidx.compose.p013ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j10, long j11, ColorFilter colorFilter, AbstractC9126n abstractC9126n) {
        this(j10, j11, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m24277equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m24277equalsimpl0(this.add, lightingColorFilter.add);
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m24502getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m24503getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return (Color.m24283hashCodeimpl(this.multiply) * 31) + Color.m24283hashCodeimpl(this.add);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m24284toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m24284toStringimpl(this.add)) + ')';
    }

    public /* synthetic */ LightingColorFilter(long j10, long j11, AbstractC9126n abstractC9126n) {
        this(j10, j11);
    }

    private LightingColorFilter(long j10, long j11, ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j10;
        this.add = j11;
    }

    private LightingColorFilter(long j10, long j11) {
        this(j10, j11, AndroidColorFilter_androidKt.m24141actualLightingColorFilterOWjLjI(j10, j11), null);
    }
}
