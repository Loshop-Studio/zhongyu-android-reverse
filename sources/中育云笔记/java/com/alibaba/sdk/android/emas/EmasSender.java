package com.alibaba.sdk.android.emas;

import android.app.Application;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.alibaba.sdk.android.emas.C5598g;
import com.alibaba.sdk.android.tbrest.rest.C5705e;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.tendcloud.tenddata.C7843ab;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes3.dex */
public class EmasSender {
    private static final String TAG = "EmasSender";
    private boolean background;
    private C5592a mCacheManager;
    private C5594c mDiskCacheManager;
    private C5599h mSendManager;
    private int singleLogLimitCapacity;

    public static final class Builder {
        private String appId;
        private String appKey;
        private String appSecret;
        private String appVersion;
        private String channel;
        private Application context;
        private String host;
        private boolean openHttp;
        private PreSendHandler preSendHandler;
        private String userNick;
        private String businessKey = "common";
        private boolean cache = true;
        private int cacheLimitCount = 20;
        private int singleLogLimitCapacity = 204800;
        private int cacheLimitCapacity = 2097152;
        private boolean diskCache = true;
        private int diskCacheLimitCount = 50;
        private int diskCacheLimitCapacity = C7843ab.f14277L;
        private int diskCacheLimitDay = 5;
        private boolean sendDiskCacheBackground = false;
        private int maxSendDiskCacheQueueCount = 0;

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public Builder appKey(String str) {
            this.appKey = str;
            return this;
        }

        public Builder appSecret(String str) {
            this.appSecret = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public EmasSender build() {
            return new EmasSender(this);
        }

        public Builder businessKey(String str) {
            this.businessKey = str;
            return this;
        }

        public Builder cache(boolean z10) {
            this.cache = z10;
            return this;
        }

        public Builder cacheLimitCount(int i10) {
            this.cacheLimitCount = i10;
            return this;
        }

        public Builder channel(String str) {
            this.channel = str;
            return this;
        }

        public Builder context(Application application) {
            this.context = application;
            return this;
        }

        public Builder diskCache(boolean z10) {
            this.diskCache = z10;
            return this;
        }

        public Builder diskCacheLimitCount(int i10) {
            this.diskCacheLimitCount = i10;
            return this;
        }

        public Builder diskCacheLimitDay(int i10) {
            this.diskCacheLimitDay = i10;
            return this;
        }

        public Builder host(String str) {
            this.host = str;
            return this;
        }

        public Builder openHttp(boolean z10) {
            this.openHttp = z10;
            return this;
        }

        public Builder preSendHandler(PreSendHandler preSendHandler) {
            this.preSendHandler = preSendHandler;
            return this;
        }

        public Builder setMaxSendDiskCacheQueueCount(int i10) {
            this.maxSendDiskCacheQueueCount = i10;
            return this;
        }

        public Builder setSendDiskCacheBackground(boolean z10) {
            this.sendDiskCacheBackground = z10;
            return this;
        }

        public Builder userNick(String str) {
            this.userNick = str;
            return this;
        }
    }

    public void changeHost(String str) {
        this.mSendManager.setHost(str);
    }

    public void flush() {
        C5592a c5592a = this.mCacheManager;
        if (c5592a != null) {
            c5592a.flush();
        }
    }

    public boolean isBackground() {
        return this.background;
    }

    public void openHttp(boolean z10) {
        this.mSendManager.openHttp(z10);
    }

    public void send(long j10, String str, int i10, String str2, String str3, String str4, Map<String, String> map) {
        if (TextUtils.isEmpty(this.mSendManager.m3519a().getAppKey()) || TextUtils.isEmpty(this.mSendManager.m3519a().getChangeHost())) {
            LogUtil.m3869d("EmasSender send failed. appkey or host is empty.");
            return;
        }
        String strM3861a = C5705e.m3861a(this.mSendManager.m3519a(), this.mSendManager.m3519a().getAppKey(), j10, str, i10, str2, str3, str4, map);
        if (TextUtils.isEmpty(strM3861a)) {
            LogUtil.m3869d("EmasSender send failed. build data is null.");
            return;
        }
        int length = strM3861a.getBytes(Charset.forName(Request.DEFAULT_CHARSET)).length;
        if (length > this.singleLogLimitCapacity) {
            LogUtil.m3869d("EmasSender send failed. build data is exceed limit. current length: " + length);
            return;
        }
        C5596e c5596e = new C5596e(String.valueOf(i10), strM3861a, j10);
        C5592a c5592a = this.mCacheManager;
        if (c5592a != null) {
            c5592a.add(c5596e);
        } else {
            this.mSendManager.m3525b(c5596e);
        }
    }

    public void setUserNick(String str) {
        this.mSendManager.setUserNick(str);
    }

    private EmasSender(Builder builder) {
        this.background = false;
        this.singleLogLimitCapacity = builder.singleLogLimitCapacity;
        if (builder.diskCache) {
            C5594c c5594c = new C5594c(builder.context, builder.host, builder.appKey, builder.businessKey);
            this.mDiskCacheManager = c5594c;
            c5594c.m3494a(builder.diskCacheLimitCount, builder.diskCacheLimitCapacity, builder.diskCacheLimitDay);
        }
        C5599h c5599h = new C5599h(this, this.mDiskCacheManager);
        this.mSendManager = c5599h;
        c5599h.init(builder.context, builder.appId, builder.appKey, builder.appVersion, builder.channel, builder.userNick);
        this.mSendManager.setHost(builder.host);
        this.mSendManager.m3522a(builder.appSecret);
        this.mSendManager.openHttp(builder.openHttp);
        this.mSendManager.m3524a(builder.sendDiskCacheBackground);
        this.mSendManager.m3520a(builder.maxSendDiskCacheQueueCount);
        this.mSendManager.m3521a(builder.preSendHandler);
        this.mSendManager.m3526d();
        if (!builder.cache || builder.cacheLimitCount <= 1) {
            return;
        }
        this.mCacheManager = new C5592a(this.mSendManager, builder.cacheLimitCount, builder.cacheLimitCapacity);
        C5598g c5598g = new C5598g();
        c5598g.m3510a(new C5598g.a() { // from class: com.alibaba.sdk.android.emas.EmasSender.1
            @Override // com.alibaba.sdk.android.emas.C5598g.a
            /* renamed from: b */
            public void mo3484b() {
                EmasSender.this.background = false;
            }

            @Override // com.alibaba.sdk.android.emas.C5598g.a
            /* renamed from: c */
            public void mo3485c() {
                EmasSender.this.background = true;
                EmasSender.this.mCacheManager.flush();
            }
        });
        builder.context.registerActivityLifecycleCallbacks(c5598g);
    }
}
