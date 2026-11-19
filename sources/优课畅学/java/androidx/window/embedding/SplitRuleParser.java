package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.C4790R;
import androidx.window.core.ExperimentalWindowApi;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import org.slf4j.Marker;
import org.xmlpull.v1.XmlPullParserException;
import p113g8.AbstractC8661c0;
import p134i7.AbstractC8812w0;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(str, AbstractC9133u.m16142p(str, string));
        }
        int iM13990e0 = AbstractC8661c0.m13990e0(string, '/', 0, false, 6, null);
        if (iM13990e0 > 0) {
            str = string.substring(0, iM13990e0);
            AbstractC9133u.m16132f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            string = string.substring(iM13990e0 + 1);
            AbstractC9133u.m16132f(string, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = string;
        if (AbstractC9133u.m16128b(str2, Marker.ANY_MARKER) || AbstractC8661c0.m13990e0(str2, '.', 0, false, 6, null) >= 0) {
            return new ComponentName(str, str2);
        }
        return new ComponentName(str, str + '.' + str2);
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C4790R.styleable.ActivityFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C4790R.styleable.ActivityFilter_activityName);
        String string2 = typedArrayObtainStyledAttributes.getString(C4790R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        AbstractC9133u.m16132f(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule(AbstractC8812w0.m14788f(), context.getTheme().obtainStyledAttributes(xmlResourceParser, C4790R.styleable.ActivityRule, 0, 0).getBoolean(C4790R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C4790R.styleable.SplitPairFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C4790R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = typedArrayObtainStyledAttributes.getString(C4790R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = typedArrayObtainStyledAttributes.getString(C4790R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        AbstractC9133u.m16132f(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C4790R.styleable.SplitPairRule, 0, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(C4790R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C4790R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(C4790R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i10 = typedArrayObtainStyledAttributes.getInt(C4790R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(AbstractC8812w0.m14788f(), typedArrayObtainStyledAttributes.getBoolean(C4790R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), typedArrayObtainStyledAttributes.getBoolean(C4790R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), typedArrayObtainStyledAttributes.getBoolean(C4790R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f10, i10);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C4790R.styleable.SplitPlaceholderRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C4790R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f10 = typedArrayObtainStyledAttributes.getFloat(C4790R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C4790R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(C4790R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i10 = typedArrayObtainStyledAttributes.getInt(C4790R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        AbstractC9133u.m16132f(packageName, "packageName");
        ComponentName componentNameBuildClassName = buildClassName(packageName, string);
        Set setM14788f = AbstractC8812w0.m14788f();
        Intent component = new Intent().setComponent(componentNameBuildClassName);
        AbstractC9133u.m16132f(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(setM14788f, component, dimension, dimension2, f10, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Set<EmbeddingRule> parseSplitXml(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        SplitPlaceholderRule splitPlaceholderRulePlus$window_release;
        ActivityRule activityRulePlus$window_release;
        SplitPairRule splitPairRule;
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            AbstractC9133u.m16132f(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            ActivityRule activityRule = null;
            SplitPairRule splitPairRule2 = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || AbstractC9133u.m16128b("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule != null || splitPlaceholderRule != null) {
                                        ActivityFilter activityFilter = parseActivityFilter(context, xml);
                                        if (activityRule == null) {
                                            if (splitPlaceholderRule != null) {
                                                hashSet.remove(splitPlaceholderRule);
                                                splitPlaceholderRulePlus$window_release = splitPlaceholderRule.plus$window_release(activityFilter);
                                                hashSet.add(splitPlaceholderRulePlus$window_release);
                                                splitPlaceholderRule = splitPlaceholderRulePlus$window_release;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(activityRule);
                                            activityRulePlus$window_release = activityRule.plus$window_release(activityFilter);
                                            hashSet.add(activityRulePlus$window_release);
                                            activityRule = activityRulePlus$window_release;
                                            break;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    splitPairRule = parseSplitPairRule(context, xml);
                                    hashSet.add(splitPairRule);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule2 = splitPairRule;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule2 == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    SplitPairFilter splitPairFilter = parseSplitPairFilter(context, xml);
                                    hashSet.remove(splitPairRule2);
                                    splitPairRule = splitPairRule2.plus$window_release(splitPairFilter);
                                    hashSet.add(splitPairRule);
                                    splitPairRule2 = splitPairRule;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    activityRulePlus$window_release = parseSplitActivityRule(context, xml);
                                    hashSet.add(activityRulePlus$window_release);
                                    splitPairRule2 = null;
                                    splitPlaceholderRule = null;
                                    activityRule = activityRulePlus$window_release;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    splitPlaceholderRulePlus$window_release = parseSplitPlaceholderRule(context, xml);
                                    hashSet.add(splitPlaceholderRulePlus$window_release);
                                    activityRule = null;
                                    splitPairRule2 = null;
                                    splitPlaceholderRule = splitPlaceholderRulePlus$window_release;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i10) {
        AbstractC9133u.m16133g(context, "context");
        return parseSplitXml(context, i10);
    }
}
