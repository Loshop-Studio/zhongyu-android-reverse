package p108m4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.zykj.message.server.MessageServerBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m4.c */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC7404c extends Service implements InterfaceC7405d {

    /* renamed from: a */
    public static final a f9440a = new a(null);

    /* renamed from: m4.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str = intent != null ? intent.getPackage() : null;
        if (str == null) {
            str = "未知应用";
        }
        return new MessageServerBinder(str, this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        System.out.println((Object) "MessageService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        System.out.println((Object) "MessageService onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i6, int i7) {
        System.out.println((Object) "MessageService onStartCommand");
        return super.onStartCommand(intent, i6, i7);
    }
}
