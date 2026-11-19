package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m5110d2 = {"Landroidx/navigation/BoolNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolNavType\n*L\n678#1:884\n683#1:885\n*E\n"})
/* loaded from: classes2.dex */
public final class BoolNavType extends NavType<Boolean> {
    public BoolNavType() {
        super(false);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    @Nullable
    public Boolean get(@NotNull Bundle bundle, @NotNull String key) {
        Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
        if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
            return null;
        }
        return Boolean.valueOf(SavedStateReader.m13606getBooleanimpl(bundleM1062z, key));
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return TypedValues.Custom.S_BOOLEAN;
    }

    public void put(@NotNull Bundle bundle, @NotNull String key, boolean value) {
        SavedStateWriter.m13689putBooleanimpl(AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle), key, value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    @NotNull
    public Boolean parseValue(@NotNull String value) {
        boolean z8;
        AbstractC5830k.m5330g(value, "value");
        if (value.equals("true")) {
            z8 = true;
        } else {
            if (!value.equals("false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
        put(bundle, str, bool.booleanValue());
    }
}
