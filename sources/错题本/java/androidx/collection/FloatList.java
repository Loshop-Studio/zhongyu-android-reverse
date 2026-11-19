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

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\bJA\u0010\t\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\u0010JA\u0010\u0011\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0017\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001cJd\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\"\u0010#Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010#Jy\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010'JA\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-JV\u0010.\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010/JA\u00100\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010-JV\u00101\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b4\u00103J@\u00106\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b8\u00109JA\u0010:\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0019JA\u0010;\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u0019J\u0010\u0010<\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b<\u0010\bJ\u0010\u0010=\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b=\u0010\bJ\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u0010\u001bJA\u0010>\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010\u001cJ\u0015\u0010?\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b?\u00109J+\u0010B\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020\u0002H\u0007¢\u0006\u0004\bB\u0010CJA\u0010K\u001a\u00020J2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020\u00022\b\b\u0002\u0010I\u001a\u00020DH\u0007¢\u0006\u0004\bK\u0010LJ[\u0010K\u001a\u00020J2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020\u00022\b\b\u0002\u0010I\u001a\u00020D2\u0014\b\u0004\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020D0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u0010NJ\u000f\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010\u0018J\u001a\u0010Q\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020JH\u0016¢\u0006\u0004\bS\u0010TR\u001c\u0010V\u001a\u00020U8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010YR\u001c\u0010Z\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010YR\u0012\u0010^\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b]\u0010\u0018R\u0012\u0010`\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b_\u0010\u0018R\u0012\u0010d\u001a\u00020a8Æ\u0002¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0001\u0001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, m5110d2 = {"Landroidx/collection/FloatList;", "", "", "initialCapacity", "<init>", "(I)V", "", SchedulerSupport.NONE, "()Z", "any", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "predicate", "(Lr6/c;)Z", "reversedAny", "contains", "(F)Z", "elements", "containsAll", "(Landroidx/collection/FloatList;)Z", "count", "()I", "(Lr6/c;)I", "first", "()F", "(Lr6/c;)F", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lr6/f;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ld6/s;", "block", "forEach", "(Lr6/c;)V", "forEachIndexed", "(Lr6/e;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)F", "elementAt", "defaultValue", "elementAtOrElse", "(ILr6/c;)F", "indexOf", "(F)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "fromIndex", "toIndex", "binarySearch", "(III)I", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[F", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lx6/f;", "getIndices", "()Lx6/f;", "indices", "Landroidx/collection/MutableFloatList;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,976:1\n365#1:977\n368#1:978\n237#1,6:979\n265#1,6:985\n237#1,6:991\n74#1:997\n237#1,6:998\n365#1:1004\n237#1,6:1005\n237#1,6:1011\n251#1,6:1017\n265#1,6:1023\n279#1,6:1029\n251#1,6:1035\n251#1,6:1041\n279#1,6:1047\n365#1:1053\n70#1:1054\n265#1,6:1055\n279#1,6:1061\n65#1:1067\n251#1,6:1068\n251#1,6:1074\n237#1,6:1080\n74#1:1086\n486#1,10:1087\n251#1,4:1097\n496#1,9:1101\n256#1:1110\n505#1,2:1111\n486#1,10:1113\n251#1,4:1123\n496#1,9:1127\n256#1:1136\n505#1,2:1137\n486#1,10:1139\n251#1,4:1149\n496#1,9:1153\n256#1:1162\n505#1,2:1163\n486#1,10:1165\n251#1,4:1175\n496#1,9:1179\n256#1:1188\n505#1,2:1189\n486#1,10:1191\n251#1,4:1201\n496#1,9:1205\n256#1:1214\n505#1,2:1215\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n78#1:977\n83#1:978\n89#1:979,6\n103#1:985,6\n113#1:991,6\n126#1:997\n143#1:998,6\n152#1:1004\n166#1:1005,6\n182#1:1011,6\n196#1:1017,6\n212#1:1023,6\n226#1:1029,6\n328#1:1035,6\n342#1:1041,6\n356#1:1047,6\n375#1:1053\n378#1:1054\n389#1:1055,6\n402#1:1061,6\n424#1:1067\n464#1:1068,6\n495#1:1074,6\n511#1:1080,6\n524#1:1086\n-1#1:1087,10\n-1#1:1097,4\n-1#1:1101,9\n-1#1:1110\n-1#1:1111,2\n-1#1:1113,10\n-1#1:1123,4\n-1#1:1127,9\n-1#1:1136\n-1#1:1137,2\n-1#1:1139,10\n-1#1:1149,4\n-1#1:1153,9\n-1#1:1162\n-1#1:1163,2\n-1#1:1165,10\n-1#1:1175,4\n-1#1:1179,9\n-1#1:1188\n-1#1:1189,2\n-1#1:1191,10\n-1#1:1201,4\n-1#1:1205,9\n-1#1:1214\n-1#1:1215,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public float[] content;

    public /* synthetic */ FloatList(int i, AbstractC5824e abstractC5824e) {
        this(i);
    }

    public static /* synthetic */ int binarySearch$default(FloatList floatList, int i, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = floatList._size;
        }
        return floatList.binarySearch(i, i8, i9);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i8, Object obj) {
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
        return floatList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @JvmOverloads
    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public final boolean contains(float element) {
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (fArr[i8] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull FloatList elements) {
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

    public final float elementAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final float elementAtOrElse(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull InterfaceC6471c defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(index))).floatValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof FloatList) {
            FloatList floatList = (FloatList) other;
            int i = floatList._size;
            int i8 = this._size;
            if (i == i8) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i8);
                int i9 = c6756fM5260N.f11420a;
                int i10 = c6756fM5260N.f11421b;
                if (i9 > i10) {
                    return true;
                }
                while (fArr[i9] == fArr2[i9]) {
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

    public final float first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            initial = (R) operation.invoke(initial, Float.valueOf(fArr[i8]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            R r = initial;
            initial = (R) operation.invoke(Integer.valueOf(i8), r, Float.valueOf(fArr[i8]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Float.valueOf(fArr[i]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), initial);
        }
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Float.valueOf(fArr[i8]));
        }
    }

    public final void forEachIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Integer.valueOf(i8), Float.valueOf(fArr[i8]));
        }
    }

    public final void forEachReversed(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Float.valueOf(fArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]));
            }
        }
    }

    public final float get(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
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
        float[] fArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i; i8++) {
            iHashCode += Float.hashCode(fArr[i8]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(float element) {
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (element == fArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        float[] fArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Float.valueOf(fArr[i]))).booleanValue());
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

    public final float last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(float element) {
        float[] fArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (fArr[i] != element);
        return i;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        float[] fArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private FloatList(int i) {
        this.content = i == 0 ? FloatSetKt.getEmptyFloatArray() : new float[i];
    }

    public final boolean any(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i8]))).booleanValue()) {
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
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i9]))).booleanValue()) {
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
            float f = this.content[i8];
            float f7 = element;
            if (f < f7) {
                fromIndex = i8 + 1;
            } else {
                if (f <= f7) {
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

    public final float first(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        float[] fArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            float f = fArr[i8];
            if (((Boolean) predicate.invoke(Float.valueOf(f))).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
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
            float[] fArr = floatList.content;
            int i9 = floatList._size;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    float f = fArr[i10];
                    if (i10 == i) {
                        sbM96u.append(charSequence);
                        break;
                    }
                    if (i10 != 0) {
                        sbM96u.append(separator);
                    }
                    sbM96u.append((CharSequence) interfaceC6471c.invoke(Float.valueOf(f)));
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

    public final float last(@NotNull InterfaceC6471c predicate) {
        float f;
        AbstractC5830k.m5330g(predicate, "predicate");
        float[] fArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                f = fArr[i];
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Float.valueOf(f))).booleanValue());
        return f;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                float f = fArr[i8];
                if (i8 == limit) {
                    sbM95t.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM95t.append(separator);
                }
                sbM95t.append(f);
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
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                float f = fArr[i8];
                if (i8 == limit) {
                    sbM96u.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) transform.invoke(Float.valueOf(f)));
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
        float[] fArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                float f = fArr[i9];
                if (i9 == i) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Float.valueOf(f)));
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
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                float f = fArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Float.valueOf(f)));
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
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                float f = fArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Float.valueOf(f)));
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
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                float f = fArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Float.valueOf(f)));
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
        float[] fArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                float f = fArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Float.valueOf(f)));
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
