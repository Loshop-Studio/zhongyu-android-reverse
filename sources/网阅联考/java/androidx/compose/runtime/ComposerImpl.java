package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(m5174d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b7\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\b\u0000\u0018\u00002\u00020\u0001:\u0004ï\u0002ð\u0002Bí\u0001\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012Y\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012Y\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u0010\u0097\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u0098\u0001\u001a\u00020\u0014H\u0002JK\u0010\u0099\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009a\u0001\"\u0005\b\u0001\u0010\u009b\u00012\b\u0010\u009c\u0001\u001a\u0003H\u009a\u00012\"\u0010\u009d\u0001\u001a\u001d\u0012\u0005\u0012\u0003H\u009b\u0001\u0012\u0005\u0012\u0003H\u009a\u0001\u0012\u0004\u0012\u00020\u00140\u009e\u0001¢\u0006\u0003\b\u009f\u0001H\u0016¢\u0006\u0003\u0010 \u0001J\t\u0010¡\u0001\u001a\u00020\u0005H\u0016J5\u0010¢\u0001\u001a\u0003H\u009b\u0001\"\u0005\b\u0000\u0010\u009b\u00012\u0007\u0010£\u0001\u001a\u00020!2\u000f\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009b\u00010¤\u0001H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010¥\u0001J\u0014\u0010¦\u0001\u001a\u00020!2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010EH\u0017J\u0012\u0010¦\u0001\u001a\u00020!2\u0007\u0010\u009c\u0001\u001a\u00020!H\u0017J\u0013\u0010¦\u0001\u001a\u00020!2\b\u0010\u009c\u0001\u001a\u00030§\u0001H\u0017J\u0013\u0010¦\u0001\u001a\u00020!2\b\u0010\u009c\u0001\u001a\u00030¨\u0001H\u0017J\u0013\u0010¦\u0001\u001a\u00020!2\b\u0010\u009c\u0001\u001a\u00030©\u0001H\u0017J\u0013\u0010¦\u0001\u001a\u00020!2\b\u0010\u009c\u0001\u001a\u00030ª\u0001H\u0017J\u0012\u0010¦\u0001\u001a\u00020!2\u0007\u0010\u009c\u0001\u001a\u00020%H\u0017J\u0013\u0010¦\u0001\u001a\u00020!2\b\u0010\u009c\u0001\u001a\u00030«\u0001H\u0017J\u0013\u0010¦\u0001\u001a\u00020!2\b\u0010\u009c\u0001\u001a\u00030¬\u0001H\u0017J\u0014\u0010\u00ad\u0001\u001a\u00020!2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010EH\u0017J\u000f\u0010®\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b¯\u0001J\t\u0010°\u0001\u001a\u00020\u0014H\u0002J\t\u0010±\u0001\u001a\u00020\u0014H\u0002J\t\u0010²\u0001\u001a\u00020\u0014H\u0016JG\u0010³\u0001\u001a\u00020\u00142\u001d\u0010´\u0001\u001a\u0018\u0012\u0004\u0012\u000208\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020E\u0018\u00010¶\u00010µ\u00012\u0014\u0010·\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u00140¤\u0001¢\u0006\u0003\b¸\u0001H\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J$\u0010»\u0001\u001a\u00020%2\u0007\u0010¼\u0001\u001a\u00020%2\u0007\u0010½\u0001\u001a\u00020%2\u0007\u0010¾\u0001\u001a\u00020%H\u0002J'\u0010¿\u0001\u001a\u0003H\u009b\u0001\"\u0005\b\u0000\u0010\u009b\u00012\u000e\u0010À\u0001\u001a\t\u0012\u0005\u0012\u0003H\u009b\u00010nH\u0017¢\u0006\u0003\u0010Á\u0001J\t\u0010Â\u0001\u001a\u00020\u0014H\u0002J!\u0010Ã\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009b\u00012\u000f\u0010Ä\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009b\u00010¤\u0001H\u0016J)\u0010Å\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`pH\u0002J2\u0010Å\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`p2\u0007\u0010¼\u0001\u001a\u00020%H\u0002J\u0012\u0010Æ\u0001\u001a\u00020\u00142\u0007\u0010¦\u0001\u001a\u00020!H\u0017J\t\u0010Ç\u0001\u001a\u00020\u0014H\u0016J\t\u0010È\u0001\u001a\u00020\u0014H\u0016J\u000f\u0010É\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\bÊ\u0001JF\u0010Ë\u0001\u001a\u00020\u00142\u001d\u0010´\u0001\u001a\u0018\u0012\u0004\u0012\u000208\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020E\u0018\u00010¶\u00010µ\u00012\u0016\u0010·\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010¤\u0001¢\u0006\u0003\b¸\u0001H\u0002¢\u0006\u0003\u0010º\u0001J\u001b\u0010Ì\u0001\u001a\u00020\u00142\u0007\u0010¼\u0001\u001a\u00020%2\u0007\u0010Í\u0001\u001a\u00020%H\u0002J\t\u0010Î\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010Ï\u0001\u001a\u00020\u00142\u0007\u0010Ð\u0001\u001a\u00020!H\u0002J\t\u0010Ñ\u0001\u001a\u00020\u0014H\u0017J\t\u0010Ò\u0001\u001a\u00020\u0014H\u0002J\t\u0010Ó\u0001\u001a\u00020\u0014H\u0017J\t\u0010Ô\u0001\u001a\u00020\u0014H\u0016J\t\u0010Õ\u0001\u001a\u00020\u0014H\u0017J\t\u0010Ö\u0001\u001a\u00020\u0014H\u0017J\f\u0010×\u0001\u001a\u0005\u0018\u00010Ø\u0001H\u0017J\t\u0010Ù\u0001\u001a\u00020\u0014H\u0016J\t\u0010Ú\u0001\u001a\u00020\u0014H\u0002J\u0012\u0010Û\u0001\u001a\u00020\u00142\u0007\u0010Ü\u0001\u001a\u00020%H\u0016J\t\u0010Ý\u0001\u001a\u00020\u0014H\u0002J\u001d\u0010Þ\u0001\u001a\u00020\u00142\u0007\u0010Ð\u0001\u001a\u00020!2\t\u0010ß\u0001\u001a\u0004\u0018\u00010rH\u0002J\u001a\u0010à\u0001\u001a\u00020\u00142\u0007\u0010á\u0001\u001a\u00020%2\u0006\u0010Z\u001a\u00020!H\u0002J\t\u0010â\u0001\u001a\u00020\u0014H\u0002J\u000e\u0010H\u001a\u00020!H\u0000¢\u0006\u0003\bã\u0001J\"\u0010ä\u0001\u001a\u00020\u00142\f\u0010\u009c\u0001\u001a\u0007\u0012\u0002\b\u00030å\u00012\t\u0010æ\u0001\u001a\u0004\u0018\u00010EH\u0017J*\u0010ç\u0001\u001a\u00020\u00142\u001f\u0010è\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ë\u0001\u0012\u0007\u0012\u0005\u0018\u00010ë\u00010ê\u00010é\u0001H\u0002J*\u0010ì\u0001\u001a\u00020\u00142\u001f\u0010è\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ë\u0001\u0012\u0007\u0012\u0005\u0018\u00010ë\u00010ê\u00010é\u0001H\u0017J\u0012\u0010í\u0001\u001a\u00020%2\u0007\u0010î\u0001\u001a\u00020%H\u0002JX\u0010ï\u0001\u001a\u00020\u00142\u0010\u0010·\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0å\u00012'\u0010ð\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`p2\t\u0010æ\u0001\u001a\u0004\u0018\u00010E2\u0007\u0010ñ\u0001\u001a\u00020!H\u0002J\u001f\u0010ò\u0001\u001a\u00020E2\t\u0010ó\u0001\u001a\u0004\u0018\u00010E2\t\u0010ô\u0001\u001a\u0004\u0018\u00010EH\u0017J\u000b\u0010õ\u0001\u001a\u0004\u0018\u00010EH\u0001J-\u0010ö\u0001\u001a\u00020%2\u0007\u0010÷\u0001\u001a\u00020%2\u0007\u0010¼\u0001\u001a\u00020%2\u0007\u0010½\u0001\u001a\u00020%2\u0007\u0010ø\u0001\u001a\u00020%H\u0002J\u000f\u0010ù\u0001\u001a\u00020%H\u0000¢\u0006\u0003\bú\u0001J\u001f\u0010û\u0001\u001a\u00020\u00142\u000e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140¤\u0001H\u0000¢\u0006\u0003\bü\u0001J\t\u0010ý\u0001\u001a\u00020\u0014H\u0002J!\u0010ý\u0001\u001a\u00020\u00142\u0010\u0010þ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010E0ÿ\u0001H\u0002¢\u0006\u0003\u0010\u0080\u0002J\t\u0010\u0081\u0002\u001a\u00020\u0014H\u0002J\u0014\u0010\u0082\u0002\u001a\u00020\u00142\t\b\u0002\u0010\u0083\u0002\u001a\u00020!H\u0002J\t\u0010\u0084\u0002\u001a\u00020\u0014H\u0002J.\u0010\u0085\u0002\u001a\u00020!2\u001d\u0010´\u0001\u001a\u0018\u0012\u0004\u0012\u000208\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020E\u0018\u00010¶\u00010µ\u0001H\u0000¢\u0006\u0003\b\u0086\u0002Jv\u0010\u0087\u0002\u001a\u0003H\u0088\u0002\"\u0005\b\u0000\u0010\u0088\u00022\u000b\b\u0002\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u00182\u000b\b\u0002\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u00182\u000b\b\u0002\u0010î\u0001\u001a\u0004\u0018\u00010%2%\b\u0002\u0010^\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u000208\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020E\u0018\u00010¶\u00010ê\u00010é\u00012\u000f\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00020¤\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0002J\t\u0010\u008c\u0002\u001a\u00020\u0014H\u0002J_\u0010\u008d\u0002\u001a\u00020\u00142T\u0010\u008e\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J_\u0010\u008f\u0002\u001a\u00020\u00142T\u0010\u008e\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010\u0090\u0002\u001a\u00020\u0014H\u0002J\u0014\u0010\u0091\u0002\u001a\u00020\u00142\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010EH\u0002J\t\u0010\u0092\u0002\u001a\u00020\u0014H\u0002J\t\u0010\u0093\u0002\u001a\u00020\u0014H\u0002J_\u0010\u0094\u0002\u001a\u00020\u00142T\u0010\u008e\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\u0012\u0010\u0095\u0002\u001a\u00020\u00142\u0007\u0010\u0096\u0002\u001a\u00020RH\u0002J_\u0010\u0097\u0002\u001a\u00020\u00142T\u0010\u008e\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J$\u0010\u0098\u0002\u001a\u00020\u00142\u0007\u0010\u0089\u0002\u001a\u00020%2\u0007\u0010\u008a\u0002\u001a\u00020%2\u0007\u0010\u0099\u0002\u001a\u00020%H\u0002J\u0012\u0010\u009a\u0002\u001a\u00020\u00142\u0007\u0010\u009b\u0002\u001a\u00020%H\u0002J\u001a\u0010\u009c\u0002\u001a\u00020\u00142\u0006\u0010j\u001a\u00020%2\u0007\u0010\u0099\u0002\u001a\u00020%H\u0002J\u0019\u0010\u009d\u0002\u001a\u00020\u00142\u000e\u0010\u009e\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140¤\u0001H\u0016J\t\u0010\u009f\u0002\u001a\u00020\u0014H\u0002J_\u0010 \u0002\u001a\u00020\u00142T\u0010\u008e\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002Jj\u0010¡\u0002\u001a\u00020\u00142\t\b\u0002\u0010\u0083\u0002\u001a\u00020!2T\u0010\u008e\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010¢\u0002\u001a\u00020\u0014H\u0002J$\u0010£\u0002\u001a\u00020\u00142\u0007\u0010¤\u0002\u001a\u00020%2\u0007\u0010¥\u0002\u001a\u00020%2\u0007\u0010¦\u0002\u001a\u00020%H\u0002J\u0013\u0010§\u0002\u001a\u00020\u00142\b\u0010¨\u0002\u001a\u00030\u0081\u0001H\u0016J\t\u0010©\u0002\u001a\u00020\u0014H\u0002J\u001b\u0010ª\u0002\u001a\u00020\u00142\b\u0010«\u0002\u001a\u00030ë\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000b\u0010¬\u0002\u001a\u0004\u0018\u00010EH\u0016J\t\u0010\u00ad\u0002\u001a\u00020\u0014H\u0002J\u0012\u0010®\u0002\u001a\u00020\u00142\u0007\u0010¯\u0002\u001a\u00020%H\u0002JP\u0010°\u0002\u001a\u0003H\u009b\u0001\"\u0005\b\u0000\u0010\u009b\u00012\u000e\u0010À\u0001\u001a\t\u0012\u0005\u0012\u0003H\u009b\u00010n2'\u0010¨\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`pH\u0002¢\u0006\u0003\u0010±\u0002J\t\u0010²\u0002\u001a\u00020\u0014H\u0017J\t\u0010³\u0002\u001a\u00020\u0014H\u0002J\t\u0010´\u0002\u001a\u00020\u0014H\u0002J\t\u0010µ\u0002\u001a\u00020\u0014H\u0017J\u0013\u0010¶\u0002\u001a\u00020\u00142\b\u0010¶\u0002\u001a\u00030·\u0002H\u0017J\t\u0010¸\u0002\u001a\u00020\u0014H\u0017J\u001c\u0010¹\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%2\b\u0010¶\u0002\u001a\u00030·\u0002H\u0017JA\u0010º\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%2\t\u0010»\u0002\u001a\u0004\u0018\u00010E2\b\u0010¼\u0002\u001a\u00030½\u00022\t\u0010¾\u0002\u001a\u0004\u0018\u00010EH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b¿\u0002\u0010À\u0002J\t\u0010Á\u0002\u001a\u00020\u0014H\u0017J\u0012\u0010Â\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%H\u0002J\u001d\u0010Â\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%2\t\u0010Ã\u0002\u001a\u0004\u0018\u00010EH\u0002J\u001d\u0010Ä\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%2\t\u0010Ã\u0002\u001a\u0004\u0018\u00010EH\u0017J\t\u0010Å\u0002\u001a\u00020\u0014H\u0016J&\u0010Æ\u0002\u001a\u00020\u00142\u0015\u0010Ç\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030È\u00020ÿ\u0001H\u0017¢\u0006\u0003\u0010É\u0002J\u001d\u0010Ê\u0002\u001a\u00020\u00142\u0007\u0010Ð\u0001\u001a\u00020!2\t\u0010¾\u0002\u001a\u0004\u0018\u00010EH\u0002J\u0012\u0010Ë\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%H\u0017J\u0012\u0010Ì\u0002\u001a\u00020\u00012\u0007\u0010À\u0001\u001a\u00020%H\u0017J\u001d\u0010Í\u0002\u001a\u00020\u00142\u0007\u0010À\u0001\u001a\u00020%2\t\u0010Ã\u0002\u001a\u0004\u0018\u00010EH\u0016J\t\u0010Î\u0002\u001a\u00020\u0014H\u0016J\t\u0010Ï\u0002\u001a\u00020\u0014H\u0002J#\u0010Ð\u0002\u001a\u00020!2\u0007\u0010¨\u0002\u001a\u0002082\t\u0010Ñ\u0002\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0003\bÒ\u0002J\u0014\u0010Ó\u0002\u001a\u00020\u00142\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010EH\u0001J(\u0010Ô\u0002\u001a\u00020\u00142\u0007\u0010Õ\u0002\u001a\u00020%2\t\u0010Ã\u0002\u001a\u0004\u0018\u00010E2\t\u0010¾\u0002\u001a\u0004\u0018\u00010EH\u0002J\u0012\u0010Ö\u0002\u001a\u00020\u00142\u0007\u0010×\u0002\u001a\u00020%H\u0002J(\u0010Ø\u0002\u001a\u00020\u00142\u0007\u0010Õ\u0002\u001a\u00020%2\t\u0010Ã\u0002\u001a\u0004\u0018\u00010E2\t\u0010¾\u0002\u001a\u0004\u0018\u00010EH\u0002J\u0012\u0010Ù\u0002\u001a\u00020\u00142\u0007\u0010Õ\u0002\u001a\u00020%H\u0002J\u001b\u0010Ú\u0002\u001a\u00020\u00142\u0007\u0010¼\u0001\u001a\u00020%2\u0007\u0010\u0099\u0002\u001a\u00020%H\u0002J\u001b\u0010Û\u0002\u001a\u00020\u00142\u0007\u0010¼\u0001\u001a\u00020%2\u0007\u0010Ü\u0002\u001a\u00020%H\u0002J{\u0010Ý\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`p2'\u0010Þ\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`p2'\u0010ß\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`pH\u0002J\u0014\u0010à\u0002\u001a\u00020\u00142\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010EH\u0016J\u0014\u0010á\u0002\u001a\u00020\u00142\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010EH\u0001J\u0012\u0010â\u0002\u001a\u00020%2\u0007\u0010¼\u0001\u001a\u00020%H\u0002J\t\u0010ã\u0002\u001a\u00020\u0014H\u0016J\t\u0010ä\u0002\u001a\u00020\u0014H\u0002J\t\u0010å\u0002\u001a\u00020\u0014H\u0002J\u000f\u0010æ\u0002\u001a\u00020\u0014H\u0000¢\u0006\u0003\bç\u0002J\u0085\u0001\u0010è\u0002\u001a\u0003H\u0088\u0002\"\u0005\b\u0000\u0010\u0088\u00022Z\u0010é\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f2\u000f\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00020¤\u0001H\u0082\b¢\u0006\u0003\u0010ê\u0002J1\u0010ë\u0002\u001a\u0003H\u0088\u0002\"\u0005\b\u0000\u0010\u0088\u00022\u0006\u0010~\u001a\u00020\u007f2\u000f\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00020¤\u0001H\u0082\b¢\u0006\u0003\u0010ì\u0002J\u0016\u0010í\u0002\u001a\u00020%*\u00020\u007f2\u0007\u0010¼\u0001\u001a\u00020%H\u0002J\u0018\u0010î\u0002\u001a\u0004\u0018\u00010E*\u00020\u007f2\u0007\u0010î\u0001\u001a\u00020%H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'Ra\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00101\u001a\u00020%2\u0006\u00100\u001a\u00020%8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u0010'R\u0014\u00105\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010'R\u0016\u00107\u001a\u0004\u0018\u0001088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020!8VX\u0097\u0004¢\u0006\f\u0012\u0004\b<\u00103\u001a\u0004\b=\u0010#Ro\u0010>\u001aW\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0DX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010L\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bM\u0010#R\u0014\u0010N\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010#R\u000e\u0010P\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000Ra\u0010S\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XRa\u0010Y\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150DX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010Z\u001a\u00020!2\u0006\u00100\u001a\u00020!8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b[\u00103\u001a\u0004\b\\\u0010#R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u0002080DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010`\u001a\u00020!2\u0006\u00100\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\ba\u0010#R\u001e\u0010b\u001a\u00020!2\u0006\u00100\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bc\u0010#Ra\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010f\u001a\"\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010gj\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u0001`hX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020GX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010l\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`pX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u0004\u0018\u00010rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010y\u001a&\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o\u0018\u00010mj\u0004\u0018\u0001`pX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010z\u001a(\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0o0mj\u0002`p0{X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u007fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010E8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u000f\u0010\u0087\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0089\u0001\u001a\u00020!8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u008a\u0001\u00103\u001a\u0005\b\u008b\u0001\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u008c\u0001\u001a\u00030\u008d\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0094\u0001\u001a\u0004\u0018\u00010E*\u00020\u007f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ñ\u0002"}, m5175d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "childrenComposing", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionToken", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentMarker", "getCurrentMarker", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "deferredChanges", "getDeferredChanges$runtime_release", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "(Ljava/util/List;)V", "downNodes", "Landroidx/compose/runtime/Stack;", "", "entersStack", "Landroidx/compose/runtime/IntStack;", "forceRecomposeScopes", "forciblyRecompose", "groupNodeCount", "groupNodeCountStack", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "implicitRootStart", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertUpFixups", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "invalidations", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeExpected", "nodeIndex", "nodeIndexStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "pendingUps", "previousCount", "previousMoveFrom", "previousMoveTo", "previousRemove", "providerCache", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "reader", "Landroidx/compose/runtime/SlotReader;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "sourceInformationEnabled", "startedGroup", "startedGroups", "writer", "writerHasAProvider", "writersReaderDelta", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "addRecomposeScope", "apply", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "changedInstance", "changesApplied", "changesApplied$runtime_release", "cleanUpCompose", "clearUpdatedNodeCounts", "collectParameterInformation", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "content", "Landroidx/compose/runtime/Composable;", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createFreshInsertTable", "createNode", "factory", "currentCompositionLocalScope", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "dispose", "dispose$runtime_release", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endRoot", "endToMarker", "marker", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "forceRecomposeScopes$runtime_release", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContentGuarded", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "insertedGroupVirtualIndex", "index", "invokeMovableContentLambda", "locals", "force", "joinKey", "left", "right", "nextSlot", "nodeIndexOf", "groupLocation", "recomposeIndex", "parentKey", "parentKey$runtime_release", "prepareCompose", "prepareCompose$runtime_release", "realizeDowns", "nodes", "", "([Ljava/lang/Object;)V", "realizeMovement", "realizeOperationLocation", "forParent", "realizeUps", "recompose", "recompose$runtime_release", "recomposeMovableContent", "R", "from", "to", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeToGroupEnd", "record", "change", "recordApplierOperation", "recordDelete", "recordDown", "recordEndGroup", "recordEndRoot", "recordFixup", "recordInsert", "anchor", "recordInsertUpFixup", "recordMoveNode", "count", "recordReaderMoving", "location", "recordRemoveNode", "recordSideEffect", "effect", "recordSlotEditing", "recordSlotEditingOperation", "recordSlotTableOperation", "recordUp", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "registerInsertUpFixup", "releaseMovableGroupAtCurrent", "reference", "rememberedValue", "reportAllMovableContent", "reportFreeMovableContent", "groupBeingRemoved", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "start", "objectKey", "kind", "Landroidx/compose/runtime/GroupKind;", "data", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProviders", "values", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startRoot", "tryImminentInvalidation", "instance", "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "verifyConsistent", "verifyConsistent$runtime_release", "withChanges", "newChanges", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 7 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 9 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 10 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4507:1\n3191#1,4:4546\n3201#1,6:4566\n3191#1,6:4572\n3208#1,2:4578\n3196#1:4584\n3191#1,6:4652\n1#2:4508\n146#3,8:4509\n146#3,8:4554\n146#3,4:4562\n151#3,3:4580\n162#3,8:4640\n146#3,4:4648\n151#3,3:4658\n46#4,5:4517\n46#4,3:4615\n50#4:4621\n4492#5,5:4522\n4492#5,5:4527\n309#5:4532\n4492#5,5:4536\n4492#5,5:4541\n4492#5,5:4595\n4492#5,5:4600\n4492#5,5:4605\n4492#5,5:4610\n4492#5,5:4625\n4492#5,5:4630\n4492#5,5:4635\n4492#5,5:4661\n4492#5,5:4666\n4492#5,5:4671\n4492#5,5:4676\n4422#6:4533\n4423#6:4534\n26#7:4535\n26#7:4681\n22#7:4682\n33#8,4:4550\n38#8:4583\n33#8,4:4585\n38#8:4594\n82#8,3:4683\n33#8,4:4686\n85#8,2:4690\n38#8:4692\n87#8:4693\n105#9,5:4589\n146#10,3:4618\n150#10:4622\n1002#11,2:4623\n1855#11,2:4694\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3032#1:4546,4\n3145#1:4566,6\n3151#1:4572,6\n3145#1:4578,2\n3032#1:4584\n3749#1:4652,6\n1300#1:4509,8\n3060#1:4554,8\n3144#1:4562,4\n3144#1:4580,3\n3716#1:4640,8\n3747#1:4648,4\n3747#1:4658,3\n1540#1:4517,5\n3318#1:4615,3\n3318#1:4621\n1609#1:4522,5\n1636#1:4527,5\n1966#1:4532\n2749#1:4536,5\n2762#1:4541,5\n3276#1:4595,5\n3281#1:4600,5\n3297#1:4605,5\n3317#1:4610,5\n3384#1:4625,5\n3391#1:4630,5\n3528#1:4635,5\n3796#1:4661,5\n3812#1:4666,5\n3813#1:4671,5\n3841#1:4676,5\n2125#1:4533\n2149#1:4534\n2673#1:4535\n4036#1:4681\n4052#1:4682\n3034#1:4550,4\n3034#1:4583\n3227#1:4585,4\n3227#1:4594\n3620#1:4683,3\n3620#1:4686,4\n3620#1:4690,2\n3620#1:4692\n3620#1:4693\n3229#1:4589,5\n3322#1:4618,3\n3322#1:4622\n3326#1:4623,2\n3656#1:4694,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges;
    private Stack<Object> downNodes;
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private IntStack groupNodeCountStack;
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertFixups;
    private SlotTable insertTable;
    private final Stack<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertUpFixups;
    private boolean inserting;
    private final Stack<RecomposeScopeImpl> invalidateStack;
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;
    private int[] nodeCountOverrides;
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private IntStack nodeIndexStack;
    private final CompositionContext parentContext;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider;
    private Pending pending;
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> providerCache;
    private final IntMap<PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates;
    private boolean providersInvalid;
    private final IntStack providersInvalidStack;
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    private final SlotTable slotTable;
    private Snapshot snapshot;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    @Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m5175d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CompositionContextHolder implements RememberObserver {
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.ref = ref;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(m5174d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020+0/¢\u0006\u0002\b0H\u0010¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\b6J\u0006\u00107\u001a\u00020+J\r\u00108\u001a\u00020+H\u0010¢\u0006\u0002\b9J-\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020AH\u0010¢\u0006\u0002\bBJ\u001d\u0010C\u001a\u00020+2\u0006\u00104\u001a\u0002052\u0006\u0010D\u001a\u00020EH\u0010¢\u0006\u0002\bFJ\u0017\u0010G\u001a\u0004\u0018\u00010E2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\bHJ\u001b\u0010I\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bQJ\r\u0010R\u001a\u00020+H\u0010¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020+2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bWJ.\u0010X\u001a\u00020+2&\u0010@\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRk\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00132&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\n\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010 ¨\u0006Y"}, m5175d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "getCollectingParameterInformation$runtime_release", "()Z", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recordInspectionTable", "table", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4507:1\n1855#2,2:4508\n76#3:4510\n102#3,2:4511\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3927#1:4508,2\n3977#1:4510\n3977#1:4511,2\n*E\n"})
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        private final MutableState compositionLocalScope = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;

        public CompositionContextImpl(int i4, boolean z3) {
            this.compoundHashKey = i4;
            this.collectingParameterInformation = z3;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        Iterator<Set<CompositionData>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getEffectCoroutineContext$runtime_release */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(data, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
            Intrinsics.checkNotNullParameter(table, "table");
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            setCompositionLocalScope(scope);
        }
    }

    public ComposerImpl(Applier<?> applier, CompositionContext parentContext, SlotTable slotTable, Set<RememberObserver> abandonSet, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges, ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(lateChanges, "lateChanges");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.applier = applier;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = abandonSet;
        this.changes = changes;
        this.lateChanges = lateChanges;
        this.composition = composition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new IntMap<>(0, 1, null);
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.sourceInformationEnabled = true;
        this.invalidateStack = new Stack<>();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        if (getInserting()) {
            ControlledComposition composition = getComposition();
            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition);
            this.invalidateStack.push(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.start(this.compositionToken);
            return;
        }
        Invalidation invalidationRemoveLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (Intrinsics.areEqual(next, Composer.INSTANCE.getEmpty())) {
            ControlledComposition composition2 = getComposition();
            Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition2);
            updateValue(recomposeScopeImpl);
        } else {
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        recomposeScopeImpl.setRequiresRecompose(invalidationRemoveLocation != null);
        this.invalidateStack.push(recomposeScopeImpl);
        recomposeScopeImpl.start(this.compositionToken);
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iGroupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
        return iGroupCompoundKeyPart == 126665345 ? iGroupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ iGroupCompoundKeyPart;
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope() {
        PersistentMap persistentMap = this.providerCache;
        return persistentMap != null ? persistentMap : currentCompositionLocalScope(this.reader.getParent());
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, final Function2<? super Composer, ? super Integer, Unit> content) {
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            this.snapshot = snapshotCurrentSnapshot;
            this.compositionToken = snapshotCurrentSnapshot.getId();
            this.providerUpdates.clear();
            int size = invalidationsRequested.getSize();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = invalidationsRequested.getKeys()[i4];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArraySet identityArraySet = (IdentityArraySet) invalidationsRequested.getValues()[i4];
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                Anchor anchor = recomposeScopeImpl.getAnchor();
                if (anchor == null) {
                    return;
                }
                this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation(), identityArraySet));
            }
            List<Invalidation> list = this.invalidations;
            if (list.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t3, T t4) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Invalidation) t3).getLocation()), Integer.valueOf(((Invalidation) t4).getLocation()));
                    }
                });
            }
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                final Object objNextSlot = nextSlot();
                if (objNextSlot != content && content != null) {
                    updateValue(content);
                }
                SnapshotStateKt.observeDerivedStateRecalculations(new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                        invoke2(state);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(State<?> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.this$0.childrenComposing++;
                    }
                }, new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                        invoke2(state);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(State<?> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ComposerImpl composerImpl = this.this$0;
                        composerImpl.childrenComposing--;
                    }
                }, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2;
                        if (content != null) {
                            this.startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, content);
                            this.endGroup();
                        } else {
                            if ((!this.forciblyRecompose && !this.providersInvalid) || (obj2 = objNextSlot) == null || Intrinsics.areEqual(obj2, Composer.INSTANCE.getEmpty())) {
                                this.skipCurrentGroup();
                                return;
                            }
                            this.startGroup(200, ComposerKt.getInvocation());
                            ComposerImpl composerImpl = this;
                            Object obj3 = objNextSlot;
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                            ActualJvm_jvmKt.invokeComposable(composerImpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj3, 2));
                            this.endGroup();
                        }
                    }
                });
                endRoot();
                this.isComposing = false;
                this.invalidations.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                this.isComposing = false;
                this.invalidations.clear();
                abortRoot();
                throw th;
            }
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            recordDown(nodeAt(this.reader, group));
        }
    }

    private final void end(boolean isNode) {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i4 = this.groupNodeCount;
        Pending pending = this.pending;
        int i5 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i6 = 0;
            int i7 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i6 < size2) {
                KeyInfo keyInfo = keyInfos.get(i6);
                if (setFastToSet.contains(keyInfo)) {
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i7 < size) {
                            KeyInfo keyInfo2 = used.get(i7);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    recordMoveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i6++;
                            }
                            i7++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            used = list;
                        }
                    }
                    i5 = 0;
                } else {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i5);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                i6++;
                i5 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i8 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int current = this.reader.getCurrent();
            recordDelete();
            recordRemoveNode(i8, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, current, this.reader.getCurrent());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                registerInsertUpFixup();
                i4 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i4);
                }
            }
        } else {
            if (isNode) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i4 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i4);
            }
            if (isNode) {
                i4 = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i4, inserting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        this.pendingStack.push(this.pending);
        this.pending = newPending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pendingPop = this.pendingStack.pop();
        if (pendingPop != null && !inserting) {
            pendingPop.setGroupIndex(pendingPop.getGroupIndex() + 1);
        }
        this.pending = pendingPop;
        this.nodeIndex = this.nodeIndexStack.pop() + expectedNodeCount;
        this.groupNodeCount = this.groupNodeCountStack.pop() + expectedNodeCount;
    }

    private final void finalizeCompose() {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i4) {
        Object objGroupAux;
        if (slotReader.hasObjectKey(i4)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i4);
            if (objGroupObjectKey != null) {
                return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
            }
            return 0;
        }
        int iGroupKey = slotReader.groupKey(i4);
        if (iGroupKey == 207 && (objGroupAux = slotReader.groupAux(i4)) != null && !Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) {
            iGroupKey = objGroupAux.hashCode();
        }
        return iGroupKey;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        SlotTable slotTable;
        Anchor anchor;
        final SlotReader slotReaderOpenReader;
        List list;
        SlotTable slotTable2;
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list2 = this.lateChanges;
        List list3 = this.changes;
        try {
            this.changes = list2;
            record(ComposerKt.resetSlotsInstance);
            int size = references.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = references.get(i5);
                final MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                final MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                final Anchor anchor2 = movableContentStateReferenceComponent1.getAnchor();
                int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable().anchorIndex(anchor2);
                final Ref.IntRef intRef = new Ref.IntRef();
                realizeUps();
                record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                        Intrinsics.checkNotNullParameter(applier, "applier");
                        Intrinsics.checkNotNullParameter(slots, "slots");
                        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                        intRef.element = ComposerImpl.insertMovableContentGuarded$positionToInsert(slots, anchor2, applier);
                    }
                });
                if (movableContentStateReferenceComponent2 == null) {
                    if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable().openReader();
                    try {
                        slotReaderOpenReader.reposition(iAnchorIndex);
                        this.writersReaderDelta = iAnchorIndex;
                        final ArrayList arrayList = new ArrayList();
                        recomposeMovableContent$default(this, null, null, null, null, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ComposerImpl composerImpl = this.this$0;
                                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list4 = arrayList;
                                SlotReader slotReader = slotReaderOpenReader;
                                MovableContentStateReference movableContentStateReference = movableContentStateReferenceComponent1;
                                List list5 = composerImpl.changes;
                                try {
                                    composerImpl.changes = list4;
                                    SlotReader slotReader2 = composerImpl.reader;
                                    int[] iArr = composerImpl.nodeCountOverrides;
                                    composerImpl.nodeCountOverrides = null;
                                    try {
                                        composerImpl.reader = slotReader;
                                        composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter(), true);
                                        Unit unit = Unit.INSTANCE;
                                    } finally {
                                        composerImpl.reader = slotReader2;
                                        composerImpl.nodeCountOverrides = iArr;
                                    }
                                } finally {
                                    composerImpl.changes = list5;
                                }
                            }
                        }, 15, null);
                        if (!arrayList.isEmpty()) {
                            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    invoke2(applier, slotWriter, rememberManager);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                    Intrinsics.checkNotNullParameter(applier, "applier");
                                    Intrinsics.checkNotNullParameter(slots, "slots");
                                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                    int i6 = intRef.element;
                                    if (i6 > 0) {
                                        applier = new OffsetApplier(applier, i6);
                                    }
                                    List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list4 = arrayList;
                                    int size2 = list4.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        list4.get(i7).invoke(applier, slots, rememberManager);
                                    }
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                        slotReaderOpenReader.close();
                    } finally {
                    }
                } else {
                    final MovableContentState movableContentStateMovableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2);
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null) {
                        slotTable = movableContentStateReferenceComponent2.getSlotTable();
                    }
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null || (anchor = slotTable2.anchor(i4)) == null) {
                        anchor = movableContentStateReferenceComponent2.getAnchor();
                    }
                    final List listCollectNodesFrom = ComposerKt.collectNodesFrom(slotTable, anchor);
                    if (!listCollectNodesFrom.isEmpty()) {
                        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "applier");
                                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                                int i6 = intRef.element;
                                List<Object> list4 = listCollectNodesFrom;
                                int size2 = list4.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    Object obj = list4.get(i7);
                                    int i8 = i6 + i7;
                                    applier.insertBottomUp(i8, obj);
                                    applier.insertTopDown(i8, obj);
                                }
                            }
                        });
                        if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.slotTable)) {
                            int iAnchorIndex2 = this.slotTable.anchorIndex(anchor2);
                            updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                        }
                    }
                    record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            invoke2(applier, slotWriter, rememberManager);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slots, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                            MovableContentState movableContentStateMovableContentStateResolve$runtime_release2 = movableContentStateMovableContentStateResolve$runtime_release;
                            if (movableContentStateMovableContentStateResolve$runtime_release2 == null && (movableContentStateMovableContentStateResolve$runtime_release2 = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2)) == null) {
                                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                                throw new KotlinNothingValueException();
                            }
                            List<Anchor> listMoveIntoGroupFrom = slots.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release2.getSlotTable(), 2);
                            if (!listMoveIntoGroupFrom.isEmpty()) {
                                ControlledComposition composition = movableContentStateReferenceComponent1.getComposition();
                                Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                                CompositionImpl compositionImpl = (CompositionImpl) composition;
                                int size2 = listMoveIntoGroupFrom.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Object objSlot = slots.slot(listMoveIntoGroupFrom.get(i6), 0);
                                    RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                                    if (recomposeScopeImpl != null) {
                                        recomposeScopeImpl.adoptedBy(compositionImpl);
                                    }
                                }
                            }
                        }
                    });
                    slotReaderOpenReader = slotTable.openReader();
                    try {
                        SlotReader slotReader = this.reader;
                        int[] iArr = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        try {
                            this.reader = slotReaderOpenReader;
                            int iAnchorIndex3 = slotTable.anchorIndex(anchor);
                            slotReaderOpenReader.reposition(iAnchorIndex3);
                            this.writersReaderDelta = iAnchorIndex3;
                            final ArrayList arrayList2 = new ArrayList();
                            List list4 = this.changes;
                            try {
                                this.changes = arrayList2;
                                list = list4;
                                try {
                                    recomposeMovableContent(movableContentStateReferenceComponent2.getComposition(), movableContentStateReferenceComponent1.getComposition(), Integer.valueOf(slotReaderOpenReader.getCurrent()), movableContentStateReferenceComponent2.getInvalidations$runtime_release(), new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            this.this$0.invokeMovableContentLambda(movableContentStateReferenceComponent1.getContent$runtime_release(), movableContentStateReferenceComponent1.getLocals$runtime_release(), movableContentStateReferenceComponent1.getParameter(), true);
                                        }
                                    });
                                    Unit unit2 = Unit.INSTANCE;
                                    this.changes = list;
                                    if (!arrayList2.isEmpty()) {
                                        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                                invoke2(applier, slotWriter, rememberManager);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                                Intrinsics.checkNotNullParameter(applier, "applier");
                                                Intrinsics.checkNotNullParameter(slots, "slots");
                                                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                                int i6 = intRef.element;
                                                if (i6 > 0) {
                                                    applier = new OffsetApplier(applier, i6);
                                                }
                                                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list5 = arrayList2;
                                                int size2 = list5.size();
                                                for (int i7 = 0; i7 < size2; i7++) {
                                                    list5.get(i7).invoke(applier, slots, rememberManager);
                                                }
                                            }
                                        });
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    this.changes = list;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list = list4;
                            }
                        } finally {
                            this.reader = slotReader;
                            this.nodeCountOverrides = iArr;
                        }
                    } finally {
                    }
                }
                record(ComposerKt.skipToGroupEndInstance);
                i5++;
                i4 = 0;
            }
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    ComposerImpl.insertMovableContentGuarded$positionToParentOf(slots, applier, 0);
                    slots.endGroup();
                }
            });
            this.writersReaderDelta = 0;
            Unit unit3 = Unit.INSTANCE;
        } finally {
            this.changes = list3;
        }
    }

    private static final int insertMovableContentGuarded$currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (slotWriter.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int insertMovableContentGuarded$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int iAnchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < iAnchorIndex);
        insertMovableContentGuarded$positionToParentOf(slotWriter, applier, iAnchorIndex);
        int iInsertMovableContentGuarded$currentNodeIndex = insertMovableContentGuarded$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iInsertMovableContentGuarded$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                iInsertMovableContentGuarded$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == iAnchorIndex);
        return iInsertMovableContentGuarded$currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertMovableContentGuarded$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i4) {
        while (!slotWriter.indexInParent(i4)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.mo266up();
            }
            slotWriter.endGroup();
        }
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(final MovableContent<Object> content, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> locals, final Object parameter, boolean force) {
        startMovableGroup(MovableContentKt.movableContentKey, content);
        changed(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z3 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.getGroupAux(), locals)) {
                z3 = true;
            }
            if (z3) {
                this.providerUpdates.set(this.reader.getCurrent(), locals);
            }
            m8802startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m8812getGroupULZAiWs(), locals);
            if (!getInserting() || force) {
                boolean z4 = this.providersInvalid;
                this.providersInvalid = z3;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(694380496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i4) {
                        if ((i4 & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(694380496, i4, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2946)");
                        }
                        content.getContent().invoke(parameter, composer, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z4;
            } else {
                this.writerHasAProvider = true;
                this.providerCache = null;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt__CollectionsKt.emptyList(), currentCompositionLocalScope()));
            }
        } finally {
            endGroup();
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        }
    }

    private final Object nodeAt(SlotReader slotReader, int i4) {
        return slotReader.node(i4);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void realizeDowns(final Object[] nodes) {
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeDowns.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                int length = nodes.length;
                for (int i4 = 0; i4 < length; i4++) {
                    applier.down(nodes[i4]);
                }
            }
        });
    }

    private final void realizeMovement() {
        final int i4 = this.previousCount;
        this.previousCount = 0;
        if (i4 > 0) {
            final int i5 = this.previousRemove;
            if (i5 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        Intrinsics.checkNotNullParameter(applier, "applier");
                        Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                        applier.remove(i5, i4);
                    }
                });
                return;
            }
            final int i6 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i7 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    applier.move(i6, i7, i4);
                }
            });
        }
    }

    private final void realizeOperationLocation(boolean forParent) {
        int parent = forParent ? this.reader.getParent() : this.reader.getCurrent();
        final int i4 = parent - this.writersReaderDelta;
        if (!(i4 >= 0)) {
            ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        }
        if (i4 > 0) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeOperationLocation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.advanceBy(i4);
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        composerImpl.realizeOperationLocation(z3);
    }

    private final void realizeUps() {
        final int i4 = this.pendingUps;
        if (i4 > 0) {
            this.pendingUps = 0;
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeUps.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    int i5 = i4;
                    for (int i6 = 0; i6 < i5; i6++) {
                        applier.mo266up();
                    }
                }
            });
        }
    }

    private final <R> R recomposeMovableContent(ControlledComposition from, ControlledComposition to, Integer index, List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations, Function0<? extends R> block) {
        R rInvoke;
        boolean z3 = this.implicitRootStart;
        boolean z4 = this.isComposing;
        int i4 = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair<RecomposeScopeImpl, IdentityArraySet<Object>> pair = invalidations.get(i5);
                RecomposeScopeImpl recomposeScopeImplComponent1 = pair.component1();
                IdentityArraySet<Object> identityArraySetComponent2 = pair.component2();
                if (identityArraySetComponent2 != null) {
                    int size2 = identityArraySetComponent2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        tryImminentInvalidation$runtime_release(recomposeScopeImplComponent1, identityArraySetComponent2.get(i6));
                    }
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImplComponent1, null);
                }
            }
            if (from != null) {
                rInvoke = (R) from.delegateInvalidations(to, index != null ? index.intValue() : -1, block);
                if (rInvoke == null) {
                }
                return rInvoke;
            }
            rInvoke = block.invoke();
            return rInvoke;
        } finally {
            this.implicitRootStart = z3;
            this.isComposing = z4;
            this.nodeIndex = i4;
        }
    }

    public static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i4, Object obj) {
        ControlledComposition controlledComposition3 = (i4 & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i4 & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i4 & 4) != 0 ? null : num;
        if ((i4 & 8) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    private final void recomposeToGroupEnd() {
        boolean z3 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i4 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i5 = this.groupNodeCount;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), iGroupSize);
        boolean z4 = false;
        int i6 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int current = this.reader.getCurrent();
                recordUpsAndDowns(i6, current, parent);
                this.nodeIndex = nodeIndexOf(location, current, parent, i4);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(current), parent, compoundKeyHash);
                this.providerCache = null;
                invalidationFirstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i6 = current;
                z4 = true;
            } else {
                this.invalidateStack.push(invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), iGroupSize);
        }
        if (z4) {
            recordUpsAndDowns(i6, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i4 + iUpdatedNodeCount;
            this.groupNodeCount = i5 + iUpdatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z3;
    }

    private final void record(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.changes.add(change);
    }

    private final void recordApplierOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeUps();
        realizeDowns();
        record(change);
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrent());
        recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object node) {
        this.downNodes.push(node);
    }

    private final void recordEndGroup() {
        int parent = this.reader.getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
        }
    }

    private final void recordEndRoot() {
        if (this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertFixups.add(change);
    }

    private final void recordInsert(final Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            final SlotTable slotTable = this.insertTable;
            recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.beginInsert();
                    SlotTable slotTable2 = slotTable;
                    slots.moveFrom(slotTable2, anchor.toIndexFor(slotTable2));
                    slots.endInsert();
                }
            });
            return;
        }
        final List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        final SlotTable slotTable2 = this.insertTable;
        recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                SlotTable slotTable3 = slotTable2;
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = mutableList;
                SlotWriter slotWriterOpenWriter = slotTable3.openWriter();
                try {
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        list.get(i4).invoke(applier, slotWriterOpenWriter, rememberManager);
                    }
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter.close();
                    slots.beginInsert();
                    SlotTable slotTable4 = slotTable2;
                    slots.moveFrom(slotTable4, anchor.toIndexFor(slotTable4));
                    slots.endInsert();
                } catch (Throwable th) {
                    slotWriterOpenWriter.close();
                    throw th;
                }
            }
        });
    }

    private final void recordInsertUpFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertUpFixups.push(change);
    }

    private final void recordMoveNode(int from, int to, int count) {
        if (count > 0) {
            int i4 = this.previousCount;
            if (i4 > 0 && this.previousMoveFrom == from - i4 && this.previousMoveTo == to - i4) {
                this.previousCount = i4 + count;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = from;
            this.previousMoveTo = to;
            this.previousCount = count;
        }
    }

    private final void recordReaderMoving(int location) {
        this.writersReaderDelta = location - (this.reader.getCurrent() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + nodeIndex).toString());
                throw new KotlinNothingValueException();
            }
            if (this.previousRemove == nodeIndex) {
                this.previousCount += count;
                return;
            }
            realizeMovement();
            this.previousRemove = nodeIndex;
            this.previousCount = count;
        }
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        if (this.reader.getGroupsSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            recordSlotTableOperation$default(this, false, ComposerKt.startRootGroup, 1, null);
            this.startedGroup = true;
        }
        if (parent > 0) {
            final Anchor anchor = slotReader.anchor(parent);
            this.startedGroups.push(parent);
            recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordSlotEditing.1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.ensureStarted(anchor);
                }
            }, 1, null);
        }
    }

    private final void recordSlotEditingOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(change);
    }

    private final void recordSlotTableOperation(boolean forParent, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation(forParent);
        record(change);
    }

    public static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z3, Function3 function3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        composerImpl.recordSlotTableOperation(z3, function3);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iNearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                recordUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, iNearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseMovableGroupAtCurrent(MovableContentStateReference reference, SlotWriter slots) {
        SlotTable slotTable = new SlotTable();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, reference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(reference.getParameter());
            slots.moveTo(reference.getAnchor(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close();
            this.parentContext.movableContentStateReleased$runtime_release(reference, new MovableContentState(slotTable));
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ArrayList arrayList = new ArrayList();
            this.deferredChanges = arrayList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                List list = this.changes;
                try {
                    this.changes = arrayList;
                    reportFreeMovableContent(0);
                    realizeUps();
                    if (this.startedGroup) {
                        record(ComposerKt.skipToGroupEndInstance);
                        recordEndRoot();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    this.changes = list;
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, false, 0);
        realizeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(final ComposerImpl composerImpl, int i4, boolean z3, int i5) {
        if (!composerImpl.reader.hasMark(i4)) {
            if (!composerImpl.reader.containsMark(i4)) {
                return composerImpl.reader.nodeCount(i4);
            }
            int iGroupSize = composerImpl.reader.groupSize(i4) + i4;
            int iGroupSize2 = i4 + 1;
            int iReportFreeMovableContent$reportGroup = 0;
            while (iGroupSize2 < iGroupSize) {
                boolean zIsNode = composerImpl.reader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordDown(composerImpl.reader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, iGroupSize2, zIsNode || z3, zIsNode ? 0 : i5 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
                iGroupSize2 += composerImpl.reader.groupSize(iGroupSize2);
            }
            return iReportFreeMovableContent$reportGroup;
        }
        int iGroupKey = composerImpl.reader.groupKey(i4);
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i4);
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof MovableContent)) {
            if (iGroupKey != 206 || !Intrinsics.areEqual(objGroupObjectKey, ComposerKt.getReference())) {
                return composerImpl.reader.nodeCount(i4);
            }
            Object objGroupGet = composerImpl.reader.groupGet(i4, 0);
            CompositionContextHolder compositionContextHolder = objGroupGet instanceof CompositionContextHolder ? (CompositionContextHolder) objGroupGet : null;
            if (compositionContextHolder != null) {
                Iterator<T> it = compositionContextHolder.getRef().getComposers().iterator();
                while (it.hasNext()) {
                    ((ComposerImpl) it.next()).reportAllMovableContent();
                }
            }
            return composerImpl.reader.nodeCount(i4);
        }
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet2 = composerImpl.reader.groupGet(i4, 0);
        Anchor anchor = composerImpl.reader.anchor(i4);
        List listFilterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i4, composerImpl.reader.groupSize(i4) + i4);
        ArrayList arrayList = new ArrayList(listFilterToRange.size());
        int size = listFilterToRange.size();
        for (int i6 = 0; i6 < size; i6++) {
            Invalidation invalidation = (Invalidation) listFilterToRange.get(i6);
            arrayList.add(TuplesKt.m5182to(invalidation.getScope(), invalidation.getInstances()));
        }
        final MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, objGroupGet2, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i4));
        composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        composerImpl.recordSlotEditing();
        composerImpl.record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                this.this$0.releaseMovableGroupAtCurrent(movableContentStateReference, slots);
            }
        });
        if (!z3) {
            return composerImpl.reader.nodeCount(i4);
        }
        composerImpl.realizeMovement();
        composerImpl.realizeUps();
        composerImpl.realizeDowns();
        int iNodeCount = composerImpl.reader.isNode(i4) ? 1 : composerImpl.reader.nodeCount(i4);
        if (iNodeCount <= 0) {
            return 0;
        }
        composerImpl.recordRemoveNode(i5, iNodeCount);
        return 0;
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> key, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
        return ComposerKt.contains(scope, key) ? (T) ComposerKt.getValueOf(scope, key) : key.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m8802startBaiHCIY(int key, Object objectKey, int kind, Object data) {
        Object empty = objectKey;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(key, objectKey, data);
        GroupKind.Companion companion = GroupKind.INSTANCE;
        boolean z3 = kind != companion.m8812getGroupULZAiWs();
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z3) {
                this.writer.startNode(key, Composer.INSTANCE.getEmpty());
            } else if (data != null) {
                SlotWriter slotWriter = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(key, empty, data);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(key, empty);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z3, null);
            return;
        }
        boolean z4 = !(kind != companion.m8813getNodeULZAiWs()) && this.reusing;
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z4 && groupKey == key && Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey())) {
                startReaderGroup(z3, data);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(key, objectKey);
            if (z4 || next == null) {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z3) {
                    this.writer.startNode(key, Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(key, empty, data);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(key, empty);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z3 ? 0 : this.nodeIndex);
            } else {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int iSlotPositionOf = pending3.slotPositionOf(next);
                final int groupIndex = iSlotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(iSlotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$start$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter5, RememberManager rememberManager) {
                            invoke2(applier, slotWriter5, rememberManager);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slots, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                            slots.moveGroup(groupIndex);
                        }
                    });
                }
                startReaderGroup(z3, data);
            }
        }
        enterGroup(z3, pending);
    }

    private final void startGroup(int key) {
        m8802startBaiHCIY(key, null, GroupKind.INSTANCE.m8812getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean isNode, final Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.startReaderGroup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.updateAux(data);
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) dataKey).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(groupKey);
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(data.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash) {
        this.compoundKeyHash = keyHash ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) dataKey).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeExitGroupKeyHash(groupKey);
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(data.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey) {
        this.compoundKeyHash = Integer.rotateRight(groupKey ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
                if (map == null) {
                    map = new HashMap<>();
                    this.nodeCountVirtualOverrides = map;
                }
                map.put(Integer.valueOf(group), Integer.valueOf(count));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int iUpdatedNodeCount = updatedNodeCount(group);
        if (iUpdatedNodeCount != newCount) {
            int i4 = newCount - iUpdatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (group != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(group) + i4;
                updateNodeCount(group, iUpdatedNodeCount2);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        Pending pendingPeek = this.pendingStack.peek(i5);
                        if (pendingPeek != null && pendingPeek.updateNodeCount(group, iUpdatedNodeCount2)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentScope, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentMap persistentMapBuild = builder.build();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        changed(persistentMapBuild);
        changed(currentProviders);
        endGroup();
        return persistentMapBuild;
    }

    private final int updatedNodeCount(int group) {
        int i4;
        Integer num;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i4 = iArr[group]) < 0) ? this.reader.nodeCount(group) : i4;
        }
        HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
        if (map == null || (num = map.get(Integer.valueOf(group))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    private final <R> R withChanges(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> newChanges, Function0<? extends R> block) {
        List list = this.changes;
        try {
            this.changes = newChanges;
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.changes = list;
            InlineMarker.finallyEnd(1);
        }
    }

    private final <R> R withReader(SlotReader reader, Function0<? extends R> block) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = reader;
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
            InlineMarker.finallyEnd(1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(final V value, final Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Function3<Applier<?>, SlotWriter, RememberManager, Unit> function3 = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                block.invoke(applier.getCurrent(), value);
            }
        };
        if (getInserting()) {
            recordFixup(function3);
        } else {
            recordApplierOperation(function3);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T t3 = (T) nextSlot();
        if (t3 != Composer.INSTANCE.getEmpty() && !invalid) {
            return t3;
        }
        T tInvoke = block.invoke();
        updateValue(tInvoke);
        return tInvoke;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object value) {
        if (Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope());
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(final Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
            throw new KotlinNothingValueException();
        }
        final int iPeek = this.nodeIndexStack.peek();
        SlotWriter slotWriter = this.writer;
        final Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        recordFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                Object objInvoke = factory.invoke();
                slots.updateNode(anchor, objInvoke);
                applier.insertTopDown(iPeek, objInvoke);
                applier.down(objInvoke);
            }
        });
        recordInsertUpFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                Object objNode = slots.node(anchor);
                applier.mo266up();
                applier.insertBottomUp(iPeek, objNode);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            skipReaderToGroupEnd();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        for (final int i4 = current; i4 < end; i4++) {
            if (this.reader.isNode(i4)) {
                final Object objNode = this.reader.node(i4);
                if (objNode instanceof ComposeNodeLifecycleCallback) {
                    record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            invoke2(applier, slotWriter, rememberManager);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                            rememberManager.deactivating((ComposeNodeLifecycleCallback) objNode);
                        }
                    });
                }
            }
            this.reader.forEachData$runtime_release(i4, new Function2<Integer, Object, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Object obj) {
                    invoke(num.intValue(), obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(final int i5, final Object obj) {
                    if (obj instanceof RememberObserver) {
                        ComposerImpl.this.reader.reposition(i4);
                        ComposerImpl composerImpl = ComposerImpl.this;
                        final int i6 = i4;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                                Intrinsics.checkNotNullParameter(slots, "slots");
                                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                if (!Intrinsics.areEqual(obj, slots.slot(i6, i5))) {
                                    ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                                    throw new KotlinNothingValueException();
                                }
                                rememberManager.forgetting((RememberObserver) obj);
                                slots.set(i5, Composer.INSTANCE.getEmpty());
                            }
                        }, 1, null);
                        return;
                    }
                    if (obj instanceof RecomposeScopeImpl) {
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        CompositionImpl composition = recomposeScopeImpl.getComposition();
                        if (composition != null) {
                            composition.setPendingInvalidScopes$runtime_release(true);
                            recomposeScopeImpl.release();
                        }
                        ComposerImpl.this.reader.reposition(i4);
                        ComposerImpl composerImpl2 = ComposerImpl.this;
                        final int i7 = i4;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl2, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                                Intrinsics.checkNotNullParameter(slots, "slots");
                                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                                if (Intrinsics.areEqual(obj, slots.slot(i7, i5))) {
                                    slots.set(i5, Composer.INSTANCE.getEmpty());
                                } else {
                                    ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                                    throw new KotlinNothingValueException();
                                }
                            }
                        }, 1, null);
                    }
                }
            });
        }
        ComposerKt.removeRange(this.invalidations, current, end);
        this.reader.reposition(current);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
            trace.endSection(objBeginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        final Function1<Composition, Unit> function1End;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (function1End = recomposeScopeImplPop.end(this.compositionToken)) != null) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    function1End.invoke(this.getComposition());
                }
            });
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int marker) {
        if (marker >= 0) {
            while (this.reader.getParent() > marker) {
                end(false);
            }
        } else {
            int i4 = -marker;
            while (this.writer.getParent() > i4) {
                end(false);
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    public final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    /* renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (getInserting() || this.reusing || this.providersInvalid) {
            return false;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return (currentRecomposeScope$runtime_release != null && !currentRecomposeScope$runtime_release.getRequiresRecompose()) && !this.forciblyRecompose;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(MovableContent<?> value, Object parameter) {
        Intrinsics.checkNotNullParameter(value, "value");
        invokeMovableContentLambda(value, currentCompositionLocalScope(), parameter, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    /* renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object left, Object right) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    @PublishedApi
    public final Object nextSlot() {
        if (!getInserting()) {
            return this.reusing ? Composer.INSTANCE.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.INSTANCE.getEmpty();
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
        if (!invalidationsRequested.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
            return false;
        }
        doCompose(invalidationsRequested, null);
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(final Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordSideEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                rememberManager.sideEffect(effect);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlot();
    }

    public final void setDeferredChanges$runtime_release(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        this.deferredChanges = list;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "<set-?>");
        this.insertTable = slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (this.sourceInformationEnabled) {
            end(false);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (this.sourceInformationEnabled) {
            m8802startBaiHCIY(key, null, GroupKind.INSTANCE.m8812getGroupULZAiWs(), sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m8802startBaiHCIY(-127, null, GroupKind.INSTANCE.m8812getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, Object dataKey) {
        m8802startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m8812getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m8802startBaiHCIY(125, null, GroupKind.INSTANCE.m8813getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(final ProvidedValue<?>[] values) {
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapUpdateProviderMapGroup;
        Intrinsics.checkNotNullParameter(values, "values");
        final PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        startGroup(ComposerKt.providerValuesKey, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ActualJvm_jvmKt.invokeComposableForResult(this, new Function2<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            @Composable
            public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(Composer composer, int i4) {
                composer.startReplaceableGroup(935231726);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(935231726, i4, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1981)");
                }
                PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCompositionLocalMapOf = ComposerKt.compositionLocalMapOf(values, persistentMapCurrentCompositionLocalScope, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return persistentMapCompositionLocalMapOf;
            }
        });
        endGroup();
        boolean z3 = false;
        if (getInserting()) {
            persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap persistentMap3 = (PersistentMap) objGroupGet2;
            if (getSkipping() && Intrinsics.areEqual(persistentMap3, persistentMap)) {
                skipGroup();
                persistentMapUpdateProviderMapGroup = persistentMap2;
            } else {
                persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
                z3 = !Intrinsics.areEqual(persistentMapUpdateProviderMapGroup, persistentMap2);
            }
        }
        if (z3 && !getInserting()) {
            this.providerUpdates.set(this.reader.getCurrent(), persistentMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentMapUpdateProviderMapGroup;
        m8802startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m8812getGroupULZAiWs(), persistentMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        m8802startBaiHCIY(key, null, GroupKind.INSTANCE.m8812getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int key) {
        m8802startBaiHCIY(key, null, GroupKind.INSTANCE.m8812getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, Object dataKey) {
        if (this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        m8802startBaiHCIY(key, null, GroupKind.INSTANCE.m8812getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m8802startBaiHCIY(125, null, GroupKind.INSTANCE.m8814getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl scope, Object instance) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrent()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    @PublishedApi
    public final void updateCachedValue(Object value) {
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object value) {
        updateValue(value);
    }

    @PublishedApi
    public final void updateValue(final Object value) {
        if (!getInserting()) {
            final int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (value instanceof RememberObserver) {
                this.abandonSet.add(value);
            }
            recordSlotTableOperation(true, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    RecomposeScopeImpl recomposeScopeImpl;
                    CompositionImpl composition;
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                    Object obj = value;
                    if (obj instanceof RememberObserver) {
                        rememberManager.remembering((RememberObserver) obj);
                    }
                    Object obj2 = slots.set(groupSlotIndex, value);
                    if (obj2 instanceof RememberObserver) {
                        rememberManager.forgetting((RememberObserver) obj2);
                    } else {
                        if (!(obj2 instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) obj2).getComposition()) == null) {
                            return;
                        }
                        recomposeScopeImpl.release();
                        composition.setPendingInvalidScopes$runtime_release(true);
                    }
                }
            });
            return;
        }
        this.writer.update(value);
        if (value instanceof RememberObserver) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                    rememberManager.remembering((RememberObserver) value);
                }
            });
            this.abandonSet.add(value);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!(!getInserting())) {
            ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
        Object node = getNode(this.reader);
        recordDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.useNode.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    Object current = applier.getCurrent();
                    Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
                    ((ComposeNodeLifecycleCallback) current).onReuse();
                }
            });
        }
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroup(int key, Object dataKey) {
        m8802startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m8812getGroupULZAiWs(), null);
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope(int group) {
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    Intrinsics.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap = (PersistentMap) objGroupAux;
                    this.providerCache = persistentMap;
                    return persistentMap;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(group), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = this.providerUpdates.get(group);
                    if (persistentMap2 == null) {
                        Object objGroupAux2 = this.reader.groupAux(group);
                        Intrinsics.checkNotNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        persistentMap2 = (PersistentMap) objGroupAux2;
                    }
                    this.providerCache = persistentMap2;
                    return persistentMap2;
                }
                group = this.reader.parent(group);
            }
        }
        PersistentMap persistentMap3 = this.parentProvider;
        this.providerCache = persistentMap3;
        return persistentMap3;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Float) {
            if (value == ((Number) objNextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object objNextSlot = nextSlot();
        if (objNextSlot instanceof Double) {
            if (value == ((Number) objNextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
