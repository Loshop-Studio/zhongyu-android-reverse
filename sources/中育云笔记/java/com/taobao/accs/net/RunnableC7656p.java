package com.taobao.accs.net;

import androidx.camera.video.AudioStats;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoView;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsState;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import java.util.Iterator;

/* renamed from: com.taobao.accs.net.p */
/* loaded from: classes5.dex */
class RunnableC7656p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f13116a;

    /* renamed from: b */
    final /* synthetic */ String f13117b;

    /* renamed from: c */
    final /* synthetic */ int f13118c;

    /* renamed from: d */
    final /* synthetic */ boolean f13119d;

    /* renamed from: e */
    final /* synthetic */ C7650j f13120e;

    public RunnableC7656p(C7650j c7650j, int i10, String str, int i11, boolean z10) {
        this.f13120e = c7650j;
        this.f13116a = i10;
        this.f13117b = str;
        this.f13118c = i11;
        this.f13119d = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message.C7617a next;
        Message messageM9951b;
        AccsState.getInstance().m9844b(this.f13120e.f13064m, AccsState.RECENT_ERRORS, "oe " + this.f13116a + " " + this.f13117b);
        int i10 = this.f13118c;
        if (i10 > 0) {
            Message.C7617a c7617a = new Message.C7617a(i10, "");
            Iterator<Message.C7617a> it = this.f13120e.f13056e.m9957f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.equals(c7617a)) {
                        break;
                    }
                }
            }
            if (next != null && (messageM9951b = this.f13120e.f13056e.m9951b(next.m9914b())) != null) {
                if (this.f13119d) {
                    if (!this.f13120e.m10022a(messageM9951b, GSYVideoView.CHANGE_DELAY_TIME)) {
                        this.f13120e.f13056e.m9945a(messageM9951b, AccsErrorCode.convertNetworkSdkError(this.f13116a, this.f13117b).detail(AccsErrorCode.getAllDetails(null)).build());
                    }
                    if (messageM9951b.m9908e() != null) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", AudioStats.AUDIO_AMPLITUDE_NONE);
                    }
                } else {
                    this.f13120e.f13056e.m9945a(messageM9951b, AccsErrorCode.convertNetworkSdkError(this.f13116a, this.f13117b).detail(AccsErrorCode.getAllDetails(null)).build());
                }
            }
        }
        int i11 = this.f13118c;
        if (i11 >= 0 || !this.f13119d) {
            return;
        }
        this.f13120e.m10026b(i11);
    }
}
