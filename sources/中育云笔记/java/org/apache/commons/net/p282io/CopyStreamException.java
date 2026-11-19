package org.apache.commons.net.p282io;

import java.io.IOException;

/* loaded from: classes6.dex */
public class CopyStreamException extends IOException {

    /* renamed from: c */
    public final long f25431c;

    public CopyStreamException(String str, long j10, IOException iOException) {
        super(str);
        initCause(iOException);
        this.f25431c = j10;
    }
}
