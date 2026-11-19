package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class TbsCoreLoadStat {

    /* renamed from: d */
    private static TbsCoreLoadStat f6614d = null;
    public static volatile int mLoadErrorCode = -1;

    /* renamed from: a */
    private TbsSequenceQueue f6615a = null;

    /* renamed from: b */
    private boolean f6616b = false;

    /* renamed from: c */
    private final int f6617c = 3;

    public class TbsSequenceQueue {

        /* renamed from: b */
        private int f6619b;

        /* renamed from: c */
        private int f6620c;

        /* renamed from: d */
        private int[] f6621d;

        /* renamed from: e */
        private int f6622e;

        /* renamed from: f */
        private int f6623f;

        public TbsSequenceQueue() {
            this.f6619b = 10;
            this.f6622e = 0;
            this.f6623f = 0;
            this.f6620c = 10;
            this.f6621d = new int[10];
        }

        public void add(int i10) {
            int i11 = this.f6623f;
            if (i11 > this.f6620c - 1) {
                throw new IndexOutOfBoundsException("sequeue is full");
            }
            int[] iArr = this.f6621d;
            this.f6623f = i11 + 1;
            iArr[i11] = i10;
        }

        public void clear() {
            Arrays.fill(this.f6621d, 0);
            this.f6622e = 0;
            this.f6623f = 0;
        }

        public int element() {
            if (empty()) {
                throw new IndexOutOfBoundsException("sequeue is null");
            }
            return this.f6621d[this.f6622e];
        }

        public boolean empty() {
            return this.f6623f == this.f6622e;
        }

        public int length() {
            return this.f6623f - this.f6622e;
        }

        public int remove() {
            if (empty()) {
                throw new IndexOutOfBoundsException("sequeue is null");
            }
            int[] iArr = this.f6621d;
            int i10 = this.f6622e;
            int i11 = iArr[i10];
            this.f6622e = i10 + 1;
            iArr[i10] = 0;
            return i11;
        }

        public String toString() {
            if (empty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i10 = this.f6622e; i10 < this.f6623f; i10++) {
                sb.append(String.valueOf(this.f6621d[i10]) + ",");
            }
            int length = sb.length();
            StringBuilder sbDelete = sb.delete(length - 1, length);
            sbDelete.append("]");
            return sbDelete.toString();
        }

        public TbsSequenceQueue(int i10, int i11) {
            this.f6619b = 10;
            this.f6622e = 0;
            this.f6623f = 0;
            this.f6620c = i11;
            int[] iArr = new int[i11];
            this.f6621d = iArr;
            iArr[0] = i10;
            this.f6623f = 1;
        }
    }

    private TbsCoreLoadStat() {
    }

    public static TbsCoreLoadStat getInstance() {
        if (f6614d == null) {
            f6614d = new TbsCoreLoadStat();
        }
        return f6614d;
    }

    /* renamed from: a */
    public void m5850a() {
        TbsSequenceQueue tbsSequenceQueue = this.f6615a;
        if (tbsSequenceQueue != null) {
            tbsSequenceQueue.clear();
        }
        this.f6616b = false;
    }

    /* renamed from: a */
    public void m5851a(Context context, int i10) {
        m5852a(context, i10, null);
        TbsLog.m6246e(TbsListener.tag_load_error, "" + i10);
    }

    /* renamed from: a */
    public synchronized void m5852a(Context context, int i10, Throwable th) {
        try {
            if (mLoadErrorCode != -1) {
                TbsLog.m6252w("TbsCoreLoadStat", "setLoadErrorCode :: error(" + mLoadErrorCode + ") was already reported; " + i10 + " is duplicated. Try to remove it!");
                return;
            }
            mLoadErrorCode = i10;
            TbsLog.addLog(998, "code=%d,desc=%s", Integer.valueOf(i10), String.valueOf(th));
            if (th != null) {
                TbsLogReport.m5877a(context).m5899b(i10, th);
            } else {
                TbsLog.m6246e("TbsCoreLoadStat", "setLoadErrorCode :: error is null with errorCode: " + i10 + "; Check & correct it!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
