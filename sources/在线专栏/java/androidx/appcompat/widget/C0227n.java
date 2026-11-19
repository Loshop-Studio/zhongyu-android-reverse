package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C0358u;
import com.p068uc.crashsdk.export.LogType;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p015c.C1047j;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
class C0227n {

    /* renamed from: l */
    private static final RectF f1176l = new RectF();

    /* renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f1177m = new ConcurrentHashMap<>();

    /* renamed from: n */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f1178n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1179a = 0;

    /* renamed from: b */
    private boolean f1180b = false;

    /* renamed from: c */
    private float f1181c = -1.0f;

    /* renamed from: d */
    private float f1182d = -1.0f;

    /* renamed from: e */
    private float f1183e = -1.0f;

    /* renamed from: f */
    private int[] f1184f = new int[0];

    /* renamed from: g */
    private boolean f1185g = false;

    /* renamed from: h */
    private TextPaint f1186h;

    /* renamed from: i */
    private final TextView f1187i;

    /* renamed from: j */
    private final Context f1188j;

    /* renamed from: k */
    private final c f1189k;

    /* renamed from: androidx.appcompat.widget.n$a */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.C0227n.c
        /* renamed from: a */
        void mo977a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0227n.m957o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.n$b */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.C0227n.a, androidx.appcompat.widget.C0227n.c
        /* renamed from: a */
        void mo977a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0227n.c
        /* renamed from: b */
        boolean mo978b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.n$c */
    private static class c {
        c() {
        }

        /* renamed from: a */
        void mo977a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo978b(TextView textView) {
            return ((Boolean) C0227n.m957o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0227n(TextView textView) {
        this.f1187i = textView;
        this.f1188j = textView.getContext();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            this.f1189k = new b();
        } else if (i4 >= 23) {
            this.f1189k = new a();
        } else {
            this.f1189k = new c();
        }
    }

    /* renamed from: A */
    private boolean m949A() {
        return !(this.f1187i instanceof AppCompatEditText);
    }

    /* renamed from: B */
    private void m950B(float f4, float f5, float f6) throws IllegalArgumentException {
        if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= IGoodView.DEFAULT_TO_ALPHA) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f1179a = 1;
        this.f1182d = f4;
        this.f1183e = f5;
        this.f1181c = f6;
        this.f1185g = false;
    }

    /* renamed from: b */
    private int[] m951b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m952c() {
        this.f1179a = 0;
        this.f1182d = -1.0f;
        this.f1183e = -1.0f;
        this.f1181c = -1.0f;
        this.f1184f = new int[0];
        this.f1180b = false;
    }

    /* renamed from: e */
    private StaticLayout m953e(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1186h, i4);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f1187i.getLineSpacingExtra(), this.f1187i.getLineSpacingMultiplier()).setIncludePad(this.f1187i.getIncludeFontPadding()).setBreakStrategy(this.f1187i.getBreakStrategy()).setHyphenationFrequency(this.f1187i.getHyphenationFrequency());
        if (i5 == -1) {
            i5 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i5);
        try {
            this.f1189k.mo977a(builderObtain, this.f1187i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    /* renamed from: f */
    private StaticLayout m954f(CharSequence charSequence, Layout.Alignment alignment, int i4) {
        return new StaticLayout(charSequence, this.f1186h, i4, alignment, this.f1187i.getLineSpacingMultiplier(), this.f1187i.getLineSpacingExtra(), this.f1187i.getIncludeFontPadding());
    }

    /* renamed from: g */
    private int m955g(RectF rectF) {
        int length = this.f1184f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            int i7 = (i5 + i4) / 2;
            if (m962z(this.f1184f[i7], rectF)) {
                int i8 = i7 + 1;
                i6 = i5;
                i5 = i8;
            } else {
                i6 = i7 - 1;
                i4 = i6;
            }
        }
        return this.f1184f[i6];
    }

    /* renamed from: m */
    private static Method m956m(String str) {
        try {
            Method declaredMethod = f1177m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1177m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    /* renamed from: o */
    static <T> T m957o(Object obj, String str, T t3) {
        try {
            return (T) m956m(str).invoke(obj, new Object[0]);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return t3;
        }
    }

    /* renamed from: u */
    private void m958u(float f4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f4 != this.f1187i.getPaint().getTextSize()) {
            this.f1187i.getPaint().setTextSize(f4);
            boolean zIsInLayout = this.f1187i.isInLayout();
            if (this.f1187i.getLayout() != null) {
                this.f1180b = false;
                try {
                    Method methodM956m = m956m("nullLayouts");
                    if (methodM956m != null) {
                        methodM956m.invoke(this.f1187i, new Object[0]);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (zIsInLayout) {
                    this.f1187i.forceLayout();
                } else {
                    this.f1187i.requestLayout();
                }
                this.f1187i.invalidate();
            }
        }
    }

    /* renamed from: w */
    private boolean m959w() {
        if (m949A() && this.f1179a == 1) {
            if (!this.f1185g || this.f1184f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1183e - this.f1182d) / this.f1181c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr[i4] = Math.round(this.f1182d + (i4 * this.f1181c));
                }
                this.f1184f = m951b(iArr);
            }
            this.f1180b = true;
        } else {
            this.f1180b = false;
        }
        return this.f1180b;
    }

    /* renamed from: x */
    private void m960x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f1184f = m951b(iArr);
            m961y();
        }
    }

    /* renamed from: y */
    private boolean m961y() {
        boolean z3 = this.f1184f.length > 0;
        this.f1185g = z3;
        if (z3) {
            this.f1179a = 1;
            this.f1182d = r0[0];
            this.f1183e = r0[r1 - 1];
            this.f1181c = -1.0f;
        }
        return z3;
    }

    /* renamed from: z */
    private boolean m962z(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1187i.getText();
        TransformationMethod transformationMethod = this.f1187i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1187i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1187i.getMaxLines();
        m970n(i4);
        StaticLayout staticLayoutM964d = m964d(text, (Layout.Alignment) m957o(this.f1187i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM964d.getLineCount() <= maxLines && staticLayoutM964d.getLineEnd(staticLayoutM964d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM964d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    void m963a() {
        if (m971p()) {
            if (this.f1180b) {
                if (this.f1187i.getMeasuredHeight() <= 0 || this.f1187i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1189k.mo978b(this.f1187i) ? LogType.ANR : (this.f1187i.getMeasuredWidth() - this.f1187i.getTotalPaddingLeft()) - this.f1187i.getTotalPaddingRight();
                int height = (this.f1187i.getHeight() - this.f1187i.getCompoundPaddingBottom()) - this.f1187i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1176l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM955g = m955g(rectF);
                    if (fM955g != this.f1187i.getTextSize()) {
                        m976v(0, fM955g);
                    }
                }
            }
            this.f1180b = true;
        }
    }

    /* renamed from: d */
    StaticLayout m964d(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        return Build.VERSION.SDK_INT >= 23 ? m953e(charSequence, alignment, i4, i5) : m954f(charSequence, alignment, i4);
    }

    /* renamed from: h */
    int m965h() {
        return Math.round(this.f1183e);
    }

    /* renamed from: i */
    int m966i() {
        return Math.round(this.f1182d);
    }

    /* renamed from: j */
    int m967j() {
        return Math.round(this.f1181c);
    }

    /* renamed from: k */
    int[] m968k() {
        return this.f1184f;
    }

    /* renamed from: l */
    int m969l() {
        return this.f1179a;
    }

    /* renamed from: n */
    void m970n(int i4) {
        TextPaint textPaint = this.f1186h;
        if (textPaint == null) {
            this.f1186h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1186h.set(this.f1187i.getPaint());
        this.f1186h.setTextSize(i4);
    }

    /* renamed from: p */
    boolean m971p() {
        return m949A() && this.f1179a != 0;
    }

    /* renamed from: q */
    void m972q(AttributeSet attributeSet, int i4) throws Resources.NotFoundException, IllegalArgumentException {
        int resourceId;
        Context context = this.f1188j;
        int[] iArr = C1047j.f6104k0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        TextView textView = this.f1187i;
        C0358u.m2047o0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i4, 0);
        int i5 = C1047j.f6129p0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.f1179a = typedArrayObtainStyledAttributes.getInt(i5, 0);
        }
        int i6 = C1047j.f6124o0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = C1047j.f6114m0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i7) ? typedArrayObtainStyledAttributes.getDimension(i7, -1.0f) : -1.0f;
        int i8 = C1047j.f6109l0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getDimension(i8, -1.0f) : -1.0f;
        int i9 = C1047j.f6119n0;
        if (typedArrayObtainStyledAttributes.hasValue(i9) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i9, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m960x(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m949A()) {
            this.f1179a = 0;
            return;
        }
        if (this.f1179a == 1) {
            if (!this.f1185g) {
                DisplayMetrics displayMetrics = this.f1188j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m950B(dimension2, dimension3, dimension);
            }
            m959w();
        }
    }

    /* renamed from: r */
    void m973r(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (m949A()) {
            DisplayMetrics displayMetrics = this.f1188j.getResources().getDisplayMetrics();
            m950B(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (m959w()) {
                m963a();
            }
        }
    }

    /* renamed from: s */
    void m974s(int[] iArr, int i4) throws IllegalArgumentException {
        if (m949A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i4 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1188j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArrCopyOf[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                this.f1184f = m951b(iArrCopyOf);
                if (!m961y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1185g = false;
            }
            if (m959w()) {
                m963a();
            }
        }
    }

    /* renamed from: t */
    void m975t(int i4) throws IllegalArgumentException {
        if (m949A()) {
            if (i4 == 0) {
                m952c();
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i4);
            }
            DisplayMetrics displayMetrics = this.f1188j.getResources().getDisplayMetrics();
            m950B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m959w()) {
                m963a();
            }
        }
    }

    /* renamed from: v */
    void m976v(int i4, float f4) {
        Context context = this.f1188j;
        m958u(TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
