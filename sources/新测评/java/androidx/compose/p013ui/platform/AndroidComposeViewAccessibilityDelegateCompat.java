package androidx.compose.p013ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.SparseArrayCompat;
import androidx.compose.p013ui.C2579R;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.HitTestResult;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.platform.AccessibilityIterators;
import androidx.compose.p013ui.platform.AndroidComposeView;
import androidx.compose.p013ui.semantics.AccessibilityAction;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.ScrollAxisRange;
import androidx.compose.p013ui.semantics.SemanticsActions;
import androidx.compose.p013ui.semantics.SemanticsConfiguration;
import androidx.compose.p013ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p013ui.semantics.SemanticsNode;
import androidx.compose.p013ui.semantics.SemanticsNodeKt;
import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.p013ui.text.platform.URLSpanCache;
import androidx.compose.p013ui.util.ListUtilsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 å\u00012\u00020\u0001:\nã\u0001ä\u0001å\u0001æ\u0001ç\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010r\u001a\u00020\"2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020+2\u0006\u0010u\u001a\u00020\u00062\b\u0010v\u001a\u0004\u0018\u00010wH\u0002J\u0010\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020&H\u0002J\u0010\u0010{\u001a\u00020\"H\u0080@¢\u0006\u0004\b|\u0010}J=\u0010~\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u007f\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u00122\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J/\u0010~\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u00122\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\t\u0010\u0087\u0001\u001a\u00020\"H\u0002J\u0011\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u0012H\u0002J\u001a\u0010\u0089\u0001\u001a\u00020P2\u0006\u0010s\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0003J\u0013\u0010\u008b\u0001\u001a\u0004\u0018\u00010+2\u0006\u0010s\u001a\u00020\u0012H\u0002JC\u0010\u008c\u0001\u001a\u00020P2\u0006\u0010s\u001a\u00020\u00122\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0003\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\u00152\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0000¢\u0006\u0003\b\u0095\u0001J\u0014\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0016J\u0012\u0010\u009a\u0001\u001a\u00020\u00122\u0007\u0010z\u001a\u00030\u009b\u0001H\u0002J\u0012\u0010\u009c\u0001\u001a\u00020\u00122\u0007\u0010z\u001a\u00030\u009b\u0001H\u0002J\u0016\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010z\u001a\u0005\u0018\u00010\u009b\u0001H\u0002J \u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010z\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010 \u0001\u001a\u00020\u0012H\u0002J#\u0010¡\u0001\u001a\u00020\u00122\b\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030£\u0001H\u0001¢\u0006\u0003\b¥\u0001J\u0011\u0010¦\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u0012H\u0002J\u0012\u0010§\u0001\u001a\u00020\u00152\u0007\u0010z\u001a\u00030\u009b\u0001H\u0002J\u0012\u0010¨\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020kH\u0002J\u0018\u0010ª\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020kH\u0000¢\u0006\u0003\b«\u0001J\u000f\u0010¬\u0001\u001a\u00020\"H\u0000¢\u0006\u0003\b\u00ad\u0001J$\u0010®\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u00122\u0007\u0010¯\u0001\u001a\u00020\u00122\b\u0010v\u001a\u0004\u0018\u00010wH\u0002J#\u0010°\u0001\u001a\u00020\"2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020+2\b\u0010±\u0001\u001a\u00030\u009b\u0001H\u0002J!\u0010²\u0001\u001a\u00020\u00152\u0007\u0010³\u0001\u001a\u00020\u00122\r\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020d01H\u0002J\u0011\u0010µ\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u0012H\u0002J\u0012\u0010¶\u0001\u001a\u00020\"2\u0007\u0010·\u0001\u001a\u00020dH\u0002J\u0012\u0010¸\u0001\u001a\u00020\u00122\u0007\u0010³\u0001\u001a\u00020\u0012H\u0002J\u001c\u0010¹\u0001\u001a\u00020\"2\b\u0010º\u0001\u001a\u00030\u009b\u00012\u0007\u0010»\u0001\u001a\u00020_H\u0002J\u0012\u0010¼\u0001\u001a\u00020\u00152\u0007\u0010\u0093\u0001\u001a\u00020PH\u0002J@\u0010½\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00122\u000b\b\u0002\u0010¾\u0001\u001a\u0004\u0018\u00010\u00122\u0011\b\u0002\u0010¿\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000101H\u0002¢\u0006\u0003\u0010À\u0001J&\u0010Á\u0001\u001a\u00020\"2\u0007\u0010Â\u0001\u001a\u00020\u00122\u0007\u0010¾\u0001\u001a\u00020\u00122\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010Ä\u0001\u001a\u00020\"2\u0007\u0010Â\u0001\u001a\u00020\u0012H\u0002J\u0018\u0010Å\u0001\u001a\u00020\"2\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u001b\u0010Ç\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020k2\u0007\u0010È\u0001\u001a\u00020WH\u0002J\u0012\u0010É\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020kH\u0002J-\u0010Ê\u0001\u001a\u00020\u00152\u0007\u0010z\u001a\u00030\u009b\u00012\u0007\u0010Ë\u0001\u001a\u00020\u00122\u0007\u0010Ì\u0001\u001a\u00020\u00122\u0007\u0010Í\u0001\u001a\u00020\u0015H\u0002J\u001a\u0010Î\u0001\u001a\u00020\"2\u0007\u0010z\u001a\u00030\u009b\u00012\u0006\u0010t\u001a\u00020+H\u0002J\u001a\u0010Ï\u0001\u001a\u00020\"2\u0007\u0010z\u001a\u00030\u009b\u00012\u0006\u0010t\u001a\u00020+H\u0002J\"\u0010Ð\u0001\u001a\u0005\u0018\u00010Ñ\u00012\n\u0010Ò\u0001\u001a\u0005\u0018\u00010\u009b\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0002J-\u0010Õ\u0001\u001a\u00020\u00152\u0007\u0010z\u001a\u00030\u009b\u00012\u0007\u0010 \u0001\u001a\u00020\u00122\u0007\u0010Ö\u0001\u001a\u00020\u00152\u0007\u0010×\u0001\u001a\u00020\u0015H\u0002J4\u0010Ø\u0001\u001a\u0005\u0018\u0001HÙ\u0001\"\t\b\u0000\u0010Ù\u0001*\u00020\u001f2\n\u0010\u0090\u0001\u001a\u0005\u0018\u0001HÙ\u00012\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0003\u0010Û\u0001J\u0011\u0010Ü\u0001\u001a\u00020\"2\u0006\u0010s\u001a\u00020\u0012H\u0002J\t\u0010Ý\u0001\u001a\u00020\"H\u0002J\u0011\u0010Þ\u0001\u001a\u0005\u0018\u00010ß\u0001*\u00030à\u0001H\u0002J\u0011\u0010á\u0001\u001a\u0005\u0018\u00010â\u0001*\u00030ß\u0001H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010-\u001a&\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/ 0*\u0012\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/\u0018\u0001010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00107\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020?X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0014\u0010I\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0018R\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0K0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010L\u001a\u00060MR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010N\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00150O8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bQ\u00109\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010V\u001a\u00020WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Z0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020_0YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010a\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010bR\u001a\u0010c\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\"0OX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020d0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020gX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010i\u001a\b\u0012\u0004\u0012\u00020k0jX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020oX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006è\u0001"}, m13558d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ExtraDataTestTraversalAfterVal", "", "getExtraDataTestTraversalAfterVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "getExtraDataTestTraversalBeforeVal$ui_release", "SendRecurringAccessibilityEventsIntervalMillis", "", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui_release", "(J)V", "accessibilityCursorPosition", "", "accessibilityFocusedVirtualViewId", "value", "", "accessibilityForceEnabledForTesting", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "checkingForSemanticsChanges", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Landroidx/collection/IntObjectMap;", "currentSemanticsNodesInvalidated", "currentlyAccessibilityFocusedANI", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "currentlyFocusedANI", "enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release$annotations", "()V", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "idToAfterMap", "Landroidx/collection/MutableIntIntMap;", "getIdToAfterMap$ui_release", "()Landroidx/collection/MutableIntIntMap;", "setIdToAfterMap$ui_release", "(Landroidx/collection/MutableIntIntMap;)V", "idToBeforeMap", "getIdToBeforeMap$ui_release", "setIdToBeforeMap$ui_release", "isEnabled", "isEnabled$ui_release", "isTouchExplorationEnabled", "labelToActionId", "Landroidx/collection/MutableObjectIntMap;", "nodeProvider", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "onSendAccessibilityEvent", "Lkotlin/Function1;", "Landroid/view/accessibility/AccessibilityEvent;", "getOnSendAccessibilityEvent$ui_release$annotations", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "paneDisplayed", "Landroidx/collection/MutableIntSet;", "pendingHorizontalScrollEvents", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingVerticalScrollEvents", "previousSemanticsNodes", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scheduleScrollEventIfNeededLambda", "Landroidx/compose/ui/platform/ScrollObservationScope;", "scrollObservationScopes", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendingFocusAffectingEvent", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/node/LayoutNode;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "extraDataKey", "arguments", "Landroid/os/Bundle;", "boundsInScreen", "Landroid/graphics/Rect;", "node", "boundsUpdatesEventLoop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canScroll", "vertical", "direction", RequestParameters.POSITION, "Landroidx/compose/ui/geometry/Offset;", "canScroll-moWRBKg", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "checkForSemanticsChanges", "clearAccessibilityFocus", "createEvent", "eventType", "createNodeInfo", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui_release", "getAccessibilityNodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "Landroidx/compose/ui/semantics/SemanticsNode;", "getAccessibilitySelectionStart", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "performActionHelper", "action", "populateAccessibilityNodeInfoProperties", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "requestAccessibilityFocus", "scheduleScrollEventIfNeeded", "scrollObservationScope", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendAccessibilitySemanticsStructureChangeEvents", "newNode", "oldNode", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "sendTypeViewScrolledAccessibilityEvent", "setAccessibilitySelection", "start", "end", "traversalMode", "setContentInvalid", "setText", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", ExifInterface.GPS_DIRECTION_TRUE, "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "getTextForTextField", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "toSpannableString", "Landroid/text/SpannableString;", "Api24Impl", "Api29Impl", "Companion", "ComposeAccessibilityNodeProvider", "PendingTextTraversedEvent", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 IntList.kt\nandroidx/collection/IntList\n+ 11 IntList.kt\nandroidx/collection/IntListKt\n+ 12 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 16 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 17 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 18 IntSet.kt\nandroidx/collection/IntSet\n+ 19 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n1#1,3362:1\n111#2,2:3363\n65#2:3404\n69#2:3407\n65#2:3410\n69#2:3413\n65#2:3472\n69#2:3475\n65#2:3478\n69#2:3481\n397#3,3:3365\n354#3,6:3368\n364#3,3:3375\n367#3,9:3379\n400#3:3388\n425#3:3420\n382#3,4:3531\n354#3,6:3535\n364#3,3:3542\n367#3,9:3546\n386#3:3555\n390#3,3:3556\n354#3,6:3559\n364#3,3:3566\n367#3,2:3570\n370#3,6:3615\n393#3:3621\n425#3:3626\n425#3:3658\n1399#4:3374\n1270#4:3378\n1399#4:3516\n1270#4:3520\n1399#4:3541\n1270#4:3545\n1399#4:3565\n1270#4:3569\n1399#4:3589\n1270#4:3593\n1399#4:3639\n1270#4:3643\n76#5,7:3389\n76#5,7:3572\n30#6:3396\n30#6:3400\n30#6:3464\n30#6:3468\n30#6:3484\n53#7,3:3397\n53#7,3:3401\n60#7:3405\n70#7:3408\n60#7:3411\n70#7:3414\n60#7:3451\n70#7:3454\n53#7,3:3465\n53#7,3:3469\n60#7:3473\n70#7:3476\n60#7:3479\n70#7:3482\n53#7,3:3485\n22#8:3406\n22#8:3409\n22#8:3412\n22#8:3415\n22#8:3452\n22#8:3455\n22#8:3474\n22#8:3477\n22#8:3480\n22#8:3483\n34#9,4:3416\n39#9:3421\n34#9,4:3431\n39#9:3436\n70#9,6:3437\n70#9,6:3443\n34#9,6:3456\n34#9,6:3596\n34#9,6:3602\n34#9,4:3622\n39#9:3627\n34#9,4:3654\n39#9:3659\n65#10:3422\n65#10:3423\n237#10,6:3425\n905#11:3424\n438#12:3435\n1#13:3449\n57#14:3450\n61#14:3453\n37#15,2:3462\n91#16:3488\n91#16:3489\n26#17,5:3490\n26#17,5:3495\n26#17,5:3500\n26#17,5:3660\n26#17,5:3665\n255#18,4:3505\n225#18,7:3509\n236#18,3:3517\n239#18,9:3521\n259#18:3530\n255#18,4:3628\n225#18,7:3632\n236#18,3:3640\n239#18,9:3644\n259#18:3653\n357#19,4:3579\n329#19,6:3583\n339#19,3:3590\n342#19,2:3594\n345#19,6:3608\n361#19:3614\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n468#1:3363,2\n555#1:3404\n556#1:3407\n557#1:3410\n558#1:3413\n1723#1:3472\n1724#1:3475\n1725#1:3478\n1726#1:3481\n477#1:3365,3\n477#1:3368,6\n477#1:3375,3\n477#1:3379,9\n477#1:3388\n616#1:3420\n2087#1:3531,4\n2087#1:3535,6\n2087#1:3542,3\n2087#1:3546,9\n2087#1:3555\n2110#1:3556,3\n2110#1:3559,6\n2110#1:3566,3\n2110#1:3570,2\n2110#1:3615,6\n2110#1:3621\n2578#1:3626\n2596#1:3658\n477#1:3374\n477#1:3378\n2069#1:3516\n2069#1:3520\n2087#1:3541\n2087#1:3545\n2110#1:3565\n2110#1:3569\n2121#1:3589\n2121#1:3593\n2588#1:3639\n2588#1:3643\n530#1:3389,7\n2115#1:3572,7\n550#1:3396\n552#1:3400\n1719#1:3464\n1721#1:3468\n1797#1:3484\n550#1:3397,3\n552#1:3401,3\n555#1:3405\n556#1:3408\n557#1:3411\n558#1:3414\n1415#1:3451\n1450#1:3454\n1719#1:3465,3\n1721#1:3469,3\n1723#1:3473\n1724#1:3476\n1725#1:3479\n1726#1:3482\n1797#1:3485,3\n555#1:3406\n556#1:3409\n557#1:3412\n558#1:3415\n1415#1:3452\n1450#1:3455\n1723#1:3474\n1724#1:3477\n1725#1:3480\n1726#1:3483\n615#1:3416,4\n615#1:3421\n1007#1:3431,4\n1007#1:3436\n1018#1:3437,6\n1025#1:3443,6\n1628#1:3456,6\n2396#1:3596,6\n2398#1:3602,6\n2577#1:3622,4\n2577#1:3627\n2595#1:3654,4\n2595#1:3659\n987#1:3422\n990#1:3423\n1004#1:3425,6\n1003#1:3424\n1008#1:3435\n1415#1:3450\n1450#1:3453\n1690#1:3462,2\n1812#1:3488\n2025#1:3489\n2051#1:3490,5\n2060#1:3495,5\n2063#1:3500,5\n1891#1:3660,5\n1892#1:3665,5\n2069#1:3505,4\n2069#1:3509,7\n2069#1:3517,3\n2069#1:3521,9\n2069#1:3530\n2588#1:3628,4\n2588#1:3632,7\n2588#1:3640,3\n2588#1:3644,9\n2588#1:3653\n2121#1:3579,4\n2121#1:3583,6\n2121#1:3590,3\n2121#1:3594,2\n2121#1:3608,6\n2121#1:3614\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final int $stable = 8;
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(C2579R.id.accessibility_custom_action_0, C2579R.id.accessibility_custom_action_1, C2579R.id.accessibility_custom_action_2, C2579R.id.accessibility_custom_action_3, C2579R.id.accessibility_custom_action_4, C2579R.id.accessibility_custom_action_5, C2579R.id.accessibility_custom_action_6, C2579R.id.accessibility_custom_action_7, C2579R.id.accessibility_custom_action_8, C2579R.id.accessibility_custom_action_9, C2579R.id.accessibility_custom_action_10, C2579R.id.accessibility_custom_action_11, C2579R.id.accessibility_custom_action_12, C2579R.id.accessibility_custom_action_13, C2579R.id.accessibility_custom_action_14, C2579R.id.accessibility_custom_action_15, C2579R.id.accessibility_custom_action_16, C2579R.id.accessibility_custom_action_17, C2579R.id.accessibility_custom_action_18, C2579R.id.accessibility_custom_action_19, C2579R.id.accessibility_custom_action_20, C2579R.id.accessibility_custom_action_21, C2579R.id.accessibility_custom_action_22, C2579R.id.accessibility_custom_action_23, C2579R.id.accessibility_custom_action_24, C2579R.id.accessibility_custom_action_25, C2579R.id.accessibility_custom_action_26, C2579R.id.accessibility_custom_action_27, C2579R.id.accessibility_custom_action_28, C2579R.id.accessibility_custom_action_29, C2579R.id.accessibility_custom_action_30, C2579R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }
    };

    @RequiresApi(24)
    @Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m13558d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    @RequiresApi(29)
    @Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m13558d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (role == null ? false : Role.m22787equalsimpl0(role.getValue(), Role.INSTANCE.m22792getCarouselo7Vup1c())) {
                    return;
                }
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    @Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0013"}, m13558d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "findFocus", "focus", "performAction", "", "action", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int virtualViewId) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
                }
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
                }
            }
            return accessibilityNodeInfoCompatCreateNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int focus) {
            if (focus == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (focus == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }
    }

    @Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m13558d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i10, int i11, int i12, int i13, long j10) {
            this.node = semanticsNode;
            this.action = i10;
            this.granularity = i11;
            this.fromIndex = i12;
            this.toIndex = i13;
            this.traverseTime = j10;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.g
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z9) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f1444a, z9);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.h
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z9) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f1445a, z9);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.i
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$37(this.f1446a);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
            if (orDefault != -1) {
                info.getExtras().putInt(extraDataKey, orDefault);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(virtualViewId, -1);
            if (orDefault2 != -1) {
                info.getExtras().putInt(extraDataKey, orDefault2);
                return;
            }
            return;
        }
        if (!semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || arguments == null || !Intrinsics.areEqual(extraDataKey, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig.contains(semanticsProperties.getTestTag()) || arguments == null || !Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey)) {
                if (Intrinsics.areEqual(extraDataKey, ExtraDataIdKey)) {
                    info.getExtras().putInt(extraDataKey, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag());
                if (str != null) {
                    info.getExtras().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
        }
        int i10 = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
        int i11 = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
        if (i11 > 0 && i10 >= 0) {
            if (i10 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig());
                if (textLayoutResult == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = i10 + i12;
                    if (i13 >= textLayoutResult.getLayoutInput().getText().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i13)));
                    }
                }
                info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds node) {
        Rect adjustedBounds = node.getAdjustedBounds();
        AndroidComposeView androidComposeView = this.view;
        float f10 = adjustedBounds.left;
        float f11 = adjustedBounds.top;
        long jMo22279localToScreenMKHz9U = androidComposeView.mo22279localToScreenMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
        AndroidComposeView androidComposeView2 = this.view;
        float f12 = adjustedBounds.right;
        float f13 = adjustedBounds.bottom;
        long jMo22279localToScreenMKHz9U2 = androidComposeView2.mo22279localToScreenMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U2 & 4294967295L))));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m22702canScrollmoWRBKg(androidx.collection.IntObjectMap<androidx.compose.p013ui.platform.SemanticsNodeWithAdjustedBounds> r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m22702canScrollmoWRBKg(androidx.collection.IntObjectMap, boolean, int, long):boolean");
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    @VisibleForTesting
    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId)) != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int virtualViewId) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer numValueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (numValueOf == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + virtualViewId + " has null parent");
                throw new KotlinNothingValueException();
            }
            int iIntValue = numValueOf.intValue();
            accessibilityNodeInfoCompatObtain.setParent(this.view, iIntValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? iIntValue : -1);
        }
        accessibilityNodeInfoCompatObtain.setSource(this.view, virtualViewId);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(virtualViewId, accessibilityNodeInfoCompatObtain, semanticsNode);
        return accessibilityNodeInfoCompatObtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventCreateEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventCreateEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventCreateEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventCreateEvent.getText().add(text);
        }
        return accessibilityEventCreateEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z9) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z9 ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt.emptyList();
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m23022getEndimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m23027getStartimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            if (isEnabled$ui_release()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    @VisibleForTesting
    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (node == null || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        }
        if (granularity == 2) {
            AccessibilityIterators.WordTextSegmentIterator companion2 = AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion3 = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                companion3.initialize(iterableTextForAccessibility);
                return companion3;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion4 = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
            companion4.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion4;
        }
        AccessibilityIterators.PageTextSegmentIterator companion5 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
        companion5.initialize(iterableTextForAccessibility, textLayoutResult, node);
        return companion5;
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getEditableText());
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo24070trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:97:0x01b4
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b3 -> B:97:0x01b4). Please report as a decompilation issue!!! */
    public final boolean performActionHelper(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f10) {
        if (f10 >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f10 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void populateAccessibilityNodeInfoProperties(int r17, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r18, androidx.compose.p013ui.semantics.SemanticsNode r19) {
        /*
            Method dump skipped, instructions count: 2199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean registerScrollingId(int id, List<ScrollObservationScope> oldScrollObservationScopes) {
        boolean z9;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(oldScrollObservationScopes, id);
        if (scrollObservationScopeFindById != null) {
            z9 = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z9 = true;
            scrollObservationScopeFindById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z9;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i10 = this.accessibilityFocusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i10, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded.1
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
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(this.accessibilityFocusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (accessibilityNodeInfoCompat != null) {
                                    accessibilityNodeInfoCompat.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (accessibilityNodeInfoCompat2 != null) {
                                    accessibilityNodeInfoCompat2.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2));
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused2) {
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$37(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.p013ui.semantics.SemanticsNode r17, androidx.compose.p013ui.platform.SemanticsNodeCopy r18) {
        /*
            r16 = this;
            r0 = r16
            androidx.collection.MutableIntSet r1 = androidx.collection.IntSetKt.mutableIntSetOf()
            java.util.List r2 = r17.getReplacedChildren$ui_release()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L10:
            if (r5 >= r3) goto L46
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.semantics.SemanticsNode r6 = (androidx.compose.p013ui.semantics.SemanticsNode) r6
            androidx.collection.IntObjectMap r7 = r0.getCurrentSemanticsNodes()
            int r8 = r6.getId()
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L43
            androidx.collection.MutableIntSet r7 = r18.getChildren()
            int r8 = r6.getId()
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L3c
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.notifySubtreeAccessibilityStateChangedIfNeeded(r1)
            return
        L3c:
            int r6 = r6.getId()
            r1.add(r6)
        L43:
            int r5 = r5 + 1
            goto L10
        L46:
            androidx.collection.MutableIntSet r2 = r18.getChildren()
            int[] r3 = r2.elements
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L97
            r6 = r4
        L54:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L92
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L6e:
            if (r11 >= r9) goto L90
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.contains(r12)
            if (r12 != 0) goto L8c
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.notifySubtreeAccessibilityStateChangedIfNeeded(r1)
            return
        L8c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L6e
        L90:
            if (r9 != r10) goto L97
        L92:
            if (r6 == r5) goto L97
            int r6 = r6 + 1
            goto L54
        L97:
            java.util.List r1 = r17.getReplacedChildren$ui_release()
            int r2 = r1.size()
        L9f:
            if (r4 >= r2) goto Lca
            java.lang.Object r3 = r1.get(r4)
            androidx.compose.ui.semantics.SemanticsNode r3 = (androidx.compose.p013ui.semantics.SemanticsNode) r3
            androidx.collection.IntObjectMap r5 = r0.getCurrentSemanticsNodes()
            int r6 = r3.getId()
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto Lc7
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r5 = r0.previousSemanticsNodes
            int r6 = r3.getId()
            java.lang.Object r5 = r5.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            androidx.compose.ui.platform.SemanticsNodeCopy r5 = (androidx.compose.p013ui.platform.SemanticsNodeCopy) r5
            r0.sendAccessibilitySemanticsStructureChangeEvents(r3, r5)
        Lc7:
            int r4 = r4 + 1
            goto L9f
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    private final boolean sendEvent(AccessibilityEvent event) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventCreateEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(accessibilityEventCreateEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i10, i11, num, list);
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventCreateEvent.getText().add(title);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0556  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap<androidx.compose.p013ui.platform.SemanticsNodeWithAdjustedBounds> r54) {
        /*
            Method dump skipped, instructions count: 1695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap):void");
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode layoutNodeFindClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8)));
                    }
                });
            }
            if (layoutNode == null || (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) == null) {
                return;
            }
            if (!semanticsConfiguration.getIsMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(LayoutNode layoutNode2) {
                    SemanticsConfiguration semanticsConfiguration2 = layoutNode2.getSemanticsConfiguration();
                    boolean z9 = false;
                    if (semanticsConfiguration2 != null && semanticsConfiguration2.getIsMergingSemanticsOfDescendants()) {
                        z9 = true;
                    }
                    return Boolean.valueOf(z9);
                }
            })) != null) {
                layoutNode = layoutNodeFindClosestParentNode;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (subtreeChangedSemanticsNodesIds.add(semanticsId)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                accessibilityEventCreateEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(accessibilityEventCreateEvent);
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node)) {
            Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z9 = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z9 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z9 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z9 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getError()));
        }
    }

    private final void setText(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        AnnotatedString infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(node);
        info.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.p013ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.p013ui.geometry.Rect rectM20772translatek4lQ0M = bounds.m20772translatek4lQ0M(textNode.m22801getPositionInRootF1C5BW0());
        androidx.compose.p013ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.p013ui.geometry.Rect rectIntersect = rectM20772translatek4lQ0M.overlaps(boundsInRoot) ? rectM20772translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = rectIntersect.getLeft();
        long jMo22279localToScreenMKHz9U = androidComposeView.mo22279localToScreenMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(rectIntersect.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        long jMo22279localToScreenMKHz9U2 = this.view.mo22279localToScreenMKHz9U(Offset.m20727constructorimpl((Float.floatToRawIntBits(rectIntersect.getRight()) << 32) | (Float.floatToRawIntBits(rectIntersect.getBottom()) & 4294967295L)));
        return new RectF(Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U >> 32)), Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U2 >> 32)), Float.intBitsToFloat((int) (jMo22279localToScreenMKHz9U2 & 4294967295L)));
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z9) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int accessibilitySelectionStart;
        int i10;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        boolean z9 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(node, granularity);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
            }
            int[] iArrFollowing = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (iArrFollowing == null) {
                return false;
            }
            int i11 = iArrFollowing[0];
            z9 = true;
            int i12 = iArrFollowing[1];
            if (extendSelection && isAccessibilitySelectionExtendable(node)) {
                accessibilitySelectionStart = getAccessibilitySelectionStart(node);
                if (accessibilitySelectionStart == -1) {
                    accessibilitySelectionStart = forward ? i11 : i12;
                }
                i10 = forward ? i12 : i11;
            } else {
                accessibilitySelectionStart = forward ? i12 : i11;
                i10 = accessibilitySelectionStart;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, forward ? 256 : 512, granularity, i11, i12, SystemClock.uptimeMillis());
            setAccessibilitySelection(node, accessibilitySelectionStart, i10, true);
        }
        return z9;
    }

    private final <T extends CharSequence> T trimToSize(T text, @IntRange(from = 1) int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i10 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i10)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i10;
        }
        T t10 = (T) text.subSequence(0, size);
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t10;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i10 = this.hoveredVirtualViewId;
        if (i10 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i10, 256, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsNodesCopyAndPanes() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cf -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m22703canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m22702canScrollmoWRBKg(getCurrentSemanticsNodes(), vertical, direction, position);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent event) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    /* renamed from: getIdToAfterMap$ui_release, reason: from getter */
    public final MutableIntIntMap getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* renamed from: getIdToBeforeMap$ui_release, reason: from getter */
    public final MutableIntIntMap getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    /* renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui_release, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float x9, float y9) {
        int iSemanticsNodeIdToAccessibilityVirtualNodeId;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m22495hitTestSemantics6fMxITs$ui_release$default(this.view.getRoot(), Offset.m20727constructorimpl((Float.floatToRawIntBits(y9) & 4294967295L) | (Float.floatToRawIntBits(x9) << 32)), hitTestResult, 0, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            iSemanticsNodeIdToAccessibilityVirtualNodeId = Integer.MIN_VALUE;
            if (-1 >= lastIndex) {
                break;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (layoutNodeRequireLayoutNode.getNodes().m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8))) {
                iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
                SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false);
                if (SemanticsUtils_androidKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker())) {
                    break;
                }
            }
            lastIndex--;
        }
        return iSemanticsNodeIdToAccessibilityVirtualNodeId;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z9) {
        this.accessibilityForceEnabledForTesting = z9;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui_release(int i10) {
        this.hoveredVirtualViewId = i10;
    }

    public final void setIdToAfterMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    public final void setIdToBeforeMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1<? super AccessibilityEvent, Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j10) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j10;
    }
}
