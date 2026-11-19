package p173m1;

import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC6875e;

/* renamed from: m1.a */
/* loaded from: classes4.dex */
public class C9293a {

    /* renamed from: a */
    public CharSequence f18315a;

    /* renamed from: b */
    public Drawable f18316b;

    public C9293a(CharSequence charSequence) {
        this.f18315a = charSequence;
    }

    /* renamed from: a */
    public Drawable m17096a() {
        return this.f18316b;
    }

    /* renamed from: b */
    public CharSequence m17097b() {
        return this.f18315a;
    }

    public String toString() {
        return this.f18315a.toString();
    }

    public C9293a(CharSequence charSequence, Drawable drawable) {
        this.f18315a = charSequence;
        this.f18316b = drawable;
    }

    public C9293a(CharSequence charSequence, int i10) {
        this(charSequence, AbstractC6875e.m6451g(i10));
    }
}
