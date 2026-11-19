package p104f3;

import android.util.Log;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: f3.b */
/* loaded from: classes4.dex */
public class C7918b implements InterfaceC7917a {
    @Override // p104f3.InterfaceC7917a
    /* renamed from: a */
    public void mo12464a(int i9, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = m12465b(th);
            }
        } else if (th != null) {
            str2 = str2 + AbsSection.SEP_ORIGIN_LINE_BREAK + m12465b(th);
        }
        m12466c(i9, str, str2);
    }

    /* renamed from: b */
    public final String m12465b(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: c */
    public void m12466c(int i9, String str, String str2) {
        int length = str2.length() / 4000;
        if (length <= 0) {
            m12467d(i9, str, str2);
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 4000;
            m12467d(i9, str, str2.substring(i11, i12));
            i10++;
            i11 = i12;
        }
        m12467d(i9, str, str2.substring(i11));
    }

    /* renamed from: d */
    public final void m12467d(int i9, String str, String str2) {
        if (i9 == 4) {
            Log.i(str, str2);
            return;
        }
        if (i9 == 5) {
            Log.w(str, str2);
        } else if (i9 == 6) {
            Log.e(str, str2);
        } else {
            if (i9 != 7) {
                return;
            }
            Log.wtf(str, str2);
        }
    }
}
