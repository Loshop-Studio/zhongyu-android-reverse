package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0101b;
import androidx.appcompat.view.menu.InterfaceC0131m;
import com.p071ut.device.AidConstants;
import p015c.C1044g;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0126h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0131m.a {

    /* renamed from: a */
    private C0125g f611a;

    /* renamed from: b */
    private DialogC0101b f612b;

    /* renamed from: c */
    C0123e f613c;

    /* renamed from: d */
    private InterfaceC0131m.a f614d;

    public DialogInterfaceOnKeyListenerC0126h(C0125g c0125g) {
        this.f611a = c0125g;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
    /* renamed from: a */
    public boolean mo252a(C0125g c0125g) {
        InterfaceC0131m.a aVar = this.f614d;
        if (aVar != null) {
            return aVar.mo252a(c0125g);
        }
        return false;
    }

    /* renamed from: b */
    public void m474b() {
        DialogC0101b dialogC0101b = this.f612b;
        if (dialogC0101b != null) {
            dialogC0101b.dismiss();
        }
    }

    /* renamed from: c */
    public void m475c(IBinder iBinder) {
        C0125g c0125g = this.f611a;
        DialogC0101b.a aVar = new DialogC0101b.a(c0125g.getContext());
        C0123e c0123e = new C0123e(aVar.getContext(), C1044g.f5891l);
        this.f613c = c0123e;
        c0123e.setCallback(this);
        this.f611a.addMenuPresenter(this.f613c);
        aVar.setAdapter(this.f613c.m464a(), this);
        View headerView = c0125g.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(c0125g.getHeaderIcon()).setTitle(c0125g.getHeaderTitle());
        }
        aVar.setOnKeyListener(this);
        DialogC0101b dialogC0101bCreate = aVar.create();
        this.f612b = dialogC0101bCreate;
        dialogC0101bCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f612b.getWindow().getAttributes();
        attributes.type = AidConstants.EVENT_NETWORK_ERROR;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f612b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f611a.performItemAction((C0127i) this.f613c.m464a().getItem(i4), 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        if (z3 || c0125g == this.f611a) {
            m474b();
        }
        InterfaceC0131m.a aVar = this.f614d;
        if (aVar != null) {
            aVar.onCloseMenu(c0125g, z3);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f613c.onCloseMenu(this.f611a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f612b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f612b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f611a.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f611a.performShortcut(i4, keyEvent, 0);
    }
}
