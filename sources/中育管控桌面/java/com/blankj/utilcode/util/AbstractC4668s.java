package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AbstractC4663o0;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import p087k.AbstractC6619r;

/* renamed from: com.blankj.utilcode.util.s */
/* loaded from: classes3.dex */
public abstract class AbstractC4668s {

    /* renamed from: e */
    public static SimpleDateFormat f2115e;

    /* renamed from: a */
    public static final char[] f2111a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* renamed from: b */
    public static final String f2112b = System.getProperty("file.separator");

    /* renamed from: c */
    public static final String f2113c = System.getProperty("line.separator");

    /* renamed from: d */
    public static final d f2114d = new d(null);

    /* renamed from: f */
    public static final ExecutorService f2116f = Executors.newSingleThreadExecutor();

    /* renamed from: g */
    public static final SimpleArrayMap f2117g = new SimpleArrayMap();

    /* renamed from: com.blankj.utilcode.util.s$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f2118a;

        /* renamed from: b */
        public final /* synthetic */ i f2119b;

        /* renamed from: c */
        public final /* synthetic */ String f2120c;

        public a(int i6, i iVar, String str) {
            this.f2118a = i6;
            this.f2119b = iVar;
            this.f2120c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4668s.m2394z(this.f2118a, this.f2119b.f2141a, this.f2119b.f2143c + this.f2120c);
        }
    }

    /* renamed from: com.blankj.utilcode.util.s$b */
    public class b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return AbstractC4668s.m2390v(str);
        }
    }

    /* renamed from: com.blankj.utilcode.util.s$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f2121a;

        public c(File file) {
            this.f2121a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2121a.delete()) {
                return;
            }
            Log.e("LogUtils", "delete " + this.f2121a + " failed!");
        }
    }

    /* renamed from: com.blankj.utilcode.util.s$d */
    public static final class d {

        /* renamed from: a */
        public String f2122a;

        /* renamed from: b */
        public String f2123b;

        /* renamed from: c */
        public String f2124c;

        /* renamed from: d */
        public String f2125d;

        /* renamed from: e */
        public boolean f2126e;

        /* renamed from: f */
        public boolean f2127f;

        /* renamed from: g */
        public String f2128g;

        /* renamed from: h */
        public boolean f2129h;

        /* renamed from: i */
        public boolean f2130i;

        /* renamed from: j */
        public boolean f2131j;

        /* renamed from: k */
        public boolean f2132k;

        /* renamed from: l */
        public boolean f2133l;

        /* renamed from: m */
        public int f2134m;

        /* renamed from: n */
        public int f2135n;

        /* renamed from: o */
        public int f2136o;

        /* renamed from: p */
        public int f2137p;

        /* renamed from: q */
        public int f2138q;

        /* renamed from: r */
        public String f2139r;

        /* renamed from: s */
        public AbstractC4663o0.a f2140s;

        public /* synthetic */ d(a aVar) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ g m2398d(d dVar) {
            dVar.getClass();
            return null;
        }

        /* renamed from: f */
        public static /* synthetic */ e m2400f(d dVar) {
            dVar.getClass();
            return null;
        }

        /* renamed from: g */
        public static /* synthetic */ h m2401g(d dVar) {
            dVar.getClass();
            return null;
        }

        /* renamed from: h */
        public final char m2402h() {
            return AbstractC4668s.f2111a[this.f2134m - 2];
        }

        /* renamed from: i */
        public final String m2403i() {
            String str = this.f2123b;
            return str == null ? this.f2122a : str;
        }

        /* renamed from: j */
        public final String m2404j() {
            return this.f2125d;
        }

        /* renamed from: k */
        public final char m2405k() {
            return AbstractC4668s.f2111a[this.f2135n - 2];
        }

        /* renamed from: l */
        public final String m2406l() {
            return this.f2124c;
        }

        /* renamed from: m */
        public final String m2407m() {
            return AbstractC4663o0.m2304G(this.f2128g) ? "" : this.f2128g;
        }

        /* renamed from: n */
        public final String m2408n() {
            String str = this.f2139r;
            return str == null ? "" : str.replace(":", "_");
        }

        /* renamed from: o */
        public final int m2409o() {
            return this.f2138q;
        }

        /* renamed from: p */
        public final int m2410p() {
            return this.f2136o;
        }

        /* renamed from: q */
        public final int m2411q() {
            return this.f2137p;
        }

        /* renamed from: r */
        public final boolean m2412r() {
            return this.f2127f;
        }

        /* renamed from: s */
        public final boolean m2413s() {
            return this.f2131j;
        }

        /* renamed from: t */
        public final boolean m2414t() {
            return this.f2132k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(m2408n());
            sb.append(AbstractC4668s.f2113c);
            sb.append("logSwitch: ");
            sb.append(m2416v());
            sb.append(AbstractC4668s.f2113c);
            sb.append("consoleSwitch: ");
            sb.append(m2412r());
            sb.append(AbstractC4668s.f2113c);
            sb.append("tag: ");
            sb.append(m2407m().equals("") ? "null" : m2407m());
            sb.append(AbstractC4668s.f2113c);
            sb.append("headSwitch: ");
            sb.append(m2415u());
            sb.append(AbstractC4668s.f2113c);
            sb.append("fileSwitch: ");
            sb.append(m2413s());
            sb.append(AbstractC4668s.f2113c);
            sb.append("dir: ");
            sb.append(m2403i());
            sb.append(AbstractC4668s.f2113c);
            sb.append("filePrefix: ");
            sb.append(m2406l());
            sb.append(AbstractC4668s.f2113c);
            sb.append("borderSwitch: ");
            sb.append(m2414t());
            sb.append(AbstractC4668s.f2113c);
            sb.append("singleTagSwitch: ");
            sb.append(m2417w());
            sb.append(AbstractC4668s.f2113c);
            sb.append("consoleFilter: ");
            sb.append(m2402h());
            sb.append(AbstractC4668s.f2113c);
            sb.append("fileFilter: ");
            sb.append(m2405k());
            sb.append(AbstractC4668s.f2113c);
            sb.append("stackDeep: ");
            sb.append(m2410p());
            sb.append(AbstractC4668s.f2113c);
            sb.append("stackOffset: ");
            sb.append(m2411q());
            sb.append(AbstractC4668s.f2113c);
            sb.append("saveDays: ");
            sb.append(m2409o());
            sb.append(AbstractC4668s.f2113c);
            sb.append("formatter: ");
            sb.append(AbstractC4668s.f2117g);
            sb.append(AbstractC4668s.f2113c);
            sb.append("fileWriter: ");
            sb.append((Object) null);
            sb.append(AbstractC4668s.f2113c);
            sb.append("onConsoleOutputListener: ");
            sb.append((Object) null);
            sb.append(AbstractC4668s.f2113c);
            sb.append("onFileOutputListener: ");
            sb.append((Object) null);
            sb.append(AbstractC4668s.f2113c);
            sb.append("fileExtraHeader: ");
            sb.append(this.f2140s.m2344c());
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean m2415u() {
            return this.f2130i;
        }

        /* renamed from: v */
        public final boolean m2416v() {
            return this.f2126e;
        }

        /* renamed from: w */
        public final boolean m2417w() {
            return this.f2133l;
        }

        /* renamed from: x */
        public final d m2418x(String str) {
            if (AbstractC4663o0.m2304G(str)) {
                this.f2128g = "";
                this.f2129h = true;
                return this;
            }
            this.f2128g = str;
            this.f2129h = false;
            return this;
        }

        public d() {
            this.f2124c = "util";
            this.f2125d = ".txt";
            this.f2126e = true;
            this.f2127f = true;
            this.f2128g = "";
            this.f2129h = true;
            this.f2130i = true;
            this.f2131j = false;
            this.f2132k = true;
            this.f2133l = true;
            this.f2134m = 2;
            this.f2135n = 2;
            this.f2136o = 1;
            this.f2137p = 0;
            this.f2138q = -1;
            this.f2139r = AbstractC4663o0.m2330o();
            this.f2140s = new AbstractC4663o0.a("Log");
            if (!AbstractC4663o0.m2303F() || AbstractC4657l0.m2250a().getExternalFilesDir(null) == null) {
                this.f2122a = AbstractC4657l0.m2250a().getFilesDir() + AbstractC4668s.f2112b + "log" + AbstractC4668s.f2112b;
                return;
            }
            this.f2122a = AbstractC4657l0.m2250a().getExternalFilesDir(null) + AbstractC4668s.f2112b + "log" + AbstractC4668s.f2112b;
        }
    }

    /* renamed from: com.blankj.utilcode.util.s$e */
    public interface e {
    }

    /* renamed from: com.blankj.utilcode.util.s$f */
    public static final class f {
        /* renamed from: a */
        public static String m2419a(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        /* renamed from: b */
        public static String m2420b(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                if (obj instanceof Bundle) {
                    sb.append(obj == bundle ? "(this Bundle)" : m2420b((Bundle) obj));
                } else {
                    sb.append(AbstractC4668s.m2382n(obj));
                }
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        /* renamed from: c */
        public static void m2421c(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent == null) {
                sb.append("NULL");
                sb.append("}");
            } else {
                sb.append("I:");
                sb.append(m2423e(intent));
                sb.append("}");
            }
        }

        /* renamed from: d */
        public static String m2422d(String str) throws TransformerException, IllegalArgumentException {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", ExifInterface.GPS_MEASUREMENT_2D);
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + AbstractC4668s.f2113c);
            } catch (Exception e6) {
                e6.printStackTrace();
                return str;
            }
        }

        /* renamed from: e */
        public static String m2423e(Intent intent) {
            boolean z6;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z7 = false;
            boolean z8 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z6 = false;
            } else {
                z6 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z8) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z8 = false;
                }
                sb.append("]");
                z6 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z6 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z6 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z6 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z6 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z6 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z6 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z6) {
                    sb.append(' ');
                }
                m2421c(clipData, sb);
                z6 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(m2420b(extras));
                sb.append('}');
            } else {
                z7 = z6;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : m2423e(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        /* renamed from: f */
        public static String m2424f(Object obj) {
            if (obj instanceof CharSequence) {
                return AbstractC4663o0.m2326k(obj.toString());
            }
            try {
                return AbstractC4663o0.m2333r().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        /* renamed from: g */
        public static String m2425g(Object obj) {
            return m2426h(obj, -1);
        }

        /* renamed from: h */
        public static String m2426h(Object obj, int i6) {
            return obj.getClass().isArray() ? m2419a(obj) : obj instanceof Throwable ? AbstractC4663o0.m2332q((Throwable) obj) : obj instanceof Bundle ? m2420b((Bundle) obj) : obj instanceof Intent ? m2423e((Intent) obj) : i6 == 32 ? m2424f(obj) : i6 == 48 ? m2422d(obj.toString()) : obj.toString();
        }
    }

    /* renamed from: com.blankj.utilcode.util.s$g */
    public interface g {
    }

    /* renamed from: com.blankj.utilcode.util.s$h */
    public interface h {
    }

    /* renamed from: com.blankj.utilcode.util.s$i */
    public static final class i {

        /* renamed from: a */
        public String f2141a;

        /* renamed from: b */
        public String[] f2142b;

        /* renamed from: c */
        public String f2143c;

        public i(String str, String[] strArr, String str2) {
            this.f2141a = str;
            this.f2142b = strArr;
            this.f2143c = str2;
        }
    }

    /* renamed from: A */
    public static void m2359A(int i6, String str, boolean z6) {
        if (f2114d.m2414t()) {
            m2392x(i6, str, z6 ? "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────" : "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    /* renamed from: B */
    public static void m2360B(String str, String str2) {
        d dVar = f2114d;
        dVar.f2140s.m2342a("Date of Log", str2);
        m2389u(str, dVar.f2140s.toString());
    }

    /* renamed from: C */
    public static void m2361C(int i6, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (f2114d.m2414t()) {
                    str2 = "│ " + str2;
                }
                m2392x(i6, str, str2);
            }
            if (f2114d.m2414t()) {
                m2392x(i6, str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            }
        }
    }

    /* renamed from: D */
    public static void m2362D(int i6, String str, String str2) {
        int length = str2.length();
        int i7 = length / 1100;
        if (i7 <= 0) {
            m2364F(i6, str, str2);
            return;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = i9 + 1100;
            m2364F(i6, str, str2.substring(i9, i10));
            i8++;
            i9 = i10;
        }
        if (i9 != length) {
            m2364F(i6, str, str2.substring(i9, length));
        }
    }

    /* renamed from: E */
    public static void m2363E(int i6, String str, String str2) {
        int length = str2.length();
        d dVar = f2114d;
        int i7 = 1100;
        int i8 = dVar.m2414t() ? (length - 113) / 1100 : length / 1100;
        if (i8 <= 0) {
            m2392x(i6, str, str2);
            return;
        }
        int i9 = 1;
        if (!dVar.m2414t()) {
            m2392x(i6, str, str2.substring(0, 1100));
            while (i9 < i8) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(f2113c);
                int i10 = i7 + 1100;
                sb.append(str2.substring(i7, i10));
                m2392x(i6, str, sb.toString());
                i9++;
                i7 = i10;
            }
            if (i7 != length) {
                m2392x(i6, str, " " + f2113c + str2.substring(i7, length));
                return;
            }
            return;
        }
        m2392x(i6, str, str2.substring(0, 1100) + f2113c + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        while (i9 < i8) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            String str3 = f2113c;
            sb2.append(str3);
            sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb2.append(str3);
            sb2.append("│ ");
            int i11 = i7 + 1100;
            sb2.append(str2.substring(i7, i11));
            sb2.append(str3);
            sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            m2392x(i6, str, sb2.toString());
            i9++;
            i7 = i11;
        }
        if (i7 != length - 113) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" ");
            String str4 = f2113c;
            sb3.append(str4);
            sb3.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb3.append(str4);
            sb3.append("│ ");
            sb3.append(str2.substring(i7, length));
            m2392x(i6, str, sb3.toString());
        }
    }

    /* renamed from: F */
    public static void m2364F(int i6, String str, String str2) {
        if (!f2114d.m2414t()) {
            m2392x(i6, str, str2);
            return;
        }
        for (String str3 : str2.split(f2113c)) {
            m2392x(i6, str, "│ " + str3);
        }
    }

    /* renamed from: G */
    public static String m2365G(int i6, Object... objArr) {
        String string;
        if (objArr != null) {
            if (objArr.length == 1) {
                string = m2381m(i6, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    Object obj = objArr[i7];
                    sb.append("args");
                    sb.append("[");
                    sb.append(i7);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(m2382n(obj));
                    sb.append(f2113c);
                }
                string = sb.toString();
            }
        } else {
            string = "null";
        }
        return string.length() == 0 ? "log nothing" : string;
    }

    /* renamed from: H */
    public static String m2366H(int i6, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        if (f2114d.m2414t()) {
            sb.append(" ");
            String str3 = f2113c;
            sb.append(str3);
            sb.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append("│ ");
                    sb.append(str4);
                    sb.append(f2113c);
                }
                sb.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                sb.append(f2113c);
            }
            String[] strArrSplit = str2.split(f2113c);
            int length = strArrSplit.length;
            while (i7 < length) {
                String str5 = strArrSplit[i7];
                sb.append("│ ");
                sb.append(str5);
                sb.append(f2113c);
                i7++;
            }
            sb.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        } else {
            if (strArr != null) {
                sb.append(" ");
                sb.append(f2113c);
                int length2 = strArr.length;
                while (i7 < length2) {
                    sb.append(strArr[i7]);
                    sb.append(f2113c);
                    i7++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: I */
    public static i m2367I(String str) {
        d dVar = f2114d;
        if (dVar.f2129h || dVar.m2415u()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int iM2411q = dVar.m2411q() + 3;
            if (iM2411q >= stackTrace.length) {
                String strM2386r = m2386r(stackTrace[3]);
                if (dVar.f2129h && AbstractC4663o0.m2304G(str)) {
                    int iIndexOf = strM2386r.indexOf(46);
                    str = iIndexOf == -1 ? strM2386r : strM2386r.substring(0, iIndexOf);
                }
                return new i(str, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[iM2411q];
            String strM2386r2 = m2386r(stackTraceElement);
            if (dVar.f2129h && AbstractC4663o0.m2304G(str)) {
                int iIndexOf2 = strM2386r2.indexOf(46);
                str = iIndexOf2 == -1 ? strM2386r2 : strM2386r2.substring(0, iIndexOf2);
            }
            if (dVar.m2415u()) {
                String name = Thread.currentThread().getName();
                String string = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), strM2386r2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + string + "]: ";
                if (dVar.m2410p() <= 1) {
                    return new i(str, new String[]{string}, str2);
                }
                int iMin = Math.min(dVar.m2410p(), stackTrace.length - iM2411q);
                String[] strArr = new String[iMin];
                strArr[0] = string;
                int length = name.length() + 2;
                String string2 = new Formatter().format("%" + length + "s", "").toString();
                for (int i6 = 1; i6 < iMin; i6++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i6 + iM2411q];
                    strArr[i6] = new Formatter().format("%s%s.%s(%s:%d)", string2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), m2386r(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new i(str, strArr, str2);
            }
        } else {
            str = dVar.m2407m();
        }
        return new i(str, null, ": ");
    }

    /* renamed from: J */
    public static void m2368J(Object... objArr) {
        m2391w(5, f2114d.m2407m(), objArr);
    }

    /* renamed from: h */
    public static boolean m2376h(String str, String str2) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!AbstractC4663o0.m2320e(file.getParentFile())) {
            return false;
        }
        try {
            m2378j(str, str2);
            boolean zCreateNewFile = file.createNewFile();
            if (!zCreateNewFile) {
                return zCreateNewFile;
            }
            m2360B(str, str2);
            return zCreateNewFile;
        } catch (IOException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    /* renamed from: i */
    public static void m2377i(Object... objArr) {
        m2391w(3, f2114d.m2407m(), objArr);
    }

    /* renamed from: j */
    public static void m2378j(String str, String str2) {
        File[] fileArrListFiles;
        if (f2114d.m2409o() > 0 && (fileArrListFiles = new File(str).getParentFile().listFiles(new b())) != null && fileArrListFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (r0.m2409o() * CalendarModelKt.MillisecondsIn24Hours);
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (simpleDateFormat.parse(m2380l(name)).getTime() <= time) {
                        f2116f.execute(new c(file));
                    }
                }
            } catch (ParseException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static void m2379k(Object... objArr) {
        m2391w(6, f2114d.m2407m(), objArr);
    }

    /* renamed from: l */
    public static String m2380l(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    /* renamed from: m */
    public static String m2381m(int i6, Object obj) {
        return obj == null ? "null" : i6 == 32 ? f.m2426h(obj, 32) : i6 == 48 ? f.m2426h(obj, 48) : m2382n(obj);
    }

    /* renamed from: n */
    public static String m2382n(Object obj) {
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap simpleArrayMap = f2117g;
        if (!simpleArrayMap.isEmpty()) {
            AbstractC6619r.m7572a(simpleArrayMap.get(m2383o(obj)));
        }
        return f.m2425g(obj);
    }

    /* renamed from: o */
    public static Class m2383o(Object obj) {
        String string;
        Class<?> cls = obj.getClass();
        if (!cls.isAnonymousClass() && !cls.isSynthetic()) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces.length == 1) {
            Type rawType = genericInterfaces[0];
            while (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            }
            string = rawType.toString();
        } else {
            Type genericSuperclass = cls.getGenericSuperclass();
            while (genericSuperclass instanceof ParameterizedType) {
                genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
            }
            string = genericSuperclass.toString();
        }
        if (string.startsWith("class ")) {
            string = string.substring(6);
        } else if (string.startsWith("interface ")) {
            string = string.substring(10);
        }
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException e6) {
            e6.printStackTrace();
            return cls;
        }
    }

    /* renamed from: p */
    public static d m2384p() {
        return f2114d;
    }

    /* renamed from: q */
    public static String m2385q(Date date) {
        String strSubstring = m2387s().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        d dVar = f2114d;
        sb.append(dVar.m2403i());
        sb.append(dVar.m2406l());
        sb.append("_");
        sb.append(strSubstring);
        sb.append("_");
        sb.append(dVar.m2408n());
        sb.append(dVar.m2404j());
        return sb.toString();
    }

    /* renamed from: r */
    public static String m2386r(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        int iIndexOf = className.indexOf(36);
        if (iIndexOf != -1) {
            className = className.substring(0, iIndexOf);
        }
        return className + ".java";
    }

    /* renamed from: s */
    public static SimpleDateFormat m2387s() {
        if (f2115e == null) {
            f2115e = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f2115e;
    }

    /* renamed from: t */
    public static void m2388t(Object... objArr) {
        m2391w(4, f2114d.m2407m(), objArr);
    }

    /* renamed from: u */
    public static void m2389u(String str, String str2) {
        d dVar = f2114d;
        d.m2400f(dVar);
        AbstractC4663o0.m2315R(str, str2, true);
        d.m2401g(dVar);
    }

    /* renamed from: v */
    public static boolean m2390v(String str) {
        return str.matches("^" + f2114d.m2406l() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    /* renamed from: w */
    public static void m2391w(int i6, String str, Object... objArr) {
        d dVar = f2114d;
        if (dVar.m2416v()) {
            int i7 = i6 & 15;
            int i8 = i6 & 240;
            if (dVar.m2412r() || dVar.m2413s() || i8 == 16) {
                if (i7 >= dVar.f2134m || i7 >= dVar.f2135n) {
                    i iVarM2367I = m2367I(str);
                    String strM2365G = m2365G(i8, objArr);
                    if (dVar.m2412r() && i8 != 16 && i7 >= dVar.f2134m) {
                        m2393y(i7, iVarM2367I.f2141a, iVarM2367I.f2142b, strM2365G);
                    }
                    if ((dVar.m2413s() || i8 == 16) && i7 >= dVar.f2135n) {
                        f2116f.execute(new a(i7, iVarM2367I, strM2365G));
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public static void m2392x(int i6, String str, String str2) {
        Log.println(i6, str, str2);
        d.m2398d(f2114d);
    }

    /* renamed from: y */
    public static void m2393y(int i6, String str, String[] strArr, String str2) {
        if (f2114d.m2417w()) {
            m2363E(i6, str, m2366H(i6, str, strArr, str2));
            return;
        }
        m2359A(i6, str, true);
        m2361C(i6, str, strArr);
        m2362D(i6, str, str2);
        m2359A(i6, str, false);
    }

    /* renamed from: z */
    public static void m2394z(int i6, String str, String str2) {
        Date date = new Date();
        String str3 = m2387s().format(date);
        String strSubstring = str3.substring(0, 10);
        String strM2385q = m2385q(date);
        if (!m2376h(strM2385q, strSubstring)) {
            Log.e("LogUtils", "create " + strM2385q + " failed!");
            return;
        }
        m2389u(strM2385q, str3.substring(11) + f2111a[i6 - 2] + "/" + str + str2 + f2113c);
    }
}
