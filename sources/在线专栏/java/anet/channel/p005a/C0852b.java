package anet.channel.p005a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.taobao.analysis.FlowCenter;

/* renamed from: anet.channel.a.b */
/* loaded from: classes.dex */
public class C0852b implements INetworkAnalysis {

    /* renamed from: a */
    private boolean f5053a;

    public C0852b() throws ClassNotFoundException {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            this.f5053a = true;
        } catch (Exception unused) {
            this.f5053a = false;
            ALog.m4638e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        if (this.f5053a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
