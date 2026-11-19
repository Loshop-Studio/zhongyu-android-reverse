package androidx.navigation;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m13558d2 = {"Landroidx/navigation/StringNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "parseValue", "serializeAsValue", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1#3:886\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringNavType\n*L\n774#1:884\n783#1:885\n*E\n"})
/* loaded from: classes3.dex */
public final class StringNavType extends NavType<String> {
    public StringNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_STRING;
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM24084constructorimpl = SavedStateReader.m24084constructorimpl(bundle);
        if (!SavedStateReader.m24085containsimpl(bundleM24084constructorimpl, key) || SavedStateReader.m24163isNullimpl(bundleM24084constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m24155getStringimpl(bundleM24084constructorimpl, key);
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m24203putStringimpl(bundleM24170constructorimpl, key, value);
        } else {
            SavedStateWriter.m24193putNullimpl(bundleM24170constructorimpl, key);
        }
    }

    @Override // androidx.navigation.NavType
    public String serializeAsValue(String value) {
        String strEncode$default;
        return (value == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, value, null, 2, null)) == null) ? "null" : strEncode$default;
    }
}
