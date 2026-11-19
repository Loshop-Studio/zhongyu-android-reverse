package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0339c;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0355r;
import androidx.core.widget.C0377k;
import androidx.core.widget.C0378l;
import p015c.C1038a;
import p079e0.C2468a;
import p079e0.C2469b;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0355r {
    private final C0207d mBackgroundTintHelper;
    private final C0378l mDefaultOnReceiveContentListener;
    private final C0223l mTextClassifierHelper;
    private final C0225m mTextHelper;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m770b();
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m924b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m771c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m772d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0223l c0223l;
        return (Build.VERSION.SDK_INT >= 28 || (c0223l = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : c0223l.m912a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m939r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM812a = C0213g.m812a(inputConnectionOnCreateInputConnection, editorInfo, this);
        String[] strArrM1984D = C0358u.m1984D(this);
        if (inputConnectionM812a == null || strArrM1984D == null) {
            return inputConnectionM812a;
        }
        C2468a.m8229d(editorInfo, strArrM1984D);
        return C2469b.m8235a(inputConnectionM812a, editorInfo, C0219j.m887a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0219j.m888b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.InterfaceC0355r
    public C0339c onReceiveContent(C0339c c0339c) {
        return this.mDefaultOnReceiveContentListener.mo1973a(this, c0339c);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i4) {
        if (C0219j.m889c(this, i4)) {
            return true;
        }
        return super.onTextContextMenuItem(i4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m774f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m775g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0377k.m2203q(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m777i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m778j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m938q(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0223l c0223l;
        if (Build.VERSION.SDK_INT >= 28 || (c0223l = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0223l.m913b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5723B);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0207d c0207d = new C0207d(this);
        this.mBackgroundTintHelper = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0225m c0225m = new C0225m(this);
        this.mTextHelper = c0225m;
        c0225m.m934m(attributeSet, i4);
        c0225m.m924b();
        this.mTextClassifierHelper = new C0223l(this);
        this.mDefaultOnReceiveContentListener = new C0378l();
    }
}
