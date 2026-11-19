package p021b2;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import p032c2.InterfaceC5113h;

/* renamed from: b2.r */
/* loaded from: classes4.dex */
public class C4978r extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC5113h f2458b;

    /* renamed from: c */
    public int f2459c;

    public C4978r(Context context, int i10) {
        super(context);
        this.f2458b = InterfaceC5113h.f2672a;
        setGravity(17);
        setTextAlignment(4);
        m2458b(i10);
    }

    /* renamed from: b */
    public void m2458b(int i10) {
        this.f2459c = i10;
        setText(this.f2458b.format(i10));
    }

    /* renamed from: c */
    public void m2459c(InterfaceC5113h interfaceC5113h) {
        if (interfaceC5113h == null) {
            interfaceC5113h = InterfaceC5113h.f2672a;
        }
        this.f2458b = interfaceC5113h;
        m2458b(this.f2459c);
    }
}
