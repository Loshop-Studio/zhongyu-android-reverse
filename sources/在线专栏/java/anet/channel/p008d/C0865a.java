package anet.channel.p008d;

import anet.channel.util.ALog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* renamed from: anet.channel.d.a */
/* loaded from: classes.dex */
public class C0865a implements ALog.ILog {
    /* renamed from: a */
    private int m4393a(char c4) {
        if (c4 == 'D') {
            return 1;
        }
        if (c4 == 'E') {
            return 4;
        }
        if (c4 == 'I') {
            return 2;
        }
        if (c4 != 'V') {
            return c4 != 'W' ? 5 : 3;
        }
        return 0;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo4394d(String str, String str2) {
        AdapterForTLog.logd(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4395e(String str, String str2) {
        AdapterForTLog.loge(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo4397i(String str, String str2) {
        AdapterForTLog.logi(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i4) {
        return i4 >= m4393a(AdapterForTLog.getLogLevel().charAt(0));
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return AdapterForTLog.isValid();
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i4) {
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4398w(String str, String str2) {
        AdapterForTLog.logw(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4396e(String str, String str2, Throwable th) {
        AdapterForTLog.loge(str, str2, th);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4399w(String str, String str2, Throwable th) {
        AdapterForTLog.logw(str, str2, th);
    }
}
