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
public final class MyCourseDetailsFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C8048a f13246b = new C8048a(null);

    /* renamed from: c */
    public static final int f13247c = 8;

    /* renamed from: a */
    public final MyCourseEntity f13248a;

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragmentArgs$a */
    public static final class C8048a {
        public /* synthetic */ C8048a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MyCourseDetailsFragmentArgs m11544a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MyCourseDetailsFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("myCourse")) {
                throw new IllegalArgumentException("Required argument \"myCourse\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(MyCourseEntity.class) || Serializable.class.isAssignableFrom(MyCourseEntity.class)) {
                MyCourseEntity myCourseEntity = (MyCourseEntity) bundle.get("myCourse");
                if (myCourseEntity != null) {
                    return new MyCourseDetailsFragmentArgs(myCourseEntity);
                }
                throw new IllegalArgumentException("Argument \"myCourse\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(MyCourseEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public C8048a() {
        }
    }

    public MyCourseDetailsFragmentArgs(MyCourseEntity myCourse) {
        AbstractC9133u.m16133g(myCourse, "myCourse");
        this.f13248a = myCourse;
    }

    public static final MyCourseDetailsFragmentArgs fromBundle(Bundle bundle) {
        return f13246b.m11544a(bundle);
    }

    /* renamed from: a */
    public final MyCourseEntity m11543a() {
        return this.f13248a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyCourseDetailsFragmentArgs) && AbstractC9133u.m16128b(this.f13248a, ((MyCourseDetailsFragmentArgs) obj).f13248a);
    }

    public int hashCode() {
        return this.f13248a.hashCode();
    }

    public String toString() {
        return "MyCourseDetailsFragmentArgs(myCourse=" + this.f13248a + ")";
    }
}
