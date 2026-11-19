package com.jeremyliao.liveeventbus.core;

/* loaded from: classes5.dex */
public class ObservableConfig {
    Boolean lifecycleObserverAlwaysActive = null;
    Boolean autoClear = null;

    public ObservableConfig autoClear(boolean z10) {
        this.autoClear = Boolean.valueOf(z10);
        return this;
    }

    public ObservableConfig lifecycleObserverAlwaysActive(boolean z10) {
        this.lifecycleObserverAlwaysActive = Boolean.valueOf(z10);
        return this;
    }
}
