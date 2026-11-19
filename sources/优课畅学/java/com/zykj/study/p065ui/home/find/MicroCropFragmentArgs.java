package com.zykj.study.p065ui.home.find;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class MicroCropFragmentArgs implements NavArgs {

    /* renamed from: c */
    public static final C7950a f12662c = new C7950a(null);

    /* renamed from: a */
    public final String f12663a;

    /* renamed from: b */
    public final String f12664b;

    /* renamed from: com.zykj.study.ui.home.find.MicroCropFragmentArgs$a */
    public static final class C7950a {
        public /* synthetic */ C7950a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MicroCropFragmentArgs m11123a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MicroCropFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("requestKey")) {
                throw new IllegalArgumentException("Required argument \"requestKey\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("requestKey");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"requestKey\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("localPath")) {
                throw new IllegalArgumentException("Required argument \"localPath\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("localPath");
            if (string2 != null) {
                return new MicroCropFragmentArgs(string, string2);
            }
            throw new IllegalArgumentException("Argument \"localPath\" is marked as non-null but was passed a null value.");
        }

        public C7950a() {
        }
    }

    public MicroCropFragmentArgs(String requestKey, String localPath) {
        AbstractC9133u.m16133g(requestKey, "requestKey");
        AbstractC9133u.m16133g(localPath, "localPath");
        this.f12663a = requestKey;
        this.f12664b = localPath;
    }

    public static final MicroCropFragmentArgs fromBundle(Bundle bundle) {
        return f12662c.m11123a(bundle);
    }

    /* renamed from: a */
    public final String m11121a() {
        return this.f12664b;
    }

    /* renamed from: b */
    public final String m11122b() {
        return this.f12663a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroCropFragmentArgs)) {
            return false;
        }
        MicroCropFragmentArgs microCropFragmentArgs = (MicroCropFragmentArgs) obj;
        return AbstractC9133u.m16128b(this.f12663a, microCropFragmentArgs.f12663a) && AbstractC9133u.m16128b(this.f12664b, microCropFragmentArgs.f12664b);
    }

    public int hashCode() {
        return (this.f12663a.hashCode() * 31) + this.f12664b.hashCode();
    }

    public String toString() {
        return "MicroCropFragmentArgs(requestKey=" + this.f12663a + ", localPath=" + this.f12664b + ")";
    }
}
