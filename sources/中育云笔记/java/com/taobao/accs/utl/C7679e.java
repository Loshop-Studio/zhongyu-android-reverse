package com.taobao.accs.utl;

/* renamed from: com.taobao.accs.utl.e */
/* loaded from: classes5.dex */
public class C7679e extends RomInfoCollector {
    @Override // com.taobao.accs.utl.RomInfoCollector
    public String collect() throws ClassNotFoundException {
        RomInfoCollector romInfoCollector;
        String strM10155g = UtilityImpl.m10155g();
        return (strM10155g != null || (romInfoCollector = this.mNextCollector) == null) ? strM10155g : romInfoCollector.collect();
    }
}
