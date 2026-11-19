package com.zykj.mistake.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.utils.NoteDownloadUtils", m5303f = "NoteDownloadUtils.kt", m5304i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m5305l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 72}, m5306m = "uploadFile", m5307n = {"folder", "list", "imageList", "localPathPre", "remoteUrlPre", "uploadFunction", "$this$forEach$iv", "element$iv", "f", "$i$f$forEach", "$i$a$-forEach-NoteDownloadUtils$uploadFile$2", "folder", "list", "imageList", "localPathPre", "remoteUrlPre", "uploadFunction", "$this$forEach$iv", "element$iv", "f", "localPath", "localRelativePath", "remotePath", "$i$f$forEach", "$i$a$-forEach-NoteDownloadUtils$uploadFile$2"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$3"})
/* loaded from: classes3.dex */
final class NoteDownloadUtils$uploadFile$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5105j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDownloadUtils$uploadFile$1(C5105j c5105j, InterfaceC5631c<? super NoteDownloadUtils$uploadFile$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5105j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4473c(null, null, null, null, null, null, this);
    }
}
