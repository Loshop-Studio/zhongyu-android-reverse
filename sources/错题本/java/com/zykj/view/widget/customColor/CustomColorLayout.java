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
import androidx.navigation.ViewOnClickListenerC2870k;
import com.zykj.view.C5280R;
import com.zykj.view.utils.ColorUtils;
import com.zykj.view.utils.CustomColorManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, m5110d2 = {"Lcom/zykj/view/widget/customColor/CustomColorLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Pair;", "pair", "Landroidx/appcompat/widget/AppCompatImageView;", "getChild", "(Lkotlin/Pair;)Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "toView", "(I)Landroid/view/View;", "", "colorLocationMap", "Ljava/util/Map;", "value", "selectColor", "Ljava/lang/Integer;", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "Lkotlin/Function1;", "Ld6/s;", "onColorChangeListener", "Lr6/c;", "getOnColorChangeListener", "()Lr6/c;", "setOnColorChangeListener", "(Lr6/c;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomColorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorLayout.kt\ncom/zykj/view/widget/customColor/CustomColorLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,106:1\n1878#2,2:107\n1878#2,3:109\n1880#2:112\n27#3:113\n*S KotlinDebug\n*F\n+ 1 CustomColorLayout.kt\ncom/zykj/view/widget/customColor/CustomColorLayout\n*L\n53#1:107,2\n63#1:109,3\n53#1:112\n95#1:113\n*E\n"})
/* loaded from: classes3.dex */
public final class CustomColorLayout extends LinearLayoutCompat {

    @NotNull
    private final Map<Integer, Pair<Integer, Integer>> colorLocationMap;

    @Nullable
    private InterfaceC6471c onColorChangeListener;

    @Nullable
    private Integer selectColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final AppCompatImageView getChild(Pair<Integer, Integer> pair) {
        View childAt = getChildAt(pair.getFirst().intValue());
        AbstractC5830k.m5328e(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        View childAt2 = ((LinearLayoutCompat) childAt).getChildAt(pair.getSecond().intValue());
        AbstractC5830k.m5328e(childAt2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        return (AppCompatImageView) childAt2;
    }

    private final View toView(int i) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(appCompatImageView.getResources().getDimensionPixelSize(C5280R.dimen.view_11), appCompatImageView.getResources().getDimensionPixelSize(C5280R.dimen.view_11)));
        appCompatImageView.setBackground(new ColorDrawable(i));
        appCompatImageView.setOnClickListener(new ViewOnClickListenerC2870k(this, i, 5));
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toView$lambda$5$lambda$4(CustomColorLayout customColorLayout, int i, View view) {
        Integer num = customColorLayout.selectColor;
        if (num != null && num.intValue() == i) {
            return;
        }
        customColorLayout.setSelectColor(Integer.valueOf(i));
        InterfaceC6471c interfaceC6471c = customColorLayout.onColorChangeListener;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Integer.valueOf(i));
        }
    }

    @Nullable
    public final InterfaceC6471c getOnColorChangeListener() {
        return this.onColorChangeListener;
    }

    @Nullable
    public final Integer getSelectColor() {
        return this.selectColor;
    }

    public final void setOnColorChangeListener(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onColorChangeListener = interfaceC6471c;
    }

    public final void setSelectColor(@Nullable Integer num) {
        Pair<Integer, Integer> pair = this.colorLocationMap.get(this.selectColor);
        if (pair != null) {
            getChild(pair).setImageDrawable(null);
        }
        Pair<Integer, Integer> pair2 = this.colorLocationMap.get(num);
        if (pair2 != null) {
            ColorUtils colorUtils = ColorUtils.INSTANCE;
            AbstractC5830k.m5327d(num);
            getChild(pair2).setImageDrawable(ResourcesCompat.getDrawable(getResources(), colorUtils.isLight(num.intValue()) ? C5280R.drawable.view_icon_custom_color_select_dark : C5280R.drawable.view_icon_custom_color_select_light, null));
        }
        this.selectColor = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ CustomColorLayout(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this.colorLocationMap = new LinkedHashMap();
        int i8 = 0;
        for (Object obj : CustomColorManager.INSTANCE.getCustomColorList()) {
            int i9 = i8 + 1;
            if (i8 >= 0) {
                LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
                linearLayoutCompat.setOrientation(1);
                linearLayoutCompat.setLayoutParams(new ViewGroup.LayoutParams(linearLayoutCompat.getResources().getDimensionPixelSize(C5280R.dimen.view_11), linearLayoutCompat.getResources().getDimensionPixelSize(C5280R.dimen.view_99)));
                int i10 = 0;
                for (Object obj2 : (List) obj) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        int iIntValue = ((Number) obj2).intValue();
                        this.colorLocationMap.put(Integer.valueOf(iIntValue), new Pair<>(Integer.valueOf(i8 * 2), Integer.valueOf(i10)));
                        linearLayoutCompat.addView(toView(iIntValue));
                        i10 = i11;
                    } else {
                        AbstractC5806u.m5258L();
                        throw null;
                    }
                }
                addView(linearLayoutCompat);
                if (i8 != AbstractC5806u.m5282u(CustomColorManager.INSTANCE.getCustomColorList())) {
                    View space = new Space(context);
                    space.setLayoutParams(new LinearLayoutCompat.LayoutParams(0, -2, 1.0f));
                    addView(space);
                }
                i8 = i9;
            } else {
                AbstractC5806u.m5258L();
                throw null;
            }
        }
    }
}
