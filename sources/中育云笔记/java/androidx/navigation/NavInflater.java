package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import androidx.navigation.common.C4064R;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.xmlpull.v1.XmlPullParserException;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p310qd.AbstractC10819z;

/* loaded from: classes.dex */
public final class NavInflater {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private final Context context;
    private final NavigatorProvider navigatorProvider;
    public static final Companion Companion = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final NavType<?> checkNavType$navigation_runtime_release(TypedValue value, NavType<?> navType, NavType<?> expectedNavType, String str, String foundType) throws XmlPullParserException {
            AbstractC9979u.m20294g(value, "value");
            AbstractC9979u.m20294g(expectedNavType, "expectedNavType");
            AbstractC9979u.m20294g(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }

        private Companion() {
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        Pair[] pairArr;
        int depth;
        Context context = this.context;
        int[] NavAction = C4064R.styleable.NavAction;
        AbstractC9979u.m20293f(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(typedArrayObtainStyledAttributes.getBoolean(C4064R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(typedArrayObtainStyledAttributes.getBoolean(C4064R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(C4064R.styleable.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(C4064R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(typedArrayObtainStyledAttributes.getResourceId(C4064R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && AbstractC9979u.m20289b(TAG_ARGUMENT, xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundleBundleOf, attributeSet, i10);
            }
        }
        if (!SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(bundleBundleOf))) {
            navAction.setDefaultArguments(bundleBundleOf);
        }
        navDestination.putAction(resourceId, navAction);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        int iValueOf;
        NavArgument.Builder builder = new NavArgument.Builder();
        builder.setIsNullable(typedArray.getBoolean(C4064R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = typedArray.getString(C4064R.styleable.NavArgument_argType);
        Object value = null;
        NavType<Object> navTypeFromArgType = string != null ? NavType.Companion.fromArgType(string, resources.getResourcePackageName(i10)) : null;
        if (typedArray.getValue(C4064R.styleable.NavArgument_android_defaultValue, typedValue2)) {
            NavType<Object> navType = NavType.ReferenceType;
            if (navTypeFromArgType == navType) {
                int i11 = typedValue2.resourceId;
                if (i11 != 0) {
                    iValueOf = Integer.valueOf(i11);
                } else {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + navTypeFromArgType.getName() + ". Must be a reference to a resource.");
                    }
                    iValueOf = 0;
                }
                value = iValueOf;
            } else {
                int i12 = typedValue2.resourceId;
                if (i12 != 0) {
                    if (navTypeFromArgType != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + navTypeFromArgType.getName() + ". You must use a \"" + navType.getName() + "\" type to reference other resources.");
                    }
                    value = Integer.valueOf(i12);
                    navTypeFromArgType = navType;
                } else if (navTypeFromArgType == NavType.StringType) {
                    value = typedArray.getString(C4064R.styleable.NavArgument_android_defaultValue);
                } else {
                    int i13 = typedValue2.type;
                    if (i13 == 3) {
                        String string2 = typedValue2.string.toString();
                        if (navTypeFromArgType == null) {
                            navTypeFromArgType = NavType.Companion.inferFromValue(string2);
                        }
                        value = navTypeFromArgType.parseValue(string2);
                    } else if (i13 == 4) {
                        navTypeFromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                        value = Float.valueOf(typedValue2.getFloat());
                    } else if (i13 == 5) {
                        navTypeFromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                        value = Integer.valueOf((int) typedValue2.getDimension(resources.getDisplayMetrics()));
                    } else if (i13 == 18) {
                        navTypeFromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                        value = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i13 < 16 || i13 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        NavType<Object> navType2 = NavType.FloatType;
                        if (navTypeFromArgType == navType2) {
                            navTypeFromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, navType2, string, TypedValues.Custom.S_FLOAT);
                            value = Float.valueOf(typedValue2.data);
                        } else {
                            navTypeFromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_INT);
                            value = Integer.valueOf(typedValue2.data);
                        }
                    }
                }
            }
        }
        if (value != null) {
            builder.setDefaultValue(value);
        }
        if (navTypeFromArgType != null) {
            builder.setType(navTypeFromArgType);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C4064R.styleable.NavArgument);
        AbstractC9979u.m20293f(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(C4064R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        NavArgument navArgumentInflateArgument = inflateArgument(typedArrayObtainAttributes, resources, i10);
        if (navArgumentInflateArgument.isDefaultValuePresent()) {
            navArgumentInflateArgument.putDefaultValue(string, bundle);
        }
        C10786q c10786q = C10786q.f26013a;
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C4064R.styleable.NavArgument);
        AbstractC9979u.m20293f(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(C4064R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        navDestination.addArgument(string, inflateArgument(typedArrayObtainAttributes, resources, i10));
        C10786q c10786q = C10786q.f26013a;
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C4064R.styleable.NavDeepLink);
        AbstractC9979u.m20293f(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(C4064R.styleable.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(C4064R.styleable.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(C4064R.styleable.NavDeepLink_mimeType);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            AbstractC9979u.m20293f(packageName, "getPackageName(...)");
            builder.setUriPattern(AbstractC10819z.m23238K(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.context.getPackageName();
            AbstractC9979u.m20293f(packageName2, "getPackageName(...)");
            builder.setAction(AbstractC10819z.m23238K(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            AbstractC9979u.m20293f(packageName3, "getPackageName(...)");
            builder.setMimeType(AbstractC10819z.m23238K(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, null));
        }
        navDestination.addDeepLink(builder.build());
        C10786q c10786q = C10786q.f26013a;
        typedArrayObtainAttributes.recycle();
    }

    @SuppressLint({"ResourceType"})
    public final NavGraph inflate(@NavigationRes int i10) throws Resources.NotFoundException {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        AbstractC9979u.m20293f(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        AbstractC9979u.m20291d(resources);
        AbstractC9979u.m20291d(attributeSetAsAttributeSet);
        NavDestination navDestinationInflate = inflate(resources, xml, attributeSetAsAttributeSet, i10);
        if (navDestinationInflate instanceof NavGraph) {
            return (NavGraph) navDestinationInflate;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    private final NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = xmlResourceParser.getName();
        AbstractC9979u.m20293f(name, "getName(...)");
        NavDestination navDestinationCreateDestination = navigatorProvider.getNavigator(name).createDestination();
        navDestinationCreateDestination.onInflate(this.context, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (AbstractC9979u.m20289b(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(resources, navDestinationCreateDestination, attributeSet, i10);
                } else if (AbstractC9979u.m20289b(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(resources, navDestinationCreateDestination, attributeSet);
                } else if (AbstractC9979u.m20289b(TAG_ACTION, name2)) {
                    inflateAction(resources, navDestinationCreateDestination, attributeSet, xmlResourceParser, i10);
                } else {
                    Resources resources2 = resources;
                    XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                    AttributeSet attributeSet2 = attributeSet;
                    int i11 = i10;
                    if (AbstractC9979u.m20289b(TAG_INCLUDE, name2) && (navDestinationCreateDestination instanceof NavGraph)) {
                        TypedArray typedArrayObtainAttributes = resources2.obtainAttributes(attributeSet2, C4057R.styleable.NavInclude);
                        AbstractC9979u.m20293f(typedArrayObtainAttributes, "obtainAttributes(...)");
                        ((NavGraph) navDestinationCreateDestination).addDestination(inflate(typedArrayObtainAttributes.getResourceId(C4057R.styleable.NavInclude_graph, 0)));
                        C10786q c10786q = C10786q.f26013a;
                        typedArrayObtainAttributes.recycle();
                    } else if (navDestinationCreateDestination instanceof NavGraph) {
                        ((NavGraph) navDestinationCreateDestination).addDestination(inflate(resources2, xmlResourceParser2, attributeSet2, i11));
                    }
                    resources = resources2;
                    attributeSet = attributeSet2;
                    xmlResourceParser = xmlResourceParser2;
                    i10 = i11;
                }
            }
        }
        return navDestinationCreateDestination;
    }
}
