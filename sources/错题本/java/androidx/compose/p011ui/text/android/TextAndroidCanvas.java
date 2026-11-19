package androidx.compose.p011ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J+\u0010$\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010&JA\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b$\u0010,J9\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010-J)\u0010/\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00101J?\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b/\u00102J7\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00103J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u0010\u0017J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u0010\u001cJ\u001f\u0010:\u001a\u00020\u00052\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020'H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00052\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010;J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020'H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00052\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0016¢\u0006\u0004\bB\u0010;J\u0019\u0010E\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bG\u0010FJ\u0017\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020CH\u0017¢\u0006\u0004\bI\u0010FJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010NJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010OJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0016¢\u0006\u0004\bM\u0010PJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010\fJ7\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010QJ/\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\bM\u0010RJ/\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\bM\u0010SJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0017¢\u0006\u0004\bT\u0010PJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020\bH\u0017¢\u0006\u0004\bT\u0010\fJ/\u0010T\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0017¢\u0006\u0004\bT\u0010RJ/\u0010T\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0017¢\u0006\u0004\bT\u0010SJ\u001f\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bW\u0010XJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010YJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bZ\u0010YJ\u0011\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020\n2\u0006\u0010J\u001a\u00020 2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010dJ\u0017\u0010c\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0017¢\u0006\u0004\bc\u0010PJ\u001f\u0010c\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010eJ\u0017\u0010c\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bc\u0010YJ7\u0010c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010fJ/\u0010c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0017¢\u0006\u0004\bc\u0010RJ\u0017\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020 H\u0016¢\u0006\u0004\bi\u0010lJ\u001f\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010mJ7\u0010r\u001a\u00020\u00052\u0006\u0010n\u001a\u00020 2\u0006\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'2\u0006\u0010q\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\br\u0010sJO\u0010r\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'2\u0006\u0010q\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\br\u0010tJ/\u0010y\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u0015H\u0016¢\u0006\u0004\by\u0010zJ1\u0010{\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b{\u0010|J3\u0010{\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010}\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b{\u0010~J3\u0010{\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010}\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b{\u0010\u007fJc\u0010{\u001a\u00020\u00052\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0007\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0005\b{\u0010\u0089\u0001Jc\u0010{\u001a\u00020\u00052\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0005\b{\u0010\u008a\u0001J*\u0010{\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0005\b{\u0010\u008b\u0001J^\u0010\u0092\u0001\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0007\u0010\u008c\u0001\u001a\u00020\u00152\u0007\u0010\u008d\u0001\u001a\u00020\u00152\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J5\u0010\u0097\u0001\u001a\u00020\u00052\u0007\u0010\u0094\u0001\u001a\u00020'2\u0007\u0010\u0095\u0001\u001a\u00020'2\u0007\u0010\u0096\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001a\u0010\u009a\u0001\u001a\u00020\u00052\u0007\u0010\u0099\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u001cJ\u001c\u0010\u009a\u0001\u001a\u00020\u00052\b\u0010\u0099\u0001\u001a\u00030\u009b\u0001H\u0017¢\u0006\u0006\b\u009a\u0001\u0010\u009c\u0001J%\u0010\u009a\u0001\u001a\u00020\u00052\u0007\u0010\u0099\u0001\u001a\u00020\u00152\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009f\u0001J%\u0010\u009a\u0001\u001a\u00020\u00052\u0007\u0010\u0099\u0001\u001a\u00020\u00152\b\u0010\u009e\u0001\u001a\u00030 \u0001H\u0017¢\u0006\u0006\b\u009a\u0001\u0010¡\u0001J&\u0010\u009a\u0001\u001a\u00020\u00052\b\u0010\u0099\u0001\u001a\u00030\u009b\u00012\b\u0010\u009e\u0001\u001a\u00030 \u0001H\u0017¢\u0006\u0006\b\u009a\u0001\u0010¢\u0001J>\u0010§\u0001\u001a\u00020\u00052\u0007\u0010£\u0001\u001a\u00020'2\u0007\u0010¤\u0001\u001a\u00020'2\u0007\u0010¥\u0001\u001a\u00020'2\u0007\u0010¦\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J6\u0010«\u0001\u001a\u00020\u00052\b\u0010©\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J$\u0010«\u0001\u001a\u00020\u00052\b\u0010©\u0001\u001a\u00030\u008e\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b«\u0001\u0010\u00ad\u0001J\"\u0010®\u0001\u001a\u00020\u00052\u0006\u0010n\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J:\u0010®\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b®\u0001\u0010¨\u0001J\u001a\u0010°\u0001\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J.\u0010´\u0001\u001a\u00020\u00052\b\u0010³\u0001\u001a\u00030²\u00012\u0006\u0010k\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J.\u0010´\u0001\u001a\u00020\u00052\b\u0010³\u0001\u001a\u00030²\u00012\u0006\u0010k\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0006\b´\u0001\u0010¶\u0001J\"\u0010·\u0001\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J,\u0010¹\u0001\u001a\u00020\u00052\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J8\u0010»\u0001\u001a\u00020\u00052\n\u0010©\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b»\u0001\u0010¬\u0001J$\u0010»\u0001\u001a\u00020\u00052\b\u0010©\u0001\u001a\u00030\u008e\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b»\u0001\u0010\u00ad\u0001J@\u0010À\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030¼\u00012\u0007\u0010¾\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u00152\b\u0010¿\u0001\u001a\u00030\u008e\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J.\u0010À\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030Â\u00012\b\u0010¿\u0001\u001a\u00030\u008e\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÀ\u0001\u0010Ã\u0001J\"\u0010Ä\u0001\u001a\u00020\u00052\u0006\u0010J\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÄ\u0001\u0010¯\u0001J\"\u0010Ä\u0001\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J:\u0010Ä\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÄ\u0001\u0010¨\u0001J*\u0010Æ\u0001\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u0015H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J4\u0010Ê\u0001\u001a\u00020\u00052\u0006\u0010J\u001a\u00020 2\u0007\u0010È\u0001\u001a\u00020'2\u0007\u0010É\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001JL\u0010Ê\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0007\u0010È\u0001\u001a\u00020'2\u0007\u0010É\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÊ\u0001\u0010Ì\u0001JP\u0010Ó\u0001\u001a\u00020\u00052\u0007\u0010Í\u0001\u001a\u00020 2\u0007\u0010Î\u0001\u001a\u00020'2\u0007\u0010Ï\u0001\u001a\u00020'2\u0007\u0010Ð\u0001\u001a\u00020 2\u0007\u0010Ñ\u0001\u001a\u00020'2\u0007\u0010Ò\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J@\u0010Ó\u0001\u001a\u00020\u00052\u0007\u0010Í\u0001\u001a\u00020 2\b\u0010Õ\u0001\u001a\u00030\u008e\u00012\u0007\u0010Ð\u0001\u001a\u00020 2\b\u0010Ö\u0001\u001a\u00030\u008e\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÓ\u0001\u0010×\u0001JS\u0010ß\u0001\u001a\u00020\u00052\b\u0010Ø\u0001\u001a\u00030\u0080\u00012\u0007\u0010Ù\u0001\u001a\u00020\u00152\b\u0010Ú\u0001\u001a\u00030\u008e\u00012\u0007\u0010Û\u0001\u001a\u00020\u00152\u0007\u0010Ü\u0001\u001a\u00020\u00152\b\u0010Þ\u0001\u001a\u00030Ý\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bß\u0001\u0010à\u0001JH\u0010á\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030¼\u00012\u0007\u0010¾\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bá\u0001\u0010â\u0001J6\u0010á\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030Â\u00012\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bá\u0001\u0010ã\u0001JH\u0010á\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030Â\u00012\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010å\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bá\u0001\u0010æ\u0001JH\u0010á\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030ç\u00012\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010å\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bá\u0001\u0010è\u0001JP\u0010ë\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030¼\u00012\u0007\u0010¾\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u00152\u0006\u0010V\u001a\u00020U2\u0007\u0010é\u0001\u001a\u00020'2\u0007\u0010ê\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bë\u0001\u0010ì\u0001J>\u0010ë\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030Â\u00012\u0006\u0010V\u001a\u00020U2\u0007\u0010é\u0001\u001a\u00020'2\u0007\u0010ê\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bë\u0001\u0010í\u0001Jc\u0010ñ\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030¼\u00012\u0007\u0010¾\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u00152\u0007\u0010î\u0001\u001a\u00020\u00152\u0007\u0010ï\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0007\u0010ð\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bñ\u0001\u0010ò\u0001Jc\u0010ñ\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030ç\u00012\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010å\u0001\u001a\u00020\u00152\u0007\u0010ó\u0001\u001a\u00020\u00152\u0007\u0010ô\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0007\u0010ð\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bñ\u0001\u0010õ\u0001Jc\u0010ñ\u0001\u001a\u00020\u00052\b\u0010½\u0001\u001a\u00030ö\u00012\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010å\u0001\u001a\u00020\u00152\u0007\u0010ó\u0001\u001a\u00020\u00152\u0007\u0010ô\u0001\u001a\u00020\u00152\u0007\u0010\u0084\u0001\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020'2\u0007\u0010ð\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bñ\u0001\u0010÷\u0001J\u0088\u0001\u0010\u0080\u0002\u001a\u00020\u00052\b\u0010\u009e\u0001\u001a\u00030ø\u00012\u0007\u0010ù\u0001\u001a\u00020\u00152\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u00152\n\u0010ú\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0007\u0010û\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u00152\n\u0010ý\u0001\u001a\u0005\u0018\u00010ü\u00012\u0007\u0010þ\u0001\u001a\u00020\u00152\u0007\u0010ÿ\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u001c\u0010\u0084\u0002\u001a\u00020\u00052\b\u0010\u0083\u0002\u001a\u00030\u0082\u0002H\u0017¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0019\u0010\u0086\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002¨\u0006\u0088\u0002"}, m5110d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "<init>", "()V", "canvas", "Ld6/s;", "setCanvas", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "alpha", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", RequestParameters.X_OSS_RESTORE, "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "a", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "src", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", TypedValues.CycleType.S_WAVE_OFFSET, "stride", "x", "y", "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", TypedValues.Custom.S_COLOR, "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "nativeCanvas", "Landroid/graphics/Canvas;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(@NotNull Path path) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatO.clipOutPath(canvas, path);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@NotNull RectF rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatO.clipOutRect(canvas, rect);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(@NotNull RectF rect, @NotNull Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void concat(@Nullable Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.disableZ(canvas);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a9, int r, int g6, int b6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawARGB(a9, r, g6, b6);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawArc(@NotNull RectF oval, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawArc(oval, startAngle, sweepAngle, useCenter, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, float left, float top2, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, left, top2, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@NotNull Bitmap bitmap, int meshWidth, int meshHeight, @NotNull float[] verts, int vertOffset, @Nullable int[] colors, int colorOffset, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, meshWidth, meshHeight, verts, vertOffset, colors, colorOffset, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawCircle(cx, cy, radius, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(color);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawDoubleRoundRect(@NotNull RectF outer, float outerRx, float outerRy, @NotNull RectF inner, float innerRx, float innerRy, @NotNull Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawDoubleRoundRect(canvas, outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(@NotNull int[] glyphIds, int glyphIdOffset, @NotNull float[] positions, int positionOffset, int glyphCount, @NotNull Font font, @NotNull Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatS.drawGlyphs(canvas, glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawLine(startX, startY, stopX, stopY, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, int offset, int count, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawLines(pts, offset, count, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawOval(@NotNull RectF oval, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawOval(oval, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@NotNull NinePatch patch, @NotNull Rect dst, @Nullable Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatS.drawPatch(canvas, patch, dst, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x3, float y2, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPoint(x3, y2, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@Nullable float[] pts, int offset, int count, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPoints(pts, offset, count, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(@NotNull char[] text, int index, int count, @NotNull float[] pos, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPosText(text, index, count, pos, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r, int g6, int b6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRGB(r, g6, b6);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull RectF rect, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawRenderNode(@NotNull RenderNode renderNode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawRenderNode(canvas, renderNode);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@NotNull RectF rect, float rx, float ry, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRoundRect(rect, rx, ry, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull char[] text, int index, int count, float x3, float y2, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(text, index, count, x3, y2, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull char[] text, int index, int count, @NotNull Path path, float hOffset, float vOffset, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextOnPath(text, index, count, path, hOffset, vOffset, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@NotNull char[] text, int index, int count, int contextIndex, int contextCount, float x3, float y2, boolean isRtl, @NotNull Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatM.drawTextRun(canvas, text, index, count, contextIndex, contextCount, x3, y2, isRtl, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@NotNull Canvas.VertexMode mode, int vertexCount, @NotNull float[] verts, int vertOffset, @Nullable float[] texs, int texOffset, @Nullable int[] colors, int colorOffset, @Nullable short[] indices, int indexOffset, int indexCount, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawVertices(mode, vertexCount, verts, vertOffset, texs, texOffset, colors, colorOffset, indices, indexOffset, indexCount, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.enableZ(canvas);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@NotNull Rect bounds) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getDensity();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Nullable
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getHeight();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void getMatrix(@NotNull Matrix ctm) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.getMatrix(ctm);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.getWidth();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(@NotNull RectF rect, @NotNull Canvas.EdgeType type) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(rect, type);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.restore();
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.restoreToCount(saveCount);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.rotate(degrees);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.save();
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(@Nullable RectF bounds, @Nullable Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(bounds, paint, saveFlags);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(@Nullable RectF bounds, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(bounds, alpha, saveFlags);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.scale(sx, sy);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@Nullable Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    public final void setCanvas(@NotNull Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setDensity(density);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@Nullable DrawFilter filter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setDrawFilter(filter);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@Nullable Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.skew(sx, sy);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.translate(dx, dy);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@NotNull Rect rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatO.clipOutRect(canvas, rect);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawArc(left, top2, right, bottom, startAngle, sweepAngle, useCenter, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect src, @NotNull RectF dst, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, src, dst, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawColor(long color) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawColor(canvas, color);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawLines(pts, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top2, float right, float bottom, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawOval(left, top2, right, bottom, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@NotNull NinePatch patch, @NotNull RectF dst, @Nullable Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatS.drawPatch(canvas, patch, dst, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull RectF dst) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPicture(picture, dst);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@NotNull float[] pts, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPoints(pts, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(@NotNull String text, @NotNull float[] pos, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPosText(text, pos, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull Rect r, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRect(r, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top2, float right, float bottom, float rx, float ry, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRoundRect(left, top2, right, bottom, rx, ry, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, float x3, float y2, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(text, x3, y2, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull String text, @NotNull Path path, float hOffset, float vOffset, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawTextOnPath(text, path, hOffset, vOffset, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@NotNull RectF rect) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatR.quickReject(canvas, rect);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@Nullable RectF bounds, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(bounds, paint);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@Nullable RectF bounds, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(bounds, alpha);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float left, float top2, float right, float bottom) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatO.clipOutRect(canvas, left, top2, right, bottom);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect src, @NotNull Rect dst, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, src, dst, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, @NotNull PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawColor(color, mode);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull Rect dst) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawPicture(picture, dst);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top2, float right, float bottom, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawRect(left, top2, right, bottom, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, int start, int end, float x3, float y2, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(text, start, end, x3, y2, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType type) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(path, type);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(float left, float top2, float right, float bottom, @Nullable Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(left, top2, right, bottom, paint, saveFlags);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(float left, float top2, float right, float bottom, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(left, top2, right, bottom, alpha, saveFlags);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int left, int top2, int right, int bottom) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatO.clipOutRect(canvas, left, top2, right, bottom);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] colors, int offset, int stride, float x3, float y2, int width, int height, boolean hasAlpha, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(colors, offset, stride, x3, y2, width, height, hasAlpha, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawColor(int color, @NotNull BlendMode mode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawColor(canvas, color, mode);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull CharSequence text, int start, int end, float x3, float y2, @NotNull Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawText(text, start, end, x3, y2, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@NotNull Path path) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatR.quickReject(canvas, path);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top2, float right, float bottom, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayer(left, top2, right, bottom, paint);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top2, float right, float bottom, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.saveLayerAlpha(left, top2, right, bottom, alpha);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(float left, float top2, float right, float bottom, @NotNull Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(left, top2, right, bottom, op);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] colors, int offset, int stride, int x3, int y2, int width, int height, boolean hasAlpha, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(colors, offset, stride, x3, y2, width, height, hasAlpha, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawColor(long color, @NotNull BlendMode mode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawColor(canvas, color, mode);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawDoubleRoundRect(@NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawDoubleRoundRect(canvas, outer, outerRadii, inner, innerRadii, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@NotNull CharSequence text, int start, int end, int contextStart, int contextEnd, float x3, float y2, boolean isRtl, @NotNull Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatM.drawTextRun(canvas, text, start, end, contextStart, contextEnd, x3, y2, isRtl, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(float left, float top2, float right, float bottom, @NotNull Canvas.EdgeType type) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.quickReject(left, top2, right, bottom, type);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top2, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(left, top2, right, bottom);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, @Nullable Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float left, float top2, float right, float bottom) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvasCompatR.quickReject(canvas, left, top2, right, bottom);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top2, int right, int bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            return canvas.clipRect(left, top2, right, bottom);
        }
        AbstractC5830k.m5339p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public void drawTextRun(@NotNull MeasuredText text, int start, int end, int contextStart, int contextEnd, float x3, float y2, boolean isRtl, @NotNull Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas != null) {
            canvasCompatQ.drawTextRun(canvas, text, start, end, contextStart, contextEnd, x3, y2, isRtl, paint);
        } else {
            AbstractC5830k.m5339p("nativeCanvas");
            throw null;
        }
    }
}
