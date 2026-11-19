package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes.dex */
public class TInputConnection extends InputConnectionWrapper {
    private BackspaceListener mBackspaceListener;

    public interface BackspaceListener {
        boolean onBackspace();
    }

    public TInputConnection(InputConnection inputConnection, boolean z3) {
        super(inputConnection, z3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i4, int i5) {
        BackspaceListener backspaceListener = this.mBackspaceListener;
        if (backspaceListener == null || !backspaceListener.onBackspace()) {
            return super.deleteSurroundingText(i4, i5);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        BackspaceListener backspaceListener;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (backspaceListener = this.mBackspaceListener) != null && backspaceListener.onBackspace()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }

    public void setBackspaceListener(BackspaceListener backspaceListener) {
        this.mBackspaceListener = backspaceListener;
    }
}
