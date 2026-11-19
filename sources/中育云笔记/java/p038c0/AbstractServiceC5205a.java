package p038c0;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

/* renamed from: c0.a */
/* loaded from: classes3.dex */
public abstract class AbstractServiceC5205a extends Service implements InterfaceC5208d, InterfaceC5209e {
    private static final String TAG = "MPS:AliyunMessageIntentService";
    private Messenger messenger = new Messenger(new HandlerC5211g(this));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.messenger.getBinder();
    }

    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ALog.m10118e(TAG, "Action is null, return.", new Object[0]);
            return;
        }
        ALog.m10116d(TAG, "AgooMessageIntentService onHandleIntent action: " + action, new Object[0]);
        if ("com.alibaba.sdk.android.push.RECEIVE".equals(action)) {
            AbstractC5212h.m2774b(getApplicationContext(), intent, this, this);
            return;
        }
        if (AbstractC5206b.NOTIFICATION_OPENED_ACTION.equals(action)) {
            AbstractC5212h.m2773a(getApplicationContext(), intent, this);
        } else if (AbstractC5206b.NOTIFICATION_REMOVED_ACTION.equals(action)) {
            AbstractC5212h.m2777e(getApplicationContext(), intent, this);
        } else {
            ALog.m10118e(TAG, "Invalid action", new Object[0]);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        onHandleIntent(intent);
        return 2;
    }
}
