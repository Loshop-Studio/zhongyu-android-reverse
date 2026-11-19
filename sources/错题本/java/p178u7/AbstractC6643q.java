package p178u7;

import androidx.collection.AbstractC0584a;
import java.io.IOException;

/* renamed from: u7.q */
/* loaded from: classes4.dex */
public abstract class AbstractC6643q {
    /* renamed from: a */
    public static int m6286a(int i, int i8, int i9) throws IOException {
        if ((i8 & 8) != 0) {
            i--;
        }
        if (i9 <= i) {
            return i - i9;
        }
        throw new IOException(AbstractC0584a.m912m(i9, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
