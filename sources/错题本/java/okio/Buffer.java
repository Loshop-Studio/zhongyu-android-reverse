package okio;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5840a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ñ\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010!J\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\"J!\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b/\u00100J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010*J\u000f\u00109\u001a\u000202H\u0016¢\u0006\u0004\b9\u00104J\u000f\u0010:\u001a\u000205H\u0016¢\u0006\u0004\b:\u00107J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010*J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010*J\u000f\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010*J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\u00020>2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010AJ\u0017\u0010D\u001a\u0002052\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ)\u0010D\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010G*\u00020F2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0016¢\u0006\u0004\bD\u0010IJ\u001f\u0010K\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00112\u0006\u0010J\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bQ\u0010SJ\u0017\u0010V\u001a\u00020P2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010V\u001a\u00020P2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010XJ\u0011\u0010Y\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bY\u0010RJ\u000f\u0010Z\u001a\u00020PH\u0016¢\u0006\u0004\bZ\u0010RJ\u0017\u0010Z\u001a\u00020P2\u0006\u0010[\u001a\u00020\u0011H\u0016¢\u0006\u0004\bZ\u0010SJ\u000f\u0010\\\u001a\u000205H\u0016¢\u0006\u0004\b\\\u00107J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010^\u001a\u00020]2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b^\u0010`J\u0017\u0010a\u001a\u0002052\u0006\u0010J\u001a\u00020]H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010J\u001a\u00020]H\u0016¢\u0006\u0004\bK\u0010cJ'\u0010a\u001a\u0002052\u0006\u0010J\u001a\u00020]2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\ba\u0010dJ\u0017\u0010a\u001a\u0002052\u0006\u0010J\u001a\u00020eH\u0016¢\u0006\u0004\ba\u0010fJ\r\u0010g\u001a\u00020\u0013¢\u0006\u0004\bg\u0010\u0006J\u0017\u0010h\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bh\u0010\u0015J\u0017\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020>H\u0016¢\u0006\u0004\bj\u0010kJ'\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020>2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\bj\u0010lJ\u0017\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020PH\u0016¢\u0006\u0004\bn\u0010oJ'\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020P2\u0006\u0010p\u001a\u0002052\u0006\u0010q\u001a\u000205H\u0016¢\u0006\u0004\bn\u0010rJ\u0017\u0010t\u001a\u00020\u00002\u0006\u0010s\u001a\u000205H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010v\u001a\u00020\u00002\u0006\u0010m\u001a\u00020P2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bv\u0010wJ/\u0010v\u001a\u00020\u00002\u0006\u0010m\u001a\u00020P2\u0006\u0010p\u001a\u0002052\u0006\u0010q\u001a\u0002052\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bv\u0010xJ\u0017\u0010j\u001a\u00020\u00002\u0006\u0010y\u001a\u00020]H\u0016¢\u0006\u0004\bj\u0010zJ'\u0010j\u001a\u00020\u00002\u0006\u0010y\u001a\u00020]2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\bj\u0010{J\u0017\u0010j\u001a\u0002052\u0006\u0010y\u001a\u00020eH\u0016¢\u0006\u0004\bj\u0010fJ\u0017\u0010}\u001a\u00020\u00112\u0006\u0010y\u001a\u00020|H\u0016¢\u0006\u0004\b}\u0010~J\u001f\u0010j\u001a\u00020\u00002\u0006\u0010y\u001a\u00020|2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bj\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0081\u0001\u0010uJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0083\u0001\u0010uJ\u001a\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0084\u0001\u0010uJ\u001a\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0086\u0001\u0010uJ\u001a\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0087\u0001\u0010uJ\u001b\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008a\u0001J\u001b\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001J\u001c\u0010\u0092\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u008e\u0001\u001a\u000205H\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001f\u0010j\u001a\u00020\u00132\u0006\u0010y\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bj\u0010LJ \u0010a\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\ba\u0010\u0093\u0001J\u001b\u0010\u0094\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020+H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J$\u0010\u0094\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020+2\u0007\u0010\u0096\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0097\u0001J-\u0010\u0094\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020+2\u0007\u0010\u0096\u0001\u001a\u00020\u00112\u0007\u0010\u0098\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0099\u0001J\u001b\u0010\u0094\u0001\u001a\u00020\u00112\u0007\u0010\u009a\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u009b\u0001J$\u0010\u0094\u0001\u001a\u00020\u00112\u0007\u0010\u009a\u0001\u001a\u00020>2\u0007\u0010\u0096\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u009c\u0001J\u001b\u0010\u009e\u0001\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009b\u0001J$\u0010\u009e\u0001\u001a\u00020\u00112\u0007\u0010\u009d\u0001\u001a\u00020>2\u0007\u0010\u0096\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009c\u0001J#\u0010\u009f\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u009a\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J4\u0010\u009f\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u009a\u0001\u001a\u00020>2\u0007\u0010¡\u0001\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0006\b\u009f\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0011\u0010¤\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¤\u0001\u0010\u0010J\u0011\u0010¥\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¥\u0001\u0010\u0006J\u0013\u0010§\u0001\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u000f\u0010©\u0001\u001a\u00020>¢\u0006\u0005\b©\u0001\u0010@J\u000f\u0010ª\u0001\u001a\u00020>¢\u0006\u0005\bª\u0001\u0010@J\u000f\u0010«\u0001\u001a\u00020>¢\u0006\u0005\b«\u0001\u0010@J\u000f\u0010¬\u0001\u001a\u00020>¢\u0006\u0005\b¬\u0001\u0010@J\u0019\u0010®\u0001\u001a\u00020>2\u0007\u0010\u00ad\u0001\u001a\u00020>¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0019\u0010°\u0001\u001a\u00020>2\u0007\u0010\u00ad\u0001\u001a\u00020>¢\u0006\u0006\b°\u0001\u0010¯\u0001J\u0019\u0010±\u0001\u001a\u00020>2\u0007\u0010\u00ad\u0001\u001a\u00020>¢\u0006\u0006\b±\u0001\u0010¯\u0001J\u001e\u0010³\u0001\u001a\u00020\u000e2\t\u0010²\u0001\u001a\u0004\u0018\u00010FH\u0096\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0011\u0010µ\u0001\u001a\u000205H\u0016¢\u0006\u0005\bµ\u0001\u00107J\u0011\u0010¶\u0001\u001a\u00020PH\u0016¢\u0006\u0005\b¶\u0001\u0010RJ\u000f\u0010·\u0001\u001a\u00020\u0000¢\u0006\u0005\b·\u0001\u0010\bJ\u0011\u0010¸\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b¸\u0001\u0010\bJ\u000f\u0010¹\u0001\u001a\u00020>¢\u0006\u0005\b¹\u0001\u0010@J\u0018\u0010¹\u0001\u001a\u00020>2\u0006\u0010\u0012\u001a\u000205¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001f\u0010½\u0001\u001a\u00030»\u00012\n\b\u0002\u0010¼\u0001\u001a\u00030»\u0001H\u0007¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001f\u0010¿\u0001\u001a\u00030»\u00012\n\b\u0002\u0010¼\u0001\u001a\u00030»\u0001H\u0007¢\u0006\u0006\b¿\u0001\u0010¾\u0001J\u0019\u0010/\u001a\u00020+2\u0007\u0010À\u0001\u001a\u00020\u0011H\u0007¢\u0006\u0005\bÁ\u0001\u00100J\u0011\u0010Ã\u0001\u001a\u00020\u0011H\u0007¢\u0006\u0005\bÂ\u0001\u0010*J)\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010Ä\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b&\u0010Å\u0001J\u001b\u0010Ç\u0001\u001a\u00020>2\u0007\u0010Æ\u0001\u001a\u00020PH\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J$\u0010É\u0001\u001a\u00020>2\u0007\u0010Æ\u0001\u001a\u00020P2\u0007\u0010\u00ad\u0001\u001a\u00020>H\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001R\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R0\u0010Ã\u0001\u001a\u00020\u00112\u0007\u0010Í\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0016\n\u0006\bÃ\u0001\u0010Î\u0001\u001a\u0005\bÃ\u0001\u0010*\"\u0005\bÏ\u0001\u0010\u0015R\u0015\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\b¨\u0006Ò\u0001"}, m5110d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "buffer", "()Lokio/Buffer;", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "emitCompleteSegments", "emit", "", "exhausted", "()Z", "", "byteCount", "Ld6/s;", "require", "(J)V", "request", "(J)Z", "peek", "()Lokio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "out", TypedValues.CycleType.S_WAVE_OFFSET, "copyTo", "(Ljava/io/OutputStream;JJ)Lokio/Buffer;", "(Lokio/Buffer;JJ)Lokio/Buffer;", "(Lokio/Buffer;J)Lokio/Buffer;", "writeTo", "(Ljava/io/OutputStream;J)Lokio/Buffer;", "input", "readFrom", "(Ljava/io/InputStream;)Lokio/Buffer;", "(Ljava/io/InputStream;J)Lokio/Buffer;", "completeSegmentByteCount", "()J", "", "readByte", "()B", "pos", "getByte", "(J)B", "get", "", "readShort", "()S", "", "readInt", "()I", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lokio/Options;", "options", "select", "(Lokio/Options;)I", "", ExifInterface.GPS_DIRECTION_TRUE, "Lokio/TypedOptions;", "(Lokio/TypedOptions;)Ljava/lang/Object;", "sink", "readFully", "(Lokio/Buffer;J)V", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "()[B", "(J)[B", "read", "([B)I", "([B)V", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "clear", "skip", "byteString", "write", "(Lokio/ByteString;)Lokio/Buffer;", "(Lokio/ByteString;II)Lokio/Buffer;", TypedValues.Custom.S_STRING, "writeUtf8", "(Ljava/lang/String;)Lokio/Buffer;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/Buffer;", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;", "source", "([B)Lokio/Buffer;", "([BII)Lokio/Buffer;", "Lokio/Source;", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/Buffer;", "b", "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lokio/Buffer;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "minimumCapacity", "Lokio/Segment;", "writableSegment$okio", "(I)Lokio/Segment;", "writableSegment", "(Lokio/Buffer;J)J", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLokio/ByteString;)Z", "bytesOffset", "(JLokio/ByteString;II)Z", "flush", "isOpen", "close", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "md5", "sha1", "sha256", "sha512", "key", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "copy", "clone", "snapshot", "(I)Lokio/ByteString;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readUnsafe", "(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "readAndWriteUnsafe", "index", "-deprecated_getByte", "-deprecated_size", "size", "forever", "(Ljava/io/InputStream;JZ)V", "algorithm", "digest", "(Ljava/lang/String;)Lokio/ByteString;", "hmac", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "head", "Lokio/Segment;", "value", "J", "setSize$okio", "getBuffer", "UnsafeCursor", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BufferedSource.kt\nokio/internal/-BufferedSource\n*L\n1#1,644:1\n88#2:645\n85#2:678\n85#2:680\n73#2:740\n73#2:766\n82#2:805\n76#2:816\n88#2:1009\n73#2:1024\n85#2:1128\n88#2:1565\n242#3,32:646\n277#3,10:681\n290#3,18:691\n412#3,2:709\n110#3:711\n414#3:712\n112#3,18:713\n311#3,9:731\n320#3,15:741\n338#3,10:756\n348#3,3:767\n346#3,25:770\n374#3,10:795\n384#3:806\n382#3,9:807\n391#3,7:817\n389#3,20:824\n652#3,60:844\n715#3,56:904\n773#3:960\n776#3:961\n777#3,6:963\n787#3,7:969\n797#3,6:979\n805#3,5:985\n837#3,6:990\n847#3:996\n848#3,11:998\n859#3,5:1010\n868#3,9:1015\n878#3,61:1025\n603#3:1086\n606#3:1087\n607#3,5:1089\n614#3:1094\n617#3,7:1095\n626#3,20:1102\n418#3:1122\n421#3,5:1123\n426#3,10:1129\n437#3,7:1139\n442#3,2:1146\n943#3:1148\n944#3,87:1150\n1034#3,48:1237\n573#3:1285\n580#3,21:1286\n1085#3,7:1307\n1095#3,7:1314\n1105#3,4:1321\n1112#3,8:1325\n1123#3,10:1333\n1136#3,14:1343\n447#3,35:1357\n513#3,40:1392\n556#3:1432\n558#3,13:1434\n1153#3:1447\n1204#3:1448\n1205#3,39:1450\n1246#3,2:1489\n1248#3,4:1492\n1255#3,3:1496\n1259#3,4:1500\n110#3:1504\n1263#3,22:1505\n112#3,18:1527\n1289#3,2:1545\n1291#3,3:1548\n110#3:1551\n1294#3,13:1552\n1307#3,13:1566\n112#3,18:1579\n1324#3,2:1597\n1327#3:1600\n110#3:1601\n1328#3,50:1602\n112#3,18:1652\n1387#3,14:1670\n1404#3,32:1684\n1439#3,12:1716\n1454#3,18:1728\n1476#3:1746\n1477#3:1748\n1482#3,34:1749\n1#4:679\n1#4:962\n1#4:997\n1#4:1088\n1#4:1149\n1#4:1433\n1#4:1449\n1#4:1491\n1#4:1499\n1#4:1547\n1#4:1599\n1#4:1747\n26#5,3:976\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:645\n197#1:678\n235#1:680\n261#1:740\n264#1:766\n267#1:805\n267#1:816\n337#1:1009\n340#1:1024\n376#1:1128\n486#1:1565\n181#1:646,32\n252#1:681,10\n255#1:691,18\n258#1:709,2\n258#1:711\n258#1:712\n258#1:713,18\n261#1:731,9\n261#1:741,15\n264#1:756,10\n264#1:767,3\n264#1:770,25\n267#1:795,10\n267#1:806\n267#1:807,9\n267#1:817,7\n267#1:824,20\n279#1:844,60\n282#1:904,56\n284#1:960\n287#1:961\n287#1:963,6\n289#1:969,7\n294#1:979,6\n297#1:985,5\n331#1:990,6\n337#1:996\n337#1:998,11\n337#1:1010,5\n340#1:1015,9\n340#1:1025,61\n342#1:1086\n345#1:1087\n345#1:1089,5\n347#1:1094\n350#1:1095,7\n353#1:1102,20\n373#1:1122\n376#1:1123,5\n376#1:1129,10\n378#1:1139,7\n381#1:1146,2\n386#1:1148\n386#1:1150,87\n389#1:1237,48\n412#1:1285\n418#1:1286,21\n439#1:1307,7\n443#1:1314,7\n445#1:1321,4\n447#1:1325,8\n451#1:1333,10\n455#1:1343,14\n459#1:1357,35\n462#1:1392,40\n465#1:1432\n465#1:1434,13\n467#1:1447\n467#1:1448\n467#1:1450,39\n469#1:1489,2\n469#1:1492,4\n480#1:1496,3\n480#1:1500,4\n480#1:1504\n480#1:1505,22\n480#1:1527,18\n486#1:1545,2\n486#1:1548,3\n486#1:1551\n486#1:1552,13\n486#1:1566,13\n486#1:1579,18\n491#1:1597,2\n491#1:1600\n491#1:1601\n491#1:1602,50\n491#1:1652,18\n501#1:1670,14\n571#1:1684,32\n573#1:1716,12\n581#1:1728,18\n589#1:1746\n589#1:1748\n591#1:1749,34\n287#1:962\n337#1:997\n345#1:1088\n386#1:1149\n465#1:1433\n467#1:1449\n469#1:1491\n480#1:1499\n486#1:1547\n491#1:1599\n589#1:1747\n291#1:976,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @JvmField
    @Nullable
    public Segment head;
    private long size;

    @Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, m5110d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "<init>", "()V", "", "next", "()I", "", TypedValues.CycleType.S_WAVE_OFFSET, "seek", "(J)I", "newSize", "resizeBuffer", "(J)J", "minByteCount", "expandBuffer", "(I)J", "Ld6/s;", "close", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "", "readWrite", "Z", "Lokio/Segment;", "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "J", "", "data", "[B", "start", "I", "end", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,644:1\n1537#2:645\n1538#2:647\n1542#2:648\n1543#2,68:650\n1614#2:718\n1615#2,32:720\n1647#2,18:753\n1668#2:771\n1669#2,18:773\n1691#2:791\n1693#2,7:793\n1#3:646\n1#3:649\n1#3:719\n1#3:772\n1#3:792\n85#4:752\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n631#1:645\n631#1:647\n633#1:648\n633#1:650,68\n635#1:718\n635#1:720,32\n635#1:753,18\n637#1:771\n637#1:773,18\n640#1:791\n640#1:793,7\n631#1:646\n633#1:649\n635#1:719\n637#1:772\n640#1:792\n635#1:752\n*E\n"})
    public static final class UnsafeCursor implements Closeable {

        @JvmField
        @Nullable
        public Buffer buffer;

        @JvmField
        @Nullable
        public byte[] data;

        @JvmField
        public boolean readWrite;

        @Nullable
        private Segment segment;

        @JvmField
        public long offset = -1;

        @JvmField
        public int start = -1;

        @JvmField
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int minByteCount) {
            if (minByteCount <= 0) {
                throw new IllegalArgumentException(AbstractC0037f.m81f(minByteCount, "minByteCount <= 0: ").toString());
            }
            if (minByteCount > 8192) {
                throw new IllegalArgumentException(AbstractC0037f.m81f(minByteCount, "minByteCount > Segment.SIZE: ").toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j7 = i;
            buffer.setSize$okio(size + j7);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i;
            this.end = 8192;
            return j7;
        }

        @Nullable
        /* renamed from: getSegment$okio, reason: from getter */
        public final Segment getSegment() {
            return this.segment;
        }

        public final int next() {
            long j7 = this.offset;
            Buffer buffer = this.buffer;
            AbstractC5830k.m5327d(buffer);
            if (j7 == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j8 = this.offset;
            return seek(j8 == -1 ? 0L : j8 + (this.end - this.start));
        }

        public final long resizeBuffer(long newSize) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(AbstractC0584a.m913n(newSize, "newSize < 0: ").toString());
                }
                long j7 = size - newSize;
                while (true) {
                    if (j7 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    AbstractC5830k.m5327d(segment);
                    Segment segment2 = segment.prev;
                    AbstractC5830k.m5327d(segment2);
                    int i = segment2.limit;
                    long j8 = i - segment2.pos;
                    if (j8 > j7) {
                        segment2.limit = i - ((int) j7);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j7 -= j8;
                }
                setSegment$okio(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j9 = newSize - size;
                boolean z8 = true;
                while (j9 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j9, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j9 -= iMin;
                    if (z8) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i8 = segmentWritableSegment$okio.limit;
                        this.start = i8 - iMin;
                        this.end = i8;
                        z8 = false;
                    }
                }
            }
            buffer.setSize$okio(newSize);
            return size;
        }

        public final int seek(long offset) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > buffer.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + buffer.size());
            }
            if (offset == -1 || offset == buffer.size()) {
                setSegment$okio(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            long j7 = 0;
            if (getSegment() != null) {
                long j8 = this.offset;
                int i = this.start;
                AbstractC5830k.m5327d(getSegment());
                long j9 = j8 - (i - r9.pos);
                if (j9 > offset) {
                    segmentPush = segment;
                    segment = getSegment();
                    size = j9;
                } else {
                    segmentPush = getSegment();
                    j7 = j9;
                }
            } else {
                segmentPush = segment;
            }
            if (size - offset > offset - j7) {
                while (true) {
                    AbstractC5830k.m5327d(segmentPush);
                    int i8 = segmentPush.limit;
                    int i9 = segmentPush.pos;
                    if (offset < (i8 - i9) + j7) {
                        break;
                    }
                    j7 += i8 - i9;
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    AbstractC5830k.m5327d(segment);
                    segment = segment.prev;
                    AbstractC5830k.m5327d(segment);
                    size -= segment.limit - segment.pos;
                }
                j7 = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                AbstractC5830k.m5327d(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment2 = segmentPush.prev;
                    AbstractC5830k.m5327d(segment2);
                    segment2.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = offset;
            AbstractC5830k.m5327d(segmentPush);
            this.data = segmentPush.data;
            int i10 = segmentPush.pos + ((int) (offset - j7));
            this.start = i10;
            int i11 = segmentPush.limit;
            this.end = i11;
            return i11 - i10;
        }

        public final void setSegment$okio(@Nullable Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j7, long j8, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j7 = 0;
        }
        long j9 = j7;
        if ((i & 4) != 0) {
            j8 = buffer.size - j9;
        }
        return buffer.copyTo(outputStream, j9, j8);
    }

    private final ByteString digest(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            messageDigest.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            AbstractC5830k.m5327d(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i8 = segment2.pos;
                messageDigest.update(bArr2, i8, segment2.limit - i8);
                segment2 = segment2.next;
                AbstractC5830k.m5327d(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC5830k.m5329f(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String algorithm, ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.internalArray$okio(), algorithm));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i = segment.pos;
                mac.update(bArr, i, segment.limit - i);
                Segment segment2 = segment.next;
                AbstractC5830k.m5327d(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i8 = segment2.pos;
                    mac.update(bArr2, i8, segment2.limit - i8);
                    segment2 = segment2.next;
                    AbstractC5830k.m5327d(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            AbstractC5830k.m5329f(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j7, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j7 = buffer.size;
        }
        return buffer.writeTo(outputStream, j7);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m13970deprecated_getByte(long index) {
        return getByte(index);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* renamed from: buffer */
    public Buffer getBufferField() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        Segment segment2 = segment.prev;
        AbstractC5830k.m5327d(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r3 - segment2.pos);
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            AbstractC5830k.m5327d(segment3);
            AbstractC5830k.m5327d(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out) throws IOException {
        AbstractC5830k.m5330g(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) other;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        Segment segment2 = buffer.head;
        AbstractC5830k.m5327d(segment2);
        int i = segment.pos;
        int i8 = segment2.pos;
        long j7 = 0;
        while (j7 < size()) {
            long jMin = Math.min(segment.limit - i, segment2.limit - i8);
            long j8 = 0;
            while (j8 < jMin) {
                int i9 = i + 1;
                int i10 = i8 + 1;
                if (segment.data[i] != segment2.data[i8]) {
                    return false;
                }
                j8++;
                i = i9;
                i8 = i10;
            }
            if (i == segment.limit) {
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                i = segment.pos;
            }
            if (i8 == segment2.limit) {
                segment2 = segment2.next;
                AbstractC5830k.m5327d(segment2);
                i8 = segment2.pos;
            }
            j7 += jMin;
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    @JvmName(name = "getByte")
    public final byte getByte(long pos) {
        SegmentedByteString.checkOffsetAndCount(size(), pos, 1L);
        Segment segment = this.head;
        if (segment == null) {
            AbstractC5830k.m5327d(null);
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + pos) - size)];
        }
        long j7 = 0;
        while (true) {
            int i = segment.limit;
            int i8 = segment.pos;
            long j8 = (i - i8) + j7;
            if (j8 > pos) {
                return segment.data[(int) ((i8 + pos) - j7)];
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            j7 = j8;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i8 = segment.limit;
            for (int i9 = segment.pos; i9 < i8; i9++) {
                i = (i * 31) + segment.data[i9];
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
        } while (segment != this.head);
        return i;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        AbstractC5830k.m5330g(key, "key");
        return hmac("HmacSHA1", key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        AbstractC5830k.m5330g(key, "key");
        return hmac("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        AbstractC5830k.m5330g(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b6) {
        return indexOf(b6, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        AbstractC5830k.m5330g(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int offset, int byteCount) {
                AbstractC5830k.m5330g(sink, "sink");
                return Buffer.this.read(sink, offset, byteCount);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int b6) {
                Buffer.this.writeByte(b6);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                AbstractC5830k.m5330g(data, "data");
                Buffer.this.write(data, offset, byteCount);
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes) {
        AbstractC5830k.m5330g(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i = segment.pos + iMin;
        segment.pos = i;
        this.size -= iMin;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        int i9 = i + 1;
        byte b6 = segment.data[i];
        setSize$okio(size() - 1);
        if (i9 != i8) {
            segment.pos = i9;
            return b6;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b6;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        AbstractC5830k.m5330g(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long byteCount) throws EOFException {
        AbstractC5830k.m5330g(sink, "sink");
        if (size() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.AbstractC5830k.m5327d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = okio.SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        if (i8 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i9 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = (bArr[i9] & 255) | i10;
        setSize$okio(size() - 4);
        if (i11 != i8) {
            segment.pos = i11;
            return i12;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i12;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        if (i8 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        int i9 = i + 7;
        long j7 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i10 = i + 8;
        long j8 = j7 | (bArr[i9] & 255);
        setSize$okio(size() - 8);
        if (i10 != i8) {
            segment.pos = i10;
            return j8;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j8;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        if (i8 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i9 = i + 1;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i9] & 255) | i10;
        setSize$okio(size() - 2);
        if (i11 == i8) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return (short) i12;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        AbstractC5830k.m5330g(charset, "charset");
        return readString(this.size, charset);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, AbstractC5840a.f9235a);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i8;
        int i9;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b6 = getByte(0L);
        if ((b6 & 128) == 0) {
            i = b6 & 127;
            i9 = 0;
            i8 = 1;
        } else if ((b6 & 224) == 192) {
            i = b6 & 31;
            i8 = 2;
            i9 = 128;
        } else if ((b6 & 240) == 224) {
            i = b6 & 15;
            i8 = 3;
            i9 = 2048;
        } else {
            if ((b6 & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b6 & 7;
            i8 = 4;
            i9 = 65536;
        }
        long j7 = i8;
        if (size() < j7) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i8, "size < ", ": ");
            sbM94s.append(size());
            sbM94s.append(" (to read code point prefixed 0x");
            sbM94s.append(SegmentedByteString.toHexString(b6));
            sbM94s.append(')');
            throw new EOFException(sbM94s.toString());
        }
        for (int i10 = 1; i10 < i8; i10++) {
            long j8 = i10;
            byte b9 = getByte(j8);
            if ((b9 & 192) != 128) {
                skip(j8);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b9 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j7);
        return i > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i || i >= 57344) && i >= i9) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        AbstractC5830k.m5330g(options, "options");
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j7) {
        this.size = j7;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    @JvmName(name = "size")
    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            long j7 = iMin;
            setSize$okio(size() - j7);
            byteCount -= j7;
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= SieveCacheKt.NodeLinkMask) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getThis$0() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            AbstractC5830k.m5327d(segment);
            Segment segment2 = segment.prev;
            AbstractC5830k.m5327d(segment2);
            return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        AbstractC5830k.m5330g(source, "source");
        long j7 = 0;
        while (true) {
            long j8 = source.read(this, 8192L);
            if (j8 == -1) {
                return j7;
            }
            j7 += j8;
        }
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out) throws IOException {
        AbstractC5830k.m5330g(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long j7) throws IOException {
        AbstractC5830k.m5330g(out, "out");
        return copyTo$default(this, out, j7, 0L, 4, (Object) null);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b6, long fromIndex) {
        return indexOf(b6, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long fromIndex) {
        int i;
        int i8;
        AbstractC5830k.m5330g(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(fromIndex, "fromIndex < 0: ").toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b6 = targetBytes.getByte(0);
                byte b9 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + fromIndex) - size);
                    int i9 = segment.limit;
                    while (i < i9) {
                        byte b10 = bArr[i];
                        if (b10 == b6 || b10 == b9) {
                            i8 = segment.pos;
                        } else {
                            i++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC5830k.m5327d(segment);
                    fromIndex = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + fromIndex) - size);
                    int i10 = segment.limit;
                    while (i < i10) {
                        byte b11 = bArr2[i];
                        for (byte b12 : bArrInternalArray$okio) {
                            if (b11 == b12) {
                                i8 = segment.pos;
                            }
                        }
                        i++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC5830k.m5327d(segment);
                    fromIndex = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j7 = (segment.limit - segment.pos) + size;
            if (j7 > fromIndex) {
                break;
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            size = j7;
        }
        if (targetBytes.size() == 2) {
            byte b13 = targetBytes.getByte(0);
            byte b14 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + fromIndex) - size);
                int i11 = segment.limit;
                while (i < i11) {
                    byte b15 = bArr3[i];
                    if (b15 == b13 || b15 == b14) {
                        i8 = segment.pos;
                    } else {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                fromIndex = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + fromIndex) - size);
                int i12 = segment.limit;
                while (i < i12) {
                    byte b16 = bArr4[i];
                    for (byte b17 : bArrInternalArray$okio2) {
                        if (b16 == b17) {
                            i8 = segment.pos;
                        }
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                fromIndex = size;
            }
        }
        return -1L;
        return (i - i8) + size;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes, int bytesOffset, int byteCount) {
        AbstractC5830k.m5330g(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (getByte(i + offset) != bytes.getByte(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount: ").toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount: ").toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new ByteString(readByteArray(byteCount));
        }
        ByteString byteStringSnapshot = snapshot((int) byteCount);
        skip(byteCount);
        return byteStringSnapshot;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long byteCount) throws IOException {
        AbstractC5830k.m5330g(input, "input");
        if (byteCount < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount < 0: ").toString());
        }
        readFrom(input, byteCount, false);
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long byteCount, @NotNull Charset charset) throws EOFException {
        AbstractC5830k.m5330g(charset, "charset");
        if (byteCount < 0 || byteCount > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount: ").toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        Segment segment = this.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        if (i + byteCount > segment.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i8 = (int) byteCount;
        String str = new String(segment.data, i, i8, charset);
        int i9 = segment.pos + i8;
        segment.pos = i9;
        this.size -= byteCount;
        if (i9 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, AbstractC5840a.f9235a);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(limit, "limit < 0: ").toString());
        }
        long j7 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j7);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j7 < size() && getByte(j7 - 1) == 13 && getByte(j7) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j7);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int b6) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i + 1;
        bArr[i] = (byte) b6;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long v2) {
        boolean z8;
        if (v2 == 0) {
            return writeByte(48);
        }
        if (v2 < 0) {
            v2 = -v2;
            if (v2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        int iCountDigitsIn = okio.internal.Buffer.countDigitsIn(v2);
        if (z8) {
            iCountDigitsIn++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(iCountDigitsIn);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit + iCountDigitsIn;
        while (v2 != 0) {
            long j7 = 10;
            i--;
            bArr[i] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (v2 % j7)];
            v2 /= j7;
        }
        if (z8) {
            bArr[i - 1] = 45;
        }
        segmentWritableSegment$okio.limit += iCountDigitsIn;
        setSize$okio(size() + iCountDigitsIn);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long v2) {
        if (v2 == 0) {
            return writeByte(48);
        }
        long j7 = (v2 >>> 1) | v2;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i8 = segmentWritableSegment$okio.limit;
        for (int i9 = (i8 + i) - 1; i9 >= i8; i9--) {
            bArr[i9] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & v2)];
            v2 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i8 = segmentWritableSegment$okio.limit;
        bArr[i8] = (byte) ((i >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i8 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i) {
        return writeInt(SegmentedByteString.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long v2) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        bArr[i] = (byte) ((v2 >>> 56) & 255);
        bArr[i + 1] = (byte) ((v2 >>> 48) & 255);
        bArr[i + 2] = (byte) ((v2 >>> 40) & 255);
        bArr[i + 3] = (byte) ((v2 >>> 32) & 255);
        bArr[i + 4] = (byte) ((v2 >>> 24) & 255);
        bArr[i + 5] = (byte) ((v2 >>> 16) & 255);
        bArr[i + 6] = (byte) ((v2 >>> 8) & 255);
        bArr[i + 7] = (byte) (v2 & 255);
        segmentWritableSegment$okio.limit = i + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long v2) {
        return writeLong(SegmentedByteString.reverseBytes(v2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int s8) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        bArr[i] = (byte) ((s8 >>> 8) & 255);
        bArr[i + 1] = (byte) (s8 & 255);
        segmentWritableSegment$okio.limit = i + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int s8) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) s8));
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long byteCount) throws IOException {
        AbstractC5830k.m5330g(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, byteCount);
        Segment segment = this.head;
        long j7 = byteCount;
        while (j7 > 0) {
            AbstractC5830k.m5327d(segment);
            int iMin = (int) Math.min(j7, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i = segment.pos + iMin;
            segment.pos = i;
            long j8 = iMin;
            this.size -= j8;
            j7 -= j8;
            if (i == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i = segmentWritableSegment$okio.limit;
            bArr[i] = (byte) ((codePoint >> 6) | 192);
            bArr[i + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio.limit = i + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i8 = segmentWritableSegment$okio2.limit;
            bArr2[i8] = (byte) ((codePoint >> 12) | 224);
            bArr2[i8 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i8 + 2] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio2.limit = i8 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(codePoint));
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i9 = segmentWritableSegment$okio3.limit;
        bArr3[i9] = (byte) ((codePoint >> 18) | 240);
        bArr3[i9 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i9 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i9 + 3] = (byte) ((codePoint & 63) | 128);
        segmentWritableSegment$okio3.limit = i9 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j7, long j8, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = 0;
        }
        return buffer.copyTo(buffer2, j7, j8);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long offset, long byteCount) throws IOException {
        AbstractC5830k.m5330g(out, "out");
        long j7 = offset;
        SegmentedByteString.checkOffsetAndCount(this.size, j7, byteCount);
        if (byteCount != 0) {
            Segment segment = this.head;
            while (true) {
                AbstractC5830k.m5327d(segment);
                int i = segment.limit;
                int i8 = segment.pos;
                if (j7 < i - i8) {
                    break;
                }
                j7 -= i - i8;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j8 = byteCount;
            while (j8 > 0) {
                AbstractC5830k.m5327d(segment2);
                int iMin = (int) Math.min(segment2.limit - r1, j8);
                out.write(segment2.data, (int) (segment2.pos + j7), iMin);
                j8 -= iMin;
                segment2 = segment2.next;
                j7 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        AbstractC5830k.m5330g(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        AbstractC5830k.m5330g(string, "string");
        AbstractC5830k.m5330g(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        AbstractC5830k.m5330g(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j7, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = 0;
        }
        return buffer.copyTo(buffer2, j7);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b6, long fromIndex, long toIndex) {
        Segment segment;
        int i;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > size()) {
            toIndex = size();
        }
        if (fromIndex == toIndex || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < toIndex) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + toIndex) - size);
                i = (int) ((segment.pos + fromIndex) - size);
                while (i < iMin) {
                    if (bArr[i] != b6) {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j7 = (segment.limit - segment.pos) + size;
            if (j7 > fromIndex) {
                break;
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            size = j7;
        }
        while (size < toIndex) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + toIndex) - size);
            i = (int) ((segment.pos + fromIndex) - size);
            while (i < iMin2) {
                if (bArr2[i] != b6) {
                    i++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            fromIndex = size;
        }
        return -1L;
        return (i - segment.pos) + size;
    }

    @Override // okio.BufferedSource
    @Nullable
    public <T> T select(@NotNull TypedOptions<T> options) throws IOException {
        AbstractC5830k.m5330g(options, "options");
        int iSelect = select(options.getOptions());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }

    @NotNull
    public final ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, byteCount);
        Segment segment = this.head;
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < byteCount) {
            AbstractC5830k.m5327d(segment);
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (i10 != i11) {
                i8 += i10 - i11;
                i9++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i9][];
        int[] iArr = new int[i9 * 2];
        Segment segment2 = this.head;
        int i12 = 0;
        while (i < byteCount) {
            AbstractC5830k.m5327d(segment2);
            bArr[i12] = segment2.data;
            i += segment2.limit - segment2.pos;
            iArr[i12] = Math.min(i, byteCount);
            iArr[i12 + i9] = segment2.pos;
            segment2.shared = true;
            i12++;
            segment2 = segment2.next;
        }
        return new C6897SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int beginIndex, int endIndex) {
        char cCharAt;
        AbstractC5830k.m5330g(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(beginIndex, "beginIndex < 0: ").toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex > string.length()) {
                StringBuilder sbM94s = AbstractC0037f.m94s(endIndex, "endIndex > string.length: ", " > ");
                sbM94s.append(string.length());
                throw new IllegalArgumentException(sbM94s.toString().toString());
            }
            while (beginIndex < endIndex) {
                char cCharAt2 = string.charAt(beginIndex);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i = segmentWritableSegment$okio.limit - beginIndex;
                    int iMin = Math.min(endIndex, 8192 - i);
                    int i8 = beginIndex + 1;
                    bArr[beginIndex + i] = (byte) cCharAt2;
                    while (true) {
                        beginIndex = i8;
                        if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                            break;
                        }
                        i8 = beginIndex + 1;
                        bArr[beginIndex + i] = (byte) cCharAt;
                    }
                    int i9 = segmentWritableSegment$okio.limit;
                    int i10 = (i + beginIndex) - i9;
                    segmentWritableSegment$okio.limit = i9 + i10;
                    setSize$okio(size() + i10);
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i11 = segmentWritableSegment$okio2.limit;
                        bArr2[i11] = (byte) ((cCharAt2 >> 6) | 192);
                        bArr2[i11 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i11 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i12 = beginIndex + 1;
                        char cCharAt3 = i12 < endIndex ? string.charAt(i12) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i13 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i14 = segmentWritableSegment$okio3.limit;
                            bArr3[i14] = (byte) ((i13 >> 18) | 240);
                            bArr3[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                            bArr3[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                            bArr3[i14 + 3] = (byte) ((i13 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i14 + 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        } else {
                            writeByte(63);
                            beginIndex = i12;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i15 = segmentWritableSegment$okio4.limit;
                        bArr4[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i15 + 3;
                        setSize$okio(size() + 3);
                    }
                    beginIndex++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(AbstractC0584a.m912m(endIndex, beginIndex, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        AbstractC5830k.m5330g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i8 = read(sink, i, sink.length - i);
            if (i8 == -1) {
                throw new EOFException();
            }
            i += i8;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        AbstractC5830k.m5330g(string, "string");
        AbstractC5830k.m5330g(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(beginIndex, "beginIndex < 0: ").toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex <= string.length()) {
                if (charset.equals(AbstractC5840a.f9235a)) {
                    return writeUtf8(string, beginIndex, endIndex);
                }
                String strSubstring = string.substring(beginIndex, endIndex);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                AbstractC5830k.m5329f(bytes, "getBytes(...)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbM94s = AbstractC0037f.m94s(endIndex, "endIndex > string.length: ", " > ");
            sbM94s.append(string.length());
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC0584a.m912m(endIndex, beginIndex, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        AbstractC5830k.m5330g(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        AbstractC5830k.m5330g(sink, "sink");
        return read(sink, 0, sink.length);
    }

    private final void readFrom(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i = input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!forever) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i;
            long j7 = i;
            this.size += j7;
            byteCount -= j7;
        }
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        AbstractC5830k.m5330g(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, offset, byteCount);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i = segment.pos;
        AbstractC5802q.m5213z(bArr, offset, sink, i, i + iMin);
        segment.pos += iMin;
        setSize$okio(size() - iMin);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset) {
        AbstractC5830k.m5330g(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset, long byteCount) {
        AbstractC5830k.m5330g(out, "out");
        long j7 = offset;
        SegmentedByteString.checkOffsetAndCount(size(), j7, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            Segment segment = this.head;
            while (true) {
                AbstractC5830k.m5327d(segment);
                int i = segment.limit;
                int i8 = segment.pos;
                if (j7 < i - i8) {
                    break;
                }
                j7 -= i - i8;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j8 = byteCount;
            while (j8 > 0) {
                AbstractC5830k.m5327d(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i9 = segmentSharedCopy.pos + ((int) j7);
                segmentSharedCopy.pos = i9;
                segmentSharedCopy.limit = Math.min(i9 + ((int) j8), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    AbstractC5830k.m5327d(segment3);
                    Segment segment4 = segment3.prev;
                    AbstractC5830k.m5327d(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j8 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j7 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int offset, int byteCount) {
        AbstractC5830k.m5330g(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        AbstractC5830k.m5330g(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int offset, int byteCount) {
        AbstractC5830k.m5330g(source, "source");
        long j7 = byteCount;
        SegmentedByteString.checkOffsetAndCount(source.length, offset, j7);
        int i = byteCount + offset;
        while (offset < i) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i - offset, 8192 - segmentWritableSegment$okio.limit);
            int i8 = offset + iMin;
            AbstractC5802q.m5213z(source, segmentWritableSegment$okio.limit, segmentWritableSegment$okio.data, offset, i8);
            segmentWritableSegment$okio.limit += iMin;
            offset = i8;
        }
        setSize$okio(size() + j7);
        return this;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) {
        AbstractC5830k.m5330g(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long byteCount) throws IOException {
        AbstractC5830k.m5330g(source, "source");
        while (byteCount > 0) {
            long j7 = source.read(this, byteCount);
            if (j7 == -1) {
                throw new EOFException();
            }
            byteCount -= j7;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long fromIndex) throws IOException {
        int i;
        long j7 = fromIndex;
        AbstractC5830k.m5330g(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j7 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j7 < j7) {
                size = size();
                while (size > j7) {
                    segment = segment.prev;
                    AbstractC5830k.m5327d(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b6 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    long j8 = size3;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i = (int) ((segment.pos + j7) - size);
                    while (i < iMin) {
                        if (bArr[i] != b6 || !okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                            i++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC5830k.m5327d(segment);
                    j7 = size;
                    size3 = j8;
                }
                return -1L;
            }
            while (true) {
                long j9 = (segment.limit - segment.pos) + size;
                if (j9 > j7) {
                    break;
                }
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                size = j9;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b9 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i = (int) ((segment.pos + j7) - size);
                while (i < iMin2) {
                    if (bArr2[i] == b9 && okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                j7 = size;
            }
            return -1L;
            return (i - segment.pos) + size;
        }
        throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "fromIndex < 0: ").toString());
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) {
        Segment segment;
        AbstractC5830k.m5330g(source, "source");
        if (source != this) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                Segment segment2 = source.head;
                AbstractC5830k.m5327d(segment2);
                int i = segment2.limit;
                AbstractC5830k.m5327d(source.head);
                if (byteCount < i - r1.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        AbstractC5830k.m5327d(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + byteCount) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            AbstractC5830k.m5327d(segment4);
                            segment4.writeTo(segment, (int) byteCount);
                            source.setSize$okio(source.size() - byteCount);
                            setSize$okio(size() + byteCount);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    AbstractC5830k.m5327d(segment5);
                    source.head = segment5.split((int) byteCount);
                }
                Segment segment6 = source.head;
                AbstractC5830k.m5327d(segment6);
                long j7 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    AbstractC5830k.m5327d(segment7);
                    Segment segment8 = segment7.prev;
                    AbstractC5830k.m5327d(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j7);
                setSize$okio(size() + j7);
                byteCount -= j7;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
