package androidx.compose.p011ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.RenderEffect;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawContextKt;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Ö\u00012\u00020\u0001:\u0002Ö\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010 J\u000f\u0010%\u001a\u00020\u0010H\u0001¢\u0006\u0004\b$\u0010 J\u0015\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J.\u00101\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\r\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020-ø\u0001\u0000¢\u0006\u0004\b/\u00100J$\u00104\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\r\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0010\u00106\u001a\u000205H\u0086@¢\u0006\u0004\b6\u00107J\"\u0010:\u001a\u00020\u00102\u0006\u0010+\u001a\u0002082\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u00103J\u000f\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010 J\u0013\u0010<\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0000H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00102\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010 J\u000f\u0010F\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010 J\u000f\u0010G\u001a\u00020\u0010H\u0002¢\u0006\u0004\bG\u0010 J\u000f\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0010H\u0002¢\u0006\u0004\bK\u0010 J0\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010L2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00028\u00000MH\u0082\b¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020PH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\bU\u0010 J\u000f\u0010V\u001a\u00020\u0010H\u0002¢\u0006\u0004\bV\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ZR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010[R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\\R'\u0010]\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R%\u0010_\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010e\u001a\u00020*8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010g\u001a\u00020,8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010h\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010nR\u0016\u0010p\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010dR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R$\u0010~\u001a\u00020b2\u0006\u0010}\u001a\u00020b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b~\u0010d\u001a\u0004\b~\u0010\u007fR5\u0010+\u001a\u0002082\u0007\u0010\u0080\u0001\u001a\u0002088\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b+\u0010f\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R5\u0010\r\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020\f8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b\r\u0010f\u001a\u0006\b\u0085\u0001\u0010\u0082\u0001\"\u0006\b\u0086\u0001\u0010\u0084\u0001R7\u0010\u0087\u0001\u001a\u00020*2\u0007\u0010\u0080\u0001\u001a\u00020*8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0087\u0001\u0010f\u001a\u0006\b\u0088\u0001\u0010\u0082\u0001\"\u0006\b\u0089\u0001\u0010\u0084\u0001R7\u0010\u008a\u0001\u001a\u00020b2\u0007\u0010\u0080\u0001\u001a\u00020b8F@FX\u0086\u000e¢\u0006\u001d\n\u0005\b\u008a\u0001\u0010d\u0012\u0005\b\u008e\u0001\u0010 \u001a\u0005\b\u008b\u0001\u0010\u007f\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R2\u0010\u0096\u0001\u001a\u00030\u0091\u00012\b\u0010\u0080\u0001\u001a\u00030\u0091\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009b\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R2\u0010\u009f\u0001\u001a\u00030\u009c\u00012\b\u0010\u0080\u0001\u001a\u00030\u009c\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010\u0093\u0001\"\u0006\b\u009e\u0001\u0010\u0095\u0001R0\u0010¥\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010 \u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010¨\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¦\u0001\u0010\u0098\u0001\"\u0006\b§\u0001\u0010\u009a\u0001R*\u0010«\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b©\u0001\u0010\u0098\u0001\"\u0006\bª\u0001\u0010\u009a\u0001R*\u0010®\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¬\u0001\u0010\u0098\u0001\"\u0006\b\u00ad\u0001\u0010\u009a\u0001R*\u0010±\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¯\u0001\u0010\u0098\u0001\"\u0006\b°\u0001\u0010\u009a\u0001R*\u0010´\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b²\u0001\u0010\u0098\u0001\"\u0006\b³\u0001\u0010\u009a\u0001R*\u0010·\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010\u0098\u0001\"\u0006\b¶\u0001\u0010\u009a\u0001R*\u0010º\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¸\u0001\u0010\u0098\u0001\"\u0006\b¹\u0001\u0010\u009a\u0001R*\u0010½\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b»\u0001\u0010\u0098\u0001\"\u0006\b¼\u0001\u0010\u009a\u0001R*\u0010À\u0001\u001a\u00020-2\u0007\u0010\u0080\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¾\u0001\u0010\u0098\u0001\"\u0006\b¿\u0001\u0010\u009a\u0001R0\u0010Æ\u0001\u001a\u0005\u0018\u00010Á\u00012\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010Á\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u0015\u0010É\u0001\u001a\u00030Ç\u00018F¢\u0006\b\u001a\u0006\bÈ\u0001\u0010\u0082\u0001R\u0015\u0010Ë\u0001\u001a\u00030Ç\u00018F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010\u0082\u0001R\u0014\u0010Î\u0001\u001a\u00020j8F¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R2\u0010Ò\u0001\u001a\u00030Ï\u00012\b\u0010\u0080\u0001\u001a\u00030Ï\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010\u0082\u0001\"\u0006\bÑ\u0001\u0010\u0084\u0001R2\u0010Õ\u0001\u001a\u00030Ï\u00012\b\u0010\u0080\u0001\u001a\u00030Ï\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010\u0082\u0001\"\u0006\bÔ\u0001\u0010\u0084\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006×\u0001"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "Landroidx/compose/ui/graphics/layer/LayerManager;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLr6/c;)V", "record", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawForPersistence$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "drawForPersistence", "parentLayer", "draw$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "release$ui_graphics_release", "()V", "release", "discardDisplayList$ui_graphics_release", "discardDisplayList", "emulateTrimMemory$ui_graphics_release", "emulateTrimMemory", "Landroidx/compose/ui/graphics/Path;", "path", "setPathOutline", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "setRoundRectOutline", "setRectOutline-tz77jQw", "(JJ)V", "setRectOutline", "Landroidx/compose/ui/graphics/ImageBitmap;", "toImageBitmap", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntOffset;", "setPosition-VbeCjmY", "setPosition", "recordInternal", "drawWithChildTracking", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "graphicsLayer", "addSubLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "androidCanvas", "transformCanvas", "(Landroid/graphics/Canvas;)V", "recreateDisplayListIfNeeded", "onAddedToParentLayer", "onRemovedFromParentLayer", "Landroid/graphics/RectF;", "obtainPathBounds", "()Landroid/graphics/RectF;", "configureOutlineAndClip", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "resolveOutlinePosition", "(Lr6/e;)Ljava/lang/Object;", "Landroid/graphics/Outline;", "updatePathOutline", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "obtainAndroidOutline", "()Landroid/graphics/Outline;", "discardContentIfReleasedAndHaveNoParentLayerUsages", "resetOutlineParams", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/LayerManager;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "drawBlock", "Lr6/c;", "clipDrawBlock", "androidOutline", "Landroid/graphics/Outline;", "", "outlineDirty", "Z", "roundRectOutlineTopLeft", "J", "roundRectOutlineSize", "roundRectCornerRadius", "F", "Landroidx/compose/ui/graphics/Outline;", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "roundRectClipPath", "usePathForClip", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "softwareDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "", "parentLayerUsages", "I", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "<set-?>", "isReleased", "()Z", "value", "getTopLeft-nOcc-ac", "()J", "setTopLeft--gyyYBs", "(J)V", "getSize-YbymL2g", "setSize-ozmzZPI", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "clip", "getClip", "setClip", "(Z)V", "getClip$annotations", "pathBounds", "Landroid/graphics/RectF;", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getShadowElevation", "setShadowElevation", "shadowElevation", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "", "getLayerId", "layerId", "getOwnerViewId", "ownerViewId", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 10 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,1018:1\n640#1,6:1109\n646#1,3:1116\n644#1,7:1119\n640#1,6:1190\n646#1,3:1197\n644#1,7:1200\n153#2:1019\n153#2:1115\n153#2:1150\n153#2:1196\n44#3,6:1020\n50#3,14:1027\n64#3,4:1066\n104#3,6:1156\n110#3,3:1187\n1#4:1026\n1#4:1074\n231#5,3:1041\n200#5,7:1044\n211#5,3:1052\n214#5,9:1056\n234#5:1065\n231#5,3:1162\n200#5,7:1165\n211#5,3:1173\n214#5,9:1177\n234#5:1186\n1399#6:1051\n1270#6:1055\n1399#6:1172\n1270#6:1176\n54#7:1070\n59#7:1072\n85#8:1071\n90#8:1073\n80#8:1108\n60#8:1127\n70#8:1134\n60#8:1141\n70#8:1146\n60#8:1208\n70#8:1211\n60#8:1214\n70#8:1217\n53#8,3:1220\n305#9,26:1075\n36#10,5:1101\n36#10,5:1151\n26#11:1106\n22#11,5:1128\n22#11,5:1135\n22#11:1142\n26#11:1144\n22#11:1147\n26#11:1149\n22#11:1209\n22#11:1212\n22#11:1215\n22#11:1218\n30#12:1107\n65#13:1126\n69#13:1133\n65#13:1140\n69#13:1145\n65#13:1207\n69#13:1210\n57#14:1143\n61#14:1148\n57#14:1213\n61#14:1216\n33#15:1219\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n620#1:1109,6\n620#1:1116,3\n620#1:1119,7\n746#1:1190,6\n746#1:1197,3\n746#1:1200,7\n153#1:1019\n620#1:1115\n645#1:1150\n746#1:1196\n440#1:1020,6\n440#1:1027,14\n440#1:1066,4\n710#1:1156,6\n710#1:1187,3\n440#1:1026\n440#1:1041,3\n440#1:1044,7\n440#1:1052,3\n440#1:1056,9\n440#1:1065\n710#1:1162,3\n710#1:1165,7\n710#1:1173,3\n710#1:1177,9\n710#1:1186\n440#1:1051\n440#1:1055\n710#1:1172\n710#1:1176\n456#1:1070\n457#1:1072\n456#1:1071\n457#1:1073\n605#1:1108\n622#1:1127\n623#1:1134\n625#1:1141\n627#1:1146\n747#1:1208\n748#1:1211\n749#1:1214\n750#1:1217\n754#1:1220,3\n558#1:1075,26\n600#1:1101,5\n663#1:1151,5\n605#1:1106\n622#1:1128,5\n623#1:1135,5\n625#1:1142\n625#1:1144\n627#1:1147\n627#1:1149\n747#1:1209\n748#1:1212\n749#1:1215\n750#1:1218\n605#1:1107\n622#1:1126\n623#1:1133\n625#1:1140\n627#1:1145\n747#1:1207\n748#1:1210\n625#1:1143\n627#1:1148\n749#1:1213\n750#1:1216\n754#1:1219\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsLayer {

    @NotNull
    private static final LayerSnapshotImpl SnapshotImpl;

    @Nullable
    private Outline androidOutline;

    @NotNull
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;

    @NotNull
    private final GraphicsLayerImpl impl;

    @Nullable
    private androidx.compose.p011ui.graphics.Outline internalOutline;
    private boolean isReleased;

    @Nullable
    private final LayerManager layerManager;

    @Nullable
    private Path outlinePath;
    private int parentLayerUsages;

    @Nullable
    private RectF pathBounds;
    private long pivotOffset;

    @Nullable
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;

    @Nullable
    private CanvasDrawScope softwareDrawScope;

    @Nullable
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;

    @NotNull
    private Density density = DrawContextKt.getDefaultDensity();

    @NotNull
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @NotNull
    private InterfaceC6471c drawBlock = new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void invoke(DrawScope drawScope) {
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C5443s.f8405a;
        }
    };

    @NotNull
    private final InterfaceC6471c clipDrawBlock = new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C5443s.f8405a;
        }

        public final void invoke(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iM10671getIntersectrtfAjoo = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo11156clipPathmtrdDE(path, iM10671getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
            }
        }
    };
    private boolean outlineDirty = true;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.ui.graphics.layer.GraphicsLayer", m5303f = "AndroidGraphicsLayer.android.kt", m5304i = {}, m5305l = {878}, m5306m = "toImageBitmap", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 */
    public static final class C21201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21201(InterfaceC5631c<? super C21201> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    static {
        SnapshotImpl = LayerManager.INSTANCE.isRobolectric() ? LayerSnapshotV21.INSTANCE : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.INSTANCE : SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable() ? LayerSnapshotV22.INSTANCE : LayerSnapshotV21.INSTANCE;
    }

    public GraphicsLayer(@NotNull GraphicsLayerImpl graphicsLayerImpl, @Nullable LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        Offset.Companion companion = Offset.INSTANCE;
        this.roundRectOutlineTopLeft = companion.m10457getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.INSTANCE.m13444getZeronOccac();
        this.size = IntSize.INSTANCE.m13481getZeroYbymL2g();
        this.pivotOffset = companion.m10456getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                    Outline outlineUpdatePathOutline = updatePathOutline(path);
                    if (outlineUpdatePathOutline != null) {
                        outlineUpdatePathOutline.setAlpha(getAlpha());
                        outline = outlineUpdatePathOutline;
                    }
                    this.impl.mo11344setOutlineO0kMr_c(outline, IntSize.m13471constructorimpl((4294967295L & Math.round(rectFObtainPathBounds.height())) | (Math.round(rectFObtainPathBounds.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.INSTANCE.m10519getZeroNHjbRc();
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(this.size);
                    long j7 = this.roundRectOutlineTopLeft;
                    long j8 = this.roundRectOutlineSize;
                    long j9 = j8 == InlineClassHelperKt.UnspecifiedPackedFloats ? jM13488toSizeozmzZPI : j8;
                    int i = (int) (j7 >> 32);
                    int i8 = (int) (j7 & 4294967295L);
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat(i8)), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo11344setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m13484roundToIntSizeuvyYCjk(j9));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo11344setOutlineO0kMr_c(null, IntSize.INSTANCE.m13481getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawWithChildTracking(androidx.compose.p011ui.graphics.drawscope.DrawScope r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r14.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependency$p(r0, r1)
            androidx.collection.MutableScatterSet r1 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto L28
            androidx.collection.MutableScatterSet r2 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r2 != 0) goto L22
            androidx.collection.MutableScatterSet r2 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(r0, r2)
        L22:
            r2.addAll(r1)
            r1.clear()
        L28:
            r1 = 1
            androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r1)
            r6.c r1 = r14.drawBlock
            r1.invoke(r15)
            r15 = 0
            androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r15)
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependency$p(r0)
            if (r1 == 0) goto L3e
            r1.onRemovedFromParentLayer()
        L3e:
            androidx.collection.MutableScatterSet r0 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.isNotEmpty()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.GraphicsLayer r10 = (androidx.compose.p011ui.graphics.layer.GraphicsLayer) r10
            r10.onRemovedFromParentLayer()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.clear()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.GraphicsLayer.drawWithChildTracking(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.INSTANCE.m10457getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(InterfaceC6473e block) {
        long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(this.size);
        long j7 = this.roundRectOutlineTopLeft;
        long j8 = this.roundRectOutlineSize;
        if (j8 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM13488toSizeozmzZPI = j8;
        }
        return (T) block.invoke(Offset.m10430boximpl(j7), Size.m10498boximpl(jM13488toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m11316setPositionVbeCjmY(long topLeft, long size) {
        this.impl.mo11346setPositionH0pRuoY(IntOffset.m13433getXimpl(topLeft), IntOffset.m13434getYimpl(topLeft), size);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m11317setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j7, long j8, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        if ((i & 2) != 0) {
            j8 = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
        }
        graphicsLayer.m11332setRectOutlinetz77jQw(j7, j8);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m11318setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j7, long j8, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        long j9 = j7;
        if ((i & 2) != 0) {
            j8 = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
        }
        long j10 = j8;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        graphicsLayer.m11333setRoundRectOutlineTNW_H78(j9, j10, f);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m11319setSizeozmzZPI(long j7) {
        if (IntSize.m13474equalsimpl0(this.size, j7)) {
            return;
        }
        this.size = j7;
        m11316setPositionVbeCjmY(this.topLeft, j7);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas androidCanvas) {
        Canvas canvas;
        float fM13433getXimpl = IntOffset.m13433getXimpl(this.topLeft);
        float fM13434getYimpl = IntOffset.m13434getYimpl(this.topLeft);
        float fM13433getXimpl2 = IntOffset.m13433getXimpl(this.topLeft) + ((int) (this.size >> 32));
        float fM13434getYimpl2 = IntOffset.m13434getYimpl(this.topLeft) + ((int) (this.size & 4294967295L));
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM11321getBlendMode0nO6VwU = m11321getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m10593equalsimpl0(iM11321getBlendMode0nO6VwU, BlendMode.INSTANCE.m10624getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m11309equalsimpl0(m11322getCompositingStrategyke2Ky5w(), CompositingStrategy.INSTANCE.m11315getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo10560setBlendModes9anfk8(iM11321getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas = androidCanvas;
            canvas.saveLayer(fM13433getXimpl, fM13434getYimpl, fM13433getXimpl2, fM13434getYimpl2, Paint.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fM13433getXimpl, fM13434getYimpl);
        canvas.concat(this.impl.calculateMatrix());
    }

    private final Outline updatePathOutline(Path path) {
        Outline outline;
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || path.isConvex()) {
            Outline outlineObtainAndroidOutline = obtainAndroidOutline();
            if (i >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
            outline = outlineObtainAndroidOutline;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void discardDisplayList$ui_graphics_release() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r15.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            if (r1 == 0) goto Lf
            r1.onRemovedFromParentLayer()
            r1 = 0
            androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$setDependency$p(r0, r1)
        Lf:
            androidx.collection.MutableScatterSet r0 = androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.p011ui.graphics.layer.GraphicsLayer) r11
            r11.onRemovedFromParentLayer()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.clear()
        L5d:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r15.impl
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.GraphicsLayer.discardDisplayList$ui_graphics_release():void");
    }

    public final void draw$ui_graphics_release(@NotNull androidx.compose.p011ui.graphics.Canvas canvas, @Nullable GraphicsLayer parentLayer) {
        boolean z8;
        boolean z9;
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z10 = getShadowElevation() > 0.0f;
        if (z10) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z11 = !zIsHardwareAccelerated && this.clip;
        if (z11) {
            canvas.save();
            androidx.compose.p011ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.p011ui.graphics.Canvas.m10655clipRectmtrdDE$default(canvas, outline.getRect(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.p011ui.graphics.Canvas.m10653clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.p011ui.graphics.Canvas.m10653clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z8 = z10;
            z9 = z11;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.p011ui.graphics.Canvas canvas2 = canvasDrawScope2.getDrawContext().getCanvas();
            long jMo11154getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo11154getSizeNHjbRc();
            z8 = z10;
            GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z9 = z11;
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo11155setSizeuvyYCjk(jM13488toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
            }
        }
        if (z9) {
            canvas.restore();
        }
        if (z8) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics_release(@NotNull androidx.compose.p011ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    @TestOnly
    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m11320getAmbientShadowColor0d7_KjU() {
        return this.impl.getAmbientShadowColor();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m11321getBlendMode0nO6VwU() {
        return this.impl.getBlendMode();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.clip;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m11322getCompositingStrategyke2Ky5w() {
        return this.impl.getCompositingStrategy();
    }

    @NotNull
    /* renamed from: getImpl$ui_graphics_release, reason: from getter */
    public final GraphicsLayerImpl getImpl() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    @NotNull
    public final androidx.compose.p011ui.graphics.Outline getOutline() {
        androidx.compose.p011ui.graphics.Outline rectangle;
        androidx.compose.p011ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(this.size);
        long j7 = this.roundRectOutlineTopLeft;
        long j8 = this.roundRectOutlineSize;
        if (j8 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM13488toSizeozmzZPI = j8;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM13488toSizeozmzZPI >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM13488toSizeozmzZPI & 4294967295L)) + fIntBitsToFloat2;
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m10495RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m11325getSpotShadowColor0d7_KjU() {
        return this.impl.getSpotShadowColor();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m11327recordmLhObY(@NotNull Density density, @NotNull LayoutDirection layoutDirection, long size, @NotNull InterfaceC6471c block) {
        m11319setSizeozmzZPI(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.setAlpha(f);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m11328setAmbientShadowColor8_81llA(long j7) {
        if (Color.m10683equalsimpl0(j7, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.mo11341setAmbientShadowColor8_81llA(j7);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m11329setBlendModes9anfk8(int i) {
        if (BlendMode.m10593equalsimpl0(this.impl.getBlendMode(), i)) {
            return;
        }
        this.impl.mo11342setBlendModes9anfk8(i);
    }

    public final void setCameraDistance(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.setCameraDistance(f);
    }

    public final void setClip(boolean z8) {
        if (this.clip != z8) {
            this.clip = z8;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (AbstractC5830k.m5325b(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m11330setCompositingStrategyWpw9cng(int i) {
        if (CompositingStrategy.m11309equalsimpl0(this.impl.getCompositingStrategy(), i)) {
            return;
        }
        this.impl.mo11343setCompositingStrategyWpw9cng(i);
    }

    public final void setPathOutline(@NotNull Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m11331setPivotOffsetk4lQ0M(long j7) {
        if (Offset.m10438equalsimpl0(this.pivotOffset, j7)) {
            return;
        }
        this.pivotOffset = j7;
        this.impl.mo11345setPivotOffsetk4lQ0M(j7);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m11332setRectOutlinetz77jQw(long topLeft, long size) {
        m11333setRoundRectOutlineTNW_H78(topLeft, size, 0.0f);
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect) {
        if (AbstractC5830k.m5325b(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.setRotationX(f);
    }

    public final void setRotationY(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.setRotationY(f);
    }

    public final void setRotationZ(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.setRotationZ(f);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m11333setRoundRectOutlineTNW_H78(long topLeft, long size, float cornerRadius) {
        if (Offset.m10438equalsimpl0(this.roundRectOutlineTopLeft, topLeft) && Size.m10506equalsimpl0(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.setScaleX(f);
    }

    public final void setScaleY(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.setScaleY(f);
    }

    public final void setShadowElevation(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.setShadowElevation(f);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m11334setSpotShadowColor8_81llA(long j7) {
        if (Color.m10683equalsimpl0(j7, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.mo11347setSpotShadowColor8_81llA(j7);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m11335setTopLeftgyyYBs(long j7) {
        if (IntOffset.m13432equalsimpl0(this.topLeft, j7)) {
            return;
        }
        this.topLeft = j7;
        m11316setPositionVbeCjmY(j7, this.size);
    }

    public final void setTranslationX(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    public final void setTranslationY(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageBitmap(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.p011ui.graphics.ImageBitmap> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.p011ui.graphics.layer.GraphicsLayer.C21201
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.p011ui.graphics.layer.GraphicsLayer.C21201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.AbstractC5774b.m5119b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.AbstractC5774b.m5119b(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = androidx.compose.p011ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r0.label = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.GraphicsLayer.toImageBitmap(h6.c):java.lang.Object");
    }
}
