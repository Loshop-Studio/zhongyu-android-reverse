package p000a.p005b.p012g.p013i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p000a.p005b.p006c.DialogInterfaceC0018d;
import p000a.p005b.p012g.p013i.C0052e;
import p000a.p005b.p012g.p013i.InterfaceC0060m;

/* renamed from: a.b.g.i.h */
/* loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0055h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0060m.a {

    /* renamed from: b */
    public C0054g f457b;

    /* renamed from: c */
    public DialogInterfaceC0018d f458c;

    /* renamed from: d */
    public C0052e f459d;

    public DialogInterfaceOnKeyListenerC0055h(C0054g c0054g) {
        this.f457b = c0054g;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
    /* renamed from: c */
    public void mo82c(C0054g c0054g, boolean z) {
        DialogInterfaceC0018d dialogInterfaceC0018d;
        if ((z || c0054g == this.f457b) && (dialogInterfaceC0018d = this.f458c) != null) {
            dialogInterfaceC0018d.dismiss();
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
    /* renamed from: d */
    public boolean mo83d(C0054g c0054g) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f457b.m213r(((C0052e.a) this.f459d.m190a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C0052e c0052e = this.f459d;
        C0054g c0054g = this.f457b;
        InterfaceC0060m.a aVar = c0052e.f422f;
        if (aVar != null) {
            aVar.mo82c(c0054g, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f458c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f458c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f457b.m198c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f457b.performShortcut(i, keyEvent, 0);
    }
}
