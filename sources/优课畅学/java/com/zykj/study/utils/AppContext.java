package com.zykj.study.utils;

import android.content.Context;
import android.util.Log;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class AppContext {

    /* renamed from: a */
    public static final AppContext f13703a = new AppContext("INSTANCE", 0) { // from class: com.zykj.study.utils.AppContext.INSTANCE

        /* renamed from: d */
        public Context f13706d;

        {
            AbstractC9126n abstractC9126n = null;
        }

        @Override // com.zykj.study.utils.AppContext
        /* renamed from: b */
        public Context mo11860b() {
            Context context = this.f13706d;
            if (context != null) {
                return context;
            }
            AbstractC9133u.m16151y("context");
            return null;
        }

        @Override // com.zykj.study.utils.AppContext
        /* renamed from: c */
        public void mo11861c(Context context) {
            AbstractC9133u.m16133g(context, "context");
            Log.i("AppContext", "初始化成功");
            m11862d(context);
        }

        /* renamed from: d */
        public void m11862d(Context context) {
            AbstractC9133u.m16133g(context, "<set-?>");
            this.f13706d = context;
        }
    };

    /* renamed from: b */
    public static final /* synthetic */ AppContext[] f13704b;

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC9760a f13705c;

    static {
        AppContext[] appContextArrM11859a = m11859a();
        f13704b = appContextArrM11859a;
        f13705c = AbstractC9108a.m16085a(appContextArrM11859a);
    }

    public /* synthetic */ AppContext(String str, int i10, AbstractC9126n abstractC9126n) {
        this(str, i10);
    }

    /* renamed from: a */
    public static final /* synthetic */ AppContext[] m11859a() {
        return new AppContext[]{f13703a};
    }

    public static AppContext valueOf(String str) {
        return (AppContext) Enum.valueOf(AppContext.class, str);
    }

    public static AppContext[] values() {
        return (AppContext[]) f13704b.clone();
    }

    /* renamed from: b */
    public abstract Context mo11860b();

    /* renamed from: c */
    public abstract void mo11861c(Context context);

    public AppContext(String str, int i10) {
    }
}
