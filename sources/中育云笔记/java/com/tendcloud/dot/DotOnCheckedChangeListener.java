package com.tendcloud.dot;

import android.widget.CompoundButton;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotOnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    private static CheckChangedCallback f14168b;

    /* renamed from: a */
    private CompoundButton.OnCheckedChangeListener f14169a;

    public interface CheckChangedCallback {
        void onCheckedChanged(CompoundButton compoundButton, boolean z10);
    }

    private DotOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14169a = onCheckedChangeListener;
    }

    /* renamed from: a */
    private CompoundButton.OnCheckedChangeListener m11021a() {
        return this.f14169a;
    }

    public static CompoundButton.OnCheckedChangeListener getOnCheckChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        try {
            return onCheckedChangeListener instanceof DotOnCheckedChangeListener ? new DotOnCheckedChangeListener(((DotOnCheckedChangeListener) onCheckedChangeListener).m11021a()) : new DotOnCheckedChangeListener(onCheckedChangeListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onCheckedChangeListener;
        }
    }

    public static void setCallback(CheckChangedCallback checkChangedCallback) {
        f14168b = checkChangedCallback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        try {
            CheckChangedCallback checkChangedCallback = f14168b;
            if (checkChangedCallback != null) {
                checkChangedCallback.onCheckedChanged(compoundButton, z10);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f14169a;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }
}
