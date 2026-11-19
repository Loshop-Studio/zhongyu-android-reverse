package p082k0;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: k0.b */
/* loaded from: classes2.dex */
public class C3856b implements InterfaceC3855a {
    @Override // p082k0.InterfaceC3855a
    /* renamed from: a */
    public void mo5155a(int i4, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = m5156b(th);
            }
        } else if (th != null) {
            str2 = str2 + "\n" + m5156b(th);
        }
        m5157c(i4, str, str2);
    }

    /* renamed from: b */
    public final String m5156b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: c */
    public void m5157c(int i4, String str, String str2) {
        int length = str2.length() / 4000;
        if (length <= 0) {
            m5158d(i4, str, str2);
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i6 + 4000;
            m5158d(i4, str, str2.substring(i6, i7));
            i5++;
            i6 = i7;
        }
        m5158d(i4, str, str2.substring(i6));
    }

    /* renamed from: d */
    public final void m5158d(int i4, String str, String str2) {
        if (i4 == 4) {
            Log.i(str, str2);
            return;
        }
        if (i4 == 5) {
            Log.w(str, str2);
        } else if (i4 == 6) {
            Log.e(str, str2);
        } else {
            if (i4 != 7) {
                return;
            }
            Log.wtf(str, str2);
        }
    }
}
