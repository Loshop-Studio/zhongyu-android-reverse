package com.taobao.accs.p085ut.monitor;

import androidx.camera.video.AudioStats;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;

@Monitor(module = "accs", monitorPoint = "session")
/* loaded from: classes5.dex */
public class SessionMonitor extends BaseMonitor {

    /* renamed from: a */
    private long f13203a;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE, max = 15000.0d, min = AudioStats.AUDIO_AMPLITUDE_NONE)
    public long auth_time;

    /* renamed from: b */
    private long f13204b;
    public long connection_stop_date;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE, max = 86400.0d, min = AudioStats.AUDIO_AMPLITUDE_NONE)
    public long live_time;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE)
    public int ping_rec_times;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE)
    public int ping_send_times;

    @Dimension
    public int retry_times;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE, max = 15000.0d, min = AudioStats.AUDIO_AMPLITUDE_NONE)
    public long ssl_time;

    @Measure(constantValue = AudioStats.AUDIO_AMPLITUDE_NONE, max = 15000.0d, min = AudioStats.AUDIO_AMPLITUDE_NONE)
    public long tcp_time;

    @Dimension
    public boolean ret = false;

    @Dimension
    public int fail_reasons = 0;

    @Dimension
    public String close_reasons = "none";

    @Dimension
    public int close_connection_type = 2;

    @Dimension
    public String connect_type = "none";

    @Dimension
    public boolean isProxy = false;

    @Dimension
    public String sdkv = String.valueOf(Constants.SDK_VERSION_CODE);

    public String getCloseReason() {
        return this.close_reasons;
    }

    public long getConCloseDate() {
        return this.f13204b;
    }

    public long getConStopDate() {
        return this.connection_stop_date;
    }

    public boolean getRet() {
        return this.ret;
    }

    public void onCloseConnect() {
        this.f13204b = System.currentTimeMillis();
    }

    public void onConnectStop() {
        this.connection_stop_date = System.currentTimeMillis();
    }

    public void onPingCBReceive() {
        this.ping_rec_times++;
    }

    public void onSendPing() {
        this.ping_send_times++;
    }

    public void onStartConnect() {
        this.f13203a = System.currentTimeMillis();
    }

    public void setCloseReason(String str) {
        this.close_reasons = str;
    }

    public void setCloseType(int i10) {
        this.close_connection_type = i10;
    }

    public void setConnectType(String str) {
        this.connect_type = str;
    }

    public void setFailReason(int i10) {
        this.fail_reasons = i10;
    }

    public void setRet(boolean z10) {
        this.ret = z10;
    }

    public void setRetryTimes(int i10) {
        this.retry_times = i10;
    }
}
