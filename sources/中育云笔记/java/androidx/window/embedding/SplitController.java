package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10983y0;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitController {
    private static volatile SplitController globalInstance = null;
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock reentrantLock = SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        SplitController.globalInstance = new SplitController(null);
                    }
                    C10786q c10786q = C10786q.f26013a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            SplitController splitController = SplitController.globalInstance;
            AbstractC9979u.m20291d(splitController);
            return splitController;
        }

        public final void initialize(Context context, int i10) {
            AbstractC9979u.m20294g(context, "context");
            Set<EmbeddingRule> splitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i10);
            SplitController companion = getInstance();
            if (splitRules$window_release == null) {
                splitRules$window_release = AbstractC10983y0.m24160f();
            }
            companion.setStaticSplitRules(splitRules$window_release);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SplitController(AbstractC9972n abstractC9972n) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i10) {
        Companion.initialize(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        AbstractC9979u.m20294g(activity, "activity");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return AbstractC10947g0.m23929c1(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule rule) {
        AbstractC9979u.m20294g(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void removeSplitListener(Consumer<List<SplitInfo>> consumer) {
        AbstractC9979u.m20294g(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(EmbeddingRule rule) {
        AbstractC9979u.m20294g(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = AbstractC10983y0.m24160f();
    }
}
