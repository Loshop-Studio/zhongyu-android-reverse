package p129p4;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p4.a */
/* loaded from: classes4.dex */
public final class C7598a extends ClickableSpan {

    /* renamed from: a */
    public final int f10054a;

    /* renamed from: b */
    public final Function0 f10055b;

    public C7598a(int i6, Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f10054a = i6;
        this.f10055b = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        this.f10055b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setColor(this.f10054a);
        paint.setUnderlineText(false);
    }
}
