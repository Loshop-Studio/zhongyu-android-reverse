package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.IntRange;
import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001c\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001Bâ\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u00128\b\u0002\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0007\u0012%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r\u0012d\b\u0002\u0010\u0015\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0086\n¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\u00142\u001a\u0010%\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0#¢\u0006\u0004\b&\u0010'J'\u0010&\u001a\u00020\u00142\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0(¢\u0006\u0004\b&\u0010)J'\u0010&\u001a\u00020\u00142\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0*¢\u0006\u0004\b&\u0010+J!\u0010&\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,¢\u0006\u0004\b&\u0010.J!\u0010&\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/¢\u0006\u0004\b&\u00100J!\u0010&\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b&\u00101J$\u00103\u001a\u00020\u00142\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0086\n¢\u0006\u0004\b3\u00104J,\u00103\u001a\u00020\u00142\u001a\u0010%\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0#H\u0086\n¢\u0006\u0004\b3\u0010'J*\u00103\u001a\u00020\u00142\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0(H\u0086\n¢\u0006\u0004\b3\u0010)J*\u00103\u001a\u00020\u00142\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0*H\u0086\n¢\u0006\u0004\b3\u0010+J$\u00103\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,H\u0086\n¢\u0006\u0004\b3\u0010.J$\u00103\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/H\u0086\n¢\u0006\u0004\b3\u00100J$\u00103\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\n¢\u0006\u0004\b3\u00101J\u0017\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b5\u0010\u001eJ\u001d\u00105\u001a\u00020\u00122\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b5\u00106J'\u00108\u001a\u00020\u00142\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u00142\u0006\u0010\n\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b:\u0010;J \u0010:\u001a\u00020\u00142\u000e\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000#H\u0086\n¢\u0006\u0004\b:\u0010=J\u001e\u0010:\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\n¢\u0006\u0004\b:\u0010)J\u001e\u0010:\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0086\n¢\u0006\u0004\b:\u0010+J\u001e\u0010:\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0086\n¢\u0006\u0004\b:\u0010?J\u001e\u0010:\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0086\n¢\u0006\u0004\b:\u0010AJ\r\u0010B\u001a\u00020\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bF\u0010EJK\u0010H\u001a\u00020\u001426\u0010G\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00140\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\bH\u00109J6\u0010I\u001a\u00020\u00142!\u0010G\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00140\rH\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010JJ6\u0010K\u001a\u00020\u00142!\u0010G\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00140\rH\u0086\bø\u0001\u0000¢\u0006\u0004\bK\u0010JJ-\u0010L\u001a\u00020\u00122\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\bL\u0010MJ-\u0010\u0018\u001a\u00020\u00122\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010MJ\r\u0010N\u001a\u00020\u0004¢\u0006\u0004\bN\u0010OJ-\u0010N\u001a\u00020\u00042\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\bN\u0010PJ\u0018\u0010Q\u001a\u00020\u00122\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u00122\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\bT\u0010RJ\u000f\u0010V\u001a\u00020\u0014H\u0000¢\u0006\u0004\bU\u0010CJ\u000f\u0010X\u001a\u00020\u0014H\u0000¢\u0006\u0004\bW\u0010CJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0004H\u0000¢\u0006\u0004\bZ\u0010EJ6\u0010]\u001a\u00020\u00142!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\\\u0012\u0004\u0012\u00020\u00140\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b]\u0010JJ\u000f\u0010^\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010OJ\u001a\u0010`\u001a\u00020\u00122\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b`\u0010RJ\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010EJ\u0017\u0010f\u001a\u00020\u00142\u0006\u0010e\u001a\u00020\u0004H\u0002¢\u0006\u0004\bf\u0010EJ\u000f\u0010g\u001a\u00020\u0014H\u0002¢\u0006\u0004\bg\u0010CJ\u000f\u0010h\u001a\u00020\u0004H\u0002¢\u0006\u0004\bh\u0010OJ\u0018\u0010i\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\bi\u0010EJ\u0019\u0010j\u001a\u0004\u0018\u00018\u00012\u0006\u0010\\\u001a\u00020\u0004H\u0002¢\u0006\u0004\bj\u0010kJ\u0018\u0010l\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\bl\u0010EJ\u0018\u0010m\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\bm\u0010EJ\u0017\u0010n\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\bp\u0010oJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0004H\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u00142\u0006\u0010u\u001a\u00020tH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010v\u001a\u00020\u00142\u0006\u0010u\u001a\u00020xH\u0002¢\u0006\u0004\bv\u0010yRD\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010zR1\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010{Rp\u0010\u0015\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010|R\u001c\u0010}\u001a\u00020t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b}\u0010~\u0012\u0004\b\u007f\u0010CR&\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0005\b<\u0010\u0080\u0001\u0012\u0005\b\u0081\u0001\u0010CR(\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010CR\u0018\u0010\u0084\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010~R\u0019\u0010\u0085\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0086\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0086\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0086\u0001R\u0013\u0010\u008f\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010OR\u0012\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010OR\u001c\u0010N\u001a\u00020\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0092\u0001\u0010C\u001a\u0005\b\u0091\u0001\u0010OR\u0012\u0010e\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010O\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0094\u0001"}, m5110d2 = {"Landroidx/collection/SieveCache;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "initialCapacity", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "value", "sizeOf", "Lkotlin/Function1;", "createValueFromKey", "Lkotlin/Function4;", "oldValue", "newValue", "", "evicted", "Ld6/s;", "onEntryRemoved", "<init>", "(IILr6/e;Lr6/c;Lr6/g;)V", "any", "()Z", SchedulerSupport.NONE, "isEmpty", "isNotEmpty", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "(Ljava/lang/Iterable;)V", "Lz6/h;", "(Lz6/h;)V", "", TypedValues.TransitionType.S_FROM, "(Ljava/util/Map;)V", "Landroidx/collection/ScatterMap;", "(Landroidx/collection/ScatterMap;)V", "(Landroidx/collection/SieveCache;)V", "pair", "plusAssign", "(Lkotlin/Pair;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Lr6/e;)V", "minusAssign", "(Ljava/lang/Object;)V", "keys", "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", "evictAll", "()V", "resize", "(I)V", "trimToSize", "block", "forEach", "forEachKey", "(Lr6/c;)V", "forEachValue", "all", "(Lr6/e;)Z", "count", "()I", "(Lr6/e;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "index", "forEachIndexed", "hashCode", "other", "equals", "", "toString", "()Ljava/lang/String;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "findEvictionCandidate", "moveNodeToHead", "removeValueAt", "(I)Ljava/lang/Object;", "removeNode", "markNodeVisited", "findKeyIndex", "(Ljava/lang/Object;)I", "findInsertIndex", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "Lr6/e;", "Lr6/c;", "Lr6/g;", "metadata", "[J", "getMetadata$annotations", "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "nodes", "_capacity", "I", "growthLimit", "_count", "_maxSize", "_size", "head", "tail", "hand", "getSize", "size", "getMaxSize", "getCount", "getCount$annotations", "getCapacity", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1148:1\n684#1,2:1161\n633#1:1163\n635#1,2:1165\n638#1,6:1168\n251#1,2:1174\n251#1,2:1176\n251#1,2:1178\n251#1,2:1181\n251#1,2:1201\n548#1,4:1210\n1025#1,6:1214\n1035#1,3:1221\n1038#1,2:1225\n251#1,2:1227\n1041#1,6:1229\n552#1:1235\n251#1,2:1236\n1025#1,6:1238\n1035#1,3:1245\n1038#1,9:1249\n1025#1,6:1289\n1035#1,3:1296\n1038#1,9:1300\n1025#1,6:1309\n1035#1,3:1316\n1038#1,9:1320\n1025#1,6:1329\n1035#1,3:1336\n1038#1,9:1340\n548#1,4:1349\n1025#1,6:1353\n1035#1,3:1360\n1038#1,9:1364\n552#1:1373\n548#1,4:1374\n1025#1,6:1378\n1035#1,3:1385\n1038#1,9:1389\n552#1:1398\n548#1,4:1399\n1025#1,6:1403\n1035#1,3:1410\n1038#1,9:1414\n552#1:1423\n1025#1,6:1424\n1035#1,3:1431\n1038#1,9:1435\n660#1,3:1462\n663#1:1466\n665#1,2:1468\n668#1,5:1471\n674#1,8:1477\n548#1,4:1638\n1025#1,6:1642\n1035#1,3:1649\n1038#1,9:1653\n552#1:1662\n548#1,4:1663\n1025#1,6:1667\n1035#1,3:1674\n1038#1,9:1678\n552#1:1687\n59#2,5:1149\n1#3:1154\n1254#4,6:1155\n1399#4:1194\n1270#4:1198\n1399#4:1220\n1270#4:1224\n1399#4:1244\n1270#4:1248\n1399#4:1268\n1270#4:1272\n1399#4:1295\n1270#4:1299\n1399#4:1315\n1270#4:1319\n1399#4:1335\n1270#4:1339\n1399#4:1359\n1270#4:1363\n1399#4:1384\n1270#4:1388\n1399#4:1409\n1270#4:1413\n1399#4:1430\n1270#4:1434\n1230#4:1450\n1254#4,6:1451\n1242#4:1457\n1241#4,4:1458\n1165#4,3:1489\n1179#4:1492\n1175#4:1493\n1372#4,3:1494\n1386#4,3:1497\n1312#4:1500\n1303#4:1501\n1297#4:1502\n1309#4:1503\n1393#4:1504\n1165#4,3:1505\n1175#4:1508\n1179#4:1509\n1372#4,3:1510\n1386#4,3:1513\n1312#4:1516\n1303#4:1517\n1297#4:1518\n1309#4:1519\n1393#4:1520\n1265#4:1521\n1220#4:1522\n1262#4:1523\n1220#4:1524\n1230#4:1525\n1254#4,6:1526\n1242#4:1532\n1241#4,4:1533\n1372#4,3:1537\n1399#4:1540\n1297#4:1541\n1144#4,14:1542\n1220#4:1556\n1165#4,3:1557\n1175#4:1560\n1179#4:1561\n1254#4,6:1562\n1220#4:1569\n1179#4:1570\n1254#4,6:1571\n1254#4,6:1577\n1179#4:1588\n1254#4,6:1589\n1268#4:1600\n1220#4:1601\n1165#4,3:1602\n1175#4:1605\n1179#4:1606\n1230#4:1607\n1254#4,6:1608\n1242#4:1614\n1241#4,4:1615\n1399#4:1636\n1270#4:1637\n1399#4:1648\n1270#4:1652\n1399#4:1673\n1270#4:1677\n1111#5:1164\n1114#5:1167\n1130#5:1444\n1123#5:1445\n1119#5:1446\n1123#5:1447\n1111#5:1448\n1114#5:1449\n1123#5:1465\n1127#5:1467\n1117#5:1470\n1114#5:1476\n1123#5:1485\n1127#5:1486\n1117#5:1487\n1114#5:1488\n1132#5:1568\n1144#5:1583\n1138#5:1584\n1141#5:1585\n1132#5:1586\n1132#5:1587\n1144#5:1595\n1138#5:1596\n1135#5:1597\n1132#5:1598\n1132#5:1599\n1123#5:1619\n1127#5:1620\n1096#5,2:1621\n1147#5:1623\n1098#5,2:1624\n1147#5:1626\n1147#5:1627\n1147#5:1628\n1147#5:1629\n1123#5:1630\n1127#5:1631\n1103#5,4:1632\n215#6:1180\n216#6:1183\n357#7,4:1184\n329#7,6:1188\n339#7,3:1195\n342#7,2:1199\n345#7,6:1203\n361#7:1209\n231#8,3:1258\n200#8,7:1261\n211#8,3:1269\n214#8,9:1273\n234#8:1282\n287#9,6:1283\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n229#1:1161,2\n288#1:1163\n288#1:1165,2\n288#1:1168,6\n300#1:1174,2\n311#1:1176,2\n322#1:1178,2\n332#1:1181,2\n341#1:1201,2\n350#1:1210,4\n350#1:1214,6\n350#1:1221,3\n350#1:1225,2\n350#1:1227,2\n350#1:1229,6\n350#1:1235\n358#1:1236,2\n447#1:1238,6\n447#1:1245,3\n447#1:1249,9\n551#1:1289,6\n551#1:1296,3\n551#1:1300,9\n563#1:1309,6\n563#1:1316,3\n563#1:1320,9\n575#1:1329,6\n575#1:1336,3\n575#1:1340,9\n580#1:1349,4\n580#1:1353,6\n580#1:1360,3\n580#1:1364,9\n580#1:1373\n586#1:1374,4\n586#1:1378,6\n586#1:1385,3\n586#1:1389,9\n586#1:1398\n596#1:1399,4\n596#1:1403,6\n596#1:1410,3\n596#1:1414,9\n596#1:1423\n609#1:1424,6\n609#1:1431,3\n609#1:1435,9\n654#1:1462,3\n654#1:1466\n654#1:1468,2\n654#1:1471,5\n654#1:1477,8\n1055#1:1638,4\n1055#1:1642,6\n1055#1:1649,3\n1055#1:1653,9\n1055#1:1662\n1081#1:1663,4\n1081#1:1667,6\n1081#1:1674,3\n1081#1:1678,9\n1081#1:1687\n131#1:1149,5\n211#1:1155,6\n341#1:1194\n341#1:1198\n350#1:1220\n350#1:1224\n447#1:1244\n447#1:1248\n486#1:1268\n486#1:1272\n551#1:1295\n551#1:1299\n563#1:1315\n563#1:1319\n575#1:1335\n575#1:1339\n580#1:1359\n580#1:1363\n586#1:1384\n586#1:1388\n596#1:1409\n596#1:1413\n609#1:1430\n609#1:1434\n648#1:1450\n648#1:1451,6\n648#1:1457\n648#1:1458,4\n688#1:1489,3\n689#1:1492\n692#1:1493\n696#1:1494,3\n697#1:1497,3\n698#1:1500\n699#1:1501\n699#1:1502\n703#1:1503\n706#1:1504\n718#1:1505,3\n719#1:1508\n720#1:1509\n727#1:1510,3\n728#1:1513,3\n729#1:1516\n730#1:1517\n730#1:1518\n734#1:1519\n737#1:1520\n746#1:1521\n746#1:1522\n752#1:1523\n752#1:1524\n753#1:1525\n753#1:1526,6\n753#1:1532\n753#1:1533,4\n764#1:1537,3\n765#1:1540\n767#1:1541\n841#1:1542,14\n847#1:1556\n861#1:1557,3\n862#1:1560\n873#1:1561\n874#1:1562,6\n888#1:1569\n891#1:1570\n892#1:1571,6\n893#1:1577,6\n915#1:1588\n916#1:1589,6\n980#1:1600\n980#1:1601\n982#1:1602,3\n983#1:1605\n985#1:1606\n985#1:1607\n985#1:1608,6\n985#1:1614\n985#1:1615,4\n1030#1:1636\n1037#1:1637\n1055#1:1648\n1055#1:1652\n1081#1:1673\n1081#1:1677\n288#1:1164\n288#1:1167\n619#1:1444\n621#1:1445\n622#1:1446\n626#1:1447\n633#1:1448\n636#1:1449\n654#1:1465\n654#1:1467\n654#1:1470\n654#1:1476\n662#1:1485\n663#1:1486\n666#1:1487\n672#1:1488\n878#1:1568\n905#1:1583\n907#1:1584\n908#1:1585\n910#1:1586\n912#1:1587\n931#1:1595\n933#1:1596\n934#1:1597\n936#1:1598\n940#1:1599\n1001#1:1619\n1002#1:1620\n1003#1:1621,2\n1003#1:1623\n1003#1:1624,2\n1003#1:1626\n1005#1:1627\n1006#1:1628\n1007#1:1629\n1014#1:1630\n1015#1:1631\n1016#1:1632,4\n332#1:1180\n332#1:1183\n341#1:1184,4\n341#1:1188,6\n341#1:1195,3\n341#1:1199,2\n341#1:1203,6\n341#1:1209\n486#1:1258,3\n486#1:1261,7\n486#1:1269,3\n486#1:1273,9\n486#1:1282\n491#1:1283,6\n*E\n"})
/* loaded from: classes.dex */
public final class SieveCache<K, V> {
    private int _capacity;
    private int _count;
    private int _maxSize;
    private int _size;

    @NotNull
    private final InterfaceC6471c createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;

    @JvmField
    @NotNull
    public Object[] keys;

    @JvmField
    @NotNull
    public long[] metadata;

    @NotNull
    private long[] nodes;

    @NotNull
    private final InterfaceC6475g onEntryRemoved;

    @NotNull
    private final InterfaceC6473e sizeOf;
    private int tail;

    @JvmField
    @NotNull
    public Object[] values;

    public SieveCache(@IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID, m247to = 2147483646) int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = 2147483646) int i8, @NotNull InterfaceC6473e sizeOf, @NotNull InterfaceC6471c createValueFromKey, @NotNull InterfaceC6475g onEntryRemoved) {
        AbstractC5830k.m5330g(sizeOf, "sizeOf");
        AbstractC5830k.m5330g(createValueFromKey, "createValueFromKey");
        AbstractC5830k.m5330g(onEntryRemoved, "onEntryRemoved");
        this.sizeOf = sizeOf;
        this.createValueFromKey = createValueFromKey;
        this.onEntryRemoved = onEntryRemoved;
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (!(i > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this._maxSize = i;
        initializeStorage(ScatterMapKt.unloadedCapacity(i8));
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i = this.hand;
        if (i == Integer.MAX_VALUE) {
            i = this.tail;
        }
        while (i != Integer.MAX_VALUE) {
            long j7 = jArr[i];
            if (((int) ((j7 >> 62) & 1)) == 0) {
                break;
            }
            int i8 = (int) (SieveCacheKt.NodeLinkMask & (j7 >> 31));
            jArr[i] = 4611686018427387903L & j7;
            i = i8 != Integer.MAX_VALUE ? i8 : this.tail;
        }
        int i9 = (int) (SieveCacheKt.NodeLinkMask & (jArr[i] >> 31));
        this.hand = i9 != Integer.MAX_VALUE ? i9 : Integer.MAX_VALUE;
        return i;
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i8 = hash1 & i;
        int i9 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j7 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j8 = j7 & ((~j7) << 7) & (-9187201950435737472L);
            if (j8 != 0) {
                return (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i;
            }
            i9 += 8;
            i8 = (i8 + i9) & i;
        }
    }

    private final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i8 = i >>> 7;
        int i9 = i & 127;
        int i10 = this._capacity;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = i9;
            int i15 = i9;
            long j9 = j7 ^ (j8 * ScatterMapKt.BitmaskLsb);
            for (long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
                if (AbstractC5830k.m5325b(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i8);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i8);
                }
                this._count++;
                int i16 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i17 = iFindFirstAvailableSlot >> 3;
                long j11 = jArr2[i17];
                int i18 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i16 - (((j11 >> i18) & 255) == 128 ? 1 : 0);
                int i19 = this._capacity;
                long j12 = ((~(255 << i18)) & j11) | (j8 << i18);
                jArr2[i17] = j12;
                jArr2[(((iFindFirstAvailableSlot - 7) & i19) + (i19 & 7)) >> 3] = j12;
                return ~iFindFirstAvailableSlot;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
        }
    }

    private final int findKeyIndex(K key) {
        int i = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this._capacity;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.metadata;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * ScatterMapKt.BitmaskLsb) ^ j7;
            for (long j9 = (~j8) & (j8 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i10;
                if (AbstractC5830k.m5325b(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i11 = i12 + i;
        }
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j7 = jArr[i];
            int i9 = (int) ((j7 >> 31) & SieveCacheKt.NodeLinkMask);
            int i10 = (int) (j7 & SieveCacheKt.NodeLinkMask);
            long j8 = ((j7 & SieveCacheKt.NodeMetaMask) | (i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i9] & 4294967295L))) << 31;
            if (i10 != Integer.MAX_VALUE) {
                i8 = (int) (4294967295L & mapping[i10]);
            }
            jArr[i] = i8 | j8;
            i++;
        }
        int i11 = this.head;
        if (i11 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i11] & 4294967295L);
        }
        int i12 = this.tail;
        if (i12 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i12] & 4294967295L);
        }
        int i13 = this.hand;
        if (i13 != Integer.MAX_VALUE) {
            this.hand = (int) (mapping[i13] & 4294967295L);
        }
    }

    public static /* synthetic */ void getCount$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - get_count();
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            AbstractC5802q.m5188O(jArr2, -9187201950435737472L);
            int i = capacity >> 3;
            long j7 = 255 << ((capacity & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j7)) | j7;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            AbstractC5802q.m5188O(emptyNodes, 4611686018427387903L);
        }
        this.nodes = emptyNodes;
    }

    private final void markNodeVisited(int index) {
        long[] jArr = this.nodes;
        jArr[index] = (jArr[index] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
    }

    private final void moveNodeToHead(int index) {
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[index] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((index & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = index;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = index;
        }
    }

    private final void removeNode(int index) {
        long[] jArr = this.nodes;
        long j7 = jArr[index];
        int i = (int) ((j7 >> 31) & SieveCacheKt.NodeLinkMask);
        int i8 = (int) (j7 & SieveCacheKt.NodeLinkMask);
        if (i != Integer.MAX_VALUE) {
            jArr[i] = (jArr[i] & SieveCacheKt.NodeMetaAndPreviousMask) | (i8 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i8;
        }
        if (i8 != Integer.MAX_VALUE) {
            jArr[i8] = ((i & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i8] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i;
        }
        if (this.hand == index) {
            this.hand = i;
        }
        jArr[index] = 4611686018427387903L;
    }

    private final V removeValueAt(int index) {
        this._count--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i8 = index >> 3;
        int i9 = (index & 7) << 3;
        long j7 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j7;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j7;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v2 = (V) objArr[index];
        objArr[index] = null;
        long[] jArr2 = this.nodes;
        long j8 = jArr2[index];
        int i10 = (int) ((j8 >> 31) & SieveCacheKt.NodeLinkMask);
        int i11 = (int) (j8 & SieveCacheKt.NodeLinkMask);
        if (i10 != Integer.MAX_VALUE) {
            jArr2[i10] = (jArr2[i10] & SieveCacheKt.NodeMetaAndPreviousMask) | (i11 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = ((i10 & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i11] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i10;
        }
        if (this.hand == index) {
            this.hand = i10;
        }
        jArr2[index] = 4611686018427387903L;
        return v2;
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8) {
            if (Long.compare((get_count() * 32) ^ Long.MIN_VALUE, (this._capacity * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final boolean all(@NotNull InterfaceC6473e predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i10];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!((Boolean) predicate.invoke(obj, obj2)).booleanValue()) {
                            return false;
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this._count != 0;
    }

    public final boolean contains(@NotNull K key) {
        AbstractC5830k.m5330g(key, "key");
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(@NotNull K key) {
        AbstractC5830k.m5330g(key, "key");
        return findKeyIndex(key) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(@org.jetbrains.annotations.NotNull V r15) {
        /*
            r14 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r15, r0)
            java.lang.Object[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L53
            r4 = r3
        L11:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2b:
            if (r9 >= r7) goto L4c
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L48
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r10, r11)
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L48
            r15 = 1
            return r15
        L48:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2b
        L4c:
            if (r7 != r8) goto L53
        L4e:
            if (r4 == r2) goto L53
            int r4 = r4 + 1
            goto L11
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.containsValue(java.lang.Object):boolean");
    }

    public final int count() {
        return get_size();
    }

    public final void dropDeletes$collection() {
        int i;
        Object[] objArr;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i8 = this._capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i8];
        int i9 = 0;
        long j7 = 9223372034707292159L;
        Arrays.fill(jArr3, 0, i8, 9223372034707292159L);
        int i10 = (i8 + 7) >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            long j8 = jArr[i11] & (-9187201950435737472L);
            jArr[i11] = (-72340172838076674L) & ((~j8) + (j8 >>> 7));
        }
        int length = jArr.length;
        int i12 = length - 1;
        int i13 = length - 2;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[i12] = jArr[0];
        int i14 = 0;
        while (i14 != i8) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j9 = (jArr[i15] >> i16) & 255;
            if (j9 != 128 && j9 == 254) {
                Object obj = objArr2[i14];
                int iHashCode = (obj != null ? obj.hashCode() : i9) * ScatterMapKt.MurmurHashC1;
                int i17 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int i18 = i9;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i17);
                int i19 = i17 & i8;
                long j10 = j7;
                if (((iFindFirstAvailableSlot - i19) & i8) / 8 == ((i14 - i19) & i8) / 8) {
                    jArr[i15] = ((r12 & 127) << i16) | (jArr[i15] & (~(255 << i16)));
                    if (jArr3[i14] == j10) {
                        long j11 = i14;
                        jArr3[i14] = j11 | (j11 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i18];
                    i14++;
                    i9 = i18;
                    j7 = j10;
                } else {
                    int i20 = iFindFirstAvailableSlot >> 3;
                    long j12 = jArr[i20];
                    int i21 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j12 >> i21) & 255) == 128) {
                        i = i8;
                        objArr = objArr2;
                        jArr[i20] = ((~(255 << i21)) & j12) | ((r12 & 127) << i21);
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        objArr[iFindFirstAvailableSlot] = objArr[i14];
                        objArr[i14] = null;
                        objArr3[iFindFirstAvailableSlot] = objArr3[i14];
                        objArr3[i14] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i14];
                        jArr2[i14] = 4611686018427387903L;
                        int i22 = (int) ((jArr3[i14] >> 32) & 4294967295L);
                        if (i22 != Integer.MAX_VALUE) {
                            jArr3[i22] = (jArr3[i22] & (-4294967296L)) | iFindFirstAvailableSlot;
                            jArr3[i14] = (jArr3[i14] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i14] = (Integer.MAX_VALUE << 32) | iFindFirstAvailableSlot;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i14 << 32) | Integer.MAX_VALUE;
                    } else {
                        i = i8;
                        objArr = objArr2;
                        jArr[i20] = ((r12 & 127) << i21) | ((~(255 << i21)) & j12);
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i14];
                        objArr[i14] = obj2;
                        Object obj3 = objArr3[iFindFirstAvailableSlot];
                        objArr3[iFindFirstAvailableSlot] = objArr3[i14];
                        objArr3[i14] = obj3;
                        long j13 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i14];
                        jArr2[i14] = j13;
                        int i23 = (int) ((jArr3[i14] >> 32) & 4294967295L);
                        if (i23 != Integer.MAX_VALUE) {
                            long j14 = iFindFirstAvailableSlot;
                            jArr3[i23] = (jArr3[i23] & (-4294967296L)) | j14;
                            jArr3[i14] = (jArr3[i14] & 4294967295L) | (j14 << 32);
                        } else {
                            long j15 = iFindFirstAvailableSlot;
                            jArr3[i14] = j15 | (j15 << 32);
                            i23 = i14;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i23 << 32) | i14;
                        i14--;
                    }
                    jArr[jArr.length - 1] = jArr[i18];
                    i14++;
                    i8 = i;
                    i9 = i18;
                    j7 = j10;
                    objArr2 = objArr;
                }
            } else {
                i14++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object other) {
        boolean z8;
        boolean z9;
        boolean z10 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) other;
        if (sieveCache.get_size() != get_size() || sieveCache._count != this._count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        z9 = z10;
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i10];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!obj2.equals(sieveCache.get(obj))) {
                            return false;
                        }
                    } else {
                        z9 = z10;
                    }
                    j7 >>= 8;
                    i9++;
                    z10 = z9;
                }
                z8 = z10;
                if (i8 != 8) {
                    return z8;
                }
            } else {
                z8 = z10;
            }
            if (i == length) {
                return z8;
            }
            i++;
            z10 = z8;
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void forEach(@NotNull InterfaceC6473e block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i10];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj, obj2);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @PublishedApi
    public final void forEachIndexed(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        AbstractC0037f.m72A(i << 3, i9, block);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        Object obj = objArr[(i << 3) + i9];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        block.invoke(obj);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(@NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(block, "block");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        Object obj = objArr[(i << 3) + i9];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Nullable
    public final V get(@NotNull K key) {
        AbstractC5830k.m5330g(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            long[] jArr = this.nodes;
            jArr[iFindKeyIndex] = (jArr[iFindKeyIndex] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
            return (V) this.values[iFindKeyIndex];
        }
        V v2 = (V) this.createValueFromKey.invoke(key);
        if (v2 == null) {
            return null;
        }
        put(key, v2);
        return v2;
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* renamed from: getCount, reason: from getter */
    public final int get_count() {
        return this._count;
    }

    /* renamed from: getMaxSize, reason: from getter */
    public final int get_maxSize() {
        return this._maxSize;
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i10];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean isEmpty() {
        return this._count == 0;
    }

    public final boolean isNotEmpty() {
        return this._count != 0;
    }

    public final void minusAssign(@NotNull K key) {
        AbstractC5830k.m5330g(key, "key");
        remove(key);
    }

    public final boolean none() {
        return this._count == 0;
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V> pair) {
        AbstractC5830k.m5330g(pair, "pair");
        put(pair.getFirst(), pair.getSecond());
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindInsertIndex];
        objArr[iFindInsertIndex] = value;
        this.keys[iFindInsertIndex] = key;
        int iIntValue = ((Number) this.sizeOf.invoke(key, value)).intValue() + this._size;
        this._size = iIntValue;
        if (v2 != null) {
            this._size = iIntValue - ((Number) this.sizeOf.invoke(key, v2)).intValue();
            this.onEntryRemoved.invoke(key, v2, value, Boolean.FALSE);
            trimToSize(this._maxSize);
            return v2;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindInsertIndex] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = (jArr[i] & SieveCacheKt.NodeMetaAndNextMask) | ((SieveCacheKt.NodeLinkMask & iFindInsertIndex) << 31);
        }
        this.head = iFindInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindInsertIndex;
        }
        return v2;
    }

    public final void putAll(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    @Nullable
    public final V remove(@NotNull K key) {
        V vRemoveValueAt;
        AbstractC5830k.m5330g(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return null;
        }
        this._size -= ((Number) this.sizeOf.invoke(key, vRemoveValueAt)).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return vRemoveValueAt;
    }

    public final void removeIf(@NotNull InterfaceC6473e predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = this.keys[i10];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = this.values[i10];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (((Boolean) predicate.invoke(obj, obj2)).booleanValue()) {
                            V vRemoveValueAt = removeValueAt(i10);
                            if (vRemoveValueAt == null) {
                                return;
                            }
                            this._size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                            this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, Boolean.FALSE);
                        } else {
                            continue;
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void resize(@IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID, m247to = 2147483646) int maxSize) {
        this._maxSize = maxSize;
        trimToSize(maxSize);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i8 = this._capacity;
        int i9 = 0;
        while (i9 < i) {
            if (((jArr2[i9 >> 3] >> ((i9 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i9];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i10 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j7 = i10 & 127;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                long j8 = (jArr4[i11] & (~(255 << i12))) | (j7 << i12);
                jArr4[i11] = j8;
                jArr4[(((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7)) >> 3] = j8;
                objArr4[iFindFirstAvailableSlot] = obj;
                objArr5[iFindFirstAvailableSlot] = objArr3[i9];
                jArr5[iFindFirstAvailableSlot] = jArr3[i9];
                iArr[i9] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i9++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    public final void set(@NotNull K key, @NotNull V value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        put(key, value);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SieveCache[maxSize=");
        sb.append(this._maxSize);
        sb.append(", size=");
        sb.append(this._size);
        sb.append(", capacity=");
        sb.append(this._capacity);
        sb.append(", count=");
        return AbstractC0037f.m88m(sb, this._count, ']');
    }

    public final void trimToSize(int maxSize) {
        int iFindEvictionCandidate;
        while (this._size > maxSize && get_count() != 0 && (iFindEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iFindEvictionCandidate];
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            V vRemoveValueAt = removeValueAt(iFindEvictionCandidate);
            if (vRemoveValueAt != null) {
                this._size -= ((Number) this.sizeOf.invoke(obj, vRemoveValueAt)).intValue();
                this.onEntryRemoved.invoke(obj, vRemoveValueAt, null, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r1, r2)
            java.lang.Object[] r2 = r0.keys
            java.lang.Object[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L65
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L5e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type K of androidx.collection.SieveCache"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r14, r15)
            r13 = r3[r13]
            java.lang.String r15 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r13, r15)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L5a
            r1 = 1
            return r1
        L5a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L5e:
            if (r10 != r11) goto L65
        L60:
            if (r7 == r5) goto L65
            int r7 = r7 + 1
            goto L16
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.any(r6.e):boolean");
    }

    public final int count(@NotNull InterfaceC6473e predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128) {
                        int i11 = (i << 3) + i10;
                        Object obj = objArr[i11];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i11];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (((Boolean) predicate.invoke(obj, obj2)).booleanValue()) {
                            i8++;
                        }
                    }
                    j7 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i == length) {
                return i8;
            }
            i++;
        }
    }

    public final void minusAssign(@NotNull K[] keys) {
        AbstractC5830k.m5330g(keys, "keys");
        for (K k8 : keys) {
            remove(k8);
        }
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@NotNull InterfaceC6830h pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        putAll(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull InterfaceC6830h pairs) {
        AbstractC5830k.m5330g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            put(pair.component1(), pair.component2());
        }
    }

    public final boolean remove(@NotNull K key, @NotNull V value) {
        V vRemoveValueAt;
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || !AbstractC5830k.m5325b(this.values[iFindKeyIndex], value) || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return false;
        }
        this._size -= ((Number) this.sizeOf.invoke(key, vRemoveValueAt)).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull InterfaceC6830h keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Map<K, ? extends V> from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    public final void plusAssign(@NotNull ScatterMap<K, V> from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        AbstractC5830k.m5330g(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        remove(objArr[(i << 3) + i9]);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void plusAssign(@NotNull SieveCache<K, V> from) {
        AbstractC5830k.m5330g(from, "from");
        putAll(from);
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j7 = jArr[i];
            int i9 = (int) ((j7 >> 31) & SieveCacheKt.NodeLinkMask);
            int i10 = (int) (j7 & SieveCacheKt.NodeLinkMask);
            long j8 = ((j7 & SieveCacheKt.NodeMetaMask) | (i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i9])) << 31;
            if (i10 != Integer.MAX_VALUE) {
                i8 = mapping[i10];
            }
            jArr[i] = j8 | i8;
            i++;
        }
        int i11 = this.head;
        if (i11 != Integer.MAX_VALUE) {
            this.head = mapping[i11];
        }
        int i12 = this.tail;
        if (i12 != Integer.MAX_VALUE) {
            this.tail = mapping[i12];
        }
        int i13 = this.hand;
        if (i13 != Integer.MAX_VALUE) {
            this.hand = mapping[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        AbstractC5830k.m5330g(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        put(objArr[i10], objArr2[i10]);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<K> keys) {
        AbstractC5830k.m5330g(keys, "keys");
        Object[] objArr = keys.content;
        int i = keys._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(objArr[i8]);
        }
    }

    public /* synthetic */ SieveCache(int i, int i8, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c, InterfaceC6475g interfaceC6475g, int i9, AbstractC5824e abstractC5824e) {
        this(i, (i9 & 2) != 0 ? 6 : i8, (i9 & 4) != 0 ? new InterfaceC6473e() { // from class: androidx.collection.SieveCache.1
            @Override // p152r6.InterfaceC6473e
            public final Integer invoke(K k8, V v2) {
                AbstractC5830k.m5330g(k8, "<anonymous parameter 0>");
                AbstractC5830k.m5330g(v2, "<anonymous parameter 1>");
                return 1;
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((C05781) obj, obj2);
            }
        } : interfaceC6473e, (i9 & 8) != 0 ? new InterfaceC6471c() { // from class: androidx.collection.SieveCache.2
            @Override // p152r6.InterfaceC6471c
            public final Void invoke(K it) {
                AbstractC5830k.m5330g(it, "it");
                return null;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C05792) obj);
            }
        } : interfaceC6471c, (i9 & 16) != 0 ? new InterfaceC6475g() { // from class: androidx.collection.SieveCache.3
            public final void invoke(K k8, V v2, V v4, boolean z8) {
                AbstractC5830k.m5330g(k8, "<anonymous parameter 0>");
                AbstractC5830k.m5330g(v2, "<anonymous parameter 1>");
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((C05803) obj, obj2, obj3, ((Boolean) obj4).booleanValue());
                return C5443s.f8405a;
            }
        } : interfaceC6475g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull SieveCache<K, V> from) {
        AbstractC5830k.m5330g(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj = objArr[i10];
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i10];
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        put(obj, obj2);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
