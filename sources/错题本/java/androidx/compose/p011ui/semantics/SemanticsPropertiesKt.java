package androidx.compose.p011ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.autofill.ContentDataType;
import androidx.compose.p011ui.autofill.ContentType;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.compose.DialogNavigator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.C5833n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p207y6.InterfaceC6792p;

@Metadata(m5109d1 = {"\u0000æ\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bH\u0000¢\u0006\u0004\b\u0006\u0010\n\u001a4\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0011\u0010\u0016\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u0011\u0010\u0017\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u0011\u0010\u0018\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012\u001a\u0019\u0010\u001a\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010 \u001a\u00020\u0010*\u00020\u000f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0004\b \u0010!\u001a\u0011\u0010\"\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\"\u0010\u0012\u001a9\u0010'\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u001a\u0010&\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b'\u0010(\u001a-\u0010*\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\b*\u0010+\u001a-\u0010,\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\b,\u0010+\u001aW\u00101\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000328\u0010&\u001a4\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0004\b1\u00102\u001aD\u00106\u001a\u00020\u0010*\u00020\u000f21\u0010&\u001a-\b\u0001\u0012\u0013\u0012\u001103¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u00020305\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\b¢\u0006\u0004\b6\u00107\u001a1\u00108\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b8\u0010(\u001a3\u0010:\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b:\u0010(\u001a3\u0010;\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b;\u0010(\u001a3\u0010<\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b<\u0010(\u001a3\u0010=\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b=\u0010(\u001a3\u0010>\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b>\u0010(\u001a-\u0010?\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\b?\u0010+\u001a3\u0010@\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c¢\u0006\u0004\b@\u0010(\u001a8\u0010E\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010B\u001a\u00020A2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a/\u0010F\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)H\u0007¢\u0006\u0004\bF\u0010+\u001al\u0010K\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032M\u0010&\u001aI\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(H\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(I\u0012\u0013\u0012\u00110\f¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\f\u0018\u00010G¢\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bM\u0010+\u001a-\u0010N\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bN\u0010+\u001a-\u0010O\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bO\u0010+\u001a-\u0010P\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bP\u0010+\u001a-\u0010Q\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bQ\u0010+\u001a-\u0010R\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bR\u0010+\u001a-\u0010S\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bS\u0010+\u001a-\u0010T\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bT\u0010+\u001a-\u0010U\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bU\u0010+\u001a-\u0010V\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bV\u0010+\u001a-\u0010W\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)¢\u0006\u0004\bW\u0010+\u001a-\u0010X\u001a\u00020\u0010*\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)¢\u0006\u0004\bX\u0010+\"(\u0010]\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010Y\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010\u001b\"/\u0010c\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010^\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b_\u0010[\"\u0004\b`\u0010\u001b*\u0004\ba\u0010b\"/\u0010j\u001a\u00020d*\u00020\u000f2\u0006\u0010^\u001a\u00020d8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\be\u0010f\"\u0004\bg\u0010h*\u0004\bi\u0010b\"/\u0010n\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010^\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bk\u0010[\"\u0004\bl\u0010\u001b*\u0004\bm\u0010b\"/\u0010u\u001a\u00020o*\u00020\u000f2\u0006\u0010^\u001a\u00020o8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010q\"\u0004\br\u0010s*\u0004\bt\u0010b\"/\u0010{\u001a\u00020\f*\u00020\u000f2\u0006\u0010^\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y*\u0004\bz\u0010b\"5\u0010|\u001a\u00020\f*\u00020\u000f2\u0006\u0010^\u001a\u00020\f8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b~\u0010\u0012\u001a\u0004\b|\u0010w\"\u0004\b}\u0010y*\u0004\b\u007f\u0010b\"3\u0010\u0080\u0001\u001a\u00020\f*\u00020\u000f2\u0006\u0010^\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0080\u0001\u0010w\"\u0005\b\u0081\u0001\u0010y*\u0005\b\u0082\u0001\u0010b\"7\u0010\u0089\u0001\u001a\u00030\u0083\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030\u0083\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001*\u0005\b\u0088\u0001\u0010b\"7\u0010\u0090\u0001\u001a\u00030\u008a\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030\u008a\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001*\u0005\b\u008f\u0001\u0010b\"5\u0010\u0096\u0001\u001a\u00020-*\u00020\u000f2\u0006\u0010^\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001*\u0005\b\u0095\u0001\u0010b\"7\u0010\u009d\u0001\u001a\u00030\u0097\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030\u0097\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001*\u0005\b\u009c\u0001\u0010b\"7\u0010¡\u0001\u001a\u00030\u0097\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030\u0097\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009e\u0001\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001*\u0005\b \u0001\u0010b\"5\u0010¦\u0001\u001a\u00030¢\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030¢\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b£\u0001\u0010q\"\u0005\b¤\u0001\u0010s*\u0005\b¥\u0001\u0010b\"3\u0010ª\u0001\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010^\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b§\u0001\u0010[\"\u0005\b¨\u0001\u0010\u001b*\u0005\b©\u0001\u0010b\",\u0010®\u0001\u001a\u000209*\u00020\u000f2\u0006\u0010Y\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0005\b<\u0010\u00ad\u0001\"4\u0010±\u0001\u001a\u000209*\u00020\u000f2\u0006\u0010^\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0006\b¯\u0001\u0010¬\u0001\"\u0005\b=\u0010\u00ad\u0001*\u0005\b°\u0001\u0010b\"3\u0010²\u0001\u001a\u00020\f*\u00020\u000f2\u0006\u0010^\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b²\u0001\u0010w\"\u0005\b³\u0001\u0010y*\u0005\b´\u0001\u0010b\"5\u0010¸\u0001\u001a\u000209*\u00020\u000f2\u0006\u0010^\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bµ\u0001\u0010¬\u0001\"\u0006\b¶\u0001\u0010\u00ad\u0001*\u0005\b·\u0001\u0010b\"5\u0010¼\u0001\u001a\u000209*\u00020\u000f2\u0006\u0010^\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¹\u0001\u0010¬\u0001\"\u0006\bº\u0001\u0010\u00ad\u0001*\u0005\b»\u0001\u0010b\"7\u0010Ã\u0001\u001a\u00030½\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030½\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001*\u0005\bÂ\u0001\u0010b\":\u0010È\u0001\u001a\u00020A*\u00020\u000f2\u0006\u0010^\u001a\u00020A8G@GX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\bÆ\u0001\u0010\u0012\u001a\u0005\bÄ\u0001\u0010q\"\u0005\bÅ\u0001\u0010s*\u0005\bÇ\u0001\u0010b\"3\u0010Ì\u0001\u001a\u00020\f*\u00020\u000f2\u0006\u0010^\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÉ\u0001\u0010w\"\u0005\bÊ\u0001\u0010y*\u0005\bË\u0001\u0010b\"7\u0010Ó\u0001\u001a\u00030Í\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030Í\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001*\u0005\bÒ\u0001\u0010b\"7\u0010Ú\u0001\u001a\u00030Ô\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030Ô\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001*\u0005\bÙ\u0001\u0010b\"7\u0010á\u0001\u001a\u00030Û\u0001*\u00020\u000f2\u0007\u0010^\u001a\u00030Û\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001*\u0005\bà\u0001\u0010b\"3\u0010â\u0001\u001a\u00020\f*\u00020\u000f2\u0006\u0010^\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bâ\u0001\u0010w\"\u0005\bã\u0001\u0010y*\u0005\bä\u0001\u0010b\"3\u0010è\u0001\u001a\u00020\u001e*\u00020\u000f2\u0006\u0010^\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bå\u0001\u0010q\"\u0005\bæ\u0001\u0010s*\u0005\bç\u0001\u0010b\"E\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030ê\u00010é\u0001*\u00020\u000f2\u000e\u0010^\u001a\n\u0012\u0005\u0012\u00030ê\u00010é\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001*\u0005\bï\u0001\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006ñ\u0001"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "AccessibilityKey", "(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function2;", "mergePolicy", "(Ljava/lang/String;Lr6/e;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Ld6/d;", "", "Landroidx/compose/ui/semantics/AccessibilityAction;", "ActionPropertyKey", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Ld6/s;", "heading", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "disabled", "invisibleToUser", "hideFromAccessibility", "popup", DialogNavigator.NAME, HintConstants.AUTOFILL_HINT_PASSWORD, "description", "error", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lr6/c;)V", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "action", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lr6/c;)V", "Lkotlin/Function0;", "onClick", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lr6/a;)V", "onLongClick", "", "Lkotlin/ParameterName;", "x", "y", "scrollBy", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lr6/e;)V", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lh6/c;", "scrollByOffset", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lr6/e;)V", "scrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "onAutofillText", "setProgress", "setText", "setTextSubstitution", "showTextSubstitution", "clearTextSubstitution", "insertTextAtCursor", "Landroidx/compose/ui/text/input/ImeAction;", "imeActionType", "onImeAction-9UiTYpY", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lr6/a;)V", "onImeAction", "performImeAction", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "setSelection", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lr6/f;)V", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "pageUp", "pageDown", "pageLeft", "pageRight", "getScrollViewportLength", "value", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "contentDescription", "<set-?>", "getStateDescription", "setStateDescription", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "setPaneTitle", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getFocused$delegate", "focused", "isContainer", "setContainer", "isContainer$annotations", "isContainer$delegate", "isTraversalGroup", "setTraversalGroup", "isTraversalGroup$delegate", "Landroidx/compose/ui/autofill/ContentType;", "getContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", "setContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentType;)V", "getContentType$delegate", "contentType", "Landroidx/compose/ui/autofill/ContentDataType;", "getContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", "setContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentDataType;)V", "getContentDataType$delegate", "contentDataType", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "getTraversalIndex$delegate", "traversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "setRole-kuIjeqM", "getRole$delegate", "role", "getTestTag", "setTestTag", "getTestTag$delegate", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getTextSubstitution", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "setShowingTextSubstitution", "isShowingTextSubstitution$delegate", "getInputText", "setInputText", "getInputText$delegate", "inputText", "getEditableText", "setEditableText", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "getImeAction", "setImeAction-4L7nppU", "getImeAction$annotations", "getImeAction$delegate", "imeAction", "getSelected", "setSelected", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "getCollectionItemInfo$delegate", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "isEditable", "setEditable", "isEditable$delegate", "getMaxTextLength", "setMaxTextLength", "getMaxTextLength$delegate", "maxTextLength", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ InterfaceC6792p[] $$delegatedProperties;

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m5110d2 = {"Ld6/d;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/semantics/AccessibilityAction;", "parentValue", "childValue", "invoke", "(Landroidx/compose/ui/semantics/AccessibilityAction;Landroidx/compose/ui/semantics/AccessibilityAction;)Landroidx/compose/ui/semantics/AccessibilityAction;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
    public static final class C22931 extends Lambda implements InterfaceC6473e {
        public static final C22931 INSTANCE = new C22931();

        public C22931() {
            super(2);
        }

        @Override // p152r6.InterfaceC6473e
        public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
            String label;
            InterfaceC5428d action;
            if (accessibilityAction == 0 || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == 0 || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new AccessibilityAction<>(label, action);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        C5833n c5833n = AbstractC5832m.f9223a;
        c5833n.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1);
        c5833n.getClass();
        $$delegatedProperties = new InterfaceC6792p[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c5833n), AbstractC1923c.m1054r(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, c5833n)};
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.getStateDescription();
        semanticsProperties.getProgressBarRangeInfo();
        semanticsProperties.getPaneTitle();
        semanticsProperties.getLiveRegion();
        semanticsProperties.getFocused();
        semanticsProperties.getIsContainer();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getContentType();
        semanticsProperties.getContentDataType();
        semanticsProperties.getTraversalIndex();
        semanticsProperties.getHorizontalScrollAxisRange();
        semanticsProperties.getVerticalScrollAxisRange();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.getTextSubstitution();
        semanticsProperties.getIsShowingTextSubstitution();
        semanticsProperties.getInputText();
        semanticsProperties.getEditableText();
        semanticsProperties.getTextSelectionRange();
        semanticsProperties.getImeAction();
        semanticsProperties.getSelected();
        semanticsProperties.getCollectionInfo();
        semanticsProperties.getCollectionItemInfo();
        semanticsProperties.getToggleableState();
        semanticsProperties.getIsEditable();
        semanticsProperties.getMaxTextLength();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    @NotNull
    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(@NotNull String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    private static final <T extends InterfaceC5428d> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return AccessibilityKey(str, C22931.INSTANCE);
    }

    public static final void clearTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void clearTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void collapse(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void copyText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void cutText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void dialog(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), C5443s.f8405a);
    }

    public static final void disabled(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), C5443s.f8405a);
    }

    public static final void dismiss(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void error(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void expand(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    @NotNull
    public static final CollectionInfo getCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[21]);
    }

    @NotNull
    public static final CollectionItemInfo getCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[22]);
    }

    @NotNull
    public static final ContentDataType getContentDataType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentDataType().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]);
    }

    @NotNull
    public static final String getContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (String) throwSemanticsGetNotSupported();
    }

    @NotNull
    public static final ContentType getContentType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentType().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]);
    }

    @NotNull
    public static final List<CustomAccessibilityAction> getCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[26]);
    }

    @NotNull
    public static final AnnotatedString getEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]);
    }

    public static final boolean getFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    @NotNull
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]);
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[19]).getValue();
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void getImeAction$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @NotNull
    public static final AnnotatedString getInputText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getInputText().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]);
    }

    public static final int getLiveRegion(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).getValue();
    }

    public static final int getMaxTextLength(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getMaxTextLength().getValue(semanticsPropertyReceiver, $$delegatedProperties[25]).intValue();
    }

    @NotNull
    public static final String getPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    @NotNull
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final int getRole(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]).getValue();
    }

    public static final void getScrollViewportLength(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @NotNull final InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetScrollViewportLength(), new AccessibilityAction(str, new InterfaceC6471c() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt.getScrollViewportLength.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(List<Float> list) {
                boolean z8;
                Float f = (Float) interfaceC6469a.invoke();
                if (f == null) {
                    z8 = false;
                } else {
                    list.add(f);
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }));
    }

    public static /* synthetic */ void getScrollViewportLength$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getScrollViewportLength(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final boolean getSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[20]).booleanValue();
    }

    @NotNull
    public static final String getStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @NotNull
    public static final String getTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]);
    }

    @NotNull
    public static final AnnotatedString getText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void getTextLayoutResult(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    public static final long getTextSelectionRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[18]).getPackedValue();
    }

    @NotNull
    public static final AnnotatedString getTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    @NotNull
    public static final ToggleableState getToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[23]);
    }

    public static final float getTraversalIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]).floatValue();
    }

    @NotNull
    public static final ScrollAxisRange getVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]);
    }

    public static final void heading(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), C5443s.f8405a);
    }

    public static final void hideFromAccessibility(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHideFromAccessibility(), C5443s.f8405a);
    }

    public static final void indexForKey(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), interfaceC6471c);
    }

    public static final void insertTextAtCursor(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    @Deprecated(message = "Use `hideFromAccessibility()` instead.", replaceWith = @ReplaceWith(expression = "hideFromAccessibility()", imports = {}))
    public static final void invisibleToUser(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), C5443s.f8405a);
    }

    public static final boolean isContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsContainer().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final boolean isEditable(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsEditable().getValue(semanticsPropertyReceiver, $$delegatedProperties[24]).booleanValue();
    }

    public static final boolean isShowingTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]).booleanValue();
    }

    public static final boolean isTraversalGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]).booleanValue();
    }

    public static final void onAutofillText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnAutofillText(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static /* synthetic */ void onAutofillText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onAutofillText(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    public static final void onClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    /* renamed from: onImeAction-9UiTYpY, reason: not valid java name */
    public static final void m12547onImeAction9UiTYpY(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getImeAction(), ImeAction.m12933boximpl(i));
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, interfaceC6469a));
    }

    /* renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static /* synthetic */ void m12548onImeAction9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver, int i, String str, InterfaceC6469a interfaceC6469a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        m12547onImeAction9UiTYpY(semanticsPropertyReceiver, i, str, interfaceC6469a);
    }

    public static final void onLongClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void pageDown(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void pageLeft(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void pageRight(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void pageUp(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void password(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), C5443s.f8405a);
    }

    public static final void pasteText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @ReplaceWith(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void popup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), C5443s.f8405a);
    }

    public static final void requestFocus(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6469a interfaceC6469a) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, interfaceC6469a));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, interfaceC6469a);
    }

    public static final void scrollBy(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6473e interfaceC6473e) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, interfaceC6473e));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, interfaceC6473e);
    }

    public static final void scrollByOffset(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull InterfaceC6473e interfaceC6473e) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollByOffset(), interfaceC6473e);
    }

    public static final void scrollToIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @NotNull InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    public static final void selectableGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), C5443s.f8405a);
    }

    public static final void setCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionInfo collectionInfo) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[21], collectionInfo);
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionItemInfo collectionItemInfo) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[22], collectionItemInfo);
    }

    public static final void setContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsProperties.INSTANCE.getIsContainer().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], Boolean.valueOf(z8));
    }

    public static final void setContentDataType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ContentDataType contentDataType) {
        SemanticsProperties.INSTANCE.getContentDataType().setValue(semanticsPropertyReceiver, $$delegatedProperties[8], contentDataType);
    }

    public static final void setContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), AbstractC5806u.m5286y(str));
    }

    public static final void setContentType(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ContentType contentType) {
        SemanticsProperties.INSTANCE.getContentType().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], contentType);
    }

    public static final void setCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull List<CustomAccessibilityAction> list) {
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[26], list);
    }

    public static final void setEditable(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsProperties.INSTANCE.getIsEditable().setValue(semanticsPropertyReceiver, $$delegatedProperties[24], Boolean.valueOf(z8));
    }

    public static final void setEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], annotatedString);
    }

    public static final void setFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z8));
    }

    public static final void setHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], scrollAxisRange);
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    /* renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m12549setImeAction4L7nppU(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, $$delegatedProperties[19], ImeAction.m12933boximpl(i));
    }

    public static final void setInputText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getInputText().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], annotatedString);
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m12550setLiveRegionhR3wRGc(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, $$delegatedProperties[3], LiveRegionMode.m12516boximpl(i));
    }

    public static final void setMaxTextLength(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getMaxTextLength().setValue(semanticsPropertyReceiver, $$delegatedProperties[25], Integer.valueOf(i));
    }

    public static final void setPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void setProgress(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    public static final void setProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m12551setRolekuIjeqM(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, $$delegatedProperties[12], Role.m12525boximpl(i));
    }

    public static final void setSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[20], Boolean.valueOf(z8));
    }

    public static final void setSelection(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6474f interfaceC6474f) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, interfaceC6474f));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, interfaceC6474f);
    }

    public static final void setShowingTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], Boolean.valueOf(z8));
    }

    public static final void setStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final void setTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], str);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), AbstractC5806u.m5286y(annotatedString));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    /* renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m12552setTextSelectionRangeFDrldGo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, long j7) {
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[18], TextRange.m12758boximpl(j7));
    }

    public static final void setTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], annotatedString);
    }

    public static /* synthetic */ void setTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    public static final void setToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ToggleableState toggleableState) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[23], toggleableState);
    }

    public static final void setTraversalGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], Boolean.valueOf(z8));
    }

    public static final void setTraversalIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], Float.valueOf(f));
    }

    public static final void setVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[11], scrollAxisRange);
    }

    public static final void showTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static /* synthetic */ void showTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @NotNull
    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(@NotNull String str, @NotNull InterfaceC6473e interfaceC6473e) {
        return new SemanticsPropertyKey<>(str, true, interfaceC6473e);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, interfaceC6471c));
    }

    public static final void setTextSubstitution(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable InterfaceC6471c interfaceC6471c) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(str, interfaceC6471c));
    }
}
