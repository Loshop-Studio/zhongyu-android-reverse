package p075i3;

import android.database.ContentObserver;
import android.util.Log;

/* renamed from: i3.c */
/* loaded from: classes2.dex */
public class C3785c extends ContentObserver {

    /* renamed from: a */
    public String f4534a;

    /* renamed from: b */
    public int f4535b;

    /* renamed from: c */
    public C3784b f4536c;

    public C3785c(C3784b c3784b, int i4, String str) {
        super(null);
        this.f4536c = c3784b;
        this.f4535b = i4;
        this.f4534a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        C3784b c3784b = this.f4536c;
        if (c3784b != null) {
            c3784b.m4935c(this.f4535b, this.f4534a);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
