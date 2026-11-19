package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final InterfaceC9540l detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i10, int i11, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // p181hd.InterfaceC9540l
                    public final Boolean invoke(Resources resources) {
                        AbstractC9979u.m20294g(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i10, i11, interfaceC9540l);
        }

        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
            return auto$default(this, i10, i11, null, 4, null);
        }

        public final SystemBarStyle dark(@ColorInt int i10) {
            return new SystemBarStyle(i10, i10, 2, new InterfaceC9540l() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(Resources resources) {
                    AbstractC9979u.m20294g(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        public final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
            return new SystemBarStyle(i10, i11, 1, new InterfaceC9540l() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(Resources resources) {
                    AbstractC9979u.m20294g(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }

        private Companion() {
        }

        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, InterfaceC9540l detectDarkMode) {
            AbstractC9979u.m20294g(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i10, i11, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i10, int i11, int i12, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(i10, i11, i12, interfaceC9540l);
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

    public final InterfaceC9540l getDetectDarkMode$activity_release() {
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

    private SystemBarStyle(int i10, int i11, int i12, InterfaceC9540l interfaceC9540l) {
        this.lightScrim = i10;
        this.darkScrim = i11;
        this.nightMode = i12;
        this.detectDarkMode = interfaceC9540l;
    }

    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, InterfaceC9540l interfaceC9540l) {
        return Companion.auto(i10, i11, interfaceC9540l);
    }
}
