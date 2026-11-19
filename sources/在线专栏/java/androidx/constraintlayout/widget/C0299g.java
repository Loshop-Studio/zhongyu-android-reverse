package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes.dex */
public class C0299g {

    /* renamed from: a */
    int f2561a = -1;

    /* renamed from: b */
    int f2562b = -1;

    /* renamed from: c */
    int f2563c = -1;

    /* renamed from: d */
    private SparseArray<a> f2564d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0295c> f2565e = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.g$a */
    static class a {

        /* renamed from: a */
        int f2566a;

        /* renamed from: b */
        ArrayList<b> f2567b = new ArrayList<>();

        /* renamed from: c */
        int f2568c;

        /* renamed from: d */
        boolean f2569d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f2568c = -1;
            this.f2569d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2524v7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2533w7) {
                    this.f2566a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2566a);
                } else if (index == C0298f.f2542x7) {
                    this.f2568c = typedArrayObtainStyledAttributes.getResourceId(index, this.f2568c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2568c);
                    context.getResources().getResourceName(this.f2568c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f2569d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m1695a(b bVar) {
            this.f2567b.add(bVar);
        }

        /* renamed from: b */
        public int m1696b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f2567b.size(); i4++) {
                if (this.f2567b.get(i4).m1697a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.g$b */
    static class b {

        /* renamed from: a */
        float f2570a;

        /* renamed from: b */
        float f2571b;

        /* renamed from: c */
        float f2572c;

        /* renamed from: d */
        float f2573d;

        /* renamed from: e */
        int f2574e;

        /* renamed from: f */
        boolean f2575f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f2570a = Float.NaN;
            this.f2571b = Float.NaN;
            this.f2572c = Float.NaN;
            this.f2573d = Float.NaN;
            this.f2574e = -1;
            this.f2575f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2354d8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2364e8) {
                    this.f2574e = typedArrayObtainStyledAttributes.getResourceId(index, this.f2574e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2574e);
                    context.getResources().getResourceName(this.f2574e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f2575f = true;
                    }
                } else if (index == C0298f.f2374f8) {
                    this.f2573d = typedArrayObtainStyledAttributes.getDimension(index, this.f2573d);
                } else if (index == C0298f.f2384g8) {
                    this.f2571b = typedArrayObtainStyledAttributes.getDimension(index, this.f2571b);
                } else if (index == C0298f.f2394h8) {
                    this.f2572c = typedArrayObtainStyledAttributes.getDimension(index, this.f2572c);
                } else if (index == C0298f.f2404i8) {
                    this.f2570a = typedArrayObtainStyledAttributes.getDimension(index, this.f2570a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m1697a(float f4, float f5) {
            if (!Float.isNaN(this.f2570a) && f4 < this.f2570a) {
                return false;
            }
            if (!Float.isNaN(this.f2571b) && f5 < this.f2571b) {
                return false;
            }
            if (Float.isNaN(this.f2572c) || f4 <= this.f2572c) {
                return Float.isNaN(this.f2573d) || f5 <= this.f2573d;
            }
            return false;
        }
    }

    public C0299g(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m1691b(context, xmlPullParser);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: b */
    private void m1691b(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2089A7);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == C0298f.f2098B7) {
                this.f2561a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2561a);
            }
        }
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c4 = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c4 = 1;
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
                            aVar = new a(context, xmlPullParser);
                            this.f2564d.put(aVar.f2566a, aVar);
                        } else if (c4 != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b bVar = new b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.m1695a(bVar);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: a */
    public int m1692a(int i4, int i5, float f4, float f5) {
        a aVar = this.f2564d.get(i5);
        if (aVar == null) {
            return i5;
        }
        if (f4 == -1.0f || f5 == -1.0f) {
            if (aVar.f2568c == i4) {
                return i4;
            }
            Iterator<b> it = aVar.f2567b.iterator();
            while (it.hasNext()) {
                if (i4 == it.next().f2574e) {
                    return i4;
                }
            }
            return aVar.f2568c;
        }
        b bVar = null;
        Iterator<b> it2 = aVar.f2567b.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.m1697a(f4, f5)) {
                if (i4 == next.f2574e) {
                    return i4;
                }
                bVar = next;
            }
        }
        return bVar != null ? bVar.f2574e : aVar.f2568c;
    }

    /* renamed from: c */
    public int m1693c(int i4, int i5, int i6) {
        return m1694d(-1, i4, i5, i6);
    }

    /* renamed from: d */
    public int m1694d(int i4, int i5, float f4, float f5) {
        int iM1696b;
        if (i4 == i5) {
            a aVarValueAt = i5 == -1 ? this.f2564d.valueAt(0) : this.f2564d.get(this.f2562b);
            if (aVarValueAt == null) {
                return -1;
            }
            return ((this.f2563c == -1 || !aVarValueAt.f2567b.get(i4).m1697a(f4, f5)) && i4 != (iM1696b = aVarValueAt.m1696b(f4, f5))) ? iM1696b == -1 ? aVarValueAt.f2568c : aVarValueAt.f2567b.get(iM1696b).f2574e : i4;
        }
        a aVar = this.f2564d.get(i5);
        if (aVar == null) {
            return -1;
        }
        int iM1696b2 = aVar.m1696b(f4, f5);
        return iM1696b2 == -1 ? aVar.f2568c : aVar.f2567b.get(iM1696b2).f2574e;
    }
}
