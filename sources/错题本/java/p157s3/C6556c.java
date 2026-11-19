package p157s3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.searchview.C4214e;
import java.util.ArrayList;

/* renamed from: s3.c */
/* loaded from: classes3.dex */
public final class C6556c {

    /* renamed from: a */
    public TextView f10946a;

    /* renamed from: b */
    public TextPaint f10947b;

    /* renamed from: c */
    public float f10948c;

    /* renamed from: d */
    public int f10949d;

    /* renamed from: e */
    public float f10950e;

    /* renamed from: f */
    public float f10951f;

    /* renamed from: g */
    public float f10952g;

    /* renamed from: h */
    public boolean f10953h;

    /* renamed from: i */
    public boolean f10954i;

    /* renamed from: j */
    public ArrayList f10955j;

    /* renamed from: k */
    public C4214e f10956k;

    /* renamed from: l */
    public ViewOnLayoutChangeListenerC6554a f10957l;

    /* renamed from: b */
    public static C6556c m6195b(TextView textView, AttributeSet attributeSet, int i) {
        C6556c c6556c = new C6556c();
        c6556c.f10956k = new C4214e(c6556c, 3);
        c6556c.f10957l = new ViewOnLayoutChangeListenerC6554a(c6556c);
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        c6556c.f10946a = textView;
        c6556c.f10947b = new TextPaint();
        float textSize = textView.getTextSize();
        if (c6556c.f10948c != textSize) {
            c6556c.f10948c = textSize;
        }
        boolean z8 = true;
        c6556c.f10949d = textView.getTransformationMethod() instanceof SingleLineTransformationMethod ? 1 : textView.getMaxLines();
        c6556c.f10950e = f * 8.0f;
        c6556c.f10951f = c6556c.f10948c;
        c6556c.f10952g = 0.5f;
        if (attributeSet != null) {
            Context context = textView.getContext();
            int i8 = (int) c6556c.f10950e;
            float f7 = c6556c.f10952g;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoFitTextView, i, 0);
            z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoFitTextView_aftv_enable, true);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AutoFitTextView_aftv_minTextSize, i8);
            float f8 = typedArrayObtainStyledAttributes.getFloat(R$styleable.AutoFitTextView_aftv_precision, f7);
            typedArrayObtainStyledAttributes.recycle();
            c6556c.m6199e(dimensionPixelSize, 0);
            if (c6556c.f10952g != f8) {
                c6556c.f10952g = f8;
                c6556c.m6197a();
            }
        }
        c6556c.m6198d(z8);
        return c6556c;
    }

    /* renamed from: c */
    public static float m6196c(CharSequence charSequence, TextPaint textPaint, float f, int i, float f7, float f8, float f9, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int lineCount;
        CharSequence charSequence2;
        float lineWidth;
        float f10 = (f7 + f8) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f10, displayMetrics));
        if (i != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            lineCount = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            lineCount = 1;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (lineCount <= i) {
            if (lineCount < i) {
                return m6196c(charSequence, textPaint, f, i, f10, f8, f9, displayMetrics);
            }
            if (i == 1) {
                charSequence2 = charSequence;
                lineWidth = textPaint.measureText(charSequence2, 0, charSequence.length());
            } else {
                charSequence2 = charSequence;
                lineWidth = 0.0f;
                for (int i8 = 0; i8 < lineCount; i8++) {
                    if (staticLayout2.getLineWidth(i8) > lineWidth) {
                        lineWidth = staticLayout2.getLineWidth(i8);
                    }
                }
            }
            float f11 = lineWidth;
            if (f8 - f7 >= f9) {
                return f11 > f ? m6196c(charSequence2, textPaint, f, i, f7, f10, f9, displayMetrics) : f11 < f ? m6196c(charSequence, textPaint, f, i, f10, f8, f9, displayMetrics) : f10;
            }
        } else if (f8 - f7 >= f9) {
            return m6196c(charSequence, textPaint, f, i, f7, f10, f9, displayMetrics);
        }
        return f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6197a() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p157s3.C6556c.m6197a():void");
    }

    /* renamed from: d */
    public final void m6198d(boolean z8) {
        ViewOnLayoutChangeListenerC6554a viewOnLayoutChangeListenerC6554a = this.f10957l;
        C4214e c4214e = this.f10956k;
        TextView textView = this.f10946a;
        if (this.f10953h != z8) {
            this.f10953h = z8;
            if (z8) {
                textView.addTextChangedListener(c4214e);
                textView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC6554a);
                m6197a();
            } else {
                textView.removeTextChangedListener(c4214e);
                textView.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC6554a);
                textView.setTextSize(0, this.f10948c);
            }
        }
    }

    /* renamed from: e */
    public final void m6199e(float f, int i) {
        Context context = this.f10946a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, system.getDisplayMetrics());
        if (fApplyDimension != this.f10950e) {
            this.f10950e = fApplyDimension;
            m6197a();
        }
    }
}
