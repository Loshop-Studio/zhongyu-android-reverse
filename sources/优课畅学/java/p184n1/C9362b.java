package p184n1;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.TXLiteAVCode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: n1.b */
/* loaded from: classes4.dex */
public class C9362b implements InterfaceC9361a {
    @Override // p184n1.InterfaceC9361a
    /* renamed from: a */
    public void mo17243a(int i10, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = m17244b(th);
            }
        } else if (th != null) {
            str2 = str2 + SignParameters.NEW_LINE + m17244b(th);
        }
        m17245c(i10, str, str2);
    }

    /* renamed from: b */
    public final String m17244b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: c */
    public void m17245c(int i10, String str, String str2) {
        int length = str2.length() / TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
        if (length <= 0) {
            m17246d(i10, str, str2);
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
            m17246d(i10, str, str2.substring(i12, i13));
            i11++;
            i12 = i13;
        }
        m17246d(i10, str, str2.substring(i12));
    }

    /* renamed from: d */
    public final void m17246d(int i10, String str, String str2) {
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
