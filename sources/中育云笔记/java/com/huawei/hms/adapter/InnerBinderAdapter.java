package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public class InnerBinderAdapter extends BinderAdapter {

    /* renamed from: l */
    public static final Object f11329l = new Object();

    /* renamed from: m */
    public static BinderAdapter f11330m;

    public InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.m8727i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        synchronized (f11329l) {
            try {
                if (f11330m == null) {
                    f11330m = new InnerBinderAdapter(context, str, str2);
                }
                binderAdapter = f11330m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    /* renamed from: j */
    public int mo8318j() {
        return 2001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    /* renamed from: k */
    public int mo8319k() {
        return 2002;
    }
}
