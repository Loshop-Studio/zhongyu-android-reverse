package p153l2;

import android.util.Xml;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: l2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8494e {
    /* renamed from: a */
    public static final Object m13951a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            }
            if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
            try {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } catch (Exception unused) {
                throw new XmlPullParserException("Unexpected call next(): " + xmlPullParser.getName());
            }
        }
        return m13962l(xmlPullParser, strArr);
    }

    /* renamed from: b */
    public static final ArrayList m13952b(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m13962l(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: c */
    public static final HashMap m13953c(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (HashMap) m13951a(xmlPullParserNewPullParser, new String[1]);
    }

    /* renamed from: d */
    public static final HashMap m13954d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException, NumberFormatException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object objM13962l = m13962l(xmlPullParser, strArr);
                String str2 = strArr[0];
                if (str2 == null) {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
                map.put(str2, objM13962l);
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return map;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: e */
    public static final void m13955e(Object obj, String str, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
            }
            xmlSerializer.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            xmlSerializer.startTag(null, TypedValues.Custom.S_STRING);
            if (str != null) {
                xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, TypedValues.Custom.S_STRING);
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = TypedValues.Custom.S_FLOAT;
        } else if (obj instanceof Double) {
            str2 = "double";
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof byte[]) {
                    m13959i((byte[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof int[]) {
                    m13960j((int[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof Map) {
                    m13958h((Map) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof List) {
                    m13956f((List) obj, str, xmlSerializer);
                    return;
                }
                if (!(obj instanceof CharSequence)) {
                    throw new RuntimeException("writeValueXml: unable to write value " + obj);
                }
                xmlSerializer.startTag(null, TypedValues.Custom.S_STRING);
                if (str != null) {
                    xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, TypedValues.Custom.S_STRING);
                return;
            }
            str2 = TypedValues.Custom.S_BOOLEAN;
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }

    /* renamed from: f */
    public static final void m13956f(List list, String str, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m13955e(list.get(i10), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    /* renamed from: g */
    public static final void m13957g(Map map, OutputStream outputStream) throws IllegalStateException, IOException, IllegalArgumentException {
        C8490a c8490a = new C8490a();
        c8490a.setOutput(outputStream, "utf-8");
        c8490a.startDocument(null, Boolean.TRUE);
        c8490a.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        m13958h(map, null, c8490a);
        c8490a.endDocument();
    }

    /* renamed from: h */
    public static final void m13958h(Map map, String str, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
        }
        for (Map.Entry entry : map.entrySet()) {
            m13955e(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    /* renamed from: i */
    public static final void m13959i(byte[] bArr, String str, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(bArr.length));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 >> 4;
            sb.append(i10 >= 10 ? i10 + 87 : i10 + 48);
            int i11 = b10 & UByte.MAX_VALUE;
            sb.append(i11 >= 10 ? i11 + 87 : i11 + 48);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    /* renamed from: j */
    public static final void m13960j(int[] iArr, String str, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, HintConstants.AUTOFILL_HINT_NAME, str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(iArr.length));
        for (int i10 : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i10));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    /* renamed from: k */
    public static final int[] m13961k(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int eventType = xmlPullParser.getEventType();
            int i10 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        iArr[i10] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i10++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    /* renamed from: l */
    public static Object m13962l(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException, NumberFormatException {
        int next;
        Object objValueOf = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, HintConstants.AUTOFILL_HINT_NAME);
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals(TypedValues.Custom.S_STRING)) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                    if (next2 == 3) {
                        if (xmlPullParser.getName().equals(TypedValues.Custom.S_STRING)) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    }
                    if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                objValueOf = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                objValueOf = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals(TypedValues.Custom.S_FLOAT)) {
                objValueOf = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                objValueOf = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (!name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    if (name.equals("int-array")) {
                        xmlPullParser.next();
                        int[] iArrM13961k = m13961k(xmlPullParser, "int-array", strArr);
                        strArr[0] = attributeValue;
                        return iArrM13961k;
                    }
                    if (name.equals("map")) {
                        xmlPullParser.next();
                        HashMap mapM13954d = m13954d(xmlPullParser, "map", strArr);
                        strArr[0] = attributeValue;
                        return mapM13954d;
                    }
                    if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList arrayListM13952b = m13952b(xmlPullParser, "list", strArr);
                        strArr[0] = attributeValue;
                        return arrayListM13952b;
                    }
                    throw new XmlPullParserException("Unknown tag: " + name);
                }
                objValueOf = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            }
            if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return objValueOf;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            }
            if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }
}
