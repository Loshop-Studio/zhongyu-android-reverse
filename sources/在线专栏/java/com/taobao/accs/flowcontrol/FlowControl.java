package com.taobao.accs.flowcontrol;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class FlowControl {
    public static final int DELAY_MAX = -1;
    public static final int DELAY_MAX_BRUSH = -1000;
    public static final int HIGH_FLOW_CTRL = 2;
    public static final int HIGH_FLOW_CTRL_BRUSH = 3;
    public static final int LOW_FLOW_CTRL = 1;
    public static final int NO_FLOW_CTRL = 0;
    public static final String SERVICE_ALL = "ALL";
    public static final String SERVICE_ALL_BRUSH = "ALL_BRUSH";
    public static final int STATUS_FLOW_CTRL_ALL = 420;
    public static final int STATUS_FLOW_CTRL_BRUSH = 422;
    public static final int STATUS_FLOW_CTRL_CUR = 421;

    /* renamed from: a */
    private Context f7610a;

    /* renamed from: b */
    private FlowCtrlInfoHolder f7611b;

    public static class FlowControlInfo implements Serializable {
        private static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        public FlowControlInfo(String str, String str2, int i4, long j4, long j5, long j6) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i4;
            this.delayTime = j4;
            this.expireTime = j5 <= 0 ? 0L : j5;
            this.startTime = j6 <= 0 ? 0L : j6;
        }

        public boolean isExpired() {
            return System.currentTimeMillis() - (this.startTime + this.expireTime) > 0;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("flow ctrl serviceId:");
            stringBuffer.append(this.serviceId);
            stringBuffer.append(" bizId:");
            stringBuffer.append(this.bizId);
            stringBuffer.append(" status:");
            stringBuffer.append(this.status);
            stringBuffer.append(" delayTime:");
            stringBuffer.append(this.delayTime);
            stringBuffer.append(" startTime:");
            stringBuffer.append(this.startTime);
            stringBuffer.append(" expireTime:");
            stringBuffer.append(this.expireTime);
            return stringBuffer.toString();
        }
    }

    public static class FlowCtrlInfoHolder implements Serializable {
        private static final long serialVersionUID = 6307563052429742524L;
        Map<String, FlowControlInfo> flowCtrlMap = null;

        public FlowControlInfo get(String str, String str2) {
            if (this.flowCtrlMap == null) {
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            return this.flowCtrlMap.get(str);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }
    }

    public FlowControl(Context context) {
        this.f7610a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[Catch: all -> 0x0126, TryCatch #1 {all -> 0x0126, blocks: (B:32:0x00ab, B:42:0x00fd, B:43:0x0119, B:47:0x0120, B:36:0x00bd, B:38:0x00db, B:40:0x00e1), top: B:75:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m5949a(java.util.Map<java.lang.Integer, java.lang.String> r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.m5949a(java.util.Map, java.lang.String):int");
    }

    /* renamed from: a */
    private boolean m5948a(long j4, long j5) {
        if (j4 != 0 && j5 > 0) {
            return true;
        }
        ALog.m6092e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public long m5950a(String str, String str2) {
        long j4;
        long j5;
        long j6;
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f7611b;
        long j7 = 0;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null || TextUtils.isEmpty(str)) {
            return 0L;
        }
        synchronized (this) {
            FlowControlInfo flowControlInfo = this.f7611b.get(SERVICE_ALL, null);
            FlowControlInfo flowControlInfo2 = this.f7611b.get(SERVICE_ALL_BRUSH, null);
            FlowControlInfo flowControlInfo3 = this.f7611b.get(str, null);
            FlowControlInfo flowControlInfo4 = this.f7611b.get(str, str2);
            j4 = (flowControlInfo == null || flowControlInfo.isExpired()) ? 0L : flowControlInfo.delayTime;
            long j8 = (flowControlInfo2 == null || flowControlInfo2.isExpired()) ? 0L : flowControlInfo2.delayTime;
            j5 = (flowControlInfo3 == null || flowControlInfo3.isExpired()) ? 0L : flowControlInfo3.delayTime;
            if (flowControlInfo4 != null && !flowControlInfo4.isExpired()) {
                j7 = flowControlInfo4.delayTime;
            }
            j6 = -1;
            if (j4 != -1 && j7 != -1 && j5 != -1) {
                if (j8 == -1) {
                    j6 = -1000;
                } else {
                    long j9 = j4 > j7 ? j4 : j7;
                    j6 = j9 > j5 ? j9 : j5;
                }
            }
            if ((flowControlInfo4 != null && flowControlInfo4.isExpired()) || (flowControlInfo != null && flowControlInfo.isExpired())) {
                m5947a();
            }
        }
        ALog.m6092e("FlowControl", "getFlowCtrlDelay service " + str + " biz " + str2 + " result:" + j6 + " global:" + j4 + " serviceDelay:" + j5 + " bidDelay:" + j7, new Object[0]);
        return j6;
    }

    /* renamed from: a */
    private void m5947a() {
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f7611b;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null) {
            return;
        }
        synchronized (this) {
            Iterator<Map.Entry<String, FlowControlInfo>> it = this.f7611b.flowCtrlMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().isExpired()) {
                    it.remove();
                }
            }
        }
    }
}
