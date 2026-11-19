package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public interface StartStopTokens {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StartStopTokens create$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return companion.create(z10);
        }

        public final StartStopTokens create() {
            return create$default(this, false, 1, null);
        }

        public final StartStopTokens create(boolean z10) {
            StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl();
            return z10 ? new SynchronizedStartStopTokensImpl(startStopTokensImpl) : startStopTokensImpl;
        }
    }

    static StartStopTokens create() {
        return Companion.create();
    }

    boolean contains(WorkGenerationalId workGenerationalId);

    StartStopToken remove(WorkGenerationalId workGenerationalId);

    default StartStopToken remove(WorkSpec spec) {
        AbstractC9979u.m20294g(spec, "spec");
        return remove(WorkSpecKt.generationalId(spec));
    }

    List<StartStopToken> remove(String str);

    StartStopToken tokenFor(WorkGenerationalId workGenerationalId);

    default StartStopToken tokenFor(WorkSpec spec) {
        AbstractC9979u.m20294g(spec, "spec");
        return tokenFor(WorkSpecKt.generationalId(spec));
    }

    static StartStopTokens create(boolean z10) {
        return Companion.create(z10);
    }
}
