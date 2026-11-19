package kotlinx.serialization.json.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.navigation.C2857e;
import coil3.network.AbstractC3315g;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import p016b0.C3080k0;
import p041d2.C5413c;
import p084i7.InterfaceC5685a;
import p084i7.InterfaceC5686b;
import p084i7.InterfaceC5689e;
import p101k7.AbstractC5762d;
import p101k7.AbstractC5764f;
import p101k7.C5768j;
import p101k7.C5769k;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p125n7.AbstractC6227b;
import p125n7.C6246u;
import p129o2.C6268a;
import p133o7.AbstractC6281e;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;

/* renamed from: kotlinx.serialization.json.internal.j */
/* loaded from: classes4.dex */
public abstract class AbstractC6029j {

    /* renamed from: a */
    public static final C6030k f9556a = new C6030k();

    /* renamed from: a */
    public static final JsonDecodingException m5680a(Number number, String key, String output) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(output, "output");
        return m5683d(-1, "Unexpected special floating-point value " + number + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m5693n(output, -1)));
    }

    /* renamed from: b */
    public static final JsonEncodingException m5681b(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m5693n(str, -1)));
    }

    /* renamed from: c */
    public static final JsonEncodingException m5682c(InterfaceC5765g interfaceC5765g) {
        return new JsonEncodingException("Value of type '" + interfaceC5765g.mo5105h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC5765g.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: d */
    public static final JsonDecodingException m5683d(int i, String message) {
        AbstractC5830k.m5330g(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    /* renamed from: e */
    public static final JsonDecodingException m5684e(String message, CharSequence input, int i) {
        AbstractC5830k.m5330g(message, "message");
        AbstractC5830k.m5330g(input, "input");
        return m5683d(i, message + "\nJSON input: " + ((Object) m5693n(input, i)));
    }

    /* renamed from: f */
    public static final InterfaceC5765g m5685f(InterfaceC5765g interfaceC5765g, AbstractC6281e module) {
        InterfaceC5765g interfaceC5765gM5685f;
        InterfaceC5686b interfaceC5686bMo5874b;
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(module, "module");
        if (!AbstractC5830k.m5325b(interfaceC5765g.getKind(), C5768j.f9144b)) {
            return interfaceC5765g.isInline() ? m5685f(interfaceC5765g.mo5104g(0), module) : interfaceC5765g;
        }
        InterfaceC6779c interfaceC6779cM6448m = AbstractC6768a.m6448m(interfaceC5765g);
        InterfaceC5765g descriptor = null;
        if (interfaceC6779cM6448m != null && (interfaceC5686bMo5874b = module.mo5874b(interfaceC6779cM6448m, EmptyList.INSTANCE)) != null) {
            descriptor = interfaceC5686bMo5874b.getDescriptor();
        }
        return (descriptor == null || (interfaceC5765gM5685f = m5685f(descriptor, module)) == null) ? interfaceC5765g : interfaceC5765gM5685f;
    }

    /* renamed from: g */
    public static final byte m5686g(char c) {
        if (c < '~') {
            return C6024e.f9549b[c];
        }
        return (byte) 0;
    }

    /* renamed from: h */
    public static final String m5687h(InterfaceC5765g interfaceC5765g, AbstractC6227b json) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(json, "json");
        for (Annotation annotation : interfaceC5765g.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.f9966a.f9979e;
    }

    /* renamed from: i */
    public static final void m5688i(AbstractC6227b json, C5413c c5413c, InterfaceC5689e serializer, Object obj) {
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(serializer, "serializer");
        WriteMode mode = WriteMode.OBJ;
        C6041v[] c6041vArr = new C6041v[WriteMode.getEntries().size()];
        AbstractC5830k.m5330g(mode, "mode");
        new C6041v(new C3080k0(c5413c), json, mode, c6041vArr).encodeSerializableValue(serializer, obj);
    }

    /* renamed from: j */
    public static final int m5689j(InterfaceC5765g interfaceC5765g, AbstractC6227b json, String name) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(name, "name");
        m5694o(interfaceC5765g, json);
        int iMo5100c = interfaceC5765g.mo5100c(name);
        if (iMo5100c != -3 || !json.f9966a.f9980f) {
            return iMo5100c;
        }
        C6268a c6268a = json.f9968c;
        C2857e c2857e = new C2857e(22, interfaceC5765g, json);
        c6268a.getClass();
        C6030k c6030k = f9556a;
        Object objM5868x = c6268a.m5868x(interfaceC5765g, c6030k);
        if (objM5868x == null) {
            objM5868x = c2857e.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c6268a.f10022b;
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC5765g);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC5765g, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c6030k, objM5868x);
        }
        Integer num = (Integer) ((Map) objM5868x).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: k */
    public static final int m5690k(InterfaceC5765g interfaceC5765g, AbstractC6227b json, String name, String suffix) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(suffix, "suffix");
        int iM5689j = m5689j(interfaceC5765g, json, name);
        if (iM5689j != -3) {
            return iM5689j;
        }
        throw new SerializationException(interfaceC5765g.mo5105h() + " does not contain element with name '" + name + '\'' + suffix);
    }

    /* renamed from: l */
    public static final boolean m5691l(InterfaceC5765g interfaceC5765g, AbstractC6227b json) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(json, "json");
        if (json.f9966a.f9976b) {
            return true;
        }
        List annotations = interfaceC5765g.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof JsonIgnoreUnknownKeys) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static final void m5692m(C6043x c6043x, String str) {
        c6043x.m5718l(c6043x.f9597b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* renamed from: n */
    public static final CharSequence m5693n(CharSequence charSequence, int i) {
        AbstractC5830k.m5330g(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i8 = i - 30;
                int i9 = i + 30;
                String str = i8 <= 0 ? "" : ".....";
                String str2 = i9 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM97v = AbstractC0037f.m97v(str);
                if (i8 < 0) {
                    i8 = 0;
                }
                int length = charSequence.length();
                if (i9 > length) {
                    i9 = length;
                }
                sbM97v.append(charSequence.subSequence(i8, i9).toString());
                sbM97v.append(str2);
                return sbM97v.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* renamed from: o */
    public static final void m5694o(InterfaceC5765g interfaceC5765g, AbstractC6227b json) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5325b(interfaceC5765g.getKind(), C5770l.f9146b);
    }

    /* renamed from: p */
    public static final Object m5695p(AbstractC6227b abstractC6227b, String discriminator, C6246u c6246u, InterfaceC5685a interfaceC5685a) {
        AbstractC5830k.m5330g(abstractC6227b, "<this>");
        AbstractC5830k.m5330g(discriminator, "discriminator");
        return new C6033n(abstractC6227b, c6246u, discriminator, interfaceC5685a.getDescriptor()).decodeSerializableValue(interfaceC5685a);
    }

    /* renamed from: q */
    public static final WriteMode m5696q(InterfaceC5765g desc, AbstractC6227b abstractC6227b) {
        AbstractC5830k.m5330g(abstractC6227b, "<this>");
        AbstractC5830k.m5330g(desc, "desc");
        AbstractC3315g kind = desc.getKind();
        if (kind instanceof AbstractC5762d) {
            return WriteMode.POLY_OBJ;
        }
        if (AbstractC5830k.m5325b(kind, C5770l.f9147c)) {
            return WriteMode.LIST;
        }
        if (!AbstractC5830k.m5325b(kind, C5770l.f9148d)) {
            return WriteMode.OBJ;
        }
        InterfaceC5765g interfaceC5765gM5685f = m5685f(desc.mo5104g(0), abstractC6227b.f9967b);
        AbstractC3315g kind2 = interfaceC5765gM5685f.getKind();
        if ((kind2 instanceof AbstractC5764f) || AbstractC5830k.m5325b(kind2, C5769k.f9145b)) {
            return WriteMode.MAP;
        }
        throw m5682c(interfaceC5765gM5685f);
    }

    /* renamed from: r */
    public static final void m5697r(C6043x c6043x, Number number) {
        C6043x.m5706m(c6043x, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* renamed from: s */
    public static final String m5698s(byte b6) {
        return b6 == 1 ? "quotation mark '\"'" : b6 == 2 ? "string escape sequence '\\'" : b6 == 4 ? "comma ','" : b6 == 5 ? "colon ':'" : b6 == 6 ? "start of the object '{'" : b6 == 7 ? "end of the object '}'" : b6 == 8 ? "start of the array '['" : b6 == 9 ? "end of the array ']'" : b6 == 10 ? "end of the input" : b6 == 127 ? "invalid token" : "valid token";
    }
}
