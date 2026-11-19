package com.xuexiang.xui.widget.textview.label;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class LabelView extends AppCompatTextView {

    /* renamed from: k */
    public static final AtomicInteger f17339k = new AtomicInteger(1);

    /* renamed from: d */
    public float f17340d;

    /* renamed from: e */
    public float f17341e;

    /* renamed from: f */
    public float f17342f;

    /* renamed from: g */
    public float f17343g;

    /* renamed from: h */
    public float f17344h;

    /* renamed from: i */
    public int f17345i;

    /* renamed from: j */
    public Animation f17346j;

    /* renamed from: com.xuexiang.xui.widget.textview.label.LabelView$a */
    public class C8301a extends Animation {
        public C8301a() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            Matrix matrix = transformation.getMatrix();
            matrix.postTranslate(LabelView.this.f17340d, LabelView.this.f17341e);
            matrix.postRotate(LabelView.this.f17344h, LabelView.this.f17342f, LabelView.this.f17343g);
        }
    }

    public LabelView(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    private void m13585h() {
        if (getLayoutParams() == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        this.f17345i = -1;
        setGravity(17);
        setTextColor(-1);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(2, 12.0f);
        setBackgroundColor(-16776961);
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public LabelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17346j = new C8301a();
        m13585h();
        this.f17346j.setFillBefore(true);
        this.f17346j.setFillAfter(true);
        this.f17346j.setFillEnabled(true);
    }
}
