package com.xuexiang.xui.widget.searchview;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.xuexiang.xui.widget.searchview.d */
/* loaded from: classes3.dex */
public final class C4213d implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialSearchView f4857a;

    public C4213d(MaterialSearchView materialSearchView) {
        this.f4857a = materialSearchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i8 = MaterialSearchView.f4831t;
        MaterialSearchView materialSearchView = this.f4857a;
        Editable text = materialSearchView.f4837f.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return true;
        }
        materialSearchView.m3566a();
        materialSearchView.f4837f.setText((CharSequence) null);
        return true;
    }
}
