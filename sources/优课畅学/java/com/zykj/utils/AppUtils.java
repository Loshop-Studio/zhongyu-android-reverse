package com.zykj.utils;

import android.content.Context;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public enum AppUtils {
    INSTANCE { // from class: com.zykj.utils.AppUtils.INSTANCE

        /* renamed from: c */
        public Context f14533c;

        @Override // com.zykj.utils.AppUtils
        /* renamed from: a */
        public Context mo12323a() {
            Context context = this.f14533c;
            if (context == null) {
                AbstractC9133u.m16151y("context");
            }
            return context;
        }

        @Override // com.zykj.utils.AppUtils
        /* renamed from: b */
        public void mo12324b(Context context) {
            AbstractC9133u.m16134h(context, "context");
            m12325c(context);
        }

        /* renamed from: c */
        public void m12325c(Context context) {
            AbstractC9133u.m16134h(context, "<set-?>");
            this.f14533c = context;
        }
    };

    /* renamed from: a */
    public abstract Context mo12323a();

    /* renamed from: b */
    public abstract void mo12324b(Context context);

    /* synthetic */ AppUtils(AbstractC9126n abstractC9126n) {
        this();
    }
}
