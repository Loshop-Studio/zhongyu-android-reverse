package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p015c.C1038a;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogC0101b extends DialogC0104e {

    /* renamed from: a */
    final AlertController f337a;

    /* renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* renamed from: P */
        private final AlertController.C0075f f338P;
        private final int mTheme;

        public a(Context context) {
            this(context, DialogC0101b.m270b(context, 0));
        }

        public DialogC0101b create() {
            DialogC0101b dialogC0101b = new DialogC0101b(this.f338P.f198a, this.mTheme);
            this.f338P.m157a(dialogC0101b.f337a);
            dialogC0101b.setCancelable(this.f338P.f215r);
            if (this.f338P.f215r) {
                dialogC0101b.setCanceledOnTouchOutside(true);
            }
            dialogC0101b.setOnCancelListener(this.f338P.f216s);
            dialogC0101b.setOnDismissListener(this.f338P.f217t);
            DialogInterface.OnKeyListener onKeyListener = this.f338P.f218u;
            if (onKeyListener != null) {
                dialogC0101b.setOnKeyListener(onKeyListener);
            }
            return dialogC0101b;
        }

        public Context getContext() {
            return this.f338P.f198a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f220w = listAdapter;
            c0075f.f221x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z3) {
            this.f338P.f215r = z3;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f191K = cursor;
            c0075f.f192L = str;
            c0075f.f221x = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f338P.f204g = view;
            return this;
        }

        public a setIcon(int i4) {
            this.f338P.f200c = i4;
            return this;
        }

        public a setIconAttribute(int i4) {
            TypedValue typedValue = new TypedValue();
            this.f338P.f198a.getTheme().resolveAttribute(i4, typedValue, true);
            this.f338P.f200c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z3) {
            this.f338P.f194N = z3;
            return this;
        }

        public a setItems(int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f219v = c0075f.f198a.getResources().getTextArray(i4);
            this.f338P.f221x = onClickListener;
            return this;
        }

        public a setMessage(int i4) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f205h = c0075f.f198a.getText(i4);
            return this;
        }

        public a setMultiChoiceItems(int i4, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f219v = c0075f.f198a.getResources().getTextArray(i4);
            AlertController.C0075f c0075f2 = this.f338P;
            c0075f2.f190J = onMultiChoiceClickListener;
            c0075f2.f186F = zArr;
            c0075f2.f187G = true;
            return this;
        }

        public a setNegativeButton(int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f209l = c0075f.f198a.getText(i4);
            this.f338P.f211n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f338P.f210m = drawable;
            return this;
        }

        public a setNeutralButton(int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f212o = c0075f.f198a.getText(i4);
            this.f338P.f214q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f338P.f213p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f338P.f216s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f338P.f217t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f338P.f195O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f338P.f218u = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f206i = c0075f.f198a.getText(i4);
            this.f338P.f208k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f338P.f207j = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z3) {
            this.f338P.f197Q = z3;
            return this;
        }

        public a setSingleChoiceItems(int i4, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f219v = c0075f.f198a.getResources().getTextArray(i4);
            AlertController.C0075f c0075f2 = this.f338P;
            c0075f2.f221x = onClickListener;
            c0075f2.f189I = i5;
            c0075f2.f188H = true;
            return this;
        }

        public a setTitle(int i4) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f203f = c0075f.f198a.getText(i4);
            return this;
        }

        public a setView(int i4) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f223z = null;
            c0075f.f222y = i4;
            c0075f.f185E = false;
            return this;
        }

        public DialogC0101b show() {
            DialogC0101b dialogC0101bCreate = create();
            dialogC0101bCreate.show();
            return dialogC0101bCreate;
        }

        public a(Context context, int i4) {
            this.f338P = new AlertController.C0075f(new ContextThemeWrapper(context, DialogC0101b.m270b(context, i4)));
            this.mTheme = i4;
        }

        public a setIcon(Drawable drawable) {
            this.f338P.f201d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f338P.f205h = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f338P.f203f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f219v = charSequenceArr;
            c0075f.f221x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f209l = charSequence;
            c0075f.f211n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f212o = charSequence;
            c0075f.f214q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f206i = charSequence;
            c0075f.f208k = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f223z = view;
            c0075f.f222y = 0;
            c0075f.f185E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f219v = charSequenceArr;
            c0075f.f190J = onMultiChoiceClickListener;
            c0075f.f186F = zArr;
            c0075f.f187G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i4, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f191K = cursor;
            c0075f.f221x = onClickListener;
            c0075f.f189I = i4;
            c0075f.f192L = str;
            c0075f.f188H = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i4, int i5, int i6, int i7) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f223z = view;
            c0075f.f222y = 0;
            c0075f.f185E = true;
            c0075f.f181A = i4;
            c0075f.f182B = i5;
            c0075f.f183C = i6;
            c0075f.f184D = i7;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f191K = cursor;
            c0075f.f190J = onMultiChoiceClickListener;
            c0075f.f193M = str;
            c0075f.f192L = str2;
            c0075f.f187G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f219v = charSequenceArr;
            c0075f.f221x = onClickListener;
            c0075f.f189I = i4;
            c0075f.f188H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0075f c0075f = this.f338P;
            c0075f.f220w = listAdapter;
            c0075f.f221x = onClickListener;
            c0075f.f189I = i4;
            c0075f.f188H = true;
            return this;
        }
    }

    protected DialogC0101b(Context context, int i4) {
        super(context, m270b(context, i4));
        this.f337a = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: b */
    static int m270b(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1038a.f5751o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView m271a() {
        return this.f337a.m141d();
    }

    @Override // androidx.appcompat.app.DialogC0104e, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f337a.m142e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f337a.m143g(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f337a.m144h(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0104e, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f337a.m150q(charSequence);
    }
}
