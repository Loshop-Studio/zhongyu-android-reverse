package androidx.compose.p014ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j10, long j11, ColorFilter colorFilter, AbstractC9972n abstractC9972n) {
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
        return Color.m30879equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m30879equalsimpl0(this.add, lightingColorFilter.add);
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m31104getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m31105getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return (Color.m30885hashCodeimpl(this.multiply) * 31) + Color.m30885hashCodeimpl(this.add);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m30886toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m30886toStringimpl(this.add)) + ')';
    }

    public /* synthetic */ LightingColorFilter(long j10, long j11, AbstractC9972n abstractC9972n) {
        this(j10, j11);
    }

    private LightingColorFilter(long j10, long j11, ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j10;
        this.add = j11;
    }

    private LightingColorFilter(long j10, long j11) {
        this(j10, j11, AndroidColorFilter_androidKt.m30743actualLightingColorFilterOWjLjI(j10, j11), null);
    }
}
