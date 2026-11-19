package com.zykj.student.dialogue.p076ui.detail;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0019BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b \u0010\u0010R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010¨\u0006\""}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "previewImagePath", "", "imagePathList", "sessionId", "answerUserIds", "summary", "courseId", "<init>", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "g", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "[Ljava/lang/String;", "c", "()[Ljava/lang/String;", "e", "f", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class NewAnswerFragmentArgs implements NavArgs {

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h */
    public static final int f11113h = 8;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String previewImagePath;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String[] imagePathList;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final String sessionId;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final String[] answerUserIds;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final String summary;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final String courseId;

    /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NewAnswerFragmentArgs m10439a(Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(NewAnswerFragmentArgs.class.getClassLoader());
            String string = bundle.containsKey("previewImagePath") ? bundle.getString("previewImagePath") : null;
            String[] stringArray = bundle.containsKey("imagePathList") ? bundle.getStringArray("imagePathList") : null;
            String string2 = "";
            if (bundle.containsKey("sessionId")) {
                String string3 = bundle.getString("sessionId");
                if (string3 == null) {
                    throw new IllegalArgumentException("Argument \"sessionId\" is marked as non-null but was passed a null value.");
                }
                str = string3;
            } else {
                str = "";
            }
            String[] stringArray2 = bundle.containsKey("answerUserIds") ? bundle.getStringArray("answerUserIds") : null;
            String string4 = bundle.containsKey("summary") ? bundle.getString("summary") : null;
            if (bundle.containsKey("courseId") && (string2 = bundle.getString("courseId")) == null) {
                throw new IllegalArgumentException("Argument \"courseId\" is marked as non-null but was passed a null value.");
            }
            return new NewAnswerFragmentArgs(string, stringArray, str, stringArray2, string4, string2);
        }

        public Companion() {
        }
    }

    public NewAnswerFragmentArgs() {
        this(null, null, null, null, null, null, 63, null);
    }

    @JvmStatic
    public static final NewAnswerFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10439a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String[] getAnswerUserIds() {
        return this.answerUserIds;
    }

    /* renamed from: b, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* renamed from: c, reason: from getter */
    public final String[] getImagePathList() {
        return this.imagePathList;
    }

    /* renamed from: d, reason: from getter */
    public final String getPreviewImagePath() {
        return this.previewImagePath;
    }

    /* renamed from: e, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewAnswerFragmentArgs)) {
            return false;
        }
        NewAnswerFragmentArgs newAnswerFragmentArgs = (NewAnswerFragmentArgs) other;
        return Intrinsics.areEqual(this.previewImagePath, newAnswerFragmentArgs.previewImagePath) && Intrinsics.areEqual(this.imagePathList, newAnswerFragmentArgs.imagePathList) && Intrinsics.areEqual(this.sessionId, newAnswerFragmentArgs.sessionId) && Intrinsics.areEqual(this.answerUserIds, newAnswerFragmentArgs.answerUserIds) && Intrinsics.areEqual(this.summary, newAnswerFragmentArgs.summary) && Intrinsics.areEqual(this.courseId, newAnswerFragmentArgs.courseId);
    }

    /* renamed from: f, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: g */
    public final Bundle m10438g() {
        Bundle bundle = new Bundle();
        bundle.putString("previewImagePath", this.previewImagePath);
        bundle.putStringArray("imagePathList", this.imagePathList);
        bundle.putString("sessionId", this.sessionId);
        bundle.putStringArray("answerUserIds", this.answerUserIds);
        bundle.putString("summary", this.summary);
        bundle.putString("courseId", this.courseId);
        return bundle;
    }

    public int hashCode() {
        String str = this.previewImagePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String[] strArr = this.imagePathList;
        int iHashCode2 = (((iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31) + this.sessionId.hashCode()) * 31;
        String[] strArr2 = this.answerUserIds;
        int iHashCode3 = (iHashCode2 + (strArr2 == null ? 0 : Arrays.hashCode(strArr2))) * 31;
        String str2 = this.summary;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.courseId.hashCode();
    }

    public String toString() {
        return "NewAnswerFragmentArgs(previewImagePath=" + this.previewImagePath + ", imagePathList=" + Arrays.toString(this.imagePathList) + ", sessionId=" + this.sessionId + ", answerUserIds=" + Arrays.toString(this.answerUserIds) + ", summary=" + this.summary + ", courseId=" + this.courseId + ")";
    }

    public NewAnswerFragmentArgs(String str, String[] strArr, String sessionId, String[] strArr2, String str2, String courseId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        this.previewImagePath = str;
        this.imagePathList = strArr;
        this.sessionId = sessionId;
        this.answerUserIds = strArr2;
        this.summary = str2;
        this.courseId = courseId;
    }

    public /* synthetic */ NewAnswerFragmentArgs(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : strArr, (i9 & 4) != 0 ? "" : str2, (i9 & 8) != 0 ? null : strArr2, (i9 & 16) != 0 ? null : str3, (i9 & 32) != 0 ? "" : str4);
    }
}
