package com.taobao.accs.utl;

/* renamed from: com.taobao.accs.utl.e */
/* loaded from: classes.dex */
public class C1782e extends RomInfoCollector {
    @Override // com.taobao.accs.utl.RomInfoCollector
    public String collect() throws ClassNotFoundException {
        RomInfoCollector romInfoCollector;
        String strM6129g = UtilityImpl.m6129g();
        return (strM6129g != null || (romInfoCollector = this.mNextCollector) == null) ? strM6129g : romInfoCollector.collect();
    }
}
