package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public class OuterBinderAdapter extends BinderAdapter {

    /* renamed from: l */
    public static final Object f11331l = new Object();

    /* renamed from: m */
    public static BinderAdapter f11332m;

    /* renamed from: n */
    public static String f11333n;

    /* renamed from: o */
    public static String f11334o;

    public OuterBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.m8727i("OuterBinderAdapter", "OuterBinderAdapter getInstance.");
        synchronized (f11331l) {
            try {
                if (f11332m == null) {
                    f11333n = str;
                    f11334o = str2;
                    f11332m = new OuterBinderAdapter(context, str, str2);
                } else if (!Objects.equal(f11333n, str) || !Objects.equal(f11334o, str2)) {
                    HMSLog.m8727i("OuterBinderAdapter", "OuterBinderAdapter getInstance refresh adapter");
                    f11333n = str;
                    f11334o = str2;
                    f11332m.unBind();
                    f11332m = new OuterBinderAdapter(context, str, str2);
                }
                binderAdapter = f11332m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    /* renamed from: j */
    public int mo8318j() {
        return 1001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    /* renamed from: k */
    public int mo8319k() {
        return 1002;
    }
}
