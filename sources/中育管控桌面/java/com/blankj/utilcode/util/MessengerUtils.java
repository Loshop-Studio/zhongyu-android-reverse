package com.blankj.utilcode.util;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.blankj.utilcode.util.AbstractC4673x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p087k.AbstractC6619r;

/* loaded from: classes3.dex */
public abstract class MessengerUtils {

    /* renamed from: a */
    public static ConcurrentHashMap f1984a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map f1985b = new HashMap();

    public static class ServerService extends Service {

        /* renamed from: a */
        public final ConcurrentHashMap f1986a = new ConcurrentHashMap();

        /* renamed from: b */
        public final Handler f1987b;

        /* renamed from: c */
        public final Messenger f1988c;

        /* renamed from: com.blankj.utilcode.util.MessengerUtils$ServerService$a */
        public class HandlerC4623a extends Handler {
            public HandlerC4623a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) throws RemoteException {
                int i6 = message.what;
                if (i6 == 0) {
                    ServerService.this.f1986a.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i6 == 1) {
                    ServerService.this.f1986a.remove(Integer.valueOf(message.arg1));
                } else if (i6 != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.m2067e(message);
                    ServerService.this.m2066d(message);
                }
            }
        }

        public ServerService() {
            HandlerC4623a handlerC4623a = new HandlerC4623a();
            this.f1987b = handlerC4623a;
            this.f1988c = new Messenger(handlerC4623a);
        }

        /* renamed from: d */
        public final void m2066d(Message message) {
            String string;
            Bundle data = message.getData();
            if (data == null || (string = data.getString("MESSENGER_UTILS")) == null) {
                return;
            }
            AbstractC6619r.m7572a(MessengerUtils.f1984a.get(string));
        }

        /* renamed from: e */
        public final void m2067e(Message message) throws RemoteException {
            Message messageObtain = Message.obtain(message);
            for (Messenger messenger : this.f1986a.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(messageObtain));
                    } catch (RemoteException e6) {
                        e6.printStackTrace();
                    }
                }
            }
            messageObtain.recycle();
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return this.f1988c.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i6, int i7) throws RemoteException {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, AbstractC4663o0.m2337v(AbstractC4673x.a.f2145b, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message messageObtain = Message.obtain(this.f1987b, 2);
                messageObtain.replyTo = this.f1988c;
                messageObtain.setData(extras);
                m2067e(messageObtain);
                m2066d(messageObtain);
            }
            return 2;
        }
    }
}
