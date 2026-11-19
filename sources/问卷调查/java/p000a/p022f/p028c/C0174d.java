package p000a.p022f.p028c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.f.c.d */
/* loaded from: classes.dex */
public class C0174d {

    /* renamed from: a */
    public SparseArray<a> f1246a = new SparseArray<>();

    /* renamed from: b */
    public SparseArray<C0175e> f1247b = new SparseArray<>();

    /* renamed from: a.f.c.d$a */
    public static class a {

        /* renamed from: a */
        public int f1248a;

        /* renamed from: b */
        public ArrayList<b> f1249b = new ArrayList<>();

        /* renamed from: c */
        public int f1250c;

        /* renamed from: d */
        public C0175e f1251d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1250c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0180j.f1383h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1248a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1248a);
                } else if (index == 1) {
                    this.f1250c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1250c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1250c);
                    context.getResources().getResourceName(this.f1250c);
                    if ("layout".equals(resourceTypeName)) {
                        C0175e c0175e = new C0175e();
                        this.f1251d = c0175e;
                        c0175e.m670a(context, this.f1250c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.d$b */
    public static class b {

        /* renamed from: a */
        public float f1252a;

        /* renamed from: b */
        public float f1253b;

        /* renamed from: c */
        public float f1254c;

        /* renamed from: d */
        public float f1255d;

        /* renamed from: e */
        public int f1256e;

        /* renamed from: f */
        public C0175e f1257f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f1252a = Float.NaN;
            this.f1253b = Float.NaN;
            this.f1254c = Float.NaN;
            this.f1255d = Float.NaN;
            this.f1256e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0180j.f1385j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1256e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1256e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1256e);
                    context.getResources().getResourceName(this.f1256e);
                    if ("layout".equals(resourceTypeName)) {
                        C0175e c0175e = new C0175e();
                        this.f1257f = c0175e;
                        c0175e.m670a(context, this.f1256e);
                    }
                } else if (index == 1) {
                    this.f1255d = typedArrayObtainStyledAttributes.getDimension(index, this.f1255d);
                } else if (index == 2) {
                    this.f1253b = typedArrayObtainStyledAttributes.getDimension(index, this.f1253b);
                } else if (index == 3) {
                    this.f1254c = typedArrayObtainStyledAttributes.getDimension(index, this.f1254c);
                } else if (index == 4) {
                    this.f1252a = typedArrayObtainStyledAttributes.getDimension(index, this.f1252a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C0174d(Context context, ConstraintLayout constraintLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f1246a.put(aVar.f1248a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.f1249b.add(bVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m669a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m669a(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p028c.C0174d.m669a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
