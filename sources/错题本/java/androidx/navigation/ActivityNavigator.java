package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SavedStateReader;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p214z6.AbstractC6833k;

@Navigator.Name("activity")
@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J6\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u000e\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0013\u0010\u0003\u001a\u00020\u00048G¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m5110d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hostActivity", "Landroid/app/Activity;", "createDestination", "popBackStack", "", "navigate", "Landroidx/navigation/NavDestination;", "destination", "args", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "Destination", "Extras", "Companion", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nActivityNavigator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,504:1\n183#2,2:505\n90#3:507\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n*L\n46#1:505,2\n96#1:507\n*E\n"})
/* loaded from: classes2.dex */
public class ActivityNavigator extends Navigator<Destination> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";

    @NotNull
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";

    @NotNull
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";

    @NotNull
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";

    @NotNull
    private static final String LOG_TAG = "ActivityNavigator";

    @NotNull
    private final Context context;

    @Nullable
    private final Activity hostActivity;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m5110d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Ld6/s;", "applyPopAnimationsToPendingTransition", "(Landroid/app/Activity;)V", "", "EXTRA_NAV_SOURCE", "Ljava/lang/String;", "EXTRA_NAV_CURRENT", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @JvmStatic
        public final void applyPopAnimationsToPendingTransition(@NotNull Activity activity) {
            AbstractC5830k.m5330g(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010\u0015J\u0017\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u00103\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R(\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u00103\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u0010+R(\u00109\u001a\u0004\u0018\u00010\u000b2\b\u00103\u001a\u0004\u0018\u00010\u000b8F@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010+R(\u0010;\u001a\u0004\u0018\u00010\u001d2\b\u00103\u001a\u0004\u0018\u00010\u001d8F@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u00103\u001a\u0004\u0018\u00010\u000b8F@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b?\u0010+R(\u0010$\u001a\u0004\u0018\u00010#2\b\u00103\u001a\u0004\u0018\u00010#8F@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, m5110d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "activityNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Context;", "context", "", "pattern", "parseApplicationId", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "setIntent", "(Landroid/content/Intent;)Landroidx/navigation/ActivityNavigator$Destination;", "dataPattern", "setDataPattern", "(Ljava/lang/String;)Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/util/AttributeSet;", "attrs", "Ld6/s;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "packageName", "setTargetPackage", "Landroid/content/ComponentName;", HintConstants.AUTOFILL_HINT_NAME, "setComponentName", "(Landroid/content/ComponentName;)Landroidx/navigation/ActivityNavigator$Destination;", "action", "setAction", "Landroid/net/Uri;", "data", "setData", "(Landroid/net/Uri;)Landroidx/navigation/ActivityNavigator$Destination;", "", "supportsActions", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "value", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "Ljava/lang/String;", "getDataPattern", "targetPackage", "getTargetPackage", "component", "Landroid/content/ComponentName;", "getComponent", "()Landroid/content/ComponentName;", "getAction", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @NavDestination.ClassType(Activity.class)
    @SourceDebugExtension({"SMAP\nActivityNavigator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,504:1\n233#2,3:505\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n261#1:505,3\n*E\n"})
    public static class Destination extends NavDestination {

        @Nullable
        private String action;

        @Nullable
        private ComponentName component;

        @Nullable
        private Uri data;

        @Nullable
        private String dataPattern;

        @Nullable
        private Intent intent;

        @Nullable
        private String targetPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(@NotNull Navigator<? extends Destination> activityNavigator) {
            super(activityNavigator);
            AbstractC5830k.m5330g(activityNavigator, "activityNavigator");
        }

        private final String parseApplicationId(Context context, String pattern) {
            if (pattern == null) {
                return null;
            }
            String packageName = context.getPackageName();
            AbstractC5830k.m5329f(packageName, "getPackageName(...)");
            return AbstractC5862w.m5407A(pattern, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName);
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && (other instanceof Destination) && super.equals(other)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((Destination) other).intent) : ((Destination) other).intent == null) && AbstractC5830k.m5325b(this.dataPattern, ((Destination) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @Nullable
        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @Nullable
        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Nullable
        public final String getDataPattern() {
            return this.dataPattern;
        }

        @Nullable
        public final Intent getIntent() {
            return this.intent;
        }

        @Nullable
        public final String getTargetPackage() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
            AbstractC5830k.m5330g(context, "context");
            AbstractC5830k.m5330g(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C2825R.styleable.ActivityNavigator);
            AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
            setTargetPackage(parseApplicationId(context, typedArrayObtainAttributes.getString(C2825R.styleable.ActivityNavigator_targetPackage)));
            String string = typedArrayObtainAttributes.getString(C2825R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                setComponentName(new ComponentName(context, string));
            }
            setAction(typedArrayObtainAttributes.getString(C2825R.styleable.ActivityNavigator_action));
            String applicationId = parseApplicationId(context, typedArrayObtainAttributes.getString(C2825R.styleable.ActivityNavigator_data));
            if (applicationId != null) {
                setData(Uri.parse(applicationId));
            }
            setDataPattern(parseApplicationId(context, typedArrayObtainAttributes.getString(C2825R.styleable.ActivityNavigator_dataPattern)));
            typedArrayObtainAttributes.recycle();
        }

        @NotNull
        public final Destination setAction(@Nullable String action) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC5830k.m5327d(intent);
            intent.setAction(action);
            return this;
        }

        @NotNull
        public final Destination setComponentName(@Nullable ComponentName name) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC5830k.m5327d(intent);
            intent.setComponent(name);
            return this;
        }

        @NotNull
        public final Destination setData(@Nullable Uri data) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC5830k.m5327d(intent);
            intent.setData(data);
            return this;
        }

        @NotNull
        public final Destination setDataPattern(@Nullable String dataPattern) {
            this.dataPattern = dataPattern;
            return this;
        }

        @NotNull
        public final Destination setIntent(@Nullable Intent intent) {
            this.intent = intent;
            return this;
        }

        @NotNull
        public final Destination setTargetPackage(@Nullable String packageName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC5830k.m5327d(intent);
            intent.setPackage(packageName);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
        @NotNull
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String string = sb.toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(@NotNull NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            AbstractC5830k.m5330g(navigatorProvider, "navigatorProvider");
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m5110d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "flags", "", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "<init>", "(ILandroidx/core/app/ActivityOptionsCompat;)V", "getFlags", "()I", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "Builder", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Extras implements Navigator.Extras {

        @Nullable
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m5110d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "<init>", "()V", "flags", "", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "addFlags", "setActivityOptions", "build", "Landroidx/navigation/ActivityNavigator$Extras;", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Builder {

            @Nullable
            private ActivityOptionsCompat activityOptions;
            private int flags;

            @NotNull
            public final Builder addFlags(int flags) {
                this.flags = flags | this.flags;
                return this;
            }

            @NotNull
            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            @NotNull
            public final Builder setActivityOptions(@NotNull ActivityOptionsCompat activityOptions) {
                AbstractC5830k.m5330g(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i, @Nullable ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i;
            this.activityOptions = activityOptionsCompat;
        }

        @Nullable
        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(@NotNull Context context) {
        Object next;
        AbstractC5830k.m5330g(context, "context");
        this.context = context;
        Iterator it = AbstractC6833k.m6495v(context, new C2826a(0)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) next;
    }

    @JvmStatic
    public static final void applyPopAnimationsToPendingTransition(@NotNull Activity activity) {
        INSTANCE.applyPopAnimationsToPendingTransition(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context hostActivity$lambda$0(Context it) {
        AbstractC5830k.m5330g(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.Navigator
    @NotNull
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    @Nullable
    public NavDestination navigate(@NotNull Destination destination, @Nullable Bundle args, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        ActivityOptionsCompat activityOptions;
        Intent intent;
        int intExtra;
        String strEncode;
        AbstractC5830k.m5330g(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    Bundle bundleM13597constructorimpl = SavedStateReader.m13597constructorimpl(args);
                    String strGroup = matcher.group(1);
                    AbstractC5830k.m5327d(strGroup);
                    if (!SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + args + " to fill data pattern " + dataPattern).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    NavArgument navArgument = destination.getArguments().get(strGroup);
                    NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                    if (type == null || (strEncode = type.serializeAsValue(type.get(args, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(args.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z8 = navigatorExtras instanceof Extras;
        if (z8) {
            intent2.addFlags(((Extras) navigatorExtras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) != 0) {
            intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
        }
        intent2.putExtra(EXTRA_NAV_CURRENT, destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !AbstractC5830k.m5325b(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !AbstractC5830k.m5325b(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                AbstractC5830k.m5327d(intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim));
            } else {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (!z8 || (activityOptions = ((Extras) navigatorExtras).getActivityOptions()) == null) {
            this.context.startActivity(intent2);
        } else {
            ContextCompat.startActivity(this.context, intent2, activityOptions.toBundle());
        }
        if (navOptions != null && this.hostActivity != null) {
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && AbstractC5830k.m5325b(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && AbstractC5830k.m5325b(resources.getResourceTypeName(exitAnim), "animator"))) {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                if (enterAnim < 0) {
                    enterAnim = 0;
                }
                this.hostActivity.overridePendingTransition(enterAnim, exitAnim >= 0 ? exitAnim : 0);
            }
        }
        return null;
    }
}
