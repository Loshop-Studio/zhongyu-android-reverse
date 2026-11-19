package com.zykj.huiwei.launcher.p035ui.fragment;

import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.zykj.manage.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.huiwei.launcher.ui.fragment.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6160a {

    /* renamed from: a */
    public static final a f6806a = new a(null);

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m5983a() {
            return new ActionOnlyNavDirections(R.id.action_loginFragment_to_mainFragment);
        }

        public a() {
        }
    }
}
