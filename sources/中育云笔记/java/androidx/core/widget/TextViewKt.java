package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, InterfaceC9546r interfaceC9546r, InterfaceC9546r interfaceC9546r2, InterfaceC9540l interfaceC9540l) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(interfaceC9540l, interfaceC9546r, interfaceC9546r2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, InterfaceC9546r interfaceC9546r, InterfaceC9546r interfaceC9546r2, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9546r = new InterfaceC9546r() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.1
                public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke((CharSequence) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9546r2 = new InterfaceC9546r() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.2
                public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // p181hd.InterfaceC9546r
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke((CharSequence) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.3
                public final void invoke(Editable editable) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Editable) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(interfaceC9540l, interfaceC9546r, interfaceC9546r2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final InterfaceC9540l interfaceC9540l) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                interfaceC9540l.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final InterfaceC9546r interfaceC9546r) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                interfaceC9546r.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final InterfaceC9546r interfaceC9546r) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                interfaceC9546r.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
