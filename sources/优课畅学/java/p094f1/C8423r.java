package p094f1;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import p106g1.InterfaceC8522h;

/* renamed from: f1.r */
/* loaded from: classes4.dex */
public class C8423r extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC8522h f15992b;

    /* renamed from: c */
    public int f15993c;

    public C8423r(Context context, int i10) {
        super(context);
        this.f15992b = InterfaceC8522h.f16106a;
        setGravity(17);
        setTextAlignment(4);
        m13760b(i10);
    }

    /* renamed from: b */
    public void m13760b(int i10) {
        this.f15993c = i10;
        setText(this.f15992b.format(i10));
    }

    /* renamed from: c */
    public void m13761c(InterfaceC8522h interfaceC8522h) {
        if (interfaceC8522h == null) {
            interfaceC8522h = InterfaceC8522h.f16106a;
        }
        this.f15992b = interfaceC8522h;
        m13760b(this.f15993c);
    }
}
