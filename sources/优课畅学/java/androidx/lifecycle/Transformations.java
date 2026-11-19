package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class Transformations {

    /* renamed from: androidx.lifecycle.Transformations$switchMap$2 */
    public static final class C40502 implements Observer {
        final /* synthetic */ MediatorLiveData $result;
        final /* synthetic */ Function $switchMapFunction;
        private LiveData liveData;

        public C40502(Function function, MediatorLiveData mediatorLiveData) {
            this.$switchMapFunction = function;
            this.$result = mediatorLiveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8736p onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return C8736p.f16368a;
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
                AbstractC9133u.m16130d(liveData2);
                mediatorLiveData.removeSource(liveData2);
            }
            this.liveData = liveData;
            if (liveData != null) {
                MediatorLiveData mediatorLiveData2 = this.$result;
                AbstractC9133u.m16130d(liveData);
                final MediatorLiveData mediatorLiveData3 = this.$result;
                mediatorLiveData2.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.s
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj2) {
                        return Transformations.C40502.onChanged$lambda$0(mediatorLiveData3, obj2);
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
        AbstractC9133u.m16133g(liveData, "<this>");
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f17469a = true;
        if (liveData.isInitialized()) {
            ref$BooleanRef.f17469a = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Transformations.distinctUntilChanged$lambda$4(mediatorLiveData, ref$BooleanRef, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p distinctUntilChanged$lambda$4(MediatorLiveData mediatorLiveData, Ref$BooleanRef ref$BooleanRef, Object obj) {
        T value = mediatorLiveData.getValue();
        if (ref$BooleanRef.f17469a || ((value == 0 && obj != null) || (value != 0 && !AbstractC9133u.m16128b(value, obj)))) {
            ref$BooleanRef.f17469a = false;
            mediatorLiveData.setValue(obj);
        }
        return C8736p.f16368a;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, final InterfaceC10570l transform) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        final MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(transform.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.o
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$0(mediatorLiveData, transform, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p map$lambda$0(MediatorLiveData mediatorLiveData, InterfaceC10570l interfaceC10570l, Object obj) {
        mediatorLiveData.setValue(interfaceC10570l.invoke(obj));
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p map$lambda$1(MediatorLiveData mediatorLiveData, Function function, Object obj) {
        mediatorLiveData.setValue(function.apply(obj));
        return C8736p.f16368a;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final InterfaceC10570l transform) {
        LiveData liveData2;
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final MediatorLiveData mediatorLiveData = (liveData.isInitialized() && (liveData2 = (LiveData) transform.invoke(liveData.getValue())) != null && liveData2.isInitialized()) ? new MediatorLiveData(liveData2.getValue()) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.n
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Transformations.switchMap$lambda$3(transform, ref$ObjectRef, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p switchMap$lambda$3(InterfaceC10570l interfaceC10570l, Ref$ObjectRef ref$ObjectRef, final MediatorLiveData mediatorLiveData, Object obj) {
        LiveData liveData = (LiveData) interfaceC10570l.invoke(obj);
        Object obj2 = ref$ObjectRef.f17473a;
        if (obj2 != liveData) {
            if (obj2 != null) {
                AbstractC9133u.m16130d(obj2);
                mediatorLiveData.removeSource((LiveData) obj2);
            }
            ref$ObjectRef.f17473a = liveData;
            if (liveData != null) {
                AbstractC9133u.m16130d(liveData);
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.r
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj3) {
                        return Transformations.switchMap$lambda$3$lambda$2(mediatorLiveData, obj3);
                    }
                }));
            }
        }
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p switchMap$lambda$3$lambda$2(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return C8736p.f16368a;
    }

    @CheckResult
    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, final Function mapFunction) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(mapFunction, "mapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new InterfaceC10570l() { // from class: androidx.lifecycle.q
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$1(mediatorLiveData, mapFunction, obj);
            }
        }));
        return mediatorLiveData;
    }

    @CheckResult
    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function switchMapFunction) {
        AbstractC9133u.m16133g(liveData, "<this>");
        AbstractC9133u.m16133g(switchMapFunction, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C40502(switchMapFunction, mediatorLiveData));
        return mediatorLiveData;
    }
}
