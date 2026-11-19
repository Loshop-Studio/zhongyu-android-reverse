package androidx.compose.p011ui.node;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001c\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJq\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JY\u0010%\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$JY\u0010%\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'JO\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+Jm\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104Jw\u0010,\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u00106\u001a\u000205H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108Jk\u0010B\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJk\u0010B\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJY\u0010G\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJY\u0010G\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJM\u0010N\u001a\u00020\u00192\u0006\u0010K\u001a\u00020J2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJM\u0010N\u001a\u00020\u00192\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJq\u0010W\u001a\u00020\u00192\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010VJq\u0010W\u001a\u00020\u00192\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010YJY\u0010[\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bZ\u0010FJY\u0010[\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010IJc\u0010a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010^\u001a\u00020]2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`Jc\u0010a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010^\u001a\u00020]2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010h\u001a\u00020e*\u00020dH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020e*\u00020iH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020d*\u00020iH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\u001a\u0010n\u001a\u00020d*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u001a\u0010n\u001a\u00020d*\u00020eH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010qJ\u0017\u0010u\u001a\u00020r*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\u0017\u0010w\u001a\u00020\t*\u00020dH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bv\u0010pJ\u0017\u0010w\u001a\u00020\t*\u00020iH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bx\u0010mJ\u0014\u0010{\u001a\u00020z*\u00020yH\u0097\u0001¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u0010*\u00020rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010tJ\u0019\u0010\u0081\u0001\u001a\u00020i*\u00020dH\u0097\u0001ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001d\u0010\u0081\u0001\u001a\u00020i*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0080\u0001J\u001d\u0010\u0081\u0001\u001a\u00020i*\u00020eH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u0019H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J>\u0010\u008c\u0001\u001a\u00020\u0019*\u00030\u0086\u00012\u0006\u0010\u0011\u001a\u00020/2\u001a\u0010\u0089\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190\u0087\u0001¢\u0006\u0003\b\u0088\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J+\u0010\u0091\u0001\u001a\u00020\u0019*\u00030\u008d\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0086\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001JG\u0010\u0099\u0001\u001a\u00020\u00192\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001JG\u0010\u009c\u0001\u001a\u00020\u00192\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u008d\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u000f\n\u0005\b\u0004\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010 \u0001R\u001c\u0010\"\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¥\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010©\u0001\u001a\u00030¦\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010«\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\bª\u0001\u0010¤\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b°\u0001\u0010¢\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006±\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Ld6/s;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "drawContent", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLr6/c;)V", "record", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "layer", "performDraw", "(Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "drawDirect-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "drawDirect", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/node/DrawModifierNode;", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n233#2:154\n305#2,15:252\n321#2,10:268\n76#3,7:155\n87#4:162\n87#4:206\n87#4:207\n87#4:208\n437#5,6:163\n447#5,2:170\n449#5,8:175\n457#5,9:186\n466#5,8:198\n437#5,6:209\n447#5,2:216\n449#5,8:221\n457#5,9:232\n466#5,8:244\n246#6:169\n246#6:215\n240#7,3:172\n243#7,3:195\n240#7,3:218\n243#7,3:241\n1101#8:183\n1083#8,2:184\n1101#8:229\n1083#8,2:230\n1#9:267\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n47#1:154\n131#1:252,15\n131#1:268,10\n49#1:155,7\n64#1:162\n71#1:206\n106#1:207\n119#1:208\n64#1:163,6\n64#1:170,2\n64#1:175,8\n64#1:186,9\n64#1:198,8\n119#1:209,6\n119#1:216,2\n119#1:221,8\n119#1:232,9\n119#1:244,8\n64#1:169\n119#1:215\n64#1:172,3\n64#1:195,3\n119#1:218,3\n119#1:241,3\n64#1:183\n64#1:184,2\n119#1:229\n119#1:230,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;

    @NotNull
    private final CanvasDrawScope canvasDrawScope;

    @Nullable
    private DrawModifierNode drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m12230draweZhPAX0$ui_release(@NotNull Canvas canvas, long size, @NotNull NodeCoordinator coordinator, @NotNull Modifier.Node drawNode, @Nullable GraphicsLayer layer) {
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(4);
        DelegatingNode delegatingNodePop = drawNode;
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof DrawModifierNode) {
                m12231drawDirecteZhPAX0$ui_release(canvas, size, coordinator, delegatingNodePop, layer);
            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodePop.getDelegate();
                int i = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo11130drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11130drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo11131drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11131drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo11132drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11132drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo11133drawCircleVaOC9Bg(long color, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11133drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.p011ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode == null) {
            throw AbstractC1923c.m1053q("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        DelegatingNode delegatingNodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (delegatingNodeNextDrawNode == 0) {
            NodeCoordinator nodeCoordinatorM12160requireCoordinator64DMado = DelegatableNodeKt.m12160requireCoordinator64DMado(drawModifierNode, NodeKind.m12314constructorimpl(4));
            if (nodeCoordinatorM12160requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                nodeCoordinatorM12160requireCoordinator64DMado = nodeCoordinatorM12160requireCoordinator64DMado.getWrapped();
                AbstractC5830k.m5327d(nodeCoordinatorM12160requireCoordinator64DMado);
            }
            nodeCoordinatorM12160requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(4);
        MutableVector mutableVector = null;
        while (delegatingNodeNextDrawNode != 0) {
            if (delegatingNodeNextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) delegatingNodeNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((delegatingNodeNextDrawNode.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodeNextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate = delegatingNodeNextDrawNode.getDelegate();
                int i = 0;
                delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNodeNextDrawNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodeNextDrawNode != 0) {
                                mutableVector.add(delegatingNodeNextDrawNode);
                                delegatingNodeNextDrawNode = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                }
                if (i == 1) {
                }
            }
            delegatingNodeNextDrawNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m12231drawDirecteZhPAX0$ui_release(@NotNull Canvas canvas, long size, @NotNull NodeCoordinator coordinator, @NotNull DrawModifierNode drawNode, @Nullable GraphicsLayer layer) {
        DrawModifierNode drawModifierNode = this.drawNode;
        this.drawNode = drawNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo11154getSizeNHjbRc = canvasDrawScope.getDrawContext().mo11154getSizeNHjbRc();
        GraphicsLayer graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(coordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo11155setSizeuvyYCjk(size);
        drawContext.setGraphicsLayer(layer);
        canvas.save();
        try {
            drawNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            this.drawNode = drawModifierNode;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo11134drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11134drawImage9jGpkUE(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo11135drawImageAZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.mo11135drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo11136drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11136drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo11137drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11137drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo11138drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11138drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo11139drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11139drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo11140drawOvalnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11140drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo11141drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11141drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo11142drawPathLG529CI(@NotNull Path path, long color, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11142drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo11143drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11143drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo11144drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11144drawPointsGsft0Ws(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo11145drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11145drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo11146drawRectnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11146drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo11147drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11147drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo11148drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo11148drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @NotNull
    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo11232getCenterF1C5BW0() {
        return this.canvasDrawScope.mo11232getCenterF1C5BW0();
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo11233getSizeNHjbRc() {
        return this.canvasDrawScope.mo11233getSizeNHjbRc();
    }

    public final void performDraw(@NotNull DrawModifierNode drawModifierNode, @NotNull Canvas canvas, @Nullable GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM12160requireCoordinator64DMado = DelegatableNodeKt.m12160requireCoordinator64DMado(drawModifierNode, NodeKind.m12314constructorimpl(4));
        nodeCoordinatorM12160requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m12231drawDirecteZhPAX0$ui_release(canvas, IntSizeKt.m13488toSizeozmzZPI(nodeCoordinatorM12160requireCoordinator64DMado.mo12041getSizeYbymL2g()), nodeCoordinatorM12160requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    @Override // androidx.compose.p011ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4 */
    public void mo11234recordJVtK1S4(@NotNull GraphicsLayer graphicsLayer, long j7, @NotNull final InterfaceC6471c interfaceC6471c) {
        final DrawModifierNode drawModifierNode = this.drawNode;
        graphicsLayer.m11327recordmLhObY(this, getLayoutDirection(), j7, new InterfaceC6471c() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                invoke((DrawScope) obj);
                return C5443s.f8405a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
            /* JADX WARN: Type inference failed for: r2v5 */
            public final void invoke(DrawScope drawScope) throws Throwable {
                LayoutNodeDrawScope layoutNodeDrawScope;
                Density density;
                LayoutDirection layoutDirection;
                Canvas canvas;
                long jMo11154getSizeNHjbRc;
                GraphicsLayer graphicsLayer2;
                InterfaceC6471c interfaceC6471c2;
                Density density2;
                LayoutDirection layoutDirection2;
                Canvas canvas2;
                long jMo11154getSizeNHjbRc2;
                GraphicsLayer graphicsLayer3;
                ?? drawContext = this.this$0.drawNode;
                this.this$0.drawNode = drawModifierNode;
                try {
                    layoutNodeDrawScope = this.this$0;
                    density = drawScope.getDrawContext().getDensity();
                    layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    canvas = drawScope.getDrawContext().getCanvas();
                    jMo11154getSizeNHjbRc = drawScope.getDrawContext().mo11154getSizeNHjbRc();
                    graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    interfaceC6471c2 = interfaceC6471c;
                    density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    jMo11154getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo11154getSizeNHjbRc();
                    graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                } catch (Throwable th) {
                    th = th;
                    this.this$0.drawNode = drawContext;
                    throw th;
                }
                try {
                    drawContext = layoutNodeDrawScope.getDrawContext();
                    drawContext.setDensity(density);
                    drawContext.setLayoutDirection(layoutDirection);
                    drawContext.setCanvas(canvas);
                    drawContext.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
                    drawContext.setGraphicsLayer(graphicsLayer2);
                    canvas.save();
                    try {
                        interfaceC6471c2.invoke(layoutNodeDrawScope);
                        canvas.restore();
                        DrawContext drawContext2 = layoutNodeDrawScope.getDrawContext();
                        drawContext2.setDensity(density2);
                        drawContext2.setLayoutDirection(layoutDirection2);
                        drawContext2.setCanvas(canvas2);
                        drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc2);
                        drawContext2.setGraphicsLayer(graphicsLayer3);
                        this.this$0.drawNode = drawContext;
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext;
                    this.this$0.drawNode = drawContext;
                    throw th;
                }
            }
        });
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo6896roundToPxR2X_6o(long j7) {
        return this.canvasDrawScope.mo6896roundToPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo6897roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo6897roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo6898toDpGaN1DYA(long j7) {
        return this.canvasDrawScope.mo6898toDpGaN1DYA(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6899toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo6899toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo6901toDpSizekrfVVM(long j7) {
        return this.canvasDrawScope.mo6901toDpSizekrfVVM(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo6902toPxR2X_6o(long j7) {
        return this.canvasDrawScope.mo6902toPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo6903toPx0680j_4(float f) {
        return this.canvasDrawScope.mo6903toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo6904toSizeXkaWNTQ(long j7) {
        return this.canvasDrawScope.mo6904toSizeXkaWNTQ(j7);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo6905toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo6905toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6906toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo6906toSpkPz2Gy4(f);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6900toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo6900toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6907toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo6907toSpkPz2Gy4(i);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
