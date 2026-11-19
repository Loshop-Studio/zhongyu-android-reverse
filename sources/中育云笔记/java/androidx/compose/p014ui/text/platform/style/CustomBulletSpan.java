package androidx.compose.p014ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

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
        int iM19282d = AbstractC9719c.m19282d(f10 + f12);
        this.minimumRequiredIndent = iM19282d;
        this.diff = AbstractC9719c.m19282d(f14) - iM19282d;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, int i10, final int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f10 = (i12 + i14) / 2.0f;
        final int iM21752e = AbstractC10410o.m21752e(i10 - this.minimumRequiredIndent, 0);
        AbstractC9979u.m20292e(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i15 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        BulletSpan_androidKt.setDrawStyle(paint, this.drawStyle);
        float f11 = this.bulletWidthPx;
        float f12 = this.bulletHeightPx;
        final long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        BulletSpan_androidKt.m33251setBrushAndDrawyzxVdVo(paint, this.brush, this.alpha, jM30697constructorimpl, new InterfaceC9529a() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33252invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33252invoke() {
                BulletSpan_androidKt.draw(this.this$0.shape.mo27009createOutlinePq9zytI(jM30697constructorimpl, i11 > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, this.this$0.density), canvas, paint, iM21752e, f10, i11);
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
