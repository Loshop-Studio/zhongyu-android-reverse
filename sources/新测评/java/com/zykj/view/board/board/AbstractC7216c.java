package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.c */
/* loaded from: classes5.dex */
public abstract class AbstractC7216c {

    /* renamed from: com.zykj.view.board.board.c$a */
    public static final class a extends AbstractC7216c {

        /* renamed from: a */
        public final boolean f11015a;

        public a(boolean z9) {
            super(null);
            this.f11015a = z9;
        }

        /* renamed from: a */
        public final boolean m10967a() {
            return this.f11015a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11015a == ((a) obj).f11015a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11015a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f11015a + ")";
        }
    }

    public /* synthetic */ AbstractC7216c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7216c() {
    }
}
