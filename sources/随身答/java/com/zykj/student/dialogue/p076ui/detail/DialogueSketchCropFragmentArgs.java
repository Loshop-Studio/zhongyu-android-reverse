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
@Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "requestKey", "localPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class DialogueSketchCropFragmentArgs implements NavArgs {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String requestKey;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String localPath;

    /* renamed from: com.zykj.student.dialogue.ui.detail.DialogueSketchCropFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DialogueSketchCropFragmentArgs m10344a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(DialogueSketchCropFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("requestKey")) {
                throw new IllegalArgumentException("Required argument \"requestKey\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("requestKey");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"requestKey\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("localPath")) {
                throw new IllegalArgumentException("Required argument \"localPath\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("localPath");
            if (string2 != null) {
                return new DialogueSketchCropFragmentArgs(string, string2);
            }
            throw new IllegalArgumentException("Argument \"localPath\" is marked as non-null but was passed a null value.");
        }

        public Companion() {
        }
    }

    public DialogueSketchCropFragmentArgs(String requestKey, String localPath) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.requestKey = requestKey;
        this.localPath = localPath;
    }

    @JvmStatic
    public static final DialogueSketchCropFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10344a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: b, reason: from getter */
    public final String getRequestKey() {
        return this.requestKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogueSketchCropFragmentArgs)) {
            return false;
        }
        DialogueSketchCropFragmentArgs dialogueSketchCropFragmentArgs = (DialogueSketchCropFragmentArgs) other;
        return Intrinsics.areEqual(this.requestKey, dialogueSketchCropFragmentArgs.requestKey) && Intrinsics.areEqual(this.localPath, dialogueSketchCropFragmentArgs.localPath);
    }

    public int hashCode() {
        return (this.requestKey.hashCode() * 31) + this.localPath.hashCode();
    }

    public String toString() {
        return "DialogueSketchCropFragmentArgs(requestKey=" + this.requestKey + ", localPath=" + this.localPath + ")";
    }
}
