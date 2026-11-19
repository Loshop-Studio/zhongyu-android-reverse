package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.c */
/* loaded from: classes5.dex */
public abstract class AbstractC7660c {

    /* renamed from: com.zykj.view.board.board.c$a */
    public static final class a extends AbstractC7660c {

        /* renamed from: a */
        public final boolean f12217a;

        public a(boolean z9) {
            super(null);
            this.f12217a = z9;
        }

        /* renamed from: a */
        public final boolean m11386a() {
            return this.f12217a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12217a == ((a) obj).f12217a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f12217a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f12217a + ")";
        }
    }

    public /* synthetic */ AbstractC7660c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7660c() {
    }
}
