package p000a.p031h.p043j.p045b0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000a.p005b.p014h.C0097o;
import p000a.p031h.p043j.p045b0.C0253e;

/* renamed from: a.h.j.b0.b */
/* loaded from: classes.dex */
public class C0250b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0252d f1584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250b(InputConnection inputConnection, boolean z, InterfaceC0252d interfaceC0252d) {
        super(inputConnection, z);
        this.f1584a = interfaceC0252d;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InterfaceC0252d interfaceC0252d = this.f1584a;
        C0253e c0253e = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0253e = new C0253e(new C0253e.a(inputContentInfo));
        }
        if (((C0097o) interfaceC0252d).m366a(c0253e, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
