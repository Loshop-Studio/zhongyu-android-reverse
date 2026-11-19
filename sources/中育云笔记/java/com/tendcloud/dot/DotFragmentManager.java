package com.tendcloud.dot;

import android.os.Bundle;
import android.view.View;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotFragmentManager {

    /* renamed from: a */
    private static DotFragmentMangerCallback f14165a;

    public interface DotFragmentMangerCallback {
        void onFragmentVisibilityChanged(Object obj, boolean z10, boolean z11);

        void onViewCreated(Object obj, View view, Bundle bundle);
    }

    public static void onViewCreated(Object obj, View view, Bundle bundle) {
        try {
            DotFragmentMangerCallback dotFragmentMangerCallback = f14165a;
            if (dotFragmentMangerCallback != null) {
                dotFragmentMangerCallback.onViewCreated(obj, view, bundle);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public static void onVisibilityChangedToUser(Object obj, boolean z10, boolean z11) {
        try {
            DotFragmentMangerCallback dotFragmentMangerCallback = f14165a;
            if (dotFragmentMangerCallback != null) {
                dotFragmentMangerCallback.onFragmentVisibilityChanged(obj, z10, z11);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    public static void setCallback(DotFragmentMangerCallback dotFragmentMangerCallback) {
        f14165a = dotFragmentMangerCallback;
    }
}
