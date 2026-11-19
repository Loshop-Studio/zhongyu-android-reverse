package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
class ViewBoundsCheck {
    static final int CVE_PVE_POS = 12;
    static final int CVE_PVS_POS = 8;
    static final int CVS_PVE_POS = 4;
    static final int CVS_PVS_POS = 0;

    /* renamed from: EQ */
    static final int f1014EQ = 2;
    static final int FLAG_CVE_EQ_PVE = 8192;
    static final int FLAG_CVE_EQ_PVS = 512;
    static final int FLAG_CVE_GT_PVE = 4096;
    static final int FLAG_CVE_GT_PVS = 256;
    static final int FLAG_CVE_LT_PVE = 16384;
    static final int FLAG_CVE_LT_PVS = 1024;
    static final int FLAG_CVS_EQ_PVE = 32;
    static final int FLAG_CVS_EQ_PVS = 2;
    static final int FLAG_CVS_GT_PVE = 16;
    static final int FLAG_CVS_GT_PVS = 1;
    static final int FLAG_CVS_LT_PVE = 64;
    static final int FLAG_CVS_LT_PVS = 4;

    /* renamed from: GT */
    static final int f1015GT = 1;

    /* renamed from: LT */
    static final int f1016LT = 4;
    static final int MASK = 7;
    BoundFlags mBoundFlags = new BoundFlags();
    final Callback mCallback;

    public static class BoundFlags {
        int mBoundFlags = 0;
        int mChildEnd;
        int mChildStart;
        int mRvEnd;
        int mRvStart;

        public void addFlags(int i6) {
            this.mBoundFlags = i6 | this.mBoundFlags;
        }

        public boolean boundsMatch() {
            int i6 = this.mBoundFlags;
            if ((i6 & 7) != 0 && (i6 & compare(this.mChildStart, this.mRvStart)) == 0) {
                return false;
            }
            int i7 = this.mBoundFlags;
            if ((i7 & 112) != 0 && (i7 & (compare(this.mChildStart, this.mRvEnd) << 4)) == 0) {
                return false;
            }
            int i8 = this.mBoundFlags;
            if ((i8 & 1792) != 0 && (i8 & (compare(this.mChildEnd, this.mRvStart) << 8)) == 0) {
                return false;
            }
            int i9 = this.mBoundFlags;
            return (i9 & 28672) == 0 || (i9 & (compare(this.mChildEnd, this.mRvEnd) << 12)) != 0;
        }

        public int compare(int i6, int i7) {
            if (i6 > i7) {
                return 1;
            }
            return i6 == i7 ? 2 : 4;
        }

        public void resetFlags() {
            this.mBoundFlags = 0;
        }

        public void setBounds(int i6, int i7, int i8, int i9) {
            this.mRvStart = i6;
            this.mRvEnd = i7;
            this.mChildStart = i8;
            this.mChildEnd = i9;
        }
    }

    public interface Callback {
        View getChildAt(int i6);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.mCallback = callback;
    }

    public View findOneViewWithinBoundFlags(int i6, int i7, int i8, int i9) {
        int parentStart = this.mCallback.getParentStart();
        int parentEnd = this.mCallback.getParentEnd();
        int i10 = i7 > i6 ? 1 : -1;
        View view = null;
        while (i6 != i7) {
            View childAt = this.mCallback.getChildAt(i6);
            this.mBoundFlags.setBounds(parentStart, parentEnd, this.mCallback.getChildStart(childAt), this.mCallback.getChildEnd(childAt));
            if (i8 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i8);
                if (this.mBoundFlags.boundsMatch()) {
                    return childAt;
                }
            }
            if (i9 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i9);
                if (this.mBoundFlags.boundsMatch()) {
                    view = childAt;
                }
            }
            i6 += i10;
        }
        return view;
    }

    public boolean isViewWithinBoundFlags(View view, int i6) {
        this.mBoundFlags.setBounds(this.mCallback.getParentStart(), this.mCallback.getParentEnd(), this.mCallback.getChildStart(view), this.mCallback.getChildEnd(view));
        if (i6 == 0) {
            return false;
        }
        this.mBoundFlags.resetFlags();
        this.mBoundFlags.addFlags(i6);
        return this.mBoundFlags.boundsMatch();
    }
}
