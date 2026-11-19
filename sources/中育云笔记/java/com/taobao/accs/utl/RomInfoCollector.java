package com.taobao.accs.utl;

/* loaded from: classes5.dex */
public abstract class RomInfoCollector {
    protected RomInfoCollector mNextCollector;

    public static RomInfoCollector getCollector() {
        return new C7679e();
    }

    public abstract String collect();
}
