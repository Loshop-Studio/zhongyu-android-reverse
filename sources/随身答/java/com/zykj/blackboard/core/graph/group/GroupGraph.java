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
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8054b;
import p117g5.InterfaceC8055c;
import p127h5.InterfaceC8100c;
import p137i5.C8134a;
import p263u5.C9683b;

/* loaded from: classes4.dex */
public class GroupGraph extends C8134a implements InterfaceC8100c {

    /* renamed from: r */
    public static final C7058a f8982r = new C7058a(null);

    /* renamed from: i */
    public String f8983i;

    /* renamed from: j */
    public Integer f8984j;

    /* renamed from: k */
    public boolean f8985k;

    /* renamed from: l */
    public final RectF f8986l;

    /* renamed from: m */
    public Bitmap f8987m;

    /* renamed from: n */
    public Matrix f8988n;

    /* renamed from: o */
    public final Matrix f8989o;

    /* renamed from: p */
    public float f8990p;

    /* renamed from: q */
    public float f8991q;

    /* renamed from: com.zykj.blackboard.core.graph.group.GroupGraph$a */
    public static final class C7058a {
        public /* synthetic */ C7058a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C7058a() {
        }
    }

    public /* synthetic */ GroupGraph(String str, RectF rectF, String str2, Integer num, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : num);
    }

    /* renamed from: A */
    public final void m7851A(Canvas canvas, Matrix matrix, Function1 function1) {
        Bitmap bitmap = this.f8987m;
        if (bitmap != null) {
            C9683b.f17119a.m16159a(new Bitmap[]{bitmap}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$drawChildrenDirectly$1
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
                    this.f8992a.f8987m = null;
                }
            });
        }
        mo7861l(canvas, matrix);
        for (InterfaceC8055c it : mo12796e()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InterfaceC8054b.a.m12807a(it, canvas, matrix, function1, false, false, 24, null);
        }
    }

    /* renamed from: B */
    public final RectF m7852B(boolean z9, Matrix matrix) {
        RectF rectFMo12799i = mo12799i(matrix);
        if (z9 || this.f8990p <= 0.0f || this.f8991q <= 0.0f || rectFMo12799i.intersect(new RectF(-200.0f, -200.0f, this.f8990p + 200.0f, this.f8991q + 200.0f))) {
            return rectFMo12799i;
        }
        return null;
    }

    /* renamed from: C */
    public final Matrix m7853C() {
        return this.f8988n;
    }

    /* renamed from: D */
    public final void m7854D(boolean z9) {
        this.f8985k = z9;
    }

    /* renamed from: E */
    public final boolean m7855E(Matrix matrix, Matrix matrix2) {
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

    /* renamed from: F */
    public final boolean m7856F(boolean z9, Matrix matrix, Function1 function1) {
        Bitmap bitmapCreateBitmap;
        RectF rectFM7852B = m7852B(z9, matrix);
        if (rectFM7852B == null) {
            C9683b.f17119a.m16159a(new Bitmap[]{this.f8987m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$nextRenderRect$1$1
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
                    this.f8997a.f8987m = null;
                }
            });
            return false;
        }
        this.f8986l.set(rectFM7852B);
        int iWidth = ((int) this.f8986l.width()) + 1;
        int iHeight = ((int) this.f8986l.height()) + 1;
        long j9 = iWidth * iHeight * 4;
        if (iWidth <= 0 || iHeight <= 0 || iWidth > 4096 || iHeight > 4096) {
            C9683b.f17119a.m16159a(new Bitmap[]{this.f8987m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$1
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
                    this.f8994a.f8987m = null;
                }
            });
            return false;
        }
        if (j9 >= 104857600) {
            C9683b.f17119a.m16159a(new Bitmap[]{this.f8987m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$2
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
                    this.f8995a.f8987m = null;
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
            C9683b.f17119a.m16159a(new Bitmap[]{this.f8987m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$3
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
                    this.f8996a.f8987m = null;
                }
            });
            return false;
        }
        this.f8987m = bitmapCreateBitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = this.f8986l;
        canvas.translate(-rectF.left, -rectF.top);
        mo7861l(canvas, matrix);
        for (InterfaceC8055c it : mo12796e()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InterfaceC8054b.a.m12807a(it, canvas, matrix, function1, false, false, 24, null);
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m7857G(boolean z9, Matrix matrix) {
        RectF rectFM7852B;
        Bitmap bitmap = this.f8987m;
        if (bitmap == null || bitmap.isRecycled() || (rectFM7852B = m7852B(z9, matrix)) == null) {
            return false;
        }
        int iWidth = ((int) rectFM7852B.width()) + 1;
        int iHeight = ((int) rectFM7852B.height()) + 1;
        if (iWidth == bitmap.getWidth() && iHeight == bitmap.getHeight()) {
            this.f8986l.set(rectFM7852B);
            return true;
        }
        return false;
    }

    @Override // p137i5.C8134a, p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        GroupGraph groupGraph = new GroupGraph(getId(), new RectF(mo12797f()), null, null, 12, null);
        groupGraph.m12805t(mo12794b());
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            groupGraph.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return groupGraph;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8056d
    /* renamed from: d */
    public void mo7858d(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        super.mo7858d(matrix);
        this.f8985k = true;
    }

    @Override // p137i5.C8134a, p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GROUP_GRAPH;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8056d
    /* renamed from: h */
    public void mo7859h(InterfaceC8055c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        super.mo7859h(graph);
        this.f8985k = true;
    }

    @Override // p127h5.InterfaceC8100c
    /* renamed from: k */
    public void mo7860k(boolean z9) {
        this.f8985k = z9;
    }

    @Override // p137i5.C8134a, p117g5.InterfaceC8054b
    /* renamed from: l */
    public void mo7861l(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    @Override // p127h5.InterfaceC8100c
    /* renamed from: n */
    public void mo7862n(RectF newRectF) {
        Intrinsics.checkNotNullParameter(newRectF, "newRectF");
        mo12797f().set(newRectF);
        mo12806u();
        this.f8985k = true;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public void onDestroy() {
        super.onDestroy();
        C9683b.f17119a.m16159a(new Bitmap[]{this.f8987m}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.onDestroy.1
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
                GroupGraph.this.f8987m = null;
            }
        });
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8054b
    /* renamed from: p */
    public void mo7863p(Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (function1 == null || !((Boolean) function1.invoke(this)).booleanValue()) {
            if (m7855E(this.f8989o, matrix)) {
                this.f8985k = true;
            }
            Bitmap bitmap = this.f8987m;
            if (bitmap == null || ((bitmap != null && bitmap.isRecycled()) || this.f8985k || z10)) {
                if (z9) {
                    this.f8990p = canvas.getWidth();
                    this.f8991q = canvas.getHeight();
                }
                if (m7856F(z10, matrix, function1)) {
                    this.f8989o.set(matrix);
                }
                this.f8985k = false;
            } else if (!m7857G(z10, matrix) && m7856F(z10, matrix, function1)) {
                this.f8989o.set(matrix);
            }
            Bitmap bitmap2 = this.f8987m;
            if (bitmap2 == null || bitmap2.isRecycled() || !m7867y(bitmap2)) {
                m7851A(canvas, matrix, function1);
            } else {
                RectF rectF = this.f8986l;
                canvas.drawBitmap(bitmap2, rectF.left, rectF.top, (Paint) null);
            }
        }
    }

    @Override // p117g5.AbstractC8053a
    /* renamed from: r */
    public void mo7864r(InterfaceC8055c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        super.mo7864r(graph);
        this.f8985k = true;
    }

    @Override // p137i5.C8134a
    /* renamed from: v */
    public String mo7865v() {
        return this.f8983i;
    }

    @Override // p137i5.C8134a
    /* renamed from: w */
    public Integer mo7866w() {
        return this.f8984j;
    }

    /* renamed from: y */
    public final boolean m7867y(Bitmap bitmap) {
        return ((long) bitmap.getAllocationByteCount()) < 104857600;
    }

    /* renamed from: z */
    public void m7868z(Matrix newMatrix) {
        Intrinsics.checkNotNullParameter(newMatrix, "newMatrix");
        mo12794b().set(newMatrix);
        mo12806u();
        this.f8985k = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupGraph(String id, RectF outRectF, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f8983i = str;
        this.f8984j = num;
        this.f8986l = new RectF();
        this.f8988n = new Matrix();
        this.f8989o = new Matrix();
    }
}
