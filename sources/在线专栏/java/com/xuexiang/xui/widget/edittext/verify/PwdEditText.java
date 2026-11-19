package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.TInputConnection;

/* loaded from: classes.dex */
public class PwdEditText extends AppCompatEditText {
    private TInputConnection mInputConnection;

    public PwdEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.mInputConnection = new TInputConnection(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.mInputConnection.setTarget(super.onCreateInputConnection(editorInfo));
        return this.mInputConnection;
    }

    public void setBackSpaceListener(TInputConnection.BackspaceListener backspaceListener) {
        this.mInputConnection.setBackspaceListener(backspaceListener);
    }

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PwdEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
