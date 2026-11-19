package androidx.appcompat.widget;

/* loaded from: classes.dex */
class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRtl = false;
    private boolean mIsRelative = false;

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    public void setAbsolute(int i6, int i7) {
        this.mIsRelative = false;
        if (i6 != Integer.MIN_VALUE) {
            this.mExplicitLeft = i6;
            this.mLeft = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.mExplicitRight = i7;
            this.mRight = i7;
        }
    }

    public void setDirection(boolean z6) {
        if (z6 == this.mIsRtl) {
            return;
        }
        this.mIsRtl = z6;
        if (!this.mIsRelative) {
            this.mLeft = this.mExplicitLeft;
            this.mRight = this.mExplicitRight;
            return;
        }
        if (z6) {
            int i6 = this.mEnd;
            if (i6 == Integer.MIN_VALUE) {
                i6 = this.mExplicitLeft;
            }
            this.mLeft = i6;
            int i7 = this.mStart;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.mExplicitRight;
            }
            this.mRight = i7;
            return;
        }
        int i8 = this.mStart;
        if (i8 == Integer.MIN_VALUE) {
            i8 = this.mExplicitLeft;
        }
        this.mLeft = i8;
        int i9 = this.mEnd;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.mExplicitRight;
        }
        this.mRight = i9;
    }

    public void setRelative(int i6, int i7) {
        this.mStart = i6;
        this.mEnd = i7;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i7 != Integer.MIN_VALUE) {
                this.mLeft = i7;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.mRight = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.mLeft = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.mRight = i7;
        }
    }
}
