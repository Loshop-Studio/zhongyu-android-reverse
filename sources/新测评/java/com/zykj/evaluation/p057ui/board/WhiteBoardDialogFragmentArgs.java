package com.zykj.evaluation.p057ui.board;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragmentArgs;", "Landroidx/navigation/NavArgs;", "", "uuid", "filePath", "", "isHand", "isCorrect", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUuid", "b", "c", "Z", "()Z", "e", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WhiteBoardDialogFragmentArgs implements NavArgs {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String uuid;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String filePath;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean isHand;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isCorrect;

    /* renamed from: com.zykj.evaluation.ui.board.WhiteBoardDialogFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WhiteBoardDialogFragmentArgs m9212a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(WhiteBoardDialogFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("uuid")) {
                throw new IllegalArgumentException("Required argument \"uuid\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("uuid");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"uuid\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("filePath")) {
                throw new IllegalArgumentException("Required argument \"filePath\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("filePath");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"filePath\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("isHand")) {
                throw new IllegalArgumentException("Required argument \"isHand\" is missing and does not have an android:defaultValue");
            }
            boolean z9 = bundle.getBoolean("isHand");
            if (bundle.containsKey("isCorrect")) {
                return new WhiteBoardDialogFragmentArgs(string, string2, z9, bundle.getBoolean("isCorrect"));
            }
            throw new IllegalArgumentException("Required argument \"isCorrect\" is missing and does not have an android:defaultValue");
        }

        public Companion() {
        }
    }

    public WhiteBoardDialogFragmentArgs(String uuid, String filePath, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.uuid = uuid;
        this.filePath = filePath;
        this.isHand = z9;
        this.isCorrect = z10;
    }

    @JvmStatic
    public static final WhiteBoardDialogFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m9212a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsCorrect() {
        return this.isCorrect;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsHand() {
        return this.isHand;
    }

    /* renamed from: d */
    public final Bundle m9211d() {
        Bundle bundle = new Bundle();
        bundle.putString("uuid", this.uuid);
        bundle.putString("filePath", this.filePath);
        bundle.putBoolean("isHand", this.isHand);
        bundle.putBoolean("isCorrect", this.isCorrect);
        return bundle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhiteBoardDialogFragmentArgs)) {
            return false;
        }
        WhiteBoardDialogFragmentArgs whiteBoardDialogFragmentArgs = (WhiteBoardDialogFragmentArgs) other;
        return Intrinsics.areEqual(this.uuid, whiteBoardDialogFragmentArgs.uuid) && Intrinsics.areEqual(this.filePath, whiteBoardDialogFragmentArgs.filePath) && this.isHand == whiteBoardDialogFragmentArgs.isHand && this.isCorrect == whiteBoardDialogFragmentArgs.isCorrect;
    }

    public int hashCode() {
        return (((((this.uuid.hashCode() * 31) + this.filePath.hashCode()) * 31) + Boolean.hashCode(this.isHand)) * 31) + Boolean.hashCode(this.isCorrect);
    }

    public String toString() {
        return "WhiteBoardDialogFragmentArgs(uuid=" + this.uuid + ", filePath=" + this.filePath + ", isHand=" + this.isHand + ", isCorrect=" + this.isCorrect + ")";
    }
}
