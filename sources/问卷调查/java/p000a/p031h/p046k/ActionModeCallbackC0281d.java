package p000a.p031h.p046k;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* renamed from: a.h.k.d */
/* loaded from: classes.dex */
public class ActionModeCallbackC0281d implements ActionMode.Callback {

    /* renamed from: a */
    public final ActionMode.Callback f1697a;

    /* renamed from: b */
    public final TextView f1698b;

    /* renamed from: c */
    public Class<?> f1699c;

    /* renamed from: d */
    public Method f1700d;

    /* renamed from: e */
    public boolean f1701e;

    /* renamed from: f */
    public boolean f1702f = false;

    public ActionModeCallbackC0281d(ActionMode.Callback callback, TextView textView) {
        this.f1697a = callback;
        this.f1698b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f1697a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f1697a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f1697a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p046k.ActionModeCallbackC0281d.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
