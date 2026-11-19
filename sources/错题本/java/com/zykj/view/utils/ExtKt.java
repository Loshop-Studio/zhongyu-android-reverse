package com.zykj.view.utils;

import android.graphics.Color;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.databinding.BindingAdapter;
import com.blankj.utilcode.util.ViewOnClickListenerC3380b;
import com.zykj.view.board.board.PenColor;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0005*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0017\u001a\u00020\u0005*\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\t¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001f\u001a\u00020\u0005*\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010$\u001a\u00020\u0005*\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Landroid/view/View;", "", TypedValues.TransitionType.S_DURATION, "Landroid/view/View$OnClickListener;", "listener", "Ld6/s;", "singleClick", "(Landroid/view/View;JLandroid/view/View$OnClickListener;)V", "Landroid/widget/RadioGroup;", "", "index", "checkAt", "(Landroid/widget/RadioGroup;I)V", "", "alpha", "withAlpha", "(IF)I", "Lcom/zykj/view/widget/SketchProgressView;", "Lkotlin/Function0;", "onTouchStart", "Lkotlin/Function1;", "onProgress", "onTouchEnd", "setProgressListener", "(Lcom/zykj/view/widget/SketchProgressView;Lr6/a;Lr6/c;Lr6/c;)V", "Lcom/zykj/view/board/board/PenColor;", "toPenColor", "(I)Lcom/zykj/view/board/board/PenColor;", "Lcom/zykj/view/widget/radio/CustomColorRadioButton;", "", TypedValues.Custom.S_COLOR, "setCustomColor", "(Lcom/zykj/view/widget/radio/CustomColorRadioButton;Ljava/lang/String;)V", "Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;", "", "isLight", "setLight", "(Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Ljava/lang/Boolean;)V", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ext.kt\ncom/zykj/view/utils/ExtKt\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,70:1\n404#2:71\n*S KotlinDebug\n*F\n+ 1 Ext.kt\ncom/zykj/view/utils/ExtKt\n*L\n64#1:71\n*E\n"})
/* loaded from: classes3.dex */
public final class ExtKt {
    public static final void checkAt(@NotNull RadioGroup radioGroup, int i) {
        AbstractC5830k.m5330g(radioGroup, "<this>");
        View childAt = radioGroup.getChildAt(i);
        AbstractC5830k.m5328e(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    @BindingAdapter({"customColor"})
    public static final void setCustomColor(@NotNull CustomColorRadioButton customColorRadioButton, @Nullable String str) {
        AbstractC5830k.m5330g(customColorRadioButton, "<this>");
        customColorRadioButton.setColor(str != null ? Color.parseColor(str) : 0);
    }

    @BindingAdapter({"isLight"})
    public static final void setLight(@NotNull CustomColorFrameLayout customColorFrameLayout, @Nullable Boolean bool) {
        AbstractC5830k.m5330g(customColorFrameLayout, "<this>");
        customColorFrameLayout.setBackgroundLight(bool != null ? bool.booleanValue() : true);
    }

    public static final void setProgressListener(@NotNull SketchProgressView sketchProgressView, @NotNull final InterfaceC6469a onTouchStart, @NotNull final InterfaceC6471c onProgress, @NotNull final InterfaceC6471c onTouchEnd) {
        AbstractC5830k.m5330g(sketchProgressView, "<this>");
        AbstractC5830k.m5330g(onTouchStart, "onTouchStart");
        AbstractC5830k.m5330g(onProgress, "onProgress");
        AbstractC5830k.m5330g(onTouchEnd, "onTouchEnd");
        sketchProgressView.setProgressListener(new SketchProgressView.ProgressListener() { // from class: com.zykj.view.utils.ExtKt.setProgressListener.1
            @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
            public void onProgress(float progress) {
                onProgress.invoke(Float.valueOf(progress));
            }

            @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
            public void onTouchEnd(float progress) {
                onTouchEnd.invoke(Float.valueOf(progress));
            }

            @Override // com.zykj.view.widget.SketchProgressView.ProgressListener
            public void onTouchStart() {
                onTouchStart.invoke();
            }
        });
    }

    public static final void singleClick(@NotNull View view, long j7, @NotNull View.OnClickListener listener) {
        AbstractC5830k.m5330g(view, "<this>");
        AbstractC5830k.m5330g(listener, "listener");
        View view2 = new View[]{view}[0];
        if (view2 == null) {
            return;
        }
        view2.setOnClickListener(new ViewOnClickListenerC3380b(j7, listener));
    }

    public static /* synthetic */ void singleClick$default(View view, long j7, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = 500;
        }
        singleClick(view, j7, onClickListener);
    }

    @NotNull
    public static final PenColor toPenColor(int i) {
        PenColor.ColorBlack colorBlack = PenColor.ColorBlack.INSTANCE;
        if (i == colorBlack.getColor()) {
            return colorBlack;
        }
        PenColor.ColorWhite colorWhite = PenColor.ColorWhite.INSTANCE;
        if (i == colorWhite.getColor()) {
            return colorWhite;
        }
        PenColor.ColorRed colorRed = PenColor.ColorRed.INSTANCE;
        if (i == colorRed.getColor()) {
            return colorRed;
        }
        if (!CustomColorManager.INSTANCE.isColorExist(i)) {
            i = 0;
        }
        return new PenColor.ColorCustom(i);
    }

    public static final int withAlpha(int i, float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f * 255)) << 24);
    }
}
