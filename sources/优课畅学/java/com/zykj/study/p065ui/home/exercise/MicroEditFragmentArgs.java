package com.zykj.study.p065ui.home.exercise;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class MicroEditFragmentArgs implements NavArgs {

    /* renamed from: d */
    public static final C7840a f12086d = new C7840a(null);

    /* renamed from: a */
    public final String f12087a;

    /* renamed from: b */
    public final int f12088b;

    /* renamed from: c */
    public final String f12089c;

    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragmentArgs$a */
    public static final class C7840a {
        public /* synthetic */ C7840a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final MicroEditFragmentArgs m10776a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(MicroEditFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("groupId")) {
                throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
            }
            int i10 = bundle.getInt("groupId");
            if (!bundle.containsKey("questionId")) {
                throw new IllegalArgumentException("Required argument \"questionId\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("questionId");
            if (string2 != null) {
                return new MicroEditFragmentArgs(string, i10, string2);
            }
            throw new IllegalArgumentException("Argument \"questionId\" is marked as non-null but was passed a null value.");
        }

        public C7840a() {
        }
    }

    public MicroEditFragmentArgs(String path, int i10, String questionId) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(questionId, "questionId");
        this.f12087a = path;
        this.f12088b = i10;
        this.f12089c = questionId;
    }

    public static final MicroEditFragmentArgs fromBundle(Bundle bundle) {
        return f12086d.m10776a(bundle);
    }

    /* renamed from: a */
    public final int m10773a() {
        return this.f12088b;
    }

    /* renamed from: b */
    public final String m10774b() {
        return this.f12087a;
    }

    /* renamed from: c */
    public final String m10775c() {
        return this.f12089c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroEditFragmentArgs)) {
            return false;
        }
        MicroEditFragmentArgs microEditFragmentArgs = (MicroEditFragmentArgs) obj;
        return AbstractC9133u.m16128b(this.f12087a, microEditFragmentArgs.f12087a) && this.f12088b == microEditFragmentArgs.f12088b && AbstractC9133u.m16128b(this.f12089c, microEditFragmentArgs.f12089c);
    }

    public int hashCode() {
        return (((this.f12087a.hashCode() * 31) + Integer.hashCode(this.f12088b)) * 31) + this.f12089c.hashCode();
    }

    public String toString() {
        return "MicroEditFragmentArgs(path=" + this.f12087a + ", groupId=" + this.f12088b + ", questionId=" + this.f12089c + ")";
    }
}
