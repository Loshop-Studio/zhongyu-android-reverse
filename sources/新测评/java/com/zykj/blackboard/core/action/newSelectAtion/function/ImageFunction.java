package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
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
import p066d5.InterfaceC7290b;
import p077e5.AbstractC7352m;
import p098g4.InterfaceC7522b;
import p109h4.AbstractC7624b;
import p109h4.AbstractC7625c;
import p120i4.AbstractC7661a;
import p120i4.C7665e;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;

/* loaded from: classes4.dex */
public final class ImageFunction extends AbstractC7661a {

    /* renamed from: u */
    public final ArrayList f7062u;

    /* renamed from: v */
    public final ArrayList f7063v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction(InterfaceC7522b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7062u = new ArrayList();
        this.f7063v = new ArrayList();
        m6161c0();
        m6160b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m6159a0() {
        m12763t().set(mo6156s());
        m12742N(m12758n(m12763t(), m12766w(), m12760p(), m12767x()));
        mo6139X();
        m12749W();
    }

    /* renamed from: b0 */
    private final void m6160b0() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (m12751f().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((m12751f().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList arrayList = this.f7062u;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((AbstractC7625c) obj).m12564a().length() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        float f12 = 23.0f;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            float fMeasureText = paint.measureText(((AbstractC7625c) obj2).m12564a());
            this.f7063v.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
    }

    /* renamed from: c0 */
    private final void m6161c0() {
        this.f7062u.clear();
        this.f7062u.add(AbstractC7625c.d.f12805c);
        this.f7062u.add(AbstractC7625c.e.f12806c);
        this.f7062u.add(new AbstractC7625c.c());
        this.f7062u.add(AbstractC7625c.a.f12802c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m6162d0() {
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.firstOrNull((List) m12764u());
        if (interfaceC8888c != null) {
            m12765v().set(interfaceC8888c.mo14996g());
            Matrix matrixM12768y = m12768y();
            matrixM12768y.reset();
            matrixM12768y.postConcat(interfaceC8888c.mo14993b());
            matrixM12768y.postConcat(m12762r().m13188b());
        }
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: A */
    public boolean mo6132A(float f10, float f11) {
        if (!super.mo6132A(f10, f11)) {
            return false;
        }
        if (m12752g() instanceof AbstractC7624b.d) {
            AbstractC7624b abstractC7624bM12752g = m12752g();
            Intrinsics.checkNotNull(abstractC7624bM12752g, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int iM12562a = ((AbstractC7624b.d) abstractC7624bM12752g).m12562a();
            if (iM12562a == 0) {
                Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) m12764u());
                final ImageGraph imageGraph = objFirstOrNull instanceof ImageGraph ? (ImageGraph) objFirstOrNull : null;
                if (imageGraph == null) {
                    return true;
                }
                final String strM15149I = imageGraph.m15149I();
                if (strM15149I == null) {
                    strM15149I = "";
                }
                InterfaceC7290b imageCropView = m12751f().getImageCropView();
                if (imageCropView != null) {
                    imageCropView.mo10822a(strM15149I, new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1

                        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
                        @DebugMetadata(m13595c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1", m13596f = "ImageFunction.kt", m13597i = {}, m13598l = {152}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                        /* renamed from: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1 */
                        public static final class C66291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                            /* renamed from: a */
                            public int f7067a;

                            /* renamed from: b */
                            public final /* synthetic */ ImageGraph f7068b;

                            /* renamed from: c */
                            public final /* synthetic */ String f7069c;

                            /* renamed from: d */
                            public final /* synthetic */ ImageFunction f7070d;

                            /* renamed from: e */
                            public final /* synthetic */ String f7071e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C66291(ImageGraph imageGraph, String str, ImageFunction imageFunction, String str2, Continuation continuation) {
                                super(2, continuation);
                                this.f7068b = imageGraph;
                                this.f7069c = str;
                                this.f7070d = imageFunction;
                                this.f7071e = str2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new C66291(this.f7068b, this.f7069c, this.f7070d, this.f7071e, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return invoke2(coroutineScope, (Continuation) continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object objWithContext;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i10 = this.f7067a;
                                if (i10 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    CoroutineDispatcher io2 = Dispatchers.getIO();
                                    ImageFunction$handleClick$1$1$newFilePath$1 imageFunction$handleClick$1$1$newFilePath$1 = new ImageFunction$handleClick$1$1$newFilePath$1(this.f7071e, this.f7069c, null);
                                    this.f7067a = 1;
                                    objWithContext = BuildersKt.withContext(io2, imageFunction$handleClick$1$1$newFilePath$1, this);
                                    if (objWithContext == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    objWithContext = obj;
                                }
                                String newFilePath = (String) objWithContext;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                RectF rectFMo14996g = this.f7068b.mo14996g();
                                BitmapFactory.decodeFile(this.f7069c, options);
                                float fWidth = rectFMo14996g.width() / options.outWidth;
                                Matrix matrixMo14993b = this.f7068b.mo14993b();
                                BitmapFactory.decodeFile(newFilePath, options);
                                RectF rectF = new RectF(0.0f, 0.0f, options.outWidth * fWidth, options.outHeight * fWidth);
                                Matrix matrix = new Matrix();
                                matrix.postTranslate(rectFMo14996g.centerX() - rectF.centerX(), rectFMo14996g.centerY() - rectF.centerY());
                                matrix.postConcat(matrixMo14993b);
                                InterfaceC7880c interfaceC7880cM12759o = this.f7070d.m12759o();
                                String id = this.f7068b.getId();
                                Intrinsics.checkNotNullExpressionValue(newFilePath, "newFilePath");
                                interfaceC7880cM12759o.mo13456u(id, rectF, matrix, newFilePath);
                                this.f7070d.m6162d0();
                                this.f7070d.m6159a0();
                                AbstractC7661a.m12733V(this.f7070d, false, 1, null);
                                InterfaceC7522b interfaceC7522bM12761q = this.f7070d.m12761q();
                                ImageGraph imageGraph = this.f7068b;
                                EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
                                String strSubstring = newFilePath.substring(StringsKt.lastIndexOf$default((CharSequence) newFilePath, File.separatorChar, 0, false, 6, (Object) null) + 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                                InterfaceC7522b.a.m12262a(interfaceC7522bM12761q, imageGraph, graphEnum, rectF, null, null, null, matrix, strSubstring, 56, null);
                                this.f7070d.m12761q().mo12247l();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                                return ((C66291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            LogUtils.m3239i("ImageFunction:Crop -> graphId: " + imageGraph.getId());
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C66291(imageGraph, strM15149I, this, cropFilePath, null), 3, null);
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
            } else if (iM12562a == 1) {
                m12759o().mo13452q(m12764u());
                m12759o().mo13439d();
                m12761q().mo12249n(m12764u(), System.currentTimeMillis());
                m12761q().mo12247l();
                mo6137L();
            }
        }
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: J */
    public boolean mo6136J(float f10, float f11) {
        if (m12757m().m12797e().contains(f10, f11)) {
            m12741M(new AbstractC7624b.d(0));
            return true;
        }
        if (m12757m().m12795c().contains(f10, f11)) {
            m12741M(new AbstractC7624b.d(1));
            return true;
        }
        if (m12756l().m12775c().contains(f10, f11)) {
            m12741M(AbstractC7624b.e.f12792a);
            return true;
        }
        Matrix matrixM11777b = AbstractC7352m.m11777b(m12753i());
        float[] fArr = {f10, f11};
        matrixM11777b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM11777b.mapRadius(m12751f().getSelectIconWidth());
        float f14 = 2;
        float f15 = fMapRadius / f14;
        if (new RectF(m12765v().centerX() - f15, m12765v().top - ((5 * fMapRadius) / f14), m12765v().centerX() + f15, m12765v().top - ((fMapRadius * 3) / f14)).contains(f12, f13)) {
            m12741M(AbstractC7624b.h.f12795a);
            return true;
        }
        if (new RectF(m12765v().right - f15, m12765v().bottom - f15, m12765v().right + f15, m12765v().bottom + f15).contains(f12, f13)) {
            m12741M(AbstractC7624b.i.f12796a);
            return true;
        }
        if (m12765v().contains(f12, f13)) {
            m12741M(AbstractC7624b.b.f12786a);
            return true;
        }
        m12741M(AbstractC7624b.g.f12794a);
        return false;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: L */
    public void mo6137L() {
        super.mo6137L();
        m6161c0();
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: X */
    public void mo6139X() {
        C7665e c7665eM12757m = m12757m();
        c7665eM12757m.m12797e().set((m12763t().left + ((RectF) this.f7063v.get(0)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7063v.get(0)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        c7665eM12757m.m12795c().set((m12763t().left + ((RectF) this.f7063v.get(1)).left) - 15.0f, m12763t().top, m12763t().left + ((RectF) this.f7063v.get(1)).right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
        if (m12740K()) {
            return;
        }
        float f10 = (c7665eM12757m.m12795c().right - c7665eM12757m.m12797e().left) + 16.0f;
        c7665eM12757m.m12797e().offset(m12763t().width() - f10, 0.0f);
        c7665eM12757m.m12795c().offset(m12763t().width() - f10, 0.0f);
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: h */
    public List mo6153h() {
        return this.f7062u;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: s */
    public RectF mo6156s() {
        m12745R(new Pair(Float.valueOf(((RectF) CollectionsKt.last((List) this.f7063v)).right + 15.0f + 8.0f), Float.valueOf(m12751f().getSelectButtonHeight())));
        return new RectF(0.0f, 0.0f, ((Number) m12767x().getFirst()).floatValue(), ((Number) m12767x().getSecond()).floatValue());
    }
}
