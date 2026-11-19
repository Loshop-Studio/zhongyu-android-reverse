package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

@ExperimentalRoomApi
/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;
    private final Map<Integer, String> clientNames = new LinkedHashMap();
    private final RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback callback, Object cookie) {
            AbstractC9979u.m20294g(callback, "callback");
            AbstractC9979u.m20294g(cookie, "cookie");
            this.this$0.getClientNames$room_runtime_release().remove((Integer) cookie);
        }
    };
    private final IMultiInstanceInvalidationService.Stub binder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i10, String[] tables) {
            AbstractC9979u.m20294g(tables, "tables");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = this.this$0.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (callbackList$room_runtime_release) {
                String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w(Room.LOG_TAG, "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i11);
                        AbstractC9979u.m20292e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(num);
                        if (i10 != iIntValue && AbstractC9979u.m20289b(str, str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i11)).onInvalidation(tables);
                                C10786q c10786q = C10786q.f26013a;
                            } catch (RemoteException e10) {
                                Log.w(Room.LOG_TAG, "Error invoking a remote callback", e10);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                C10786q c10786q2 = C10786q.f26013a;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback callback, String str) {
            AbstractC9979u.m20294g(callback, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = this.this$0.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (callbackList$room_runtime_release) {
                try {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() + 1);
                    int maxClientId$room_runtime_release = multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                    if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, Integer.valueOf(maxClientId$room_runtime_release))) {
                        multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId$room_runtime_release), str);
                        i10 = maxClientId$room_runtime_release;
                    } else {
                        multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() - 1);
                        multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i10;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback callback, int i10) {
            AbstractC9979u.m20294g(callback, "callback");
            RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList$room_runtime_release = this.this$0.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(i10));
            }
        }
    };

    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> getCallbackList$room_runtime_release() {
        return this.callbackList;
    }

    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.clientNames;
    }

    public final int getMaxClientId$room_runtime_release() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC9979u.m20294g(intent, "intent");
        return this.binder;
    }

    public final void setMaxClientId$room_runtime_release(int i10) {
        this.maxClientId = i10;
    }
}
