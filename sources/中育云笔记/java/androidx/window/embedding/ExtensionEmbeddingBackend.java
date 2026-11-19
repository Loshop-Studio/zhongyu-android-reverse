package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    private static final String TAG = "EmbeddingBackend";
    private static volatile ExtensionEmbeddingBackend globalInstance;

    @GuardedBy("globalLock")
    @VisibleForTesting
    private EmbeddingInterfaceCompat embeddingExtension;
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    return new EmbeddingCompat();
                }
                return null;
            } catch (Throwable th) {
                AbstractC9979u.m20303p("Failed to load embedding extension: ", th);
                return null;
            }
        }

        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension());
                    }
                    C10786q c10786q = C10786q.f26013a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.globalInstance;
            AbstractC9979u.m20291d(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(Integer num) {
            return num != null && num.intValue() >= 1;
        }

        private Companion() {
        }
    }

    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo;
        final /* synthetic */ ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend this$0) {
            AbstractC9979u.m20294g(this$0, "this$0");
            this.this$0 = this$0;
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(List<SplitInfo> splitInfo) {
            AbstractC9979u.m20294g(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }

        public final void setLastInfo(List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    public static final class SplitListenerWrapper {
        private final Activity activity;
        private final Consumer<List<SplitInfo>> callback;
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(Activity activity, Executor executor, Consumer<List<SplitInfo>> callback) {
            AbstractC9979u.m20294g(activity, "activity");
            AbstractC9979u.m20294g(executor, "executor");
            AbstractC9979u.m20294g(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-1, reason: not valid java name */
        public static final void m33957accept$lambda1(SplitListenerWrapper this$0, List splitsWithActivity) {
            AbstractC9979u.m20294g(this$0, "this$0");
            AbstractC9979u.m20294g(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }

        public final void accept(List<SplitInfo> splitInfoList) {
            AbstractC9979u.m20294g(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (AbstractC9979u.m20289b(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.f
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionEmbeddingBackend.SplitListenerWrapper.m33957accept$lambda1(this.f2094c, arrayList);
                }
            });
        }

        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(EmbeddingRule rule) {
        AbstractC9979u.m20294g(rule, "rule");
        if (this.splitRules.contains(rule)) {
            return;
        }
        this.splitRules.add(rule);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> callback) {
        AbstractC9979u.m20294g(activity, "activity");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                callback.accept(AbstractC10978w.m24136n());
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                AbstractC9979u.m20291d(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(AbstractC10978w.m24136n());
            }
            C10786q c10786q = C10786q.f26013a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(Set<? extends EmbeddingRule> rules) {
        AbstractC9979u.m20294g(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(EmbeddingRule rule) {
        AbstractC9979u.m20294g(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat == null) {
                return;
            }
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(Consumer<List<SplitInfo>> consumer) {
        AbstractC9979u.m20294g(consumer, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = getSplitChangeCallbacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (AbstractC9979u.m20289b(next.getCallback(), consumer)) {
                    getSplitChangeCallbacks().remove(next);
                    break;
                }
            }
            C10786q c10786q = C10786q.f26013a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
