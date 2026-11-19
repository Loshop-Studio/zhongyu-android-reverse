package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p160s6.InterfaceC6560a;
import p160s6.InterfaceC6562c;
import p200x6.C6756f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u001e\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0018J\u001e\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0015\u0010\u001aJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u0015\u0010\u001cJ\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u0015\u0010\u001dJ/\u0010 \u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010!J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b(\u0010\u000fJ\u001b\u0010)\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b)\u0010\u0018J\u001b\u0010)\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b)\u0010\u001dJ\u001b\u0010)\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b)\u0010\u0019J\u001b\u0010+\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b+\u0010\u0019J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0006H\u0001¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J/\u00100\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u00102J\u0010\u00104\u001a\u000203H\u0081\b¢\u0006\u0004\b4\u00105J\u0017\u00104\u001a\u0002032\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b4\u00108J\u0012\u00109\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b9\u00101J1\u00109\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b9\u00102JR\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012'\u0010@\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bA\u0010BJg\u0010D\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012<\u0010@\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bD\u0010EJR\u0010F\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012'\u0010@\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00028\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bF\u0010BJg\u0010G\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012<\u0010@\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00028\u00010CH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bG\u0010EJ/\u0010I\u001a\u00020\u00112\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bI\u0010JJ5\u0010K\u001a\u00020\u00112\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010LJ/\u0010M\u001a\u00020\u00112\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bM\u0010JJ5\u0010N\u001a\u00020\u00112\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bN\u0010LJ\u0018\u0010O\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bS\u0010TJ/\u0010U\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bU\u0010TJ\u0010\u0010V\u001a\u00020\rH\u0086\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\rH\u0086\b¢\u0006\u0004\bX\u0010WJ\r\u0010Y\u001a\u00028\u0000¢\u0006\u0004\bY\u00101J/\u0010Y\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bY\u00102J\u0015\u0010Z\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\bZ\u0010RJ\u0012\u0010[\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b[\u00101J1\u0010[\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b[\u00102J=\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u0010:\u0018\u00012\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b]\u0010^JR\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u0010:\u0018\u00012'\u0010\\\u001a#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b_\u0010`JT\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010:\u0018\u00012)\u0010\\\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\ba\u0010bJ?\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010:\u0018\u00012\u0014\u0010\\\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bc\u0010dJ\u0018\u0010e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\be\u0010fJ\u0018\u0010g\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bg\u0010fJ\u0015\u0010h\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\bh\u0010\u000fJ\u001b\u0010i\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\bi\u0010\u0018J\u001b\u0010i\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bi\u0010\u0019J\u001b\u0010i\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\bi\u0010\u001dJ\u0015\u0010j\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\bj\u0010PJ\u001d\u0010m\u001a\u00020\u00112\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020\u00112\u0006\u0010o\u001a\u00020\u0006H\u0001¢\u0006\u0004\bp\u0010.J$\u0010q\u001a\u00020\u00112\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b¢\u0006\u0004\bq\u0010JJ\u001b\u0010r\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\br\u0010\u001dJ \u0010s\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bs\u0010tJ%\u0010x\u001a\u00020\u00112\u0016\u0010w\u001a\u0012\u0012\u0004\u0012\u00028\u00000uj\b\u0012\u0004\u0012\u00028\u0000`v¢\u0006\u0004\bx\u0010yJ/\u0010{\u001a\u00020\u00062\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b{\u0010TR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010|\u0012\u0004\b}\u0010'R\u001e\u0010~\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR(\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0080\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0007\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\u00068Æ\u0002¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0016\u0010\u0089\u0001\u001a\u00030\u0086\u00018Æ\u0002¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008d\u0001"}, m5110d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "getContent", "()[Ljava/lang/Object;", "element", "", "add", "(Ljava/lang/Object;)Z", "index", "Ld6/s;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/List;)Z", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "(Ljava/util/List;)Z", "(Landroidx/compose/runtime/collection/MutableVector;)Z", "([Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "Lkotlin/Function1;", "predicate", "any", "(Lr6/c;)Z", "reversedAny", "", "asMutableList", "()Ljava/util/List;", "clear", "()V", "contains", "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", "(I)V", "resizeStorage", "first", "()Ljava/lang/Object;", "(Lr6/c;)Ljava/lang/Object;", "", "throwNoSuchElementException", "()Ljava/lang/Void;", "", "message", "(Ljava/lang/String;)Ljava/lang/Void;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lr6/f;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "block", "forEach", "(Lr6/c;)V", "forEachIndexed", "(Lr6/e;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "(Lr6/c;)I", "indexOfLast", "isEmpty", "()Z", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", "map", "(Lr6/c;)[Ljava/lang/Object;", "mapIndexed", "(Lr6/e;)[Ljava/lang/Object;", "mapIndexedNotNull", "(Lr6/e;)Landroidx/compose/runtime/collection/MutableVector;", "mapNotNull", "(Lr6/c;)Landroidx/compose/runtime/collection/MutableVector;", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", "start", "end", "removeRange", "(II)V", "newSize", "setSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "(Ljava/util/Comparator;)V", "selector", "sumBy", "[Ljava/lang/Object;", "getContent$annotations", "list", "Ljava/util/List;", "<set-?>", "I", "getSize", "()I", "getLastIndex", "lastIndex", "Lx6/f;", "getIndices", "()Lx6/f;", "indices", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1110:1\n289#1,4:1111\n289#1,4:1115\n289#1,4:1121\n289#1,4:1127\n289#1,4:1135\n289#1,4:1141\n44#1:1151\n472#1:1152\n48#1:1155\n472#1:1156\n44#1:1157\n472#1:1158\n516#1:1161\n332#1:1162\n472#1:1163\n516#1:1164\n472#1:1165\n516#1:1166\n44#1:1167\n472#1:1168\n516#1:1169\n44#1:1170\n472#1:1171\n472#1:1172\n472#1:1173\n44#1:1174\n472#1:1175\n44#1:1178\n44#1:1183\n44#1:1184\n472#1:1185\n27#2,2:1119\n27#2,2:1125\n27#2,2:1131\n27#2,2:1133\n27#2,2:1139\n27#2,2:1145\n27#2,2:1159\n27#2,2:1179\n27#2,2:1181\n1864#3,3:1147\n1855#3,2:1153\n1855#3,2:1176\n1#4:1150\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n55#1:1111,4\n66#1:1115,4\n87#1:1121,4\n111#1:1127,4\n156#1:1135,4\n169#1:1141,4\n234#1:1151\n235#1:1152\n265#1:1155\n266#1:1156\n279#1:1157\n280#1:1158\n309#1:1161\n310#1:1162\n312#1:1163\n340#1:1164\n340#1:1165\n526#1:1166\n529#1:1167\n529#1:1168\n563#1:1169\n563#1:1170\n563#1:1171\n588#1:1172\n598#1:1173\n678#1:1174\n679#1:1175\n700#1:1178\n725#1:1183\n759#1:1184\n760#1:1185\n69#1:1119,2\n90#1:1125,2\n114#1:1131,2\n121#1:1133,2\n157#1:1139,2\n172#1:1145,2\n300#1:1159,2\n701#1:1179,2\n717#1:1181,2\n179#1:1147,3\n256#1:1153,2\n692#1:1176,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    @JvmField
    @NotNull
    public T[] content;

    @Nullable
    private List<T> list;
    private int size;

    @Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u00103\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m5110d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Ld6/s;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "Landroidx/compose/runtime/collection/MutableVector;", "getSize", "()I", "size", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1110:1\n472#2:1111\n516#2:1112\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n850#1:1111\n855#1:1112\n*E\n"})
    public static final class MutableVectorList<T> implements List<T>, InterfaceC6562c {

        @NotNull
        private final MutableVector<T> vector;

        public MutableVectorList(@NotNull MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.add(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            return this.vector.addAll(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.content[index];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.lastIndexOf(element);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            return this.vector.removeAll(elements);
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.set(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC5829j.m5322a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.add(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            return this.vector.addAll(elements);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC5829j.m5323b(this, tArr);
        }
    }

    @Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u00105\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m5110d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Ld6/s;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "I", "getSize", "()I", "size", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1110:1\n1855#2,2:1111\n1855#2,2:1113\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n922#1:1111,2\n1006#1:1113,2\n*E\n"})
    public static final class SubList<T> implements List<T>, InterfaceC6562c {
        private int end;

        @NotNull
        private final List<T> list;
        private final int start;

        public SubList(@NotNull List<T> list, int i, int i8) {
            this.list = list;
            this.start = i;
            this.end = i8;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i8 = this.start;
            if (i8 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i8) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.end;
            for (int i8 = this.start; i8 < i; i8++) {
                if (AbstractC5830k.m5325b(this.list.get(i8), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.get(index + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.end;
            for (int i8 = this.start; i8 < i; i8++) {
                if (AbstractC5830k.m5325b(this.list.get(i8), element)) {
                    return i8 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int i8 = this.start;
            if (i8 > i) {
                return -1;
            }
            while (!AbstractC5830k.m5325b(this.list.get(i), element)) {
                if (i == i8) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public T removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            int i = this.end;
            int i8 = i - 1;
            int i9 = this.start;
            if (i9 <= i8) {
                while (true) {
                    if (!elements.contains(this.list.get(i8))) {
                        this.list.remove(i8);
                        this.end--;
                    }
                    if (i8 == i9) {
                        break;
                    }
                    i8--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC5829j.m5322a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.end;
            for (int i8 = this.start; i8 < i; i8++) {
                if (AbstractC5830k.m5325b(this.list.get(i8), element)) {
                    this.list.remove(i8);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC5829j.m5323b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }
    }

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ld6/s;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "Ljava/util/List;", "I", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class VectorListIterator<T> implements ListIterator<T>, InterfaceC6560a {
        private int index;

        @NotNull
        private final List<T> list;

        public VectorListIterator(@NotNull List<T> list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    @PublishedApi
    public MutableVector(@NotNull T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i8 = this.size;
        tArr[i8] = element;
        this.size = i8 + 1;
        return true;
    }

    public final boolean addAll(int index, @NotNull List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i = this.size + size;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i8 = this.size;
        if (index != i8) {
            System.arraycopy(tArr, index, tArr, index + size, i8 - index);
        }
        int size2 = elements.size();
        for (int i9 = 0; i9 < size2; i9++) {
            tArr[index + i9] = elements.get(i9);
        }
        this.size += size;
        return true;
    }

    public final boolean any(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (((Boolean) predicate.invoke(tArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i = this.size;
        for (int i8 = 0; i8 < i; i8++) {
            tArr[i8] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !AbstractC5830k.m5325b(this.content[i], element); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@NotNull List<? extends T> elements) {
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@NotNull MutableVector<T> other) {
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; AbstractC5830k.m5325b(other.content[i], this.content[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int capacity) {
        if (this.content.length < capacity) {
            resizeStorage(capacity);
        }
    }

    public final T first(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            T t8 = tArr[i];
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final T firstOrNull(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            T t8 = tArr[i];
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    public final <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            initial = (R) operation.invoke(initial, tArr[i]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull InterfaceC6474f operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            initial = (R) operation.invoke(Integer.valueOf(i), initial, tArr[i]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull InterfaceC6473e operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = (R) operation.invoke(tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final <R> R foldRightIndexed(R initial, @NotNull InterfaceC6474f operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = (R) operation.invoke(Integer.valueOf(size), tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final void forEach(@NotNull InterfaceC6471c block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(tArr[i]);
        }
    }

    public final void forEachIndexed(@NotNull InterfaceC6473e block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(Integer.valueOf(i), tArr[i]);
        }
    }

    public final void forEachReversed(@NotNull InterfaceC6471c block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            block.invoke(tArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(@NotNull InterfaceC6473e block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            block.invoke(Integer.valueOf(size), tArr[size]);
            size--;
        }
    }

    public final T get(int index) {
        return this.content[index];
    }

    @PublishedApi
    @NotNull
    public final T[] getContent() {
        return this.content;
    }

    @NotNull
    public final C6756f getIndices() {
        return AbstractC5806u.m5260N(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T element) {
        T[] tArr = this.content;
        int i = this.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (AbstractC5830k.m5325b(element, tArr[i8])) {
                return i8;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (((Boolean) predicate.invoke(tArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull InterfaceC6471c predicate) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (((Boolean) predicate.invoke(tArr[size])).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final T last(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            T t8 = tArr[size];
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T element) {
        T[] tArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (AbstractC5830k.m5325b(element, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Nullable
    public final T lastOrNull(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            T t8 = tArr[size];
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    public final <R> R[] map(InterfaceC6471c transform) {
        getSize();
        AbstractC5830k.m5338o();
        throw null;
    }

    public final <R> R[] mapIndexed(InterfaceC6473e transform) {
        getSize();
        AbstractC5830k.m5338o();
        throw null;
    }

    public final <R> MutableVector<R> mapIndexedNotNull(InterfaceC6473e transform) {
        getSize();
        AbstractC5830k.m5338o();
        throw null;
    }

    public final <R> MutableVector<R> mapNotNull(InterfaceC6471c transform) {
        getSize();
        AbstractC5830k.m5338o();
        throw null;
    }

    public final void minusAssign(T element) {
        remove(element);
    }

    public final void plusAssign(T element) {
        add(element);
    }

    public final boolean remove(T element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull List<? extends T> elements) {
        int i = this.size;
        int size = elements.size();
        for (int i8 = 0; i8 < size; i8++) {
            remove(elements.get(i8));
        }
        return i != this.size;
    }

    public final T removeAt(int index) {
        T[] tArr = this.content;
        T t8 = tArr[index];
        if (index != getSize() - 1) {
            int i = index + 1;
            System.arraycopy(tArr, i, tArr, index, this.size - i);
        }
        int i8 = this.size - 1;
        this.size = i8;
        tArr[i8] = null;
        return t8;
    }

    public final void removeIf(@NotNull InterfaceC6471c predicate) {
        int size = getSize();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            if (((Boolean) predicate.invoke(this.content[i8])).booleanValue()) {
                i++;
            } else if (i > 0) {
                T[] tArr = this.content;
                tArr[i8 - i] = tArr[i8];
            }
        }
        int i9 = size - i;
        AbstractC5802q.m5186M(null, this.content, i9, size);
        setSize(i9);
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i = this.size;
            if (end < i) {
                T[] tArr = this.content;
                System.arraycopy(tArr, end, tArr, start, i - end);
            }
            int i8 = this.size - (end - start);
            int size = getSize() - 1;
            if (i8 <= size) {
                int i9 = i8;
                while (true) {
                    this.content[i9] = null;
                    if (i9 == size) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.size = i8;
        }
    }

    @PublishedApi
    public final void resizeStorage(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(capacity, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(@NotNull Collection<? extends T> elements) {
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final boolean reversedAny(@NotNull InterfaceC6471c predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (((Boolean) predicate.invoke(tArr[size])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final T set(int index, T element) {
        T[] tArr = this.content;
        T t8 = tArr[index];
        tArr[index] = element;
        return t8;
    }

    @PublishedApi
    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final void sortWith(@NotNull Comparator<T> comparator) {
        T[] tArr = this.content;
        int i = this.size;
        AbstractC5830k.m5330g(tArr, "<this>");
        AbstractC5830k.m5330g(comparator, "comparator");
        Arrays.sort(tArr, 0, i, comparator);
    }

    public final int sumBy(@NotNull InterfaceC6471c selector) {
        T[] tArr = this.content;
        int iIntValue = 0;
        for (int i = 0; i < getSize(); i++) {
            iIntValue += ((Number) selector.invoke(tArr[i])).intValue();
        }
        return iIntValue;
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException(@NotNull String message) {
        throw new NoSuchElementException(message);
    }

    public final boolean containsAll(@NotNull Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    @Nullable
    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean removeAll(@NotNull MutableVector<T> elements) {
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i8 = 0;
            while (true) {
                remove(elements.content[i8]);
                if (i8 == size) {
                    break;
                }
                i8++;
            }
        }
        return i != this.size;
    }

    public final void add(int index, T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i8 = this.size;
        if (index != i8) {
            System.arraycopy(tArr, index, tArr, index + 1, i8 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean containsAll(@NotNull MutableVector<T> elements) {
        C6756f c6756fM5260N = AbstractC5806u.m5260N(0, elements.getSize());
        int i = c6756fM5260N.f11420a;
        int i8 = c6756fM5260N.f11421b;
        if (i > i8) {
            return true;
        }
        while (contains(elements.content[i])) {
            if (i == i8) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(@NotNull Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.size;
    }

    public final boolean addAll(int index, @NotNull MutableVector<T> elements) {
        int i = elements.size;
        if (i == 0) {
            return false;
        }
        int i8 = this.size + i;
        if (this.content.length < i8) {
            resizeStorage(i8);
        }
        T[] tArr = this.content;
        int i9 = this.size;
        if (index != i9) {
            System.arraycopy(tArr, index, tArr, index + i, i9 - index);
        }
        System.arraycopy(elements.content, 0, tArr, index, i);
        this.size += i;
        return true;
    }

    public final boolean addAll(@NotNull List<? extends T> elements) {
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(@NotNull MutableVector<T> elements) {
        return addAll(getSize(), elements);
    }

    public final boolean addAll(@NotNull T[] elements) {
        int length = elements.length;
        if (length == 0) {
            return false;
        }
        int i = this.size + length;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        System.arraycopy(elements, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i8 = this.size + size;
        if (this.content.length < i8) {
            resizeStorage(i8);
        }
        T[] tArr = this.content;
        int i9 = this.size;
        if (index != i9) {
            System.arraycopy(tArr, index, tArr, index + size, i9 - index);
        }
        for (T t8 : elements) {
            int i10 = i + 1;
            if (i >= 0) {
                tArr[i + index] = t8;
                i = i10;
            } else {
                AbstractC5806u.m5258L();
                throw null;
            }
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }
}
