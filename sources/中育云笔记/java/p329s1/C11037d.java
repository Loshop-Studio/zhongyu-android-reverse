package p329s1;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: s1.d */
/* loaded from: classes3.dex */
public class C11037d {

    /* renamed from: d */
    public static final Pattern f26615d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    public static final Pattern f26616e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f26617a;

    /* renamed from: b */
    public final long f26618b;

    /* renamed from: c */
    public final boolean f26619c;

    public C11037d(String str) {
        AbstractC11045l.m24467d(str);
        long jM24391a = m24391a(str);
        this.f26618b = Math.max(0L, jM24391a);
        this.f26619c = jM24391a >= 0;
        this.f26617a = m24392b(str);
    }

    /* renamed from: c */
    public static C11037d m24390c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                return new C11037d(sb2.toString());
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    /* renamed from: a */
    public final long m24391a(String str) {
        Matcher matcher = f26615d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    /* renamed from: b */
    public final String m24392b(String str) {
        Matcher matcher = f26616e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f26618b + ", partial=" + this.f26619c + ", uri='" + this.f26617a + "'}";
    }
}
