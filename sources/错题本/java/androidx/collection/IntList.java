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

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\bJA\u0010\t\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\u000fJA\u0010\u0010\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0016\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017JA\u0010\u0019\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u0018Jd\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000026\u0010\u001e\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 Jy\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$Jd\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000026\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b%\u0010 Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010$JA\u0010)\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b)\u0010*JV\u0010+\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b+\u0010,JA\u0010-\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010*JV\u0010.\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010,J\u001a\u0010/\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b1\u00100J@\u00103\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00020\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b5\u00100JA\u00106\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b6\u0010\u0018JA\u00107\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b7\u0010\u0018J\u0010\u00108\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b8\u0010\bJ\u0010\u00109\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b9\u0010\bJ\r\u0010:\u001a\u00020\u0002¢\u0006\u0004\b:\u0010\u0017JA\u0010:\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0018J\u0015\u0010;\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b;\u00100J+\u0010>\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010<\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0002H\u0007¢\u0006\u0004\b>\u0010?JA\u0010G\u001a\u00020F2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020@H\u0007¢\u0006\u0004\bG\u0010HJ[\u0010G\u001a\u00020F2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020@2\u0014\b\u0004\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020@0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bG\u0010JJ\u000f\u0010K\u001a\u00020\u0002H\u0016¢\u0006\u0004\bK\u0010\u0017J\u001a\u0010M\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020FH\u0016¢\u0006\u0004\bO\u0010PR\u001c\u0010R\u001a\u00020Q8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010UR\u001c\u0010V\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010UR\u0012\u0010Z\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\bY\u0010\u0017R\u0012\u0010\\\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\u0017R\u0012\u0010`\u001a\u00020]8Æ\u0002¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0001\u0001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, m5110d2 = {"Landroidx/collection/IntList;", "", "", "initialCapacity", "<init>", "(I)V", "", SchedulerSupport.NONE, "()Z", "any", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "predicate", "(Lr6/c;)Z", "reversedAny", "contains", "(I)Z", "elements", "containsAll", "(Landroidx/collection/IntList;)Z", "count", "()I", "(Lr6/c;)I", "first", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lr6/f;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ld6/s;", "block", "forEach", "(Lr6/c;)V", "forEachIndexed", "(Lr6/e;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)I", "elementAt", "defaultValue", "elementAtOrElse", "(ILr6/c;)I", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "fromIndex", "toIndex", "binarySearch", "(III)I", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[I", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lx6/f;", "getIndices", "()Lx6/f;", "indices", "Landroidx/collection/MutableIntList;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,968:1\n363#1:969\n366#1:970\n237#1,6:971\n265#1,6:977\n237#1,6:983\n74#1:989\n237#1,6:990\n363#1:996\n237#1,6:997\n237#1,6:1003\n251#1,6:1009\n265#1,6:1015\n279#1,6:1021\n251#1,6:1027\n251#1,6:1033\n279#1,6:1039\n363#1:1045\n70#1:1046\n265#1,6:1047\n279#1,6:1053\n65#1:1059\n251#1,6:1060\n251#1,6:1066\n237#1,6:1072\n74#1:1078\n484#1,10:1079\n251#1,4:1089\n494#1,9:1093\n256#1:1102\n503#1,2:1103\n484#1,10:1105\n251#1,4:1115\n494#1,9:1119\n256#1:1128\n503#1,2:1129\n484#1,10:1131\n251#1,4:1141\n494#1,9:1145\n256#1:1154\n503#1,2:1155\n484#1,10:1157\n251#1,4:1167\n494#1,9:1171\n256#1:1180\n503#1,2:1181\n484#1,10:1183\n251#1,4:1193\n494#1,9:1197\n256#1:1206\n503#1,2:1207\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n78#1:969\n83#1:970\n89#1:971,6\n103#1:977,6\n113#1:983,6\n126#1:989\n143#1:990,6\n152#1:996\n166#1:997,6\n182#1:1003,6\n196#1:1009,6\n212#1:1015,6\n226#1:1021,6\n328#1:1027,6\n341#1:1033,6\n354#1:1039,6\n373#1:1045\n376#1:1046\n387#1:1047,6\n400#1:1053,6\n422#1:1059\n462#1:1060,6\n493#1:1066,6\n509#1:1072,6\n522#1:1078\n-1#1:1079,10\n-1#1:1089,4\n-1#1:1093,9\n-1#1:1102\n-1#1:1103,2\n-1#1:1105,10\n-1#1:1115,4\n-1#1:1119,9\n-1#1:1128\n-1#1:1129,2\n-1#1:1131,10\n-1#1:1141,4\n-1#1:1145,9\n-1#1:1154\n-1#1:1155,2\n-1#1:1157,10\n-1#1:1167,4\n-1#1:1171,9\n-1#1:1180\n-1#1:1181,2\n-1#1:1183,10\n-1#1:1193,4\n-1#1:1197,9\n-1#1:1206\n-1#1:1207,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class IntList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public int[] content;

    public /* synthetic */ IntList(int i, AbstractC5824e abstractC5824e) {
        this(i);
    }

    public static /* synthetic */ int binarySearch$default(IntList intList, int i, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = intList._size;
        }
        return intList.binarySearch(i, i8, i9);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i8, Object obj) {
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
        return intList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @JvmOverloads
    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public final boolean contains(int element) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (iArr[i8] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull IntList elements) {
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

    public final int elementAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final int elementAtOrElse(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull InterfaceC6471c defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(index))).intValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof IntList) {
            IntList intList = (IntList) other;
            int i = intList._size;
            int i8 = this._size;
            if (i == i8) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i8);
                int i9 = c6756fM5260N.f11420a;
                int i10 = c6756fM5260N.f11421b;
                if (i9 > i10) {
                    return true;
                }
                while (iArr[i9] == iArr2[i9]) {
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

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            initial = (R) operation.invoke(initial, Integer.valueOf(iArr[i8]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            R r = initial;
            initial = (R) operation.invoke(Integer.valueOf(i8), r, Integer.valueOf(iArr[i8]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        int[] iArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Integer.valueOf(iArr[i]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        int[] iArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]), initial);
        }
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Integer.valueOf(iArr[i8]));
        }
    }

    public final void forEachIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i8]));
        }
    }

    public final void forEachReversed(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        int[] iArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        int[] iArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]));
            }
        }
    }

    public final int get(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
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
        int[] iArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i; i8++) {
            iHashCode += Integer.hashCode(iArr[i8]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(int element) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (element == iArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Integer.valueOf(iArr[i]))).booleanValue());
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

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(int element) {
        int[] iArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (iArr[i] != element);
        return i;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntList(int i) {
        this.content = i == 0 ? IntSetKt.getEmptyIntArray() : new int[i];
    }

    public final boolean any(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i8]))).booleanValue()) {
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
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i9]))).booleanValue()) {
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
            int i9 = this.content[i8];
            if (i9 < element) {
                fromIndex = i8 + 1;
            } else {
                if (i9 <= element) {
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

    public final int first(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = iArr[i8];
            if (((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                return i9;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
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
            int[] iArr = intList.content;
            int i9 = intList._size;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    int i11 = iArr[i10];
                    if (i10 == i) {
                        sbM96u.append(charSequence);
                        break;
                    }
                    if (i10 != 0) {
                        sbM96u.append(separator);
                    }
                    sbM96u.append((CharSequence) interfaceC6471c.invoke(Integer.valueOf(i11)));
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

    public final int last(@NotNull InterfaceC6471c predicate) {
        int i;
        AbstractC5830k.m5330g(predicate, "predicate");
        int[] iArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 < i8) {
                i = iArr[i8];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Integer.valueOf(i))).booleanValue());
        return i;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                int i9 = iArr[i8];
                if (i8 == limit) {
                    sbM95t.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM95t.append(separator);
                }
                sbM95t.append(i9);
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
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                int i9 = iArr[i8];
                if (i8 == limit) {
                    sbM96u.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) transform.invoke(Integer.valueOf(i9)));
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
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                int i10 = iArr[i9];
                if (i9 == i) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Integer.valueOf(i10)));
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
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                int i9 = iArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Integer.valueOf(i9)));
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
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                int i9 = iArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Integer.valueOf(i9)));
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
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                int i9 = iArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i9)));
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
        int[] iArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                int i9 = iArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i9)));
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
