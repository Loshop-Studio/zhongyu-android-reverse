package com.taobao.accs.net;

import anet.channel.NoAvailStrategyException;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsState;
import com.taobao.accs.utl.UtilityImpl;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.taobao.accs.net.r */
/* loaded from: classes.dex */
class RunnableC1761r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1753j f7724a;

    RunnableC1761r(C1753j c1753j) {
        this.f7724a = c1753j;
    }

    @Override // java.lang.Runnable
    public void run() {
        ErrorCode errorCodeBuild = AccsErrorCode.SUCCESS;
        try {
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f7724a.f7662i.getAppKey());
            C1753j c1753j = this.f7724a;
            boolean z3 = false;
            c1753j.m6041a(sessionCenter, c1753j.f7662i.getInappHost(), false);
            Session throwsException = null;
            try {
                try {
                    throwsException = sessionCenter.getThrowsException(this.f7724a.mo5998b((String) null), ConnType.TypeLevel.SPDY, 60000L);
                } catch (NoAvailStrategyException e4) {
                    errorCodeBuild = AccsErrorCode.NETWORK_INAPP_NO_STRATEGY.copy().detail(e4.getMessage()).build();
                } catch (Throwable th) {
                    errorCodeBuild = UtilityImpl.m6130g(this.f7724a.f7657d) ? AccsErrorCode.NETWORK_INAPP_EXCEPTION.copy().detail(AccsErrorCode.getAllDetails(AccsErrorCode.getExceptionInfo(th))).build() : AccsErrorCode.NO_NETWORK.copy().detail(AccsErrorCode.getExceptionInfo(th)).build();
                }
            } catch (ConnectException e5) {
                errorCodeBuild = AccsErrorCode.NETWORK_INAPP_CONNECT_FAIL.copy().detail(AccsErrorCode.getAllDetails(e5.getMessage())).build();
            } catch (InvalidParameterException e6) {
                errorCodeBuild = AccsErrorCode.NETWORK_INAPP_ARGS_INVALID.copy().detail(e6.getMessage()).build();
            } catch (TimeoutException e7) {
                errorCodeBuild = AccsErrorCode.NETWORK_INAPP_TIMEOUT.copy().detail(AccsErrorCode.getAllDetails(e7.getMessage())).build();
            }
            if (throwsException != null) {
                throwsException.ping(true);
                z3 = true;
            } else if (errorCodeBuild.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
                this.f7724a.f7695t.mo5085e(errorCodeBuild.toString());
                AccsState.getInstance().m5818b(this.f7724a.f7666m, AccsState.RECENT_ERRORS, Integer.valueOf(errorCodeBuild.getCodeInt()));
            } else {
                this.f7724a.f7695t.mo5085e("reconnect fail");
                AccsState.getInstance().m5818b(this.f7724a.f7666m, AccsState.RECENT_ERRORS, "reconnect session null");
            }
            if (z3) {
                return;
            }
            this.f7724a.m6039r();
        } finally {
        }
    }
}
