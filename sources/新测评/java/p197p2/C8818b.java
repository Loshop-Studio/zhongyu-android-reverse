package p197p2;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: p2.b */
/* loaded from: classes4.dex */
public class C8818b implements InterfaceC8817a {
    @Override // p197p2.InterfaceC8817a
    /* renamed from: a */
    public void mo14773a(int i10, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = m14774b(th);
            }
        } else if (th != null) {
            str2 = str2 + SignParameters.NEW_LINE + m14774b(th);
        }
        m14775c(i10, str, str2);
    }

    /* renamed from: b */
    public final String m14774b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: c */
    public void m14775c(int i10, String str, String str2) {
        int length = str2.length() / 4000;
        if (length <= 0) {
            m14776d(i10, str, str2);
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 4000;
            m14776d(i10, str, str2.substring(i12, i13));
            i11++;
            i12 = i13;
        }
        m14776d(i10, str, str2.substring(i12));
    }

    /* renamed from: d */
    public final void m14776d(int i10, String str, String str2) {
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
