package androidx.compose.p006ui.node;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.ColorFilter;
import androidx.compose.p006ui.graphics.ImageBitmap;
import androidx.compose.p006ui.graphics.Path;
import androidx.compose.p006ui.graphics.PathEffect;
import androidx.compose.p006ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p006ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawContext;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DpRect;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J5\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$Jt\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105Jt\u0010%\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\\\u0010:\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\\\u0010:\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\u001eH\u0016JR\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJp\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020G2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJz\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020G2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010N\u001a\u00020OH\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QJn\u0010R\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bZ\u0010[Jn\u0010R\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\\\u0010^\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\\\u0010^\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJP\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJP\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010iJt\u0010j\u001a\u00020\u001e2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070l2\u0006\u0010m\u001a\u00020n2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJt\u0010j\u001a\u00020\u001e2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070l2\u0006\u0010m\u001a\u00020n2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\\\u0010s\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010`J\\\u0010s\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010bJf\u0010v\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010zJf\u0010v\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u00020\u001e*\u00020\u00132\u0006\u0010\u001f\u001a\u00020 J\u001d\u0010~\u001a\u00020\u007f*\u00030\u0080\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010~\u001a\u00020\u007f*\u00030\u0083\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001f\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00030\u0083\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J!\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00020\u000bH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J!\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00020\u007fH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008b\u0001J\u001e\u0010\u008c\u0001\u001a\u00030\u008d\u0001*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001e\u0010\u0090\u0001\u001a\u00020\u000b*\u00030\u0080\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J\u001e\u0010\u0090\u0001\u001a\u00020\u000b*\u00030\u0083\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0088\u0001J\u0010\u0010\u0093\u0001\u001a\u00030\u0094\u0001*\u00030\u0095\u0001H\u0097\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\u001b*\u00030\u008d\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u008f\u0001J\u001f\u0010\u0098\u0001\u001a\u00030\u0083\u0001*\u00030\u0080\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J!\u0010\u0098\u0001\u001a\u00030\u0083\u0001*\u00020\u000bH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J!\u0010\u0098\u0001\u001a\u00030\u0083\u0001*\u00020\u007fH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u00020\u00078VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0012\u0010\u0016\u001a\u00020\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009d\u0001"}, m5175d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawNode", "Landroidx/compose/ui/node/DrawModifierNode;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;)V", "drawArc", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawContent", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "performDraw", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,114:1\n245#2:115\n71#3:116\n71#3:117\n558#4,17:118\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:115\n59#1:116\n71#1:117\n85#1:118,17\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: draw-x_KDEd0$ui_release, reason: not valid java name */
    public final void m10710drawx_KDEd0$ui_release(Canvas canvas, long size, NodeCoordinator coordinator, DrawModifierNode drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        DrawModifierNode drawModifierNode = this.drawNode;
        this.drawNode = drawNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.getDensity();
        LayoutDirection layoutDirectionComponent2 = drawParams.getLayoutDirection();
        Canvas canvasComponent3 = drawParams.getCanvas();
        long jM9616component4NHjbRc = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(coordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m9619setSizeuvyYCjk(size);
        canvas.save();
        drawNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m9619setSizeuvyYCjk(jM9616component4NHjbRc);
        this.drawNode = drawModifierNode;
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo9594drawArcillE91I(Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9594drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo9595drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9595drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo9596drawCircleV9BoPsw(Brush brush, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9596drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo9597drawCircleVaOC9Bg(long color, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9597drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        Intrinsics.checkNotNull(drawModifierNode);
        DrawModifierNode drawModifierNodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (drawModifierNodeNextDrawNode != null) {
            performDraw(drawModifierNodeNextDrawNode, canvas);
            return;
        }
        NodeCoordinator nodeCoordinatorM10677requireCoordinator64DMado = DelegatableNodeKt.m10677requireCoordinator64DMado(drawModifierNode, NodeKind.m10773constructorimpl(4));
        if (nodeCoordinatorM10677requireCoordinator64DMado.getTail() == drawModifierNode) {
            nodeCoordinatorM10677requireCoordinator64DMado = nodeCoordinatorM10677requireCoordinator64DMado.getWrapped();
            Intrinsics.checkNotNull(nodeCoordinatorM10677requireCoordinator64DMado);
        }
        nodeCoordinatorM10677requireCoordinator64DMado.performDraw(canvas);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo9598drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9598drawImage9jGpkUE(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo9599drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9599drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo9600drawImagegbVJVH8(ImageBitmap image, long topLeft, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9600drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo9601drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.canvasDrawScope.mo9601drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo9602drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo9602drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo9603drawOvalAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9603drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo9604drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9604drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo9605drawPathGBMwjPU(Path path, Brush brush, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9605drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo9606drawPathLG529CI(Path path, long color, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9606drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo9607drawPointsF8ZwMP8(List<Offset> points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.canvasDrawScope.mo9607drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo9608drawPointsGsft0Ws(List<Offset> points, int pointMode, Brush brush, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.canvasDrawScope.mo9608drawPointsGsft0Ws(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo9609drawRectAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9609drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo9610drawRectnJ9OG0(long color, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9610drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo9611drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9611drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo9612drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo9612drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo9613getCenterF1C5BW0() {
        return this.canvasDrawScope.mo9613getCenterF1C5BW0();
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.p006ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo9614getSizeNHjbRc() {
        return this.canvasDrawScope.mo9614getSizeNHjbRc();
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas) {
        Intrinsics.checkNotNullParameter(drawModifierNode, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinatorM10677requireCoordinator64DMado = DelegatableNodeKt.m10677requireCoordinator64DMado(drawModifierNode, NodeKind.m10773constructorimpl(4));
        nodeCoordinatorM10677requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m10710drawx_KDEd0$ui_release(canvas, IntSizeKt.m11695toSizeozmzZPI(nodeCoordinatorM10677requireCoordinator64DMado.mo10589getSizeYbymL2g()), nodeCoordinatorM10677requireCoordinator64DMado, drawModifierNode);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo7199roundToPxR2X_6o(long j4) {
        return this.canvasDrawScope.mo7199roundToPxR2X_6o(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo7200roundToPx0680j_4(float f4) {
        return this.canvasDrawScope.mo7200roundToPx0680j_4(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo7201toDpGaN1DYA(long j4) {
        return this.canvasDrawScope.mo7201toDpGaN1DYA(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7202toDpu2uoSUM(float f4) {
        return this.canvasDrawScope.mo7202toDpu2uoSUM(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo7204toDpSizekrfVVM(long j4) {
        return this.canvasDrawScope.mo7204toDpSizekrfVVM(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo7205toPxR2X_6o(long j4) {
        return this.canvasDrawScope.mo7205toPxR2X_6o(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo7206toPx0680j_4(float f4) {
        return this.canvasDrawScope.mo7206toPx0680j_4(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo7207toSizeXkaWNTQ(long j4) {
        return this.canvasDrawScope.mo7207toSizeXkaWNTQ(j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo7208toSp0xMU5do(float f4) {
        return this.canvasDrawScope.mo7208toSp0xMU5do(f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7209toSpkPz2Gy4(float f4) {
        return this.canvasDrawScope.mo7209toSpkPz2Gy4(f4);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        Intrinsics.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7203toDpu2uoSUM(int i4) {
        return this.canvasDrawScope.mo7203toDpu2uoSUM(i4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7210toSpkPz2Gy4(int i4) {
        return this.canvasDrawScope.mo7210toSpkPz2Gy4(i4);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
