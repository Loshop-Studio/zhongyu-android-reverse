package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.c */
/* loaded from: classes5.dex */
public abstract class AbstractC7540c {

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.c$a */
    public static final class a extends AbstractC7540c {

        /* renamed from: a */
        public final boolean f11260a;

        /* renamed from: b */
        public final Throwable f11261b;

        public /* synthetic */ a(boolean z9, Throwable th, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(z9, (i9 & 2) != 0 ? null : th);
        }

        /* renamed from: a */
        public final boolean m10507a() {
            return this.f11260a;
        }

        /* renamed from: b */
        public final Throwable m10508b() {
            return this.f11261b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11260a == aVar.f11260a && Intrinsics.areEqual(this.f11261b, aVar.f11261b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f11260a) * 31;
            Throwable th = this.f11261b;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "AddAnswerState(succeed=" + this.f11260a + ", throwable=" + this.f11261b + ")";
        }

        public a(boolean z9, Throwable th) {
            super(null);
            this.f11260a = z9;
            this.f11261b = th;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.c$b */
    public static final class b extends AbstractC7540c {

        /* renamed from: a */
        public final boolean f11262a;

        /* renamed from: b */
        public final Throwable f11263b;

        public /* synthetic */ b(boolean z9, Throwable th, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(z9, (i9 & 2) != 0 ? null : th);
        }

        /* renamed from: a */
        public final boolean m10509a() {
            return this.f11262a;
        }

        /* renamed from: b */
        public final Throwable m10510b() {
            return this.f11263b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11262a == bVar.f11262a && Intrinsics.areEqual(this.f11263b, bVar.f11263b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f11262a) * 31;
            Throwable th = this.f11263b;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "CreateSessionState(succeed=" + this.f11262a + ", throwable=" + this.f11263b + ")";
        }

        public b(boolean z9, Throwable th) {
            super(null);
            this.f11262a = z9;
            this.f11263b = th;
        }
    }

    public /* synthetic */ AbstractC7540c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7540c() {
    }
}
