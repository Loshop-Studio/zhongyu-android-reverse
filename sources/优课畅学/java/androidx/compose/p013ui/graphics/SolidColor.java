package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j10, AbstractC9126n abstractC9126n) {
        this(j10);
    }

    @Override // androidx.compose.p013ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo24223applyToPq9zytI(long j10, Paint paint, float f10) {
        long jM24275copywmQWz5c$default;
        paint.setAlpha(1.0f);
        if (f10 == 1.0f) {
            jM24275copywmQWz5c$default = this.value;
        } else {
            long j11 = this.value;
            jM24275copywmQWz5c$default = Color.m24275copywmQWz5c$default(j11, Color.m24278getAlphaimpl(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo24155setColor8_81llA(jM24275copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m24277equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m24611getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m24283hashCodeimpl(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m24284toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j10) {
        super(null);
        this.value = j10;
    }
}
