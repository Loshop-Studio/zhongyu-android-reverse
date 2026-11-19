package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.zykj.study.data.MyCourseEntity;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class EditCourseFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C8006a f12966b = new C8006a(null);

    /* renamed from: c */
    public static final int f12967c = 8;

    /* renamed from: a */
    public final MyCourseEntity f12968a;

    /* renamed from: com.zykj.study.ui.home.my.EditCourseFragmentArgs$a */
    public static final class C8006a {
        public /* synthetic */ C8006a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final EditCourseFragmentArgs m11343a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(EditCourseFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("myCourseEntity")) {
                throw new IllegalArgumentException("Required argument \"myCourseEntity\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(MyCourseEntity.class) || Serializable.class.isAssignableFrom(MyCourseEntity.class)) {
                return new EditCourseFragmentArgs((MyCourseEntity) bundle.get("myCourseEntity"));
            }
            throw new UnsupportedOperationException(MyCourseEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C8006a() {
        }
    }

    public EditCourseFragmentArgs(MyCourseEntity myCourseEntity) {
        this.f12968a = myCourseEntity;
    }

    public static final EditCourseFragmentArgs fromBundle(Bundle bundle) {
        return f12966b.m11343a(bundle);
    }

    /* renamed from: a */
    public final MyCourseEntity m11342a() {
        return this.f12968a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditCourseFragmentArgs) && AbstractC9133u.m16128b(this.f12968a, ((EditCourseFragmentArgs) obj).f12968a);
    }

    public int hashCode() {
        MyCourseEntity myCourseEntity = this.f12968a;
        if (myCourseEntity == null) {
            return 0;
        }
        return myCourseEntity.hashCode();
    }

    public String toString() {
        return "EditCourseFragmentArgs(myCourseEntity=" + this.f12968a + ")";
    }
}
