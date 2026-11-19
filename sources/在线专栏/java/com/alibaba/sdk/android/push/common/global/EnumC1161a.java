package com.alibaba.sdk.android.push.common.global;

/* renamed from: com.alibaba.sdk.android.push.common.global.a */
/* loaded from: classes.dex */
public enum EnumC1161a {
    CHANNEL_SERVICE("com.taobao.accs.ChannelService", "service", true),
    KERNEL_SERVICE("com.taobao.accs.ChannelService$KernelService", "service", true),
    ACCS_JOB_SERVICE("com.taobao.accs.internal.AccsJobService", "service", true),
    MSG_DISTRIBUTE_SERVICE("com.taobao.accs.data.MsgDistributeService", "service", true),
    EVENT_RECEIVER("com.taobao.accs.EventReceiver", "receiver", false),
    SERVICE_RECEIVER("com.taobao.accs.ServiceReceiver", "receiver", true),
    AGOO_SERVICE("org.android.agoo.accs.AgooService", "service", true),
    ALIYUN_PUSH_INTENT_SERVICE("com.aliyun.ams.emas.push.AgooInnerService", "service", true),
    MSG_SERVICE("com.aliyun.ams.emas.push.MsgService", "service", true);


    /* renamed from: j */
    private final String f6707j;

    /* renamed from: k */
    private final String f6708k;

    /* renamed from: l */
    private final boolean f6709l;

    EnumC1161a(String str, String str2, boolean z3) {
        this.f6707j = str;
        this.f6708k = str2;
        this.f6709l = z3;
    }

    /* renamed from: a */
    public String m5166a() {
        return this.f6707j;
    }

    /* renamed from: b */
    public String m5167b() {
        return this.f6708k;
    }

    /* renamed from: c */
    public boolean m5168c() {
        return this.f6709l;
    }
}
