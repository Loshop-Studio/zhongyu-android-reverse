package com.zykj.evaluation.upload;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.upload.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6954a {

    /* renamed from: a */
    public final int f10530a;

    /* renamed from: b */
    public final String f10531b;

    /* renamed from: com.zykj.evaluation.upload.a$a */
    public static final class a extends AbstractC6954a {

        /* renamed from: c */
        public static final a f10532c = new a();

        public a() {
            super(2, "log", null);
        }
    }

    /* renamed from: com.zykj.evaluation.upload.a$b */
    public static final class b extends AbstractC6954a {

        /* renamed from: c */
        public static final b f10533c = new b();

        public b() {
            super(3, "other", null);
        }
    }

    /* renamed from: com.zykj.evaluation.upload.a$c */
    public static final class c extends AbstractC6954a {

        /* renamed from: c */
        public static final c f10534c = new c();

        public c() {
            super(1, "res", null);
        }
    }

    public /* synthetic */ AbstractC6954a(int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str);
    }

    /* renamed from: a */
    public final String m10519a() {
        return this.f10531b;
    }

    /* renamed from: b */
    public final int m10520b() {
        return this.f10530a;
    }

    public AbstractC6954a(int i10, String str) {
        this.f10530a = i10;
        this.f10531b = str;
    }
}
