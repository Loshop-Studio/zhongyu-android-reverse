package com.zykj.student.dialogue.p076ui.detail;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "path", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class PlayLessonFragmentArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String path;

    /* renamed from: com.zykj.student.dialogue.ui.detail.PlayLessonFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PlayLessonFragmentArgs m10446a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(PlayLessonFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("path")) {
                throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("path");
            if (string != null) {
                return new PlayLessonFragmentArgs(string);
            }
            throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
        }

        public Companion() {
        }
    }

    public PlayLessonFragmentArgs(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
    }

    @JvmStatic
    public static final PlayLessonFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10446a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlayLessonFragmentArgs) && Intrinsics.areEqual(this.path, ((PlayLessonFragmentArgs) other).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return "PlayLessonFragmentArgs(path=" + this.path + ")";
    }
}
