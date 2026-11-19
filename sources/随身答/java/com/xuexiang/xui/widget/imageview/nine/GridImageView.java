package com.xuexiang.xui.widget.imageview.nine;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class GridImageView extends AppCompatImageView {
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setImageDrawable(null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        int action = motionEvent.getAction();
        if (action == 0) {
            Drawable drawable2 = getDrawable();
            if (drawable2 != null) {
                drawable2.mutate().setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
            }
        } else if ((action == 1 || action == 3) && (drawable = getDrawable()) != null) {
            drawable.mutate().clearColorFilter();
        }
        return super.onTouchEvent(motionEvent);
    }
}
