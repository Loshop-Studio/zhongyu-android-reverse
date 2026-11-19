package com.zykj.view.widget.customColor;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewGroupKt;
import com.blankj.utilcode.util.AbstractC3383c0;
import com.zykj.view.C5280R;
import com.zykj.view.utils.ColorUtils;
import com.zykj.view.utils.CustomColorManager;
import com.zykj.view.utils.LatestColorManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.ViewOnClickListenerC0015f;
import p152r6.InterfaceC6471c;
import p214z6.AbstractC6833k;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Lcom/zykj/view/widget/customColor/LatestColorLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "Landroidx/appcompat/widget/AppCompatImageView;", "getChild", "(I)Landroidx/appcompat/widget/AppCompatImageView;", TypedValues.Custom.S_COLOR, "Landroid/view/View;", "buildColorView", "(Ljava/lang/Integer;)Landroid/view/View;", "Ld6/s;", "refresh", "()V", "", "colorLocationMap", "Ljava/util/Map;", "value", "selectColor", "Ljava/lang/Integer;", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "Lkotlin/Function1;", "onColorChangeListener", "Lr6/c;", "getOnColorChangeListener", "()Lr6/c;", "setOnColorChangeListener", "(Lr6/c;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLatestColorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LatestColorLayout.kt\ncom/zykj/view/widget/customColor/LatestColorLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,131:1\n176#2,2:132\n176#2,2:134\n27#3:136\n*S KotlinDebug\n*F\n+ 1 LatestColorLayout.kt\ncom/zykj/view/widget/customColor/LatestColorLayout\n*L\n103#1:132,2\n111#1:134,2\n114#1:136\n*E\n"})
/* loaded from: classes3.dex */
public final class LatestColorLayout extends LinearLayoutCompat {

    @NotNull
    private final Map<Integer, Integer> colorLocationMap;

    @Nullable
    private InterfaceC6471c onColorChangeListener;

    @Nullable
    private Integer selectColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LatestColorLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final View buildColorView(Integer color) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(frameLayout.getResources().getDimensionPixelSize(C5280R.dimen.view_11), frameLayout.getResources().getDimensionPixelSize(C5280R.dimen.view_11)));
        frameLayout.setBackground(ResourcesCompat.getDrawable(frameLayout.getResources(), C5280R.drawable.view_shape_frame_border_color, null));
        int iM2323b = AbstractC3383c0.m2323b(1.0f);
        frameLayout.setPadding(iM2323b, iM2323b, iM2323b, iM2323b);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext());
        appCompatImageView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        int iM2323b2 = AbstractC3383c0.m2323b(1.0f);
        appCompatImageView.setPadding(iM2323b2, iM2323b2, iM2323b2, iM2323b2);
        if (color != null) {
            appCompatImageView.setBackground(new ColorDrawable(color.intValue()));
        }
        frameLayout.addView(appCompatImageView);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0015f(9, color, this));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildColorView$lambda$7$lambda$6(Integer num, LatestColorLayout latestColorLayout, View view) {
        if (num == null || num.equals(latestColorLayout.selectColor)) {
            return;
        }
        latestColorLayout.setSelectColor(num);
        InterfaceC6471c interfaceC6471c = latestColorLayout.onColorChangeListener;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(num);
        }
    }

    private final AppCompatImageView getChild(int index) {
        View childAt = getChildAt(index);
        AbstractC5830k.m5328e(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
        Object objM6497x = AbstractC6833k.m6497x(ViewGroupKt.getChildren((FrameLayout) childAt));
        AbstractC5830k.m5328e(objM6497x, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        return (AppCompatImageView) objM6497x;
    }

    @Nullable
    public final InterfaceC6471c getOnColorChangeListener() {
        return this.onColorChangeListener;
    }

    @Nullable
    public final Integer getSelectColor() {
        return this.selectColor;
    }

    public final void refresh() {
        removeAllViews();
        List<Integer> latestColorList = LatestColorManager.INSTANCE.getLatestColorList();
        int size = CustomColorManager.INSTANCE.getCustomColorList().size();
        for (int i = 0; i < size; i++) {
            Integer num = (Integer) AbstractC5805t.m5230j0(i, latestColorList);
            if (num != null) {
                this.colorLocationMap.put(Integer.valueOf(num.intValue()), Integer.valueOf(i * 2));
            } else {
                num = null;
            }
            addView(buildColorView(num));
            if (i != AbstractC5806u.m5282u(CustomColorManager.INSTANCE.getCustomColorList())) {
                Space space = new Space(getContext());
                space.setLayoutParams(new LinearLayoutCompat.LayoutParams(0, -2, 1.0f));
                addView(space);
            }
        }
        setSelectColor(this.selectColor);
    }

    public final void setOnColorChangeListener(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onColorChangeListener = interfaceC6471c;
    }

    public final void setSelectColor(@Nullable Integer num) {
        Integer num2 = this.colorLocationMap.get(this.selectColor);
        if (num2 != null) {
            getChild(num2.intValue()).setImageDrawable(null);
        }
        Integer num3 = this.colorLocationMap.get(num);
        if (num3 != null) {
            ColorUtils colorUtils = ColorUtils.INSTANCE;
            AbstractC5830k.m5327d(num);
            getChild(num3.intValue()).setImageDrawable(ResourcesCompat.getDrawable(getResources(), colorUtils.isLight(num.intValue()) ? C5280R.drawable.view_icon_custom_color_select_dark : C5280R.drawable.view_icon_custom_color_select_light, null));
        }
        this.selectColor = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LatestColorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ LatestColorLayout(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LatestColorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this.colorLocationMap = new LinkedHashMap();
        refresh();
    }
}
