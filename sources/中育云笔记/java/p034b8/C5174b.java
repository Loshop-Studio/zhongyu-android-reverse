package p034b8;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: b8.b */
/* loaded from: classes5.dex */
public class C5174b implements InterfaceC5173a {
    @Override // p034b8.InterfaceC5173a
    /* renamed from: a */
    public void mo2703a(int i10, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = m2704b(th);
            }
        } else if (th != null) {
            str2 = str2 + SignParameters.NEW_LINE + m2704b(th);
        }
        m2705c(i10, str, str2);
    }

    /* renamed from: b */
    public final String m2704b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: c */
    public void m2705c(int i10, String str, String str2) {
        int length = str2.length() / 4000;
        if (length <= 0) {
            m2706d(i10, str, str2);
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 4000;
            m2706d(i10, str, str2.substring(i12, i13));
            i11++;
            i12 = i13;
        }
        m2706d(i10, str, str2.substring(i12));
    }

    /* renamed from: d */
    public final void m2706d(int i10, String str, String str2) {
        if (i10 == 4) {
            Log.i(str, str2);
            return;
        }
        if (i10 == 5) {
            Log.w(str, str2);
        } else if (i10 == 6) {
            Log.e(str, str2);
        } else {
            if (i10 != 7) {
                return;
            }
            Log.wtf(str, str2);
        }
    }
}
