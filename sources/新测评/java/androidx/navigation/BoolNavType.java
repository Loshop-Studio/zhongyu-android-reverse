package androidx.navigation;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J$\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m13558d2 = {"Landroidx/navigation/BoolNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Boolean;", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolNavType\n*L\n678#1:884\n683#1:885\n*E\n"})
/* loaded from: classes3.dex */
public final class BoolNavType extends NavType<Boolean> {
    public BoolNavType() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_BOOLEAN;
    }

    @Override // androidx.navigation.NavType
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
        put(bundle, str, bool.booleanValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Boolean get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM24084constructorimpl = SavedStateReader.m24084constructorimpl(bundle);
        if (!SavedStateReader.m24085containsimpl(bundleM24084constructorimpl, key) || SavedStateReader.m24163isNullimpl(bundleM24084constructorimpl, key)) {
            return null;
        }
        return Boolean.valueOf(SavedStateReader.m24093getBooleanimpl(bundleM24084constructorimpl, key));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavType
    public Boolean parseValue(String value) {
        boolean z9;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, "true")) {
            z9 = true;
        } else {
            if (!Intrinsics.areEqual(value, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    public void put(Bundle bundle, String key, boolean value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        SavedStateWriter.m24176putBooleanimpl(SavedStateWriter.m24170constructorimpl(bundle), key, value);
    }
}
