package androidx.compose.p012ui.util;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p001a0.C0008e;

@Metadata(m13412d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0011\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a9\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\u00060\bj\u0002`\t2\u0006\u0010\n\u001a\u0002H\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u000e\u001a8\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00150\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\b\b\u0000\u0010\u0007*\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0011\u001a`\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\u0010\n\u0006\b\u0001\u0012\u0002\u0010\u0001\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a=\u0010\u001c\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001a?\u0010\u001e\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001aJ\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0 0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a`\u0010!\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u0010\"\u001a\u0002H\u001b2'\u0010#\u001a#\u0012\u0013\u0012\u0011H\u001b¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010(\u001a8\u0010)\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00050\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010+\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00050$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010-\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00050\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a}\u0010.\u001a\u0002H/\"\u0004\b\u0000\u0010\u0007\"\f\b\u0001\u0010/*\u00060\bj\u0002`\t*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u00100\u001a\u0002H/2\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020,2\b\b\u0002\u00105\u001a\u00020\r2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0002\u00106\u001a`\u00107\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020,2\b\b\u0002\u00105\u001a\u00020\r2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u001a?\u00108\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001aD\u00109\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aY\u0010:\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112'\u0010\u000b\u001a#\u0012\u0013\u0012\u00110,¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a[\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112)\u0010\u000b\u001a%\u0012\u0013\u0012\u00110,¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aF\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a]\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b\"\u0010\b\u0002\u0010?*\n\u0012\u0006\b\u0000\u0012\u0002H\u001b0@*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u0010A\u001a\u0002H?2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010B\u001aO\u0010C\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001aU\u0010E\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u0010F\u001a\u0002H\u001b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010G\u001aO\u0010H\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010I\u001aO\u0010J\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001a\\\u0010K\u001a\u0002HL\"\u0004\b\u0000\u0010L\"\b\b\u0001\u0010\u0007*\u0002HL*\b\u0012\u0004\u0012\u0002H\u00070\u00112'\u0010#\u001a#\u0012\u0013\u0012\u0011HL¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002HL0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010M\u001a8\u0010N\u001a\u00020,\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020,0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a|\u0010O\u001a\b\u0012\u0004\u0012\u0002HP0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010P*\b\u0012\u0004\u0012\u0002H\u00070\u00112\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001126\u0010\u000b\u001a2\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(R\u0012\u0013\u0012\u0011H\u001b¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(S\u0012\u0004\u0012\u0002HP0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aJ\u0010T\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006U"}, m13413d2 = {"throwNoSuchElementException", "", "message", "", "throwUnsupportedOperationException", "", "appendElement", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAll", "", "", "predicate", "fastAny", "fastDistinctBy", "K", "selector", "fastFilter", "fastFilterNotNull", "", "fastFilteredMap", "R", "fastFirst", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastFirstOrNull", "fastFlatMap", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastForEach", "action", "fastForEachIndexed", "", "fastForEachReversed", "fastJoinTo", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "buffer", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "fastLastOrNull", "fastMap", "fastMapIndexed", "index", "fastMapIndexedNotNull", "fastMapNotNull", "fastMapTo", "C", "", "destination", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastMaxBy", "", "fastMaxOfOrDefault", "defaultValue", "(Ljava/util/List;Ljava/lang/Comparable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMinByOrNull", "fastReduce", ExifInterface.LATITUDE_SOUTH, "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastSumBy", "fastZip", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "other", "a", "b", "fastZipWithNext", "ui-util_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n34#1,6:623\n34#1,6:629\n34#1,6:635\n34#1,6:641\n34#1,6:647\n34#1,6:653\n34#1,6:659\n34#1,6:665\n34#1,6:671\n70#1,6:677\n70#1,4:683\n75#1:688\n34#1,6:689\n34#1,6:695\n34#1,6:701\n34#1,6:707\n34#1,6:713\n1#2:687\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n88#1:623,6\n103#1:629,6\n118#1:635,6\n135#1:641,6\n152#1:647,6\n198#1:653,6\n232#1:659,6\n252#1:665,6\n271#1:671,6\n288#1:677,6\n305#1:683,4\n305#1:688\n441#1:689,6\n485#1:695,6\n531#1:701,6\n547#1:707,6\n564#1:713,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t9, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t9));
            return;
        }
        if (t9 == 0 ? true : t9 instanceof CharSequence) {
            appendable.append((CharSequence) t9);
        } else if (t9 instanceof Character) {
            appendable.append(((Character) t9).charValue());
        } else {
            appendable.append(String.valueOf(t9));
        }
    }

    public static final <T> boolean fastAll(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!function1.invoke(list.get(i9)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (function1.invoke(list.get(i9)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, Function1<? super T, ? extends K> function1) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t9 = list.get(i9);
            if (mutableScatterSet.add(function1.invoke(t9))) {
                arrayList.add(t9);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t9 = list.get(i9);
            if (function1.invoke(t9).booleanValue()) {
                arrayList.add(t9);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t9 = list.get(i9);
            if (t9 != null) {
                arrayList.add(t9);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFilteredMap(List<? extends T> list, Function1<? super T, Boolean> function1, Function1<? super T, ? extends R> function12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t9 = list.get(i9);
            if (function1.invoke(t9).booleanValue()) {
                arrayList.add(function12.invoke(t9));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t9 = list.get(i9);
            if (function1.invoke(t9).booleanValue()) {
                return t9;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirstOrNull(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t9 = list.get(i9);
            if (function1.invoke(t9).booleanValue()) {
                return t9;
            }
        }
        return null;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, Function1<? super T, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            CollectionsKt.addAll(arrayList, function1.invoke(list.get(i9)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r9, Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            r9 = function2.invoke(r9, list.get(i9));
        }
        return r9;
    }

    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            function1.invoke(list.get(i9));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            function2.invoke(Integer.valueOf(i9), list.get(i9));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i9 = size - 1;
            function1.invoke(list.get(size));
            if (i9 < 0) {
                return;
            } else {
                size = i9;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            T t9 = list.get(i11);
            i10++;
            if (i10 > 1) {
                a10.append(charSequence);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            appendElement(a10, t9, function1);
        }
        if (i9 >= 0 && i10 > i9) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i9, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i10 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i10 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i10 & 8) != 0) {
            i9 = -1;
        }
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i9, charSequence5, function12);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T fastLastOrNull(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i9 = size - 1;
            T t9 = list.get(size);
            if (function1.invoke(t9).booleanValue()) {
                return t9;
            }
            if (i9 < 0) {
                return null;
            }
            size = i9;
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(function1.invoke(list.get(i9)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(function2.invoke(Integer.valueOf(i9), list.get(i9)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            R rInvoke = function2.invoke(Integer.valueOf(i9), list.get(i9));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            R rInvoke = function1.invoke(list.get(i9));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c10, Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            c10.add(function1.invoke(list.get(i9)));
        }
        return c10;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t9 = list.get(0);
        R rInvoke = function1.invoke(t9);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i9 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t10 = list.get(i9);
                R rInvoke2 = function1.invoke(t10);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t9 = t10;
                    rInvoke = rInvoke2;
                }
                if (i9 == lastIndex) {
                    break;
                }
                i9++;
            }
        }
        return (T) t9;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(List<? extends T> list, R r9, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return r9;
        }
        R rInvoke = function1.invoke(list.get(0));
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i9 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = function1.invoke(list.get(i9));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i9 == lastIndex) {
                    break;
                }
                i9++;
            }
        }
        return rInvoke;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = function1.invoke(list.get(0));
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i9 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = function1.invoke(list.get(i9));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i9 == lastIndex) {
                    break;
                }
                i9++;
            }
        }
        return rInvoke;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t9 = list.get(0);
        R rInvoke = function1.invoke(t9);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i9 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t10 = list.get(i9);
                R rInvoke2 = function1.invoke(t10);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t9 = t10;
                    rInvoke = rInvoke2;
                }
                if (i9 == lastIndex) {
                    break;
                }
                i9++;
            }
        }
        return (T) t9;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, Function2<? super S, ? super T, ? extends S> function2) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) CollectionsKt.first((List) list);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i9 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = function2.invoke(sInvoke, list.get(i9));
                if (i9 == lastIndex) {
                    break;
                }
                i9++;
            }
        }
        return sInvoke;
    }

    public static final <T> int fastSumBy(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size();
        int iIntValue = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iIntValue += function1.invoke(list.get(i9)).intValue();
        }
        return iIntValue;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, Function2<? super T, ? super R, ? extends V> function2) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i9 = 0; i9 < iMin; i9++) {
            arrayList.add(function2.invoke(list.get(i9), list2.get(i9)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        C0008e c0008e = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i9 < lastIndex) {
            i9++;
            T t9 = list.get(i9);
            arrayList.add(function2.invoke(c0008e, t9));
            c0008e = t9;
        }
        return arrayList;
    }

    @PublishedApi
    public static final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    @PublishedApi
    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }
}
