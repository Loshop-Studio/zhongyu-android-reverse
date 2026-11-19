package p010a9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.HashMap;
import java.util.Map;
import p010a9.C0050a;
import p323z8.AbstractC10732c;

/* renamed from: a9.h */
/* loaded from: classes5.dex */
public class C0057h extends AbstractC0051b {

    /* renamed from: a */
    public static final Map f194a = new HashMap();

    @Override // p010a9.AbstractC0051b
    /* renamed from: b */
    public void mo159b(AbstractC10732c abstractC10732c, Canvas canvas, float f10, float f11, boolean z10, C0050a.a aVar) {
        float f12;
        float f13;
        float f14;
        int i10 = abstractC10732c.f21306m;
        float f15 = f10 + i10;
        float f16 = f11 + i10;
        if (abstractC10732c.f21305l != 0) {
            f15 += 4.0f;
            f16 += 4.0f;
        }
        float f17 = f16;
        float f18 = f15;
        aVar.m152e(z10);
        TextPaint textPaintM154g = aVar.m154g(abstractC10732c, z10);
        m212f(abstractC10732c, canvas, f10, f11);
        String[] strArr = abstractC10732c.f21297d;
        if (strArr == null) {
            if (aVar.m157j(abstractC10732c)) {
                aVar.m150c(abstractC10732c, textPaintM154g, true);
                float fAscent = f17 - textPaintM154g.ascent();
                if (aVar.f144s) {
                    float f19 = aVar.f136k + f18;
                    fAscent += aVar.f137l;
                    f12 = f19;
                } else {
                    f12 = f18;
                }
                m213g(abstractC10732c, null, canvas, f12, fAscent, textPaintM154g);
            }
            aVar.m150c(abstractC10732c, textPaintM154g, false);
            m214h(abstractC10732c, null, canvas, f18, f17 - textPaintM154g.ascent(), textPaintM154g, z10);
        } else if (strArr.length == 1) {
            if (aVar.m157j(abstractC10732c)) {
                aVar.m150c(abstractC10732c, textPaintM154g, true);
                float fAscent2 = f17 - textPaintM154g.ascent();
                if (aVar.f144s) {
                    float f20 = aVar.f136k + f18;
                    fAscent2 += aVar.f137l;
                    f14 = f20;
                } else {
                    f14 = f18;
                }
                m213g(abstractC10732c, strArr[0], canvas, f14, fAscent2, textPaintM154g);
            }
            aVar.m150c(abstractC10732c, textPaintM154g, false);
            m214h(abstractC10732c, strArr[0], canvas, f18, f17 - textPaintM154g.ascent(), textPaintM154g, z10);
        } else {
            float length = (abstractC10732c.f21309p - (abstractC10732c.f21306m * 2)) / strArr.length;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                if (str != null && str.length() != 0) {
                    if (aVar.m157j(abstractC10732c)) {
                        aVar.m150c(abstractC10732c, textPaintM154g, true);
                        float fAscent3 = ((i11 * length) + f17) - textPaintM154g.ascent();
                        if (aVar.f144s) {
                            float f21 = aVar.f136k + f18;
                            fAscent3 += aVar.f137l;
                            f13 = f21;
                        } else {
                            f13 = f18;
                        }
                        m213g(abstractC10732c, strArr[i11], canvas, f13, fAscent3, textPaintM154g);
                    }
                    aVar.m150c(abstractC10732c, textPaintM154g, false);
                    m214h(abstractC10732c, strArr[i11], canvas, f18, ((i11 * length) + f17) - textPaintM154g.ascent(), textPaintM154g, z10);
                }
            }
        }
        if (abstractC10732c.f21303j != 0) {
            Paint paintM156i = aVar.m156i(abstractC10732c);
            float f22 = (f11 + abstractC10732c.f21309p) - aVar.f133h;
            canvas.drawLine(f10, f22, f10 + abstractC10732c.f21308o, f22, paintM156i);
        }
        if (abstractC10732c.f21305l != 0) {
            canvas.drawRect(f10, f11, f10 + abstractC10732c.f21308o, f11 + abstractC10732c.f21309p, aVar.m153f(abstractC10732c));
        }
    }

    @Override // p010a9.AbstractC0051b
    /* renamed from: c */
    public void mo160c(AbstractC10732c abstractC10732c, TextPaint textPaint, boolean z10) {
        float fMax = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (abstractC10732c.f21297d == null) {
            CharSequence charSequence = abstractC10732c.f21296c;
            if (charSequence != null) {
                fMax = textPaint.measureText(charSequence.toString());
                fValueOf = m215i(abstractC10732c, textPaint);
            }
            abstractC10732c.f21308o = fMax;
            abstractC10732c.f21309p = fValueOf.floatValue();
            return;
        }
        Float fM215i = m215i(abstractC10732c, textPaint);
        for (String str : abstractC10732c.f21297d) {
            if (str.length() > 0) {
                fMax = Math.max(textPaint.measureText(str), fMax);
            }
        }
        abstractC10732c.f21308o = fMax;
        abstractC10732c.f21309p = abstractC10732c.f21297d.length * fM215i.floatValue();
    }

    /* renamed from: g */
    public void m213g(AbstractC10732c abstractC10732c, String str, Canvas canvas, float f10, float f11, Paint paint) {
        if (str != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            canvas.drawText(abstractC10732c.f21296c.toString(), f10, f11, paint);
        }
    }

    /* renamed from: h */
    public void m214h(AbstractC10732c abstractC10732c, String str, Canvas canvas, float f10, float f11, TextPaint textPaint, boolean z10) {
        if (str != null) {
            canvas.drawText(str, f10, f11, textPaint);
        } else {
            canvas.drawText(abstractC10732c.f21296c.toString(), f10, f11, textPaint);
        }
    }

    /* renamed from: i */
    public Float m215i(AbstractC10732c abstractC10732c, Paint paint) {
        Float fValueOf = Float.valueOf(paint.getTextSize());
        Map map = f194a;
        Float f10 = (Float) map.get(fValueOf);
        if (f10 != null) {
            return f10;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Float fValueOf2 = Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
        map.put(fValueOf, fValueOf2);
        return fValueOf2;
    }

    /* renamed from: f */
    public void m212f(AbstractC10732c abstractC10732c, Canvas canvas, float f10, float f11) {
    }
}
