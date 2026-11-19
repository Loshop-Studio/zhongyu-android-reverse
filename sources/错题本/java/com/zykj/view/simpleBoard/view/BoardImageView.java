package com.zykj.view.simpleBoard.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.simpleBoard.DrawControl;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/view/BoardImageView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/zykj/view/simpleBoard/DrawControl;", "mDrawControl", "Lcom/zykj/view/simpleBoard/DrawControl;", "getMDrawControl", "()Lcom/zykj/view/simpleBoard/DrawControl;", "setMDrawControl", "(Lcom/zykj/view/simpleBoard/DrawControl;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BoardImageView extends View {
    public DrawControl mDrawControl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoardImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    @NotNull
    public final DrawControl getMDrawControl() {
        DrawControl drawControl = this.mDrawControl;
        if (drawControl != null) {
            return drawControl;
        }
        AbstractC5830k.m5339p("mDrawControl");
        throw null;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        super.onDraw(canvas);
        getMDrawControl().drawBackgroundBitmap(canvas);
    }

    public final void setMDrawControl(@NotNull DrawControl drawControl) {
        AbstractC5830k.m5330g(drawControl, "<set-?>");
        this.mDrawControl = drawControl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoardImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ BoardImageView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoardImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
    }
}
