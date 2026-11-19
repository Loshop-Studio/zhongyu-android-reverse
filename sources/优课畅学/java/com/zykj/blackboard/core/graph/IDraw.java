package com.zykj.blackboard.core.graph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public interface IDraw {

    public static final class DefaultImpls {
        public static /* synthetic */ void onDraw$default(IDraw iDraw, Canvas canvas, Matrix matrix, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw");
            }
            if ((i10 & 4) != 0) {
                interfaceC10570l = null;
            }
            InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = false;
            }
            iDraw.onDraw(canvas, matrix, interfaceC10570l2, z12, z11);
        }
    }

    void onDraw(Canvas canvas, Matrix matrix, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11);

    void render(Canvas canvas, Matrix matrix);
}
