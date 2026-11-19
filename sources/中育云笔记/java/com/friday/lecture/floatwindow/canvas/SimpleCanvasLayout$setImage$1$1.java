package com.friday.lecture.floatwindow.canvas;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bumptech.glide.C5815g;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.friday.lecture.model.SubjectiveHomeworkAnswer;
import com.github.chrisbanes.photoview.PhotoView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p215k2.C9799q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$setImage$1$1", m26211f = "SimpleCanvasLayout.kt", m26212l = {315}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SimpleCanvasLayout$setImage$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8714c;

    /* renamed from: d */
    public final /* synthetic */ String f8715d;

    /* renamed from: e */
    public final /* synthetic */ SimpleCanvasLayout f8716e;

    @InterfaceC11829d(m26210c = "com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$setImage$1$1$1", m26211f = "SimpleCanvasLayout.kt", m26212l = {TypedValues.AttributesType.TYPE_EASING}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$setImage$1$1$1 */
    public static final class C61431 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f8717c;

        /* renamed from: d */
        public int f8718d;

        /* renamed from: e */
        public final /* synthetic */ String f8719e;

        /* renamed from: f */
        public final /* synthetic */ SimpleCanvasLayout f8720f;

        @InterfaceC11829d(m26210c = "com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$setImage$1$1$1$1", m26211f = "SimpleCanvasLayout.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout$setImage$1$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f8721c;

            /* renamed from: d */
            public final /* synthetic */ String f8722d;

            /* renamed from: e */
            public final /* synthetic */ String f8723e;

            /* renamed from: f */
            public final /* synthetic */ SimpleCanvasLayout f8724f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, SimpleCanvasLayout simpleCanvasLayout, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f8722d = str;
                this.f8723e = str2;
                this.f8724f = simpleCanvasLayout;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f8722d, this.f8723e, this.f8724f, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f8721c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (this.f8722d != null) {
                    PhotoView photoView = null;
                    LiveEventBus.get("updateTestLocalPath", SubjectiveHomeworkAnswer.class).post(new SubjectiveHomeworkAnswer(this.f8723e, null, this.f8722d));
                    C5815g c5815gM4016t = ComponentCallbacks2C5810b.m3946t(this.f8724f.getContext()).m4016t(this.f8722d);
                    PhotoView photoView2 = this.f8724f.f8703l;
                    if (photoView2 == null) {
                        AbstractC9979u.m20312y("image");
                    } else {
                        photoView = photoView2;
                    }
                    c5815gM4016t.m3981A0(photoView);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61431(String str, SimpleCanvasLayout simpleCanvasLayout, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8719e = str;
            this.f8720f = simpleCanvasLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61431(this.f8719e, this.f8720f, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8718d;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                String strM19799a = C9799q.f22994a.m19799a(this.f8719e);
                AbstractC11164t1 abstractC11164t1M24800c = C11157r0.m24800c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(strM19799a, this.f8719e, this.f8720f, null);
                this.f8717c = AbstractC11833h.m26224a(strM19799a);
                this.f8718d = 1;
                if (AbstractC11109f.m24709g(abstractC11164t1M24800c, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61431) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleCanvasLayout$setImage$1$1(String str, SimpleCanvasLayout simpleCanvasLayout, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8715d = str;
        this.f8716e = simpleCanvasLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleCanvasLayout$setImage$1$1(this.f8715d, this.f8716e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8714c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61431 c61431 = new C61431(this.f8715d, this.f8716e, null);
            this.f8714c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61431, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SimpleCanvasLayout$setImage$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
