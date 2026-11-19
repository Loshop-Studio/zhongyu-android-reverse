package com.zykj.student.dialogue.p076ui.home;

import com.zykj.student.dialogue.bean.resp.QuestionResp;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.student.dialogue.ui.home.p */
/* loaded from: classes5.dex */
public abstract class AbstractC7636p {

    /* renamed from: com.zykj.student.dialogue.ui.home.p$a */
    public static final class a extends AbstractC7636p {

        /* renamed from: a */
        public final List f11880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List idList) {
            super(null);
            Intrinsics.checkNotNullParameter(idList, "idList");
            this.f11880a = idList;
        }

        /* renamed from: a */
        public final List m11034a() {
            return this.f11880a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f11880a, ((a) obj).f11880a);
        }

        public int hashCode() {
            return this.f11880a.hashCode();
        }

        public String toString() {
            return "BathRemove(idList=" + this.f11880a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.p$b */
    public static final class b extends AbstractC7636p {

        /* renamed from: a */
        public final QuestionResp f11881a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(QuestionResp questionResp) {
            super(null);
            Intrinsics.checkNotNullParameter(questionResp, "questionResp");
            this.f11881a = questionResp;
        }

        /* renamed from: a */
        public final QuestionResp m11035a() {
            return this.f11881a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f11881a, ((b) obj).f11881a);
        }

        public int hashCode() {
            return this.f11881a.hashCode();
        }

        public String toString() {
            return "EditRead(questionResp=" + this.f11881a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.p$c */
    public static final class c extends AbstractC7636p {

        /* renamed from: a */
        public final String f11882a;

        /* renamed from: b */
        public final int f11883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String itemId, int i9) {
            super(null);
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f11882a = itemId;
            this.f11883b = i9;
        }

        /* renamed from: a */
        public final String m11036a() {
            return this.f11882a;
        }

        /* renamed from: b */
        public final int m11037b() {
            return this.f11883b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f11882a, cVar.f11882a) && this.f11883b == cVar.f11883b;
        }

        public int hashCode() {
            return (this.f11882a.hashCode() * 31) + Integer.hashCode(this.f11883b);
        }

        public String toString() {
            return "UpdateUnderstoodState(itemId=" + this.f11882a + ", state=" + this.f11883b + ")";
        }
    }

    public /* synthetic */ AbstractC7636p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7636p() {
    }
}
