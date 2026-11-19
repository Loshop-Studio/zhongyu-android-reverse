package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c, T t8, int i, A a9);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    private boolean isRemoved(int i) {
        int i8;
        if (i < 64) {
            return ((1 << i) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (i8 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i8]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T t8, int i, A a9) {
        notifyCallbacks(t8, i, a9, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T t8, int i, A a9) {
        int size = this.mCallbacks.size();
        int length = this.mRemainderRemoved == null ? -1 : r0.length - 1;
        notifyRemainder(t8, i, a9, length);
        notifyCallbacks(t8, i, a9, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t8, int i, A a9, int i8) {
        if (i8 < 0) {
            notifyFirst64(t8, i, a9);
            return;
        }
        long j7 = this.mRemainderRemoved[i8];
        int i9 = (i8 + 1) * 64;
        int iMin = Math.min(this.mCallbacks.size(), i9 + 64);
        notifyRemainder(t8, i, a9, i8 - 1);
        notifyCallbacks(t8, i, a9, i9, iMin, j7);
    }

    private void removeRemovedCallbacks(int i, long j7) {
        long j8 = Long.MIN_VALUE;
        for (int i8 = i + 63; i8 >= i; i8--) {
            if ((j7 & j8) != 0) {
                this.mCallbacks.remove(i8);
            }
            j8 >>>= 1;
        }
    }

    private void setRemovalBit(int i) {
        if (i < 64) {
            this.mFirst64Removed = (1 << i) | this.mFirst64Removed;
            return;
        }
        int i8 = (i / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= i8) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j7 = 1 << (i % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[i8] = j7 | jArr4[i8];
    }

    public synchronized void add(C c) {
        try {
            if (c == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.mCallbacks.lastIndexOf(c);
            if (iLastIndexOf < 0 || isRemoved(iLastIndexOf)) {
                this.mCallbacks.add(c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.clear();
            } else if (!this.mCallbacks.isEmpty()) {
                for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                    setRemovalBit(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                arrayList.add(this.mCallbacks.get(i));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.mCallbacks.isEmpty()) {
            return true;
        }
        if (this.mNotificationLevel == 0) {
            return false;
        }
        int size = this.mCallbacks.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t8, int i, A a9) {
        try {
            this.mNotificationLevel++;
            notifyRecurse(t8, i, a9);
            int i8 = this.mNotificationLevel - 1;
            this.mNotificationLevel = i8;
            if (i8 == 0) {
                long[] jArr = this.mRemainderRemoved;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j7 = this.mRemainderRemoved[length];
                        if (j7 != 0) {
                            removeRemovedCallbacks((length + 1) * 64, j7);
                            this.mRemainderRemoved[length] = 0;
                        }
                    }
                }
                long j8 = this.mFirst64Removed;
                if (j8 != 0) {
                    removeRemovedCallbacks(0, j8);
                    this.mFirst64Removed = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(C c) {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.remove(c);
            } else {
                int iLastIndexOf = this.mCallbacks.lastIndexOf(c);
                if (iLastIndexOf >= 0) {
                    setRemovalBit(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m13582clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
        } catch (CloneNotSupportedException e4) {
            callbackRegistry = null;
            e = e4;
        }
        try {
            callbackRegistry.mFirst64Removed = 0L;
            callbackRegistry.mRemainderRemoved = null;
            callbackRegistry.mNotificationLevel = 0;
            callbackRegistry.mCallbacks = new ArrayList();
            int size = this.mCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (!isRemoved(i)) {
                    callbackRegistry.mCallbacks.add(this.mCallbacks.get(i));
                }
            }
        } catch (CloneNotSupportedException e8) {
            e = e8;
            e.printStackTrace();
            return callbackRegistry;
        }
        return callbackRegistry;
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.mCallbacks.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                list.add(this.mCallbacks.get(i));
            }
        }
    }

    private void notifyCallbacks(T t8, int i, A a9, int i8, int i9, long j7) {
        long j8 = 1;
        while (i8 < i9) {
            if ((j7 & j8) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i8), t8, i, a9);
            }
            j8 <<= 1;
            i8++;
        }
    }
}
