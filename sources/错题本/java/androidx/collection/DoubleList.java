package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import io.reactivex.annotations.SchedulerSupport;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\bJA\u0010\t\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\u0010JA\u0010\u0011\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0017\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001cJd\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\"\u0010#Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010#Jy\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010'JA\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-JV\u0010.\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010/JA\u00100\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010-JV\u00101\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b4\u00103J@\u00106\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b8\u00109JA\u0010:\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0019JA\u0010;\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u0019J\u0010\u0010<\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b<\u0010\bJ\u0010\u0010=\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b=\u0010\bJ\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u0010\u001bJA\u0010>\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010\u001cJ\u0015\u0010?\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b?\u00109J+\u0010B\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020\u0002H\u0007¢\u0006\u0004\bB\u0010CJA\u0010K\u001a\u00020J2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020\u00022\b\b\u0002\u0010I\u001a\u00020DH\u0007¢\u0006\u0004\bK\u0010LJ[\u0010K\u001a\u00020J2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020\u00022\b\b\u0002\u0010I\u001a\u00020D2\u0014\b\u0004\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020D0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u0010NJ\u000f\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010\u0018J\u001a\u0010Q\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020JH\u0016¢\u0006\u0004\bS\u0010TR\u001c\u0010V\u001a\u00020U8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010YR\u001c\u0010Z\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010YR\u0012\u0010^\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b]\u0010\u0018R\u0012\u0010`\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b_\u0010\u0018R\u0012\u0010d\u001a\u00020a8Æ\u0002¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0001\u0001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, m5110d2 = {"Landroidx/collection/DoubleList;", "", "", "initialCapacity", "<init>", "(I)V", "", SchedulerSupport.NONE, "()Z", "any", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "predicate", "(Lr6/c;)Z", "reversedAny", "contains", "(D)Z", "elements", "containsAll", "(Landroidx/collection/DoubleList;)Z", "count", "()I", "(Lr6/c;)I", "first", "()D", "(Lr6/c;)D", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lr6/f;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ld6/s;", "block", "forEach", "(Lr6/c;)V", "forEachIndexed", "(Lr6/e;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)D", "elementAt", "defaultValue", "elementAtOrElse", "(ILr6/c;)D", "indexOf", "(D)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "fromIndex", "toIndex", "binarySearch", "(III)I", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[D", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lx6/f;", "getIndices", "()Lx6/f;", "indices", "Landroidx/collection/MutableDoubleList;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleList\n*L\n1#1,983:1\n367#1:984\n370#1:985\n239#1,6:986\n267#1,6:992\n239#1,6:998\n76#1:1004\n239#1,6:1005\n367#1:1011\n239#1,6:1012\n239#1,6:1018\n253#1,6:1024\n267#1,6:1030\n281#1,6:1036\n253#1,6:1042\n253#1,6:1048\n281#1,6:1054\n367#1:1060\n72#1:1061\n267#1,6:1062\n281#1,6:1068\n65#1:1074\n253#1,6:1075\n253#1,6:1081\n239#1,6:1087\n76#1:1093\n488#1,10:1094\n253#1,4:1104\n498#1,9:1108\n258#1:1117\n507#1,2:1118\n488#1,10:1120\n253#1,4:1130\n498#1,9:1134\n258#1:1143\n507#1,2:1144\n488#1,10:1146\n253#1,4:1156\n498#1,9:1160\n258#1:1169\n507#1,2:1170\n488#1,10:1172\n253#1,4:1182\n498#1,9:1186\n258#1:1195\n507#1,2:1196\n488#1,10:1198\n253#1,4:1208\n498#1,9:1212\n258#1:1221\n507#1,2:1222\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleList\n*L\n80#1:984\n85#1:985\n91#1:986,6\n105#1:992,6\n115#1:998,6\n128#1:1004\n145#1:1005,6\n154#1:1011\n168#1:1012,6\n184#1:1018,6\n198#1:1024,6\n214#1:1030,6\n228#1:1036,6\n330#1:1042,6\n344#1:1048,6\n358#1:1054,6\n377#1:1060\n380#1:1061\n391#1:1062,6\n404#1:1068,6\n426#1:1074\n466#1:1075,6\n497#1:1081,6\n513#1:1087,6\n527#1:1093\n-1#1:1094,10\n-1#1:1104,4\n-1#1:1108,9\n-1#1:1117\n-1#1:1118,2\n-1#1:1120,10\n-1#1:1130,4\n-1#1:1134,9\n-1#1:1143\n-1#1:1144,2\n-1#1:1146,10\n-1#1:1156,4\n-1#1:1160,9\n-1#1:1169\n-1#1:1170,2\n-1#1:1172,10\n-1#1:1182,4\n-1#1:1186,9\n-1#1:1195\n-1#1:1196,2\n-1#1:1198,10\n-1#1:1208,4\n-1#1:1212,9\n-1#1:1221\n-1#1:1222,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class DoubleList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public double[] content;

    public /* synthetic */ DoubleList(int i, AbstractC5824e abstractC5824e) {
        this(i);
    }

    public static /* synthetic */ int binarySearch$default(DoubleList doubleList, int i, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = doubleList._size;
        }
        return doubleList.binarySearch(i, i8, i9);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return doubleList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @JvmOverloads
    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public final boolean contains(double element) {
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (dArr[i8] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull DoubleList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        C6756f c6756fM5260N = AbstractC5806u.m5260N(0, elements._size);
        int i = c6756fM5260N.f11420a;
        int i8 = c6756fM5260N.f11421b;
        if (i > i8) {
            return true;
        }
        while (contains(elements.get(i))) {
            if (i == i8) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final double elementAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final double elementAtOrElse(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull InterfaceC6471c defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(index))).doubleValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof DoubleList) {
            DoubleList doubleList = (DoubleList) other;
            int i = doubleList._size;
            int i8 = this._size;
            if (i == i8) {
                double[] dArr = this.content;
                double[] dArr2 = doubleList.content;
                C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i8);
                int i9 = c6756fM5260N.f11420a;
                int i10 = c6756fM5260N.f11421b;
                if (i9 > i10) {
                    return true;
                }
                while (dArr[i9] == dArr2[i9]) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final double first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            initial = (R) operation.invoke(initial, Double.valueOf(dArr[i8]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            R r = initial;
            initial = (R) operation.invoke(Integer.valueOf(i8), r, Double.valueOf(dArr[i8]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Double.valueOf(dArr[i]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]), initial);
        }
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Double.valueOf(dArr[i8]));
        }
    }

    public final void forEachIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Integer.valueOf(i8), Double.valueOf(dArr[i8]));
        }
    }

    public final void forEachReversed(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Double.valueOf(dArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]));
            }
        }
    }

    public final double get(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    @NotNull
    public final C6756f getIndices() {
        return AbstractC5806u.m5260N(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        double[] dArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i; i8++) {
            iHashCode += Double.hashCode(dArr[i8]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(double element) {
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (element == dArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Double.valueOf(dArr[i]))).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final double last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(double element) {
        double[] dArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (dArr[i] != element);
        return i;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private DoubleList(int i) {
        this.content = i == 0 ? DoubleSetKt.getEmptyDoubleArray() : new double[i];
    }

    public final boolean any(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i8]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public final int binarySearch(int i, int i8) {
        return binarySearch$default(this, i, i8, 0, 4, null);
    }

    public final int count(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i9]))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        AbstractC5830k.m5330g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    public final int binarySearch(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = toIndex - 1;
        while (fromIndex <= i) {
            int i8 = (fromIndex + i) >>> 1;
            double d9 = this.content[i8];
            double d10 = element;
            if (d9 < d10) {
                fromIndex = i8 + 1;
            } else {
                if (d9 <= d10) {
                    return i8;
                }
                i = i8 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final double first(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            double d9 = dArr[i8];
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return d9;
            }
        }
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                separator = ", ";
            }
            if ((i8 & 2) != 0) {
                prefix = "";
            }
            if ((i8 & 4) != 0) {
                postfix = "";
            }
            if ((i8 & 8) != 0) {
                i = -1;
            }
            if ((i8 & 16) != 0) {
                charSequence = "...";
            }
            AbstractC5830k.m5330g(separator, "separator");
            AbstractC5830k.m5330g(prefix, "prefix");
            AbstractC5830k.m5330g(postfix, "postfix");
            StringBuilder sbM96u = AbstractC0037f.m96u(charSequence, "truncated", interfaceC6471c, "transform", prefix);
            double[] dArr = doubleList.content;
            int i9 = doubleList._size;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    double d9 = dArr[i10];
                    if (i10 == i) {
                        sbM96u.append(charSequence);
                        break;
                    }
                    if (i10 != 0) {
                        sbM96u.append(separator);
                    }
                    sbM96u.append((CharSequence) interfaceC6471c.invoke(Double.valueOf(d9)));
                    i10++;
                } else {
                    sbM96u.append(postfix);
                    break;
                }
            }
            String string = sbM96u.toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    public final double last(@NotNull InterfaceC6471c predicate) {
        double d9;
        AbstractC5830k.m5330g(predicate, "predicate");
        double[] dArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                d9 = dArr[i];
            } else {
                throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue());
        return d9;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                double d9 = dArr[i8];
                if (i8 == limit) {
                    sbM95t.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM95t.append(separator);
                }
                sbM95t.append(d9);
                i8++;
            } else {
                sbM95t.append(postfix);
                break;
            }
        }
        String string = sbM95t.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull InterfaceC6471c transform) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        StringBuilder sbM96u = AbstractC0037f.m96u(truncated, "truncated", transform, "transform", prefix);
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                double d9 = dArr[i8];
                if (i8 == limit) {
                    sbM96u.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) transform.invoke(Double.valueOf(d9)));
                i8++;
            } else {
                sbM96u.append(postfix);
                break;
            }
        }
        String string = sbM96u.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM96u = AbstractC0037f.m96u(charSequence, "postfix", interfaceC6471c, "transform", prefix);
        double[] dArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                double d9 = dArr[i9];
                if (i9 == i) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Double.valueOf(d9)));
                i9++;
            } else {
                sbM96u.append(charSequence);
                break;
            }
        }
        String string = sbM96u.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, @NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM96u = AbstractC0037f.m96u(charSequence, "postfix", interfaceC6471c, "transform", prefix);
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                double d9 = dArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Double.valueOf(d9)));
                i8++;
            } else {
                sbM96u.append(charSequence);
                break;
            }
        }
        String string = sbM96u.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence charSequence, @NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(separator, "separator");
        StringBuilder sbM96u = AbstractC0037f.m96u(charSequence, RequestParameters.PREFIX, interfaceC6471c, "transform", charSequence);
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                double d9 = dArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Double.valueOf(d9)));
                i8++;
            } else {
                sbM96u.append((CharSequence) "");
                break;
            }
        }
        String string = sbM96u.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull InterfaceC6471c transform) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                double d9 = dArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Double.valueOf(d9)));
                i8++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull InterfaceC6471c transform) {
        AbstractC5830k.m5330g(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        double[] dArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                double d9 = dArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Double.valueOf(d9)));
                i8++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }
}
