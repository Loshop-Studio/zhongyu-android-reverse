package com.zykj.sketch.core.listener;

import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J-\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/IDraw;", "", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "render", "(Landroid/graphics/Canvas;)V", "onDraw", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/Graph;", "", "conditionVoid", "onDrawComplete", "(Landroid/graphics/Canvas;Lr6/c;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IDraw {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void onDrawComplete$default(IDraw iDraw, Canvas canvas, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDrawComplete");
            }
            if ((i & 2) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.listener.IDraw.onDrawComplete.1
                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final Boolean invoke(@NotNull Graph it) {
                        AbstractC5830k.m5330g(it, "it");
                        return Boolean.TRUE;
                    }
                };
            }
            iDraw.onDrawComplete(canvas, interfaceC6471c);
        }
    }

    void onDraw(@NotNull Canvas canvas);

    void onDrawComplete(@NotNull Canvas canvas, @NotNull InterfaceC6471c conditionVoid);

    void render(@NotNull Canvas canvas);
}
