package p335s7;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;

/* renamed from: s7.a */
/* loaded from: classes5.dex */
public class ViewOnTouchListenerC11078a implements View.OnTouchListener {

    /* renamed from: c */
    public int f26729c;

    /* renamed from: d */
    public int f26730d;

    /* renamed from: e */
    public int f26731e;

    /* renamed from: f */
    public int f26732f;

    /* renamed from: g */
    public int f26733g;

    /* renamed from: h */
    public int f26734h;

    /* renamed from: i */
    public GSYBaseVideoPlayer f26735i;

    public ViewOnTouchListenerC11078a(GSYBaseVideoPlayer gSYBaseVideoPlayer, int i10, int i11) {
        this.f26731e = i10;
        this.f26732f = i11;
        this.f26735i = gSYBaseVideoPlayer;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f26729c = rawX;
            this.f26730d = rawY;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26735i.getLayoutParams();
            this.f26733g = rawX - layoutParams.leftMargin;
            this.f26734h = rawY - layoutParams.topMargin;
        } else {
            if (action == 1) {
                return Math.abs(this.f26730d - rawY) >= 5 || Math.abs(this.f26729c - rawX) >= 5;
            }
            if (action == 2) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f26735i.getLayoutParams();
                int i10 = rawX - this.f26733g;
                layoutParams2.leftMargin = i10;
                int i11 = rawY - this.f26734h;
                layoutParams2.topMargin = i11;
                int i12 = this.f26731e;
                if (i10 >= i12) {
                    layoutParams2.leftMargin = i12;
                }
                int i13 = this.f26732f;
                if (i11 >= i13) {
                    layoutParams2.topMargin = i13;
                }
                if (layoutParams2.leftMargin <= 0) {
                    layoutParams2.leftMargin = 0;
                }
                if (layoutParams2.topMargin <= 0) {
                    layoutParams2.topMargin = 0;
                }
                this.f26735i.setLayoutParams(layoutParams2);
            }
        }
        return false;
    }
}
