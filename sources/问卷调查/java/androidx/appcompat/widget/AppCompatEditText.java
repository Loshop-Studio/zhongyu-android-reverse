package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.C0013a;
import p000a.p005b.p014h.C0077e;
import p000a.p005b.p014h.C0097o;
import p000a.p005b.p014h.C0100p0;
import p000a.p005b.p014h.C0104r0;
import p000a.p005b.p014h.C0107t;
import p000a.p005b.p014h.C0109u;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.C0254c;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.InterfaceC0264m;
import p000a.p031h.p043j.p045b0.C0249a;
import p000a.p031h.p043j.p045b0.C0250b;
import p000a.p031h.p043j.p045b0.C0251c;
import p000a.p031h.p046k.C0282e;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0264m {
    private final C0077e mBackgroundTintHelper;
    private final C0282e mDefaultOnReceiveContentListener;
    private final C0107t mTextClassifierHelper;
    private final C0109u mTextHelper;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0077e c0077e = new C0077e(this);
        this.mBackgroundTintHelper = c0077e;
        c0077e.m303d(attributeSet, i);
        C0109u c0109u = new C0109u(this);
        this.mTextHelper = c0109u;
        c0109u.m402e(attributeSet, i);
        c0109u.m400b();
        this.mTextClassifierHelper = new C0107t(this);
        this.mDefaultOnReceiveContentListener = new C0282e();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.mTextHelper;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0107t c0107t;
        return (Build.VERSION.SDK_INT >= 28 || (c0107t = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : c0107t.m397a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection c0251c;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m404g(this, inputConnectionOnCreateInputConnection, editorInfo);
        C0013a.m12c(inputConnectionOnCreateInputConnection, editorInfo, this);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        String[] strArr = (String[]) getTag(C1088R.id.tag_on_receive_content_mime_types);
        if (inputConnectionOnCreateInputConnection == null || strArr == null) {
            return inputConnectionOnCreateInputConnection;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            editorInfo.contentMimeTypes = strArr;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        }
        C0097o c0097o = new C0097o(this);
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (i >= 25) {
            c0251c = new C0250b(inputConnectionOnCreateInputConnection, false, c0097o);
        } else {
            String[] strArr2 = C0249a.f1583a;
            if (i >= 25) {
                String[] strArr3 = editorInfo.contentMimeTypes;
                if (strArr3 != null) {
                    strArr2 = strArr3;
                }
            } else {
                Bundle bundle = editorInfo.extras;
                if (bundle != null) {
                    String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    if (stringArray == null) {
                        stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    }
                    if (stringArray != null) {
                        strArr2 = stringArray;
                    }
                }
            }
            if (strArr2.length == 0) {
                return inputConnectionOnCreateInputConnection;
            }
            c0251c = new C0251c(inputConnectionOnCreateInputConnection, false, c0097o);
        }
        return c0251c;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (((String[]) getTag(C1088R.id.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        C0266o.m871j(this, new C0254c(new C0254c.a(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // p000a.p031h.p043j.InterfaceC0264m
    public C0254c onReceiveContent(C0254c c0254c) {
        return this.mDefaultOnReceiveContentListener.mo859a(this, c0254c);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322 || i == 16908337) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (((String[]) getTag(C1088R.id.tag_on_receive_content_mime_types)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    C0254c.a aVar = new C0254c.a(primaryClip, 1);
                    aVar.f1598c = i != 16908322 ? 1 : 0;
                    C0266o.m871j(this, new C0254c(aVar));
                }
                i = 1;
            }
        }
        if (i != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0190e.m705R(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.mBackgroundTintHelper;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0109u c0109u = this.mTextHelper;
        if (c0109u != null) {
            c0109u.m403f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0107t c0107t;
        if (Build.VERSION.SDK_INT >= 28 || (c0107t = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0107t.f791b = textClassifier;
        }
    }
}
