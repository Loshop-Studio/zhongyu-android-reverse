package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public class C0294b {

    /* renamed from: a */
    private final ConstraintLayout f1962a;

    /* renamed from: b */
    C0295c f1963b;

    /* renamed from: c */
    int f1964c = -1;

    /* renamed from: d */
    int f1965d = -1;

    /* renamed from: e */
    private SparseArray<a> f1966e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0295c> f1967f = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    static class a {

        /* renamed from: a */
        int f1968a;

        /* renamed from: b */
        ArrayList<b> f1969b = new ArrayList<>();

        /* renamed from: c */
        int f1970c;

        /* renamed from: d */
        C0295c f1971d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1970c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2524v7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2533w7) {
                    this.f1968a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1968a);
                } else if (index == C0298f.f2542x7) {
                    this.f1970c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1970c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1970c);
                    context.getResources().getResourceName(this.f1970c);
                    if ("layout".equals(resourceTypeName)) {
                        C0295c c0295c = new C0295c();
                        this.f1971d = c0295c;
                        c0295c.m1661h(context, this.f1970c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m1644a(b bVar) {
            this.f1969b.add(bVar);
        }

        /* renamed from: b */
        public int m1645b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f1969b.size(); i4++) {
                if (this.f1969b.get(i4).m1646a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    static class b {

        /* renamed from: a */
        float f1972a;

        /* renamed from: b */
        float f1973b;

        /* renamed from: c */
        float f1974c;

        /* renamed from: d */
        float f1975d;

        /* renamed from: e */
        int f1976e;

        /* renamed from: f */
        C0295c f1977f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1972a = Float.NaN;
            this.f1973b = Float.NaN;
            this.f1974c = Float.NaN;
            this.f1975d = Float.NaN;
            this.f1976e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2354d8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2364e8) {
                    this.f1976e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1976e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1976e);
                    context.getResources().getResourceName(this.f1976e);
                    if ("layout".equals(resourceTypeName)) {
                        C0295c c0295c = new C0295c();
                        this.f1977f = c0295c;
                        c0295c.m1661h(context, this.f1976e);
                    }
                } else if (index == C0298f.f2374f8) {
                    this.f1975d = typedArrayObtainStyledAttributes.getDimension(index, this.f1975d);
                } else if (index == C0298f.f2384g8) {
                    this.f1973b = typedArrayObtainStyledAttributes.getDimension(index, this.f1973b);
                } else if (index == C0298f.f2394h8) {
                    this.f1974c = typedArrayObtainStyledAttributes.getDimension(index, this.f1974c);
                } else if (index == C0298f.f2404i8) {
                    this.f1972a = typedArrayObtainStyledAttributes.getDimension(index, this.f1972a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m1646a(float f4, float f5) {
            if (!Float.isNaN(this.f1972a) && f4 < this.f1972a) {
                return false;
            }
            if (!Float.isNaN(this.f1973b) && f5 < this.f1973b) {
                return false;
            }
            if (Float.isNaN(this.f1974c) || f4 <= this.f1974c) {
                return Float.isNaN(this.f1975d) || f5 <= this.f1975d;
            }
            return false;
        }
    }

    C0294b(Context context, ConstraintLayout constraintLayout, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f1962a = constraintLayout;
        m1640a(context, i4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    private void m1640a(Context context, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i4);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c4 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c4 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    if (c4 != 0 && c4 != 1) {
                        if (c4 == 2) {
                            aVar = new a(context, xml);
                            this.f1966e.put(aVar.f1968a, aVar);
                        } else if (c4 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.m1644a(bVar);
                            }
                        } else if (c4 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m1641b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1641b(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        C0295c c0295c = new C0295c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if ("id".equals(xmlPullParser.getAttributeName(i4))) {
                String attributeValue = xmlPullParser.getAttributeValue(i4);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c0295c.m1672v(context, xmlPullParser);
                this.f1967f.put(identifier, c0295c);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m1642c(AbstractC0296d abstractC0296d) {
    }

    /* renamed from: d */
    public void m1643d(int i4, float f4, float f5) {
        int iM1645b;
        int i5 = this.f1964c;
        if (i5 == i4) {
            a aVarValueAt = i4 == -1 ? this.f1966e.valueAt(0) : this.f1966e.get(i5);
            int i6 = this.f1965d;
            if ((i6 == -1 || !aVarValueAt.f1969b.get(i6).m1646a(f4, f5)) && this.f1965d != (iM1645b = aVarValueAt.m1645b(f4, f5))) {
                C0295c c0295c = iM1645b == -1 ? this.f1963b : aVarValueAt.f1969b.get(iM1645b).f1977f;
                if (iM1645b != -1) {
                    int i7 = aVarValueAt.f1969b.get(iM1645b).f1976e;
                }
                if (c0295c == null) {
                    return;
                }
                this.f1965d = iM1645b;
                c0295c.m1657d(this.f1962a);
                return;
            }
            return;
        }
        this.f1964c = i4;
        a aVar = this.f1966e.get(i4);
        int iM1645b2 = aVar.m1645b(f4, f5);
        C0295c c0295c2 = iM1645b2 == -1 ? aVar.f1971d : aVar.f1969b.get(iM1645b2).f1977f;
        if (iM1645b2 != -1) {
            int i8 = aVar.f1969b.get(iM1645b2).f1976e;
        }
        if (c0295c2 != null) {
            this.f1965d = iM1645b2;
            c0295c2.m1657d(this.f1962a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i4 + ", dim =" + f4 + ", " + f5);
    }
}
