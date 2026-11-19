package org.repackage.com.vivo.identifier;

import android.content.Context;

/* loaded from: classes5.dex */
public class DataBaseOperation {

    /* renamed from: a */
    private static final String f16037a = "VMS_IDLG_SDK_DB";

    /* renamed from: b */
    private static final String f16038b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c */
    private static final String f16039c = "value";

    /* renamed from: d */
    private static final String f16040d = "OAID";

    /* renamed from: e */
    private static final String f16041e = "AAID";

    /* renamed from: f */
    private static final String f16042f = "VAID";

    /* renamed from: g */
    private static final String f16043g = "OAIDSTATUS";

    /* renamed from: h */
    private static final int f16044h = 0;

    /* renamed from: i */
    private static final int f16045i = 1;

    /* renamed from: j */
    private static final int f16046j = 2;

    /* renamed from: k */
    private static final int f16047k = 4;

    /* renamed from: l */
    private Context f16048l;

    public DataBaseOperation(Context context) {
        this.f16048l = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m15107a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L42
            r1 = 1
            if (r8 == r1) goto L2c
            r1 = 2
            if (r8 == r1) goto L16
            r9 = 4
            if (r8 == r9) goto Le
            r2 = r0
            goto L49
        Le:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L14:
            r2 = r8
            goto L49
        L16:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L14
        L2c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L14
        L42:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L14
        L49:
            android.content.Context r8 = r7.f16048l
            android.content.ContentResolver r1 = r8.getContentResolver()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L6c
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L69
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r0 = r8.getString(r9)
        L69:
            r8.close()
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.vivo.identifier.DataBaseOperation.m15107a(int, java.lang.String):java.lang.String");
    }
}
