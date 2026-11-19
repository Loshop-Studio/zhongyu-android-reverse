package android.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010$\n\u0002\b\f\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010&\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u0004\u0018\u00010#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u0015\u0010-\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\u0015\u00104\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b5\u00106J\u0015\u0010;\u001a\u0002082\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010>\u001a\u0004\u0018\u0001082\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b<\u0010=J-\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bC\u0010DJ$\u0010E\u001a\u00028\u0000\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bC\u0010FJ/\u0010H\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bG\u0010DJ&\u0010H\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bG\u0010FJ-\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010@*\u00020I2\u0006\u0010\b\u001a\u00020\u00072\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bK\u0010LJ$\u0010M\u001a\u00028\u0000\"\n\b\u0000\u0010@\u0018\u0001*\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bK\u0010NJ/\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010@*\u00020I2\u0006\u0010\b\u001a\u00020\u00072\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bO\u0010LJ&\u0010P\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010@\u0018\u0001*\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bO\u0010NJ\u0015\u0010T\u001a\u00020Q2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bU\u0010SJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u0004\u0018\u00010W2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b[\u0010YJ\u001f\u0010`\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b^\u0010_J!\u0010b\u001a\u000e\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\ba\u0010_J\u0015\u0010e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bf\u0010dJ\u001b\u0010k\u001a\b\u0012\u0004\u0012\u0002010h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bi\u0010jJ\u001d\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bl\u0010jJ\u001b\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001d0h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bn\u0010jJ\u001d\u0010q\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bp\u0010jJ\u001f\u0010s\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\br\u0010jJ!\u0010u\u001a\u000e\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bt\u0010jJ\u001b\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00070h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bv\u0010jJ\u001d\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010h2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bx\u0010jJ3\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bz\u0010{J*\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000h\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bz\u0010jJ5\u0010~\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010h\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\b}\u0010{J,\u0010~\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010h\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b}\u0010jJ\u0018\u0010\u0082\u0001\u001a\u00020\u007f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J\u0019\u0010\u0088\u0001\u001a\u00030\u0085\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0085\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u001e\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J \u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u008e\u0001\u0010\u008c\u0001J\u0019\u0010\u0093\u0001\u001a\u00030\u0090\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001b\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0090\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0094\u0001\u0010\u0092\u0001J\u0019\u0010\u0099\u0001\u001a\u00030\u0096\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u009a\u0001\u0010\u0098\u0001J\u0019\u0010\u009f\u0001\u001a\u00030\u009c\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001b\u0010¡\u0001\u001a\u0005\u0018\u00010\u009c\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b \u0001\u0010\u009e\u0001J\u0019\u0010¥\u0001\u001a\u00030¢\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010§\u0001\u001a\u0005\u0018\u00010¢\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b¦\u0001\u0010¤\u0001J\u001e\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b¨\u0001\u0010©\u0001J \u0010¬\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010]2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b«\u0001\u0010©\u0001J6\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J-\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b\u00ad\u0001\u0010°\u0001J8\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010]\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0006\b±\u0001\u0010®\u0001J/\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010]\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b±\u0001\u0010°\u0001J7\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000³\u0001\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0006\b´\u0001\u0010µ\u0001J.\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000³\u0001\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b´\u0001\u0010·\u0001J9\u0010¹\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010³\u0001\"\b\b\u0000\u0010@*\u00020?2\u0006\u0010\b\u001a\u00020\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0006\b¸\u0001\u0010µ\u0001J0\u0010¹\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010³\u0001\"\n\b\u0000\u0010@\u0018\u0001*\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b¸\u0001\u0010·\u0001J\u001c\u0010¼\u0001\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\bº\u0001\u0010»\u0001J \u0010¾\u0001\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0006\b½\u0001\u0010»\u0001J\u0010\u0010Á\u0001\u001a\u000201¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0010\u0010Ä\u0001\u001a\u00020\u000f¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0017\u0010Æ\u0001\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0005\bÅ\u0001\u0010\u0011J\u001a\u0010È\u0001\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0005\bÇ\u0001\u0010\u0011J\u001d\u0010Ì\u0001\u001a\u00020\u000f2\u000b\u0010É\u0001\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0010\u0010Î\u0001\u001a\u000201¢\u0006\u0006\bÍ\u0001\u0010À\u0001J\u0010\u0010Ñ\u0001\u001a\u00020\u0007¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u001f\u0010Õ\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ò\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0013\u0010×\u0001\u001a\u00020\u0007HÖ\u0001¢\u0006\u0006\bÖ\u0001\u0010Ð\u0001J\u0013\u0010Ù\u0001\u001a\u000201HÖ\u0001¢\u0006\u0006\bØ\u0001\u0010À\u0001J\u001e\u0010Ü\u0001\u001a\u00020\u000f2\t\u0010É\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ý\u0001\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006Þ\u0001"}, m5110d2 = {"Landroidx/savedstate/SavedStateReader;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "Landroid/os/IBinder;", "getBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;", "getBinder", "getBinderOrNull-impl", "getBinderOrNull", "", "getBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "getBoolean", "getBooleanOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanOrNull", "", "getChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;)C", "getChar", "getCharOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Character;", "getCharOrNull", "", "getCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/CharSequence;", "getCharSequence", "getCharSequenceOrNull-impl", "getCharSequenceOrNull", "", "getDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;)D", "getDouble", "getDoubleOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "getDoubleOrNull", "", "getFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;)F", "getFloat", "getFloatOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "getFloatOrNull", "", "getInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;)I", "getInt", "getIntOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "getIntOrNull", "", "getLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;)J", "getLong", "getLongOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "getLongOrNull", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "Ly6/c;", "parcelableClass", "getParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ly6/c;)Landroid/os/Parcelable;", "getParcelable", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "getParcelableOrNull-impl", "getParcelableOrNull", "Ljava/io/Serializable;", "serializableClass", "getJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ly6/c;)Ljava/io/Serializable;", "getJavaSerializable", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "getJavaSerializableOrNull-impl", "getJavaSerializableOrNull", "Landroid/util/Size;", "getSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/Size;", "getSize", "getSizeOrNull-impl", "getSizeOrNull", "Landroid/util/SizeF;", "getSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SizeF;", "getSizeF", "getSizeFOrNull-impl", "getSizeFOrNull", "", "getSavedStateArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;", "getSavedStateArray", "getSavedStateArrayOrNull-impl", "getSavedStateArrayOrNull", "getString-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "getString", "getStringOrNull-impl", "getStringOrNull", "", "getIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getIntList", "getIntListOrNull-impl", "getIntListOrNull", "getCharSequenceList-impl", "getCharSequenceList", "getCharSequenceListOrNull-impl", "getCharSequenceListOrNull", "getSavedStateList-impl", "getSavedStateList", "getSavedStateListOrNull-impl", "getSavedStateListOrNull", "getStringList-impl", "getStringList", "getStringListOrNull-impl", "getStringListOrNull", "getParcelableList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ly6/c;)Ljava/util/List;", "getParcelableList", "getParcelableListOrNull-impl", "getParcelableListOrNull", "", "getBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "getBooleanArray", "getBooleanArrayOrNull-impl", "getBooleanArrayOrNull", "", "getCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[C", "getCharArray", "getCharArrayOrNull-impl", "getCharArrayOrNull", "getCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/CharSequence;", "getCharSequenceArray", "getCharSequenceArrayOrNull-impl", "getCharSequenceArrayOrNull", "", "getDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[D", "getDoubleArray", "getDoubleArrayOrNull-impl", "getDoubleArrayOrNull", "", "getFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "getFloatArray", "getFloatArrayOrNull-impl", "getFloatArrayOrNull", "", "getIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "getIntArray", "getIntArrayOrNull-impl", "getIntArrayOrNull", "", "getLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "getLongArray", "getLongArrayOrNull-impl", "getLongArrayOrNull", "getStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "getStringArray", "getStringArrayOrNull-impl", "getStringArrayOrNull", "getParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ly6/c;)[Landroid/os/Parcelable;", "getParcelableArray", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "getParcelableArrayOrNull-impl", "getParcelableArrayOrNull", "Landroid/util/SparseArray;", "getSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ly6/c;)Landroid/util/SparseArray;", "getSparseParcelableArray", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SparseArray;", "getSparseParcelableArrayOrNull-impl", "getSparseParcelableArrayOrNull", "getSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "getSavedState", "getSavedStateOrNull-impl", "getSavedStateOrNull", "size-impl", "(Landroid/os/Bundle;)I", "size", "isEmpty-impl", "(Landroid/os/Bundle;)Z", "isEmpty", "isNull-impl", "isNull", "contains-impl", "contains", "other", "contentDeepEquals-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "contentDeepEquals", "contentDeepHashCode-impl", "contentDeepHashCode", "contentDeepToString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "contentDeepToString", "", "toMap-impl", "(Landroid/os/Bundle;)Ljava/util/Map;", "toMap", "toString-impl", "toString", "hashCode-impl", "hashCode", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "equals", "Landroid/os/Bundle;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nSavedStateReader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,915:1\n653#1:916\n689#1:917\n510#1:918\n545#1:919\n1#2:920\n*S KotlinDebug\n*F\n+ 1 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n*L\n421#1:916\n426#1:917\n456#1:918\n461#1:919\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateReader {

    @NotNull
    private final Bundle source;

    @PublishedApi
    private /* synthetic */ SavedStateReader(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m13596boximpl(Bundle bundle) {
        return new SavedStateReader(bundle);
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m13597constructorimpl(@NotNull Bundle source) {
        AbstractC5830k.m5330g(source, "source");
        return source;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m13598containsimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.containsKey(key);
    }

    /* renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m13599contentDeepEqualsimpl(Bundle bundle, @NotNull Bundle other) {
        AbstractC5830k.m5330g(other, "other");
        return Bundle.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, other);
    }

    /* renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m13600contentDeepHashCodeimpl(Bundle bundle) {
        return Bundle.m1960x4f1a1420(bundle);
    }

    @NotNull
    /* renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m13601contentDeepToStringimpl(Bundle bundle) {
        int size = bundle.size();
        if (size > 429496729) {
            size = 429496729;
        }
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        Bundle.m1961x56e5e5af(bundle, sb, new ArrayList());
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13602equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && AbstractC5830k.m5325b(bundle, ((SavedStateReader) obj).getSource());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13603equalsimpl0(Bundle bundle, Bundle bundle2) {
        return AbstractC5830k.m5325b(bundle, bundle2);
    }

    @NotNull
    /* renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m13604getBinderimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m13605getBinderOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getBinder(key);
    }

    /* renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m13606getBooleanimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        boolean z8 = bundle.getBoolean(key, false);
        if (z8 || !bundle.getBoolean(key, true)) {
            return z8;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @NotNull
    /* renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m13607getBooleanArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m13608getBooleanArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getBooleanArray(key);
    }

    @Nullable
    /* renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m13609getBooleanOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        boolean z8 = bundle.getBoolean(key, false);
        if (z8 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z8);
        }
        return null;
    }

    /* renamed from: getChar-impl, reason: not valid java name */
    public static final char m13610getCharimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        char c = bundle.getChar(key, (char) 0);
        if (c == 0 && bundle.getChar(key, (char) 65535) == 65535) {
            throw AbstractC1923c.m1035C(key);
        }
        return c;
    }

    @NotNull
    /* renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m13611getCharArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m13612getCharArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getCharArray(key);
    }

    @Nullable
    /* renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m13613getCharOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        char c = bundle.getChar(key, (char) 0);
        if (c == 0 && bundle.getChar(key, (char) 65535) == 65535) {
            return null;
        }
        return Character.valueOf(c);
    }

    @NotNull
    /* renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m13614getCharSequenceimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @NotNull
    /* renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m13615getCharSequenceArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m13616getCharSequenceArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getCharSequenceArray(key);
    }

    @NotNull
    /* renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m13617getCharSequenceListimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m13618getCharSequenceListOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getCharSequenceArrayList(key);
    }

    @Nullable
    /* renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m13619getCharSequenceOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getCharSequence(key);
    }

    /* renamed from: getDouble-impl, reason: not valid java name */
    public static final double m13620getDoubleimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        double d9 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d9 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            throw AbstractC1923c.m1035C(key);
        }
        return d9;
    }

    @NotNull
    /* renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m13621getDoubleArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m13622getDoubleArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getDoubleArray(key);
    }

    @Nullable
    /* renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m13623getDoubleOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        double d9 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d9 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d9);
    }

    /* renamed from: getFloat-impl, reason: not valid java name */
    public static final float m13624getFloatimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        float f = bundle.getFloat(key, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            throw AbstractC1923c.m1035C(key);
        }
        return f;
    }

    @NotNull
    /* renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m13625getFloatArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m13626getFloatArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getFloatArray(key);
    }

    @Nullable
    /* renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m13627getFloatOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        float f = bundle.getFloat(key, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f);
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m13628getIntimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            throw AbstractC1923c.m1035C(key);
        }
        return i;
    }

    @NotNull
    /* renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m13629getIntArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m13630getIntArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getIntArray(key);
    }

    @NotNull
    /* renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m13631getIntListimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m13632getIntListOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getIntegerArrayList(key);
    }

    @Nullable
    /* renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m13633getIntOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m13634getJavaSerializableimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m13636getJavaSerializableOrNullimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getLong-impl, reason: not valid java name */
    public static final long m13638getLongimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        long j7 = bundle.getLong(key, Long.MIN_VALUE);
        if (j7 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            throw AbstractC1923c.m1035C(key);
        }
        return j7;
    }

    @NotNull
    /* renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m13639getLongArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m13640getLongArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getLongArray(key);
    }

    @Nullable
    /* renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m13641getLongOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        long j7 = bundle.getLong(key, Long.MIN_VALUE);
        if (j7 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j7);
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m13642getParcelableimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m13644getParcelableArrayimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m13646getParcelableArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m13648getParcelableListimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m13650getParcelableListOrNullimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m13652getParcelableOrNullimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    @NotNull
    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m13654getSavedStateimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @NotNull
    /* renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m13655getSavedStateArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return (Bundle[]) m13645getParcelableArrayimpl(bundle, key, AbstractC5832m.m5340a(Bundle.class));
    }

    @Nullable
    /* renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m13656getSavedStateArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return (Bundle[]) m13647getParcelableArrayOrNullimpl(bundle, key, AbstractC5832m.m5340a(Bundle.class));
    }

    @NotNull
    /* renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m13657getSavedStateListimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return m13649getParcelableListimpl(bundle, key, AbstractC5832m.m5340a(Bundle.class));
    }

    @Nullable
    /* renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m13658getSavedStateListOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return m13651getParcelableListOrNullimpl(bundle, key, AbstractC5832m.m5340a(Bundle.class));
    }

    @Nullable
    /* renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m13659getSavedStateOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getBundle(key);
    }

    @NotNull
    /* renamed from: getSize-impl, reason: not valid java name */
    public static final Size m13660getSizeimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @NotNull
    /* renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m13661getSizeFimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m13662getSizeFOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getSizeF(key);
    }

    @Nullable
    /* renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m13663getSizeOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getSize(key);
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m13664getSparseParcelableArrayimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m13666getSparseParcelableArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5338o();
        throw null;
    }

    @NotNull
    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m13668getStringimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @NotNull
    /* renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m13669getStringArrayimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m13670getStringArrayOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getStringArray(key);
    }

    @NotNull
    /* renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m13671getStringListimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m13672getStringListOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getStringArrayList(key);
    }

    @Nullable
    /* renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m13673getStringOrNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return bundle.getString(key);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13674hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m13675isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m13676isNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        return m13598containsimpl(bundle, key) && bundle.get(key) == null;
    }

    /* renamed from: size-impl, reason: not valid java name */
    public static final int m13677sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    @NotNull
    /* renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m13678toMapimpl(Bundle bundle) {
        MapBuilder mapBuilder = new MapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC5830k.m5327d(str);
            mapBuilder.put(str, bundle.get(str));
        }
        return mapBuilder.build();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13679toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m13602equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m13674hashCodeimpl(this.source);
    }

    public String toString() {
        return m13679toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }

    @NotNull
    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m13635getJavaSerializableimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c serializableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(serializableClass, "serializableClass");
        T t8 = (T) BundleCompat.getSerializable(bundle, key, AbstractC6675d.m6349m(serializableClass));
        if (t8 != null) {
            return t8;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m13637getJavaSerializableOrNullimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c serializableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(serializableClass, "serializableClass");
        return (T) BundleCompat.getSerializable(bundle, key, AbstractC6675d.m6349m(serializableClass));
    }

    @NotNull
    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m13643getParcelableimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        T t8 = (T) BundleCompat.getParcelable(bundle, key, AbstractC6675d.m6349m(parcelableClass));
        if (t8 != null) {
            return t8;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @NotNull
    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m13645getParcelableArrayimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) m13647getParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (tArr != null) {
            return tArr;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m13647getParcelableArrayOrNullimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) BundleCompat.getParcelableArray(bundle, key, AbstractC6675d.m6349m(parcelableClass));
        if (tArr != null) {
            return tArr;
        }
        return null;
    }

    @NotNull
    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m13649getParcelableListimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, key, AbstractC6675d.m6349m(parcelableClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m13651getParcelableListOrNullimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        return BundleCompat.getParcelableArrayList(bundle, key, AbstractC6675d.m6349m(parcelableClass));
    }

    @Nullable
    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m13653getParcelableOrNullimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        return (T) BundleCompat.getParcelable(bundle, key, AbstractC6675d.m6349m(parcelableClass));
    }

    @NotNull
    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m13665getSparseParcelableArrayimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        SparseArray<T> sparseArrayM13667getSparseParcelableArrayOrNullimpl = m13667getSparseParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (sparseArrayM13667getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM13667getSparseParcelableArrayOrNullimpl;
        }
        throw AbstractC1923c.m1035C(key);
    }

    @Nullable
    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m13667getSparseParcelableArrayOrNullimpl(Bundle bundle, @NotNull String key, @NotNull InterfaceC6779c parcelableClass) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(parcelableClass, "parcelableClass");
        return BundleCompat.getSparseParcelableArray(bundle, key, AbstractC6675d.m6349m(parcelableClass));
    }
}
