package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0377k;
import p073d.C2443a;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: b */
    private static final int[] f835b = {R.attr.checkMark};

    /* renamed from: a */
    private final C0225m f836a;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0225m c0225m = this.f836a;
        if (c0225m != null) {
            c0225m.m924b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0213g.m812a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(C2443a.m8169d(getContext(), i4));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0377k.m2203q(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0225m c0225m = this.f836a;
        if (c0225m != null) {
            c0225m.m938q(context, i4);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0225m c0225m = new C0225m(this);
        this.f836a = c0225m;
        c0225m.m934m(attributeSet, i4);
        c0225m.m924b();
        C0214g0 c0214g0M815v = C0214g0.m815v(getContext(), attributeSet, f835b, i4, 0);
        setCheckMarkDrawable(c0214g0M815v.m822g(0));
        c0214g0M815v.m835w();
    }
}
