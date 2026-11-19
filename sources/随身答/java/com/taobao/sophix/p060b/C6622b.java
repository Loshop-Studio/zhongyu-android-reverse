package com.taobao.sophix.p060b;

import android.annotation.SuppressLint;
import android.app.Application;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6643j;
import java.io.File;

/* renamed from: com.taobao.sophix.b.b */
/* loaded from: classes4.dex */
public class C6622b {

    /* renamed from: a */
    public static volatile int f5488a;

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f5489b;

    /* renamed from: c */
    public static File f5490c;

    /* renamed from: d */
    public static File f5491d;

    /* renamed from: e */
    public static File f5492e;

    /* renamed from: f */
    public static boolean f5493f;

    /* renamed from: g */
    public static PatchLoadStatusListener f5494g;

    /* renamed from: a */
    public static void m4797a(int i9) {
        f5488a = i9;
        C6643j.m4917b(f5489b, "hpatch_version", f5488a);
        C6638e.m4890c("GlobalProperty", "addPatch", "update patch version", Integer.valueOf(f5488a));
    }
}
