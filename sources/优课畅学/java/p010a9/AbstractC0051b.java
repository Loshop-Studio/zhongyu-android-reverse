package p010a9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import p010a9.C0050a;
import p323z8.AbstractC10732c;
import p323z8.InterfaceC10743n;

/* renamed from: a9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC0051b {
    /* renamed from: a */
    public boolean m158a(AbstractC10732c abstractC10732c, Canvas canvas, float f10, float f11, Paint paint, TextPaint textPaint) {
        C0055f c0055f;
        InterfaceC10743n interfaceC10743nM20046e = abstractC10732c.m20046e();
        if (interfaceC10743nM20046e == null || (c0055f = (C0055f) interfaceC10743nM20046e.get()) == null) {
            return false;
        }
        return c0055f.m203b(canvas, f10, f11, paint);
    }

    /* renamed from: b */
    public abstract void mo159b(AbstractC10732c abstractC10732c, Canvas canvas, float f10, float f11, boolean z10, C0050a.a aVar);

    /* renamed from: c */
    public abstract void mo160c(AbstractC10732c abstractC10732c, TextPaint textPaint, boolean z10);

    /* renamed from: e */
    public void m162e(AbstractC10732c abstractC10732c) {
    }

    /* renamed from: d */
    public void m161d(AbstractC10732c abstractC10732c, boolean z10) {
    }
}
