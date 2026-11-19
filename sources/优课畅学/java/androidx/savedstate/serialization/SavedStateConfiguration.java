package androidx.savedstate.serialization;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.modules.AbstractC9226d;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;
    private final AbstractC10583a serializersModule;

    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;
        private AbstractC10583a serializersModule;

        public Builder(SavedStateConfiguration configuration) {
            AbstractC9133u.m16133g(configuration, "configuration");
            this.serializersModule = configuration.getSerializersModule();
            this.encodeDefaults = configuration.getEncodeDefaults();
            this.classDiscriminatorMode = configuration.getClassDiscriminatorMode();
        }

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        public final SavedStateConfiguration build$savedstate_release() {
            return new SavedStateConfiguration(AbstractC9226d.m16929b(SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE, this.serializersModule), this.classDiscriminatorMode, this.encodeDefaults, null);
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        public final AbstractC10583a getSerializersModule() {
            return this.serializersModule;
        }

        public final void setClassDiscriminatorMode(int i10) {
            this.classDiscriminatorMode = i10;
        }

        public final void setEncodeDefaults(boolean z10) {
            this.encodeDefaults = z10;
        }

        public final void setSerializersModule(AbstractC10583a abstractC10583a) {
            AbstractC9133u.m16133g(abstractC10583a, "<set-?>");
            this.serializersModule = abstractC10583a;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC10583a abstractC10583a, int i10, boolean z10, AbstractC9126n abstractC9126n) {
        this(abstractC10583a, i10, z10);
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final AbstractC10583a getSerializersModule() {
        return this.serializersModule;
    }

    private SavedStateConfiguration(AbstractC10583a abstractC10583a, int i10, boolean z10) {
        this.serializersModule = abstractC10583a;
        this.classDiscriminatorMode = i10;
        this.encodeDefaults = z10;
    }

    public /* synthetic */ SavedStateConfiguration(AbstractC10583a abstractC10583a, int i10, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : abstractC10583a, (i11 & 2) != 0 ? 2 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
