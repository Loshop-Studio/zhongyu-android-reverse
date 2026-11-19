package p256t7;

import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: t7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10118c {
    /* renamed from: b */
    public static final String m18863b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
