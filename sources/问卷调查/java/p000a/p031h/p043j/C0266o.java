package p000a.p031h.p043j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p031h.p043j.p044a0.InterfaceC0247d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: a.h.j.o */
/* loaded from: classes.dex */
public class C0266o {

    /* renamed from: a */
    public static WeakHashMap<View, C0273v> f1616a;

    /* renamed from: b */
    public static Field f1617b;

    /* renamed from: c */
    public static boolean f1618c;

    /* renamed from: d */
    public static final InterfaceC0264m f1619d;

    /* renamed from: a.h.j.o$a */
    public class a implements InterfaceC0264m {
        @Override // p000a.p031h.p043j.InterfaceC0264m
        public C0254c onReceiveContent(C0254c c0254c) {
            return c0254c;
        }
    }

    /* renamed from: a.h.j.o$b */
    public static abstract class b<T> {

        /* renamed from: a */
        public final int f1620a;

        /* renamed from: b */
        public final Class<T> f1621b;

        /* renamed from: c */
        public final int f1622c;

        /* renamed from: d */
        public final int f1623d;

        public b(int i, Class<T> cls, int i2) {
            this.f1620a = i;
            this.f1621b = cls;
            this.f1623d = 0;
            this.f1622c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f1620a = i;
            this.f1621b = cls;
            this.f1623d = i2;
            this.f1622c = i3;
        }

        /* renamed from: a */
        public boolean m877a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: b */
        public abstract T mo878b(View view);

        /* renamed from: c */
        public T m879c(View view) {
            if (Build.VERSION.SDK_INT >= this.f1622c) {
                return mo878b(view);
            }
            T t = (T) view.getTag(this.f1620a);
            if (this.f1621b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    /* renamed from: a.h.j.o$c */
    public interface c {
        /* renamed from: a */
        boolean m880a(View view, KeyEvent keyEvent);
    }

    /* renamed from: a.h.j.o$d */
    public static class d {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f1624d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f1625a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f1626b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f1627c = null;

        /* renamed from: a */
        public final View m881a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1625a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM881a = m881a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM881a != null) {
                            return viewM881a;
                        }
                    }
                }
                if (m882b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m882b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C1088R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).m880a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f1616a = null;
        f1618c = false;
        f1619d = new a();
        new WeakHashMap();
    }

    /* renamed from: a */
    public static C0273v m862a(View view) {
        if (f1616a == null) {
            f1616a = new WeakHashMap<>();
        }
        C0273v c0273v = f1616a.get(view);
        if (c0273v != null) {
            return c0273v;
        }
        C0273v c0273v2 = new C0273v(view);
        f1616a.put(view, c0273v2);
        return c0273v2;
    }

    /* renamed from: b */
    public static C0277z m863b(View view, C0277z c0277z) {
        WindowInsets windowInsetsM902h = c0277z.m902h();
        if (windowInsetsM902h != null) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsM902h);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsetsM902h)) {
                return C0277z.m895j(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return c0277z;
    }

    /* renamed from: c */
    public static boolean m864c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = d.f1624d;
        d dVar = (d) view.getTag(C1088R.id.tag_unhandled_key_event_manager);
        if (dVar == null) {
            dVar = new d();
            view.setTag(C1088R.id.tag_unhandled_key_event_manager, dVar);
        }
        if (keyEvent.getAction() == 0) {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = dVar.f1625a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = d.f1624d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (dVar.f1625a == null) {
                        dVar.f1625a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = d.f1624d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            dVar.f1625a.put(view2, bool);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dVar.f1625a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }
        View viewM881a = dVar.m881a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM881a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dVar.f1626b == null) {
                    dVar.f1626b = new SparseArray<>();
                }
                dVar.f1626b.put(keyCode, new WeakReference<>(viewM881a));
            }
        }
        return viewM881a != null;
    }

    /* renamed from: d */
    public static C0243a m865d(View view) {
        View.AccessibilityDelegate accessibilityDelegateM866e = m866e(view);
        if (accessibilityDelegateM866e == null) {
            return null;
        }
        return accessibilityDelegateM866e instanceof C0243a.a ? ((C0243a.a) accessibilityDelegateM866e).f1558a : new C0243a(accessibilityDelegateM866e);
    }

    /* renamed from: e */
    public static View.AccessibilityDelegate m866e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f1618c) {
            return null;
        }
        if (f1617b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1617b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1618c = true;
                return null;
            }
        }
        Object obj = f1617b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    /* renamed from: f */
    public static CharSequence m867f(View view) {
        return new C0268q(C1088R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m879c(view);
    }

    /* renamed from: g */
    public static C0277z m868g(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0277z c0277zM894i = C0277z.m894i(rootWindowInsets);
        c0277zM894i.f1639a.mo911m(c0277zM894i);
        c0277zM894i.f1639a.mo906d(view.getRootView());
        return c0277zM894i;
    }

    /* renamed from: h */
    public static void m869h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m867f(view) != null && view.getVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m867f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (((View) parent).getImportantForAccessibility() == 4) {
                            view.setImportantForAccessibility(2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m867f(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    /* renamed from: i */
    public static C0277z m870i(View view, C0277z c0277z) {
        WindowInsets windowInsetsM902h = c0277z.m902h();
        if (windowInsetsM902h != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM902h);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM902h)) {
                return C0277z.m895j(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return c0277z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static C0254c m871j(View view, C0254c c0254c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0254c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        InterfaceC0263l interfaceC0263l = (InterfaceC0263l) view.getTag(C1088R.id.tag_on_receive_content_listener);
        if (interfaceC0263l == null) {
            return (view instanceof InterfaceC0264m ? (InterfaceC0264m) view : f1619d).onReceiveContent(c0254c);
        }
        C0254c c0254cMo859a = interfaceC0263l.mo859a(view, c0254c);
        if (c0254cMo859a == null) {
            return null;
        }
        return (view instanceof InterfaceC0264m ? (InterfaceC0264m) view : f1619d).onReceiveContent(c0254cMo859a);
    }

    /* renamed from: k */
    public static void m872k(int i, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C1088R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C1088R.id.tag_accessibility_actions, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((C0245b.a) arrayList.get(i2)).m827a() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    /* renamed from: l */
    public static void m873l(View view, C0245b.a aVar, CharSequence charSequence, InterfaceC0247d interfaceC0247d) {
        C0245b.a aVar2 = new C0245b.a(null, aVar.f1575b, null, interfaceC0247d, aVar.f1576c);
        C0243a c0243aM865d = m865d(view);
        if (c0243aM865d == null) {
            c0243aM865d = new C0243a();
        }
        m875n(view, c0243aM865d);
        m872k(aVar2.m827a(), view);
        ArrayList arrayList = (ArrayList) view.getTag(C1088R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C1088R.id.tag_accessibility_actions, arrayList);
        }
        arrayList.add(aVar2);
        m869h(view, 0);
    }

    /* renamed from: m */
    public static void m874m(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: n */
    public static void m875n(View view, C0243a c0243a) {
        if (c0243a == null && (m866e(view) instanceof C0243a.a)) {
            c0243a = new C0243a();
        }
        view.setAccessibilityDelegate(c0243a == null ? null : c0243a.f1557b);
    }

    /* renamed from: o */
    public static void m876o(View view, InterfaceC0262k interfaceC0262k) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(C1088R.id.tag_on_apply_window_listener, interfaceC0262k);
        }
        if (interfaceC0262k == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C1088R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0271t(view, interfaceC0262k));
        }
    }
}
