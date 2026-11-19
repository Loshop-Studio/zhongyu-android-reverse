package com.jeremyliao.liveeventbus.core;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ExternalLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.jeremyliao.liveeventbus.ipc.consts.IpcConst;
import com.jeremyliao.liveeventbus.ipc.core.ProcessorManager;
import com.jeremyliao.liveeventbus.ipc.receiver.LebIpcReceiver;
import com.jeremyliao.liveeventbus.logger.DefaultLogger;
import com.jeremyliao.liveeventbus.logger.Logger;
import com.jeremyliao.liveeventbus.logger.LoggerManager;
import com.jeremyliao.liveeventbus.utils.AppUtils;
import com.jeremyliao.liveeventbus.utils.ThreadUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class LiveEventBusCore {
    private boolean autoClear;
    private final Map<String, LiveEvent<Object>> bus;
    private final Config config;
    final InnerConsole console;
    private boolean isRegisterReceiver;
    private boolean lifecycleObserverAlwaysActive;
    private LoggerManager logger;
    private final Map<String, ObservableConfig> observableConfigs;
    private LebIpcReceiver receiver;

    public class InnerConsole {
        public InnerConsole() {
        }

        private int getActiveCount(LiveData liveData) throws NoSuchFieldException, SecurityException {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mActiveCount");
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(liveData)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int getObserverCount(LiveData liveData) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(liveData);
                Method declaredMethod = obj.getClass().getDeclaredMethod("size", null);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(obj, null)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private String getObserverInfo(LiveData liveData) throws NoSuchFieldException, SecurityException {
            try {
                Field declaredField = LiveData.class.getDeclaredField("mObservers");
                declaredField.setAccessible(true);
                return declaredField.get(liveData).toString();
            } catch (Exception unused) {
                return "";
            }
        }

        public String getBaseInfo() {
            return "lifecycleObserverAlwaysActive: " + LiveEventBusCore.this.lifecycleObserverAlwaysActive + SignParameters.NEW_LINE + "autoClear: " + LiveEventBusCore.this.autoClear + SignParameters.NEW_LINE + "logger enable: " + LiveEventBusCore.this.logger.isEnable() + SignParameters.NEW_LINE + "logger: " + LiveEventBusCore.this.logger.getLogger() + SignParameters.NEW_LINE + "Receiver register: " + LiveEventBusCore.this.isRegisterReceiver + SignParameters.NEW_LINE + "Application: " + AppUtils.getApp() + SignParameters.NEW_LINE;
        }

        public String getBusInfo() {
            StringBuilder sb2 = new StringBuilder();
            for (String str : LiveEventBusCore.this.bus.keySet()) {
                sb2.append("Event name: " + str);
                sb2.append(SignParameters.NEW_LINE);
                LiveEvent.LifecycleLiveData lifecycleLiveData = ((LiveEvent) LiveEventBusCore.this.bus.get(str)).liveData;
                sb2.append("\tversion: " + lifecycleLiveData.getVersion());
                sb2.append(SignParameters.NEW_LINE);
                sb2.append("\thasActiveObservers: " + lifecycleLiveData.hasActiveObservers());
                sb2.append(SignParameters.NEW_LINE);
                sb2.append("\thasObservers: " + lifecycleLiveData.hasObservers());
                sb2.append(SignParameters.NEW_LINE);
                sb2.append("\tActiveCount: " + getActiveCount(lifecycleLiveData));
                sb2.append(SignParameters.NEW_LINE);
                sb2.append("\tObserverCount: " + getObserverCount(lifecycleLiveData));
                sb2.append(SignParameters.NEW_LINE);
                sb2.append("\tObservers: ");
                sb2.append(SignParameters.NEW_LINE);
                sb2.append("\t\t" + getObserverInfo(lifecycleLiveData));
                sb2.append(SignParameters.NEW_LINE);
            }
            return sb2.toString();
        }

        public String getConsoleInfo() {
            return "*********Base info*********" + SignParameters.NEW_LINE + getBaseInfo() + "*********Event info*********" + SignParameters.NEW_LINE + getBusInfo();
        }
    }

    public class LiveEvent<T> implements Observable<T> {

        @NonNull
        private final String key;
        private final LiveEvent<T>.LifecycleLiveData<T> liveData;
        private final Map<Observer, ObserverWrapper<T>> observerMap = new HashMap();
        private final Handler mainHandler = new Handler(Looper.getMainLooper());

        public class LifecycleLiveData<T> extends ExternalLiveData<T> {
            private final String key;

            public LifecycleLiveData(String str) {
                this.key = str;
            }

            private boolean autoClear() {
                Boolean bool;
                return (!LiveEventBusCore.this.observableConfigs.containsKey(this.key) || (bool = ((ObservableConfig) LiveEventBusCore.this.observableConfigs.get(this.key)).autoClear) == null) ? LiveEventBusCore.this.autoClear : bool.booleanValue();
            }

            private boolean lifecycleObserverAlwaysActive() {
                Boolean bool;
                return (!LiveEventBusCore.this.observableConfigs.containsKey(this.key) || (bool = ((ObservableConfig) LiveEventBusCore.this.observableConfigs.get(this.key)).lifecycleObserverAlwaysActive) == null) ? LiveEventBusCore.this.lifecycleObserverAlwaysActive : bool.booleanValue();
            }

            @Override // androidx.lifecycle.ExternalLiveData
            public Lifecycle.State observerActiveLevel() {
                return lifecycleObserverAlwaysActive() ? Lifecycle.State.CREATED : Lifecycle.State.STARTED;
            }

            @Override // androidx.lifecycle.LiveData
            public void removeObserver(@NonNull Observer<? super T> observer) {
                super.removeObserver(observer);
                if (autoClear() && !LiveEvent.this.liveData.hasObservers()) {
                    LiveEventBusCore.get().bus.remove(this.key);
                }
                LiveEventBusCore.this.logger.log(Level.INFO, "observer removed: " + observer);
            }
        }

        public class PostLifeValueTask implements Runnable {
            private Object newValue;
            private LifecycleOwner owner;

            public PostLifeValueTask(@NonNull Object obj, @Nullable LifecycleOwner lifecycleOwner) {
                this.newValue = obj;
                this.owner = lifecycleOwner;
            }

            @Override // java.lang.Runnable
            public void run() {
                LifecycleOwner lifecycleOwner = this.owner;
                if (lifecycleOwner == null || !lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    return;
                }
                LiveEvent.this.postInternal(this.newValue);
            }
        }

        public class PostValueTask implements Runnable {
            private Object newValue;

            public PostValueTask(@NonNull Object obj) {
                this.newValue = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveEvent.this.postInternal(this.newValue);
            }
        }

        public LiveEvent(@NonNull String str) {
            this.key = str;
            this.liveData = new LifecycleLiveData<>(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void broadcastInternal(T t10, boolean z10, boolean z11) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            LiveEventBusCore.this.logger.log(Level.INFO, "broadcast: " + t10 + " foreground: " + z10 + " with key: " + this.key);
            Application app = AppUtils.getApp();
            if (app == null) {
                LiveEventBusCore.this.logger.log(Level.WARNING, "application is null, you can try setContext() when config");
                return;
            }
            Intent intent = new Intent(IpcConst.ACTION);
            if (z10) {
                intent.addFlags(268435456);
            }
            if (z11) {
                intent.setPackage(app.getPackageName());
            }
            intent.putExtra(IpcConst.KEY, this.key);
            if (ProcessorManager.getManager().writeTo(intent, t10)) {
                try {
                    app.sendBroadcast(intent);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeForeverInternal(@NonNull Observer<T> observer) {
            ObserverWrapper<T> observerWrapper = LiveEventBusCore.this.new ObserverWrapper<>(observer);
            ((ObserverWrapper) observerWrapper).preventNextEvent = this.liveData.getVersion() > -1;
            this.observerMap.put(observer, observerWrapper);
            this.liveData.observeForever(observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe forever observer: " + observerWrapper + "(" + observer + ") with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeInternal(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            ObserverWrapper observerWrapper = LiveEventBusCore.this.new ObserverWrapper(observer);
            observerWrapper.preventNextEvent = this.liveData.getVersion() > -1;
            this.liveData.observe(lifecycleOwner, observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe observer: " + observerWrapper + "(" + observer + ") on owner: " + lifecycleOwner + " with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeStickyForeverInternal(@NonNull Observer<T> observer) {
            ObserverWrapper<T> observerWrapper = LiveEventBusCore.this.new ObserverWrapper<>(observer);
            this.observerMap.put(observer, observerWrapper);
            this.liveData.observeForever(observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe sticky forever observer: " + observerWrapper + "(" + observer + ") with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void observeStickyInternal(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
            ObserverWrapper observerWrapper = LiveEventBusCore.this.new ObserverWrapper(observer);
            this.liveData.observe(lifecycleOwner, observerWrapper);
            LiveEventBusCore.this.logger.log(Level.INFO, "observe sticky observer: " + observerWrapper + "(" + observer + ") on owner: " + lifecycleOwner + " with key: " + this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void postInternal(T t10) {
            LiveEventBusCore.this.logger.log(Level.INFO, "post: " + t10 + " with key: " + this.key);
            this.liveData.setValue(t10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @MainThread
        public void removeObserverInternal(@NonNull Observer<T> observer) {
            if (this.observerMap.containsKey(observer)) {
                observer = this.observerMap.remove(observer);
            }
            this.liveData.removeObserver(observer);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        @Deprecated
        public void broadcast(T t10) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            broadcast(t10, false, false);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observe(@NonNull final LifecycleOwner lifecycleOwner, @NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeInternal(lifecycleOwner, observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.2
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeInternal(lifecycleOwner, observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeForever(@NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeForeverInternal(observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.4
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeForeverInternal(observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeSticky(@NonNull final LifecycleOwner lifecycleOwner, @NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeStickyInternal(lifecycleOwner, observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.3
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeStickyInternal(lifecycleOwner, observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeStickyForever(@NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                observeStickyForeverInternal(observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.5
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.observeStickyForeverInternal(observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void post(T t10) {
            if (ThreadUtils.isMainThread()) {
                postInternal(t10);
            } else {
                this.mainHandler.post(new PostValueTask(t10));
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossApp(T t10) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            broadcast(t10, false, false);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossProcess(T t10) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            broadcast(t10, false, true);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(T t10, long j10) {
            this.mainHandler.postDelayed(new PostValueTask(t10), j10);
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postOrderly(T t10) {
            this.mainHandler.post(new PostValueTask(t10));
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void removeObserver(@NonNull final Observer<T> observer) {
            if (ThreadUtils.isMainThread()) {
                removeObserverInternal(observer);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.6
                    @Override // java.lang.Runnable
                    public void run() {
                        LiveEvent.this.removeObserverInternal(observer);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void broadcast(final T t10, final boolean z10, final boolean z11) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (AppUtils.getApp() == null) {
                post(t10);
            } else if (ThreadUtils.isMainThread()) {
                broadcastInternal(t10, z10, z11);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.jeremyliao.liveeventbus.core.LiveEventBusCore.LiveEvent.1
                    @Override // java.lang.Runnable
                    public void run() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                        LiveEvent.this.broadcastInternal(t10, z10, z11);
                    }
                });
            }
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(LifecycleOwner lifecycleOwner, T t10, long j10) {
            this.mainHandler.postDelayed(new PostLifeValueTask(t10, lifecycleOwner), j10);
        }
    }

    public class ObserverWrapper<T> implements Observer<T> {

        @NonNull
        private final Observer<T> observer;
        private boolean preventNextEvent = false;

        public ObserverWrapper(@NonNull Observer<T> observer) {
            this.observer = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable T t10) {
            if (this.preventNextEvent) {
                this.preventNextEvent = false;
                return;
            }
            LiveEventBusCore.this.logger.log(Level.INFO, "message received: " + t10);
            try {
                this.observer.onChanged(t10);
            } catch (ClassCastException e10) {
                LiveEventBusCore.this.logger.log(Level.WARNING, "class cast error on message received: " + t10, e10);
            } catch (Exception e11) {
                LiveEventBusCore.this.logger.log(Level.WARNING, "error on message received: " + t10, e11);
            }
        }
    }

    public static class SingletonHolder {
        private static final LiveEventBusCore DEFAULT_BUS = new LiveEventBusCore();

        private SingletonHolder() {
        }
    }

    public static LiveEventBusCore get() {
        return SingletonHolder.DEFAULT_BUS;
    }

    public Config config() {
        return this.config;
    }

    public void enableLogger(boolean z10) {
        this.logger.setEnable(z10);
    }

    public void registerReceiver() {
        Application app;
        if (this.isRegisterReceiver || (app = AppUtils.getApp()) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(IpcConst.ACTION);
        app.registerReceiver(this.receiver, intentFilter);
        this.isRegisterReceiver = true;
    }

    public void setAutoClear(boolean z10) {
        this.autoClear = z10;
    }

    public void setLifecycleObserverAlwaysActive(boolean z10) {
        this.lifecycleObserverAlwaysActive = z10;
    }

    public void setLogger(@NonNull Logger logger) {
        this.logger.setLogger(logger);
    }

    public synchronized <T> Observable<T> with(String str, Class<T> cls) {
        try {
            if (!this.bus.containsKey(str)) {
                this.bus.put(str, new LiveEvent<>(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.bus.get(str);
    }

    private LiveEventBusCore() {
        this.config = new Config();
        this.isRegisterReceiver = false;
        this.console = new InnerConsole();
        this.bus = new HashMap();
        this.observableConfigs = new HashMap();
        this.lifecycleObserverAlwaysActive = true;
        this.autoClear = false;
        this.logger = new LoggerManager(new DefaultLogger());
        this.receiver = new LebIpcReceiver();
        registerReceiver();
    }

    public ObservableConfig config(String str) {
        if (!this.observableConfigs.containsKey(str)) {
            this.observableConfigs.put(str, new ObservableConfig());
        }
        return this.observableConfigs.get(str);
    }
}
