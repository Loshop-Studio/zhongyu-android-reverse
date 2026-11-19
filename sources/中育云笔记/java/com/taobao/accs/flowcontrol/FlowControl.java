package com.taobao.accs.flowcontrol;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
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
    private Context f13008a;

    /* renamed from: b */
    private FlowCtrlInfoHolder f13009b;

    public static class FlowControlInfo implements Serializable {
        private static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        public FlowControlInfo(String str, String str2, int i10, long j10, long j11, long j12) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i10;
            this.delayTime = j10;
            this.expireTime = j11 <= 0 ? 0L : j11;
            this.startTime = j12 <= 0 ? 0L : j12;
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
                str = str + BundleUtil.UNDERLINE_TAG + str2;
            }
            return this.flowCtrlMap.get(str);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + BundleUtil.UNDERLINE_TAG + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }
    }

    public FlowControl(Context context) {
        this.f13008a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m9975a(java.util.Map<java.lang.Integer, java.lang.String> r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.m9975a(java.util.Map, java.lang.String):int");
    }

    /* renamed from: a */
    private boolean m9974a(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            return true;
        }
        ALog.m10118e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public long m9976a(String str, String str2) {
        long j10;
        long j11;
        long j12;
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f13009b;
        long j13 = 0;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null || TextUtils.isEmpty(str)) {
            return 0L;
        }
        synchronized (this) {
            try {
                FlowControlInfo flowControlInfo = this.f13009b.get(SERVICE_ALL, null);
                FlowControlInfo flowControlInfo2 = this.f13009b.get(SERVICE_ALL_BRUSH, null);
                FlowControlInfo flowControlInfo3 = this.f13009b.get(str, null);
                FlowControlInfo flowControlInfo4 = this.f13009b.get(str, str2);
                j10 = (flowControlInfo == null || flowControlInfo.isExpired()) ? 0L : flowControlInfo.delayTime;
                long j14 = (flowControlInfo2 == null || flowControlInfo2.isExpired()) ? 0L : flowControlInfo2.delayTime;
                j11 = (flowControlInfo3 == null || flowControlInfo3.isExpired()) ? 0L : flowControlInfo3.delayTime;
                if (flowControlInfo4 != null && !flowControlInfo4.isExpired()) {
                    j13 = flowControlInfo4.delayTime;
                }
                j12 = -1;
                if (j10 != -1 && j13 != -1 && j11 != -1) {
                    if (j14 == -1) {
                        j12 = -1000;
                    } else {
                        long j15 = j10 > j13 ? j10 : j13;
                        j12 = j15 > j11 ? j15 : j11;
                    }
                }
                if ((flowControlInfo4 != null && flowControlInfo4.isExpired()) || (flowControlInfo != null && flowControlInfo.isExpired())) {
                    m9973a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ALog.m10118e("FlowControl", "getFlowCtrlDelay service " + str + " biz " + str2 + " result:" + j12 + " global:" + j10 + " serviceDelay:" + j11 + " bidDelay:" + j13, new Object[0]);
        return j12;
    }

    /* renamed from: a */
    private void m9973a() {
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f13009b;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null) {
            return;
        }
        synchronized (this) {
            try {
                Iterator<Map.Entry<String, FlowControlInfo>> it = this.f13009b.flowCtrlMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().isExpired()) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
