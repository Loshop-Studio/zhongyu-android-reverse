package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class RotationRatingBar extends AnimationRatingBar {
    public RotationRatingBar(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.RatingBar
    /* renamed from: a */
    public final void mo3564a(float f) {
        if (this.f4801s != null) {
            this.f4800r.removeCallbacksAndMessages(this.f4802t);
        }
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PartialView partialView = (PartialView) obj;
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f);
            if (iIntValue > dCeil) {
                partialView.m3562b();
            } else {
                float f7 = f;
                RunnableC4208b runnableC4208b = new RunnableC4208b(this, iIntValue, dCeil, partialView, f7, 0);
                this.f4801s = runnableC4208b;
                if (this.f4800r == null) {
                    this.f4800r = new Handler();
                }
                this.f4800r.postAtTime(runnableC4208b, this.f4802t, SystemClock.uptimeMillis() + 15);
                f = f7;
            }
        }
    }

    public RotationRatingBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationRatingBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
