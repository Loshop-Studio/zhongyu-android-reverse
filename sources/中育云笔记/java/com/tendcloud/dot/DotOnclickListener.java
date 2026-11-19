package com.tendcloud.dot;

import android.view.View;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotOnclickListener implements View.OnClickListener {

    /* renamed from: b */
    private static DotClickCallBack f14179b;

    /* renamed from: a */
    private View.OnClickListener f14180a;

    public interface DotClickCallBack {
        void onClick(View view);
    }

    private DotOnclickListener(View.OnClickListener onClickListener) {
        this.f14180a = onClickListener;
    }

    /* renamed from: a */
    private View.OnClickListener m11024a() {
        return this.f14180a;
    }

    public static View.OnClickListener getDotOnclickListener(View.OnClickListener onClickListener) {
        try {
            return onClickListener instanceof DotOnclickListener ? new DotOnclickListener(((DotOnclickListener) onClickListener).m11024a()) : new DotOnclickListener(onClickListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onClickListener;
        }
    }

    public static void setCallBack(DotClickCallBack dotClickCallBack) {
        f14179b = dotClickCallBack;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            DotClickCallBack dotClickCallBack = f14179b;
            if (dotClickCallBack != null) {
                dotClickCallBack.onClick(view);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
        View.OnClickListener onClickListener = this.f14180a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
