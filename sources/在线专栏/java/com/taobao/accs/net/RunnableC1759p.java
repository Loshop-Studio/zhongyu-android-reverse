package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsState;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler;
import java.util.Iterator;

/* renamed from: com.taobao.accs.net.p */
/* loaded from: classes.dex */
class RunnableC1759p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f7718a;

    /* renamed from: b */
    final /* synthetic */ String f7719b;

    /* renamed from: c */
    final /* synthetic */ int f7720c;

    /* renamed from: d */
    final /* synthetic */ boolean f7721d;

    /* renamed from: e */
    final /* synthetic */ C1753j f7722e;

    RunnableC1759p(C1753j c1753j, int i4, String str, int i5, boolean z3) {
        this.f7722e = c1753j;
        this.f7718a = i4;
        this.f7719b = str;
        this.f7720c = i5;
        this.f7721d = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message.C1720a next;
        Message messageM5925b;
        AccsState.getInstance().m5818b(this.f7722e.f7666m, AccsState.RECENT_ERRORS, "oe " + this.f7718a + " " + this.f7719b);
        int i4 = this.f7720c;
        if (i4 > 0) {
            Message.C1720a c1720a = new Message.C1720a(i4, "");
            Iterator<Message.C1720a> it = this.f7722e.f7658e.m5931f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.equals(c1720a)) {
                        break;
                    }
                }
            }
            if (next != null && (messageM5925b = this.f7722e.f7658e.m5925b(next.m5888b())) != null) {
                if (this.f7721d) {
                    if (!this.f7722e.m5996a(messageM5925b, MessageHandler.WHAT_SMOOTH_SCROLL)) {
                        this.f7722e.f7658e.m5919a(messageM5925b, AccsErrorCode.convertNetworkSdkError(this.f7718a, this.f7719b).detail(AccsErrorCode.getAllDetails(null)).build());
                    }
                    if (messageM5925b.m5882e() != null) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", 0.0d);
                    }
                } else {
                    this.f7722e.f7658e.m5919a(messageM5925b, AccsErrorCode.convertNetworkSdkError(this.f7718a, this.f7719b).detail(AccsErrorCode.getAllDetails(null)).build());
                }
            }
        }
        int i5 = this.f7720c;
        if (i5 >= 0 || !this.f7721d) {
            return;
        }
        this.f7722e.m6000b(i5);
    }
}
