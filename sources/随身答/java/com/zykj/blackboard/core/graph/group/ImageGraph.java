package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p127h5.AbstractC8098a;
import p169l5.InterfaceC8891e;
import p263u5.C9683b;
import p263u5.C9686e;

/* loaded from: classes4.dex */
public final class ImageGraph extends AbstractC8098a {

    /* renamed from: x */
    public Bitmap f8998x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(String id, RectF outRectF, InterfaceC8891e sourceLoader, String sourceFileName, int i9) {
        super(id, outRectF, sourceLoader, sourceFileName, Integer.valueOf(i9));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
    }

    /* renamed from: L */
    public final void m7869L(Canvas canvas, Matrix matrix) {
        Bitmap bitmap = this.f8998x;
        if (bitmap == null || (bitmap != null && bitmap.isRecycled())) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(m12932H(), options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) (options.outWidth / mo12797f().width());
                this.f8998x = BitmapFactory.decodeFile(m12932H(), options);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Bitmap bitmap2 = this.f8998x;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        float fWidth = mo12797f().width() / bitmap2.getWidth();
        m7853C().reset();
        m7853C().postScale(fWidth, fWidth);
        m7853C().postConcat(mo12794b());
        m7853C().postConcat(matrix);
        C9686e.f17123a.m16168a(canvas, bitmap2, m7853C());
    }

    /* renamed from: M */
    public final void m7870M(Bitmap bitmap) {
        this.f8998x = bitmap;
    }

    /* renamed from: N */
    public void m7871N(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        m12935K(path);
        this.f8998x = null;
        m7854D(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        String id = getId();
        RectF rectF = new RectF(mo12797f());
        InterfaceC8891e interfaceC8891eM12933I = m12933I();
        String strMo7865v = mo7865v();
        if (strMo7865v == null) {
            strMo7865v = "";
        }
        Integer numMo7866w = mo7866w();
        ImageGraph imageGraph = new ImageGraph(id, rectF, interfaceC8891eM12933I, strMo7865v, numMo7866w != null ? numMo7866w.intValue() : -1);
        imageGraph.m12935K(m12932H());
        imageGraph.m12805t(mo12794b());
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            imageGraph.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return imageGraph;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8054b
    /* renamed from: l */
    public void mo7861l(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (m12932H() == null) {
            m12934J();
        }
        m7869L(canvas, matrix);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public void onDestroy() {
        super.onDestroy();
        C9683b.f17119a.m16159a(new Bitmap[]{this.f8998x}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.ImageGraph.onDestroy.1
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
                ImageGraph.this.m7870M(null);
            }
        });
    }
}
