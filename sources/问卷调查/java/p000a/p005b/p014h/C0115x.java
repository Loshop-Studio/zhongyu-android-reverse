package p000a.p005b.p014h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a.b.h.x */
/* loaded from: classes.dex */
public class C0115x {

    /* renamed from: l */
    public static final RectF f841l = new RectF();

    /* renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f842m = new ConcurrentHashMap<>();

    /* renamed from: n */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f843n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f844a = 0;

    /* renamed from: b */
    public boolean f845b = false;

    /* renamed from: c */
    public float f846c = -1.0f;

    /* renamed from: d */
    public float f847d = -1.0f;

    /* renamed from: e */
    public float f848e = -1.0f;

    /* renamed from: f */
    public int[] f849f = new int[0];

    /* renamed from: g */
    public boolean f850g = false;

    /* renamed from: h */
    public TextPaint f851h;

    /* renamed from: i */
    public final TextView f852i;

    /* renamed from: j */
    public final Context f853j;

    /* renamed from: k */
    public final c f854k;

    /* renamed from: a.b.h.x$a */
    public static class a extends c {
        @Override // p000a.p005b.p014h.C0115x.c
        /* renamed from: a */
        public void mo444a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0115x.m435e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: a.b.h.x$b */
    public static class b extends a {
        @Override // p000a.p005b.p014h.C0115x.a, p000a.p005b.p014h.C0115x.c
        /* renamed from: a */
        public void mo444a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p000a.p005b.p014h.C0115x.c
        /* renamed from: b */
        public boolean mo445b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: a.b.h.x$c */
    public static class c {
        /* renamed from: a */
        public void mo444a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo445b(TextView textView) {
            return ((Boolean) C0115x.m435e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0115x(TextView textView) {
        this.f852i = textView;
        this.f853j = textView.getContext();
        this.f854k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    /* renamed from: d */
    public static Method m434d(String str) {
        try {
            Method declaredMethod = f842m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f842m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* renamed from: e */
    public static <T> T m435e(Object obj, String str, T t) {
        try {
            return (T) m434d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    /* renamed from: a */
    public void m436a() {
        if (m442i() && this.f844a != 0) {
            if (this.f845b) {
                if (this.f852i.getMeasuredHeight() <= 0 || this.f852i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f854k.mo445b(this.f852i) ? 1048576 : (this.f852i.getMeasuredWidth() - this.f852i.getTotalPaddingLeft()) - this.f852i.getTotalPaddingRight();
                int height = (this.f852i.getHeight() - this.f852i.getCompoundPaddingBottom()) - this.f852i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f841l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM438c = m438c(rectF);
                    if (fM438c != this.f852i.getTextSize()) {
                        m439f(0, fM438c);
                    }
                }
            }
            this.f845b = true;
        }
    }

    /* renamed from: b */
    public final int[] m437b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final int m438c(RectF rectF) {
        CharSequence transformation;
        int length = this.f849f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f849f[i4];
            CharSequence text = this.f852i.getText();
            TransformationMethod transformationMethod = this.f852i.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f852i)) != null) {
                text = transformation;
            }
            int maxLines = this.f852i.getMaxLines();
            TextPaint textPaint = this.f851h;
            if (textPaint == null) {
                this.f851h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f851h.set(this.f852i.getPaint());
            this.f851h.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m435e(this.f852i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f851h, Math.round(rectF.right));
            builderObtain.setAlignment(alignment).setLineSpacing(this.f852i.getLineSpacingExtra(), this.f852i.getLineSpacingMultiplier()).setIncludePad(this.f852i.getIncludeFontPadding()).setBreakStrategy(this.f852i.getBreakStrategy()).setHyphenationFrequency(this.f852i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f854k.mo444a(builderObtain, this.f852i);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && ((float) staticLayoutBuild.getHeight()) <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f849f[i3];
    }

    /* renamed from: f */
    public void m439f(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f853j;
        float fApplyDimension = TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f852i.getPaint().getTextSize()) {
            this.f852i.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f852i.isInLayout();
            if (this.f852i.getLayout() != null) {
                this.f845b = false;
                try {
                    Method methodM434d = m434d("nullLayouts");
                    if (methodM434d != null) {
                        methodM434d.invoke(this.f852i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.f852i.forceLayout();
                } else {
                    this.f852i.requestLayout();
                }
                this.f852i.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean m440g() {
        if (m442i() && this.f844a == 1) {
            if (!this.f850g || this.f849f.length == 0) {
                int iFloor = ((int) Math.floor((this.f848e - this.f847d) / this.f846c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f846c) + this.f847d);
                }
                this.f849f = m437b(iArr);
            }
            this.f845b = true;
        } else {
            this.f845b = false;
        }
        return this.f845b;
    }

    /* renamed from: h */
    public final boolean m441h() {
        boolean z = this.f849f.length > 0;
        this.f850g = z;
        if (z) {
            this.f844a = 1;
            this.f847d = r0[0];
            this.f848e = r0[r1 - 1];
            this.f846c = -1.0f;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean m442i() {
        return !(this.f852i instanceof AppCompatEditText);
    }

    /* renamed from: j */
    public final void m443j(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f844a = 1;
        this.f847d = f2;
        this.f848e = f3;
        this.f846c = f4;
        this.f850g = false;
    }
}
