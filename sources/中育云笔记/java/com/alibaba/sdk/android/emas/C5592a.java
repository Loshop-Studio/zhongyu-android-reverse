package com.alibaba.sdk.android.emas;

import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.emas.a */
/* loaded from: classes3.dex */
public class C5592a implements Cache<C5596e> {

    /* renamed from: a */
    private int f4038a;

    /* renamed from: a */
    private List<C5596e> f4039a;

    /* renamed from: b */
    private int f4040b;

    /* renamed from: c */
    private int f4041c = 0;
    private C5599h mSendManager;

    public C5592a(C5599h c5599h, int i10, int i11) {
        this.f4038a = i10;
        this.f4040b = i11;
        this.mSendManager = c5599h;
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5596e get() {
        return null;
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    public void clear() {
    }

    public synchronized void flush() {
        List<C5596e> list = this.f4039a;
        if (list != null && !list.isEmpty()) {
            LogUtil.m3869d("CacheManager flush. immediately send.");
            m3486a();
        }
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean remove(C5596e c5596e) {
        return false;
    }

    @Override // com.alibaba.sdk.android.emas.Cache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void add(C5596e c5596e) {
        try {
            if (this.f4039a == null) {
                this.f4039a = new ArrayList();
            }
            this.f4039a.add(c5596e);
            this.f4041c += c5596e.length();
            if (this.f4039a.size() >= this.f4038a || this.f4041c >= this.f4040b) {
                LogUtil.m3869d("CacheManager satisfy limit. immediately send. size: " + this.f4039a.size() + ", current capacity: " + this.f4041c);
                m3486a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    private void m3486a() {
        this.mSendManager.m3523a(this.f4039a);
        this.f4039a = null;
        this.f4041c = 0;
    }
}
