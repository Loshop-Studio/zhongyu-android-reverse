.class public abstract Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.super Lcom/zykj/evaluation/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008;\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\'\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J1\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\r0\u0019H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\u0008 \u0010!J\'\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0008\u0002\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00120\"H&\u00a2\u0006\u0004\u0008$\u0010%J%\u0010\'\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00120\"H\u0016\u00a2\u0006\u0004\u0008\'\u0010%J%\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00120\"H\u0016\u00a2\u0006\u0004\u0008(\u0010%J!\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0008\u0008\u0002\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008-\u0010.J8\u00104\u001a\u00020\u00122\'\u0010&\u001a#\u0008\u0001\u0012\u0004\u0012\u000200\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)01\u0012\u0006\u0012\u0004\u0018\u0001020/\u00a2\u0006\u0002\u00083H\u0016\u00a2\u0006\u0004\u00084\u00105JQ\u0010:\u001a\u00020\u00122B\u0010&\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\r\u00a2\u0006\u000c\u00086\u0012\u0008\u00087\u0012\u0004\u0008\u0008(8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\r\u00a2\u0006\u000c\u00086\u0012\u0008\u00087\u0012\u0004\u0008\u0008(9\u0012\u0004\u0012\u00020\u00120/\u00a2\u0006\u0004\u0008:\u00105J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020+\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020+\u00a2\u0006\u0004\u0008?\u0010=J+\u0010A\u001a\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120@\u00a2\u0006\u0004\u0008A\u0010BJ1\u0010D\u001a\u00020\u00122\u0008\u0010C\u001a\u0004\u0018\u00010\t2\u0018\u0010&\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\r\u0012\u0004\u0012\u00020\u00120@\u00a2\u0006\u0004\u0008D\u0010BJ \u0010E\u001a\u00020\u00122\u000e\u0008\u0002\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00120\"H\u0084@\u00a2\u0006\u0004\u0008E\u0010FJ\u0010\u0010G\u001a\u00020\u0012H\u0084@\u00a2\u0006\u0004\u0008G\u0010HJ\r\u0010I\u001a\u00020\u0012\u00a2\u0006\u0004\u0008I\u0010JJ\r\u0010K\u001a\u00020\u0012\u00a2\u0006\u0004\u0008K\u0010JJ\r\u0010L\u001a\u00020\u0012\u00a2\u0006\u0004\u0008L\u0010JJ\u0018\u0010N\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u000eH\u0084@\u00a2\u0006\u0004\u0008N\u0010OJ\u0010\u0010P\u001a\u00020\u0012H\u0084@\u00a2\u0006\u0004\u0008P\u0010HJ&\u0010S\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020\u001a2\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\rH\u0084@\u00a2\u0006\u0004\u0008S\u0010TJ)\u0010Y\u001a\u00020X2\u0006\u0010U\u001a\u00020\u00102\u0006\u0010V\u001a\u00020+2\u0008\u0010W\u001a\u0004\u0018\u00010+H\u0004\u00a2\u0006\u0004\u0008Y\u0010ZJ!\u0010]\u001a\u00020X2\u0006\u0010[\u001a\u00020\u00102\u0008\u0008\u0002\u0010\\\u001a\u00020+H\u0004\u00a2\u0006\u0004\u0008]\u0010^R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR+\u0010k\u001a\u00020c2\u0006\u0010d\u001a\u00020c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR+\u0010o\u001a\u00020c2\u0006\u0010d\u001a\u00020c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008l\u0010f\u001a\u0004\u0008m\u0010h\"\u0004\u0008n\u0010jR+\u0010u\u001a\u00020\u001a2\u0006\u0010d\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008p\u0010f\u001a\u0004\u0008q\u0010r\"\u0004\u0008s\u0010tR+\u0010y\u001a\u00020c2\u0006\u0010d\u001a\u00020c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008v\u0010f\u001a\u0004\u0008w\u0010h\"\u0004\u0008x\u0010jR+\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008z\u0010{\u001a\u0004\u0008|\u0010}\"\u0004\u0008~\u0010\u007fR)\u0010\u0087\u0001\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001\"\u0006\u0008\u0085\u0001\u0010\u0086\u0001R0\u0010\u008c\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u0088\u0001\u0010f\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001\"\u0005\u0008\u008b\u0001\u0010=R0\u0010\u0090\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u008d\u0001\u0010f\u001a\u0006\u0008\u008e\u0001\u0010\u008a\u0001\"\u0005\u0008\u008f\u0001\u0010=R\'\u0010\u0095\u0001\u001a\u00020\u001a8\u0004@\u0004X\u0084.\u00a2\u0006\u0016\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001\u001a\u0005\u0008\u0093\u0001\u0010r\"\u0005\u0008\u0094\u0001\u0010tR0\u0010\u0099\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u0096\u0001\u0010f\u001a\u0006\u0008\u0097\u0001\u0010\u008a\u0001\"\u0005\u0008\u0098\u0001\u0010=R/\u0010\u009b\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002\u00a2\u0006\u0015\n\u0004\u0008K\u0010f\u001a\u0006\u0008\u0082\u0001\u0010\u008a\u0001\"\u0005\u0008\u009a\u0001\u0010=R0\u0010\u009e\u0001\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00108D@DX\u0084\u008e\u0002\u00a2\u0006\u0016\n\u0004\u0008E\u0010f\u001a\u0006\u0008\u009c\u0001\u0010\u0084\u0001\"\u0006\u0008\u009d\u0001\u0010\u0086\u0001R3\u0010\u00a6\u0001\u001a\u00030\u009f\u00012\u0008\u0010\u00a0\u0001\u001a\u00030\u009f\u00018\u0006@DX\u0086.\u00a2\u0006\u0017\n\u0005\u0008G\u0010\u00a1\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\"\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R3\u0010\u00ad\u0001\u001a\u00030\u00a7\u00012\u0007\u0010d\u001a\u00030\u00a7\u00018F@DX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008(\u0010\u00a8\u0001\u001a\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\"\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R3\u0010\u00b3\u0001\u001a\u00030\u00ae\u00012\u0007\u0010d\u001a\u00030\u00ae\u00018F@DX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008$\u0010\u00a8\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001\"\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R0\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\r0\u00b4\u00018\u0004X\u0084\u0004\u00a2\u0006\u000f\n\u0005\u0008 \u0010\u00b5\u0001\u001a\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R\u0017\u0010\u00b9\u0001\u001a\u00020+8DX\u0084\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b8\u0001\u0010\u008a\u0001R\u0013\u0010\u00bb\u0001\u001a\u00020c8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00ba\u0001\u0010hR\u0014\u0010\u00bd\u0001\u001a\u00020+8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00bc\u0001\u0010\u008a\u0001R\u0013\u0010\u00bf\u0001\u001a\u00020c8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00be\u0001\u0010hR\u0014\u0010\u00c1\u0001\u001a\u00020+8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00c0\u0001\u0010\u008a\u0001R\u0014\u0010\u00c3\u0001\u001a\u00020+8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00c2\u0001\u0010\u008a\u0001R\u0014\u0010\u00c5\u0001\u001a\u00020+8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00c4\u0001\u0010\u008a\u0001\u00a8\u0006\u00c6\u0001"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;",
        "Lcom/zykj/evaluation/base/BaseViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lp5/j;",
        "service",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "v",
        "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;",
        "",
        "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
        "questionList",
        "",
        "index",
        "",
        "y0",
        "(Ljava/util/List;I)V",
        "Lcom/zykj/evaluation/bean/TaskDetailInfo;",
        "taskDetailInfo",
        "v0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V",
        "",
        "",
        "localAnswerMap",
        "w0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V",
        "Lf6/j;",
        "draftFunctions",
        "t",
        "(Lf6/j;)V",
        "Lkotlin/Function0;",
        "lastCallback",
        "s",
        "(Lf6/j;Lkotlin/jvm/functions/Function0;)V",
        "callback",
        "u",
        "r",
        "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
        "detailBundle",
        "",
        "isSpecial",
        "U",
        "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V",
        "Lkotlin/Function2;",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "V",
        "(Lkotlin/jvm/functions/Function2;)V",
        "Lkotlin/ParameterName;",
        "name",
        "noSubmitStudentList",
        "noCorrectStudentList",
        "c0",
        "isAskForHelp",
        "g0",
        "(Z)V",
        "showRightMask",
        "u0",
        "Lkotlin/Function1;",
        "f0",
        "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V",
        "stemBitmap",
        "e0",
        "p",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "q",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "b0",
        "()V",
        "o",
        "d0",
        "guideQuestion",
        "R",
        "(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "B",
        "uuid",
        "answers",
        "x0",
        "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "result",
        "isSummary",
        "isHalfScore",
        "Lcom/zykj/evaluation/ui/detail/f;",
        "y",
        "(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;",
        "answerResult",
        "revisingAnswered",
        "S",
        "(IZ)Lcom/zykj/evaluation/ui/detail/f;",
        "c",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "d",
        "Lp5/j;",
        "",
        "<set-?>",
        "e",
        "Lkotlin/properties/ReadWriteProperty;",
        "N",
        "()J",
        "s0",
        "(J)V",
        "mTaskId",
        "f",
        "G",
        "m0",
        "mExamId",
        "g",
        "H",
        "()Ljava/lang/String;",
        "n0",
        "(Ljava/lang/String;)V",
        "mExamName",
        "h",
        "O",
        "t0",
        "mTopicId",
        "i",
        "Ljava/util/List;",
        "L",
        "()Ljava/util/List;",
        "setMQuestionList",
        "(Ljava/util/List;)V",
        "mQuestionList",
        "j",
        "I",
        "E",
        "()I",
        "setMCurrentIndex",
        "(I)V",
        "mCurrentIndex",
        "k",
        "C",
        "()Z",
        "j0",
        "mCanShowAnswer",
        "l",
        "D",
        "k0",
        "mCanShowMicroClass",
        "m",
        "Ljava/lang/String;",
        "F",
        "l0",
        "mExamDescription",
        "n",
        "J",
        "p0",
        "mIsNoStem",
        "o0",
        "mIsEnableScore",
        "M",
        "r0",
        "mSpecificTrainingType",
        "Lg7/e;",
        "value",
        "Lg7/e;",
        "K",
        "()Lg7/e;",
        "q0",
        "(Lg7/e;)V",
        "mPathManager",
        "Lcom/zykj/evaluation/ui/detail/b;",
        "Landroidx/compose/runtime/MutableState;",
        "w",
        "()Lcom/zykj/evaluation/ui/detail/b;",
        "h0",
        "(Lcom/zykj/evaluation/ui/detail/b;)V",
        "detailCommonState",
        "Lw5/e;",
        "x",
        "()Lw5/e;",
        "i0",
        "(Lw5/e;)V",
        "detailQuestionState",
        "Landroidx/collection/ArrayMap;",
        "Landroidx/collection/ArrayMap;",
        "A",
        "()Landroidx/collection/ArrayMap;",
        "P",
        "needRevise",
        "Q",
        "questionId",
        "a0",
        "isRelatedGroup",
        "z",
        "groupId",
        "Y",
        "isInitialized",
        "X",
        "isCompositionQuestion",
        "Z",
        "isNoStemAndObjective",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/BaseDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,684:1\n27#2:685\n85#3:686\n113#3,2:687\n85#3:689\n113#3,2:690\n1761#4,3:692\n12824#5,3:695\n*S KotlinDebug\n*F\n+ 1 BaseDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/BaseDetailViewModel\n*L\n214#1:685\n206#1:686\n206#1:687,2\n210#1:689\n210#1:690,2\n238#1:692,3\n402#1:695,3\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic u:[Lkotlin/reflect/KProperty;

.field public static final v:I


# instance fields
.field public final c:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final d:Lp5/j;

.field public final e:Lkotlin/properties/ReadWriteProperty;

.field public final f:Lkotlin/properties/ReadWriteProperty;

.field public final g:Lkotlin/properties/ReadWriteProperty;

.field public final h:Lkotlin/properties/ReadWriteProperty;

.field public i:Ljava/util/List;

.field public j:I

.field public final k:Lkotlin/properties/ReadWriteProperty;

.field public final l:Lkotlin/properties/ReadWriteProperty;

.field public m:Ljava/lang/String;

.field public final n:Lkotlin/properties/ReadWriteProperty;

.field public final o:Lkotlin/properties/ReadWriteProperty;

.field public final p:Lkotlin/properties/ReadWriteProperty;

.field public q:Lg7/e;

.field public final r:Landroidx/compose/runtime/MutableState;

.field public final s:Landroidx/compose/runtime/MutableState;

.field public final t:Landroidx/collection/ArrayMap;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    const-string v2, "mTaskId"

    const-string v3, "getMTaskId()J"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v3, "mExamId"

    const-string v5, "getMExamId()J"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v5, "mExamName"

    const-string v6, "getMExamName()Ljava/lang/String;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v6, "mTopicId"

    const-string v7, "getMTopicId()J"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v7, "mCanShowAnswer"

    const-string v8, "getMCanShowAnswer()Z"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v8, "mCanShowMicroClass"

    const-string v9, "getMCanShowMicroClass()Z"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v9, "mIsNoStem"

    const-string v10, "getMIsNoStem()Z"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v10, "mIsEnableScore"

    const-string v11, "getMIsEnableScore()Z"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v11, "mSpecificTrainingType"

    const-string v12, "getMSpecificTrainingType()I"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v10, 0x9

    new-array v10, v10, [Lkotlin/reflect/KProperty;

    aput-object v0, v10, v4

    const/4 v0, 0x1

    aput-object v2, v10, v0

    const/4 v0, 0x2

    aput-object v3, v10, v0

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v6, v10, v0

    const/4 v0, 0x5

    aput-object v7, v10, v0

    const/4 v0, 0x6

    aput-object v8, v10, v0

    const/4 v0, 0x7

    aput-object v9, v10, v0

    const/16 v0, 0x8

    aput-object v1, v10, v0

    sput-object v10, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    sput v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->v:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "userInfo"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "service"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/zykj/evaluation/base/BaseViewModel;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 21
    .line 22
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->d:Lp5/j;

    .line 23
    .line 24
    sget-object v1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 25
    .line 26
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 31
    .line 32
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->f:Lkotlin/properties/ReadWriteProperty;

    .line 37
    .line 38
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 43
    .line 44
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 49
    .line 50
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->k:Lkotlin/properties/ReadWriteProperty;

    .line 55
    .line 56
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->l:Lkotlin/properties/ReadWriteProperty;

    .line 61
    .line 62
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->n:Lkotlin/properties/ReadWriteProperty;

    .line 67
    .line 68
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->o:Lkotlin/properties/ReadWriteProperty;

    .line 73
    .line 74
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->p:Lkotlin/properties/ReadWriteProperty;

    .line 79
    .line 80
    new-instance v2, Lcom/zykj/evaluation/ui/detail/b;

    .line 81
    .line 82
    const v24, 0xfffff

    .line 83
    .line 84
    .line 85
    const/16 v25, 0x0

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v14, 0x0

    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const/16 v18, 0x0

    .line 105
    .line 106
    const/16 v19, 0x0

    .line 107
    .line 108
    const/16 v20, 0x0

    .line 109
    .line 110
    const-wide/16 v21, 0x0

    .line 111
    .line 112
    const/16 v23, 0x0

    .line 113
    .line 114
    invoke-direct/range {v2 .. v25}, Lcom/zykj/evaluation/ui/detail/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    const/4 v3, 0x2

    .line 119
    invoke-static {v2, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->r:Landroidx/compose/runtime/MutableState;

    .line 124
    .line 125
    new-instance v4, Lw5/e;

    .line 126
    .line 127
    const/16 v17, 0xfff

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-direct/range {v4 .. v18}, Lw5/e;-><init>(Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v4, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->s:Landroidx/compose/runtime/MutableState;

    .line 143
    .line 144
    new-instance v1, Landroidx/collection/ArrayMap;

    .line 145
    .line 146
    invoke-direct {v1}, Landroidx/collection/ArrayMap;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->t:Landroidx/collection/ArrayMap;

    .line 150
    .line 151
    return-void
.end method

.method public static synthetic T(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;IZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/f;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->S(IZ)Lcom/zykj/evaluation/ui/detail/f;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: getReviseResult"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic W(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/bean/bundle/DetailBundle;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: initData"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static final synthetic m(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->v(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)Lp5/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->d:Lp5/j;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()Landroidx/collection/ArrayMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->t:Landroidx/collection/ArrayMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getLocalAnswerMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getLocalAnswerMap$2;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1
.end method

.method public final C()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->k:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final D()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->l:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final E()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final F()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mExamDescription"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final G()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->f:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final H()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final I()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->o:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final J()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->n:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final K()Lg7/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->q:Lg7/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mPathManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->p:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final N()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final O()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final P()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 7
    .line 8
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getNeedRevise()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    return v1
.end method

.method public final Q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getQuestionId()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0

    .line 20
    :cond_0
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    return-wide v0
.end method

.method public final R(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->d:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->d:I

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p1, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object p1, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_5

    .line 75
    .line 76
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->d:Lp5/j;

    .line 77
    .line 78
    move p2, v3

    .line 79
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->G()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getGroupId()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput p2, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->d:I

    .line 94
    .line 95
    invoke-interface/range {v1 .. v6}, Lp5/j;->l(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    if-ne p2, v0, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    :goto_2
    check-cast p2, Lcom/zykj/http/bean/ApiResp;

    .line 103
    .line 104
    invoke-static {p2}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Ljava/util/List;

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->d:Lp5/j;

    .line 112
    .line 113
    move p2, v2

    .line 114
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->G()J

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getQuestionId()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->a:Ljava/lang/Object;

    .line 127
    .line 128
    iput p2, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$getQuestionInfo$1;->d:I

    .line 129
    .line 130
    invoke-interface/range {v1 .. v6}, Lp5/j;->r(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-ne p2, v0, :cond_6

    .line 135
    .line 136
    :goto_3
    return-object v0

    .line 137
    :cond_6
    :goto_4
    check-cast p2, Lcom/zykj/http/bean/ApiResp;

    .line 138
    .line 139
    invoke-static {p2}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 144
    .line 145
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :goto_5
    invoke-static {p1}, Lw5/h;->b(Ljava/util/List;)Lcom/zykj/evaluation/bean/TaskDetailInfo;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->v0(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V

    .line 154
    .line 155
    .line 156
    iget-object p2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->t:Landroidx/collection/ArrayMap;

    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V

    .line 159
    .line 160
    .line 161
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p1
.end method

.method public final S(IZ)Lcom/zykj/evaluation/ui/detail/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->NO_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p2, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-ne p1, p2, :cond_1

    .line 25
    .line 26
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 33
    .line 34
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    .line 38
    .line 39
    return-object p1
.end method

.method public U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "detailBundle"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getTaskId()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    invoke-virtual {v0, v3, v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->s0(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getExamId()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-virtual {v0, v3, v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->m0(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getExamName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->n0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getTopicId()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-virtual {v0, v3, v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->t0(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getQuestionList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getCurrentIndex()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->p0(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->o0(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getCanShowAnswer()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j0(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getCanShowMicroClass()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->k0(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getExamDescription()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->l0(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getSpecificTrainingType()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->r0(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->F()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    xor-int/lit8 v19, p2, 0x1

    .line 105
    .line 106
    const v25, 0xf7fe7

    .line 107
    .line 108
    .line 109
    const/16 v26, 0x0

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    const/4 v5, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    const/4 v13, 0x0

    .line 119
    const/4 v14, 0x0

    .line 120
    const/4 v15, 0x0

    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const-wide/16 v22, 0x0

    .line 132
    .line 133
    const/16 v24, 0x0

    .line 134
    .line 135
    invoke-static/range {v3 .. v26}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->getQuestionList()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 147
    .line 148
    invoke-virtual {v0, v1, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y0(Ljava/util/List;I)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public V(Lkotlin/jvm/functions/Function2;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$initData$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1f

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final X()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/zykj/evaluation/bean/SpecificTrainingType$CompositionTraining;->INSTANCE:Lcom/zykj/evaluation/bean/SpecificTrainingType$CompositionTraining;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/SpecificTrainingType;->getType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final Y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final Z()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lw5/e;->d()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/zykj/evaluation/ui/detail/c;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Li6/p0;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    return v0

    .line 52
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 53
    return v0
.end method

.method public final a0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 7
    .line 8
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->isRelatedGroup()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    return v1
.end method

.method public final b0()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 7
    .line 8
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    new-instance v8, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$refreshData$1;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v8, p0, v0, v1, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$refreshData$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Ljava/util/List;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)V

    .line 21
    .line 22
    .line 23
    const/16 v9, 0x1f

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    move-object v2, p0

    .line 32
    invoke-static/range {v2 .. v10}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final c0(Lkotlin/jvm/functions/Function2;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$refreshSubmitProgress$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$refreshSubmitProgress$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1f

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final d0()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e0(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapListToAsk$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p1, p0, p2, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapListToAsk$1;-><init>(Landroid/graphics/Bitmap;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1f

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final f0(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance v7, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    const/16 v8, 0x1f

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v1, p0

    .line 23
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p1, ""

    .line 28
    .line 29
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final g0(Z)V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, p1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final h0(Lcom/zykj/evaluation/ui/detail/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->r:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i0(Lw5/e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->s:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final j0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->k:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final k0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->l:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final l0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->m:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final m0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->f:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final n0(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final o()V
    .locals 25

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    sget-object v14, Lcom/zykj/evaluation/ui/detail/d$b;->c:Lcom/zykj/evaluation/ui/detail/d$b;

    .line 6
    .line 7
    const v23, 0xfefff

    .line 8
    .line 9
    .line 10
    const/16 v24, 0x0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v15, 0x0

    .line 25
    const/16 v16, 0x0

    .line 26
    .line 27
    const/16 v17, 0x0

    .line 28
    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const-wide/16 v20, 0x0

    .line 34
    .line 35
    const/16 v22, 0x0

    .line 36
    .line 37
    invoke-static/range {v1 .. v24}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object/from16 v1, p0

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final o0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->o:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/lit8 v2, v2, -0x1

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    iget p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    iput p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y0(Ljava/util/List;I)V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 28
    .line 29
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->R(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-ne p1, p2, :cond_1

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p1
.end method

.method public final p0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->n:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 9
    .line 10
    if-lez v1, :cond_2

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iput v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y0(Ljava/util/List;I)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->R(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-ne p1, v0, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p1
.end method

.method public final q0(Lg7/e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->q:Lg7/e;

    .line 7
    .line 8
    return-void
.end method

.method public r(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "callback"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final r0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->p:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public abstract s(Lf6/j;Lkotlin/jvm/functions/Function0;)V
.end method

.method public final s0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public abstract t(Lf6/j;)V
.end method

.method public final t0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->u:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public u(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const-string v0, "draftFunctions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final u0(Z)V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setRightMaskVisible$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, p1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setRightMaskVisible$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final v(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v8

    .line 5
    new-array v1, v8, [I

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    div-int/lit8 v0, v0, 0x4

    .line 12
    .line 13
    const/16 v2, 0x190

    .line 14
    .line 15
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 21
    .line 22
    .line 23
    move-result v9

    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    div-int/lit16 v0, v0, 0x1f4

    .line 29
    .line 30
    const/4 v10, 0x2

    .line 31
    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    const/4 v12, -0x1

    .line 36
    const/4 v13, 0x0

    .line 37
    move v14, v12

    .line 38
    move v5, v13

    .line 39
    move v15, v5

    .line 40
    :goto_0
    if-ge v5, v9, :cond_6

    .line 41
    .line 42
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/4 v7, 0x1

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    move-object/from16 v0, p1

    .line 54
    .line 55
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 56
    .line 57
    .line 58
    move v2, v13

    .line 59
    move v3, v2

    .line 60
    :goto_1
    if-ge v2, v8, :cond_2

    .line 61
    .line 62
    aget v4, v1, v2

    .line 63
    .line 64
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-lez v6, :cond_1

    .line 69
    .line 70
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/16 v7, 0xfa

    .line 75
    .line 76
    if-lt v6, v7, :cond_0

    .line 77
    .line 78
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-lt v6, v7, :cond_0

    .line 83
    .line 84
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-ge v4, v7, :cond_1

    .line 89
    .line 90
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    if-lt v3, v11, :cond_4

    .line 96
    .line 97
    if-nez v15, :cond_3

    .line 98
    .line 99
    move v14, v5

    .line 100
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 101
    .line 102
    if-lt v15, v10, :cond_5

    .line 103
    .line 104
    move v12, v14

    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move v14, v12

    .line 107
    move v15, v13

    .line 108
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_6
    move-object/from16 v0, p1

    .line 112
    .line 113
    :goto_2
    if-gez v12, :cond_7

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    div-int/lit8 v1, v1, 0x64

    .line 121
    .line 122
    const/16 v2, 0x8

    .line 123
    .line 124
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    sub-int/2addr v12, v1

    .line 129
    invoke-static {v12, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_8

    .line 134
    .line 135
    :goto_3
    return-object v0

    .line 136
    :cond_8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    sub-int/2addr v3, v1

    .line 145
    invoke-static {v0, v13, v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-object v0
.end method

.method public abstract v0(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V
.end method

.method public final w()Lcom/zykj/evaluation/ui/detail/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->r:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/evaluation/ui/detail/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public abstract w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V
.end method

.method public final x()Lw5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->s:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw5/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x0(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$updateLocalAnswerMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$updateLocalAnswerMap$2;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1
.end method

.method public final y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->NO_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne p1, v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$b;->b:Lcom/zykj/evaluation/ui/detail/f$b;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eq p1, v0, :cond_4

    .line 39
    .line 40
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_5

    .line 57
    .line 58
    if-eqz p2, :cond_5

    .line 59
    .line 60
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$b;->b:Lcom/zykj/evaluation/ui/detail/f$b;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_5
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    .line 72
    .line 73
    return-object p1
.end method

.method public abstract y0(Ljava/util/List;I)V
.end method

.method public final z()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->j:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getGroupId()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0

    .line 20
    :cond_0
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    return-wide v0
.end method
