package com.taobao.sophix.p043b;

import android.annotation.SuppressLint;
import android.app.Application;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6383j;
import java.io.File;

/* renamed from: com.taobao.sophix.b.b */
/* loaded from: classes4.dex */
public class C6362b {

    /* renamed from: a */
    public static volatile int f4911a;

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f4912b;

    /* renamed from: c */
    public static File f4913c;

    /* renamed from: d */
    public static File f4914d;

    /* renamed from: e */
    public static File f4915e;

    /* renamed from: f */
    public static boolean f4916f;

    /* renamed from: g */
    public static PatchLoadStatusListener f4917g;

    /* renamed from: a */
    public static void m4618a(int i10) {
        f4911a = i10;
        C6383j.m4738b(f4912b, "hpatch_version", f4911a);
        C6378e.m4711c("GlobalProperty", "addPatch", "update patch version", Integer.valueOf(f4911a));
    }
}
