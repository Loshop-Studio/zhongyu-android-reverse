package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J#\u0010\u0016\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m5110d2 = {"Landroidx/navigation/FloatArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "parseValue", "(Ljava/lang/String;)[F", "previousValue", "(Ljava/lang/String;[F)[F", "other", "", "valueEquals", "([F[F)Z", "", "serializeAsValues", "([F)Ljava/util/List;", "emptyCollection", "()[F", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/FloatArrayNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1557#3:886\n1628#3,3:887\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/FloatArrayNavType\n*L\n608#1:884\n613#1:885\n631#1:886\n631#1:887,3\n*E\n"})
/* loaded from: classes2.dex */
public final class FloatArrayNavType extends CollectionNavType<float[]> {
    public FloatArrayNavType() {
        super(true);
    }

    @Override // androidx.navigation.CollectionNavType
    @NotNull
    public float[] emptyCollection() {
        return new float[0];
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public float[] get(@NotNull Bundle bundle, @NotNull String key) {
        Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
        if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
            return null;
        }
        return SavedStateReader.m13625getFloatArrayimpl(bundleM1062z, key);
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return "float[]";
    }

    @Override // androidx.navigation.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable float[] value) {
        Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
        if (value != null) {
            SavedStateWriter.m13699putFloatArrayimpl(bundleM1041e, key, value);
        } else {
            SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    @NotNull
    public List<String> serializeAsValues(@Nullable float[] value) {
        List listM5202c0;
        if (value == null || (listM5202c0 = AbstractC5802q.m5202c0(value)) == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5202c0, 10));
        Iterator it = listM5202c0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public boolean valueEquals(@Nullable float[] value, @Nullable float[] other) {
        Float[] fArr;
        Float[] fArr2 = null;
        if (value != null) {
            fArr = new Float[value.length];
            int length = value.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Float.valueOf(value[i]);
            }
        } else {
            fArr = null;
        }
        if (other != null) {
            fArr2 = new Float[other.length];
            int length2 = other.length;
            for (int i8 = 0; i8 < length2; i8++) {
                fArr2[i8] = Float.valueOf(other[i8]);
            }
        }
        return AbstractC5802q.m5210w(fArr, fArr2);
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public float[] parseValue(@NotNull String value) {
        AbstractC5830k.m5330g(value, "value");
        return new float[]{NavType.FloatType.parseValue(value).floatValue()};
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public float[] parseValue(@NotNull String value, @Nullable float[] previousValue) {
        AbstractC5830k.m5330g(value, "value");
        float[] elements = parseValue(value);
        if (previousValue == null) {
            return elements;
        }
        AbstractC5830k.m5330g(elements, "elements");
        int length = previousValue.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(previousValue, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        AbstractC5830k.m5327d(fArrCopyOf);
        return fArrCopyOf;
    }
}
