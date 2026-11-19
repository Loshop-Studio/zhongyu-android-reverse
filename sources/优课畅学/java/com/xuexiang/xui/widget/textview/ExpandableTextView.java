package com.xuexiang.xui.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Layout;
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
import com.xuexiang.xui.utils.AbstractC6875e;

/* loaded from: classes4.dex */
public class ExpandableTextView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public TextView f8234a;

    /* renamed from: b */
    public ImageButton f8235b;

    /* renamed from: c */
    public boolean f8236c;

    /* renamed from: d */
    public boolean f8237d;

    /* renamed from: e */
    public int f8238e;

    /* renamed from: f */
    public int f8239f;

    /* renamed from: g */
    public int f8240g;

    /* renamed from: h */
    public int f8241h;

    /* renamed from: i */
    public Drawable f8242i;

    /* renamed from: j */
    public Drawable f8243j;

    /* renamed from: k */
    public int f8244k;

    /* renamed from: l */
    public float f8245l;

    /* renamed from: m */
    public boolean f8246m;

    /* renamed from: n */
    public SparseBooleanArray f8247n;

    /* renamed from: o */
    public int f8248o;

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$a */
    public class AnimationAnimationListenerC7013a implements Animation.AnimationListener {
        public AnimationAnimationListenerC7013a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ExpandableTextView.this.clearAnimation();
            ExpandableTextView.this.f8246m = false;
            ExpandableTextView.m7191d(ExpandableTextView.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            ExpandableTextView.m7195h(expandableTextView.f8234a, expandableTextView.f8245l);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$b */
    public class RunnableC7014b implements Runnable {
        public RunnableC7014b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.f8241h = expandableTextView.getHeight() - ExpandableTextView.this.f8234a.getHeight();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.ExpandableTextView$c */
    public class C7015c extends Animation {

        /* renamed from: a */
        public final View f8251a;

        /* renamed from: b */
        public final int f8252b;

        /* renamed from: c */
        public final int f8253c;

        public C7015c(View view, int i10, int i11) {
            this.f8251a = view;
            this.f8252b = i10;
            this.f8253c = i11;
            setDuration(ExpandableTextView.this.f8244k);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10 = this.f8253c;
            int i11 = (int) (((i10 - r0) * f10) + this.f8252b);
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.f8234a.setMaxHeight(i11 - expandableTextView.f8241h);
            if (Float.compare(ExpandableTextView.this.f8245l, 1.0f) != 0) {
                ExpandableTextView expandableTextView2 = ExpandableTextView.this;
                ExpandableTextView.m7195h(expandableTextView2.f8234a, expandableTextView2.f8245l + (f10 * (1.0f - ExpandableTextView.this.f8245l)));
            }
            this.f8251a.getLayoutParams().height = i11;
            this.f8251a.requestLayout();
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
    public interface InterfaceC7016d {
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8237d = true;
        m7201l(attributeSet);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC7016d m7191d(ExpandableTextView expandableTextView) {
        expandableTextView.getClass();
        return null;
    }

    /* renamed from: h */
    public static void m7195h(View view, float f10) {
        if (m7198n()) {
            view.setAlpha(f10);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f10);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: j */
    public static Drawable m7196j(Context context, int i10) {
        Resources resources = context.getResources();
        return m7199o() ? resources.getDrawable(i10, context.getTheme()) : resources.getDrawable(i10);
    }

    /* renamed from: k */
    public static int m7197k(TextView textView) {
        Layout layout = textView.getLayout();
        return (layout != null ? layout.getLineTop(textView.getLineCount()) : 0) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    /* renamed from: n */
    public static boolean m7198n() {
        return true;
    }

    /* renamed from: o */
    public static boolean m7199o() {
        return true;
    }

    @Nullable
    public CharSequence getText() {
        TextView textView = this.f8234a;
        return textView == null ? "" : textView.getText();
    }

    /* renamed from: i */
    public final void m7200i() {
        TextView textView = (TextView) findViewById(R$id.expandable_text);
        this.f8234a = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(R$id.expand_collapse);
        this.f8235b = imageButton;
        imageButton.setImageDrawable(this.f8237d ? this.f8242i : this.f8243j);
        this.f8235b.setOnClickListener(this);
    }

    /* renamed from: l */
    public final void m7201l(AttributeSet attributeSet) {
        m7202m(attributeSet);
        setOrientation(1);
        setVisibility(8);
    }

    /* renamed from: m */
    public final void m7202m(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        this.f8240g = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_etv_maxCollapsedLines, 8);
        this.f8244k = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_etv_animDuration, 300);
        this.f8245l = typedArrayObtainStyledAttributes.getFloat(R$styleable.ExpandableTextView_etv_animAlphaStart, 0.7f);
        this.f8242i = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_etv_expandDrawable);
        this.f8243j = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_etv_collapseDrawable);
        if (this.f8242i == null) {
            this.f8242i = m7196j(getContext(), R$drawable.xui_ic_expand_more_black_12dp);
        }
        if (this.f8243j == null) {
            this.f8243j = m7196j(getContext(), R$drawable.xui_ic_expand_less_black_12dp);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f8235b.getVisibility() != 0) {
            return;
        }
        boolean z10 = this.f8237d;
        this.f8237d = !z10;
        this.f8235b.setImageDrawable(!z10 ? this.f8242i : this.f8243j);
        SparseBooleanArray sparseBooleanArray = this.f8247n;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(this.f8248o, this.f8237d);
        }
        this.f8246m = true;
        C7015c c7015c = this.f8237d ? new C7015c(this, getHeight(), this.f8238e) : new C7015c(this, getHeight(), (getHeight() + this.f8239f) - this.f8234a.getHeight());
        c7015c.setFillAfter(true);
        c7015c.setAnimationListener(new AnimationAnimationListenerC7013a());
        clearAnimation();
        startAnimation(c7015c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7200i();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8246m;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f8236c || getVisibility() == 8) {
            super.onMeasure(i10, i11);
            return;
        }
        this.f8236c = false;
        this.f8235b.setVisibility(8);
        this.f8234a.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i10, i11);
        if (this.f8234a.getLineCount() <= this.f8240g) {
            return;
        }
        this.f8239f = m7197k(this.f8234a);
        if (this.f8237d) {
            this.f8234a.setMaxLines(this.f8240g);
        }
        this.f8235b.setVisibility(0);
        super.onMeasure(i10, i11);
        if (this.f8237d) {
            this.f8234a.post(new RunnableC7014b());
            this.f8238e = getMeasuredHeight();
        }
    }

    public void setOnExpandStateChangeListener(@Nullable InterfaceC7016d interfaceC7016d) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
        }
        super.setOrientation(i10);
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f8236c = true;
        this.f8234a.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
