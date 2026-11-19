package p000a.p052k.p053b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p000a.p021e.C0136h;
import p000a.p052k.C0293a;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.a0 */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0295a0 implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final AbstractC0301c0 f1765b;

    /* renamed from: a.k.b.a0$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C0315j0 f1766b;

        public a(C0315j0 c0315j0) {
            this.f1766b = c0315j0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C0315j0 c0315j0 = this.f1766b;
            ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
            c0315j0.m1094k();
            AbstractC0347z0.m1249f((ViewGroup) componentCallbacksC0320m.f1963G.getParent(), LayoutInflaterFactory2C0295a0.this.f1765b).m1254e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0295a0(AbstractC0301c0 abstractC0301c0) {
        this.f1765b = abstractC0301c0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0315j0 c0315j0M1045h;
        StringBuilder sb;
        String str2;
        if (C0340w.class.getName().equals(str)) {
            return new C0340w(context, attributeSet, this.f1765b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0293a.f1760a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            C0136h<ClassLoader, C0136h<String, Class<?>>> c0136h = C0344y.f2118a;
            try {
                zIsAssignableFrom = ComponentCallbacksC0320m.class.isAssignableFrom(C0344y.m1246b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                ComponentCallbacksC0320m componentCallbacksC0320mM1013H = resourceId != -1 ? this.f1765b.m1013H(resourceId) : null;
                if (componentCallbacksC0320mM1013H == null && string != null) {
                    componentCallbacksC0320mM1013H = this.f1765b.m1014I(string);
                }
                if (componentCallbacksC0320mM1013H == null && id != -1) {
                    componentCallbacksC0320mM1013H = this.f1765b.m1013H(id);
                }
                if (componentCallbacksC0320mM1013H == null) {
                    componentCallbacksC0320mM1013H = this.f1765b.m1016K().mo1069a(context.getClassLoader(), attributeValue);
                    componentCallbacksC0320mM1013H.f1990o = true;
                    componentCallbacksC0320mM1013H.f1999x = resourceId != 0 ? resourceId : id;
                    componentCallbacksC0320mM1013H.f2000y = id;
                    componentCallbacksC0320mM1013H.f2001z = string;
                    componentCallbacksC0320mM1013H.f1991p = true;
                    AbstractC0301c0 abstractC0301c0 = this.f1765b;
                    componentCallbacksC0320mM1013H.f1995t = abstractC0301c0;
                    AbstractC0346z<?> abstractC0346z = abstractC0301c0.f1822q;
                    componentCallbacksC0320mM1013H.f1996u = abstractC0346z;
                    Context context2 = abstractC0346z.f2122c;
                    componentCallbacksC0320mM1013H.m1147W(attributeSet, componentCallbacksC0320mM1013H.f1978c);
                    c0315j0M1045h = this.f1765b.m1031a(componentCallbacksC0320mM1013H);
                    if (AbstractC0301c0.m1005N(2)) {
                        sb = new StringBuilder();
                        sb.append("Fragment ");
                        sb.append(componentCallbacksC0320mM1013H);
                        str2 = " has been inflated via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                } else {
                    if (componentCallbacksC0320mM1013H.f1991p) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    componentCallbacksC0320mM1013H.f1991p = true;
                    AbstractC0301c0 abstractC0301c02 = this.f1765b;
                    componentCallbacksC0320mM1013H.f1995t = abstractC0301c02;
                    AbstractC0346z<?> abstractC0346z2 = abstractC0301c02.f1822q;
                    componentCallbacksC0320mM1013H.f1996u = abstractC0346z2;
                    Context context3 = abstractC0346z2.f2122c;
                    componentCallbacksC0320mM1013H.m1147W(attributeSet, componentCallbacksC0320mM1013H.f1978c);
                    c0315j0M1045h = this.f1765b.m1045h(componentCallbacksC0320mM1013H);
                    if (AbstractC0301c0.m1005N(2)) {
                        sb = new StringBuilder();
                        sb.append("Retained Fragment ");
                        sb.append(componentCallbacksC0320mM1013H);
                        str2 = " has been re-attached via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                componentCallbacksC0320mM1013H.f1962F = (ViewGroup) view;
                c0315j0M1045h.m1094k();
                c0315j0M1045h.m1093j();
                View view2 = componentCallbacksC0320mM1013H.f1963G;
                if (view2 == null) {
                    throw new IllegalStateException(C0561a.m2077e("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (componentCallbacksC0320mM1013H.f1963G.getTag() == null) {
                    componentCallbacksC0320mM1013H.f1963G.setTag(string);
                }
                componentCallbacksC0320mM1013H.f1963G.addOnAttachStateChangeListener(new a(c0315j0M1045h));
                return componentCallbacksC0320mM1013H.f1963G;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
