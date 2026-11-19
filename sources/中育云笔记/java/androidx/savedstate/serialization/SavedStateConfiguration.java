package androidx.savedstate.serialization;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.modules.AbstractC10057d;
import p182he.AbstractC9553a;

/* loaded from: classes3.dex */
public final class SavedStateConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;
    private final AbstractC9553a serializersModule;

    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;
        private AbstractC9553a serializersModule;

        public Builder(SavedStateConfiguration configuration) {
            AbstractC9979u.m20294g(configuration, "configuration");
            this.serializersModule = configuration.getSerializersModule();
            this.encodeDefaults = configuration.getEncodeDefaults();
            this.classDiscriminatorMode = configuration.getClassDiscriminatorMode();
        }

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        public final SavedStateConfiguration build$savedstate_release() {
            return new SavedStateConfiguration(AbstractC10057d.m21052b(SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE, this.serializersModule), this.classDiscriminatorMode, this.encodeDefaults, null);
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        public final AbstractC9553a getSerializersModule() {
            return this.serializersModule;
        }

        public final void setClassDiscriminatorMode(int i10) {
            this.classDiscriminatorMode = i10;
        }

        public final void setEncodeDefaults(boolean z10) {
            this.encodeDefaults = z10;
        }

        public final void setSerializersModule(AbstractC9553a abstractC9553a) {
            AbstractC9979u.m20294g(abstractC9553a, "<set-?>");
            this.serializersModule = abstractC9553a;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC9553a abstractC9553a, int i10, boolean z10, AbstractC9972n abstractC9972n) {
        this(abstractC9553a, i10, z10);
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final AbstractC9553a getSerializersModule() {
        return this.serializersModule;
    }

    private SavedStateConfiguration(AbstractC9553a abstractC9553a, int i10, boolean z10) {
        this.serializersModule = abstractC9553a;
        this.classDiscriminatorMode = i10;
        this.encodeDefaults = z10;
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC9553a abstractC9553a, int i10, boolean z10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : abstractC9553a, (i11 & 2) != 0 ? 2 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
