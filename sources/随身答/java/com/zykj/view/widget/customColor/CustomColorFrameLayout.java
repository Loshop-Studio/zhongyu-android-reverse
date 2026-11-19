package com.zykj.view.widget.customColor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.R$id;
import com.zykj.view.databinding.ViewIncludeCustomColorBinding;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m13413d2 = {"Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isLight", "", "setBackgroundLight", "(Z)V", "c", "()V", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getOnColorChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnColorChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onColorChangeListener", "value", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "selectColor", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomColorFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorFrameLayout.kt\ncom/zykj/view/widget/customColor/CustomColorFrameLayout\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,65:1\n404#2:66\n404#2:67\n*S KotlinDebug\n*F\n+ 1 CustomColorFrameLayout.kt\ncom/zykj/view/widget/customColor/CustomColorFrameLayout\n*L\n56#1:66\n58#1:67\n*E\n"})
/* loaded from: classes5.dex */
public final class CustomColorFrameLayout extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public Function1 onColorChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static Unit m12056a(ViewIncludeCustomColorBinding viewIncludeCustomColorBinding, CustomColorFrameLayout customColorFrameLayout, int i9) {
        viewIncludeCustomColorBinding.f12694b.setSelectColor(null);
        Function1 function1 = customColorFrameLayout.onColorChangeListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i9));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public static Unit m12057b(ViewIncludeCustomColorBinding viewIncludeCustomColorBinding, CustomColorFrameLayout customColorFrameLayout, int i9) {
        viewIncludeCustomColorBinding.f12693a.setSelectColor(null);
        Function1 function1 = customColorFrameLayout.onColorChangeListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i9));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final void m12058c() {
        ((LatestColorLayout) findViewById(R$id.latestColor)).m12067e();
    }

    public final Function1<Integer, Unit> getOnColorChangeListener() {
        return this.onColorChangeListener;
    }

    public final Integer getSelectColor() {
        Integer selectColor = ((CustomColorLayout) findViewById(R$id.customColor)).getSelectColor();
        return selectColor == null ? ((LatestColorLayout) findViewById(R$id.latestColor)).getSelectColor() : selectColor;
    }

    public final void setBackgroundLight(boolean isLight) {
        ((TextView) findViewById(R$id.tvLatest)).setTextColor(isLight ? Color.parseColor("#555555") : Color.parseColor("#FFFFFF"));
    }

    public final void setOnColorChangeListener(Function1<? super Integer, Unit> function1) {
        this.onColorChangeListener = function1;
    }

    public final void setSelectColor(Integer num) {
        ((CustomColorLayout) findViewById(R$id.customColor)).setSelectColor(num);
        ((LatestColorLayout) findViewById(R$id.latestColor)).setSelectColor(null);
    }

    public /* synthetic */ CustomColorFrameLayout(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorFrameLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        final ViewIncludeCustomColorBinding viewIncludeCustomColorBindingM11908a = ViewIncludeCustomColorBinding.m11908a(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(viewIncludeCustomColorBindingM11908a, "inflate(...)");
        viewIncludeCustomColorBindingM11908a.f12693a.setOnColorChangeListener(new Function1() { // from class: n7.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomColorFrameLayout.m12056a(viewIncludeCustomColorBindingM11908a, this, ((Integer) obj).intValue());
            }
        });
        viewIncludeCustomColorBindingM11908a.f12694b.setOnColorChangeListener(new Function1() { // from class: n7.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomColorFrameLayout.m12057b(viewIncludeCustomColorBindingM11908a, this, ((Integer) obj).intValue());
            }
        });
        addView(viewIncludeCustomColorBindingM11908a.getRoot());
    }
}
