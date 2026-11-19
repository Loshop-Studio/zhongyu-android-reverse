package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.study.ui.home.my.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8101g {

    /* renamed from: a */
    public static final b f13549a = new b(null);

    /* renamed from: com.zykj.study.ui.home.my.g$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final int f13550a;

        /* renamed from: b */
        public final int f13551b;

        /* renamed from: c */
        public final int f13552c;

        /* renamed from: d */
        public final int f13553d = R$id.action_editCourseFragment_to_catalogDialog;

        public a(int i10, int i11, int i12) {
            this.f13550a = i10;
            this.f13551b = i11;
            this.f13552c = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13550a == aVar.f13550a && this.f13551b == aVar.f13551b && this.f13552c == aVar.f13552c;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13553d;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("periodId", this.f13550a);
            bundle.putInt("subjectId", this.f13551b);
            bundle.putInt("gradeId", this.f13552c);
            return bundle;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f13550a) * 31) + Integer.hashCode(this.f13551b)) * 31) + Integer.hashCode(this.f13552c);
        }

        public String toString() {
            return "ActionEditCourseFragmentToCatalogDialog(periodId=" + this.f13550a + ", subjectId=" + this.f13551b + ", gradeId=" + this.f13552c + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.g$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11798a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        public b() {
        }
    }
}
