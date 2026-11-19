package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Iterator;
import java.util.List;
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

@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJA\u0010\n\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u0010JA\u0010\u0011\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0016\u0010\u0019J\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\u001b\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001d\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001d\u0010\u001fJ\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010!JA\u0010 \u001a\u00028\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b#\u0010!JC\u0010#\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b#\u0010\"Jd\u0010)\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u000126\u0010(\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010*Jy\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u00012K\u0010(\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00010+H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010.Jd\u0010/\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u000126\u0010(\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u0010*Jy\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010%\u001a\u00028\u00012K\u0010(\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00010+H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u0010.JA\u00103\u001a\u0002012!\u00102\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b3\u00104JV\u00105\u001a\u00020126\u00102\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b5\u00106JA\u00107\u001a\u0002012!\u00102\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b7\u00104JV\u00108\u001a\u00020126\u00102\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002010&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b8\u00106J\u001a\u00109\u001a\u00028\u00002\b\b\u0001\u0010,\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00028\u00002\b\b\u0001\u0010,\u001a\u00020\u0003¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u0002012\u0006\u0010,\u001a\u00020\u0003H\u0000¢\u0006\u0004\b<\u0010\u0006J@\u0010?\u001a\u00028\u00002\b\b\u0001\u0010,\u001a\u00020\u00032!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\bA\u0010BJA\u0010C\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bC\u0010\u001fJA\u0010D\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010\u001fJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\tJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\tJ\r\u0010G\u001a\u00028\u0000¢\u0006\u0004\bG\u0010!JA\u0010G\u001a\u00028\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bG\u0010\"J\u0012\u0010H\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bH\u0010!JC\u0010H\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bH\u0010\"J\u0015\u0010I\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\bI\u0010BJY\u0010R\u001a\u00020Q2\b\b\u0002\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020J2\b\b\u0002\u0010N\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020J2\u0016\b\u0002\u0010P\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020J\u0018\u00010\u000bH\u0007¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0003H\u0016¢\u0006\u0004\bV\u0010\u001eJ\u001a\u0010X\u001a\u00020\u00072\b\u0010W\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\bX\u0010\u0013J\u000f\u0010Y\u001a\u00020QH\u0016¢\u0006\u0004\bY\u0010ZR$\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b[\u0010\\\u0012\u0004\b]\u0010^R\u001c\u0010_\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b_\u0010`\u0012\u0004\ba\u0010^R\u0011\u0010c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bb\u0010\u001eR\u0012\u0010e\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\bd\u0010\u001eR\u0012\u0010i\u001a\u00020f8Æ\u0002¢\u0006\u0006\u001a\u0004\bg\u0010h\u0082\u0001\u0001j\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006k"}, m5110d2 = {"Landroidx/collection/ObjectList;", ExifInterface.LONGITUDE_EAST, "", "", "initialCapacity", "<init>", "(I)V", "", SchedulerSupport.NONE, "()Z", "any", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "predicate", "(Lr6/c;)Z", "reversedAny", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "([Ljava/lang/Object;)Z", "", "(Ljava/util/List;)Z", "", "(Ljava/lang/Iterable;)Z", "(Landroidx/collection/ObjectList;)Z", "count", "()I", "(Lr6/c;)I", "first", "()Ljava/lang/Object;", "(Lr6/c;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lr6/f;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "Ld6/s;", "block", "forEach", "(Lr6/c;)V", "forEachIndexed", "(Lr6/e;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "elementAt", "throwIndexOutOfBoundsExclusiveException$collection", "throwIndexOutOfBoundsExclusiveException", "defaultValue", "elementAtOrElse", "(ILr6/c;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastOrNull", "lastIndexOf", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "asList", "()Ljava/util/List;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "content", "[Ljava/lang/Object;", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lx6/f;", "getIndices", "()Lx6/f;", "indices", "Landroidx/collection/MutableObjectList;", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1548:1\n287#1,6:1549\n315#1,6:1555\n287#1,6:1563\n287#1,6:1569\n287#1,6:1575\n287#1,6:1581\n287#1,6:1587\n301#1,6:1593\n315#1,6:1599\n329#1,6:1605\n80#1:1611\n301#1,6:1612\n301#1,6:1618\n301#1,6:1624\n329#1,6:1630\n80#1:1636\n315#1,6:1637\n80#1:1643\n315#1,6:1644\n329#1,6:1650\n329#1,6:1656\n301#1,6:1662\n287#1,6:1668\n84#1:1674\n1855#2,2:1561\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n99#1:1549,6\n113#1:1555,6\n162#1:1563,6\n177#1:1569,6\n201#1:1575,6\n216#1:1581,6\n232#1:1587,6\n246#1:1593,6\n262#1:1599,6\n276#1:1605,6\n359#1:1611\n386#1:1612,6\n392#1:1618,6\n408#1:1624,6\n422#1:1630,6\n444#1:1636\n456#1:1637,6\n465#1:1643\n475#1:1644,6\n492#1:1650,6\n498#1:1656,6\n528#1:1662,6\n557#1:1668,6\n571#1:1674\n153#1:1561,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ObjectList<E> {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public Object[] content;

    public /* synthetic */ ObjectList(int i, AbstractC5824e abstractC5824e) {
        this(i);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
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
        if ((i8 & 32) != 0) {
            interfaceC6471c = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i, charSequence5, interfaceC6471c2);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    @NotNull
    public abstract List<E> asList();

    public final boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public final boolean containsAll(@NotNull E[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (E e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        return (E) this.content[index];
    }

    public final E elementAtOrElse(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull InterfaceC6471c defaultValue) {
        AbstractC5830k.m5330g(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? (E) defaultValue.invoke(Integer.valueOf(index)) : (E) this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ObjectList) {
            ObjectList objectList = (ObjectList) other;
            int i = objectList._size;
            int i8 = this._size;
            if (i == i8) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i8);
                int i9 = c6756fM5260N.f11420a;
                int i10 = c6756fM5260N.f11421b;
                if (i9 > i10) {
                    return true;
                }
                while (AbstractC5830k.m5325b(objArr[i9], objArr2[i9])) {
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

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            initial = (R) operation.invoke(initial, objArr[i8]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            initial = (R) operation.invoke(Integer.valueOf(i8), initial, objArr[i8]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(objArr[i], initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull InterfaceC6474f operation) {
        AbstractC5830k.m5330g(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = (R) operation.invoke(Integer.valueOf(i), objArr[i], initial);
        }
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(objArr[i8]);
        }
    }

    public final void forEachIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            block.invoke(Integer.valueOf(i8), objArr[i8]);
        }
    }

    public final void forEachReversed(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(objArr[i]);
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), objArr[i]);
            }
        }
    }

    public final E get(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        return (E) this.content[index];
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
        Object[] objArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E element) {
        int i = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i8 = this._size;
            while (i < i8) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i9 = this._size;
        while (i < i9) {
            if (element.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(objArr[i8])).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i])).booleanValue());
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
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E element) {
        if (element == null) {
            Object[] objArr = this.content;
            for (int i = this._size - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i8 = this._size - 1; -1 < i8; i8--) {
                if (element.equals(objArr2[i8])) {
                    return i8;
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) predicate.invoke(objArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int index) {
        StringBuilder sbM94s = AbstractC0037f.m94s(index, "Index ", " must be in 0..");
        sbM94s.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(sbM94s.toString());
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new InterfaceC6471c(this) { // from class: androidx.collection.ObjectList.toString.1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C05731) obj);
            }

            @Override // p152r6.InterfaceC6471c
            public final CharSequence invoke(E e) {
                return e == this.this$0 ? "(this)" : String.valueOf(e);
            }
        }, 25, null);
    }

    private ObjectList(int i) {
        this.content = i == 0 ? ObjectListKt.EmptyArray : new Object[i];
    }

    public final boolean any(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (((Boolean) predicate.invoke(objArr[i8])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            if (((Boolean) predicate.invoke(objArr[i9])).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    @Nullable
    public final E firstOrNull(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            E e = (E) objArr[i8];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        return null;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        AbstractC5830k.m5330g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(@NotNull List<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @Nullable
    public final E lastOrNull(@NotNull InterfaceC6471c predicate) {
        E e;
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return null;
            }
            e = (E) objArr[i];
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final E first(@NotNull InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i8 = 0; i8 < i; i8++) {
            E e = (E) objArr[i8];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(@NotNull Iterable<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, null, 48, null);
    }

    public final E last(@NotNull InterfaceC6471c predicate) {
        E e;
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                e = (E) objArr[i];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i, @NotNull CharSequence truncated) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        AbstractC5830k.m5330g(postfix, "postfix");
        AbstractC5830k.m5330g(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull ObjectList<E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            if (!contains(objArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable InterfaceC6471c transform) {
        AbstractC5830k.m5330g(separator, "separator");
        AbstractC5830k.m5330g(prefix, "prefix");
        StringBuilder sbM95t = AbstractC0037f.m95t(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr = this.content;
        int i = this._size;
        int i8 = 0;
        while (true) {
            if (i8 < i) {
                Object obj = objArr[i8];
                if (i8 == limit) {
                    sbM95t.append(truncated);
                    break;
                }
                if (i8 != 0) {
                    sbM95t.append(separator);
                }
                if (transform == null) {
                    sbM95t.append(obj);
                } else {
                    sbM95t.append((CharSequence) transform.invoke(obj));
                }
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
}
