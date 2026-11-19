package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ShaderBrush;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f10) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m26804from8_81llA(TextDrawStyleKt.m26803modulateDxMtmZc(((SolidColor) brush).m24611getValue0d7_KjU(), f10));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f10);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: from-8_81llA, reason: not valid java name */
        public final TextForegroundStyle m26804from8_81llA(long j10) {
            return j10 != 16 ? new ColorStyle(j10, null) : Unspecified.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.p013ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.p013ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.p013ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo26669getColor0d7_KjU() {
            return Color.Companion.m24312getUnspecified0d7_KjU();
        }
    }

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo26669getColor0d7_KjU();

    default TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        boolean z10 = textForegroundStyle instanceof BrushStyle;
        return (z10 && (this instanceof BrushStyle)) ? new BrushStyle(((BrushStyle) textForegroundStyle).getValue(), TextDrawStyleKt.takeOrElse(textForegroundStyle.getAlpha(), new InterfaceC10559a() { // from class: androidx.compose.ui.text.style.TextForegroundStyle.merge.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Float invoke() {
                return Float.valueOf(TextForegroundStyle.this.getAlpha());
            }
        })) : (!z10 || (this instanceof BrushStyle)) ? (z10 || !(this instanceof BrushStyle)) ? textForegroundStyle.takeOrElse(new InterfaceC10559a() { // from class: androidx.compose.ui.text.style.TextForegroundStyle.merge.2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final TextForegroundStyle invoke() {
                return TextForegroundStyle.this;
            }
        }) : this : textForegroundStyle;
    }

    default TextForegroundStyle takeOrElse(InterfaceC10559a interfaceC10559a) {
        return !AbstractC9133u.m16128b(this, Unspecified.INSTANCE) ? this : (TextForegroundStyle) interfaceC10559a.invoke();
    }
}
