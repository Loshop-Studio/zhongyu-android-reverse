package cn.com.techvision.launchercore.internal;

import io.reactivex.Flowable;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LauncherFlow {

    /* renamed from: b */
    public static final C4535a f1394b = new C4535a(null);

    /* renamed from: c */
    public static final Lazy f1395c = LazyKt.lazy(new Function0<LauncherFlow>() { // from class: cn.com.techvision.launchercore.internal.LauncherFlow$Companion$mLauncherFlow$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LauncherFlow invoke() {
            return new LauncherFlow();
        }
    });

    /* renamed from: a */
    public final FlowableProcessor f1396a;

    /* renamed from: cn.com.techvision.launchercore.internal.LauncherFlow$a */
    public static final class C4535a {
        public /* synthetic */ C4535a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LauncherFlow m1607a() {
            return (LauncherFlow) LauncherFlow.f1395c.getValue();
        }

        public C4535a() {
        }
    }

    /* renamed from: cn.com.techvision.launchercore.internal.LauncherFlow$b */
    public static final class C4536b {

        /* renamed from: a */
        public final boolean f1398a;

        public C4536b(boolean z6) {
            this.f1398a = z6;
        }
    }

    public LauncherFlow() {
        FlowableProcessor<T> serialized = PublishProcessor.create().toSerialized();
        Intrinsics.checkNotNullExpressionValue(serialized, "create<T>().toSerialized()");
        this.f1396a = serialized;
    }

    /* renamed from: b */
    public final boolean m1603b() {
        return this.f1396a.hasSubscribers();
    }

    /* renamed from: c */
    public final void m1604c(Object obj) {
        if (m1603b()) {
            new SerializedSubscriber(this.f1396a).onNext(obj);
        }
    }

    /* renamed from: d */
    public final Flowable m1605d(Class aClass) {
        Intrinsics.checkNotNullParameter(aClass, "aClass");
        Flowable flowableOnBackpressureLatest = this.f1396a.ofType(aClass).onBackpressureBuffer(256).onBackpressureLatest();
        Intrinsics.checkNotNullExpressionValue(flowableOnBackpressureLatest, "mBus.ofType(aClass).onBa…6).onBackpressureLatest()");
        return flowableOnBackpressureLatest;
    }
}
