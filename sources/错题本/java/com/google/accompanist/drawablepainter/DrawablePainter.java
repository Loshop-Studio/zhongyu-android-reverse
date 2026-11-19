package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2827b;
import coil3.decode.AbstractC3278s;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p040d1.AbstractC5408a;
import p040d1.AbstractC5410c;
import p045d6.InterfaceC5429e;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "drawablepainter_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,188:1\n81#2:189\n107#2,2:190\n81#2:192\n107#2,2:193\n256#3:195\n47#4,7:196\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n*L\n59#1:189\n59#1:190,2\n60#1:192\n60#1:193,2\n127#1:195\n131#1:196,7\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawablePainter extends Painter implements RememberObserver {

    /* renamed from: a */
    public final Drawable f2796a;

    /* renamed from: b */
    public final MutableState f2797b;

    /* renamed from: c */
    public final MutableState f2798c;

    /* renamed from: d */
    public final InterfaceC5429e f2799d;

    public DrawablePainter(Drawable drawable) {
        AbstractC5830k.m5330g(drawable, "drawable");
        this.f2796a = drawable;
        this.f2797b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.f2798c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m10498boximpl(AbstractC5410c.m4800a(drawable)), null, 2, null);
        this.f2799d = AbstractC5773a.m5117b(new C2827b(this, 12));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f2796a.setAlpha(AbstractC5806u.m5274m(AbstractC6600a.m6241q(f * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f2796a.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        AbstractC5830k.m5330g(layoutDirection, "layoutDirection");
        int i = AbstractC5408a.f8368a[layoutDirection.ordinal()];
        int i8 = 1;
        if (i == 1) {
            i8 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f2796a.setLayoutDirection(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p011ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo11353getIntrinsicSizeNHjbRc() {
        return ((Size) this.f2798c.getValue()).m10515unboximpl();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        onForgotten();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        AbstractC5830k.m5330g(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        ((Number) this.f2797b.getValue()).intValue();
        try {
            canvas.save();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f2796a;
            if (i < 28 || i >= 31 || !AbstractC3278s.m2206m(drawable)) {
                drawable.setBounds(0, 0, AbstractC6600a.m6241q(Size.m10510getWidthimpl(drawScope.mo11233getSizeNHjbRc())), AbstractC6600a.m6241q(Size.m10507getHeightimpl(drawScope.mo11233getSizeNHjbRc())));
            } else {
                canvas.scale(Size.m10510getWidthimpl(drawScope.mo11233getSizeNHjbRc()) / Size.m10510getWidthimpl(mo11353getIntrinsicSizeNHjbRc()), Size.m10507getHeightimpl(drawScope.mo11233getSizeNHjbRc()) / Size.m10507getHeightimpl(mo11353getIntrinsicSizeNHjbRc()));
            }
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
            canvas.restore();
        } catch (Throwable th) {
            canvas.restore();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Drawable drawable = this.f2796a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.f2799d.getValue();
        Drawable drawable = this.f2796a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
