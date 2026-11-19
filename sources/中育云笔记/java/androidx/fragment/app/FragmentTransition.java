package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

/* loaded from: classes2.dex */
public final class FragmentTransition {
    public static final FragmentTransition INSTANCE;
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    public static final void callSharedElementStartEnd(Fragment inFragment, Fragment outFragment, boolean z10, ArrayMap<String, View> sharedElements, boolean z11) {
        AbstractC9979u.m20294g(inFragment, "inFragment");
        AbstractC9979u.m20294g(outFragment, "outFragment");
        AbstractC9979u.m20294g(sharedElements, "sharedElements");
        SharedElementCallback enterTransitionCallback = z10 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z11) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static final String findKeyForValue(ArrayMap<String, String> arrayMap, String value) {
        AbstractC9979u.m20294g(arrayMap, "<this>");
        AbstractC9979u.m20294g(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
            if (AbstractC9979u.m20289b(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) AbstractC10947g0.m23946o0(arrayList);
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            AbstractC9979u.m20292e(FragmentTransitionSupport.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void retainValues(ArrayMap<String, String> arrayMap, ArrayMap<String, View> namedViews) {
        AbstractC9979u.m20294g(arrayMap, "<this>");
        AbstractC9979u.m20294g(namedViews, "namedViews");
        int size = arrayMap.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    public static final void setViewVisibility(List<? extends View> views, int i10) {
        AbstractC9979u.m20294g(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }

    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
