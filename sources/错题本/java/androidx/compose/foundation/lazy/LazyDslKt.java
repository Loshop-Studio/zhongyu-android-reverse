package androidx.compose.foundation.lazy;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6476h;

@Metadata(m5109d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a«\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0003\u0010\u0011\u001a\u0084\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0003\u0010\u0012\u001aê\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a®\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0018\u001a«\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0003\u0010\u001a\u001a\u0084\u0001\u0010\u0003\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0003\u0010\u001b\u001aê\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0016\u0010\u001c\u001a®\u0001\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u001d\u001a\u0084\u0001\u00100\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a\u0084\u0001\u00106\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b6\u00107\u001ax\u00106\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b6\u00108\u001an\u00106\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u0010+\u001a\u00020*2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b6\u00109\u001ax\u00100\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020$2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b0\u0010:\u001an\u00100\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b0\u0010;¨\u0006<"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyListScope;", "", "items", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "itemContent", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lr6/c;Lr6/c;Lr6/g;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lr6/c;Lr6/g;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lr6/e;Lr6/e;Lr6/h;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lr6/e;Lr6/h;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lr6/c;Lr6/c;Lr6/g;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lr6/c;Lr6/g;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lr6/e;Lr6/e;Lr6/h;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lr6/e;Lr6/h;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "content", "LazyRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "LazyColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLr6/c;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,523:1\n168#1,13:524\n204#1,13:537\n240#1,13:550\n276#1,13:563\n113#2:576\n113#2:577\n113#2:578\n113#2:579\n113#2:580\n113#2:581\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n187#1:524,13\n223#1:537,13\n259#1:550,13\n295#1:563,13\n331#1:576\n391#1:577\n421#1:578\n449#1:579\n475#1:580\n503#1:581\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt {

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1 */
    public static final class C10371 extends Lambda implements InterfaceC6471c {
        public static final C10371 INSTANCE = new C10371();

        public C10371() {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public final Void invoke(Object obj) {
            return null;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2 */
    public static final class C10382 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC6471c $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10382(InterfaceC6471c interfaceC6471c, List<? extends T> list) {
            super(1);
            this.$key = interfaceC6471c;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3 */
    public static final class C10393 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10393(InterfaceC6471c interfaceC6471c, List<? extends T> list) {
            super(1);
            this.$contentType = interfaceC6471c;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4 */
    public static final class C10404 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6475g $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10404(InterfaceC6475g interfaceC6475g, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC6475g;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items.get(i), composer, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5 */
    public static final class C10415 extends Lambda implements InterfaceC6471c {
        public static final C10415 INSTANCE = new C10415();

        public C10415() {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public final Void invoke(Object obj) {
            return null;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6 */
    public static final class C10426 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC6471c $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10426(InterfaceC6471c interfaceC6471c, T[] tArr) {
            super(1);
            this.$key = interfaceC6471c;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7 */
    public static final class C10437 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10437(InterfaceC6471c interfaceC6471c, T[] tArr) {
            super(1);
            this.$contentType = interfaceC6471c;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8 */
    public static final class C10448 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6475g $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10448(InterfaceC6475g interfaceC6475g, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC6475g;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043393750, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:250)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i], composer, Integer.valueOf(i9 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2 */
    public static final class C10462 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC6473e $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10462(InterfaceC6473e interfaceC6473e, List<? extends T> list) {
            super(1);
            this.$key = interfaceC6473e;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3 */
    public static final class C10473 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6473e $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10473(InterfaceC6473e interfaceC6473e, List<? extends T> list) {
            super(1);
            this.$contentType = interfaceC6473e;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4 */
    public static final class C10484 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6476h $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10484(InterfaceC6476h interfaceC6476h, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC6476h;
            this.$items = list;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091073711, i9, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), this.$items.get(i), composer, Integer.valueOf(i9 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6 */
    public static final class C10506 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC6473e $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10506(InterfaceC6473e interfaceC6473e, T[] tArr) {
            super(1);
            this.$key = interfaceC6473e;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m5110d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7 */
    public static final class C10517 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6473e $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10517(InterfaceC6473e interfaceC6473e, T[] tArr) {
            super(1);
            this.$contentType = interfaceC6473e;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Ld6/s;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8 */
    public static final class C10528 extends Lambda implements InterfaceC6475g {
        final /* synthetic */ InterfaceC6476h $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10528(InterfaceC6476h interfaceC6476h, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC6476h;
            this.$items = tArr;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i8) {
            int i9;
            if ((i8 & 6) == 0) {
                i9 = (composer.changed(lazyItemScope) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 48) == 0) {
                i9 |= composer.changed(i) ? 32 : 16;
            }
            if (!composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600639390, i9, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:286)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf(i9 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListState r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r33, boolean r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, @org.jetbrains.annotations.Nullable androidx.compose.foundation.OverscrollEffect r39, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListState r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r33, boolean r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, @org.jetbrains.annotations.Nullable androidx.compose.foundation.OverscrollEffect r39, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> list, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6475g interfaceC6475g) {
        lazyListScope.items(list.size(), interfaceC6471c != null ? new C10382(interfaceC6471c, list) : null, new C10393(interfaceC6471c2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C10404(interfaceC6475g, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c2 = C10371.INSTANCE;
        }
        lazyListScope.items(list.size(), interfaceC6471c != null ? new C10382(interfaceC6471c, list) : null, new C10393(interfaceC6471c2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C10404(interfaceC6475g, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> list, @Nullable InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6473e interfaceC6473e2, @NotNull InterfaceC6476h interfaceC6476h) {
        lazyListScope.items(list.size(), interfaceC6473e != null ? new C10462(interfaceC6473e, list) : null, new C10473(interfaceC6473e2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C10484(interfaceC6476h, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 4) != 0) {
            interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
                public final Void invoke(int i8, Object obj2) {
                    return null;
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(list.size(), interfaceC6473e != null ? new C10462(interfaceC6473e, list) : null, new C10473(interfaceC6473e2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C10484(interfaceC6476h, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull T[] tArr, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6475g interfaceC6475g) {
        lazyListScope.items(tArr.length, interfaceC6471c != null ? new C10426(interfaceC6471c, tArr) : null, new C10437(interfaceC6471c2, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C10448(interfaceC6475g, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull T[] tArr, @Nullable InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6473e interfaceC6473e2, @NotNull InterfaceC6476h interfaceC6476h) {
        lazyListScope.items(tArr.length, interfaceC6473e != null ? new C10506(interfaceC6473e, tArr) : null, new C10517(interfaceC6473e2, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C10528(interfaceC6476h, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            interfaceC6471c2 = C10415.INSTANCE;
        }
        lazyListScope.items(objArr.length, interfaceC6471c != null ? new C10426(interfaceC6471c, objArr) : null, new C10437(interfaceC6471c2, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C10448(interfaceC6475g, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        if ((i & 4) != 0) {
            interfaceC6473e2 = new InterfaceC6473e() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
                public final Void invoke(int i8, Object obj2) {
                    return null;
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, interfaceC6473e != null ? new C10506(interfaceC6473e, objArr) : null, new C10517(interfaceC6473e2, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C10528(interfaceC6476h, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, InterfaceC6471c interfaceC6471c, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        lazyListScope.items(list.size(), interfaceC6471c != null ? new C10382(interfaceC6471c, list) : null, new C10393(C10371.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C10404(interfaceC6475g, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, InterfaceC6473e interfaceC6473e, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        lazyListScope.items(list.size(), interfaceC6473e != null ? new C10462(interfaceC6473e, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C10484(interfaceC6476h, list)));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.p011ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Vertical r29, androidx.compose.ui.Alignment.Horizontal r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final p152r6.InterfaceC6471c r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.p011ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Horizontal r29, androidx.compose.ui.Alignment.Vertical r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final p152r6.InterfaceC6471c r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC6473e interfaceC6473e, InterfaceC6476h interfaceC6476h, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = null;
        }
        lazyListScope.items(objArr.length, interfaceC6473e != null ? new C10506(interfaceC6473e, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C10528(interfaceC6476h, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC6471c interfaceC6471c, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        lazyListScope.items(objArr.length, interfaceC6471c != null ? new C10426(interfaceC6471c, objArr) : null, new C10437(C10415.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C10448(interfaceC6475g, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.p011ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Vertical r28, androidx.compose.ui.Alignment.Horizontal r29, androidx.compose.foundation.gestures.FlingBehavior r30, final p152r6.InterfaceC6471c r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.p011ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Horizontal r28, androidx.compose.ui.Alignment.Vertical r29, androidx.compose.foundation.gestures.FlingBehavior r30, final p152r6.InterfaceC6471c r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }
}
