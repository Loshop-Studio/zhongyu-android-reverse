package cd;

import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: cd.c */
/* loaded from: classes6.dex */
public abstract class AbstractC5424c {
    /* renamed from: b */
    public static final String m2904b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
