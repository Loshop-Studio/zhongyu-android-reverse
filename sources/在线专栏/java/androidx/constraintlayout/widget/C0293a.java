package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0265a;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0293a {

    /* renamed from: a */
    String f1946a;

    /* renamed from: b */
    private b f1947b;

    /* renamed from: c */
    private int f1948c;

    /* renamed from: d */
    private float f1949d;

    /* renamed from: e */
    private String f1950e;

    /* renamed from: f */
    boolean f1951f;

    /* renamed from: g */
    private int f1952g;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1953a;

        static {
            int[] iArr = new int[b.values().length];
            f1953a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1953a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1953a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1953a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1953a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1953a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1953a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0293a(String str, b bVar, Object obj) {
        this.f1946a = str;
        this.f1947b = bVar;
        m1639j(obj);
    }

    /* renamed from: a */
    private static int m1630a(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    /* renamed from: b */
    public static HashMap<String, C0293a> m1631b(HashMap<String, C0293a> map, View view) {
        HashMap<String, C0293a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0293a c0293a = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new C0293a(c0293a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new C0293a(c0293a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
        return map2;
    }

    /* renamed from: g */
    public static void m1632g(Context context, XmlPullParser xmlPullParser, HashMap<String, C0293a> map) {
        b bVar;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0298f.f2339c3);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == C0298f.f2349d3) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == C0298f.f2359e3) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == C0298f.f2379g3) {
                    bVar = b.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C0298f.f2369f3) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C0298f.f2419k3) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, IGoodView.DEFAULT_TO_ALPHA), context.getResources().getDisplayMetrics()));
                } else if (index == C0298f.f2389h3) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, IGoodView.DEFAULT_TO_ALPHA));
                } else if (index == C0298f.f2399i3) {
                    bVar = b.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0298f.f2409j3) {
                    bVar = b.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0298f.f2429l3) {
                    bVar = b.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                bVar2 = bVar;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new C0293a(string2, bVar2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public static void m1633h(View view, HashMap<String, C0293a> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0293a c0293a = map.get(str);
            String str2 = "set" + str;
            try {
                switch (a.f1953a[c0293a.f1947b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0293a.f1952g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0293a.f1952g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0293a.f1948c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0293a.f1949d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0293a.f1950e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0293a.f1951f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0293a.f1949d));
                        break;
                }
            } catch (IllegalAccessException e4) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                Log.e("TransitionLayout", e5.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e6) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e6.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public b m1634c() {
        return this.f1947b;
    }

    /* renamed from: d */
    public float m1635d() {
        switch (a.f1953a[this.f1947b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f1948c;
            case 4:
                return this.f1949d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                if (this.f1951f) {
                    return IGoodView.DEFAULT_TO_ALPHA;
                }
                return 1.0f;
            case 7:
                return this.f1949d;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: e */
    public void m1636e(float[] fArr) {
        switch (a.f1953a[this.f1947b.ordinal()]) {
            case 1:
            case 2:
                int i4 = (this.f1952g >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i4 / 255.0f;
                return;
            case 3:
                fArr[0] = this.f1948c;
                return;
            case 4:
                fArr[0] = this.f1949d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f1951f ? IGoodView.DEFAULT_TO_ALPHA : 1.0f;
                return;
            case 7:
                fArr[0] = this.f1949d;
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    public int m1637f() {
        int i4 = a.f1953a[this.f1947b.ordinal()];
        return (i4 == 1 || i4 == 2) ? 4 : 1;
    }

    /* renamed from: i */
    public void m1638i(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f1946a;
        try {
            boolean z3 = true;
            switch (a.f1953a[this.f1947b.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m1630a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m1630a((int) (fArr[3] * 255.0f)) << 24) | (m1630a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m1630a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM1630a = (m1630a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m1630a((int) (fArr[3] * 255.0f)) << 24) | (m1630a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m1630a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM1630a);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f1946a);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z3 = false;
                    }
                    objArr[0] = Boolean.valueOf(z3);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e4) {
            Log.e("TransitionLayout", "cannot access method " + str + "on View \"" + C0265a.m1257c(view) + "\"");
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            Log.e("TransitionLayout", "no method " + str + "on View \"" + C0265a.m1257c(view) + "\"");
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m1639j(Object obj) {
        switch (a.f1953a[this.f1947b.ordinal()]) {
            case 1:
            case 2:
                this.f1952g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f1948c = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1949d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f1950e = (String) obj;
                break;
            case 6:
                this.f1951f = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f1949d = ((Float) obj).floatValue();
                break;
        }
    }

    public C0293a(C0293a c0293a, Object obj) {
        this.f1946a = c0293a.f1946a;
        this.f1947b = c0293a.f1947b;
        m1639j(obj);
    }
}
