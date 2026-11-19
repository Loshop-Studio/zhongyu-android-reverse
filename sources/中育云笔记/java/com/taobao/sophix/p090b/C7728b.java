package com.taobao.sophix.p090b;

import android.annotation.SuppressLint;
import android.app.Application;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7749j;
import java.io.File;

/* renamed from: com.taobao.sophix.b.b */
/* loaded from: classes5.dex */
public class C7728b {

    /* renamed from: a */
    public static volatile int f13353a;

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f13354b;

    /* renamed from: c */
    public static File f13355c;

    /* renamed from: d */
    public static File f13356d;

    /* renamed from: e */
    public static File f13357e;

    /* renamed from: f */
    public static boolean f13358f;

    /* renamed from: g */
    public static PatchLoadStatusListener f13359g;

    /* renamed from: a */
    public static void m10309a(int i10) {
        f13353a = i10;
        C7749j.m10429b(f13354b, "hpatch_version", f13353a);
        C7744e.m10402c("GlobalProperty", "addPatch", "update patch version", Integer.valueOf(f13353a));
    }
}
