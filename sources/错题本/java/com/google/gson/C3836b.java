package com.google.gson;

import com.alibaba.sdk.android.oss.signer.SignParameters;

/* renamed from: com.google.gson.b */
/* loaded from: classes2.dex */
public final class C3836b {

    /* renamed from: d */
    public static final C3836b f2972d = new C3836b("", "", false);

    /* renamed from: e */
    public static final C3836b f2973e = new C3836b(SignParameters.NEW_LINE, "  ", true);

    /* renamed from: a */
    public final String f2974a;

    /* renamed from: b */
    public final String f2975b;

    /* renamed from: c */
    public final boolean f2976c;

    public C3836b(String str, String str2, boolean z8) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f2974a = str;
        this.f2975b = str2;
        this.f2976c = z8;
    }
}
