package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlin.text.C5849j;
import kotlin.text.C5852m;
import kotlin.text.C5853n;
import kotlin.text.InterfaceC5850k;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b(\u0018\u0000 \u0083\u00012\u00020\u0001:\b\u0084\u0001\u0085\u0001\u0086\u0001\u0083\u0001B'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\b\u001a\u00060\nj\u0002`\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\r\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\n\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001f\u001a\u00060\u001aj\u0002`\u001b2\u000e\u0010\u0016\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010#\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010(J1\u0010/\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)2\n\u0010-\u001a\u00060+j\u0002`,H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b1\u0010\u000eJ\u0019\u00102\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b4\u00103J;\u00107\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u00010\u00022\n\u00106\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002¢\u0006\u0004\b7\u00108J9\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u0002092\n\u00106\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002¢\u0006\u0004\b;\u0010<J=\u0010=\u001a\u00020\f2\n\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\n\u00106\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002¢\u0006\u0004\b=\u0010>JG\u0010C\u001a\u00020\f2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020?2\u0006\u0010B\u001a\u00020A2\n\u00106\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002¢\u0006\u0004\bC\u0010DJ5\u0010H\u001a\u00020.2\n\u00106\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010E\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bH\u0010IJ7\u0010J\u001a\u00020\f2\n\u00106\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010E\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u00022\b\u0010G\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020.H\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020A0NH\u0002¢\u0006\u0004\bO\u0010PJ#\u0010R\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020)\u0012\u0004\u0012\u00020\u0002\u0018\u00010QH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020.H\u0002¢\u0006\u0004\bT\u0010MJ\u0013\u0010U\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\bU\u0010VR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bZ\u0010YR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\b[\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010WR\u001d\u0010d\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001b\u0010f\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010a\u001a\u0004\bf\u0010gR'\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020A0N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010a\u001a\u0004\bi\u0010PR\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR/\u0010o\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020)\u0012\u0004\u0012\u00020\u0002\u0018\u00010Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010a\u001a\u0004\bn\u0010SR!\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010a\u001a\u0004\bq\u0010rR\u001d\u0010v\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010a\u001a\u0004\bu\u0010YR\u001d\u0010y\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010a\u001a\u0004\bx\u0010cR\u0018\u0010z\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010WR\u001d\u0010}\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010a\u001a\u0004\b|\u0010cR+\u0010~\u001a\u00020\f2\u0006\u0010F\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010l\u001a\u0004\b~\u0010g\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020?8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010r¨\u0006\u0087\u0001"}, m5110d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "", "matches$navigation_common_release", "(Landroid/net/Uri;)Z", "matches", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "", "getMimeTypeMatchRating", "(Ljava/lang/String;)I", "deepLink", "", "Landroidx/navigation/NavArgument;", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "getMatchingArguments", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "getMatchingPathAndQueryArgs$navigation_common_release", "getMatchingPathAndQueryArgs", "requestedLink", "calculateMatchingPathSegments$navigation_common_release", "(Landroid/net/Uri;)I", "calculateMatchingPathSegments", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Ld6/s;", "buildRegex", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "matchUri", "matchAction", "(Ljava/lang/String;)Z", "matchMimeType", "fragment", "savedState", "getMatchingUriFragment", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Lkotlin/text/k;", "result", "getMatchingPathArguments", "(Lkotlin/text/k;Landroid/os/Bundle;Ljava/util/Map;)Z", "getMatchingQueryArguments", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Landroidx/navigation/NavDeepLink$ParamQuery;", "storedParam", "parseInputParams", "(Ljava/util/List;Landroidx/navigation/NavDeepLink$ParamQuery;Landroid/os/Bundle;Ljava/util/Map;)Z", HintConstants.AUTOFILL_HINT_NAME, "value", "argument", "parseArgument", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "parseArgumentForRepeatedParam", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)Z", "parsePath", "()V", "", "parseQuery", "()Ljava/util/Map;", "Lkotlin/Pair;", "parseFragment", "()Lkotlin/Pair;", "parseMime", "saveWildcardInRegex", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "getAction", "getMimeType", "pathArgs", "Ljava/util/List;", "pathRegex", "Lkotlin/text/Regex;", "pathPattern$delegate", "Ld6/e;", "getPathPattern", "()Lkotlin/text/Regex;", "pathPattern", "isParameterizedQuery$delegate", "isParameterizedQuery", "()Z", "queryArgsMap$delegate", "getQueryArgsMap", "queryArgsMap", "isSingleQueryParamValueOnly", "Z", "fragArgsAndRegex$delegate", "getFragArgsAndRegex", "fragArgsAndRegex", "fragArgs$delegate", "getFragArgs", "()Ljava/util/List;", "fragArgs", "fragRegex$delegate", "getFragRegex", "fragRegex", "fragPattern$delegate", "getFragPattern", "fragPattern", "mimeTypeRegex", "mimeTypePattern$delegate", "getMimeTypePattern", "mimeTypePattern", "isExactDeepLink", "setExactDeepLink$navigation_common_release", "(Z)V", "getArgumentsNames$navigation_common_release", "argumentsNames", "Companion", "ParamQuery", "MimeType", "Builder", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,835:1\n1368#2:836\n1454#2,5:837\n1567#2:886\n1598#2,3:887\n1601#2:891\n1567#2:892\n1598#2,4:893\n1863#2,2:921\n1863#2:923\n1567#2:925\n1598#2,3:926\n1601#2:930\n1864#2:931\n27#3:842\n46#3:843\n32#3,4:844\n31#3,7:854\n27#3:864\n46#3:865\n32#3,4:866\n31#3,7:876\n27#3:899\n46#3:900\n32#3,4:901\n31#3,7:911\n126#4:848\n153#4,3:849\n126#4:870\n153#4,3:871\n216#4,2:897\n126#4:905\n153#4,3:906\n37#5,2:852\n37#5,2:874\n37#5,2:909\n1#6:861\n1#6:883\n1#6:890\n1#6:918\n1#6:924\n106#7:862\n106#7:884\n106#7:919\n90#7:929\n106#7:932\n106#7:933\n90#7:934\n90#7:935\n46#8:863\n46#8:885\n46#8:920\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n84#1:836\n84#1:837,5\n229#1:886\n229#1:887,3\n229#1:891\n246#1:892\n246#1:893,4\n307#1:921,2\n316#1:923\n325#1:925\n325#1:926,3\n325#1:930\n316#1:931\n186#1:842\n186#1:843\n186#1:844,4\n186#1:854,7\n210#1:864\n210#1:865\n210#1:866,4\n210#1:876,7\n305#1:899\n305#1:900\n305#1:901,4\n305#1:911,7\n186#1:848\n186#1:849,3\n210#1:870\n210#1:871,3\n268#1:897,2\n305#1:905\n305#1:906,3\n186#1:852,2\n210#1:874,2\n305#1:909,2\n186#1:861\n210#1:883\n305#1:918\n186#1:862\n210#1:884\n305#1:919\n336#1:929\n352#1:932\n381#1:933\n398#1:934\n196#1:935\n186#1:863\n210#1:885\n305#1:920\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLink {

    @NotNull
    private static final String ANY_SYMBOLS_IN_THE_TAIL = "([\\s\\S]+?)?";

    @Nullable
    private final String action;

    /* renamed from: fragArgs$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e fragArgs;

    /* renamed from: fragArgsAndRegex$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e fragArgsAndRegex;

    /* renamed from: fragPattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e fragPattern;

    /* renamed from: fragRegex$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e fragRegex;
    private boolean isExactDeepLink;

    /* renamed from: isParameterizedQuery$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e isParameterizedQuery;
    private boolean isSingleQueryParamValueOnly;

    @Nullable
    private final String mimeType;

    /* renamed from: mimeTypePattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e mimeTypePattern;

    @Nullable
    private String mimeTypeRegex;

    @NotNull
    private final List<String> pathArgs;

    /* renamed from: pathPattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e pathPattern;

    @Nullable
    private String pathRegex;

    /* renamed from: queryArgsMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e queryArgsMap;

    @Nullable
    private final String uriPattern;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Regex SCHEME_PATTERN = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    @NotNull
    private static final Regex FILL_IN_PATTERN = new Regex("\\{(.+?)\\}");

    @NotNull
    private static final Regex SCHEME_REGEX = new Regex("http[s]?://");

    @NotNull
    private static final Regex WILDCARD_REGEX = new Regex(".*");

    @NotNull
    private static final Regex PATH_REGEX = new Regex("([^/]*?|)");

    @NotNull
    private static final Regex QUERY_PATTERN = new Regex("^[^?#]+\\?([^#]*).*");

    @Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0006\u001a\u00020\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u001d\b\u0002\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\f¢\u0006\u0002\b\r0\nH\u0086\b¢\u0006\u0004\b\u0006\u0010\u000fJN\u0010\u0006\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\t\u001a\u00020\u00042\u001d\b\u0002\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\f¢\u0006\u0002\b\r0\nH\u0007¢\u0006\u0004\b\u0006\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m5110d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "<init>", "()V", "", "uriPattern", "setUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "basePath", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "Ly6/c;", "route", "(Ly6/c;Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "action", "setAction", "mimeType", "setMimeType", "Landroidx/navigation/NavDeepLink;", "build", "()Landroidx/navigation/NavDeepLink;", "Ljava/lang/String;", "Companion", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String action;

        @Nullable
        private String mimeType;

        @Nullable
        private String uriPattern;

        @Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00042\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\r¢\u0006\u0002\b\u000e0\u000bH\u0087\b¢\u0006\u0004\b\u0007\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m5110d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "<init>", "()V", "", "uriPattern", "Landroidx/navigation/NavDeepLink$Builder;", "fromUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "basePath", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "action", "fromAction", "mimeType", "fromMimeType", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
                this();
            }

            public static Builder fromUriPattern$default(Companion companion, String basePath, Map typeMap, int i, Object obj) {
                if ((i & 2) != 0) {
                    typeMap = AbstractC5785e0.m5147A();
                }
                AbstractC5830k.m5330g(basePath, "basePath");
                AbstractC5830k.m5330g(typeMap, "typeMap");
                new Builder();
                AbstractC5830k.m5338o();
                throw null;
            }

            @JvmStatic
            @NotNull
            public final Builder fromAction(@NotNull String action) {
                AbstractC5830k.m5330g(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            @JvmStatic
            @NotNull
            public final Builder fromMimeType(@NotNull String mimeType) {
                AbstractC5830k.m5330g(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            @JvmStatic
            @NotNull
            public final Builder fromUriPattern(@NotNull String uriPattern) {
                AbstractC5830k.m5330g(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            private Companion() {
            }

            @JvmStatic
            public final <T> Builder fromUriPattern(String basePath, Map<InterfaceC6793q, NavType<?>> typeMap) {
                AbstractC5830k.m5330g(basePath, "basePath");
                AbstractC5830k.m5330g(typeMap, "typeMap");
                new Builder();
                AbstractC5830k.m5338o();
                throw null;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        @JvmStatic
        @NotNull
        public static final Builder fromAction(@NotNull String str) {
            return INSTANCE.fromAction(str);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromMimeType(@NotNull String str) {
            return INSTANCE.fromMimeType(str);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromUriPattern(@NotNull String str) {
            return INSTANCE.fromUriPattern(str);
        }

        public static Builder setUriPattern$default(Builder builder, String basePath, Map typeMap, int i, Object obj) {
            if ((i & 2) != 0) {
                typeMap = AbstractC5785e0.m5147A();
            }
            AbstractC5830k.m5330g(basePath, "basePath");
            AbstractC5830k.m5330g(typeMap, "typeMap");
            AbstractC5830k.m5338o();
            throw null;
        }

        @NotNull
        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @NotNull
        public final Builder setAction(@NotNull String action) {
            AbstractC5830k.m5330g(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @NotNull
        public final Builder setMimeType(@NotNull String mimeType) {
            AbstractC5830k.m5330g(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final <T> Builder setUriPattern(@NotNull InterfaceC6779c route, @NotNull String basePath) {
            AbstractC5830k.m5330g(route, "route");
            AbstractC5830k.m5330g(basePath, "basePath");
            return setUriPattern$default(this, route, basePath, null, 4, null);
        }

        public final <T> Builder setUriPattern(String basePath, Map<InterfaceC6793q, NavType<?>> typeMap) {
            AbstractC5830k.m5330g(basePath, "basePath");
            AbstractC5830k.m5330g(typeMap, "typeMap");
            AbstractC5830k.m5338o();
            throw null;
        }

        @NotNull
        public final Builder setUriPattern(@NotNull String uriPattern) {
            AbstractC5830k.m5330g(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, InterfaceC6779c interfaceC6779c, String str, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = AbstractC5785e0.m5147A();
            }
            return builder.setUriPattern(interfaceC6779c, str, map);
        }

        @JvmOverloads
        @NotNull
        public final <T> Builder setUriPattern(@NotNull InterfaceC6779c route, @NotNull String basePath, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap) {
            AbstractC5830k.m5330g(route, "route");
            AbstractC5830k.m5330g(basePath, "basePath");
            AbstractC5830k.m5330g(typeMap, "typeMap");
            this.uriPattern = RouteSerializerKt.generateRoutePattern(AbstractC6768a.m6453r(route), typeMap, basePath);
            return this;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m5110d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "<init>", "()V", "SCHEME_PATTERN", "Lkotlin/text/Regex;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "ANY_SYMBOLS_IN_THE_TAIL", "", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\u0005¨\u0006\u0010"}, m5110d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "mimeType", "", "<init>", "(Ljava/lang/String;)V", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType", "()Ljava/lang/String;", "setType", "subType", "getSubType", "setSubType", "compareTo", "", "other", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,835:1\n739#2,9:836\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n448#1:836,9\n*E\n"})
    public static final class MimeType implements Comparable<MimeType> {

        @NotNull
        private String subType;

        @NotNull
        private String type;

        public MimeType(@NotNull String mimeType) {
            List listM5245y0;
            AbstractC5830k.m5330g(mimeType, "mimeType");
            List<String> listSplit = new Regex("/").split(mimeType, 0);
            if (listSplit.isEmpty()) {
                listM5245y0 = EmptyList.INSTANCE;
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listM5245y0 = AbstractC5805t.m5245y0(listIterator.nextIndex() + 1, listSplit);
                        break;
                    }
                }
                listM5245y0 = EmptyList.INSTANCE;
            }
            this.type = (String) listM5245y0.get(0);
            this.subType = (String) listM5245y0.get(1);
        }

        @NotNull
        public final String getSubType() {
            return this.subType;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final void setSubType(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull MimeType other) {
            AbstractC5830k.m5330g(other, "other");
            int i = AbstractC5830k.m5325b(this.type, other.type) ? 2 : 0;
            return AbstractC5830k.m5325b(this.subType, other.subType) ? i + 1 : i;
        }
    }

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "<init>", "()V", "", HintConstants.AUTOFILL_HINT_NAME, "Ld6/s;", "addArgumentName", "(Ljava/lang/String;)V", "", "index", "getArgumentName", "(I)Ljava/lang/String;", "size", "()I", "paramRegex", "Ljava/lang/String;", "getParamRegex", "()Ljava/lang/String;", "setParamRegex", "", "arguments", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ParamQuery {

        @NotNull
        private final List<String> arguments = new ArrayList();

        @Nullable
        private String paramRegex;

        public final void addArgumentName(@NotNull String name) {
            AbstractC5830k.m5330g(name, "name");
            this.arguments.add(name);
        }

        @NotNull
        public final String getArgumentName(int index) {
            return this.arguments.get(index);
        }

        @NotNull
        public final List<String> getArguments() {
            return this.arguments;
        }

        @Nullable
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(@Nullable String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        final int i = 0;
        this.pathPattern = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        final int i8 = 1;
        this.isParameterizedQuery = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i9 = 2;
        this.queryArgsMap = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        final int i10 = 3;
        this.fragArgsAndRegex = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        final int i11 = 4;
        this.fragArgs = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        final int i12 = 5;
        this.fragRegex = AbstractC5773a.m5116a(lazyThreadSafetyMode, new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        final int i13 = 6;
        this.fragPattern = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        final int i14 = 7;
        this.mimeTypePattern = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: androidx.navigation.g

            /* renamed from: b */
            public final /* synthetic */ NavDeepLink f1311b;

            {
                this.f1311b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f1311b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f1311b));
                    case 2:
                        return this.f1311b.parseQuery();
                    case 3:
                        return this.f1311b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f1311b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f1311b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f1311b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f1311b);
                }
            }
        });
        parsePath();
        parseMime();
    }

    private final void buildRegex(String uri, List<String> args, StringBuilder uriRegex) {
        int i = 0;
        Object objFind$default = Regex.find$default(FILL_IN_PATTERN, uri, 0, 2, null);
        while (objFind$default != null) {
            C5852m c5852m = (C5852m) objFind$default;
            C5849j c5849jM5369a = c5852m.f9266c.m5369a(1);
            AbstractC5830k.m5327d(c5849jM5369a);
            args.add(c5849jM5369a.f9261a);
            if (c5852m.m5370a().f11420a > i) {
                C5853n c5853n = Regex.Companion;
                String strSubstring = uri.substring(i, c5852m.m5370a().f11420a);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                c5853n.getClass();
                String strQuote = Pattern.quote(strSubstring);
                AbstractC5830k.m5329f(strQuote, "quote(...)");
                uriRegex.append(strQuote);
            }
            uriRegex.append(PATH_REGEX.getPattern());
            i = c5852m.m5370a().f11421b + 1;
            objFind$default = c5852m.m5371b();
        }
        if (i < uri.length()) {
            C5853n c5853n2 = Regex.Companion;
            String strSubstring2 = uri.substring(i);
            AbstractC5830k.m5329f(strSubstring2, "substring(...)");
            c5853n2.getClass();
            String strQuote2 = Pattern.quote(strSubstring2);
            AbstractC5830k.m5329f(strQuote2, "quote(...)");
            uriRegex.append(strQuote2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fragArgs_delegate$lambda$5(NavDeepLink navDeepLink) {
        List<String> first;
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (first = fragArgsAndRegex.getFirst()) == null) ? new ArrayList() : first;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex fragPattern_delegate$lambda$8(NavDeepLink navDeepLink) {
        String fragRegex = navDeepLink.getFragRegex();
        if (fragRegex != null) {
            return new Regex(fragRegex, RegexOption.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fragRegex_delegate$lambda$6(NavDeepLink navDeepLink) {
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return fragArgsAndRegex.getSecond();
        }
        return null;
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs.getValue();
    }

    private final Pair<List<String>, String> getFragArgsAndRegex() {
        return (Pair) this.fragArgsAndRegex.getValue();
    }

    private final Regex getFragPattern() {
        return (Regex) this.fragPattern.getValue();
    }

    private final String getFragRegex() {
        return (String) this.fragRegex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchingArguments$lambda$13(Bundle bundle, String argName) {
        AbstractC5830k.m5330g(argName, "argName");
        return !SavedStateReader.m13598containsimpl(SavedStateReader.m13597constructorimpl(bundle), argName);
    }

    private final boolean getMatchingPathArguments(InterfaceC5850k result, Bundle savedState, Map<String, NavArgument> arguments) {
        String str;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i8 = i + 1;
            String strDecode = null;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            String str2 = (String) obj;
            C5849j c5849jM5369a = ((C5852m) result).f9266c.m5369a(i8);
            if (c5849jM5369a != null && (str = c5849jM5369a.f9261a) != null) {
                strDecode = NavUriUtils.INSTANCE.decode(str);
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(savedState, str2, strDecode, arguments.get(str2));
                arrayList.add(C5443s.f8405a);
                i = i8;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri deepLink, Bundle savedState, Map<String, NavArgument> arguments) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = deepLink.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !query.equals(deepLink.toString())) {
                queryParameters = AbstractC5806u.m5286y(query);
            }
            if (!parseInputParams(queryParameters, value, savedState, arguments)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String fragment, Bundle savedState, Map<String, NavArgument> arguments) {
        InterfaceC5850k interfaceC5850kMatchEntire;
        String str;
        Regex fragPattern = getFragPattern();
        if (fragPattern == null || (interfaceC5850kMatchEntire = fragPattern.matchEntire(String.valueOf(fragment))) == null) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(fragArgs, 10));
        int i = 0;
        for (Object obj : fragArgs) {
            int i8 = i + 1;
            String strDecode = null;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            String str2 = (String) obj;
            C5849j c5849jM5369a = ((C5852m) interfaceC5850kMatchEntire).f9266c.m5369a(i8);
            if (c5849jM5369a != null && (str = c5849jM5369a.f9261a) != null) {
                strDecode = NavUriUtils.INSTANCE.decode(str);
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(savedState, str2, strDecode, arguments.get(str2));
                arrayList.add(C5443s.f8405a);
                i = i8;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final Regex getMimeTypePattern() {
        return (Regex) this.mimeTypePattern.getValue();
    }

    private final Regex getPathPattern() {
        return (Regex) this.pathPattern.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isParameterizedQuery_delegate$lambda$2(NavDeepLink navDeepLink) {
        String str = navDeepLink.uriPattern;
        return str != null && QUERY_PATTERN.matches(str);
    }

    private final boolean matchAction(String action) {
        String str = this.action;
        if (str == null) {
            return true;
        }
        if (action == null) {
            return false;
        }
        return AbstractC5830k.m5325b(str, action);
    }

    private final boolean matchMimeType(String mimeType) {
        if (this.mimeType == null) {
            return true;
        }
        if (mimeType == null) {
            return false;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        AbstractC5830k.m5327d(mimeTypePattern);
        return mimeTypePattern.matches(mimeType);
    }

    private final boolean matchUri(Uri uri) {
        if (getPathPattern() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Regex pathPattern = getPathPattern();
        AbstractC5830k.m5327d(pathPattern);
        return pathPattern.matches(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex mimeTypePattern_delegate$lambda$10(NavDeepLink navDeepLink) {
        String str = navDeepLink.mimeTypeRegex;
        if (str != null) {
            return new Regex(str);
        }
        return null;
    }

    private final void parseArgument(Bundle savedState, String name, String value, NavArgument argument) {
        if (argument != null) {
            argument.getType().parseAndPut(savedState, name, value);
        } else {
            SavedStateWriter.m13716putStringimpl(SavedStateWriter.m13683constructorimpl(savedState), name, value);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle savedState, String name, String value, NavArgument argument) {
        if (!SavedStateReader.m13598containsimpl(SavedStateReader.m13597constructorimpl(savedState), name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        NavType<Object> type = argument.getType();
        type.parseAndPut(savedState, name, value, type.get(savedState, name));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> parseFragment() {
        String str = this.uriPattern;
        if (str == null) {
            return null;
        }
        NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
        if (navUriUtils.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = navUriUtils.parse(this.uriPattern).getFragment();
        StringBuilder sb = new StringBuilder();
        AbstractC5830k.m5327d(fragment);
        buildRegex(fragment, arrayList, sb);
        return new Pair<>(arrayList, sb.toString());
    }

    private final boolean parseInputParams(List<String> inputParams, ParamQuery storedParam, Bundle savedState, Map<String, NavArgument> arguments) {
        Pair[] pairArr;
        Object objValueOf;
        C5443s c5443s = C5443s.f8405a;
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
        Iterator<T> it = storedParam.getArguments().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = arguments.get(str);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.getIsDefaultValuePresent()) {
                CollectionNavType collectionNavType = (CollectionNavType) type;
                collectionNavType.put(bundleBundleOf, str, collectionNavType.emptyCollection());
            }
        }
        for (String str2 : inputParams) {
            String paramRegex = storedParam.getParamRegex();
            InterfaceC5850k interfaceC5850kMatchEntire = paramRegex != null ? new Regex(paramRegex).matchEntire(str2) : null;
            if (interfaceC5850kMatchEntire == null) {
                return false;
            }
            List<String> arguments2 = storedParam.getArguments();
            ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arguments2, 10));
            int i = 0;
            for (Object obj : arguments2) {
                int i8 = i + 1;
                if (i < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                String str3 = (String) obj;
                C5849j c5849jM5369a = ((C5852m) interfaceC5850kMatchEntire).f9266c.m5369a(i8);
                String str4 = c5849jM5369a != null ? c5849jM5369a.f9261a : null;
                if (str4 == null) {
                    str4 = "";
                }
                NavArgument navArgument2 = arguments.get(str3);
                if (SavedStateReader.m13598containsimpl(SavedStateReader.m13597constructorimpl(bundleBundleOf), str3)) {
                    objValueOf = Boolean.valueOf(parseArgumentForRepeatedParam(bundleBundleOf, str3, str4, navArgument2));
                    arrayList2.add(objValueOf);
                    i = i8;
                } else {
                    parseArgument(bundleBundleOf, str3, str4, navArgument2);
                    objValueOf = c5443s;
                    arrayList2.add(objValueOf);
                    i = i8;
                }
            }
        }
        SavedStateWriter.m13687putAllimpl(SavedStateWriter.m13683constructorimpl(savedState), bundleBundleOf);
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").matches(this.mimeType)) {
            throw new IllegalArgumentException(AbstractC0037f.m91p(new StringBuilder("The given mimeType "), this.mimeType, " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        this.mimeTypeRegex = AbstractC5862w.m5407A("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!SCHEME_PATTERN.containsMatchIn(this.uriPattern)) {
            sb.append(SCHEME_REGEX.getPattern());
        }
        boolean z8 = false;
        InterfaceC5850k interfaceC5850kFind$default = Regex.find$default(new Regex("(\\?|#|$)"), this.uriPattern, 0, 2, null);
        if (interfaceC5850kFind$default != null) {
            String strSubstring = this.uriPattern.substring(0, ((C5852m) interfaceC5850kFind$default).m5370a().f11420a);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            buildRegex(strSubstring, this.pathArgs, sb);
            if (!WILDCARD_REGEX.containsMatchIn(sb) && !PATH_REGEX.containsMatchIn(sb)) {
                z8 = true;
            }
            this.isExactDeepLink = z8;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        this.pathRegex = saveWildcardInRegex(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
            String str = this.uriPattern;
            AbstractC5830k.m5327d(str);
            Uri uri = navUriUtils.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = uri.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(AbstractC0037f.m91p(AbstractC0037f.m100y("Query parameter ", str2, " must only be present once in "), this.uriPattern, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) AbstractC5805t.m5229i0(queryParameters);
                if (str3 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str3 = str2;
                }
                int i = 0;
                Object objFind$default = Regex.find$default(FILL_IN_PATTERN, str3, 0, 2, null);
                ParamQuery paramQuery = new ParamQuery();
                while (objFind$default != null) {
                    C5852m c5852m = (C5852m) objFind$default;
                    C5849j c5849jM5369a = c5852m.f9266c.m5369a(1);
                    AbstractC5830k.m5327d(c5849jM5369a);
                    paramQuery.addArgumentName(c5849jM5369a.f9261a);
                    if (c5852m.m5370a().f11420a > i) {
                        String strSubstring = str3.substring(i, c5852m.m5370a().f11420a);
                        AbstractC5830k.m5329f(strSubstring, "substring(...)");
                        Regex.Companion.getClass();
                        String strQuote = Pattern.quote(strSubstring);
                        AbstractC5830k.m5329f(strQuote, "quote(...)");
                        sb.append(strQuote);
                    }
                    sb.append(ANY_SYMBOLS_IN_THE_TAIL);
                    i = c5852m.m5370a().f11421b + 1;
                    objFind$default = c5852m.m5371b();
                }
                if (i < str3.length()) {
                    C5853n c5853n = Regex.Companion;
                    String strSubstring2 = str3.substring(i);
                    AbstractC5830k.m5329f(strSubstring2, "substring(...)");
                    c5853n.getClass();
                    String strQuote2 = Pattern.quote(strSubstring2);
                    AbstractC5830k.m5329f(strQuote2, "quote(...)");
                    sb.append(strQuote2);
                }
                sb.append("$");
                String string = sb.toString();
                AbstractC5830k.m5329f(string, "toString(...)");
                paramQuery.setParamRegex(saveWildcardInRegex(string));
                linkedHashMap.put(str2, paramQuery);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex pathPattern_delegate$lambda$1(NavDeepLink navDeepLink) {
        String str = navDeepLink.pathRegex;
        if (str != null) {
            return new Regex(str, RegexOption.IGNORE_CASE);
        }
        return null;
    }

    private final String saveWildcardInRegex(String str) {
        return (AbstractC5855p.m5372F(str, "\\Q", false) && AbstractC5855p.m5372F(str, "\\E", false)) ? AbstractC5862w.m5407A(str, ".*", "\\E.*\\Q") : AbstractC5855p.m5372F(str, "\\.\\*", false) ? AbstractC5862w.m5407A(str, "\\.\\*", ".*") : str;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(@Nullable Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        List<String> pathSegments = requestedLink.getPathSegments();
        List<String> other = NavUriUtils.INSTANCE.parse(this.uriPattern).getPathSegments();
        AbstractC5830k.m5330g(pathSegments, "<this>");
        AbstractC5830k.m5330g(other, "other");
        Set setM5220G0 = AbstractC5805t.m5220G0(pathSegments);
        setM5220G0.retainAll(other);
        return setM5220G0.size();
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && (other instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) other;
            if (AbstractC5830k.m5325b(this.uriPattern, navDeepLink.uriPattern) && AbstractC5830k.m5325b(this.action, navDeepLink.action) && AbstractC5830k.m5325b(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> collectionValues = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC5810y.m5291S(((ParamQuery) it.next()).getArguments(), arrayList);
        }
        return AbstractC5805t.m5240t0(AbstractC5805t.m5240t0(list, arrayList), getFragArgs());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle getMatchingArguments(@NotNull Uri deepLink, @NotNull Map<String, NavArgument> arguments) {
        InterfaceC5850k interfaceC5850kMatchEntire;
        Pair[] pairArr;
        AbstractC5830k.m5330g(deepLink, "deepLink");
        AbstractC5830k.m5330g(arguments, "arguments");
        Regex pathPattern = getPathPattern();
        if (pathPattern == null || (interfaceC5850kMatchEntire = pathPattern.matchEntire(deepLink.toString())) == null) {
            return null;
        }
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        if (!getMatchingPathArguments(interfaceC5850kMatchEntire, bundleBundleOf, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundleBundleOf, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundleBundleOf, arguments);
        if (NavArgumentKt.missingRequiredArguments(arguments, new C2860h(0, bundleBundleOf)).isEmpty()) {
            return bundleBundleOf;
        }
        return null;
    }

    @NotNull
    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(@Nullable Uri deepLink, @NotNull Map<String, NavArgument> arguments) {
        Pair[] pairArr;
        Regex pathPattern;
        InterfaceC5850k interfaceC5850kMatchEntire;
        AbstractC5830k.m5330g(arguments, "arguments");
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
        if (deepLink != null && (pathPattern = getPathPattern()) != null && (interfaceC5850kMatchEntire = pathPattern.matchEntire(deepLink.toString())) != null) {
            getMatchingPathArguments(interfaceC5850kMatchEntire, bundleBundleOf, arguments);
            if (isParameterizedQuery()) {
                getMatchingQueryArguments(deepLink, bundleBundleOf, arguments);
            }
        }
        return bundleBundleOf;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(@NotNull String mimeType) {
        AbstractC5830k.m5330g(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        AbstractC5830k.m5327d(mimeTypePattern);
        if (mimeTypePattern.matches(mimeType)) {
            return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
        }
        return -1;
    }

    @Nullable
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: isExactDeepLink, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(@NotNull Uri uri) {
        AbstractC5830k.m5330g(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z8) {
        this.isExactDeepLink = z8;
    }

    public final boolean matches$navigation_common_release(@NotNull NavDeepLinkRequest deepLinkRequest) {
        AbstractC5830k.m5330g(deepLinkRequest, "deepLinkRequest");
        return matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction()) && matchMimeType(deepLinkRequest.getMimeType());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@NotNull String uri) {
        this(uri, null, null);
        AbstractC5830k.m5330g(uri, "uri");
    }
}
