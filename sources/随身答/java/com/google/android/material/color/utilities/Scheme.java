package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public static Scheme dark(int i9) {
        return darkFromCorePalette(CorePalette.m4243of(i9));
    }

    public static Scheme darkContent(int i9) {
        return darkFromCorePalette(CorePalette.contentOf(i9));
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f4901a1.tone(80)).withOnPrimary(corePalette.f4901a1.tone(20)).withPrimaryContainer(corePalette.f4901a1.tone(30)).withOnPrimaryContainer(corePalette.f4901a1.tone(90)).withSecondary(corePalette.f4902a2.tone(80)).withOnSecondary(corePalette.f4902a2.tone(20)).withSecondaryContainer(corePalette.f4902a2.tone(30)).withOnSecondaryContainer(corePalette.f4902a2.tone(90)).withTertiary(corePalette.f4903a3.tone(80)).withOnTertiary(corePalette.f4903a3.tone(20)).withTertiaryContainer(corePalette.f4903a3.tone(30)).withOnTertiaryContainer(corePalette.f4903a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f4904n1.tone(10)).withOnBackground(corePalette.f4904n1.tone(90)).withSurface(corePalette.f4904n1.tone(10)).withOnSurface(corePalette.f4904n1.tone(90)).withSurfaceVariant(corePalette.f4905n2.tone(30)).withOnSurfaceVariant(corePalette.f4905n2.tone(80)).withOutline(corePalette.f4905n2.tone(60)).withOutlineVariant(corePalette.f4905n2.tone(30)).withShadow(corePalette.f4904n1.tone(0)).withScrim(corePalette.f4904n1.tone(0)).withInverseSurface(corePalette.f4904n1.tone(90)).withInverseOnSurface(corePalette.f4904n1.tone(20)).withInversePrimary(corePalette.f4901a1.tone(40));
    }

    public static Scheme light(int i9) {
        return lightFromCorePalette(CorePalette.m4243of(i9));
    }

    public static Scheme lightContent(int i9) {
        return lightFromCorePalette(CorePalette.contentOf(i9));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f4901a1.tone(40)).withOnPrimary(corePalette.f4901a1.tone(100)).withPrimaryContainer(corePalette.f4901a1.tone(90)).withOnPrimaryContainer(corePalette.f4901a1.tone(10)).withSecondary(corePalette.f4902a2.tone(40)).withOnSecondary(corePalette.f4902a2.tone(100)).withSecondaryContainer(corePalette.f4902a2.tone(90)).withOnSecondaryContainer(corePalette.f4902a2.tone(10)).withTertiary(corePalette.f4903a3.tone(40)).withOnTertiary(corePalette.f4903a3.tone(100)).withTertiaryContainer(corePalette.f4903a3.tone(90)).withOnTertiaryContainer(corePalette.f4903a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f4904n1.tone(99)).withOnBackground(corePalette.f4904n1.tone(10)).withSurface(corePalette.f4904n1.tone(99)).withOnSurface(corePalette.f4904n1.tone(10)).withSurfaceVariant(corePalette.f4905n2.tone(90)).withOnSurfaceVariant(corePalette.f4905n2.tone(30)).withOutline(corePalette.f4905n2.tone(50)).withOutlineVariant(corePalette.f4905n2.tone(80)).withShadow(corePalette.f4904n1.tone(0)).withScrim(corePalette.f4904n1.tone(0)).withInverseSurface(corePalette.f4904n1.tone(20)).withInverseOnSurface(corePalette.f4904n1.tone(95)).withInversePrimary(corePalette.f4901a1.tone(80));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        return this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.primary) * 31) + this.onPrimary) * 31) + this.primaryContainer) * 31) + this.onPrimaryContainer) * 31) + this.secondary) * 31) + this.onSecondary) * 31) + this.secondaryContainer) * 31) + this.onSecondaryContainer) * 31) + this.tertiary) * 31) + this.onTertiary) * 31) + this.tertiaryContainer) * 31) + this.onTertiaryContainer) * 31) + this.error) * 31) + this.onError) * 31) + this.errorContainer) * 31) + this.onErrorContainer) * 31) + this.background) * 31) + this.onBackground) * 31) + this.surface) * 31) + this.onSurface) * 31) + this.surfaceVariant) * 31) + this.onSurfaceVariant) * 31) + this.outline) * 31) + this.outlineVariant) * 31) + this.shadow) * 31) + this.scrim) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }

    public void setBackground(int i9) {
        this.background = i9;
    }

    public void setError(int i9) {
        this.error = i9;
    }

    public void setErrorContainer(int i9) {
        this.errorContainer = i9;
    }

    public void setInverseOnSurface(int i9) {
        this.inverseOnSurface = i9;
    }

    public void setInversePrimary(int i9) {
        this.inversePrimary = i9;
    }

    public void setInverseSurface(int i9) {
        this.inverseSurface = i9;
    }

    public void setOnBackground(int i9) {
        this.onBackground = i9;
    }

    public void setOnError(int i9) {
        this.onError = i9;
    }

    public void setOnErrorContainer(int i9) {
        this.onErrorContainer = i9;
    }

    public void setOnPrimary(int i9) {
        this.onPrimary = i9;
    }

    public void setOnPrimaryContainer(int i9) {
        this.onPrimaryContainer = i9;
    }

    public void setOnSecondary(int i9) {
        this.onSecondary = i9;
    }

    public void setOnSecondaryContainer(int i9) {
        this.onSecondaryContainer = i9;
    }

    public void setOnSurface(int i9) {
        this.onSurface = i9;
    }

    public void setOnSurfaceVariant(int i9) {
        this.onSurfaceVariant = i9;
    }

    public void setOnTertiary(int i9) {
        this.onTertiary = i9;
    }

    public void setOnTertiaryContainer(int i9) {
        this.onTertiaryContainer = i9;
    }

    public void setOutline(int i9) {
        this.outline = i9;
    }

    public void setOutlineVariant(int i9) {
        this.outlineVariant = i9;
    }

    public void setPrimary(int i9) {
        this.primary = i9;
    }

    public void setPrimaryContainer(int i9) {
        this.primaryContainer = i9;
    }

    public void setScrim(int i9) {
        this.scrim = i9;
    }

    public void setSecondary(int i9) {
        this.secondary = i9;
    }

    public void setSecondaryContainer(int i9) {
        this.secondaryContainer = i9;
    }

    public void setShadow(int i9) {
        this.shadow = i9;
    }

    public void setSurface(int i9) {
        this.surface = i9;
    }

    public void setSurfaceVariant(int i9) {
        this.surfaceVariant = i9;
    }

    public void setTertiary(int i9) {
        this.tertiary = i9;
    }

    public void setTertiaryContainer(int i9) {
        this.tertiaryContainer = i9;
    }

    public String toString() {
        return "Scheme{primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryContainer=" + this.primaryContainer + ", onPrimaryContainer=" + this.onPrimaryContainer + ", secondary=" + this.secondary + ", onSecondary=" + this.onSecondary + ", secondaryContainer=" + this.secondaryContainer + ", onSecondaryContainer=" + this.onSecondaryContainer + ", tertiary=" + this.tertiary + ", onTertiary=" + this.onTertiary + ", tertiaryContainer=" + this.tertiaryContainer + ", onTertiaryContainer=" + this.onTertiaryContainer + ", error=" + this.error + ", onError=" + this.onError + ", errorContainer=" + this.errorContainer + ", onErrorContainer=" + this.onErrorContainer + ", background=" + this.background + ", onBackground=" + this.onBackground + ", surface=" + this.surface + ", onSurface=" + this.onSurface + ", surfaceVariant=" + this.surfaceVariant + ", onSurfaceVariant=" + this.onSurfaceVariant + ", outline=" + this.outline + ", outlineVariant=" + this.outlineVariant + ", shadow=" + this.shadow + ", scrim=" + this.scrim + ", inverseSurface=" + this.inverseSurface + ", inverseOnSurface=" + this.inverseOnSurface + ", inversePrimary=" + this.inversePrimary + '}';
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i9) {
        this.background = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i9) {
        this.error = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i9) {
        this.errorContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i9) {
        this.inverseOnSurface = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i9) {
        this.inversePrimary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i9) {
        this.inverseSurface = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i9) {
        this.onBackground = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i9) {
        this.onError = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i9) {
        this.onErrorContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i9) {
        this.onPrimary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i9) {
        this.onPrimaryContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i9) {
        this.onSecondary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i9) {
        this.onSecondaryContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i9) {
        this.onSurface = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i9) {
        this.onSurfaceVariant = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i9) {
        this.onTertiary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i9) {
        this.onTertiaryContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i9) {
        this.outline = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i9) {
        this.outlineVariant = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i9) {
        this.primary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i9) {
        this.primaryContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i9) {
        this.scrim = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i9) {
        this.secondary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i9) {
        this.secondaryContainer = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i9) {
        this.shadow = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i9) {
        this.surface = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i9) {
        this.surfaceVariant = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i9) {
        this.tertiary = i9;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i9) {
        this.tertiaryContainer = i9;
        return this;
    }

    public Scheme(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37) {
        this.primary = i9;
        this.onPrimary = i10;
        this.primaryContainer = i11;
        this.onPrimaryContainer = i12;
        this.secondary = i13;
        this.onSecondary = i14;
        this.secondaryContainer = i15;
        this.onSecondaryContainer = i16;
        this.tertiary = i17;
        this.onTertiary = i18;
        this.tertiaryContainer = i19;
        this.onTertiaryContainer = i20;
        this.error = i21;
        this.onError = i22;
        this.errorContainer = i23;
        this.onErrorContainer = i24;
        this.background = i25;
        this.onBackground = i26;
        this.surface = i27;
        this.onSurface = i28;
        this.surfaceVariant = i29;
        this.onSurfaceVariant = i30;
        this.outline = i31;
        this.outlineVariant = i32;
        this.shadow = i33;
        this.scrim = i34;
        this.inverseSurface = i35;
        this.inverseOnSurface = i36;
        this.inversePrimary = i37;
    }
}
