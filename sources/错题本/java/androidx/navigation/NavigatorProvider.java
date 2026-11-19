package androidx.navigation;

import android.annotation.SuppressLint;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u0002H\u000e\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0007¢\u0006\u0002\u0010\u0011J#\u0010\r\u001a\u0002H\u000e\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007J*\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0017R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m5110d2 = {"Landroidx/navigation/NavigatorProvider;", "", "<init>", "()V", "_navigators", "", "", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigators", "", "getNavigators", "()Ljava/util/Map;", "getNavigator", ExifInterface.GPS_DIRECTION_TRUE, "navigatorClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", HintConstants.AUTOFILL_HINT_NAME, "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "addNavigator", "navigator", "Companion", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"TypeParameterUnusedInFormals"})
@SourceDebugExtension({"SMAP\nNavigatorProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: classes2.dex */
public class NavigatorProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();

    @NotNull
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000bJ!\u0010\f\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0006H\u0001¢\u0006\u0002\b\u000fR \u0010\u0004\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m5110d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "<init>", "()V", "annotationNames", "", "Ljava/lang/Class;", "", "validateName", "", HintConstants.AUTOFILL_HINT_NAME, "validateName$navigation_common_release", "getNameForNavigator", "navigatorClass", "Landroidx/navigation/Navigator;", "getNameForNavigator$navigation_common_release", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getNameForNavigator$navigation_common_release(@NotNull Class<? extends Navigator<?>> navigatorClass) {
            AbstractC5830k.m5330g(navigatorClass, "navigatorClass");
            String strValue = (String) NavigatorProvider.annotationNames.get(navigatorClass);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (!validateName$navigation_common_release(strValue)) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
                }
                NavigatorProvider.annotationNames.put(navigatorClass, strValue);
            }
            AbstractC5830k.m5327d(strValue);
            return strValue;
        }

        public final boolean validateName$navigation_common_release(@Nullable String name) {
            return name != null && name.length() > 0;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Navigator<? extends NavDestination> addNavigator(@NotNull Navigator<? extends NavDestination> navigator) {
        AbstractC5830k.m5330g(navigator, "navigator");
        return addNavigator(INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    @CallSuper
    @NotNull
    public final <T extends Navigator<?>> T getNavigator(@NotNull Class<T> navigatorClass) {
        AbstractC5830k.m5330g(navigatorClass, "navigatorClass");
        return (T) getNavigator(INSTANCE.getNameForNavigator$navigation_common_release(navigatorClass));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        return AbstractC5785e0.m5156J(this._navigators);
    }

    @CallSuper
    @Nullable
    public Navigator<? extends NavDestination> addNavigator(@NotNull String name, @NotNull Navigator<? extends NavDestination> navigator) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(navigator, "navigator");
        if (!INSTANCE.validateName$navigation_common_release(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator<? extends NavDestination> navigator2 = this._navigators.get(name);
        if (AbstractC5830k.m5325b(navigator2, navigator)) {
            return navigator;
        }
        boolean z8 = false;
        if (navigator2 != null && navigator2.getIsAttached()) {
            z8 = true;
        }
        if (z8) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.getIsAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @CallSuper
    @NotNull
    public <T extends Navigator<?>> T getNavigator(@NotNull String name) {
        AbstractC5830k.m5330g(name, "name");
        if (INSTANCE.validateName$navigation_common_release(name)) {
            Navigator<? extends NavDestination> navigator = this._navigators.get(name);
            if (navigator != null) {
                return navigator;
            }
            throw new IllegalStateException(AbstractC0037f.m86k("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
