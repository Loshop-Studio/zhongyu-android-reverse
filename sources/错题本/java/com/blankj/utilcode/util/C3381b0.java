package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Lifecycle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.blankj.utilcode.util.b0 */
/* loaded from: classes2.dex */
public final class C3381b0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public static final C3381b0 f2122g = new C3381b0();

    /* renamed from: h */
    public static final Activity f2123h = new Activity();

    /* renamed from: a */
    public final LinkedList f2124a = new LinkedList();

    /* renamed from: b */
    public final CopyOnWriteArrayList f2125b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final ConcurrentHashMap f2126c = new ConcurrentHashMap();

    /* renamed from: d */
    public int f2127d = 0;

    /* renamed from: e */
    public int f2128e = 0;

    /* renamed from: f */
    public boolean f2129f = false;

    /* renamed from: c */
    public static Object m2294c() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj;
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e.getMessage());
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
        } catch (Exception e4) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e4.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    public static void m2295e(Activity activity, boolean z8) {
        try {
            if (z8) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
                return;
            }
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                AbstractC3396p.f2173a.postDelayed(new RunnableC3379a0(0, activity, (Integer) tag), 100L);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m2296a(Activity activity, Lifecycle.Event event) {
        ConcurrentHashMap concurrentHashMap = this.f2126c;
        m2297b(activity, event, (List) concurrentHashMap.get(activity));
        m2297b(activity, event, (List) concurrentHashMap.get(f2123h));
    }

    /* renamed from: b */
    public final void m2297b(Activity activity, Lifecycle.Event event, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3405y abstractC3405y = (AbstractC3405y) it.next();
            abstractC3405y.getClass();
            if (event.equals(Lifecycle.Event.ON_CREATE)) {
                C3401u c3401u = (C3401u) abstractC3405y;
                C3402v c3402v = c3401u.f2182b;
                if (((C3401u) c3402v.f2185e) != null) {
                    c3402v.m2355e(activity, c3401u.f2181a, false);
                }
            } else if (!event.equals(Lifecycle.Event.ON_START) && !event.equals(Lifecycle.Event.ON_RESUME) && !event.equals(Lifecycle.Event.ON_PAUSE) && !event.equals(Lifecycle.Event.ON_STOP)) {
                event.equals(Lifecycle.Event.ON_DESTROY);
            }
        }
        if (event.equals(Lifecycle.Event.ON_DESTROY)) {
            this.f2126c.remove(activity);
        }
    }

    /* renamed from: d */
    public final void m2298d(boolean z8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2125b;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z8) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: f */
    public final void m2299f(Activity activity) {
        LinkedList linkedList = this.f2124a;
        if (!linkedList.contains(activity)) {
            linkedList.addFirst(activity);
        } else {
            if (((Activity) linkedList.getFirst()).equals(activity)) {
                return;
            }
            linkedList.remove(activity);
            linkedList.addFirst(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Locale locale;
        Locale locale2;
        if (this.f2124a.size() == 0) {
            m2298d(true);
        }
        String string = C3392l.m2345a("Utils").f2169a.getString("KEY_LOCALE", "");
        if (!TextUtils.isEmpty(string)) {
            if ("VALUE_FOLLOW_SYSTEM".equals(string)) {
                locale2 = Resources.getSystem().getConfiguration().getLocales().get(0);
            } else {
                char[] charArray = string.toCharArray();
                int length = charArray.length;
                int i = 0;
                int i8 = 0;
                while (true) {
                    if (i < length) {
                        if (charArray[i] == '$') {
                            if (i8 >= 1) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        i++;
                    } else if (i8 == 1) {
                        try {
                            int iIndexOf = string.indexOf("$");
                            locale = new Locale(string.substring(0, iIndexOf), string.substring(iIndexOf + 1));
                        } catch (Exception unused) {
                        }
                    }
                }
                locale = null;
                if (locale == null) {
                    Log.e("LanguageUtils", "The string of " + string + " is not in the correct format.");
                    C3392l.m2345a("Utils").f2169a.edit().remove("KEY_LOCALE").apply();
                }
                locale2 = locale;
            }
            if (locale2 != null) {
                Resources resources = activity.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.setLocale(locale2);
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                Resources resources2 = AbstractC3382c.m2303d().getResources();
                Configuration configuration2 = resources2.getConfiguration();
                configuration2.setLocale(locale2);
                resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
            }
        }
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                    Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
        }
        m2299f(activity);
        m2296a(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2124a.remove(activity);
        Window window = activity.getWindow();
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC3382c.m2303d().getSystemService("input_method");
        if (inputMethodManager != null) {
            String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
            for (int i = 0; i < 4; i++) {
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                        declaredField.set(inputMethodManager, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        m2296a(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m2296a(activity, Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m2299f(activity);
        if (this.f2129f) {
            this.f2129f = false;
            m2298d(true);
        }
        m2295e(activity, false);
        m2296a(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f2129f) {
            m2299f(activity);
        }
        int i = this.f2128e;
        if (i < 0) {
            this.f2128e = i + 1;
        } else {
            this.f2127d++;
        }
        m2296a(activity, Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f2128e--;
        } else {
            int i = this.f2127d - 1;
            this.f2127d = i;
            if (i <= 0) {
                this.f2129f = true;
                m2298d(false);
            }
        }
        m2295e(activity, true);
        m2296a(activity, Lifecycle.Event.ON_STOP);
    }
}
