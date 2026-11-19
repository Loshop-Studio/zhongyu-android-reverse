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
import com.blankj.utilcode.util.ConvertUtils;
import com.zykj.view.R$dimen;
import com.zykj.view.R$drawable;
import com.zykj.view.widget.customColor.LatestColorLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import p181m7.C9024a;
import p181m7.C9025b;
import p181m7.C9039p;

@Metadata(m13412d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m13413d2 = {"Lcom/zykj/view/widget/customColor/LatestColorLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "e", "()V", "index", "Landroidx/appcompat/widget/AppCompatImageView;", "d", "(I)Landroidx/appcompat/widget/AppCompatImageView;", TypedValues.Custom.S_COLOR, "Landroid/view/View;", "b", "(Ljava/lang/Integer;)Landroid/view/View;", "", "a", "Ljava/util/Map;", "colorLocationMap", "value", "Ljava/lang/Integer;", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "selectColor", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "getOnColorChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnColorChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onColorChangeListener", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLatestColorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LatestColorLayout.kt\ncom/zykj/view/widget/customColor/LatestColorLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,131:1\n176#2,2:132\n176#2,2:134\n27#3:136\n*S KotlinDebug\n*F\n+ 1 LatestColorLayout.kt\ncom/zykj/view/widget/customColor/LatestColorLayout\n*L\n103#1:132,2\n111#1:134,2\n114#1:136\n*E\n"})
/* loaded from: classes5.dex */
public final class LatestColorLayout extends LinearLayoutCompat {

    /* renamed from: a, reason: from kotlin metadata */
    public final Map colorLocationMap;

    /* renamed from: b, reason: from kotlin metadata */
    public Integer selectColor;

    /* renamed from: c, reason: from kotlin metadata */
    public Function1 onColorChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LatestColorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: c */
    public static final void m12064c(Integer num, LatestColorLayout latestColorLayout, View view) {
        if (num == null || Intrinsics.areEqual(num, latestColorLayout.selectColor)) {
            return;
        }
        latestColorLayout.setSelectColor(num);
        Function1 function1 = latestColorLayout.onColorChangeListener;
        if (function1 != null) {
            function1.invoke(num);
        }
    }

    /* renamed from: b */
    public final View m12065b(final Integer color) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(frameLayout.getResources().getDimensionPixelSize(R$dimen.view_11), frameLayout.getResources().getDimensionPixelSize(R$dimen.view_11)));
        frameLayout.setBackground(ResourcesCompat.getDrawable(frameLayout.getResources(), R$drawable.view_shape_frame_border_color, null));
        int iDp2px = ConvertUtils.dp2px(1.0f);
        frameLayout.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext());
        appCompatImageView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        int iDp2px2 = ConvertUtils.dp2px(1.0f);
        appCompatImageView.setPadding(iDp2px2, iDp2px2, iDp2px2, iDp2px2);
        if (color != null) {
            appCompatImageView.setBackground(new ColorDrawable(color.intValue()));
        }
        frameLayout.addView(appCompatImageView);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: n7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LatestColorLayout.m12064c(color, this, view);
            }
        });
        return frameLayout;
    }

    /* renamed from: d */
    public final AppCompatImageView m12066d(int index) {
        View childAt = getChildAt(index);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
        Object objLast = SequencesKt.last(ViewGroupKt.getChildren((FrameLayout) childAt));
        Intrinsics.checkNotNull(objLast, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        return (AppCompatImageView) objLast;
    }

    /* renamed from: e */
    public final void m12067e() {
        removeAllViews();
        List listM14426a = C9039p.f15219a.m14426a();
        int size = C9025b.f15177a.m14384a().size();
        for (int i9 = 0; i9 < size; i9++) {
            Integer num = (Integer) CollectionsKt.getOrNull(listM14426a, i9);
            if (num != null) {
                this.colorLocationMap.put(Integer.valueOf(num.intValue()), Integer.valueOf(i9 * 2));
                Unit unit = Unit.INSTANCE;
            } else {
                num = null;
            }
            addView(m12065b(num));
            if (i9 != CollectionsKt.getLastIndex(C9025b.f15177a.m14384a())) {
                Space space = new Space(getContext());
                space.setLayoutParams(new LinearLayoutCompat.LayoutParams(0, -2, 1.0f));
                addView(space);
            }
        }
        setSelectColor(this.selectColor);
    }

    public final Function1<Integer, Unit> getOnColorChangeListener() {
        return this.onColorChangeListener;
    }

    public final Integer getSelectColor() {
        return this.selectColor;
    }

    public final void setOnColorChangeListener(Function1<? super Integer, Unit> function1) {
        this.onColorChangeListener = function1;
    }

    public final void setSelectColor(Integer num) {
        Integer num2 = (Integer) this.colorLocationMap.get(this.selectColor);
        if (num2 != null) {
            m12066d(num2.intValue()).setImageDrawable(null);
        }
        Integer num3 = (Integer) this.colorLocationMap.get(num);
        if (num3 != null) {
            C9024a c9024a = C9024a.f15176a;
            Intrinsics.checkNotNull(num);
            m12066d(num3.intValue()).setImageDrawable(ResourcesCompat.getDrawable(getResources(), c9024a.m14383a(num.intValue()) ? R$drawable.view_icon_custom_color_select_dark : R$drawable.view_icon_custom_color_select_light, null));
        }
        this.selectColor = num;
    }

    public /* synthetic */ LatestColorLayout(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatestColorLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorLocationMap = new LinkedHashMap();
        m12067e();
    }
}
