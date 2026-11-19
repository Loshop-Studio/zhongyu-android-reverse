package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class ErrorResultImpl<R extends Result> extends PendingResult<R> {

    /* renamed from: g */
    public Result f11710g = null;

    /* renamed from: h */
    public int f11711h;

    /* renamed from: com.huawei.hms.support.api.ErrorResultImpl$a */
    public class RunnableC7323a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ ResultCallback f11712c;

        /* renamed from: d */
        public final /* synthetic */ ErrorResultImpl f11713d;

        public RunnableC7323a(ResultCallback resultCallback, ErrorResultImpl errorResultImpl) {
            this.f11712c = resultCallback;
            this.f11713d = errorResultImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallback resultCallback = this.f11712c;
            ErrorResultImpl errorResultImpl = ErrorResultImpl.this;
            resultCallback.onResult(errorResultImpl.m8672b(errorResultImpl.f11711h, this.f11713d));
        }
    }

    public ErrorResultImpl(int i10) {
        this.f11711h = i10;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        return (R) await(0L, null);
    }

    /* renamed from: b */
    public final Result m8672b(int i10, ErrorResultImpl errorResultImpl) {
        Type genericSuperclass = errorResultImpl.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        try {
            Result result = (Result) GenericTypeReflector.getType(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).newInstance();
            this.f11710g = result;
            result.setStatus(new Status(i10));
        } catch (IllegalAccessException unused) {
            HMSLog.m8725e("ErrorResultImpl", "IllegalAccessException");
        } catch (InstantiationException unused2) {
            HMSLog.m8725e("ErrorResultImpl", "InstantiationException");
        }
        return this.f11710g;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    /* renamed from: d */
    public void m8673d(Looper looper, ResultCallback resultCallback, ErrorResultImpl errorResultImpl) {
        if (looper == null) {
            looper = Looper.myLooper();
        }
        new Handler(looper).post(new RunnableC7323a(resultCallback, errorResultImpl));
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j10, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) m8672b(this.f11711h, this);
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j10, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        m8673d(looper, resultCallback, this);
    }
}
