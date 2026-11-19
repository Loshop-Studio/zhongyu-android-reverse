package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.Lifecycle;
import android.view.LifecycleObserver;
import android.view.LifecycleOwner;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.C2826a;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.NavUriKt;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.SupportingPane;
import androidx.navigation.compose.C2854p;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.C5787f0;
import kotlin.collections.C5789g0;
import kotlin.collections.C5801p;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.C5823d;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import kotlinx.coroutines.flow.InterfaceC5958x;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p214z6.AbstractC6833k;
import p214z6.C6823a;
import p214z6.C6827e;
import p214z6.C6837o;

@Metadata(m5109d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 Î\u00022\u00020\u0001:\u0002Î\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\"\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00050\u001bH\u0000¢\u0006\u0004\b \u0010!JT\u0010(\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00050\u001bH\u0000¢\u0006\u0004\b&\u0010'J#\u0010-\u001a\u00020\u00052\n\u0010*\u001a\u00060)R\u00020\u00022\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0004\b+\u0010,J'\u00104\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00132\u000e\u00101\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000¢\u0006\u0004\b2\u00103J9\u00108\u001a\u00020\u00052\n\u0010*\u001a\u00060)R\u00020\u00022\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b6\u00107J1\u0010<\u001a\u00020\u00052\n\u0010*\u001a\u00060)R\u00020\u00022\u0006\u00109\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010?\u001a\u00020\u00052\u0006\u00109\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010D\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bE\u0010CJ\u000f\u0010I\u001a\u00020$H\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020$2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020$H\u0000¢\u0006\u0004\bG\u0010MJ'\u0010I\u001a\u00020$2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\bG\u0010NJ'\u0010I\u001a\u00020$2\u0006\u0010P\u001a\u00020O2\u0006\u0010L\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\bG\u0010QJ7\u0010I\u001a\u00020$\"\b\b\u0000\u0010R*\u00020\u00012\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000S2\u0006\u0010L\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\bG\u0010TJ1\u0010I\u001a\u00020$\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u00002\u0006\u0010L\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\bG\u0010UJ)\u0010(\u001a\u00020$2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010NJ3\u0010(\u001a\u00020$\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u00002\u0006\u0010L\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010UJ'\u0010(\u001a\u00020$2\u0006\u0010P\u001a\u00020O2\u0006\u0010L\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010QJ9\u0010Z\u001a\u00020$2\u0010\u0010V\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00152\u0006\u0010W\u001a\u00020\u00132\u0006\u0010L\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\bX\u0010YJ%\u0010^\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\t2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\\\u0010]J1\u0010d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020$2\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_H\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010g\u001a\u00020$2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020$2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\be\u0010hJ'\u0010g\u001a\u00020$\"\b\b\u0000\u0010R*\u00020\u00012\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0000¢\u0006\u0004\be\u0010iJ!\u0010g\u001a\u00020$\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u0000H\u0000¢\u0006\u0004\be\u0010jJ\u0017\u0010l\u001a\u00020$2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bk\u0010hJ\u0017\u0010l\u001a\u00020$2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bk\u0010fJ\u000f\u0010n\u001a\u00020$H\u0000¢\u0006\u0004\bm\u0010HJ\u000f\u0010q\u001a\u00020\u0005H\u0000¢\u0006\u0004\bo\u0010pJ\u0015\u0010t\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0000¢\u0006\u0004\br\u0010sJ'\u0010z\u001a\u00020\u00052\u0006\u0010v\u001a\u00020u2\u000e\u0010w\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000¢\u0006\u0004\bx\u0010yJ\u001f\u0010}\u001a\u00020\u00052\u000e\u0010w\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000¢\u0006\u0004\b{\u0010|J\u001c\u0010\u0082\u0001\u001a\u0004\u0018\u00010O2\u0006\u0010\u007f\u001a\u00020~H\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J)\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00132\u0006\u0010K\u001a\u00020J2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J:\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0007\u0010\u0087\u0001\u001a\u00020$2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00132\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u008b\u0001J\u0012\u0010\u008e\u0001\u001a\u00020uH\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J$\u0010\u0091\u0001\u001a\u00020O\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J \u0010\u0096\u0001\u001a\u00020\u00052\f\u0010\u007f\u001a\b0\u0092\u0001j\u0003`\u0093\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J*\u0010\u0096\u0001\u001a\u00020\u00052\f\u0010\u007f\u001a\b0\u0092\u0001j\u0003`\u0093\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0097\u0001J4\u0010\u0096\u0001\u001a\u00020\u00052\f\u0010\u007f\u001a\b0\u0092\u0001j\u0003`\u0093\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0098\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\u00052\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u009b\u0001J&\u0010\u0096\u0001\u001a\u00020\u00052\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u009c\u0001J0\u0010\u0096\u0001\u001a\u00020\u00052\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u009d\u0001J@\u0010\u0096\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u00132\u000f\u0010\u009f\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`02\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0094\u0001\u0010 \u0001J6\u0010\u0096\u0001\u001a\u00020\u00052\u0006\u0010P\u001a\u00020O2\u001a\u0010£\u0001\u001a\u0015\u0012\u0005\u0012\u00030¡\u0001\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0003\b¢\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010¤\u0001J0\u0010\u0096\u0001\u001a\u00020\u00052\u0006\u0010P\u001a\u00020O2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0094\u0001\u0010¥\u0001J@\u0010\u0096\u0001\u001a\u00020\u0005\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u00002\u001a\u0010£\u0001\u001a\u0015\u0012\u0005\u0012\u00030¡\u0001\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0003\b¢\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010¦\u0001J:\u0010\u0096\u0001\u001a\u00020\u0005\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0006\b\u0094\u0001\u0010§\u0001J\u0019\u0010%\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J\"\u0010¬\u0001\u001a\u00020\u00052\u000f\u0010ª\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000¢\u0006\u0005\b«\u0001\u0010|J\u001c\u0010±\u0001\u001a\u00020\u00052\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001c\u0010¶\u0001\u001a\u00020\u00052\b\u0010³\u0001\u001a\u00030²\u0001H\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001c\u0010»\u0001\u001a\u00030¸\u00012\u0007\u0010·\u0001\u001a\u00020JH\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001a\u0010¾\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010¾\u0001\u001a\u00020\t2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0006\b¼\u0001\u0010¿\u0001J*\u0010¾\u0001\u001a\u00020\t\"\b\b\u0000\u0010R*\u00020\u00012\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0000¢\u0006\u0006\b¼\u0001\u0010À\u0001J$\u0010¾\u0001\u001a\u00020\t\"\b\b\u0000\u0010R*\u00020\u00012\u0006\u0010P\u001a\u00028\u0000H\u0000¢\u0006\u0006\b¼\u0001\u0010Á\u0001J,\u0010Â\u0001\u001a\u00020$2\u0007\u0010\u009e\u0001\u001a\u00020\u00132\u000f\u0010\u009f\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J@\u0010Å\u0001\u001a\u00020$2\u0007\u0010Ä\u0001\u001a\u00020J2\u000f\u0010\u009f\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`02\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u0019\u0010Å\u0001\u001a\u00020$2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0005\bÅ\u0001\u0010fJE\u0010Ç\u0001\u001a\u00020$2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u000f\u0010\u009f\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`02\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J)\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u000f\u0010É\u0001\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001JE\u0010Î\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u00132\u000f\u0010Ì\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`02\u0006\u0010\u001e\u001a\u00020\t2\u000f\b\u0002\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0006\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R+\u0010Ø\u0001\u001a\u0004\u0018\u00010u8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010\u008d\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R0\u0010Ý\u0001\u001a\n\u0018\u00010/j\u0004\u0018\u0001`08\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010©\u0001\"\u0005\bà\u0001\u0010|R6\u0010â\u0001\u001a\u000f\u0012\b\u0012\u00060/j\u0002`0\u0018\u00010á\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R%\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020\t0_8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R,\u0010í\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150ì\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R,\u0010ò\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150ñ\u00018AX\u0080\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R,\u0010ö\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150ì\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bö\u0001\u0010î\u0001\u001a\u0006\b÷\u0001\u0010ð\u0001R,\u0010ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150ñ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bø\u0001\u0010ó\u0001\u001a\u0006\bù\u0001\u0010õ\u0001R,\u0010û\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0ú\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R-\u0010\u0080\u0002\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030ÿ\u00010ú\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010ü\u0001\u001a\u0006\b\u0081\u0002\u0010þ\u0001R.\u0010\u0082\u0002\u001a\u0011\u0012\u0004\u0012\u00020J\u0012\u0006\u0012\u0004\u0018\u00010O0ú\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010ü\u0001\u001a\u0006\b\u0083\u0002\u0010þ\u0001R2\u0010\u0084\u0002\u001a\u0015\u0012\u0004\u0012\u00020O\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0_0ú\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010ü\u0001\u001a\u0006\b\u0085\u0002\u0010þ\u0001R0\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u00ad\u00012\n\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u00ad\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R,\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u008b\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R%\u0010\u0093\u0002\u001a\t\u0012\u0004\u0012\u00020@0\u0092\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0005\b\u0095\u0002\u0010sR*\u0010\u0097\u0002\u001a\u00030\u0096\u00028@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R \u0010\u009e\u0002\u001a\u00030\u009d\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002R*\u0010£\u0002\u001a\u00030¢\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0002\u0010¤\u0002\u001a\u0006\b¥\u0002\u0010¦\u0002\"\u0006\b§\u0002\u0010¨\u0002R8\u0010©\u0002\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\u0012\b\u0012\u00060)R\u00020\u00020ú\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b©\u0002\u0010ü\u0001\u001a\u0006\bª\u0002\u0010þ\u0001RF\u0010«\u0002\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0002\u0010¬\u0002\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002RF\u0010±\u0002\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0002\u0010¬\u0002\u001a\u0006\b²\u0002\u0010®\u0002\"\u0006\b³\u0002\u0010°\u0002R,\u0010´\u0002\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$0ú\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0002\u0010ü\u0001\u001a\u0006\bµ\u0002\u0010þ\u0001R\u0019\u0010¶\u0002\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u001e\u0010¸\u0002\u001a\t\u0012\u0004\u0012\u00020\t0\u0092\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0002\u0010\u0094\u0002R&\u0010º\u0002\u001a\t\u0012\u0004\u0012\u00020\t0¹\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bº\u0002\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002R\u0015\u0010Á\u0002\u001a\u00030¾\u00028F¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R'\u0010v\u001a\u00020u2\u0006\u0010v\u001a\u00020u8A@AX\u0080\u000e¢\u0006\u000f\u001a\u0006\bÂ\u0002\u0010\u008d\u0001\"\u0005\bx\u0010Ü\u0001R,\u0010Ã\u0002\u001a\u00030¢\u00022\b\u0010Ã\u0002\u001a\u00030¢\u00028@@AX\u0080\u000e¢\u0006\u0010\u001a\u0006\bÄ\u0002\u0010¦\u0002\"\u0006\bÅ\u0002\u0010¨\u0002R\u0019\u0010È\u0002\u001a\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u0019\u0010Ë\u0002\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ê\u0002R\u0019\u0010Í\u0002\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Ê\u0002¨\u0006Ï\u0002"}, m5110d2 = {"Landroidx/navigation/internal/NavControllerImpl;", "", "Landroidx/navigation/NavController;", "navController", "Lkotlin/Function0;", "Ld6/s;", "updateOnBackPressedCallbackEnabledCallback", "<init>", "(Landroidx/navigation/NavController;Lr6/a;)V", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "linkChildToParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "linkChildToParent", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "backStackEntry", "handler", "navigateInternal$navigation_runtime_release", "(Landroidx/navigation/Navigator;Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Lr6/c;)V", "navigateInternal", "popUpTo", "", "saveState", "popBackStackInternal$navigation_runtime_release", "(Landroidx/navigation/Navigator;Landroidx/navigation/NavBackStackEntry;ZLr6/c;)V", "popBackStackInternal", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "state", "push$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;)V", "push", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "createBackStackEntry$navigation_runtime_release", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "createBackStackEntry", "superCallback", "pop$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;ZLr6/a;)V", "pop", "entry", "markTransitionComplete$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;Lr6/a;)V", "markTransitionComplete", "prepareForTransition$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)V", "prepareForTransition", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "addOnDestinationChangedListener$navigation_runtime_release", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "addOnDestinationChangedListener", "removeOnDestinationChangedListener$navigation_runtime_release", "removeOnDestinationChangedListener", "popBackStack$navigation_runtime_release", "()Z", "popBackStack", "", "destinationId", "inclusive", "(IZ)Z", "(IZZ)Z", "", "route", "(Ljava/lang/String;ZZ)Z", ExifInterface.GPS_DIRECTION_TRUE, "Ly6/c;", "(Ly6/c;ZZ)Z", "(Ljava/lang/Object;ZZ)Z", "popOperations", "foundDestination", "executePopOperations$navigation_runtime_release", "(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z", "executePopOperations", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lr6/a;)V", "popBackStackFromNavigator", "Lkotlin/collections/p;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "popEntryFromBackStack$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/p;)V", "popEntryFromBackStack", "clearBackStack$navigation_runtime_release", "(Ljava/lang/String;)Z", "clearBackStack", "(I)Z", "(Ly6/c;)Z", "(Ljava/lang/Object;)Z", "clearBackStackInternal$navigation_runtime_release", "clearBackStackInternal", "dispatchOnDestinationChanged$navigation_runtime_release", "dispatchOnDestinationChanged", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "Landroidx/navigation/NavGraph;", "graph", "startDestinationArgs", "setGraph$navigation_runtime_release", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "setGraph", "onGraphCreated$navigation_runtime_release", "(Landroid/os/Bundle;)V", "onGraphCreated", "", "deepLink", "findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release", "([I)Ljava/lang/String;", "findInvalidDestinationDisplayNameInDeepLink", "matchingDest", "findDestination$navigation_runtime_release", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findDestination", "searchChildren", "findDestinationComprehensive$navigation_runtime_release", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findDestinationComprehensive", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "getTopGraph$navigation_runtime_release", "()Landroidx/navigation/NavGraph;", "getTopGraph", "generateRouteFilled$navigation_runtime_release", "(Ljava/lang/Object;)Ljava/lang/String;", "generateRouteFilled", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "navigate$navigation_runtime_release", "(Landroid/net/Uri;)V", "navigate", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkRequest;", "request", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "node", "args", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "builder", "(Ljava/lang/String;Lr6/c;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Ljava/lang/Object;Lr6/c;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "saveState$navigation_runtime_release", "()Landroid/os/Bundle;", "navState", "restoreState$navigation_runtime_release", "restoreState", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner$navigation_runtime_release", "(Landroidx/lifecycle/LifecycleOwner;)V", "setLifecycleOwner", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore$navigation_runtime_release", "(Landroidx/lifecycle/ViewModelStore;)V", "setViewModelStore", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner$navigation_runtime_release", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "getBackStackEntry$navigation_runtime_release", "(I)Landroidx/navigation/NavBackStackEntry;", "getBackStackEntry", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "(Ly6/c;)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "launchSingleTopInternal", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Z", "id", "restoreStateInternal", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "executeRestoreState", "(Ljava/util/List;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "backStackState", "instantiateBackStack", "(Lkotlin/collections/p;)Ljava/util/List;", "finalArgs", "restoredEntries", "addEntryToBackStack", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;Ljava/util/List;)V", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "Lr6/a;", "getUpdateOnBackPressedCallbackEnabledCallback", "()Lr6/a;", "setUpdateOnBackPressedCallbackEnabledCallback", "(Lr6/a;)V", "_graph", "Landroidx/navigation/NavGraph;", "get_graph$navigation_runtime_release", "set_graph$navigation_runtime_release", "(Landroidx/navigation/NavGraph;)V", "navigatorStateToRestore", "Landroid/os/Bundle;", "getNavigatorStateToRestore$navigation_runtime_release", "setNavigatorStateToRestore$navigation_runtime_release", "", "backStackToRestore", "[Landroid/os/Bundle;", "getBackStackToRestore$navigation_runtime_release", "()[Landroid/os/Bundle;", "setBackStackToRestore$navigation_runtime_release", "([Landroid/os/Bundle;)V", "backQueue", "Lkotlin/collections/p;", "getBackQueue$navigation_runtime_release", "()Lkotlin/collections/p;", "Lkotlinx/coroutines/flow/y;", "_currentBackStack", "Lkotlinx/coroutines/flow/y;", "get_currentBackStack$navigation_runtime_release", "()Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/m0;", "currentBackStack", "Lkotlinx/coroutines/flow/m0;", "getCurrentBackStack$navigation_runtime_release", "()Lkotlinx/coroutines/flow/m0;", "_visibleEntries", "get_visibleEntries$navigation_runtime_release", "visibleEntries", "getVisibleEntries$navigation_runtime_release", "", "childToParentEntries", "Ljava/util/Map;", "getChildToParentEntries$navigation_runtime_release", "()Ljava/util/Map;", "Landroidx/navigation/internal/AtomicInt;", "parentToChildCount", "getParentToChildCount$navigation_runtime_release", "backStackMap", "getBackStackMap$navigation_runtime_release", "backStackStates", "getBackStackStates$navigation_runtime_release", "value", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner$navigation_runtime_release", "()Landroidx/lifecycle/LifecycleOwner;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "getViewModel$navigation_runtime_release", "()Landroidx/navigation/NavControllerViewModel;", "setViewModel$navigation_runtime_release", "(Landroidx/navigation/NavControllerViewModel;)V", "", "onDestinationChangedListeners", "Ljava/util/List;", "getOnDestinationChangedListeners$navigation_runtime_release", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getLifecycleObserver$navigation_runtime_release", "()Landroidx/lifecycle/LifecycleObserver;", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "get_navigatorProvider$navigation_runtime_release", "()Landroidx/navigation/NavigatorProvider;", "set_navigatorProvider$navigation_runtime_release", "(Landroidx/navigation/NavigatorProvider;)V", "navigatorState", "getNavigatorState$navigation_runtime_release", "addToBackStackHandler", "Lr6/c;", "getAddToBackStackHandler$navigation_runtime_release", "()Lr6/c;", "setAddToBackStackHandler$navigation_runtime_release", "(Lr6/c;)V", "popFromBackStackHandler", "getPopFromBackStackHandler$navigation_runtime_release", "setPopFromBackStackHandler$navigation_runtime_release", "entrySavedState", "getEntrySavedState$navigation_runtime_release", "dispatchReentrantCount", "I", "backStackEntriesToDispatch", "Lkotlinx/coroutines/flow/x;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/x;", "get_currentBackStackEntryFlow$navigation_runtime_release", "()Lkotlinx/coroutines/flow/x;", "Landroidx/navigation/internal/NavContext;", "getNavContext", "()Landroidx/navigation/internal/NavContext;", "navContext", "getGraph$navigation_runtime_release", "navigatorProvider", "getNavigatorProvider$navigation_runtime_release", "setNavigatorProvider$navigation_runtime_release", "getCurrentDestination$navigation_runtime_release", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry$navigation_runtime_release", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry$navigation_runtime_release", "previousBackStackEntry", "Companion", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavControllerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerImpl.kt\nandroidx/navigation/internal/NavControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProviderKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 11 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n+ 12 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1780:1\n1#2:1781\n1#2:1869\n1#2:1940\n1#2:1962\n1#2:1985\n1#2:2007\n1#2:2030\n1#2:2053\n84#3:1782\n84#3:1783\n84#3:1784\n2632#4,3:1785\n543#4,6:1788\n1863#4,2:1798\n1863#4,2:1800\n1863#4,2:1802\n1863#4,2:1804\n1863#4:1806\n774#4:1807\n865#4,2:1808\n1864#4:1810\n774#4:1811\n865#4,2:1812\n774#4:1814\n865#4,2:1815\n1863#4,2:1817\n1863#4:1819\n1797#4,3:1820\n1864#4:1823\n827#4:1832\n855#4,2:1833\n1863#4:1835\n1864#4:1843\n1246#4,4:1846\n1863#4,2:1872\n1863#4,2:1874\n388#4,7:1876\n1557#4:1883\n1628#4,3:1884\n1863#4,2:1887\n1863#4,2:1889\n827#4:1891\n855#4,2:1892\n1863#4,2:1894\n1863#4,2:1896\n543#4,6:1898\n543#4,6:1905\n543#4,6:1911\n1863#4,2:1917\n1863#4,2:1919\n1863#4,2:2056\n1863#4,2:2066\n543#4,6:2068\n543#4,6:2074\n543#4,6:2080\n1317#5,2:1794\n1317#5,2:1796\n183#5,2:2086\n90#6:1824\n106#6:1870\n90#6:1904\n106#6:1941\n106#6:1963\n106#6:1965\n106#6:1986\n106#6:1987\n106#6:2008\n106#6:2010\n106#6:2031\n106#6:2033\n106#6:2054\n106#6:2058\n106#6:2059\n90#6:2060\n381#7,7:1825\n381#7,7:1836\n462#7:1844\n412#7:1845\n27#8:1850\n46#8:1851\n32#8,4:1852\n31#8,7:1862\n27#8:1921\n46#8:1922\n32#8,4:1923\n31#8,7:1933\n27#8:1943\n46#8:1944\n32#8,4:1945\n31#8,7:1955\n27#8:1966\n46#8:1967\n32#8,4:1968\n31#8,7:1978\n27#8:1988\n46#8:1989\n32#8,4:1990\n31#8,7:2000\n27#8:2011\n46#8:2012\n32#8,4:2013\n31#8,7:2023\n27#8:2034\n46#8:2035\n32#8,4:2036\n31#8,7:2046\n126#9:1856\n153#9,3:1857\n126#9:1927\n153#9,3:1928\n126#9:1949\n153#9,3:1950\n126#9:1972\n153#9,3:1973\n126#9:1994\n153#9,3:1995\n126#9:2017\n153#9,3:2018\n126#9:2040\n153#9,3:2041\n37#10,2:1860\n37#10,2:1931\n37#10,2:1953\n37#10,2:1976\n37#10,2:1998\n37#10,2:2021\n37#10,2:2044\n37#10,2:2061\n46#11:1871\n46#11:1942\n46#11:1964\n46#11:2009\n46#11:2032\n46#11:2055\n13504#12,3:2063\n*S KotlinDebug\n*F\n+ 1 NavControllerImpl.kt\nandroidx/navigation/internal/NavControllerImpl\n*L\n1140#1:1869\n1547#1:1940\n1576#1:1962\n1585#1:1985\n1592#1:2007\n1602#1:2030\n1618#1:2053\n121#1:1782\n208#1:1783\n242#1:1784\n272#1:1785,3\n449#1:1788,6\n650#1:1798,2\n653#1:1800,2\n658#1:1802,2\n660#1:1804,2\n858#1:1806\n860#1:1807\n860#1:1808,2\n858#1:1810\n868#1:1811\n868#1:1812,2\n871#1:1814\n871#1:1815,2\n885#1:1817,2\n899#1:1819\n903#1:1820,3\n899#1:1823\n962#1:1832\n962#1:1833,2\n963#1:1835\n963#1:1843\n1093#1:1846,4\n1159#1:1872,2\n1222#1:1874,2\n1232#1:1876,7\n1241#1:1883\n1241#1:1884,3\n1258#1:1887,2\n1268#1:1889,2\n1335#1:1891\n1335#1:1892,2\n1339#1:1894,2\n1383#1:1896,2\n1425#1:1898,6\n1457#1:1905,6\n1486#1:1911,6\n1500#1:1917,2\n1516#1:1919,2\n1624#1:2056,2\n1662#1:2066,2\n1708#1:2068,6\n1718#1:2074,6\n1734#1:2080,6\n511#1:1794,2\n532#1:1796,2\n1762#1:2086,2\n921#1:1824\n1140#1:1870\n1455#1:1904\n1547#1:1941\n1576#1:1963\n1581#1:1965\n1585#1:1986\n1586#1:1987\n1592#1:2008\n1598#1:2010\n1602#1:2031\n1611#1:2033\n1618#1:2054\n1627#1:2058\n1629#1:2059\n1638#1:2060\n947#1:1825,7\n965#1:1836,7\n1093#1:1844\n1093#1:1845\n1140#1:1850\n1140#1:1851\n1140#1:1852,4\n1140#1:1862,7\n1547#1:1921\n1547#1:1922\n1547#1:1923,4\n1547#1:1933,7\n1576#1:1943\n1576#1:1944\n1576#1:1945,4\n1576#1:1955,7\n1585#1:1966\n1585#1:1967\n1585#1:1968,4\n1585#1:1978,7\n1592#1:1988\n1592#1:1989\n1592#1:1990,4\n1592#1:2000,7\n1602#1:2011\n1602#1:2012\n1602#1:2013,4\n1602#1:2023,7\n1618#1:2034\n1618#1:2035\n1618#1:2036,4\n1618#1:2046,7\n1140#1:1856\n1140#1:1857,3\n1547#1:1927\n1547#1:1928,3\n1576#1:1949\n1576#1:1950,3\n1585#1:1972\n1585#1:1973,3\n1592#1:1994\n1592#1:1995,3\n1602#1:2017\n1602#1:2018,3\n1618#1:2040\n1618#1:2041,3\n1140#1:1860,2\n1547#1:1931,2\n1576#1:1953,2\n1585#1:1976,2\n1592#1:1998,2\n1602#1:2021,2\n1618#1:2044,2\n1645#1:2061,2\n1140#1:1871\n1547#1:1942\n1576#1:1964\n1592#1:2009\n1602#1:2032\n1618#1:2055\n1651#1:2063,3\n*E\n"})
/* loaded from: classes2.dex */
public final class NavControllerImpl {

    @NotNull
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";

    @NotNull
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";

    @NotNull
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";

    @NotNull
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";

    @NotNull
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @NotNull
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";

    @NotNull
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";

    @NotNull
    public static final String TAG = "NavController";

    @NotNull
    private final InterfaceC5959y _currentBackStack;

    @NotNull
    private final InterfaceC5958x _currentBackStackEntryFlow;

    @Nullable
    private NavGraph _graph;

    @NotNull
    private NavigatorProvider _navigatorProvider;

    @NotNull
    private final InterfaceC5959y _visibleEntries;

    @Nullable
    private InterfaceC6471c addToBackStackHandler;

    @NotNull
    private final C5801p backQueue;

    @NotNull
    private final List<NavBackStackEntry> backStackEntriesToDispatch;

    @NotNull
    private final Map<Integer, String> backStackMap;

    @NotNull
    private final Map<String, C5801p> backStackStates;

    @Nullable
    private Bundle[] backStackToRestore;

    @NotNull
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;

    @NotNull
    private final InterfaceC5944m0 currentBackStack;
    private int dispatchReentrantCount;

    @NotNull
    private final Map<NavBackStackEntry, Boolean> entrySavedState;

    @NotNull
    private Lifecycle.State hostLifecycleState;

    @NotNull
    private final LifecycleObserver lifecycleObserver;

    @Nullable
    private LifecycleOwner lifecycleOwner;

    @NotNull
    private final NavController navController;

    @NotNull
    private final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> navigatorState;

    @Nullable
    private Bundle navigatorStateToRestore;

    @NotNull
    private final List<NavController.OnDestinationChangedListener> onDestinationChangedListeners;

    @NotNull
    private final Map<NavBackStackEntry, AtomicInt> parentToChildCount;

    @Nullable
    private InterfaceC6471c popFromBackStackHandler;

    @NotNull
    private InterfaceC6469a updateOnBackPressedCallbackEnabledCallback;

    @Nullable
    private NavControllerViewModel viewModel;

    @NotNull
    private final InterfaceC5944m0 visibleEntries;

    public NavControllerImpl(@NotNull NavController navController, @NotNull InterfaceC6469a updateOnBackPressedCallbackEnabledCallback) {
        AbstractC5830k.m5330g(navController, "navController");
        AbstractC5830k.m5330g(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.navController = navController;
        this.updateOnBackPressedCallbackEnabledCallback = updateOnBackPressedCallbackEnabledCallback;
        this.backQueue = new C5801p();
        EmptyList emptyList = EmptyList.INSTANCE;
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(emptyList);
        this._currentBackStack = c5946n0M5546b;
        this.currentBackStack = new C5901a0(c5946n0M5546b);
        C5946n0 c5946n0M5546b2 = AbstractC5914h.m5546b(emptyList);
        this._visibleEntries = c5946n0M5546b2;
        this.visibleEntries = new C5901a0(c5946n0M5546b2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new ArrayList();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new C2863b(this, 0);
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this.backStackEntriesToDispatch = new ArrayList();
        this._currentBackStackEntryFlow = AbstractC5914h.m5545a(0, 2, BufferOverflow.DROP_OLDEST);
    }

    private final void addEntryToBackStack(NavDestination node, Bundle finalArgs, NavBackStackEntry backStackEntry, List<NavBackStackEntry> restoredEntries) {
        Bundle bundle;
        C5801p c5801p;
        NavDestination destination;
        List<NavBackStackEntry> list;
        NavBackStackEntry navBackStackEntry;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        List<NavBackStackEntry> list2 = restoredEntries;
        NavDestination destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof FloatingWindow) && popBackStackInternal$navigation_runtime_release$default(this, ((NavBackStackEntry) this.backQueue.last()).getDestination().getId(), true, false, 4, (Object) null)) {
            }
        }
        C5801p c5801p2 = new C5801p();
        NavBackStackEntry navBackStackEntry2 = null;
        if (node instanceof NavGraph) {
            NavDestination navDestination = destination2;
            while (true) {
                AbstractC5830k.m5327d(navDestination);
                NavGraph parent = navDestination.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = null;
                            break;
                        } else {
                            navBackStackEntryPrevious2 = listIterator.previous();
                            if (AbstractC5830k.m5325b(navBackStackEntryPrevious2.getDestination(), parent)) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntryCreate$default = navBackStackEntryPrevious2;
                    if (navBackStackEntryCreate$default == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, getNavContext(), parent, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    c5801p2.addFirst(navBackStackEntryCreate$default);
                    if (this.backQueue.isEmpty() || ((NavBackStackEntry) this.backQueue.last()).getDestination() != parent) {
                        navBackStackEntry = backStackEntry;
                        list = restoredEntries;
                        c5801p = c5801p2;
                    } else {
                        list = restoredEntries;
                        c5801p = c5801p2;
                        navBackStackEntry = backStackEntry;
                        popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    c5801p = c5801p2;
                    destination = destination2;
                    list = list2;
                    navBackStackEntry = backStackEntry;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                navDestination = parent;
                c5801p2 = c5801p;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            c5801p = c5801p2;
            destination = destination2;
            list = list2;
            navBackStackEntry = backStackEntry;
        }
        NavDestination destination3 = c5801p.isEmpty() ? destination : ((NavBackStackEntry) c5801p.first()).getDestination();
        while (destination3 != null && findDestination$navigation_runtime_release(destination3.getId(), destination3) != destination3) {
            NavGraph parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !SavedStateReader.m13675isEmptyimpl(SavedStateReader.m13597constructorimpl(bundle))) ? bundle : null;
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    } else {
                        navBackStackEntryPrevious = listIterator2.previous();
                        if (AbstractC5830k.m5325b(navBackStackEntryPrevious.getDestination(), parent2)) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntryCreate$default2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate$default2 == null) {
                    navGraph = parent2;
                    navBackStackEntryCreate$default2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, getNavContext(), navGraph, parent2.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                } else {
                    navGraph = parent2;
                }
                c5801p.addFirst(navBackStackEntryCreate$default2);
            } else {
                navGraph = parent2;
            }
            destination3 = navGraph;
        }
        if (!c5801p.isEmpty()) {
            destination = ((NavBackStackEntry) c5801p.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            NavDestination destination4 = ((NavBackStackEntry) this.backQueue.last()).getDestination();
            AbstractC5830k.m5328e(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination4).getNodes().get(destination.getId()) != null) {
                break;
            } else {
                popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) this.backQueue.m5167c();
        if (navBackStackEntry3 == null) {
            navBackStackEntry3 = (NavBackStackEntry) c5801p.m5167c();
        }
        if (!AbstractC5830k.m5325b(navBackStackEntry3 != null ? navBackStackEntry3.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination5 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph2 = this._graph;
                AbstractC5830k.m5327d(navGraph2);
                if (AbstractC5830k.m5325b(destination5, navGraph2)) {
                    navBackStackEntry2 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate$default3 = navBackStackEntry2;
            if (navBackStackEntryCreate$default3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                NavContext navContext = getNavContext();
                NavGraph navGraph3 = this._graph;
                AbstractC5830k.m5327d(navGraph3);
                NavGraph navGraph4 = this._graph;
                AbstractC5830k.m5327d(navGraph4);
                navBackStackEntryCreate$default3 = NavBackStackEntry.Companion.create$default(companion, navContext, navGraph3, navGraph4.addInDefaultArgs(bundle), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            c5801p.addFirst(navBackStackEntryCreate$default3);
        }
        Iterator it = c5801p.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) it.next();
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry4.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry4);
        }
        this.backQueue.addAll(c5801p);
        this.backQueue.addLast(navBackStackEntry);
        ArrayList arrayListM5239s0 = AbstractC5805t.m5239s0(c5801p, navBackStackEntry);
        int size = arrayListM5239s0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5239s0.get(i);
            i++;
            NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry) obj;
            NavGraph parent3 = navBackStackEntry5.getDestination().getParent();
            if (parent3 != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry5, getBackStackEntry$navigation_runtime_release(parent3.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addEntryToBackStack$default(NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            list = EmptyList.INSTANCE;
        }
        navControllerImpl.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s clearBackStackInternal$lambda$19(NavOptionsBuilder navOptions) {
        AbstractC5830k.m5330g(navOptions, "$this$navOptions");
        navOptions.setRestoreState(true);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s executePopOperations$lambda$10(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, NavControllerImpl navControllerImpl, boolean z8, C5801p c5801p, NavBackStackEntry entry) {
        AbstractC5830k.m5330g(entry, "entry");
        ref$BooleanRef.element = true;
        ref$BooleanRef2.element = true;
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(entry, z8, c5801p);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$11(NavDestination destination) {
        AbstractC5830k.m5330g(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$12(NavControllerImpl navControllerImpl, NavDestination destination) {
        AbstractC5830k.m5330g(destination, "destination");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(destination.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$14(NavDestination destination) {
        AbstractC5830k.m5330g(destination, "destination");
        NavGraph parent = destination.getParent();
        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
            return null;
        }
        return destination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$15(NavControllerImpl navControllerImpl, NavDestination destination) {
        AbstractC5830k.m5330g(destination, "destination");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(destination.getId()));
    }

    private final boolean executeRestoreState(final List<NavBackStackEntry> entries, final Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            List list = (List) AbstractC5805t.m5236p0(arrayList);
            if (AbstractC5830k.m5325b((list == null || (navBackStackEntry = (NavBackStackEntry) AbstractC5805t.m5235o0(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(AbstractC5806u.m5247A(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            List<NavBackStackEntry> list2 = (List) obj3;
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) AbstractC5805t.m5228h0(list2)).getDestination().getNavigatorName());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            navigateInternal$navigation_runtime_release(navigator, list2, navOptions, navigatorExtras, new InterfaceC6471c() { // from class: androidx.navigation.internal.c
                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj4) {
                    return NavControllerImpl.executeRestoreState$lambda$57(ref$BooleanRef, entries, ref$IntRef, this, args, (NavBackStackEntry) obj4);
                }
            });
        }
        return ref$BooleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s executeRestoreState$lambda$57(Ref$BooleanRef ref$BooleanRef, List list, Ref$IntRef ref$IntRef, NavControllerImpl navControllerImpl, Bundle bundle, NavBackStackEntry entry) {
        List<NavBackStackEntry> listSubList;
        AbstractC5830k.m5330g(entry, "entry");
        ref$BooleanRef.element = true;
        int iIndexOf = list.indexOf(entry);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            listSubList = list.subList(ref$IntRef.element, i);
            ref$IntRef.element = i;
        } else {
            listSubList = EmptyList.INSTANCE;
        }
        navControllerImpl.addEntryToBackStack(entry.getDestination(), bundle, entry, listSubList);
        return C5443s.f8405a;
    }

    public static /* synthetic */ NavDestination findDestination$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i, NavDestination navDestination, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            navDestination = null;
        }
        return navControllerImpl.findDestination$navigation_runtime_release(i, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavDestination navDestination, int i, boolean z8, NavDestination navDestination2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            navDestination2 = null;
        }
        return navControllerImpl.findDestinationComprehensive$navigation_runtime_release(navDestination, i, z8, navDestination2);
    }

    private final List<NavBackStackEntry> instantiateBackStack(C5801p backStackState) {
        NavDestination graph$navigation_runtime_release;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m5169e();
        if (navBackStackEntry == null || (graph$navigation_runtime_release = navBackStackEntry.getDestination()) == null) {
            graph$navigation_runtime_release = getGraph$navigation_runtime_release();
        }
        if (backStackState != null) {
            Iterator<E> it = backStackState.iterator();
            NavDestination navDestination = graph$navigation_runtime_release;
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, navDestination, navBackStackEntryState.getDestinationId(), true, null, 8, null);
                if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.INSTANCE.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + navDestination).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestinationComprehensive$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                navDestination = navDestinationFindDestinationComprehensive$navigation_runtime_release$default;
            }
        }
        return arrayList;
    }

    private final boolean launchSingleTopInternal(NavDestination node, Bundle args) {
        int iNextIndex;
        NavDestination destination;
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        C5801p c5801p = this.backQueue;
        ListIterator listIterator = c5801p.listIterator(c5801p.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((NavBackStackEntry) listIterator.previous()).getDestination() == node) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (node instanceof NavGraph) {
            List listM6499z = AbstractC6833k.m6499z(AbstractC6833k.m6498y(NavGraph.INSTANCE.childHierarchy((NavGraph) node), new C2826a(20)));
            if (this.backQueue.size() - iNextIndex != listM6499z.size()) {
                return false;
            }
            C5801p c5801p2 = this.backQueue;
            List listSubList = c5801p2.subList(iNextIndex, c5801p2.size());
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).getDestination().getId()));
            }
            if (!arrayList.equals(listM6499z)) {
                return false;
            }
        } else if (currentBackStackEntry$navigation_runtime_release == null || (destination = currentBackStackEntry$navigation_runtime_release.getDestination()) == null || node.getId() != destination.getId()) {
            return false;
        }
        C5801p c5801p3 = new C5801p();
        while (AbstractC5806u.m5282u(this.backQueue) >= iNextIndex) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) AbstractC5810y.m5300b0(this.backQueue);
            unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            c5801p3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(args)));
        }
        Iterator it2 = c5801p3.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
            NavGraph parent = navBackStackEntry2.getDestination().getParent();
            if (parent != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry2, getBackStackEntry$navigation_runtime_release(parent.getId()));
            }
            this.backQueue.addLast(navBackStackEntry2);
        }
        Iterator it3 = c5801p3.iterator();
        while (it3.hasNext()) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) it3.next();
            this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int launchSingleTopInternal$lambda$47(NavDestination it) {
        AbstractC5830k.m5330g(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$1(NavControllerImpl navControllerImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC5830k.m5330g(lifecycleOwner, "<unused var>");
        AbstractC5830k.m5330g(event, "event");
        navControllerImpl.hostLifecycleState = event.getTargetState();
        if (navControllerImpl._graph != null) {
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(navControllerImpl.backQueue);
            int size = arrayListM5218E0.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM5218E0.get(i);
                i++;
                ((NavBackStackEntry) obj).handleLifecycleEvent(event);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s navigate$lambda$44(Ref$BooleanRef ref$BooleanRef, NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry it) {
        AbstractC5830k.m5330g(it, "it");
        ref$BooleanRef.element = true;
        addEntryToBackStack$default(navControllerImpl, navDestination, bundle, it, null, 8, null);
        return C5443s.f8405a;
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if ((i & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release(str, navOptions, extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s navigateInternal$lambda$3(NavBackStackEntry it) {
        AbstractC5830k.m5330g(it, "it");
        return C5443s.f8405a;
    }

    public static /* synthetic */ void navigateInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 16) != 0) {
            interfaceC6471c = new C2826a(21);
        }
        navControllerImpl.navigateInternal$navigation_runtime_release(navigator, list, navOptions, extras, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s pop$lambda$6(InterfaceC6469a interfaceC6469a) {
        interfaceC6469a.invoke();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s popBackStackInternal$lambda$4(NavBackStackEntry it) {
        AbstractC5830k.m5330g(it, "it");
        return C5443s.f8405a;
    }

    public static /* synthetic */ void popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 8) != 0) {
            interfaceC6471c = new C2826a(17);
        }
        navControllerImpl.popBackStackInternal$navigation_runtime_release(navigator, navBackStackEntry, z8, interfaceC6471c);
    }

    public static /* synthetic */ void popEntryFromBackStack$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavBackStackEntry navBackStackEntry, boolean z8, C5801p c5801p, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            c5801p = new C5801p();
        }
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, z8, c5801p);
    }

    private final boolean restoreStateInternal(int id, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id));
        AbstractC5810y.m5295W(this.backStackMap.values(), new C2865d(str, 1));
        return executeRestoreState(instantiateBackStack((C5801p) AbstractC5835p.m5353b(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$51(String str, String str2) {
        return AbstractC5830k.m5325b(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$53(String str, String str2) {
        return AbstractC5830k.m5325b(str2, str);
    }

    public final void addOnDestinationChangedListener$navigation_runtime_release(@NotNull NavController.OnDestinationChangedListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (this.backQueue.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        listener.onDestinationChanged(this.navController, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
    }

    public final boolean clearBackStack$navigation_runtime_release(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        return clearBackStackInternal$navigation_runtime_release(route) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(destinationId, null, NavOptionsBuilderKt.navOptions(new C2826a(22)), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(destinationId, true, false);
    }

    @NotNull
    public final NavBackStackEntry createBackStackEntry$navigation_runtime_release(@NotNull NavDestination destination, @Nullable Bundle arguments) {
        AbstractC5830k.m5330g(destination, "destination");
        return NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, getNavContext(), destination, arguments, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
    }

    public final boolean dispatchOnDestinationChanged$navigation_runtime_release() {
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m5169e();
        if (navBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i;
        if (i == 0) {
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            int size = arrayListM5218E0.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayListM5218E0.get(i8);
                i8++;
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                Iterator<NavController.OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this.navController, navBackStackEntry2.getDestination(), navBackStackEntry2.getArguments());
                }
                this._currentBackStackEntryFlow.mo5527a(navBackStackEntry2);
            }
            InterfaceC5959y interfaceC5959y = this._currentBackStack;
            ArrayList arrayListM5218E02 = AbstractC5805t.m5218E0(this.backQueue);
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            c5946n0.getClass();
            c5946n0.m5571k(null, arrayListM5218E02);
            ((C5946n0) this._visibleEntries).m5570j(populateVisibleEntries$navigation_runtime_release());
        }
        return navBackStackEntry != null;
    }

    public final boolean executePopOperations$navigation_runtime_release(@NotNull List<? extends Navigator<?>> popOperations, @NotNull NavDestination foundDestination, boolean inclusive, boolean saveState) {
        final NavControllerImpl navControllerImpl;
        final boolean z8;
        AbstractC5830k.m5330g(popOperations, "popOperations");
        AbstractC5830k.m5330g(foundDestination, "foundDestination");
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final C5801p c5801p = new C5801p();
        Iterator<? extends Navigator<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                navControllerImpl = this;
                z8 = saveState;
                break;
            }
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            navControllerImpl = this;
            z8 = saveState;
            popBackStackInternal$navigation_runtime_release(navigator, (NavBackStackEntry) this.backQueue.last(), z8, new InterfaceC6471c() { // from class: androidx.navigation.internal.f
                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj) {
                    return NavControllerImpl.executePopOperations$lambda$10(ref$BooleanRef2, ref$BooleanRef, navControllerImpl, z8, c5801p, (NavBackStackEntry) obj);
                }
            });
            if (!ref$BooleanRef2.element) {
                break;
            }
            saveState = z8;
        }
        if (z8) {
            if (!inclusive) {
                final int i = 0;
                C6827e c6827e = new C6827e(new C6837o(AbstractC6833k.m6495v(foundDestination, new C2826a(18)), new InterfaceC6471c(this) { // from class: androidx.navigation.internal.a

                    /* renamed from: b */
                    public final /* synthetic */ NavControllerImpl f1320b;

                    {
                        this.f1320b = this;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        boolean zExecutePopOperations$lambda$12;
                        switch (i) {
                            case 0:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$12(this.f1320b, (NavDestination) obj);
                                break;
                            default:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$15(this.f1320b, (NavDestination) obj);
                                break;
                        }
                        return Boolean.valueOf(zExecutePopOperations$lambda$12);
                    }
                }, 0));
                while (c6827e.hasNext()) {
                    NavDestination navDestination = (NavDestination) c6827e.next();
                    Map<Integer, String> map = navControllerImpl.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) c5801p.m5167c();
                    map.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            }
            if (!c5801p.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c5801p.first();
                final int i8 = 1;
                C6827e c6827e2 = new C6827e(new C6837o(AbstractC6833k.m6495v(findDestination$navigation_runtime_release$default(this, navBackStackEntryState2.getDestinationId(), null, 2, null), new C2826a(19)), new InterfaceC6471c(this) { // from class: androidx.navigation.internal.a

                    /* renamed from: b */
                    public final /* synthetic */ NavControllerImpl f1320b;

                    {
                        this.f1320b = this;
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        boolean zExecutePopOperations$lambda$12;
                        switch (i8) {
                            case 0:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$12(this.f1320b, (NavDestination) obj);
                                break;
                            default:
                                zExecutePopOperations$lambda$12 = NavControllerImpl.executePopOperations$lambda$15(this.f1320b, (NavDestination) obj);
                                break;
                        }
                        return Boolean.valueOf(zExecutePopOperations$lambda$12);
                    }
                }, 0));
                while (c6827e2.hasNext()) {
                    navControllerImpl.backStackMap.put(Integer.valueOf(((NavDestination) c6827e2.next()).getId()), navBackStackEntryState2.getId());
                }
                if (navControllerImpl.backStackMap.values().contains(navBackStackEntryState2.getId())) {
                    navControllerImpl.backStackStates.put(navBackStackEntryState2.getId(), c5801p);
                }
            }
        }
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        return ref$BooleanRef.element;
    }

    @Nullable
    public final NavDestination findDestination$navigation_runtime_release(int destinationId, @Nullable NavDestination matchingDest) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        AbstractC5830k.m5327d(navGraph);
        if (navGraph.getId() == destinationId) {
            if (matchingDest == null) {
                return this._graph;
            }
            if (AbstractC5830k.m5325b(this._graph, matchingDest) && matchingDest.getParent() == null) {
                return this._graph;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m5169e();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            AbstractC5830k.m5327d(destination);
        }
        return findDestinationComprehensive$navigation_runtime_release(destination, destinationId, false, matchingDest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.navigation.NavGraph, java.lang.Object] */
    @Nullable
    public final NavDestination findDestinationComprehensive$navigation_runtime_release(@NotNull NavDestination destination, int destinationId, boolean searchChildren, @Nullable NavDestination matchingDest) {
        AbstractC5830k.m5330g(destination, "destination");
        if (destination.getId() == destinationId && (matchingDest == null || (destination.equals(matchingDest) && AbstractC5830k.m5325b(destination.getParent(), matchingDest.getParent())))) {
            return destination;
        }
        ?? parent = destination instanceof NavGraph ? (NavGraph) destination : 0;
        if (parent == 0) {
            parent = destination.getParent();
            AbstractC5830k.m5327d(parent);
        }
        return parent.findNodeComprehensive(destinationId, parent, searchChildren, matchingDest);
    }

    @Nullable
    /* renamed from: findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release */
    public final String m1942x7b9ea851(@NotNull int[] deepLink) {
        NavGraph navGraph;
        AbstractC5830k.m5330g(deepLink, "deepLink");
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i = 0;
        while (true) {
            NavDestination navDestinationFindNode = null;
            if (i >= length) {
                return null;
            }
            int i8 = deepLink[i];
            if (i == 0) {
                NavGraph navGraph3 = this._graph;
                AbstractC5830k.m5327d(navGraph3);
                if (navGraph3.getId() == i8) {
                    navDestinationFindNode = this._graph;
                }
            } else {
                AbstractC5830k.m5327d(navGraph2);
                navDestinationFindNode = navGraph2.findNode(i8);
            }
            if (navDestinationFindNode == null) {
                return NavDestination.INSTANCE.getDisplayName(getNavContext(), i8);
            }
            if (i != deepLink.length - 1 && (navDestinationFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationFindNode;
                    AbstractC5830k.m5327d(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    @NotNull
    public final <T> String generateRouteFilled$navigation_runtime_release(@NotNull T route) {
        AbstractC5830k.m5330g(route, "route");
        NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(AbstractC5832m.m5340a(route.getClass()))), true, null, 8, null);
        if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
            throw new IllegalArgumentException(("Destination with route " + AbstractC5832m.m5340a(route.getClass()).m5320e() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, NavArgument> arguments = navDestinationFindDestinationComprehensive$navigation_runtime_release$default.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5785e0.m5149C(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(route, linkedHashMap);
    }

    @Nullable
    /* renamed from: getAddToBackStackHandler$navigation_runtime_release, reason: from getter */
    public final InterfaceC6471c getAddToBackStackHandler() {
        return this.addToBackStackHandler;
    }

    @NotNull
    /* renamed from: getBackQueue$navigation_runtime_release, reason: from getter */
    public final C5801p getBackQueue() {
        return this.backQueue;
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(int destinationId) {
        Object objPrevious;
        C5801p c5801p = this.backQueue;
        ListIterator<E> listIterator = c5801p.listIterator(c5801p.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((NavBackStackEntry) objPrevious).getDestination().getId() == destinationId) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(destinationId, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbM94s.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalArgumentException(sbM94s.toString().toString());
    }

    @NotNull
    public final Map<Integer, String> getBackStackMap$navigation_runtime_release() {
        return this.backStackMap;
    }

    @NotNull
    public final Map<String, C5801p> getBackStackStates$navigation_runtime_release() {
        return this.backStackStates;
    }

    @Nullable
    /* renamed from: getBackStackToRestore$navigation_runtime_release, reason: from getter */
    public final Bundle[] getBackStackToRestore() {
        return this.backStackToRestore;
    }

    @NotNull
    public final Map<NavBackStackEntry, NavBackStackEntry> getChildToParentEntries$navigation_runtime_release() {
        return this.childToParentEntries;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* renamed from: getCurrentBackStack$navigation_runtime_release, reason: from getter */
    public final InterfaceC5944m0 getCurrentBackStack() {
        return this.currentBackStack;
    }

    @Nullable
    public final NavBackStackEntry getCurrentBackStackEntry$navigation_runtime_release() {
        return (NavBackStackEntry) this.backQueue.m5169e();
    }

    @Nullable
    public final NavDestination getCurrentDestination$navigation_runtime_release() {
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        if (currentBackStackEntry$navigation_runtime_release != null) {
            return currentBackStackEntry$navigation_runtime_release.getDestination();
        }
        return null;
    }

    @NotNull
    public final Map<NavBackStackEntry, Boolean> getEntrySavedState$navigation_runtime_release() {
        return this.entrySavedState;
    }

    @MainThread
    @NotNull
    public final NavGraph getGraph$navigation_runtime_release() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC5830k.m5328e(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    @NotNull
    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    @NotNull
    /* renamed from: getLifecycleObserver$navigation_runtime_release, reason: from getter */
    public final LifecycleObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    @Nullable
    /* renamed from: getLifecycleOwner$navigation_runtime_release, reason: from getter */
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final NavContext getNavContext() {
        return this.navController.getNavContext();
    }

    @NotNull
    public final NavController getNavController() {
        return this.navController;
    }

    @NotNull
    /* renamed from: getNavigatorProvider$navigation_runtime_release, reason: from getter */
    public final NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    @NotNull
    public final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> getNavigatorState$navigation_runtime_release() {
        return this.navigatorState;
    }

    @Nullable
    /* renamed from: getNavigatorStateToRestore$navigation_runtime_release, reason: from getter */
    public final Bundle getNavigatorStateToRestore() {
        return this.navigatorStateToRestore;
    }

    @NotNull
    public final List<NavController.OnDestinationChangedListener> getOnDestinationChangedListeners$navigation_runtime_release() {
        return this.onDestinationChangedListeners;
    }

    @NotNull
    public final Map<NavBackStackEntry, AtomicInt> getParentToChildCount$navigation_runtime_release() {
        return this.parentToChildCount;
    }

    @Nullable
    /* renamed from: getPopFromBackStackHandler$navigation_runtime_release, reason: from getter */
    public final InterfaceC6471c getPopFromBackStackHandler() {
        return this.popFromBackStackHandler;
    }

    @Nullable
    public final NavBackStackEntry getPreviousBackStackEntry$navigation_runtime_release() {
        Object next;
        Iterator it = AbstractC5805t.m5241u0(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((C6823a) AbstractC6833k.m6493t(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    @NotNull
    public final NavGraph getTopGraph$navigation_runtime_release() {
        NavDestination destination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.m5169e();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            AbstractC5830k.m5327d(destination);
        }
        NavGraph navGraph = destination instanceof NavGraph ? (NavGraph) destination : null;
        if (navGraph != null) {
            return navGraph;
        }
        NavGraph parent = destination.getParent();
        AbstractC5830k.m5327d(parent);
        return parent;
    }

    @NotNull
    public final InterfaceC6469a getUpdateOnBackPressedCallbackEnabledCallback() {
        return this.updateOnBackPressedCallbackEnabledCallback;
    }

    @Nullable
    /* renamed from: getViewModel$navigation_runtime_release, reason: from getter */
    public final NavControllerViewModel getViewModel() {
        return this.viewModel;
    }

    @NotNull
    public final ViewModelStoreOwner getViewModelStoreOwner$navigation_runtime_release(int navGraphId) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        NavBackStackEntry backStackEntry$navigation_runtime_release = getBackStackEntry$navigation_runtime_release(navGraphId);
        if (backStackEntry$navigation_runtime_release.getDestination() instanceof NavGraph) {
            return backStackEntry$navigation_runtime_release;
        }
        throw new IllegalArgumentException(AbstractC0037f.m82g(navGraphId, "No NavGraph with ID ", " is on the NavController's back stack").toString());
    }

    @NotNull
    /* renamed from: getVisibleEntries$navigation_runtime_release, reason: from getter */
    public final InterfaceC5944m0 getVisibleEntries() {
        return this.visibleEntries;
    }

    @NotNull
    /* renamed from: get_currentBackStack$navigation_runtime_release, reason: from getter */
    public final InterfaceC5959y get_currentBackStack() {
        return this._currentBackStack;
    }

    @NotNull
    /* renamed from: get_currentBackStackEntryFlow$navigation_runtime_release, reason: from getter */
    public final InterfaceC5958x get_currentBackStackEntryFlow() {
        return this._currentBackStackEntryFlow;
    }

    @Nullable
    /* renamed from: get_graph$navigation_runtime_release, reason: from getter */
    public final NavGraph get_graph() {
        return this._graph;
    }

    @NotNull
    public final NavigatorProvider get_navigatorProvider$navigation_runtime_release() {
        return this._navigatorProvider;
    }

    @NotNull
    /* renamed from: get_visibleEntries$navigation_runtime_release, reason: from getter */
    public final InterfaceC5959y get_visibleEntries() {
        return this._visibleEntries;
    }

    public final void linkChildToParent$navigation_runtime_release(@NotNull NavBackStackEntry child, @NotNull NavBackStackEntry parent) {
        AbstractC5830k.m5330g(child, "child");
        AbstractC5830k.m5330g(parent, "parent");
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInt(0));
        }
        AtomicInt atomicInt = this.parentToChildCount.get(parent);
        AbstractC5830k.m5327d(atomicInt);
        atomicInt.incrementAndGet$navigation_runtime_release();
    }

    public final void markTransitionComplete$navigation_runtime_release(@NotNull NavController.NavControllerNavigatorState state, @NotNull NavBackStackEntry entry, @NotNull InterfaceC6469a superCallback) {
        NavControllerViewModel navControllerViewModel;
        AbstractC5830k.m5330g(state, "state");
        AbstractC5830k.m5330g(entry, "entry");
        AbstractC5830k.m5330g(superCallback, "superCallback");
        boolean zM5325b = AbstractC5830k.m5325b(this.entrySavedState.get(entry), Boolean.TRUE);
        superCallback.invoke();
        this.entrySavedState.remove(entry);
        if (this.backQueue.contains(entry)) {
            if (state.getIsNavigating()) {
                return;
            }
            updateBackStackLifecycle$navigation_runtime_release();
            InterfaceC5959y interfaceC5959y = this._currentBackStack;
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(this.backQueue);
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            c5946n0.getClass();
            c5946n0.m5571k(null, arrayListM5218E0);
            ((C5946n0) this._visibleEntries).m5570j(populateVisibleEntries$navigation_runtime_release());
            return;
        }
        unlinkChildFromParent$navigation_runtime_release(entry);
        if (entry.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
        }
        C5801p c5801p = this.backQueue;
        if (c5801p == null || !c5801p.isEmpty()) {
            Iterator it = c5801p.iterator();
            while (it.hasNext()) {
                if (AbstractC5830k.m5325b(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                    break;
                }
            }
            if (!zM5325b && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(entry.getId());
            }
        } else if (!zM5325b) {
            navControllerViewModel.clear(entry.getId());
        }
        updateBackStackLifecycle$navigation_runtime_release();
        ((C5946n0) this._visibleEntries).m5570j(populateVisibleEntries$navigation_runtime_release());
    }

    public final void navigate$navigation_runtime_release(@NotNull Uri deepLink) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null));
    }

    public final void navigateInternal$navigation_runtime_release(@NotNull Navigator<? extends NavDestination> navigator, @NotNull List<NavBackStackEntry> entries, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras, @NotNull InterfaceC6471c handler) {
        AbstractC5830k.m5330g(navigator, "navigator");
        AbstractC5830k.m5330g(entries, "entries");
        AbstractC5830k.m5330g(handler, "handler");
        this.addToBackStackHandler = handler;
        navigator.navigate(entries, navOptions, navigatorExtras);
        this.addToBackStackHandler = null;
    }

    public final void onGraphCreated$navigation_runtime_release(@Nullable Bundle startDestinationArgs) {
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null) {
            Bundle bundleM13597constructorimpl = SavedStateReader.m13597constructorimpl(bundle);
            if (SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_NAVIGATOR_STATE_NAMES)) {
                for (String str : SavedStateReader.m13671getStringListimpl(bundleM13597constructorimpl, KEY_NAVIGATOR_STATE_NAMES)) {
                    Navigator navigator = this._navigatorProvider.getNavigator(str);
                    if (SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, str)) {
                        navigator.onRestoreState(SavedStateReader.m13654getSavedStateimpl(bundleM13597constructorimpl, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.backStackToRestore;
        int i = 0;
        if (bundleArr != null) {
            for (Bundle bundle2 : bundleArr) {
                NavBackStackEntryState navBackStackEntryState = new NavBackStackEntryState(bundle2);
                NavDestination navDestinationFindDestination$navigation_runtime_release$default = findDestination$navigation_runtime_release$default(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (navDestinationFindDestination$navigation_runtime_release$default == null) {
                    StringBuilder sbM100y = AbstractC0037f.m100y("Restoring the Navigation back stack failed: destination ", NavDestination.INSTANCE.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId()), " cannot be found from the current destination ");
                    sbM100y.append(getCurrentDestination$navigation_runtime_release());
                    throw new IllegalStateException(sbM100y.toString());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestination$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination$navigation_runtime_release$default.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map = this.navigatorState;
                NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = map.get(navigator2);
                if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release == null) {
                    navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator2);
                    map.put(navigator2, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release);
                }
                this.backQueue.addLast(navBackStackEntryInstantiate);
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent$navigation_runtime_release(navBackStackEntryInstantiate, getBackStackEntry$navigation_runtime_release(parent.getId()));
                }
            }
            this.updateOnBackPressedCallbackEnabledCallback.invoke();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Navigator<? extends NavDestination> navigator3 = (Navigator) obj2;
            Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map2 = this.navigatorState;
            NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = map2.get(navigator3);
            if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 == null) {
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator3);
                map2.put(navigator3, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
            }
            navigator3.onAttach(navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            dispatchOnDestinationChanged$navigation_runtime_release();
        } else {
            if (this.navController.checkDeepLinkHandled$navigation_runtime_release()) {
                return;
            }
            NavGraph navGraph = this._graph;
            AbstractC5830k.m5327d(navGraph);
            navigate$navigation_runtime_release(navGraph, startDestinationArgs, null, null);
        }
    }

    public final void pop$navigation_runtime_release(@NotNull NavController.NavControllerNavigatorState state, @NotNull NavBackStackEntry popUpTo, boolean saveState, @NotNull InterfaceC6469a superCallback) {
        AbstractC5830k.m5330g(state, "state");
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        AbstractC5830k.m5330g(superCallback, "superCallback");
        Navigator navigator = this._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
        this.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
        if (!AbstractC5830k.m5325b(navigator, state.getNavigator())) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
            AbstractC5830k.m5327d(navControllerNavigatorState);
            navControllerNavigatorState.pop(popUpTo, saveState);
        } else {
            InterfaceC6471c interfaceC6471c = this.popFromBackStackHandler;
            if (interfaceC6471c == null) {
                popBackStackFromNavigator$navigation_runtime_release(popUpTo, new C2866e(superCallback, 0));
            } else {
                interfaceC6471c.invoke(popUpTo);
                superCallback.invoke();
            }
        }
    }

    public final boolean popBackStack$navigation_runtime_release() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination$navigation_runtime_release = getCurrentDestination$navigation_runtime_release();
        AbstractC5830k.m5327d(currentDestination$navigation_runtime_release);
        return popBackStack$navigation_runtime_release(currentDestination$navigation_runtime_release.getId(), true);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@NotNull NavBackStackEntry popUpTo, @NotNull InterfaceC6469a onComplete) {
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        AbstractC5830k.m5330g(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.INSTANCE.m1923i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != this.backQueue.size()) {
            popBackStackInternal$navigation_runtime_release(((NavBackStackEntry) this.backQueue.get(i)).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$navigation_runtime_release$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void popBackStackInternal$navigation_runtime_release(@NotNull Navigator<? extends NavDestination> navigator, @NotNull NavBackStackEntry popUpTo, boolean saveState, @NotNull InterfaceC6471c handler) {
        AbstractC5830k.m5330g(navigator, "navigator");
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        AbstractC5830k.m5330g(handler, "handler");
        this.popFromBackStackHandler = handler;
        navigator.popBackStack(popUpTo, saveState);
        this.popFromBackStackHandler = null;
    }

    public final void popEntryFromBackStack$navigation_runtime_release(@NotNull NavBackStackEntry popUpTo, boolean saveState, @NotNull C5801p savedState) {
        NavControllerViewModel navControllerViewModel;
        InterfaceC5944m0 transitionsInProgress;
        Set set;
        AbstractC5830k.m5330g(popUpTo, "popUpTo");
        AbstractC5830k.m5330g(savedState, "savedState");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        if (!AbstractC5830k.m5325b(navBackStackEntry, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry.getDestination() + ')').toString());
        }
        AbstractC5810y.m5300b0(this.backQueue);
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
        boolean z8 = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null || !set.contains(navBackStackEntry)) && !this.parentToChildCount.containsKey(navBackStackEntry)) {
            z8 = false;
        }
        Lifecycle.State currentState = navBackStackEntry.getLifecycle().getState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (saveState) {
                navBackStackEntry.setMaxLifecycle(state);
                savedState.addFirst(new NavBackStackEntryState(navBackStackEntry));
            }
            if (z8) {
                navBackStackEntry.setMaxLifecycle(state);
            } else {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            }
        }
        if (saveState || z8 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(navBackStackEntry.getId());
    }

    @NotNull
    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavController.NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC5810y.m5291S(arrayList2, arrayList);
        }
        C5801p c5801p = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = c5801p.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(next);
            }
        }
        AbstractC5810y.m5291S(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final void prepareForTransition$navigation_runtime_release(@NotNull NavBackStackEntry entry) {
        AbstractC5830k.m5330g(entry, "entry");
        if (!this.backQueue.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.setMaxLifecycle(Lifecycle.State.STARTED);
    }

    public final void push$navigation_runtime_release(@NotNull NavController.NavControllerNavigatorState state, @NotNull NavBackStackEntry backStackEntry) {
        AbstractC5830k.m5330g(state, "state");
        AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
        Navigator navigator = this._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
        if (!AbstractC5830k.m5325b(navigator, state.getNavigator())) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
        InterfaceC6471c interfaceC6471c = this.addToBackStackHandler;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(backStackEntry);
            state.addInternal(backStackEntry);
            return;
        }
        Log.INSTANCE.m1923i(TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
    }

    public final void removeOnDestinationChangedListener$navigation_runtime_release(@NotNull NavController.OnDestinationChangedListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    public final void restoreState$navigation_runtime_release(@Nullable Bundle navState) {
        if (navState == null) {
            return;
        }
        Bundle bundleM13597constructorimpl = SavedStateReader.m13597constructorimpl(navState);
        this.navigatorStateToRestore = SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_NAVIGATOR_STATE) ? SavedStateReader.m13654getSavedStateimpl(bundleM13597constructorimpl, KEY_NAVIGATOR_STATE) : null;
        int i = 0;
        this.backStackToRestore = SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_BACK_STACK) ? (Bundle[]) SavedStateReader.m13657getSavedStateListimpl(bundleM13597constructorimpl, KEY_BACK_STACK).toArray(new Bundle[0]) : null;
        this.backStackStates.clear();
        if (SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_BACK_STACK_DEST_IDS) && SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_BACK_STACK_IDS)) {
            int[] iArrM13629getIntArrayimpl = SavedStateReader.m13629getIntArrayimpl(bundleM13597constructorimpl, KEY_BACK_STACK_DEST_IDS);
            List<String> listM13671getStringListimpl = SavedStateReader.m13671getStringListimpl(bundleM13597constructorimpl, KEY_BACK_STACK_IDS);
            int length = iArrM13629getIntArrayimpl.length;
            int i8 = 0;
            while (i < length) {
                int i9 = i8 + 1;
                this.backStackMap.put(Integer.valueOf(iArrM13629getIntArrayimpl[i]), !AbstractC5830k.m5325b(listM13671getStringListimpl.get(i8), "") ? listM13671getStringListimpl.get(i8) : null);
                i++;
                i8 = i9;
            }
        }
        if (SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_BACK_STACK_STATES_IDS)) {
            for (String str : SavedStateReader.m13671getStringListimpl(bundleM13597constructorimpl, KEY_BACK_STACK_STATES_IDS)) {
                if (SavedStateReader.m13598containsimpl(bundleM13597constructorimpl, KEY_BACK_STACK_STATES_PREFIX + str)) {
                    List<Bundle> listM13657getSavedStateListimpl = SavedStateReader.m13657getSavedStateListimpl(bundleM13597constructorimpl, KEY_BACK_STACK_STATES_PREFIX + str);
                    Map<String, C5801p> map = this.backStackStates;
                    C5801p c5801p = new C5801p(listM13657getSavedStateListimpl.size());
                    Iterator<Bundle> it = listM13657getSavedStateListimpl.iterator();
                    while (it.hasNext()) {
                        c5801p.addLast(new NavBackStackEntryState(it.next()));
                    }
                    map.put(str, c5801p);
                }
            }
        }
    }

    @Nullable
    public final Bundle saveState$navigation_runtime_release() {
        Pair[] pairArr;
        Bundle bundleBundleOf;
        Pair[] pairArr2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        Pair[] pairArr5;
        ArrayList arrayList = new ArrayList();
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList2);
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf2);
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry2 : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleOnSaveState = entry2.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                SavedStateWriter.m13710putSavedStateimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf2), key, bundleOnSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundleBundleOf = null;
        } else {
            Map mapM5147A2 = AbstractC5785e0.m5147A();
            if (mapM5147A2.isEmpty()) {
                pairArr5 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapM5147A2.size());
                for (Map.Entry entry3 : mapM5147A2.entrySet()) {
                    AbstractC1923c.m1057u((String) entry3.getKey(), entry3.getValue(), arrayList3);
                }
                pairArr5 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr5, pairArr5.length));
            Bundle bundleM13683constructorimpl = SavedStateWriter.m13683constructorimpl(bundleBundleOf);
            SavedStateWriter.m13718putStringListimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf2), KEY_NAVIGATOR_STATE_NAMES, arrayList);
            SavedStateWriter.m13710putSavedStateimpl(bundleM13683constructorimpl, KEY_NAVIGATOR_STATE, bundleBundleOf2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapM5147A3 = AbstractC5785e0.m5147A();
                if (mapM5147A3.isEmpty()) {
                    pairArr4 = new Pair[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(mapM5147A3.size());
                    for (Map.Entry entry4 : mapM5147A3.entrySet()) {
                        AbstractC1923c.m1057u((String) entry4.getKey(), entry4.getValue(), arrayList4);
                    }
                    pairArr4 = (Pair[]) arrayList4.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr4, pairArr4.length));
                SavedStateWriter.m13683constructorimpl(bundleBundleOf);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<E> it = this.backQueue.iterator();
            while (it.hasNext()) {
                arrayList5.add(new NavBackStackEntryState((NavBackStackEntry) it.next()).writeToState());
            }
            SavedStateWriter.m13712putSavedStateListimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), KEY_BACK_STACK, arrayList5);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapM5147A4 = AbstractC5785e0.m5147A();
                if (mapM5147A4.isEmpty()) {
                    pairArr3 = new Pair[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(mapM5147A4.size());
                    for (Map.Entry entry5 : mapM5147A4.entrySet()) {
                        AbstractC1923c.m1057u((String) entry5.getKey(), entry5.getValue(), arrayList6);
                    }
                    pairArr3 = (Pair[]) arrayList6.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
                SavedStateWriter.m13683constructorimpl(bundleBundleOf);
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList arrayList7 = new ArrayList();
            int i = 0;
            for (Map.Entry<Integer, String> entry6 : this.backStackMap.entrySet()) {
                int iIntValue = entry6.getKey().intValue();
                String value = entry6.getValue();
                int i8 = i + 1;
                iArr[i] = iIntValue;
                if (value == null) {
                    value = "";
                }
                arrayList7.add(value);
                i = i8;
            }
            Bundle bundleM13683constructorimpl2 = SavedStateWriter.m13683constructorimpl(bundleBundleOf);
            SavedStateWriter.m13701putIntArrayimpl(bundleM13683constructorimpl2, KEY_BACK_STACK_DEST_IDS, iArr);
            SavedStateWriter.m13718putStringListimpl(bundleM13683constructorimpl2, KEY_BACK_STACK_IDS, arrayList7);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapM5147A5 = AbstractC5785e0.m5147A();
                if (mapM5147A5.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList8 = new ArrayList(mapM5147A5.size());
                    for (Map.Entry entry7 : mapM5147A5.entrySet()) {
                        AbstractC1923c.m1057u((String) entry7.getKey(), entry7.getValue(), arrayList8);
                    }
                    pairArr2 = (Pair[]) arrayList8.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                SavedStateWriter.m13683constructorimpl(bundleBundleOf);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Map.Entry<String, C5801p> entry8 : this.backStackStates.entrySet()) {
                String key2 = entry8.getKey();
                C5801p value2 = entry8.getValue();
                arrayList9.add(key2);
                ArrayList arrayList10 = new ArrayList();
                Iterator<E> it2 = value2.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(((NavBackStackEntryState) it2.next()).writeToState());
                }
                SavedStateWriter.m13712putSavedStateListimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), KEY_BACK_STACK_STATES_PREFIX + key2, arrayList10);
            }
            SavedStateWriter.m13718putStringListimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), KEY_BACK_STACK_STATES_IDS, arrayList9);
        }
        return bundleBundleOf;
    }

    public final void setAddToBackStackHandler$navigation_runtime_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.addToBackStackHandler = interfaceC6471c;
    }

    public final void setBackStackToRestore$navigation_runtime_release(@Nullable Bundle[] bundleArr) {
        this.backStackToRestore = bundleArr;
    }

    @CallSuper
    @MainThread
    public final void setGraph$navigation_runtime_release(@NotNull NavGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        setGraph$navigation_runtime_release(graph, null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(@NotNull Lifecycle.State state) {
        AbstractC5830k.m5330g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setLifecycleOwner$navigation_runtime_release(@NotNull LifecycleOwner owner) {
        Lifecycle lifecycle;
        AbstractC5830k.m5330g(owner, "owner");
        if (owner.equals(this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigatorProvider$navigation_runtime_release(@NotNull NavigatorProvider navigatorProvider) {
        AbstractC5830k.m5330g(navigatorProvider, "navigatorProvider");
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this._navigatorProvider = navigatorProvider;
    }

    public final void setNavigatorStateToRestore$navigation_runtime_release(@Nullable Bundle bundle) {
        this.navigatorStateToRestore = bundle;
    }

    public final void setPopFromBackStackHandler$navigation_runtime_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.popFromBackStackHandler = interfaceC6471c;
    }

    public final void setUpdateOnBackPressedCallbackEnabledCallback(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.updateOnBackPressedCallbackEnabledCallback = interfaceC6469a;
    }

    public final void setViewModel$navigation_runtime_release(@Nullable NavControllerViewModel navControllerViewModel) {
        this.viewModel = navControllerViewModel;
    }

    public final void setViewModelStore$navigation_runtime_release(@NotNull ViewModelStore viewModelStore) {
        AbstractC5830k.m5330g(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.INSTANCE;
        if (AbstractC5830k.m5325b(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    public final void set_graph$navigation_runtime_release(@Nullable NavGraph navGraph) {
        this._graph = navGraph;
    }

    public final void set_navigatorProvider$navigation_runtime_release(@NotNull NavigatorProvider navigatorProvider) {
        AbstractC5830k.m5330g(navigatorProvider, "<set-?>");
        this._navigatorProvider = navigatorProvider;
    }

    @Nullable
    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@NotNull NavBackStackEntry child) {
        AbstractC5830k.m5330g(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInt atomicInt = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInt != null ? Integer.valueOf(atomicInt.decrementAndGet$navigation_runtime_release()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        AtomicInt atomicInt;
        InterfaceC5944m0 transitionsInProgress;
        Set set;
        ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(this.backQueue);
        if (arrayListM5218E0.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) AbstractC5805t.m5235o0(arrayListM5218E0)).getDestination();
        ArrayList arrayListM5247A = AbstractC5806u.m5247A(destination);
        if (destination instanceof SupportingPane) {
            boolean z8 = destination instanceof FloatingWindow;
            Iterator it = AbstractC5805t.m5225e0(AbstractC5805t.m5241u0(arrayListM5218E0), 1).iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                if (z8 && !(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
                arrayListM5247A.add(destination2);
                if (!(destination2 instanceof SupportingPane) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (AbstractC5805t.m5235o0(arrayListM5247A) instanceof FloatingWindow) {
            Iterator it2 = AbstractC5805t.m5241u0(arrayListM5218E0).iterator();
            while (it2.hasNext()) {
                NavDestination destination3 = ((NavBackStackEntry) it2.next()).getDestination();
                arrayList.add(destination3);
                if (!(destination3 instanceof FloatingWindow) && !(destination3 instanceof SupportingPane) && !(destination3 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : AbstractC5805t.m5241u0(arrayListM5218E0)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination4 = navBackStackEntry.getDestination();
            NavDestination navDestination = (NavDestination) AbstractC5805t.m5229i0(arrayListM5247A);
            if (navDestination != null && navDestination.getId() == destination4.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (AbstractC5830k.m5325b((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInt = this.parentToChildCount.get(navBackStackEntry)) != null && atomicInt.get$navigation_runtime_release() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        map.put(navBackStackEntry, state);
                    }
                }
                NavDestination navDestination2 = (NavDestination) AbstractC5805t.m5229i0(arrayList);
                if (navDestination2 != null && navDestination2.getId() == destination4.getId()) {
                    AbstractC5810y.m5299a0(arrayList);
                }
                AbstractC5810y.m5299a0(arrayListM5247A);
                NavGraph parent = destination4.getParent();
                if (parent != null) {
                    arrayListM5247A.add(parent);
                }
            } else if (arrayList.isEmpty() || destination4.getId() != ((NavDestination) AbstractC5805t.m5228h0(arrayList)).getId()) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            } else {
                NavDestination navDestination3 = (NavDestination) AbstractC5810y.m5299a0(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                NavGraph parent2 = navDestination3.getParent();
                if (parent2 != null && !arrayList.contains(parent2)) {
                    arrayList.add(parent2);
                }
            }
        }
        int size = arrayListM5218E0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5218E0.get(i);
            i++;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Object obj, NavOptions navOptions, Navigator.Extras extras, int i, Object obj2) {
        if ((i & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release((NavControllerImpl) obj, navOptions, extras);
    }

    public final void navigate$navigation_runtime_release(@NotNull Uri deepLink, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    public final void setGraph$navigation_runtime_release(@NotNull NavGraph graph, @Nullable Bundle startDestinationArgs) {
        NavControllerImpl navControllerImpl;
        AbstractC5830k.m5330g(graph, "graph");
        if (!this.backQueue.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        int i = 0;
        if (!AbstractC5830k.m5325b(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                ArrayList arrayList = new ArrayList(this.backStackMap.keySet());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Integer num = (Integer) obj;
                    AbstractC5830k.m5327d(num);
                    clearBackStackInternal$navigation_runtime_release(num.intValue());
                }
                navControllerImpl = this;
                popBackStackInternal$navigation_runtime_release$default(navControllerImpl, navGraph.getId(), true, false, 4, (Object) null);
            } else {
                navControllerImpl = this;
            }
            navControllerImpl._graph = graph;
            onGraphCreated$navigation_runtime_release(startDestinationArgs);
            return;
        }
        int size2 = graph.getNodes().size();
        while (i < size2) {
            NavDestination navDestinationValueAt = graph.getNodes().valueAt(i);
            NavGraph navGraph2 = this._graph;
            AbstractC5830k.m5327d(navGraph2);
            int iKeyAt = navGraph2.getNodes().keyAt(i);
            NavGraph navGraph3 = this._graph;
            AbstractC5830k.m5327d(navGraph3);
            navGraph3.getNodes().replace(iKeyAt, navDestinationValueAt);
            i++;
        }
        Iterator it = this.backQueue.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            List listM6499z = AbstractC6833k.m6499z(NavDestination.INSTANCE.getHierarchy(navBackStackEntry.getDestination()));
            AbstractC5830k.m5330g(listM6499z, "<this>");
            C5789g0 c5789g0 = new C5789g0(listM6499z);
            NavDestination navDestinationFindNode = this._graph;
            AbstractC5830k.m5327d(navDestinationFindNode);
            Iterator it2 = c5789g0.iterator();
            while (true) {
                ListIterator listIterator = ((C5787f0) it2).f9181a;
                if (listIterator.hasPrevious()) {
                    NavDestination navDestination = (NavDestination) listIterator.previous();
                    if (!AbstractC5830k.m5325b(navDestination, this._graph) || !AbstractC5830k.m5325b(navDestinationFindNode, graph)) {
                        if (navDestinationFindNode instanceof NavGraph) {
                            navDestinationFindNode = ((NavGraph) navDestinationFindNode).findNode(navDestination.getId());
                            AbstractC5830k.m5327d(navDestinationFindNode);
                        }
                    }
                }
            }
            navBackStackEntry.setDestination(navDestinationFindNode);
        }
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z9 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release(i, z8, z9);
    }

    public final boolean clearBackStack$navigation_runtime_release(int destinationId) {
        return clearBackStackInternal$navigation_runtime_release(destinationId) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void navigate$navigation_runtime_release(@NotNull Uri deepLink, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions, navigatorExtras);
    }

    public final boolean popBackStack$navigation_runtime_release(int destinationId, boolean inclusive) {
        return popBackStack$navigation_runtime_release(destinationId, inclusive, false);
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Object obj, boolean z8, boolean z9, int i, Object obj2) {
        if ((i & 4) != 0) {
            z9 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release((NavControllerImpl) obj, z8, z9);
    }

    public final void navigate$navigation_runtime_release(@NotNull NavDeepLinkRequest request) {
        AbstractC5830k.m5330g(request, "request");
        navigate$navigation_runtime_release(request, (NavOptions) null);
    }

    public final boolean popBackStack$navigation_runtime_release(int destinationId, boolean inclusive, boolean saveState) {
        return popBackStackInternal$navigation_runtime_release(destinationId, inclusive, saveState) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean popBackStackInternal$navigation_runtime_release(int destinationId, boolean inclusive, boolean saveState) {
        NavDestination destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC5805t.m5241u0(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(navigator);
            }
            if (destination.getId() == destinationId) {
                break;
            }
        }
        if (destination == null) {
            String displayName = NavDestination.INSTANCE.getDisplayName(getNavContext(), destinationId);
            Log.INSTANCE.m1923i(TAG, "Ignoring popBackStack to destination " + displayName + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, inclusive, saveState);
    }

    public final <T> boolean clearBackStack$navigation_runtime_release(@NotNull InterfaceC6779c route) {
        AbstractC5830k.m5330g(route, "route");
        return clearBackStack$navigation_runtime_release(RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(route)));
    }

    public final void navigate$navigation_runtime_release(@NotNull NavDeepLinkRequest request, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(request, "request");
        navigate$navigation_runtime_release(request, navOptions, (Navigator.Extras) null);
    }

    public final <T> boolean clearBackStack$navigation_runtime_release(@NotNull T route) {
        AbstractC5830k.m5330g(route, "route");
        return clearBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route)) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void navigate$navigation_runtime_release(@NotNull NavDeepLinkRequest request, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(request, "request");
        if (this._graph != null) {
            NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(request, true, true, topGraph$navigation_runtime_release);
            if (deepLinkMatchMatchDeepLinkComprehensive != null) {
                Bundle bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
                if (bundleAddInDefaultArgs == null) {
                    Map mapM5147A = AbstractC5785e0.m5147A();
                    if (mapM5147A.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapM5147A.size());
                        for (Map.Entry entry : mapM5147A.entrySet()) {
                            AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    SavedStateWriter.m13683constructorimpl(bundleAddInDefaultArgs);
                }
                NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
                this.navController.writeIntent$navigation_runtime_release(request, bundleAddInDefaultArgs);
                navigate$navigation_runtime_release(destination, bundleAddInDefaultArgs, navOptions, navigatorExtras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this.navController + '.').toString());
    }

    public final boolean popBackStack$navigation_runtime_release(@NotNull String route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        return popBackStackInternal$navigation_runtime_release(route, inclusive, saveState) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    private final boolean restoreStateInternal(String route) {
        NavBackStackEntryState navBackStackEntryState;
        int iHashCode = NavDestination.INSTANCE.createRoute(route).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(iHashCode))) {
            return restoreStateInternal(iHashCode, null, null, null);
        }
        NavDestination navDestinationFindDestination$navigation_runtime_release = findDestination$navigation_runtime_release(route);
        if (navDestinationFindDestination$navigation_runtime_release != null) {
            String str = this.backStackMap.get(Integer.valueOf(navDestinationFindDestination$navigation_runtime_release.getId()));
            AbstractC5810y.m5295W(this.backStackMap.values(), new C2865d(str, 0));
            C5801p c5801p = (C5801p) AbstractC5835p.m5353b(this.backStackStates).remove(str);
            NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindDestination$navigation_runtime_release.matchRoute(route);
            AbstractC5830k.m5327d(deepLinkMatchMatchRoute);
            if (deepLinkMatchMatchRoute.hasMatchingArgs((c5801p == null || (navBackStackEntryState = (NavBackStackEntryState) c5801p.m5167c()) == null) ? null : navBackStackEntryState.getArgs())) {
                return executeRestoreState(instantiateBackStack(c5801p), null, null, null);
            }
            return false;
        }
        StringBuilder sbM100y = AbstractC0037f.m100y("Restore State failed: route ", route, " cannot be found from the current destination ");
        sbM100y.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalStateException(sbM100y.toString().toString());
    }

    @Nullable
    public final NavDestination findDestination$navigation_runtime_release(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        AbstractC5830k.m5327d(navGraph);
        if (!AbstractC5830k.m5325b(navGraph.getRoute(), route)) {
            NavGraph navGraph2 = this._graph;
            AbstractC5830k.m5327d(navGraph2);
            if (navGraph2.matchRoute(route) == null) {
                return getTopGraph$navigation_runtime_release().findNode(route);
            }
        }
        return this._graph;
    }

    public final <T> boolean popBackStack$navigation_runtime_release(@NotNull InterfaceC6779c route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(route));
        if (findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), iGenerateHashCode, true, null, 8, null) != null) {
            return popBackStack$navigation_runtime_release(iGenerateHashCode, inclusive, saveState);
        }
        throw new IllegalArgumentException(("Destination with route " + ((C5823d) route).m5320e() + " cannot be found in navigation graph " + getGraph$navigation_runtime_release()).toString());
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(route);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(route, true, false);
    }

    public final <T> boolean popBackStack$navigation_runtime_release(@NotNull T route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        return popBackStackInternal$navigation_runtime_release((NavControllerImpl) route, inclusive, saveState) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(@NotNull String route) {
        Object objPrevious;
        AbstractC5830k.m5330g(route, "route");
        C5801p c5801p = this.backQueue;
        ListIterator<E> listIterator = c5801p.listIterator(c5801p.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        StringBuilder sbM100y = AbstractC0037f.m100y("No destination with route ", route, " is on the NavController's back stack. The current destination is ");
        sbM100y.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalArgumentException(sbM100y.toString().toString());
    }

    public final <T> boolean popBackStackInternal$navigation_runtime_release(@NotNull T route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        return popBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route), inclusive, saveState);
    }

    public final boolean popBackStackInternal$navigation_runtime_release(@NotNull String route, boolean inclusive, boolean saveState) {
        Object objPrevious;
        AbstractC5830k.m5330g(route, "route");
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C5801p c5801p = this.backQueue;
        ListIterator<E> listIterator = c5801p.listIterator(c5801p.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            boolean zHasRoute = navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments());
            if (inclusive || !zHasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
            }
            if (zHasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        NavDestination destination = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
        if (destination == null) {
            Log.INSTANCE.m1923i(TAG, "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, inclusive, saveState);
    }

    @NotNull
    public final <T> NavBackStackEntry getBackStackEntry$navigation_runtime_release(@NotNull InterfaceC6779c route) {
        Object objPrevious;
        AbstractC5830k.m5330g(route, "route");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(route));
        if (findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), iGenerateHashCode, true, null, 8, null) != null) {
            List list = (List) this.currentBackStack.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((NavBackStackEntry) objPrevious).getDestination().getId() == iGenerateHashCode) {
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (navBackStackEntry != null) {
                return navBackStackEntry;
            }
            throw new IllegalArgumentException(("No destination with route " + ((C5823d) route).m5320e() + " is on the NavController's back stack. The current destination is " + getCurrentDestination$navigation_runtime_release()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + ((C5823d) route).m5320e() + " cannot be found in navigation graph " + getGraph$navigation_runtime_release()).toString());
    }

    public final void navigate$navigation_runtime_release(@NotNull NavDestination node, @Nullable Bundle args, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        boolean z8;
        Ref$BooleanRef ref$BooleanRef;
        boolean z9;
        boolean zPopBackStackInternal$navigation_runtime_release;
        NavControllerImpl navControllerImpl = this;
        AbstractC5830k.m5330g(node, "node");
        Iterator<T> it = navControllerImpl.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        boolean z10 = false;
        if (navOptions == null) {
            z8 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                AbstractC5830k.m5327d(popUpToRoute);
                zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(popUpToRoute, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteClass() != null) {
                InterfaceC6779c popUpToRouteClass = navOptions.getPopUpToRouteClass();
                AbstractC5830k.m5327d(popUpToRouteClass);
                zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(popUpToRouteClass)), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = navOptions.getPopUpToRouteObject();
                AbstractC5830k.m5327d(popUpToRouteObject);
                zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release((NavControllerImpl) popUpToRouteObject, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                if (navOptions.getPopUpToId() != -1) {
                    zPopBackStackInternal$navigation_runtime_release = navControllerImpl.popBackStackInternal$navigation_runtime_release(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
                }
                z8 = false;
            }
            z8 = zPopBackStackInternal$navigation_runtime_release;
        }
        Bundle bundleAddInDefaultArgs = node.addInDefaultArgs(args);
        if (navOptions != null && navOptions.getRestoreState() && navControllerImpl.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            ref$BooleanRef2.element = navControllerImpl.restoreStateInternal(node.getId(), bundleAddInDefaultArgs, navOptions, navigatorExtras);
            ref$BooleanRef = ref$BooleanRef2;
            z9 = false;
        } else {
            boolean z11 = navOptions != null && navOptions.getSingleTop() && launchSingleTopInternal(node, args);
            if (z11) {
                ref$BooleanRef = ref$BooleanRef2;
                z9 = false;
            } else {
                NavBackStackEntry navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, navControllerImpl.getNavContext(), node, bundleAddInDefaultArgs, navControllerImpl.getHostLifecycleState$navigation_runtime_release(), navControllerImpl.viewModel, null, null, 96, null);
                z9 = false;
                navControllerImpl = this;
                ref$BooleanRef = ref$BooleanRef2;
                navControllerImpl.navigateInternal$navigation_runtime_release(navControllerImpl._navigatorProvider.getNavigator(node.getNavigatorName()), AbstractC5806u.m5286y(navBackStackEntryCreate$default), navOptions, navigatorExtras, new C2854p(ref$BooleanRef2, this, node, bundleAddInDefaultArgs, 2));
            }
            z10 = z11;
        }
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        Iterator<T> it2 = navControllerImpl.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(z9);
        }
        if (!z8 && !ref$BooleanRef.element && !z10) {
            navControllerImpl.updateBackStackLifecycle$navigation_runtime_release();
        } else {
            navControllerImpl.dispatchOnDestinationChanged$navigation_runtime_release();
        }
    }

    @NotNull
    public final <T> NavBackStackEntry getBackStackEntry$navigation_runtime_release(@NotNull T route) {
        AbstractC5830k.m5330g(route, "route");
        return getBackStackEntry$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route));
    }

    public final void navigate$navigation_runtime_release(@NotNull String route, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(builder, "builder");
        navigate$navigation_runtime_release$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    public final void navigate$navigation_runtime_release(@NotNull String route, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        Pair[] pairArr;
        AbstractC5830k.m5330g(route, "route");
        if (this._graph != null) {
            NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
            NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = topGraph$navigation_runtime_release.matchRouteComprehensive(route, true, true, topGraph$navigation_runtime_release);
            if (deepLinkMatchMatchRouteComprehensive != null) {
                NavDestination destination = deepLinkMatchMatchRouteComprehensive.getDestination();
                Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchRouteComprehensive.getMatchingArgs());
                if (bundleAddInDefaultArgs == null) {
                    Map mapM5147A = AbstractC5785e0.m5147A();
                    if (mapM5147A.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapM5147A.size());
                        for (Map.Entry entry : mapM5147A.entrySet()) {
                            AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    SavedStateWriter.m13683constructorimpl(bundleAddInDefaultArgs);
                }
                NavDestination destination2 = deepLinkMatchMatchRouteComprehensive.getDestination();
                this.navController.writeIntent$navigation_runtime_release(NavDeepLinkRequest.Builder.INSTANCE.fromUri(NavUriKt.NavUri(NavDestination.INSTANCE.createRoute(destination.getRoute()))).build(), bundleAddInDefaultArgs);
                navigate$navigation_runtime_release(destination2, bundleAddInDefaultArgs, navOptions, navigatorExtras);
                return;
            }
            StringBuilder sbM100y = AbstractC0037f.m100y("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbM100y.append(this._graph);
            throw new IllegalArgumentException(sbM100y.toString());
        }
        throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public final <T> void navigate$navigation_runtime_release(@NotNull T route, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(builder, "builder");
        navigate$navigation_runtime_release$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    public final <T> void navigate$navigation_runtime_release(@NotNull T route, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(route, "route");
        navigate$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(route), navOptions, navigatorExtras);
    }
}
