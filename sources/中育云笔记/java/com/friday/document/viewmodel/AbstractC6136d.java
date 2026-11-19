package com.friday.document.viewmodel;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.friday.document.viewmodel.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6136d {

    /* renamed from: com.friday.document.viewmodel.d$a */
    public static final class a extends AbstractC6136d {

        /* renamed from: a */
        public static final a f8440a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.friday.document.viewmodel.d$b */
    public static final class b extends AbstractC6136d {

        /* renamed from: a */
        public final List f8441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(null);
            AbstractC9979u.m20294g(list, "list");
            this.f8441a = list;
        }

        /* renamed from: a */
        public final List m6492a() {
            return this.f8441a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9979u.m20289b(this.f8441a, ((b) obj).f8441a);
        }

        public int hashCode() {
            return this.f8441a.hashCode();
        }

        public String toString() {
            return "Error(list=" + this.f8441a + ")";
        }
    }

    /* renamed from: com.friday.document.viewmodel.d$c */
    public static final class c extends AbstractC6136d {

        /* renamed from: a */
        public static final c f8442a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC6136d(AbstractC9972n abstractC9972n) {
        this();
    }

    public AbstractC6136d() {
    }
}
