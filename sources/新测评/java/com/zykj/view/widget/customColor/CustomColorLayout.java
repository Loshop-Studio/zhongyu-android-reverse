package com.zykj.view.widget.customColor;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import p027b8.C5044a;
import p027b8.C5045b;

@Metadata(m13557d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m13558d2 = {"Lcom/zykj/view/widget/customColor/CustomColorLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Pair;", "pair", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "(Lkotlin/Pair;)Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "c", "(I)Landroid/view/View;", "", "a", "Ljava/util/Map;", "colorLocationMap", "value", "Ljava/lang/Integer;", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "selectColor", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "getOnColorChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnColorChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onColorChangeListener", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
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
    public static final void m11502d(CustomColorLayout customColorLayout, int i10, View view) {
        Integer num = customColorLayout.selectColor;
        if (num != null && num.intValue() == i10) {
            return;
        }
        customColorLayout.setSelectColor(Integer.valueOf(i10));
        Function1 function1 = customColorLayout.onColorChangeListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i10));
        }
    }

    /* renamed from: b */
    public final AppCompatImageView m11503b(Pair pair) {
        View childAt = getChildAt(((Number) pair.getFirst()).intValue());
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        View childAt2 = ((LinearLayoutCompat) childAt).getChildAt(((Number) pair.getSecond()).intValue());
        Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        return (AppCompatImageView) childAt2;
    }

    /* renamed from: c */
    public final View m11504c(final int i10) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        Resources resources = appCompatImageView.getResources();
        int i11 = R$dimen.view_11;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(i11), appCompatImageView.getResources().getDimensionPixelSize(i11)));
        appCompatImageView.setBackground(new ColorDrawable(i10));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: c8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomColorLayout.m11502d(this.f2754a, i10, view);
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
            m11503b(pair).setImageDrawable(null);
        }
        Pair pair2 = (Pair) this.colorLocationMap.get(num);
        if (pair2 != null) {
            C5044a c5044a = C5044a.f2578a;
            Intrinsics.checkNotNull(num);
            m11503b(pair2).setImageDrawable(ResourcesCompat.getDrawable(getResources(), c5044a.m2520a(num.intValue()) ? R$drawable.view_icon_custom_color_select_dark : R$drawable.view_icon_custom_color_select_light, null));
        }
        this.selectColor = num;
    }

    public /* synthetic */ CustomColorLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorLocationMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : C5045b.f2579a.m2521a()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
            linearLayoutCompat.setOrientation(1);
            linearLayoutCompat.setLayoutParams(new ViewGroup.LayoutParams(linearLayoutCompat.getResources().getDimensionPixelSize(R$dimen.view_11), linearLayoutCompat.getResources().getDimensionPixelSize(R$dimen.view_99)));
            int i13 = 0;
            for (Object obj2 : (List) obj) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj2).intValue();
                this.colorLocationMap.put(Integer.valueOf(iIntValue), new Pair(Integer.valueOf(i11 * 2), Integer.valueOf(i13)));
                linearLayoutCompat.addView(m11504c(iIntValue));
                i13 = i14;
            }
            addView(linearLayoutCompat);
            if (i11 != CollectionsKt.getLastIndex(C5045b.f2579a.m2521a())) {
                View space = new Space(context);
                space.setLayoutParams(new LinearLayoutCompat.LayoutParams(0, -2, 1.0f));
                addView(space);
            }
            i11 = i12;
        }
    }
}
