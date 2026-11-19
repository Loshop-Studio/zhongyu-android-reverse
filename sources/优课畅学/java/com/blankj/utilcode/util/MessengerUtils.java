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
import com.blankj.utilcode.util.AbstractC5384u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class MessengerUtils {

    /* renamed from: a */
    public static ConcurrentHashMap f2617a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map f2618b = new HashMap();

    public static class ServerService extends Service {

        /* renamed from: a */
        public final ConcurrentHashMap f2619a = new ConcurrentHashMap();

        /* renamed from: b */
        public final Handler f2620b;

        /* renamed from: c */
        public final Messenger f2621c;

        /* renamed from: com.blankj.utilcode.util.MessengerUtils$ServerService$a */
        public class HandlerC5338a extends Handler {
            public HandlerC5338a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) throws RemoteException {
                int i10 = message.what;
                if (i10 == 0) {
                    ServerService.this.f2619a.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i10 == 1) {
                    ServerService.this.f2619a.remove(Integer.valueOf(message.arg1));
                } else if (i10 != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.m2353e(message);
                    ServerService.this.m2352d(message);
                }
            }
        }

        public ServerService() {
            HandlerC5338a handlerC5338a = new HandlerC5338a();
            this.f2620b = handlerC5338a;
            this.f2621c = new Messenger(handlerC5338a);
        }

        /* renamed from: d */
        public final void m2352d(Message message) {
            String string;
            Bundle data = message.getData();
            if (data == null || (string = data.getString("MESSENGER_UTILS")) == null) {
                return;
            }
            AbstractC5379p.m2596a(MessengerUtils.f2617a.get(string));
        }

        /* renamed from: e */
        public final void m2353e(Message message) throws RemoteException {
            Message messageObtain = Message.obtain(message);
            for (Messenger messenger : this.f2619a.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(messageObtain));
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            messageObtain.recycle();
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return this.f2621c.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i10, int i11) throws RemoteException {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, AbstractC5372k0.m2563s(AbstractC5384u.a.f2764b, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message messageObtain = Message.obtain(this.f2620b, 2);
                messageObtain.replyTo = this.f2621c;
                messageObtain.setData(extras);
                m2353e(messageObtain);
                m2352d(messageObtain);
            }
            return 2;
        }
    }
}
