package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10576r;

/* loaded from: classes2.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ InterfaceC10570l $afterTextChanged;
    final /* synthetic */ InterfaceC10576r $beforeTextChanged;
    final /* synthetic */ InterfaceC10576r $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r, InterfaceC10576r interfaceC10576r2) {
        this.$afterTextChanged = interfaceC10570l;
        this.$beforeTextChanged = interfaceC10576r;
        this.$onTextChanged = interfaceC10576r2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }
}
