package org.android.spdy;

/* loaded from: classes.dex */
public class SpdyErrorException extends RuntimeException {
    private static final long serialVersionUID = 4422888579699220045L;
    private int error;

    public SpdyErrorException(int i4) {
        this.error = i4;
    }

    public int SpdyErrorGetCode() {
        return this.error;
    }

    public SpdyErrorException(String str, int i4) {
        super(str);
        this.error = i4;
    }

    public SpdyErrorException(String str, Throwable th, int i4) {
        super(str, th);
        this.error = i4;
    }

    public SpdyErrorException(Throwable th, int i4) {
        super(th);
        this.error = i4;
    }
}
