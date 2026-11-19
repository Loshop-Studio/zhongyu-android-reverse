package androidx.compose.p011ui.util;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001aE\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001aA\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a_\u0010\u001f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0010\b\u0002\u0010\u001d*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00028\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b!\u0010\u0012\u001aE\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010\u0019\u001ag\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\u0010\n\u0006\b\u0001\u0012\u0002\u0010\u0001\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$\u001ab\u0010*\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b*\u0010+\u001a`\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u0017\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010.\u001ab\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012)\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(,\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b/\u0010.\u001aQ\u00100\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u00101\u001aW\u00103\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00102\u001a\u00028\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b3\u00104\u001aQ\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b5\u0010.\u001a^\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u00106\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012'\u0010)\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b7\u00108\u001a\u0083\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u00109*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u000126\u0010\u0017\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(;\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(<\u0012\u0004\u0012\u00028\u00020\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b=\u0010>\u001aM\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b?\u0010\u0019\u001ag\u0010G\u001a\u00020F\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020@2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020@\u0018\u00010\u0002¢\u0006\u0004\bG\u0010H\u001aK\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010I*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bJ\u0010\u0019\u001aQ\u0010K\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010\u0012\u001aQ\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010L0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bM\u0010\u0019\u001a)\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020N*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\bO\u0010P\u001a?\u0010Q\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bQ\u0010\u0012\u001a\u007f\u0010V\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010T*\u00060Rj\u0002`S*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010U\u001a\u00028\u00012\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020@2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020@\u0018\u00010\u0002H\u0002¢\u0006\u0004\bV\u0010W\u001a;\u0010Y\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060Rj\u0002`S2\u0006\u0010X\u001a\u00028\u00002\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020@\u0018\u00010\u0002H\u0002¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020FH\u0001¢\u0006\u0004\b]\u0010^\u001a\u0017\u0010_\u001a\u00020\u00032\u0006\u0010[\u001a\u00020FH\u0001¢\u0006\u0004\b_\u0010`¨\u0006a"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "Ld6/s;", "action", "fastForEach", "(Ljava/util/List;Lr6/c;)V", "fastForEachReversed", "Lkotlin/Function2;", "", "fastForEachIndexed", "(Ljava/util/List;Lr6/e;)V", "", "predicate", "fastAll", "(Ljava/util/List;Lr6/c;)Z", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lr6/c;)Ljava/lang/Object;", "selector", "fastSumBy", "(Ljava/util/List;Lr6/c;)I", "R", "transform", "fastMap", "(Ljava/util/List;Lr6/c;)Ljava/util/List;", "", "fastMaxBy", "", "C", "destination", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lr6/c;)Ljava/util/Collection;", "fastLastOrNull", "fastFilter", "fastFilteredMap", "(Ljava/util/List;Lr6/c;Lr6/c;)Ljava/util/List;", "initial", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "operation", "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "index", "fastMapIndexed", "(Ljava/util/List;Lr6/e;)Ljava/util/List;", "fastMapIndexedNotNull", "fastMaxOfOrNull", "(Ljava/util/List;Lr6/c;)Ljava/lang/Comparable;", "defaultValue", "fastMaxOfOrDefault", "(Ljava/util/List;Ljava/lang/Comparable;Lr6/c;)Ljava/lang/Comparable;", "fastZipWithNext", ExifInterface.LATITUDE_SOUTH, "fastReduce", "(Ljava/util/List;Lr6/e;)Ljava/lang/Object;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "other", "a", "b", "fastZip", "(Ljava/util/List;Ljava/util/List;Lr6/e;)Ljava/util/List;", "fastMapNotNull", "", "separator", RequestParameters.PREFIX, "postfix", "limit", "truncated", "", "fastJoinToString", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/String;", "K", "fastDistinctBy", "fastMinByOrNull", "", "fastFlatMap", "", "fastFilterNotNull", "(Ljava/util/List;)Ljava/util/List;", "fastFirst", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "buffer", "fastJoinTo", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lr6/c;)Ljava/lang/Appendable;", "element", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lr6/c;)V", "message", "", "throwNoSuchElementException", "(Ljava/lang/String;)Ljava/lang/Void;", "throwUnsupportedOperationException", "(Ljava/lang/String;)V", "ui-util_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n34#1,6:623\n34#1,6:629\n34#1,6:635\n34#1,6:641\n34#1,6:647\n34#1,6:653\n34#1,6:659\n34#1,6:665\n34#1,6:671\n70#1,6:677\n70#1,4:683\n75#1:688\n34#1,6:689\n34#1,6:695\n34#1,6:701\n34#1,6:707\n34#1,6:713\n1#2:687\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n88#1:623,6\n103#1:629,6\n118#1:635,6\n135#1:641,6\n152#1:647,6\n198#1:653,6\n232#1:659,6\n252#1:665,6\n271#1:671,6\n288#1:677,6\n305#1:683,4\n305#1:688\n441#1:689,6\n485#1:695,6\n531#1:701,6\n547#1:707,6\n564#1:713,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t8, InterfaceC6471c interfaceC6471c) throws IOException {
        if (interfaceC6471c != null) {
            appendable.append((CharSequence) interfaceC6471c.invoke(t8));
            return;
        }
        if (t8 == 0 ? true : t8 instanceof CharSequence) {
            appendable.append((CharSequence) t8);
        } else if (t8 instanceof Character) {
            appendable.append(((Character) t8).charValue());
        } else {
            appendable.append(String.valueOf(t8));
        }
    }

    public static final <T> boolean fastAll(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) interfaceC6471c.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) interfaceC6471c.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T, K> List<T> fastDistinctBy(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (mutableScatterSet.add(interfaceC6471c.invoke(t8))) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilter(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilterNotNull(@NotNull List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (t8 != null) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastFilteredMap(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                arrayList.add(interfaceC6471c2.invoke(t8));
            }
        }
        return arrayList;
    }

    public static final <T> T fastFirst(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final <T> T fastFirstOrNull(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t8 = list.get(i);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> List<R> fastFlatMap(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC5810y.m5291S((Iterable) interfaceC6471c.invoke(list.get(i)), arrayList);
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@NotNull List<? extends T> list, R r, @NotNull InterfaceC6473e interfaceC6473e) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = (R) interfaceC6473e.invoke(r, list.get(i));
        }
        return r;
    }

    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            interfaceC6471c.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            interfaceC6473e.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            interfaceC6471c.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6471c interfaceC6471c) throws IOException {
        a9.append(charSequence2);
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            T t8 = list.get(i9);
            i8++;
            if (i8 > 1) {
                a9.append(charSequence);
            }
            if (i >= 0 && i8 > i) {
                break;
            }
            appendElement(a9, t8, interfaceC6471c);
        }
        if (i >= 0 && i8 > i) {
            a9.append(charSequence4);
        }
        a9.append(charSequence3);
        return a9;
    }

    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable InterfaceC6471c interfaceC6471c) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6471c)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC6471c = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i, charSequence5, interfaceC6471c2);
    }

    @Nullable
    public static final <T> T fastLastOrNull(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t8 = list.get(size);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                return t8;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    @NotNull
    public static final <T, R> List<R> fastMap(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(interfaceC6471c.invoke(list.get(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastMapIndexed(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(interfaceC6473e.invoke(Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastMapIndexedNotNull(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objInvoke = interfaceC6473e.invoke(Integer.valueOf(i), list.get(i));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastMapNotNull(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objInvoke = interfaceC6471c.invoke(list.get(i));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@NotNull List<? extends T> list, @NotNull C c, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(interfaceC6471c.invoke(list.get(i)));
        }
        return c;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T fastMaxBy(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        if (list.isEmpty()) {
            return null;
        }
        T t8 = list.get(0);
        Comparable comparable = (Comparable) interfaceC6471c.invoke(t8);
        int iM5282u = AbstractC5806u.m5282u(list);
        int i = 1;
        if (1 <= iM5282u) {
            while (true) {
                T t9 = list.get(i);
                Comparable comparable2 = (Comparable) interfaceC6471c.invoke(t9);
                if (comparable.compareTo(comparable2) < 0) {
                    t8 = t9;
                    comparable = comparable2;
                }
                if (i == iM5282u) {
                    break;
                }
                i++;
            }
        }
        return t8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(@NotNull List<? extends T> list, @NotNull R r, @NotNull InterfaceC6471c interfaceC6471c) {
        if (list.isEmpty()) {
            return r;
        }
        R r8 = (R) interfaceC6471c.invoke(list.get(0));
        int iM5282u = AbstractC5806u.m5282u(list);
        int i = 1;
        if (1 <= iM5282u) {
            while (true) {
                Comparable comparable = (Comparable) interfaceC6471c.invoke(list.get(i));
                if (comparable.compareTo(r8) > 0) {
                    r8 = comparable;
                }
                if (i == iM5282u) {
                    break;
                }
                i++;
            }
        }
        return r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        if (list.isEmpty()) {
            return null;
        }
        R r = (R) interfaceC6471c.invoke(list.get(0));
        int iM5282u = AbstractC5806u.m5282u(list);
        int i = 1;
        if (1 <= iM5282u) {
            while (true) {
                Comparable comparable = (Comparable) interfaceC6471c.invoke(list.get(i));
                if (comparable.compareTo(r) > 0) {
                    r = comparable;
                }
                if (i == iM5282u) {
                    break;
                }
                i++;
            }
        }
        return r;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        if (list.isEmpty()) {
            return null;
        }
        T t8 = list.get(0);
        Comparable comparable = (Comparable) interfaceC6471c.invoke(t8);
        int iM5282u = AbstractC5806u.m5282u(list);
        int i = 1;
        if (1 <= iM5282u) {
            while (true) {
                T t9 = list.get(i);
                Comparable comparable2 = (Comparable) interfaceC6471c.invoke(t9);
                if (comparable.compareTo(comparable2) > 0) {
                    t8 = t9;
                    comparable = comparable2;
                }
                if (i == iM5282u) {
                    break;
                }
                i++;
            }
        }
        return t8;
    }

    public static final <S, T extends S> S fastReduce(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s8 = (S) AbstractC5805t.m5228h0(list);
        int iM5282u = AbstractC5806u.m5282u(list);
        int i = 1;
        if (1 <= iM5282u) {
            while (true) {
                s8 = (S) interfaceC6473e.invoke(s8, list.get(i));
                if (i == iM5282u) {
                    break;
                }
                i++;
            }
        }
        return s8;
    }

    public static final <T> int fastSumBy(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        int iIntValue = 0;
        for (int i = 0; i < size; i++) {
            iIntValue += ((Number) interfaceC6471c.invoke(list.get(i))).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <T, R, V> List<V> fastZip(@NotNull List<? extends T> list, @NotNull List<? extends R> list2, @NotNull InterfaceC6473e interfaceC6473e) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(interfaceC6473e.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        if (list.size() <= 1) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t8 = list.get(0);
        int iM5282u = AbstractC5806u.m5282u(list);
        while (i < iM5282u) {
            i++;
            T t9 = list.get(i);
            arrayList.add(interfaceC6473e.invoke(t8, t9));
            t8 = t9;
        }
        return arrayList;
    }

    @PublishedApi
    @NotNull
    public static final Void throwNoSuchElementException(@NotNull String str) {
        throw new NoSuchElementException(str);
    }

    @PublishedApi
    public static final void throwUnsupportedOperationException(@NotNull String str) {
        throw new UnsupportedOperationException(str);
    }
}
