package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyGraphEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p253t5.InterfaceC9616b;
import p263u5.AbstractC9695n;
import p282w4.InterfaceC9822b;
import p292x4.AbstractC9878b;
import p292x4.AbstractC9879c;
import p302y4.AbstractC9948a;
import p302y4.C9952e;

/* loaded from: classes4.dex */
public final class ImageFunction extends AbstractC9948a {

    /* renamed from: u */
    public final ArrayList f8345u;

    /* renamed from: v */
    public final ArrayList f8346v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction(InterfaceC9822b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8345u = new ArrayList();
        this.f8346v = new ArrayList();
        m7257c0();
        m7256b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m7255a0() {
        m17185t().set(mo7252s());
        m17164N(m17180n(m17185t(), m17188w(), m17182p(), m17189x()));
        mo7235X();
        m17171W();
    }

    /* renamed from: b0 */
    private final void m7256b0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float fM16455F = (m17173f().m16455F() - f10) / f11;
        float fM16455F2 = ((m17173f().m16455F() - f10) / f11) + f10;
        ArrayList arrayList = this.f8345u;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((AbstractC9879c) obj).m16891a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            float fMeasureText = paint.measureText(((AbstractC9879c) obj2).m16891a());
            this.f8346v.add(new RectF(f12, fM16455F, f12 + fMeasureText, fM16455F2));
            f12 += fMeasureText + 30.0f;
        }
    }

    /* renamed from: c0 */
    private final void m7257c0() {
        this.f8345u.clear();
        this.f8345u.add(AbstractC9879c.d.f17654c);
        this.f8345u.add(AbstractC9879c.e.f17655c);
        this.f8345u.add(new AbstractC9879c.c());
        this.f8345u.add(AbstractC9879c.a.f17651c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m7258d0() {
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.firstOrNull((List) m17186u());
        if (interfaceC8055c != null) {
            m17187v().set(interfaceC8055c.mo12797f());
            Matrix matrixM17190y = m17190y();
            matrixM17190y.reset();
            matrixM17190y.postConcat(interfaceC8055c.mo12794b());
            matrixM17190y.postConcat(m17184r().m17344b());
        }
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: A */
    public boolean mo7228A(float f10, float f11) {
        if (!super.mo7228A(f10, f11)) {
            return false;
        }
        if (m17174g() instanceof AbstractC9878b.d) {
            AbstractC9878b abstractC9878bM17174g = m17174g();
            Intrinsics.checkNotNull(abstractC9878bM17174g, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM16889a = ((AbstractC9878b.d) abstractC9878bM17174g).m16889a();
            if (iM16889a == 0) {
                Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) m17186u());
                final ImageGraph imageGraph = objFirstOrNull instanceof ImageGraph ? (ImageGraph) objFirstOrNull : null;
                if (imageGraph == null) {
                    return true;
                }
                final String strM12932H = imageGraph.m12932H();
                if (strM12932H == null) {
                    strM12932H = "";
                }
                InterfaceC9616b interfaceC9616bM16516w = m17173f().m16516w();
                if (interfaceC9616bM16516w != null) {
                    interfaceC9616bM16516w.mo11221a(strM12932H, new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1

                        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                        @DebugMetadata(m13450c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1", m13451f = "ImageFunction.kt", m13452i = {}, m13453l = {152}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
                        /* renamed from: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1 */
                        public static final class C69461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                            /* renamed from: a */
                            public int f8350a;

                            /* renamed from: b */
                            public final /* synthetic */ ImageGraph f8351b;

                            /* renamed from: c */
                            public final /* synthetic */ String f8352c;

                            /* renamed from: d */
                            public final /* synthetic */ ImageFunction f8353d;

                            /* renamed from: e */
                            public final /* synthetic */ String f8354e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C69461(ImageGraph imageGraph, String str, ImageFunction imageFunction, String str2, Continuation continuation) {
                                super(2, continuation);
                                this.f8351b = imageGraph;
                                this.f8352c = str;
                                this.f8353d = imageFunction;
                                this.f8354e = str2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new C69461(this.f8351b, this.f8352c, this.f8353d, this.f8354e, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return invoke2(coroutineScope, (Continuation) continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object objWithContext;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i9 = this.f8350a;
                                if (i9 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    CoroutineDispatcher io2 = Dispatchers.getIO();
                                    ImageFunction$handleClick$1$1$newFilePath$1 imageFunction$handleClick$1$1$newFilePath$1 = new ImageFunction$handleClick$1$1$newFilePath$1(this.f8354e, this.f8352c, null);
                                    this.f8350a = 1;
                                    objWithContext = BuildersKt.withContext(io2, imageFunction$handleClick$1$1$newFilePath$1, this);
                                    if (objWithContext == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i9 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    objWithContext = obj;
                                }
                                String newFilePath = (String) objWithContext;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                RectF rectFMo12797f = this.f8351b.mo12797f();
                                BitmapFactory.decodeFile(this.f8352c, options);
                                float fWidth = rectFMo12797f.width() / options.outWidth;
                                Matrix matrixMo12794b = this.f8351b.mo12794b();
                                BitmapFactory.decodeFile(newFilePath, options);
                                RectF rectF = new RectF(0.0f, 0.0f, options.outWidth * fWidth, options.outHeight * fWidth);
                                Matrix matrix = new Matrix();
                                matrix.postTranslate(rectFMo12797f.centerX() - rectF.centerX(), rectFMo12797f.centerY() - rectF.centerY());
                                matrix.postConcat(matrixMo12794b);
                                InterfaceC0039c interfaceC0039cM17181o = this.f8353d.m17181o();
                                String id = this.f8351b.getId();
                                Intrinsics.checkNotNullExpressionValue(newFilePath, "newFilePath");
                                interfaceC0039cM17181o.mo217t(id, rectF, matrix, newFilePath);
                                this.f8353d.m7258d0();
                                this.f8353d.m7255a0();
                                AbstractC9948a.m17155V(this.f8353d, false, 1, null);
                                InterfaceC9822b interfaceC9822bM17183q = this.f8353d.m17183q();
                                ImageGraph imageGraph = this.f8351b;
                                EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
                                String strSubstring = newFilePath.substring(StringsKt.lastIndexOf$default((CharSequence) newFilePath, File.separatorChar, 0, false, 6, (Object) null) + 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                                InterfaceC9822b.a.m16708a(interfaceC9822bM17183q, imageGraph, graphEnum, rectF, null, null, null, matrix, strSubstring, 56, null);
                                this.f8353d.m17183q().mo16693l();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                                return ((C69461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String cropFilePath) {
                            Intrinsics.checkNotNullParameter(cropFilePath, "cropFilePath");
                            LogUtils.m2956i("ImageFunction:Crop -> graphId: " + imageGraph.getId());
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C69461(imageGraph, strM12932H, this, cropFilePath, null), 3, null);
                        }
                    }, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    });
                }
            } else if (iM16889a == 1) {
                m17181o().mo212o(m17186u());
                m17181o().mo201d();
                m17183q().mo16695n(m17186u(), System.currentTimeMillis());
                m17183q().mo16693l();
                mo7233L();
            }
        }
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: J */
    public boolean mo7232J(float f10, float f11) {
        if (m17179m().m17219e().contains(f10, f11)) {
            m17163M(new AbstractC9878b.d(0));
            return true;
        }
        if (m17179m().m17217c().contains(f10, f11)) {
            m17163M(new AbstractC9878b.d(1));
            return true;
        }
        if (m17178l().m17197c().contains(f10, f11)) {
            m17163M(AbstractC9878b.e.f17641a);
            return true;
        }
        Matrix matrixM16200b = AbstractC9695n.m16200b(m17175i());
        float[] fArr = {f10, f11};
        matrixM16200b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM16200b.mapRadius(m17173f().m16459J());
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(m17187v().centerX() - f15, m17187v().top - ((5 * fMapRadius) / f14), m17187v().centerX() + f15, m17187v().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            m17163M(AbstractC9878b.h.f17644a);
            return true;
        }
        if (new RectF(m17187v().right - f15, m17187v().bottom - f15, m17187v().right + f15, m17187v().bottom + f15).contains(f12, f13)) {
            m17163M(AbstractC9878b.i.f17645a);
            return true;
        }
        if (m17187v().contains(f12, f13)) {
            m17163M(AbstractC9878b.b.f17635a);
            return true;
        }
        m17163M(AbstractC9878b.g.f17643a);
        return false;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: L */
    public void mo7233L() {
        super.mo7233L();
        m7257c0();
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: X */
    public void mo7235X() {
        C9952e c9952eM17179m = m17179m();
        c9952eM17179m.m17219e().set((m17185t().left + ((RectF) this.f8346v.get(0)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8346v.get(0)).right + 15.0f, m17185t().top + m17173f().m16455F());
        c9952eM17179m.m17217c().set((m17185t().left + ((RectF) this.f8346v.get(1)).left) - 15.0f, m17185t().top, m17185t().left + ((RectF) this.f8346v.get(1)).right + 15.0f, m17185t().top + m17173f().m16455F());
        if (m17162K()) {
            return;
        }
        float f10 = (c9952eM17179m.m17217c().right - c9952eM17179m.m17219e().left) + 16.0f;
        c9952eM17179m.m17219e().offset(m17185t().width() - f10, 0.0f);
        c9952eM17179m.m17217c().offset(m17185t().width() - f10, 0.0f);
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: h */
    public List mo7249h() {
        return this.f8345u;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: s */
    public RectF mo7252s() {
        m17167R(new Pair(Float.valueOf(((RectF) CollectionsKt.last((List) this.f8346v)).right + 15.0f + 8.0f), Float.valueOf(m17173f().m16455F())));
        return new RectF(0.0f, 0.0f, ((Number) m17189x().getFirst()).floatValue(), ((Number) m17189x().getSecond()).floatValue());
    }
}
