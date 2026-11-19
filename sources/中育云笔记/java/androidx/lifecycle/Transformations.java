package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class Transformations {

    /* renamed from: androidx.lifecycle.Transformations$switchMap$2 */
    public static final class C39242 implements Observer {
        final /* synthetic */ MediatorLiveData $result;
        final /* synthetic */ Function $switchMapFunction;
        private LiveData liveData;

        public C39242(Function function, MediatorLiveData mediatorLiveData) {
            this.$switchMapFunction = function;
            this.$result = mediatorLiveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return C10786q.f26013a;
        }

        public final LiveData getLiveData() {
            return this.liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            LiveData liveData = (LiveData) this.$switchMapFunction.apply(obj);
            LiveData liveData2 = this.liveData;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                MediatorLiveData mediatorLiveData = this.$result;
                AbstractC9979u.m20291d(liveData2);
                mediatorLiveData.removeSource(liveData2);
            }
            this.liveData = liveData;
            if (liveData != null) {
                MediatorLiveData mediatorLiveData2 = this.$result;
                AbstractC9979u.m20291d(liveData);
                final MediatorLiveData mediatorLiveData3 = this.$result;
                mediatorLiveData2.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.s
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj2) {
                        return Transformations.C39242.onChanged$lambda$0(mediatorLiveData3, obj2);
                    }
                }));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.liveData = liveData;
        }
    }

    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        final MediatorLiveData mediatorLiveData;
        AbstractC9979u.m20294g(liveData, "<this>");
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f23398c = true;
        if (liveData.isInitialized()) {
            ref$BooleanRef.f23398c = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Transformations.distinctUntilChanged$lambda$4(mediatorLiveData, ref$BooleanRef, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q distinctUntilChanged$lambda$4(MediatorLiveData mediatorLiveData, Ref$BooleanRef ref$BooleanRef, Object obj) {
        T value = mediatorLiveData.getValue();
        if (ref$BooleanRef.f23398c || ((value == 0 && obj != null) || (value != 0 && !AbstractC9979u.m20289b(value, obj)))) {
            ref$BooleanRef.f23398c = false;
            mediatorLiveData.setValue(obj);
        }
        return C10786q.f26013a;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, final InterfaceC9540l transform) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        final MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(transform.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$0(mediatorLiveData, transform, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q map$lambda$0(MediatorLiveData mediatorLiveData, InterfaceC9540l interfaceC9540l, Object obj) {
        mediatorLiveData.setValue(interfaceC9540l.invoke(obj));
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q map$lambda$1(MediatorLiveData mediatorLiveData, Function function, Object obj) {
        mediatorLiveData.setValue(function.apply(obj));
        return C10786q.f26013a;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final InterfaceC9540l transform) {
        LiveData liveData2;
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final MediatorLiveData mediatorLiveData = (liveData.isInitialized() && (liveData2 = (LiveData) transform.invoke(liveData.getValue())) != null && liveData2.isInitialized()) ? new MediatorLiveData(liveData2.getValue()) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.n
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Transformations.switchMap$lambda$3(transform, ref$ObjectRef, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q switchMap$lambda$3(InterfaceC9540l interfaceC9540l, Ref$ObjectRef ref$ObjectRef, final MediatorLiveData mediatorLiveData, Object obj) {
        LiveData liveData = (LiveData) interfaceC9540l.invoke(obj);
        Object obj2 = ref$ObjectRef.f23402c;
        if (obj2 != liveData) {
            if (obj2 != null) {
                AbstractC9979u.m20291d(obj2);
                mediatorLiveData.removeSource((LiveData) obj2);
            }
            ref$ObjectRef.f23402c = liveData;
            if (liveData != null) {
                AbstractC9979u.m20291d(liveData);
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.r
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj3) {
                        return Transformations.switchMap$lambda$3$lambda$2(mediatorLiveData, obj3);
                    }
                }));
            }
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q switchMap$lambda$3$lambda$2(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return C10786q.f26013a;
    }

    @CheckResult
    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, final Function mapFunction) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(mapFunction, "mapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC9540l() { // from class: androidx.lifecycle.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$1(mediatorLiveData, mapFunction, obj);
            }
        }));
        return mediatorLiveData;
    }

    @CheckResult
    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function switchMapFunction) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(switchMapFunction, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C39242(switchMapFunction, mediatorLiveData));
        return mediatorLiveData;
    }
}
