package com.taobao.accs.utl;

/* loaded from: classes.dex */
public abstract class RomInfoCollector {
    protected RomInfoCollector mNextCollector;

    public static RomInfoCollector getCollector() {
        return new C1782e();
    }

    public abstract String collect();
}
