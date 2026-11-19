package androidx.compose.p013ui.node;

import android.view.View;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.InternalComposeUiApi;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.input.pointer.PointerType;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutInfo;
import androidx.compose.p013ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.ModifierInfo;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.Remeasurement;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.platform.JvmActuals_jvmKt;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.semantics.SemanticsConfiguration;
import androidx.compose.p013ui.semantics.SemanticsInfo;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpSize;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\bI\b\u0000\u0018\u0000 \u008f\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b\u008f\u0003\u0090\u0003\u0091\u0003\u0092\u0003B\u0019\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0013\u0010\u0081\u0002\u001a\u00030È\u00012\u0007\u0010µ\u0001\u001a\u00020\u0018H\u0002J\u001a\u0010\u0082\u0002\u001a\u00030È\u00012\b\u0010Ø\u0001\u001a\u00030Ç\u0001H\u0000¢\u0006\u0003\b\u0083\u0002J\t\u0010\u0084\u0002\u001a\u00020\u001aH\u0002J\u0010\u0010\u0085\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u0086\u0002J\n\u0010\u0087\u0002\u001a\u00030È\u0001H\u0002J\u0014\u0010\u0088\u0002\u001a\u00030\u0089\u00022\b\b\u0002\u0010I\u001a\u00020\fH\u0002J\u0010\u0010\u008a\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008b\u0002J\u0010\u0010\u008c\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008d\u0002J&\u0010\u008e\u0002\u001a\u00030È\u00012\b\u0010\u008f\u0002\u001a\u00030\u0090\u00022\n\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u0092\u0002H\u0000¢\u0006\u0003\b\u0093\u0002J\u0013\u0010\u0094\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u0095\u0002\u001a\u00020\u0000H\u0002J\"\u0010\u0096\u0002\u001a\u00030È\u00012\u0015\u0010\u0097\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030È\u00010Æ\u0001H\u0086\bJ(\u0010\u0098\u0002\u001a\u00030È\u00012\u001b\u0010\u0097\u0002\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030È\u00010\u0099\u0002H\u0086\bJ)\u0010\u009a\u0002\u001a\u00030È\u00012\u0016\u0010\u0097\u0002\u001a\u0011\u0012\u0005\u0012\u00030\u009b\u0002\u0012\u0005\u0012\u00030È\u00010Æ\u0001H\u0080\b¢\u0006\u0003\b\u009c\u0002J(\u0010\u009d\u0002\u001a\u00030È\u00012\u0015\u0010\u0097\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0005\u0012\u00030È\u00010Æ\u0001H\u0080\b¢\u0006\u0003\b\u009e\u0002J\n\u0010\u009f\u0002\u001a\u00030È\u0001H\u0016J\u0013\u0010 \u0002\u001a\f\u0018\u00010¡\u0002j\u0005\u0018\u0001`¢\u0002H\u0017J\u0010\u0010£\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020)H\u0016J\t\u0010¥\u0002\u001a\u00020fH\u0002JA\u0010¦\u0002\u001a\u00030È\u00012\b\u0010§\u0002\u001a\u00030¨\u00022\b\u0010©\u0002\u001a\u00030ª\u00022\n\b\u0002\u0010«\u0002\u001a\u00030¬\u00022\t\b\u0002\u0010\u00ad\u0002\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0006\b®\u0002\u0010¯\u0002JA\u0010°\u0002\u001a\u00030È\u00012\b\u0010§\u0002\u001a\u00030¨\u00022\b\u0010±\u0002\u001a\u00030ª\u00022\n\b\u0002\u0010«\u0002\u001a\u00030¬\u00022\t\b\u0002\u0010\u00ad\u0002\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0006\b²\u0002\u0010¯\u0002J!\u0010U\u001a\u00030È\u00012\u000f\u0010\u0097\u0002\u001a\n\u0012\u0005\u0012\u00030È\u00010³\u0002H\u0080\b¢\u0006\u0003\b´\u0002J\"\u0010µ\u0002\u001a\u00030È\u00012\u0007\u0010¶\u0002\u001a\u00020\f2\u0007\u0010\u0095\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b·\u0002J\u0010\u0010¸\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b¹\u0002J\u0010\u0010º\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b»\u0002J\u0010\u0010¼\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b½\u0002J\u0010\u0010¾\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b¿\u0002J\u0010\u0010À\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÁ\u0002J\u0010\u0010Â\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÃ\u0002J\u0013\u0010Ä\u0002\u001a\u00030È\u00012\t\b\u0002\u0010Å\u0002\u001a\u00020\nJ\n\u0010Æ\u0002\u001a\u00030È\u0001H\u0002J\t\u0010Ç\u0002\u001a\u00020\nH\u0016J \u0010È\u0002\u001a\u00020\n2\f\b\u0002\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u0002H\u0000ø\u0001\u0000¢\u0006\u0003\bË\u0002J\u0010\u0010Ì\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÍ\u0002J\u0010\u0010Î\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÏ\u0002J\u0010\u0010Ð\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÑ\u0002J\u0010\u0010Ò\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÓ\u0002J\u0010\u0010Ô\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÕ\u0002J\u0010\u0010Ö\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010×\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ\u0010\u0010Ø\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010Ù\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ\u0010\u0010Ú\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010Û\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ\u0010\u0010Ü\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010Ý\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ+\u0010Þ\u0002\u001a\u00030È\u00012\u0007\u0010ß\u0002\u001a\u00020\f2\u0007\u0010à\u0002\u001a\u00020\f2\u0007\u0010á\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\bâ\u0002J\u0013\u0010ã\u0002\u001a\u00030È\u00012\u0007\u0010ä\u0002\u001a\u00020\u0000H\u0002J\n\u0010å\u0002\u001a\u00030È\u0001H\u0016J\n\u0010æ\u0002\u001a\u00030È\u0001H\u0002J\n\u0010ç\u0002\u001a\u00030È\u0001H\u0016J\n\u0010è\u0002\u001a\u00030È\u0001H\u0016J\n\u0010é\u0002\u001a\u00030È\u0001H\u0016J\u0010\u0010ê\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bë\u0002J\"\u0010ì\u0002\u001a\u00030È\u00012\u0007\u0010í\u0002\u001a\u00020\f2\u0007\u0010î\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\bï\u0002J\n\u0010ð\u0002\u001a\u00030È\u0001H\u0002J \u0010ñ\u0002\u001a\u00020\n2\f\b\u0002\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u0002H\u0000ø\u0001\u0000¢\u0006\u0003\bò\u0002J\u0010\u0010ó\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bô\u0002J\"\u0010õ\u0002\u001a\u00030È\u00012\u0007\u0010¶\u0002\u001a\u00020\f2\u0007\u0010á\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\bö\u0002J\u0010\u0010÷\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bø\u0002J\u0010\u0010ù\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bú\u0002J\u001b\u0010û\u0002\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\nH\u0000¢\u0006\u0003\bý\u0002J1\u0010þ\u0002\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\n2\t\b\u0002\u0010ÿ\u0002\u001a\u00020\n2\t\b\u0002\u0010\u0080\u0003\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0081\u0003J\u001b\u0010\u0082\u0003\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0083\u0003J1\u0010\u0084\u0003\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\n2\t\b\u0002\u0010ÿ\u0002\u001a\u00020\n2\t\b\u0002\u0010\u0080\u0003\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0085\u0003J\u0019\u0010\u0086\u0003\u001a\u00030È\u00012\u0007\u0010\u0087\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u0088\u0003J\n\u0010\u0089\u0003\u001a\u00030È\u0001H\u0002J\u0010\u0010\u008a\u0003\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008b\u0003J\n\u0010\u008c\u0003\u001a\u00030\u0089\u0002H\u0016J\u0010\u0010\u008d\u0003\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008e\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR$\u0010\"\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00000)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u001a\u00103\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010:\u001a\u0002092\u0006\u00108\u001a\u000209@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010D\u001a\u00020C2\u0006\u00108\u001a\u00020C@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010,R\u001a\u0010N\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010'R\u0014\u0010Q\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u001fR\u0014\u0010S\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00105R\u000e\u0010U\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u001a\u0010[\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001f\"\u0004\b]\u0010'R\"\u0010^\u001a\n\u0018\u00010_j\u0004\u0018\u0001``X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010g\u001a\u00020hX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u001fR\u000e\u0010n\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010p\u001a\u00020\n2\u0006\u0010o\u001a\u00020\n@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u001fR\u0014\u0010q\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u001fR\u0011\u0010r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\br\u0010\u001fR\u0013\u0010s\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001a\u0010u\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u001f\"\u0004\bw\u0010'R\u0014\u0010x\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\u001fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010y\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u001f\"\u0004\b{\u0010'R%\u0010|\u001a\u00020}X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0003\u0010\u0082\u0001\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0084\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u00108\u001a\u00030\u0087\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u001fR\u0018\u0010\u008f\u0001\u001a\u00030\u0090\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u001fR\u0016\u0010\u0095\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u001fR\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R.\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¡\u0001\u001a\u00030¢\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u00030¦\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010©\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u001fR+\u0010¬\u0001\u001a\u00030«\u00012\u0007\u00108\u001a\u00030«\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010±\u0001\u001a\u00020h8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010jR\u0016\u0010³\u0001\u001a\u00020h8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010jR)\u0010µ\u0001\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u001d\u0010º\u0001\u001a\u00020\nX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010\u001f\"\u0005\b¼\u0001\u0010'R\u0018\u0010½\u0001\u001a\u00030¾\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001R(\u0010Á\u0001\u001a\u00030Â\u0001X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0003\u0010\u0082\u0001\u001a\u0005\bÃ\u0001\u0010\u007f\"\u0006\bÄ\u0001\u0010\u0081\u0001R0\u0010Å\u0001\u001a\u0013\u0012\u0005\u0012\u00030Ç\u0001\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Æ\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R0\u0010Í\u0001\u001a\u0013\u0012\u0005\u0012\u00030Ç\u0001\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Æ\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R\u0016\u0010Ð\u0001\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010XR(\u0010Ò\u0001\u001a\u00030Â\u0001X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0003\u0010\u0082\u0001\u001a\u0005\bÓ\u0001\u0010\u007f\"\u0006\bÔ\u0001\u0010\u0081\u0001R\u001d\u0010Õ\u0001\u001a\u00020\nX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\u001f\"\u0005\b×\u0001\u0010'R'\u0010Ø\u0001\u001a\u0005\u0018\u00010Ç\u00012\t\u0010o\u001a\u0005\u0018\u00010Ç\u0001@BX\u0080\u000e¢\u0006\n\n\u0000\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010\u009e\u0001R\u0019\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0011\u0010à\u0001\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010á\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u00105R\u000f\u0010ã\u0001\u001a\u00020hX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010ä\u0001\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u00105\"\u0005\bè\u0001\u00107R\"\u0010é\u0001\u001a\u0005\u0018\u00010ê\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R\u000f\u0010ï\u0001\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010ñ\u0001\u001a\u00030ð\u00012\u0007\u00108\u001a\u00030ð\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u000f\u0010ö\u0001\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010÷\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u00105R\u0018\u0010ù\u0001\u001a\u00030ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R#\u0010ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bþ\u0001\u0010$\u001a\u0005\bÿ\u0001\u0010\u0011R\u000f\u0010\u0080\u0002\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0003"}, m13558d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "isVirtual", "", "semanticsId", "", "(ZI)V", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedParent", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "_modifier", "Landroidx/compose/ui/Modifier;", "_semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_unfoldedChildren", "_zSortedChildren", "alignmentLinesRequired", "getAlignmentLinesRequired$ui_release", "()Z", "applyingModifierOnAttach", "getApplyingModifierOnAttach$ui_release", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "()V", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "childLookaheadMeasurables", "", "Landroidx/compose/ui/layout/Measurable;", "getChildLookaheadMeasurables$ui_release", "()Ljava/util/List;", "childMeasurables", "getChildMeasurables$ui_release", "children", "getChildren$ui_release", "childrenInfo", "getChildrenInfo", "compositeKeyHash", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "value", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "getDepth$ui_release", "setDepth$ui_release", "foldedChildren", "getFoldedChildren$ui_release", "forceUseOldLayers", "getForceUseOldLayers", "setForceUseOldLayers", "hasFixedInnerContentConstraints", "getHasFixedInnerContentConstraints$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerCoordinator", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "getInnerLayerCoordinator$ui_release", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "isAttached", "isCurrentlyCalculatingSemanticsConfiguration", "<set-?>", "isDeactivated", "isPlaced", "isPlacedByParent", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "isSemanticsInvalidated", "isSemanticsInvalidated$ui_release", "setSemanticsInvalidated$ui_release", "isValidOwnerScope", "isVirtualLookaheadRoot", "isVirtualLookaheadRoot$ui_release", "setVirtualLookaheadRoot$ui_release", "lastSize", "Landroidx/compose/ui/unit/IntSize;", "getLastSize-YbymL2g$ui_release", "()J", "setLastSize-ozmzZPI$ui_release", "(J)V", "J", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "newRoot", "lookaheadRoot", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)V", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "measurePassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measuredByParent", "getMeasuredByParent$ui_release", "measuredByParentInLookahead", "getMeasuredByParentInLookahead$ui_release", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "offsetFromRoot", "Landroidx/compose/ui/unit/IntOffset;", "getOffsetFromRoot-nOcc-ac$ui_release", "setOffsetFromRoot--gyyYBs$ui_release", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "outerCoordinator", "getOuterCoordinator$ui_release", "outerToInnerOffset", "getOuterToInnerOffset-nOcc-ac$ui_release", "setOuterToInnerOffset--gyyYBs$ui_release", "outerToInnerOffsetDirty", "getOuterToInnerOffsetDirty$ui_release", "setOuterToInnerOffsetDirty$ui_release", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "pendingModifier", "placeOrder", "getPlaceOrder$ui_release", "previousIntrinsicsUsageByParent", "semanticsConfiguration", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsId", "setSemanticsId", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "unfoldedVirtualChildrenListDirty", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", "width", "getWidth", "zIndex", "", "getZIndex", "()F", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "applyModifier", "attach", "attach$ui_release", "calculateSemanticsConfiguration", "clearSubtreeIntrinsicsUsage", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw$ui_release", "exceptionMessageForParentingOrOwnership", "instance", "forEachChild", "block", "forEachChildIndexed", "Lkotlin/Function2;", "forEachCoordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "forEachCoordinatorIncludingInner", "forEachCoordinatorIncludingInner$ui_release", "forceRemeasure", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "getOrCreateIntrinsicsPolicy", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "hitTest-6fMxITs$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTestSemantics", "hitSemanticsEntities", "hitTestSemantics-6fMxITs$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", "index", "insertAt$ui_release", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateMeasurements", "invalidateMeasurements$ui_release", "invalidateOnPositioned", "invalidateOnPositioned$ui_release", "invalidateParentData", "invalidateParentData$ui_release", "invalidateSemantics", "invalidateSemantics$ui_release", "invalidateSubtree", "isRootOfInvalidation", "invalidateUnfoldedVirtualChildren", "isTransparent", "lookaheadRemeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "lookaheadReplace", "lookaheadReplace$ui_release", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "maxIntrinsicHeight", "maxIntrinsicWidth", "maxLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "minIntrinsicHeight", "minIntrinsicWidth", "minLookaheadIntrinsicHeight", "minLookaheadIntrinsicWidth", "move", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move$ui_release", "onChildRemoved", "child", "onDeactivate", "onDensityOrLayoutDirectionChanged", "onLayoutComplete", "onRelease", "onReuse", "onZSortedChildrenInvalidated", "onZSortedChildrenInvalidated$ui_release", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestAutofill", "requestAutofill$ui_release", "requestLookaheadRelayout", "forceRequest", "requestLookaheadRelayout$ui_release", "requestLookaheadRemeasure", "scheduleMeasureAndLayout", "invalidateIntrinsics", "requestLookaheadRemeasure$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "rescheduleRemeasureOrRelayout$ui_release", "resetModifierState", "resetSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "toString", "updateChildrenIfDirty", "updateChildrenIfDirty$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 11 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1533:1\n1296#1,7:1540\n1296#1,7:1629\n1149#1,2:1645\n1151#1,2:1657\n207#1:1661\n1286#1,7:1893\n207#1:2029\n207#1:2039\n207#1:2049\n1296#1,7:2065\n1101#2:1534\n1083#2,2:1535\n1101#2:1537\n1083#2,2:1538\n1101#2:1548\n1083#2,2:1549\n1101#2:1715\n1083#2,2:1716\n1101#2:1777\n1083#2,2:1778\n1101#2:1863\n1083#2,2:1864\n1101#2:1932\n1083#2,2:1933\n1101#2:1998\n1083#2,2:1999\n48#3:1547\n46#3:1552\n50#3:1591\n30#3:1593\n50#3:1594\n46#3:1596\n46#3:1619\n46#3:1647\n1#4:1551\n423#5,6:1553\n144#5:1559\n429#5,3:1560\n423#5,9:1563\n435#5,9:1572\n472#5:1592\n472#5:1595\n423#5,9:1597\n423#5,9:1620\n423#5,9:1648\n144#5:1660\n423#5,9:1662\n423#5,9:1962\n423#5,9:2030\n423#5,9:2040\n423#5,9:2050\n56#6,5:1581\n102#6,5:1586\n56#6,5:1607\n56#6,5:1612\n76#6,7:1637\n76#6,7:1807\n102#6,5:1814\n102#6,5:1819\n56#6,5:1825\n102#6,5:2059\n91#7:1606\n91#7:1617\n115#7:1618\n91#7:1636\n91#7:1644\n91#7:1659\n95#7:1683\n139#7:1745\n115#7:1824\n111#7:1830\n111#7:1847\n83#7:1900\n107#7:1971\n91#7:2064\n683#8,6:1671\n683#8,6:1677\n662#8,6:1684\n683#8,3:1690\n668#8,2:1693\n671#8,2:1738\n686#8,3:1740\n673#8:1743\n663#8:1744\n662#8,6:1746\n683#8,3:1752\n668#8,2:1755\n671#8,2:1800\n686#8,3:1802\n673#8:1805\n663#8:1806\n662#8,6:1831\n683#8,3:1837\n668#8,2:1840\n671#8,2:1886\n686#8,3:1888\n673#8:1891\n663#8:1892\n662#8,6:1901\n683#8,3:1907\n668#8,2:1910\n671#8,2:1955\n686#8,3:1957\n673#8:1960\n663#8:1961\n437#9,6:1695\n447#9,2:1702\n449#9,8:1707\n457#9,9:1718\n466#9,8:1730\n437#9,6:1757\n447#9,2:1764\n449#9,8:1769\n457#9,9:1780\n466#9,8:1792\n437#9,5:1842\n442#9:1848\n447#9,2:1850\n449#9,8:1855\n457#9,9:1866\n466#9,8:1878\n437#9,6:1912\n447#9,2:1919\n449#9,8:1924\n457#9,9:1935\n466#9,8:1947\n437#9,6:1978\n447#9,2:1985\n449#9,8:1990\n457#9,9:2001\n466#9,8:2013\n246#10:1701\n246#10:1763\n246#10:1849\n246#10:1918\n246#10:1984\n240#11,3:1704\n243#11,3:1727\n240#11,3:1766\n243#11,3:1789\n240#11,3:1852\n243#11,3:1875\n240#11,3:1921\n243#11,3:1944\n240#11,3:1987\n243#11,3:2010\n116#12:1972\n105#12,5:1973\n110#12,8:2021\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n120#1:1540,7\n553#1:1629,7\n592#1:1645,2\n592#1:1657,2\n670#1:1661\n1188#1:1893,7\n1318#1:2029\n1339#1:2039\n1351#1:2049\n1430#1:2065,7\n139#1:1534\n139#1:1535,2\n619#1:1537\n619#1:1538,2\n153#1:1548\n153#1:1549,2\n772#1:1715\n772#1:1716,2\n782#1:1777\n782#1:1778,2\n1175#1:1863\n1175#1:1864,2\n1257#1:1932\n1257#1:1933,2\n1281#1:1998\n1281#1:1999,2\n143#1:1547\n155#1:1552\n339#1:1591\n349#1:1593\n350#1:1594\n371#1:1596\n545#1:1619\n592#1:1647\n155#1:1553,6\n157#1:1559\n155#1:1560,3\n207#1:1563,9\n210#1:1572,9\n339#1:1592\n350#1:1595\n371#1:1597,9\n545#1:1620,9\n592#1:1648,9\n634#1:1660\n670#1:1662,9\n1259#1:1962,9\n1318#1:2030,9\n1339#1:2040,9\n1351#1:2050,9\n291#1:1581,5\n335#1:1586,5\n496#1:1607,5\n499#1:1612,5\n574#1:1637,7\n905#1:1807,7\n934#1:1814,5\n937#1:1819,5\n1111#1:1825,5\n1369#1:2059,5\n457#1:1606\n524#1:1617\n537#1:1618\n559#1:1636\n588#1:1644\n607#1:1659\n772#1:1683\n782#1:1745\n952#1:1824\n1175#1:1830\n1176#1:1847\n1257#1:1900\n1281#1:1971\n1395#1:2064\n752#1:1671,6\n763#1:1677,6\n772#1:1684,6\n772#1:1690,3\n772#1:1693,2\n772#1:1738,2\n772#1:1740,3\n772#1:1743\n772#1:1744\n782#1:1746,6\n782#1:1752,3\n782#1:1755,2\n782#1:1800,2\n782#1:1802,3\n782#1:1805\n782#1:1806\n1175#1:1831,6\n1175#1:1837,3\n1175#1:1840,2\n1175#1:1886,2\n1175#1:1888,3\n1175#1:1891\n1175#1:1892\n1257#1:1901,6\n1257#1:1907,3\n1257#1:1910,2\n1257#1:1955,2\n1257#1:1957,3\n1257#1:1960\n1257#1:1961\n772#1:1695,6\n772#1:1702,2\n772#1:1707,8\n772#1:1718,9\n772#1:1730,8\n782#1:1757,6\n782#1:1764,2\n782#1:1769,8\n782#1:1780,9\n782#1:1792,8\n1175#1:1842,5\n1175#1:1848\n1175#1:1850,2\n1175#1:1855,8\n1175#1:1866,9\n1175#1:1878,8\n1257#1:1912,6\n1257#1:1919,2\n1257#1:1924,8\n1257#1:1935,9\n1257#1:1947,8\n1281#1:1978,6\n1281#1:1985,2\n1281#1:1990,8\n1281#1:2001,9\n1281#1:2013,8\n772#1:1701\n782#1:1763\n1175#1:1849\n1257#1:1918\n1281#1:1984\n772#1:1704,3\n772#1:1727,3\n782#1:1766,3\n782#1:1789,3\n1175#1:1852,3\n1175#1:1875,3\n1257#1:1921,3\n1257#1:1944,3\n1281#1:1987,3\n1281#1:2010,3\n1281#1:1972\n1281#1:1973,5\n1281#1:2021,8\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private SemanticsConfiguration _semanticsConfiguration;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private boolean forceUseOldLayers;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private long lastSize;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnPositionedDispatch;
    private final NodeChain nodes;
    private long offsetFromRoot;
    private Function1<? super Owner, Unit> onAttach;
    private Function1<? super Owner, Unit> onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.p013ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return (MeasureResult) m22509measure3p2s80s(measureScope, (List<? extends Measurable>) list, j10);
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m22509measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.p013ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.p013ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.p013ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.p013ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo22508getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m23669getZeroMYxV2XQ();
        }

        @Override // androidx.compose.p013ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.ZComparator$lambda$37((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    @Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m13558d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "getNotPlacedPlaceOrder$ui_release$annotations", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class LayoutState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Measuring = new LayoutState("Measuring", 0);
        public static final LayoutState LookaheadMeasuring = new LayoutState("LookaheadMeasuring", 1);
        public static final LayoutState LayingOut = new LayoutState("LayingOut", 2);
        public static final LayoutState LookaheadLayingOut = new LayoutState("LookaheadLayingOut", 3);
        public static final LayoutState Idle = new LayoutState("Idle", 4);

        private static final /* synthetic */ LayoutState[] $values() {
            return new LayoutState[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
        }

        static {
            LayoutState[] layoutStateArr$values = $values();
            $VALUES = layoutStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(layoutStateArr$values);
        }

        private LayoutState(String str, int i10) {
        }

        public static EnumEntries<LayoutState> getEntries() {
            return $ENTRIES;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m13558d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.p013ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m22510maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.p013ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m22511maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.p013ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m22512minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.p013ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m22513minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        /* renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m22510maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m22511maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m22512minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m22513minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class UsageByParent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InMeasureBlock = new UsageByParent("InMeasureBlock", 0);
        public static final UsageByParent InLayoutBlock = new UsageByParent("InLayoutBlock", 1);
        public static final UsageByParent NotUsed = new UsageByParent("NotUsed", 2);

        private static final /* synthetic */ UsageByParent[] $values() {
            return new UsageByParent[]{InMeasureBlock, InLayoutBlock, NotUsed};
        }

        static {
            UsageByParent[] usageByParentArr$values = $values();
            $VALUES = usageByParentArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(usageByParentArr$values);
        }

        private UsageByParent(String str, int i10) {
        }

        public static EnumEntries<UsageByParent> getEntries() {
            return $ENTRIES;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$37(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.getZIndex() == layoutNode2.getZIndex() ? Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    private final void applyModifier(Modifier modifier) {
        this._modifier = modifier;
        this.nodes.updateFrom$ui_release(modifier);
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(512))) {
            setLookaheadRoot(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode.calculateSemanticsConfiguration.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeChain nodes = LayoutNode.this.getNodes();
                int iM22586constructorimpl = NodeKind.m22586constructorimpl(8);
                Ref.ObjectRef<SemanticsConfiguration> objectRef2 = objectRef;
                if ((nodes.getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
                    for (Modifier.Node tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                        if ((tail.getKindSet() & iM22586constructorimpl) != 0) {
                            DelegatingNode delegatingNodePop = tail;
                            MutableVector mutableVector = null;
                            while (delegatingNodePop != 0) {
                                if (delegatingNodePop instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNodePop;
                                    if (semanticsModifierNode.getIsClearingSemantics()) {
                                        ?? semanticsConfiguration = new SemanticsConfiguration();
                                        objectRef2.element = semanticsConfiguration;
                                        semanticsConfiguration.setClearingSemantics(true);
                                    }
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        objectRef2.element.setMergingSemanticsOfDescendants(true);
                                    }
                                    semanticsModifierNode.applySemantics(objectRef2.element);
                                } else if ((delegatingNodePop.getKindSet() & iM22586constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                                    int i10 = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet() & iM22586constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                delegatingNodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                }
            }
        });
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) objectRef.element;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < depth; i10++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            sb.append(layoutNodeArr[i11].debugTreeToString(depth + 1));
        }
        String string = sb.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.debugTreeToString(i10);
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode instance) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(instance);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(debugTreeToString$default(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode = instance._foldedParent;
        sb.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
        return sb.toString();
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* renamed from: hitTest-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m22494hitTest6fMxITs$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = PointerType.INSTANCE.m22278getUnknownT8wyACA();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z9 = true;
        }
        layoutNode.m22501hitTest6fMxITs$ui_release(j10, hitTestResult, i12, z9);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m22495hitTestSemantics6fMxITs$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = PointerType.INSTANCE.m22277getTouchT8wyACA();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z9 = true;
        }
        layoutNode.m22502hitTestSemantics6fMxITs$ui_release(j10, hitTestResult, i12, z9);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        layoutNode.invalidateSubtree(z9);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m22496lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m22517getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m22503lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void onChildRemoved(LayoutNode child) {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            child.detach$ui_release();
        }
        child._foldedParent = null;
        child.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = child._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                layoutNodeArr[i10].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode = layoutNodeArr[i10];
                if (layoutNode.isVirtual) {
                    mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                } else {
                    mutableVector.add(layoutNode);
                }
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m22497remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m22516getLastConstraintsDWUhwKw();
        }
        return layoutNode.m22504remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z9);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z9, z10, z11);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        layoutNode.requestRelayout$ui_release(z9);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        layoutNode.requestRemeasure$ui_release(z9, z10, z11);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        } else {
            this.layoutDelegate.clearLookaheadDelegate();
        }
        invalidateMeasurements$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attach$ui_release(androidx.compose.p013ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr = vector.content;
        int size = vector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            layoutNodeArr[i10].detach$ui_release();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            owner.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || getIsDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM22586constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNodePop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m22446requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m22586constructorimpl(256)));
                        } else if ((delegatingNodePop.getKindSet() & iM22586constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM22586constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM22586constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(Canvas canvas, GraphicsLayer graphicsLayer) {
        getOuterCoordinator$ui_release().draw(canvas, graphicsLayer);
    }

    public final void forEachChild(Function1<? super LayoutNode, Unit> block) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            block.invoke(layoutNodeArr[i10]);
        }
    }

    public final void forEachChildIndexed(Function2<? super Integer, ? super LayoutNode, Unit> block) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            block.invoke(Integer.valueOf(i10), layoutNodeArr[i10]);
        }
    }

    public final void forEachCoordinator$ui_release(Function1<? super LayoutModifierNodeCoordinator, Unit> block) {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            block.invoke((LayoutModifierNodeCoordinator) outerCoordinator$ui_release);
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(Function1<? super NodeCoordinator, Unit> block) {
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            block.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.p013ui.layout.Remeasurement
    public void forceRemeasure() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, false, 5, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 5, null);
            layoutNode = this;
        }
        Constraints constraintsM22516getLastConstraintsDWUhwKw = layoutNode.layoutDelegate.m22516getLastConstraintsDWUhwKw();
        if (constraintsM22516getLastConstraintsDWUhwKw != null) {
            Owner owner = layoutNode.owner;
            if (owner != null) {
                owner.mo22647measureAndLayout0kLqBqw(this, constraintsM22516getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = layoutNode.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() || !((lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.pendingModifier != null;
    }

    /* renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.p013ui.semantics.SemanticsInfo
    public List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui_release();
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo, androidx.compose.p013ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    /* renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.getVector().asMutableList();
    }

    public final boolean getForceUseOldLayers() {
        return this.forceUseOldLayers;
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM22570getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m22570getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m23512getHasFixedWidthimpl(jM22570getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m23511getHasFixedHeightimpl(jM22570getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator();
    }

    public final NodeCoordinator getInnerLayerCoordinator$ui_release() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new KotlinNothingValueException();
    }

    /* renamed from: getInnerLayerCoordinatorIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.p013ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    /* renamed from: getInteropViewFactoryHolder$ui_release, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    /* renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    /* renamed from: getLastSize-YbymL2g$ui_release, reason: not valid java name and from getter */
    public final long getLastSize() {
        return this.lastSize;
    }

    /* renamed from: getLayoutDelegate$ui_release, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo, androidx.compose.p013ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    /* renamed from: getLookaheadRoot$ui_release, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    /* renamed from: getModifier, reason: from getter */
    public Modifier get_modifier() {
        return this._modifier;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    /* renamed from: getNodes$ui_release, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    /* renamed from: getOffsetFromRoot-nOcc-ac$ui_release, reason: not valid java name and from getter */
    public final long getOffsetFromRoot() {
        return this.offsetFromRoot;
    }

    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    /* renamed from: getOuterToInnerOffset-nOcc-ac$ui_release, reason: not valid java name and from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    /* renamed from: getOuterToInnerOffsetDirty$ui_release, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    /* renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // androidx.compose.p013ui.semantics.SemanticsInfo
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (!isAttached() || getIsDeactivated() || !this.nodes.m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8))) {
            return null;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
            this._semanticsConfiguration = calculateSemanticsConfiguration();
        }
        return this._semanticsConfiguration;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    /* renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo, androidx.compose.p013ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    /* renamed from: hitTest-6fMxITs$ui_release, reason: not valid java name */
    public final void m22501hitTest6fMxITs$ui_release(long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        getOuterCoordinator$ui_release().m22573hitTestqzLsGqo(NodeCoordinator.INSTANCE.getPointerInputSource(), NodeCoordinator.m22555fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui_release, reason: not valid java name */
    public final void m22502hitTestSemantics6fMxITs$ui_release(long pointerPosition, HitTestResult hitSemanticsEntities, int pointerType, boolean isInLayer) {
        getOuterCoordinator$ui_release().m22573hitTestqzLsGqo(NodeCoordinator.INSTANCE.getSemanticsSource(), NodeCoordinator.m22555fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), pointerPosition, false, 2, null), hitSemanticsEntities, PointerType.INSTANCE.m22277getTouchT8wyACA(), isInLayer);
    }

    public final void ignoreRemeasureRequests$ui_release(Function0<Unit> block) {
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int index, LayoutNode instance) {
        if (!(instance._foldedParent == null || instance.owner == null)) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(instance));
        }
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated$ui_release();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator$ui_release = getInnerLayerCoordinator$ui_release();
        if (innerLayerCoordinator$ui_release != null) {
            innerLayerCoordinator$ui_release.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer layer = ((LayoutModifierNodeCoordinator) outerCoordinator$ui_release).getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        this.outerToInnerOffsetDirty = true;
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui_release() {
        if (getLayoutPending$ui_release() || getMeasurePending$ui_release() || this.needsOnPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        } else {
            if (this.nodes.isUpdating$ui_release() || getApplyingModifierOnAttach$ui_release()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = calculateSemanticsConfiguration();
            this.isSemanticsInvalidated = false;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(this);
            ownerRequireOwner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            ownerRequireOwner.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void invalidateSubtree(boolean isRootOfInvalidation) {
        LayoutNode parent$ui_release;
        if (isRootOfInvalidation && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM22586constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m22446requireCoordinator64DMado((LayoutModifierNode) delegatingNodePop, NodeKind.m22586constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((delegatingNodePop.getKindSet() & iM22586constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM22586constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM22586constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            layoutNodeArr[i11].invalidateSubtree(false);
        }
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    /* renamed from: isDeactivated, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    /* renamed from: isSemanticsInvalidated$ui_release, reason: from getter */
    public final boolean getIsSemanticsInvalidated() {
        return this.isSemanticsInvalidated;
    }

    @Override // androidx.compose.p013ui.semantics.SemanticsInfo
    public boolean isTransparent() {
        return getOuterCoordinator$ui_release().isTransparent();
    }

    @Override // androidx.compose.p013ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    /* renamed from: isVirtualLookaheadRoot$ui_release, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m22503lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m22531remeasureBRTryo0(constraints.getValue());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final int maxIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    public final int maxIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    public final int maxLookaheadIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(width);
    }

    public final int maxLookaheadIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(height);
    }

    public final int minIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    public final int minIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    public final int minLookaheadIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(width);
    }

    public final int minLookaheadIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(height);
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            this._foldedChildren.add(from > to ? to + i10 : (to + count) - 2, this._foldedChildren.removeAt(from > to ? from + i10 : from));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onDeactivate();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onDeactivate();
            }
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled) {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            } else {
                invalidateSemantics$ui_release();
            }
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.onLayoutNodeDeactivated(this);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onDeactivate();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onDeactivate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(128);
        boolean zM22595getIncludeSelfInTraversalH91voCI = NodeKindKt.m22595getIncludeSelfInTraversalH91voCI(iM22586constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (!zM22595getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = innerCoordinator$ui_release.headNode(zM22595getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM22586constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM22586constructorimpl) != 0) {
                DelegatingNode delegatingNodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodePop).onPlaced(getInnerCoordinator$ui_release());
                    } else if ((delegatingNodePop.getKindSet() & iM22586constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                        int i10 = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet() & iM22586constructorimpl) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    delegatingNodePop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                        delegatingNodePop = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i10 == 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onRelease();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onRelease();
            }
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onRelease();
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onRelease();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onRelease();
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onReuse();
            }
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            if (!ComposeUiFlags.isSemanticAutofillEnabled) {
                invalidateSemantics$ui_release();
            }
        } else {
            resetModifierState();
        }
        int semanticsId = getSemanticsId();
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner owner = this.owner;
        if (owner != null) {
            owner.onPreLayoutNodeReused(this, semanticsId);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onReuse();
            }
        }
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m22547hasH91voCI$ui_release(NodeKind.m22586constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        rescheduleRemeasureOrRelayout$ui_release(this);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.onPostLayoutNodeReused(this, semanticsId);
        }
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int x9, int y9) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), x9, y9, 0.0f, 4, null);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m22504remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m22542remeasureBRTryo0(constraints.getValue());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getVector().getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.clear();
                return;
            }
            onChildRemoved(this._foldedChildren.getVector().content[size]);
        }
    }

    public final void removeAt$ui_release(int index, int count) {
        if (!(count >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + count + ") must be greater than 0");
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.getVector().content[i10]);
            this._foldedChildren.removeAt(i10);
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestAutofill$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestAutofill(this);
    }

    public final void requestLookaheadRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, forceRequest);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(forceRequest);
        }
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        this.outerToInnerOffsetDirty = true;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, forceRequest, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(forceRequest);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode it) {
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
        }
        if (it.getLookaheadMeasurePending$ui_release()) {
            requestLookaheadRemeasure$ui_release$default(it, true, false, false, 6, null);
            return;
        }
        if (it.getLookaheadLayoutPending$ui_release()) {
            it.requestLookaheadRelayout$ui_release(true);
        }
        if (it.getMeasurePending$ui_release()) {
            requestRemeasure$ui_release$default(it, true, false, false, 6, null);
        } else if (it.getLayoutPending$ui_release()) {
            it.requestRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z9) {
        this.canMultiMeasure = z9;
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setCompositeKeyHash(int i10) {
        this.compositeKeyHash = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setCompositionLocalMap(CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(32768);
        if ((nodeChain.getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM22586constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNodePop).getNode();
                            if (node.getIsAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((delegatingNodePop.getKindSet() & iM22586constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM22586constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM22586constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setDensity(Density density) {
        if (Intrinsics.areEqual(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.onDensityChange();
        }
    }

    public final void setDepth$ui_release(int i10) {
        this.depth = i10;
    }

    public final void setForceUseOldLayers(boolean z9) {
        this.forceUseOldLayers = z9;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z9) {
        this.innerLayerCoordinatorIsDirty = z9;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    /* renamed from: setLastSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m22505setLastSizeozmzZPI$ui_release(long j10) {
        this.lastSize = j10;
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.onLayoutDirectionChange();
            }
        }
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setModifier(Modifier modifier) {
        if (!(!this.isVirtual || get_modifier() == Modifier.INSTANCE)) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            invalidateSemantics$ui_release();
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z9) {
        this.needsOnPositionedDispatch = z9;
    }

    /* renamed from: setOffsetFromRoot--gyyYBs$ui_release, reason: not valid java name */
    public final void m22506setOffsetFromRootgyyYBs$ui_release(long j10) {
        this.offsetFromRoot = j10;
    }

    public final void setOnAttach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    /* renamed from: setOuterToInnerOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m22507setOuterToInnerOffsetgyyYBs$ui_release(long j10) {
        this.outerToInnerOffset = j10;
    }

    public final void setOuterToInnerOffsetDirty$ui_release(boolean z9) {
        this.outerToInnerOffsetDirty = z9;
    }

    public void setSemanticsId(int i10) {
        this.semanticsId = i10;
    }

    public final void setSemanticsInvalidated$ui_release(boolean z9) {
        this.isSemanticsInvalidated = z9;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.p013ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (Intrinsics.areEqual(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM22586constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = head;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNodePop).onViewConfigurationChange();
                        } else if ((delegatingNodePop.getKindSet() & iM22586constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM22586constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM22586constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z9) {
        this.isVirtualLookaheadRoot = z9;
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z9, int i10) {
        this.isVirtual = z9;
        this.semanticsId = i10;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.offsetFromRoot = companion.m23699getMaxnOccac();
        this.lastSize = IntSize.INSTANCE.m23737getZeroYbymL2g();
        this.outerToInnerOffset = companion.m23699getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
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
                this.this$0.getLayoutDelegate().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.INSTANCE.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.INSTANCE;
    }

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    public SemanticsInfo getParentInfo() {
        return getParent$ui_release();
    }

    public /* synthetic */ LayoutNode(boolean z9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z9, (i11 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i10);
    }
}
