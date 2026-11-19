package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes5.dex */
public class IdentifierIdObserver extends ContentObserver {

    /* renamed from: a */
    private static final String f16078a = "VMS_IDLG_SDK_Observer";

    /* renamed from: b */
    private String f16079b;

    /* renamed from: c */
    private int f16080c;

    /* renamed from: d */
    private IdentifierIdClient f16081d;

    public IdentifierIdObserver(IdentifierIdClient identifierIdClient, int i9, String str) {
        super(null);
        this.f16081d = identifierIdClient;
        this.f16080c = i9;
        this.f16079b = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z9) {
        IdentifierIdClient identifierIdClient = this.f16081d;
        if (identifierIdClient != null) {
            identifierIdClient.m15118a(this.f16080c, this.f16079b);
        } else {
            Log.e(f16078a, "mIdentifierIdClient is null");
        }
    }
}
