package com.xuexiang.xui.widget.searchview;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.xuexiang.xui.widget.edittext.MultiLineEditText;
import com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText;
import p157s3.C6556c;

/* renamed from: com.xuexiang.xui.widget.searchview.e */
/* loaded from: classes3.dex */
public final class C4214e implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ int f4858a;

    /* renamed from: b */
    public final /* synthetic */ Object f4859b;

    public /* synthetic */ C4214e(Object obj, int i) {
        this.f4858a = i;
        this.f4859b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f4858a) {
            case 1:
                MultiLineEditText multiLineEditText = (MultiLineEditText) this.f4859b;
                int selectionStart = multiLineEditText.f4281a.getSelectionStart();
                int selectionEnd = multiLineEditText.f4281a.getSelectionEnd();
                multiLineEditText.f4281a.removeTextChangedListener(multiLineEditText.f4295o);
                if (multiLineEditText.f4286f) {
                    while (true) {
                        String string = editable.toString();
                        if ((string != null ? string.length() : 0) > multiLineEditText.f4283c) {
                            editable.delete(selectionStart - 1, selectionEnd);
                            selectionStart--;
                            selectionEnd--;
                        }
                    }
                } else {
                    while (MultiLineEditText.m3483a(editable.toString()) > multiLineEditText.f4283c) {
                        editable.delete(selectionStart - 1, selectionEnd);
                        selectionStart--;
                        selectionEnd--;
                    }
                }
                multiLineEditText.f4281a.setSelection(selectionStart);
                multiLineEditText.f4281a.addTextChangedListener(multiLineEditText.f4295o);
                multiLineEditText.m3484b();
                break;
            case 2:
                VerifyCodeEditText verifyCodeEditText = (VerifyCodeEditText) this.f4859b;
                String string2 = editable.toString();
                if (!TextUtils.isEmpty(string2)) {
                    String[] strArrSplit = string2.split("");
                    for (int i = 0; i < strArrSplit.length && i <= verifyCodeEditText.f4308c; i++) {
                        verifyCodeEditText.setText(strArrSplit[i]);
                        verifyCodeEditText.f4307b.setText("");
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        int i10 = this.f4858a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        switch (this.f4858a) {
            case 0:
                MaterialSearchView materialSearchView = (MaterialSearchView) this.f4859b;
                materialSearchView.f4842k = charSequence;
                ListAdapter listAdapter = materialSearchView.f4843l;
                if (listAdapter != null && (listAdapter instanceof Filterable)) {
                    ((Filterable) listAdapter).getFilter().filter(charSequence, materialSearchView);
                }
                Editable text = materialSearchView.f4837f.getText();
                materialSearchView.f4842k = text;
                if (TextUtils.isEmpty(text)) {
                    materialSearchView.f4840i.setVisibility(8);
                    materialSearchView.m3572g(true);
                } else {
                    materialSearchView.f4840i.setVisibility(0);
                    materialSearchView.m3572g(false);
                }
                charSequence.toString();
                break;
            case 1:
            case 2:
                break;
            default:
                ((C6556c) this.f4859b).m6197a();
                break;
        }
    }

    /* renamed from: a */
    private final void m3573a(Editable editable) {
    }

    /* renamed from: b */
    private final void m3574b(Editable editable) {
    }

    /* renamed from: c */
    private final void m3575c(CharSequence charSequence, int i, int i8, int i9) {
    }

    /* renamed from: d */
    private final void m3576d(CharSequence charSequence, int i, int i8, int i9) {
    }

    /* renamed from: e */
    private final void m3577e(CharSequence charSequence, int i, int i8, int i9) {
    }

    /* renamed from: f */
    private final void m3578f(CharSequence charSequence, int i, int i8, int i9) {
    }

    /* renamed from: g */
    private final void m3579g(CharSequence charSequence, int i, int i8, int i9) {
    }

    /* renamed from: h */
    private final void m3580h(CharSequence charSequence, int i, int i8, int i9) {
    }
}
