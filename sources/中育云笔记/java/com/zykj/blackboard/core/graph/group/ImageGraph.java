package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import ca.AbstractC5411a;
import com.zykj.board.EzyGraphEnum;
import ga.InterfaceC9284d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10339b;
import na.C10342e;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes5.dex */
public final class ImageGraph extends AbstractC5411a {

    /* renamed from: w */
    public Bitmap f18556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(String id2, RectF outRectF, InterfaceC9284d sourceLoader, String sourceFileName, int i10) {
        super(id2, outRectF, sourceLoader, sourceFileName, Integer.valueOf(i10));
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
    }

    /* renamed from: I */
    public final void m14493I(Canvas canvas, Matrix matrix) {
        Bitmap bitmap = this.f18556w;
        if (bitmap == null || (bitmap != null && bitmap.isRecycled())) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(m2863E(), options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) (options.outWidth / mo2718g().width());
                this.f18556w = BitmapFactory.decodeFile(m2863E(), options);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Bitmap bitmap2 = this.f18556w;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        float fWidth = mo2718g().width() / bitmap2.getWidth();
        m14488A().reset();
        m14488A().postScale(fWidth, fWidth);
        m14488A().postConcat(mo2714b());
        m14488A().postConcat(matrix);
        C10342e.f24648a.m21630a(canvas, bitmap2, m14488A());
    }

    /* renamed from: J */
    public final void m14494J(Bitmap bitmap) {
        this.f18556w = bitmap;
    }

    /* renamed from: K */
    public void m14495K(String path) {
        AbstractC9979u.m20294g(path, "path");
        m2866H(path);
        this.f18556w = null;
        m14490C(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        String id2 = getId();
        RectF rectF = new RectF(mo2718g());
        InterfaceC9284d interfaceC9284dM2864F = m2864F();
        String strMo2867w = mo2867w();
        if (strMo2867w == null) {
            strMo2867w = "";
        }
        Integer numMo2868x = mo2868x();
        ImageGraph imageGraph = new ImageGraph(id2, rectF, interfaceC9284dM2864F, strMo2867w, numMo2868x != null ? numMo2868x.intValue() : -1);
        imageGraph.m2866H(m2863E());
        imageGraph.m2729u(mo2714b());
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            imageGraph.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return imageGraph;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5180b
    /* renamed from: m */
    public void mo2731m(Canvas canvas, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (m2863E() == null) {
            m2865G();
        }
        m14493I(canvas, matrix);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, ba.AbstractC5179a, ba.InterfaceC5181c
    public void onDestroy() {
        super.onDestroy();
        C10339b.f24642a.m21620a(new Bitmap[]{this.f18556w}, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.graph.group.ImageGraph.onDestroy.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34012invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34012invoke() {
                ImageGraph.this.m14494J(null);
            }
        });
    }
}
