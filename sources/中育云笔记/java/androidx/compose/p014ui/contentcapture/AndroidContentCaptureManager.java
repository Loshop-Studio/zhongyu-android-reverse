package androidx.compose.p014ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.platform.AndroidComposeView;
import androidx.compose.p014ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p014ui.platform.SemanticsNodeCopy;
import androidx.compose.p014ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.p014ui.platform.SemanticsUtils_androidKt;
import androidx.compose.p014ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p014ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.p014ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p014ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.p014ui.semantics.AccessibilityAction;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsActions;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p014ui.semantics.SemanticsNode;
import androidx.compose.p014ui.semantics.SemanticsProperties;
import androidx.compose.p014ui.semantics.SemanticsPropertyKey;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutInput;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.util.ListUtilsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;
    private ContentCaptureSessionCompat contentCaptureSession;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private InterfaceC9529a onContentCaptureSession;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final InterfaceC10000a boundsUpdateChannel = AbstractC10001b.m20722b(1, null, null, 6, null);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(this.f1140c);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TranslateStatus {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        static {
            TranslateStatus[] translateStatusArr$values = $values();
            $VALUES = translateStatusArr$values;
            $ENTRIES = AbstractC9953a.m20230a(translateStatusArr$values);
        }

        private TranslateStatus(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    @RequiresApi(31)
    public static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void doTranslation(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            InterfaceC9540l interfaceC9540l;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jKeyAt = longSparseArray.keyAt(i10);
                ViewTranslationResponse viewTranslationResponseM1092a = AbstractC2676b.m1092a(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseM1092a != null && (value = viewTranslationResponseM1092a.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = androidContentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (interfaceC9540l = (InterfaceC9540l) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
        @androidx.annotation.RequiresApi(31)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreateVirtualViewTranslationRequests(androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager r15, long[] r16, int[] r17, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L72
                r3 = r0[r2]
                androidx.collection.IntObjectMap r5 = r15.getCurrentSemanticsNodes$ui_release()
                int r3 = (int) r3
                java.lang.Object r3 = r5.get(r3)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.p014ui.platform.SemanticsNodeWithAdjustedBounds) r3
                if (r3 == 0) goto L6d
                androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
                if (r3 != 0) goto L1c
                goto L6d
            L1c:
                androidx.compose.p014ui.contentcapture.AbstractC2684j.m1100a()
                androidx.compose.ui.platform.AndroidComposeView r4 = r15.getView()
                android.view.autofill.AutofillId r4 = androidx.compose.p014ui.contentcapture.AbstractC2679e.m1095a(r4)
                int r5 = r3.getId()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = androidx.compose.p014ui.contentcapture.AbstractC2683i.m1099a(r4, r5)
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig$ui_release()
                androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.p014ui.semantics.SemanticsProperties.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getText()
                java.lang.Object r3 = androidx.compose.p014ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L6d
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r3 = androidx.compose.p014ui.util.ListUtilsKt.fastJoinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L6d
                androidx.compose.ui.text.AnnotatedString r5 = new androidx.compose.ui.text.AnnotatedString
                r6 = 0
                r7 = 2
                r5.<init>(r3, r6, r7, r6)
                java.lang.String r3 = "android:text"
                android.view.translation.TranslationRequestValue r5 = androidx.compose.p014ui.contentcapture.AbstractC2680f.m1096a(r5)
                androidx.compose.p014ui.contentcapture.AbstractC2681g.m1097a(r4, r3, r5)
                android.view.translation.ViewTranslationRequest r3 = androidx.compose.p014ui.contentcapture.AbstractC2682h.m1098a(r4)
                r4 = r18
                r4.accept(r3)
                goto L6f
            L6d:
                r4 = r18
            L6f:
                int r2 = r2 + 1
                goto L4
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.ViewTranslationHelperMethods.onCreateVirtualViewTranslationRequests(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, long[], int[], java.util.function.Consumer):void");
        }

        @RequiresApi(31)
        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager androidContentCaptureManager, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (AbstractC9979u.m20289b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$1(androidContentCaptureManager, longSparseArray);
                    }
                });
            }
        }
    }

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

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, InterfaceC9529a interfaceC9529a) {
        this.view = androidComposeView;
        this.onContentCaptureSession = interfaceC9529a;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
    }

    private final void bufferContentCaptureViewAppeared(int i10, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(i10, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructureCompat));
    }

    private final void bufferContentCaptureViewDisappeared(int i10) {
        this.bufferedEvents.add(new ContentCaptureEvent(i10, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        SemanticsNode semanticsNode;
        int i11;
        SemanticsNode semanticsNode2;
        long j12;
        int i12;
        long[] jArr3;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap2 = intObjectMap;
        int[] iArr3 = intObjectMap2.keys;
        long[] jArr4 = intObjectMap2.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr4[i13];
            char c11 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j13 & 255) < 128) {
                        int i17 = iArr3[(i13 << 3) + i16];
                        c10 = c11;
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i17);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap2.get(i17);
                        SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode3 == null) {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (semanticsNodeCopy == null) {
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsNode3.getUnmergedConfig$ui_release().getProps$ui_release();
                            j11 = j14;
                            Object[] objArr = props$ui_release.keys;
                            long[] jArr5 = props$ui_release.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i18 = 0;
                                int i19 = i14;
                                while (true) {
                                    long j15 = jArr5[i18];
                                    iArr2 = iArr3;
                                    if ((((~j15) << c10) & j15 & j11) != j11) {
                                        int i20 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j15 & 255) < 128) {
                                                i12 = i21;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i18 << 3) + i21];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (AbstractC9979u.m20289b(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode3.getUnmergedConfig$ui_release(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode3.getId(), String.valueOf(list != null ? (AnnotatedString) AbstractC10947g0.m23946o0(list) : null));
                                                }
                                            } else {
                                                i12 = i21;
                                                jArr3 = jArr4;
                                            }
                                            j15 >>= i19;
                                            i21 = i12 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i20 != i19) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i19 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j11 = j14;
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release2 = semanticsNode3.getUnmergedConfig$ui_release().getProps$ui_release();
                            Object[] objArr2 = props$ui_release2.keys;
                            long[] jArr6 = props$ui_release2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j16 = jArr6[i22];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j16) << c10) & j16 & j11) != j11) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j16 & 255) < 128) {
                                                i11 = i24;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i22 << 3) + i24];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                semanticsNode2 = semanticsNode3;
                                                if (AbstractC9979u.m20289b(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) AbstractC10947g0.m23946o0(list2) : null;
                                                    j12 = j13;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui_release(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) AbstractC10947g0.m23946o0(list3) : null;
                                                    if (!AbstractC9979u.m20289b(annotatedString, annotatedString2)) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j16 >>= 8;
                                                i24 = i11 + 1;
                                                semanticsNode3 = semanticsNode2;
                                                j13 = j12;
                                            } else {
                                                i11 = i24;
                                                semanticsNode2 = semanticsNode3;
                                            }
                                            j12 = j13;
                                            j16 >>= 8;
                                            i24 = i11 + 1;
                                            semanticsNode3 = semanticsNode2;
                                            j13 = j12;
                                        }
                                        semanticsNode = semanticsNode3;
                                        j10 = j13;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNode3;
                                        j10 = j13;
                                    }
                                    if (i22 == length3) {
                                        break;
                                    }
                                    i22++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNode3 = semanticsNode;
                                    j13 = j10;
                                }
                            }
                            i10 = 8;
                        }
                        j10 = j13;
                        i10 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j10 = j13;
                        c10 = c11;
                        j11 = j14;
                        i10 = i14;
                    }
                    j13 = j10 >> i10;
                    i16++;
                    intObjectMap2 = intObjectMap;
                    i14 = i10;
                    c11 = c10;
                    j14 = j11;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i15 != i14) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            intObjectMap2 = intObjectMap;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        InterfaceC9529a interfaceC9529a;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (interfaceC9529a = (InterfaceC9529a) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
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

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (((Boolean) interfaceC9540l.invoke(t10)).booleanValue()) {
                interfaceC9544p.invoke(Integer.valueOf(i10), t10);
                i10++;
            }
        }
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, InterfaceC9544p interfaceC9544p) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode2.getId())) {
                interfaceC9544p.invoke(Integer.valueOf(i10), semanticsNode2);
                i10++;
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        InterfaceC9540l interfaceC9540l;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (AbstractC9979u.m20289b(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (interfaceC9540l = (InterfaceC9540l) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
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
        for (int i10 = 0; i10 < size; i10++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i10);
            int i11 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i11 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionCompat.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else if (i11 == 2 && (autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(contentCaptureEvent.getId())) != null) {
                contentCaptureSessionCompat.notifyViewDisappeared(autofillIdNewAutofillId);
            }
        }
        contentCaptureSessionCompat.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.mo33808trySendJP2dKIU(C10786q.f26013a);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode semanticsNode, final SemanticsNodeCopy semanticsNodeCopy) {
        fastForEachReplacedVisibleChildren(semanticsNode, new InterfaceC9544p() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendContentCaptureAppearEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(int i10, SemanticsNode semanticsNode2) {
                if (semanticsNodeCopy.getChildren().contains(semanticsNode2.getId())) {
                    return;
                }
                this.updateBuffersOnAppeared(i10, semanticsNode2);
                this.notifySubtreeStateChangeIfNeeded();
            }
        });
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i10);
            if (getCurrentSemanticsNodes$ui_release().containsKey(semanticsNode2.getId()) && this.previousSemanticsNodes.containsKey(semanticsNode2.getId())) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(semanticsNode2.getId());
                if (semanticsNodeCopy2 == null) {
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                sendContentCaptureAppearEvents(semanticsNode2, semanticsNodeCopy2);
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
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = iArr[(i10 << 3) + i12];
                        if (!getCurrentSemanticsNodes$ui_release().containsKey(i13)) {
                            bufferContentCaptureViewDisappeared(i13);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i10, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(i10);
            if (autofillIdNewAutofillId != null) {
                contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, str);
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        InterfaceC9540l interfaceC9540l;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (AbstractC9979u.m20289b(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (interfaceC9540l = (InterfaceC9540l) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i10) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM32699toLegacyClassNameV4PA4sw;
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
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i10);
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
        if (role != null && (strM32699toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m32699toLegacyClassNameV4PA4sw(role.m32727unboximpl())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM32699toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(TextUnit.m33695getValueimpl(layoutInput.getStyle().m32997getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) (boundsInParent$ui_release.getRight() - boundsInParent$ui_release.getLeft()), (int) (boundsInParent$ui_release.getBottom() - boundsInParent$ui_release.getTop()));
        return viewStructureCompatNewVirtualViewStructure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int i10, SemanticsNode semanticsNode) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode, i10));
            fastForEachReplacedVisibleChildren(semanticsNode, new InterfaceC9544p() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateBuffersOnAppeared.1
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
                    return C10786q.f26013a;
                }

                public final void invoke(int i11, SemanticsNode semanticsNode2) {
                    AndroidContentCaptureManager.this.updateBuffersOnAppeared(i11, semanticsNode2);
                }
            });
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i10));
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
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r12 = (androidx.compose.p014ui.platform.SemanticsNodeWithAdjustedBounds) r12
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager.updateSemanticsCopy():void");
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        InterfaceC9540l interfaceC9540l;
        InterfaceC9540l interfaceC9540l2;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && AbstractC9979u.m20289b(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (interfaceC9540l2 = (InterfaceC9540l) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !AbstractC9979u.m20289b(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (interfaceC9540l = (InterfaceC9540l) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(vc.InterfaceC11588c<? super p309qc.C10786q> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r2 = r0.L$1
            ud.e r2 = (p365ud.InterfaceC11390e) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.AbstractC9924b.m20071b(r10)
        L33:
            r10 = r2
            r2 = r5
            goto L54
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            java.lang.Object r2 = r0.L$1
            ud.e r2 = (p365ud.InterfaceC11390e) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.AbstractC9924b.m20071b(r10)
            goto L65
        L4a:
            kotlin.AbstractC9924b.m20071b(r10)
            kotlinx.coroutines.channels.a r10 = r9.boundsUpdateChannel
            ud.e r10 = r10.iterator()
            r2 = r9
        L54:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r5 = r10.mo20669a(r0)
            if (r5 != r1) goto L61
            goto L94
        L61:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L95
            r2.next()
            boolean r10 = r5.isEnabled$ui_release()
            if (r10 == 0) goto L79
            r5.notifyContentCaptureChanges()
        L79:
            boolean r10 = r5.checkingForSemanticsChanges
            if (r10 != 0) goto L86
            r5.checkingForSemanticsChanges = r4
            android.os.Handler r10 = r5.handler
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker
            r10.post(r6)
        L86:
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r5
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m20376b(r6, r0)
            if (r10 != r1) goto L33
        L94:
            return r1
        L95:
            qc.q r10 = p309qc.C10786q.f26013a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui_release(vc.c):java.lang.Object");
    }

    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final Handler getHandler$ui_release() {
        return this.handler;
    }

    public final InterfaceC9529a getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui_release() {
        return ContentCaptureManager.Companion.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @RequiresApi(31)
    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.contentCaptureSession = (ContentCaptureSessionCompat) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    @RequiresApi(31)
    public final void onVirtualViewTranslationResponses$ui_release(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.currentSemanticsNodes = intObjectMap;
    }

    public final void setOnContentCaptureSession(InterfaceC9529a interfaceC9529a) {
        this.onContentCaptureSession = interfaceC9529a;
    }
}
