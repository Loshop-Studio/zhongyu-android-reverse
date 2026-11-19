package com.xuexiang.xui.widget.textview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import p016b0.RunnableC3059a;
import p149r3.AnimationAnimationListenerC6458a;
import p149r3.C6459b;
import p149r3.InterfaceC6460c;

/* loaded from: classes3.dex */
public class ExpandableTextView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public TextView f4998a;

    /* renamed from: b */
    public ImageButton f4999b;

    /* renamed from: c */
    public boolean f5000c;

    /* renamed from: d */
    public boolean f5001d;

    /* renamed from: e */
    public int f5002e;

    /* renamed from: f */
    public int f5003f;

    /* renamed from: g */
    public int f5004g;

    /* renamed from: h */
    public int f5005h;

    /* renamed from: i */
    public Drawable f5006i;

    /* renamed from: j */
    public Drawable f5007j;

    /* renamed from: k */
    public int f5008k;

    /* renamed from: l */
    public float f5009l;

    /* renamed from: m */
    public boolean f5010m;

    public ExpandableTextView(Context context) {
        super(context);
        this.f5001d = true;
        m3612a(null);
    }

    /* renamed from: a */
    public final void m3612a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        this.f5004g = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_etv_maxCollapsedLines, 8);
        this.f5008k = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_etv_animDuration, 300);
        this.f5009l = typedArrayObtainStyledAttributes.getFloat(R$styleable.ExpandableTextView_etv_animAlphaStart, 0.7f);
        getContext();
        this.f5006i = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ExpandableTextView_etv_expandDrawable);
        getContext();
        this.f5007j = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ExpandableTextView_etv_collapseDrawable);
        if (this.f5006i == null) {
            Context context = getContext();
            this.f5006i = context.getResources().getDrawable(R$drawable.xui_ic_expand_more_black_12dp, context.getTheme());
        }
        if (this.f5007j == null) {
            Context context2 = getContext();
            this.f5007j = context2.getResources().getDrawable(R$drawable.xui_ic_expand_less_black_12dp, context2.getTheme());
        }
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        setVisibility(8);
    }

    @Nullable
    public CharSequence getText() {
        TextView textView = this.f4998a;
        return textView == null ? "" : textView.getText();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f4999b.getVisibility() != 0) {
            return;
        }
        boolean z8 = this.f5001d;
        this.f5001d = !z8;
        this.f4999b.setImageDrawable(!z8 ? this.f5006i : this.f5007j);
        this.f5010m = true;
        C6459b c6459b = this.f5001d ? new C6459b(this, this, getHeight(), this.f5002e) : new C6459b(this, this, getHeight(), (getHeight() + this.f5003f) - this.f4998a.getHeight());
        c6459b.setFillAfter(true);
        c6459b.setAnimationListener(new AnimationAnimationListenerC6458a(this));
        clearAnimation();
        startAnimation(c6459b);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R$id.expandable_text);
        this.f4998a = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(R$id.expand_collapse);
        this.f4999b = imageButton;
        imageButton.setImageDrawable(this.f5001d ? this.f5006i : this.f5007j);
        this.f4999b.setOnClickListener(this);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5010m;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        if (!this.f5000c || getVisibility() == 8) {
            super.onMeasure(i, i8);
            return;
        }
        this.f5000c = false;
        this.f4999b.setVisibility(8);
        this.f4998a.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i8);
        if (this.f4998a.getLineCount() <= this.f5004g) {
            return;
        }
        TextView textView = this.f4998a;
        this.f5003f = textView.getCompoundPaddingBottom() + textView.getCompoundPaddingTop() + textView.getLayout().getLineTop(textView.getLineCount());
        if (this.f5001d) {
            this.f4998a.setMaxLines(this.f5004g);
        }
        this.f4999b.setVisibility(0);
        super.onMeasure(i, i8);
        if (this.f5001d) {
            this.f4998a.post(new RunnableC3059a(this, 17));
            this.f5002e = getMeasuredHeight();
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
        }
        super.setOrientation(i);
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f5000c = true;
        this.f4998a.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5001d = true;
        m3612a(attributeSet);
    }

    @TargetApi(11)
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5001d = true;
        m3612a(attributeSet);
    }

    public void setOnExpandStateChangeListener(@Nullable InterfaceC6460c interfaceC6460c) {
    }
}
