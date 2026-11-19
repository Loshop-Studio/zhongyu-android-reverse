package com.zykj.student.dialogue.p076ui.collect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.student.dialogue.ui.collect.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7494b {

    /* renamed from: com.zykj.student.dialogue.ui.collect.b$a */
    public static final class a extends AbstractC7494b {

        /* renamed from: a */
        public final String f10827a;

        /* renamed from: b */
        public final boolean f10828b;

        /* renamed from: c */
        public final String f10829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id, boolean z9, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.f10827a = id;
            this.f10828b = z9;
            this.f10829c = str;
        }

        /* renamed from: a */
        public final String m10186a() {
            return this.f10827a;
        }

        /* renamed from: b */
        public final boolean m10187b() {
            return this.f10828b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f10827a, aVar.f10827a) && this.f10828b == aVar.f10828b && Intrinsics.areEqual(this.f10829c, aVar.f10829c);
        }

        public int hashCode() {
            int iHashCode = ((this.f10827a.hashCode() * 31) + Boolean.hashCode(this.f10828b)) * 31;
            String str = this.f10829c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CollectState(id=" + this.f10827a + ", isCollected=" + this.f10828b + ", updateCollectTime=" + this.f10829c + ")";
        }
    }

    public /* synthetic */ AbstractC7494b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7494b() {
    }
}
