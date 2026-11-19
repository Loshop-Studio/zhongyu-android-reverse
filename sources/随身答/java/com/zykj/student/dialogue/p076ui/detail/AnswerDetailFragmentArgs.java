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
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "questionId", "", "fromCollectHistory", "isCollected", "<init>", "(Ljava/lang/String;ZZ)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class AnswerDetailFragmentArgs implements NavArgs {

    /* renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String questionId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean fromCollectHistory;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean isCollected;

    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AnswerDetailFragmentArgs m10218a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(AnswerDetailFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("questionId")) {
                throw new IllegalArgumentException("Required argument \"questionId\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("questionId");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"questionId\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("fromCollectHistory")) {
                throw new IllegalArgumentException("Required argument \"fromCollectHistory\" is missing and does not have an android:defaultValue");
            }
            boolean z9 = bundle.getBoolean("fromCollectHistory");
            if (bundle.containsKey("isCollected")) {
                return new AnswerDetailFragmentArgs(string, z9, bundle.getBoolean("isCollected"));
            }
            throw new IllegalArgumentException("Required argument \"isCollected\" is missing and does not have an android:defaultValue");
        }

        public Companion() {
        }
    }

    public AnswerDetailFragmentArgs(String questionId, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.questionId = questionId;
        this.fromCollectHistory = z9;
        this.isCollected = z10;
    }

    @JvmStatic
    public static final AnswerDetailFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10218a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getFromCollectHistory() {
        return this.fromCollectHistory;
    }

    /* renamed from: b, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsCollected() {
        return this.isCollected;
    }

    /* renamed from: d */
    public final Bundle m10217d() {
        Bundle bundle = new Bundle();
        bundle.putString("questionId", this.questionId);
        bundle.putBoolean("fromCollectHistory", this.fromCollectHistory);
        bundle.putBoolean("isCollected", this.isCollected);
        return bundle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerDetailFragmentArgs)) {
            return false;
        }
        AnswerDetailFragmentArgs answerDetailFragmentArgs = (AnswerDetailFragmentArgs) other;
        return Intrinsics.areEqual(this.questionId, answerDetailFragmentArgs.questionId) && this.fromCollectHistory == answerDetailFragmentArgs.fromCollectHistory && this.isCollected == answerDetailFragmentArgs.isCollected;
    }

    public int hashCode() {
        return (((this.questionId.hashCode() * 31) + Boolean.hashCode(this.fromCollectHistory)) * 31) + Boolean.hashCode(this.isCollected);
    }

    public String toString() {
        return "AnswerDetailFragmentArgs(questionId=" + this.questionId + ", fromCollectHistory=" + this.fromCollectHistory + ", isCollected=" + this.isCollected + ")";
    }
}
