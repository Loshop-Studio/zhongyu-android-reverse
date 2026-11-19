package com.zykj.student.dialogue.p076ui.collect;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "imagePath", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SearchedQuestionFragmentArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String imagePath;

    /* renamed from: com.zykj.student.dialogue.ui.collect.SearchedQuestionFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SearchedQuestionFragmentArgs m10174a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(SearchedQuestionFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("imagePath")) {
                throw new IllegalArgumentException("Required argument \"imagePath\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("imagePath");
            if (string != null) {
                return new SearchedQuestionFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"imagePath\" is marked as non-null but was passed a null value.");
        }

        public Companion() {
        }
    }

    public SearchedQuestionFragmentArgs(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        this.imagePath = imagePath;
    }

    @JvmStatic
    public static final SearchedQuestionFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10174a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* renamed from: b */
    public final Bundle m10173b() {
        Bundle bundle = new Bundle();
        bundle.putString("imagePath", this.imagePath);
        return bundle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchedQuestionFragmentArgs) && Intrinsics.areEqual(this.imagePath, ((SearchedQuestionFragmentArgs) other).imagePath);
    }

    public int hashCode() {
        return this.imagePath.hashCode();
    }

    public String toString() {
        return "SearchedQuestionFragmentArgs(imagePath=" + this.imagePath + ")";
    }
}
