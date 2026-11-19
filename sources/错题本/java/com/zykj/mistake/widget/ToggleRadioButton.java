package com.zykj.mistake.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/mistake/widget/ToggleRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ToggleRadioButton extends AppCompatRadioButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToggleRadioButton(@NotNull Context context) {
        this(context, null);
        AbstractC5830k.m5330g(context, "context");
    }

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            super.toggle();
            return;
        }
        ViewParent parent = getParent();
        AbstractC5830k.m5328e(parent, "null cannot be cast to non-null type android.widget.RadioGroup");
        ((RadioGroup) parent).clearCheck();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToggleRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
    }
}
