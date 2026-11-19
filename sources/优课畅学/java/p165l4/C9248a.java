package p165l4;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C9248a extends ClickableSpan {

    /* renamed from: a */
    public final int f18238a;

    /* renamed from: b */
    public final InterfaceC10559a f18239b;

    public C9248a(int i10, InterfaceC10559a onClick) {
        AbstractC9133u.m16133g(onClick, "onClick");
        this.f18238a = i10;
        this.f18239b = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View v10) {
        AbstractC9133u.m16133g(v10, "v");
        this.f18239b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        AbstractC9133u.m16133g(paint, "paint");
        paint.setColor(this.f18238a);
        paint.setUnderlineText(false);
    }
}
