package anet.channel.p020a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.taobao.analysis.FlowCenter;

/* renamed from: anet.channel.a.b */
/* loaded from: classes3.dex */
public class C4975b implements INetworkAnalysis {

    /* renamed from: a */
    private boolean f2331a;

    public C4975b() throws ClassNotFoundException {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            this.f2331a = true;
        } catch (Exception unused) {
            this.f2331a = false;
            ALog.m2529e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        if (this.f2331a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
