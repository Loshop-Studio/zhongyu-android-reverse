package com.zykj.study.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ShowBigImageDialogArgs implements NavArgs {

    /* renamed from: b */
    public static final C7724a f11216b = new C7724a(null);

    /* renamed from: a */
    public final String f11217a;

    /* renamed from: com.zykj.study.dialog.ShowBigImageDialogArgs$a */
    public static final class C7724a {
        public /* synthetic */ C7724a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ShowBigImageDialogArgs m10286a(Bundle bundle) {
            AbstractC9133u.m16133g(bundle, "bundle");
            bundle.setClassLoader(ShowBigImageDialogArgs.class.getClassLoader());
            if (!bundle.containsKey(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
            if (string != null) {
                return new ShowBigImageDialogArgs(string);
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }

        public C7724a() {
        }
    }

    public ShowBigImageDialogArgs(String url) {
        AbstractC9133u.m16133g(url, "url");
        this.f11217a = url;
    }

    public static final ShowBigImageDialogArgs fromBundle(Bundle bundle) {
        return f11216b.m10286a(bundle);
    }

    /* renamed from: a */
    public final String m10285a() {
        return this.f11217a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowBigImageDialogArgs) && AbstractC9133u.m16128b(this.f11217a, ((ShowBigImageDialogArgs) obj).f11217a);
    }

    public int hashCode() {
        return this.f11217a.hashCode();
    }

    public String toString() {
        return "ShowBigImageDialogArgs(url=" + this.f11217a + ")";
    }
}
