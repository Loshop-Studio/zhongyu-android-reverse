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
/* loaded from: classes5.dex */
class RunnableC7658r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7650j f13122a;

    public RunnableC7658r(C7650j c7650j) {
        this.f13122a = c7650j;
    }

    @Override // java.lang.Runnable
    public void run() {
        ErrorCode errorCodeBuild = AccsErrorCode.SUCCESS;
        try {
            SessionCenter sessionCenter = SessionCenter.getInstance(this.f13122a.f13060i.getAppKey());
            C7650j c7650j = this.f13122a;
            c7650j.m10067a(sessionCenter, c7650j.f13060i.getInappHost(), false);
            Session throwsException = null;
            try {
                try {
                    try {
                        throwsException = sessionCenter.getThrowsException(this.f13122a.mo10024b((String) null), ConnType.TypeLevel.SPDY, 60000L);
                    } catch (Throwable th) {
                        errorCodeBuild = UtilityImpl.m10156g(this.f13122a.f13055d) ? AccsErrorCode.NETWORK_INAPP_EXCEPTION.copy().detail(AccsErrorCode.getAllDetails(AccsErrorCode.getExceptionInfo(th))).build() : AccsErrorCode.NO_NETWORK.copy().detail(AccsErrorCode.getExceptionInfo(th)).build();
                    }
                } catch (NoAvailStrategyException e10) {
                    errorCodeBuild = AccsErrorCode.NETWORK_INAPP_NO_STRATEGY.copy().detail(e10.getMessage()).build();
                } catch (InvalidParameterException e11) {
                    errorCodeBuild = AccsErrorCode.NETWORK_INAPP_ARGS_INVALID.copy().detail(e11.getMessage()).build();
                }
            } catch (ConnectException e12) {
                errorCodeBuild = AccsErrorCode.NETWORK_INAPP_CONNECT_FAIL.copy().detail(AccsErrorCode.getAllDetails(e12.getMessage())).build();
            } catch (TimeoutException e13) {
                errorCodeBuild = AccsErrorCode.NETWORK_INAPP_TIMEOUT.copy().detail(AccsErrorCode.getAllDetails(e13.getMessage())).build();
            }
            if (throwsException != null) {
                throwsException.ping(true);
                return;
            }
            if (errorCodeBuild.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
                this.f13122a.f13093t.mo3535e(errorCodeBuild.toString());
                AccsState.getInstance().m9844b(this.f13122a.f13064m, AccsState.RECENT_ERRORS, Integer.valueOf(errorCodeBuild.getCodeInt()));
            } else {
                this.f13122a.f13093t.mo3535e("reconnect fail");
                AccsState.getInstance().m9844b(this.f13122a.f13064m, AccsState.RECENT_ERRORS, "reconnect session null");
            }
            this.f13122a.m10065r();
        } catch (Throwable th2) {
            this.f13122a.f13093t.mo3536e("sendMessage", th2);
        }
    }
}
