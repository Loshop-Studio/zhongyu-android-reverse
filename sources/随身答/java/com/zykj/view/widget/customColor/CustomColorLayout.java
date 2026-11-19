package com.zykj.view.widget.customColor;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.zykj.view.R$dimen;
import com.zykj.view.R$drawable;
import com.zykj.view.widget.customColor.CustomColorLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p181m7.C9024a;
import p181m7.C9025b;

@Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m13413d2 = {"Lcom/zykj/view/widget/customColor/CustomColorLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Pair;", "pair", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "(Lkotlin/Pair;)Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "c", "(I)Landroid/view/View;", "", "a", "Ljava/util/Map;", "colorLocationMap", "value", "Ljava/lang/Integer;", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "selectColor", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "getOnColorChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnColorChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onColorChangeListener", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomColorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorLayout.kt\ncom/zykj/view/widget/customColor/CustomColorLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,106:1\n1878#2,2:107\n1878#2,3:109\n1880#2:112\n27#3:113\n*S KotlinDebug\n*F\n+ 1 CustomColorLayout.kt\ncom/zykj/view/widget/customColor/CustomColorLayout\n*L\n53#1:107,2\n63#1:109,3\n53#1:112\n95#1:113\n*E\n"})
/* loaded from: classes5.dex */
public final class CustomColorLayout extends LinearLayoutCompat {

    /* renamed from: a, reason: from kotlin metadata */
    public final Map colorLocationMap;

    /* renamed from: b, reason: from kotlin metadata */
    public Integer selectColor;

    /* renamed from: c, reason: from kotlin metadata */
    public Function1 onColorChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: d */
    public static final void m12060d(CustomColorLayout customColorLayout, int i9, View view) {
        Integer num = customColorLayout.selectColor;
        if (num != null && num.intValue() == i9) {
            return;
        }
        customColorLayout.setSelectColor(Integer.valueOf(i9));
        Function1 function1 = customColorLayout.onColorChangeListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i9));
        }
    }

    /* renamed from: b */
    public final AppCompatImageView m12061b(Pair pair) {
        View childAt = getChildAt(((Number) pair.getFirst()).intValue());
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        View childAt2 = ((LinearLayoutCompat) childAt).getChildAt(((Number) pair.getSecond()).intValue());
        Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        return (AppCompatImageView) childAt2;
    }

    /* renamed from: c */
    public final View m12062c(final int i9) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(appCompatImageView.getResources().getDimensionPixelSize(R$dimen.view_11), appCompatImageView.getResources().getDimensionPixelSize(R$dimen.view_11)));
        appCompatImageView.setBackground(new ColorDrawable(i9));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: n7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomColorLayout.m12060d(this.f15364a, i9, view);
            }
        });
        return appCompatImageView;
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
        Pair pair = (Pair) this.colorLocationMap.get(this.selectColor);
        if (pair != null) {
            m12061b(pair).setImageDrawable(null);
        }
        Pair pair2 = (Pair) this.colorLocationMap.get(num);
        if (pair2 != null) {
            C9024a c9024a = C9024a.f15176a;
            Intrinsics.checkNotNull(num);
            m12061b(pair2).setImageDrawable(ResourcesCompat.getDrawable(getResources(), c9024a.m14383a(num.intValue()) ? R$drawable.view_icon_custom_color_select_dark : R$drawable.view_icon_custom_color_select_light, null));
        }
        this.selectColor = num;
    }

    public /* synthetic */ CustomColorLayout(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorLocationMap = new LinkedHashMap();
        int i10 = 0;
        for (Object obj : C9025b.f15177a.m14384a()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
            linearLayoutCompat.setOrientation(1);
            linearLayoutCompat.setLayoutParams(new ViewGroup.LayoutParams(linearLayoutCompat.getResources().getDimensionPixelSize(R$dimen.view_11), linearLayoutCompat.getResources().getDimensionPixelSize(R$dimen.view_99)));
            int i12 = 0;
            for (Object obj2 : (List) obj) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj2).intValue();
                this.colorLocationMap.put(Integer.valueOf(iIntValue), new Pair(Integer.valueOf(i10 * 2), Integer.valueOf(i12)));
                linearLayoutCompat.addView(m12062c(iIntValue));
                i12 = i13;
            }
            addView(linearLayoutCompat);
            if (i10 != CollectionsKt.getLastIndex(C9025b.f15177a.m14384a())) {
                View space = new Space(context);
                space.setLayoutParams(new LinearLayoutCompat.LayoutParams(0, -2, 1.0f));
                addView(space);
            }
            i10 = i11;
        }
    }
}
