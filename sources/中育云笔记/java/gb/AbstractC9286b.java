package gb;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.AbstractC9979u;
import p179hb.C9523a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p310qd.AbstractC10793c0;

/* renamed from: gb.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9286b {
    /* renamed from: b */
    public static final void m18306b(SpannableStringBuilder spannableStringBuilder, int i10, String content, String spanContent, InterfaceC9529a onClick) {
        AbstractC9979u.m20294g(spannableStringBuilder, "<this>");
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(spanContent, "spanContent");
        AbstractC9979u.m20294g(onClick, "onClick");
        int iM23130f0 = AbstractC10793c0.m23130f0(content, spanContent, 0, false, 6, null);
        if (iM23130f0 < 0) {
            return;
        }
        spannableStringBuilder.setSpan(new C9523a(i10, onClick), iM23130f0, spanContent.length() + iM23130f0, 33);
    }

    /* renamed from: c */
    public static final void m18307c(TextView textView, int i10, float f10) {
        AbstractC9979u.m20294g(textView, "<this>");
        m18308d(textView, i10, f10, f10);
    }

    /* renamed from: d */
    public static final void m18308d(TextView textView, int i10, float f10, float f11) {
        AbstractC9979u.m20294g(textView, "<this>");
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i10);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) f10, (int) f11);
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: e */
    public static final void m18309e(View view, final InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: gb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC9286b.m18310f(lArr, interfaceC9540l, view2);
            }
        });
    }

    /* renamed from: f */
    public static final void m18310f(Long[] mHits, InterfaceC9540l interfaceC9540l, View it) {
        AbstractC9979u.m20294g(mHits, "$mHits");
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = Long.valueOf(SystemClock.uptimeMillis());
        if (mHits[0].longValue() >= SystemClock.uptimeMillis() - 500 || interfaceC9540l == null) {
            return;
        }
        AbstractC9979u.m20293f(it, "it");
        interfaceC9540l.invoke(it);
    }
}
