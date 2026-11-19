package p148s;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p139q.C3005c;
import p176z.C3502d;

/* renamed from: s.c */
/* loaded from: classes.dex */
public class C3365c {

    /* renamed from: s.c$a */
    public interface a {
    }

    /* renamed from: s.c$b */
    public static final class b implements a {

        /* renamed from: a */
        private final c[] f11814a;

        public b(c[] cVarArr) {
            this.f11814a = cVarArr;
        }

        /* renamed from: a */
        public c[] m10212a() {
            return this.f11814a;
        }
    }

    /* renamed from: s.c$c */
    public static final class c {

        /* renamed from: a */
        private final String f11815a;

        /* renamed from: b */
        private int f11816b;

        /* renamed from: c */
        private boolean f11817c;

        /* renamed from: d */
        private String f11818d;

        /* renamed from: e */
        private int f11819e;

        /* renamed from: f */
        private int f11820f;

        public c(String str, int i4, boolean z3, String str2, int i5, int i6) {
            this.f11815a = str;
            this.f11816b = i4;
            this.f11817c = z3;
            this.f11818d = str2;
            this.f11819e = i5;
            this.f11820f = i6;
        }

        /* renamed from: a */
        public String m10213a() {
            return this.f11815a;
        }

        /* renamed from: b */
        public int m10214b() {
            return this.f11820f;
        }

        /* renamed from: c */
        public int m10215c() {
            return this.f11819e;
        }

        /* renamed from: d */
        public String m10216d() {
            return this.f11818d;
        }

        /* renamed from: e */
        public int m10217e() {
            return this.f11816b;
        }

        /* renamed from: f */
        public boolean m10218f() {
            return this.f11817c;
        }
    }

    /* renamed from: s.c$d */
    public static final class d implements a {

        /* renamed from: a */
        private final C3502d f11821a;

        /* renamed from: b */
        private final int f11822b;

        /* renamed from: c */
        private final int f11823c;

        /* renamed from: d */
        private final String f11824d;

        public d(C3502d c3502d, int i4, int i5, String str) {
            this.f11821a = c3502d;
            this.f11823c = i4;
            this.f11822b = i5;
            this.f11824d = str;
        }

        /* renamed from: a */
        public int m10219a() {
            return this.f11823c;
        }

        /* renamed from: b */
        public C3502d m10220b() {
            return this.f11821a;
        }

        /* renamed from: c */
        public String m10221c() {
            return this.f11824d;
        }

        /* renamed from: d */
        public int m10222d() {
            return this.f11822b;
        }
    }

    /* renamed from: a */
    private static int m10204a(TypedArray typedArray, int i4) {
        return typedArray.getType(i4);
    }

    /* renamed from: b */
    public static a m10205b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m10207d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m10206c(Resources resources, int i4) throws Resources.NotFoundException {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m10204a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(m10211h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m10211h(resources.getStringArray(i4)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static a m10207d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m10208e(xmlPullParser, resources);
        }
        m10210g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static a m10208e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3005c.f11646f);
        String string = typedArrayObtainAttributes.getString(C3005c.f11647g);
        String string2 = typedArrayObtainAttributes.getString(C3005c.f11651k);
        String string3 = typedArrayObtainAttributes.getString(C3005c.f11652l);
        int resourceId = typedArrayObtainAttributes.getResourceId(C3005c.f11648h, 0);
        int integer = typedArrayObtainAttributes.getInteger(C3005c.f11649i, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C3005c.f11650j, 500);
        String string4 = typedArrayObtainAttributes.getString(C3005c.f11653m);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m10210g(xmlPullParser);
            }
            return new d(new C3502d(string, string2, string3, m10206c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m10209f(xmlPullParser, resources));
                } else {
                    m10210g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* renamed from: f */
    private static c m10209f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3005c.f11654n);
        int i4 = C3005c.f11663w;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = C3005c.f11656p;
        }
        int i5 = typedArrayObtainAttributes.getInt(i4, 400);
        int i6 = C3005c.f11661u;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = C3005c.f11657q;
        }
        boolean z3 = 1 == typedArrayObtainAttributes.getInt(i6, 0);
        int i7 = C3005c.f11664x;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = C3005c.f11658r;
        }
        int i8 = C3005c.f11662v;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = C3005c.f11659s;
        }
        String string = typedArrayObtainAttributes.getString(i8);
        int i9 = typedArrayObtainAttributes.getInt(i7, 0);
        int i10 = C3005c.f11660t;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = C3005c.f11655o;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i10, 0);
        String string2 = typedArrayObtainAttributes.getString(i10);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m10210g(xmlPullParser);
        }
        return new c(string2, i5, z3, string, i9, resourceId);
    }

    /* renamed from: g */
    private static void m10210g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m10211h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
