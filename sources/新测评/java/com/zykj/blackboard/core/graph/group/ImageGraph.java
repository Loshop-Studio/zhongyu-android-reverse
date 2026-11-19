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
import p077e5.C7341b;
import p077e5.C7343d;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p221r4.AbstractC9005a;
import p265v4.InterfaceC9668d;

/* loaded from: classes4.dex */
public final class ImageGraph extends AbstractC9005a {

    /* renamed from: x */
    public Bitmap f7714x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(String id, RectF outRectF, InterfaceC9668d sourceLoader, String sourceFileName, int i10) {
        super(id, outRectF, sourceLoader, sourceFileName, Integer.valueOf(i10));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
    }

    /* renamed from: M */
    public final void m6757M(Canvas canvas, Matrix matrix) {
        Bitmap bitmap = this.f7714x;
        if (bitmap == null || (bitmap != null && bitmap.isRecycled())) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(m15149I(), options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) (options.outWidth / mo14996g().width());
                this.f7714x = BitmapFactory.decodeFile(m15149I(), options);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Bitmap bitmap2 = this.f7714x;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        float fWidth = mo14996g().width() / bitmap2.getWidth();
        m6741D().reset();
        m6741D().postScale(fWidth, fWidth);
        m6741D().postConcat(mo14993b());
        m6741D().postConcat(matrix);
        C7343d.f11910a.m11747a(canvas, bitmap2, m6741D());
    }

    /* renamed from: N */
    public final void m6758N(Bitmap bitmap) {
        this.f7714x = bitmap;
    }

    /* renamed from: O */
    public void m6759O(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        m15152L(path);
        this.f7714x = null;
        m6742E(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        String id = getId();
        RectF rectF = new RectF(mo14996g());
        InterfaceC9668d interfaceC9668dM15150J = m15150J();
        String strMo6754w = mo6754w();
        if (strMo6754w == null) {
            strMo6754w = "";
        }
        Integer numMo6755x = mo6755x();
        ImageGraph imageGraph = new ImageGraph(id, rectF, interfaceC9668dM15150J, strMo6754w, numMo6755x != null ? numMo6755x.intValue() : -1);
        imageGraph.m15152L(m15149I());
        imageGraph.m15004u(mo14993b());
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            imageGraph.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return imageGraph;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8887b
    /* renamed from: m */
    public void mo6749m(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (m15149I() == null) {
            m15151K();
        }
        m6757M(canvas, matrix);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public void onDestroy() {
        super.onDestroy();
        C7341b.f11907a.m11742a(new Bitmap[]{this.f7714x}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.ImageGraph.onDestroy.1
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
                ImageGraph.this.m6758N(null);
            }
        });
    }
}
