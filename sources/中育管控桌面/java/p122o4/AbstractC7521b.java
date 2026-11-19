package p122o4;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p129p4.C7598a;

/* renamed from: o4.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7521b {
    /* renamed from: b */
    public static final void m8678b(SpannableStringBuilder spannableStringBuilder, int i6, String content, String spanContent, Function0 onClick) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(spanContent, "spanContent");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) content, spanContent, 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            return;
        }
        spannableStringBuilder.setSpan(new C7598a(i6, onClick), iIndexOf$default, spanContent.length() + iIndexOf$default, 33);
    }

    /* renamed from: c */
    public static final void m8679c(TextView textView, int i6, float f6) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        m8680d(textView, i6, f6, f6);
    }

    /* renamed from: d */
    public static final void m8680d(TextView textView, int i6, float f6, float f7) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i6);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) f6, (int) f7);
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: e */
    public static final void m8681e(View view, final Function1 function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: o4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC7521b.m8682f(lArr, function1, view2);
            }
        });
    }

    /* renamed from: f */
    public static final void m8682f(Long[] mHits, Function1 function1, View it) {
        Intrinsics.checkNotNullParameter(mHits, "$mHits");
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = Long.valueOf(SystemClock.uptimeMillis());
        if (mHits[0].longValue() >= SystemClock.uptimeMillis() - 500 || function1 == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        function1.invoke(it);
    }
}
