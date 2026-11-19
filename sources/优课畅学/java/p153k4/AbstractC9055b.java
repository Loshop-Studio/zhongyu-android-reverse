package p153k4;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p165l4.C9248a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: k4.b */
/* loaded from: classes.dex */
public abstract class AbstractC9055b {
    /* renamed from: b */
    public static final void m15856b(SpannableStringBuilder spannableStringBuilder, int i10, String content, String spanContent, InterfaceC10559a onClick) {
        AbstractC9133u.m16133g(spannableStringBuilder, "<this>");
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(spanContent, "spanContent");
        AbstractC9133u.m16133g(onClick, "onClick");
        int iM13991f0 = AbstractC8661c0.m13991f0(content, spanContent, 0, false, 6, null);
        if (iM13991f0 < 0) {
            return;
        }
        spannableStringBuilder.setSpan(new C9248a(i10, onClick), iM13991f0, spanContent.length() + iM13991f0, 33);
    }

    /* renamed from: c */
    public static final void m15857c(TextView textView, int i10, float f10) {
        AbstractC9133u.m16133g(textView, "<this>");
        m15858d(textView, i10, f10, f10);
    }

    /* renamed from: d */
    public static final void m15858d(TextView textView, int i10, float f10, float f11) {
        AbstractC9133u.m16133g(textView, "<this>");
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i10);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) f10, (int) f11);
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: e */
    public static final void m15859e(View view, final InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: k4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC9055b.m15860f(lArr, interfaceC10570l, view2);
            }
        });
    }

    /* renamed from: f */
    public static final void m15860f(Long[] mHits, InterfaceC10570l interfaceC10570l, View it) {
        AbstractC9133u.m16133g(mHits, "$mHits");
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = Long.valueOf(SystemClock.uptimeMillis());
        if (mHits[0].longValue() >= SystemClock.uptimeMillis() - TbsListener.ErrorCode.INFO_CODE_MINIQB || interfaceC10570l == null) {
            return;
        }
        AbstractC9133u.m16132f(it, "it");
        interfaceC10570l.invoke(it);
    }
}
