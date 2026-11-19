package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.InterfaceC0628l;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    int f3904a = 0;

    /* renamed from: b */
    final HashMap<Integer, String> f3905b = new HashMap<>();

    /* renamed from: c */
    final RemoteCallbackList<InterfaceC0626k> f3906c = new RemoteCallbackListC0604a();

    /* renamed from: d */
    private final InterfaceC0628l.a f3907d = new BinderC0605b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class RemoteCallbackListC0604a extends RemoteCallbackList<InterfaceC0626k> {
        RemoteCallbackListC0604a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC0626k interfaceC0626k, Object obj) {
            MultiInstanceInvalidationService.this.f3905b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class BinderC0605b extends InterfaceC0628l.a {
        BinderC0605b() {
        }

        @Override // androidx.room.InterfaceC0628l
        /* renamed from: l */
        public int mo3472l(InterfaceC0626k interfaceC0626k, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f3906c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i4 = multiInstanceInvalidationService.f3904a + 1;
                multiInstanceInvalidationService.f3904a = i4;
                if (multiInstanceInvalidationService.f3906c.register(interfaceC0626k, Integer.valueOf(i4))) {
                    MultiInstanceInvalidationService.this.f3905b.put(Integer.valueOf(i4), str);
                    return i4;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f3904a--;
                return 0;
            }
        }

        @Override // androidx.room.InterfaceC0628l
        /* renamed from: s */
        public void mo3473s(int i4, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f3906c) {
                String str = MultiInstanceInvalidationService.this.f3905b.get(Integer.valueOf(i4));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f3906c.beginBroadcast();
                for (int i5 = 0; i5 < iBeginBroadcast; i5++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f3906c.getBroadcastCookie(i5)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f3905b.get(Integer.valueOf(iIntValue));
                        if (i4 != iIntValue && str.equals(str2)) {
                            try {
                                ((InterfaceC0626k) MultiInstanceInvalidationService.this.f3906c.getBroadcastItem(i5)).mo3597i(strArr);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f3906c.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.InterfaceC0628l
        /* renamed from: w */
        public void mo3474w(InterfaceC0626k interfaceC0626k, int i4) {
            synchronized (MultiInstanceInvalidationService.this.f3906c) {
                MultiInstanceInvalidationService.this.f3906c.unregister(interfaceC0626k);
                MultiInstanceInvalidationService.this.f3905b.remove(Integer.valueOf(i4));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f3907d;
    }
}
