package androidx.compose.runtime;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.p011ui.spatial.RectListKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;
import p160s6.InterfaceC6560a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 \u0083\u00022\u00020\u0001:\u0002\u0083\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\fJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00020\u001e¢\u0006\u0004\b.\u0010\"J\u0015\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020/¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u001e¢\u0006\u0004\b6\u0010\"J\u0017\u00107\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b7\u0010,J\u001f\u00107\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b7\u0010'J\u0017\u00108\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b8\u0010,J\u0017\u00109\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b9\u0010,J$\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b;\u0010<J)\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b9\u0010=J\u0017\u0010?\u001a\u0004\u0018\u00010\u00012\u0006\u0010>\u001a\u00020\u0006¢\u0006\u0004\b?\u0010\u000fJ\u000f\u0010@\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\u001f\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u0010D\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bB\u0010EJ<\u0010H\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u001a\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001e0FH\u0086\b¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010\fJ\u0017\u0010M\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0006H\u0000¢\u0006\u0004\bL\u0010\fJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0006H\u0000¢\u0006\u0004\bN\u0010\fJ\u0015\u0010Q\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010*J\u0015\u0010R\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u001e¢\u0006\u0004\bT\u0010\"J\r\u0010U\u001a\u00020\u001e¢\u0006\u0004\bU\u0010\"J\r\u0010V\u001a\u00020\u001e¢\u0006\u0004\bV\u0010\"J\r\u0010W\u001a\u00020\u001e¢\u0006\u0004\bW\u0010\"J\u0015\u0010W\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\bW\u0010*J\u001f\u0010W\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bW\u0010YJ\u001f\u0010[\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b[\u0010YJ)\u0010[\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b[\u0010\\J)\u0010^\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u00012\b\u0010]\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b^\u0010\\J\u001f\u0010^\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\b\u0010]\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b^\u0010YJ\r\u0010_\u001a\u00020\u0006¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\ba\u0010*J\u0015\u0010a\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\ba\u0010SJ\r\u0010b\u001a\u00020\u0006¢\u0006\u0004\bb\u0010`J\r\u0010c\u001a\u00020\b¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010e¢\u0006\u0004\bf\u0010gJR\u0010k\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u000628\u0010G\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bh\u0012\b\bi\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bh\u0012\b\bi\u0012\u0004\b\b(j\u0012\u0004\u0012\u00020\u001e0FH\u0086\b¢\u0006\u0004\bk\u0010lJ\u0015\u0010n\u001a\u00020\u001e2\u0006\u0010m\u001a\u00020\u0006¢\u0006\u0004\bn\u0010*J+\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180p2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010m\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u0000¢\u0006\u0004\bq\u0010rJ-\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00180p2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010s\u001a\u00020\b¢\u0006\u0004\bt\u0010uJ\r\u0010v\u001a\u00020\u001e¢\u0006\u0004\bv\u0010\"J+\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00180p2\u0006\u0010m\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bw\u0010xJ\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010yJ\u0017\u0010z\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\bz\u0010*J\u0015\u0010{\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b{\u0010\u001cJ\u000f\u0010|\u001a\u00020/H\u0016¢\u0006\u0004\b|\u0010}J\u0019\u0010\u007f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b~\u0010yJ\u000f\u0010\u0080\u0001\u001a\u00020/¢\u0006\u0005\b\u0080\u0001\u0010}J\u0011\u0010\u0082\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0005\b\u0081\u0001\u0010\"J\u0011\u0010\u0084\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0005\b\u0083\u0001\u0010\"J\u001d\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0005\b\u0085\u0001\u0010%J'\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0006\u0010\u001b\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J4\u0010W\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010]\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0005\bW\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008a\u0001\u0010\nJ\u0019\u0010\u008b\u0001\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008b\u0001\u0010\nJ\u0011\u0010\u008c\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u008c\u0001\u0010\"J\u0019\u0010\u008d\u0001\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008d\u0001\u0010*J&\u0010\u0091\u0001\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00062\u0007\u00109\u001a\u00030\u008e\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\nJ\u0011\u0010\u0093\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0093\u0001\u0010\"J\u0011\u0010\u0094\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0094\u0001\u0010`J+\u0010\u0096\u0001\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0098\u0001\u0010*J\"\u0010\u0099\u0001\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u009b\u0001\u0010\"J\u001a\u0010\u009d\u0001\u001a\u00020\u001e2\u0007\u0010\u009c\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009d\u0001\u0010*J#\u0010\u009e\u0001\u001a\u00020\u001e2\u0007\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009a\u0001J#\u0010¡\u0001\u001a\u00020\b2\u0007\u0010\u009f\u0001\u001a\u00020\u00062\u0007\u0010 \u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b¡\u0001\u0010\u0016J\u001d\u0010¢\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J,\u0010¤\u0001\u001a\u00020\u001e2\u0007\u0010\u009f\u0001\u001a\u00020\u00062\u0007\u0010 \u0001\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¤\u0001\u0010\u0097\u0001J#\u0010¥\u0001\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0005\b¥\u0001\u0010YJ$\u0010¨\u0001\u001a\u00020\u001e2\u0007\u0010¦\u0001\u001a\u00020\u00062\u0007\u0010§\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¨\u0001\u0010\u009a\u0001JQ\u0010\u00ad\u0001\u001a\u00020\b2\u0007\u0010©\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020\u00062+\u0010¬\u0001\u001a&\u0012\u0004\u0012\u00020\u0018\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010ª\u0001j\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u0001`«\u0001H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J-\u0010±\u0001\u001a\u00020\u001e2\u0007\u0010¯\u0001\u001a\u00020\u00062\u0007\u0010°\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b±\u0001\u0010\u0097\u0001J$\u0010´\u0001\u001a\u00020\u001e*\b0²\u0001j\u0003`³\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0019\u0010¶\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b¶\u0001\u0010\fJ\u001a\u0010¸\u0001\u001a\u00020\u00062\u0007\u0010·\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b¸\u0001\u0010\fJ\u001d\u0010\u001b\u001a\u00020\u0006*\u00030¹\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u001b\u0010º\u0001J\u0019\u0010·\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b·\u0001\u0010\fJ \u0010·\u0001\u001a\u00020\u0006*\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b·\u0001\u0010º\u0001J\u001e\u0010>\u001a\u00020\u0006*\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b>\u0010º\u0001J)\u0010¼\u0001\u001a\u00020\u001e*\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u00062\u0007\u0010·\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J \u0010¾\u0001\u001a\u00020\u0006*\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¾\u0001\u0010º\u0001J \u0010¿\u0001\u001a\u00020\u0006*\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¿\u0001\u0010º\u0001J\u001d\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00030¹\u0001H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0018\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060pH\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J5\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010©\u0001\u001a\u00020\u00062\u0007\u0010Ä\u0001\u001a\u00020\u00062\u0007\u0010Å\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J,\u0010È\u0001\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0007\u0010Ä\u0001\u001a\u00020\u00062\u0007\u0010Å\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\"\u0010Ê\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010©\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\bÊ\u0001\u0010<J\u0019\u0010Ë\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\bË\u0001\u0010\fR\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ï\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\"\u0010Ò\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R+\u0010Ö\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00180Ô\u0001j\t\u0012\u0004\u0012\u00020\u0018`Õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R=\u0010¬\u0001\u001a&\u0012\u0004\u0012\u00020\u0018\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010ª\u0001j\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u0001`«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010Ø\u0001R#\u0010Û\u0001\u001a\f\u0012\u0005\u0012\u00030Ú\u0001\u0018\u00010Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010ß\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Þ\u0001R\u0019\u0010à\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Þ\u0001R\u0019\u0010á\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Þ\u0001R\u0019\u0010â\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010Þ\u0001R\u0019\u0010ã\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010Þ\u0001R\u0019\u0010ä\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010Þ\u0001R\u0019\u0010å\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010Þ\u0001R\u0017\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010Þ\u0001R\u0018\u0010ç\u0001\u001a\u00030æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0018\u0010é\u0001\u001a\u00030æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010è\u0001R\u0018\u0010ê\u0001\u001a\u00030æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010è\u0001R+\u0010ì\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010ë\u0001\u0018\u00010Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010Ü\u0001R)\u0010î\u0001\u001a\u00020\u00062\u0007\u0010í\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bî\u0001\u0010Þ\u0001\u001a\u0005\bï\u0001\u0010`R)\u0010ð\u0001\u001a\u00020\u00062\u0007\u0010í\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bð\u0001\u0010Þ\u0001\u001a\u0005\bñ\u0001\u0010`R'\u0010\u001b\u001a\u00020\u00062\u0007\u0010í\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u001b\u0010Þ\u0001\u001a\u0005\bò\u0001\u0010`R)\u0010ó\u0001\u001a\u00020\b2\u0007\u0010í\u0001\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0005\bõ\u0001\u0010dR\"\u0010ö\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0013\u0010ø\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\bø\u0001\u0010dR\u0013\u0010ú\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bù\u0001\u0010`R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010dR\u0013\u0010ü\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\bû\u0001\u0010dR\u0013\u0010þ\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\bý\u0001\u0010dR\u0016\u0010\u009c\u0001\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0001\u0010`R\u0016\u0010\u0081\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010`R\u0016\u0010Å\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0002"}, m5110d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "", "isNode", "(I)Z", "nodeCount", "(I)I", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "(II)Z", "node", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "parent", "(Landroidx/compose/runtime/Anchor;)I", "normalClose", "Ld6/s;", "close", "(Z)V", "reset", "()V", "value", "update", "(Ljava/lang/Object;)Ljava/lang/Object;", "appendSlot", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "trimTailSlots", "(I)V", "updateAux", "(Ljava/lang/Object;)V", "insertAux", "updateToTableMaps", "", "sourceInformation", "recordGroupSourceInformation", "(Ljava/lang/String;)V", "key", "recordGrouplessCallSourceInformationStart", "(ILjava/lang/String;)V", "recordGrouplessCallSourceInformationEnd", "updateNode", "updateParentNode", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "slotIndexOfGroupSlotIndex", "(II)I", "(IILjava/lang/Object;)Ljava/lang/Object;", "slotIndex", "clear", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "(II)Ljava/lang/Object;", "Lkotlin/Function2;", "block", "forEachTailSlot", "(IILr6/e;)V", "slotsStartIndex$runtime_release", "slotsStartIndex", "slotsEndIndex$runtime_release", "slotsEndIndex", "slotsEndAllIndex$runtime_release", "slotsEndAllIndex", "amount", "advanceBy", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "dataKey", "(ILjava/lang/Object;)V", "objectKey", "startNode", "(ILjava/lang/Object;Ljava/lang/Object;)V", "aux", "startData", "endGroup", "()I", "ensureStarted", "skipGroup", "removeGroup", "()Z", "", "groupSlots", "()Ljava/util/Iterator;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", "forAllData", "(ILr6/e;)V", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroup", "writer", "", "moveTo", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "bashCurrentGroup", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "anchorIndex", "toString", "()Ljava/lang/String;", "tryAnchor$runtime_release", "tryAnchor", "toDebugString", "verifyDataAnchors$runtime_release", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "rawUpdate", "Landroidx/compose/runtime/GroupSourceInformation;", "groupSourceInformationFor", "(ILjava/lang/String;)Landroidx/compose/runtime/GroupSourceInformation;", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "containsGroupMark", "containsAnyGroupMarks", "recalculateMarks", "updateContainsMark", "Landroidx/compose/runtime/PrioritySet;", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "updateContainsMarkNow", "childContainsAnyMarks", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "firstChild", "fixParentAnchorsFor", "(III)V", "moveGroupGapTo", "moveSlotGapTo", "(II)V", "clearSlotGap", "size", "insertGroups", "insertSlots", "start", "len", "removeGroups", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "removeSlots", "updateNodeOfGroup", "previousGapStart", "newGapStart", "updateAnchors", "gapStart", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "removeAnchors", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "moveAnchors", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "groupAsString", "(Ljava/lang/StringBuilder;I)V", "groupIndexToAddress", "dataIndex", "dataIndexToDataAddress", "", "([II)I", "address", "updateDataIndex", "([III)V", "nodeIndex", "auxIndex", "dataIndexes", "([I)Ljava/util/List;", "keys", "()Ljava/util/List;", "gapLen", "capacity", "dataIndexToDataAnchor", "(IIII)I", "dataAnchorToDataIndex", "(III)I", "parentIndexToAnchor", "parentAnchorToIndex", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "groupGapStart", "I", "groupGapLen", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "Landroidx/collection/MutableObjectList;", "deferredSlotWrites", "<set-?>", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "getParent", "closed", "Z", "getClosed", "pendingRecalculateMarks", "Landroidx/collection/MutableIntList;", "isGroupEnd", "getSlotsSize", "slotsSize", "getCollectingSourceInformation", "collectingSourceInformation", "getCollectingCalledInformation", "collectingCalledInformation", "getSize$runtime_release", "getCurrentGroupSlotIndex", "currentGroupSlotIndex", "getCapacity", "Companion", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Stack.kt\nandroidx/compose/runtime/IntStack\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n+ 10 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 11 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 12 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3666#2:3964\n3666#2:3965\n3732#2:3966\n3726#2:3967\n3672#2:3968\n3681#2:3969\n3666#2:3970\n3681#2:3997\n3681#2:4008\n3732#2:4067\n3666#2:4068\n3732#2:4080\n3732#2:4081\n3666#2:4082\n3666#2:4093\n3732#2:4094\n3666#2:4146\n3732#2:4147\n3825#2,6:4182\n3689#2:4188\n3698#2:4189\n3698#2:4190\n3708#2:4191\n3698#2:4192\n3708#2:4193\n3749#2,2:4194\n3746#2:4202\n3749#2,2:4203\n3777#2:4209\n3780#2,2:4215\n3777#2:4217\n3780#2,2:4223\n3780#2,2:4225\n3666#2:4231\n3746#2:4243\n3726#2:4244\n3732#2:4245\n3777#2:4246\n3746#2:4247\n3666#2:4248\n3777#2:4249\n3746#2:4265\n3746#2:4271\n3746#2:4282\n3777#2:4283\n3780#2,2:4284\n3663#2:4286\n3723#2:4287\n82#3:3971\n53#3:4056\n4643#4,5:3972\n4643#4,5:3980\n4665#4:3985\n4643#4,5:3986\n4665#4:3991\n4643#4,5:3992\n4643#4,5:3998\n4643#4,5:4003\n4643#4,5:4009\n4643#4,5:4026\n4643#4,5:4031\n4643#4,5:4036\n4643#4,5:4046\n4643#4,5:4057\n4643#4,5:4062\n4643#4,5:4075\n4643#4,5:4083\n4643#4,5:4088\n4643#4,5:4095\n4643#4,5:4100\n4643#4,5:4105\n4643#4,5:4110\n4643#4,5:4117\n4665#4:4122\n4643#4,5:4123\n4665#4:4128\n4643#4,5:4129\n4665#4:4134\n4643#4,5:4135\n4665#4:4140\n4643#4,5:4141\n4665#4:4148\n4643#4,5:4149\n4665#4:4154\n4643#4,5:4155\n4665#4:4168\n4643#4,5:4169\n4665#4:4196\n4643#4,5:4197\n4643#4,5:4210\n4643#4,5:4218\n4643#4,5:4232\n1#5:3977\n1#5:3979\n1#5:4164\n1#5:4178\n679#6:3978\n48#7,5:4014\n48#7,5:4041\n48#7,5:4051\n48#7,5:4250\n48#7,5:4255\n48#7,5:4260\n48#7,5:4266\n48#7,5:4272\n48#7,5:4277\n372#8,7:4019\n287#9,6:4069\n27#10,2:4115\n27#10,2:4205\n27#10,2:4207\n27#10,2:4227\n27#10,2:4229\n174#11,4:4160\n179#11,3:4165\n174#11,4:4174\n179#11,3:4179\n33#12,6:4237\n81#12,3:4288\n33#12,6:4291\n84#12:4297\n222#12,3:4298\n63#12,6:4301\n225#12:4307\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1328#1:3964\n1339#1:3965\n1342#1:3966\n1345#1:3967\n1350#1:3968\n1359#1:3969\n1390#1:3970\n1511#1:3997\n1527#1:4008\n1869#1:4067\n1887#1:4068\n1909#1:4080\n1944#1:4081\n1947#1:4082\n1996#1:4093\n1996#1:4094\n2405#1:4146\n2407#1:4147\n2519#1:4182,6\n2525#1:4188\n2527#1:4189\n2535#1:4190\n2538#1:4191\n2561#1:4192\n2573#1:4193\n2611#1:4194,2\n2656#1:4202\n2660#1:4203,2\n2706#1:4209\n2710#1:4215,2\n2718#1:4217\n2722#1:4223,2\n2800#1:4225,2\n2916#1:4231\n3056#1:4243\n3058#1:4244\n3060#1:4245\n3062#1:4246\n3064#1:4247\n3065#1:4248\n3097#1:4249\n3122#1:4265\n3128#1:4271\n3157#1:4282\n3163#1:4283\n3170#1:4284,2\n3179#1:4286\n3179#1:4287\n1418#1:3971\n1751#1:4056\n1443#1:3972,5\n1477#1:3980,5\n1495#1:3985\n1495#1:3986,5\n1500#1:3991\n1500#1:3992,5\n1511#1:3998,5\n1524#1:4003,5\n1527#1:4009,5\n1606#1:4026,5\n1620#1:4031,5\n1710#1:4036,5\n1715#1:4046,5\n1751#1:4057,5\n1760#1:4062,5\n1906#1:4075,5\n1968#1:4083,5\n1973#1:4088,5\n2001#1:4095,5\n2057#1:4100,5\n2058#1:4105,5\n2069#1:4110,5\n2159#1:4117,5\n2378#1:4122\n2378#1:4123,5\n2379#1:4128\n2379#1:4129,5\n2380#1:4134\n2380#1:4135,5\n2383#1:4140\n2383#1:4141,5\n2412#1:4148\n2412#1:4149,5\n2428#1:4154\n2428#1:4155,5\n2498#1:4168\n2498#1:4169,5\n2654#1:4196\n2654#1:4197,5\n2707#1:4210,5\n2719#1:4218,5\n2916#1:4232,5\n1462#1:3979\n2464#1:4164\n2506#1:4178\n1462#1:3978\n1537#1:4014,5\n1711#1:4041,5\n1749#1:4051,5\n3099#1:4250,5\n3103#1:4255,5\n3107#1:4260,5\n3123#1:4266,5\n3131#1:4272,5\n3135#1:4277,5\n1577#1:4019,7\n1892#1:4069,6\n2126#1:4115,2\n2680#1:4205,2\n2688#1:4207,2\n2834#1:4227,2\n2840#1:4229,2\n2464#1:4160,4\n2464#1:4165,3\n2506#1:4174,4\n2506#1:4179,3\n3012#1:4237,6\n3189#1:4288,3\n3189#1:4291,6\n3189#1:4297\n3193#1:4298,3\n3193#1:4301,6\n3193#1:4307\n*E\n"})
/* loaded from: classes.dex */
public final class SlotWriter {

    @NotNull
    private ArrayList<Anchor> anchors;

    @Nullable
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;

    @Nullable
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;

    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;

    @Nullable
    private MutableIntList pendingRecalculateMarks;

    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;

    @Nullable
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @NotNull
    private final SlotTable table;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final IntStack startStack = new IntStack();

    @NotNull
    private final IntStack endStack = new IntStack();

    @NotNull
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n27#2,2:3964\n3749#3,2:3966\n3746#3:3969\n3749#3,2:3970\n3780#3,2:3972\n3666#3:3985\n3732#3:3986\n1#4:3968\n33#5,6:3974\n4643#6,5:3980\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2210#1:3964,2\n2220#1:3966,2\n2230#1:3969\n2231#1:3970,2\n2250#1:3972,2\n2353#1:3985\n2353#1:3986\n2289#1:3974,6\n2349#1:3980,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zRemoveGroups;
            EmptyList emptyList;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i);
            int i8 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i8, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i) {
                fromWriter.moveGroupGapTo(i);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i9 = currentGroup * 5;
            AbstractC5802q.m5212y(i9, fromIndex * 5, fromWriter.groups, iArr, i * 5);
            Object[] objArr = toWriter.slots;
            int i10 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iDataIndex, objArr, i10, i8);
            int parent = toWriter.getParent();
            iArr[i9 + 2] = parent;
            int i11 = currentGroup - fromIndex;
            int i12 = currentGroup + iGroupSize;
            int iDataIndex3 = i10 - toWriter.dataIndex(iArr, currentGroup);
            int i13 = toWriter.slotsGapOwner;
            int i14 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i15 = i13;
            int i16 = currentGroup;
            while (true) {
                zRemoveGroups = false;
                if (i16 >= i12) {
                    break;
                }
                if (i16 != currentGroup) {
                    int i17 = (i16 * 5) + 2;
                    iArr[i17] = iArr[i17] + i11;
                }
                int[] iArr2 = iArr;
                int i18 = currentGroup;
                iArr2[(i16 * 5) + 4] = toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i16) + iDataIndex3, i15 >= i16 ? toWriter.slotsGapStart : 0, i14, length);
                if (i16 == i15) {
                    i15++;
                }
                i16++;
                currentGroup = i18;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i15;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i19 = iLocationOf; i19 < iLocationOf2; i19++) {
                    Anchor anchor = (Anchor) arrayList.get(i19);
                    anchor.setLocation$runtime_release(anchor.getLocation() + i11);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                emptyList = arrayList2;
            } else {
                emptyList = EmptyList.INSTANCE;
            }
            if (!emptyList.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = emptyList.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        Anchor anchor2 = (Anchor) emptyList.get(i20);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf = toWriter.sourceInformationOf(parent);
            if (groupSourceInformationSourceInformationOf != null) {
                int iGroupSize2 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i21 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i21 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(toWriter.groups, iGroupSize2) + iGroupSize2;
                }
                groupSourceInformationSourceInformationOf.addGroupAfter(toWriter, i21, currentGroup2);
            }
            int iParent = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z8 = iParent >= 0;
                    if (z8) {
                        fromWriter.startGroup();
                        fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                        fromWriter.startGroup();
                    }
                    fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                    boolean zRemoveGroup = fromWriter.removeGroup();
                    if (z8) {
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                    }
                    zRemoveGroups = zRemoveGroup;
                } else {
                    zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                    fromWriter.removeSlots(iDataIndex, i8, fromIndex - 1);
                }
            }
            if (zRemoveGroups) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i22 = toWriter.nodeCount;
            int i23 = iArr3[i9 + 1];
            toWriter.nodeCount = i22 + ((1073741824 & i23) == 0 ? i23 & RectListKt.Lower26Bits : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i12;
                toWriter.currentSlot = i10 + i8;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return emptyList;
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z8, boolean z9, boolean z10, int i8, Object obj) {
            if ((i8 & 32) != 0) {
                z10 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z8, z9, z10);
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m5110d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1 */
    public static final class C20141 implements Iterator<Object>, InterfaceC6560a {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        public C20141(int i, int i8, SlotWriter slotWriter) {
            this.$end = i8;
            this.this$0 = slotWriter;
            this.current = i;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i = this.current;
            this.current = i + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i) {
            this.current = i;
        }
    }

    public SlotWriter(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.calledByMap = slotTable.getCalledByMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return Integer.bitCount(iArr[(i * 5) + 1] >> 29) + dataIndex(iArr, i);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = groupSize(group) + group;
        while (iGroupSize < iGroupSize2) {
            if ((this.groups[(groupIndexToAddress(iGroupSize) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        AbstractC5802q.m5186M(null, this.slots, i, this.slotsGapLen + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1)) + dataIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        ArrayList arrayListM5240t0 = AbstractC5805t.m5240t0(AbstractC5805t.m5243w0(listDataAnchors$default, AbstractC5806u.m5260N(0, this.groupGapStart)), AbstractC5805t.m5243w0(listDataAnchors$default, AbstractC5806u.m5260N(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(arrayListM5240t0.size());
        int size = arrayListM5240t0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) arrayListM5240t0.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int iParentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(groupIndexToAddress(firstChild) * 5) + 2] = iParentIndexToAnchor;
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, iGroupSize, firstChild + 1);
            firstChild = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int getCurrentGroupSlotIndex() {
        MutableObjectList<Object> mutableObjectList;
        int iSlotsStartIndex$runtime_release = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return iSlotsStartIndex$runtime_release + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(this.parent)) == null) ? 0 : mutableObjectList.getSize());
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (iGroupIndexToAddress != i) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        sb.append('^');
        int i8 = iGroupIndexToAddress * 5;
        int i9 = i8 + 2;
        sb.append(parentAnchorToIndex(this.groups[i9]));
        sb.append(": key=");
        sb.append(this.groups[i8]);
        sb.append(", nodes=");
        int i10 = i8 + 1;
        sb.append(this.groups[i10] & RectListKt.Lower26Bits);
        sb.append(", dataAnchor=");
        sb.append(this.groups[i8 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.groups[i9]);
        if ((this.groups[i10] & BasicMeasure.EXACTLY) != 0) {
            sb.append(", node=" + SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]), 10));
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i11 = iSlotIndex; i11 < iDataIndex; i11++) {
                if (i11 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i11)]), 10));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int index) {
        return (this.groupGapLen * (index < this.groupGapStart ? 0 : 1)) + index;
    }

    private final GroupSourceInformation groupSourceInformationFor(int parent, String sourceInformation) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        Anchor anchor = anchor(parent);
        GroupSourceInformation groupSourceInformation = map.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, sourceInformation, 0);
            if (sourceInformation == null) {
                int iGroupSize = parent + 1;
                int i = this.currentGroup;
                while (iGroupSize < i) {
                    groupSourceInformation.reportGroup(this, iGroupSize);
                    iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                }
            }
            map.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i8 = this.groupGapStart;
            int i9 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i10 = length - i9;
            if (i9 < size) {
                int iMax = Math.max(Math.max(length * 2, i10 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i11 = iMax - i10;
                AbstractC5802q.m5212y(0, 0, iArr, iArr2, i8 * 5);
                AbstractC5802q.m5212y((i8 + i11) * 5, (i9 + i8) * 5, iArr, iArr2, length * 5);
                this.groups = iArr2;
                i9 = i11;
            }
            int i12 = this.currentGroupEnd;
            if (i12 >= i8) {
                this.currentGroupEnd = i12 + size;
            }
            int i13 = i8 + size;
            this.groupGapStart = i13;
            this.groupGapLen = i9 - size;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i10 > 0 ? dataIndex(i + size) : 0, this.slotsGapOwner >= i8 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i14 = i8; i14 < i13; i14++) {
                this.groups[(i14 * 5) + 4] = iDataIndexToDataAnchor;
            }
            int i15 = this.slotsGapOwner;
            if (i15 >= i8) {
                this.slotsGapOwner = i15 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i8 = this.slotsGapLen;
            if (i8 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i9 = length - i8;
                int iMax = Math.max(Math.max(length * 2, i9 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i10 = 0; i10 < iMax; i10++) {
                    objArr2[i10] = null;
                }
                int i11 = iMax - i9;
                int i12 = i8 + i;
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i12, objArr2, i + i11, length - i12);
                this.slots = objArr2;
                i8 = i11;
            }
            int i13 = this.currentSlotEnd;
            if (i13 >= i) {
                this.currentSlotEnd = i13 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i8 - size;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = listKeys$default.get(i);
            ((Number) obj).intValue();
            int i8 = this.groupGapStart;
            if (i < i8 || i >= i8 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int iAnchorIndex;
        int i = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= originalLocation && iAnchorIndex < i) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int i8 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Anchor anchor2 = (Anchor) arrayList.get(i9);
            int iAnchorIndex2 = anchorIndex(anchor2) + i8;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return slotWriter.moveFrom(slotTable, i, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i = this.groupGapLen;
        int i8 = this.groupGapStart;
        if (i8 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i8, index);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i9 = index * 5;
                int i10 = i * 5;
                int i11 = i8 * 5;
                if (index < i8) {
                    AbstractC5802q.m5212y(i10 + i9, i9, iArr, iArr, i11);
                } else {
                    AbstractC5802q.m5212y(i11, i11 + i10, iArr, iArr, i9 + i10);
                }
            }
            if (index < i8) {
                i8 = index + i;
            }
            int capacity = getCapacity();
            if (i8 >= capacity) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i8 < capacity) {
                int i12 = (i8 * 5) + 2;
                int i13 = this.groups[i12];
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i13), index);
                if (iParentIndexToAnchor != i13) {
                    this.groups[i12] = iParentIndexToAnchor;
                }
                i8++;
                if (i8 == index) {
                    i8 += i;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i = this.slotsGapLen;
        int i8 = this.slotsGapStart;
        int i9 = this.slotsGapOwner;
        if (i8 != index) {
            Object[] objArr = this.slots;
            if (index < i8) {
                System.arraycopy(objArr, index, objArr, index + i, i8 - index);
            } else {
                int i10 = i8 + i;
                System.arraycopy(objArr, i10, objArr, i8, (index + i) - i10);
            }
        }
        int iMin = Math.min(group + 1, getSize$runtime_release());
        if (i9 != iMin) {
            int length = this.slots.length - i;
            if (iMin < i9) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i9);
                int i11 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int i12 = (iGroupIndexToAddress * 5) + 4;
                    int i13 = this.groups[i12];
                    if (!(i13 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i12] = -((length - i13) + 1);
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i11) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i9);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int i14 = (iGroupIndexToAddress3 * 5) + 4;
                    int i15 = this.groups[i14];
                    if (!(i15 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i14] = i15 + length + 1;
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : (getSize$runtime_release() + index) - (-2);
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final Object rawUpdate(Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m10070isNotEmptyimpl(mutableIntList)) {
                m10088updateContainsMarkNowXpTMRCE(PrioritySet.m10072takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        int i = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i8 = iLocationOf + 1;
        int i9 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i9 == 0) {
                    i9 = iLocationOf + 1;
                }
                i8 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z8 = i8 < i9;
        if (z8) {
            this.anchors.subList(i8, i9).clear();
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i = this.slotsGapOwner;
            if (i > start) {
                this.slotsGapOwner = Math.max(start, i - len);
            }
            int i8 = this.currentGroupEnd;
            if (i8 >= this.groupGapStart) {
                this.currentGroupEnd = i8 - len;
            }
            int i9 = this.parent;
            if (containsGroupMark(i9)) {
                updateContainsMark(i9);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i = this.slotsGapLen;
            int i8 = start + len;
            moveSlotGapTo(i8, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i + len;
            AbstractC5802q.m5186M(null, this.slots, start, i8);
            int i9 = this.currentSlotEnd;
            if (i9 >= start) {
                this.currentSlotEnd = i9 - len;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorTryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime_release);
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int location$runtime_release;
        Anchor anchor2;
        int location$runtime_release2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); iLocationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(iLocationOf)).getLocation()) >= 0; iLocationOf++) {
                anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); iLocationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(iLocationOf2)).getLocation()) < 0 && (i = location$runtime_release2 + capacity) < newGapStart; iLocationOf2++) {
            anchor2.setLocation$runtime_release(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            MutableIntList mutableIntListM10065constructorimpl$default = this.pendingRecalculateMarks;
            if (mutableIntListM10065constructorimpl$default == null) {
                mutableIntListM10065constructorimpl$default = PrioritySet.m10065constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListM10065constructorimpl$default;
            }
            PrioritySet.m10062addimpl(mutableIntListM10065constructorimpl$default, group);
        }
    }

    /* renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m10088updateContainsMarkNowXpTMRCE(int group, MutableIntList set) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(group);
        int[] iArr = this.groups;
        if (((iArr[(iGroupIndexToAddress * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(group);
            if (iParent >= 0) {
                PrioritySet.m10062addimpl(set, iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i, int i8) {
        iArr[(i * 5) + 4] = dataIndexToDataAnchor(i8, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.groupIndexToAddress(r5)
            int[] r1 = r4.groups
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r5)
        L2e:
            java.lang.Object[] r5 = r4.slots
            int[] r1 = r4.groups
            int r0 = r4.nodeIndex(r1, r0)
            int r0 = r4.dataIndexToDataAddress(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int amount) {
        boolean z8 = false;
        if (!(amount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i = this.currentGroup + amount;
        if (i >= this.parent && i <= this.currentGroupEnd) {
            z8 = true;
        }
        if (!z8) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        int location$runtime_release = anchor.getLocation();
        return location$runtime_release < 0 ? getSize$runtime_release() + location$runtime_release : location$runtime_release;
    }

    public final void appendSlot(@NotNull Anchor anchor, @Nullable Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i8 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(anchor);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i >= iDataIndex) {
            i++;
            i8++;
        }
        this.slots[iDataIndex] = value;
        this.currentSlot = i;
        this.currentSlotEnd = i8;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    @Nullable
    public final Object clear(int slotIndex) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndex);
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = Composer.INSTANCE.getEmpty();
        return obj;
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z8 = this.insertCount > 0;
        int i = this.currentGroup;
        int i8 = this.currentGroupEnd;
        int i9 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i9);
        int i10 = this.nodeCount;
        int i11 = i - i9;
        int i12 = (iGroupIndexToAddress * 5) + 1;
        boolean z9 = (this.groups[i12] & BasicMeasure.EXACTLY) != 0;
        if (z8) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i9)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i13 = mutableObjectList._size;
                for (int i14 = 0; i14 < i13; i14++) {
                    rawUpdate(objArr[i14]);
                }
                mutableIntObjectMap.remove(i9);
            }
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i11);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i10);
            this.nodeCount = this.nodeCountStack.pop() + (z9 ? 1 : i10);
            int iParent = parent(this.groups, i9);
            this.parent = iParent;
            int size$runtime_release = iParent < 0 ? getSize$runtime_release() : groupIndexToAddress(iParent + 1);
            int iDataIndex = size$runtime_release >= 0 ? dataIndex(this.groups, size$runtime_release) : 0;
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return i10;
        }
        if (!(i == i8)) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        int[] iArr = this.groups;
        int i15 = iArr[i12] & RectListKt.Lower26Bits;
        SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, i11);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i10);
        int iPop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = iPop;
        int iParent2 = parent(this.groups, i9);
        int iPop2 = this.nodeCountStack.pop();
        this.nodeCount = iPop2;
        if (iParent2 == iPop) {
            this.nodeCount = iPop2 + (z9 ? 0 : i10 - i15);
            return i10;
        }
        int i16 = i11 - iGroupSize;
        int i17 = z9 ? 0 : i10 - i15;
        if (i16 != 0 || i17 != 0) {
            while (iParent2 != 0 && iParent2 != iPop && (i17 != 0 || i16 != 0)) {
                int iGroupIndexToAddress2 = groupIndexToAddress(iParent2);
                if (i16 != 0) {
                    SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i16);
                }
                if (i17 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress2, (iArr2[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits) + i17);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iGroupIndexToAddress2 * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
                    i17 = 0;
                }
                iParent2 = parent(iArr3, iParent2);
            }
        }
        this.nodeCount += i17;
        return i10;
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int index) {
        boolean z8 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != index) {
            if (index >= i && index < this.currentGroupEnd) {
                z8 = true;
            }
            if (!z8) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + i);
            }
            int i8 = this.currentGroup;
            int i9 = this.currentSlot;
            int i10 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i8;
            this.currentSlot = i9;
            this.currentSlotEnd = i10;
        }
    }

    public final void forAllData(int group, @NotNull InterfaceC6473e block) {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(groupSize(getCurrentGroup()) + getCurrentGroup()));
        for (int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(group)); iDataIndex2 < iDataIndex; iDataIndex2++) {
            block.invoke(Integer.valueOf(iDataIndex2), this.slots[dataIndexToDataAddress(iDataIndex2)]);
        }
    }

    public final void forEachTailSlot(int groupIndex, int count, @NotNull InterfaceC6473e block) {
        int iSlotsStartIndex$runtime_release = slotsStartIndex$runtime_release(groupIndex);
        int iSlotsEndIndex$runtime_release = slotsEndIndex$runtime_release(groupIndex);
        for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - count); iMax < iSlotsEndIndex$runtime_release; iMax++) {
            block.invoke(Integer.valueOf(iMax), this.slots[dataIndexToDataAddress(iMax)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    @NotNull
    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        return (iArr[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return this.groups[groupIndexToAddress(index) * 5];
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new C20141(iDataIndex, dataIndex(iArr, groupIndexToAddress(groupSize(i) + i)), this);
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i = this.parent;
        if (index <= i || index >= this.currentGroupEnd) {
            return i == 0 && index == 0;
        }
        return true;
    }

    public final void insertAux(@Nullable Object value) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i8 = this.currentSlot;
        if (i8 > iAuxIndex) {
            int i9 = i8 - iAuxIndex;
            if (!(i9 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i9 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = value;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i) * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final void markGroup(int group) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        int[] iArr = this.groups;
        int i = (iGroupIndexToAddress * 5) + 1;
        if ((iArr[i] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, iGroupIndexToAddress, true);
        if ((this.groups[i] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            return;
        }
        updateContainsMark(parent(group));
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int index, boolean removeSourceGroup) {
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.groupSize(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                List<Anchor> listMoveGroup = INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true, removeSourceGroup);
                slotWriterOpenWriter.close(true);
                return listMoveGroup;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = table.getSourceInformationMap$runtime_release();
        MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = table.getCalledByMap$runtime_release();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = sourceInformationMap$runtime_release;
        this.calledByMap = calledByMap$runtime_release;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
        return this.anchors;
    }

    public final void moveGroup(int offset) {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (offset < 0) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i = this.currentGroup;
        int i8 = this.parent;
        int i9 = this.currentGroupEnd;
        int iGroupSize = i;
        for (int i10 = offset; i10 > 0; i10--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (iGroupSize > i9) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i11 = iGroupSize + iGroupSize2;
        int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i11));
        int i12 = iDataIndex3 - iDataIndex2;
        insertSlots(i12, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i11) * 5;
        AbstractC5802q.m5212y(groupIndexToAddress(i) * 5, iGroupIndexToAddress, iArr, iArr, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i12 > 0) {
            Object[] objArr = this.slots;
            int iDataIndexToDataAddress = dataIndexToDataAddress(iDataIndex2 + i12);
            System.arraycopy(objArr, iDataIndexToDataAddress, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex3 + i12) - iDataIndexToDataAddress);
        }
        int i13 = iDataIndex2 + i12;
        int i14 = i13 - iDataIndex;
        int i15 = this.slotsGapStart;
        int i16 = this.slotsGapLen;
        int length = this.slots.length;
        int i17 = this.slotsGapOwner;
        int i18 = i + iGroupSize2;
        int i19 = i;
        while (i19 < i18) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i19);
            int i20 = i14;
            int iDataIndex4 = dataIndex(iArr, iGroupIndexToAddress2) - i20;
            int i21 = i15;
            if (i17 < iGroupIndexToAddress2) {
                i15 = 0;
            }
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(iDataIndex4, i15, i16, length));
            i19++;
            i15 = i21;
            i14 = i20;
        }
        moveAnchors(i11, i, iGroupSize2);
        if (removeGroups(i11, iGroupSize2)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i8, this.currentGroupEnd, i);
        if (i12 > 0) {
            removeSlots(i13, i12, i11 - 1);
        }
    }

    @NotNull
    public final List<Anchor> moveIntoGroupFrom(int offset, @NotNull SlotTable table, int index) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.currentGroup;
        int i8 = this.currentSlot;
        int i9 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, slotWriterOpenWriter, index, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.currentSlot = i8;
            this.currentSlotEnd = i9;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int offset, @NotNull SlotWriter writer) {
        if (!(writer.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!anchor.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i = this.currentGroup;
        if (!(i <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, this, iAnchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(iParent);
        boolean z8 = iNodeCount > 0;
        while (iParent >= i) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z8) {
                int[] iArr2 = this.groups;
                int i8 = iArr2[(iGroupIndexToAddress * 5) + 1];
                if ((1073741824 & i8) != 0) {
                    z8 = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, (i8 & RectListKt.Lower26Bits) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z8) {
            if (!(this.nodeCount >= iNodeCount)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup$default;
    }

    @Nullable
    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return this.groups[(groupIndexToAddress(index) * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final void recordGroupSourceInformation(@NotNull String sourceInformation) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationGroupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationGroupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    public final void recordGrouplessCallSourceInformationStart(int key, @NotNull String value) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, key, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationGroupSourceInformationFor != null) {
                groupSourceInformationGroupSourceInformationFor.startGrouplessCall(key, value, getCurrentGroupSlotIndex());
            }
        }
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime_release;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i8 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        int iSkipGroup = skipGroup();
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(this.parent);
        if (groupSourceInformationSourceInformationOf != null && (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i)) != null) {
            groupSourceInformationSourceInformationOf.removeAnchor(anchorTryAnchor$runtime_release);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m10070isNotEmptyimpl(mutableIntList) && PrioritySet.m10071peekimpl(mutableIntList) >= i) {
                PrioritySet.m10072takeMaximpl(mutableIntList);
            }
        }
        boolean zRemoveGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i8;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(@NotNull Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(@Nullable Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = value;
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress) + this.currentGroup;
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i = this.groups[(iGroupIndexToAddress * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & RectListKt.Lower26Bits;
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i = iSlotIndex + index;
        if (!(i >= iSlotIndex && i < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
        }
        return i;
    }

    public final int slotsEndAllIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupSize(groupIndex) + groupIndex));
    }

    public final int slotsEndIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
    }

    public final int slotsStartIndex$runtime_release(int groupIndex) {
        return slotIndex(this.groups, groupIndexToAddress(groupIndex));
    }

    public final void startData(int key, @Nullable Object objectKey, @Nullable Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int key, @Nullable Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    @NotNull
    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        sb.append("  parent:    " + this.parent);
        sb.append('\n');
        sb.append("  current:   " + this.currentGroup);
        sb.append('\n');
        sb.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        sb.append('\n');
        sb.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("  gap owner: ");
        sb2.append(this.slotsGapOwner);
        sb.append(sb2.toString());
        sb.append('\n');
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void trimTailSlots(int count) {
        if (!(count > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1)) - count;
        if (!(iDataIndex >= iSlotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(iDataIndex, count, i);
        int i8 = this.currentSlot;
        if (i8 >= iSlotIndex) {
            this.currentSlot = i8 - count;
        }
    }

    @Nullable
    public final Anchor tryAnchor$runtime_release(int group) {
        if (group < 0 || group >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, group, getSize$runtime_release());
    }

    @Nullable
    public final Object update(@Nullable Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(value);
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        AbstractC5824e abstractC5824e = null;
        int i = 1;
        int i8 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(i8, i, abstractC5824e);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i9 = this.parent;
        MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i9);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(i8, i, abstractC5824e);
            mutableIntObjectMap.set(i9, mutableObjectList);
        }
        mutableObjectList.add(value);
        return Composer.INSTANCE.getEmpty();
    }

    public final void updateAux(@Nullable Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = value;
    }

    public final void updateNode(@Nullable Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateParentNode(@Nullable Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void verifyDataAnchors$runtime_release() {
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        while (i8 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i8);
            int[] iArr = this.groups;
            int i10 = iArr[(iGroupIndexToAddress * 5) + 4];
            int iDataIndex = dataIndex(iArr, iGroupIndexToAddress);
            if (!(iDataIndex >= i9)) {
                StringBuilder sbM99x = AbstractC0037f.m99x("Data index out of order at ", ", previous = ", i8, ", current = ", i9);
                sbM99x.append(iDataIndex);
                PreconditionsKt.throwIllegalStateException(sbM99x.toString());
            }
            if (!(iDataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + iDataIndex + ", out of bound at " + i8);
            }
            if (i10 < 0 && !z8) {
                if (!(i == i8)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i + " found gap at " + i8);
                }
                z8 = true;
            }
            i8++;
            i9 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i = this.groupGapStart;
        int i8 = this.groupGapLen;
        int capacity = getCapacity();
        int i9 = 0;
        while (true) {
            if (i9 >= i) {
                break;
            }
            if (!(this.groups[(i9 * 5) + 2] > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i9);
            }
            i9++;
        }
        for (int i10 = i8 + i; i10 < capacity; i10++) {
            int i11 = this.groups[(i10 * 5) + 2];
            if (parentAnchorToIndex(i11) < i) {
                if (!(i11 > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i10);
                }
            } else if (!(i11 <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    public final int parent(@NotNull Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    @Nullable
    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i = index + iSlotIndex;
        if (iSlotIndex > i || i >= iDataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i)];
    }

    public final void startData(int key, @Nullable Object aux) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    public final void startNode(int key, @Nullable Object objectKey, @Nullable Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i) * 5) + 2]);
    }

    public final boolean isNode(int index) {
        return (this.groups[(groupIndexToAddress(index) * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    @Nullable
    public final Object set(int index, @Nullable Object value) {
        return set(getCurrentGroup(), index, value);
    }

    public final void startGroup(int key) {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(key, companion.getEmpty(), false, companion.getEmpty());
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    @Nullable
    public final Object set(int group, int index, @Nullable Object value) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = value;
        return obj;
    }

    public final void startGroup(int key, @Nullable Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int iGroupSize;
        GroupSourceInformation groupSourceInformationSourceInformationOf;
        int i = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i8 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i8));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i8);
            Composer.Companion companion = Composer.INSTANCE;
            ?? r12 = objectKey != companion.getEmpty() ? 1 : 0;
            ?? r13 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i8) {
                iDataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, key, isNode, r12, r13, this.parent, iDataIndexToDataAnchor);
            int i9 = (isNode ? 1 : 0) + r12 + r13;
            if (i9 > 0) {
                insertSlots(i9, i8);
                Object[] objArr2 = this.slots;
                int i10 = this.currentSlot;
                if (isNode) {
                    objArr2[i10] = aux;
                    i10++;
                }
                if (r12 != 0) {
                    objArr2[i10] = objectKey;
                    i10++;
                }
                if (r13 != 0) {
                    objArr2[i10] = aux;
                    i10++;
                }
                this.currentSlot = i10;
            }
            this.nodeCount = 0;
            iGroupSize = i8 + 1;
            this.parent = i8;
            this.currentGroup = iGroupSize;
            if (i >= 0 && (groupSourceInformationSourceInformationOf = sourceInformationOf(i)) != null) {
                groupSourceInformationSourceInformationOf.reportGroup(this, i8);
            }
        } else {
            this.startStack.push(i);
            saveCurrentGroupEnd();
            int i11 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i11);
            if (!AbstractC5830k.m5325b(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits;
            this.parent = i11;
            this.currentGroup = i11 + 1;
            iGroupSize = i11 + SlotTableKt.groupSize(iArr, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
