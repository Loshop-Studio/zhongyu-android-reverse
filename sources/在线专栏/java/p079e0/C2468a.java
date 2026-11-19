package p079e0;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import anet.channel.entity.EventType;
import p011b0.C1025h;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public final class C2468a {

    /* renamed from: a */
    private static final String[] f10067a = new String[0];

    /* renamed from: e0.a$a */
    private static class a {
        /* renamed from: a */
        static void m8234a(EditorInfo editorInfo, CharSequence charSequence, int i4) {
            editorInfo.setInitialSurroundingSubText(charSequence, i4);
        }
    }

    /* renamed from: a */
    public static String[] m8226a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f10067a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f10067a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f10067a;
    }

    /* renamed from: b */
    private static boolean m8227b(CharSequence charSequence, int i4, int i5) {
        if (i5 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i4));
        }
        if (i5 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i4));
    }

    /* renamed from: c */
    private static boolean m8228c(int i4) {
        int i5 = i4 & EventType.ALL;
        return i5 == 129 || i5 == 225 || i5 == 18;
    }

    /* renamed from: d */
    public static void m8229d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m8230e(EditorInfo editorInfo, CharSequence charSequence, int i4) {
        C1025h.m4782f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m8234a(editorInfo, charSequence, i4);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 - i4 : i5 - i4;
        int i8 = i5 > i6 ? i5 - i4 : i6 - i4;
        int length = charSequence.length();
        if (i4 < 0 || i7 < 0 || i8 > length) {
            m8232g(editorInfo, null, 0, 0);
            return;
        }
        if (m8228c(editorInfo.inputType)) {
            m8232g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m8232g(editorInfo, charSequence, i7, i8);
        } else {
            m8233h(editorInfo, charSequence, i7, i8);
        }
    }

    /* renamed from: f */
    public static void m8231f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m8234a(editorInfo, charSequence, 0);
        } else {
            m8230e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m8232g(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    /* renamed from: h */
    private static void m8233h(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        int i6 = i5 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i5, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (m8227b(charSequence, i9, 0)) {
            i9++;
            iMin2--;
        }
        if (m8227b(charSequence, (i5 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i5, iMin + i5)) : charSequence.subSequence(i9, iMin2 + i7 + iMin + i9);
        int i10 = iMin2 + 0;
        m8232g(editorInfo, charSequenceConcat, i10, i7 + i10);
    }
}
