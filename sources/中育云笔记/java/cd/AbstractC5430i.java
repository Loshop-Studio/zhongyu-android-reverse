package cd;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: cd.i */
/* loaded from: classes6.dex */
public abstract class AbstractC5430i {
    /* renamed from: a */
    public static final long m2927a(Reader reader, Writer out, int i10) throws IOException {
        AbstractC9979u.m20294g(reader, "<this>");
        AbstractC9979u.m20294g(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    /* renamed from: b */
    public static /* synthetic */ long m2928b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m2927a(reader, writer, i10);
    }

    /* renamed from: c */
    public static final String m2929c(Reader reader) {
        AbstractC9979u.m20294g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m2928b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
