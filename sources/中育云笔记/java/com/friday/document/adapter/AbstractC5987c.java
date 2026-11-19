package com.friday.document.adapter;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.friday.document.adapter.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5987c {

    /* renamed from: a */
    public final String f6282a;

    /* renamed from: com.friday.document.adapter.c$a */
    public static final class a extends AbstractC5987c {

        /* renamed from: b */
        public static final a f6283b = new a();

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: com.friday.document.adapter.c$b */
    public static final class b extends AbstractC5987c {

        /* renamed from: b */
        public static final b f6284b = new b();

        public b() {
            super("彻底删除", null);
        }
    }

    /* renamed from: com.friday.document.adapter.c$c */
    public static final class c extends AbstractC5987c {

        /* renamed from: b */
        public static final c f6285b = new c();

        public c() {
            super("恢复", null);
        }
    }

    public /* synthetic */ AbstractC5987c(String str, AbstractC9972n abstractC9972n) {
        this(str);
    }

    /* renamed from: a */
    public final String m5513a() {
        return this.f6282a;
    }

    public AbstractC5987c(String str) {
        this.f6282a = str;
    }

    public /* synthetic */ AbstractC5987c(String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? "" : str, null);
    }
}
