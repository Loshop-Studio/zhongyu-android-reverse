package androidx.compose.p014ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.PaintingStyle;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    private Paint paint;
    private Object token;

    public RectListDebuggerModifierNode() {
        androidx.compose.p014ui.graphics.Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo30757setColor8_81llA(Color.Companion.m30912getRed0d7_KjU());
        Paint.mo30761setStylek9PVt8s(PaintingStyle.Companion.m31146getStrokeTiuSbCo());
        this.paint = Paint.asFrameworkPaint();
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        RectList rects = DelegatableNodeKt.requireOwner(this).getRectManager().getRects();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        Paint paint = this.paint;
        long[] jArr = rects.items;
        int i10 = rects.itemsSize;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            long j12 = jArr[i11 + 2];
            nativeCanvas.drawRect((int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11, paint);
        }
    }

    public final Object getToken() {
        return this.token;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.token = DelegatableNodeKt.requireOwner(this).getRectManager().registerOnChangedCallback(new InterfaceC9529a() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode.onAttach.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32749invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32749invoke() {
                DrawModifierNodeKt.invalidateDraw(RectListDebuggerModifierNode.this);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).getRectManager().unregisterOnChangedCallback(this.token);
    }

    public final void setToken(Object obj) {
        this.token = obj;
    }
}
