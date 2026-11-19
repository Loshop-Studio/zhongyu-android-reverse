package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0339c;
import androidx.core.view.InterfaceC0354q;

/* renamed from: androidx.core.widget.l */
/* loaded from: classes.dex */
public final class C0378l implements InterfaceC0354q {

    /* renamed from: androidx.core.widget.l$a */
    private static final class a {
        /* renamed from: a */
        static CharSequence m2212a(Context context, ClipData.Item item, int i4) {
            if ((i4 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    /* renamed from: b */
    private static CharSequence m2210b(Context context, ClipData.Item item, int i4) {
        return a.m2212a(context, item, i4);
    }

    /* renamed from: c */
    private static void m2211c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC0354q
    /* renamed from: a */
    public C0339c mo1973a(View view, C0339c c0339c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0339c);
        }
        if (c0339c.m1855d() == 2) {
            return c0339c;
        }
        ClipData clipDataM1853b = c0339c.m1853b();
        int iM1854c = c0339c.m1854c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i4 = 0; i4 < clipDataM1853b.getItemCount(); i4++) {
            CharSequence charSequenceM2210b = m2210b(context, clipDataM1853b.getItemAt(i4), iM1854c);
            if (charSequenceM2210b != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM2210b);
                } else {
                    m2211c(editable, charSequenceM2210b);
                    z3 = true;
                }
            }
        }
        return null;
    }
}
