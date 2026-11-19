package com.zykj.student.dialogue.p076ui.ask;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "quoraSearchEnable", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class AskQuestionDialogFragmentArgs implements NavArgs {

    /* renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean quoraSearchEnable;

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AskQuestionDialogFragmentArgs m10048a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(AskQuestionDialogFragmentArgs.class.getClassLoader());
            return new AskQuestionDialogFragmentArgs(bundle.containsKey("quoraSearchEnable") ? bundle.getBoolean("quoraSearchEnable") : true);
        }

        public Companion() {
        }
    }

    public AskQuestionDialogFragmentArgs() {
        this(false, 1, null);
    }

    @JvmStatic
    public static final AskQuestionDialogFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10048a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getQuoraSearchEnable() {
        return this.quoraSearchEnable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AskQuestionDialogFragmentArgs) && this.quoraSearchEnable == ((AskQuestionDialogFragmentArgs) other).quoraSearchEnable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.quoraSearchEnable);
    }

    public String toString() {
        return "AskQuestionDialogFragmentArgs(quoraSearchEnable=" + this.quoraSearchEnable + ")";
    }

    public AskQuestionDialogFragmentArgs(boolean z9) {
        this.quoraSearchEnable = z9;
    }

    public /* synthetic */ AskQuestionDialogFragmentArgs(boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? true : z9);
    }
}
