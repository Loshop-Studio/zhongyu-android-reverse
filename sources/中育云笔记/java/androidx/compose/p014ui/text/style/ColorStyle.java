package androidx.compose.p014ui.text.style;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
final class ColorStyle implements TextForegroundStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j10, AbstractC9972n abstractC9972n) {
        this(j10);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m33272copy8_81llA$default(ColorStyle colorStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = colorStyle.value;
        }
        return colorStyle.m33274copy8_81llA(j10);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m33273component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m33274copy8_81llA(long j10) {
        return new ColorStyle(j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m30879equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.p014ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m30880getAlphaimpl(mo33271getColor0d7_KjU());
    }

    @Override // androidx.compose.p014ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.p014ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo33271getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m33275getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m30885hashCodeimpl(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m30886toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j10) {
        this.value = j10;
        if (j10 != 16) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
