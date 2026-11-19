package com.alibaba.sdk.android.emas;

import android.content.Context;
import android.os.Looper;
import com.alibaba.sdk.android.tbrest.SendService;
import com.alibaba.sdk.android.tbrest.request.BizRequest;
import com.alibaba.sdk.android.tbrest.request.UrlWrapper;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.emas.h */
/* loaded from: classes3.dex */
public class C5599h {

    /* renamed from: a */
    private static ThreadPoolExecutor f4060a = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new a());

    /* renamed from: a */
    private PreSendHandler f4061a;

    /* renamed from: b */
    private EmasSender f4062b;
    private C5594c mDiskCacheManager;

    /* renamed from: b */
    private boolean f4063b = false;

    /* renamed from: e */
    private int f4064e = 0;
    private SendService mSendService = new SendService();

    /* renamed from: com.alibaba.sdk.android.emas.h$a */
    public static class a implements RejectedExecutionHandler {
        private a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            if (runnable instanceof b) {
                ((b) runnable).m3532e();
            }
        }
    }

    /* renamed from: com.alibaba.sdk.android.emas.h$b */
    public class b implements Runnable {

        /* renamed from: a */
        private C5595d f4066a;

        /* renamed from: b */
        private boolean f4068b;

        /* renamed from: e */
        private int f4069e;

        public b(C5595d c5595d, boolean z10, int i10) {
            this.f4066a = c5595d;
            this.f4068b = z10;
            this.f4069e = i10;
        }

        /* renamed from: a */
        private boolean m3528a() {
            return (this.f4068b || !C5599h.this.f4062b.isBackground()) && C5599h.f4060a.getQueue().size() <= this.f4069e;
        }

        /* renamed from: b */
        private boolean m3529b() {
            return this.f4066a.m3500a() == EnumC5593b.DISK_CACHE;
        }

        /* renamed from: d */
        private void m3530d(C5595d c5595d) {
            if (C5599h.this.mDiskCacheManager == null) {
                return;
            }
            if (c5595d.m3500a() == EnumC5593b.DISK_CACHE) {
                C5599h.this.mDiskCacheManager.remove(c5595d);
            }
            if (m3528a()) {
                LogUtil.m3869d("SendManager trying send disk cache.");
                C5595d c5595d2 = C5599h.this.mDiskCacheManager.get();
                if (c5595d2 == null) {
                    LogUtil.m3869d("SendManager disk cache is empty.");
                    return;
                } else {
                    LogUtil.m3869d("SendManager sending disk cache.");
                    C5599h.this.m3518c(c5595d2);
                    return;
                }
            }
            LogUtil.m3869d("SendManager finish send. background: " + C5599h.this.f4062b.isBackground() + ", queue size: " + C5599h.f4060a.getQueue().size() + ", limit: " + this.f4069e);
        }

        /* renamed from: e */
        public void m3532e() {
            if (C5599h.this.mDiskCacheManager == null) {
                LogUtil.m3869d("SendManager send queue fill, disk cache not open, discard.");
                return;
            }
            if (m3529b()) {
                LogUtil.m3869d("SendManager send queue fill, already in disk cache. do nothing.");
                return;
            }
            LogUtil.m3869d("SendManager send queue fill, write into disk cache.");
            Runnable runnable = new Runnable() { // from class: com.alibaba.sdk.android.emas.h.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C5599h.this.mDiskCacheManager.add(b.this.m3531b());
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(runnable).start();
            } else {
                runnable.run();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] packRequest;
            if (this.f4066a.m3500a() == EnumC5593b.DISK_CACHE) {
                LogUtil.m3869d("SendManager send disk log, location:" + this.f4066a.getLocation());
            }
            List<C5596e> listOnHandlePreSend = C5599h.this.f4061a != null ? C5599h.this.f4061a.onHandlePreSend(this.f4066a.m3501a(), this.f4066a.m3500a()) : this.f4066a.m3501a();
            if (listOnHandlePreSend == null || listOnHandlePreSend.isEmpty()) {
                m3530d(this.f4066a);
                return;
            }
            try {
                packRequest = BizRequest.getPackRequest(C5599h.this.mSendService.context, C5599h.this.mSendService, m3527a(listOnHandlePreSend));
            } catch (Exception e10) {
                LogUtil.m3873w("SendManager pack request failed", e10);
                if (C5599h.this.mDiskCacheManager != null) {
                    C5599h.this.mDiskCacheManager.m3497b(this.f4066a);
                }
                packRequest = null;
            }
            if (packRequest == null) {
                LogUtil.m3869d("SendManager pack requst is null.");
                m3530d(this.f4066a);
            } else if (UrlWrapper.sendRequest(C5599h.this.mSendService, C5599h.this.mSendService.host, packRequest).isSuccess()) {
                m3530d(this.f4066a);
            } else if (C5599h.this.mDiskCacheManager == null) {
                LogUtil.m3869d("SendManager request failed. do nothing.");
            } else {
                LogUtil.m3869d("SendManager request failed. put into cache.");
                C5599h.this.mDiskCacheManager.add(this.f4066a);
            }
        }

        /* renamed from: b */
        public C5595d m3531b() {
            return this.f4066a;
        }

        /* renamed from: a */
        private Map<String, String> m3527a(List<C5596e> list) {
            HashMap map = new HashMap();
            for (C5596e c5596e : list) {
                StringBuilder sb2 = (StringBuilder) map.get(c5596e.f4055e);
                if (sb2 == null) {
                    map.put(c5596e.f4055e, new StringBuilder(c5596e.f4054d));
                } else {
                    sb2.append((char) 1);
                    sb2.append(c5596e.f4054d);
                }
            }
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), ((StringBuilder) entry.getValue()).toString());
            }
            return map2;
        }
    }

    public C5599h(EmasSender emasSender, C5594c c5594c) {
        this.f4062b = emasSender;
        this.mDiskCacheManager = c5594c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3518c(C5595d c5595d) {
        f4060a.execute(new b(c5595d, this.f4063b, this.f4064e));
    }

    /* renamed from: b */
    public void m3525b(C5596e c5596e) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c5596e);
        m3523a(arrayList);
    }

    /* renamed from: d */
    public void m3526d() {
        if (this.mDiskCacheManager != null && f4060a.getQueue().isEmpty()) {
            new Thread(new Runnable() { // from class: com.alibaba.sdk.android.emas.h.1
                @Override // java.lang.Runnable
                public void run() {
                    C5595d c5595d;
                    C5599h.this.mDiskCacheManager.clear();
                    if (C5599h.f4060a.getQueue().size() > C5599h.this.f4064e || (c5595d = C5599h.this.mDiskCacheManager.get()) == null) {
                        return;
                    }
                    C5599h.this.m3518c(c5595d);
                }
            }).start();
        }
    }

    public void init(Context context, String str, String str2, String str3, String str4, String str5) {
        this.mSendService.init(context.getApplicationContext(), str, str2, str3, str4, str5);
    }

    public void openHttp(boolean z10) {
        this.mSendService.openHttp = Boolean.valueOf(z10);
    }

    public void setHost(String str) {
        this.mSendService.changeHost(str);
    }

    public void setUserNick(String str) {
        this.mSendService.userNick = str;
    }

    /* renamed from: a */
    public void m3522a(String str) {
        this.mSendService.appSecret = str;
    }

    /* renamed from: a */
    public void m3521a(PreSendHandler preSendHandler) {
        this.f4061a = preSendHandler;
    }

    /* renamed from: a */
    public void m3524a(boolean z10) {
        this.f4063b = z10;
    }

    /* renamed from: a */
    public void m3520a(int i10) {
        if (i10 >= 10) {
            this.f4064e = 9;
        } else {
            this.f4064e = i10;
        }
    }

    /* renamed from: a */
    public void m3523a(List<C5596e> list) {
        m3518c(new C5595d(list));
    }

    /* renamed from: a */
    public SendService m3519a() {
        return this.mSendService;
    }
}
