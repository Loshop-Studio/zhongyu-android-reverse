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
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.savedstate.SavedStateReader;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p101f8.AbstractC8476n;
import p113g8.AbstractC8687z;
import p300x7.InterfaceC10570l;

@Navigator.Name("activity")
/* loaded from: classes3.dex */
public class ActivityNavigator extends Navigator<Destination> {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";
    private static final String LOG_TAG = "ActivityNavigator";
    private final Context context;
    private final Activity hostActivity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final void applyPopAnimationsToPendingTransition(Activity activity) {
            AbstractC9133u.m16133g(activity, "activity");
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

    @NavDestination.ClassType(Activity.class)
    public static class Destination extends NavDestination {
        private String action;
        private ComponentName component;
        private Uri data;
        private String dataPattern;
        private Intent intent;
        private String targetPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> activityNavigator) {
            super(activityNavigator);
            AbstractC9133u.m16133g(activityNavigator, "activityNavigator");
        }

        private final String parseApplicationId(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            AbstractC9133u.m16132f(packageName, "getPackageName(...)");
            return AbstractC8687z.m14101I(str, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null);
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Destination) && super.equals(obj)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((Destination) obj).intent) : ((Destination) obj).intent == null) && AbstractC9133u.m16128b(this.dataPattern, ((Destination) obj).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public final String getDataPattern() {
            return this.dataPattern;
        }

        public final Intent getIntent() {
            return this.intent;
        }

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
        public void onInflate(Context context, AttributeSet attrs) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C4181R.styleable.ActivityNavigator);
            AbstractC9133u.m16132f(typedArrayObtainAttributes, "obtainAttributes(...)");
            setTargetPackage(parseApplicationId(context, typedArrayObtainAttributes.getString(C4181R.styleable.ActivityNavigator_targetPackage)));
            String string = typedArrayObtainAttributes.getString(C4181R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                setComponentName(new ComponentName(context, string));
            }
            setAction(typedArrayObtainAttributes.getString(C4181R.styleable.ActivityNavigator_action));
            String applicationId = parseApplicationId(context, typedArrayObtainAttributes.getString(C4181R.styleable.ActivityNavigator_data));
            if (applicationId != null) {
                setData(Uri.parse(applicationId));
            }
            setDataPattern(parseApplicationId(context, typedArrayObtainAttributes.getString(C4181R.styleable.ActivityNavigator_dataPattern)));
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setAction(String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC9133u.m16130d(intent);
            intent.setAction(str);
            return this;
        }

        public final Destination setComponentName(ComponentName componentName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC9133u.m16130d(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final Destination setData(Uri uri) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC9133u.m16130d(intent);
            intent.setData(uri);
            return this;
        }

        public final Destination setDataPattern(String str) {
            this.dataPattern = str;
            return this;
        }

        public final Destination setIntent(Intent intent) {
            this.intent = intent;
            return this;
        }

        public final Destination setTargetPackage(String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC9133u.m16130d(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
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
            AbstractC9133u.m16132f(string, "toString(...)");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            AbstractC9133u.m16133g(navigatorProvider, "navigatorProvider");
        }
    }

    public static final class Extras implements Navigator.Extras {
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        public static final class Builder {
            private ActivityOptionsCompat activityOptions;
            private int flags;

            public final Builder addFlags(int i10) {
                this.flags = i10 | this.flags;
                return this;
            }

            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            public final Builder setActivityOptions(ActivityOptionsCompat activityOptions) {
                AbstractC9133u.m16133g(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i10, ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i10;
            this.activityOptions = activityOptionsCompat;
        }

        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(Context context) {
        Object next;
        AbstractC9133u.m16133g(context, "context");
        this.context = context;
        Iterator it = AbstractC8476n.m13833h(context, new InterfaceC10570l() { // from class: androidx.navigation.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ActivityNavigator.hostActivity$lambda$0((Context) obj);
            }
        }).iterator();
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

    public static final void applyPopAnimationsToPendingTransition(Activity activity) {
        Companion.applyPopAnimationsToPendingTransition(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context hostActivity$lambda$0(Context it) {
        AbstractC9133u.m16133g(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
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
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public NavDestination navigate(Destination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        ActivityOptionsCompat activityOptions;
        Intent intent;
        int intExtra;
        String strEncode;
        AbstractC9133u.m16133g(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
                    String strGroup = matcher.group(1);
                    AbstractC9133u.m16130d(strGroup);
                    if (!SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + dataPattern).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    NavArgument navArgument = destination.getArguments().get(strGroup);
                    NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                    if (type == null || (strEncode = type.serializeAsValue(type.get(bundle, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(bundle.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = extras instanceof Extras;
        if (z10) {
            intent2.addFlags(((Extras) extras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
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
            if ((popEnterAnim <= 0 || !AbstractC9133u.m16128b(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !AbstractC9133u.m16128b(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                AbstractC9133u.m16130d(intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim));
            } else {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (!z10 || (activityOptions = ((Extras) extras).getActivityOptions()) == null) {
            this.context.startActivity(intent2);
        } else {
            ContextCompat.startActivity(this.context, intent2, activityOptions.toBundle());
        }
        if (navOptions != null && this.hostActivity != null) {
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && AbstractC9133u.m16128b(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && AbstractC9133u.m16128b(resources.getResourceTypeName(exitAnim), "animator"))) {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                this.hostActivity.overridePendingTransition(AbstractC8323h.m13510e(enterAnim, 0), AbstractC8323h.m13510e(exitAnim, 0));
            }
        }
        return null;
    }
}
