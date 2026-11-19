package af;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import org.eclipse.paho.android.service.MqttService;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttPingSender;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;

/* renamed from: af.a */
/* loaded from: classes6.dex */
public class C0118a implements MqttPingSender {

    /* renamed from: a */
    public ClientComms f135a;

    /* renamed from: b */
    public MqttService f136b;

    /* renamed from: c */
    public BroadcastReceiver f137c;

    /* renamed from: d */
    public C0118a f138d;

    /* renamed from: e */
    public PendingIntent f139e;

    /* renamed from: f */
    public volatile boolean f140f = false;

    /* renamed from: af.a$a */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public PowerManager.WakeLock f141a;

        /* renamed from: b */
        public final String f142b;

        /* renamed from: af.a$a$a, reason: collision with other inner class name */
        public class C12058a implements IMqttActionListener {
            public C12058a() {
            }

            @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
            public void onFailure(IMqttToken iMqttToken, Throwable th) {
                String unused = a.this.f142b;
                System.currentTimeMillis();
                a.this.f141a.release();
            }

            @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
            public void onSuccess(IMqttToken iMqttToken) {
                String unused = a.this.f142b;
                System.currentTimeMillis();
                a.this.f141a.release();
            }
        }

        public a() {
            this.f142b = "MqttService.client." + C0118a.this.f138d.f135a.getClient().getClientId();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            System.currentTimeMillis();
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C0118a.this.f136b.getSystemService("power")).newWakeLock(1, this.f142b);
            this.f141a = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
            if (C0118a.this.f135a.checkForActivity(new C12058a()) == null && this.f141a.isHeld()) {
                this.f141a.release();
            }
        }
    }

    public C0118a(MqttService mqttService) {
        if (mqttService == null) {
            throw new IllegalArgumentException("Neither service nor client can be null.");
        }
        this.f136b = mqttService;
        this.f138d = this;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void init(ClientComms clientComms) {
        this.f135a = clientComms;
        this.f137c = new a();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void schedule(long j10) {
        ((AlarmManager) this.f136b.getSystemService(NotificationCompat.CATEGORY_ALARM)).setExactAndAllowWhileIdle(0, System.currentTimeMillis() + j10, this.f139e);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void start() {
        String str = "MqttService.pingSender." + this.f135a.getClient().getClientId();
        this.f136b.registerReceiver(this.f137c, new IntentFilter(str));
        this.f139e = PendingIntent.getBroadcast(this.f136b, 0, new Intent(str), 134217728);
        schedule(this.f135a.getKeepAlive());
        this.f140f = true;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void stop() {
        this.f135a.getClient().getClientId();
        if (this.f140f) {
            if (this.f139e != null) {
                ((AlarmManager) this.f136b.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f139e);
            }
            this.f140f = false;
            try {
                this.f136b.unregisterReceiver(this.f137c);
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
