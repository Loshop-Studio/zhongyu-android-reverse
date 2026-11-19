package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
class C0213g {
    /* renamed from: a */
    static InputConnection m812a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC0228n0) {
                    editorInfo.hintText = ((InterfaceC0228n0) parent).m979a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
