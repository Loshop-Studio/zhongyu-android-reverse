package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import androidx.navigation.common.C2829R;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m5109d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0011\u001a\u00020%2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006*"}, m5110d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/res/Resources;", SourceRouterRecord.SOURCE_RES_IMAGE, "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Landroidx/navigation/NavDestination;", "inflate", "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Landroidx/navigation/NavDestination;", "dest", "Ld6/s;", "inflateArgumentForDestination", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "inflateArgumentForBundle", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "a", "Landroidx/navigation/NavArgument;", "inflateArgument", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Landroidx/navigation/NavArgument;", "inflateDeepLink", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;)V", "inflateAction", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "Landroidx/navigation/NavGraph;", "(I)Landroidx/navigation/NavGraph;", "Landroid/content/Context;", "Landroidx/navigation/NavigatorProvider;", "Companion", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavInflater.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.android.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n+ 5 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 9 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,367:1\n1#2:368\n1#2:408\n233#3,3:369\n233#3,3:372\n233#3,3:375\n233#3,3:378\n52#4,8:381\n60#4:412\n27#5:389\n46#5:390\n32#5,4:391\n31#5,7:401\n126#6:395\n153#6,3:396\n37#7,2:399\n106#8:409\n90#8:411\n46#9:410\n*S KotlinDebug\n*F\n+ 1 NavInflater.android.kt\nandroidx/navigation/NavInflater\n*L\n314#1:408\n112#1:369,3\n130#1:372,3\n146#1:375,3\n263#1:378,3\n297#1:381,8\n297#1:412\n314#1:389\n314#1:390\n314#1:391,4\n314#1:401,7\n314#1:395\n314#1:396,3\n314#1:399,2\n314#1:409\n334#1:411\n314#1:410\n*E\n"})
/* loaded from: classes2.dex */
public final class NavInflater {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";

    @NotNull
    private static final String TAG_ACTION = "action";

    @NotNull
    private static final String TAG_ARGUMENT = "argument";

    @NotNull
    private static final String TAG_DEEP_LINK = "deepLink";

    @NotNull
    private static final String TAG_INCLUDE = "include";

    @NotNull
    private final Context context;

    @NotNull
    private final NavigatorProvider navigatorProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m5110d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "<init>", "()V", "TAG_ARGUMENT", "", "TAG_DEEP_LINK", "TAG_ACTION", "TAG_INCLUDE", "APPLICATION_ID_PLACEHOLDER", "sTmpValue", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "checkNavType", "Landroidx/navigation/NavType;", "value", "navType", "expectedNavType", "argType", "foundType", "checkNavType$navigation_runtime_release", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final NavType<?> checkNavType$navigation_runtime_release(@NotNull TypedValue value, @Nullable NavType<?> navType, @NotNull NavType<?> expectedNavType, @Nullable String argType, @NotNull String foundType) throws XmlPullParserException {
            AbstractC5830k.m5330g(value, "value");
            AbstractC5830k.m5330g(expectedNavType, "expectedNavType");
            AbstractC5830k.m5330g(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            StringBuilder sbM101z = AbstractC0037f.m101z("Type is ", argType, " but found ", foundType, ": ");
            sbM101z.append(value.data);
            throw new XmlPullParserException(sbM101z.toString());
        }

        private Companion() {
        }
    }

    public NavInflater(@NotNull Context context, @NotNull NavigatorProvider navigatorProvider) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void inflateAction(Resources res, NavDestination dest, AttributeSet attrs, XmlResourceParser parser, int graphResId) throws XmlPullParserException, IOException {
        Pair[] pairArr;
        int depth;
        Context context = this.context;
        int[] NavAction = C2829R.styleable.NavAction;
        AbstractC5830k.m5329f(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(typedArrayObtainStyledAttributes.getBoolean(C2829R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(typedArrayObtainStyledAttributes.getBoolean(C2829R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(C2829R.styleable.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(C2829R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(typedArrayObtainStyledAttributes.getResourceId(C2829R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && TAG_ARGUMENT.equals(parser.getName())) {
                inflateArgumentForBundle(res, bundleBundleOf, attrs, graphResId);
            }
        }
        if (!SavedStateReader.m13675isEmptyimpl(SavedStateReader.m13597constructorimpl(bundleBundleOf))) {
            navAction.setDefaultArguments(bundleBundleOf);
        }
        dest.putAction(resourceId, navAction);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray a9, Resources res, int graphResId) throws XmlPullParserException {
        int iValueOf;
        NavArgument.Builder builder = new NavArgument.Builder();
        builder.setIsNullable(a9.getBoolean(C2829R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = a9.getString(C2829R.styleable.NavArgument_argType);
        Object value = null;
        NavType<Object> navTypeFromArgType = string != null ? NavType.INSTANCE.fromArgType(string, res.getResourcePackageName(graphResId)) : null;
        if (a9.getValue(C2829R.styleable.NavArgument_android_defaultValue, typedValue2)) {
            NavType<Object> navType = NavType.ReferenceType;
            if (navTypeFromArgType == navType) {
                int i = typedValue2.resourceId;
                if (i != 0) {
                    iValueOf = Integer.valueOf(i);
                } else {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + navTypeFromArgType.getName() + ". Must be a reference to a resource.");
                    }
                    iValueOf = 0;
                }
                value = iValueOf;
            } else {
                int i8 = typedValue2.resourceId;
                if (i8 != 0) {
                    if (navTypeFromArgType != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + navTypeFromArgType.getName() + ". You must use a \"" + navType.getName() + "\" type to reference other resources.");
                    }
                    value = Integer.valueOf(i8);
                    navTypeFromArgType = navType;
                } else if (navTypeFromArgType == NavType.StringType) {
                    value = a9.getString(C2829R.styleable.NavArgument_android_defaultValue);
                } else {
                    int i9 = typedValue2.type;
                    if (i9 == 3) {
                        String string2 = typedValue2.string.toString();
                        if (navTypeFromArgType == null) {
                            navTypeFromArgType = NavType.INSTANCE.inferFromValue(string2);
                        }
                        value = navTypeFromArgType.parseValue(string2);
                    } else if (i9 == 4) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                        value = Float.valueOf(typedValue2.getFloat());
                    } else if (i9 == 5) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                        value = Integer.valueOf((int) typedValue2.getDimension(res.getDisplayMetrics()));
                    } else if (i9 == 18) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                        value = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i9 < 16 || i9 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        NavType<Object> navType2 = NavType.FloatType;
                        if (navTypeFromArgType == navType2) {
                            navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, navType2, string, TypedValues.Custom.S_FLOAT);
                            value = Float.valueOf(typedValue2.data);
                        } else {
                            navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue2, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_INT);
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

    private final void inflateArgumentForBundle(Resources res, Bundle savedState, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C2829R.styleable.NavArgument);
        AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(C2829R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        NavArgument navArgumentInflateArgument = inflateArgument(typedArrayObtainAttributes, res, graphResId);
        if (navArgumentInflateArgument.getIsDefaultValuePresent()) {
            navArgumentInflateArgument.putDefaultValue(string, savedState);
        }
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateArgumentForDestination(Resources res, NavDestination dest, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C2829R.styleable.NavArgument);
        AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(C2829R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        dest.addArgument(string, inflateArgument(typedArrayObtainAttributes, res, graphResId));
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateDeepLink(Resources res, NavDestination dest, AttributeSet attrs) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, C2829R.styleable.NavDeepLink);
        AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(C2829R.styleable.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(C2829R.styleable.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(C2829R.styleable.NavDeepLink_mimeType);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            AbstractC5830k.m5329f(packageName, "getPackageName(...)");
            builder.setUriPattern(AbstractC5862w.m5407A(string, APPLICATION_ID_PLACEHOLDER, packageName));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.context.getPackageName();
            AbstractC5830k.m5329f(packageName2, "getPackageName(...)");
            builder.setAction(AbstractC5862w.m5407A(string2, APPLICATION_ID_PLACEHOLDER, packageName2));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            AbstractC5830k.m5329f(packageName3, "getPackageName(...)");
            builder.setMimeType(AbstractC5862w.m5407A(string3, APPLICATION_ID_PLACEHOLDER, packageName3));
        }
        dest.addDeepLink(builder.build());
        typedArrayObtainAttributes.recycle();
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    public final NavGraph inflate(@NavigationRes int graphResId) throws Resources.NotFoundException {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(graphResId);
        AbstractC5830k.m5329f(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(graphResId) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        AbstractC5830k.m5327d(attributeSetAsAttributeSet);
        NavDestination navDestinationInflate = inflate(resources, xml, attributeSetAsAttributeSet, graphResId);
        if (navDestinationInflate instanceof NavGraph) {
            return (NavGraph) navDestinationInflate;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    private final NavDestination inflate(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = parser.getName();
        AbstractC5830k.m5329f(name, "getName(...)");
        NavDestination navDestinationCreateDestination = navigatorProvider.getNavigator(name).createDestination();
        navDestinationCreateDestination.onInflate(this.context, attrs);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = parser.getName();
                if (TAG_ARGUMENT.equals(name2)) {
                    inflateArgumentForDestination(res, navDestinationCreateDestination, attrs, graphResId);
                } else if (TAG_DEEP_LINK.equals(name2)) {
                    inflateDeepLink(res, navDestinationCreateDestination, attrs);
                } else if (TAG_ACTION.equals(name2)) {
                    inflateAction(res, navDestinationCreateDestination, attrs, parser, graphResId);
                } else {
                    Resources resources = res;
                    XmlResourceParser xmlResourceParser = parser;
                    AttributeSet attributeSet = attrs;
                    int i = graphResId;
                    if (TAG_INCLUDE.equals(name2) && (navDestinationCreateDestination instanceof NavGraph)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C2825R.styleable.NavInclude);
                        AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
                        ((NavGraph) navDestinationCreateDestination).addDestination(inflate(typedArrayObtainAttributes.getResourceId(C2825R.styleable.NavInclude_graph, 0)));
                        typedArrayObtainAttributes.recycle();
                    } else if (navDestinationCreateDestination instanceof NavGraph) {
                        ((NavGraph) navDestinationCreateDestination).addDestination(inflate(resources, xmlResourceParser, attributeSet, i));
                    }
                    res = resources;
                    attrs = attributeSet;
                    parser = xmlResourceParser;
                    graphResId = i;
                }
            }
        }
        return navDestinationCreateDestination;
    }
}
