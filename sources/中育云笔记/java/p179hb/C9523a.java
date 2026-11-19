package p179hb;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: hb.a */
/* loaded from: classes6.dex */
public final class C9523a extends ClickableSpan {

    /* renamed from: c */
    public final int f22050c;

    /* renamed from: d */
    public final InterfaceC9529a f22051d;

    public C9523a(int i10, InterfaceC9529a onClick) {
        AbstractC9979u.m20294g(onClick, "onClick");
        this.f22050c = i10;
        this.f22051d = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View v10) {
        AbstractC9979u.m20294g(v10, "v");
        this.f22051d.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        AbstractC9979u.m20294g(paint, "paint");
        paint.setColor(this.f22050c);
        paint.setUnderlineText(false);
    }
}
