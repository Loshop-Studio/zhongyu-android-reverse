package p133q1;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: q1.b */
/* loaded from: classes3.dex */
public class C7619b implements InterfaceC7618a {
    @Override // p133q1.InterfaceC7618a
    /* renamed from: a */
    public void mo9055a(int i6, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = m9056b(th);
            }
        } else if (th != null) {
            str2 = str2 + SignParameters.NEW_LINE + m9056b(th);
        }
        m9057c(i6, str, str2);
    }

    /* renamed from: b */
    public final String m9056b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: c */
    public void m9057c(int i6, String str, String str2) {
        int length = str2.length() / 4000;
        if (length <= 0) {
            m9058d(i6, str, str2);
            return;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = i8 + 4000;
            m9058d(i6, str, str2.substring(i8, i9));
            i7++;
            i8 = i9;
        }
        m9058d(i6, str, str2.substring(i8));
    }

    /* renamed from: d */
    public final void m9058d(int i6, String str, String str2) {
        if (i6 == 4) {
            Log.i(str, str2);
            return;
        }
        if (i6 == 5) {
            Log.w(str, str2);
        } else if (i6 == 6) {
            Log.e(str, str2);
        } else {
            if (i6 != 7) {
                return;
            }
            Log.wtf(str, str2);
        }
    }
}
