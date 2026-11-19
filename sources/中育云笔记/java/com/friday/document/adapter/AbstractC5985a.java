package com.friday.document.adapter;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.friday.document.adapter.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5985a {

    /* renamed from: a */
    public final String f6271a;

    /* renamed from: com.friday.document.adapter.a$a */
    public static final class a extends AbstractC5985a {

        /* renamed from: b */
        public static final a f6272b = new a();

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -521406733;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: com.friday.document.adapter.a$b */
    public static final class b extends AbstractC5985a {

        /* renamed from: b */
        public static final b f6273b = new b();

        public b() {
            super("删除", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 814646969;
        }

        public String toString() {
            return "Delete";
        }
    }

    /* renamed from: com.friday.document.adapter.a$c */
    public static final class c extends AbstractC5985a {

        /* renamed from: b */
        public static final c f6274b = new c();

        public c() {
            super("移动", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -387700641;
        }

        public String toString() {
            return "Move";
        }
    }

    /* renamed from: com.friday.document.adapter.a$d */
    public static final class d extends AbstractC5985a {

        /* renamed from: b */
        public static final d f6275b = new d();

        public d() {
            super("重命名", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1215510604;
        }

        public String toString() {
            return "Rename";
        }
    }

    /* renamed from: com.friday.document.adapter.a$e */
    public static final class e extends AbstractC5985a {

        /* renamed from: b */
        public static final e f6276b = new e();

        public e() {
            super("重试同步", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -871416577;
        }

        public String toString() {
            return "SyncRetry";
        }
    }

    /* renamed from: com.friday.document.adapter.a$f */
    public static final class f extends AbstractC5985a {

        /* renamed from: b */
        public static final f f6277b = new f();

        public f() {
            super("清理缓存", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1762533597;
        }

        public String toString() {
            return "clearCache";
        }
    }

    public /* synthetic */ AbstractC5985a(String str, AbstractC9972n abstractC9972n) {
        this(str);
    }

    /* renamed from: a */
    public final String m5512a() {
        return this.f6271a;
    }

    public AbstractC5985a(String str) {
        this.f6271a = str;
    }

    public /* synthetic */ AbstractC5985a(String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? "" : str, null);
    }
}
