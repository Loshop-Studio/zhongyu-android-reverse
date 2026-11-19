package com.tencent.smtt.export.external.interfaces;

import android.net.http.SslCertificate;

/* loaded from: classes4.dex */
public interface SslError {
    boolean addError(int i10);

    SslCertificate getCertificate();

    int getPrimaryError();

    boolean hasError(int i10);
}
