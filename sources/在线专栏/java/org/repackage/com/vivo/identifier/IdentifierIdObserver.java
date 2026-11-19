package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes.dex */
public class IdentifierIdObserver extends ContentObserver {

    /* renamed from: a */
    private static final String f11537a = "VMS_IDLG_SDK_Observer";

    /* renamed from: b */
    private String f11538b;

    /* renamed from: c */
    private int f11539c;

    /* renamed from: d */
    private IdentifierIdClient f11540d;

    public IdentifierIdObserver(IdentifierIdClient identifierIdClient, int i4, String str) {
        super(null);
        this.f11540d = identifierIdClient;
        this.f11539c = i4;
        this.f11538b = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        IdentifierIdClient identifierIdClient = this.f11540d;
        if (identifierIdClient != null) {
            identifierIdClient.m10071a(this.f11539c, this.f11538b);
        } else {
            Log.e(f11537a, "mIdentifierIdClient is null");
        }
    }
}
