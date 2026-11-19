package com.zykj.sketch.core.listener;

import android.graphics.Canvas;
import com.zykj.sketch.core.graph.Graph;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public interface IDraw {

    public static final class DefaultImpls {
        public static /* synthetic */ void onDrawComplete$default(IDraw iDraw, Canvas canvas, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDrawComplete");
            }
            if ((i10 & 2) != 0) {
                interfaceC10570l = new InterfaceC10570l() { // from class: com.zykj.sketch.core.listener.IDraw.onDrawComplete.1
                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(Graph it) {
                        AbstractC9133u.m16133g(it, "it");
                        return Boolean.TRUE;
                    }
                };
            }
            iDraw.onDrawComplete(canvas, interfaceC10570l);
        }
    }

    void onDraw(Canvas canvas);

    void onDrawComplete(Canvas canvas, InterfaceC10570l interfaceC10570l);

    void render(Canvas canvas);
}
