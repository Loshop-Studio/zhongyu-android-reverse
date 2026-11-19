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
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9958b0;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

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
    private final InterfaceC9529a onRefreshCompleted;
    private final InterfaceC9529a onRefreshScheduled;
    private final Map<String, String> shadowTablesMap;
    private final String[] tableNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(serviceIntent, "serviceIntent");
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
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(name, "name");
            AbstractC9979u.m20294g(serviceIntent, "serviceIntent");
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
            return AbstractC9979u.m20289b(this.context, multiInstanceClientInitState.context) && AbstractC9979u.m20289b(this.name, multiInstanceClientInitState.name) && AbstractC9979u.m20289b(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
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
            AbstractC9979u.m20294g(tables, "tables");
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
            AbstractC9979u.m20294g(firstTable, "firstTable");
            AbstractC9979u.m20294g(rest, "rest");
            C9958b0 c9958b0 = new C9958b0(2);
            c9958b0.m20246a(firstTable);
            c9958b0.m20247b(rest);
            this((String[]) c9958b0.m20249d(new String[c9958b0.m20248c()]));
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.InvalidationTracker$addObserver$1", m26211f = "InvalidationTracker.android.kt", m26212l = {253}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.InvalidationTracker$addObserver$1 */
    public static final class C44631 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C44631(InterfaceC11588c<? super C44631> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return InvalidationTracker.this.new C44631(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = InvalidationTracker.this.implementation;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44631) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.InvalidationTracker$refreshVersionsSync$1", m26211f = "InvalidationTracker.android.kt", m26212l = {345}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.InvalidationTracker$refreshVersionsSync$1 */
    public static final class C44641 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C44641(InterfaceC11588c<? super C44641> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return InvalidationTracker.this.new C44641(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC9529a interfaceC9529a = InvalidationTracker.this.onRefreshScheduled;
                InterfaceC9529a interfaceC9529a2 = InvalidationTracker.this.onRefreshCompleted;
                this.label = 1;
                if (InvalidationTracker.this.implementation.refreshInvalidation$room_runtime_release(new String[0], interfaceC9529a, interfaceC9529a2, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44641) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.InvalidationTracker$removeObserver$1", m26211f = "InvalidationTracker.android.kt", m26212l = {310}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.InvalidationTracker$removeObserver$1 */
    public static final class C44651 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C44651(InterfaceC11588c<? super C44651> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return InvalidationTracker.this.new C44651(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = InvalidationTracker.this.implementation;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44651) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        AbstractC9979u.m20294g(database, "database");
        AbstractC9979u.m20294g(shadowTablesMap, "shadowTablesMap");
        AbstractC9979u.m20294g(viewTables, "viewTables");
        AbstractC9979u.m20294g(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable$room_runtime_release(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new InterfaceC9529a() { // from class: androidx.room.f
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return InvalidationTracker.onRefreshScheduled$lambda$0(this.f2019c);
            }
        };
        this.onRefreshCompleted = new InterfaceC9529a() { // from class: androidx.room.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return InvalidationTracker.onRefreshCompleted$lambda$1(this.f2020c);
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.setOnAllowRefresh$room_runtime_release(new InterfaceC9529a() { // from class: androidx.room.h
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Boolean.valueOf(InvalidationTracker._init_$lambda$2(this.f2021c));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.inCompatibilityMode$room_runtime_release() || invalidationTracker.database.isOpenInternal();
    }

    private final boolean addObserverOnly(Observer observer) {
        Pair<String[], int[]> pairValidateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(observer.getTables$room_runtime_release());
        String[] strArr = (String[]) pairValidateTableNames$room_runtime_release.m20048a();
        int[] iArr = (int[]) pairValidateTableNames$room_runtime_release.m20049c();
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArr);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapperPut = this.observerMap.containsKey(observer) ? (ObserverWrapper) AbstractC9925a.m20089i(this.observerMap, observer) : this.observerMap.put(observer, observerWrapper);
            reentrantLock.unlock();
            return observerWrapperPut == null && this.implementation.onObserverAdded$room_runtime_release(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ InterfaceC11594c createFlow$default(InvalidationTracker invalidationTracker, String[] strArr, boolean z10, int i10, Object obj) {
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
            return AbstractC10947g0.m23922X0(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInvalidatedObservers(Set<Integer> set) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listM23922X0 = AbstractC10947g0.m23922X0(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listM23922X0.iterator();
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
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q onRefreshCompleted$lambda$1(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.decrementCountAndScheduleClose();
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q onRefreshScheduled$lambda$0(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        return C10786q.f26013a;
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
        AbstractC9979u.m20294g(observer, "observer");
        if (addObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C44631(null));
        }
    }

    public final void addRemoteObserver$room_runtime_release(Observer observer) {
        AbstractC9979u.m20294g(observer, "observer");
        if (!observer.isRemote$room_runtime_release()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        addObserverOnly(observer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void addWeakObserver(Observer observer) {
        AbstractC9979u.m20294g(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    public final InterfaceC11594c createFlow(String... tables) {
        AbstractC9979u.m20294g(tables, "tables");
        return createFlow$default(this, tables, false, 2, null);
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, Callable<T> computeFunction) {
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, (Callable) computeFunction);
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final String[] getTableNames$room_runtime_release() {
        return this.tableNames;
    }

    public final void initMultiInstanceInvalidation$room_runtime_release(Context context, String name, Intent serviceIntent) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, this);
    }

    public final void internalInit$room_runtime_release(SQLiteConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
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
                    C10786q c10786q = C10786q.f26013a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime_release(Set<String> tables) {
        AbstractC9979u.m20294g(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> listM23922X0 = AbstractC10947g0.m23922X0(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : listM23922X0) {
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
    public final Object refresh(String[] strArr, InterfaceC11588c<? super Boolean> interfaceC11588c) {
        return this.implementation.refreshInvalidation$room_runtime_release(strArr, this.onRefreshScheduled, this.onRefreshCompleted, interfaceC11588c);
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
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C44641(null));
    }

    @WorkerThread
    public void removeObserver(Observer observer) {
        AbstractC9979u.m20294g(observer, "observer");
        if (removeObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C44651(null));
        }
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        AbstractC9979u.m20294g(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new InvalidationTracker$setAutoCloser$1(this));
    }

    public final void stop$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
    }

    public final Object sync$room_runtime_release(InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        if (this.database.inCompatibilityMode$room_runtime_release() && !this.database.isOpenInternal()) {
            return C10786q.f26013a;
        }
        Object objSyncTriggers$room_runtime_release = this.implementation.syncTriggers$room_runtime_release(interfaceC11588c);
        return objSyncTriggers$room_runtime_release == AbstractC11725a.m25952f() ? objSyncTriggers$room_runtime_release : C10786q.f26013a;
    }

    @WorkerThread
    public final void syncBlocking$room_runtime_release() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$syncBlocking$1(this, null));
    }

    public final InterfaceC11594c createFlow(String[] tables, boolean z10) {
        AbstractC9979u.m20294g(tables, "tables");
        Pair<String[], int[]> pairValidateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(tables);
        String[] strArr = (String[]) pairValidateTableNames$room_runtime_release.m20048a();
        InterfaceC11594c interfaceC11594cCreateFlow$room_runtime_release = this.implementation.createFlow$room_runtime_release(strArr, (int[]) pairValidateTableNames$room_runtime_release.m20049c(), z10);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        InterfaceC11594c interfaceC11594cCreateFlow = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.createFlow(strArr) : null;
        return interfaceC11594cCreateFlow != null ? AbstractC11596e.m25538I(interfaceC11594cCreateFlow$room_runtime_release, interfaceC11594cCreateFlow) : interfaceC11594cCreateFlow$room_runtime_release;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime_release(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, z10, computeFunction);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final <T> LiveData<T> createLiveData(String[] tableNames, boolean z10, InterfaceC9540l computeFunction) {
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime_release(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, z10, computeFunction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, String... tableNames) {
        this(database, AbstractC9925a.m20088h(), AbstractC9925a.m20088h(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        AbstractC9979u.m20294g(database, "database");
        AbstractC9979u.m20294g(tableNames, "tableNames");
    }
}
