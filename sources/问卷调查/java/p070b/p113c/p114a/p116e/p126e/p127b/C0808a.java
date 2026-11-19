package p070b.p113c.p114a.p116e.p126e.p127b;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: b.c.a.e.e.b.a */
/* loaded from: classes.dex */
public class C0808a extends InputConnectionWrapper {

    /* renamed from: a */
    public a f4524a;

    /* renamed from: b.c.a.e.e.b.a$a */
    public interface a {
        /* renamed from: a */
        boolean m2509a();
    }

    public C0808a(InputConnection inputConnection, boolean z) {
        super(null, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a aVar = this.f4524a;
        if (aVar == null || !aVar.m2509a()) {
            return super.deleteSurroundingText(i, i2);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f4524a) != null && aVar.m2509a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
