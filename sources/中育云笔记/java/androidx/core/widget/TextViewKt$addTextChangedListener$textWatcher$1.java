package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;

/* loaded from: classes2.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ InterfaceC9540l $afterTextChanged;
    final /* synthetic */ InterfaceC9546r $beforeTextChanged;
    final /* synthetic */ InterfaceC9546r $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r, InterfaceC9546r interfaceC9546r2) {
        this.$afterTextChanged = interfaceC9540l;
        this.$beforeTextChanged = interfaceC9546r;
        this.$onTextChanged = interfaceC9546r2;
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
