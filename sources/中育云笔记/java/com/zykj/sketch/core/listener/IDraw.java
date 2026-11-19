package com.zykj.sketch.core.listener;

import android.graphics.Canvas;
import com.zykj.sketch.core.graph.Graph;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public interface IDraw {

    public static final class DefaultImpls {
        public static /* synthetic */ void onDrawComplete$default(IDraw iDraw, Canvas canvas, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDrawComplete");
            }
            if ((i10 & 2) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.listener.IDraw.onDrawComplete.1
                    @Override // p181hd.InterfaceC9540l
                    public final Boolean invoke(Graph it) {
                        AbstractC9979u.m20294g(it, "it");
                        return Boolean.TRUE;
                    }
                };
            }
            iDraw.onDrawComplete(canvas, interfaceC9540l);
        }
    }

    void onDraw(Canvas canvas);

    void onDrawComplete(Canvas canvas, InterfaceC9540l interfaceC9540l);

    void render(Canvas canvas);
}
