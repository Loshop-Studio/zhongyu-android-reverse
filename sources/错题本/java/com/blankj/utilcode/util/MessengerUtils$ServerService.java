package com.blankj.utilcode.util;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class MessengerUtils$ServerService extends Service {

    /* renamed from: d */
    public static final /* synthetic */ int f2106d = 0;

    /* renamed from: a */
    public final ConcurrentHashMap f2107a = new ConcurrentHashMap();

    /* renamed from: b */
    public final HandlerC3388h f2108b;

    /* renamed from: c */
    public final Messenger f2109c;

    public MessengerUtils$ServerService() {
        HandlerC3388h handlerC3388h = new HandlerC3388h(this, 0);
        this.f2108b = handlerC3388h;
        this.f2109c = new Messenger(handlerC3388h);
    }

    /* renamed from: a */
    public final void m2291a(Message message) {
        Message messageObtain = Message.obtain(message);
        for (Messenger messenger : this.f2107a.values()) {
            if (messenger != null) {
                try {
                    messenger.send(Message.obtain(messageObtain));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
        messageObtain.recycle();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2109c.getBinder();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i8) {
        Bundle extras;
        String string;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            C3391k c3391k = C3391k.f2166b;
            if (i9 >= 26) {
                ((NotificationManager) AbstractC3382c.m2303d().getSystemService("notification")).createNotificationChannel(c3391k.f2167a);
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(AbstractC3382c.m2303d());
            if (i9 >= 26) {
                builder.setChannelId(c3391k.f2167a.getId());
            }
            startForeground(1, builder.build());
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            Message messageObtain = Message.obtain(this.f2108b, 2);
            messageObtain.replyTo = this.f2109c;
            messageObtain.setData(extras);
            m2291a(messageObtain);
            Bundle data = messageObtain.getData();
            if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && AbstractC3389i.f2164a.get(string) != null) {
                throw new ClassCastException();
            }
        }
        return 2;
    }
}
