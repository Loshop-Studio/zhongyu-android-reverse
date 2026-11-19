package androidx.compose.p006ui.node;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.MutableRect;
import androidx.compose.p006ui.geometry.MutableRectKt;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.GraphicsLayerScope;
import androidx.compose.p006ui.graphics.Matrix;
import androidx.compose.p006ui.graphics.Paint;
import androidx.compose.p006ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p006ui.layout.AlignmentLine;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.p006ui.layout.LookaheadScope;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.semantics.SemanticsConfiguration;
import androidx.compose.p006ui.semantics.SemanticsNodeKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b#\b \u0018\u0000 \u0092\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004\u0092\u0002\u0093\u0002B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u0084\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020 H\u0002J,\u0010\u0084\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J \u0010\u008c\u0001\u001a\u00020O2\u0006\u0010N\u001a\u00020OH\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0013\u0010\u008f\u0001\u001a\u00020D2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H&J*\u0010\u0092\u0001\u001a\u00020\u001a2\b\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u0006\u0010N\u001a\u00020OH\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0010\u0010\u0096\u0001\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u0006J\u001c\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u00062\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0004J\u0012\u0010\u009b\u0001\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u0006H\u0002J\u0018\u0010\u009c\u0001\u001a\u00020\u00002\u0007\u0010\u009d\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u009e\u0001J\"\u0010\u009f\u0001\u001a\u00030\u0088\u00012\u0007\u0010`\u001a\u00030\u0088\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010\u008e\u0001J\u001b\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020 H\u0002J$\u0010£\u0001\u001a\u00020 2\f\u0010¤\u0001\u001a\u0007\u0012\u0002\b\u00030¥\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J6\u0010¨\u0001\u001a\u0005\u0018\u0001H©\u0001\"\u0007\b\u0000\u0010©\u0001\u0018\u00012\u000f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010¥\u0001H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010u2\u0007\u0010\u00ad\u0001\u001a\u00020 H\u0002J1\u0010®\u0001\u001a\u0005\u0018\u0001H©\u0001\"\u0005\b\u0000\u0010©\u00012\u000f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010¥\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010«\u0001J`\u0010°\u0001\u001a\u00020\u0007\"\n\b\u0000\u0010©\u0001*\u00030±\u00012\u000f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010³\u00012\b\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010µ\u00012\u0007\u0010¶\u0001\u001a\u00020 2\u0007\u0010·\u0001\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¸\u0001\u0010¹\u0001Jb\u0010º\u0001\u001a\u00020\u0007\"\n\b\u0000\u0010©\u0001*\u00030±\u00012\u000f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010³\u00012\b\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010µ\u00012\u0007\u0010¶\u0001\u001a\u00020 2\u0007\u0010·\u0001\u001a\u00020 H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b»\u0001\u0010¹\u0001J\t\u0010¼\u0001\u001a\u00020\u0007H\u0016J\u0013\u0010½\u0001\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u0006H\u0096\u0002J\"\u0010¾\u0001\u001a\u00020 2\b\u0010\u0093\u0001\u001a\u00030\u0088\u0001H\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0007\u0010Á\u0001\u001a\u00020 J\u001c\u0010Â\u0001\u001a\u00030Ã\u00012\u0007\u0010Ä\u0001\u001a\u00020\u00032\u0007\u0010\u0087\u0001\u001a\u00020 H\u0016J,\u0010Å\u0001\u001a\u00030\u0088\u00012\u0007\u0010Ä\u0001\u001a\u00020\u00032\b\u0010Æ\u0001\u001a\u00030\u0088\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÇ\u0001\u0010È\u0001J#\u0010É\u0001\u001a\u00030\u0088\u00012\b\u0010Ê\u0001\u001a\u00030\u0088\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010\u008e\u0001J#\u0010Ì\u0001\u001a\u00030\u0088\u00012\b\u0010Ê\u0001\u001a\u00030\u0088\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÍ\u0001\u0010\u008e\u0001J#\u0010Î\u0001\u001a\u00030\u0088\u00012\b\u0010\u0093\u0001\u001a\u00030\u0088\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÏ\u0001\u0010\u008e\u0001J/\u0010Ð\u0001\u001a\u00020\u00072\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\t\b\u0002\u0010Ñ\u0001\u001a\u00020 H\u0002J\t\u0010Ò\u0001\u001a\u00020\u0007H\u0016J\u0007\u0010Ó\u0001\u001a\u00020\u0007J\u001b\u0010Ô\u0001\u001a\u00020\u00072\u0007\u0010Õ\u0001\u001a\u00020T2\u0007\u0010Ö\u0001\u001a\u00020TH\u0014J\u0007\u0010×\u0001\u001a\u00020\u0007J\u0007\u0010Ø\u0001\u001a\u00020\u0007J\u0007\u0010Ù\u0001\u001a\u00020\u0007J\u0012\u0010Ú\u0001\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u0006H\u0016J6\u0010Û\u0001\u001a\u00030Ü\u00012\u0007\u0010Ý\u0001\u001a\u00020-2\u000e\u0010Þ\u0001\u001a\t\u0012\u0005\u0012\u00030Ü\u00010$H\u0084\bø\u0001\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bß\u0001\u0010à\u0001JD\u0010á\u0001\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_2\u0007\u0010\u0080\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001d\u0010ä\u0001\u001a\u00020\u00072\b\u0010\u0086\u0001\u001a\u00030Ã\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010å\u0001J,\u0010æ\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020 2\t\b\u0002\u0010ç\u0001\u001a\u00020 H\u0000¢\u0006\u0003\bè\u0001J\u000f\u0010é\u0001\u001a\u00020\u0007H\u0010¢\u0006\u0003\bê\u0001J\u0007\u0010ë\u0001\u001a\u00020 J\"\u0010ì\u0001\u001a\u00030\u0088\u00012\u0007\u0010`\u001a\u00030\u0088\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bí\u0001\u0010\u008e\u0001J\b\u0010î\u0001\u001a\u00030Ã\u0001J+\u0010ï\u0001\u001a\u00020\u00072\u0007\u0010Ä\u0001\u001a\u00020\u00032\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bò\u0001\u0010ó\u0001J+\u0010ô\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bõ\u0001\u0010ö\u0001J+\u0010÷\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ö\u0001J-\u0010ù\u0001\u001a\u00020\u00072\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\t\b\u0002\u0010Ñ\u0001\u001a\u00020 J\t\u0010ú\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010û\u0001\u001a\u00020\u00072\u0006\u0010E\u001a\u00020DH\u0004J\u001b\u0010ü\u0001\u001a\u00020\u00072\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0000¢\u0006\u0003\bý\u0001JL\u0010þ\u0001\u001a\u00020\u0007\"\u0007\b\u0000\u0010©\u0001\u0018\u00012\u000f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010¥\u00012\u0014\u0010Þ\u0001\u001a\u000f\u0012\u0005\u0012\u0003H©\u0001\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J4\u0010þ\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0002\u001a\u00020T2\u0007\u0010\u00ad\u0001\u001a\u00020 2\u0013\u0010Þ\u0001\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0003J#\u0010\u0082\u0002\u001a\u00030\u0088\u00012\b\u0010\u0083\u0002\u001a\u00030\u0088\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u008e\u0001J+\u0010\u0085\u0002\u001a\u00020\u00072\u0007\u0010\u0097\u0001\u001a\u00020\u00062\u0013\u0010Þ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0003J\"\u0010\u0086\u0002\u001a\u00020 2\b\u0010\u0093\u0001\u001a\u00030\u0088\u0001H\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0002\u0010À\u0001Ji\u0010\u0088\u0002\u001a\u00020\u0007\"\n\b\u0000\u0010©\u0001*\u00030±\u0001*\u0005\u0018\u0001H©\u00012\u000f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010³\u00012\b\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010µ\u00012\u0007\u0010¶\u0001\u001a\u00020 2\u0007\u0010·\u0001\u001a\u00020 H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002Jr\u0010\u008b\u0002\u001a\u00020\u0007\"\n\b\u0000\u0010©\u0001*\u00030±\u0001*\u0005\u0018\u0001H©\u00012\u000f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010³\u00012\b\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010µ\u00012\u0007\u0010¶\u0001\u001a\u00020 2\u0007\u0010·\u0001\u001a\u00020 2\u0007\u0010\u008c\u0002\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002Jr\u0010\u008f\u0002\u001a\u00020\u0007\"\n\b\u0000\u0010©\u0001*\u00030±\u0001*\u0005\u0018\u0001H©\u00012\u000f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010³\u00012\b\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u0003H©\u00010µ\u00012\u0007\u0010¶\u0001\u001a\u00020 2\u0007\u0010·\u0001\u001a\u00020 2\u0007\u0010\u008c\u0002\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0090\u0002\u0010\u008e\u0002J\r\u0010\u0091\u0002\u001a\u00020\u0000*\u00020\u0003H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u000e\u0010(\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020 @BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001d\u0010,\u001a\u00020-8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103RD\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\u0019\u0010)\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\"\u0010E\u001a\u0004\u0018\u00010D2\b\u0010)\u001a\u0004\u0018\u00010D@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR$\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020\f8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020O8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u0010/R\u001c\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020T\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010U\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0015R\u0013\u0010W\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bX\u0010\u0018R\u0016\u0010Y\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010]\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b^\u0010\u0018R/\u0010`\u001a\u00020_2\u0006\u0010)\u001a\u00020_@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\ba\u0010/\"\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020S0f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u000e\u0010l\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010m\u001a\u00020n8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bo\u0010/R\u0014\u0010p\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0012\u0010t\u001a\u00020uX¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001c\u0010x\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001c\u0010}\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R(\u0010\u0080\u0001\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a@DX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u001c\"\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u0094\u0002"}, m5175d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isValidOwnerScope", "lastLayerAlpha", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "lastMeasurementConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui_release", "()J", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadDelegate;", "value", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "oldAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "parent", "getParent", "parentCoordinates", "getParentCoordinates", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "released", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "zIndex", "getZIndex", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "(J)J", "createLookaheadDelegate", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "distanceInMinimumTouchTarget", "pointerPosition", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "draw", "canvas", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawContainedDrawModifiers", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "fromParentPosition", "fromParentPosition-MK-Hz9U", "fromParentRect", "bounds", "hasNode", "type", "Landroidx/compose/ui/node/NodeKind;", "hasNode-H91voCI", "(I)Z", "head", ExifInterface.GPS_DIRECTION_TRUE, "head-H91voCI", "(I)Ljava/lang/Object;", "headNode", "includeTail", "headUnchecked", "headUnchecked-H91voCI", "hitTest", "Landroidx/compose/ui/node/DelegatableNode;", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "hitTestChild-YqVAtuI", "invalidateLayer", "invoke", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "isTransparent", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "onLayerBlockUpdated", "forceLayerInvalidated", "onLayoutModifierNodeChanged", "onLayoutNodeAttach", "onMeasureResultChanged", "width", "height", "onMeasured", "onPlaced", "onRelease", "performDraw", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "block", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rectInParent", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "replace", "replace$ui_release", "shouldSharePointerInputWithSiblings", "toParentPosition", "toParentPosition-MK-Hz9U", "touchBoundsInRoot", "transformFrom", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFromAncestor", "transformFromAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformToAncestor-EL8BTi8", "updateLayerBlock", "updateLayerParameters", "updateLookaheadDelegate", "updateLookaheadScope", "updateLookaheadScope$ui_release", "visitNodes", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "mask", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "hit", "hit-1hIXUjU", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitNear", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "speculativeHit", "speculativeHit-JHbHoSQ", "toCoordinator", "Companion", "HitTestSource", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1354:1\n100#1,9:1355\n100#1,9:1364\n100#1,9:1373\n111#1:1384\n100#1,15:1385\n111#1:1418\n100#1,15:1419\n121#1:1437\n100#1,9:1438\n122#1:1447\n111#1:1449\n100#1,15:1450\n111#1:1466\n100#1,15:1467\n1#2:1382\n71#3:1383\n79#3:1400\n79#3:1404\n81#3:1409\n81#3:1417\n71#3:1436\n81#3:1448\n81#3:1465\n69#3:1482\n69#3:1483\n75#3:1493\n75#3:1494\n666#4,3:1401\n669#4,3:1406\n196#5:1405\n480#6,4:1410\n485#6:1435\n122#7,3:1414\n126#7:1434\n276#8,9:1484\n290#8:1495\n262#8,7:1496\n291#8,2:1503\n270#8,3:1505\n66#9,5:1508\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n111#1:1355,9\n121#1:1364,9\n126#1:1373,9\n247#1:1384\n247#1:1385,15\n315#1:1418\n315#1:1419,15\n365#1:1437\n365#1:1438,9\n365#1:1447\n382#1:1449\n382#1:1450,15\n386#1:1466\n386#1:1467,15\n247#1:1383\n262#1:1400\n266#1:1404\n313#1:1409\n315#1:1417\n365#1:1436\n382#1:1448\n386#1:1465\n686#1:1482\n1075#1:1483\n1107#1:1493\n1108#1:1494\n264#1:1401,3\n264#1:1406,3\n266#1:1405\n314#1:1410,4\n314#1:1435\n314#1:1414,3\n314#1:1434\n1075#1:1484,9\n1108#1:1495\n1108#1:1496,7\n1108#1:1503,2\n1108#1:1505,3\n1150#1:1508,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private final Function0<Unit> invalidateParentLayer;
    private boolean isClipping;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private Density layerDensity;
    private LayoutDirection layerLayoutDirection;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private LookaheadDelegate lookaheadDelegate;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            if (coordinator.isValidOwnerScope()) {
                LayerPositionalProperties layerPositionalProperties = coordinator.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    coordinator.updateLayerParameters();
                    return;
                }
                NodeCoordinator.tmpLayerPositionalProperties.copyFrom(layerPositionalProperties);
                coordinator.updateLayerParameters();
                if (NodeCoordinator.tmpLayerPositionalProperties.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = coordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    };
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            OwnedLayer layer = coordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m9383constructorimpl$default(null, 1, null);
    private static final HitTestSource<PointerInputModifierNode> PointerInputSource = new HitTestSource<PointerInputModifierNode>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo10768childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult<PointerInputModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m10700hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo10769entityTypeOLwlOKw() {
            return NodeKind.m10773constructorimpl(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(PointerInputModifierNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return node.interceptOutOfBoundsChildEvents();
        }
    };
    private static final HitTestSource<SemanticsModifierNode> SemanticsSource = new HitTestSource<SemanticsModifierNode>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo10768childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult<SemanticsModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m10701hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo10769entityTypeOLwlOKw() {
            return NodeKind.m10773constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(SemanticsModifierNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(parentLayoutNode);
            boolean z3 = false;
            if (outerSemantics != null && (semanticsConfigurationCollapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) != null && semanticsConfigurationCollapsedSemanticsConfiguration.getIsClearingSemantics()) {
                z3 = true;
            }
            return !z3;
        }
    };

    @Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\u00020\u0019X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m5175d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInputSource$annotations", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPointerInputSource$annotations() {
        }

        public final HitTestSource<PointerInputModifierNode> getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource<SemanticsModifierNode> getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    @Metadata(m5174d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003JC\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H&ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m5175d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "N", "Landroidx/compose/ui/node/DelegatableNode;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface HitTestSource<N extends DelegatableNode> {
        /* renamed from: childHitTest-YqVAtuI */
        void mo10768childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult<N> hitTestResult, boolean isTouchEvent, boolean isInLayer);

        /* renamed from: entityType-OLwlOKw */
        int mo10769entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(N node);

        boolean shouldHitTestChildren(LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.INSTANCE.m11653getZeronOccac();
        this.invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
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
                NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.invalidateLayer();
                }
            }
        };
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

    /* renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m10746ancestorToLocalR5De75A(NodeCoordinator ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.areEqual(ancestor, nodeCoordinator)) ? m10755fromParentPositionMKHz9U(offset) : m10755fromParentPositionMKHz9U(nodeCoordinator.m10746ancestorToLocalR5De75A(ancestor, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(4);
        boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(iM10773constructorimpl);
        Modifier.Node tail = getTail();
        if (zM10781getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            Modifier.Node nodeHeadNode = headNode(zM10781getIncludeSelfInTraversalH91voCI);
            while (true) {
                if (nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
                    if ((nodeHeadNode.getKindSet() & iM10773constructorimpl) == 0) {
                        if (nodeHeadNode == tail) {
                            break;
                        } else {
                            nodeHeadNode = nodeHeadNode.getChild();
                        }
                    } else {
                        drawModifierNode = nodeHeadNode instanceof DrawModifierNode ? nodeHeadNode : null;
                    }
                } else {
                    break;
                }
            }
        }
        DrawModifierNode drawModifierNode = drawModifierNode;
        if (drawModifierNode == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m10710drawx_KDEd0$ui_release(canvas, IntSizeKt.m11695toSizeozmzZPI(mo10589getSizeYbymL2g()), this, drawModifierNode);
        }
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float fM11643getXimpl = IntOffset.m11643getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - fM11643getXimpl);
        bounds.setRight(bounds.getRight() - fM11643getXimpl);
        float fM11644getYimpl = IntOffset.m11644getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - fM11644getYimpl);
        bounds.setBottom(bounds.getBottom() - fM11644getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, IntSize.m11685getWidthimpl(mo10589getSizeYbymL2g()), IntSize.m11684getHeightimpl(mo10589getSizeYbymL2g()));
                bounds.isEmpty();
            }
        }
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hit-1hIXUjU, reason: not valid java name */
    public final <T extends DelegatableNode> void m10747hit1hIXUjU(final T t3, final HitTestSource<T> hitTestSource, final long j4, final HitTestResult<T> hitTestResult, final boolean z3, final boolean z4) {
        if (t3 == null) {
            mo10695hitTestChildYqVAtuI(hitTestSource, j4, hitTestResult, z3, z4);
        } else {
            hitTestResult.hit(t3, z4, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZ)V */
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
                    this.this$0.m10747hit1hIXUjU((DelegatableNode) NodeCoordinatorKt.m10771nextUncheckedUntilhw7D004(t3, hitTestSource.mo10769entityTypeOLwlOKw(), NodeKind.m10773constructorimpl(2)), hitTestSource, j4, hitTestResult, z3, z4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final <T extends DelegatableNode> void m10748hitNearJHbHoSQ(final T t3, final HitTestSource<T> hitTestSource, final long j4, final HitTestResult<T> hitTestResult, final boolean z3, final boolean z4, final float f4) {
        if (t3 == null) {
            mo10695hitTestChildYqVAtuI(hitTestSource, j4, hitTestResult, z3, z4);
        } else {
            hitTestResult.hitInMinimumTouchTarget(t3, f4, z4, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZF)V */
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
                    this.this$0.m10748hitNearJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m10771nextUncheckedUntilhw7D004(t3, hitTestSource.mo10769entityTypeOLwlOKw(), NodeKind.m10773constructorimpl(2)), hitTestSource, j4, hitTestResult, z3, z4, f4);
                }
            });
        }
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m10749offsetFromEdgeMKHz9U(long pointerPosition) {
        float fM8945getXimpl = Offset.m8945getXimpl(pointerPosition);
        float fMax = Math.max(0.0f, fM8945getXimpl < 0.0f ? -fM8945getXimpl : fM8945getXimpl - getMeasuredWidth());
        float fM8946getYimpl = Offset.m8946getYimpl(pointerPosition);
        return OffsetKt.Offset(fMax, Math.max(0.0f, fM8946getYimpl < 0.0f ? -fM8946getYimpl : fM8946getYimpl - getMeasuredHeight()));
    }

    private final void onLayerBlockUpdated(Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceLayerInvalidated) {
        Owner owner;
        boolean z3 = (this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, getLayoutNode().getDensity()) && this.layerLayoutDirection == getLayoutNode().getLayoutDirection() && !forceLayerInvalidated) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        if (!isAttached() || layerBlock == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner = getLayoutNode().getOwner()) != null) {
                    owner.onLayoutChange(getLayoutNode());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z3) {
                updateLayerParameters();
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(this, this.invalidateParentLayer);
        ownedLayerCreateLayer.mo10818resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo10817movegyyYBs(getPosition());
        this.layer = ownedLayerCreateLayer;
        updateLayerParameters();
        getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public static /* synthetic */ void onLayerBlockUpdated$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        nodeCoordinator.onLayerBlockUpdated(function1, z3);
    }

    public static /* synthetic */ Object propagateRelocationRequest$suspendImpl(NodeCoordinator nodeCoordinator, Rect rect, Continuation<? super Unit> continuation) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        if (nodeCoordinator2 == null) {
            return Unit.INSTANCE;
        }
        Object objPropagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m8982translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m8980getTopLeftF1C5BW0()), continuation);
        return objPropagateRelocationRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPropagateRelocationRequest : Unit.INSTANCE;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z3, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z3, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final <T extends DelegatableNode> void m10750speculativeHitJHbHoSQ(final T t3, final HitTestSource<T> hitTestSource, final long j4, final HitTestResult<T> hitTestResult, final boolean z3, final boolean z4, final float f4) {
        if (t3 == null) {
            mo10695hitTestChildYqVAtuI(hitTestSource, j4, hitTestResult, z3, z4);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(t3)) {
            hitTestResult.speculativeHit(t3, f4, z4, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZF)V */
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
                    this.this$0.m10750speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m10771nextUncheckedUntilhw7D004(t3, hitTestSource.mo10769entityTypeOLwlOKw(), NodeKind.m10773constructorimpl(2)), hitTestSource, j4, hitTestResult, z3, z4, f4);
                }
            });
        } else {
            m10750speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m10771nextUncheckedUntilhw7D004(t3, hitTestSource.mo10769entityTypeOLwlOKw(), NodeKind.m10773constructorimpl(2)), hitTestSource, j4, hitTestResult, z3, z4, f4);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl != null && (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m10751transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.areEqual(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator);
        nodeCoordinator.m10751transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m11642equalsimpl0(getPosition(), IntOffset.INSTANCE.m11653getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m9392resetimpl(fArr);
            Matrix.m9403translateimpl$default(fArr, -IntOffset.m11643getXimpl(getPosition()), -IntOffset.m11644getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m9400timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo10814inverseTransform58bKbWc(matrix);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m10752transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.areEqual(nodeCoordinator, ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo10819transform58bKbWc(matrix);
            }
            if (!IntOffset.m11642equalsimpl0(nodeCoordinator.getPosition(), IntOffset.INSTANCE.m11653getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m9392resetimpl(fArr);
                Matrix.m9403translateimpl$default(fArr, IntOffset.m11643getXimpl(r1), IntOffset.m11644getYimpl(r1), 0.0f, 4, null);
                Matrix.m9400timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
            reusableGraphicsLayerScope.m9460setSizeuvyYCjk(IntSizeKt.m11695toSizeozmzZPI(mo10589getSizeYbymL2g()));
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
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
                    function1.invoke(NodeCoordinator.graphicsLayerScope);
                }
            });
            LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
            if (layerPositionalProperties == null) {
                layerPositionalProperties = new LayerPositionalProperties();
                this.layerPositionalProperties = layerPositionalProperties;
            }
            layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
            ownedLayer.mo10820updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.getAmbientShadowColor(), reusableGraphicsLayerScope.getSpotShadowColor(), reusableGraphicsLayerScope.getCompositingStrategy(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else {
            if (!(this.layerBlock == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m10753calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m9014getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m9011getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    public abstract LookaheadDelegate createLookaheadDelegate(LookaheadScope scope);

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m10754distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m9014getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m9011getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM10753calculateMinimumTouchTargetPaddingE7KxVPU = m10753calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fM9014getWidthimpl = Size.m9014getWidthimpl(jM10753calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM9011getHeightimpl = Size.m9011getHeightimpl(jM10753calculateMinimumTouchTargetPaddingE7KxVPU);
        long jM10749offsetFromEdgeMKHz9U = m10749offsetFromEdgeMKHz9U(pointerPosition);
        if ((fM9014getWidthimpl > 0.0f || fM9011getHeightimpl > 0.0f) && Offset.m8945getXimpl(jM10749offsetFromEdgeMKHz9U) <= fM9014getWidthimpl && Offset.m8946getYimpl(jM10749offsetFromEdgeMKHz9U) <= fM9011getHeightimpl) {
            return Offset.m8944getDistanceSquaredimpl(jM10749offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM11643getXimpl = IntOffset.m11643getXimpl(getPosition());
        float fM11644getYimpl = IntOffset.m11644getYimpl(getPosition());
        canvas.translate(fM11643getXimpl, fM11644getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-fM11643getXimpl, -fM11644getYimpl);
    }

    public final void drawBorder(Canvas canvas, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m11685getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m11684getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM10773constructorimpl = NodeKind.m10773constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            for (Modifier.Node parent = tail2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iM10773constructorimpl) != 0 && parent == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == other.getLayoutNode() ? other : layoutNode.getInnerCoordinator$ui_release();
    }

    /* renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m10755fromParentPositionMKHz9U(long position) {
        long jM11655minusNvtHpc = IntOffsetKt.m11655minusNvtHpc(position, getPosition());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo10816mapOffset8S9VItk(jM11655minusNvtHpc, true) : jM11655minusNvtHpc;
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    /* renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m10756getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.p006ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable, androidx.compose.p006ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getLookaheadDelegate$ui_release, reason: from getter */
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m10757getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo7207toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo10704getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object] */
    @Override // androidx.compose.p006ui.layout.Placeable, androidx.compose.p006ui.layout.Measured
    public Object getParentData() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Modifier.Node tail = getTail();
        if (getLayoutNode().getNodes().m10736hasH91voCI$ui_release(NodeKind.m10773constructorimpl(64))) {
            Density density = getLayoutNode().getDensity();
            for (Modifier.Node tail2 = getLayoutNode().getNodes().getTail(); tail2 != null; tail2 = tail2.getParent()) {
                if (tail2 != tail) {
                    if (((NodeKind.m10773constructorimpl(64) & tail2.getKindSet()) != 0) && (tail2 instanceof ParentDataModifierNode)) {
                        objectRef.element = ((ParentDataModifierNode) tail2).modifyParentData(density, objectRef.element);
                    }
                }
            }
        }
        return objectRef.element;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            boolean z3 = false;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                z3 = true;
            }
            if (z3) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? SetsKt__SetsKt.emptySet() : linkedHashSet;
    }

    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo10589getSizeYbymL2g() {
        return getMeasuredSize();
    }

    public abstract Modifier.Node getTail();

    /* renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    /* renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    public final boolean m10758hasNodeH91voCI(int type) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(type));
        return nodeHeadNode != null && DelegatableNodeKt.m10673has64DMado(nodeHeadNode, type);
    }

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final /* synthetic */ <T> T m10759headH91voCI(int type) {
        boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM10781getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) headNode(zM10781getIncludeSelfInTraversalH91voCI); obj != null && (((Modifier.Node) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
            if (obj == tail) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: headUnchecked-H91voCI, reason: not valid java name */
    public final <T> T m10760headUncheckedH91voCI(int type) {
        boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM10781getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) headNode(zM10781getIncludeSelfInTraversalH91voCI); obj != null && (((Modifier.Node) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                return (T) obj;
            }
            if (obj == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final <T extends DelegatableNode> void m10761hitTestYqVAtuI(HitTestSource<T> hitTestSource, long pointerPosition, HitTestResult<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        DelegatableNode delegatableNode = (DelegatableNode) m10760headUncheckedH91voCI(hitTestSource.mo10769entityTypeOLwlOKw());
        if (!m10767withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float fM10754distanceInMinimumTouchTargettz77jQw = m10754distanceInMinimumTouchTargettz77jQw(pointerPosition, m10757getMinimumTouchTargetSizeNHjbRc());
                if (((Float.isInfinite(fM10754distanceInMinimumTouchTargettz77jQw) || Float.isNaN(fM10754distanceInMinimumTouchTargettz77jQw)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM10754distanceInMinimumTouchTargettz77jQw, false)) {
                    m10748hitNearJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fM10754distanceInMinimumTouchTargettz77jQw);
                    return;
                }
                return;
            }
            return;
        }
        if (delegatableNode == null) {
            mo10695hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m10762isPointerInBoundsk4lQ0M(pointerPosition)) {
            m10747hit1hIXUjU(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fM10754distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m10754distanceInMinimumTouchTargettz77jQw(pointerPosition, m10757getMinimumTouchTargetSizeNHjbRc());
        if (((Float.isInfinite(fM10754distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(fM10754distanceInMinimumTouchTargettz77jQw2)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM10754distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
            m10748hitNearJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM10754distanceInMinimumTouchTargettz77jQw2);
        } else {
            m10750speculativeHitJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM10754distanceInMinimumTouchTargettz77jQw2);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public <T extends DelegatableNode> void mo10695hitTestChildYqVAtuI(HitTestSource<T> hitTestSource, long pointerPosition, HitTestResult<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m10761hitTestYqVAtuI(hitTestSource, nodeCoordinator.m10755fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
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

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return !this.released && getLayoutNode().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m10762isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM8945getXimpl = Offset.m8945getXimpl(pointerPosition);
        float fM8946getYimpl = Offset.m8946getYimpl(pointerPosition);
        return fM8945getXimpl >= 0.0f && fM8946getYimpl >= 0.0f && fM8945getXimpl < ((float) getMeasuredWidth()) && fM8946getYimpl < ((float) getMeasuredHeight());
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

    @Override // androidx.compose.p006ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.layer != null && isAttached();
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m11685getWidthimpl(sourceCoordinates.mo10589getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m11684getHeightimpl(sourceCoordinates.mo10589getSizeYbymL2g()));
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo10590localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            relativeToSource = coordinator.m10765toParentPositionMKHz9U(relativeToSource);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m10746ancestorToLocalR5De75A(nodeCoordinatorFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo10591localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.m10765toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo10592localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo10822calculatePositionInWindowMKHz9U(mo10591localToRootMKHz9U(relativeToLocal));
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        onLayerBlockUpdated$default(this, this.layerBlock, false, 2, null);
    }

    public void onMeasureResultChanged(int width, int height) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo10818resizeozmzZPI(IntSizeKt.IntSize(width, height));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
        m10618setMeasuredSizeozmzZPI(IntSizeKt.IntSize(width, height));
        graphicsLayerScope.m9460setSizeuvyYCjk(IntSizeKt.m11695toSizeozmzZPI(getMeasuredSize()));
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(4);
        boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(iM10773constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM10781getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM10781getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM10773constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM10773constructorimpl) != 0 && (nodeHeadNode instanceof DrawModifierNode)) {
                ((DrawModifierNode) nodeHeadNode).onMeasureResultChanged();
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void onMeasured() {
        Modifier.Node parent;
        if (m10758hasNodeH91voCI(NodeKind.m10773constructorimpl(128))) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int iM10773constructorimpl = NodeKind.m10773constructorimpl(128);
                    boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(iM10773constructorimpl);
                    if (!zM10781getIncludeSelfInTraversalH91voCI) {
                        parent = getTail().getParent();
                        if (parent == null) {
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    parent = getTail();
                    for (Modifier.Node nodeHeadNode = headNode(zM10781getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM10773constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                        if ((nodeHeadNode.getKindSet() & iM10773constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                            ((LayoutAwareModifierNode) nodeHeadNode).mo10612onRemeasuredozmzZPI(getMeasuredSize());
                        }
                        if (nodeHeadNode == parent) {
                            break;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public final void onPlaced() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        if (lookaheadDelegate != null) {
            int iM10773constructorimpl = NodeKind.m10773constructorimpl(128);
            boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(iM10773constructorimpl);
            Modifier.Node tail = getTail();
            if (zM10781getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
                for (Modifier.Node nodeHeadNode = headNode(zM10781getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM10773constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getKindSet() & iM10773constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                        ((LayoutAwareModifierNode) nodeHeadNode).onLookaheadPlaced(lookaheadDelegate.getLookaheadLayoutCoordinates());
                    }
                    if (nodeHeadNode == tail) {
                        break;
                    }
                }
            }
        }
        int iM10773constructorimpl2 = NodeKind.m10773constructorimpl(128);
        boolean zM10781getIncludeSelfInTraversalH91voCI2 = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(iM10773constructorimpl2);
        Modifier.Node tail2 = getTail();
        if (!zM10781getIncludeSelfInTraversalH91voCI2 && (tail2 = tail2.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode2 = headNode(zM10781getIncludeSelfInTraversalH91voCI2); nodeHeadNode2 != null && (nodeHeadNode2.getAggregateChildKindSet() & iM10773constructorimpl2) != 0; nodeHeadNode2 = nodeHeadNode2.getChild()) {
            if ((nodeHeadNode2.getKindSet() & iM10773constructorimpl2) != 0 && (nodeHeadNode2 instanceof LayoutAwareModifierNode)) {
                ((LayoutAwareModifierNode) nodeHeadNode2).onPlaced(this);
            }
            if (nodeHeadNode2 == tail2) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        if (this.layer != null) {
            onLayerBlockUpdated$default(this, null, false, 2, null);
        }
    }

    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m10763performingMeasureK40F9xA(long constraints, Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m10619setMeasurementConstraintsBRTryo0(constraints);
        Placeable placeableInvoke = block.invoke();
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo10818resizeozmzZPI(getMeasuredSize());
        }
        return placeableInvoke;
    }

    @Override // androidx.compose.p006ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo10586placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        onLayerBlockUpdated$default(this, layerBlock, false, 2, null);
        if (!IntOffset.m11642equalsimpl0(getPosition(), position)) {
            m10764setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo10817movegyyYBs(position);
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
    }

    public Object propagateRelocationRequest(Rect rect, Continuation<? super Unit> continuation) {
        return propagateRelocationRequest$suspendImpl(this, rect, continuation);
    }

    public final void rectInParent$ui_release(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM10757getMinimumTouchTargetSizeNHjbRc = m10757getMinimumTouchTargetSizeNHjbRc();
                    float fM9014getWidthimpl = Size.m9014getWidthimpl(jM10757getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM9011getHeightimpl = Size.m9011getHeightimpl(jM10757getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM9014getWidthimpl, -fM9011getHeightimpl, IntSize.m11685getWidthimpl(mo10589getSizeYbymL2g()) + fM9014getWidthimpl, IntSize.m11684getHeightimpl(mo10589getSizeYbymL2g()) + fM9011getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m11685getWidthimpl(mo10589getSizeYbymL2g()), IntSize.m11684getHeightimpl(mo10589getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM11643getXimpl = IntOffset.m11643getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM11643getXimpl);
        bounds.setRight(bounds.getRight() + fM11643getXimpl);
        float fM11644getYimpl = IntOffset.m11644getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM11644getYimpl);
        bounds.setBottom(bounds.getBottom() + fM11644getYimpl);
    }

    @Override // androidx.compose.p006ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo10586placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
    }

    public void setMeasureResult$ui_release(MeasureResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this._measureResult;
        if (value != measureResult) {
            this._measureResult = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!value.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(value.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(value.getAlignmentLines());
            }
        }
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m10764setPositiongyyYBs(long j4) {
        this.position = j4;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f4) {
        this.zIndex = f4;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(NodeKind.m10773constructorimpl(16)));
        if (nodeHeadNode == null) {
            return false;
        }
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(16);
        if (!nodeHeadNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = nodeHeadNode.getNode();
        if ((node.getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM10773constructorimpl) != 0 && (child instanceof PointerInputModifierNode) && ((PointerInputModifierNode) child).sharePointerInputWithSiblings()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m10765toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo10816mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m11657plusNvtHpc(position, getPosition());
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM10753calculateMinimumTouchTargetPaddingE7KxVPU = m10753calculateMinimumTouchTargetPaddingE7KxVPU(m10757getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m9014getWidthimpl(jM10753calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m9011getHeightimpl(jM10753calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m9014getWidthimpl(jM10753calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m9011getHeightimpl(jM10753calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo10593transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m9392resetimpl(matrix);
        coordinator.m10752transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
        m10751transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceLayerInvalidated) {
        boolean z3 = this.layerBlock != layerBlock || forceLayerInvalidated;
        this.layerBlock = layerBlock;
        onLayerBlockUpdated(layerBlock, z3);
    }

    public final void updateLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final void updateLookaheadScope$ui_release(LookaheadScope scope) {
        LookaheadDelegate lookaheadDelegateCreateLookaheadDelegate = null;
        if (scope != null) {
            LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
            lookaheadDelegateCreateLookaheadDelegate = !Intrinsics.areEqual(scope, lookaheadDelegate != null ? lookaheadDelegate.getLookaheadScope() : null) ? createLookaheadDelegate(scope) : this.lookaheadDelegate;
        }
        this.lookaheadDelegate = lookaheadDelegateCreateLookaheadDelegate;
    }

    public final void visitNodes(int mask, boolean includeTail, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
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
    public final /* synthetic */ <T> void m10766visitNodesaLcG6gQ(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zM10781getIncludeSelfInTraversalH91voCI = NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM10781getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM10781getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                block.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo10594windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo10590localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m8949minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo10821calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    public final void withPositionTranslation(Canvas canvas, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float fM11643getXimpl = IntOffset.m11643getXimpl(getPosition());
        float fM11644getYimpl = IntOffset.m11644getYimpl(getPosition());
        canvas.translate(fM11643getXimpl, fM11644getYimpl);
        block.invoke(canvas);
        canvas.translate(-fM11643getXimpl, -fM11644getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m10767withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m8962isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo10815isInLayerk4lQ0M(pointerPosition);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(final Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!getLayoutNode().getIsPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.invoke.1
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
                    NodeCoordinator.this.drawContainedDrawModifiers(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }
}
