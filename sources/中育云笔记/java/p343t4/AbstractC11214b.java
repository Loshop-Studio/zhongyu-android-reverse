package p343t4;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p317r4.C10839b;

/* renamed from: t4.b */
/* loaded from: classes5.dex */
public abstract class AbstractC11214b {
    /* renamed from: a */
    public static void m24934a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }

    /* renamed from: b */
    public static void m24935b(Reader reader, Writer writer) throws IOException {
        m24936c(reader, writer, new char[4096]);
    }

    /* renamed from: c */
    public static void m24936c(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return;
            } else {
                writer.write(cArr, 0, i10);
            }
        }
    }

    /* renamed from: d */
    public static Map m24937d(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(m24938e((String) entry.getKey()), entry.getValue());
        }
        return map2;
    }

    /* renamed from: e */
    public static String m24938e(String str) {
        int i10 = 0;
        if (str.length() > 0) {
            while (str.charAt(i10) == '/') {
                i10++;
            }
        }
        return MqttTopic.TOPIC_LEVEL_SEPARATOR + str.substring(i10);
    }

    /* renamed from: f */
    public static C10839b m24939f(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return C10839b.f26149c;
                }
                if (str2.contains("connect-dre")) {
                    return C10839b.f26150d;
                }
                if (str2.contains("connect-drru")) {
                    return C10839b.f26151e;
                }
                if (str2.contains("connect-dra")) {
                    return C10839b.f26152f;
                }
            }
            return C10839b.f26148b;
        }
        switch (str) {
            case "CN":
                return C10839b.f26149c;
            case "DE":
                return C10839b.f26150d;
            case "RU":
                return C10839b.f26151e;
            case "SG":
                return C10839b.f26152f;
            default:
                return C10839b.f26148b;
        }
    }

    /* renamed from: g */
    public static String m24940g(InputStream inputStream, String str) throws IOException {
        StringWriter stringWriter = new StringWriter();
        m24935b(new InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }
}
