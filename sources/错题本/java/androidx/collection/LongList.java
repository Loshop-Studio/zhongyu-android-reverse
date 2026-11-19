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

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\bJA\u0010\t\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\u0010JA\u0010\u0011\u001a\u00020\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0017\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001cJd\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\"\u0010#Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010#Jy\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010'JA\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-JV\u0010.\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010/JA\u00100\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010-JV\u00101\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b4\u00103J@\u00106\u001a\u00020\u000b2\b\b\u0001\u0010%\u001a\u00020\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b8\u00109JA\u0010:\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0019JA\u0010;\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u0019J\u0010\u0010<\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b<\u0010\bJ\u0010\u0010=\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b=\u0010\bJ\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u0010\u001bJA\u0010>\u001a\u00020\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010\u001cJ\u0015\u0010?\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b?\u00109J+\u0010B\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020\u0002H\u0007¢\u0006\u0004\bB\u0010CJA\u0010K\u001a\u00020J2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020\u00022\b\b\u0002\u0010I\u001a\u00020DH\u0007¢\u0006\u0004\bK\u0010LJ[\u0010K\u001a\u00020J2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\b\b\u0002\u0010H\u001a\u00020\u00022\b\b\u0002\u0010I\u001a\u00020D2\u0014\b\u0004\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020D0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u0010NJ\u000f\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010\u0018J\u001a\u0010Q\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020JH\u0016¢\u0006\u0004\bS\u0010TR\u001c\u0010V\u001a\u00020U8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010YR\u001c\u0010Z\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010YR\u0012\u0010^\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b]\u0010\u0018R\u0012\u0010`\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b_\u0010\u0018R\u0012\u0010d\u001a\u00020a8Æ\u0002¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0001\u0001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, m5110d2 = {"Landroidx/collection/LongList;", "", "", "initialCapacity", "<init>", "(I)V", "", SchedulerSupport.NONE, "()Z", "any", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "predicate", "(Lr6/c;)Z", "reversedAny", "contains", "(J)Z", "elements", "containsAll", "(Landroidx/collection/LongList;)Z", "count", "()I", "(Lr6/c;)I", "first", "()J", "(Lr6/c;)J", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lr6/f;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ld6/s;", "block", "forEach", "(Lr6/c;)V", "forEachIndexed", "(Lr6/e;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)J", "elementAt", "defaultValue", "elementAtOrElse", "(ILr6/c;)J", "indexOf", "(J)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "fromIndex", "toIndex", "binarySearch", "(III)I", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[J", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lx6/f;", "getIndices", "()Lx6/f;", "indices", "Landroidx/collection/MutableLongList;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,972:1\n364#1:973\n367#1:974\n237#1,6:975\n265#1,6:981\n237#1,6:987\n74#1:993\n237#1,6:994\n364#1:1000\n237#1,6:1001\n237#1,6:1007\n251#1,6:1013\n265#1,6:1019\n279#1,6:1025\n251#1,6:1031\n251#1,6:1037\n279#1,6:1043\n364#1:1049\n70#1:1050\n265#1,6:1051\n279#1,6:1057\n65#1:1063\n251#1,6:1064\n251#1,6:1070\n237#1,6:1076\n74#1:1082\n485#1,10:1083\n251#1,4:1093\n495#1,9:1097\n256#1:1106\n504#1,2:1107\n485#1,10:1109\n251#1,4:1119\n495#1,9:1123\n256#1:1132\n504#1,2:1133\n485#1,10:1135\n251#1,4:1145\n495#1,9:1149\n256#1:1158\n504#1,2:1159\n485#1,10:1161\n251#1,4:1171\n495#1,9:1175\n256#1:1184\n504#1,2:1185\n485#1,10:1187\n251#1,4:1197\n495#1,9:1201\n256#1:1210\n504#1,2:1211\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n78#1:973\n83#1:974\n89#1:975,6\n103#1:981,6\n113#1:987,6\n126#1:993\n143#1:994,6\n152#1:1000\n166#1:1001,6\n182#1:1007,6\n196#1:1013,6\n212#1:1019,6\n226#1:1025,6\n328#1:1031,6\n342#1:1037,6\n355#1:1043,6\n374#1:1049\n377#1:1050\n388#1:1051,6\n401#1:1057,6\n423#1:1063\n463#1:1064,6\n494#1:1070,6\n510#1:1076,6\n523#1:1082\n-1#1:1083,10\n-1#1:1093,4\n-1#1:1097,9\n-1#1:1106\n-1#1:1107,2\n-1#1:1109,10\n-1#1:1119,4\n-1#1:1123,9\n-1#1:1132\n-1#1:1133,2\n-1#1:1135,10\n-1#1:1145,4\n-1#1:1149,9\n-1#1:1158\n-1#1:1159,2\n-1#1:1161,10\n-1#1:1171,4\n-1#1:1175,9\n-1#1:1184\n-1#1:1185,2\n-1#1:1187,10\n-1#1:1197,4\n-1#1:1201,9\n-1#1:1210\n-1#1:1211,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class LongList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public long[] content;

    public /* synthetic */ LongList(int i, AbstractC5824e abstractC5824e) {
        this(i);
    }

    public static /* synthetic */ int binarySearch$default(LongList longList, int i, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = longList._size;
        }
        return longList.binarySearch(i, i8, i9);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i8, Object obj) {
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
        return longList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    @JvmOverloads
    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public final boolean contains(long element) {
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (jArr[i8] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull LongList elements) {
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

    public final long elementAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final long elementAtOrElse(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull InterfaceC6471c defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(index))).longValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof LongList) {
            LongList longList = (LongList) other;
            int i = longList._size;
            int i8 = this._size;
            if (i == i8) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i8);
                int i9 = c6756fM5260N.f11420a;
                int i10 = c6756fM5260N.f11421b;
                if (i9 > i10) {
                    return true;
                }
                while (jArr[i9] == jArr2[i9]) {
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

    public final long first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("LongList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            initial = (R) operation.invoke(initial, Long.valueOf(jArr[i8]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            R r = initial;
            initial = (R) operation.invoke(Integer.valueOf(i8), r, Long.valueOf(jArr[i8]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Long.valueOf(jArr[i]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), initial);
        }
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Long.valueOf(jArr[i8]));
        }
    }

    public final void forEachIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]));
        }
    }

    public final void forEachReversed(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        long[] jArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]));
            }
        }
    }

    public final long get(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
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
        long[] jArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i; i8++) {
            iHashCode += Long.hashCode(jArr[i8]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(long element) {
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (element == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(jArr[i]))).booleanValue());
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

    public final long last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("LongList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(long element) {
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (jArr[i] != element);
        return i;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongList(int i) {
        this.content = i == 0 ? LongSetKt.getEmptyLongArray() : new long[i];
    }

    public final boolean any(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue()) {
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
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i9]))).booleanValue()) {
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
            long j7 = this.content[i8];
            long j8 = element;
            if (j7 < j8) {
                fromIndex = i8 + 1;
            } else {
                if (j7 <= j8) {
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

    public final long first(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            long j7 = jArr[i8];
            if (((Boolean) predicate.invoke(Long.valueOf(j7))).booleanValue()) {
                return j7;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
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
            long[] jArr = longList.content;
            int i9 = longList._size;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    long j7 = jArr[i10];
                    if (i10 == i) {
                        sbM96u.append(charSequence);
                        break;
                    }
                    if (i10 != 0) {
                        sbM96u.append(separator);
                    }
                    sbM96u.append((CharSequence) interfaceC6471c.invoke(Long.valueOf(j7)));
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

    public final long last(@NotNull InterfaceC6471c predicate) {
        long j7;
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                j7 = jArr[i];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(j7))).booleanValue());
        return j7;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                long j7 = jArr[i8];
                if (i8 == limit) {
                    sbM95t.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM95t.append(separator);
                }
                sbM95t.append(j7);
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
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                long j7 = jArr[i8];
                if (i8 == limit) {
                    sbM96u.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) transform.invoke(Long.valueOf(j7)));
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
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j7 = jArr[i9];
                if (i9 == i) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Long.valueOf(j7)));
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
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                long j7 = jArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Long.valueOf(j7)));
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
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                long j7 = jArr[i8];
                if (i8 == -1) {
                    sbM96u.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sbM96u.append(separator);
                }
                sbM96u.append((CharSequence) interfaceC6471c.invoke(Long.valueOf(j7)));
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
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                long j7 = jArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j7)));
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
        long[] jArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                long j7 = jArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j7)));
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
