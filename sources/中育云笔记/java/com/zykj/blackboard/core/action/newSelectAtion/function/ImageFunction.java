package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyGraphEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import ma.InterfaceC10218f;
import na.AbstractC10351n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p337s9.AbstractC11081b;
import p337s9.AbstractC11082c;
import p348t9.AbstractC11254a;
import p348t9.C11257d;
import p377v9.InterfaceC11552c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

/* loaded from: classes5.dex */
public final class ImageFunction extends AbstractC11254a {

    /* renamed from: s */
    public final ArrayList f17899s;

    /* renamed from: t */
    public final ArrayList f17900t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction(InterfaceC10918b listener) {
        super(listener);
        AbstractC9979u.m20294g(listener, "listener");
        this.f17899s = new ArrayList();
        this.f17900t = new ArrayList();
        m13872W();
        m13871V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final void m13870U() {
        m25146q().set(mo13878p());
        m25128J(m25141k(m25146q(), m25149t(), m25143m()));
        mo13876R();
    }

    /* renamed from: V */
    private final void m13871V() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM22861E = (m25135d().m22861E() - f10) / f11;
        float fM22861E2 = ((m25135d().m22861E() - f10) / f11) + f10;
        ArrayList arrayList = this.f17899s;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((AbstractC11082c) obj).m24640a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            float fMeasureText = paint.measureText(((AbstractC11082c) obj2).m24640a());
            this.f17900t.add(new RectF(f12, fM22861E, f12 + fMeasureText, fM22861E2));
            f12 += fMeasureText + 30.0f;
        }
    }

    /* renamed from: W */
    private final void m13872W() {
        this.f17899s.clear();
        this.f17899s.add(AbstractC11082c.d.f26760c);
        this.f17899s.add(AbstractC11082c.e.f26761c);
        this.f17899s.add(new AbstractC11082c.c());
        this.f17899s.add(AbstractC11082c.a.f26757c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final void m13873X() {
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23946o0(m25147r());
        if (interfaceC5181c != null) {
            m25148s().set(interfaceC5181c.mo2718g());
            Matrix matrixM25150u = m25150u();
            matrixM25150u.reset();
            matrixM25150u.postConcat(interfaceC5181c.mo2714b());
            matrixM25150u.postConcat(m25145o().m25311b());
        }
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: F */
    public boolean mo13874F(float f10, float f11) {
        if (m25140j().m25172d().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(0));
            return true;
        }
        if (m25140j().m25170b().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(1));
            return true;
        }
        Matrix matrixM21660b = AbstractC10351n.m21660b(m25137g());
        float[] fArr = {f10, f11};
        matrixM21660b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM21660b.mapRadius(m25135d().m22864H());
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(m25148s().centerX() - f15, m25148s().top - ((5 * fMapRadius) / f14), m25148s().centerX() + f15, m25148s().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            m25127I(AbstractC11081b.g.f26750a);
            return true;
        }
        if (new RectF(m25148s().right - f15, m25148s().bottom - f15, m25148s().right + f15, m25148s().bottom + f15).contains(f12, f13)) {
            m25127I(AbstractC11081b.h.f26751a);
            return true;
        }
        if (m25148s().contains(f12, f13)) {
            m25127I(AbstractC11081b.b.f26742a);
            return true;
        }
        m25127I(AbstractC11081b.f.f26749a);
        return false;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: H */
    public void mo13875H() {
        super.mo13875H();
        m13872W();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: R */
    public void mo13876R() {
        C11257d c11257dM25140j = m25140j();
        c11257dM25140j.m25172d().set((m25146q().left + ((RectF) this.f17900t.get(0)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f17900t.get(0)).right + 15.0f, m25146q().top + m25135d().m22861E());
        c11257dM25140j.m25170b().set((m25146q().left + ((RectF) this.f17900t.get(1)).left) - 15.0f, m25146q().top, m25146q().left + ((RectF) this.f17900t.get(1)).right + 15.0f, m25146q().top + m25135d().m22861E());
        if (m25126G()) {
            return;
        }
        float f10 = (c11257dM25140j.m25170b().right - c11257dM25140j.m25172d().left) + 16.0f;
        c11257dM25140j.m25172d().offset(m25146q().width() - f10, 0.0f);
        c11257dM25140j.m25170b().offset(m25146q().width() - f10, 0.0f);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: f */
    public List mo13877f() {
        return this.f17899s;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: p */
    public RectF mo13878p() {
        return new RectF(0.0f, 0.0f, ((RectF) AbstractC10947g0.m23956y0(this.f17900t)).right + 15.0f + 8.0f, m25135d().m22861E());
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: w */
    public boolean mo13879w(float f10, float f11) {
        if (!super.mo13879w(f10, f11)) {
            return false;
        }
        if (m25136e() instanceof AbstractC11081b.d) {
            AbstractC11081b abstractC11081bM25136e = m25136e();
            AbstractC9979u.m20292e(abstractC11081bM25136e, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM24638a = ((AbstractC11081b.d) abstractC11081bM25136e).m24638a();
            if (iM24638a == 0) {
                Object objM23946o0 = AbstractC10947g0.m23946o0(m25147r());
                final ImageGraph imageGraph = objM23946o0 instanceof ImageGraph ? (ImageGraph) objM23946o0 : null;
                if (imageGraph == null) {
                    return true;
                }
                final String strM2863E = imageGraph.m2863E();
                if (strM2863E == null) {
                    strM2863E = "";
                }
                InterfaceC10218f interfaceC10218fM22916w = m25135d().m22916w();
                if (interfaceC10218fM22916w != null) {
                    interfaceC10218fM22916w.mo16803a(strM2863E, new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1

                        @InterfaceC11829d(m26210c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1", m26211f = "ImageFunction.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m26213m = "invokeSuspend")
                        /* renamed from: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1 */
                        public static final class C83281 extends SuspendLambda implements InterfaceC9544p {

                            /* renamed from: c */
                            public int f17904c;

                            /* renamed from: d */
                            public final /* synthetic */ ImageGraph f17905d;

                            /* renamed from: e */
                            public final /* synthetic */ String f17906e;

                            /* renamed from: f */
                            public final /* synthetic */ ImageFunction f17907f;

                            /* renamed from: g */
                            public final /* synthetic */ String f17908g;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C83281(ImageGraph imageGraph, String str, ImageFunction imageFunction, String str2, InterfaceC11588c interfaceC11588c) {
                                super(2, interfaceC11588c);
                                this.f17905d = imageGraph;
                                this.f17906e = str;
                                this.f17907f = imageFunction;
                                this.f17908g = str2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                                return new C83281(this.f17905d, this.f17906e, this.f17907f, this.f17908g, interfaceC11588c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                Object objM24709g;
                                Object objM25952f = AbstractC11725a.m25952f();
                                int i10 = this.f17904c;
                                if (i10 == 0) {
                                    AbstractC9924b.m20071b(obj);
                                    AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
                                    ImageFunction$handleClick$1$1$newFilePath$1 imageFunction$handleClick$1$1$newFilePath$1 = new ImageFunction$handleClick$1$1$newFilePath$1(this.f17908g, this.f17906e, null);
                                    this.f17904c = 1;
                                    objM24709g = AbstractC11109f.m24709g(abstractC11106e0M24799b, imageFunction$handleClick$1$1$newFilePath$1, this);
                                    if (objM24709g == objM25952f) {
                                        return objM25952f;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC9924b.m20071b(obj);
                                    objM24709g = obj;
                                }
                                String newFilePath = (String) objM24709g;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                RectF rectFMo2718g = this.f17905d.mo2718g();
                                BitmapFactory.decodeFile(this.f17906e, options);
                                float fWidth = rectFMo2718g.width() / options.outWidth;
                                Matrix matrixMo2714b = this.f17905d.mo2714b();
                                BitmapFactory.decodeFile(newFilePath, options);
                                RectF rectF = new RectF(0.0f, 0.0f, options.outWidth * fWidth, options.outHeight * fWidth);
                                Matrix matrix = new Matrix();
                                matrix.postTranslate(rectFMo2718g.centerX() - rectF.centerX(), rectFMo2718g.centerY() - rectF.centerY());
                                matrix.postConcat(matrixMo2714b);
                                InterfaceC11552c interfaceC11552cM25142l = this.f17907f.m25142l();
                                String id2 = this.f17905d.getId();
                                AbstractC9979u.m20293f(newFilePath, "newFilePath");
                                interfaceC11552cM25142l.mo25463w(id2, rectF, matrix, newFilePath);
                                this.f17907f.m13873X();
                                this.f17907f.m13870U();
                                AbstractC11254a.m25119Q(this.f17907f, false, 1, null);
                                InterfaceC10918b interfaceC10918bM25144n = this.f17907f.m25144n();
                                ImageGraph imageGraph = this.f17905d;
                                EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
                                String strSubstring = newFilePath.substring(AbstractC10793c0.m23135k0(newFilePath, File.separatorChar, 0, false, 6, null) + 1);
                                AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
                                InterfaceC10918b.a.m23785a(interfaceC10918bM25144n, imageGraph, graphEnum, rectF, null, null, null, matrix, strSubstring, 56, null);
                                this.f17907f.m25144n().mo23772l();
                                return C10786q.f26013a;
                            }

                            @Override // p181hd.InterfaceC9544p
                            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                                return ((C83281) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(String cropFilePath) {
                            AbstractC9979u.m20294g(cropFilePath, "cropFilePath");
                            LogUtils.m3888i("ImageFunction:Crop -> graphId: " + imageGraph.getId());
                            AbstractC11117h.m24726d(AbstractC10006d.m20745b(), null, null, new C83281(imageGraph, strM2863E, this, cropFilePath, null), 3, null);
                        }
                    }, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$2
                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m34001invoke() {
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m34001invoke();
                            return C10786q.f26013a;
                        }
                    });
                }
            } else if (iM24638a == 1) {
                m25142l().mo25456p(m25147r());
                m25142l().mo25445e();
                m25144n().mo23775o(m25147r(), System.currentTimeMillis());
                m25144n().mo23772l();
                mo13875H();
            }
        }
        return true;
    }
}
