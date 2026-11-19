package com.taobao.accs.messenger;

import android.app.Service;
import android.os.Messenger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class MessengerService extends Service {
    public static final String INTENT = "intent";

    /* renamed from: a */
    private ExecutorService f7630a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private Messenger f7631b = new Messenger(new HandlerC1738b(this));

    /* renamed from: a */
    static /* synthetic */ void m5973a() {
    }
}
