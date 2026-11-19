package com.zykj.view.widget.radio;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.C5280R;
import com.zykj.view.utils.ColorUtils;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010+R\u0014\u00100\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00106¨\u00068"}, m5110d2 = {"Lcom/zykj/view/widget/radio/CustomColorRadioButton;", "Lcom/zykj/view/widget/radio/WithSelectedRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Ld6/s;", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "value", TypedValues.Custom.S_COLOR, "I", "getColor", "()I", "setColor", "(I)V", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "withColorBitmap$delegate", "Ld6/e;", "getWithColorBitmap", "()Landroid/graphics/Bitmap;", "withColorBitmap", "noColorBitmap$delegate", "getNoColorBitmap", "noColorBitmap", "Landroid/graphics/Rect;", "withColorRect$delegate", "getWithColorRect", "()Landroid/graphics/Rect;", "withColorRect", "noColorRect$delegate", "getNoColorRect", "noColorRect", "canvasRect", "Landroid/graphics/Rect;", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "isLight", "()Z", "isCustomBackgroundShow", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomColorRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorRadioButton.kt\ncom/zykj/view/widget/radio/CustomColorRadioButton\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,96:1\n271#2:97\n189#3,8:98\n*S KotlinDebug\n*F\n+ 1 CustomColorRadioButton.kt\ncom/zykj/view/widget/radio/CustomColorRadioButton\n*L\n68#1:97\n79#1:98,8\n*E\n"})
/* loaded from: classes3.dex */
public class CustomColorRadioButton extends WithSelectedRadioButton {

    @NotNull
    private final Rect canvasRect;

    @NotNull
    private final Path clipPath;
    private int color;

    /* renamed from: noColorBitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e noColorBitmap;

    /* renamed from: noColorRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e noColorRect;

    /* renamed from: withColorBitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e withColorBitmap;

    /* renamed from: withColorRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e withColorRect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorRadioButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap noColorBitmap_delegate$lambda$1(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), C5280R.drawable.blackboard_icon_custom_color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect noColorRect_delegate$lambda$3(CustomColorRadioButton customColorRadioButton) {
        return new Rect(0, 0, customColorRadioButton.getNoColorBitmap().getWidth(), customColorRadioButton.getNoColorBitmap().getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap withColorBitmap_delegate$lambda$0(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), C5280R.drawable.blackboard_icon_custom_color_selected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect withColorRect_delegate$lambda$2(CustomColorRadioButton customColorRadioButton) {
        return new Rect(0, 0, customColorRadioButton.getWithColorBitmap().getWidth(), customColorRadioButton.getWithColorBitmap().getHeight());
    }

    public final int getColor() {
        return this.color;
    }

    public boolean isCustomBackgroundShow() {
        return true;
    }

    @Override // com.zykj.view.widget.radio.WithSelectedRadioButton
    public boolean isLight() {
        return ColorUtils.INSTANCE.isLight(this.color);
    }

    @Override // com.zykj.view.widget.radio.WithSelectedRadioButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        Path path = this.clipPath;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            int i = this.color;
            if (i != 0) {
                canvas.drawColor(i);
                if (isCustomBackgroundShow()) {
                    canvas.drawBitmap(getWithColorBitmap(), getWithColorRect(), this.canvasRect, (Paint) null);
                }
            } else if (isCustomBackgroundShow()) {
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
        path.addRoundRect(new RectF(this.canvasRect), getResources().getDimension(C5280R.dimen.view_2), getResources().getDimension(C5280R.dimen.view_2), Path.Direction.CW);
    }

    public final void setColor(int i) {
        if (this.color == i) {
            return;
        }
        this.color = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ CustomColorRadioButton(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorRadioButton(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        final int i8 = 0;
        this.withColorBitmap = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: j5.a
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return CustomColorRadioButton.withColorBitmap_delegate$lambda$0(context);
                    default:
                        return CustomColorRadioButton.noColorBitmap_delegate$lambda$1(context);
                }
            }
        });
        final int i9 = 1;
        this.noColorBitmap = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: j5.a
            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return CustomColorRadioButton.withColorBitmap_delegate$lambda$0(context);
                    default:
                        return CustomColorRadioButton.noColorBitmap_delegate$lambda$1(context);
                }
            }
        });
        final int i10 = 0;
        this.withColorRect = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: j5.b

            /* renamed from: b */
            public final /* synthetic */ CustomColorRadioButton f9093b;

            {
                this.f9093b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CustomColorRadioButton.withColorRect_delegate$lambda$2(this.f9093b);
                    default:
                        return CustomColorRadioButton.noColorRect_delegate$lambda$3(this.f9093b);
                }
            }
        });
        final int i11 = 1;
        this.noColorRect = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: j5.b

            /* renamed from: b */
            public final /* synthetic */ CustomColorRadioButton f9093b;

            {
                this.f9093b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CustomColorRadioButton.withColorRect_delegate$lambda$2(this.f9093b);
                    default:
                        return CustomColorRadioButton.noColorRect_delegate$lambda$3(this.f9093b);
                }
            }
        });
        this.canvasRect = new Rect();
        this.clipPath = new Path();
    }
}
