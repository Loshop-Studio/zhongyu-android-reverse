package com.tendcloud.dot;

import android.widget.RadioGroup;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotGroupRadioOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: b */
    private static OnGroupRadioCheckChangedCallback f14166b;

    /* renamed from: a */
    private RadioGroup.OnCheckedChangeListener f14167a;

    public interface OnGroupRadioCheckChangedCallback {
        void onCheckedChanged(RadioGroup radioGroup, int i10);
    }

    private DotGroupRadioOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14167a = onCheckedChangeListener;
    }

    /* renamed from: a */
    private RadioGroup.OnCheckedChangeListener m11020a() {
        return this.f14167a;
    }

    public static RadioGroup.OnCheckedChangeListener getOnCheckChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        try {
            return onCheckedChangeListener instanceof DotGroupRadioOnCheckedChangeListener ? new DotGroupRadioOnCheckedChangeListener(((DotGroupRadioOnCheckedChangeListener) onCheckedChangeListener).m11020a()) : new DotGroupRadioOnCheckedChangeListener(onCheckedChangeListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onCheckedChangeListener;
        }
    }

    public static void setCallback(OnGroupRadioCheckChangedCallback onGroupRadioCheckChangedCallback) {
        f14166b = onGroupRadioCheckChangedCallback;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i10) {
        try {
            OnGroupRadioCheckChangedCallback onGroupRadioCheckChangedCallback = f14166b;
            if (onGroupRadioCheckChangedCallback != null) {
                onGroupRadioCheckChangedCallback.onCheckedChanged(radioGroup, i10);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f14167a;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(radioGroup, i10);
        }
    }
}
