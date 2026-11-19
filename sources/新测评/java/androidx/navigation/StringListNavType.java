package androidx.navigation;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J%\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J(\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m13558d2 = {"Landroidx/navigation/StringListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", "get", "parseValue", "previousValue", "valueEquals", "", "other", "serializeAsValues", "emptyCollection", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringListNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:887\n37#3,2:885\n37#3,2:888\n37#3,2:890\n1557#4:892\n1628#4,3:893\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringListNavType\n*L\n843#1:884\n850#1:887\n844#1:885,2\n864#1:888,2\n865#1:890,2\n870#1:892\n870#1:893,3\n*E\n"})
/* loaded from: classes3.dex */
public final class StringListNavType extends CollectionNavType<List<? extends String>> {
    public StringListNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return "List<String>";
    }

    @Override // androidx.navigation.CollectionNavType
    public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
        return serializeAsValues2((List<String>) list);
    }

    @Override // androidx.navigation.CollectionNavType
    public List<? extends String> emptyCollection() {
        return CollectionsKt.emptyList();
    }

    @Override // androidx.navigation.NavType
    public List<String> get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM24084constructorimpl = SavedStateReader.m24084constructorimpl(bundle);
        if (!SavedStateReader.m24085containsimpl(bundleM24084constructorimpl, key) || SavedStateReader.m24163isNullimpl(bundleM24084constructorimpl, key)) {
            return null;
        }
        return ArraysKt.toList(SavedStateReader.m24156getStringArrayimpl(bundleM24084constructorimpl, key));
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, List<String> value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleM24170constructorimpl = SavedStateWriter.m24170constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m24204putStringArrayimpl(bundleM24170constructorimpl, key, (String[]) value.toArray(new String[0]));
        } else {
            SavedStateWriter.m24193putNullimpl(bundleM24170constructorimpl, key);
        }
    }

    /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public List<String> serializeAsValues2(List<String> value) {
        if (value == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, (String) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(List<String> value, List<String> other) {
        return ArraysKt.contentDeepEquals(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public List<String> parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return CollectionsKt.listOf(value);
    }

    @Override // androidx.navigation.NavType
    public List<String> parseValue(String value, List<String> previousValue) {
        List<String> listPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) parseValue(value))) == null) ? parseValue(value) : listPlus;
    }
}
