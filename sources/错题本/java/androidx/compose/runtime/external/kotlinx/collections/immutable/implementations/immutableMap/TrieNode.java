package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6476h;
import p200x6.C6754d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bY\b\u0000\u0018\u0000 \u0093\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0093\u0001\u0094\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b#\u0010$JQ\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b*\u0010+J;\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010-2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b.\u0010/JM\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b0\u00101J3\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b2\u00103JG\u00104\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b4\u00105J;\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b2\u00106JO\u00104\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b4\u00101J\u0093\u0001\u0010@\u001a\u00020<2\u0081\u0001\u0010=\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020<07H\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0002¢\u0006\u0004\bC\u0010BJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010\u0014J\u0017\u0010F\u001a\u00028\u00002\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00028\u00012\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010GJ3\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0001H\u0002¢\u0006\u0004\bI\u0010JJ;\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010MJ+\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0006\u0010,\u001a\u00028\u0001H\u0002¢\u0006\u0004\bN\u0010OJ?\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0006\u0010,\u001a\u00028\u00012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\bP\u0010QJ?\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bS\u0010TJ?\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010VJ-\u0010W\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\bW\u0010XJ5\u0010Y\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bY\u0010ZJQ\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u0006\u0010\\\u001a\u00028\u00002\u0006\u0010]\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u00042\b\u0010K\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b^\u0010_JK\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u0006\u0010\\\u001a\u00028\u00002\u0006\u0010]\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b`\u0010aJS\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u0006\u0010\\\u001a\u00028\u00002\u0006\u0010]\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u00042\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bb\u0010cJ]\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010d\u001a\u00020\u00042\u0006\u0010e\u001a\u00028\u00002\u0006\u0010f\u001a\u00028\u00012\u0006\u0010g\u001a\u00020\u00042\u0006\u0010h\u001a\u00028\u00002\u0006\u0010i\u001a\u00028\u00012\u0006\u0010 \u001a\u00020\u00042\b\u0010K\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bj\u0010kJ-\u0010l\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\bl\u0010XJA\u0010m\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\bm\u0010nJ%\u0010p\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010o\u001a\u00020\u0004H\u0002¢\u0006\u0004\bp\u0010\u001cJ9\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010o\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\bs\u0010tJ\u0019\u0010u\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\bu\u0010vJ-\u0010w\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010-2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0001H\u0002¢\u0006\u0004\bw\u0010xJ?\u0010y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\by\u0010zJ%\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b{\u0010|J9\u0010}\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00028\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\b}\u0010~J-\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0001H\u0002¢\u0006\u0004\b{\u0010\u007fJA\u0010}\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0004\b}\u0010zJB\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J^\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0004H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u000fJ&\u0010\u0085\u0001\u001a\u00020\u00122\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J[\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0013\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001Jc\u0010\u008a\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0013\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J¤\u0001\u0010@\u001a\u00020<2\u0081\u0001\u0010=\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(;\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020<072\u0006\u0010;\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0005\b@\u0010\u008c\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010\u008d\u0001R\u0017\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0006\u0010\u008d\u0001R\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008e\u0001R8\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000f\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\b\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, m5110d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "dataMap", "nodeMap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "entryCount$runtime_release", "()I", "entryCount", "positionMask", "", "hasEntryAt$runtime_release", "(I)Z", "hasEntryAt", "entryKeyIndex$runtime_release", "(I)I", "entryKeyIndex", "nodeIndex$runtime_release", "nodeIndex", "nodeAtIndex$runtime_release", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "keyHash", "key", "shift", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "mutablePutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "value", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "node", "hash", "Ld6/s;", "visitor", "accept$runtime_release", "(Lr6/h;)V", "accept", "asInsertResult", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "hasNodeAt", "keyIndex", "keyAtIndex", "(I)Ljava/lang/Object;", "valueAtKeyIndex", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "owner", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "newNode", "updateNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableUpdateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeNodeAtIndex", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "newKeyHash", "newKey", "newValue", "bufferMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "makeNode", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "mutableRemoveEntryAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "i", "collisionRemoveEntryAtIndex", "mutableCollisionRemoveEntryAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionContainsKey", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutableCollisionPut", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAllFromOtherNodeCell", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "calculateSize", "elementsIdentityEquals", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "targetNode", "replaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableReplaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Lr6/h;II)V", "I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "[Ljava/lang/Object;", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "Companion", "ModificationResult", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:914\n10#2,9:923\n57#3,5:909\n84#4:932\n1#5:933\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:914,9\n652#1:923,9\n640#1:909,5\n700#1:932\n700#1:933\n*E\n"})
/* loaded from: classes.dex */
public final class TrieNode<K, V> {

    @NotNull
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;

    @Nullable
    private final MutabilityOwnership ownedBy;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJH\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\nH\u0086\b¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Lkotlin/Function1;", "operation", "replaceNode", "(Lr6/c;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "I", "getSizeDelta", "()I", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;

        @NotNull
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@NotNull TrieNode<K, V> trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull InterfaceC6471c operation) {
            setNode((TrieNode) operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i, int i8, @NotNull Object[] objArr, @Nullable MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i;
        this.nodeMap = i8;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(InterfaceC6476h visitor, int hash, int shift) {
        visitor.invoke(this, Integer.valueOf(shift), Integer.valueOf(hash), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i = this.nodeMap;
        while (i != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit)).accept(visitor, (Integer.numberOfTrailingZeros(iLowestOneBit) << shift) + hash, shift + 5);
            i -= iLowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, MutabilityOwnership owner) {
        K kKeyAtIndex = keyAtIndex(keyIndex);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, keyIndex, nodeIndex$runtime_release(positionMask) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += nodeAtIndex$runtime_release(i).calculateSize();
        }
        return iBitCount;
    }

    private final boolean collisionContainsKey(K key) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (!AbstractC5830k.m5325b(key, this.buffer[i])) {
                if (i != i8) {
                    i += i9;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K key) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 <= 0 || i > i8) && (i9 >= 0 || i8 > i)) {
            return null;
        }
        while (!AbstractC5830k.m5325b(key, keyAtIndex(i))) {
            if (i == i8) {
                return null;
            }
            i += i9;
        }
        return valueAtKeyIndex(i);
    }

    private final ModificationResult<K, V> collisionPut(K key, V value) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (!AbstractC5830k.m5325b(key, keyAtIndex(i))) {
                if (i != i8) {
                    i += i9;
                }
            }
            if (value == valueAtKeyIndex(i)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i + 1] = value;
            return new TrieNode(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K key) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (!AbstractC5830k.m5325b(key, keyAtIndex(i))) {
                if (i != i8) {
                    i += i9;
                }
            }
            return collisionRemoveEntryAtIndex(i);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int positionMask, K key, V value) {
        return new TrieNode<>(positionMask | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(positionMask), key, value));
    }

    private final K keyAtIndex(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    private final TrieNode<K, V> makeNode(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, MutabilityOwnership owner) {
        if (shift > 30) {
            return new TrieNode<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(keyHash1, shift);
        int iIndexSegment2 = TrieNodeKt.indexSegment(keyHash2, shift);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), 0, iIndexSegment < iIndexSegment2 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new TrieNode<>(0, 1 << iIndexSegment, new Object[]{makeNode(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final TrieNode<K, V> moveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new TrieNode<>(this.dataMap ^ positionMask, this.nodeMap | positionMask, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K key, V value, PersistentHashMapBuilder<K, V> mutator) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (!AbstractC5830k.m5325b(key, keyAtIndex(i))) {
                if (i != i8) {
                    i += i9;
                }
            }
            mutator.setOperationResult$runtime_release(valueAtKeyIndex(i));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[i + 1] = value;
                return this;
            }
            mutator.setModCount$runtime_release(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i + 1] = value;
            return new TrieNode<>(0, 0, objArrCopyOf, mutator.getOwnership());
        }
        mutator.setSize(mutator.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value), mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> otherNode, DeltaCounter intersectionCounter, MutabilityOwnership owner) {
        CommonFunctionsKt.m10222assert(this.nodeMap == 0);
        CommonFunctionsKt.m10222assert(this.dataMap == 0);
        CommonFunctionsKt.m10222assert(otherNode.nodeMap == 0);
        CommonFunctionsKt.m10222assert(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
        int length = this.buffer.length;
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, otherNode.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (true) {
                if (collisionContainsKey(otherNode.buffer[i])) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    objArrCopyOf[length] = objArr2[i];
                    objArrCopyOf[length + 1] = objArr2[i + 1];
                    length += 2;
                }
                if (i == i8) {
                    break;
                }
                i += i9;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == objArrCopyOf.length) {
            return new TrieNode<>(0, 0, objArrCopyOf, owner);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        AbstractC5830k.m5329f(objArrCopyOf2, "copyOf(...)");
        return new TrieNode<>(0, 0, objArrCopyOf2, owner);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K key, PersistentHashMapBuilder<K, V> mutator) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (!AbstractC5830k.m5325b(key, keyAtIndex(i))) {
                if (i != i8) {
                    i += i9;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(i, mutator);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> mutator) {
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, i), mutator.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int positionMask, K key, V value, MutabilityOwnership owner) {
        int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(positionMask);
        if (this.ownedBy != owner) {
            return new TrieNode<>(positionMask | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, key, value), owner);
        }
        this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, key, value);
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> mutator) {
        if (hasNodeAt(positionMask)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(positionMask));
            if (otherNode.hasNodeAt(positionMask)) {
                return trieNodeNodeAtIndex$runtime_release.mutablePutAll(otherNode.nodeAtIndex$runtime_release(otherNode.nodeIndex$runtime_release(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.hasEntryAt$runtime_release(positionMask)) {
                return trieNodeNodeAtIndex$runtime_release;
            }
            int iEntryKeyIndex$runtime_release = otherNode.entryKeyIndex$runtime_release(positionMask);
            K kKeyAtIndex = otherNode.keyAtIndex(iEntryKeyIndex$runtime_release);
            V vValueAtKeyIndex = otherNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            int size = mutator.size();
            TrieNode<K, V> trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, shift + 5, mutator);
            if (mutator.size() == size) {
                intersectionCounter.setCount(intersectionCounter.getCount() + 1);
            }
            return trieNodeMutablePut;
        }
        if (!otherNode.hasNodeAt(positionMask)) {
            int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(positionMask);
            K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime_release2);
            V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            int iEntryKeyIndex$runtime_release3 = otherNode.entryKeyIndex$runtime_release(positionMask);
            K kKeyAtIndex3 = otherNode.keyAtIndex(iEntryKeyIndex$runtime_release3);
            return makeNode(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, vValueAtKeyIndex2, kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, otherNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release3), shift + 5, mutator.getOwnership());
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release2 = otherNode.nodeAtIndex$runtime_release(otherNode.nodeIndex$runtime_release(positionMask));
        if (!hasEntryAt$runtime_release(positionMask)) {
            return trieNodeNodeAtIndex$runtime_release2;
        }
        int iEntryKeyIndex$runtime_release4 = entryKeyIndex$runtime_release(positionMask);
        K kKeyAtIndex4 = keyAtIndex(iEntryKeyIndex$runtime_release4);
        int i = shift + 5;
        if (!trieNodeNodeAtIndex$runtime_release2.containsKey(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, i)) {
            return trieNodeNodeAtIndex$runtime_release2.mutablePut(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, valueAtKeyIndex(iEntryKeyIndex$runtime_release4), i, mutator);
        }
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
        return trieNodeNodeAtIndex$runtime_release2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int keyIndex, int positionMask, PersistentHashMapBuilder<K, V> mutator) {
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime_release(valueAtKeyIndex(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new TrieNode<>(positionMask ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(this.buffer, keyIndex), mutator.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int nodeIndex, int positionMask, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            return new TrieNode<>(this.dataMap, positionMask ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex), owner);
        }
        this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask, MutabilityOwnership owner) {
        return newNode == null ? mutableRemoveNodeAtIndex(nodeIndex, positionMask, owner) : (this.ownedBy == owner || targetNode != newNode) ? mutableUpdateNodeAtIndex(nodeIndex, newNode, owner) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<K, V> newNode, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[nodeIndex] = newNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, owner);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int keyIndex, V value, PersistentHashMapBuilder<K, V> mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.setModCount$runtime_release(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, mutator.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int keyIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(positionMask ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, keyIndex));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int nodeIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, positionMask ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask) {
        return newNode == null ? removeNodeAtIndex(nodeIndex, positionMask) : targetNode != newNode ? updateNodeAtIndex(nodeIndex, positionMask, newNode) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int nodeIndex, int positionMask, TrieNode<K, V> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[nodeIndex] = newNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        return new TrieNode<>(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, TrieNodeKt.replaceNodeWithEntry(this.buffer, nodeIndex, entryKeyIndex$runtime_release(positionMask), objArr[0], objArr[1]));
    }

    private final TrieNode<K, V> updateValueAtIndex(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final V valueAtKeyIndex(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    public final void accept$runtime_release(@NotNull InterfaceC6476h visitor) {
        accept(visitor, 0, 0);
    }

    public final boolean containsKey(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            return AbstractC5830k.m5325b(key, keyAtIndex(entryKeyIndex$runtime_release(iIndexSegment)));
        }
        if (!hasNodeAt(iIndexSegment)) {
            return false;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return shift == 30 ? trieNodeNodeAtIndex$runtime_release.collisionContainsKey(key) : trieNodeNodeAtIndex$runtime_release.containsKey(keyHash, key, shift + 5);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    @Nullable
    public final V get(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return null;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return shift == 30 ? trieNodeNodeAtIndex$runtime_release.collisionGet(key) : trieNodeNodeAtIndex$runtime_release.get(keyHash, key, shift + 5);
    }

    @NotNull
    /* renamed from: getBuffer$runtime_release, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    @NotNull
    public final TrieNode<K, V> mutablePut(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder;
        TrieNode<K, V> trieNodeMutablePut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                mutator.setOperationResult$runtime_release(valueAtKeyIndex(iEntryKeyIndex$runtime_release));
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release) == value ? this : mutableUpdateValueAtIndex(iEntryKeyIndex$runtime_release, value, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (!hasNodeAt(iIndexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableInsertEntryAt(iIndexSegment, key, value, mutator.getOwnership());
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutableCollisionPut(key, value, mutator);
            persistentHashMapBuilder = mutator;
        } else {
            persistentHashMapBuilder = mutator;
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(keyHash, key, value, shift + 5, persistentHashMapBuilder);
        }
        return trieNodeNodeAtIndex$runtime_release == trieNodeMutablePut ? this : mutableUpdateNodeAtIndex(iNodeIndex$runtime_release, trieNodeMutablePut, persistentHashMapBuilder.getOwnership());
    }

    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int shift, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        }
        int i = shift;
        if (i > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i8 = this.nodeMap | otherNode.nodeMap;
        int i9 = this.dataMap;
        int i10 = otherNode.dataMap;
        int i11 = (i9 ^ i10) & (~i8);
        int i12 = i9 & i10;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            if (AbstractC5830k.m5325b(keyAtIndex(entryKeyIndex$runtime_release(iLowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime_release(iLowestOneBit)))) {
                i11 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i12 ^= iLowestOneBit;
        }
        int i13 = 0;
        if (!((i8 & i11) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode = (AbstractC5830k.m5325b(this.ownedBy, mutator.getOwnership()) && this.dataMap == i11 && this.nodeMap == i8) ? this : new TrieNode<>(i11, i8, new Object[Integer.bitCount(i8) + (Integer.bitCount(i11) * 2)]);
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr = trieNode.buffer;
            objArr[(objArr.length - 1) - i15] = mutablePutAllFromOtherNodeCell(otherNode, iLowestOneBit2, i, intersectionCounter, mutator);
            i15++;
            i14 ^= iLowestOneBit2;
            i = shift;
        }
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i16 = i13 * 2;
            if (otherNode.hasEntryAt$runtime_release(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime_release = otherNode.entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode.buffer[i16] = otherNode.keyAtIndex(iEntryKeyIndex$runtime_release);
                trieNode.buffer[i16 + 1] = otherNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
                if (hasEntryAt$runtime_release(iLowestOneBit3)) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
            } else {
                int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode.buffer[i16] = keyAtIndex(iEntryKeyIndex$runtime_release2);
                trieNode.buffer[i16 + 1] = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            }
            i13++;
            i11 ^= iLowestOneBit3;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, mutator);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, shift == 30 ? trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(key, mutator) : trieNodeNodeAtIndex$runtime_release.mutableRemove(keyHash, key, shift + 5, mutator), iNodeIndex$runtime_release, iIndexSegment, mutator.getOwnership());
        }
        return this;
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    @Nullable
    public final ModificationResult<K, V> put(int keyHash, K key, V value, int shift) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return moveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift).asInsertResult();
            }
            if (valueAtKeyIndex(iEntryKeyIndex$runtime_release) == value) {
                return null;
            }
            return updateValueAtIndex(iEntryKeyIndex$runtime_release, value).asUpdateResult();
        }
        if (!hasNodeAt(iIndexSegment)) {
            return insertEntryAt(iIndexSegment, key, value).asInsertResult();
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.collisionPut(key, value);
            if (modificationResultPut == null) {
                return null;
            }
        } else {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.put(keyHash, key, value, shift + 5);
            if (modificationResultPut == null) {
                return null;
            }
        }
        modificationResultPut.setNode(updateNodeAtIndex(iNodeIndex$runtime_release, iIndexSegment, modificationResultPut.getNode()));
        return modificationResultPut;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            return replaceNode(trieNodeNodeAtIndex$runtime_release, shift == 30 ? trieNodeNodeAtIndex$runtime_release.collisionRemove(key) : trieNodeNodeAtIndex$runtime_release.remove(keyHash, key, shift + 5), iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }

    public TrieNode(int i, int i8, @NotNull Object[] objArr) {
        this(i, i8, objArr, null);
    }

    private final TrieNode<K, V> collisionRemove(K key, V value) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (true) {
                if (!AbstractC5830k.m5325b(key, keyAtIndex(i)) || !AbstractC5830k.m5325b(value, valueAtKeyIndex(i))) {
                    if (i == i8) {
                        break;
                    }
                    i += i9;
                } else {
                    return collisionRemoveEntryAtIndex(i);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K key, V value, PersistentHashMapBuilder<K, V> mutator) {
        C6754d c6754dM5256J = AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, this.buffer.length), 2);
        int i = c6754dM5256J.f11420a;
        int i8 = c6754dM5256J.f11421b;
        int i9 = c6754dM5256J.f11422c;
        if ((i9 > 0 && i <= i8) || (i9 < 0 && i8 <= i)) {
            while (true) {
                if (!AbstractC5830k.m5325b(key, keyAtIndex(i)) || !AbstractC5830k.m5325b(value, valueAtKeyIndex(i))) {
                    if (i == i8) {
                        break;
                    }
                    i += i9;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(i, mutator);
                }
            }
        }
        return this;
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release)) && AbstractC5830k.m5325b(value, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, mutator);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (shift == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(key, value, mutator);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(keyHash, key, value, shift + 5, mutator);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, mutator.getOwnership());
        }
        return this;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, V value, int shift) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (AbstractC5830k.m5325b(key, keyAtIndex(iEntryKeyIndex$runtime_release)) && AbstractC5830k.m5325b(value, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (shift == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.collisionRemove(key, value);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(keyHash, key, value, shift + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }
}
