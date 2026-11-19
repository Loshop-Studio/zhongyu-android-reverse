package com.zykj.blackboard.core.graph.group;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7341b;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8887b;
import p210q4.InterfaceC8888c;
import p221r4.InterfaceC9007c;
import p232s4.C9136a;

/* loaded from: classes4.dex */
public class GroupGraph extends C9136a implements InterfaceC9007c {

    /* renamed from: r */
    public static final C6740a f7698r = new C6740a(null);

    /* renamed from: i */
    public String f7699i;

    /* renamed from: j */
    public Integer f7700j;

    /* renamed from: k */
    public boolean f7701k;

    /* renamed from: l */
    public final RectF f7702l;

    /* renamed from: m */
    public Bitmap f7703m;

    /* renamed from: n */
    public Matrix f7704n;

    /* renamed from: o */
    public final Matrix f7705o;

    /* renamed from: p */
    public float f7706p;

    /* renamed from: q */
    public float f7707q;

    /* renamed from: com.zykj.blackboard.core.graph.group.GroupGraph$a */
    public static final class C6740a {
        public /* synthetic */ C6740a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6740a() {
        }
    }

    public /* synthetic */ GroupGraph(String str, RectF rectF, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }

    /* renamed from: A */
    public void m6738A(Matrix newMatrix) {
        Intrinsics.checkNotNullParameter(newMatrix, "newMatrix");
        mo14993b().set(newMatrix);
        mo15005v();
        this.f7701k = true;
    }

    /* renamed from: B */
    public final void m6739B(Canvas canvas, Matrix matrix, Function1 function1) {
        Bitmap bitmap = this.f7703m;
        if (bitmap != null) {
            C7341b.f11907a.m11742a(new Bitmap[]{bitmap}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$drawChildrenDirectly$1
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
                    this.f7708a.f7703m = null;
                }
            });
        }
        mo6749m(canvas, matrix);
        for (InterfaceC8888c it : mo14995f()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InterfaceC8887b.a.m15006a(it, canvas, matrix, function1, false, false, 24, null);
        }
    }

    /* renamed from: C */
    public final RectF m6740C(boolean z9, Matrix matrix) {
        RectF rectFMo14999j = mo14999j(matrix);
        if (z9 || this.f7706p <= 0.0f || this.f7707q <= 0.0f || rectFMo14999j.intersect(new RectF(-200.0f, -200.0f, this.f7706p + 200.0f, this.f7707q + 200.0f))) {
            return rectFMo14999j;
        }
        return null;
    }

    /* renamed from: D */
    public final Matrix m6741D() {
        return this.f7704n;
    }

    /* renamed from: E */
    public final void m6742E(boolean z9) {
        this.f7701k = z9;
    }

    /* renamed from: F */
    public final boolean m6743F(Matrix matrix, Matrix matrix2) {
        if (Intrinsics.areEqual(matrix, matrix2)) {
            return false;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        if (fArr[0] == fArr2[0] && fArr[4] == fArr2[4]) {
            float fAbs = Math.abs(fArr[2] - fArr2[2]);
            float fAbs2 = Math.abs(fArr[5] - fArr2[5]);
            if (fAbs <= 100.0f && fAbs2 <= 100.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m6744G(boolean z9, Matrix matrix, Function1 function1) {
        Bitmap bitmapCreateBitmap;
        RectF rectFM6740C = m6740C(z9, matrix);
        if (rectFM6740C == null) {
            C7341b.f11907a.m11742a(new Bitmap[]{this.f7703m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$nextRenderRect$1$1
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
                    this.f7713a.f7703m = null;
                }
            });
            return false;
        }
        this.f7702l.set(rectFM6740C);
        int iWidth = ((int) this.f7702l.width()) + 1;
        int iHeight = ((int) this.f7702l.height()) + 1;
        long j10 = iWidth * iHeight * 4;
        if (iWidth <= 0 || iHeight <= 0 || iWidth > 4096 || iHeight > 4096) {
            C7341b.f11907a.m11742a(new Bitmap[]{this.f7703m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$1
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
                    this.f7710a.f7703m = null;
                }
            });
            return false;
        }
        if (j10 >= 104857600) {
            C7341b.f11907a.m11742a(new Bitmap[]{this.f7703m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$2
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
                    this.f7711a.f7703m = null;
                }
            });
            return false;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            C7341b.f11907a.m11742a(new Bitmap[]{this.f7703m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$3
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
                    this.f7712a.f7703m = null;
                }
            });
            return false;
        }
        this.f7703m = bitmapCreateBitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = this.f7702l;
        canvas.translate(-rectF.left, -rectF.top);
        mo6749m(canvas, matrix);
        for (InterfaceC8888c it : mo14995f()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InterfaceC8887b.a.m15006a(it, canvas, matrix, function1, false, false, 24, null);
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m6745H(boolean z9, Matrix matrix) {
        RectF rectFM6740C;
        Bitmap bitmap = this.f7703m;
        if (bitmap == null || bitmap.isRecycled() || (rectFM6740C = m6740C(z9, matrix)) == null) {
            return false;
        }
        int iWidth = ((int) rectFM6740C.width()) + 1;
        int iHeight = ((int) rectFM6740C.height()) + 1;
        if (iWidth == bitmap.getWidth() && iHeight == bitmap.getHeight()) {
            this.f7702l.set(rectFM6740C);
            return true;
        }
        return false;
    }

    @Override // p232s4.C9136a, p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        GroupGraph groupGraph = new GroupGraph(getId(), new RectF(mo14996g()), null, null, 12, null);
        groupGraph.m15004u(mo14993b());
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            groupGraph.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return groupGraph;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8889d
    /* renamed from: e */
    public void mo6747e(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        super.mo6747e(matrix);
        this.f7701k = true;
    }

    @Override // p232s4.C9136a, p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GROUP_GRAPH;
    }

    @Override // p221r4.InterfaceC9007c
    /* renamed from: l */
    public void mo6748l(boolean z9) {
        this.f7701k = z9;
    }

    @Override // p232s4.C9136a, p210q4.InterfaceC8887b
    /* renamed from: m */
    public void mo6749m(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    @Override // p221r4.InterfaceC9007c
    /* renamed from: o */
    public void mo6750o(RectF newRectF) {
        Intrinsics.checkNotNullParameter(newRectF, "newRectF");
        mo14996g().set(newRectF);
        mo15005v();
        this.f7701k = true;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public void onDestroy() {
        super.onDestroy();
        C7341b.f11907a.m11742a(new Bitmap[]{this.f7703m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.onDestroy.1
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
                GroupGraph.this.f7703m = null;
            }
        });
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8887b
    /* renamed from: q */
    public void mo6751q(Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (function1 == null || !((Boolean) function1.invoke(this)).booleanValue()) {
            if (m6743F(this.f7705o, matrix)) {
                this.f7701k = true;
            }
            Bitmap bitmap = this.f7703m;
            if (bitmap == null || ((bitmap != null && bitmap.isRecycled()) || this.f7701k || z10)) {
                if (z9) {
                    this.f7706p = canvas.getWidth();
                    this.f7707q = canvas.getHeight();
                }
                if (m6744G(z10, matrix, function1)) {
                    this.f7705o.set(matrix);
                }
                this.f7701k = false;
            } else if (!m6745H(z10, matrix) && m6744G(z10, matrix, function1)) {
                this.f7705o.set(matrix);
            }
            Bitmap bitmap2 = this.f7703m;
            if (bitmap2 == null || bitmap2.isRecycled() || !m6756z(bitmap2)) {
                m6739B(canvas, matrix, function1);
            } else {
                RectF rectF = this.f7702l;
                canvas.drawBitmap(bitmap2, rectF.left, rectF.top, (Paint) null);
            }
        }
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8889d
    /* renamed from: r */
    public void mo6752r(InterfaceC8888c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        super.mo6752r(graph);
        this.f7701k = true;
    }

    @Override // p210q4.AbstractC8886a
    /* renamed from: s */
    public void mo6753s(InterfaceC8888c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        super.mo6753s(graph);
        this.f7701k = true;
    }

    @Override // p232s4.C9136a
    /* renamed from: w */
    public String mo6754w() {
        return this.f7699i;
    }

    @Override // p232s4.C9136a
    /* renamed from: x */
    public Integer mo6755x() {
        return this.f7700j;
    }

    /* renamed from: z */
    public final boolean m6756z(Bitmap bitmap) {
        return ((long) bitmap.getAllocationByteCount()) < 104857600;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupGraph(String id, RectF outRectF, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f7699i = str;
        this.f7700j = num;
        this.f7702l = new RectF();
        this.f7704n = new Matrix();
        this.f7705o = new Matrix();
    }
}
