package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.EnvironmentCompat;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m5110d2 = {"Landroidx/navigation/serialization/UNKNOWN;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "parseValue", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UNKNOWN extends NavType<String> {

    @NotNull
    public static final UNKNOWN INSTANCE = new UNKNOWN();

    private UNKNOWN() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    @Nullable
    public String get(@NotNull Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        return null;
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String getName() {
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    @Override // androidx.navigation.NavType
    public void put(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
    }

    @Override // androidx.navigation.NavType
    @NotNull
    public String parseValue(@NotNull String value) {
        AbstractC5830k.m5330g(value, "value");
        return "null";
    }
}
