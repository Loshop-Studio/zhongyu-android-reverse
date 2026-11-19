package p001a0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p011b0.C1020c;

/* renamed from: a0.b */
/* loaded from: classes.dex */
public class C0003b implements Spannable {

    /* renamed from: d */
    private static final Object f19d = new Object();

    /* renamed from: a */
    private final Spannable f20a;

    /* renamed from: b */
    private final a f21b;

    /* renamed from: c */
    private final PrecomputedText f22c;

    /* renamed from: a */
    public a m29a() {
        return this.f21b;
    }

    /* renamed from: b */
    public PrecomputedText m30b() {
        Spannable spannable = this.f20a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f20a.charAt(i4);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f20a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f20a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f20a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i4, int i5, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f22c.getSpans(i4, i5, cls) : (T[]) this.f20a.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f20a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f20a.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f22c.removeSpan(obj);
        } else {
            this.f20a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f22c.setSpan(obj, i4, i5, i6);
        } else {
            this.f20a.setSpan(obj, i4, i5, i6);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f20a.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f20a.toString();
    }

    /* renamed from: a0.b$a */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f23a;

        /* renamed from: b */
        private final TextDirectionHeuristic f24b;

        /* renamed from: c */
        private final int f25c;

        /* renamed from: d */
        private final int f26d;

        /* renamed from: e */
        final PrecomputedText.Params f27e;

        /* renamed from: a0.b$a$a, reason: collision with other inner class name */
        public static class C3516a {

            /* renamed from: a */
            private final TextPaint f28a;

            /* renamed from: b */
            private TextDirectionHeuristic f29b;

            /* renamed from: c */
            private int f30c;

            /* renamed from: d */
            private int f31d;

            public C3516a(TextPaint textPaint) {
                this.f28a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f30c = 1;
                    this.f31d = 1;
                } else {
                    this.f31d = 0;
                    this.f30c = 0;
                }
                this.f29b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: a */
            public a m36a() {
                return new a(this.f28a, this.f29b, this.f30c, this.f31d);
            }

            /* renamed from: b */
            public C3516a m37b(int i4) {
                this.f30c = i4;
                return this;
            }

            /* renamed from: c */
            public C3516a m38c(int i4) {
                this.f31d = i4;
                return this;
            }

            /* renamed from: d */
            public C3516a m39d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f29b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f27e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i4).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f27e = null;
            }
            this.f23a = textPaint;
            this.f24b = textDirectionHeuristic;
            this.f25c = i4;
            this.f26d = i5;
        }

        /* renamed from: a */
        public boolean m31a(a aVar) {
            int i4 = Build.VERSION.SDK_INT;
            if ((i4 >= 23 && (this.f25c != aVar.m32b() || this.f26d != aVar.m33c())) || this.f23a.getTextSize() != aVar.m35e().getTextSize() || this.f23a.getTextScaleX() != aVar.m35e().getTextScaleX() || this.f23a.getTextSkewX() != aVar.m35e().getTextSkewX() || this.f23a.getLetterSpacing() != aVar.m35e().getLetterSpacing() || !TextUtils.equals(this.f23a.getFontFeatureSettings(), aVar.m35e().getFontFeatureSettings()) || this.f23a.getFlags() != aVar.m35e().getFlags()) {
                return false;
            }
            if (i4 >= 24) {
                if (!this.f23a.getTextLocales().equals(aVar.m35e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f23a.getTextLocale().equals(aVar.m35e().getTextLocale())) {
                return false;
            }
            return this.f23a.getTypeface() == null ? aVar.m35e().getTypeface() == null : this.f23a.getTypeface().equals(aVar.m35e().getTypeface());
        }

        /* renamed from: b */
        public int m32b() {
            return this.f25c;
        }

        /* renamed from: c */
        public int m33c() {
            return this.f26d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m34d() {
            return this.f24b;
        }

        /* renamed from: e */
        public TextPaint m35e() {
            return this.f23a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m31a(aVar) && this.f24b == aVar.m34d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? C1020c.m4774b(Float.valueOf(this.f23a.getTextSize()), Float.valueOf(this.f23a.getTextScaleX()), Float.valueOf(this.f23a.getTextSkewX()), Float.valueOf(this.f23a.getLetterSpacing()), Integer.valueOf(this.f23a.getFlags()), this.f23a.getTextLocales(), this.f23a.getTypeface(), Boolean.valueOf(this.f23a.isElegantTextHeight()), this.f24b, Integer.valueOf(this.f25c), Integer.valueOf(this.f26d)) : C1020c.m4774b(Float.valueOf(this.f23a.getTextSize()), Float.valueOf(this.f23a.getTextScaleX()), Float.valueOf(this.f23a.getTextSkewX()), Float.valueOf(this.f23a.getLetterSpacing()), Integer.valueOf(this.f23a.getFlags()), this.f23a.getTextLocale(), this.f23a.getTypeface(), Boolean.valueOf(this.f23a.isElegantTextHeight()), this.f24b, Integer.valueOf(this.f25c), Integer.valueOf(this.f26d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f23a.getTextSize());
            sb.append(", textScaleX=" + this.f23a.getTextScaleX());
            sb.append(", textSkewX=" + this.f23a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f23a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f23a.isElegantTextHeight());
            if (i4 >= 24) {
                sb.append(", textLocale=" + this.f23a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f23a.getTextLocale());
            }
            sb.append(", typeface=" + this.f23a.getTypeface());
            if (i4 >= 26) {
                sb.append(", variationSettings=" + this.f23a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f24b);
            sb.append(", breakStrategy=" + this.f25c);
            sb.append(", hyphenationFrequency=" + this.f26d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f23a = params.getTextPaint();
            this.f24b = params.getTextDirection();
            this.f25c = params.getBreakStrategy();
            this.f26d = params.getHyphenationFrequency();
            this.f27e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
