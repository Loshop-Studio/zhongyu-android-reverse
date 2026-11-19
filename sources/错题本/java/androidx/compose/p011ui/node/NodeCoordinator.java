package androidx.compose.p011ui.node;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.MutableRectKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p011ui.input.pointer.PointerType;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 Ý\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Ý\u0002Þ\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0011\u001a\u00020\u000f\"\u0006\b\u0000\u0010\u0013\u0018\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH&¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\u000fH\u0000¢\u0006\u0004\b%\u0010\u001eJ+\u0010-\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020*0)H\u0084\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020\u000f¢\u0006\u0004\b.\u0010\u001eJ\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u001eJ=\u00109\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\b5H\u0014ø\u0001\u0000¢\u0006\u0004\b7\u00108J*\u00109\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u0010;\u001a\u00020:H\u0014ø\u0001\u0000¢\u0006\u0004\b7\u0010<J\r\u0010=\u001a\u00020\u000f¢\u0006\u0004\b=\u0010\u001eJE\u0010@\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\b52\b\u0010;\u001a\u0004\u0018\u00010:ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010:¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bF\u0010EJ\r\u0010G\u001a\u00020\u000f¢\u0006\u0004\bG\u0010\u001eJ2\u0010I\u001a\u00020\u000f2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\b52\b\b\u0002\u0010H\u001a\u00020\u000b¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u000f¢\u0006\u0004\bK\u0010\u001eJ\r\u0010L\u001a\u00020\u000f¢\u0006\u0004\bL\u0010\u001eJ8\u0010X\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\bV\u0010WJ:\u0010Z\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010WJ\r\u0010\\\u001a\u00020[¢\u0006\u0004\b\\\u0010]J\u001a\u0010a\u001a\u00020O2\u0006\u0010^\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u001a\u0010d\u001a\u00020O2\u0006\u0010b\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\bc\u0010`J\u001a\u0010g\u001a\u00020O2\u0006\u0010e\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\bf\u0010`J\u001a\u0010i\u001a\u00020O2\u0006\u0010b\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010`J\"\u0010n\u001a\u00020O2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ*\u0010n\u001a\u00020O2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020O2\u0006\u0010o\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010qJ\"\u0010v\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010s\u001a\u00020rH\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u001a\u0010y\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020rH\u0016ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u001f\u0010{\u001a\u00020[2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010z\u001a\u00020\u000bH\u0016¢\u0006\u0004\b{\u0010|J\u001a\u0010~\u001a\u00020O2\u0006\u0010b\u001a\u00020OH\u0016ø\u0001\u0000¢\u0006\u0004\b}\u0010`J-\u0010\u007f\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u000f0\rH\u0084\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001J'\u0010\u0083\u0001\u001a\u00020O2\u0006\u00101\u001a\u00020O2\b\b\u0002\u0010o\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J'\u0010\u0085\u0001\u001a\u00020O2\u0006\u00101\u001a\u00020O2\b\b\u0002\u0010o\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001J$\u0010\u0088\u0001\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0004¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008a\u0001\u0010\u001eJ\u000f\u0010\u008b\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008b\u0001\u0010\u001eJ/\u0010\u0091\u0001\u001a\u00020\u000f2\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010z\u001a\u00020\u000b2\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001d\u0010\u0094\u0001\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020OH\u0004ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001d\u0010\u0096\u0001\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020OH\u0004ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0093\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u001eJ\u0011\u0010\u0098\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0098\u0001\u0010\u001eJ\u001b\u0010\u009c\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u000f\u0010\u009d\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u009d\u0001\u0010\u001cJ\u001f\u0010¡\u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b \u0001\u0010`J'\u0010¤\u0001\u001a\u0002022\u0006\u0010P\u001a\u00020O2\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¥\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J!\u0010©\u0001\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002ø\u0001\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001JJ\u0010¬\u0001\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\b52\t\u0010ª\u0001\u001a\u0004\u0018\u00010:H\u0002ø\u0001\u0000¢\u0006\u0005\b«\u0001\u0010?J#\u0010\u00ad\u0001\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A2\b\u0010C\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0005\b\u00ad\u0001\u0010EJ\u001d\u0010¯\u0001\u001a\u00020\u000b2\t\b\u0002\u0010®\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001JC\u0010³\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001JU\u0010¸\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u000b2\u0007\u0010´\u0001\u001a\u0002022\u0007\u0010µ\u0001\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0006\b¶\u0001\u0010·\u0001JL\u0010»\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u000b2\u0007\u0010´\u0001\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001JL\u0010½\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u000b2\u0007\u0010´\u0001\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0006\b¼\u0001\u0010º\u0001J+\u0010À\u0001\u001a\u00020\u000b*\u0004\u0018\u00010\u000e2\u0006\u0010P\u001a\u00020O2\u0006\u0010T\u001a\u00020SH\u0002ø\u0001\u0000¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0016\u0010Á\u0001\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J&\u0010Æ\u0001\u001a\u00020\u000f2\u0007\u0010Ã\u0001\u001a\u00020\u00002\u0006\u0010s\u001a\u00020rH\u0002ø\u0001\u0000¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J&\u0010È\u0001\u001a\u00020\u000f2\u0007\u0010Ã\u0001\u001a\u00020\u00002\u0006\u0010s\u001a\u00020rH\u0002ø\u0001\u0000¢\u0006\u0006\bÇ\u0001\u0010Å\u0001J/\u0010Ì\u0001\u001a\u00020O2\u0007\u0010Ã\u0001\u001a\u00020\u00002\u0007\u0010É\u0001\u001a\u00020O2\u0006\u0010o\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J-\u0010Ì\u0001\u001a\u00020\u000f2\u0007\u0010Ã\u0001\u001a\u00020\u00002\b\u0010Í\u0001\u001a\u00030\u008c\u00012\u0006\u0010z\u001a\u00020\u000bH\u0002¢\u0006\u0006\bÌ\u0001\u0010Î\u0001J$\u0010Ï\u0001\u001a\u00020\u000f2\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010z\u001a\u00020\u000bH\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u001c\u0010Ò\u0001\u001a\u00020O2\u0006\u0010P\u001a\u00020OH\u0002ø\u0001\u0000¢\u0006\u0005\bÑ\u0001\u0010`R\u001d\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0006\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R(\u0010Ö\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0005\bØ\u0001\u0010\u001c\"\u0006\bÙ\u0001\u0010Ú\u0001R(\u0010Û\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÛ\u0001\u0010×\u0001\u001a\u0005\bÜ\u0001\u0010\u001c\"\u0006\bÝ\u0001\u0010Ú\u0001R+\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R+\u0010ä\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bä\u0001\u0010ß\u0001\u001a\u0006\bå\u0001\u0010á\u0001\"\u0006\bæ\u0001\u0010ã\u0001R\u0019\u0010ç\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010×\u0001R\u0019\u0010è\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010×\u0001RN\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\b52\u001a\u0010é\u0001\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0002\b58\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b6\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u001a\u0010î\u0001\u001a\u00030í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001a\u0010ñ\u0001\u001a\u00030ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0019\u0010ó\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u001c\u0010ö\u0001\u001a\u0005\u0018\u00010õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R#\u0010ú\u0001\u001a\f\u0012\u0005\u0012\u00030ù\u0001\u0018\u00010ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R6\u00101\u001a\u0002002\u0007\u0010é\u0001\u001a\u0002008\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b1\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R0\u00103\u001a\u0002022\u0007\u0010é\u0001\u001a\u0002028\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b3\u0010ô\u0001\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001c\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001c\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0087\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001b\u0010\u008a\u0002\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001b\u0010\u008c\u0002\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R0\u0010\u008f\u0002\u001a\u0019\u0012\u0004\u0012\u00020A\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u008e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001d\u0010\u0091\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R)\u0010\u0093\u0002\u001a\u00020\u000b2\u0007\u0010é\u0001\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0093\u0002\u0010×\u0001\u001a\u0005\b\u0094\u0002\u0010\u001cR.\u0010;\u001a\u0005\u0018\u00010\u0095\u00022\n\u0010é\u0001\u001a\u0005\u0018\u00010\u0095\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b;\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u008b\u0002R\u0017\u0010\u009b\u0002\u001a\u00020\u000e8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0018\u0010\u009e\u0002\u001a\u00030ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0017\u0010 \u0002\u001a\u0002028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010\u0082\u0002R\u0017\u0010¢\u0002\u001a\u0002028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010\u0082\u0002R\u0019\u0010¥\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R\u0017\u0010¨\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010§\u0002R\u0016\u0010ª\u0002\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0002\u0010\u001cR\u001b\u0010\u00ad\u0002\u001a\u00030«\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¬\u0002\u0010þ\u0001R\u0018\u0010±\u0002\u001a\u00030®\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010°\u0002R\u0019\u0010³\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0002\u0010¤\u0002R\u0016\u0010µ\u0002\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0002\u0010\u001cR\u0016\u0010¶\u0002\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¶\u0002\u0010\u001cR,\u0010¼\u0002\u001a\u00030õ\u00012\b\u0010·\u0002\u001a\u00030õ\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R0\u0010Â\u0002\u001a\u0005\u0018\u00010½\u00022\n\u0010é\u0001\u001a\u0005\u0018\u00010½\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b¾\u0002\u0010¿\u0002\"\u0006\bÀ\u0002\u0010Á\u0002R\u001f\u0010Æ\u0002\u001a\n\u0012\u0005\u0012\u00030ù\u00010Ã\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u001a\u0010Ê\u0002\u001a\u0005\u0018\u00010Ç\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010É\u0002R\u0016\u0010Ì\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bË\u0002\u0010§\u0002R\u0016\u0010Î\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bÍ\u0002\u0010§\u0002R\u0018\u0010Ñ\u0002\u001a\u00030\u008c\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010Ð\u0002R\u001d\u0010Ó\u0002\u001a\u00020'8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bÒ\u0002\u0010þ\u0001R\u0016\u0010Ô\u0002\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0002\u0010\u001cR\u001b\u0010\u009f\u0001\u001a\u00030\u009e\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bÕ\u0002\u0010þ\u0001R\u0018\u0010Ù\u0002\u001a\u00030Ö\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010Ø\u0002R,\u0010Ü\u0002\u001a\u0017\u0012\u0004\u0012\u00020A\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u000f0\u008e\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÚ\u0002\u0010Û\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ß\u0002"}, m5110d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "mask", "", "includeTail", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "Ld6/s;", "block", "visitNodes", "(IZLr6/c;)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "visitNodes-aLcG6gQ", "(ILr6/c;)V", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "head", "isTransparent", "()Z", "replace$ui_release", "()V", "replace", "ensureLookaheadDelegateCreated", "width", "height", "onMeasureResultChanged", "(II)V", "onCoordinatesUsed$ui_release", "onCoordinatesUsed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLr6/a;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "onUnplaced", "Landroidx/compose/ui/unit/IntOffset;", RequestParameters.POSITION, "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLr6/c;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "releaseLayer", "placeSelfApparentToRealOffset-MLgxB_4", "(JFLr6/c;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelfApparentToRealOffset", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "draw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "performDraw", "onPlaced", "forceUpdateLayerParameters", "updateLayerBlock", "(Lr6/c;Z)V", "onAttach", "onDetach", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isInLayer", "hitTest-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTest", "hitTestChild-qzLsGqo", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "relativeToLocal", "localToScreen-MK-Hz9U", "localToScreen", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "clipBounds", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "(Landroidx/compose/ui/graphics/Canvas;Lr6/c;)V", "toParentPosition-8S9VItk", "(JZ)J", "toParentPosition", "fromParentPosition-8S9VItk", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "onLayoutNodeAttach", "onRelease", "Landroidx/compose/ui/geometry/MutableRect;", "bounds", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "headNode", "(Z)Landroidx/compose/ui/Modifier$Node;", "hasNode-H91voCI", "(I)Z", "hasNode", "explicitLayer", "placeSelf-MLgxB_4", "placeSelf", "drawContainedDrawModifiers", "invokeOnLayoutChange", "updateLayerParameters", "(Z)Z", "hit-5ShdDok", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hit", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "outOfBoundsHit-8NAm7pk", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V", "outOfBoundsHit", "hitNear-Fh5PU_I", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V", "hitNear", "speculativeHit-Fh5PU_I", "speculativeHit", "isInExpandedTouchBounds-ThD-n1k", "(Landroidx/compose/ui/Modifier$Node;JI)Z", "isInExpandedTouchBounds", "toCoordinator", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformFromAncestor-EL8BTi8", "transformFromAncestor", TypedValues.CycleType.S_WAVE_OFFSET, "ancestorToLocal-S_NoaFU", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "ancestorToLocal", "rect", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V", "fromParentRect", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "offsetFromEdge-MK-Hz9U", "offsetFromEdge", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "forcePlaceWithLookaheadOffset", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "setForcePlaceWithLookaheadOffset$ui_release", "(Z)V", "forceMeasureWithLookaheadConstraints", "getForceMeasureWithLookaheadConstraints$ui_release", "setForceMeasureWithLookaheadConstraints$ui_release", "wrapped", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "released", "isClipping", "<set-?>", "Lr6/c;", "getLayerBlock", "()Lr6/c;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "oldAlignmentLines", "Landroidx/collection/MutableObjectIntMap;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "getZIndex", "()F", "setZIndex", "(F)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "drawBlockParentLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlockCanvas", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function2;", "_drawBlock", "Lr6/e;", "invalidateParentLayer", "Lr6/a;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getIntroducesMotionFrameOfReference", "introducesMotionFrameOfReference", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "value", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getDrawBlock", "()Lr6/e;", "drawBlock", "Companion", "HitTestSource", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 15 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 16 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 17 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 18 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 19 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 20 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 21 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1619:1\n105#1,5:1620\n110#1,4:1668\n105#1,9:1672\n116#1:1688\n105#1,5:1689\n110#1,8:1737\n116#1:1817\n105#1,5:1818\n110#1,8:1866\n116#1:1877\n105#1,5:1878\n110#1,8:1926\n116#1:1941\n105#1,5:1942\n110#1,8:1990\n437#2,6:1625\n447#2,2:1632\n449#2,8:1637\n457#2,9:1648\n466#2,8:1660\n437#2,6:1694\n447#2,2:1701\n449#2,8:1706\n457#2,9:1717\n466#2,8:1729\n437#2,5:1752\n442#2:1758\n447#2,2:1760\n449#2,8:1765\n457#2,9:1776\n466#2,8:1788\n437#2,6:1823\n447#2,2:1830\n449#2,8:1835\n457#2,9:1846\n466#2,8:1858\n437#2,6:1883\n447#2,2:1890\n449#2,8:1895\n457#2,9:1906\n466#2,8:1918\n437#2,6:1947\n447#2,2:1954\n449#2,8:1959\n457#2,9:1970\n466#2,8:1982\n437#2,5:2051\n442#2:2068\n447#2,2:2070\n449#2,8:2075\n457#2,9:2086\n466#2,8:2098\n222#2:2191\n223#2,8:2197\n235#2:2207\n209#2:2208\n210#2,6:2214\n437#2,6:2220\n447#2,2:2227\n449#2,8:2232\n457#2,9:2243\n466#2,8:2255\n217#2,3:2263\n246#3:1631\n246#3:1700\n246#3:1750\n246#3:1759\n246#3:1829\n246#3:1889\n246#3:1953\n246#3:2069\n246#3:2226\n240#4,3:1634\n243#4,3:1657\n240#4,3:1703\n243#4,3:1726\n240#4,3:1762\n243#4,3:1785\n240#4,3:1832\n243#4,3:1855\n240#4,3:1892\n243#4,3:1915\n240#4,3:1956\n243#4,3:1979\n240#4,3:2072\n243#4,3:2095\n240#4,3:2229\n243#4,3:2252\n1101#5:1645\n1083#5,2:1646\n1101#5:1714\n1083#5,2:1715\n1101#5:1773\n1083#5,2:1774\n1101#5:1843\n1083#5,2:1844\n1101#5:1903\n1083#5,2:1904\n1101#5:1967\n1083#5,2:1968\n1101#5:2083\n1083#5,2:2084\n1101#5:2240\n1083#5,2:2241\n215#6,2:1681\n30#7:1683\n30#7:1685\n80#8:1684\n80#8:1686\n60#8:2057\n60#8:2060\n70#8:2063\n70#8:2066\n60#8:2107\n70#8:2110\n60#8:2113\n70#8:2116\n60#8:2137\n70#8:2140\n85#8:2152\n90#8:2154\n85#8:2161\n90#8:2163\n60#8:2165\n70#8:2168\n85#8:2171\n90#8:2173\n85#8:2175\n90#8:2177\n85#8:2179\n90#8:2181\n60#8:2185\n70#8:2188\n60#8:2267\n70#8:2270\n53#8,3:2273\n60#8:2277\n70#8:2280\n53#8,3:2283\n60#8:2287\n70#8:2290\n60#8:2294\n70#8:2298\n60#8:2300\n70#8:2303\n87#9:1687\n103#9:1745\n103#9:1749\n103#9:1751\n107#9:1809\n107#9:1816\n155#9:1875\n155#9:1876\n87#9:1939\n107#9:1940\n83#9:2034\n83#9:2046\n83#9:2049\n95#9:2050\n83#9:2190\n95#9:2205\n95#9:2206\n712#10,3:1746\n715#10,3:1796\n1#11:1757\n56#12,5:1799\n56#12,5:1804\n102#12,5:1934\n102#12,5:1998\n76#12,7:2003\n56#12,5:2010\n56#12,5:2118\n56#12,5:2123\n56#12,5:2128\n56#12,5:2141\n56#12,5:2146\n56#12,5:2155\n56#12,5:2192\n56#12,5:2209\n602#13,6:1810\n609#13:1874\n139#14:2015\n139#14:2016\n92#15,9:2017\n113#15,8:2026\n121#15,2:2035\n100#15:2037\n113#15,8:2038\n121#15,2:2047\n65#16:2056\n65#16:2059\n69#16:2062\n69#16:2065\n150#16:2133\n150#16:2134\n65#16:2136\n69#16:2139\n65#16:2184\n69#16:2187\n65#16:2266\n69#16:2269\n65#16:2299\n69#16:2302\n22#17:2058\n22#17:2061\n22#17:2064\n22#17:2067\n22#17:2108\n22#17:2111\n22#17:2114\n22#17:2117\n22#17:2138\n22#17:2166\n22#17:2169\n22#17:2186\n22#17:2189\n22#17:2268\n22#17:2271\n22#17:2278\n22#17:2281\n22#17:2288\n22#17:2291\n22#17:2295\n22#17:2301\n57#18:2106\n61#18:2109\n57#18:2112\n61#18:2115\n57#18:2164\n61#18:2167\n57#18:2276\n61#18:2279\n57#18:2286\n61#18:2289\n63#18:2292\n57#18:2293\n65#18:2296\n61#18:2297\n273#19:2135\n266#19,2:2182\n30#19:2272\n54#20:2151\n59#20:2153\n54#20:2160\n59#20:2162\n54#20:2170\n59#20:2172\n54#20:2174\n59#20:2176\n54#20:2178\n59#20:2180\n33#21:2282\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n116#1:1620,5\n116#1:1668,4\n124#1:1672,9\n243#1:1688\n243#1:1689,5\n243#1:1737,8\n318#1:1817\n318#1:1818,5\n318#1:1866,8\n325#1:1877\n325#1:1878,5\n325#1:1926,8\n460#1:1941\n460#1:1942,5\n460#1:1990,8\n116#1:1625,6\n116#1:1632,2\n116#1:1637,8\n116#1:1648,9\n116#1:1660,8\n243#1:1694,6\n243#1:1701,2\n243#1:1706,8\n243#1:1717,9\n243#1:1729,8\n265#1:1752,5\n265#1:1758\n265#1:1760,2\n265#1:1765,8\n265#1:1776,9\n265#1:1788,8\n318#1:1823,6\n318#1:1830,2\n318#1:1835,8\n318#1:1846,9\n318#1:1858,8\n325#1:1883,6\n325#1:1890,2\n325#1:1895,8\n325#1:1906,9\n325#1:1918,8\n460#1:1947,6\n460#1:1954,2\n460#1:1959,8\n460#1:1970,9\n460#1:1982,8\n884#1:2051,5\n884#1:2068\n884#1:2070,2\n884#1:2075,8\n884#1:2086,9\n884#1:2098,8\n1328#1:2191\n1328#1:2197,8\n1364#1:2207\n1364#1:2208\n1364#1:2214,6\n1364#1:2220,6\n1364#1:2227,2\n1364#1:2232,8\n1364#1:2243,9\n1364#1:2255,8\n1364#1:2263,3\n116#1:1631\n243#1:1700\n264#1:1750\n265#1:1759\n318#1:1829\n325#1:1889\n460#1:1953\n884#1:2069\n1364#1:2226\n116#1:1634,3\n116#1:1657,3\n243#1:1703,3\n243#1:1726,3\n265#1:1762,3\n265#1:1785,3\n318#1:1832,3\n318#1:1855,3\n325#1:1892,3\n325#1:1915,3\n460#1:1956,3\n460#1:1979,3\n884#1:2072,3\n884#1:2095,3\n1364#1:2229,3\n1364#1:2252,3\n116#1:1645\n116#1:1646,2\n243#1:1714\n243#1:1715,2\n265#1:1773\n265#1:1774,2\n318#1:1843\n318#1:1844,2\n325#1:1903\n325#1:1904,2\n460#1:1967\n460#1:1968,2\n884#1:2083\n884#1:2084,2\n1364#1:2240\n1364#1:2241,2\n196#1:1681,2\n232#1:1683\n239#1:1685\n232#1:1684\n239#1:1686\n887#1:2057\n888#1:2060\n889#1:2063\n890#1:2066\n922#1:2107\n923#1:2110\n924#1:2113\n925#1:2116\n1038#1:2137\n1038#1:2140\n1084#1:2152\n1085#1:2154\n1186#1:2161\n1187#1:2163\n1234#1:2165\n1235#1:2168\n1239#1:2171\n1240#1:2173\n1243#1:2175\n1243#1:2177\n1278#1:2179\n1278#1:2181\n1299#1:2185\n1300#1:2188\n1373#1:2267\n1375#1:2270\n1378#1:2273,3\n1387#1:2277\n1388#1:2280\n1389#1:2283,3\n1402#1:2287\n1403#1:2290\n1409#1:2294\n1409#1:2298\n1413#1:2300\n1413#1:2303\n243#1:1687\n257#1:1745\n264#1:1749\n265#1:1751\n316#1:1809\n318#1:1816\n324#1:1875\n325#1:1876\n446#1:1939\n460#1:1940\n724#1:2034\n811#1:2046\n855#1:2049\n884#1:2050\n1328#1:2190\n1358#1:2205\n1364#1:2206\n263#1:1746,3\n263#1:1796,3\n282#1:1799,5\n289#1:1804,5\n358#1:1934,5\n503#1:1998,5\n566#1:2003,7\n595#1:2010,5\n944#1:2118,5\n952#1:2123,5\n959#1:2128,5\n1073#1:2141,5\n1074#1:2146,5\n1128#1:2155,5\n1328#1:2192,5\n1364#1:2209,5\n317#1:1810,6\n317#1:1874\n670#1:2015\n695#1:2016\n723#1:2017,9\n723#1:2026,8\n723#1:2035,2\n810#1:2037\n810#1:2038,8\n810#1:2047,2\n887#1:2056\n888#1:2059\n889#1:2062\n890#1:2065\n995#1:2133\n993#1:2134\n1038#1:2136\n1038#1:2139\n1299#1:2184\n1300#1:2187\n1373#1:2266\n1375#1:2269\n1413#1:2299\n1413#1:2302\n887#1:2058\n888#1:2061\n889#1:2064\n890#1:2067\n922#1:2108\n923#1:2111\n924#1:2114\n925#1:2117\n1038#1:2138\n1234#1:2166\n1235#1:2169\n1299#1:2186\n1300#1:2189\n1373#1:2268\n1375#1:2271\n1387#1:2278\n1388#1:2281\n1402#1:2288\n1403#1:2291\n1409#1:2295\n1413#1:2301\n922#1:2106\n923#1:2109\n924#1:2112\n925#1:2115\n1234#1:2164\n1235#1:2167\n1387#1:2276\n1388#1:2279\n1402#1:2286\n1403#1:2289\n1409#1:2292\n1409#1:2293\n1409#1:2296\n1409#1:2297\n1037#1:2135\n1287#1:2182,2\n1378#1:2272\n1084#1:2151\n1085#1:2153\n1186#1:2160\n1187#1:2162\n1239#1:2170\n1240#1:2172\n1243#1:2174\n1243#1:2176\n1278#1:2178\n1278#1:2180\n1389#1:2282\n*E\n"})
/* loaded from: classes2.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;

    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";

    @Nullable
    private InterfaceC6473e _drawBlock;

    @Nullable
    private MeasureResult _measureResult;

    @Nullable
    private MutableRect _rectCache;

    @Nullable
    private Canvas drawBlockCanvas;

    @Nullable
    private GraphicsLayer drawBlockParentLayer;

    @Nullable
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;

    @Nullable
    private OwnedLayer layer;

    @Nullable
    private InterfaceC6471c layerBlock;

    @Nullable
    private LayerPositionalProperties layerPositionalProperties;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;

    @Nullable
    private NodeCoordinator wrapped;

    @Nullable
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final InterfaceC6471c onCommitAffectingLayerParams = new InterfaceC6471c() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return C5443s.f8405a;
        }

        public final void invoke(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.isValidOwnerScope() && NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNode);
                ownerRequireOwner.getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                ownerRequireOwner.requestOnPositionedCallback(layoutNode);
            }
        }
    };

    @NotNull
    private static final InterfaceC6471c onCommitAffectingLayer = new InterfaceC6471c() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return C5443s.f8405a;
        }

        public final void invoke(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };

    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @NotNull
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();

    @NotNull
    private static final float[] tmpMatrix = Matrix.m10912constructorimpl$default(null, 1, null);

    @NotNull
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo12304childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.m12215hitTest6fMxITs$ui_release(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo12305entityTypeOLwlOKw() {
            return NodeKind.m12314constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int iM12314constructorimpl = NodeKind.m12314constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet() & iM12314constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate = node.getDelegate();
                    int i = 0;
                    node = node;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        node = node;
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            return true;
        }
    };

    @NotNull
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo */
        public void mo12304childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.m12216hitTestSemantics6fMxITs$ui_release(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo12305entityTypeOLwlOKw() {
            return NodeKind.m12314constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfiguration = parentLayoutNode.getSemanticsConfiguration();
            boolean z8 = false;
            if (semanticsConfiguration != null && semanticsConfiguration.getIsClearingSemantics()) {
                z8 = true;
            }
            return !z8;
        }
    };

    @NotNull
    private Density layerDensity = getLayoutNode().getDensity();

    @NotNull
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.INSTANCE.m13444getZeronOccac();

    @NotNull
    private final InterfaceC6469a invalidateParentLayer = new InterfaceC6469a() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12307invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m12307invoke() {
            NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.invalidateLayer();
            }
        }
    };

    @Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "Ld6/s;", "onCommitAffectingLayer", "Lr6/c;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        @NotNull
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH&ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "entityType", "Landroidx/compose/ui/Modifier$Node;", "node", "", "interceptOutOfBoundsChildEvents", "(Landroidx/compose/ui/Modifier$Node;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "shouldHitTestChildren", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isInLayer", "Ld6/s;", "childHitTest-qzLsGqo", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "childHitTest", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface HitTestSource {
        /* renamed from: childHitTest-qzLsGqo */
        void mo12304childHitTestqzLsGqo(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, int pointerType, boolean isInLayer);

        /* renamed from: entityType-OLwlOKw */
        int mo12305entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node);

        boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m12277ancestorToLocalS_NoaFU(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || AbstractC5830k.m5325b(ancestor, nodeCoordinator)) ? m12292fromParentPosition8S9VItk(offset, includeMotionFrameOfReference) : m12292fromParentPosition8S9VItk(nodeCoordinator.m12277ancestorToLocalS_NoaFU(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeM12295headH91voCI = m12295headH91voCI(NodeKind.m12314constructorimpl(4));
        if (nodeM12295headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m12230draweZhPAX0$ui_release(canvas, IntSizeKt.m13488toSizeozmzZPI(mo12041getSizeYbymL2g()), this, nodeM12295headH91voCI, graphicsLayer);
        }
    }

    /* renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m12278fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j7, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z8 = true;
        }
        return nodeCoordinator.m12292fromParentPosition8S9VItk(j7, z8);
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float fM13433getXimpl = IntOffset.m13433getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - fM13433getXimpl);
        bounds.setRight(bounds.getRight() - fM13433getXimpl);
        float fM13434getYimpl = IntOffset.m13434getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - fM13434getYimpl);
        bounds.setBottom(bounds.getBottom() - fM13434getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, (int) (mo12041getSizeYbymL2g() >> 32), (int) (mo12041getSizeYbymL2g() & 4294967295L));
                bounds.isEmpty();
            }
        }
    }

    private final InterfaceC6473e getDrawBlock() {
        InterfaceC6473e interfaceC6473e = this._drawBlock;
        if (interfaceC6473e != null) {
            return interfaceC6473e;
        }
        final InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12306invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12306invoke() {
                NodeCoordinator nodeCoordinator = this.this$0;
                Canvas canvas = nodeCoordinator.drawBlockCanvas;
                AbstractC5830k.m5327d(canvas);
                nodeCoordinator.drawContainedDrawModifiers(canvas, this.this$0.drawBlockParentLayer);
            }
        };
        InterfaceC6473e interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Canvas) obj, (GraphicsLayer) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                if (!this.this$0.getLayoutNode().isPlaced()) {
                    this.this$0.lastLayerDrawingWasSkipped = true;
                    return;
                }
                this.this$0.drawBlockCanvas = canvas;
                this.this$0.drawBlockParentLayer = graphicsLayer;
                this.this$0.getSnapshotObserver().observeReads$ui_release(this.this$0, NodeCoordinator.onCommitAffectingLayer, interfaceC6469a);
                this.this$0.lastLayerDrawingWasSkipped = false;
            }
        };
        this._drawBlock = interfaceC6473e2;
        return interfaceC6473e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m12279hasNodeH91voCI(int type) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(type));
        return nodeHeadNode != null && DelegatableNodeKt.m12158has64DMado(nodeHeadNode, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (tail = nodeCoordinator2.getTail()) == null) {
            return null;
        }
        return tail.getChild();
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m12280hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j7, HitTestResult hitTestResult, int i, boolean z8) {
        if (node == null) {
            mo12204hitTestChildqzLsGqo(hitTestSource, j7, hitTestResult, i, z8);
            return;
        }
        int i8 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z8, false));
        m12280hit5ShdDok(NodeCoordinatorKt.m12312nextUntilhw7D004(node, hitTestSource.mo12305entityTypeOLwlOKw(), NodeKind.m12314constructorimpl(2)), hitTestSource, j7, hitTestResult, i, z8);
        hitTestResult.hitDepth = i8;
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m12281hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j7, HitTestResult hitTestResult, int i, boolean z8, float f) {
        if (node == null) {
            mo12204hitTestChildqzLsGqo(hitTestSource, j7, hitTestResult, i, z8);
            return;
        }
        int i8 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f, z8, false));
        m12284outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m12312nextUntilhw7D004(node, hitTestSource.mo12305entityTypeOLwlOKw(), NodeKind.m12314constructorimpl(2)), hitTestSource, j7, hitTestResult, i, z8, f, true);
        hitTestResult.hitDepth = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m12282isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j7, int i) {
        if (node == 0) {
            return false;
        }
        PointerType.Companion companion = PointerType.INSTANCE;
        if (!PointerType.m11979equalsimpl0(i, companion.m11985getStylusT8wyACA()) && !PointerType.m11979equalsimpl0(i, companion.m11983getEraserT8wyACA())) {
            return false;
        }
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(16);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long jMo7736getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo7736getTouchBoundsExpansionRZrCHBk();
                int i8 = (int) (j7 >> 32);
                if (Float.intBitsToFloat(i8) >= (-TouchBoundsExpansion.m12394computeLeftimpl$ui_release(jMo7736getTouchBoundsExpansionRZrCHBk, getLayoutDirection()))) {
                    if (Float.intBitsToFloat(i8) < TouchBoundsExpansion.m12395computeRightimpl$ui_release(jMo7736getTouchBoundsExpansionRZrCHBk, getLayoutDirection()) + getMeasuredWidth()) {
                        int i9 = (int) (j7 & 4294967295L);
                        if (Float.intBitsToFloat(i9) >= (-TouchBoundsExpansion.m12402getTopimpl(jMo7736getTouchBoundsExpansionRZrCHBk))) {
                            if (Float.intBitsToFloat(i9) < TouchBoundsExpansion.m12399getBottomimpl(jMo7736getTouchBoundsExpansionRZrCHBk) + getMeasuredHeight()) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            if ((node.getKindSet() & iM12314constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = node.getDelegate();
                int i10 = 0;
                node = node;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild();
                    node = node;
                }
                if (i10 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m12283offsetFromEdgeMKHz9U(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - getMeasuredWidth());
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (pointerPosition & 4294967295L)) < 0.0f ? -r6 : r6 - getMeasuredHeight())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m12284outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j7, final HitTestResult hitTestResult, final int i, final boolean z8, final float f, final boolean z9) {
        if (node == null) {
            mo12204hitTestChildqzLsGqo(hitTestSource, j7, hitTestResult, i, z8);
            return;
        }
        if (m12282isInExpandedTouchBoundsThDn1k(node, j7, i)) {
            hitTestResult.hitExpandedTouchBounds(node, z8, new InterfaceC6469a() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m12308invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12308invoke() {
                    this.this$0.m12284outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m12312nextUntilhw7D004(node, hitTestSource.mo12305entityTypeOLwlOKw(), NodeKind.m12314constructorimpl(2)), hitTestSource, j7, hitTestResult, i, z8, f, z9);
                }
            });
        } else if (z9) {
            m12281hitNearFh5PU_I(node, hitTestSource, j7, hitTestResult, i, z8, f);
        } else {
            m12286speculativeHitFh5PU_I(node, hitTestSource, j7, hitTestResult, i, z8, f);
        }
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m12285placeSelfMLgxB_4(long position, float zIndex, InterfaceC6471c layerBlock, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, explicitLayer, false, 8, null);
                ownedLayerCreateLayer$default.mo12370resizeozmzZPI(getMeasuredSize());
                ownedLayerCreateLayer$default.mo12369movegyyYBs(position);
                this.layer = ownedLayerCreateLayer$default;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, layerBlock, false, 2, null);
        }
        if (!IntOffset.m13432equalsimpl0(getPosition(), position)) {
            m12300setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo12369movegyyYBs(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (getIsPlacingForAlignment()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z8, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z8, z9);
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m12286speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j7, final HitTestResult hitTestResult, final int i, final boolean z8, final float f) {
        if (node == null) {
            mo12204hitTestChildqzLsGqo(hitTestSource, j7, hitTestResult, i, z8);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z8, new InterfaceC6469a() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m12309invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12309invoke() {
                    this.this$0.m12284outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m12312nextUntilhw7D004(node, hitTestSource.mo12305entityTypeOLwlOKw(), NodeKind.m12314constructorimpl(2)), hitTestSource, j7, hitTestResult, i, z8, f, false);
                }
            });
        } else {
            m12284outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m12312nextUntilhw7D004(node, hitTestSource.mo12305entityTypeOLwlOKw(), NodeKind.m12314constructorimpl(2)), hitTestSource, j7, hitTestResult, i, z8, f, false);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        AbstractC5830k.m5328e(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m12287toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j7, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z8 = true;
        }
        return nodeCoordinator.m12301toParentPosition8S9VItk(j7, z8);
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m12288transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (AbstractC5830k.m5325b(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        AbstractC5830k.m5327d(nodeCoordinator);
        nodeCoordinator.m12288transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m13432equalsimpl0(getPosition(), IntOffset.INSTANCE.m13444getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m10921resetimpl(fArr);
            Matrix.m10934translateimpl$default(fArr, -IntOffset.m13433getXimpl(getPosition()), -IntOffset.m13434getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m10931timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo12366inverseTransform58bKbWc(matrix);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m12289transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!nodeCoordinator.equals(ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo12371transform58bKbWc(matrix);
            }
            if (!IntOffset.m13432equalsimpl0(nodeCoordinator.getPosition(), IntOffset.INSTANCE.m13444getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m10921resetimpl(fArr);
                Matrix.m10934translateimpl$default(fArr, IntOffset.m13433getXimpl(r1), IntOffset.m13434getYimpl(r1), 0.0f, 4, null);
                Matrix.m10931timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            AbstractC5830k.m5327d(nodeCoordinator);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, InterfaceC6471c interfaceC6471c, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        nodeCoordinator.updateLayerBlock(interfaceC6471c, z8);
    }

    private final boolean updateLayerParameters(boolean invokeOnLayoutChange) {
        Owner owner;
        if (this.explicitLayer != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (!(this.layerBlock == null)) {
                InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            }
            return false;
        }
        final InterfaceC6471c interfaceC6471c = this.layerBlock;
        if (interfaceC6471c == null) {
            throw AbstractC1923c.m1053q("updateLayerParameters requires a non-null layerBlock");
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m10994setSizeuvyYCjk(IntSizeKt.m13488toSizeozmzZPI(mo12041getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new InterfaceC6469a() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12310invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12310invoke() {
                interfaceC6471c.invoke(NodeCoordinator.graphicsLayerScope);
                NodeCoordinator.graphicsLayerScope.updateOutline$ui_release();
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z8 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean zHasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        boolean z9 = !zHasSameValuesAs;
        if (invokeOnLayoutChange && ((!zHasSameValuesAs || z8 != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
            owner.onLayoutChange(getLayoutNode());
        }
        return z9;
    }

    public static /* synthetic */ boolean updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z8 = true;
        }
        return nodeCoordinator.updateLayerParameters(z8);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m12290calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - getMeasuredWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L)) - getMeasuredHeight();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return Size.m10501constructorimpl((Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m12291distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM12290calculateMinimumTouchTargetPaddingE7KxVPU = m12290calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM12290calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM12290calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long jM12283offsetFromEdgeMKHz9U = m12283offsetFromEdgeMKHz9U(pointerPosition);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jM12283offsetFromEdgeMKHz9U >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jM12283offsetFromEdgeMKHz9U & 4294967295L)) <= fIntBitsToFloat2) {
            return Offset.m10440getDistanceSquaredimpl(jM12283offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas, @Nullable GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fM13433getXimpl = IntOffset.m13433getXimpl(getPosition());
        float fM13434getYimpl = IntOffset.m13434getYimpl(getPosition());
        canvas.translate(fM13433getXimpl, fM13434getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-fM13433getXimpl, -fM13434getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f, paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui_release(@NotNull NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM12314constructorimpl = NodeKind.m12314constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
                if ((parent$ui_release.getKindSet() & iM12314constructorimpl) != 0 && parent$ui_release == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            AbstractC5830k.m5327d(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            AbstractC5830k.m5327d(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui_release();
            }
            return other;
        }
        return this;
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m12292fromParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = IntOffsetKt.m13446minusNvtHpc(position, getPosition());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo12368mapOffset8S9VItk(position, true) : position;
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    /* renamed from: getForceMeasureWithLookaheadConstraints$ui_release, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    /* renamed from: getForcePlaceWithLookaheadOffset$ui_release, reason: from getter */
    public final boolean getForcePlaceWithLookaheadOffset() {
        return this.forcePlaceWithLookaheadOffset;
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return getIsPlacedUnderMotionFrameOfReference();
    }

    /* renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m12293getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    public final InterfaceC6471c getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable, androidx.compose.p011ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Nullable
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError);
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m12294getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo6904toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo12222getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.p011ui.layout.Measured, androidx.compose.p011ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        if (!getLayoutNode().getNodes().m12270hasH91voCI$ui_release(NodeKind.m12314constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Modifier.Node tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((NodeKind.m12314constructorimpl(64) & tail.getKindSet()) != 0) {
                int iM12314constructorimpl = NodeKind.m12314constructorimpl(64);
                MutableVector mutableVector = null;
                DelegatingNode delegatingNodePop = tail;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof ParentDataModifierNode) {
                        ref$ObjectRef.element = ((ParentDataModifierNode) delegatingNodePop).modifyParentData(getLayoutNode().getDensity(), ref$ObjectRef.element);
                    } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                        int i = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
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
                        if (i == 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? EmptySet.INSTANCE : linkedHashSet;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo12041getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @NotNull
    public abstract Modifier.Node getTail();

    @Nullable
    /* renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @Nullable
    /* renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Nullable
    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m12295headH91voCI(int type) {
        boolean zM12323getIncludeSelfInTraversalH91voCI = NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM12323getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM12323getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m12296hitTestqzLsGqo(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        boolean z8;
        Modifier.Node nodeM12295headH91voCI = m12295headH91voCI(hitTestSource.mo12305entityTypeOLwlOKw());
        boolean z9 = false;
        if (!m12303withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (PointerType.m11979equalsimpl0(pointerType, PointerType.INSTANCE.m11986getTouchT8wyACA())) {
                float fM12291distanceInMinimumTouchTargettz77jQw = m12291distanceInMinimumTouchTargettz77jQw(pointerPosition, m12294getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(fM12291distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(fM12291distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m12281hitNearFh5PU_I(nodeM12295headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, false, fM12291distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (nodeM12295headH91voCI == null) {
            mo12204hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (m12297isPointerInBoundsk4lQ0M(pointerPosition)) {
            m12280hit5ShdDok(nodeM12295headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float fM12291distanceInMinimumTouchTargettz77jQw2 = !PointerType.m11979equalsimpl0(pointerType, PointerType.INSTANCE.m11986getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m12291distanceInMinimumTouchTargettz77jQw(pointerPosition, m12294getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(fM12291distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z8 = isInLayer;
            if (hitTestResult.isHitInMinimumTouchTargetBetter(fM12291distanceInMinimumTouchTargettz77jQw2, z8)) {
                z9 = true;
            }
        } else {
            z8 = isInLayer;
        }
        m12284outOfBoundsHit8NAm7pk(nodeM12295headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, z8, fM12291distanceInMinimumTouchTargettz77jQw2, z9);
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo12204hitTestChildqzLsGqo(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m12296hitTestqzLsGqo(hitTestSource, m12278fromParentPosition8S9VItk$default(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().getIsAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m12297isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) getMeasuredWidth()) && fIntBitsToFloat2 < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.p011ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!sourceCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (sourceCoordinates.mo12041getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (sourceCoordinates.mo12041getSizeYbymL2g() & 4294967295L));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            boolean z8 = clipBounds;
            rectInParent$ui_release$default(nodeCoordinator, rectCache, z8, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            AbstractC5830k.m5327d(nodeCoordinator);
            clipBounds = z8;
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo12042localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return mo12043localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo12043localPositionOfS_NoaFU(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) sourceCoordinates).getCoordinator().onCoordinatesUsed$ui_release();
            return Offset.m10433constructorimpl(sourceCoordinates.mo12043localPositionOfS_NoaFU(this, Offset.m10433constructorimpl(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            relativeToSource = coordinator.m12301toParentPosition8S9VItk(relativeToSource, includeMotionFrameOfReference);
            coordinator = coordinator.wrappedBy;
            AbstractC5830k.m5327d(coordinator);
        }
        return m12277ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui_release, relativeToSource, includeMotionFrameOfReference);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo12044localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        long jM12287toParentPosition8S9VItk$default = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jM12287toParentPosition8S9VItk$default = m12287toParentPosition8S9VItk$default(nodeCoordinator, jM12287toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM12287toParentPosition8S9VItk$default;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo12045localToScreenMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo11988localToScreenMKHz9U(mo12044localToRootMKHz9U(relativeToLocal));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo12046localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo12373calculatePositionInWindowMKHz9U(mo12044localToRootMKHz9U(relativeToLocal));
    }

    public final void onAttach() {
        if (this.layer != null || this.layerBlock == null) {
            return;
        }
        OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, this.explicitLayer, false, 8, null);
        ownedLayerCreateLayer$default.mo12370resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer$default.mo12369movegyyYBs(getPosition());
        ownedLayerCreateLayer$default.invalidate();
        this.layer = ownedLayerCreateLayer$default;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    public final void onDetach() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
        }
        this.layer = null;
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public void onMeasureResultChanged(int width, int height) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo12370resizeozmzZPI(IntSize.m13471constructorimpl((width << 32) | (height & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m12095setMeasuredSizeozmzZPI(IntSize.m13471constructorimpl((height & 4294967295L) | (width << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(4);
        boolean zM12323getIncludeSelfInTraversalH91voCI = NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(iM12314constructorimpl);
        Modifier.Node tail = getTail();
        if (zM12323getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM12323getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM12314constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM12314constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNodePop).onMeasureResultChanged();
                        } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m12279hasNodeH91voCI(NodeKind.m12314constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iM12314constructorimpl = NodeKind.m12314constructorimpl(128);
                boolean zM12323getIncludeSelfInTraversalH91voCI = NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(iM12314constructorimpl);
                if (!zM12323getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail().getParent();
                    if (parent$ui_release == null) {
                    }
                }
                parent$ui_release = getTail();
                for (Modifier.Node nodeHeadNode = headNode(zM12323getIncludeSelfInTraversalH91voCI); nodeHeadNode != null; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getAggregateChildKindSet() & iM12314constructorimpl) == 0) {
                        break;
                    }
                    if ((nodeHeadNode.getKindSet() & iM12314constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNodePop = nodeHeadNode;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) delegatingNodePop).mo6891onRemeasuredozmzZPI(getMeasuredSize());
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == parent$ui_release) {
                        break;
                    }
                }
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
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
    public final void onPlaced() {
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(128);
        boolean zM12323getIncludeSelfInTraversalH91voCI = NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(iM12314constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM12323getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM12323getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM12314constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM12314constructorimpl) != 0) {
                DelegatingNode delegatingNodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodePop).onPlaced(this);
                    } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                        int i = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
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
                        if (i == 1) {
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

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
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
    public final void onUnplaced() {
        if (m12279hasNodeH91voCI(NodeKind.m12314constructorimpl(1048576))) {
            int iM12314constructorimpl = NodeKind.m12314constructorimpl(1048576);
            boolean zM12323getIncludeSelfInTraversalH91voCI = NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(iM12314constructorimpl);
            Modifier.Node tail = getTail();
            if (!zM12323getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
                return;
            }
            for (Modifier.Node nodeHeadNode = headNode(zM12323getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM12314constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM12314constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof OnUnplacedModifierNode) {
                            ((OnUnplacedModifierNode) delegatingNodePop).onUnplaced();
                        } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                            int i = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
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
    }

    public void performDraw(@NotNull Canvas canvas, @Nullable GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    @NotNull
    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m12298performingMeasureK40F9xA(long constraints, @NotNull InterfaceC6469a block) {
        m12096setMeasurementConstraintsBRTryo0(constraints);
        return (Placeable) block.invoke();
    }

    @Override // androidx.compose.p011ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo12034placeAtf8xVGno(long position, float zIndex, @Nullable InterfaceC6471c layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m12285placeSelfMLgxB_4(position, zIndex, layerBlock, null);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        AbstractC5830k.m5327d(lookaheadDelegate);
        m12285placeSelfMLgxB_4(lookaheadDelegate.getPosition(), zIndex, layerBlock, null);
    }

    /* renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m12299placeSelfApparentToRealOffsetMLgxB_4(long position, float zIndex, @Nullable InterfaceC6471c layerBlock, @Nullable GraphicsLayer layer) {
        m12285placeSelfMLgxB_4(IntOffset.m13437plusqkQi6aY(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM12294getMinimumTouchTargetSizeNHjbRc = m12294getMinimumTouchTargetSizeNHjbRc();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM12294getMinimumTouchTargetSizeNHjbRc >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM12294getMinimumTouchTargetSizeNHjbRc & 4294967295L)) / 2.0f;
                    bounds.intersect(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (mo12041getSizeYbymL2g() >> 32)) + fIntBitsToFloat, ((int) (4294967295L & mo12041getSizeYbymL2g())) + fIntBitsToFloat2);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, (int) (mo12041getSizeYbymL2g() >> 32), (int) (4294967295L & mo12041getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM13433getXimpl = IntOffset.m13433getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM13433getXimpl);
        bounds.setRight(bounds.getRight() + fM13433getXimpl);
        float fM13434getYimpl = IntOffset.m13434getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM13434getYimpl);
        bounds.setBottom(bounds.getBottom() + fM13434getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.p011ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo12094placeAtf8xVGno(getPosition(), this.zIndex, graphicsLayer);
        } else {
            mo12034placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo12047screenToLocalMKHz9U(long relativeToScreen) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo12042localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo11989screenToLocalMKHz9U(relativeToScreen));
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z8) {
        this.forceMeasureWithLookaheadConstraints = z8;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z8) {
        this.forcePlaceWithLookaheadOffset = z8;
    }

    public abstract void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setMeasureResult$ui_release(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.layout.MeasureResult r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.MeasureResult r0 = r3._measureResult
            if (r4 == r0) goto L8c
            r3._measureResult = r4
            if (r0 == 0) goto L1c
            int r1 = r4.getF907$w()
            int r2 = r0.getF907$w()
            if (r1 != r2) goto L1c
            int r1 = r4.getF906$h()
            int r0 = r0.getF906$h()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.getF907$w()
            int r1 = r4.getF906$h()
            r3.onMeasureResultChanged(r0, r1)
        L27:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 == 0) goto L34
            kotlin.jvm.internal.AbstractC5830k.m5327d(r0)
            boolean r0 = r0.isNotEmpty()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.getAlignmentLines()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            java.util.Map r1 = r4.getAlignmentLines()
            boolean r0 = androidx.compose.p011ui.node.NodeCoordinatorKt.access$compareEquals(r0, r1)
            if (r0 != 0) goto L8c
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r3.getAlignmentLinesOwner()
            androidx.compose.ui.node.AlignmentLines r0 = r0.getAlignmentLines()
            r0.onAlignmentsChanged()
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 != 0) goto L5f
            androidx.collection.MutableObjectIntMap r0 = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf()
            r3.oldAlignmentLines = r0
        L5f:
            r0.clear()
            java.util.Map r4 = r4.getAlignmentLines()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.set(r2, r1)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.node.NodeCoordinator.setMeasureResult$ui_release(androidx.compose.ui.layout.MeasureResult):void");
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m12300setPositiongyyYBs(long j7) {
        this.position = j7;
    }

    public final void setWrapped$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(NodeKind.m12314constructorimpl(16)));
        if (nodeHeadNode != null && nodeHeadNode.getIsAttached()) {
            int iM12314constructorimpl = NodeKind.m12314constructorimpl(16);
            if (!nodeHeadNode.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = nodeHeadNode.getNode();
            if ((node.getAggregateChildKindSet() & iM12314constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = node;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNodePop).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getChild();
                }
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m12301toParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo12368mapOffset8S9VItk(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m13448plusNvtHpc(position, getPosition()) : position;
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM12290calculateMinimumTouchTargetPaddingE7KxVPU = m12290calculateMinimumTouchTargetPaddingE7KxVPU(m12294getMinimumTouchTargetSizeNHjbRc());
        int i = (int) (jM12290calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i));
        int i8 = (int) (jM12290calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i8));
        rectCache.setRight(Float.intBitsToFloat(i) + getMeasuredWidth());
        rectCache.setBottom(Float.intBitsToFloat(i8) + getMeasuredHeight());
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            AbstractC5830k.m5327d(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo12048transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m10921resetimpl(matrix);
        coordinator.m12289transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
        m12288transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo12049transformToScreen58bKbWc(@NotNull float[] matrix) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m12289transformToAncestorEL8BTi8(coordinator, matrix);
        if (ownerRequireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRequireOwner).mo11837localToScreen58bKbWc(matrix);
            return;
        }
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & jPositionOnScreen) != androidx.compose.p011ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m10933translateimpl(matrix, Float.intBitsToFloat((int) (jPositionOnScreen >> 32)), Float.intBitsToFloat((int) (jPositionOnScreen & 4294967295L)), 0.0f);
        }
    }

    public final void updateLayerBlock(@Nullable InterfaceC6471c layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z8 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && AbstractC5830k.m5325b(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.isAttached() || layerBlock == null) {
            this.layerBlock = null;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && layoutNode.isPlaced() && (owner = layoutNode.getOwner()) != null) {
                    owner.onLayoutChange(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = layerBlock;
        if (this.layer != null) {
            if (z8 && updateLayerParameters$default(this, false, 1, null)) {
                LayoutNodeKt.requireOwner(layoutNode).getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, layoutNode.getForceUseOldLayers(), 4, null);
        ownedLayerCreateLayer$default.mo12370resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer$default.mo12369movegyyYBs(getPosition());
        this.layer = ownedLayerCreateLayer$default;
        updateLayerParameters$default(this, false, 1, null);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public final void visitNodes(int mask, boolean includeTail, @NotNull InterfaceC6471c block) {
        Modifier.Node tail = getTail();
        if (!includeTail && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(includeTail); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & mask) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & mask) != 0) {
                block.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final <T> void m12302visitNodesaLcG6gQ(int type, InterfaceC6471c block) {
        boolean zM12323getIncludeSelfInTraversalH91voCI = NodeKindKt.m12323getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM12323getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM12323getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                AbstractC5830k.m5338o();
                throw null;
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo12050windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo12042localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m10445minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo12372calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull InterfaceC6471c block) {
        float fM13433getXimpl = IntOffset.m13433getXimpl(getPosition());
        float fM13434getYimpl = IntOffset.m13434getYimpl(getPosition());
        canvas.translate(fM13433getXimpl, fM13434getYimpl);
        block.invoke(canvas);
        canvas.translate(-fM13433getXimpl, -fM13434getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m12303withinLayerBoundsk4lQ0M(long pointerPosition) {
        if ((((androidx.compose.p011ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (pointerPosition & androidx.compose.p011ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.p011ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo12367isInLayerk4lQ0M(pointerPosition);
    }

    @Override // androidx.compose.p011ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo12094placeAtf8xVGno(long position, float zIndex, @NotNull GraphicsLayer layer) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            AbstractC5830k.m5327d(lookaheadDelegate);
            m12285placeSelfMLgxB_4(lookaheadDelegate.getPosition(), zIndex, null, layer);
            return;
        }
        m12285placeSelfMLgxB_4(position, zIndex, null, layer);
    }
}
