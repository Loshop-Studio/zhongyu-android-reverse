package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;

/* renamed from: com.xuexiang.xui.widget.textview.autofit.a */
/* loaded from: classes5.dex */
public class C8298a {

    /* renamed from: a */
    public TextView f17283a;

    /* renamed from: b */
    public TextPaint f17284b;

    /* renamed from: c */
    public float f17285c;

    /* renamed from: d */
    public int f17286d;

    /* renamed from: e */
    public float f17287e;

    /* renamed from: f */
    public float f17288f;

    /* renamed from: g */
    public float f17289g;

    /* renamed from: h */
    public boolean f17290h;

    /* renamed from: i */
    public boolean f17291i;

    /* renamed from: j */
    public ArrayList f17292j;

    /* renamed from: k */
    public TextWatcher f17293k;

    /* renamed from: l */
    public View.OnLayoutChangeListener f17294l;

    /* renamed from: com.xuexiang.xui.widget.textview.autofit.a$b */
    public class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C8298a.this.m13535c();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.autofit.a$c */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C8298a.this.m13535c();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.autofit.a$d */
    public interface d {
        /* renamed from: b */
        void mo13525b(float f10, float f11);
    }

    public C8298a(TextView textView) {
        this.f17293k = new c();
        this.f17294l = new b();
        float f10 = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.f17283a = textView;
        this.f17284b = new TextPaint();
        m13548v(textView.getTextSize());
        this.f17286d = m13533i(textView);
        this.f17287e = f10 * 8.0f;
        this.f17288f = this.f17285c;
        this.f17289g = 0.5f;
    }

    /* renamed from: d */
    public static void m13528d(TextView textView, TextPaint textPaint, float f10, float f11, int i10, float f12) {
        int width;
        if (i10 <= 0 || i10 == Integer.MAX_VALUE || (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) <= 0) {
            return;
        }
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, textView);
        }
        Context context = textView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        textPaint.set(textView.getPaint());
        textPaint.setTextSize(f11);
        float fM13531g = ((i10 != 1 || textPaint.measureText(text, 0, text.length()) <= ((float) width)) && m13532h(text, textPaint, f11, (float) width, displayMetrics) <= i10) ? f11 : m13531g(text, textPaint, width, i10, 0.0f, f11, f12, displayMetrics);
        if (fM13531g < f10) {
            fM13531g = f10;
        }
        textView.setTextSize(0, fM13531g);
    }

    /* renamed from: e */
    public static C8298a m13529e(TextView textView) {
        return m13530f(textView, null, 0);
    }

    /* renamed from: f */
    public static C8298a m13530f(TextView textView, AttributeSet attributeSet, int i10) {
        C8298a c8298a = new C8298a(textView);
        boolean z10 = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            int iM13537k = (int) c8298a.m13537k();
            float fM13538l = c8298a.m13538l();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoFitTextView, i10, 0);
            z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoFitTextView_aftv_enable, true);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AutoFitTextView_aftv_minTextSize, iM13537k);
            float f10 = typedArrayObtainStyledAttributes.getFloat(R$styleable.AutoFitTextView_aftv_precision, fM13538l);
            typedArrayObtainStyledAttributes.recycle();
            c8298a.m13544r(0, dimensionPixelSize).m13545s(f10);
        }
        c8298a.m13540n(z10);
        return c8298a;
    }

    /* renamed from: g */
    public static float m13531g(CharSequence charSequence, TextPaint textPaint, float f10, int i10, float f11, float f12, float f13, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int lineCount;
        CharSequence charSequence2;
        float lineWidth;
        float f14 = (f11 + f12) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f14, displayMetrics));
        if (i10 != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            lineCount = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            lineCount = 1;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (lineCount <= i10) {
            if (lineCount < i10) {
                return m13531g(charSequence, textPaint, f10, i10, f14, f12, f13, displayMetrics);
            }
            if (i10 == 1) {
                charSequence2 = charSequence;
                lineWidth = textPaint.measureText(charSequence2, 0, charSequence.length());
            } else {
                charSequence2 = charSequence;
                lineWidth = 0.0f;
                for (int i11 = 0; i11 < lineCount; i11++) {
                    if (staticLayout2.getLineWidth(i11) > lineWidth) {
                        lineWidth = staticLayout2.getLineWidth(i11);
                    }
                }
            }
            float f15 = lineWidth;
            if (f12 - f11 >= f13) {
                return f15 > f10 ? m13531g(charSequence2, textPaint, f10, i10, f11, f14, f13, displayMetrics) : f15 < f10 ? m13531g(charSequence, textPaint, f10, i10, f14, f12, f13, displayMetrics) : f14;
            }
        } else if (f12 - f11 >= f13) {
            return m13531g(charSequence, textPaint, f10, i10, f11, f14, f13, displayMetrics);
        }
        return f11;
    }

    /* renamed from: h */
    public static int m13532h(CharSequence charSequence, TextPaint textPaint, float f10, float f11, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f10, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    /* renamed from: i */
    public static int m13533i(TextView textView) {
        if (textView.getTransformationMethod() instanceof SingleLineTransformationMethod) {
            return 1;
        }
        return textView.getMaxLines();
    }

    /* renamed from: b */
    public C8298a m13534b(d dVar) {
        if (this.f17292j == null) {
            this.f17292j = new ArrayList();
        }
        this.f17292j.add(dVar);
        return this;
    }

    /* renamed from: c */
    public final void m13535c() {
        float textSize = this.f17283a.getTextSize();
        this.f17291i = true;
        m13528d(this.f17283a, this.f17284b, this.f17287e, this.f17288f, this.f17286d, this.f17289g);
        this.f17291i = false;
        float textSize2 = this.f17283a.getTextSize();
        if (textSize2 != textSize) {
            m13539m(textSize2, textSize);
        }
    }

    /* renamed from: j */
    public float m13536j() {
        return this.f17288f;
    }

    /* renamed from: k */
    public float m13537k() {
        return this.f17287e;
    }

    /* renamed from: l */
    public float m13538l() {
        return this.f17289g;
    }

    /* renamed from: m */
    public final void m13539m(float f10, float f11) {
        ArrayList arrayList = this.f17292j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d) obj).mo13525b(f10, f11);
        }
    }

    /* renamed from: n */
    public C8298a m13540n(boolean z10) {
        if (this.f17290h != z10) {
            this.f17290h = z10;
            if (z10) {
                this.f17283a.addTextChangedListener(this.f17293k);
                this.f17283a.addOnLayoutChangeListener(this.f17294l);
                m13535c();
                return this;
            }
            this.f17283a.removeTextChangedListener(this.f17293k);
            this.f17283a.removeOnLayoutChangeListener(this.f17294l);
            this.f17283a.setTextSize(0, this.f17285c);
        }
        return this;
    }

    /* renamed from: o */
    public C8298a m13541o(int i10) {
        if (this.f17286d != i10) {
            this.f17286d = i10;
            m13535c();
        }
        return this;
    }

    /* renamed from: p */
    public C8298a m13542p(float f10) {
        return m13543q(2, f10);
    }

    /* renamed from: q */
    public C8298a m13543q(int i10, float f10) {
        Context context = this.f17283a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        m13546t(TypedValue.applyDimension(i10, f10, system.getDisplayMetrics()));
        return this;
    }

    /* renamed from: r */
    public C8298a m13544r(int i10, float f10) {
        Context context = this.f17283a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        m13547u(TypedValue.applyDimension(i10, f10, system.getDisplayMetrics()));
        return this;
    }

    /* renamed from: s */
    public C8298a m13545s(float f10) {
        if (this.f17289g != f10) {
            this.f17289g = f10;
            m13535c();
        }
        return this;
    }

    /* renamed from: t */
    public final void m13546t(float f10) {
        if (f10 != this.f17288f) {
            this.f17288f = f10;
            m13535c();
        }
    }

    /* renamed from: u */
    public final void m13547u(float f10) {
        if (f10 != this.f17287e) {
            this.f17287e = f10;
            m13535c();
        }
    }

    /* renamed from: v */
    public final void m13548v(float f10) {
        if (this.f17285c != f10) {
            this.f17285c = f10;
        }
    }

    /* renamed from: w */
    public void m13549w(int i10, float f10) {
        if (this.f17291i) {
            return;
        }
        Context context = this.f17283a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        m13548v(TypedValue.applyDimension(i10, f10, system.getDisplayMetrics()));
    }
}
