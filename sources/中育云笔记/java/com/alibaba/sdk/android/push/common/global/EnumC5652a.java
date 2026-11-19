package com.alibaba.sdk.android.push.common.global;

/* renamed from: com.alibaba.sdk.android.push.common.global.a */
/* loaded from: classes3.dex */
public enum EnumC5652a {
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
    private final String f4231j;

    /* renamed from: k */
    private final String f4232k;

    /* renamed from: l */
    private final boolean f4233l;

    EnumC5652a(String str, String str2, boolean z10) {
        this.f4231j = str;
        this.f4232k = str2;
        this.f4233l = z10;
    }

    /* renamed from: a */
    public String m3617a() {
        return this.f4231j;
    }

    /* renamed from: b */
    public String m3618b() {
        return this.f4232k;
    }

    /* renamed from: c */
    public boolean m3619c() {
        return this.f4233l;
    }
}
