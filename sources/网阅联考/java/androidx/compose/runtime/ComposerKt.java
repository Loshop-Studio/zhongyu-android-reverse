package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3380c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0010\u001a\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0000\u001ai\u0010C\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0Dj\u0002`G2\u0012\u0010H\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030J0I2&\u0010K\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0Dj\u0002`GH\u0003¢\u0006\u0002\u0010L\u001a(\u0010M\u001a\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u00012\b\u0010O\u001a\u0004\u0018\u00010\u00012\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\b\u0010Q\u001a\u00020RH\u0007\u001aP\u0010S\u001a>\u0012\u0004\u0012\u0002HU\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HW0Vj\b\u0012\u0004\u0012\u0002HW`X0Tj\u001e\u0012\u0004\u0012\u0002HU\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HW0Vj\b\u0012\u0004\u0012\u0002HW`X`Y\"\u0004\b\u0000\u0010U\"\u0004\b\u0001\u0010WH\u0002\u001a\u0010\u0010Z\u001a\u00020\u00172\u0006\u0010N\u001a\u00020RH\u0000\u001a\"\u0010Z\u001a\u00020\u00172\u0006\u0010N\u001a\u00020R2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010\\H\u0080\bø\u0001\u0000\u001a\u0018\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020_2\u0006\u0010]\u001a\u00020BH\u0007\u001a\u0010\u0010`\u001a\u00020\u00172\u0006\u0010^\u001a\u00020_H\u0007\u001a \u0010a\u001a\u00020\u00172\u0006\u0010^\u001a\u00020_2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010]\u001a\u00020BH\u0007\u001a\b\u0010c\u001a\u00020\u0017H\u0007\u001a(\u0010d\u001a\u00020\u00172\u0006\u0010b\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020BH\u0007\u001a\u0018\u0010d\u001a\u00020\u00172\u0006\u0010b\u001a\u00020\u00072\u0006\u0010g\u001a\u00020BH\u0007\u001a\f\u0010h\u001a\u00020R*\u00020\u0007H\u0002\u001a\f\u0010i\u001a\u00020\u0007*\u00020RH\u0002\u001a6\u0010j\u001a\u0002Hk\"\u0004\b\u0000\u0010k*\u00020_2\u0006\u0010l\u001a\u00020R2\u0011\u0010m\u001a\r\u0012\u0004\u0012\u0002Hk0\\¢\u0006\u0002\bnH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010o\u001a\u001c\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010q*\u00020r2\u0006\u0010s\u001a\u00020tH\u0002\u001a@\u0010u\u001a\u00020R\"\u0004\b\u0000\u0010k*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0Dj\u0002`G2\f\u0010b\u001a\b\u0012\u0004\u0012\u0002Hk0EH\u0000\u001a\u001c\u0010v\u001a\u00020\u0007*\u00020w2\u0006\u0010x\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u0007H\u0002\u001a(\u0010z\u001a\b\u0012\u0004\u0012\u00020|0{*\b\u0012\u0004\u0012\u00020|0{2\u0006\u0010}\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u0007H\u0002\u001a\u001b\u0010\u007f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020|0{2\u0007\u0010\u0080\u0001\u001a\u00020\u0007H\u0002\u001a\u001c\u0010\u0081\u0001\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020|0{2\u0007\u0010\u0080\u0001\u001a\u00020\u0007H\u0002\u001a%\u0010\u0082\u0001\u001a\u0004\u0018\u00010|*\b\u0012\u0004\u0012\u00020|0{2\u0006\u0010}\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u0007H\u0002\u001aG\u0010\u0083\u0001\u001a\u0002Hk\"\u0004\b\u0000\u0010k*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0Dj\u0002`G2\f\u0010b\u001a\b\u0012\u0004\u0012\u0002Hk0EH\u0000¢\u0006\u0003\u0010\u0084\u0001\u001a1\u0010\u0085\u0001\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020|0{2\u0007\u0010\u0080\u0001\u001a\u00020\u00072\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0084\u0001\u0010\u0089\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0Dj\u0002`G*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0Dj\u0002`G21\u0010\u008a\u0001\u001a,\u0012!\u0012\u001f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0\u008c\u0001\u0012\u0004\u0012\u00020\u00170\u008b\u0001H\u0080\bø\u0001\u0000\u001a(\u0010\u008d\u0001\u001a\u00020\u0007*\u00020w2\u0007\u0010\u008e\u0001\u001a\u00020\u00072\u0007\u0010\u008f\u0001\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u0007H\u0002\u001a[\u0010\u0091\u0001\u001a\u0004\u0018\u0001HW\"\u0004\b\u0000\u0010U\"\u0004\b\u0001\u0010W*4\u0012\u0004\u0012\u0002HU\u0012\n\u0012\b\u0012\u0004\u0012\u0002HW0V0Tj\u001e\u0012\u0004\u0012\u0002HU\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HW0Vj\b\u0012\u0004\u0012\u0002HW`X`Y2\u0006\u0010b\u001a\u0002HUH\u0002¢\u0006\u0003\u0010\u0092\u0001\u001aa\u0010\u0093\u0001\u001a\u00020R\"\u0004\b\u0000\u0010U\"\u0004\b\u0001\u0010W*4\u0012\u0004\u0012\u0002HU\u0012\n\u0012\b\u0012\u0004\u0012\u0002HW0V0Tj\u001e\u0012\u0004\u0012\u0002HU\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HW0Vj\b\u0012\u0004\u0012\u0002HW`X`Y2\u0006\u0010b\u001a\u0002HU2\u0006\u0010N\u001a\u0002HWH\u0002¢\u0006\u0003\u0010\u0094\u0001\u001ac\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0000\u0010U\"\u0004\b\u0001\u0010W*4\u0012\u0004\u0012\u0002HU\u0012\n\u0012\b\u0012\u0004\u0012\u0002HW0V0Tj\u001e\u0012\u0004\u0012\u0002HU\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HW0Vj\b\u0012\u0004\u0012\u0002HW`X`Y2\u0006\u0010b\u001a\u0002HU2\u0006\u0010N\u001a\u0002HWH\u0002¢\u0006\u0003\u0010\u0096\u0001\u001a\u0015\u0010\u0097\u0001\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u001a\u001e\u0010\u0098\u0001\u001a\u0004\u0018\u00010|*\b\u0012\u0004\u0012\u00020|0{2\u0007\u0010\u0080\u0001\u001a\u00020\u0007H\u0002\u001a#\u0010\u0099\u0001\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020|0{2\u0006\u0010}\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u0007H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"[\u0010\r\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000ej\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u001a\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\u0005\"\u0016\u0010\u001d\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0003\"\u000e\u0010\u001f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010 \u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010\u0005\"\u0016\u0010#\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b$\u0010\u0003\"\u001c\u0010%\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0003\u001a\u0004\b'\u0010\u0005\"\u0016\u0010(\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b)\u0010\u0003\"\u001c\u0010*\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0003\u001a\u0004\b,\u0010\u0005\"\u0016\u0010-\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b.\u0010\u0003\"\u001c\u0010/\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0003\u001a\u0004\b1\u0010\u0005\"\u0016\u00102\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b3\u0010\u0003\"[\u00104\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000ej\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"[\u00105\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000ej\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u00106\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b7\u0010\u0003\"\u000e\u00108\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"[\u00109\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000ej\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"[\u0010:\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000ej\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010;\u001a\u00020\u0001*\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>*\u009f\u0001\b\u0000\u0010\u009a\u0001\"K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000e2K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000e*E\b\u0000\u0010\u009b\u0001\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0D2\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010F0D\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009c\u0001"}, m5175d2 = {"compositionLocalMap", "", "getCompositionLocalMap$annotations", "()V", "getCompositionLocalMap", "()Ljava/lang/Object;", "compositionLocalMapKey", "", "getCompositionLocalMapKey$annotations", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "defaultsKey", "endGroupInstance", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "invalidGroupLocation", "invocation", "getInvocation$annotations", "getInvocation", "invocationKey", "getInvocationKey$annotations", "nodeKey", C3380c.f1960M, "getProvider$annotations", "getProvider", "providerKey", "getProviderKey$annotations", "providerMaps", "getProviderMaps$annotations", "getProviderMaps", "providerMapsKey", "getProviderMapsKey$annotations", "providerValues", "getProviderValues$annotations", "getProviderValues", "providerValuesKey", "getProviderValuesKey$annotations", "reference", "getReference$annotations", "getReference", "referenceKey", "getReferenceKey$annotations", "removeCurrentGroupInstance", "resetSlotsInstance", "reuseKey", "getReuseKey$annotations", "rootKey", "skipToGroupEndInstance", "startRootGroup", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "composeRuntimeError", "", "message", "", "compositionLocalMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getKey", "value", "left", "right", "isTraceInProgress", "", "multiMap", "Ljava/util/HashMap;", "K", "Ljava/util/LinkedHashSet;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "runtimeCheck", "lazyMessage", "Lkotlin/Function0;", "sourceInformation", "composer", "Landroidx/compose/runtime/Composer;", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "key", "traceEventEnd", "traceEventStart", "dirty1", "dirty2", "info", "asBool", "asInt", "cache", ExifInterface.GPS_DIRECTION_TRUE, "invalid", "block", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collectNodesFrom", "", "Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "contains", "distanceFrom", "Landroidx/compose/runtime/SlotReader;", "index", "root", "filterToRange", "", "Landroidx/compose/runtime/Invalidation;", "start", "end", "findInsertLocation", "location", "findLocation", "firstInRange", "getValueOf", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "insertIfMissing", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "mutate", "mutator", "Lkotlin/Function1;", "", "nearestCommonRootOf", C3335ai.f1705at, "b", "common", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "removeCurrentGroup", "removeLocation", "removeRange", "Change", "CompositionLocalMap", "runtime_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4507:1\n309#1:4508\n4492#1,5:4525\n1#2:4509\n361#3,7:4510\n146#4,8:4517\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n325#1:4508\n4498#1:4525,5\n4232#1:4510,7\n4346#1:4517,8\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> removeCurrentGroupInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$removeCurrentGroupInstance$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
            ComposerKt.removeCurrentGroup(slots, rememberManager);
        }
    };
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> skipToGroupEndInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$skipToGroupEndInstance$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
            slots.skipToGroupEnd();
        }
    };
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> endGroupInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$endGroupInstance$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
            slots.endGroup();
        }
    };
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> startRootGroup = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$startRootGroup$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
            slots.ensureStarted(0);
        }
    };
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> resetSlotsInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$resetSlotsInstance$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            invoke2(applier, slotWriter, rememberManager);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
            slots.reset();
        }
    };
    private static final Object invocation = new OpaqueKey(C3380c.f1960M);
    private static final Object provider = new OpaqueKey(C3380c.f1960M);
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i4) {
        return i4 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z3) {
        return z3 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z3, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(composer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T t3 = (T) composer.rememberedValue();
        if (!z3 && t3 != Composer.INSTANCE.getEmpty()) {
            return t3;
        }
        T tInvoke = block.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i4) {
        if (slotReader.isNode(i4)) {
            list.add(slotReader.node(i4));
            return;
        }
        int iGroupSize = i4 + 1;
        int iGroupSize2 = i4 + slotReader.groupSize(i4);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final Void composeRuntimeError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i4) {
        composer.startReplaceableGroup(721128344);
        if (isTraceInProgress()) {
            traceEventStart(721128344, i4, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        PersistentMap.Builder builder = ExtensionsKt.persistentHashMapOf().builder();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            composer.startReplaceableGroup(680853375);
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
                Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(compositionLocal, providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 8));
            }
            composer.endReplaceableGroup();
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapBuild = builder.build();
        if (isTraceInProgress()) {
            traceEventEnd();
        }
        composer.endReplaceableGroup();
        return persistentMapBuild;
    }

    public static final <T> boolean contains(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return persistentMap.containsKey(key);
    }

    private static final int distanceFrom(SlotReader slotReader, int i4, int i5) {
        int i6 = 0;
        while (i4 > 0 && i4 != i5) {
            i4 = slotReader.parent(i4);
            i6++;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i4); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i5) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i4) {
        int iFindLocation = findLocation(list, i4);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i4) {
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i6).getLocation(), i4);
            if (iCompare < 0) {
                i5 = i6 + 1;
            } else {
                if (iCompare <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i4, int i5) {
        int iFindInsertLocation = findInsertLocation(list, i4);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i5) {
            return invalidation;
        }
        return null;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static final Object getInvocation() {
        return invocation;
    }

    @PublishedApi
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    public static final Object getProvider() {
        return provider;
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static final Object getReference() {
        return reference;
    }

    @PublishedApi
    public static /* synthetic */ void getReference$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final <T> T getValueOf(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        State<? extends Object> state = persistentMap.get(key);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i4, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i4);
        IdentityArraySet identityArraySet = null;
        if (iFindLocation < 0) {
            int i5 = -(iFindLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i5, new Invalidation(recomposeScopeImpl, i4, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(iFindLocation).setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = list.get(iFindLocation).getInstances();
        if (instances != null) {
            instances.add(obj);
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Function1<? super Map<CompositionLocal<Object>, State<Object>>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        mutator.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i4, int i5, int i6) {
        if (i4 == i5) {
            return i4;
        }
        if (i4 == i6 || i5 == i6) {
            return i6;
        }
        if (slotReader.parent(i4) == i5) {
            return i5;
        }
        if (slotReader.parent(i5) == i4) {
            return i4;
        }
        if (slotReader.parent(i4) == slotReader.parent(i5)) {
            return slotReader.parent(i4);
        }
        int iDistanceFrom = distanceFrom(slotReader, i4, i6);
        int iDistanceFrom2 = distanceFrom(slotReader, i5, i6);
        int i7 = iDistanceFrom - iDistanceFrom2;
        for (int i8 = 0; i8 < i7; i8++) {
            i4 = slotReader.parent(i4);
        }
        int i9 = iDistanceFrom2 - iDistanceFrom;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = slotReader.parent(i5);
        }
        while (i4 != i5) {
            i4 = slotReader.parent(i4);
            i5 = slotReader.parent(i5);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> map, K k4) {
        V v3;
        LinkedHashSet<V> linkedHashSet = map.get(k4);
        if (linkedHashSet == null || (v3 = (V) CollectionsKt___CollectionsKt.firstOrNull(linkedHashSet)) == null) {
            return null;
        }
        remove(map, k4, v3);
        return v3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> map, K k4, V v3) {
        LinkedHashSet<V> linkedHashSet = map.get(k4);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(k4, linkedHashSet);
        }
        return linkedHashSet.add(v3);
    }

    private static final <K, V> Unit remove(HashMap<K, LinkedHashSet<V>> map, K k4, V v3) {
        LinkedHashSet<V> linkedHashSet = map.get(k4);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v3);
        if (linkedHashSet.isEmpty()) {
            map.remove(k4);
        }
        return Unit.INSTANCE;
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl composition;
        Intrinsics.checkNotNullParameter(slotWriter, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        Iterator<Object> itGroupSlots = slotWriter.groupSlots();
        while (itGroupSlots.hasNext()) {
            Object next = itGroupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            }
            if ((next instanceof RecomposeScopeImpl) && (composition = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.release();
            }
        }
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i4) {
        int iFindLocation = findLocation(list, i4);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i4, int i5) {
        int iFindInsertLocation = findInsertLocation(list, i4);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i5) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z3, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z3) {
            return;
        }
        composeRuntimeError(lazyMessage.invoke().toString());
        throw new KotlinNothingValueException();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformation(sourceInformation);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i4, String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformationMarkerStart(i4, sourceInformation);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload with $dirty metadata instead", replaceWith = @ReplaceWith(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    @ComposeCompilerApi
    public static final /* synthetic */ void traceEventStart(int i4, String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        traceEventStart(i4, -1, -1, info);
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i4, int i5, int i6, String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i4, i5, i6, info);
        }
    }

    public static final void runtimeCheck(boolean z3) {
        if (z3) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new KotlinNothingValueException();
    }
}
