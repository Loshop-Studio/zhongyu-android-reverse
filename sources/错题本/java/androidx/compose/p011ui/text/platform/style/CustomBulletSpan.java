package androidx.compose.p011ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/¨\u00061"}, m5110d2 = {"Landroidx/compose/ui/text/platform/style/CustomBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/unit/Density;", "density", "textIndentPx", "<init>", "(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/unit/Density;F)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Paint;", "p", "x", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "Ld6/s;", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "Landroidx/compose/ui/graphics/Shape;", "F", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Landroidx/compose/ui/unit/Density;", "minimumRequiredIndent", "I", "diff", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,206:1\n33#2:207\n53#3,3:208\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n*L\n90#1:207\n90#1:208,3\n*E\n"})
/* loaded from: classes2.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = 8;
    private final float alpha;

    @Nullable
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;

    @NotNull
    private final Density density;
    private final int diff;

    @NotNull
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;

    @NotNull
    private final Shape shape;

    public CustomBulletSpan(@NotNull Shape shape, float f, float f7, float f8, @Nullable Brush brush, float f9, @NotNull DrawStyle drawStyle, @NotNull Density density, float f10) {
        this.shape = shape;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f7;
        this.brush = brush;
        this.alpha = f9;
        this.drawStyle = drawStyle;
        this.density = density;
        int iM6241q = AbstractC6600a.m6241q(f + f8);
        this.minimumRequiredIndent = iM6241q;
        this.diff = AbstractC6600a.m6241q(f10) - iM6241q;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@Nullable final Canvas c, @Nullable final Paint p6, int x3, final int dir, int top2, int baseline, int bottom, @Nullable CharSequence text, int start, int end, boolean first, @Nullable Layout layout) {
        if (c == null) {
            return;
        }
        final float f = (top2 + bottom) / 2.0f;
        int i = x3 - this.minimumRequiredIndent;
        if (i < 0) {
            i = 0;
        }
        final int i8 = i;
        AbstractC5830k.m5328e(text, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) text).getSpanStart(this) != start || p6 == null) {
            return;
        }
        Paint.Style style = p6.getStyle();
        BulletSpan_androidKt.setDrawStyle(p6, this.drawStyle);
        float f7 = this.bulletWidthPx;
        float f8 = this.bulletHeightPx;
        final long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32));
        BulletSpan_androidKt.m13055setBrushAndDrawyzxVdVo(p6, this.brush, this.alpha, jM10501constructorimpl, new InterfaceC6469a() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13056invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13056invoke() {
                BulletSpan_androidKt.draw(this.this$0.shape.mo6813createOutlinePq9zytI(jM10501constructorimpl, dir > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, this.this$0.density), c, p6, i8, f, dir);
            }
        });
        p6.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
