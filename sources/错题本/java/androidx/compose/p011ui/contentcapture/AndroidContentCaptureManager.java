package androidx.compose.p011ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.DefaultLifecycleObserver;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.AbstractC0256d0;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.node.Owner;
import androidx.compose.p011ui.platform.AndroidComposeView;
import androidx.compose.p011ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p011ui.platform.SemanticsNodeCopy;
import androidx.compose.p011ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.p011ui.platform.SemanticsUtils_androidKt;
import androidx.compose.p011ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p011ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p011ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p011ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.p011ui.semantics.AccessibilityAction;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p011ui.semantics.SemanticsNode;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutInput;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.util.ListUtilsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.InterfaceC5876e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;
import p045d6.C5443s;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u009d\u0001\u009e\u0001\u009f\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010!\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010\u001aJ/\u0010-\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(H\u0001¢\u0006\u0004\b+\u0010,J'\u00104\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00002\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/H\u0001¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010\u001aJ\u001f\u0010:\u001a\u00020\r2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010?\u001a\u00020\r2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020\r2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\u001aJ\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010\u001aJ\u001d\u0010K\u001a\u0004\u0018\u00010J*\u0002062\u0006\u0010I\u001a\u00020AH\u0002¢\u0006\u0004\bK\u0010LJ-\u0010O\u001a\u00020\r*\u0002062\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\r0MH\u0002¢\u0006\u0004\bO\u0010PJN\u0010V\u001a\u00020\r\"\u0004\b\u0000\u0010Q*\b\u0012\u0004\u0012\u00028\u00000R2\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0M2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020T0SH\u0082\b¢\u0006\u0004\bV\u0010WJ!\u0010Z\u001a\u00020\r2\u0006\u0010X\u001a\u00020A2\b\u0010Y\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\r2\u0006\u0010X\u001a\u00020AH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\rH\u0002¢\u0006\u0004\b^\u0010\u001aJ\u001f\u0010`\u001a\u00020\r2\u0006\u0010I\u001a\u00020A2\u0006\u0010_\u001a\u000206H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\r2\u0006\u0010_\u001a\u000206H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\r2\u0006\u0010_\u001a\u000206H\u0002¢\u0006\u0004\bd\u0010cJ\u000f\u0010e\u001a\u00020\rH\u0002¢\u0006\u0004\be\u0010\u001aJ\u000f\u0010f\u001a\u00020\rH\u0002¢\u0006\u0004\bf\u0010\u001aJ\u000f\u0010g\u001a\u00020\rH\u0002¢\u0006\u0004\bg\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010h\u001a\u0004\bi\u0010jR*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR*\u0010p\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bv\u0010\u001a\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020x0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R.\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020=0<8@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010@R\u0018\u0010\u0090\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010}R \u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u0002080\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0082\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009c\u0001\u001a\u00020T8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006 \u0001"}, m5110d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lr6/a;)V", "Landroid/view/View;", "v", "Ld6/s;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "boundsUpdatesEventLoop$ui_release", "(Lh6/c;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "onLayoutChange$ui_release", "onLayoutChange", "onShowTranslation$ui_release", "onShowTranslation", "onHideTranslation$ui_release", "onHideTranslation", "onClearTranslation$ui_release", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui_release", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "sendContentCaptureDisappearEvents", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "sendContentCaptureAppearEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "newSemanticsNodes", "checkForContentCapturePropertyChanges", "(Landroidx/collection/IntObjectMap;)V", "", "id", "", "newText", "sendContentCaptureTextUpdateEvent", "(ILjava/lang/String;)V", "updateSemanticsCopy", "notifySubtreeStateChangeIfNeeded", "index", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "toViewStructure", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "Lkotlin/Function2;", "action", "fastForEachReplacedVisibleChildren", "(Landroidx/compose/ui/semantics/SemanticsNode;Lr6/e;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "", "predicate", "fastForEachIndexedWithFilter", "(Ljava/util/List;Lr6/e;Lr6/c;)V", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "(ILandroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "bufferContentCaptureViewDisappeared", "(I)V", "notifyContentCaptureChanges", "node", "updateBuffersOnAppeared", "(ILandroidx/compose/ui/semantics/SemanticsNode;)V", "updateBuffersOnDisappeared", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "updateTranslationOnAppeared", "showTranslatedText", "hideTranslatedText", "clearTranslatedText", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lr6/a;", "getOnContentCaptureSession", "()Lr6/a;", "setOnContentCaptureSession", "(Lr6/a;)V", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "getContentCaptureSession$ui_release$annotations", "", "Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "bufferedEvents", "Ljava/util/List;", "", "SendRecurringContentCaptureEventsIntervalMillis", "J", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "currentSemanticsNodesInvalidated", "Z", "Lkotlinx/coroutines/channels/e;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/e;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "getCurrentSemanticsNodes$ui_release", "()Landroidx/collection/IntObjectMap;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodesSnapshotTimestampMillis", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsNodes", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsRoot", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "Ljava/lang/Runnable;", "isEnabled$ui_release", "()Z", "isEnabled", "Companion", "TranslateStatus", "ViewTranslationHelperMethods", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,655:1\n395#1,4:810\n399#1,5:815\n390#2,3:656\n354#2,6:659\n364#2,3:666\n367#2,2:670\n425#2:672\n370#2,6:673\n393#2:679\n425#2:684\n425#2:685\n390#2,3:694\n354#2,6:697\n364#2,3:704\n367#2,2:708\n370#2,6:765\n393#2:771\n382#2,4:779\n354#2,6:783\n364#2,3:790\n367#2,9:794\n386#2:803\n425#2:814\n397#2,3:832\n354#2,6:835\n364#2,3:842\n367#2,9:846\n400#2:855\n397#2,3:856\n354#2,6:859\n364#2,3:866\n367#2,9:870\n400#2:879\n397#2,3:880\n354#2,6:883\n364#2,3:890\n367#2,9:894\n400#2:903\n1399#3:665\n1270#3:669\n1399#3:703\n1270#3:707\n1399#3:726\n1270#3:730\n1399#3:750\n1270#3:754\n1399#3:789\n1270#3:793\n1399#3:841\n1270#3:845\n1399#3:865\n1270#3:869\n1399#3:889\n1270#3:893\n34#4,4:680\n39#4:693\n34#4,6:820\n34#4,6:826\n76#5,7:686\n76#5,7:710\n76#5,7:772\n365#6,3:717\n329#6,6:720\n339#6,3:727\n342#6,9:731\n368#6:740\n365#6,3:741\n329#6,6:744\n339#6,3:751\n342#6,9:755\n368#6:764\n56#7,6:804\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager\n*L\n387#1:810,4\n387#1:815,5\n215#1:656,3\n215#1:659,6\n215#1:666,3\n215#1:670,2\n216#1:672\n215#1:673,6\n215#1:679\n234#1:684\n235#1:685\n250#1:694,3\n250#1:697,6\n250#1:704,3\n250#1:708,2\n250#1:765,6\n250#1:771\n305#1:779,4\n305#1:783,6\n305#1:790,3\n305#1:794,9\n305#1:803\n388#1:814\n512#1:832,3\n512#1:835,6\n512#1:842,3\n512#1:846,9\n512#1:855\n521#1:856,3\n521#1:859,6\n521#1:866,3\n521#1:870,9\n521#1:879\n530#1:880,3\n530#1:883,6\n530#1:890,3\n530#1:894,9\n530#1:903\n215#1:665\n215#1:669\n250#1:703\n250#1:707\n261#1:726\n261#1:730\n271#1:750\n271#1:754\n305#1:789\n305#1:793\n512#1:841\n512#1:845\n521#1:865\n521#1:869\n530#1:889\n530#1:893\n232#1:680,4\n232#1:693\n441#1:820,6\n476#1:826,6\n238#1:686,7\n255#1:710,7\n298#1:772,7\n261#1:717,3\n261#1:720,6\n261#1:727,3\n261#1:731,9\n261#1:740\n271#1:741,3\n271#1:744,6\n271#1:751,3\n271#1:755,9\n271#1:764\n379#1:804,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    @NotNull
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";

    @NotNull
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;

    @Nullable
    private ContentCaptureSessionCompat contentCaptureSession;
    private long currentSemanticsNodesSnapshotTimestampMillis;

    @NotNull
    private InterfaceC6469a onContentCaptureSession;

    @NotNull
    private SemanticsNodeCopy previousSemanticsRoot;

    @NotNull
    private final AndroidComposeView view;
    public static final int $stable = 8;

    @NotNull
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    @NotNull
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;

    @NotNull
    private final InterfaceC5876e boundsUpdateChannel = AbstractC5882k.m5511a(1, 6, null);

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();

    @NotNull
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();

    @NotNull
    private final Runnable contentCaptureChangeChecker = new RunnableC0023a(this, 12);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TranslateStatus {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        static {
            TranslateStatus[] translateStatusArr$values = $values();
            $VALUES = translateStatusArr$values;
            $ENTRIES = AbstractC5817a.m5310a(translateStatusArr$values);
        }

        private TranslateStatus(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    @Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, m5110d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "<init>", "()V", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "Ld6/s;", "doTranslation", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;[J[ILjava/util/function/Consumer;)V", "onVirtualViewTranslationResponses", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @RequiresApi(31)
    @SourceDebugExtension({"SMAP\nAndroidContentCaptureManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,655:1\n13337#2,2:656\n*S KotlinDebug\n*F\n+ 1 AndroidContentCaptureManager.android.kt\nandroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods\n*L\n549#1:656,2\n*E\n"})
    public static final class ViewTranslationHelperMethods {

        @NotNull
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        private final void doTranslation(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            InterfaceC6471c interfaceC6471c;
            int size = response.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = response.keyAt(i);
                ViewTranslationResponse viewTranslationResponseM544r = AbstractC0256d0.m544r(response.get(jKeyAt));
                if (viewTranslationResponseM544r != null && (value = viewTranslationResponseM544r.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = contentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (interfaceC6471c = (InterfaceC6471c) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
        @androidx.annotation.RequiresApi(31)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreateVirtualViewTranslationRequests(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager r15, @org.jetbrains.annotations.NotNull long[] r16, @org.jetbrains.annotations.NotNull int[] r17, @org.jetbrains.annotations.NotNull java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L70
                r3 = r0[r2]
                androidx.collection.IntObjectMap r5 = r15.getCurrentSemanticsNodes$ui_release()
                int r3 = (int) r3
                java.lang.Object r3 = r5.get(r3)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.p011ui.platform.SemanticsNodeWithAdjustedBounds) r3
                if (r3 == 0) goto L6b
                androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
                if (r3 != 0) goto L1c
                goto L6b
            L1c:
                androidx.camera.camera2.internal.AbstractC0256d0.m526D()
                androidx.compose.ui.platform.AndroidComposeView r4 = r15.getView()
                android.view.autofill.AutofillId r4 = androidx.compose.p011ui.autofill.AbstractC2079b.m1117h(r4)
                int r5 = r3.getId()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = androidx.camera.camera2.internal.AbstractC0256d0.m542p(r4, r5)
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig()
                androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.p011ui.semantics.SemanticsProperties.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getText()
                java.lang.Object r3 = androidx.compose.p011ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L6b
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r3 = androidx.compose.p011ui.util.ListUtilsKt.fastJoinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L6b
                androidx.compose.ui.text.AnnotatedString r5 = new androidx.compose.ui.text.AnnotatedString
                r6 = 0
                r7 = 2
                r5.<init>(r3, r6, r7, r6)
                android.view.translation.TranslationRequestValue r3 = androidx.camera.camera2.internal.AbstractC0256d0.m539m(r5)
                androidx.camera.camera2.internal.AbstractC0256d0.m524B(r4, r3)
                android.view.translation.ViewTranslationRequest r3 = androidx.camera.camera2.internal.AbstractC0256d0.m543q(r4)
                r4 = r18
                r4.accept(r3)
                goto L6d
            L6b:
                r4 = r18
            L6d:
                int r2 = r2 + 1
                goto L4
            L70:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.ViewTranslationHelperMethods.onCreateVirtualViewTranslationRequests(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, long[], int[], java.util.function.Consumer):void");
        }

        @RequiresApi(31)
        public final void onVirtualViewTranslationResponses(@NotNull final AndroidContentCaptureManager contentCaptureManager, @NotNull final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (AbstractC5830k.m5325b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$1(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidContentCaptureManager(@NotNull AndroidComposeView androidComposeView, @NotNull InterfaceC6469a interfaceC6469a) {
        this.view = androidComposeView;
        this.onContentCaptureSession = interfaceC6469a;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, ViewStructureCompat viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructure));
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j7;
        char c;
        long j8;
        int i;
        SemanticsNode semanticsNode;
        int i8;
        SemanticsNode semanticsNode2;
        long j9;
        int i9;
        long[] jArr3;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap = newSemanticsNodes;
        int[] iArr3 = intObjectMap.keys;
        long[] jArr4 = intObjectMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr4[i10];
            char c9 = 7;
            long j11 = -9187201950435737472L;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j10 & 255) < 128) {
                        int i14 = iArr3[(i10 << 3) + i13];
                        c = c9;
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i14);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i14);
                        SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode3 == null) {
                            throw AbstractC1923c.m1053q("no value for specified key");
                        }
                        if (semanticsNodeCopy == null) {
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsNode3.getUnmergedConfig().getProps$ui_release();
                            j8 = j11;
                            Object[] objArr = props$ui_release.keys;
                            long[] jArr5 = props$ui_release.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                int i16 = i11;
                                while (true) {
                                    long j12 = jArr5[i15];
                                    iArr2 = iArr3;
                                    if ((((~j12) << c) & j12 & j8) != j8) {
                                        int i17 = 8 - ((~(i15 - length2)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j12 & 255) < 128) {
                                                i9 = i18;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i15 << 3) + i18];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (AbstractC5830k.m5325b(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode3.getUnmergedConfig(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode3.getId(), String.valueOf(list != null ? (AnnotatedString) AbstractC5805t.m5229i0(list) : null));
                                                }
                                            } else {
                                                i9 = i18;
                                                jArr3 = jArr4;
                                            }
                                            j12 >>= i16;
                                            i18 = i9 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i17 != i16) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i16 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j8 = j11;
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release2 = semanticsNode3.getUnmergedConfig().getProps$ui_release();
                            Object[] objArr2 = props$ui_release2.keys;
                            long[] jArr6 = props$ui_release2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j13 = jArr6[i19];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j13) << c) & j13 & j8) != j8) {
                                        int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j13 & 255) < 128) {
                                                i8 = i21;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i19 << 3) + i21];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                semanticsNode2 = semanticsNode3;
                                                if (AbstractC5830k.m5325b(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) AbstractC5805t.m5229i0(list2) : null;
                                                    j9 = j10;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) AbstractC5805t.m5229i0(list3) : null;
                                                    if (!AbstractC5830k.m5325b(annotatedString, annotatedString2)) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j13 >>= 8;
                                                i21 = i8 + 1;
                                                semanticsNode3 = semanticsNode2;
                                                j10 = j9;
                                            } else {
                                                i8 = i21;
                                                semanticsNode2 = semanticsNode3;
                                            }
                                            j9 = j10;
                                            j13 >>= 8;
                                            i21 = i8 + 1;
                                            semanticsNode3 = semanticsNode2;
                                            j10 = j9;
                                        }
                                        semanticsNode = semanticsNode3;
                                        j7 = j10;
                                        if (i20 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNode3;
                                        j7 = j10;
                                    }
                                    if (i19 == length3) {
                                        break;
                                    }
                                    i19++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNode3 = semanticsNode;
                                    j10 = j7;
                                }
                            }
                            i = 8;
                        }
                        j7 = j10;
                        i = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j7 = j10;
                        c = c9;
                        j8 = j11;
                        i = i11;
                    }
                    j10 = j7 >> i;
                    i13++;
                    intObjectMap = newSemanticsNodes;
                    i11 = i;
                    c9 = c;
                    j11 = j8;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i12 != i11) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            intObjectMap = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        InterfaceC6469a interfaceC6469a;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
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
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i9]).getSemanticsNode().getUnmergedConfig();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (interfaceC6469a = (InterfaceC6469a) accessibilityAction.getAction()) != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui_release()) {
            Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
            androidContentCaptureManager.sendContentCaptureDisappearEvents();
            androidContentCaptureManager.sendContentCaptureAppearEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui_release());
            androidContentCaptureManager.updateSemanticsCopy();
            androidContentCaptureManager.checkingForSemanticsChanges = false;
        }
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                interfaceC6473e.invoke(Integer.valueOf(i), t8);
                i++;
            }
        }
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, InterfaceC6473e interfaceC6473e) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i8);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode2.getId())) {
                interfaceC6473e.invoke(Integer.valueOf(i), semanticsNode2);
                i++;
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        InterfaceC6471c interfaceC6471c;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
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
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i9]).getSemanticsNode().getUnmergedConfig();
                        if (AbstractC5830k.m5325b(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (interfaceC6471c = (InterfaceC6471c) accessibilityAction.getAction()) != null) {
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

    private final void notifyContentCaptureChanges() {
        AutofillId autofillIdNewAutofillId;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i);
            int i8 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i8 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionCompat.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else if (i8 == 2 && (autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(contentCaptureEvent.getId())) != null) {
                contentCaptureSessionCompat.notifyViewDisappeared(autofillIdNewAutofillId);
            }
        }
        contentCaptureSessionCompat.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.mo5481a(C5443s.f8405a);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode newNode, final SemanticsNodeCopy oldNode) {
        fastForEachReplacedVisibleChildren(newNode, new InterfaceC6473e() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendContentCaptureAppearEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(int i, SemanticsNode semanticsNode) {
                if (oldNode.getChildren().contains(semanticsNode.getId())) {
                    return;
                }
                this.updateBuffersOnAppeared(i, semanticsNode);
                this.notifySubtreeStateChangeIfNeeded();
            }
        });
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode.getId()) && this.previousSemanticsNodes.containsKey(semanticsNode.getId())) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(semanticsNode.getId());
                if (semanticsNodeCopy == null) {
                    throw AbstractC1923c.m1053q("node not present in pruned tree before this change");
                }
                sendContentCaptureAppearEvents(semanticsNode, semanticsNodeCopy);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        MutableIntObjectMap<SemanticsNodeCopy> mutableIntObjectMap = this.previousSemanticsNodes;
        int[] iArr = mutableIntObjectMap.keys;
        long[] jArr = mutableIntObjectMap.metadata;
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
                        int i10 = iArr[(i << 3) + i9];
                        if (!getCurrentSemanticsNodes$ui_release().containsKey(i10)) {
                            bufferContentCaptureViewDisappeared(i10);
                            notifySubtreeStateChangeIfNeeded();
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

    private final void sendContentCaptureTextUpdateEvent(int id, String newText) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(id);
            if (autofillIdNewAutofillId == null) {
                throw AbstractC1923c.m1053q("Invalid content capture ID");
            }
            contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, newText);
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        InterfaceC6471c interfaceC6471c;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
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
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i9]).getSemanticsNode().getUnmergedConfig();
                        if (AbstractC5830k.m5325b(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (interfaceC6471c = (InterfaceC6471c) accessibilityAction.getAction()) != null) {
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

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM12503toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(r4.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getTestTag());
        if (str != null) {
            viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getIsTraversalGroup())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            viewStructureCompatNewVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, SignParameters.NEW_LINE, null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, SignParameters.NEW_LINE, null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null && (strM12503toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m12503toLegacyClassNameV4PA4sw(role.getValue())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM12503toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(layoutInput.getDensity().getFontScale() * layoutInput.getDensity().getDensity() * TextUnit.m13499getValueimpl(layoutInput.getStyle().m12801getFontSizeXSAIIZE()), 0, 0, 0);
        }
        Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) (boundsInParent$ui_release.getRight() - boundsInParent$ui_release.getLeft()), (int) (boundsInParent$ui_release.getBottom() - boundsInParent$ui_release.getTop()));
        return viewStructureCompatNewVirtualViewStructure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int index, SemanticsNode node) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(node);
            bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node, index));
            fastForEachReplacedVisibleChildren(node, new InterfaceC6473e() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateBuffersOnAppeared.1
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
                    return C5443s.f8405a;
                }

                public final void invoke(int i, SemanticsNode semanticsNode) {
                    AndroidContentCaptureManager.this.updateBuffersOnAppeared(i, semanticsNode);
                }
            });
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode node) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(node.getId());
            List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsCopy() {
        /*
            r16 = this;
            r0 = r16
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r1 = r0.previousSemanticsNodes
            r1.clear()
            androidx.collection.IntObjectMap r1 = r0.getCurrentSemanticsNodes$ui_release()
            int[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r12 = (androidx.compose.p011ui.platform.SemanticsNodeWithAdjustedBounds) r12
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r14 = r0.previousSemanticsNodes
            androidx.compose.ui.platform.SemanticsNodeCopy r15 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.semantics.SemanticsNode r12 = r12.getSemanticsNode()
            androidx.collection.IntObjectMap r5 = r0.getCurrentSemanticsNodes$ui_release()
            r15.<init>(r12, r5)
            r14.set(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.SemanticsNodeCopy r1 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.view
            androidx.compose.ui.semantics.SemanticsOwner r2 = r2.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getUnmergedRootSemanticsNode()
            androidx.collection.IntObjectMap r3 = r0.getCurrentSemanticsNodes$ui_release()
            r1.<init>(r2, r3)
            r0.previousSemanticsRoot = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager.updateSemanticsCopy():void");
    }

    private final void updateTranslationOnAppeared(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        InterfaceC6471c interfaceC6471c;
        InterfaceC6471c interfaceC6471c2;
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && AbstractC5830k.m5325b(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (interfaceC6471c2 = (InterfaceC6471c) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !AbstractC5830k.m5325b(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (interfaceC6471c = (InterfaceC6471c) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (kotlinx.coroutines.AbstractC6014x.m5638i(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:13:0x0031). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.a r2 = (kotlinx.coroutines.channels.C5872a) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.AbstractC5774b.m5119b(r10)
        L31:
            r10 = r2
            r2 = r5
            goto L52
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3c:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.a r2 = (kotlinx.coroutines.channels.C5872a) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.AbstractC5774b.m5119b(r10)
            goto L63
        L48:
            kotlin.AbstractC5774b.m5119b(r10)
            kotlinx.coroutines.channels.e r10 = r9.boundsUpdateChannel
            kotlinx.coroutines.channels.a r10 = r10.iterator()
            r2 = r9
        L52:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r5 = r10.m5466b(r0)
            if (r5 != r1) goto L5f
            goto L92
        L5f:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L63:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L93
            r2.m5467c()
            boolean r10 = r5.isEnabled$ui_release()
            if (r10 == 0) goto L77
            r5.notifyContentCaptureChanges()
        L77:
            boolean r10 = r5.checkingForSemanticsChanges
            if (r10 != 0) goto L84
            r5.checkingForSemanticsChanges = r4
            android.os.Handler r10 = r5.handler
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker
            r10.post(r6)
        L84:
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r5
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.AbstractC6014x.m5638i(r6, r0)
            if (r10 != r1) goto L31
        L92:
            return r1
        L93:
            d6.s r10 = p045d6.C5443s.f8405a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui_release(h6.c):java.lang.Object");
    }

    @Nullable
    /* renamed from: getContentCaptureSession$ui_release, reason: from getter */
    public final ContentCaptureSessionCompat getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    @NotNull
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    @NotNull
    /* renamed from: getHandler$ui_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final InterfaceC6469a getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui_release() {
        return ContentCaptureManager.INSTANCE.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @RequiresApi(31)
    public final void onCreateVirtualViewTranslationRequests$ui_release(@NotNull long[] virtualIds, @NotNull int[] supportedFormats, @NotNull Consumer<ViewTranslationRequest> requestsCollector) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // android.view.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        this.contentCaptureSession = (ContentCaptureSessionCompat) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // android.view.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v2) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    @RequiresApi(31)
    public final void onVirtualViewTranslationResponses$ui_release(@NotNull AndroidContentCaptureManager contentCaptureManager, @NotNull LongSparseArray<ViewTranslationResponse> response) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(contentCaptureManager, response);
    }

    public final void setContentCaptureSession$ui_release(@Nullable ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(@NotNull IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.currentSemanticsNodes = intObjectMap;
    }

    public final void setOnContentCaptureSession(@NotNull InterfaceC6469a interfaceC6469a) {
        this.onContentCaptureSession = interfaceC6469a;
    }
}
