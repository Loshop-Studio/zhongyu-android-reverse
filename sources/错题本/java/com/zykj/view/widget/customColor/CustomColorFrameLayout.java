package com.zykj.view.widget.customColor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewIncludeCustomColorBinding;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isLight", "Ld6/s;", "setBackgroundLight", "(Z)V", "refresh", "()V", "Lkotlin/Function1;", "onColorChangeListener", "Lr6/c;", "getOnColorChangeListener", "()Lr6/c;", "setOnColorChangeListener", "(Lr6/c;)V", "value", "getSelectColor", "()Ljava/lang/Integer;", "setSelectColor", "(Ljava/lang/Integer;)V", "selectColor", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCustomColorFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorFrameLayout.kt\ncom/zykj/view/widget/customColor/CustomColorFrameLayout\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,65:1\n404#2:66\n404#2:67\n*S KotlinDebug\n*F\n+ 1 CustomColorFrameLayout.kt\ncom/zykj/view/widget/customColor/CustomColorFrameLayout\n*L\n56#1:66\n58#1:67\n*E\n"})
/* loaded from: classes3.dex */
public final class CustomColorFrameLayout extends FrameLayout {

    @Nullable
    private InterfaceC6471c onColorChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorFrameLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s lambda$2$lambda$0(ViewIncludeCustomColorBinding viewIncludeCustomColorBinding, CustomColorFrameLayout customColorFrameLayout, int i) {
        viewIncludeCustomColorBinding.latestColor.setSelectColor(null);
        InterfaceC6471c interfaceC6471c = customColorFrameLayout.onColorChangeListener;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Integer.valueOf(i));
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s lambda$2$lambda$1(ViewIncludeCustomColorBinding viewIncludeCustomColorBinding, CustomColorFrameLayout customColorFrameLayout, int i) {
        viewIncludeCustomColorBinding.customColor.setSelectColor(null);
        InterfaceC6471c interfaceC6471c = customColorFrameLayout.onColorChangeListener;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Integer.valueOf(i));
        }
        return C5443s.f8405a;
    }

    @Nullable
    public final InterfaceC6471c getOnColorChangeListener() {
        return this.onColorChangeListener;
    }

    @Nullable
    public final Integer getSelectColor() {
        Integer selectColor = ((CustomColorLayout) findViewById(C5280R.id.customColor)).getSelectColor();
        return selectColor == null ? ((LatestColorLayout) findViewById(C5280R.id.latestColor)).getSelectColor() : selectColor;
    }

    public final void refresh() {
        ((LatestColorLayout) findViewById(C5280R.id.latestColor)).refresh();
    }

    public final void setBackgroundLight(boolean isLight) {
        ((TextView) findViewById(C5280R.id.tvLatest)).setTextColor(isLight ? Color.parseColor("#555555") : Color.parseColor("#FFFFFF"));
    }

    public final void setOnColorChangeListener(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onColorChangeListener = interfaceC6471c;
    }

    public final void setSelectColor(@Nullable Integer num) {
        ((CustomColorLayout) findViewById(C5280R.id.customColor)).setSelectColor(num);
        ((LatestColorLayout) findViewById(C5280R.id.latestColor)).setSelectColor(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ CustomColorFrameLayout(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomColorFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        final ViewIncludeCustomColorBinding viewIncludeCustomColorBindingInflate = ViewIncludeCustomColorBinding.inflate(LayoutInflater.from(context), this, false);
        AbstractC5830k.m5329f(viewIncludeCustomColorBindingInflate, "inflate(...)");
        final int i8 = 0;
        viewIncludeCustomColorBindingInflate.customColor.setOnColorChangeListener(new InterfaceC6471c() { // from class: i5.a
            @Override // p152r6.InterfaceC6471c
            public final Object invoke(Object obj) {
                int i9 = i8;
                int iIntValue = ((Integer) obj).intValue();
                switch (i9) {
                    case 0:
                        return CustomColorFrameLayout.lambda$2$lambda$0(viewIncludeCustomColorBindingInflate, this, iIntValue);
                    default:
                        return CustomColorFrameLayout.lambda$2$lambda$1(viewIncludeCustomColorBindingInflate, this, iIntValue);
                }
            }
        });
        final int i9 = 1;
        viewIncludeCustomColorBindingInflate.latestColor.setOnColorChangeListener(new InterfaceC6471c() { // from class: i5.a
            @Override // p152r6.InterfaceC6471c
            public final Object invoke(Object obj) {
                int i92 = i9;
                int iIntValue = ((Integer) obj).intValue();
                switch (i92) {
                    case 0:
                        return CustomColorFrameLayout.lambda$2$lambda$0(viewIncludeCustomColorBindingInflate, this, iIntValue);
                    default:
                        return CustomColorFrameLayout.lambda$2$lambda$1(viewIncludeCustomColorBindingInflate, this, iIntValue);
                }
            }
        });
        addView(viewIncludeCustomColorBindingInflate.getRoot());
    }
}
