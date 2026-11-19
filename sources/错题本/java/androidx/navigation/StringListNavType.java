package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J/\u0010\u0016\u001a\u00020\u00152\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m5110d2 = {"Landroidx/navigation/StringListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "parseValue", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "valueEquals", "(Ljava/util/List;Ljava/util/List;)Z", "serializeAsValues", "(Ljava/util/List;)Ljava/util/List;", "emptyCollection", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringListNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:887\n37#3,2:885\n37#3,2:888\n37#3,2:890\n1557#4:892\n1628#4,3:893\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringListNavType\n*L\n843#1:884\n850#1:887\n844#1:885,2\n864#1:888,2\n865#1:890,2\n870#1:892\n870#1:893,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StringListNavType extends CollectionNavType<List<? extends String>> {
    public StringListNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    @NotNull
    public List<? extends String> emptyCollection() {
        return EmptyList.INSTANCE;
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public List<String> get(@NotNull Bundle bundle, @NotNull String key) {
        Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
        if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
            return null;
        }
        return AbstractC5802q.m5204e0(SavedStateReader.m13669getStringArrayimpl(bundleM1062z, key));
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "List<String>";
    }

    @Override // androidx.navigation.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable List<String> value) {
        Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
        if (value != null) {
            SavedStateWriter.m13717putStringArrayimpl(bundleM1041e, key, (String[]) value.toArray(new String[0]));
        } else {
            SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
        return serializeAsValues2((List<String>) list);
    }

    @NotNull
    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(@Nullable List<String> value) {
        if (value == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, (String) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(@Nullable List<String> value, @Nullable List<String> other) {
        return AbstractC5802q.m5210w(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public List<String> parseValue(@NotNull String value) {
        AbstractC5830k.m5330g(value, "value");
        return AbstractC5806u.m5286y(value);
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public List<String> parseValue(@NotNull String value, @Nullable List<String> previousValue) {
        AbstractC5830k.m5330g(value, "value");
        List<String> value2 = parseValue(value);
        return previousValue != null ? AbstractC5805t.m5240t0(previousValue, value2) : value2;
    }
}
