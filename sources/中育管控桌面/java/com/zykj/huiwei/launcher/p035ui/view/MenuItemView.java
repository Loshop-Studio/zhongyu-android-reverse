package com.zykj.huiwei.launcher.p035ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.huiwei.launcher.R$styleable;
import com.zykj.huiwei.launcher.databinding.HwMenuItemViewBinding;
import com.zykj.huiwei.launcher.p035ui.view.MenuItemView;
import com.zykj.manage.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "content", "", "setContent", "(Ljava/lang/String;)V", "Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;", "a", "Lkotlin/Lazy;", "getBinding", "()Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;", "binding", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class MenuItemView extends ConstraintLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuItemView(final Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new Function0() { // from class: h4.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MenuItemView.m6017b(context, this);
            }
        });
    }

    /* renamed from: b */
    public static final HwMenuItemViewBinding m6017b(Context context, MenuItemView menuItemView) {
        return (HwMenuItemViewBinding) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.hw_menu_item_view, menuItemView, true);
    }

    private final HwMenuItemViewBinding getBinding() {
        Object value = this.binding.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (HwMenuItemViewBinding) value;
    }

    public final void setContent(String content) {
        getBinding().tvContent.setText(content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MenuItemView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        String string = typedArrayObtainStyledAttributes.getString(3);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        getBinding().ivIcon.setImageDrawable(drawable);
        getBinding().tvTitle.setText(string);
        getBinding().tvContent.setText(string2);
        Group groupEnter = getBinding().groupEnter;
        Intrinsics.checkNotNullExpressionValue(groupEnter, "groupEnter");
        BindingAdaptersKt.visibleOrGone(groupEnter, Boolean.valueOf(z6));
        typedArrayObtainStyledAttributes.recycle();
    }
}
