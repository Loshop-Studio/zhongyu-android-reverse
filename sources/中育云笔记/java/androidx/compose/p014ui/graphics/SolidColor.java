package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j10, AbstractC9972n abstractC9972n) {
        this(j10);
    }

    @Override // androidx.compose.p014ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo30825applyToPq9zytI(long j10, Paint paint, float f10) {
        long jM30877copywmQWz5c$default;
        paint.setAlpha(1.0f);
        if (f10 == 1.0f) {
            jM30877copywmQWz5c$default = this.value;
        } else {
            long j11 = this.value;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j11, Color.m30880getAlphaimpl(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo30757setColor8_81llA(jM30877copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m30879equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m31213getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m30885hashCodeimpl(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m30886toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j10) {
        super(null);
        this.value = j10;
    }
}
