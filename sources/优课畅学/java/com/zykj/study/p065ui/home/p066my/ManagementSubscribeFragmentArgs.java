package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ManagementSubscribeFragmentArgs implements NavArgs {

    /* renamed from: b */
    public static final C8033a f13191b = new C8033a(null);

    /* renamed from: a */
    public final int f13192a;

    /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragmentArgs$a */
    public static final class C8033a {
        public /* synthetic */ C8033a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ManagementSubscribeFragmentArgs m11460a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ManagementSubscribeFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("courseId")) {
                return new ManagementSubscribeFragmentArgs(bundle.getInt("courseId"));
            }
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }

        public C8033a() {
        }
    }

    public ManagementSubscribeFragmentArgs(int i10) {
        this.f13192a = i10;
    }

    public static final ManagementSubscribeFragmentArgs fromBundle(Bundle bundle) {
        return f13191b.m11460a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ManagementSubscribeFragmentArgs) && this.f13192a == ((ManagementSubscribeFragmentArgs) obj).f13192a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13192a);
    }

    public String toString() {
        return "ManagementSubscribeFragmentArgs(courseId=" + this.f13192a + ")";
    }
}
