package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class UiMessageUtils implements Handler.Callback {
    private static final boolean DEBUG = UtilsBridge.isAppDebug();
    private static final String TAG = "UiMessageUtils";
    private final List<UiMessageCallback> mDefensiveCopyList;
    private final Handler mHandler;
    private final SparseArray<List<UiMessageCallback>> mListenersSpecific;
    private final List<UiMessageCallback> mListenersUniversal;
    private final UiMessage mMessage;

    public static final class LazyHolder {
        private static final UiMessageUtils INSTANCE = new UiMessageUtils();

        private LazyHolder() {
        }
    }

    public static final class UiMessage {
        private Message mMessage;

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(Message message) {
            this.mMessage = message;
        }

        public int getId() {
            return this.mMessage.what;
        }

        public Object getObject() {
            return this.mMessage.obj;
        }

        public String toString() {
            return "{ id=" + getId() + ", obj=" + getObject() + " }";
        }

        private UiMessage(Message message) {
            this.mMessage = message;
        }
    }

    public interface UiMessageCallback {
        void handleMessage(@NonNull UiMessage uiMessage);
    }

    public static UiMessageUtils getInstance() {
        return LazyHolder.INSTANCE;
    }

    private void logMessageHandling(@NonNull UiMessage uiMessage) {
        List<UiMessageCallback> list = this.mListenersSpecific.get(uiMessage.getId());
        if ((list == null || list.size() == 0) && this.mListenersUniversal.size() == 0) {
            Log.w(TAG, "Delivering FAILED for message ID " + uiMessage.getId() + ". No listeners. " + uiMessage.toString());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Delivering message ID ");
        sb.append(uiMessage.getId());
        sb.append(", Specific listeners: ");
        if (list == null || list.size() == 0) {
            sb.append(0);
        } else {
            sb.append(list.size());
            sb.append(" [");
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(list.get(i4).getClass().getSimpleName());
                if (i4 < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        sb.append(", Universal listeners: ");
        synchronized (this.mListenersUniversal) {
            if (this.mListenersUniversal.size() == 0) {
                sb.append(0);
            } else {
                sb.append(this.mListenersUniversal.size());
                sb.append(" [");
                for (int i5 = 0; i5 < this.mListenersUniversal.size(); i5++) {
                    sb.append(this.mListenersUniversal.get(i5).getClass().getSimpleName());
                    if (i5 < this.mListenersUniversal.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("], Message: ");
            }
        }
        sb.append(uiMessage.toString());
    }

    public void addListener(int i4, @NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersSpecific) {
            List<UiMessageCallback> arrayList = this.mListenersSpecific.get(i4);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mListenersSpecific.put(i4, arrayList);
            }
            if (!arrayList.contains(uiMessageCallback)) {
                arrayList.add(uiMessageCallback);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.mMessage.setMessage(message);
        if (DEBUG) {
            logMessageHandling(this.mMessage);
        }
        synchronized (this.mListenersSpecific) {
            List<UiMessageCallback> list = this.mListenersSpecific.get(message.what);
            if (list != null) {
                if (list.size() == 0) {
                    this.mListenersSpecific.remove(message.what);
                } else {
                    this.mDefensiveCopyList.addAll(list);
                    Iterator<UiMessageCallback> it = this.mDefensiveCopyList.iterator();
                    while (it.hasNext()) {
                        it.next().handleMessage(this.mMessage);
                    }
                    this.mDefensiveCopyList.clear();
                }
            }
        }
        synchronized (this.mListenersUniversal) {
            if (this.mListenersUniversal.size() > 0) {
                this.mDefensiveCopyList.addAll(this.mListenersUniversal);
                Iterator<UiMessageCallback> it2 = this.mDefensiveCopyList.iterator();
                while (it2.hasNext()) {
                    it2.next().handleMessage(this.mMessage);
                }
                this.mDefensiveCopyList.clear();
            }
        }
        this.mMessage.setMessage(null);
        return true;
    }

    public void removeListener(@NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersUniversal) {
            if (DEBUG && !this.mListenersUniversal.contains(uiMessageCallback)) {
                Log.w(TAG, "Trying to remove a listener that is not registered. " + uiMessageCallback.toString());
            }
            this.mListenersUniversal.remove(uiMessageCallback);
        }
    }

    public void removeListeners(int i4) {
        List<UiMessageCallback> list;
        if (DEBUG && ((list = this.mListenersSpecific.get(i4)) == null || list.size() == 0)) {
            Log.w(TAG, "Trying to remove specific listeners that are not registered. ID " + i4);
        }
        synchronized (this.mListenersSpecific) {
            this.mListenersSpecific.delete(i4);
        }
    }

    public final void send(int i4) {
        this.mHandler.sendEmptyMessage(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UiMessageUtils() {
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        this.mMessage = new UiMessage(null);
        this.mListenersSpecific = new SparseArray<>();
        this.mListenersUniversal = new ArrayList();
        this.mDefensiveCopyList = new ArrayList();
    }

    public final void send(int i4, @NonNull Object obj) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i4, obj));
    }

    public void removeListener(int i4, @NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersSpecific) {
            List<UiMessageCallback> list = this.mListenersSpecific.get(i4);
            if (list != null && !list.isEmpty()) {
                if (DEBUG && !list.contains(uiMessageCallback)) {
                    Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i4 + ", " + uiMessageCallback);
                    return;
                }
                list.remove(uiMessageCallback);
            } else if (DEBUG) {
                Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i4 + ", " + uiMessageCallback);
            }
        }
    }

    public void addListener(@NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersUniversal) {
            if (!this.mListenersUniversal.contains(uiMessageCallback)) {
                this.mListenersUniversal.add(uiMessageCallback);
            } else if (DEBUG) {
                Log.w(TAG, "Listener is already added. " + uiMessageCallback.toString());
            }
        }
    }
}
