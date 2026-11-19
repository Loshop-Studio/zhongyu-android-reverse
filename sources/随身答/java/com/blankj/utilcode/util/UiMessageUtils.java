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

/* loaded from: classes3.dex */
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
        uiMessage.getId();
        if (list != null && list.size() != 0) {
            list.size();
            for (int i9 = 0; i9 < list.size(); i9++) {
                list.get(i9).getClass();
                list.size();
            }
        }
        synchronized (this.mListenersUniversal) {
            try {
                if (this.mListenersUniversal.size() != 0) {
                    this.mListenersUniversal.size();
                    for (int i10 = 0; i10 < this.mListenersUniversal.size(); i10++) {
                        this.mListenersUniversal.get(i10).getClass();
                        this.mListenersUniversal.size();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        uiMessage.toString();
    }

    public void addListener(int i9, @NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersSpecific) {
            try {
                List<UiMessageCallback> arrayList = this.mListenersSpecific.get(i9);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.mListenersSpecific.put(i9, arrayList);
                }
                if (!arrayList.contains(uiMessageCallback)) {
                    arrayList.add(uiMessageCallback);
                }
            } catch (Throwable th) {
                throw th;
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
            try {
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
            } finally {
            }
        }
        synchronized (this.mListenersUniversal) {
            try {
                if (this.mListenersUniversal.size() > 0) {
                    this.mDefensiveCopyList.addAll(this.mListenersUniversal);
                    Iterator<UiMessageCallback> it2 = this.mDefensiveCopyList.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleMessage(this.mMessage);
                    }
                    this.mDefensiveCopyList.clear();
                }
            } finally {
            }
        }
        this.mMessage.setMessage(null);
        return true;
    }

    public void removeListener(@NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersUniversal) {
            try {
                if (DEBUG && !this.mListenersUniversal.contains(uiMessageCallback)) {
                    Log.w(TAG, "Trying to remove a listener that is not registered. " + uiMessageCallback.toString());
                }
                this.mListenersUniversal.remove(uiMessageCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListeners(int i9) {
        List<UiMessageCallback> list;
        if (DEBUG && ((list = this.mListenersSpecific.get(i9)) == null || list.size() == 0)) {
            Log.w(TAG, "Trying to remove specific listeners that are not registered. ID " + i9);
        }
        synchronized (this.mListenersSpecific) {
            this.mListenersSpecific.delete(i9);
        }
    }

    public final void send(int i9) {
        this.mHandler.sendEmptyMessage(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UiMessageUtils() {
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        this.mMessage = new UiMessage(null);
        this.mListenersSpecific = new SparseArray<>();
        this.mListenersUniversal = new ArrayList();
        this.mDefensiveCopyList = new ArrayList();
    }

    public final void send(int i9, @NonNull Object obj) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i9, obj));
    }

    public void removeListener(int i9, @NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersSpecific) {
            try {
                List<UiMessageCallback> list = this.mListenersSpecific.get(i9);
                if (list != null && !list.isEmpty()) {
                    if (DEBUG && !list.contains(uiMessageCallback)) {
                        Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i9 + ", " + uiMessageCallback);
                        return;
                    }
                    list.remove(uiMessageCallback);
                } else if (DEBUG) {
                    Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i9 + ", " + uiMessageCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(@NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersUniversal) {
            try {
                if (!this.mListenersUniversal.contains(uiMessageCallback)) {
                    this.mListenersUniversal.add(uiMessageCallback);
                } else if (DEBUG) {
                    Log.w(TAG, "Listener is already added. " + uiMessageCallback.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
