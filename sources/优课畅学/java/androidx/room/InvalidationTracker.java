package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.support.AutoCloser;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9112b0;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public class InvalidationTracker {
    public static final Companion Companion = new Companion(null);
    private AutoCloser autoCloser;
    private final RoomDatabase database;
    private final TriggerBasedInvalidationTracker implementation;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private Intent multiInstanceInvalidationIntent;
    private final Map<Observer, ObserverWrapper> observerMap;
    private final ReentrantLock observerMapLock;
    private final InterfaceC10559a onRefreshCompleted;
    private final InterfaceC10559a onRefreshScheduled;
    private final Map<String, String> shadowTablesMap;
    private final String[] tableNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class MultiInstanceClientInitState {
        private final Context context;
        private final String name;
        private final Intent serviceIntent;

        public MultiInstanceClientInitState(Context context, String name, Intent serviceIntent) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(serviceIntent, "serviceIntent");
            this.context = context;
            this.name = name;
            this.serviceIntent = serviceIntent;
        }

        public static /* synthetic */ MultiInstanceClientInitState copy$default(MultiInstanceClientInitState multiInstanceClientInitState, Context context, String str, Intent intent, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = multiInstanceClientInitState.context;
            }
            if ((i10 & 2) != 0) {
                str = multiInstanceClientInitState.name;
            }
            if ((i10 & 4) != 0) {
                intent = multiInstanceClientInitState.serviceIntent;
            }
            return multiInstanceClientInitState.copy(context, str, intent);
        }

        public final Context component1() {
            return this.context;
        }

        public final String component2() {
            return this.name;
        }

        public final Intent component3() {
            return this.serviceIntent;
        }

        public final MultiInstanceClientInitState copy(Context context, String name, Intent serviceIntent) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(name, "name");
            AbstractC9133u.m16133g(serviceIntent, "serviceIntent");
            return new MultiInstanceClientInitState(context, name, serviceIntent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiInstanceClientInitState)) {
                return false;
            }
            MultiInstanceClientInitState multiInstanceClientInitState = (MultiInstanceClientInitState) obj;
            return AbstractC9133u.m16128b(this.context, multiInstanceClientInitState.context) && AbstractC9133u.m16128b(this.name, multiInstanceClientInitState.name) && AbstractC9133u.m16128b(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getName() {
            return this.name;
        }

        public final Intent getServiceIntent() {
            return this.serviceIntent;
        }

        public int hashCode() {
            return (((this.context.hashCode() * 31) + this.name.hashCode()) * 31) + this.serviceIntent.hashCode();
        }

        public String toString() {
            return "MultiInstanceClientInitState(context=" + this.context + ", name=" + this.name + ", serviceIntent=" + this.serviceIntent + ')';
        }
    }

    public static abstract class Observer {
        private final String[] tables;

        public Observer(String[] tables) {
            AbstractC9133u.m16133g(tables, "tables");
            this.tables = tables;
        }

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        public Observer(String firstTable, String... rest) {
            AbstractC9133u.m16133g(firstTable, "firstTable");
            AbstractC9133u.m16133g(rest, "rest");
            C9112b0 c9112b0 = new C9112b0(2);
            c9112b0.m16088a(firstTable);
            c9112b0.m16089b(rest);
            this((String[]) c9112b0.m16091d(new String[c9112b0.m16090c()]));
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.InvalidationTracker$addObserver$1", m17801f = "InvalidationTracker.android.kt", m17802l = {253}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.InvalidationTracker$addObserver$1 */
    public static final class C45151 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C45151(InterfaceC9324c<? super C45151> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return InvalidationTracker.this.new C45151(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C45151) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = InvalidationTracker.this.implementation;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.InvalidationTracker$refreshVersionsSync$1", m17801f = "InvalidationTracker.android.kt", m17802l = {345}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.InvalidationTracker$refreshVersionsSync$1 */
    public static final class C45161 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C45161(InterfaceC9324c<? super C45161> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return InvalidationTracker.this.new C45161(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C45161) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC10559a interfaceC10559a = InvalidationTracker.this.onRefreshScheduled;
                InterfaceC10559a interfaceC10559a2 = InvalidationTracker.this.onRefreshCompleted;
                this.label = 1;
                if (InvalidationTracker.this.implementation.refreshInvalidation$room_runtime_release(new String[0], interfaceC10559a, interfaceC10559a2, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.InvalidationTracker$removeObserver$1", m17801f = "InvalidationTracker.android.kt", m17802l = {310}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.InvalidationTracker$removeObserver$1 */
    public static final class C45171 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C45171(InterfaceC9324c<? super C45171> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return InvalidationTracker.this.new C45171(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C45171) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = InvalidationTracker.this.implementation;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        AbstractC9133u.m16133g(database, "database");
        AbstractC9133u.m16133g(shadowTablesMap, "shadowTablesMap");
        AbstractC9133u.m16133g(viewTables, "viewTables");
        AbstractC9133u.m16133g(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable$room_runtime_release(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new InterfaceC10559a() { // from class: androidx.room.f
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return InvalidationTracker.onRefreshScheduled$lambda$0(this.f1905a);
            }
        };
        this.onRefreshCompleted = new InterfaceC10559a() { // from class: androidx.room.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return InvalidationTracker.onRefreshCompleted$lambda$1(this.f1906a);
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.setOnAllowRefresh$room_runtime_release(new InterfaceC10559a() { // from class: androidx.room.h
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return Boolean.valueOf(InvalidationTracker._init_$lambda$2(this.f1907a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.inCompatibilityMode$room_runtime_release() || invalidationTracker.database.isOpenInternal();
    }

    private final boolean addObserverOnly(Observer observer) {
        Pair<String[], int[]> pairValidateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(observer.getTables$room_runtime_release());
        String[] strArr = (String[]) pairValidateTableNames$room_runtime_release.m15903a();
        int[] iArr = (int[]) pairValidateTableNames$room_runtime_release.m15904b();
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArr);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapperPut = this.observerMap.containsKey(observer) ? (ObserverWrapper) AbstractC9080a.m15944i(this.observerMap, observer) : this.observerMap.put(observer, observerWrapper);
            reentrantLock.unlock();
            return observerWrapperPut == null && this.implementation.onObserverAdded$room_runtime_release(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ InterfaceC9266c createFlow$default(InvalidationTracker invalidationTracker, String[] strArr, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return invalidationTracker.createFlow(strArr, z10);
    }

    private final List<Observer> getAllObservers() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return AbstractC8778f0.m14544U0(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInvalidatedObservers(Set<Integer> set) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listM14544U0 = AbstractC8778f0.m14544U0(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listM14544U0.iterator();
            while (it.hasNext()) {
                ((ObserverWrapper) it.next()).notifyByTableIds$room_runtime_release(set);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    List<Observer> allObservers = getAllObservers();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : allObservers) {
                        if (!((Observer) obj).isRemote$room_runtime_release()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        multiInstanceInvalidationClient.stop();
                    }
                }
                this.implementation.resetSync$room_runtime_release();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p onRefreshCompleted$lambda$1(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.decrementCountAndScheduleClose();
        }
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p onRefreshScheduled$lambda$0(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        return C8736p.f16368a;
    }

    private final boolean removeObserverOnly(Observer observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapperRemove = this.observerMap.remove(observer);
            return observerWrapperRemove != null && this.implementation.onObserverRemoved$room_runtime_release(observerWrapperRemove.getTableIds$room_runtime_release());
        } finally {
            reentrantLock.unlock();
        }
    }

    @WorkerThread
    public void addObserver(Observer observer) {
        AbstractC9133u.m16133g(observer, "observer");
        if (addObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C45151(null));
        }
    }

    public final void addRemoteObserver$room_runtime_release(Observer observer) {
        AbstractC9133u.m16133g(observer, "observer");
        if (!observer.isRemote$room_runtime_release()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        addObserverOnly(observer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void addWeakObserver(Observer observer) {
        AbstractC9133u.m16133g(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    public final InterfaceC9266c createFlow(String... tables) {
        AbstractC9133u.m16133g(tables, "tables");
        return createFlow$default(this, tables, false, 2, null);
    }

    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, Callable<T> computeFunction) {
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, (Callable) computeFunction);
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final String[] getTableNames$room_runtime_release() {
        return this.tableNames;
    }

    public final void initMultiInstanceInvalidation$room_runtime_release(Context context, String name, Intent serviceIntent) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, this);
    }

    public final void internalInit$room_runtime_release(SQLiteConnection connection) {
        AbstractC9133u.m16133g(connection, "connection");
        this.implementation.configureConnection(connection);
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.start(intent);
                    C8736p c8736p = C8736p.f16368a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime_release(Set<String> tables) {
        AbstractC9133u.m16133g(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> listM14544U0 = AbstractC8778f0.m14544U0(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : listM14544U0) {
                if (!observerWrapper.getObserver$room_runtime_release().isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Object refresh(String[] strArr, InterfaceC9324c<? super Boolean> interfaceC9324c) {
        return this.implementation.refreshInvalidation$room_runtime_release(strArr, this.onRefreshScheduled, this.onRefreshCompleted, interfaceC9324c);
    }

    public final void refreshAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime_release(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime_release(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C45161(null));
    }

    @WorkerThread
    public void removeObserver(Observer observer) {
        AbstractC9133u.m16133g(observer, "observer");
        if (removeObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C45171(null));
        }
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        AbstractC9133u.m16133g(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new InvalidationTracker$setAutoCloser$1(this));
    }

    public final void stop$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
    }

    public final Object sync$room_runtime_release(InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        if (this.database.inCompatibilityMode$room_runtime_release() && !this.database.isOpenInternal()) {
            return C8736p.f16368a;
        }
        Object objSyncTriggers$room_runtime_release = this.implementation.syncTriggers$room_runtime_release(interfaceC9324c);
        return objSyncTriggers$room_runtime_release == AbstractC9434a.m17291f() ? objSyncTriggers$room_runtime_release : C8736p.f16368a;
    }

    @WorkerThread
    public final void syncBlocking$room_runtime_release() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$syncBlocking$1(this, null));
    }

    public final InterfaceC9266c createFlow(String[] tables, boolean z10) {
        AbstractC9133u.m16133g(tables, "tables");
        Pair<String[], int[]> pairValidateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(tables);
        String[] strArr = (String[]) pairValidateTableNames$room_runtime_release.m15903a();
        InterfaceC9266c interfaceC9266cCreateFlow$room_runtime_release = this.implementation.createFlow$room_runtime_release(strArr, (int[]) pairValidateTableNames$room_runtime_release.m15904b(), z10);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        InterfaceC9266c interfaceC9266cCreateFlow = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.createFlow(strArr) : null;
        return interfaceC9266cCreateFlow != null ? AbstractC9268e.m16998J(interfaceC9266cCreateFlow$room_runtime_release, interfaceC9266cCreateFlow) : interfaceC9266cCreateFlow$room_runtime_release;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime_release(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, z10, computeFunction);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final <T> LiveData<T> createLiveData(String[] tableNames, boolean z10, InterfaceC10570l computeFunction) {
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime_release(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, z10, computeFunction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, String... tableNames) {
        this(database, AbstractC9080a.m15943h(), AbstractC9080a.m15943h(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        AbstractC9133u.m16133g(database, "database");
        AbstractC9133u.m16133g(tableNames, "tableNames");
    }
}
