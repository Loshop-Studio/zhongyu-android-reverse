package p000a.p005b;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Field;
import p000a.p005b.p014h.InterfaceC0072b1;
import p000a.p005b.p014h.ViewOnLongClickListenerC0116x0;

/* renamed from: a.b.a */
/* loaded from: classes.dex */
public final class C0013a {

    /* renamed from: a */
    public static Field f18a;

    /* renamed from: b */
    public static boolean f19b;

    /* renamed from: c */
    public static Class<?> f20c;

    /* renamed from: d */
    public static boolean f21d;

    /* renamed from: e */
    public static Field f22e;

    /* renamed from: f */
    public static boolean f23f;

    /* renamed from: g */
    public static Field f24g;

    /* renamed from: h */
    public static boolean f25h;

    /* JADX WARN: Removed duplicated region for block: B:175:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0753 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0770 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10a(p000a.p022f.p025b.p026i.C0151e r37, p000a.p022f.p025b.C0142d r38, int r39) {
        /*
            Method dump skipped, instructions count: 1919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.C0013a.m10a(a.f.b.i.e, a.f.b.d, int):void");
    }

    /* renamed from: b */
    public static void m11b(Object obj) {
        if (!f21d) {
            try {
                f20c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f21d = true;
        }
        Class<?> cls = f20c;
        if (cls == null) {
            return;
        }
        if (!f23f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f22e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f23f = true;
        }
        Field field = f22e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: c */
    public static InputConnection m12c(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC0072b1) {
                    editorInfo.hintText = ((InterfaceC0072b1) parent).m284a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }

    /* renamed from: d */
    public static void m13d(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        ViewOnLongClickListenerC0116x0 viewOnLongClickListenerC0116x0 = ViewOnLongClickListenerC0116x0.f855k;
        if (viewOnLongClickListenerC0116x0 != null && viewOnLongClickListenerC0116x0.f857b == view) {
            ViewOnLongClickListenerC0116x0.m446c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0116x0(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0116x0 viewOnLongClickListenerC0116x02 = ViewOnLongClickListenerC0116x0.f856l;
        if (viewOnLongClickListenerC0116x02 != null && viewOnLongClickListenerC0116x02.f857b == view) {
            viewOnLongClickListenerC0116x02.m448b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
