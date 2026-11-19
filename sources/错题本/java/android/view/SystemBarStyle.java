package android.view;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ToastUtils$MODE;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m5110d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILr6/c;)V", "isDark", "getScrim$activity_release", "(Z)I", "getScrim", "getScrimWithEnforcedContrast$activity_release", "getScrimWithEnforcedContrast", "I", "getDarkScrim$activity_release", "()I", "getNightMode$activity_release", "Lr6/c;", "getDetectDarkMode$activity_release", "()Lr6/c;", "Companion", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SystemBarStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int darkScrim;

    @NotNull
    private final InterfaceC6471c detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/SystemBarStyle;", "auto", "(IILr6/c;)Landroidx/activity/SystemBarStyle;", "scrim", ToastUtils$MODE.DARK, "(I)Landroidx/activity/SystemBarStyle;", ToastUtils$MODE.LIGHT, "(II)Landroidx/activity/SystemBarStyle;", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i8, InterfaceC6471c interfaceC6471c, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // p152r6.InterfaceC6471c
                    public final Boolean invoke(Resources resources) {
                        AbstractC5830k.m5330g(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i, i8, interfaceC6471c);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i8) {
            return auto$default(this, i, i8, null, 4, null);
        }

        @JvmStatic
        @NotNull
        public final SystemBarStyle dark(@ColorInt int scrim) {
            return new SystemBarStyle(scrim, scrim, 2, new InterfaceC6471c() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(Resources resources) {
                    AbstractC5830k.m5330g(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        @JvmStatic
        @NotNull
        public final SystemBarStyle light(@ColorInt int scrim, @ColorInt int darkScrim) {
            return new SystemBarStyle(scrim, darkScrim, 1, new InterfaceC6471c() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(Resources resources) {
                    AbstractC5830k.m5330g(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SystemBarStyle auto(@ColorInt int lightScrim, @ColorInt int darkScrim, @NotNull InterfaceC6471c detectDarkMode) {
            AbstractC5830k.m5330g(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(lightScrim, darkScrim, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i, int i8, int i9, InterfaceC6471c interfaceC6471c, AbstractC5824e abstractC5824e) {
        this(i, i8, i9, interfaceC6471c);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i8) {
        return INSTANCE.auto(i, i8);
    }

    @JvmStatic
    @NotNull
    public static final SystemBarStyle dark(@ColorInt int i) {
        return INSTANCE.dark(i);
    }

    @JvmStatic
    @NotNull
    public static final SystemBarStyle light(@ColorInt int i, @ColorInt int i8) {
        return INSTANCE.light(i, i8);
    }

    /* renamed from: getDarkScrim$activity_release, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    @NotNull
    /* renamed from: getDetectDarkMode$activity_release, reason: from getter */
    public final InterfaceC6471c getDetectDarkMode() {
        return this.detectDarkMode;
    }

    /* renamed from: getNightMode$activity_release, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i, int i8, int i9, InterfaceC6471c interfaceC6471c) {
        this.lightScrim = i;
        this.darkScrim = i8;
        this.nightMode = i9;
        this.detectDarkMode = interfaceC6471c;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i8, @NotNull InterfaceC6471c interfaceC6471c) {
        return INSTANCE.auto(i, i8, interfaceC6471c);
    }
}
