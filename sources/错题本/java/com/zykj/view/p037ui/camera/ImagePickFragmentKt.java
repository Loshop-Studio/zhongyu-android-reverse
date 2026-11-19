package com.zykj.view.p037ui.camera;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m5110d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "Ld6/s;", "block", "afterMeasured", "(Landroid/view/View;Lr6/a;)V", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImagePickFragmentKt {
    public static final void afterMeasured(@NotNull final View view, @NotNull final InterfaceC6469a block) {
        AbstractC5830k.m5330g(view, "<this>");
        AbstractC5830k.m5330g(block, "block");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zykj.view.ui.camera.ImagePickFragmentKt.afterMeasured.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                block.invoke();
            }
        });
    }
}
