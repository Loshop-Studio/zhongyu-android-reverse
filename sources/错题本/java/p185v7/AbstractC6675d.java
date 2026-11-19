package p185v7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.media.AbstractC0037f;
import android.util.TypedValue;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DensityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.navigation.compose.C2842d;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.AbstractC5729a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.AbstractC5794j;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.InterfaceC5822c;
import p145q5.AbstractC6439j;
import p152r6.InterfaceC6473e;
import p183v5.AbstractC6668a;
import p191w4.C6717b;
import p207y6.InterfaceC6779c;

/* renamed from: v7.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6675d {
    /* renamed from: a */
    public static final void m6339a(Composer composer, int i, InterfaceC6473e content) {
        int i8;
        AbstractC5830k.m5330g(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1608990789);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608990789, i8, -1, "com.zykj.mistake.platform.compose.AppComposeTheme (AppComposeTheme.kt:10)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f)), ComposableLambdaKt.rememberComposableLambda(2100617979, true, new C6717b(content, 1), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2842d(content, i, 5));
        }
    }

    /* renamed from: b */
    public static final String m6340b(Object[] objArr, int i, int i8, AbstractC5794j abstractC5794j) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i9];
            if (obj == abstractC5794j) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* renamed from: c */
    public static AbstractC6439j m6341c(Callable callable) {
        try {
            Object objCall = callable.call();
            AbstractC6668a.m6328a(objCall, "Scheduler Callable result can't be null");
            return (AbstractC6439j) objCall;
        } catch (Throwable th) {
            throw AbstractC5729a.m5089a(th);
        }
    }

    /* renamed from: d */
    public static void m6342d(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: e */
    public static void m6343e(Object obj) {
        m6344f(obj, "Argument must not be null");
    }

    /* renamed from: f */
    public static void m6344f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (p204y1.AbstractC6768a.m6443h(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m6345g(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, p162t.C6576f r10, coil3.size.Scale r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L21
            boolean r5 = kotlin.collections.AbstractC5806u.m5285x(r9)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L23
        L21:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L23:
            if (r4 != r5) goto L4e
            if (r12 == 0) goto L28
            goto L4d
        L28:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            t.f r5 = p162t.C6576f.f10977c
            long r4 = p204y1.AbstractC6768a.m6442g(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = p204y1.AbstractC6768a.m6443h(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4e
        L4d:
            return r0
        L4e:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = coil3.util.AbstractC3348l.m2289b(r8)
            r0 = 512(0x200, float:7.17E-43)
            if (r12 <= 0) goto L5b
            goto L5c
        L5b:
            r12 = r0
        L5c:
            int r4 = coil3.util.AbstractC3348l.m2288a(r8)
            if (r4 <= 0) goto L63
            r0 = r4
        L63:
            t.f r4 = p162t.C6576f.f10977c
            long r4 = p204y1.AbstractC6768a.m6442g(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = p204y1.AbstractC6768a.m6443h(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = p169t6.AbstractC6600a.m6240p(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = p169t6.AbstractC6600a.m6240p(r10)
            if (r9 == 0) goto L86
            boolean r11 = kotlin.collections.AbstractC5806u.m5285x(r9)
            if (r11 == 0) goto L88
        L86:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L88:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p185v7.AbstractC6675d.m6345g(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, t.f, coil3.size.Scale, boolean):android.graphics.Bitmap");
    }

    /* renamed from: h */
    public static int m6346h(Context context, float f) {
        float fApplyDimension = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        int i = (int) (fApplyDimension + 0.5d);
        if (i != 0 || fApplyDimension <= 0.0f) {
            return i;
        }
        return 1;
    }

    /* renamed from: i */
    public static ColorStateList m6347i(int i) {
        int i8 = i - (-805306368);
        return new ColorStateList(new int[][]{new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910}, new int[]{R.attr.state_checked, R.attr.state_pressed}, new int[]{-16842912, R.attr.state_pressed}, new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i - (-520093696), 268435456, i8, 536870912, i8, 536870912});
    }

    /* renamed from: j */
    public static ColorStateList m6348j(int i) {
        int i8 = i - (-1728053248);
        return new ColorStateList(new int[][]{new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910}, new int[]{R.attr.state_pressed, -16842912}, new int[]{R.attr.state_pressed, R.attr.state_checked}, new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i - (-1442840576), -4539718, i8, i8, i | ViewCompat.MEASURED_STATE_MASK, -1118482});
    }

    /* renamed from: m */
    public static final Class m6349m(InterfaceC6779c interfaceC6779c) {
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        Class clsMo5318c = ((InterfaceC5822c) interfaceC6779c).mo5318c();
        AbstractC5830k.m5328e(clsMo5318c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo5318c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: n */
    public static final Class m6350n(InterfaceC6779c interfaceC6779c) {
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        Class clsMo5318c = ((InterfaceC5822c) interfaceC6779c).mo5318c();
        if (clsMo5318c.isPrimitive()) {
            String name = clsMo5318c.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo5318c;
    }

    /* renamed from: q */
    public static void m6351q(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* renamed from: r */
    public static void m6352r(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(AbstractC0037f.m84i(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                m6355u(cls, e);
                throw null;
            } catch (InstantiationException e4) {
                m6355u(cls, e4);
                throw null;
            } catch (NoSuchMethodException e8) {
                m6355u(cls, e8);
                throw null;
            } catch (InvocationTargetException e9) {
                m6355u(cls, e9);
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    /* renamed from: s */
    public static final void m6353s(int i, int i8, Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        while (i < i8) {
            objArr[i] = null;
            i++;
        }
    }

    /* renamed from: t */
    public static Set m6354t(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC5830k.m5329f(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* renamed from: u */
    public static void m6355u(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* renamed from: k */
    public abstract Method mo5001k(Class cls, Field field);

    /* renamed from: l */
    public abstract Constructor mo5002l(Class cls);

    /* renamed from: o */
    public abstract String[] mo5003o(Class cls);

    /* renamed from: p */
    public abstract boolean mo5004p(Class cls);
}
