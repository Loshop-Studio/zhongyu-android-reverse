package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J/\u0010\u0016\u001a\u00020\u00152\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m5110d2 = {"Landroidx/navigation/StringArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "parseValue", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "other", "", "valueEquals", "([Ljava/lang/String;[Ljava/lang/String;)Z", "", "serializeAsValues", "([Ljava/lang/String;)Ljava/util/List;", "emptyCollection", "()[Ljava/lang/String;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n11165#3:886\n11500#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringArrayNavType\n*L\n812#1:884\n817#1:885\n833#1:886\n833#1:887,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StringArrayNavType extends CollectionNavType<String[]> {
    public StringArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    @NotNull
    public String[] emptyCollection() {
        return new String[0];
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public String[] get(@NotNull Bundle bundle, @NotNull String key) {
        Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
        if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
            return null;
        }
        return SavedStateReader.m13669getStringArrayimpl(bundleM1062z, key);
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "string[]";
    }

    @Override // androidx.navigation.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable String[] value) {
        Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
        if (value != null) {
            SavedStateWriter.m13717putStringArrayimpl(bundleM1041e, key, value);
        } else {
            SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    @NotNull
    public List<String> serializeAsValues(@Nullable String[] value) {
        if (value == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(value.length);
        for (String str : value) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(@Nullable String[] value, @Nullable String[] other) {
        return AbstractC5802q.m5210w(value, other);
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String[] parseValue(@NotNull String value) {
        AbstractC5830k.m5330g(value, "value");
        return new String[]{value};
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public String[] parseValue(@NotNull String value, @Nullable String[] previousValue) {
        AbstractC5830k.m5330g(value, "value");
        String[] elements = parseValue(value);
        if (previousValue == null) {
            return elements;
        }
        AbstractC5830k.m5330g(elements, "elements");
        int length = previousValue.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(previousValue, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC5830k.m5327d(objArrCopyOf);
        return (String[]) objArrCopyOf;
    }
}
