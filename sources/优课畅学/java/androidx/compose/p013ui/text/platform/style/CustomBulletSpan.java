package androidx.compose.p013ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = 8;
    private final float alpha;
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final Density density;
    private final int diff;
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;
    private final Shape shape;

    public CustomBulletSpan(Shape shape, float f10, float f11, float f12, Brush brush, float f13, DrawStyle drawStyle, Density density, float f14) {
        this.shape = shape;
        this.bulletWidthPx = f10;
        this.bulletHeightPx = f11;
        this.brush = brush;
        this.alpha = f13;
        this.drawStyle = drawStyle;
        this.density = density;
        int iM20035d = AbstractC10729c.m20035d(f10 + f12);
        this.minimumRequiredIndent = iM20035d;
        this.diff = AbstractC10729c.m20035d(f14) - iM20035d;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, int i10, final int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f10 = (i12 + i14) / 2.0f;
        final int iM13510e = AbstractC8323h.m13510e(i10 - this.minimumRequiredIndent, 0);
        AbstractC9133u.m16131e(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i15 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        BulletSpan_androidKt.setDrawStyle(paint, this.drawStyle);
        float f11 = this.bulletWidthPx;
        float f12 = this.bulletHeightPx;
        final long jM24095constructorimpl = Size.m24095constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        BulletSpan_androidKt.m26649setBrushAndDrawyzxVdVo(paint, this.brush, this.alpha, jM24095constructorimpl, new InterfaceC10559a() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m26650invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26650invoke() {
                BulletSpan_androidKt.draw(this.this$0.shape.mo20407createOutlinePq9zytI(jM24095constructorimpl, i11 > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, this.this$0.density), canvas, paint, iM13510e, f10, i11);
            }
        });
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        int i10 = this.diff;
        if (i10 >= 0) {
            return 0;
        }
        return Math.abs(i10);
    }
}
