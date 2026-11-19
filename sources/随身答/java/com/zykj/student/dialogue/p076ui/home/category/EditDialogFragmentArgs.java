package com.zykj.student.dialogue.p076ui.home.category;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \b2\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "categoryList", "<init>", "([Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "()[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class EditDialogFragmentArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c */
    public static final int f11818c = 8;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final CatalogResp[] categoryList;

    /* renamed from: com.zykj.student.dialogue.ui.home.category.EditDialogFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EditDialogFragmentArgs m10964a(Bundle bundle) {
            CatalogResp[] catalogRespArr;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(EditDialogFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("categoryList")) {
                throw new IllegalArgumentException("Required argument \"categoryList\" is missing and does not have an android:defaultValue");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("categoryList");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.zykj.student.dialogue.bean.resp.CatalogResp");
                    arrayList.add((CatalogResp) parcelable);
                }
                catalogRespArr = (CatalogResp[]) arrayList.toArray(new CatalogResp[0]);
            } else {
                catalogRespArr = null;
            }
            if (catalogRespArr != null) {
                return new EditDialogFragmentArgs(catalogRespArr);
            }
            throw new IllegalArgumentException("Argument \"categoryList\" is marked as non-null but was passed a null value.");
        }

        public Companion() {
        }
    }

    public EditDialogFragmentArgs(CatalogResp[] categoryList) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        this.categoryList = categoryList;
    }

    @JvmStatic
    public static final EditDialogFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10964a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final CatalogResp[] getCategoryList() {
        return this.categoryList;
    }

    /* renamed from: b */
    public final Bundle m10963b() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("categoryList", this.categoryList);
        return bundle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EditDialogFragmentArgs) && Intrinsics.areEqual(this.categoryList, ((EditDialogFragmentArgs) other).categoryList);
    }

    public int hashCode() {
        return Arrays.hashCode(this.categoryList);
    }

    public String toString() {
        return "EditDialogFragmentArgs(categoryList=" + Arrays.toString(this.categoryList) + ")";
    }
}
