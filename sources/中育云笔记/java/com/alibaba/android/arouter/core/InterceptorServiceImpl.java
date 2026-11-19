package com.alibaba.android.arouter.core;

import android.content.Context;
import androidx.work.WorkRequest;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.thread.CancelableCountDownLatch;
import com.alibaba.android.arouter.utils.MapUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Route(path = "/arouter/service/interceptor")
/* loaded from: classes3.dex */
public class InterceptorServiceImpl implements InterceptorService {
    private static boolean interceptorHasInit;
    private static final Object interceptorInitLock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static void _execute(final int i10, final CancelableCountDownLatch cancelableCountDownLatch, final Postcard postcard) {
        if (i10 < Warehouse.interceptors.size()) {
            Warehouse.interceptors.get(i10).process(postcard, new InterceptorCallback() { // from class: com.alibaba.android.arouter.core.InterceptorServiceImpl.2
                @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
                public void onContinue(Postcard postcard2) {
                    cancelableCountDownLatch.countDown();
                    InterceptorServiceImpl._execute(i10 + 1, cancelableCountDownLatch, postcard2);
                }

                @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
                public void onInterrupt(Throwable th) {
                    Postcard postcard2 = postcard;
                    if (th == null) {
                        th = new HandlerException("No message.");
                    }
                    postcard2.setTag(th);
                    cancelableCountDownLatch.cancel();
                }
            });
        }
    }

    private static void checkInterceptorsInitStatus() {
        synchronized (interceptorInitLock) {
            while (!interceptorHasInit) {
                try {
                    interceptorInitLock.wait(WorkRequest.MIN_BACKOFF_MILLIS);
                } catch (InterruptedException e10) {
                    throw new HandlerException("ARouter::Interceptor init cost too much time error! reason = [" + e10.getMessage() + "]");
                }
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.service.InterceptorService
    public void doInterceptions(final Postcard postcard, final InterceptorCallback interceptorCallback) {
        if (!MapUtils.isNotEmpty(Warehouse.interceptorsIndex)) {
            interceptorCallback.onContinue(postcard);
            return;
        }
        checkInterceptorsInitStatus();
        if (interceptorHasInit) {
            LogisticsCenter.executor.execute(new Runnable() { // from class: com.alibaba.android.arouter.core.InterceptorServiceImpl.1
                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    CancelableCountDownLatch cancelableCountDownLatch = new CancelableCountDownLatch(Warehouse.interceptors.size());
                    try {
                        InterceptorServiceImpl._execute(0, cancelableCountDownLatch, postcard);
                        cancelableCountDownLatch.await(postcard.getTimeout(), TimeUnit.SECONDS);
                        if (cancelableCountDownLatch.getCount() > 0) {
                            interceptorCallback.onInterrupt(new HandlerException("The interceptor processing timed out."));
                        } else if (postcard.getTag() != null) {
                            interceptorCallback.onInterrupt((Throwable) postcard.getTag());
                        } else {
                            interceptorCallback.onContinue(postcard);
                        }
                    } catch (Exception e10) {
                        interceptorCallback.onInterrupt(e10);
                    }
                }
            });
        } else {
            interceptorCallback.onInterrupt(new HandlerException("Interceptors initialization takes too much time."));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(final Context context) {
        LogisticsCenter.executor.execute(new Runnable() { // from class: com.alibaba.android.arouter.core.InterceptorServiceImpl.3
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                if (MapUtils.isNotEmpty(Warehouse.interceptorsIndex)) {
                    Iterator<Map.Entry<Integer, Class<? extends IInterceptor>>> it = Warehouse.interceptorsIndex.entrySet().iterator();
                    while (it.hasNext()) {
                        Class<? extends IInterceptor> value = it.next().getValue();
                        try {
                            IInterceptor iInterceptorNewInstance = value.getConstructor(null).newInstance(null);
                            iInterceptorNewInstance.init(context);
                            Warehouse.interceptors.add(iInterceptorNewInstance);
                        } catch (Exception e10) {
                            throw new HandlerException("ARouter::ARouter init interceptor error! name = [" + value.getName() + "], reason = [" + e10.getMessage() + "]");
                        }
                    }
                    boolean unused = InterceptorServiceImpl.interceptorHasInit = true;
                    ARouter.logger.info("ARouter::", "ARouter interceptors init over.");
                    synchronized (InterceptorServiceImpl.interceptorInitLock) {
                        InterceptorServiceImpl.interceptorInitLock.notifyAll();
                    }
                }
            }
        });
    }
}
