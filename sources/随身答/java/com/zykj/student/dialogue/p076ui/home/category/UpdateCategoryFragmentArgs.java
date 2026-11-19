package com.zykj.student.dialogue.p076ui.home.category;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;", "Landroidx/navigation/NavArgs;", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "category", "<init>", "(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "b", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class UpdateCategoryFragmentArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final CatalogResp category;

    /* renamed from: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UpdateCategoryFragmentArgs m10987a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(UpdateCategoryFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("category")) {
                throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(CatalogResp.class) || Serializable.class.isAssignableFrom(CatalogResp.class)) {
                CatalogResp catalogResp = (CatalogResp) bundle.get("category");
                if (catalogResp != null) {
                    return new UpdateCategoryFragmentArgs(catalogResp);
                }
                throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(CatalogResp.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public Companion() {
        }
    }

    public UpdateCategoryFragmentArgs(CatalogResp category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
    }

    @JvmStatic
    public static final UpdateCategoryFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10987a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final CatalogResp getCategory() {
        return this.category;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateCategoryFragmentArgs) && Intrinsics.areEqual(this.category, ((UpdateCategoryFragmentArgs) other).category);
    }

    public int hashCode() {
        return this.category.hashCode();
    }

    public String toString() {
        return "UpdateCategoryFragmentArgs(category=" + this.category + ")";
    }
}
