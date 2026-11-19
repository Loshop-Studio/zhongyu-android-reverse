# RE note 本类字节码直接引用的读写或显示接口包括JSON、位图。
.class public Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;
.super Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0017\u0018\u00002\u00020\u0001B?\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008&\u0010\"J\u0017\u0010\'\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\'\u0010\"J\u0010\u0010(\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008(\u0010%J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008+\u0010,J.\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u0002000/2\u0006\u00102\u001a\u00020-H\u0082@\u00a2\u0006\u0004\u00084\u00105J.\u00106\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u0002000/2\u0006\u00102\u001a\u00020-H\u0082@\u00a2\u0006\u0004\u00086\u00105J\u001d\u0010:\u001a\u0008\u0012\u0004\u0012\u0002090/2\u0006\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\u0008:\u0010;JE\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00140A2\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u0002090/2\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u0002090/2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020?0>H\u0002\u00a2\u0006\u0004\u0008B\u0010CJH\u0010G\u001a\u0008\u0012\u0004\u0012\u00020F0/2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00140A2\u0006\u0010E\u001a\u00020\u001f2\u0006\u00108\u001a\u0002072\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020?0>H\u0082@\u00a2\u0006\u0004\u0008G\u0010HJ+\u0010L\u001a\u0008\u0012\u0004\u0012\u00020K0/2\u0014\u0008\u0002\u0010J\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020F0/0IH\u0002\u00a2\u0006\u0004\u0008L\u0010MJ,\u0010P\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00142\u0012\u0010O\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00140I\"\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008P\u0010QJ\u0012\u0010S\u001a\u0004\u0018\u00010RH\u0082@\u00a2\u0006\u0004\u0008S\u0010%J\u0017\u0010V\u001a\u0002032\u0006\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008V\u0010WJ\u0010\u0010X\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008X\u0010%J\u0017\u0010Z\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u001fH\u0014\u00a2\u0006\u0004\u0008Z\u0010\"J%\u0010_\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[2\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u00110]H\u0016\u00a2\u0006\u0004\u0008_\u0010`J+\u0010b\u001a\u00020\u00112\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u00110]2\u000c\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u00110]H\u0016\u00a2\u0006\u0004\u0008b\u0010cJ\u001b\u0010d\u001a\u00020\u00112\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u00110]\u00a2\u0006\u0004\u0008d\u0010eJ\u001b\u0010f\u001a\u00020\u00112\u000c\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u00110]\u00a2\u0006\u0004\u0008f\u0010eJ\u001b\u0010i\u001a\u00020\u00112\u000c\u0010h\u001a\u0008\u0012\u0004\u0012\u00020g0/\u00a2\u0006\u0004\u0008i\u0010jJ\u001d\u0010l\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020\u001f\u00a2\u0006\u0004\u0008l\u0010mJ\u001d\u0010o\u001a\u00020\u00112\u000e\u0008\u0002\u0010n\u001a\u0008\u0012\u0004\u0012\u00020g0/\u00a2\u0006\u0004\u0008o\u0010jJ\u0010\u0010p\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\u0008p\u0010%J\r\u0010q\u001a\u000203\u00a2\u0006\u0004\u0008q\u0010rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010tR\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R1\u0010\u0085\u0001\u001a\u00020}2\u0006\u0010~\u001a\u00020}8F@FX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u007f\u0010\u0080\u0001\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\"\u0006\u0008\u0083\u0001\u0010\u0084\u0001R1\u0010\u008b\u0001\u001a\u00020\u001f2\u0006\u0010~\u001a\u00020\u001f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u001a\u0006\u0008\u0088\u0001\u0010\u0089\u0001\"\u0005\u0008\u008a\u0001\u0010\"R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R1\u0010\u009a\u0001\u001a\u0002032\u0006\u0010~\u001a\u0002038B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0006\u0008\u0096\u0001\u0010\u0087\u0001\u001a\u0005\u0008\u0097\u0001\u0010r\"\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009d\u0001\u001a\u00020R8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001R\u001f\u0010\u00a0\u0001\u001a\u0008\u0012\u0004\u0012\u0002070I8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001R%\u0010\u00a3\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002090/0I8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R$\u0010\u00a4\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020F0/0I8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008_\u0010\u00a2\u0001R$\u0010\u00a8\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030\u00a6\u00010\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008V\u0010\u00a7\u0001R\u0019\u0010\u00ab\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R\u0019\u0010\u00ad\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ac\u0001\u0010\u00aa\u0001R\u001a\u0010\u00b1\u0001\u001a\u0005\u0018\u00010\u00ae\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R\u0017\u0010\u00b4\u0001\u001a\u0002078BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\u00a8\u0006\u00b5\u0001"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;",
        "Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;",
        "Lp5/j;",
        "service",
        "Lp5/k;",
        "configService",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Lp5/j;Lp5/k;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V",
        "",
        "D0",
        "()V",
        "",
        "address",
        "",
        "testPaperId",
        "W0",
        "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/evaluation/bean/PaperConfig;",
        "config",
        "T0",
        "(Lcom/zykj/evaluation/bean/PaperConfig;)V",
        "Y0",
        "",
        "pageSize",
        "S0",
        "(I)V",
        "V0",
        "Z0",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "E0",
        "X0",
        "i1",
        "questionIndex",
        "newAnswer",
        "f1",
        "(ILjava/lang/String;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "Landroid/graphics/Point;",
        "points",
        "previewBitmap",
        "",
        "F0",
        "(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "P0",
        "Lx6/j;",
        "pageQuestionAnswerData",
        "Le7/b;",
        "B0",
        "(Lx6/j;)Ljava/util/List;",
        "oldCorrectList",
        "newCorrectList",
        "",
        "Lx6/a;",
        "answerInfoMap",
        "",
        "y0",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljava/util/Set;",
        "changedIdSet",
        "pageIndex",
        "Lx6/k;",
        "O0",
        "(Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "questionAnswerArray",
        "Lcom/zykj/evaluation/bean/CommitTaskAnswer;",
        "z0",
        "([Ljava/util/List;)Ljava/util/List;",
        "resultPath",
        "pathArray",
        "b1",
        "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "N0",
        "Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;",
        "answerSheetBundle",
        "H",
        "(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z",
        "s",
        "index",
        "q",
        "Lb7/c1;",
        "result",
        "Lkotlin/Function0;",
        "callback",
        "G",
        "(Lb7/c1;Lkotlin/jvm/functions/Function0;)V",
        "failedCallback",
        "r",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "R0",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Q0",
        "Lx6/d;",
        "newList",
        "U0",
        "(Ljava/util/List;)V",
        "optionIndex",
        "G0",
        "(II)V",
        "correctQuestionList",
        "g1",
        "H0",
        "C0",
        "()Z",
        "Lp5/j;",
        "Lp5/k;",
        "t",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "u",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "v",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "w",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "Lx6/b;",
        "<set-?>",
        "x",
        "Landroidx/compose/runtime/MutableState;",
        "J0",
        "()Lx6/b;",
        "c1",
        "(Lx6/b;)V",
        "correctDataState",
        "y",
        "Lkotlin/properties/ReadWriteProperty;",
        "M0",
        "()I",
        "e1",
        "serialNum",
        "z",
        "Lcom/zykj/evaluation/bean/PaperConfig;",
        "paperConfig",
        "Lorg/json/JSONObject;",
        "A",
        "Lorg/json/JSONObject;",
        "paperConfigJson",
        "B",
        "Ljava/lang/String;",
        "paperConfigString",
        "C",
        "a1",
        "d1",
        "(Z)V",
        "isNewConfig",
        "D",
        "[B",
        "tfLiteBuffer",
        "E",
        "[Lx6/j;",
        "pageAnswerData",
        "F",
        "[Ljava/util/List;",
        "answerInfoArray",
        "pageAnswerArray",
        "",
        "Lx6/m;",
        "Ljava/util/Map;",
        "uploadAnswerMap",
        "I",
        "Z",
        "hasOldData",
        "J",
        "isRetakePhoto",
        "Lcom/zykj/evaluation/bean/PaperPage;",
        "L0",
        "()Lcom/zykj/evaluation/bean/PaperPage;",
        "currentPageConfig",
        "K0",
        "()Lx6/j;",
        "currentPageAnswerData",
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
        "SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1441:1\n85#2:1442\n113#2,2:1443\n1878#3,2:1445\n1878#3,2:1447\n1869#3,2:1449\n1869#3,2:1451\n1880#3:1453\n1880#3:1454\n1869#3:1461\n1869#3,2:1462\n1870#3:1464\n1193#3,2:1466\n1267#3,4:1468\n1869#3:1474\n1869#3:1475\n295#3,2:1476\n295#3,2:1478\n1870#3:1487\n1870#3:1488\n1563#3:1508\n1634#3,3:1509\n1869#3:1512\n1740#3,3:1513\n1563#3:1516\n1634#3,3:1517\n1870#3:1524\n1869#3:1525\n1869#3,2:1526\n1761#3,3:1528\n1870#3:1531\n774#3:1532\n865#3,2:1533\n1563#3:1535\n1634#3,3:1536\n1869#3,2:1539\n1573#3:1541\n1604#3,3:1542\n1563#3:1545\n1634#3,3:1546\n1607#3:1549\n1563#3:1550\n1634#3,2:1551\n774#3:1553\n865#3,2:1554\n1563#3:1556\n1634#3,2:1557\n295#3,2:1559\n1869#3,2:1561\n1636#3:1563\n1636#3:1564\n1563#3:1566\n1634#3,3:1567\n1869#3:1570\n1869#3,2:1571\n1869#3,2:1573\n1869#3,2:1575\n1870#3:1577\n1374#3:1578\n1460#3,5:1579\n1208#3,2:1584\n1236#3,4:1586\n1869#3:1590\n1869#3:1591\n295#3,2:1592\n1870#3:1594\n1870#3:1595\n1878#3,2:1596\n1878#3,3:1598\n1880#3:1601\n1869#3:1602\n1869#3:1603\n1870#3:1608\n1870#3:1609\n1869#3:1611\n295#3,2:1612\n1869#3:1614\n295#3,2:1615\n1870#3:1617\n1870#3:1618\n1491#3:1622\n1516#3,3:1623\n1519#3,3:1633\n1761#3,3:1637\n37#4:1455\n36#4,3:1456\n37#4:1520\n36#4,3:1521\n13537#5,2:1459\n13539#5:1465\n13537#5,2:1472\n13539#5:1489\n1790#5,6:1490\n1682#5,6:1496\n1790#5,6:1502\n11308#5:1604\n11643#5,3:1605\n13472#5:1610\n13473#5:1619\n13537#5,2:1620\n13539#5:1641\n382#6,7:1480\n382#6,7:1626\n1#7:1565\n216#8:1636\n217#8:1640\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel\n*L\n154#1:1442\n154#1:1443,2\n305#1:1445,2\n310#1:1447,2\n320#1:1449,2\n339#1:1451,2\n310#1:1453\n305#1:1454\n451#1:1461\n457#1:1462,2\n451#1:1464\n489#1:1466,2\n489#1:1468,4\n494#1:1474\n495#1:1475\n499#1:1476,2\n501#1:1478,2\n495#1:1487\n494#1:1488\n576#1:1508\n576#1:1509,3\n655#1:1512\n659#1:1513,3\n667#1:1516\n667#1:1517,3\n655#1:1524\n700#1:1525\n701#1:1526,2\n706#1:1528,3\n700#1:1531\n864#1:1532\n864#1:1533,2\n867#1:1535\n867#1:1536,3\n872#1:1539,2\n894#1:1541\n894#1:1542,3\n897#1:1545\n897#1:1546,3\n894#1:1549\n924#1:1550\n924#1:1551,2\n925#1:1553\n925#1:1554,2\n928#1:1556\n928#1:1557,2\n929#1:1559,2\n932#1:1561,2\n928#1:1563\n924#1:1564\n1047#1:1566\n1047#1:1567,3\n1076#1:1570\n1080#1:1571,2\n1094#1:1573,2\n1105#1:1575,2\n1076#1:1577\n1139#1:1578\n1139#1:1579,5\n1139#1:1584,2\n1139#1:1586,4\n1185#1:1590\n1186#1:1591\n1190#1:1592,2\n1186#1:1594\n1185#1:1595\n1218#1:1596,2\n1221#1:1598,3\n1218#1:1601\n1271#1:1602\n1275#1:1603\n1275#1:1608\n1271#1:1609\n1341#1:1611\n1343#1:1612,2\n1353#1:1614\n1355#1:1615,2\n1353#1:1617\n1341#1:1618\n1423#1:1622\n1423#1:1623,3\n1423#1:1633,3\n1429#1:1637,3\n392#1:1455\n392#1:1456,3\n667#1:1520\n667#1:1521,3\n450#1:1459,2\n450#1:1465\n493#1:1472,2\n493#1:1489\n553#1:1490,6\n566#1:1496,6\n567#1:1502,6\n1313#1:1604\n1313#1:1605,3\n1340#1:1610\n1340#1:1619\n1422#1:1620,2\n1422#1:1641\n519#1:1480,7\n1423#1:1626,7\n1426#1:1636\n1426#1:1640\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic K:[Lkotlin/reflect/KProperty;

.field public static final L:I


# instance fields
.field public A:Lorg/json/JSONObject;

.field public B:Ljava/lang/String;

.field public final C:Lkotlin/properties/ReadWriteProperty;

.field public D:[B

.field public E:[Lx6/j;

.field public F:[Ljava/util/List;

.field public G:[Ljava/util/List;

.field public final H:Ljava/util/Map;

.field public I:Z

.field public J:Z

.field public final r:Lp5/j;

.field public final s:Lp5/k;

.field public final t:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final u:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final v:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public final w:Lcom/zykj/evaluation/di/AppDatabase;

.field public final x:Landroidx/compose/runtime/MutableState;

.field public final y:Lkotlin/properties/ReadWriteProperty;

.field public z:Lcom/zykj/evaluation/bean/PaperConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    const-string v2, "serialNum"

    const-string v3, "getSerialNum()I"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v3, "isNewConfig"

    const-string v5, "isNewConfig()Z"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lkotlin/reflect/KProperty;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K:[Lkotlin/reflect/KProperty;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->L:I

    return-void
.end method

.method public constructor <init>(Lp5/j;Lp5/k;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "userInfo"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ossTaskManger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "submitTaskManger"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "database"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p3, p4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->r:Lp5/j;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->s:Lp5/k;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->t:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->u:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->v:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->w:Lcom/zykj/evaluation/di/AppDatabase;

    .line 45
    .line 46
    new-instance p1, Lx6/b;

    .line 47
    .line 48
    const/4 p2, 0x1

    .line 49
    const/4 p3, 0x0

    .line 50
    invoke-direct {p1, p3, p2, p3}, Lx6/b;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    const/4 p2, 0x2

    .line 54
    invoke-static {p1, p3, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->x:Landroidx/compose/runtime/MutableState;

    .line 59
    .line 60
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 61
    .line 62
    invoke-virtual {p1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->y:Lkotlin/properties/ReadWriteProperty;

    .line 67
    .line 68
    const-string p2, ""

    .line 69
    .line 70
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->B:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->C:Lkotlin/properties/ReadWriteProperty;

    .line 77
    .line 78
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H:Ljava/util/Map;

    .line 84
    .line 85
    return-void
.end method

.method public static synthetic A0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G:[Ljava/util/List;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "pageAnswerArray"

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->z0([Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: buildCommitList"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public static synthetic I0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->d:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    iget-object p0, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v2, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 77
    .line 78
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    iput-object p0, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iput v4, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->d:I

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v1, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    :goto_1
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->a:Ljava/lang/Object;

    .line 100
    .line 101
    iput v3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$doSomethingBeforeChangeIndex$1;->d:I

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->i1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, v1, :cond_5

    .line 108
    .line 109
    :goto_2
    return-object v1

    .line 110
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0
.end method

.method public static final synthetic Y(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->E0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic Z(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic a0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lx6/j;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K0()Lx6/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->z()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->A()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic d0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lcom/zykj/evaluation/bean/PaperConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->z:Lcom/zykj/evaluation/bean/PaperConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->A:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->B:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lb7/c1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->E()Lb7/c1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->v:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h1(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J0()Lx6/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lx6/b;->b()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->g1(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: updateQuestionAnswer"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public static final synthetic i0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->N0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->D:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->t:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->O0(Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->P0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->S0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic o0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lcom/zykj/evaluation/bean/PaperConfig;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->T0(Lcom/zykj/evaluation/bean/PaperConfig;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic p0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->V0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic q0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->W0(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->X0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic s0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->Z0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->a1()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic u0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->b1(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->d1(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic w0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->D:[B

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic x0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->i1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final B0(Lx6/j;)Ljava/util/List;
    .locals 16

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->L0()Lcom/zykj/evaluation/bean/PaperPage;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_5

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/PaperPage;->getQuestions()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_5

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/zykj/evaluation/bean/PaperQuestion;

    .line 34
    .line 35
    new-instance v7, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Lv6/y;->e(Lcom/zykj/evaluation/bean/PaperQuestion;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getSelects()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    move-object v11, v5

    .line 67
    check-cast v11, Lcom/zykj/evaluation/bean/PaperSelect;

    .line 68
    .line 69
    new-instance v8, Le7/c;

    .line 70
    .line 71
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/PaperSelect;->getUuid()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual/range {p1 .. p1}, Lx6/j;->d()[Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    aget-object v5, v5, v2

    .line 80
    .line 81
    if-nez v5, :cond_1

    .line 82
    .line 83
    const-string v5, ""

    .line 84
    .line 85
    :cond_1
    move-object v10, v5

    .line 86
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/PaperSelect;->getOrder()I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    const/16 v14, 0x10

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    invoke-direct/range {v8 .. v15}, Le7/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-static {v3}, Lv6/y;->c(Lcom/zykj/evaluation/bean/PaperQuestion;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_3

    .line 108
    .line 109
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getBlanks()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    move-object v13, v5

    .line 130
    check-cast v13, Lcom/zykj/evaluation/bean/PaperBlank;

    .line 131
    .line 132
    new-instance v8, Le7/c;

    .line 133
    .line 134
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/PaperBlank;->getUuid()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    const/16 v14, 0xe

    .line 139
    .line 140
    const/4 v15, 0x0

    .line 141
    const/4 v10, 0x0

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v12, 0x0

    .line 144
    invoke-direct/range {v8 .. v15}, Le7/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_3
    invoke-static {v3}, Lv6/y;->d(Lcom/zykj/evaluation/bean/PaperQuestion;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_4

    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getItems()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-eqz v4, :cond_4

    .line 162
    .line 163
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_4

    .line 172
    .line 173
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Lcom/zykj/evaluation/bean/PaperHand;

    .line 178
    .line 179
    new-instance v8, Le7/c;

    .line 180
    .line 181
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/PaperHand;->getUuid()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    const/16 v14, 0x1e

    .line 186
    .line 187
    const/4 v15, 0x0

    .line 188
    const/4 v10, 0x0

    .line 189
    const/4 v11, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    invoke-direct/range {v8 .. v15}, Le7/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_4
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_0

    .line 204
    .line 205
    new-instance v4, Le7/b;

    .line 206
    .line 207
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getId()J

    .line 208
    .line 209
    .line 210
    move-result-wide v5

    .line 211
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getPosition()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getGroupKey()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperQuestion;->getNumericalOrder()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    invoke-direct/range {v4 .. v11}, Le7/b;-><init>(JLjava/util/List;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/lang/String;II)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_5
    return-object v0
.end method

.method public final C0()Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "answerInfoArray"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v3, v1, :cond_7

    .line 16
    .line 17
    aget-object v5, v0, v3

    .line 18
    .line 19
    add-int/lit8 v6, v4, 0x1

    .line 20
    .line 21
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    if-eqz v8, :cond_2

    .line 35
    .line 36
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    move-object v9, v8

    .line 41
    check-cast v9, Le7/b;

    .line 42
    .line 43
    invoke-virtual {v9}, Le7/b;->d()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    if-nez v10, :cond_1

    .line 52
    .line 53
    new-instance v10, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_1
    check-cast v10, Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_6

    .line 80
    .line 81
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Ljava/util/Map$Entry;

    .line 86
    .line 87
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    check-cast v7, Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v7}, Lv6/y;->b(Ljava/util/List;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-eqz v7, :cond_4

    .line 98
    .line 99
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    :cond_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_3

    .line 115
    .line 116
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    check-cast v9, Lx6/d;

    .line 121
    .line 122
    invoke-virtual {v9}, Lx6/d;->h()Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_5

    .line 127
    .line 128
    invoke-virtual {p0, v4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v7}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->U0(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x1

    .line 135
    return v0

    .line 136
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    move v4, v6

    .line 139
    goto :goto_0

    .line 140
    :cond_7
    return v2
.end method

.method public final D0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lg7/e;->b(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1, v2}, Lg7/e;->d(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I:Z

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v1}, Lg7/e;->f(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->deleteAllInDir(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final E0(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "copyOf(...)"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->S([Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_6

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    array-length v0, p1

    .line 29
    const/4 v1, -0x1

    .line 30
    add-int/2addr v0, v1

    .line 31
    const/4 v2, 0x0

    .line 32
    if-ltz v0, :cond_5

    .line 33
    .line 34
    :goto_0
    add-int/lit8 v3, v0, -0x1

    .line 35
    .line 36
    aget-object v4, p1, v0

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v4, v2

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    const/4 v4, 0x1

    .line 50
    :goto_2
    if-nez v4, :cond_3

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_3
    if-gez v3, :cond_4

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    move v0, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_5
    :goto_3
    move v0, v1

    .line 59
    :goto_4
    if-eq v0, v1, :cond_7

    .line 60
    .line 61
    :goto_5
    if-ge v2, v0, :cond_7

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    aget-object p1, p1, v2

    .line 68
    .line 69
    if-nez p1, :cond_6

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v1, ""

    .line 76
    .line 77
    aput-object v1, p1, v2

    .line 78
    .line 79
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_7
    :goto_6
    return-void
.end method

.method public final F0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;

    .line 11
    .line 12
    iget v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->g:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v4

    .line 21
    iput v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->g:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;

    .line 26
    .line 27
    invoke-direct {v1, v3, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->e:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget v1, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->g:I

    .line 38
    .line 39
    const/4 v9, 0x2

    .line 40
    const/4 v10, 0x1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    if-ne v1, v10, :cond_1

    .line 44
    .line 45
    iget-object v1, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, [Ljava/lang/String;

    .line 48
    .line 49
    iget-object v2, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Landroid/graphics/Bitmap;

    .line 52
    .line 53
    iget-object v2, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/util/List;

    .line 56
    .line 57
    iget-object v2, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Landroid/graphics/Bitmap;

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-array v4, v9, [Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    move-object/from16 v1, p1

    .line 86
    .line 87
    move-object/from16 v2, p2

    .line 88
    .line 89
    move-object/from16 v5, p3

    .line 90
    .line 91
    invoke-direct/range {v0 .. v6}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;-><init>(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    .line 94
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iput-object v1, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->a:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->b:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->c:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v4, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->d:Ljava/lang/Object;

    .line 113
    .line 114
    iput v10, v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$1;->g:I

    .line 115
    .line 116
    invoke-static {v11, v0, v7}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-ne v0, v8, :cond_3

    .line 121
    .line 122
    return-object v8

    .line 123
    :cond_3
    move-object v1, v4

    .line 124
    :goto_2
    aget-object v0, v1, v10

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-static {v0, v9}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    move-object v0, v2

    .line 135
    :goto_3
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    const/4 v5, 0x0

    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eq v4, v0, :cond_6

    .line 148
    .line 149
    :goto_4
    move v13, v10

    .line 150
    goto :goto_5

    .line 151
    :cond_6
    move v13, v5

    .line 152
    :goto_5
    aget-object v0, v1, v5

    .line 153
    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    invoke-static {v0, v9}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    sub-int/2addr v0, v10

    .line 165
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    :cond_7
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v2, :cond_8

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eq v0, v1, :cond_9

    .line 181
    .line 182
    :goto_6
    move v14, v10

    .line 183
    goto :goto_7

    .line 184
    :cond_9
    move v14, v5

    .line 185
    :goto_7
    if-nez v13, :cond_b

    .line 186
    .line 187
    if-eqz v14, :cond_a

    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_a
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :cond_b
    :goto_8
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    new-instance v11, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 200
    .line 201
    const/4 v15, 0x1

    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    invoke-direct/range {v11 .. v16}, Lcom/zykj/evaluation/ui/sheet/b$c;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 206
    .line 207
    .line 208
    const/16 v13, 0x37

    .line 209
    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v9, 0x0

    .line 214
    move-object v10, v11

    .line 215
    const/4 v11, 0x0

    .line 216
    invoke-static/range {v6 .. v14}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v3, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0
.end method

.method public G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleSuccessScanned$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lb7/c1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 18
    .line 19
    .line 20
    const/16 v8, 0x1f

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v1, p0

    .line 29
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final G0(II)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J0()Lx6/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lx6/b;->b()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lx6/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Lx6/d;->e()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lx6/c;

    .line 24
    .line 25
    invoke-virtual {v0}, Lx6/d;->i()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2}, Lx6/c;->d()Lv6/l0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v0, v0, Lv6/l0$b;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    const-string p2, ""

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->f1(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p2}, Lx6/c;->c()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->f1(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {v0}, Lx6/d;->e()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    move-object v3, v2

    .line 77
    check-cast v3, Lx6/c;

    .line 78
    .line 79
    invoke-virtual {v3}, Lx6/c;->d()Lv6/l0;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    instance-of v3, v3, Lv6/l0$b;

    .line 84
    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 92
    .line 93
    const/16 v2, 0xa

    .line 94
    .line 95
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/4 v3, 0x0

    .line 107
    move v4, v3

    .line 108
    :goto_1
    if-ge v4, v2, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    check-cast v5, Lx6/c;

    .line 117
    .line 118
    invoke-virtual {v5}, Lx6/c;->c()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    move v4, v3

    .line 136
    :goto_2
    if-ge v4, v2, :cond_6

    .line 137
    .line 138
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    add-int/lit8 v4, v4, 0x1

    .line 143
    .line 144
    check-cast v5, Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p2}, Lx6/c;->c()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-eqz v6, :cond_5

    .line 155
    .line 156
    const/4 v3, 0x1

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    if-nez v3, :cond_7

    .line 163
    .line 164
    invoke-virtual {p2}, Lx6/c;->c()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    const-string v0, "toString(...)"

    .line 176
    .line 177
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->f1(ILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public H(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z
    .locals 10

    .line 1
    const-string v0, "answerSheetBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->H(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    const v0, 0x3fba1ec2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->T(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getSerialNum()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->e1(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->D0()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->Y0()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    const/16 v8, 0x1f

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    move-object v1, p0

    .line 48
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1
.end method

.method public final H0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->f:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->f:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->f:I

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v7, 0x0

    .line 37
    const-string v8, "pageAnswerArray"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    if-eq v1, v3, :cond_2

    .line 44
    .line 45
    if-ne v1, v2, :cond_1

    .line 46
    .line 47
    iget-object v0, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 50
    .line 51
    iget-object v1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lx6/j;

    .line 54
    .line 55
    iget-object v1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/Map;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v1, p0

    .line 63
    goto/16 :goto_8

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    iget-object v1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 76
    .line 77
    iget-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lx6/j;

    .line 80
    .line 81
    iget-object v4, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v4, Ljava/util/Map;

    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G:[Ljava/util/List;

    .line 94
    .line 95
    if-nez p1, :cond_4

    .line 96
    .line 97
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    move-object p1, v9

    .line 101
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    aget-object p1, p1, v1

    .line 106
    .line 107
    new-instance v1, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lx6/k;

    .line 127
    .line 128
    invoke-virtual {v4}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/16 p1, 0xa

    .line 137
    .line 138
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    const/16 v4, 0x10

    .line 147
    .line 148
    invoke-static {p1, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-direct {v4, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    move v5, v7

    .line 162
    :goto_3
    if-ge v5, p1, :cond_6

    .line 163
    .line 164
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    add-int/lit8 v5, v5, 0x1

    .line 169
    .line 170
    move-object v11, v10

    .line 171
    check-cast v11, Lx6/a;

    .line 172
    .line 173
    invoke-virtual {v11}, Lx6/a;->f()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-interface {v4, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K0()Lx6/j;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 186
    .line 187
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    iput-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/sheet/a;->d()Lb7/t0;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-virtual {v5}, Lb7/t0;->a()Lkotlin/jvm/functions/Function0;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    if-eqz v5, :cond_a

    .line 209
    .line 210
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, Ljava/util/List;

    .line 215
    .line 216
    if-eqz v5, :cond_a

    .line 217
    .line 218
    iget-object v10, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 219
    .line 220
    const-string v11, "answerInfoArray"

    .line 221
    .line 222
    if-nez v10, :cond_7

    .line 223
    .line 224
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    move-object v10, v9

    .line 228
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    aget-object v10, v10, v12

    .line 233
    .line 234
    invoke-virtual {p0, v5, v10, v4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->y0(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljava/util/Set;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    iput-object v10, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v10, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 241
    .line 242
    if-nez v10, :cond_8

    .line 243
    .line 244
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    move-object v10, v9

    .line 248
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    aput-object v5, v10, v12

    .line 253
    .line 254
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    invoke-virtual {v5, v10}, Lg7/e;->b(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    iget-object v10, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 267
    .line 268
    if-nez v10, :cond_9

    .line 269
    .line 270
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    move-object v10, v9

    .line 274
    :cond_9
    invoke-static {v10}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-static {v5, v10}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 283
    .line 284
    .line 285
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/sheet/a;->d()Lb7/t0;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-virtual {v5}, Lb7/t0;->b()Lkotlin/jvm/functions/Function3;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    if-eqz v5, :cond_c

    .line 298
    .line 299
    iget-object v10, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v4, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->a:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object p1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->b:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->c:Ljava/lang/Object;

    .line 306
    .line 307
    iput v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->f:I

    .line 308
    .line 309
    invoke-interface {v5, p1, v10, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    if-ne v3, v0, :cond_b

    .line 314
    .line 315
    move-object v1, p0

    .line 316
    goto :goto_7

    .line 317
    :cond_b
    move-object v3, p1

    .line 318
    :goto_4
    move-object v5, v4

    .line 319
    move-object v4, v3

    .line 320
    :goto_5
    move-object p1, v1

    .line 321
    goto :goto_6

    .line 322
    :cond_c
    move-object v5, v4

    .line 323
    move-object v4, p1

    .line 324
    goto :goto_5

    .line 325
    :goto_6
    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v1, Ljava/util/Set;

    .line 328
    .line 329
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v10

    .line 337
    iput-object v10, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->a:Ljava/lang/Object;

    .line 338
    .line 339
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    iput-object v10, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->b:Ljava/lang/Object;

    .line 344
    .line 345
    iput-object p1, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->c:Ljava/lang/Object;

    .line 346
    .line 347
    iput v2, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$confirmAnswerAndNext$1;->f:I

    .line 348
    .line 349
    move-object v2, v1

    .line 350
    move-object v1, p0

    .line 351
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->O0(Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-ne v2, v0, :cond_d

    .line 356
    .line 357
    :goto_7
    return-object v0

    .line 358
    :cond_d
    move-object v0, p1

    .line 359
    move-object p1, v2

    .line 360
    :goto_8
    check-cast p1, Ljava/util/List;

    .line 361
    .line 362
    iget-object v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G:[Ljava/util/List;

    .line 363
    .line 364
    if-nez v2, :cond_e

    .line 365
    .line 366
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    move-object v2, v9

    .line 370
    :cond_e
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    aput-object p1, v2, v3

    .line 375
    .line 376
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    invoke-virtual {v2, v3}, Lg7/e;->d(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    iget-object v3, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G:[Ljava/util/List;

    .line 389
    .line 390
    if-nez v3, :cond_f

    .line 391
    .line 392
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    move-object v3, v9

    .line 396
    :cond_f
    invoke-static {v3}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 401
    .line 402
    .line 403
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-eqz v2, :cond_15

    .line 412
    .line 413
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    check-cast v2, Lx6/k;

    .line 418
    .line 419
    invoke-virtual {v2}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    move v4, v7

    .line 428
    :cond_11
    :goto_9
    if-ge v4, v3, :cond_10

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    add-int/lit8 v4, v4, 0x1

    .line 435
    .line 436
    check-cast v5, Lx6/a;

    .line 437
    .line 438
    invoke-virtual {v5}, Lx6/a;->g()Z

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    if-eqz v6, :cond_11

    .line 443
    .line 444
    iget-object v6, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v6, Ljava/util/Set;

    .line 447
    .line 448
    invoke-virtual {v5}, Lx6/a;->f()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_11

    .line 457
    .line 458
    iget-object v6, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H:Ljava/util/Map;

    .line 459
    .line 460
    invoke-virtual {v5}, Lx6/a;->f()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    check-cast v6, Lx6/m;

    .line 469
    .line 470
    if-eqz v6, :cond_11

    .line 471
    .line 472
    invoke-virtual {v6, v7}, Lx6/m;->d(Z)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v6}, Lx6/m;->a()Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    :cond_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v8

    .line 487
    if-eqz v8, :cond_13

    .line 488
    .line 489
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    move-object v10, v8

    .line 494
    check-cast v10, Lx6/l;

    .line 495
    .line 496
    invoke-virtual {v10}, Lx6/l;->c()I

    .line 497
    .line 498
    .line 499
    move-result v11

    .line 500
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 501
    .line 502
    .line 503
    move-result v12

    .line 504
    if-ne v11, v12, :cond_12

    .line 505
    .line 506
    invoke-virtual {v10}, Lx6/l;->a()I

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    invoke-virtual {v5}, Lx6/a;->c()I

    .line 511
    .line 512
    .line 513
    move-result v11

    .line 514
    if-ne v10, v11, :cond_12

    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_13
    move-object v8, v9

    .line 518
    :goto_a
    check-cast v8, Lx6/l;

    .line 519
    .line 520
    if-eqz v8, :cond_11

    .line 521
    .line 522
    invoke-virtual {v5}, Lx6/a;->d()Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    check-cast v5, Ljava/lang/String;

    .line 531
    .line 532
    if-nez v5, :cond_14

    .line 533
    .line 534
    const-string v5, ""

    .line 535
    .line 536
    :cond_14
    invoke-virtual {v8, v5}, Lx6/l;->d(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    goto :goto_9

    .line 540
    :cond_15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 541
    .line 542
    return-object p1
.end method

.method public final J0()Lx6/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->x:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx6/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final K0()Lx6/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->E:[Lx6/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "pageAnswerData"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    return-object v0
.end method

.method public final L0()Lcom/zykj/evaluation/bean/PaperPage;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->z:Lcom/zykj/evaluation/bean/PaperConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/PaperConfig;->getPages()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/evaluation/bean/PaperPage;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public final M0()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->y:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K:[Lkotlin/reflect/KProperty;

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
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final N0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$getTFModelBuffer$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$getTFModelBuffer$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final O0(Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->x:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->x:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->v:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v4, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->x:I

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    iget v4, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->t:I

    .line 45
    .line 46
    iget v7, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->s:I

    .line 47
    .line 48
    iget v8, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->r:I

    .line 49
    .line 50
    iget v9, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->q:I

    .line 51
    .line 52
    iget-object v10, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->p:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v10, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v11, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->o:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Landroid/graphics/Bitmap;

    .line 59
    .line 60
    iget-object v11, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->n:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v11, Lx6/a;

    .line 63
    .line 64
    iget-object v11, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Lx6/a;

    .line 67
    .line 68
    iget-object v12, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v12, Ljava/util/Iterator;

    .line 71
    .line 72
    iget-object v13, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v13, Ljava/lang/Iterable;

    .line 75
    .line 76
    iget-object v14, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v14, Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v15, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v15, Lx6/k;

    .line 83
    .line 84
    iget-object v5, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->g:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v6, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Ljava/util/Iterator;

    .line 89
    .line 90
    move-object/from16 v16, v0

    .line 91
    .line 92
    iget-object v0, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/lang/Iterable;

    .line 95
    .line 96
    move-object/from16 p1, v0

    .line 97
    .line 98
    iget-object v0, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ljava/util/List;

    .line 101
    .line 102
    move-object/from16 p2, v0

    .line 103
    .line 104
    iget-object v0, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/util/Map;

    .line 107
    .line 108
    move-object/from16 p3, v0

    .line 109
    .line 110
    iget-object v0, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lx6/j;

    .line 113
    .line 114
    move-object/from16 p4, v0

    .line 115
    .line 116
    iget-object v0, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ljava/util/Set;

    .line 119
    .line 120
    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v23, v0

    .line 124
    .line 125
    move/from16 v17, v4

    .line 126
    .line 127
    move-object v2, v13

    .line 128
    move-object/from16 v16, v14

    .line 129
    .line 130
    move-object/from16 v18, v15

    .line 131
    .line 132
    const/4 v0, 0x1

    .line 133
    move-object/from16 v4, p4

    .line 134
    .line 135
    move-object v13, v3

    .line 136
    move v14, v7

    .line 137
    move v3, v8

    .line 138
    move-object v15, v12

    .line 139
    move-object/from16 v7, p2

    .line 140
    .line 141
    move-object v8, v1

    .line 142
    move-object v12, v6

    .line 143
    move-object/from16 v6, p3

    .line 144
    .line 145
    :goto_1
    move-object/from16 v1, p1

    .line 146
    .line 147
    goto/16 :goto_5

    .line 148
    .line 149
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 152
    .line 153
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :cond_2
    move-object/from16 v16, v0

    .line 158
    .line 159
    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {p3 .. p3}, Lx6/j;->c()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    move-object v6, v0

    .line 176
    move-object v7, v1

    .line 177
    move-object v8, v4

    .line 178
    move-object v9, v5

    .line 179
    const/4 v10, 0x0

    .line 180
    move-object/from16 v0, p1

    .line 181
    .line 182
    move/from16 v1, p2

    .line 183
    .line 184
    move-object/from16 v4, p3

    .line 185
    .line 186
    move-object/from16 v5, p4

    .line 187
    .line 188
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_b

    .line 193
    .line 194
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    move-object v12, v11

    .line 199
    check-cast v12, Lx6/k;

    .line 200
    .line 201
    new-instance v13, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    move-object/from16 p1, v8

    .line 215
    .line 216
    move-object v2, v13

    .line 217
    move-object v8, v7

    .line 218
    move v13, v10

    .line 219
    move-object v10, v12

    .line 220
    move-object v7, v6

    .line 221
    move-object v12, v9

    .line 222
    const/4 v9, 0x0

    .line 223
    move-object v6, v5

    .line 224
    const/4 v5, 0x0

    .line 225
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    if-eqz v16, :cond_a

    .line 230
    .line 231
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v16

    .line 235
    move-object/from16 p2, v11

    .line 236
    .line 237
    move-object/from16 v11, v16

    .line 238
    .line 239
    check-cast v11, Lx6/a;

    .line 240
    .line 241
    invoke-virtual {v11}, Lx6/a;->g()Z

    .line 242
    .line 243
    .line 244
    move-result v17

    .line 245
    if-eqz v17, :cond_7

    .line 246
    .line 247
    move-object/from16 p3, v14

    .line 248
    .line 249
    invoke-virtual {v11}, Lx6/a;->f()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v14

    .line 253
    invoke-interface {v6, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    check-cast v14, Lx6/a;

    .line 258
    .line 259
    move-object/from16 v22, v3

    .line 260
    .line 261
    if-eqz v14, :cond_3

    .line 262
    .line 263
    invoke-virtual {v11}, Lx6/a;->f()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-nez v3, :cond_3

    .line 272
    .line 273
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-object/from16 v3, p1

    .line 277
    .line 278
    move-object/from16 v11, p2

    .line 279
    .line 280
    move v14, v13

    .line 281
    move-object/from16 v23, v15

    .line 282
    .line 283
    move-object/from16 v13, v22

    .line 284
    .line 285
    move-object/from16 v15, p3

    .line 286
    .line 287
    goto/16 :goto_a

    .line 288
    .line 289
    :cond_3
    invoke-virtual {v11}, Lx6/a;->e()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    sget-object v17, Lv6/m0$a;->b:Lv6/m0$a;

    .line 294
    .line 295
    move-object/from16 p4, v14

    .line 296
    .line 297
    invoke-virtual/range {v17 .. v17}, Lv6/m0;->a()I

    .line 298
    .line 299
    .line 300
    move-result v14

    .line 301
    if-ne v3, v14, :cond_4

    .line 302
    .line 303
    invoke-virtual {v4}, Lx6/j;->a()[Landroid/graphics/Bitmap;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v11}, Lx6/a;->c()I

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    aget-object v3, v3, v14

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_4
    invoke-virtual {v4}, Lx6/j;->b()[Landroid/graphics/Bitmap;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-virtual {v11}, Lx6/a;->c()I

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    aget-object v3, v3, v14

    .line 323
    .line 324
    :goto_4
    if-eqz v3, :cond_6

    .line 325
    .line 326
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 327
    .line 328
    .line 329
    move-result-object v14

    .line 330
    move/from16 v17, v5

    .line 331
    .line 332
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    move/from16 v18, v9

    .line 337
    .line 338
    invoke-virtual {v11}, Lx6/a;->f()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    move/from16 v23, v13

    .line 343
    .line 344
    invoke-virtual {v11}, Lx6/a;->c()I

    .line 345
    .line 346
    .line 347
    move-result v13

    .line 348
    invoke-virtual {v14, v5, v9, v1, v13}, Lg7/e;->c(ILjava/lang/String;II)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    new-instance v13, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$2$1$1;

    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    invoke-direct {v13, v3, v5, v14}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$2$1$1;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 360
    .line 361
    .line 362
    iput-object v0, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->a:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v4, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->b:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v6, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->c:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v7, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->d:Ljava/lang/Object;

    .line 369
    .line 370
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v14

    .line 374
    iput-object v14, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->e:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v12, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->f:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    iput-object v14, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->g:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object v10, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->h:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v2, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->i:Ljava/lang/Object;

    .line 387
    .line 388
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    iput-object v14, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->j:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v15, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->k:Ljava/lang/Object;

    .line 395
    .line 396
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    iput-object v14, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->l:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v11, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->m:Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v14

    .line 408
    iput-object v14, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->n:Ljava/lang/Object;

    .line 409
    .line 410
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    iput-object v3, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->o:Ljava/lang/Object;

    .line 415
    .line 416
    iput-object v5, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->p:Ljava/lang/Object;

    .line 417
    .line 418
    iput v1, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->q:I

    .line 419
    .line 420
    move/from16 v3, v23

    .line 421
    .line 422
    iput v3, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->r:I

    .line 423
    .line 424
    move/from16 v14, v18

    .line 425
    .line 426
    iput v14, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->s:I

    .line 427
    .line 428
    move-object/from16 v23, v0

    .line 429
    .line 430
    move/from16 v0, v17

    .line 431
    .line 432
    iput v0, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->t:I

    .line 433
    .line 434
    const/4 v0, 0x0

    .line 435
    iput v0, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->u:I

    .line 436
    .line 437
    const/4 v0, 0x1

    .line 438
    iput v0, v8, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$handleQuestionAnswer$1;->x:I

    .line 439
    .line 440
    invoke-static {v9, v13, v8}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    move-object/from16 v13, v22

    .line 445
    .line 446
    if-ne v9, v13, :cond_5

    .line 447
    .line 448
    return-object v13

    .line 449
    :cond_5
    move v9, v1

    .line 450
    move-object/from16 v16, v2

    .line 451
    .line 452
    move-object/from16 v18, v10

    .line 453
    .line 454
    move-object/from16 v2, p3

    .line 455
    .line 456
    move-object v10, v5

    .line 457
    move-object/from16 v5, p2

    .line 458
    .line 459
    goto/16 :goto_1

    .line 460
    .line 461
    :goto_5
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v10

    .line 465
    move v0, v3

    .line 466
    move-object v3, v1

    .line 467
    move v1, v9

    .line 468
    move v9, v14

    .line 469
    move v14, v0

    .line 470
    move-object/from16 v0, v18

    .line 471
    .line 472
    move-object/from16 v18, v10

    .line 473
    .line 474
    move-object v10, v0

    .line 475
    move-object/from16 v0, v23

    .line 476
    .line 477
    move-object/from16 v23, v15

    .line 478
    .line 479
    move-object v15, v2

    .line 480
    move-object/from16 v2, v16

    .line 481
    .line 482
    move-object/from16 v16, v11

    .line 483
    .line 484
    move-object v11, v5

    .line 485
    move/from16 v5, v17

    .line 486
    .line 487
    goto/16 :goto_9

    .line 488
    .line 489
    :cond_6
    move-object/from16 v23, v0

    .line 490
    .line 491
    move/from16 v17, v5

    .line 492
    .line 493
    move v14, v9

    .line 494
    move v3, v13

    .line 495
    move-object/from16 v13, v22

    .line 496
    .line 497
    const/4 v0, 0x1

    .line 498
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    move-object/from16 v18, v5

    .line 503
    .line 504
    move-object/from16 v16, v11

    .line 505
    .line 506
    move/from16 v5, v17

    .line 507
    .line 508
    :goto_6
    move-object/from16 v0, v23

    .line 509
    .line 510
    move-object/from16 v11, p2

    .line 511
    .line 512
    move v14, v3

    .line 513
    move-object/from16 v23, v15

    .line 514
    .line 515
    move-object/from16 v3, p1

    .line 516
    .line 517
    move-object/from16 v15, p3

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_7
    move/from16 p3, v13

    .line 521
    .line 522
    move-object v13, v3

    .line 523
    move/from16 v3, p3

    .line 524
    .line 525
    move-object/from16 v23, v0

    .line 526
    .line 527
    move/from16 v17, v5

    .line 528
    .line 529
    move-object/from16 p3, v14

    .line 530
    .line 531
    const/4 v0, 0x1

    .line 532
    move v14, v9

    .line 533
    invoke-virtual {v4}, Lx6/j;->d()[Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    invoke-virtual {v11}, Lx6/a;->c()I

    .line 538
    .line 539
    .line 540
    move-result v9

    .line 541
    aget-object v5, v5, v9

    .line 542
    .line 543
    if-eqz v5, :cond_9

    .line 544
    .line 545
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    const-string v9, "toCharArray(...)"

    .line 550
    .line 551
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    if-eqz v5, :cond_9

    .line 555
    .line 556
    new-instance v9, Ljava/util/ArrayList;

    .line 557
    .line 558
    array-length v0, v5

    .line 559
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 560
    .line 561
    .line 562
    array-length v0, v5

    .line 563
    move/from16 v22, v1

    .line 564
    .line 565
    const/4 v1, 0x0

    .line 566
    :goto_7
    if-ge v1, v0, :cond_8

    .line 567
    .line 568
    move/from16 v16, v0

    .line 569
    .line 570
    aget-char v0, v5, v1

    .line 571
    .line 572
    int-to-char v0, v0

    .line 573
    int-to-char v0, v0

    .line 574
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    add-int/lit8 v1, v1, 0x1

    .line 582
    .line 583
    move/from16 v0, v16

    .line 584
    .line 585
    goto :goto_7

    .line 586
    :cond_8
    move-object/from16 v18, v9

    .line 587
    .line 588
    :goto_8
    move-object/from16 v16, v11

    .line 589
    .line 590
    move v9, v14

    .line 591
    move/from16 v5, v17

    .line 592
    .line 593
    move/from16 v1, v22

    .line 594
    .line 595
    goto :goto_6

    .line 596
    :cond_9
    move/from16 v22, v1

    .line 597
    .line 598
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    move-object/from16 v18, v0

    .line 603
    .line 604
    goto :goto_8

    .line 605
    :goto_9
    const/16 v21, 0xd

    .line 606
    .line 607
    const/16 v22, 0x0

    .line 608
    .line 609
    const/16 v17, 0x0

    .line 610
    .line 611
    const/16 v19, 0x0

    .line 612
    .line 613
    const/16 v20, 0x0

    .line 614
    .line 615
    move-object/from16 p1, v0

    .line 616
    .line 617
    invoke-static/range {v16 .. v22}, Lx6/a;->b(Lx6/a;Ljava/lang/String;Ljava/util/List;IIILjava/lang/Object;)Lx6/a;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-object/from16 v0, p1

    .line 625
    .line 626
    :goto_a
    move-object/from16 p1, v3

    .line 627
    .line 628
    move-object v3, v13

    .line 629
    move v13, v14

    .line 630
    move-object v14, v15

    .line 631
    move-object/from16 v15, v23

    .line 632
    .line 633
    goto/16 :goto_3

    .line 634
    .line 635
    :cond_a
    move/from16 v22, v13

    .line 636
    .line 637
    move-object v13, v3

    .line 638
    move/from16 v3, v22

    .line 639
    .line 640
    move-object/from16 v23, v0

    .line 641
    .line 642
    move/from16 v22, v1

    .line 643
    .line 644
    const/16 v20, 0x1

    .line 645
    .line 646
    const/16 v21, 0x0

    .line 647
    .line 648
    const-wide/16 v17, 0x0

    .line 649
    .line 650
    move-object/from16 v19, v2

    .line 651
    .line 652
    move-object/from16 v16, v10

    .line 653
    .line 654
    invoke-static/range {v16 .. v21}, Lx6/k;->b(Lx6/k;JLjava/util/ArrayList;ILjava/lang/Object;)Lx6/k;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-object/from16 v2, p0

    .line 662
    .line 663
    move v10, v3

    .line 664
    move-object v5, v6

    .line 665
    move-object v6, v7

    .line 666
    move-object v7, v8

    .line 667
    move-object v9, v12

    .line 668
    move-object v3, v13

    .line 669
    move-object/from16 v0, v23

    .line 670
    .line 671
    move-object/from16 v8, p1

    .line 672
    .line 673
    goto/16 :goto_2

    .line 674
    .line 675
    :cond_b
    return-object v6
.end method

.method public final P0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->g:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->g:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->e:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    iget v2, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->g:I

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-eq v2, v9, :cond_2

    .line 45
    .line 46
    if-ne v2, v8, :cond_1

    .line 47
    .line 48
    iget-object v2, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Landroid/graphics/Bitmap;

    .line 55
    .line 56
    iget-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/List;

    .line 59
    .line 60
    iget-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Landroid/graphics/Bitmap;

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_2
    iget-object v2, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Landroid/graphics/Bitmap;

    .line 80
    .line 81
    iget-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Ljava/util/List;

    .line 84
    .line 85
    iget-object v4, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, Landroid/graphics/Bitmap;

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v4

    .line 93
    .line 94
    move-object v4, v2

    .line 95
    move-object/from16 v2, v20

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K0()Lx6/j;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lx6/j;->d()[Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    const/4 v15, 0x6

    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v14, 0x0

    .line 115
    invoke-static/range {v11 .. v16}, Lkotlin/collections/ArraysKt;->fill$default([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    move-object/from16 v2, p1

    .line 126
    .line 127
    move-object/from16 v3, p2

    .line 128
    .line 129
    move-object/from16 v4, p3

    .line 130
    .line 131
    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    .line 132
    .line 133
    .line 134
    iput-object v2, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->a:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iput-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->b:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v4, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    iput v9, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->g:I

    .line 145
    .line 146
    invoke-static {v11, v0, v6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-ne v0, v7, :cond_4

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_4
    move-object/from16 v3, p2

    .line 154
    .line 155
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    invoke-virtual {v0, v5, v11}, Lg7/e;->g(II)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    new-instance v11, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$newBitmap$1;

    .line 176
    .line 177
    invoke-direct {v11, v4, v0, v10}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$newBitmap$1;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 178
    .line 179
    .line 180
    iput-object v2, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->a:Ljava/lang/Object;

    .line 181
    .line 182
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    iput-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->b:Ljava/lang/Object;

    .line 187
    .line 188
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    iput-object v3, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->c:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v0, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->d:Ljava/lang/Object;

    .line 195
    .line 196
    iput v8, v6, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$1;->g:I

    .line 197
    .line 198
    invoke-static {v5, v11, v6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    if-ne v3, v7, :cond_5

    .line 203
    .line 204
    :goto_3
    return-object v7

    .line 205
    :cond_5
    move-object/from16 v20, v2

    .line 206
    .line 207
    move-object v2, v0

    .line 208
    move-object v0, v3

    .line 209
    move-object/from16 v3, v20

    .line 210
    .line 211
    :goto_4
    check-cast v0, Landroid/graphics/Bitmap;

    .line 212
    .line 213
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-eqz v0, :cond_6

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_6
    move-object v2, v10

    .line 225
    :goto_5
    aput-object v2, v4, v5

    .line 226
    .line 227
    iput-boolean v9, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J:Z

    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K0()Lx6/j;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-virtual {v1, v2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->B0(Lx6/j;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    iget-object v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 238
    .line 239
    const-string v4, "answerInfoArray"

    .line 240
    .line 241
    if-nez v2, :cond_7

    .line 242
    .line 243
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    move-object v2, v10

    .line 247
    :cond_7
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    aput-object v13, v2, v5

    .line 252
    .line 253
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    invoke-virtual {v2, v5}, Lg7/e;->b(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    iget-object v5, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 266
    .line 267
    if-nez v5, :cond_8

    .line 268
    .line 269
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    move-object v5, v10

    .line 273
    :cond_8
    invoke-static {v5}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-static {v2, v4}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/sheet/a;->e()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    new-instance v4, Ljava/util/ArrayList;

    .line 289
    .line 290
    const/16 v5, 0xa

    .line 291
    .line 292
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-eqz v5, :cond_a

    .line 308
    .line 309
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    check-cast v5, Lv6/z;

    .line 314
    .line 315
    invoke-virtual {v5}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    sget-object v7, Lcom/zykj/evaluation/ui/sheet/c$a$a;->d:Lcom/zykj/evaluation/ui/sheet/c$a$a;

    .line 320
    .line 321
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    if-eqz v6, :cond_9

    .line 326
    .line 327
    const/4 v6, 0x0

    .line 328
    sget-object v7, Lcom/zykj/evaluation/ui/sheet/c$a$b;->d:Lcom/zykj/evaluation/ui/sheet/c$a$b;

    .line 329
    .line 330
    invoke-static {v5, v6, v7, v9, v10}, Lv6/z;->b(Lv6/z;ILcom/zykj/evaluation/ui/sheet/c;ILjava/lang/Object;)Lv6/z;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    :cond_9
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_a
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    if-nez v0, :cond_b

    .line 343
    .line 344
    move-object v12, v3

    .line 345
    goto :goto_7

    .line 346
    :cond_b
    move-object v12, v0

    .line 347
    :goto_7
    sget-object v15, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 348
    .line 349
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->J()Z

    .line 350
    .line 351
    .line 352
    move-result v17

    .line 353
    const/16 v18, 0x4

    .line 354
    .line 355
    const/16 v19, 0x0

    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    move-object/from16 v16, v4

    .line 359
    .line 360
    invoke-static/range {v11 .. v19}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 365
    .line 366
    .line 367
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 368
    .line 369
    return-object v0
.end method

.method public final Q0(Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignorePageError$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignorePageError$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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

.method public final R0(Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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

.method public final S0(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lg7/e;->b(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I:Z

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2String(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initAnswerInfoArray$1$1$1;

    .line 33
    .line 34
    invoke-direct {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initAnswerInfoArray$1$1$1;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, [Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    :cond_0
    check-cast v0, [Ljava/util/List;

    .line 71
    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    :cond_1
    new-array v0, p1, [Ljava/util/List;

    .line 75
    .line 76
    :goto_1
    if-ge v2, p1, :cond_3

    .line 77
    .line 78
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    aput-object v1, v0, v2

    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-array v0, p1, [Ljava/util/List;

    .line 88
    .line 89
    :goto_2
    if-ge v2, p1, :cond_3

    .line 90
    .line 91
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    aput-object v1, v0, v2

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    iput-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 101
    .line 102
    return-void
.end method

.method public final T0(Lcom/zykj/evaluation/bean/PaperConfig;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/PaperConfig;->getPages()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_c

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    add-int/lit8 v6, v4, 0x1

    .line 28
    .line 29
    if-gez v4, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast v5, Lcom/zykj/evaluation/bean/PaperPage;

    .line 35
    .line 36
    new-instance v7, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/PaperPage;->getQuestions()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v14, 0x0

    .line 53
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_b

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    add-int/lit8 v17, v10, 0x1

    .line 64
    .line 65
    if-gez v10, :cond_1

    .line 66
    .line 67
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 68
    .line 69
    .line 70
    :cond_1
    move-object/from16 v18, v11

    .line 71
    .line 72
    check-cast v18, Lcom/zykj/evaluation/bean/PaperQuestion;

    .line 73
    .line 74
    new-instance v11, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static/range {v18 .. v18}, Lv6/y;->e(Lcom/zykj/evaluation/bean/PaperQuestion;)Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    if-eqz v12, :cond_4

    .line 84
    .line 85
    iget-object v12, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->A:Lorg/json/JSONObject;

    .line 86
    .line 87
    if-eqz v12, :cond_2

    .line 88
    .line 89
    sget-object v13, Lv6/m0$c;->b:Lv6/m0$c;

    .line 90
    .line 91
    invoke-static {v12, v4, v10, v13}, Lv6/y;->a(Lorg/json/JSONObject;IILv6/m0;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/evaluation/bean/PaperQuestion;->getSelects()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    if-eqz v10, :cond_9

    .line 99
    .line 100
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    move/from16 v23, v8

    .line 105
    .line 106
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, Lcom/zykj/evaluation/bean/PaperSelect;

    .line 117
    .line 118
    new-instance v19, Lx6/a;

    .line 119
    .line 120
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/PaperSelect;->getUuid()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v20

    .line 124
    sget-object v8, Lv6/m0$c;->b:Lv6/m0$c;

    .line 125
    .line 126
    invoke-virtual {v8}, Lv6/m0;->a()I

    .line 127
    .line 128
    .line 129
    move-result v22

    .line 130
    const/16 v24, 0x2

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    invoke-direct/range {v19 .. v25}, Lx6/a;-><init>(Ljava/lang/String;Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v8, v19

    .line 140
    .line 141
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    add-int/lit8 v23, v23, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    move-object v3, v11

    .line 148
    move/from16 v8, v23

    .line 149
    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_4
    invoke-static/range {v18 .. v18}, Lv6/y;->c(Lcom/zykj/evaluation/bean/PaperQuestion;)Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-eqz v12, :cond_7

    .line 157
    .line 158
    iget-object v12, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->A:Lorg/json/JSONObject;

    .line 159
    .line 160
    if-eqz v12, :cond_5

    .line 161
    .line 162
    sget-object v13, Lv6/m0$a;->b:Lv6/m0$a;

    .line 163
    .line 164
    invoke-static {v12, v4, v10, v13}, Lv6/y;->a(Lorg/json/JSONObject;IILv6/m0;)V

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/evaluation/bean/PaperQuestion;->getBlanks()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    if-eqz v10, :cond_9

    .line 172
    .line 173
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    move/from16 v23, v9

    .line 178
    .line 179
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_6

    .line 184
    .line 185
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    check-cast v9, Lcom/zykj/evaluation/bean/PaperBlank;

    .line 190
    .line 191
    new-instance v19, Lx6/a;

    .line 192
    .line 193
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/PaperBlank;->getUuid()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v20

    .line 197
    sget-object v9, Lv6/m0$a;->b:Lv6/m0$a;

    .line 198
    .line 199
    invoke-virtual {v9}, Lv6/m0;->a()I

    .line 200
    .line 201
    .line 202
    move-result v22

    .line 203
    const/16 v24, 0x2

    .line 204
    .line 205
    const/16 v25, 0x0

    .line 206
    .line 207
    const/16 v21, 0x0

    .line 208
    .line 209
    invoke-direct/range {v19 .. v25}, Lx6/a;-><init>(Ljava/lang/String;Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 210
    .line 211
    .line 212
    move-object/from16 v9, v19

    .line 213
    .line 214
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    add-int/lit8 v23, v23, 0x1

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_6
    move-object v3, v11

    .line 221
    move/from16 v9, v23

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    invoke-static/range {v18 .. v18}, Lv6/y;->d(Lcom/zykj/evaluation/bean/PaperQuestion;)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-eqz v12, :cond_9

    .line 229
    .line 230
    iget-object v12, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->A:Lorg/json/JSONObject;

    .line 231
    .line 232
    if-eqz v12, :cond_8

    .line 233
    .line 234
    sget-object v13, Lv6/m0$c;->b:Lv6/m0$c;

    .line 235
    .line 236
    invoke-static {v12, v4, v10, v13}, Lv6/y;->a(Lorg/json/JSONObject;IILv6/m0;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/evaluation/bean/PaperQuestion;->getItems()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    if-eqz v10, :cond_9

    .line 244
    .line 245
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    check-cast v10, Lcom/zykj/evaluation/bean/PaperHand;

    .line 250
    .line 251
    if-eqz v10, :cond_9

    .line 252
    .line 253
    move-object v12, v10

    .line 254
    new-instance v10, Lx6/a;

    .line 255
    .line 256
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/PaperHand;->getUuid()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    sget-object v13, Lv6/m0$b;->b:Lv6/m0$b;

    .line 261
    .line 262
    invoke-virtual {v13}, Lv6/m0;->a()I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    const/4 v15, 0x2

    .line 267
    const/16 v16, 0x0

    .line 268
    .line 269
    move-object/from16 v19, v11

    .line 270
    .line 271
    move-object v11, v12

    .line 272
    const/4 v12, 0x0

    .line 273
    move-object/from16 v3, v19

    .line 274
    .line 275
    invoke-direct/range {v10 .. v16}, Lx6/a;-><init>(Ljava/lang/String;Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    add-int/lit8 v14, v14, 0x1

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_9
    move-object v3, v11

    .line 285
    :goto_4
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/evaluation/bean/PaperQuestion;->getId()J

    .line 286
    .line 287
    .line 288
    move-result-wide v10

    .line 289
    const-wide/16 v12, 0x0

    .line 290
    .line 291
    cmp-long v10, v10, v12

    .line 292
    .line 293
    if-eqz v10, :cond_a

    .line 294
    .line 295
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-nez v10, :cond_a

    .line 300
    .line 301
    new-instance v10, Lx6/k;

    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/evaluation/bean/PaperQuestion;->getId()J

    .line 304
    .line 305
    .line 306
    move-result-wide v11

    .line 307
    invoke-direct {v10, v11, v12, v3}, Lx6/k;-><init>(JLjava/util/ArrayList;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    :cond_a
    move/from16 v10, v17

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :cond_b
    new-instance v3, Lx6/j;

    .line 318
    .line 319
    new-array v4, v8, [Ljava/lang/String;

    .line 320
    .line 321
    new-array v5, v9, [Landroid/graphics/Bitmap;

    .line 322
    .line 323
    new-array v8, v14, [Landroid/graphics/Bitmap;

    .line 324
    .line 325
    invoke-direct {v3, v7, v4, v5, v8}, Lx6/j;-><init>(Ljava/util/List;[Ljava/lang/String;[Landroid/graphics/Bitmap;[Landroid/graphics/Bitmap;)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move v4, v6

    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_c
    const/4 v3, 0x0

    .line 335
    new-array v2, v3, [Lx6/j;

    .line 336
    .line 337
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, [Lx6/j;

    .line 342
    .line 343
    iput-object v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->E:[Lx6/j;

    .line 344
    .line 345
    return-void
.end method

.method public final U0(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "newList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J0()Lx6/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lx6/b;->a(Ljava/util/List;)Lx6/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->c1(Lx6/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final V0(I)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lg7/e;->d(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I:Z

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2String(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 31
    .line 32
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPageAnswerArray$1$1$1;

    .line 33
    .line 34
    invoke-direct {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPageAnswerArray$1$1$1;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, [Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    :cond_0
    check-cast v0, [Ljava/util/List;

    .line 71
    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    :cond_1
    new-array v0, p1, [Ljava/util/List;

    .line 75
    .line 76
    move v1, v2

    .line 77
    :goto_1
    if-ge v1, p1, :cond_3

    .line 78
    .line 79
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    aput-object v3, v0, v1

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    new-array v0, p1, [Ljava/util/List;

    .line 89
    .line 90
    move v1, v2

    .line 91
    :goto_2
    if-ge v1, p1, :cond_3

    .line 92
    .line 93
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    aput-object v3, v0, v1

    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    iput-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G:[Ljava/util/List;

    .line 103
    .line 104
    array-length p1, v0

    .line 105
    move v1, v2

    .line 106
    move v3, v1

    .line 107
    :goto_3
    if-ge v1, p1, :cond_b

    .line 108
    .line 109
    aget-object v4, v0, v1

    .line 110
    .line 111
    add-int/lit8 v5, v3, 0x1

    .line 112
    .line 113
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    :cond_4
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_a

    .line 122
    .line 123
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    check-cast v6, Lx6/k;

    .line 128
    .line 129
    invoke-virtual {v6}, Lx6/k;->d()J

    .line 130
    .line 131
    .line 132
    move-result-wide v7

    .line 133
    const-wide/16 v9, 0x0

    .line 134
    .line 135
    cmp-long v7, v7, v9

    .line 136
    .line 137
    const-string v8, ""

    .line 138
    .line 139
    if-nez v7, :cond_5

    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    aput-object v8, v6, v3

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    invoke-virtual {v6}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    move v9, v2

    .line 157
    :cond_6
    :goto_5
    if-ge v9, v7, :cond_4

    .line 158
    .line 159
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    add-int/lit8 v9, v9, 0x1

    .line 164
    .line 165
    check-cast v10, Lx6/a;

    .line 166
    .line 167
    invoke-virtual {v10}, Lx6/a;->g()Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_6

    .line 172
    .line 173
    invoke-virtual {v10}, Lx6/a;->d()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    check-cast v11, Ljava/lang/String;

    .line 182
    .line 183
    if-eqz v11, :cond_8

    .line 184
    .line 185
    invoke-static {v11}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    if-nez v11, :cond_7

    .line 190
    .line 191
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    invoke-virtual {v10, v12}, Lx6/a;->h(Ljava/util/List;)V

    .line 196
    .line 197
    .line 198
    :cond_7
    const/4 v10, 0x1

    .line 199
    if-ne v11, v10, :cond_8

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    aget-object v10, v10, v3

    .line 207
    .line 208
    if-eqz v10, :cond_6

    .line 209
    .line 210
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-nez v10, :cond_9

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    aput-object v8, v10, v3

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 225
    .line 226
    move v3, v5

    .line 227
    goto :goto_3

    .line 228
    :cond_b
    return-void
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final W0(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    const-string v6, ""

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 47
    .line 48
    iget-object p2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p2, Ljava/lang/String;

    .line 51
    .line 52
    iget-object p3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 72
    .line 73
    iget-object p2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, Ljava/lang/String;

    .line 76
    .line 77
    iget-object p3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p3, Ljava/lang/String;

    .line 80
    .line 81
    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p3

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {p4, v2}, Lg7/e;->e(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p4

    .line 102
    invoke-static {p4}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2String(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-nez v2, :cond_4

    .line 107
    .line 108
    move-object v2, v6

    .line 109
    :cond_4
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-nez v7, :cond_b

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const/4 v7, 0x0

    .line 120
    if-lez v2, :cond_8

    .line 121
    .line 122
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 123
    .line 124
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->s:Lp5/k;

    .line 125
    .line 126
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iput-object v3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->a:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object p4, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->b:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object p0, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->c:Ljava/lang/Object;

    .line 135
    .line 136
    iput-wide p2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->d:J

    .line 137
    .line 138
    iput v7, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->e:I

    .line 139
    .line 140
    iput v7, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->f:I

    .line 141
    .line 142
    iput v4, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

    .line 143
    .line 144
    invoke-interface {v2, p1, v0}, Lp5/k;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    if-ne p1, v1, :cond_5

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_5
    move-object p2, p4

    .line 152
    move-object p4, p1

    .line 153
    move-object p1, p0

    .line 154
    :goto_1
    :try_start_2
    check-cast p4, Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    goto :goto_3

    .line 161
    :catchall_1
    move-exception p3

    .line 162
    move-object p1, p0

    .line 163
    move-object p2, p4

    .line 164
    :goto_2
    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 165
    .line 166
    invoke-static {p3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    :goto_3
    invoke-static {p3}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p4

    .line 178
    if-eqz p4, :cond_6

    .line 179
    .line 180
    move-object p3, v5

    .line 181
    :cond_6
    check-cast p3, Ljava/lang/String;

    .line 182
    .line 183
    if-nez p3, :cond_7

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_7
    move-object v6, p3

    .line 187
    goto :goto_6

    .line 188
    :cond_8
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->r:Lp5/j;

    .line 189
    .line 190
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iput-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->a:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object p4, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->b:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object p0, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->c:Ljava/lang/Object;

    .line 199
    .line 200
    iput-wide p2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->d:J

    .line 201
    .line 202
    iput v7, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->e:I

    .line 203
    .line 204
    iput v3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initPaperConfig$1;->i:I

    .line 205
    .line 206
    invoke-interface {v2, p2, p3, v0}, Lp5/j;->s(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    if-ne p1, v1, :cond_9

    .line 211
    .line 212
    :goto_4
    return-object v1

    .line 213
    :cond_9
    move-object p2, p4

    .line 214
    move-object p4, p1

    .line 215
    move-object p1, p0

    .line 216
    :goto_5
    check-cast p4, Lcom/zykj/http/bean/ApiResp;

    .line 217
    .line 218
    invoke-static {p4}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    check-cast p3, Lcom/zykj/evaluation/bean/PaperResponse;

    .line 223
    .line 224
    if-eqz p3, :cond_a

    .line 225
    .line 226
    invoke-virtual {p3}, Lcom/zykj/evaluation/bean/PaperResponse;->getAnswerSheet()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    if-nez p3, :cond_7

    .line 231
    .line 232
    :cond_a
    :goto_6
    const-string p3, "Config"

    .line 233
    .line 234
    invoke-static {v6, p3}, Lcom/blankj/utilcode/util/JsonUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-static {p2, v2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 239
    .line 240
    .line 241
    const-string p2, "also(...)"

    .line 242
    .line 243
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_b
    move-object p1, p0

    .line 248
    :goto_7
    iput-object v2, p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->B:Ljava/lang/String;

    .line 249
    .line 250
    :try_start_3
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 251
    .line 252
    new-instance p1, Lcom/google/gson/Gson;

    .line 253
    .line 254
    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    .line 255
    .line 256
    .line 257
    iget-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->B:Ljava/lang/String;

    .line 258
    .line 259
    const-class p3, Lcom/zykj/evaluation/bean/PaperConfig;

    .line 260
    .line 261
    invoke-virtual {p1, p2, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, Lcom/zykj/evaluation/bean/PaperConfig;

    .line 266
    .line 267
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 271
    goto :goto_8

    .line 272
    :catchall_2
    move-exception p1

    .line 273
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 274
    .line 275
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    :goto_8
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    if-eqz p2, :cond_c

    .line 288
    .line 289
    move-object p1, v5

    .line 290
    :cond_c
    check-cast p1, Lcom/zykj/evaluation/bean/PaperConfig;

    .line 291
    .line 292
    if-nez p1, :cond_d

    .line 293
    .line 294
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 295
    .line 296
    const-string p2, "\u7b54\u9898\u5361\u914d\u7f6e\u52a0\u8f7d\u5931\u8d25\uff0c\u8bf7\u9000\u51fa\u91cd\u8bd5"

    .line 297
    .line 298
    invoke-virtual {p1, p2}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_d
    move-object v5, p1

    .line 303
    :goto_9
    iput-object v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->z:Lcom/zykj/evaluation/bean/PaperConfig;

    .line 304
    .line 305
    sget-object p1, Lp7/a;->a:Lp7/a;

    .line 306
    .line 307
    iget-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->B:Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {p1, p2}, Lp7/a;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->A:Lorg/json/JSONObject;

    .line 314
    .line 315
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 316
    .line 317
    return-object p1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final X0(I)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    const/4 v4, -0x1

    .line 9
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    aget-object v5, v0, v3

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v3, v4

    .line 26
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    array-length v1, v0

    .line 31
    add-int/2addr v1, v4

    .line 32
    if-ltz v1, :cond_6

    .line 33
    .line 34
    :goto_2
    add-int/lit8 v5, v1, -0x1

    .line 35
    .line 36
    aget-object v6, v0, v1

    .line 37
    .line 38
    if-eqz v6, :cond_3

    .line 39
    .line 40
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-nez v6, :cond_2

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    move v6, v2

    .line 48
    goto :goto_4

    .line 49
    :cond_3
    :goto_3
    const/4 v6, 0x1

    .line 50
    :goto_4
    if-nez v6, :cond_4

    .line 51
    .line 52
    goto :goto_6

    .line 53
    :cond_4
    if-gez v5, :cond_5

    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_5
    move v1, v5

    .line 57
    goto :goto_2

    .line 58
    :cond_6
    :goto_5
    move v1, v4

    .line 59
    :goto_6
    if-eq v3, v4, :cond_7

    .line 60
    .line 61
    goto :goto_7

    .line 62
    :cond_7
    if-eq v1, v4, :cond_8

    .line 63
    .line 64
    move v3, v1

    .line 65
    goto :goto_7

    .line 66
    :cond_8
    move v3, v2

    .line 67
    :goto_7
    invoke-static {v2, p1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v9, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v0, 0xa

    .line 74
    .line 75
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_d

    .line 91
    .line 92
    move-object v0, p1

    .line 93
    check-cast v0, Lkotlin/collections/IntIterator;

    .line 94
    .line 95
    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    aget-object v1, v1, v0

    .line 104
    .line 105
    if-ne v0, v3, :cond_a

    .line 106
    .line 107
    if-eqz v1, :cond_9

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_9

    .line 114
    .line 115
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/c$a$a;->d:Lcom/zykj/evaluation/ui/sheet/c$a$a;

    .line 116
    .line 117
    goto :goto_9

    .line 118
    :cond_9
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/c$a$b;->d:Lcom/zykj/evaluation/ui/sheet/c$a$b;

    .line 119
    .line 120
    goto :goto_9

    .line 121
    :cond_a
    if-nez v1, :cond_b

    .line 122
    .line 123
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/c$c;->d:Lcom/zykj/evaluation/ui/sheet/c$c;

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_b
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_c

    .line 131
    .line 132
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/c$b$a;->d:Lcom/zykj/evaluation/ui/sheet/c$b$a;

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :cond_c
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/c$b$b;->d:Lcom/zykj/evaluation/ui/sheet/c$b$b;

    .line 136
    .line 137
    :goto_9
    new-instance v2, Lv6/z;

    .line 138
    .line 139
    invoke-direct {v2, v0, v1}, Lv6/z;-><init>(ILcom/zykj/evaluation/ui/sheet/c;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v9, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    aget-object p1, p1, v3

    .line 151
    .line 152
    if-eqz p1, :cond_f

    .line 153
    .line 154
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-nez p1, :cond_e

    .line 159
    .line 160
    goto :goto_b

    .line 161
    :cond_e
    :goto_a
    move-object v5, p1

    .line 162
    goto :goto_c

    .line 163
    :cond_f
    :goto_b
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->w()Landroid/graphics/Bitmap;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    goto :goto_a

    .line 168
    :goto_c
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 169
    .line 170
    if-nez p1, :cond_10

    .line 171
    .line 172
    const-string p1, "answerInfoArray"

    .line 173
    .line 174
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/4 p1, 0x0

    .line 178
    :cond_10
    aget-object v6, p1, v3

    .line 179
    .line 180
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Lv6/z;

    .line 185
    .line 186
    invoke-virtual {p1}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    sget-object v0, Lcom/zykj/evaluation/ui/sheet/c$a$b;->d:Lcom/zykj/evaluation/ui/sheet/c$a$b;

    .line 191
    .line 192
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_11

    .line 197
    .line 198
    sget-object p1, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 199
    .line 200
    :goto_d
    move-object v8, p1

    .line 201
    goto :goto_e

    .line 202
    :cond_11
    sget-object v0, Lcom/zykj/evaluation/ui/sheet/c$a$a;->d:Lcom/zykj/evaluation/ui/sheet/c$a$a;

    .line 203
    .line 204
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_12

    .line 209
    .line 210
    sget-object p1, Lcom/zykj/evaluation/ui/sheet/b$b;->b:Lcom/zykj/evaluation/ui/sheet/b$b;

    .line 211
    .line 212
    goto :goto_d

    .line 213
    :cond_12
    sget-object p1, Lcom/zykj/evaluation/ui/sheet/b$a;->b:Lcom/zykj/evaluation/ui/sheet/b$a;

    .line 214
    .line 215
    goto :goto_d

    .line 216
    :goto_e
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->J()Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    const/4 v11, 0x4

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    invoke-static/range {v4 .. v12}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public final Y0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v0, v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v2, v3, v1}, Lg7/e;->g(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aput-object v2, v3, v1

    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final Z0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;->c:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;->c:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v9, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;->c:I

    .line 38
    .line 39
    const/4 v10, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    if-ne v3, v10, :cond_1

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I:Z

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    iget-object v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->w:Lcom/zykj/evaluation/di/AppDatabase;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->t:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 70
    .line 71
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v4, "getId(...)"

    .line 82
    .line 83
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->A()J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->B()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    iput v10, v9, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initUploadAnswerMap$1;->c:I

    .line 99
    .line 100
    invoke-interface/range {v3 .. v9}, Ln5/i;->a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-ne v1, v2, :cond_3

    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_3
    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    .line 108
    .line 109
    const/16 v2, 0xa

    .line 110
    .line 111
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const/16 v3, 0x10

    .line 120
    .line 121
    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_5

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ln5/h;

    .line 145
    .line 146
    invoke-virtual {v2}, Ln5/h;->e()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v2}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_4
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    :cond_5
    iget-object v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->E:[Lx6/j;

    .line 175
    .line 176
    if-nez v1, :cond_6

    .line 177
    .line 178
    const-string v1, "pageAnswerData"

    .line 179
    .line 180
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/4 v1, 0x0

    .line 184
    :cond_6
    array-length v4, v1

    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    :goto_4
    if-ge v6, v4, :cond_18

    .line 188
    .line 189
    aget-object v8, v1, v6

    .line 190
    .line 191
    add-int/lit8 v9, v7, 0x1

    .line 192
    .line 193
    invoke-virtual {v8}, Lx6/j;->c()Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    if-eqz v11, :cond_17

    .line 206
    .line 207
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, Lx6/k;

    .line 212
    .line 213
    invoke-virtual {v11}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    const/4 v14, 0x0

    .line 222
    :goto_6
    if-ge v14, v13, :cond_16

    .line 223
    .line 224
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    add-int/lit8 v14, v14, 0x1

    .line 229
    .line 230
    check-cast v15, Lx6/a;

    .line 231
    .line 232
    invoke-virtual {v15}, Lx6/a;->g()Z

    .line 233
    .line 234
    .line 235
    move-result v16

    .line 236
    if-eqz v16, :cond_15

    .line 237
    .line 238
    iget-object v2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->G:[Ljava/util/List;

    .line 239
    .line 240
    if-nez v2, :cond_7

    .line 241
    .line 242
    const-string v2, "pageAnswerArray"

    .line 243
    .line 244
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/4 v2, 0x0

    .line 248
    :cond_7
    aget-object v2, v2, v7

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v16

    .line 258
    if-eqz v16, :cond_9

    .line 259
    .line 260
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v16

    .line 264
    move-object/from16 v17, v16

    .line 265
    .line 266
    check-cast v17, Lx6/k;

    .line 267
    .line 268
    invoke-virtual/range {v17 .. v17}, Lx6/k;->d()J

    .line 269
    .line 270
    .line 271
    move-result-wide v17

    .line 272
    invoke-virtual {v11}, Lx6/k;->d()J

    .line 273
    .line 274
    .line 275
    move-result-wide v19

    .line 276
    cmp-long v17, v17, v19

    .line 277
    .line 278
    if-nez v17, :cond_8

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_9
    const/16 v16, 0x0

    .line 282
    .line 283
    :goto_7
    check-cast v16, Lx6/k;

    .line 284
    .line 285
    const-string v2, ""

    .line 286
    .line 287
    if-eqz v16, :cond_c

    .line 288
    .line 289
    invoke-virtual/range {v16 .. v16}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    if-eqz v10, :cond_c

    .line 294
    .line 295
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    move-object/from16 v18, v1

    .line 300
    .line 301
    const/4 v1, 0x0

    .line 302
    :goto_8
    if-ge v1, v5, :cond_b

    .line 303
    .line 304
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v19

    .line 308
    add-int/lit8 v1, v1, 0x1

    .line 309
    .line 310
    move-object/from16 v20, v19

    .line 311
    .line 312
    check-cast v20, Lx6/a;

    .line 313
    .line 314
    move/from16 v21, v1

    .line 315
    .line 316
    invoke-virtual/range {v20 .. v20}, Lx6/a;->f()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    move-object/from16 v22, v2

    .line 321
    .line 322
    invoke-virtual {v15}, Lx6/a;->f()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_a

    .line 331
    .line 332
    invoke-virtual/range {v20 .. v20}, Lx6/a;->c()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    invoke-virtual {v15}, Lx6/a;->c()I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-ne v1, v2, :cond_a

    .line 341
    .line 342
    goto :goto_9

    .line 343
    :cond_a
    move/from16 v1, v21

    .line 344
    .line 345
    move-object/from16 v2, v22

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_b
    move-object/from16 v22, v2

    .line 349
    .line 350
    const/16 v19, 0x0

    .line 351
    .line 352
    :goto_9
    check-cast v19, Lx6/a;

    .line 353
    .line 354
    if-eqz v19, :cond_d

    .line 355
    .line 356
    invoke-virtual/range {v19 .. v19}, Lx6/a;->d()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-eqz v1, :cond_d

    .line 361
    .line 362
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    check-cast v1, Ljava/lang/String;

    .line 367
    .line 368
    if-eqz v1, :cond_d

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_c
    move-object/from16 v18, v1

    .line 372
    .line 373
    move-object/from16 v22, v2

    .line 374
    .line 375
    :cond_d
    move-object/from16 v1, v22

    .line 376
    .line 377
    :goto_a
    invoke-virtual {v15}, Lx6/a;->f()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 386
    .line 387
    if-eqz v2, :cond_e

    .line 388
    .line 389
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    sget-object v5, Lm5/e$b;->b:Lm5/e$b;

    .line 394
    .line 395
    invoke-virtual {v5}, Lm5/e;->a()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    if-ne v2, v5, :cond_e

    .line 400
    .line 401
    const/4 v2, 0x1

    .line 402
    goto :goto_b

    .line 403
    :cond_e
    const/4 v2, 0x0

    .line 404
    :goto_b
    invoke-virtual {v15}, Lx6/a;->f()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    check-cast v5, Lcom/zykj/evaluation/bean/UploadData;

    .line 413
    .line 414
    if-eqz v5, :cond_f

    .line 415
    .line 416
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    sget-object v10, Lm5/e$a;->b:Lm5/e$a;

    .line 421
    .line 422
    invoke-virtual {v10}, Lm5/e;->a()I

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    if-ne v5, v10, :cond_f

    .line 427
    .line 428
    goto :goto_c

    .line 429
    :cond_f
    invoke-virtual {v15}, Lx6/a;->f()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    check-cast v5, Lcom/zykj/evaluation/bean/UploadData;

    .line 438
    .line 439
    if-eqz v5, :cond_11

    .line 440
    .line 441
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    sget-object v10, Lm5/e$c;->b:Lm5/e$c;

    .line 446
    .line 447
    invoke-virtual {v10}, Lm5/e;->a()I

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    if-ne v5, v10, :cond_11

    .line 452
    .line 453
    :goto_c
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    aget-object v5, v5, v7

    .line 458
    .line 459
    if-eqz v5, :cond_11

    .line 460
    .line 461
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    if-nez v5, :cond_10

    .line 466
    .line 467
    goto :goto_d

    .line 468
    :cond_10
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    aput-object v22, v5, v7

    .line 473
    .line 474
    :cond_11
    :goto_d
    iget-object v5, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H:Ljava/util/Map;

    .line 475
    .line 476
    invoke-virtual {v15}, Lx6/a;->f()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v10

    .line 480
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v19

    .line 484
    if-nez v19, :cond_13

    .line 485
    .line 486
    new-instance v20, Lx6/m;

    .line 487
    .line 488
    invoke-virtual {v11}, Lx6/k;->d()J

    .line 489
    .line 490
    .line 491
    move-result-wide v21

    .line 492
    invoke-virtual {v15}, Lx6/a;->f()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v23

    .line 496
    if-eqz v2, :cond_12

    .line 497
    .line 498
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    if-lez v2, :cond_12

    .line 503
    .line 504
    const/16 v24, 0x1

    .line 505
    .line 506
    goto :goto_e

    .line 507
    :cond_12
    const/16 v24, 0x0

    .line 508
    .line 509
    :goto_e
    const/16 v26, 0x8

    .line 510
    .line 511
    const/16 v27, 0x0

    .line 512
    .line 513
    const/16 v25, 0x0

    .line 514
    .line 515
    invoke-direct/range {v20 .. v27}, Lx6/m;-><init>(JLjava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 516
    .line 517
    .line 518
    move-object/from16 v2, v20

    .line 519
    .line 520
    invoke-interface {v5, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-object/from16 v19, v2

    .line 524
    .line 525
    :cond_13
    move-object/from16 v2, v19

    .line 526
    .line 527
    check-cast v2, Lx6/m;

    .line 528
    .line 529
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    if-nez v5, :cond_14

    .line 534
    .line 535
    const/4 v5, 0x0

    .line 536
    invoke-virtual {v2, v5}, Lx6/m;->d(Z)V

    .line 537
    .line 538
    .line 539
    goto :goto_f

    .line 540
    :cond_14
    const/4 v5, 0x0

    .line 541
    :goto_f
    invoke-virtual {v2}, Lx6/m;->a()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    new-instance v10, Lx6/l;

    .line 546
    .line 547
    invoke-virtual {v15}, Lx6/a;->c()I

    .line 548
    .line 549
    .line 550
    move-result v15

    .line 551
    invoke-direct {v10, v1, v7, v15}, Lx6/l;-><init>(Ljava/lang/String;II)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    goto :goto_10

    .line 558
    :cond_15
    move-object/from16 v18, v1

    .line 559
    .line 560
    const/4 v5, 0x0

    .line 561
    :goto_10
    move-object/from16 v1, v18

    .line 562
    .line 563
    const/4 v10, 0x1

    .line 564
    goto/16 :goto_6

    .line 565
    .line 566
    :cond_16
    const/4 v5, 0x0

    .line 567
    goto/16 :goto_5

    .line 568
    .line 569
    :cond_17
    move-object/from16 v18, v1

    .line 570
    .line 571
    const/4 v5, 0x0

    .line 572
    add-int/lit8 v6, v6, 0x1

    .line 573
    .line 574
    move v7, v9

    .line 575
    const/4 v10, 0x1

    .line 576
    goto/16 :goto_4

    .line 577
    .line 578
    :cond_18
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v1
.end method

.method public final a1()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->C:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K:[Lkotlin/reflect/KProperty;

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

.method public final b1(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->f:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/graphics/Bitmap;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, [Ljava/lang/String;

    .line 45
    .line 46
    iget-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object p3, Lg7/a;->a:Lg7/a;

    .line 66
    .line 67
    array-length v2, p2

    .line 68
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, [Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p3, v2}, Lg7/a;->f([Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v4, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$2;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-direct {v4, p3, p1, v5}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$2;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 86
    .line 87
    .line 88
    iput-object p1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->a:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->c:Ljava/lang/Object;

    .line 101
    .line 102
    iput v3, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$mergeBitmap$1;->f:I

    .line 103
    .line 104
    invoke-static {v2, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-ne p2, v1, :cond_3

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_3
    return-object p1
.end method

.method public final c1(Lx6/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->x:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d1(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->C:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

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

.method public final e1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->y:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->K:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

.method public final f1(ILjava/lang/String;)V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J0()Lx6/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J0()Lx6/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lx6/b;->b()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_4

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    add-int/lit8 v7, v5, 0x1

    .line 41
    .line 42
    if-gez v5, :cond_0

    .line 43
    .line 44
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 45
    .line 46
    .line 47
    :cond_0
    move-object v8, v6

    .line 48
    check-cast v8, Lx6/d;

    .line 49
    .line 50
    move/from16 v6, p1

    .line 51
    .line 52
    if-ne v5, v6, :cond_3

    .line 53
    .line 54
    invoke-virtual {v8}, Lx6/d;->e()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-instance v13, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    invoke-direct {v13, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_2

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    check-cast v9, Lx6/c;

    .line 82
    .line 83
    invoke-virtual {v9}, Lx6/c;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    const/4 v11, 0x2

    .line 88
    const/4 v12, 0x0

    .line 89
    move-object/from16 v14, p2

    .line 90
    .line 91
    invoke-static {v14, v10, v4, v11, v12}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_1

    .line 96
    .line 97
    sget-object v10, Lv6/l0$b;->c:Lv6/l0$b;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_1
    sget-object v10, Lv6/l0$a;->c:Lv6/l0$a;

    .line 101
    .line 102
    :goto_2
    const/4 v11, 0x1

    .line 103
    invoke-static {v9, v12, v10, v11, v12}, Lx6/c;->b(Lx6/c;Ljava/lang/String;Lv6/l0;ILjava/lang/Object;)Lx6/c;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-interface {v13, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move-object/from16 v14, p2

    .line 112
    .line 113
    const/16 v17, 0x6f

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v10, 0x0

    .line 119
    const/4 v11, 0x0

    .line 120
    const/4 v12, 0x0

    .line 121
    const-wide/16 v14, 0x0

    .line 122
    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    invoke-static/range {v8 .. v18}, Lx6/d;->b(Lx6/d;ZIIZLjava/util/List;JLjava/lang/String;ILjava/lang/Object;)Lx6/d;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    goto :goto_3

    .line 130
    :cond_3
    const/16 v17, 0x7f

    .line 131
    .line 132
    const/16 v18, 0x0

    .line 133
    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    const/4 v13, 0x0

    .line 139
    const-wide/16 v14, 0x0

    .line 140
    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    invoke-static/range {v8 .. v18}, Lx6/d;->b(Lx6/d;ZIIZLjava/util/List;JLjava/lang/String;ILjava/lang/Object;)Lx6/d;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    :goto_3
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move v5, v7

    .line 151
    goto :goto_0

    .line 152
    :cond_4
    invoke-virtual {v0, v2}, Lx6/b;->a(Ljava/util/List;)Lx6/b;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object/from16 v1, p0

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->c1(Lx6/b;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method public final g1(Ljava/util/List;)V
    .locals 17

    .line 1
    const-string v0, "correctQuestionList"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/a;->c()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_9

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v5, v4

    .line 46
    check-cast v5, Le7/b;

    .line 47
    .line 48
    new-instance v4, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    move-object v8, v7

    .line 68
    check-cast v8, Lx6/d;

    .line 69
    .line 70
    invoke-virtual {v8}, Lx6/d;->f()J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    invoke-virtual {v5}, Le7/b;->g()J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    cmp-long v8, v8, v10

    .line 79
    .line 80
    if-nez v8, :cond_0

    .line 81
    .line 82
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_8

    .line 91
    .line 92
    invoke-virtual {v5}, Le7/b;->c()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    new-instance v8, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_7

    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    move-object v9, v7

    .line 120
    check-cast v9, Le7/c;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    const/4 v10, 0x0

    .line 127
    :cond_2
    if-ge v10, v7, :cond_3

    .line 128
    .line 129
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    add-int/lit8 v10, v10, 0x1

    .line 134
    .line 135
    move-object v12, v11

    .line 136
    check-cast v12, Lx6/d;

    .line 137
    .line 138
    invoke-virtual {v12}, Lx6/d;->g()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    invoke-virtual {v9}, Le7/c;->g()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_2

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    const/4 v11, 0x0

    .line 154
    :goto_3
    check-cast v11, Lx6/d;

    .line 155
    .line 156
    if-eqz v11, :cond_6

    .line 157
    .line 158
    new-instance v7, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11}, Lx6/d;->e()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    :cond_4
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    if-eqz v11, :cond_5

    .line 176
    .line 177
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    check-cast v11, Lx6/c;

    .line 182
    .line 183
    invoke-virtual {v11}, Lx6/c;->d()Lv6/l0;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    instance-of v12, v12, Lv6/l0$b;

    .line 188
    .line 189
    if-eqz v12, :cond_4

    .line 190
    .line 191
    invoke-virtual {v11}, Lx6/c;->c()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_5
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    const-string v7, "toString(...)"

    .line 204
    .line 205
    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const/16 v15, 0x1d

    .line 209
    .line 210
    const/16 v16, 0x0

    .line 211
    .line 212
    const/4 v10, 0x0

    .line 213
    const/4 v12, 0x0

    .line 214
    const/4 v13, 0x0

    .line 215
    const/4 v14, 0x0

    .line 216
    invoke-static/range {v9 .. v16}, Le7/c;->b(Le7/c;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;ILjava/lang/Object;)Le7/c;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    goto :goto_5

    .line 221
    :cond_6
    const/16 v15, 0x1f

    .line 222
    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    const/4 v10, 0x0

    .line 226
    const/4 v11, 0x0

    .line 227
    const/4 v12, 0x0

    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    invoke-static/range {v9 .. v16}, Le7/c;->b(Le7/c;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;ILjava/lang/Object;)Le7/c;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    :goto_5
    invoke-interface {v8, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_7
    const/16 v13, 0x3d

    .line 240
    .line 241
    const/4 v14, 0x0

    .line 242
    const-wide/16 v6, 0x0

    .line 243
    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v10, 0x0

    .line 246
    const/4 v11, 0x0

    .line 247
    const/4 v12, 0x0

    .line 248
    invoke-static/range {v5 .. v14}, Le7/b;->b(Le7/b;JLjava/util/List;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/lang/String;IIILjava/lang/Object;)Le7/b;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    goto :goto_6

    .line 253
    :cond_8
    const/16 v13, 0x3f

    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const-wide/16 v6, 0x0

    .line 257
    .line 258
    const/4 v8, 0x0

    .line 259
    const/4 v9, 0x0

    .line 260
    const/4 v10, 0x0

    .line 261
    const/4 v11, 0x0

    .line 262
    const/4 v12, 0x0

    .line 263
    invoke-static/range {v5 .. v14}, Le7/b;->b(Le7/b;JLjava/util/List;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/lang/String;IIILjava/lang/Object;)Le7/b;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    :goto_6
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_9
    const/16 v8, 0x3d

    .line 273
    .line 274
    const/4 v9, 0x0

    .line 275
    const/4 v2, 0x0

    .line 276
    const/4 v4, 0x0

    .line 277
    const/4 v5, 0x0

    .line 278
    const/4 v6, 0x0

    .line 279
    const/4 v7, 0x0

    .line 280
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    move-object/from16 v1, p0

    .line 285
    .line 286
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public final i1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->j:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->j:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->j:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v7, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    iget v4, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->f:I

    .line 64
    .line 65
    iget-object v8, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, Lx6/m;

    .line 68
    .line 69
    iget-object v9, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v9, Ljava/util/Iterator;

    .line 72
    .line 73
    iget-object v10, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v10, Ljava/lang/Iterable;

    .line 76
    .line 77
    iget-object v11, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v11, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-object v4, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H:Ljava/util/Map;

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/lang/Iterable;

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    move-object v15, v1

    .line 107
    move-object v10, v4

    .line 108
    move v4, v6

    .line 109
    move-object v9, v8

    .line 110
    :cond_4
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move-object v8, v1

    .line 121
    check-cast v8, Lx6/m;

    .line 122
    .line 123
    invoke-virtual {v8}, Lx6/m;->a()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-nez v11, :cond_4

    .line 132
    .line 133
    invoke-virtual {v8}, Lx6/m;->a()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    if-eqz v11, :cond_5

    .line 138
    .line 139
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-eqz v12, :cond_5

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_6

    .line 155
    .line 156
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v12

    .line 160
    check-cast v12, Lx6/l;

    .line 161
    .line 162
    invoke-virtual {v12}, Lx6/l;->b()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-lez v12, :cond_4

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_6
    :goto_3
    invoke-virtual {v8}, Lx6/m;->c()Z

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    if-nez v11, :cond_4

    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->M0()I

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    invoke-virtual {v8}, Lx6/m;->b()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    const/4 v14, -0x1

    .line 192
    invoke-virtual {v11, v12, v13, v14, v14}, Lg7/e;->c(ILjava/lang/String;II)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v8}, Lx6/m;->a()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    new-instance v13, Ljava/util/ArrayList;

    .line 201
    .line 202
    const/16 v14, 0xa

    .line 203
    .line 204
    invoke-static {v12, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-eqz v14, :cond_7

    .line 220
    .line 221
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v14

    .line 225
    check-cast v14, Lx6/l;

    .line 226
    .line 227
    invoke-virtual {v14}, Lx6/l;->b()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    new-array v12, v6, [Ljava/lang/String;

    .line 236
    .line 237
    invoke-interface {v13, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    check-cast v12, [Ljava/lang/String;

    .line 242
    .line 243
    array-length v13, v12

    .line 244
    invoke-static {v12, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    check-cast v12, [Ljava/lang/String;

    .line 249
    .line 250
    iput-object v15, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->a:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    iput-object v13, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->b:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v9, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->c:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iput-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->d:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v8, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->e:Ljava/lang/Object;

    .line 267
    .line 268
    iput v4, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->f:I

    .line 269
    .line 270
    iput v6, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->g:I

    .line 271
    .line 272
    iput v7, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->j:I

    .line 273
    .line 274
    invoke-virtual {v0, v11, v12, v2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->b1(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-ne v1, v3, :cond_8

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_8
    move-object v11, v15

    .line 282
    :goto_5
    move-object v14, v1

    .line 283
    check-cast v14, Ljava/lang/String;

    .line 284
    .line 285
    new-instance v12, Lcom/zykj/evaluation/bean/UploadData;

    .line 286
    .line 287
    invoke-virtual {v8}, Lx6/m;->b()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v13

    .line 291
    sget-object v1, Lm5/e$c;->b:Lm5/e$c;

    .line 292
    .line 293
    invoke-virtual {v1}, Lm5/e;->a()I

    .line 294
    .line 295
    .line 296
    move-result v16

    .line 297
    const/16 v17, 0x4

    .line 298
    .line 299
    const/16 v18, 0x0

    .line 300
    .line 301
    const/4 v15, 0x0

    .line 302
    invoke-direct/range {v12 .. v18}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    invoke-virtual {v8, v7}, Lx6/m;->d(Z)V

    .line 309
    .line 310
    .line 311
    move-object v15, v11

    .line 312
    goto/16 :goto_1

    .line 313
    .line 314
    :cond_9
    iget-object v9, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->u:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 315
    .line 316
    iget-object v1, v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->t:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 317
    .line 318
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 323
    .line 324
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    const-string v4, "getId(...)"

    .line 329
    .line 330
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide v10

    .line 337
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->A()J

    .line 338
    .line 339
    .line 340
    move-result-wide v12

    .line 341
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->B()I

    .line 342
    .line 343
    .line 344
    move-result v14

    .line 345
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    iput-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->a:Ljava/lang/Object;

    .line 350
    .line 351
    const/4 v1, 0x0

    .line 352
    iput-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->b:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->c:Ljava/lang/Object;

    .line 355
    .line 356
    iput-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->d:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v1, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->e:Ljava/lang/Object;

    .line 359
    .line 360
    iput v5, v2, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$uploadAnswer$1;->j:I

    .line 361
    .line 362
    move-object/from16 v16, v2

    .line 363
    .line 364
    invoke-virtual/range {v9 .. v16}, Lcom/zykj/evaluation/upload/OssTaskManger;->w(JJILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    if-ne v1, v3, :cond_a

    .line 369
    .line 370
    :goto_6
    return-object v3

    .line 371
    :cond_a
    :goto_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 372
    .line 373
    return-object v1
.end method

.method public q(I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F:[Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "answerInfoArray"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    aget-object v3, v0, p1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/a;->e()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lv6/z;

    .line 26
    .line 27
    invoke-virtual {p1}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    instance-of v0, p1, Lcom/zykj/evaluation/ui/sheet/c$a$b;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object p1, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 36
    .line 37
    :goto_0
    move-object v5, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    instance-of p1, p1, Lcom/zykj/evaluation/ui/sheet/c$a$a;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    sget-object p1, Lcom/zykj/evaluation/ui/sheet/b$b;->b:Lcom/zykj/evaluation/ui/sheet/b$b;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p1, Lcom/zykj/evaluation/ui/sheet/b$a;->b:Lcom/zykj/evaluation/ui/sheet/b$a;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/16 v8, 0x35

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v2, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public r(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "failedCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v7, p0, p2, p1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$commit$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/16 v8, 0x1f

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public s(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->I0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y0(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljava/util/Set;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_11

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v4, v2, 0x1

    .line 23
    .line 24
    if-gez v2, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 27
    .line 28
    .line 29
    :cond_0
    check-cast v3, Le7/b;

    .line 30
    .line 31
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Le7/b;

    .line 36
    .line 37
    invoke-virtual {v3}, Le7/b;->c()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    move v6, v1

    .line 46
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_10

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    add-int/lit8 v8, v6, 0x1

    .line 57
    .line 58
    if-gez v6, :cond_1

    .line 59
    .line 60
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 61
    .line 62
    .line 63
    :cond_1
    check-cast v7, Le7/c;

    .line 64
    .line 65
    invoke-virtual {v7}, Le7/c;->g()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-interface {p3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    check-cast v9, Lx6/a;

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    if-eqz v9, :cond_2

    .line 77
    .line 78
    invoke-virtual {v9}, Lx6/a;->d()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move-object v9, v10

    .line 84
    :goto_2
    if-eqz v9, :cond_5

    .line 85
    .line 86
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    iget-boolean v9, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J:Z

    .line 94
    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move v9, v1

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    :goto_3
    const/4 v9, 0x1

    .line 101
    :goto_4
    if-eqz v2, :cond_6

    .line 102
    .line 103
    invoke-virtual {v2}, Le7/b;->c()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    if-eqz v11, :cond_6

    .line 108
    .line 109
    invoke-static {v11, v6}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Le7/c;

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_6
    move-object v6, v10

    .line 117
    :goto_5
    invoke-virtual {v7}, Le7/c;->f()Lcom/zykj/evaluation/bean/PaperSelect;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    if-eqz v11, :cond_9

    .line 122
    .line 123
    if-nez v9, :cond_8

    .line 124
    .line 125
    invoke-virtual {v7}, Le7/c;->f()Lcom/zykj/evaluation/bean/PaperSelect;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/PaperSelect;->getPosition()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    if-eqz v6, :cond_7

    .line 134
    .line 135
    invoke-virtual {v6}, Le7/c;->f()Lcom/zykj/evaluation/bean/PaperSelect;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    if-eqz v6, :cond_7

    .line 140
    .line 141
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/PaperSelect;->getPosition()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    :cond_7
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_c

    .line 150
    .line 151
    :cond_8
    invoke-virtual {v7}, Le7/c;->g()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_9
    invoke-virtual {v7}, Le7/c;->d()Lcom/zykj/evaluation/bean/PaperBlank;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    if-eqz v11, :cond_d

    .line 164
    .line 165
    if-nez v9, :cond_b

    .line 166
    .line 167
    invoke-virtual {v7}, Le7/c;->d()Lcom/zykj/evaluation/bean/PaperBlank;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/PaperBlank;->getPosition()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    if-eqz v6, :cond_a

    .line 176
    .line 177
    invoke-virtual {v6}, Le7/c;->d()Lcom/zykj/evaluation/bean/PaperBlank;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    if-eqz v6, :cond_a

    .line 182
    .line 183
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/PaperBlank;->getPosition()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    :cond_a
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-nez v6, :cond_c

    .line 192
    .line 193
    :cond_b
    invoke-virtual {v7}, Le7/c;->g()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    :cond_c
    :goto_6
    move v6, v8

    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :cond_d
    if-nez v9, :cond_f

    .line 204
    .line 205
    invoke-virtual {v3}, Le7/b;->f()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    if-eqz v2, :cond_e

    .line 210
    .line 211
    invoke-virtual {v2}, Le7/b;->f()Lcom/zykj/evaluation/bean/PaperPosition;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    :cond_e
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-nez v2, :cond_10

    .line 220
    .line 221
    :cond_f
    invoke-virtual {v7}, Le7/c;->g()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_10
    move v2, v4

    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_11
    iput-boolean v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->J:Z

    .line 232
    .line 233
    return-object v0
.end method

.method public final z0([Ljava/util/List;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    array-length v2, v0

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v2, :cond_9

    .line 12
    .line 13
    aget-object v5, v0, v4

    .line 14
    .line 15
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-eqz v6, :cond_8

    .line 24
    .line 25
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    check-cast v6, Lx6/k;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    move v8, v3

    .line 36
    :cond_1
    const/4 v9, 0x0

    .line 37
    if-ge v8, v7, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    add-int/lit8 v8, v8, 0x1

    .line 44
    .line 45
    move-object v11, v10

    .line 46
    check-cast v11, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 47
    .line 48
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getQuestionId()J

    .line 49
    .line 50
    .line 51
    move-result-wide v11

    .line 52
    invoke-virtual {v6}, Lx6/k;->d()J

    .line 53
    .line 54
    .line 55
    move-result-wide v13

    .line 56
    cmp-long v11, v11, v13

    .line 57
    .line 58
    if-nez v11, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v10, v9

    .line 62
    :goto_1
    check-cast v10, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 63
    .line 64
    if-nez v10, :cond_3

    .line 65
    .line 66
    new-instance v11, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 67
    .line 68
    invoke-virtual {v6}, Lx6/k;->d()J

    .line 69
    .line 70
    .line 71
    move-result-wide v12

    .line 72
    const/16 v16, 0x6

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    invoke-direct/range {v11 .. v17}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-object v10, v11

    .line 85
    :cond_3
    invoke-virtual {v6}, Lx6/k;->c()Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    move v8, v3

    .line 94
    :cond_4
    :goto_2
    if-ge v8, v7, :cond_0

    .line 95
    .line 96
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    add-int/lit8 v8, v8, 0x1

    .line 101
    .line 102
    check-cast v11, Lx6/a;

    .line 103
    .line 104
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    :cond_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_6

    .line 117
    .line 118
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    move-object v14, v13

    .line 123
    check-cast v14, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 124
    .line 125
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/CommitAnswer;->getUuid()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    invoke-virtual {v11}, Lx6/a;->f()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-eqz v14, :cond_5

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    move-object v13, v9

    .line 141
    :goto_3
    check-cast v13, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 142
    .line 143
    if-nez v13, :cond_7

    .line 144
    .line 145
    new-instance v13, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 146
    .line 147
    invoke-virtual {v11}, Lx6/a;->f()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    const/4 v14, 0x2

    .line 152
    invoke-direct {v13, v12, v9, v14, v9}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-static {v12, v13}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    invoke-virtual {v10, v12}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->setAnswers(Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    invoke-virtual {v11}, Lx6/a;->g()Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-nez v12, :cond_4

    .line 171
    .line 172
    invoke-virtual {v11}, Lx6/a;->d()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-virtual {v13, v11}, Lcom/zykj/evaluation/bean/CommitAnswer;->setAnswers(Ljava/util/List;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_9
    return-object v1
.end method
