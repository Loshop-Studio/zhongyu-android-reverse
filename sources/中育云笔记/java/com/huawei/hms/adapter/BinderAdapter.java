package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* loaded from: classes5.dex */
public class BinderAdapter implements ServiceConnection {

    /* renamed from: c */
    public final Context f11313c;

    /* renamed from: d */
    public final String f11314d;

    /* renamed from: e */
    public final String f11315e;

    /* renamed from: f */
    public BinderCallBack f11316f;

    /* renamed from: g */
    public IBinder f11317g;

    /* renamed from: h */
    public final Object f11318h = new Object();

    /* renamed from: i */
    public boolean f11319i = false;

    /* renamed from: j */
    public Handler f11320j = null;

    /* renamed from: k */
    public Handler f11321k = null;

    public interface BinderCallBack {
        void onBinderFailed(int i10);

        void onBinderFailed(int i10, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.f11313c = context;
        this.f11314d = str;
        this.f11315e = str2;
    }

    /* renamed from: a */
    public final void m8311a() {
        if (TextUtils.isEmpty(this.f11314d) || TextUtils.isEmpty(this.f11315e)) {
            m8315g();
        }
        Intent intent = new Intent(this.f11314d);
        try {
            intent.setPackage(this.f11315e);
        } catch (IllegalArgumentException unused) {
            HMSLog.m8725e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
            m8315g();
        }
        synchronized (this.f11318h) {
            try {
                if (this.f11313c.bindService(intent, this, 1)) {
                    m8317i();
                } else {
                    this.f11319i = true;
                    m8315g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack == null) {
            return;
        }
        this.f11316f = binderCallBack;
        m8311a();
    }

    /* renamed from: d */
    public final void m8312d() {
        BinderCallBack binderCallBackM8316h = m8316h();
        if (binderCallBackM8316h != null) {
            binderCallBackM8316h.onBinderFailed(-1);
        }
    }

    /* renamed from: e */
    public final void m8313e() {
        synchronized (this.f11318h) {
            try {
                Handler handler = this.f11320j;
                if (handler != null) {
                    handler.removeMessages(mo8318j());
                    this.f11320j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m8314f() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null || message.what != BinderAdapter.this.mo8319k()) {
                    return false;
                }
                HMSLog.m8727i("BinderAdapter", "The serviceConnection has been bind for 1800s, need to unbind.");
                BinderAdapter.this.unBind();
                BinderCallBack binderCallBackM8316h = BinderAdapter.this.m8316h();
                if (binderCallBackM8316h == null) {
                    return true;
                }
                binderCallBackM8316h.onTimedDisconnected();
                return true;
            }
        });
        this.f11321k = handler;
        handler.sendEmptyMessageDelayed(mo8319k(), 1800000L);
    }

    /* renamed from: g */
    public final void m8315g() {
        HMSLog.m8725e("BinderAdapter", "In connect, bind core service fail");
        try {
            ComponentName componentName = new ComponentName(this.f11313c.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());
            BinderCallBack binderCallBackM8316h = m8316h();
            if (binderCallBackM8316h != null) {
                binderCallBackM8316h.onBinderFailed(-1, intent);
            }
        } catch (RuntimeException e10) {
            HMSLog.m8725e("BinderAdapter", "getBindFailPendingIntent failed " + e10.getMessage());
        }
    }

    public String getServiceAction() {
        return this.f11314d;
    }

    public IBinder getServiceBinder() {
        return this.f11317g;
    }

    /* renamed from: h */
    public final BinderCallBack m8316h() {
        return this.f11316f;
    }

    /* renamed from: i */
    public final void m8317i() {
        Handler handler = this.f11320j;
        if (handler != null) {
            handler.removeMessages(mo8318j());
        } else {
            this.f11320j = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message == null || message.what != BinderAdapter.this.mo8318j()) {
                        return false;
                    }
                    HMSLog.m8725e("BinderAdapter", "In connect, bind core service time out");
                    BinderAdapter.this.m8312d();
                    return true;
                }
            });
        }
        this.f11320j.sendEmptyMessageDelayed(mo8318j(), WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* renamed from: j */
    public int mo8318j() {
        return 0;
    }

    /* renamed from: k */
    public int mo8319k() {
        return 0;
    }

    /* renamed from: l */
    public final void m8320l() {
        HMSLog.m8722d("BinderAdapter", "removeDelayDisconnectTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f11321k;
                if (handler != null) {
                    handler.removeMessages(mo8319k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        HMSLog.m8725e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.f11319i) {
            this.f11319i = false;
            return;
        }
        unBind();
        m8313e();
        BinderCallBack binderCallBackM8316h = m8316h();
        if (binderCallBackM8316h != null) {
            binderCallBackM8316h.onNullBinding(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.m8727i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.f11317g = iBinder;
        m8313e();
        BinderCallBack binderCallBackM8316h = m8316h();
        if (binderCallBackM8316h != null) {
            binderCallBackM8316h.onServiceConnected(componentName, iBinder);
        }
        m8314f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.m8727i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack binderCallBackM8316h = m8316h();
        if (binderCallBackM8316h != null) {
            binderCallBackM8316h.onServiceDisconnected(componentName);
        }
        m8320l();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f11313c, this);
    }

    public void updateDelayTask() {
        HMSLog.m8722d("BinderAdapter", "updateDelayTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f11321k;
                if (handler != null) {
                    handler.removeMessages(mo8319k());
                    this.f11321k.sendEmptyMessageDelayed(mo8319k(), 1800000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
