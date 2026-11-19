package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0293a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* loaded from: classes.dex */
public class C0272h {

    /* renamed from: b */
    static HashMap<String, Constructor<? extends AbstractC0267c>> f1546b;

    /* renamed from: a */
    private HashMap<Integer, ArrayList<AbstractC0267c>> f1547a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC0267c>> map = new HashMap<>();
        f1546b = map;
        try {
            map.put("KeyAttribute", C0268d.class.getConstructor(new Class[0]));
            f1546b.put("KeyPosition", C0273i.class.getConstructor(new Class[0]));
            f1546b.put("KeyCycle", C0270f.class.getConstructor(new Class[0]));
            f1546b.put("KeyTimeCycle", C0275k.class.getConstructor(new Class[0]));
            f1546b.put("KeyTrigger", C0276l.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e4) {
            Log.e("KeyFrames", "unable to load", e4);
        }
    }

    public C0272h(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC0267c abstractC0267cNewInstance;
        Exception e4;
        HashMap<String, C0293a> map;
        AbstractC0267c abstractC0267c = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f1546b.containsKey(name)) {
                        try {
                            abstractC0267cNewInstance = f1546b.get(name).newInstance(new Object[0]);
                        } catch (Exception e5) {
                            abstractC0267cNewInstance = abstractC0267c;
                            e4 = e5;
                        }
                        try {
                            abstractC0267cNewInstance.mo1262c(context, Xml.asAttributeSet(xmlPullParser));
                            m1353b(abstractC0267cNewInstance);
                        } catch (Exception e6) {
                            e4 = e6;
                            Log.e("KeyFrames", "unable to create ", e4);
                            abstractC0267c = abstractC0267cNewInstance;
                            eventType = xmlPullParser.next();
                        }
                        abstractC0267c = abstractC0267cNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC0267c != null && (map = abstractC0267c.f1480e) != null) {
                        C0293a.m1632g(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1353b(AbstractC0267c abstractC0267c) {
        if (!this.f1547a.containsKey(Integer.valueOf(abstractC0267c.f1477b))) {
            this.f1547a.put(Integer.valueOf(abstractC0267c.f1477b), new ArrayList<>());
        }
        this.f1547a.get(Integer.valueOf(abstractC0267c.f1477b)).add(abstractC0267c);
    }

    /* renamed from: a */
    public void m1354a(C0278n c0278n) {
        ArrayList<AbstractC0267c> arrayList = this.f1547a.get(Integer.valueOf(c0278n.f1633b));
        if (arrayList != null) {
            c0278n.m1421b(arrayList);
        }
        ArrayList<AbstractC0267c> arrayList2 = this.f1547a.get(-1);
        if (arrayList2 != null) {
            Iterator<AbstractC0267c> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC0267c next = it.next();
                if (next.m1263d(((ConstraintLayout.LayoutParams) c0278n.f1632a.getLayoutParams()).f1871V)) {
                    c0278n.m1420a(next);
                }
            }
        }
    }
}
