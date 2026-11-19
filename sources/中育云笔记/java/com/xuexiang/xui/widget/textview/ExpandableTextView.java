package com.xuexiang.xui.widget.textview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;

/* loaded from: classes5.dex */
public class ExpandableTextView extends LinearLayout implements View.OnClickListener {

    /* renamed from: c */
    public TextView f17243c;

    /* renamed from: d */
    public ImageButton f17244d;

    /* renamed from: e */
    public boolean f17245e;

    /* renamed from: f */
    public boolean f17246f;

    /* renamed from: g */
    public int f17247g;

    /* renamed from: h */
    public int f17248h;

    /* renamed from: i */
    public int f17249i;

    /* renamed from: j */
    public int f17250j;

    /* renamed from: k */
    public Drawable f17251k;

    /* renamed from: l */
    public Drawable f17252l;

    /* renamed from: m */
    public int f17253m;

    /* renamed from: n */
    public float f17254n;

    /* renamed from: o */
    public boolean f17255o;

    /* renamed from: p */
    public SparseBooleanArray f17256p;

    /* renamed from: q */
    public int f17257q;

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$a */
    public class AnimationAnimationListenerC8293a implements Animation.AnimationListener {
        public AnimationAnimationListenerC8293a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ExpandableTextView.this.clearAnimation();
            ExpandableTextView.this.f17255o = false;
            ExpandableTextView.m13495d(ExpandableTextView.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            ExpandableTextView.m13499h(expandableTextView.f17243c, expandableTextView.f17254n);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$b */
    public class RunnableC8294b implements Runnable {
        public RunnableC8294b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.f17250j = expandableTextView.getHeight() - ExpandableTextView.this.f17243c.getHeight();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$c */
    public class C8295c extends Animation {

        /* renamed from: c */
        public final View f17260c;

        /* renamed from: d */
        public final int f17261d;

        /* renamed from: e */
        public final int f17262e;

        public C8295c(View view, int i10, int i11) {
            this.f17260c = view;
            this.f17261d = i10;
            this.f17262e = i11;
            setDuration(ExpandableTextView.this.f17253m);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10 = this.f17262e;
            int i11 = (int) (((i10 - r0) * f10) + this.f17261d);
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.f17243c.setMaxHeight(i11 - expandableTextView.f17250j);
            if (Float.compare(ExpandableTextView.this.f17254n, 1.0f) != 0) {
                ExpandableTextView expandableTextView2 = ExpandableTextView.this;
                ExpandableTextView.m13499h(expandableTextView2.f17243c, expandableTextView2.f17254n + (f10 * (1.0f - ExpandableTextView.this.f17254n)));
            }
            this.f17260c.getLayoutParams().height = i11;
            this.f17260c.requestLayout();
        }

        @Override // android.view.animation.Animation
        public void initialize(int i10, int i11, int i12, int i13) {
            super.initialize(i10, i11, i12, i13);
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$d */
    public interface InterfaceC8296d {
    }

    public ExpandableTextView(Context context) {
        super(context);
        this.f17246f = true;
        m13505l(null);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8296d m13495d(ExpandableTextView expandableTextView) {
        expandableTextView.getClass();
        return null;
    }

    /* renamed from: h */
    public static void m13499h(View view, float f10) {
        if (m13502n()) {
            view.setAlpha(f10);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f10);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: j */
    public static Drawable m13500j(Context context, int i10) {
        Resources resources = context.getResources();
        return m13503o() ? resources.getDrawable(i10, context.getTheme()) : resources.getDrawable(i10);
    }

    /* renamed from: k */
    public static int m13501k(TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    /* renamed from: n */
    public static boolean m13502n() {
        return true;
    }

    /* renamed from: o */
    public static boolean m13503o() {
        return true;
    }

    @Nullable
    public CharSequence getText() {
        TextView textView = this.f17243c;
        return textView == null ? "" : textView.getText();
    }

    /* renamed from: i */
    public final void m13504i() {
        TextView textView = (TextView) findViewById(R$id.expandable_text);
        this.f17243c = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(R$id.expand_collapse);
        this.f17244d = imageButton;
        imageButton.setImageDrawable(this.f17246f ? this.f17251k : this.f17252l);
        this.f17244d.setOnClickListener(this);
    }

    /* renamed from: l */
    public final void m13505l(AttributeSet attributeSet) {
        m13506m(attributeSet);
        setOrientation(1);
        setVisibility(8);
    }

    /* renamed from: m */
    public final void m13506m(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        this.f17249i = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_etv_maxCollapsedLines, 8);
        this.f17253m = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_etv_animDuration, 300);
        this.f17254n = typedArrayObtainStyledAttributes.getFloat(R$styleable.ExpandableTextView_etv_animAlphaStart, 0.7f);
        this.f17251k = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_etv_expandDrawable);
        this.f17252l = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_etv_collapseDrawable);
        if (this.f17251k == null) {
            this.f17251k = m13500j(getContext(), R$drawable.xui_ic_expand_more_black_12dp);
        }
        if (this.f17252l == null) {
            this.f17252l = m13500j(getContext(), R$drawable.xui_ic_expand_less_black_12dp);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f17244d.getVisibility() != 0) {
            return;
        }
        boolean z10 = this.f17246f;
        this.f17246f = !z10;
        this.f17244d.setImageDrawable(!z10 ? this.f17251k : this.f17252l);
        SparseBooleanArray sparseBooleanArray = this.f17256p;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(this.f17257q, this.f17246f);
        }
        this.f17255o = true;
        C8295c c8295c = this.f17246f ? new C8295c(this, getHeight(), this.f17247g) : new C8295c(this, getHeight(), (getHeight() + this.f17248h) - this.f17243c.getHeight());
        c8295c.setFillAfter(true);
        c8295c.setAnimationListener(new AnimationAnimationListenerC8293a());
        clearAnimation();
        startAnimation(c8295c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m13504i();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f17255o;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f17245e || getVisibility() == 8) {
            super.onMeasure(i10, i11);
            return;
        }
        this.f17245e = false;
        this.f17244d.setVisibility(8);
        this.f17243c.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i10, i11);
        if (this.f17243c.getLineCount() <= this.f17249i) {
            return;
        }
        this.f17248h = m13501k(this.f17243c);
        if (this.f17246f) {
            this.f17243c.setMaxLines(this.f17249i);
        }
        this.f17244d.setVisibility(0);
        super.onMeasure(i10, i11);
        if (this.f17246f) {
            this.f17243c.post(new RunnableC8294b());
            this.f17247g = getMeasuredHeight();
        }
    }

    public void setOnExpandStateChangeListener(@Nullable InterfaceC8296d interfaceC8296d) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
        }
        super.setOrientation(i10);
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f17245e = true;
        this.f17243c.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17246f = true;
        m13505l(attributeSet);
    }

    @TargetApi(11)
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17246f = true;
        m13505l(attributeSet);
    }
}
