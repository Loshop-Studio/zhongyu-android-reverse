package p244s6;

import ba.InterfaceC5217a;
import ba.InterfaceC5218b;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import java.util.concurrent.TimeUnit;
import p100f7.AbstractC8462a;
import p112g7.AbstractC8655a;
import p277v6.InterfaceC10250b;
import p288w6.AbstractC10359a;
import p299x6.InterfaceC10553a;
import p299x6.InterfaceC10555c;
import p321z6.AbstractC10725a;
import p321z6.AbstractC10726b;

/* renamed from: s6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10045b implements InterfaceC5217a {

    /* renamed from: a */
    public static final int f20089a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: b */
    public static int m18740b() {
        return f20089a;
    }

    /* renamed from: c */
    public static AbstractC10045b m18741c(InterfaceC10047d interfaceC10047d, BackpressureStrategy backpressureStrategy) {
        AbstractC10726b.m20030c(interfaceC10047d, "source is null");
        AbstractC10726b.m20030c(backpressureStrategy, "mode is null");
        return AbstractC8462a.m13799i(new FlowableCreate(interfaceC10047d, backpressureStrategy));
    }

    /* renamed from: d */
    public static AbstractC10045b m18742d(long j10, long j11, TimeUnit timeUnit, AbstractC10049f abstractC10049f) {
        AbstractC10726b.m20030c(timeUnit, "unit is null");
        AbstractC10726b.m20030c(abstractC10049f, "scheduler is null");
        return AbstractC8462a.m13799i(new FlowableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, abstractC10049f));
    }

    /* renamed from: e */
    public static AbstractC10045b m18743e(long j10, TimeUnit timeUnit) {
        return m18742d(j10, j10, timeUnit, AbstractC8655a.m13933a());
    }

    /* renamed from: n */
    public static AbstractC10045b m18744n(long j10, TimeUnit timeUnit) {
        return m18745o(j10, timeUnit, AbstractC8655a.m13933a());
    }

    /* renamed from: o */
    public static AbstractC10045b m18745o(long j10, TimeUnit timeUnit, AbstractC10049f abstractC10049f) {
        AbstractC10726b.m20030c(timeUnit, "unit is null");
        AbstractC10726b.m20030c(abstractC10049f, "scheduler is null");
        return AbstractC8462a.m13799i(new FlowableTimer(Math.max(0L, j10), timeUnit, abstractC10049f));
    }

    @Override // ba.InterfaceC5217a
    /* renamed from: a */
    public final void mo2110a(InterfaceC5218b interfaceC5218b) {
        if (interfaceC5218b instanceof InterfaceC10048e) {
            m18750j((InterfaceC10048e) interfaceC5218b);
        } else {
            AbstractC10726b.m20030c(interfaceC5218b, "s is null");
            m18750j(new StrictSubscriber(interfaceC5218b));
        }
    }

    /* renamed from: f */
    public final AbstractC10045b m18746f(AbstractC10049f abstractC10049f) {
        return m18747g(abstractC10049f, false, m18740b());
    }

    /* renamed from: g */
    public final AbstractC10045b m18747g(AbstractC10049f abstractC10049f, boolean z10, int i10) {
        AbstractC10726b.m20030c(abstractC10049f, "scheduler is null");
        AbstractC10726b.m20031d(i10, "bufferSize");
        return AbstractC8462a.m13799i(new FlowableObserveOn(this, abstractC10049f, z10, i10));
    }

    /* renamed from: h */
    public final InterfaceC10250b m18748h(InterfaceC10555c interfaceC10555c) {
        return m18749i(interfaceC10555c, AbstractC10725a.f21273f, AbstractC10725a.f21270c, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    /* renamed from: i */
    public final InterfaceC10250b m18749i(InterfaceC10555c interfaceC10555c, InterfaceC10555c interfaceC10555c2, InterfaceC10553a interfaceC10553a, InterfaceC10555c interfaceC10555c3) {
        AbstractC10726b.m20030c(interfaceC10555c, "onNext is null");
        AbstractC10726b.m20030c(interfaceC10555c2, "onError is null");
        AbstractC10726b.m20030c(interfaceC10553a, "onComplete is null");
        AbstractC10726b.m20030c(interfaceC10555c3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(interfaceC10555c, interfaceC10555c2, interfaceC10553a, interfaceC10555c3);
        m18750j(lambdaSubscriber);
        return lambdaSubscriber;
    }

    /* renamed from: j */
    public final void m18750j(InterfaceC10048e interfaceC10048e) {
        AbstractC10726b.m20030c(interfaceC10048e, "s is null");
        try {
            InterfaceC5218b interfaceC5218bM13804n = AbstractC8462a.m13804n(this, interfaceC10048e);
            AbstractC10726b.m20030c(interfaceC5218bM13804n, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo15536k(interfaceC5218bM13804n);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            AbstractC10359a.m19297b(th);
            AbstractC8462a.m13801k(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: k */
    public abstract void mo15536k(InterfaceC5218b interfaceC5218b);

    /* renamed from: l */
    public final AbstractC10045b m18751l(AbstractC10049f abstractC10049f) {
        AbstractC10726b.m20030c(abstractC10049f, "scheduler is null");
        return m18752m(abstractC10049f, !(this instanceof FlowableCreate));
    }

    /* renamed from: m */
    public final AbstractC10045b m18752m(AbstractC10049f abstractC10049f, boolean z10) {
        AbstractC10726b.m20030c(abstractC10049f, "scheduler is null");
        return AbstractC8462a.m13799i(new FlowableSubscribeOn(this, abstractC10049f, z10));
    }
}
