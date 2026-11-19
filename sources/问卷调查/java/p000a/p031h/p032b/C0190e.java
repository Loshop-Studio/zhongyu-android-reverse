package p000a.p031h.p032b;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.github.inflationx.calligraphy3.C1088R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p031h.C0185a;
import p000a.p031h.p033c.p034b.C0194b;
import p000a.p031h.p033c.p034b.C0196d;
import p000a.p031h.p033c.p034b.C0197e;
import p000a.p031h.p033c.p034b.C0198f;
import p000a.p031h.p033c.p034b.InterfaceC0195c;
import p000a.p031h.p035d.C0204c;
import p000a.p031h.p040g.C0223e;
import p000a.p031h.p046k.ActionModeCallbackC0281d;
import p000a.p052k.p053b.C0334t;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p000a.p060o.p061b.AbstractC0397t;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.b.e */
/* loaded from: classes.dex */
public final class C0190e {

    /* renamed from: a */
    public static long f1422a;

    /* renamed from: b */
    public static Method f1423b;

    @SuppressLint({"NewApi"})
    /* renamed from: A */
    public static boolean m688A() {
        try {
            if (f1423b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1423b == null) {
                f1422a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1423b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1423b.invoke(null, Long.valueOf(f1422a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: B */
    public static C0334t m689B(Context context, ComponentCallbacksC0320m componentCallbacksC0320m, boolean z, boolean z2) throws Resources.NotFoundException {
        ComponentCallbacksC0320m.b bVar = componentCallbacksC0320m.f1966J;
        boolean z3 = false;
        int i = bVar == null ? 0 : bVar.f2010h;
        int iM1186v = z2 ? z ? componentCallbacksC0320m.m1186v() : componentCallbacksC0320m.m1188w() : z ? componentCallbacksC0320m.m1166l() : componentCallbacksC0320m.m1172o();
        componentCallbacksC0320m.m1171n0(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC0320m.f1962F;
        if (viewGroup != null && viewGroup.getTag(C1088R.id.visible_removing_fragment_view_tag) != null) {
            componentCallbacksC0320m.f1962F.setTag(C1088R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC0320m.f1962F;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationM1141N = componentCallbacksC0320m.m1141N();
        if (animationM1141N != null) {
            return new C0334t(animationM1141N);
        }
        Animator animatorM1142O = componentCallbacksC0320m.m1142O();
        if (animatorM1142O != null) {
            return new C0334t(animatorM1142O);
        }
        if (iM1186v == 0 && i != 0) {
            iM1186v = i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? C1088R.animator.fragment_close_enter : C1088R.animator.fragment_close_exit : z ? C1088R.animator.fragment_fade_enter : C1088R.animator.fragment_fade_exit : z ? C1088R.animator.fragment_open_enter : C1088R.animator.fragment_open_exit;
        }
        if (iM1186v != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM1186v));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM1186v);
                    if (animationLoadAnimation != null) {
                        return new C0334t(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM1186v);
                    if (animatorLoadAnimator != null) {
                        return new C0334t(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM1186v);
                    if (animationLoadAnimation2 != null) {
                        return new C0334t(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static int m690C(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: D */
    public static int m691D(int i, Rect rect, Rect rect2) {
        int iHeight;
        int i2;
        int iHeight2;
        if (i == 17) {
            iHeight = (rect.height() / 2) + rect.top;
            i2 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = (rect.height() / 2) + rect.top;
                i2 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - ((iHeight2 / 2) + i2));
    }

    /* renamed from: E */
    public static ByteBuffer m692E(Context context, CancellationSignal cancellationSignal, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: F */
    public static TypedArray m693F(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: G */
    public static <T> ObjectAnimator m694G(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }

    /* renamed from: H */
    public static InterfaceC0195c m695H(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0185a.f1397b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlPullParser.next() != 3) {
                    m703P(xmlPullParser);
                }
                return new C0198f(new C0223e(string, string2, string3, m696I(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0185a.f1398c);
                        int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                        int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i4);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            m703P(xmlPullParser);
                        }
                        arrayList.add(new C0197e(string6, i, z, string5, i3, resourceId2));
                    } else {
                        m703P(xmlPullParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0196d((C0197e[]) arrayList.toArray(new C0197e[arrayList.size()]));
            }
        } else {
            m703P(xmlPullParser);
        }
        return null;
    }

    /* renamed from: I */
    public static List<List<byte[]>> m696I(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m704Q(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m704Q(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* renamed from: J */
    public static void m697J(TextView textView, int i) {
        m710e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: K */
    public static void m698K(TextView textView, int i) {
        m710e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: L */
    public static void m699L(TextView textView, int i) {
        m710e(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: M */
    public static void m700M(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: N */
    public static void m701N(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: O */
    public static void m702O(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: P */
    public static void m703P(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: Q */
    public static List<byte[]> m704Q(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: R */
    public static ActionMode.Callback m705R(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC0281d) || callback == null) ? callback : new ActionModeCallbackC0281d(callback, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m706a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m707b(r9, r10, r11)
            boolean r1 = m707b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = r6
            goto L46
        L45:
            r7 = r2
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = m690C(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = r6
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p032b.C0190e.m706a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m707b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static void m708c(Object obj, StringBuilder sb) {
        String hexString;
        int iLastIndexOf;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    /* renamed from: d */
    public static boolean m709d(C0204c[] c0204cArr, C0204c[] c0204cArr2) {
        if (c0204cArr == null || c0204cArr2 == null || c0204cArr.length != c0204cArr2.length) {
            return false;
        }
        for (int i = 0; i < c0204cArr.length; i++) {
            if (c0204cArr[i].f1458a != c0204cArr2[i].f1458a || c0204cArr[i].f1459b.length != c0204cArr2[i].f1459b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static int m710e(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static <T> T m711f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static int m712g(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static int m713h(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: i */
    public static int m714i(RecyclerView.C0549w c0549w, AbstractC0397t abstractC0397t, View view, View view2, RecyclerView.AbstractC0538l abstractC0538l, boolean z) {
        if (abstractC0538l.m1967y() == 0 || c0549w.m1995b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0538l.m1938R(view) - abstractC0538l.m1938R(view2)) + 1;
        }
        return Math.min(abstractC0397t.mo1401l(), abstractC0397t.mo1391b(view2) - abstractC0397t.mo1394e(view));
    }

    /* renamed from: j */
    public static int m715j(RecyclerView.C0549w c0549w, AbstractC0397t abstractC0397t, View view, View view2, RecyclerView.AbstractC0538l abstractC0538l, boolean z, boolean z2) {
        if (abstractC0538l.m1967y() == 0 || c0549w.m1995b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0549w.m1995b() - Math.max(abstractC0538l.m1938R(view), abstractC0538l.m1938R(view2))) - 1) : Math.max(0, Math.min(abstractC0538l.m1938R(view), abstractC0538l.m1938R(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0397t.mo1391b(view2) - abstractC0397t.mo1394e(view)) / (Math.abs(abstractC0538l.m1938R(view) - abstractC0538l.m1938R(view2)) + 1))) + (abstractC0397t.mo1400k() - abstractC0397t.mo1394e(view)));
        }
        return iMax;
    }

    /* renamed from: k */
    public static int m716k(RecyclerView.C0549w c0549w, AbstractC0397t abstractC0397t, View view, View view2, RecyclerView.AbstractC0538l abstractC0538l, boolean z) {
        if (abstractC0538l.m1967y() == 0 || c0549w.m1995b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0549w.m1995b();
        }
        return (int) (((abstractC0397t.mo1391b(view2) - abstractC0397t.mo1394e(view)) / (Math.abs(abstractC0538l.m1938R(view) - abstractC0538l.m1938R(view2)) + 1)) * c0549w.m1995b());
    }

    /* renamed from: l */
    public static float[] m717l(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: m */
    public static boolean m718m(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zM719n = m719n(file, inputStreamOpenRawResource);
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused) {
                }
            }
            return zM719n;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: n */
    public static boolean m719n(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r13 == 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:49:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0096 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p031h.p035d.C0204c[] m720o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p032b.C0190e.m720o(java.lang.String):a.h.d.c[]");
    }

    /* renamed from: p */
    public static Path m721p(String str) {
        Path path = new Path();
        C0204c[] c0204cArrM720o = m720o(str);
        if (c0204cArrM720o == null) {
            return null;
        }
        try {
            C0204c.m762b(c0204cArrM720o, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException(C0561a.m2076d("Error in parsing ", str), e2);
        }
    }

    /* renamed from: q */
    public static C0204c[] m722q(C0204c[] c0204cArr) {
        if (c0204cArr == null) {
            return null;
        }
        C0204c[] c0204cArr2 = new C0204c[c0204cArr.length];
        for (int i = 0; i < c0204cArr.length; i++) {
            c0204cArr2[i] = new C0204c(c0204cArr[i]);
        }
        return c0204cArr2;
    }

    /* renamed from: r */
    public static C0194b m723r(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C0194b c0194bM747a;
        if (m730y(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C0194b(null, null, typedValue.data);
            }
            try {
                c0194bM747a = C0194b.m747a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                c0194bM747a = null;
            }
            if (c0194bM747a != null) {
                return c0194bM747a;
            }
        }
        return new C0194b(null, null, i2);
    }

    /* renamed from: s */
    public static String m724s(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m730y(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: t */
    public static Intent m725t(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM727v = m727v(activity, activity.getComponentName());
            if (strM727v == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strM727v);
            try {
                return m727v(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM727v + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: u */
    public static Intent m726u(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM727v = m727v(context, componentName);
        if (strM727v == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM727v);
        return m727v(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: v */
    public static String m727v(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: w */
    public static File m728w(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder sbM2079g = C0561a.m2079g(".font");
        sbM2079g.append(Process.myPid());
        sbM2079g.append("-");
        sbM2079g.append(Process.myTid());
        sbM2079g.append("-");
        String string = sbM2079g.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, string + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p031h.p041h.C0235b.a m729x(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            a.h.h.b$a r0 = new a.h.h.b$a
            android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
            r0.<init>(r7)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = r7.getBreakStrategy()
            int r4 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L75
        L2e:
            r5 = 0
            r6 = 1
            if (r0 < r1) goto L57
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L57
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
            java.lang.String[] r7 = r7.getDigitStrings()
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L6d
            r0 = 2
            if (r7 != r0) goto L2b
            goto L6d
        L57:
            int r0 = r7.getLayoutDirection()
            if (r0 != r6) goto L5e
            r5 = r6
        L5e:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L70;
                case 3: goto L2b;
                case 4: goto L6d;
                case 5: goto L6a;
                case 6: goto L73;
                case 7: goto L67;
                default: goto L65;
            }
        L65:
            if (r5 == 0) goto L73
        L67:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L75
        L6a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L75
        L6d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L75
        L70:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L75
        L73:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L75:
            a.h.h.b$a r0 = new a.h.h.b$a
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p032b.C0190e.m729x(android.widget.TextView):a.h.h.b$a");
    }

    /* renamed from: y */
    public static boolean m730y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: z */
    public static boolean m731z(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }
}
