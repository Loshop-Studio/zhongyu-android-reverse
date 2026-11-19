package com.taobao.accs.messenger;

import android.app.Service;
import android.os.Messenger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public abstract class MessengerService extends Service {
    public static final String INTENT = "intent";

    /* renamed from: a */
    private ExecutorService f13028a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private Messenger f13029b = new Messenger(new HandlerC7635b(this));

    /* renamed from: a */
    public static /* synthetic */ void m9999a() {
    }
}
