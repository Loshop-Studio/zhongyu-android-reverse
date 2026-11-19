package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6562c;

@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001lB\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010 J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010*J%\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u0010\u0016J\u001f\u00102\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00104\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\nJ\u0017\u00107\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b7\u0010\u0016J\u001d\u00108\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b8\u0010\u001aJ\u0017\u00109\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b9\u0010\u001eJ\u001d\u0010:\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b:\u0010\u001aJ \u0010;\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J-\u0010C\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u001bH\u0000¢\u0006\u0004\bA\u0010BJ5\u0010I\u001a\u00028\u0001\"\u0004\b\u0001\u0010D2\u001d\u0010H\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000F\u0012\u0004\u0012\u00028\u00010E¢\u0006\u0002\bGH\u0082\b¢\u0006\u0004\bI\u0010JJ5\u0010K\u001a\u00028\u0001\"\u0004\b\u0001\u0010D2\u001d\u0010H\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000F\u0012\u0004\u0012\u00028\u00010E¢\u0006\u0002\bGH\u0082\b¢\u0006\u0004\bK\u0010JJ)\u0010L\u001a\u00020\u00142\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00140EH\u0002¢\u0006\u0004\bL\u0010MJ0\u0010N\u001a\u00028\u0001\"\u0004\b\u0001\u0010D2\u0018\u0010H\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010EH\u0082\b¢\u0006\u0004\bN\u0010JJ:\u0010P\u001a\u00020\r2\b\b\u0002\u0010O\u001a\u00020\u00142\u001e\u0010H\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060EH\u0082\b¢\u0006\u0004\bP\u0010QJ:\u0010R\u001a\u00020\u00142\b\b\u0002\u0010O\u001a\u00020\u00142\u001e\u0010H\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060EH\u0082\b¢\u0006\u0004\bR\u0010SJ7\u0010V\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010T\u001a\u00020\u001b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010O\u001a\u00020\u0014H\u0002¢\u0006\u0004\bV\u0010WJ\u001d\u0010Y\u001a\u00020\u000b2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\bY\u0010ZR$\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR \u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000F8@X\u0080\u0004¢\u0006\f\u0012\u0004\be\u0010\n\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010aR \u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108AX\u0080\u0004¢\u0006\f\u0012\u0004\bj\u0010\n\u001a\u0004\bi\u0010\u0012¨\u0006m"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentList", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "()V", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "Ld6/s;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toList", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "(II)V", "start", "end", "retainAllInRange$runtime_release", "(Ljava/util/Collection;II)I", "retainAllInRange", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "Lkotlin/ExtensionFunctionType;", "block", "writable", "(Lr6/c;)Ljava/lang/Object;", "withCurrent", "mutateBoolean", "(Lr6/c;)Z", "mutate", "structural", "update", "(ZLr6/c;)V", "conditionalUpdate", "(ZLr6/c;)Z", "currentModification", "newList", "attemptUpdate", "(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z", "list", "stateRecordWith", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)Landroidx/compose/runtime/snapshots/StateRecord;", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getStructure$runtime_release", "()I", "structure", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "readable", "getSize", "size", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "StateListStateRecord", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n183#1:540\n216#1,9:548\n225#1:559\n183#1:560\n226#1,9:562\n180#1:571\n235#1,6:581\n209#1,16:587\n225#1:605\n183#1:606\n226#1,9:608\n180#1:617\n235#1,6:627\n214#1:633\n216#1,9:634\n225#1:645\n183#1:646\n226#1,9:648\n180#1:657\n235#1,6:667\n180#1:673\n216#1,9:686\n225#1:697\n183#1:698\n226#1,9:700\n180#1:709\n235#1,6:719\n216#1,9:725\n225#1:736\n183#1:737\n226#1,9:739\n180#1:748\n235#1,6:758\n209#1,16:765\n225#1:783\n183#1:784\n226#1,9:786\n180#1:795\n235#1,6:805\n214#1:811\n213#1,12:813\n225#1:827\n183#1:828\n226#1,9:830\n180#1:839\n235#1,6:849\n214#1:855\n188#1,5:856\n193#1:863\n183#1:864\n194#1,9:866\n180#1:875\n204#1,3:885\n188#1,5:888\n193#1:895\n183#1:896\n194#1,9:898\n180#1:907\n204#1,3:917\n183#1:920\n188#1,5:934\n193#1:941\n183#1:942\n194#1,9:944\n180#1:953\n204#1,3:963\n183#1:968\n180#1:970\n219#1,6:982\n225#1:990\n183#1:991\n226#1,9:993\n180#1:1002\n235#1,6:1012\n219#1,7:1018\n183#1:1025\n226#1,9:1027\n180#1:1036\n235#1,6:1045\n183#1:1053\n180#1:1055\n183#1:1069\n180#1:1071\n2475#2:541\n2475#2:547\n2475#2:561\n2365#2,2:572\n1894#2,2:574\n2367#2,4:576\n2475#2:607\n2365#2,2:618\n1894#2,2:620\n2367#2,4:622\n2475#2:647\n2365#2,2:658\n1894#2,2:660\n2367#2,4:662\n2365#2,2:674\n1894#2,2:676\n2367#2,2:680\n2370#2:684\n2475#2:699\n2365#2,2:710\n1894#2,2:712\n2367#2,4:714\n2475#2:738\n2365#2,2:749\n1894#2,2:751\n2367#2,4:753\n2475#2:785\n2365#2,2:796\n1894#2,2:798\n2367#2,4:800\n2475#2:829\n2365#2,2:840\n1894#2,2:842\n2367#2,4:844\n2475#2:865\n2365#2,2:876\n1894#2,2:878\n2367#2,4:880\n2475#2:897\n2365#2,2:908\n1894#2,2:910\n2367#2,4:912\n2475#2:921\n2365#2,2:922\n1894#2,2:924\n2367#2,4:928\n2475#2:933\n2475#2:943\n2365#2,2:954\n1894#2,2:956\n2367#2,4:958\n2475#2:969\n2365#2,2:971\n1894#2,2:973\n2367#2,4:977\n2475#2:992\n2365#2,2:1003\n1894#2,2:1005\n2367#2,4:1007\n2475#2:1026\n2365#2,2:1037\n1894#2,2:1039\n2367#2,4:1041\n2475#2:1054\n2365#2,2:1056\n1894#2,2:1058\n2367#2,4:1062\n2475#2:1070\n2365#2,2:1072\n1894#2,2:1074\n2367#2,4:1078\n33#3,5:542\n33#4,2:557\n33#4,2:603\n33#4,2:643\n33#4,2:678\n33#4,2:682\n33#4,2:695\n33#4,2:734\n33#4,2:781\n33#4,2:825\n33#4,2:861\n33#4,2:893\n33#4,2:926\n33#4,2:939\n33#4,2:966\n33#4,2:975\n33#4,2:988\n33#4,2:1051\n33#4,2:1060\n33#4,2:1067\n33#4,2:1076\n33#4,2:1082\n1#5:580\n1#5:626\n1#5:666\n1#5:685\n1#5:718\n1#5:757\n1#5:764\n1#5:804\n1#5:812\n1#5:848\n1#5:884\n1#5:916\n1#5:932\n1#5:962\n1#5:981\n1#5:1011\n1#5:1066\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n67#1:540\n129#1:548,9\n129#1:559\n129#1:560\n129#1:562,9\n129#1:571\n129#1:581,6\n131#1:587,16\n131#1:605\n131#1:606\n131#1:608,9\n131#1:617\n131#1:627,6\n131#1:633\n137#1:634,9\n137#1:645\n137#1:646\n137#1:648,9\n137#1:657\n137#1:667,6\n140#1:673\n149#1:686,9\n149#1:697\n149#1:698\n149#1:700,9\n149#1:709\n149#1:719,6\n151#1:725,9\n151#1:736\n151#1:737\n151#1:739,9\n151#1:748\n151#1:758,6\n153#1:765,16\n153#1:783\n153#1:784\n153#1:786,9\n153#1:795\n153#1:805,6\n153#1:811\n158#1:813,12\n158#1:827\n158#1:828\n158#1:830,9\n158#1:839\n158#1:849,6\n158#1:855\n161#1:856,5\n161#1:863\n161#1:864\n161#1:866,9\n161#1:875\n161#1:885,3\n166#1:888,5\n166#1:895\n166#1:896\n166#1:898,9\n166#1:907\n166#1:917,3\n176#1:920\n185#1:934,5\n185#1:941\n185#1:942\n185#1:944,9\n185#1:953\n185#1:963,3\n193#1:968\n202#1:970\n213#1:982,6\n213#1:990\n213#1:991\n213#1:993,9\n213#1:1002\n213#1:1012,6\n213#1:1018,7\n213#1:1025\n213#1:1027,9\n213#1:1036\n213#1:1045,6\n225#1:1053\n234#1:1055\n225#1:1069\n234#1:1071\n67#1:541\n125#1:547\n129#1:561\n129#1:572,2\n129#1:574,2\n129#1:576,4\n131#1:607\n131#1:618,2\n131#1:620,2\n131#1:622,4\n137#1:647\n137#1:658,2\n137#1:660,2\n137#1:662,4\n140#1:674,2\n140#1:676,2\n140#1:680,2\n140#1:684\n149#1:699\n149#1:710,2\n149#1:712,2\n149#1:714,4\n151#1:738\n151#1:749,2\n151#1:751,2\n151#1:753,4\n153#1:785\n153#1:796,2\n153#1:798,2\n153#1:800,4\n158#1:829\n158#1:840,2\n158#1:842,2\n158#1:844,4\n161#1:865\n161#1:876,2\n161#1:878,2\n161#1:880,4\n166#1:897\n166#1:908,2\n166#1:910,2\n166#1:912,4\n176#1:921\n180#1:922,2\n180#1:924,2\n180#1:928,4\n183#1:933\n185#1:943\n185#1:954,2\n185#1:956,2\n185#1:958,4\n193#1:969\n202#1:971,2\n202#1:973,2\n202#1:977,4\n213#1:992\n213#1:1003,2\n213#1:1005,2\n213#1:1007,4\n213#1:1026\n213#1:1037,2\n213#1:1039,2\n213#1:1041,4\n225#1:1054\n234#1:1056,2\n234#1:1058,2\n234#1:1062,4\n225#1:1070\n234#1:1072,2\n234#1:1074,2\n234#1:1078,4\n117#1:542,5\n129#1:557,2\n131#1:603,2\n137#1:643,2\n140#1:678,2\n141#1:682,2\n149#1:695,2\n151#1:734,2\n153#1:781,2\n158#1:825,2\n161#1:861,2\n166#1:893,2\n180#1:926,2\n185#1:939,2\n192#1:966,2\n202#1:975,2\n213#1:988,2\n224#1:1051,2\n234#1:1060,2\n224#1:1067,2\n234#1:1076,2\n248#1:1082,2\n129#1:580\n131#1:626\n137#1:666\n140#1:685\n149#1:718\n151#1:757\n153#1:804\n158#1:848\n161#1:884\n166#1:916\n180#1:932\n185#1:962\n202#1:981\n213#1:1011\n234#1:1066\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, InterfaceC6562c {
    public static final int $stable = 0;

    @NotNull
    private StateRecord firstStateRecord;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0010R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006 "}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "value", "Ld6/s;", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "", "modification", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "structuralChange", "getStructuralChange$runtime_release", "setStructuralChange$runtime_release", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,539:1\n33#2,2:540\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n81#1:540,2\n*E\n"})
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 8;

        @NotNull
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public StateListStateRecord(long j7, @NotNull PersistentList<? extends T> persistentList) {
            super(j7);
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            synchronized (SnapshotStateListKt.sync) {
                AbstractC5830k.m5328e(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.list = ((StateListStateRecord) value).list;
                this.modification = ((StateListStateRecord) value).modification;
                this.structuralChange = ((StateListStateRecord) value).structuralChange;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @NotNull
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        /* renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* renamed from: getStructuralChange$runtime_release, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(@NotNull PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }

        public final void setStructuralChange$runtime_release(int i) {
            this.structuralChange = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create(long snapshotId) {
            return new StateListStateRecord(snapshotId, this.list);
        }
    }

    public SnapshotStateList(@NotNull PersistentList<? extends T> persistentList) {
        this.firstStateRecord = stateRecordWith(persistentList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateListStateRecord<T> stateListStateRecord, int i, PersistentList<? extends T> persistentList, boolean z8) {
        boolean z9;
        synchronized (SnapshotStateListKt.sync) {
            try {
                if (stateListStateRecord.getModification() == i) {
                    stateListStateRecord.setList$runtime_release(persistentList);
                    z9 = true;
                    if (z8) {
                        stateListStateRecord.setStructuralChange$runtime_release(stateListStateRecord.getStructuralChange() + 1);
                    }
                    stateListStateRecord.setModification$runtime_release(stateListStateRecord.getModification() + 1);
                } else {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    private final boolean conditionalUpdate(boolean structural, InterfaceC6471c block) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList persistentList = (PersistentList) block.invoke(list$runtime_release);
            if (AbstractC5830k.m5325b(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentList, structural);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        if ((i & 1) != 0) {
            z8 = true;
        }
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList persistentList = (PersistentList) interfaceC6471c.invoke(list$runtime_release);
            if (AbstractC5830k.m5325b(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = snapshotStateList.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification, persistentList, z8);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(InterfaceC6471c block) {
        int modification;
        PersistentList<T> list$runtime_release;
        R r;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            r = (R) block.invoke(builder);
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC5830k.m5325b(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return r;
    }

    private final boolean mutateBoolean(InterfaceC6471c block) {
        int modification;
        PersistentList<T> list$runtime_release;
        Object objInvoke;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            objInvoke = block.invoke(builder);
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC5830k.m5325b(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return ((Boolean) objInvoke).booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentList<? extends T> list) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(snapshotCurrentSnapshot.getSnapshotId(), list);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.setNext$runtime_release(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), list));
        }
        return stateListStateRecord;
    }

    private final void update(boolean structural, InterfaceC6471c block) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList persistentList = (PersistentList) block.invoke(list$runtime_release);
            if (AbstractC5830k.m5325b(persistentList, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentList, structural);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }

    public static /* synthetic */ void update$default(SnapshotStateList snapshotStateList, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        if ((i & 1) != 0) {
            z8 = true;
        }
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList persistentList = (PersistentList) interfaceC6471c.invoke(list$runtime_release);
            if (AbstractC5830k.m5325b(persistentList, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = snapshotStateList.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification, persistentList, z8);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
    }

    private final <R> R withCurrent(InterfaceC6471c block) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (R) block.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    private final <R> R writable(InterfaceC6471c block) {
        Snapshot current;
        R r;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            r = (R) block.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
        }
        SnapshotKt.notifyWrite(current, this);
        return r;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add((PersistentList<T>) element);
            if (AbstractC5830k.m5325b(persistentListAdd, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListAdd, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, @NotNull final Collection<? extends T> elements) {
        return mutateBoolean(new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.addAll(index, elements));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.sync) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return getReadable$runtime_release().getList$runtime_release().get(index);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @NotNull
    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) value;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentListRemoveAll = list$runtime_release.removeAll((Collection<? extends T>) elements);
            if (AbstractC5830k.m5325b(persistentListRemoveAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListRemoveAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public T removeAt(int index) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        T t8 = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentListRemoveAt = list$runtime_release.removeAt(index);
            if (AbstractC5830k.m5325b(persistentListRemoveAt, list$runtime_release)) {
                return t8;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListRemoveAt, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return t8;
    }

    public final void removeRange(int fromIndex, int toIndex) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(fromIndex, toIndex).clear();
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC5830k.m5325b(persistentListBuild, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull final Collection<? extends Object> elements) {
        return mutateBoolean(new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.retainAll(elements));
            }
        });
    }

    public final int retainAllInRange$runtime_release(@NotNull Collection<? extends T> elements, int start, int end) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(start, end).retainAll(elements);
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC5830k.m5325b(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return size - size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        T t8 = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(index, (int) element);
            if (AbstractC5830k.m5325b(persistentList, list$runtime_release)) {
                return t8;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentList, false);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return t8;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC5829j.m5322a(this);
    }

    @NotNull
    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    @NotNull
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentListAddAll = list$runtime_release.addAll(elements);
            if (AbstractC5830k.m5325b(persistentListAddAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListAddAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new StateListIterator(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentListRemove = list$runtime_release.remove((PersistentList<T>) element);
            if (AbstractC5830k.m5325b(persistentListRemove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListRemove, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC5829j.m5323b(this, tArr);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC5830k.m5328e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
            }
            AbstractC5830k.m5327d(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add(index, (int) element);
            if (AbstractC5830k.m5325b(persistentListAdd, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC5830k.m5328e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification, persistentListAdd, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }
}
