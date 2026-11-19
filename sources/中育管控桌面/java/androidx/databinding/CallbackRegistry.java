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
        public abstract void onNotifyCallback(C c7, T t6, int i6, A a7);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    private boolean isRemoved(int i6) {
        int i7;
        if (i6 < 64) {
            return ((1 << i6) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (i7 = (i6 / 64) - 1) < jArr.length) {
            return ((1 << (i6 % 64)) & jArr[i7]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T t6, int i6, A a7) {
        notifyCallbacks(t6, i6, a7, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T t6, int i6, A a7) {
        int size = this.mCallbacks.size();
        int length = this.mRemainderRemoved == null ? -1 : r0.length - 1;
        notifyRemainder(t6, i6, a7, length);
        notifyCallbacks(t6, i6, a7, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t6, int i6, A a7, int i7) {
        if (i7 < 0) {
            notifyFirst64(t6, i6, a7);
            return;
        }
        long j6 = this.mRemainderRemoved[i7];
        int i8 = (i7 + 1) * 64;
        int iMin = Math.min(this.mCallbacks.size(), i8 + 64);
        notifyRemainder(t6, i6, a7, i7 - 1);
        notifyCallbacks(t6, i6, a7, i8, iMin, j6);
    }

    private void removeRemovedCallbacks(int i6, long j6) {
        long j7 = Long.MIN_VALUE;
        for (int i7 = i6 + 63; i7 >= i6; i7--) {
            if ((j6 & j7) != 0) {
                this.mCallbacks.remove(i7);
            }
            j7 >>>= 1;
        }
    }

    private void setRemovalBit(int i6) {
        if (i6 < 64) {
            this.mFirst64Removed = (1 << i6) | this.mFirst64Removed;
            return;
        }
        int i7 = (i6 / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= i7) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j6 = 1 << (i6 % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[i7] = j6 | jArr4[i7];
    }

    public synchronized void add(C c7) {
        try {
            if (c7 == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.mCallbacks.lastIndexOf(c7);
            if (iLastIndexOf < 0 || isRemoved(iLastIndexOf)) {
                this.mCallbacks.add(c7);
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
        for (int i6 = 0; i6 < size; i6++) {
            if (!isRemoved(i6)) {
                arrayList.add(this.mCallbacks.get(i6));
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
        for (int i6 = 0; i6 < size; i6++) {
            if (!isRemoved(i6)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t6, int i6, A a7) {
        try {
            this.mNotificationLevel++;
            notifyRecurse(t6, i6, a7);
            int i7 = this.mNotificationLevel - 1;
            this.mNotificationLevel = i7;
            if (i7 == 0) {
                long[] jArr = this.mRemainderRemoved;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j6 = this.mRemainderRemoved[length];
                        if (j6 != 0) {
                            removeRemovedCallbacks((length + 1) * 64, j6);
                            this.mRemainderRemoved[length] = 0;
                        }
                    }
                }
                long j7 = this.mFirst64Removed;
                if (j7 != 0) {
                    removeRemovedCallbacks(0, j7);
                    this.mFirst64Removed = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(C c7) {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.remove(c7);
            } else {
                int iLastIndexOf = this.mCallbacks.lastIndexOf(c7);
                if (iLastIndexOf >= 0) {
                    setRemovalBit(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m16972clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e6;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
        } catch (CloneNotSupportedException e7) {
            callbackRegistry = null;
            e6 = e7;
        }
        try {
            callbackRegistry.mFirst64Removed = 0L;
            callbackRegistry.mRemainderRemoved = null;
            callbackRegistry.mNotificationLevel = 0;
            callbackRegistry.mCallbacks = new ArrayList();
            int size = this.mCallbacks.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (!isRemoved(i6)) {
                    callbackRegistry.mCallbacks.add(this.mCallbacks.get(i6));
                }
            }
        } catch (CloneNotSupportedException e8) {
            e6 = e8;
            e6.printStackTrace();
            return callbackRegistry;
        }
        return callbackRegistry;
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.mCallbacks.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!isRemoved(i6)) {
                list.add(this.mCallbacks.get(i6));
            }
        }
    }

    private void notifyCallbacks(T t6, int i6, A a7, int i7, int i8, long j6) {
        long j7 = 1;
        while (i7 < i8) {
            if ((j6 & j7) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i7), t6, i6, a7);
            }
            j7 <<= 1;
            i7++;
        }
    }
}
