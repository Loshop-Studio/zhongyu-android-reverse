package com.tendcloud.dot;

import android.app.Activity;
import android.os.Bundle;
import com.tendcloud.tenddata.C7896ca;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class DotActivityLifeCycleManager {

    /* renamed from: a */
    private static DotActivityLifeCycleManager f14163a;

    /* renamed from: b */
    private ArrayList<DotActivityLifecycleCallbacks> f14164b = new ArrayList<>();

    public interface DotActivityLifecycleCallbacks {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    /* renamed from: a */
    private Object[] m11019a() {
        try {
            synchronized (this.f14164b) {
                try {
                    array = this.f14164b.size() > 0 ? this.f14164b.toArray() : null;
                } finally {
                }
            }
            return array;
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return array;
        }
    }

    public static synchronized DotActivityLifeCycleManager getInstance() {
        try {
            if (f14163a == null) {
                f14163a = new DotActivityLifeCycleManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14163a;
    }

    public void dispatchActivityCreated(Activity activity, Bundle bundle) {
        try {
            Object[] objArrM11019a = m11019a();
            if (objArrM11019a != null) {
                for (Object obj : objArrM11019a) {
                    ((DotActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
                }
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public void dispatchActivityDestroyed(Activity activity) {
        try {
            Object[] objArrM11019a = m11019a();
            if (objArrM11019a != null) {
                for (Object obj : objArrM11019a) {
                    ((DotActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
                }
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public void dispatchActivityPaused(Activity activity) {
        try {
            Object[] objArrM11019a = m11019a();
            if (objArrM11019a != null) {
                for (Object obj : objArrM11019a) {
                    ((DotActivityLifecycleCallbacks) obj).onActivityPaused(activity);
                }
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public void dispatchActivityResumed(Activity activity) {
        try {
            Object[] objArrM11019a = m11019a();
            if (objArrM11019a != null) {
                for (Object obj : objArrM11019a) {
                    ((DotActivityLifecycleCallbacks) obj).onActivityResumed(activity);
                }
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public void dispatchActivityStarted(Activity activity) {
        try {
            Object[] objArrM11019a = m11019a();
            if (objArrM11019a != null) {
                for (Object obj : objArrM11019a) {
                    ((DotActivityLifecycleCallbacks) obj).onActivityStarted(activity);
                }
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public void dispatchActivityStopped(Activity activity) {
        try {
            Object[] objArrM11019a = m11019a();
            if (objArrM11019a != null) {
                for (Object obj : objArrM11019a) {
                    ((DotActivityLifecycleCallbacks) obj).onActivityStopped(activity);
                }
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public void registerDotActivityLifecycleCallbacks(DotActivityLifecycleCallbacks dotActivityLifecycleCallbacks) {
        synchronized (this.f14164b) {
            this.f14164b.add(dotActivityLifecycleCallbacks);
        }
    }

    public void unregisterDotActivityLifecycleCallbacks(DotActivityLifecycleCallbacks dotActivityLifecycleCallbacks) {
        synchronized (this.f14164b) {
            this.f14164b.remove(dotActivityLifecycleCallbacks);
        }
    }
}
