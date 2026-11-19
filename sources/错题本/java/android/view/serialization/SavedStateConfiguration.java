package android.view.serialization;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.modules.C6045a;
import org.jetbrains.annotations.NotNull;
import p129o2.C6268a;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;
import p133o7.C6280d;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m5110d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "", "Lo7/e;", "serializersModule", "", "classDiscriminatorMode", "", "encodeDefaults", "<init>", "(Lo7/e;IZ)V", "Lo7/e;", "getSerializersModule", "()Lo7/e;", "I", "getClassDiscriminatorMode", "()I", "Z", "getEncodeDefaults", "()Z", "Companion", "Builder", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateConfiguration {

    @JvmField
    @NotNull
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;

    @NotNull
    private final AbstractC6281e serializersModule;

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m5110d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "<init>", "(Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "build$savedstate_release", "()Landroidx/savedstate/serialization/SavedStateConfiguration;", "build", "Lo7/e;", "serializersModule", "Lo7/e;", "getSerializersModule", "()Lo7/e;", "setSerializersModule", "(Lo7/e;)V", "", "encodeDefaults", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "getEncodeDefaults$annotations", "()V", "", "classDiscriminatorMode", "I", "getClassDiscriminatorMode", "()I", "setClassDiscriminatorMode", "(I)V", "getClassDiscriminatorMode$annotations", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;

        @NotNull
        private AbstractC6281e serializersModule;

        public Builder(@NotNull SavedStateConfiguration configuration) {
            AbstractC5830k.m5330g(configuration, "configuration");
            this.serializersModule = configuration.getSerializersModule();
            this.encodeDefaults = configuration.getEncodeDefaults();
            this.classDiscriminatorMode = configuration.getClassDiscriminatorMode();
        }

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        @NotNull
        public final SavedStateConfiguration build$savedstate_release() {
            AbstractC6281e abstractC6281e = SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE;
            AbstractC6281e other = this.serializersModule;
            C6280d c6280d = AbstractC6283g.f10039a;
            AbstractC5830k.m5330g(abstractC6281e, "<this>");
            AbstractC5830k.m5330g(other, "other");
            C6045a c6045a = new C6045a();
            abstractC6281e.mo5873a(c6045a);
            other.mo5873a(new C6268a(c6045a, 26));
            return new SavedStateConfiguration(c6045a.m5730a(), this.classDiscriminatorMode, this.encodeDefaults, null);
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        @NotNull
        public final AbstractC6281e getSerializersModule() {
            return this.serializersModule;
        }

        public final void setClassDiscriminatorMode(int i) {
            this.classDiscriminatorMode = i;
        }

        public final void setEncodeDefaults(boolean z8) {
            this.encodeDefaults = z8;
        }

        public final void setSerializersModule(@NotNull AbstractC6281e abstractC6281e) {
            AbstractC5830k.m5330g(abstractC6281e, "<set-?>");
            this.serializersModule = abstractC6281e;
        }
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC6281e abstractC6281e, int i, boolean z8, AbstractC5824e abstractC5824e) {
        this(abstractC6281e, i, z8);
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    @NotNull
    public final AbstractC6281e getSerializersModule() {
        return this.serializersModule;
    }

    private SavedStateConfiguration(AbstractC6281e abstractC6281e, int i, boolean z8) {
        this.serializersModule = abstractC6281e;
        this.classDiscriminatorMode = i;
        this.encodeDefaults = z8;
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC6281e abstractC6281e, int i, boolean z8, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : abstractC6281e, (i8 & 2) != 0 ? 2 : i, (i8 & 4) != 0 ? false : z8);
    }
}
