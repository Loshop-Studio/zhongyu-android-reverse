package com.jeremyliao.liveeventbus.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.jeremyliao.liveeventbus.logger.Logger;
import com.jeremyliao.liveeventbus.utils.AppUtils;

/* loaded from: classes5.dex */
public class Config {
    public Config autoClear(boolean z10) {
        LiveEventBusCore.get().setAutoClear(z10);
        return this;
    }

    public Config enableLogger(boolean z10) {
        LiveEventBusCore.get().enableLogger(z10);
        return this;
    }

    public Config lifecycleObserverAlwaysActive(boolean z10) {
        LiveEventBusCore.get().setLifecycleObserverAlwaysActive(z10);
        return this;
    }

    public Config setContext(Context context) {
        AppUtils.init(context);
        LiveEventBusCore.get().registerReceiver();
        return this;
    }

    public Config setLogger(@NonNull Logger logger) {
        LiveEventBusCore.get().setLogger(logger);
        return this;
    }
}
