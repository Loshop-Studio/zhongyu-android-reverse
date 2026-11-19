package p000a.p031h.p041h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.h.b */
/* loaded from: classes.dex */
public class C0235b implements Spannable {

    /* renamed from: a.h.h.b$a */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f1540a;

        /* renamed from: b */
        public final TextDirectionHeuristic f1541b;

        /* renamed from: c */
        public final int f1542c;

        /* renamed from: d */
        public final int f1543d;

        public a(PrecomputedText.Params params) {
            this.f1540a = params.getTextPaint();
            this.f1541b = params.getTextDirection();
            this.f1542c = params.getBreakStrategy();
            this.f1543d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f1540a = textPaint;
            this.f1541b = textDirectionHeuristic;
            this.f1542c = i;
            this.f1543d = i2;
        }

        /* renamed from: a */
        public boolean m801a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if (this.f1542c != aVar.f1542c || this.f1543d != aVar.f1543d || this.f1540a.getTextSize() != aVar.f1540a.getTextSize() || this.f1540a.getTextScaleX() != aVar.f1540a.getTextScaleX() || this.f1540a.getTextSkewX() != aVar.f1540a.getTextSkewX() || this.f1540a.getLetterSpacing() != aVar.f1540a.getLetterSpacing() || !TextUtils.equals(this.f1540a.getFontFeatureSettings(), aVar.f1540a.getFontFeatureSettings()) || this.f1540a.getFlags() != aVar.f1540a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f1540a.getTextLocales().equals(aVar.f1540a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f1540a.getTextLocale().equals(aVar.f1540a.getTextLocale())) {
                return false;
            }
            return this.f1540a.getTypeface() == null ? aVar.f1540a.getTypeface() == null : this.f1540a.getTypeface().equals(aVar.f1540a.getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m801a(aVar) && this.f1541b == aVar.f1541b;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? Objects.hash(Float.valueOf(this.f1540a.getTextSize()), Float.valueOf(this.f1540a.getTextScaleX()), Float.valueOf(this.f1540a.getTextSkewX()), Float.valueOf(this.f1540a.getLetterSpacing()), Integer.valueOf(this.f1540a.getFlags()), this.f1540a.getTextLocales(), this.f1540a.getTypeface(), Boolean.valueOf(this.f1540a.isElegantTextHeight()), this.f1541b, Integer.valueOf(this.f1542c), Integer.valueOf(this.f1543d)) : Objects.hash(Float.valueOf(this.f1540a.getTextSize()), Float.valueOf(this.f1540a.getTextScaleX()), Float.valueOf(this.f1540a.getTextSkewX()), Float.valueOf(this.f1540a.getLetterSpacing()), Integer.valueOf(this.f1540a.getFlags()), this.f1540a.getTextLocale(), this.f1540a.getTypeface(), Boolean.valueOf(this.f1540a.isElegantTextHeight()), this.f1541b, Integer.valueOf(this.f1542c), Integer.valueOf(this.f1543d));
        }

        public String toString() {
            StringBuilder sbM2079g;
            Object textLocale;
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sbM2079g2 = C0561a.m2079g("textSize=");
            sbM2079g2.append(this.f1540a.getTextSize());
            sb.append(sbM2079g2.toString());
            sb.append(", textScaleX=" + this.f1540a.getTextScaleX());
            sb.append(", textSkewX=" + this.f1540a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder sbM2079g3 = C0561a.m2079g(", letterSpacing=");
            sbM2079g3.append(this.f1540a.getLetterSpacing());
            sb.append(sbM2079g3.toString());
            sb.append(", elegantTextHeight=" + this.f1540a.isElegantTextHeight());
            if (i >= 24) {
                sbM2079g = C0561a.m2079g(", textLocale=");
                textLocale = this.f1540a.getTextLocales();
            } else {
                sbM2079g = C0561a.m2079g(", textLocale=");
                textLocale = this.f1540a.getTextLocale();
            }
            sbM2079g.append(textLocale);
            sb.append(sbM2079g.toString());
            StringBuilder sbM2079g4 = C0561a.m2079g(", typeface=");
            sbM2079g4.append(this.f1540a.getTypeface());
            sb.append(sbM2079g4.toString());
            if (i >= 26) {
                StringBuilder sbM2079g5 = C0561a.m2079g(", variationSettings=");
                sbM2079g5.append(this.f1540a.getFontVariationSettings());
                sb.append(sbM2079g5.toString());
            }
            StringBuilder sbM2079g6 = C0561a.m2079g(", textDir=");
            sbM2079g6.append(this.f1541b);
            sb.append(sbM2079g6.toString());
            sb.append(", breakStrategy=" + this.f1542c);
            sb.append(", hyphenationFrequency=" + this.f1543d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
