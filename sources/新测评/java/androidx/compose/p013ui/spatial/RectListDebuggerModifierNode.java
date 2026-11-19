package androidx.compose.p013ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.PaintingStyle;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0010\u001a\u00020\u000e*\u00020\u0011H\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "paint", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "token", "", "getToken", "()Ljava/lang/Object;", "setToken", "(Ljava/lang/Object;)V", "onAttach", "", "onDetach", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRectListDebugger.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebuggerModifierNode\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 3 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,92:1\n476#2,10:93\n486#2:104\n487#2:106\n488#2:108\n489#2:110\n491#2,3:112\n810#3:103\n837#3:105\n839#3:107\n837#3:109\n839#3:111\n*S KotlinDebug\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebuggerModifierNode\n*L\n87#1:93,10\n87#1:104\n87#1:106\n87#1:108\n87#1:110\n87#1:112,3\n87#1:103\n87#1:105\n87#1:107\n87#1:109\n87#1:111\n*E\n"})
/* loaded from: classes2.dex */
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    private Paint paint;
    private Object token;

    public RectListDebuggerModifierNode() {
        androidx.compose.p013ui.graphics.Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo20855setColor8_81llA(Color.INSTANCE.m21010getRed0d7_KjU());
        Paint.mo20859setStylek9PVt8s(PaintingStyle.INSTANCE.m21244getStrokeTiuSbCo());
        this.paint = Paint.getInternalPaint();
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
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
        this.token = DelegatableNodeKt.requireOwner(this).getRectManager().registerOnChangedCallback(new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode.onAttach.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
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
