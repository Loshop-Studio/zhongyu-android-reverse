package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final InterfaceC10570l detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i10, int i11, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                interfaceC10570l = new InterfaceC10570l() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(Resources resources) {
                        AbstractC9133u.m16133g(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i10, i11, interfaceC10570l);
        }

        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
            return auto$default(this, i10, i11, null, 4, null);
        }

        public final SystemBarStyle dark(@ColorInt int i10) {
            return new SystemBarStyle(i10, i10, 2, new InterfaceC10570l() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(Resources resources) {
                    AbstractC9133u.m16133g(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        public final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
            return new SystemBarStyle(i10, i11, 1, new InterfaceC10570l() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(Resources resources) {
                    AbstractC9133u.m16133g(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }

        private Companion() {
        }

        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, InterfaceC10570l detectDarkMode) {
            AbstractC9133u.m16133g(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i10, i11, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i10, int i11, int i12, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(i10, i11, i12, interfaceC10570l);
    }

    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
        return Companion.auto(i10, i11);
    }

    public static final SystemBarStyle dark(@ColorInt int i10) {
        return Companion.dark(i10);
    }

    public static final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
        return Companion.light(i10, i11);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final InterfaceC10570l getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z10) {
        return z10 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z10) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z10 ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i10, int i11, int i12, InterfaceC10570l interfaceC10570l) {
        this.lightScrim = i10;
        this.darkScrim = i11;
        this.nightMode = i12;
        this.detectDarkMode = interfaceC10570l;
    }

    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, InterfaceC10570l interfaceC10570l) {
        return Companion.auto(i10, i11, interfaceC10570l);
    }
}
