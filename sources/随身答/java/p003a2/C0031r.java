package p003a2;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import p020b2.InterfaceC5106h;

/* renamed from: a2.r */
/* loaded from: classes4.dex */
public class C0031r extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC5106h f108b;

    /* renamed from: c */
    public int f109c;

    public C0031r(Context context, int i9) {
        super(context);
        this.f108b = InterfaceC5106h.f2213a;
        setGravity(17);
        setTextAlignment(4);
        m169b(i9);
    }

    /* renamed from: b */
    public void m169b(int i9) {
        this.f109c = i9;
        setText(this.f108b.format(i9));
    }

    /* renamed from: c */
    public void m170c(InterfaceC5106h interfaceC5106h) {
        if (interfaceC5106h == null) {
            interfaceC5106h = InterfaceC5106h.f2213a;
        }
        this.f108b = interfaceC5106h;
        m169b(this.f109c);
    }
}
