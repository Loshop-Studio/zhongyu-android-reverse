package com.zykj.view.widget.radio;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.view.R$dimen;
import com.zykj.view.R$drawable;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p027b8.C5044a;

@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010%\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010(\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010,R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u00109¨\u0006<"}, m13558d2 = {"Lcom/zykj/view/widget/radio/CustomColorRadioButton;", "Lcom/zykj/view/widget/radio/WithSelectedRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "value", "c", "I", "getColor", "()I", "setColor", "(I)V", TypedValues.Custom.S_COLOR, "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "d", "Lkotlin/Lazy;", "getWithColorBitmap", "()Landroid/graphics/Bitmap;", "withColorBitmap", "e", "getNoColorBitmap", "noColorBitmap", "Landroid/graphics/Rect;", "f", "getWithColorRect", "()Landroid/graphics/Rect;", "withColorRect", "g", "getNoColorRect", "noColorRect", "h", "Landroid/graphics/Rect;", "canvasRect", "Landroid/graphics/Path;", "i", "Landroid/graphics/Path;", "clipPath", "a", "()Z", "isLight", "isCustomBackgroundShow", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCustomColorRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorRadioButton.kt\ncom/zykj/view/widget/radio/CustomColorRadioButton\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,96:1\n271#2:97\n189#3,8:98\n*S KotlinDebug\n*F\n+ 1 CustomColorRadioButton.kt\ncom/zykj/view/widget/radio/CustomColorRadioButton\n*L\n68#1:97\n79#1:98,8\n*E\n"})
/* loaded from: classes5.dex */
public class CustomColorRadioButton extends WithSelectedRadioButton {

    /* renamed from: c, reason: from kotlin metadata */
    public int color;

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy withColorBitmap;

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy noColorBitmap;

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy withColorRect;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy noColorRect;

    /* renamed from: h, reason: from kotlin metadata */
    public final Rect canvasRect;

    /* renamed from: i, reason: from kotlin metadata */
    public final Path clipPath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: g */
    public static final Bitmap m11514g(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R$drawable.blackboard_icon_custom_color);
    }

    private final Bitmap getNoColorBitmap() {
        return (Bitmap) this.noColorBitmap.getValue();
    }

    private final Rect getNoColorRect() {
        return (Rect) this.noColorRect.getValue();
    }

    private final Bitmap getWithColorBitmap() {
        return (Bitmap) this.withColorBitmap.getValue();
    }

    private final Rect getWithColorRect() {
        return (Rect) this.withColorRect.getValue();
    }

    /* renamed from: h */
    public static final Rect m11515h(CustomColorRadioButton customColorRadioButton) {
        return new Rect(0, 0, customColorRadioButton.getNoColorBitmap().getWidth(), customColorRadioButton.getNoColorBitmap().getHeight());
    }

    /* renamed from: i */
    public static final Bitmap m11516i(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R$drawable.blackboard_icon_custom_color_selected);
    }

    /* renamed from: j */
    public static final Rect m11517j(CustomColorRadioButton customColorRadioButton) {
        return new Rect(0, 0, customColorRadioButton.getWithColorBitmap().getWidth(), customColorRadioButton.getWithColorBitmap().getHeight());
    }

    @Override // com.zykj.view.widget.radio.WithSelectedRadioButton
    /* renamed from: a */
    public boolean mo11518a() {
        return C5044a.f2578a.m2520a(this.color);
    }

    /* renamed from: f */
    public boolean mo11519f() {
        return true;
    }

    public final int getColor() {
        return this.color;
    }

    @Override // com.zykj.view.widget.radio.WithSelectedRadioButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.clipPath;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            int i10 = this.color;
            if (i10 != 0) {
                canvas.drawColor(i10);
                if (mo11519f()) {
                    canvas.drawBitmap(getWithColorBitmap(), getWithColorRect(), this.canvasRect, (Paint) null);
                }
            } else if (mo11519f()) {
                canvas.drawBitmap(getNoColorBitmap(), getNoColorRect(), this.canvasRect, (Paint) null);
            }
            canvas.restoreToCount(iSave);
            super.onDraw(canvas);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // com.zykj.view.widget.radio.WithSelectedRadioButton, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        super.onLayout(changed, left, top2, right, bottom);
        this.canvasRect.set(0, 0, getWidth(), getHeight());
        Path path = this.clipPath;
        path.reset();
        RectF rectF = new RectF(this.canvasRect);
        Resources resources = getResources();
        int i10 = R$dimen.view_2;
        path.addRoundRect(rectF, resources.getDimension(i10), getResources().getDimension(i10), Path.Direction.CW);
    }

    public final void setColor(int i10) {
        if (this.color == i10) {
            return;
        }
        this.color = i10;
        invalidate();
    }

    public /* synthetic */ CustomColorRadioButton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorRadioButton(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.withColorBitmap = LazyKt.lazy(new Function0() { // from class: d8.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomColorRadioButton.m11516i(context);
            }
        });
        this.noColorBitmap = LazyKt.lazy(new Function0() { // from class: d8.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomColorRadioButton.m11514g(context);
            }
        });
        this.withColorRect = LazyKt.lazy(new Function0() { // from class: d8.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomColorRadioButton.m11517j(this.f11822a);
            }
        });
        this.noColorRect = LazyKt.lazy(new Function0() { // from class: d8.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomColorRadioButton.m11515h(this.f11823a);
            }
        });
        this.canvasRect = new Rect();
        this.clipPath = new Path();
    }
}
