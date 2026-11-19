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
import com.blankj.utilcode.util.AbstractC5372k0;
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

/* renamed from: com.blankj.utilcode.util.q */
/* loaded from: classes3.dex */
public abstract class AbstractC5380q {

    /* renamed from: e */
    public static SimpleDateFormat f2735e;

    /* renamed from: a */
    public static final char[] f2731a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* renamed from: b */
    public static final String f2732b = System.getProperty("file.separator");

    /* renamed from: c */
    public static final String f2733c = System.getProperty("line.separator");

    /* renamed from: d */
    public static final d f2734d = new d(null);

    /* renamed from: f */
    public static final ExecutorService f2736f = Executors.newSingleThreadExecutor();

    /* renamed from: g */
    public static final SimpleArrayMap f2737g = new SimpleArrayMap();

    /* renamed from: com.blankj.utilcode.util.q$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f2738a;

        /* renamed from: b */
        public final /* synthetic */ i f2739b;

        /* renamed from: c */
        public final /* synthetic */ String f2740c;

        public a(int i10, i iVar, String str) {
            this.f2738a = i10;
            this.f2739b = iVar;
            this.f2740c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5380q.m2629y(this.f2738a, this.f2739b.f2761a, this.f2739b.f2763c + this.f2740c);
        }
    }

    /* renamed from: com.blankj.utilcode.util.q$b */
    public class b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return AbstractC5380q.m2625u(str);
        }
    }

    /* renamed from: com.blankj.utilcode.util.q$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ File f2741a;

        public c(File file) {
            this.f2741a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2741a.delete()) {
                return;
            }
            Log.e("LogUtils", "delete " + this.f2741a + " failed!");
        }
    }

    /* renamed from: com.blankj.utilcode.util.q$d */
    public static final class d {

        /* renamed from: a */
        public String f2742a;

        /* renamed from: b */
        public String f2743b;

        /* renamed from: c */
        public String f2744c;

        /* renamed from: d */
        public String f2745d;

        /* renamed from: e */
        public boolean f2746e;

        /* renamed from: f */
        public boolean f2747f;

        /* renamed from: g */
        public String f2748g;

        /* renamed from: h */
        public boolean f2749h;

        /* renamed from: i */
        public boolean f2750i;

        /* renamed from: j */
        public boolean f2751j;

        /* renamed from: k */
        public boolean f2752k;

        /* renamed from: l */
        public boolean f2753l;

        /* renamed from: m */
        public int f2754m;

        /* renamed from: n */
        public int f2755n;

        /* renamed from: o */
        public int f2756o;

        /* renamed from: p */
        public int f2757p;

        /* renamed from: q */
        public int f2758q;

        /* renamed from: r */
        public String f2759r;

        /* renamed from: s */
        public AbstractC5372k0.a f2760s;

        public /* synthetic */ d(a aVar) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ g m2634d(d dVar) {
            dVar.getClass();
            return null;
        }

        /* renamed from: f */
        public static /* synthetic */ e m2636f(d dVar) {
            dVar.getClass();
            return null;
        }

        /* renamed from: g */
        public static /* synthetic */ h m2637g(d dVar) {
            dVar.getClass();
            return null;
        }

        /* renamed from: h */
        public final char m2638h() {
            return AbstractC5380q.f2731a[this.f2754m - 2];
        }

        /* renamed from: i */
        public final String m2639i() {
            String str = this.f2743b;
            return str == null ? this.f2742a : str;
        }

        /* renamed from: j */
        public final String m2640j() {
            return this.f2745d;
        }

        /* renamed from: k */
        public final char m2641k() {
            return AbstractC5380q.f2731a[this.f2755n - 2];
        }

        /* renamed from: l */
        public final String m2642l() {
            return this.f2744c;
        }

        /* renamed from: m */
        public final String m2643m() {
            return AbstractC5372k0.m2533D(this.f2748g) ? "" : this.f2748g;
        }

        /* renamed from: n */
        public final String m2644n() {
            String str = this.f2759r;
            return str == null ? "" : str.replace(":", "_");
        }

        /* renamed from: o */
        public final int m2645o() {
            return this.f2758q;
        }

        /* renamed from: p */
        public final int m2646p() {
            return this.f2756o;
        }

        /* renamed from: q */
        public final int m2647q() {
            return this.f2757p;
        }

        /* renamed from: r */
        public final boolean m2648r() {
            return this.f2747f;
        }

        /* renamed from: s */
        public final boolean m2649s() {
            return this.f2751j;
        }

        /* renamed from: t */
        public final boolean m2650t() {
            return this.f2752k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(m2644n());
            sb.append(AbstractC5380q.f2733c);
            sb.append("logSwitch: ");
            sb.append(m2652v());
            sb.append(AbstractC5380q.f2733c);
            sb.append("consoleSwitch: ");
            sb.append(m2648r());
            sb.append(AbstractC5380q.f2733c);
            sb.append("tag: ");
            sb.append(m2643m().equals("") ? "null" : m2643m());
            sb.append(AbstractC5380q.f2733c);
            sb.append("headSwitch: ");
            sb.append(m2651u());
            sb.append(AbstractC5380q.f2733c);
            sb.append("fileSwitch: ");
            sb.append(m2649s());
            sb.append(AbstractC5380q.f2733c);
            sb.append("dir: ");
            sb.append(m2639i());
            sb.append(AbstractC5380q.f2733c);
            sb.append("filePrefix: ");
            sb.append(m2642l());
            sb.append(AbstractC5380q.f2733c);
            sb.append("borderSwitch: ");
            sb.append(m2650t());
            sb.append(AbstractC5380q.f2733c);
            sb.append("singleTagSwitch: ");
            sb.append(m2653w());
            sb.append(AbstractC5380q.f2733c);
            sb.append("consoleFilter: ");
            sb.append(m2638h());
            sb.append(AbstractC5380q.f2733c);
            sb.append("fileFilter: ");
            sb.append(m2641k());
            sb.append(AbstractC5380q.f2733c);
            sb.append("stackDeep: ");
            sb.append(m2646p());
            sb.append(AbstractC5380q.f2733c);
            sb.append("stackOffset: ");
            sb.append(m2647q());
            sb.append(AbstractC5380q.f2733c);
            sb.append("saveDays: ");
            sb.append(m2645o());
            sb.append(AbstractC5380q.f2733c);
            sb.append("formatter: ");
            sb.append(AbstractC5380q.f2737g);
            sb.append(AbstractC5380q.f2733c);
            sb.append("fileWriter: ");
            sb.append((Object) null);
            sb.append(AbstractC5380q.f2733c);
            sb.append("onConsoleOutputListener: ");
            sb.append((Object) null);
            sb.append(AbstractC5380q.f2733c);
            sb.append("onFileOutputListener: ");
            sb.append((Object) null);
            sb.append(AbstractC5380q.f2733c);
            sb.append("fileExtraHeader: ");
            sb.append(this.f2760s.m2573c());
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean m2651u() {
            return this.f2750i;
        }

        /* renamed from: v */
        public final boolean m2652v() {
            return this.f2746e;
        }

        /* renamed from: w */
        public final boolean m2653w() {
            return this.f2753l;
        }

        public d() {
            this.f2744c = "util";
            this.f2745d = ".txt";
            this.f2746e = true;
            this.f2747f = true;
            this.f2748g = "";
            this.f2749h = true;
            this.f2750i = true;
            this.f2751j = false;
            this.f2752k = true;
            this.f2753l = true;
            this.f2754m = 2;
            this.f2755n = 2;
            this.f2756o = 1;
            this.f2757p = 0;
            this.f2758q = -1;
            this.f2759r = AbstractC5372k0.m2558n();
            this.f2760s = new AbstractC5372k0.a("Log");
            if (!AbstractC5372k0.m2532C() || AbstractC5366h0.m2478a().getExternalFilesDir(null) == null) {
                this.f2742a = AbstractC5366h0.m2478a().getFilesDir() + AbstractC5380q.f2732b + "log" + AbstractC5380q.f2732b;
                return;
            }
            this.f2742a = AbstractC5366h0.m2478a().getExternalFilesDir(null) + AbstractC5380q.f2732b + "log" + AbstractC5380q.f2732b;
        }
    }

    /* renamed from: com.blankj.utilcode.util.q$e */
    public interface e {
    }

    /* renamed from: com.blankj.utilcode.util.q$f */
    public static final class f {
        /* renamed from: a */
        public static String m2654a(Object obj) {
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
        public static String m2655b(Bundle bundle) {
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
                    sb.append(obj == bundle ? "(this Bundle)" : m2655b((Bundle) obj));
                } else {
                    sb.append(AbstractC5380q.m2618n(obj));
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
        public static void m2656c(ClipData clipData, StringBuilder sb) {
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
                sb.append(m2658e(intent));
                sb.append("}");
            }
        }

        /* renamed from: d */
        public static String m2657d(String str) throws TransformerException, IllegalArgumentException {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", ExifInterface.GPS_MEASUREMENT_2D);
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + AbstractC5380q.f2733c);
            } catch (Exception e10) {
                e10.printStackTrace();
                return str;
            }
        }

        /* renamed from: e */
        public static String m2658e(Intent intent) {
            boolean z10;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z11 = false;
            boolean z12 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z10 = false;
            } else {
                z10 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z12) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z12 = false;
                }
                sb.append("]");
                z10 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z10 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z10 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z10 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z10 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z10 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z10 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z10) {
                    sb.append(' ');
                }
                m2656c(clipData, sb);
                z10 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z10) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(m2655b(extras));
                sb.append('}');
            } else {
                z11 = z10;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z11) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : m2658e(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        /* renamed from: f */
        public static String m2659f(Object obj) {
            if (obj instanceof CharSequence) {
                return AbstractC5372k0.m2554j(obj.toString());
            }
            try {
                return AbstractC5372k0.m2561q().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        /* renamed from: g */
        public static String m2660g(Object obj) {
            return m2661h(obj, -1);
        }

        /* renamed from: h */
        public static String m2661h(Object obj, int i10) {
            return obj.getClass().isArray() ? m2654a(obj) : obj instanceof Throwable ? AbstractC5372k0.m2560p((Throwable) obj) : obj instanceof Bundle ? m2655b((Bundle) obj) : obj instanceof Intent ? m2658e((Intent) obj) : i10 == 32 ? m2659f(obj) : i10 == 48 ? m2657d(obj.toString()) : obj.toString();
        }
    }

    /* renamed from: com.blankj.utilcode.util.q$g */
    public interface g {
    }

    /* renamed from: com.blankj.utilcode.util.q$h */
    public interface h {
    }

    /* renamed from: com.blankj.utilcode.util.q$i */
    public static final class i {

        /* renamed from: a */
        public String f2761a;

        /* renamed from: b */
        public String[] f2762b;

        /* renamed from: c */
        public String f2763c;

        public i(String str, String[] strArr, String str2) {
            this.f2761a = str;
            this.f2762b = strArr;
            this.f2763c = str2;
        }
    }

    /* renamed from: A */
    public static void m2597A(String str, String str2) {
        d dVar = f2734d;
        dVar.f2760s.m2571a("Date of Log", str2);
        m2624t(str, dVar.f2760s.toString());
    }

    /* renamed from: B */
    public static void m2598B(int i10, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (f2734d.m2650t()) {
                    str2 = "│ " + str2;
                }
                m2627w(i10, str, str2);
            }
            if (f2734d.m2650t()) {
                m2627w(i10, str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            }
        }
    }

    /* renamed from: C */
    public static void m2599C(int i10, String str, String str2) {
        int length = str2.length();
        int i11 = length / 1100;
        if (i11 <= 0) {
            m2601E(i10, str, str2);
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i13 + 1100;
            m2601E(i10, str, str2.substring(i13, i14));
            i12++;
            i13 = i14;
        }
        if (i13 != length) {
            m2601E(i10, str, str2.substring(i13, length));
        }
    }

    /* renamed from: D */
    public static void m2600D(int i10, String str, String str2) {
        int length = str2.length();
        d dVar = f2734d;
        int i11 = 1100;
        int i12 = dVar.m2650t() ? (length - 113) / 1100 : length / 1100;
        if (i12 <= 0) {
            m2627w(i10, str, str2);
            return;
        }
        int i13 = 1;
        if (!dVar.m2650t()) {
            m2627w(i10, str, str2.substring(0, 1100));
            while (i13 < i12) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(f2733c);
                int i14 = i11 + 1100;
                sb.append(str2.substring(i11, i14));
                m2627w(i10, str, sb.toString());
                i13++;
                i11 = i14;
            }
            if (i11 != length) {
                m2627w(i10, str, " " + f2733c + str2.substring(i11, length));
                return;
            }
            return;
        }
        m2627w(i10, str, str2.substring(0, 1100) + f2733c + "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        while (i13 < i12) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            String str3 = f2733c;
            sb2.append(str3);
            sb2.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb2.append(str3);
            sb2.append("│ ");
            int i15 = i11 + 1100;
            sb2.append(str2.substring(i11, i15));
            sb2.append(str3);
            sb2.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            m2627w(i10, str, sb2.toString());
            i13++;
            i11 = i15;
        }
        if (i11 != length - 113) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" ");
            String str4 = f2733c;
            sb3.append(str4);
            sb3.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb3.append(str4);
            sb3.append("│ ");
            sb3.append(str2.substring(i11, length));
            m2627w(i10, str, sb3.toString());
        }
    }

    /* renamed from: E */
    public static void m2601E(int i10, String str, String str2) {
        if (!f2734d.m2650t()) {
            m2627w(i10, str, str2);
            return;
        }
        for (String str3 : str2.split(f2733c)) {
            m2627w(i10, str, "│ " + str3);
        }
    }

    /* renamed from: F */
    public static String m2602F(int i10, Object... objArr) {
        String string;
        if (objArr != null) {
            if (objArr.length == 1) {
                string = m2617m(i10, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = objArr[i11];
                    sb.append("args");
                    sb.append("[");
                    sb.append(i11);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(m2618n(obj));
                    sb.append(f2733c);
                }
                string = sb.toString();
            }
        } else {
            string = "null";
        }
        return string.length() == 0 ? "log nothing" : string;
    }

    /* renamed from: G */
    public static String m2603G(int i10, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        if (f2734d.m2650t()) {
            sb.append(" ");
            String str3 = f2733c;
            sb.append(str3);
            sb.append("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append("│ ");
                    sb.append(str4);
                    sb.append(f2733c);
                }
                sb.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
                sb.append(f2733c);
            }
            String[] strArrSplit = str2.split(f2733c);
            int length = strArrSplit.length;
            while (i11 < length) {
                String str5 = strArrSplit[i11];
                sb.append("│ ");
                sb.append(str5);
                sb.append(f2733c);
                i11++;
            }
            sb.append("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        } else {
            if (strArr != null) {
                sb.append(" ");
                sb.append(f2733c);
                int length2 = strArr.length;
                while (i11 < length2) {
                    sb.append(strArr[i11]);
                    sb.append(f2733c);
                    i11++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: H */
    public static i m2604H(String str) {
        d dVar = f2734d;
        if (dVar.f2749h || dVar.m2651u()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int iM2647q = dVar.m2647q() + 3;
            if (iM2647q >= stackTrace.length) {
                String strM2621q = m2621q(stackTrace[3]);
                if (dVar.f2749h && AbstractC5372k0.m2533D(str)) {
                    int iIndexOf = strM2621q.indexOf(46);
                    str = iIndexOf == -1 ? strM2621q : strM2621q.substring(0, iIndexOf);
                }
                return new i(str, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[iM2647q];
            String strM2621q2 = m2621q(stackTraceElement);
            if (dVar.f2749h && AbstractC5372k0.m2533D(str)) {
                int iIndexOf2 = strM2621q2.indexOf(46);
                str = iIndexOf2 == -1 ? strM2621q2 : strM2621q2.substring(0, iIndexOf2);
            }
            if (dVar.m2651u()) {
                String name = Thread.currentThread().getName();
                String string = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), strM2621q2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + string + "]: ";
                if (dVar.m2646p() <= 1) {
                    return new i(str, new String[]{string}, str2);
                }
                int iMin = Math.min(dVar.m2646p(), stackTrace.length - iM2647q);
                String[] strArr = new String[iMin];
                strArr[0] = string;
                int length = name.length() + 2;
                String string2 = new Formatter().format("%" + length + "s", "").toString();
                for (int i10 = 1; i10 < iMin; i10++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i10 + iM2647q];
                    strArr[i10] = new Formatter().format("%s%s.%s(%s:%d)", string2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), m2621q(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new i(str, strArr, str2);
            }
        } else {
            str = dVar.m2643m();
        }
        return new i(str, null, ": ");
    }

    /* renamed from: h */
    public static boolean m2612h(String str, String str2) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!AbstractC5372k0.m2548d(file.getParentFile())) {
            return false;
        }
        try {
            m2614j(str, str2);
            boolean zCreateNewFile = file.createNewFile();
            if (!zCreateNewFile) {
                return zCreateNewFile;
            }
            m2597A(str, str2);
            return zCreateNewFile;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: i */
    public static void m2613i(Object... objArr) {
        m2626v(3, f2734d.m2643m(), objArr);
    }

    /* renamed from: j */
    public static void m2614j(String str, String str2) {
        File[] fileArrListFiles;
        if (f2734d.m2645o() > 0 && (fileArrListFiles = new File(str).getParentFile().listFiles(new b())) != null && fileArrListFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (r0.m2645o() * CalendarModelKt.MillisecondsIn24Hours);
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (simpleDateFormat.parse(m2616l(name)).getTime() <= time) {
                        f2736f.execute(new c(file));
                    }
                }
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static void m2615k(Object... objArr) {
        m2626v(6, f2734d.m2643m(), objArr);
    }

    /* renamed from: l */
    public static String m2616l(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    /* renamed from: m */
    public static String m2617m(int i10, Object obj) {
        return obj == null ? "null" : i10 == 32 ? f.m2661h(obj, 32) : i10 == 48 ? f.m2661h(obj, 48) : m2618n(obj);
    }

    /* renamed from: n */
    public static String m2618n(Object obj) {
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap simpleArrayMap = f2737g;
        if (!simpleArrayMap.isEmpty()) {
            AbstractC5379p.m2596a(simpleArrayMap.get(m2619o(obj)));
        }
        return f.m2660g(obj);
    }

    /* renamed from: o */
    public static Class m2619o(Object obj) {
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
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return cls;
        }
    }

    /* renamed from: p */
    public static String m2620p(Date date) {
        String strSubstring = m2622r().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        d dVar = f2734d;
        sb.append(dVar.m2639i());
        sb.append(dVar.m2642l());
        sb.append("_");
        sb.append(strSubstring);
        sb.append("_");
        sb.append(dVar.m2644n());
        sb.append(dVar.m2640j());
        return sb.toString();
    }

    /* renamed from: q */
    public static String m2621q(StackTraceElement stackTraceElement) {
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

    /* renamed from: r */
    public static SimpleDateFormat m2622r() {
        if (f2735e == null) {
            f2735e = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f2735e;
    }

    /* renamed from: s */
    public static void m2623s(Object... objArr) {
        m2626v(4, f2734d.m2643m(), objArr);
    }

    /* renamed from: t */
    public static void m2624t(String str, String str2) {
        d dVar = f2734d;
        d.m2636f(dVar);
        AbstractC5372k0.m2544O(str, str2, true);
        d.m2637g(dVar);
    }

    /* renamed from: u */
    public static boolean m2625u(String str) {
        return str.matches("^" + f2734d.m2642l() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    /* renamed from: v */
    public static void m2626v(int i10, String str, Object... objArr) {
        d dVar = f2734d;
        if (dVar.m2652v()) {
            int i11 = i10 & 15;
            int i12 = i10 & 240;
            if (dVar.m2648r() || dVar.m2649s() || i12 == 16) {
                if (i11 >= dVar.f2754m || i11 >= dVar.f2755n) {
                    i iVarM2604H = m2604H(str);
                    String strM2602F = m2602F(i12, objArr);
                    if (dVar.m2648r() && i12 != 16 && i11 >= dVar.f2754m) {
                        m2628x(i11, iVarM2604H.f2761a, iVarM2604H.f2762b, strM2602F);
                    }
                    if ((dVar.m2649s() || i12 == 16) && i11 >= dVar.f2755n) {
                        f2736f.execute(new a(i11, iVarM2604H, strM2602F));
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public static void m2627w(int i10, String str, String str2) {
        Log.println(i10, str, str2);
        d.m2634d(f2734d);
    }

    /* renamed from: x */
    public static void m2628x(int i10, String str, String[] strArr, String str2) {
        if (f2734d.m2653w()) {
            m2600D(i10, str, m2603G(i10, str, strArr, str2));
            return;
        }
        m2630z(i10, str, true);
        m2598B(i10, str, strArr);
        m2599C(i10, str, str2);
        m2630z(i10, str, false);
    }

    /* renamed from: y */
    public static void m2629y(int i10, String str, String str2) {
        Date date = new Date();
        String str3 = m2622r().format(date);
        String strSubstring = str3.substring(0, 10);
        String strM2620p = m2620p(date);
        if (!m2612h(strM2620p, strSubstring)) {
            Log.e("LogUtils", "create " + strM2620p + " failed!");
            return;
        }
        m2624t(strM2620p, str3.substring(11) + f2731a[i10 - 2] + "/" + str + str2 + f2733c);
    }

    /* renamed from: z */
    public static void m2630z(int i10, String str, boolean z10) {
        if (f2734d.m2650t()) {
            m2627w(i10, str, z10 ? "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────" : "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        }
    }
}
