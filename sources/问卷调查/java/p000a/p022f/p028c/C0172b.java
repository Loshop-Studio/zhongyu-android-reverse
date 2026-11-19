package p000a.p022f.p028c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.f.c.b */
/* loaded from: classes.dex */
public class C0172b {

    /* renamed from: a */
    public String f1225a;

    /* renamed from: b */
    public a f1226b;

    /* renamed from: c */
    public int f1227c;

    /* renamed from: d */
    public float f1228d;

    /* renamed from: e */
    public String f1229e;

    /* renamed from: f */
    public boolean f1230f;

    /* renamed from: g */
    public int f1231g;

    /* renamed from: a.f.c.b$a */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0172b(C0172b c0172b, Object obj) {
        this.f1225a = c0172b.f1225a;
        this.f1226b = c0172b.f1226b;
        m660b(obj);
    }

    public C0172b(String str, a aVar, Object obj) {
        this.f1225a = str;
        this.f1226b = aVar;
        m660b(obj);
    }

    /* renamed from: a */
    public static void m659a(Context context, XmlPullParser xmlPullParser, HashMap<String, C0172b> map) {
        a aVar;
        Object string;
        int integer;
        float dimension;
        a aVar2 = a.DIMENSION_TYPE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0180j.f1379d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        a aVar3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar3 = a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    aVar = a.COLOR_TYPE;
                } else if (index == 2) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == 7) {
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == 5) {
                            aVar = a.FLOAT_TYPE;
                            string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                        } else if (index == 6) {
                            aVar = a.INT_TYPE;
                            integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                            string = Integer.valueOf(integer);
                        } else if (index == 8) {
                            aVar = a.STRING_TYPE;
                            string = typedArrayObtainStyledAttributes.getString(index);
                        }
                        Object obj = string;
                        aVar3 = aVar;
                        objValueOf = obj;
                    }
                    objValueOf = Float.valueOf(dimension);
                    aVar3 = aVar2;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2 = string;
                aVar3 = aVar;
                objValueOf = obj2;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new C0172b(string2, aVar3, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public void m660b(Object obj) {
        switch (this.f1226b.ordinal()) {
            case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                this.f1227c = ((Integer) obj).intValue();
                break;
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
            case 6:
                this.f1228d = ((Float) obj).floatValue();
                break;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
            case 3:
                this.f1231g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1229e = (String) obj;
                break;
            case 5:
                this.f1230f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
