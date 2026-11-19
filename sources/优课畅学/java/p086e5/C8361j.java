package p086e5;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e5.j */
/* loaded from: classes5.dex */
public final class C8361j implements TextWatcher {
    /* renamed from: a */
    public final boolean m13638a(String str) {
        Pattern patternCompile = Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[℀-㋿]|[0-\u007f][⃐-\u20ff]|[\u0080-ÿ]");
        AbstractC9133u.m16132f(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        AbstractC9133u.m16132f(matcher, "matcher(...)");
        return matcher.find();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        AbstractC9133u.m16133g(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(charSequence, "charSequence");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(charSequence, "charSequence");
        if (i12 - i11 >= 1) {
            int i13 = i11 + i10;
            int i14 = i10 + i12;
            if (m13638a(charSequence.subSequence(i13, i14).toString())) {
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.not_support_emoji);
                ((SpannableStringBuilder) charSequence).delete(i13, i14);
            }
        }
    }
}
