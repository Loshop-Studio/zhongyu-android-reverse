package com.zykj.mistake.utils;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import coil3.network.okhttp.internal.C3327b;
import com.blankj.utilcode.util.RunnableC3379a0;
import com.zykj.mistake.feature.collection.list.C4700a0;
import com.zykj.mistake.widget.StemWebView;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/v;)Landroid/graphics/Bitmap;"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$bitmap$1", m5303f = "AskMaterialImageResolver.kt", m5304i = {}, m5305l = {69}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class AskMaterialImageResolver$captureWebToFile$bitmap$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ C5098c this$0;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/v;)Landroid/graphics/Bitmap;"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$bitmap$1$1", m5303f = "AskMaterialImageResolver.kt", m5304i = {}, m5305l = {70}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$bitmap$1$1 */
    public static final class C50951 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ C5098c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50951(C5098c c5098c, String str, InterfaceC5631c<? super C50951> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = c5098c;
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C50951(this.this$0, this.$url, interfaceC5631c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [T, android.view.View, com.zykj.mistake.widget.StemWebView, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return obj;
            }
            AbstractC5774b.m5119b(obj);
            C5098c c5098c = this.this$0;
            String str = this.$url;
            this.label = 1;
            c5098c.getClass();
            C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(this));
            c5961g.m5584u();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? stemWebView = new StemWebView(c5098c.f8028a, null, 6, 0);
            stemWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            stemWebView.setScaleButtonsVisible(false);
            stemWebView.setPageFinishListener(new C4700a0(stemWebView, c5961g, ref$ObjectRef, c5098c));
            ref$ObjectRef.element = stemWebView;
            FrameLayout frameLayout = c5098c.f8029b;
            frameLayout.removeAllViews();
            frameLayout.addView(stemWebView);
            c5961g.mo4966m(new C3327b(1, ref$ObjectRef, c5098c));
            stemWebView.post(new RunnableC3379a0(5, stemWebView, str));
            Object objM5583t = c5961g.m5583t();
            return objM5583t == coroutineSingletons ? coroutineSingletons : objM5583t;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Bitmap> interfaceC5631c) {
            return ((C50951) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialImageResolver$captureWebToFile$bitmap$1(C5098c c5098c, String str, InterfaceC5631c<? super AskMaterialImageResolver$captureWebToFile$bitmap$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c5098c;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AskMaterialImageResolver$captureWebToFile$bitmap$1(this.this$0, this.$url, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        C50951 c50951 = new C50951(this.this$0, this.$url, null);
        this.label = 1;
        Object objM5627G = AbstractC6014x.m5627G(10000L, c50951, this);
        return objM5627G == coroutineSingletons ? coroutineSingletons : objM5627G;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super Bitmap> interfaceC5631c) {
        return ((AskMaterialImageResolver$captureWebToFile$bitmap$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
