package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1", m5303f = "MistakeDetailNotePanel.kt", m5304i = {0, 1, 1, 2, 2, 2, 2, 2, 2}, m5305l = {205, ComposerKt.referenceKey, 223}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "$this$awaitEachGesture", "down", "up", "startIndex", "lastX", "completed"}, m5308s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "F$0", "I$1"})
@SourceDebugExtension({"SMAP\nMistakeDetailNotePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNotePanel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,380:1\n360#2,7:381\n295#2,2:391\n1563#2:399\n1634#2,3:400\n65#3:388\n65#3:393\n65#3:396\n60#4:389\n60#4:394\n60#4:397\n22#5:390\n22#5:395\n22#5:398\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNotePanel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1\n*L\n216#1:381,7\n224#1:391,2\n247#1:399\n247#1:400,3\n220#1:388\n229#1:393\n230#1:396\n220#1:389\n229#1:394\n230#1:397\n220#1:390\n229#1:395\n230#1:398\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1 extends RestrictedSuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MutableState<Float> $dragOffsetX$delegate;
    final /* synthetic */ MutableState<String> $draggingKey$delegate;
    final /* synthetic */ C4771b5 $item;
    final /* synthetic */ float $itemStepPx;
    final /* synthetic */ InterfaceC6471c $onImageClick;
    final /* synthetic */ InterfaceC6471c $onReorder;
    final /* synthetic */ MutableState<List<C4771b5>> $orderedItems$delegate;
    final /* synthetic */ List<String> $pictureNotes;
    float F$0;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1(InterfaceC6471c interfaceC6471c, C4771b5 c4771b5, float f, List<String> list, InterfaceC6471c interfaceC6471c2, MutableState<String> mutableState, MutableState<List<C4771b5>> mutableState2, MutableState<Float> mutableState3, InterfaceC5631c<? super MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$onImageClick = interfaceC6471c;
        this.$item = c4771b5;
        this.$itemStepPx = f;
        this.$pictureNotes = list;
        this.$onReorder = interfaceC6471c2;
        this.$draggingKey$delegate = mutableState;
        this.$orderedItems$delegate = mutableState2;
        this.$dragOffsetX$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1 mistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1 = new MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1(this.$onImageClick, this.$item, this.$itemStepPx, this.$pictureNotes, this.$onReorder, this.$draggingKey$delegate, this.$orderedItems$delegate, this.$dragOffsetX$delegate, interfaceC5631c);
        mistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1.L$0 = obj;
        return mistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r2 == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r6 != r8) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0100 -> B:38:0x0103). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1.smali:350
    }
}
