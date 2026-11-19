package androidx.compose.foundation.pager;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.Remeasurement;
import androidx.compose.p011ui.layout.RemeasurementModifier;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;
import p200x6.C6756f;

@Stable
@Metadata(m5109d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\nJ2\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010 JA\u0010(\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2'\u0010'\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$\u0012\u0006\u0012\u0004\u0018\u00010%0#¢\u0006\u0002\b&H\u0096@¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J)\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00172\b\b\u0002\u00100\u001a\u00020\u0017H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00106\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J!\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010,J\u0010\u0010?\u001a\u00020\rH\u0082@¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bA\u0010BJ\u0013\u0010C\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\r2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bL\u0010MR$\u0010O\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u00105R(\u0010R\u001a\u0004\u0018\u00010-2\b\u0010N\u001a\u0004\u0018\u00010-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR1\u0010]\u001a\u00020V2\u0006\u0010N\u001a\u00020V8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010a\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR$\u0010e\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010dR\"\u0010h\u001a\u00020g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010Z\"\u0004\bk\u0010\\R\"\u0010l\u001a\u00020g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010i\u001a\u0004\bm\u0010Z\"\u0004\bn\u0010\\R\u0016\u0010o\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010pR\u0014\u0010r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR$\u0010t\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bt\u0010b\u001a\u0004\bu\u0010dR\u0016\u0010v\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010bR\"\u0010w\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010P\u001a\u0004\bx\u00105\"\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010bR\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010PR\u001f\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010XR*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u0093\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010d\"\u0006\b\u0091\u0001\u0010\u0092\u0001R1\u0010\u0097\u0001\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u008f\u0001\u001a\u0005\b\u0095\u0001\u0010d\"\u0006\b\u0096\u0001\u0010\u0092\u0001R\u001f\u0010\u009b\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010dR\u001e\u0010\u0013\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u0099\u0001\u001a\u0005\b\u009d\u0001\u0010dR \u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R \u0010¤\u0001\u001a\u00030£\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010©\u0001\u001a\u00030¨\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R7\u0010³\u0001\u001a\u0005\u0018\u00010\u00ad\u00012\t\u0010N\u001a\u0005\u0018\u00010\u00ad\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b®\u0001\u0010X\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R \u0010µ\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R-\u0010º\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\bº\u0001\u0010i\u001a\u0005\b»\u0001\u0010Z\"\u0005\b¼\u0001\u0010\\R \u0010¾\u0001\u001a\u00030½\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R%\u0010Ã\u0001\u001a\u00030Â\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\bÃ\u0001\u0010X\u001a\u0006\bÄ\u0001\u0010Å\u0001R%\u0010Æ\u0001\u001a\u00030Â\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\bÆ\u0001\u0010X\u001a\u0006\bÇ\u0001\u0010Å\u0001R/\u0010Ë\u0001\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÈ\u0001\u0010X\u001a\u0005\bÉ\u0001\u00105\"\u0005\bÊ\u0001\u0010zR/\u0010Ï\u0001\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÌ\u0001\u0010X\u001a\u0005\bÍ\u0001\u00105\"\u0005\bÎ\u0001\u0010zR\u001d\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÐ\u0001\u0010XR\u001d\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÑ\u0001\u0010XR\u0016\u0010Ó\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010dR\u0016\u0010Õ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010dR\u0014\u0010Ø\u0001\u001a\u00020H8F¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0016\u0010Ú\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010dR\u0016\u0010Ü\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010dR\u0016\u0010Þ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010dR\u0017\u0010á\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u0015\u0010å\u0001\u001a\u00030â\u00018F¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010dR\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\bç\u0001\u0010à\u0001R!\u0010í\u0001\u001a\u00030è\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bé\u0001\u0010ê\u0001*\u0006\bë\u0001\u0010ì\u0001R\u0016\u0010î\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u00105R\u0016\u0010ð\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bï\u0001\u00105R\u0016\u0010ò\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bñ\u0001\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ó\u0001"}, m5110d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "<init>", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "(IF)V", "page", "pageOffsetFraction", "Ld6/s;", "scrollToPage", "(IFLh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/ScrollScope;", "updateCurrentPage", "(Landroidx/compose/foundation/gestures/ScrollScope;IF)V", "targetPage", "updateTargetPage", "(Landroidx/compose/foundation/gestures/ScrollScope;I)V", "offsetFraction", "", "forceRemeasure", "snapToItem$foundation_release", "(IFZ)V", "snapToItem", "requestScrollToPage", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lr6/e;Lh6/c;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/pager/PagerMeasureResult;ZZ)V", "applyMeasureResult", "isNotGestureAction$foundation_release", "()Z", "isNotGestureAction", "getOffsetDistanceInPages", "(I)F", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "matchScrollPositionWithKey$foundation_release", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "matchScrollPositionWithKey", "performScroll", "awaitScrollDependencies", "(Lh6/c;)Ljava/lang/Object;", "tryRunPrefetch", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "coerceInPageRange", "(I)I", "scrollDelta", "isGestureActionMatchesScroll", "(F)Z", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "info", "notifyPrefetch", "(FLandroidx/compose/foundation/pager/PagerLayoutInfo;)V", "cancelPrefetchIfVisibleItemsChanged", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "<set-?>", "hasLookaheadOccurred", "Z", "getHasLookaheadOccurred$foundation_release", "approachLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getApproachLayoutInfo$foundation_release", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference$delegate", "Landroidx/compose/runtime/MutableState;", "getUpDownDifference-F1C5BW0$foundation_release", "()J", "setUpDownDifference-k-4lQ0M$foundation_release", "(J)V", "upDownDifference", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "firstVisiblePage", "I", "getFirstVisiblePage$foundation_release", "()I", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "", "maxScrollOffset", "J", "getMaxScrollOffset$foundation_release", "setMaxScrollOffset$foundation_release", "minScrollOffset", "getMinScrollOffset$foundation_release", "setMinScrollOffset$foundation_release", "accumulator", "F", "previousPassDelta", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "layoutWithMeasurement", "getLayoutWithMeasurement$foundation_release", "layoutWithoutMeasurement", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "wasPrefetchingForward", "Landroidx/compose/runtime/MutableState;", "pagerLayoutInfoState", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "(I)V", "programmaticScrollTargetPage", "settledPageState$delegate", "getSettledPageState", "setSettledPageState", "settledPageState", "settledPage$delegate", "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", "targetPage$delegate", "getTargetPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/ui/unit/Constraints;", "premeasureConstraints", "getPremeasureConstraints-msEJaDk$foundation_release", "setPremeasureConstraints-BRTryo0$foundation_release", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "measurementScopeInvalidator", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "isLastScrollForwardState", "isLastScrollBackwardState", "getPageCount", "pageCount", "getNumMeasurePasses$foundation_release", "numMeasurePasses", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "getPageSpacing$foundation_release", "pageSpacing", "getPageSize$foundation_release", "pageSize", "getPageSizeWithSpacing$foundation_release", "pageSizeWithSpacing", "getPositionThresholdFraction$foundation_release", "()F", "positionThresholdFraction", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getCurrentPage", "getCurrentPageOffsetFraction", "Lx6/f;", "getNearestRange$foundation_release", "()Lx6/f;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,994:1\n96#2,5:995\n96#2,5:1027\n96#2,5:1070\n85#3:1000\n113#3,2:1001\n85#3:1021\n85#3:1022\n85#3:1023\n113#3,2:1024\n85#3:1026\n85#3:1032\n113#3,2:1033\n85#3:1035\n113#3,2:1036\n897#4,4:1003\n897#4,4:1007\n897#4,4:1011\n897#4,4:1038\n897#4,4:1042\n897#4,4:1047\n78#5:1015\n107#5,2:1016\n78#5:1018\n107#5,2:1019\n1#6:1046\n602#7,8:1051\n602#7,8:1075\n69#8:1059\n65#8:1062\n65#8:1065\n69#8:1068\n70#9:1060\n60#9:1063\n60#9:1066\n70#9:1069\n22#10:1061\n22#10:1064\n22#10:1067\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n178#1:995,5\n611#1:1027,5\n829#1:1070,5\n185#1:1000\n185#1:1001,2\n398#1:1021\n416#1:1022\n471#1:1023\n471#1:1024,2\n488#1:1026\n652#1:1032\n652#1:1033,2\n655#1:1035\n655#1:1036,2\n219#1:1003,4\n276#1:1007,4\n286#1:1011,4\n676#1:1038,4\n680#1:1042,4\n698#1:1047,4\n384#1:1015\n384#1:1016,2\n386#1:1018\n386#1:1019,2\n705#1:1051,8\n842#1:1075,8\n725#1:1059\n727#1:1062\n731#1:1065\n731#1:1068\n725#1:1060\n727#1:1063\n731#1:1066\n731#1:1069\n725#1:1061\n727#1:1064\n731#1:1067\n*E\n"})
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;

    @Nullable
    private PagerMeasureResult approachLayoutInfo;

    @NotNull
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @NotNull
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollForward;

    @Nullable
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    @NotNull
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;

    @NotNull
    private final MutableInteractionSource internalInteractionSource;

    @NotNull
    private final MutableState<Boolean> isLastScrollBackwardState;

    @NotNull
    private final MutableState<Boolean> isLastScrollForwardState;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;

    @NotNull
    private final MutableState<C5443s> measurementScopeInvalidator;
    private long minScrollOffset;

    @NotNull
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;

    @NotNull
    private final LazyLayoutPinnedItemList pinnedPages;

    @NotNull
    private final MutableState<C5443s> placementScopeInvalidator;

    @NotNull
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    /* renamed from: programmaticScrollTargetPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState programmaticScrollTargetPage;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState remeasurement;

    @NotNull
    private final RemeasurementModifier remeasurementModifier;

    @NotNull
    private final PagerScrollPosition scrollPosition;

    @NotNull
    private final ScrollableState scrollableState;

    /* renamed from: settledPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State settledPage;

    /* renamed from: settledPageState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState settledPageState;

    /* renamed from: targetPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetPage;

    /* renamed from: upDownDifference$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState upDownDifference;
    private boolean wasPrefetchingForward;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.pager.PagerState", m5303f = "PagerState.kt", m5304i = {0, 0, 0, 0}, m5305l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 617}, m5306m = "animateScrollToPage", m5307n = {"this", "animationSpec", "page", "pageOffsetFraction"}, m5308s = {"L$0", "L$1", "I$0", "F$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 */
    public static final class C11891 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11891(InterfaceC5631c<? super C11891> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", m5303f = "PagerState.kt", m5304i = {}, m5305l = {619}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 */
    public static final class C11903 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ int $targetPage;
        final /* synthetic */ float $targetPageOffsetToSnappedPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11903(int i, float f, AnimationSpec<Float> animationSpec, InterfaceC5631c<? super C11903> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$targetPage = i;
            this.$targetPageOffsetToSnappedPosition = f;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C11903 c11903 = PagerState.this.new C11903(this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, interfaceC5631c);
            c11903.L$0 = obj;
            return c11903;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(ScrollScope scrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C11903) create(scrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(PagerState.this, (ScrollScope) this.L$0);
                int i8 = this.$targetPage;
                float f = this.$targetPageOffsetToSnappedPosition;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final PagerState pagerState = PagerState.this;
                InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.foundation.pager.PagerState.animateScrollToPage.3.1
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((ScrollScope) obj2, ((Number) obj3).intValue());
                        return C5443s.f8405a;
                    }

                    public final void invoke(ScrollScope scrollScope, int i9) {
                        pagerState.updateTargetPage(scrollScope, i9);
                    }
                };
                this.label = 1;
                if (PagerStateKt.animateScrollToPage(LazyLayoutScrollScope, i8, f, animationSpec, interfaceC6473e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", m5303f = "PagerState.kt", m5304i = {}, m5305l = {581}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.pager.PagerState$requestScrollToPage$1 */
    public static final class C11911 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C11911(InterfaceC5631c<? super C11911> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return PagerState.this.new C11911(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                PagerState pagerState = PagerState.this;
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(pagerState, null, this, 1, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C11911) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.pager.PagerState", m5303f = "PagerState.kt", m5304i = {0, 0, 0, 1}, m5305l = {636, 641}, m5306m = "scroll$suspendImpl", m5307n = {"$this", "scrollPriority", "block", "$this"}, m5308s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$scroll$1 */
    public static final class C11921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11921(InterfaceC5631c<? super C11921> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.scroll$suspendImpl(PagerState.this, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", m5303f = "PagerState.kt", m5304i = {}, m5305l = {TypedValues.PositionType.TYPE_PERCENT_Y}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,994:1\n897#2,4:995\n96#3,5:999\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n506#1:995,4\n508#1:999,5\n*E\n"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2 */
    public static final class C11932 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11932(float f, int i, InterfaceC5631c<? super C11932> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$pageOffsetFraction = f;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return PagerState.this.new C11932(this.$pageOffsetFraction, this.$page, interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(ScrollScope scrollScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C11932) create(scrollScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                PagerState pagerState = PagerState.this;
                this.label = 1;
                if (pagerState.awaitScrollDependencies(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            float f = this.$pageOffsetFraction;
            double d9 = f;
            boolean z8 = false;
            if (-0.5d <= d9 && d9 <= 0.5d) {
                z8 = true;
            }
            if (!z8) {
                InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
            }
            PagerState.this.snapToItem$foundation_release(PagerState.this.coerceInPageRange(this.$page), this.$pageOffsetFraction, true);
            return C5443s.f8405a;
        }
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, InterfaceC5631c interfaceC5631c, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i8 & 2) != 0) {
            f = 0.0f;
        }
        if ((i8 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, interfaceC5631c);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z8, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z8, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(interfaceC5631c);
        return objWaitForFirstLayout == CoroutineSingletons.COROUTINE_SUSPENDED ? objWaitForFirstLayout : C5443s.f8405a;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo info) {
        int index;
        if (this.indexToPrefetch == -1 || info.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.wasPrefetchingForward) {
            index = info.getBeyondViewportPageCount() + ((PageInfo) AbstractC5805t.m5235o0(info.getVisiblePagesInfo())).getIndex() + 1;
        } else {
            index = (((PageInfo) AbstractC5805t.m5228h0(info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return AbstractC5806u.m5274m(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float scrollDelta) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (m7521getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (m7521getUpDownDifferenceF1C5BW0$foundation_release() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation_release();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i8 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                i = currentPage;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i);
    }

    private final void notifyPrefetch(float delta, PagerLayoutInfo info) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !info.getVisiblePagesInfo().isEmpty()) {
            boolean z8 = delta > 0.0f;
            int beyondViewportPageCount = z8 ? info.getBeyondViewportPageCount() + ((PageInfo) AbstractC5805t.m5235o0(info.getVisiblePagesInfo())).getIndex() + 1 : (((PageInfo) AbstractC5805t.m5228h0(info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1;
            if (beyondViewportPageCount < 0 || beyondViewportPageCount >= getPageCount()) {
                return;
            }
            if (beyondViewportPageCount != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z8 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z8;
                this.indexToPrefetch = beyondViewportPageCount;
                this.currentPrefetchHandle = this.prefetchState.m7441schedulePrefetch0kLqBqw(beyondViewportPageCount, this.premeasureConstraints);
            }
            if (z8) {
                if ((((PageInfo) AbstractC5805t.m5235o0(info.getVisiblePagesInfo())).getOffset() + (info.getPageSpacing() + info.getPageSize())) - info.getViewportEndOffset() >= delta || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
                return;
            }
            if (info.getViewportStartOffset() - ((PageInfo) AbstractC5805t.m5228h0(info.getVisiblePagesInfo())).getOffset() >= (-delta) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float delta) {
        PagerMeasureResult pagerMeasureResult;
        long jCurrentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f = this.accumulator + delta;
        long jM6242r = AbstractC6600a.m6242r(f);
        this.accumulator = f - jM6242r;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j7 = jCurrentAbsoluteScrollOffset + jM6242r;
        long jM5275n = AbstractC5806u.m5275n(j7, this.minScrollOffset, this.maxScrollOffset);
        boolean z8 = j7 != jM5275n;
        long j8 = jM5275n - jCurrentAbsoluteScrollOffset;
        float f7 = j8;
        this.previousPassDelta = f7;
        if (Math.abs(j8) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f7 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f7 < 0.0f));
        }
        int i = (int) j8;
        int i8 = -i;
        PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(i8);
        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult != null ? pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i8) : null;
            if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
            } else {
                pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation_release(pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.m7450invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z8 ? Long.valueOf(j8) : Float.valueOf(delta)).floatValue();
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i, float f, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i8 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.requestScrollToPage(i, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, p152r6.InterfaceC6473e r7, p075h6.InterfaceC5631c<? super p045d6.C5443s> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState.C11921
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState.C11921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.AbstractC5774b.m5119b(r8)
            goto L79
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            r6.e r7 = (p152r6.InterfaceC6473e) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.AbstractC5774b.m5119b(r8)
            goto L5a
        L48:
            kotlin.AbstractC5774b.m5119b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 != r1) goto L5a
            goto L78
        L5a:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L67
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L67:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L79
        L78:
            return r1
        L79:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, r6.e, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, InterfaceC5631c interfaceC5631c, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i8 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, interfaceC5631c);
    }

    private final void setCanScrollBackward(boolean z8) {
        this.canScrollBackward.setValue(Boolean.valueOf(z8));
    }

    private final void setCanScrollForward(boolean z8) {
        this.canScrollForward.setValue(Boolean.valueOf(z8));
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.programmaticScrollTargetPage.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    private final void setSettledPageState(int i) {
        this.settledPageState.setIntValue(i);
    }

    private final void tryRunPrefetch(PagerMeasureResult result) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                notifyPrefetch(this.previousPassDelta, result);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i, float f, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i8 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r19, @androidx.annotation.FloatRange(from = -0.5d, m246to = 0.5d) float r20, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.AnimationSpec<java.lang.Float> r21, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r22) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, h6.c):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(@NotNull PagerMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateCurrentPageOffsetFraction(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            cancelPrefetchIfVisibleItemsChanged(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        setCanScrollBackward(result.getCanScrollBackward());
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(result);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(result, getPageCount());
        this.minScrollOffset = PagerStateKt.calculateNewMinScrollOffset(result, getPageCount());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Nullable
    /* renamed from: getApproachLayoutInfo$foundation_release, reason: from getter */
    public final PagerMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    @NotNull
    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    @NotNull
    /* renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    @NotNull
    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: getFirstVisiblePage$foundation_release, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: getFirstVisiblePageOffset$foundation_release, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* renamed from: getHasLookaheadOccurred$foundation_release, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @NotNull
    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    /* renamed from: getLayoutWithMeasurement$foundation_release, reason: from getter */
    public final int getLayoutWithMeasurement() {
        return this.layoutWithMeasurement;
    }

    /* renamed from: getMaxScrollOffset$foundation_release, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    @NotNull
    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C5443s> m7518getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    /* renamed from: getMinScrollOffset$foundation_release, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    @NotNull
    public final C6756f getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final float getOffsetDistanceInPages(int page) {
        boolean z8 = false;
        if (page >= 0 && page <= getPageCount()) {
            z8 = true;
        }
        if (!z8) {
            StringBuilder sbM94s = AbstractC0037f.m94s(page, "page ", " is not within the range 0 to ");
            sbM94s.append(getPageCount());
            InlineClassHelperKt.throwIllegalArgumentException(sbM94s.toString());
        }
        return (page - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSpacing$foundation_release() + getPageSize$foundation_release();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    @NotNull
    /* renamed from: getPinnedPages$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    @NotNull
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C5443s> m7519getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo6903toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    @NotNull
    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    @NotNull
    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m7521getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference.getValue()).m10451unboximpl();
    }

    public final boolean isNotGestureAction$foundation_release() {
        return ((int) Float.intBitsToFloat((int) (m7521getUpDownDifferenceF1C5BW0$foundation_release() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m7521getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L))) == 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation_release(@NotNull PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.scrollPosition.matchPageWithKey(itemProvider, currentPage);
    }

    public final void requestScrollToPage(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int page, @FloatRange(from = -0.5d, m246to = 0.5d) float pageOffsetFraction) {
        if (isScrollInProgress()) {
            AbstractC6014x.m5651v(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new C11911(null), 3);
        }
        snapToItem$foundation_release(page, pageOffsetFraction, false);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return scroll$suspendImpl(this, mutatePriority, interfaceC6473e, interfaceC5631c);
    }

    @Nullable
    public final Object scrollToPage(int i, @FloatRange(from = -0.5d, m246to = 0.5d) float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C11932(f, i, null), interfaceC5631c, 1, null);
        return objScroll$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll$default : C5443s.f8405a;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        this.density = density;
    }

    public final void setMaxScrollOffset$foundation_release(long j7) {
        this.maxScrollOffset = j7;
    }

    public final void setMinScrollOffset$foundation_release(long j7) {
        this.minScrollOffset = j7;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z8) {
        this.prefetchingEnabled = z8;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m7522setPremeasureConstraintsBRTryo0$foundation_release(long j7) {
        this.premeasureConstraints = j7;
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m7523setUpDownDifferencek4lQ0M$foundation_release(long j7) {
        this.upDownDifference.setValue(Offset.m10430boximpl(j7));
    }

    public final void snapToItem$foundation_release(int page, float offsetFraction, boolean forceRemeasure) {
        this.scrollPosition.requestPositionAndForgetLastKnownKey(page, offsetFraction);
        if (!forceRemeasure) {
            ObservableScopeInvalidator.m7450invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    public final void updateCurrentPage(@NotNull ScrollScope scrollScope, int i, @FloatRange(from = -0.5d, m246to = 0.5d) float f) {
        snapToItem$foundation_release(i, f, true);
    }

    public final void updateTargetPage(@NotNull ScrollScope scrollScope, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public PagerState(int i, @FloatRange(from = -0.5d, m246to = 0.5d) float f, @Nullable PrefetchScheduler prefetchScheduler) {
        double d9 = f;
        if (-0.5d > d9 || d9 > 0.5d) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m10430boximpl(Offset.INSTANCE.m10457getZeroF1C5BW0()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, f, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f7) {
                return Float.valueOf(this.this$0.performScroll(f7));
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.density = PagerStateKt.UnitDensity;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState = SnapshotIntStateKt.mutableIntStateOf(i);
        this.settledPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC6469a() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.isScrollInProgress() ? this.this$0.getSettledPageState() : this.this$0.getCurrentPage());
            }
        });
        this.targetPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC6469a() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.coerceInPageRange(!this.this$0.isScrollInProgress() ? this.this$0.getCurrentPage() : this.this$0.getProgrammaticScrollTargetPage() != -1 ? this.this$0.getProgrammaticScrollTargetPage() : Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction$foundation_release()) ? this.this$0.getLastScrolledForward() ? this.this$0.getFirstVisiblePage() + 1 : this.this$0.getFirstVisiblePage() : this.this$0.getCurrentPage()));
            }
        });
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new InterfaceC6471c() { // from class: androidx.compose.foundation.pager.PagerState$prefetchState$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NestedPrefetchScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(NestedPrefetchScope nestedPrefetchScope) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                PagerState pagerState = this.this$0;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    nestedPrefetchScope.schedulePrefetch(pagerState.getFirstVisiblePage());
                } finally {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                }
            }
        });
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.p011ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m7446constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m7446constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ PagerState(int i, float f, PrefetchScheduler prefetchScheduler, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0.0f : f, (i8 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i, float f, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0.0f : f);
    }

    public PagerState(int i, @FloatRange(from = -0.5d, m246to = 0.5d) float f) {
        this(i, f, null);
    }
}
