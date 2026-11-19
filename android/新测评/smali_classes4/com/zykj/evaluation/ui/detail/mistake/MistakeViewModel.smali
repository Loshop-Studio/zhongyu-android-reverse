.class public final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;
.super Lcom/zykj/evaluation/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00086\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001f\u0010 J%\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001c\u00a2\u0006\u0004\u0008&\u0010\'J\u0015\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+J\u001b\u0010.\u001a\u00020\r2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\r0,\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200\u00a2\u0006\u0004\u00082\u00103J\u0015\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000b\u00a2\u0006\u0004\u00085\u0010\u000fJ\u0015\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013\u00a2\u0006\u0004\u00087\u00108J\r\u00109\u001a\u00020\r\u00a2\u0006\u0004\u00089\u0010\u0011J\u0015\u0010:\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013\u00a2\u0006\u0004\u0008:\u00108J\u0015\u0010;\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013\u00a2\u0006\u0004\u0008;\u00108J\u0015\u0010<\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013\u00a2\u0006\u0004\u0008<\u00108J\u0015\u0010=\u001a\u00020\r2\u0006\u00106\u001a\u00020\u0013\u00a2\u0006\u0004\u0008=\u00108J\r\u0010>\u001a\u00020\r\u00a2\u0006\u0004\u0008>\u0010\u0011J\r\u0010?\u001a\u00020\r\u00a2\u0006\u0004\u0008?\u0010\u0011R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010G\u001a\u00020#8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008F\u0010\u0010R+\u0010O\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR+\u0010U\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008P\u0010J\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR+\u0010Y\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008V\u0010J\u001a\u0004\u0008W\u0010L\"\u0004\u0008X\u0010NR+\u0010]\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u00158B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008Z\u0010J\u001a\u0004\u0008[\u0010R\"\u0004\u0008\\\u0010TR+\u0010a\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008^\u0010J\u001a\u0004\u0008_\u0010L\"\u0004\u0008`\u0010NR+\u0010f\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008b\u0010J\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010\u000fR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u001a\u0010m\u001a\u0008\u0012\u0004\u0012\u00020k0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010AR\u001d\u0010s\u001a\u0008\u0012\u0004\u0012\u00020k0n8\u0006\u00a2\u0006\u000c\n\u0004\u0008o\u0010p\u001a\u0004\u0008q\u0010r\u00a8\u0006t"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;",
        "Lcom/zykj/evaluation/base/BaseViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lp5/j;",
        "service",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lcom/zykj/evaluation/upload/OssTaskManger;)V",
        "",
        "stemLocalPath",
        "",
        "J",
        "(Ljava/lang/String;)V",
        "I",
        "()V",
        "",
        "Lcom/zykj/evaluation/ui/detail/mistake/TagData;",
        "list",
        "",
        "v",
        "(Ljava/util/List;)Z",
        "Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;",
        "mistakeDataBundle",
        "H",
        "(Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;)V",
        "",
        "tagId",
        "newName",
        "y",
        "(JLjava/lang/String;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "index",
        "startTime",
        "L",
        "(Landroid/graphics/Bitmap;IJ)V",
        "Lz5/f;",
        "deleteStem",
        "z",
        "(Lz5/f;)V",
        "Lkotlin/Function0;",
        "callback",
        "a0",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Lz5/t1;",
        "topicData",
        "Z",
        "(Lz5/t1;)V",
        "title",
        "Y",
        "tag",
        "x",
        "(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V",
        "S",
        "V",
        "T",
        "W",
        "U",
        "K",
        "X",
        "c",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "d",
        "Lp5/j;",
        "e",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "f",
        "mMaxSelectedTagNum",
        "<set-?>",
        "g",
        "Lkotlin/properties/ReadWriteProperty;",
        "A",
        "()J",
        "M",
        "(J)V",
        "mExamId",
        "h",
        "C",
        "()Z",
        "O",
        "(Z)V",
        "mIsRelatedGroup",
        "i",
        "E",
        "Q",
        "mQuestionId",
        "j",
        "D",
        "P",
        "mIsStem",
        "k",
        "F",
        "R",
        "mTopicId",
        "l",
        "B",
        "()Ljava/lang/String;",
        "N",
        "mExamName",
        "Lg7/e;",
        "m",
        "Lg7/e;",
        "mPathManager",
        "Lz5/l1;",
        "n",
        "_mistakeUiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "o",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "G",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "mistakeUiState",
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
        "SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,5:586\n230#2,5:597\n230#2,5:602\n230#2,3:607\n233#2,2:612\n230#2,3:614\n233#2,2:645\n230#2,3:647\n233#2,2:654\n230#2,3:656\n233#2,2:663\n230#2,3:665\n233#2,2:672\n230#2,3:674\n233#2,2:681\n230#2,3:683\n233#2,2:702\n230#2,3:704\n233#2,2:715\n1563#3:591\n1634#3,3:592\n1869#3,2:595\n1869#3,2:610\n1563#3:617\n1634#3,2:618\n1761#3,3:620\n1636#3:623\n1563#3:624\n1634#3,2:625\n1761#3,3:627\n1636#3:630\n1563#3:631\n1634#3,2:632\n1761#3,3:634\n1636#3:637\n1563#3:638\n1634#3,2:639\n1761#3,3:641\n1636#3:644\n1563#3:650\n1634#3,3:651\n1563#3:659\n1634#3,3:660\n1563#3:668\n1634#3,3:669\n1563#3:677\n1634#3,3:678\n1563#3:686\n1634#3,3:687\n1563#3:690\n1634#3,3:691\n1563#3:694\n1634#3,3:695\n1563#3:698\n1634#3,3:699\n1869#3,2:707\n1869#3,2:709\n1869#3,2:711\n1869#3,2:713\n1869#3,2:717\n1869#3,2:719\n1869#3,2:721\n1869#3,2:723\n1740#3,3:725\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel\n*L\n87#1:586,5\n333#1:597,5\n345#1:602,5\n357#1:607,3\n357#1:612,2\n378#1:614,3\n378#1:645,2\n427#1:647,3\n427#1:654,2\n450#1:656,3\n450#1:663,2\n473#1:665,3\n473#1:672,2\n494#1:674,3\n494#1:681,2\n511#1:683,3\n511#1:702,2\n534#1:704,3\n534#1:715,2\n269#1:591\n269#1:592,3\n270#1:595,2\n361#1:610,2\n382#1:617\n382#1:618,2\n383#1:620,3\n382#1:623\n389#1:624\n389#1:625,2\n390#1:627,3\n389#1:630\n396#1:631\n396#1:632,2\n397#1:634,3\n396#1:637\n403#1:638\n403#1:639,2\n404#1:641,3\n403#1:644\n429#1:650\n429#1:651,3\n452#1:659\n452#1:660,3\n475#1:668\n475#1:669,3\n496#1:677\n496#1:678,3\n513#1:686\n513#1:687,3\n516#1:690\n516#1:691,3\n519#1:694\n519#1:695,3\n522#1:698\n522#1:699,3\n537#1:707,2\n540#1:709,2\n544#1:711,2\n547#1:713,2\n569#1:717,2\n572#1:719,2\n575#1:721,2\n578#1:723,2\n581#1:725,3\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic p:[Lkotlin/reflect/KProperty;

.field public static final q:I


# instance fields
.field public final c:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final d:Lp5/j;

.field public final e:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final f:I

.field public final g:Lkotlin/properties/ReadWriteProperty;

.field public final h:Lkotlin/properties/ReadWriteProperty;

.field public final i:Lkotlin/properties/ReadWriteProperty;

.field public final j:Lkotlin/properties/ReadWriteProperty;

.field public final k:Lkotlin/properties/ReadWriteProperty;

.field public final l:Lkotlin/properties/ReadWriteProperty;

.field public m:Lg7/e;

.field public final n:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final o:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    const-string v2, "mExamId"

    const-string v3, "getMExamId()J"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v3, "mIsRelatedGroup"

    const-string v5, "getMIsRelatedGroup()Z"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v5, "mQuestionId"

    const-string v6, "getMQuestionId()J"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v6, "mIsStem"

    const-string v7, "getMIsStem()Z"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v7, "mTopicId"

    const-string v8, "getMTopicId()J"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v8, "mExamName"

    const-string v9, "getMExamName()Ljava/lang/String;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v7, 0x6

    new-array v7, v7, [Lkotlin/reflect/KProperty;

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v5, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v1, v7, v0

    sput-object v7, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->q:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lcom/zykj/evaluation/upload/OssTaskManger;)V
    .locals 17

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "userInfo"

    .line 10
    .line 11
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "service"

    .line 15
    .line 16
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "ossTaskManger"

    .line 20
    .line 21
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lcom/zykj/evaluation/base/BaseViewModel;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 28
    .line 29
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->d:Lp5/j;

    .line 30
    .line 31
    iput-object v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->e:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 32
    .line 33
    const/4 v1, 0x5

    .line 34
    iput v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->f:I

    .line 35
    .line 36
    sget-object v1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 37
    .line 38
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 43
    .line 44
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 49
    .line 50
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->i:Lkotlin/properties/ReadWriteProperty;

    .line 55
    .line 56
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->j:Lkotlin/properties/ReadWriteProperty;

    .line 61
    .line 62
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iput-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->k:Lkotlin/properties/ReadWriteProperty;

    .line 67
    .line 68
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->l:Lkotlin/properties/ReadWriteProperty;

    .line 73
    .line 74
    new-instance v2, Lz5/l1;

    .line 75
    .line 76
    const/16 v15, 0x7ff

    .line 77
    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const-wide/16 v4, 0x0

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    invoke-direct/range {v2 .. v16}, Lz5/l1;-><init>(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 100
    .line 101
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->o:Lkotlinx/coroutines/flow/StateFlow;

    .line 106
    .line 107
    return-void
.end method

.method private final A()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method private final B()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->l:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method private final F()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->k:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method private final M(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method private final N(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->l:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final R(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->k:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

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

.method public static final synthetic m(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->A()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic n(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->B()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->C()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic p(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->D()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic q(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lg7/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->m:Lg7/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->E()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic s(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->e:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->d:Lp5/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Ljava/util/List;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->v(Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final C()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method public final D()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->j:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method public final E()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->i:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method public final G()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->o:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H(Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;)V
    .locals 7

    .line 1
    const-string v0, "mistakeDataBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->m:Lg7/e;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getExamId()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-direct {p0, v0, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->M(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->isRelatedGroup()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->O(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getQuestionId()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-virtual {p0, v0, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->Q(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getStemLocalPath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-lez v0, :cond_1

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :goto_0
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->P(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getTopicId()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-direct {p0, v0, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->R(J)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getExamName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->N(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Lg7/e;

    .line 63
    .line 64
    sget-object v2, Lcom/zykj/evaluation/bean/TaskState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Done;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 67
    .line 68
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lcom/zykj/message/server/bean/UserInfo;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v3, "getId(...)"

    .line 79
    .line 80
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getTaskId()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-direct/range {v1 .. v6}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 92
    .line 93
    .line 94
    iput-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->m:Lg7/e;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;->getStemLocalPath()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->J(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->I()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final I()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$initServerData$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final J(Ljava/lang/String;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lz5/l1;

    .line 11
    .line 12
    invoke-direct {v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->B()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    invoke-direct {v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->F()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    new-instance v9, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-lez v4, :cond_1

    .line 30
    .line 31
    new-instance v4, Lz5/f;

    .line 32
    .line 33
    const-string v7, ""

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v11, 0x1

    .line 37
    move-object/from16 v12, p1

    .line 38
    .line 39
    invoke-direct {v4, v11, v12, v7, v10}, Lz5/f;-><init>(ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object/from16 v12, p1

    .line 47
    .line 48
    new-instance v13, Lz5/f;

    .line 49
    .line 50
    const/16 v18, 0xf

    .line 51
    .line 52
    const/16 v19, 0x0

    .line 53
    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    invoke-direct/range {v13 .. v19}, Lz5/f;-><init>(ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance v14, Lz5/f;

    .line 67
    .line 68
    const/16 v19, 0xf

    .line 69
    .line 70
    const/16 v20, 0x0

    .line 71
    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v17, 0x0

    .line 74
    .line 75
    const/16 v18, 0x0

    .line 76
    .line 77
    invoke-direct/range {v14 .. v20}, Lz5/f;-><init>(ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :goto_0
    new-instance v15, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 84
    .line 85
    const/16 v20, 0x7

    .line 86
    .line 87
    const/16 v21, 0x0

    .line 88
    .line 89
    const-wide/16 v16, 0x0

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    invoke-direct/range {v15 .. v21}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    const/16 v16, 0x3e1

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    invoke-static/range {v3 .. v17}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_0

    .line 122
    .line 123
    return-void
.end method

.method public final K()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lz5/l1;

    .line 11
    .line 12
    invoke-virtual {v3}, Lz5/l1;->f()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    new-instance v11, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v5, 0xa

    .line 19
    .line 20
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    invoke-direct {v11, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    move-object v12, v6

    .line 42
    check-cast v12, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 43
    .line 44
    const/16 v17, 0x3

    .line 45
    .line 46
    const/16 v18, 0x0

    .line 47
    .line 48
    const-wide/16 v13, 0x0

    .line 49
    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    invoke-static/range {v12 .. v18}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v11, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v3}, Lz5/l1;->c()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    new-instance v12, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    move-object v13, v6

    .line 89
    check-cast v13, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 90
    .line 91
    const/16 v18, 0x3

    .line 92
    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    const-wide/16 v14, 0x0

    .line 96
    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    invoke-static/range {v13 .. v19}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    invoke-virtual {v3}, Lz5/l1;->g()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    new-instance v13, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_3

    .line 131
    .line 132
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    move-object v14, v6

    .line 137
    check-cast v14, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 138
    .line 139
    const/16 v19, 0x3

    .line 140
    .line 141
    const/16 v20, 0x0

    .line 142
    .line 143
    const-wide/16 v15, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/16 v18, 0x0

    .line 148
    .line 149
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-interface {v13, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_3
    invoke-virtual {v3}, Lz5/l1;->e()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    new-instance v14, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_4

    .line 179
    .line 180
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    move-object v15, v5

    .line 185
    check-cast v15, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 186
    .line 187
    const/16 v20, 0x3

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const-wide/16 v16, 0x0

    .line 192
    .line 193
    const/16 v18, 0x0

    .line 194
    .line 195
    const/16 v19, 0x0

    .line 196
    .line 197
    invoke-static/range {v15 .. v21}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-interface {v14, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    const/16 v16, 0x43f

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const/4 v4, 0x0

    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v15, 0x0

    .line 217
    invoke-static/range {v3 .. v17}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_0

    .line 226
    .line 227
    return-void
.end method

.method public final L(Landroid/graphics/Bitmap;IJ)V
    .locals 10

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move-object v4, p1

    .line 11
    move v3, p2

    .line 12
    move-wide v5, p3

    .line 13
    invoke-direct/range {v1 .. v7}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/graphics/Bitmap;JLkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/16 v8, 0x1f

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v7, v1

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final O(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method public final P(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->j:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

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

.method public final Q(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->i:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

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

.method public final S()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lz5/l1;

    .line 11
    .line 12
    invoke-virtual {v3}, Lz5/l1;->h()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v3}, Lz5/l1;->f()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    new-instance v11, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v6, 0xa

    .line 23
    .line 24
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-direct {v11, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_4

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    move-object v12, v7

    .line 46
    check-cast v12, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_3

    .line 66
    .line 67
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 72
    .line 73
    invoke-virtual {v12}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    cmp-long v9, v9, v13

    .line 82
    .line 83
    if-nez v9, :cond_2

    .line 84
    .line 85
    invoke-virtual {v12}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_2

    .line 98
    .line 99
    const/16 v17, 0x3

    .line 100
    .line 101
    const/16 v18, 0x0

    .line 102
    .line 103
    const-wide/16 v13, 0x0

    .line 104
    .line 105
    const/4 v15, 0x0

    .line 106
    const/16 v16, 0x1

    .line 107
    .line 108
    invoke-static/range {v12 .. v18}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    :goto_1
    const/16 v17, 0x3

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const-wide/16 v13, 0x0

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    invoke-static/range {v12 .. v18}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    :goto_2
    invoke-interface {v11, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    invoke-virtual {v3}, Lz5/l1;->c()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    new-instance v12, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    invoke-direct {v12, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-eqz v7, :cond_8

    .line 152
    .line 153
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    move-object v13, v7

    .line 158
    check-cast v13, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 159
    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_5

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_5
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_7

    .line 178
    .line 179
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 184
    .line 185
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 190
    .line 191
    .line 192
    move-result-wide v14

    .line 193
    cmp-long v9, v9, v14

    .line 194
    .line 195
    if-nez v9, :cond_6

    .line 196
    .line 197
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_6

    .line 210
    .line 211
    const/16 v18, 0x3

    .line 212
    .line 213
    const/16 v19, 0x0

    .line 214
    .line 215
    const-wide/16 v14, 0x0

    .line 216
    .line 217
    const/16 v16, 0x0

    .line 218
    .line 219
    const/16 v17, 0x1

    .line 220
    .line 221
    invoke-static/range {v13 .. v19}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    goto :goto_5

    .line 226
    :cond_7
    :goto_4
    const/16 v18, 0x3

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    const-wide/16 v14, 0x0

    .line 231
    .line 232
    const/16 v16, 0x0

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    invoke-static/range {v13 .. v19}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    :goto_5
    invoke-interface {v12, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_8
    invoke-virtual {v3}, Lz5/l1;->g()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    new-instance v13, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-direct {v13, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_c

    .line 266
    .line 267
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    move-object v14, v7

    .line 272
    check-cast v14, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 273
    .line 274
    if-eqz v4, :cond_9

    .line 275
    .line 276
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-eqz v7, :cond_9

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_9
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    if-eqz v8, :cond_b

    .line 292
    .line 293
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 298
    .line 299
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 300
    .line 301
    .line 302
    move-result-wide v9

    .line 303
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 304
    .line 305
    .line 306
    move-result-wide v15

    .line 307
    cmp-long v9, v9, v15

    .line 308
    .line 309
    if-nez v9, :cond_a

    .line 310
    .line 311
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    if-eqz v8, :cond_a

    .line 324
    .line 325
    const/16 v19, 0x3

    .line 326
    .line 327
    const/16 v20, 0x0

    .line 328
    .line 329
    const-wide/16 v15, 0x0

    .line 330
    .line 331
    const/16 v17, 0x0

    .line 332
    .line 333
    const/16 v18, 0x1

    .line 334
    .line 335
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    goto :goto_8

    .line 340
    :cond_b
    :goto_7
    const/16 v19, 0x3

    .line 341
    .line 342
    const/16 v20, 0x0

    .line 343
    .line 344
    const-wide/16 v15, 0x0

    .line 345
    .line 346
    const/16 v17, 0x0

    .line 347
    .line 348
    const/16 v18, 0x0

    .line 349
    .line 350
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    :goto_8
    invoke-interface {v13, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_c
    invoke-virtual {v3}, Lz5/l1;->e()Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    new-instance v14, Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    invoke-direct {v14, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    if-eqz v6, :cond_10

    .line 380
    .line 381
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    move-object v15, v6

    .line 386
    check-cast v15, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 387
    .line 388
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 389
    .line 390
    .line 391
    move-result-wide v6

    .line 392
    const-wide/16 v8, 0x0

    .line 393
    .line 394
    cmp-long v6, v6, v8

    .line 395
    .line 396
    if-eqz v6, :cond_f

    .line 397
    .line 398
    if-eqz v4, :cond_d

    .line 399
    .line 400
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    if-eqz v6, :cond_d

    .line 405
    .line 406
    goto :goto_a

    .line 407
    :cond_d
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-eqz v7, :cond_f

    .line 416
    .line 417
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    check-cast v7, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 422
    .line 423
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 424
    .line 425
    .line 426
    move-result-wide v8

    .line 427
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 428
    .line 429
    .line 430
    move-result-wide v16

    .line 431
    cmp-long v8, v8, v16

    .line 432
    .line 433
    if-nez v8, :cond_e

    .line 434
    .line 435
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    if-eqz v7, :cond_e

    .line 448
    .line 449
    const/16 v20, 0x3

    .line 450
    .line 451
    const/16 v21, 0x0

    .line 452
    .line 453
    const-wide/16 v16, 0x0

    .line 454
    .line 455
    const/16 v18, 0x0

    .line 456
    .line 457
    const/16 v19, 0x1

    .line 458
    .line 459
    invoke-static/range {v15 .. v21}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    goto :goto_b

    .line 464
    :cond_f
    :goto_a
    const/16 v20, 0x3

    .line 465
    .line 466
    const/16 v21, 0x0

    .line 467
    .line 468
    const-wide/16 v16, 0x0

    .line 469
    .line 470
    const/16 v18, 0x0

    .line 471
    .line 472
    const/16 v19, 0x0

    .line 473
    .line 474
    invoke-static/range {v15 .. v21}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    :goto_b
    invoke-interface {v14, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_10
    const/16 v16, 0x43f

    .line 483
    .line 484
    const/16 v17, 0x0

    .line 485
    .line 486
    const/4 v4, 0x0

    .line 487
    const-wide/16 v5, 0x0

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const/4 v8, 0x0

    .line 491
    const/4 v9, 0x0

    .line 492
    const/4 v10, 0x0

    .line 493
    const/4 v15, 0x0

    .line 494
    invoke-static/range {v3 .. v17}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    if-eqz v2, :cond_0

    .line 503
    .line 504
    return-void
.end method

.method public final T(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "tag"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lz5/l1;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lz5/l1;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->v(Ljava/util/List;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 36
    .line 37
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    move-object v4, v3

    .line 42
    check-cast v4, Lz5/l1;

    .line 43
    .line 44
    invoke-virtual {v4}, Lz5/l1;->c()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    new-instance v13, Ljava/util/ArrayList;

    .line 49
    .line 50
    const/16 v6, 0xa

    .line 51
    .line 52
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    move-object v14, v6

    .line 74
    check-cast v14, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    cmp-long v6, v6, v8

    .line 85
    .line 86
    if-nez v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    xor-int/lit8 v18, v6, 0x1

    .line 93
    .line 94
    const/16 v19, 0x3

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const-wide/16 v15, 0x0

    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    const/16 v19, 0x3

    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const-wide/16 v15, 0x0

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    :goto_1
    invoke-interface {v13, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    const/16 v17, 0x77f

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const-wide/16 v6, 0x0

    .line 131
    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    const/4 v14, 0x0

    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    invoke-static/range {v4 .. v18}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v1, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_1

    .line 150
    .line 151
    :goto_2
    return-void
.end method

.method public final U(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "tag"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v0, v1, v3, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->w(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Ljava/util/List;ILjava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 26
    .line 27
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    move-object v5, v4

    .line 32
    check-cast v5, Lz5/l1;

    .line 33
    .line 34
    invoke-virtual {v5}, Lz5/l1;->e()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-instance v7, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v8, 0xa

    .line 41
    .line 42
    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_3

    .line 58
    .line 59
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    move-object v9, v8

    .line 64
    check-cast v9, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    invoke-virtual {v9}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 71
    .line 72
    .line 73
    move-result-wide v12

    .line 74
    cmp-long v8, v10, v12

    .line 75
    .line 76
    if-nez v8, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    xor-int/lit8 v13, v8, 0x1

    .line 83
    .line 84
    const/4 v14, 0x3

    .line 85
    const/4 v15, 0x0

    .line 86
    const-wide/16 v10, 0x0

    .line 87
    .line 88
    const/4 v12, 0x0

    .line 89
    invoke-static/range {v9 .. v15}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    :cond_2
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    const/16 v18, 0x5ff

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    move-object/from16 v16, v7

    .line 103
    .line 104
    const-wide/16 v7, 0x0

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    invoke-static/range {v5 .. v19}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-interface {v1, v4, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_1

    .line 124
    .line 125
    :goto_1
    return-void
.end method

.method public final V(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "tag"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lz5/l1;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lz5/l1;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0, v3}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->v(Ljava/util/List;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    iget-object v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 36
    .line 37
    :cond_1
    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v5, v4

    .line 42
    check-cast v5, Lz5/l1;

    .line 43
    .line 44
    invoke-virtual {v1}, Lz5/l1;->f()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    new-instance v13, Ljava/util/ArrayList;

    .line 49
    .line 50
    const/16 v7, 0xa

    .line 51
    .line 52
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-direct {v13, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_3

    .line 68
    .line 69
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    move-object v14, v7

    .line 74
    check-cast v14, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 81
    .line 82
    .line 83
    move-result-wide v9

    .line 84
    cmp-long v7, v7, v9

    .line 85
    .line 86
    if-nez v7, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    xor-int/lit8 v18, v7, 0x1

    .line 93
    .line 94
    const/16 v19, 0x3

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const-wide/16 v15, 0x0

    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    const/16 v19, 0x3

    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const-wide/16 v15, 0x0

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    invoke-static/range {v14 .. v20}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    :goto_1
    invoke-interface {v13, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    const/16 v18, 0x7bf

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const-wide/16 v7, 0x0

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v12, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    const/4 v15, 0x0

    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    invoke-static/range {v5 .. v19}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-interface {v3, v4, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_1

    .line 151
    .line 152
    :goto_2
    return-void
.end method

.method public final W(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "tag"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lz5/l1;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lz5/l1;->g()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->v(Ljava/util/List;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 36
    .line 37
    :cond_1
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    move-object v4, v3

    .line 42
    check-cast v4, Lz5/l1;

    .line 43
    .line 44
    invoke-virtual {v4}, Lz5/l1;->g()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    new-instance v14, Ljava/util/ArrayList;

    .line 49
    .line 50
    const/16 v6, 0xa

    .line 51
    .line 52
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-direct {v14, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    move-object v7, v6

    .line 74
    check-cast v7, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 81
    .line 82
    .line 83
    move-result-wide v10

    .line 84
    cmp-long v6, v8, v10

    .line 85
    .line 86
    if-nez v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    xor-int/lit8 v11, v6, 0x1

    .line 93
    .line 94
    const/4 v12, 0x3

    .line 95
    const/4 v13, 0x0

    .line 96
    const-wide/16 v8, 0x0

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    invoke-static/range {v7 .. v13}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    const/4 v12, 0x3

    .line 105
    const/4 v13, 0x0

    .line 106
    const-wide/16 v8, 0x0

    .line 107
    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v11, 0x0

    .line 110
    invoke-static/range {v7 .. v13}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    :goto_1
    invoke-interface {v14, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    const/16 v17, 0x6ff

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    const-wide/16 v6, 0x0

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v9, 0x0

    .line 127
    const/4 v10, 0x0

    .line 128
    const/4 v11, 0x0

    .line 129
    const/4 v12, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v15, 0x0

    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    invoke-static/range {v4 .. v18}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-interface {v1, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_1

    .line 143
    .line 144
    :goto_2
    return-void
.end method

.method public final X()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lz5/l1;

    .line 11
    .line 12
    new-instance v15, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lz5/l1;->f()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 36
    .line 37
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {v3}, Lz5/l1;->c()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 66
    .line 67
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_3

    .line 72
    .line 73
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {v3}, Lz5/l1;->g()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_6

    .line 90
    .line 91
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 96
    .line 97
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_5

    .line 102
    .line 103
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {v3}, Lz5/l1;->e()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_8

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 126
    .line 127
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_7

    .line 132
    .line 133
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    iget v5, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->f:I

    .line 142
    .line 143
    if-ge v4, v5, :cond_9

    .line 144
    .line 145
    new-instance v6, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 146
    .line 147
    const/4 v11, 0x7

    .line 148
    const/4 v12, 0x0

    .line 149
    const-wide/16 v7, 0x0

    .line 150
    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    invoke-direct/range {v6 .. v12}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 154
    .line 155
    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-virtual {v15, v4, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 161
    .line 162
    const/16 v16, 0x3ff

    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const-wide/16 v5, 0x0

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    const/4 v11, 0x0

    .line 174
    const/4 v12, 0x0

    .line 175
    const/4 v13, 0x0

    .line 176
    const/4 v14, 0x0

    .line 177
    invoke-static/range {v3 .. v17}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_0

    .line 186
    .line 187
    return-void
.end method

.method public final Y(Ljava/lang/String;)V
    .locals 19

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p0

    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    :goto_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    move-object v3, v1

    .line 17
    move-object v1, v2

    .line 18
    check-cast v1, Lz5/l1;

    .line 19
    .line 20
    const/16 v14, 0x7f7

    .line 21
    .line 22
    const/4 v15, 0x0

    .line 23
    move-object v4, v2

    .line 24
    const/4 v2, 0x0

    .line 25
    move-object v5, v3

    .line 26
    move-object v7, v4

    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    move-object v8, v5

    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v9, v7

    .line 32
    const/4 v7, 0x0

    .line 33
    move-object v10, v8

    .line 34
    const/4 v8, 0x0

    .line 35
    move-object v11, v9

    .line 36
    const/4 v9, 0x0

    .line 37
    move-object v12, v10

    .line 38
    const/4 v10, 0x0

    .line 39
    move-object v13, v11

    .line 40
    const/4 v11, 0x0

    .line 41
    move-object/from16 v16, v12

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    move-object/from16 v17, v13

    .line 45
    .line 46
    const/4 v13, 0x0

    .line 47
    move-object/from16 v0, v16

    .line 48
    .line 49
    move-object/from16 v18, v17

    .line 50
    .line 51
    invoke-static/range {v1 .. v15}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object/from16 v4, v18

    .line 56
    .line 57
    invoke-interface {v0, v4, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    move-object/from16 v6, p1

    .line 65
    .line 66
    move-object v1, v0

    .line 67
    move-object/from16 v0, p0

    .line 68
    .line 69
    goto :goto_0
.end method

.method public final Z(Lz5/t1;)V
    .locals 19

    .line 1
    const-string v0, "topicData"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p0

    .line 9
    .line 10
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lz5/l1;

    .line 18
    .line 19
    invoke-virtual {v1}, Lz5/t1;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    invoke-virtual {v1}, Lz5/t1;->a()J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    invoke-direct {v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->F()J

    .line 28
    .line 29
    .line 30
    move-result-wide v10

    .line 31
    cmp-long v5, v8, v10

    .line 32
    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    :goto_0
    move v8, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v5, 0x0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    const/16 v17, 0x7f9

    .line 41
    .line 42
    const/16 v18, 0x0

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    invoke-static/range {v4 .. v18}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    return-void
.end method

.method public final a0(Lkotlin/jvm/functions/Function0;)V
    .locals 13

    .line 1
    const-string v1, "callback"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Lz5/l1;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/evaluation/base/BaseViewModel;->k()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Lz5/l1;->j()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lz5/f;

    .line 48
    .line 49
    invoke-virtual {v5}, Lz5/f;->c()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/4 v5, 0x0

    .line 62
    :goto_1
    if-ge v5, v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    move-object v8, v6

    .line 71
    check-cast v8, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v7, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->e:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 74
    .line 75
    const/4 v11, 0x6

    .line 76
    const/4 v12, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    invoke-static/range {v7 .. v12}, Lcom/zykj/evaluation/upload/OssTaskManger;->v(Lcom/zykj/evaluation/upload/OssTaskManger;Ljava/lang/String;I[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    new-instance v6, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$2;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {v6, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 87
    .line 88
    .line 89
    new-instance v7, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$3;

    .line 90
    .line 91
    invoke-direct {v7, v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$3;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    move-object v1, p0

    .line 98
    move-object v4, p1

    .line 99
    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Ljava/util/List;Lz5/l1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 100
    .line 101
    .line 102
    move-object v4, v7

    .line 103
    const/16 v7, 0x13

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v1, 0x0

    .line 107
    const/4 v2, 0x0

    .line 108
    move-object v3, v6

    .line 109
    move-object v6, v0

    .line 110
    move-object v0, p0

    .line 111
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final v(Ljava/util/List;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz5/l1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lz5/l1;->f()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Lz5/l1;->c()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-virtual {v0}, Lz5/l1;->g()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_5

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    invoke-virtual {v0}, Lz5/l1;->e()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_7

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->f:I

    .line 128
    .line 129
    if-lt v3, v0, :cond_b

    .line 130
    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_9

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    :goto_4
    const/4 p1, 0x1

    .line 164
    return p1

    .line 165
    :cond_b
    :goto_5
    return v2
.end method

.method public final x(Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "tag"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lz5/l1;

    .line 18
    .line 19
    new-instance v5, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Lz5/l1;->h()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_3

    .line 37
    .line 38
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    move-object v8, v7

    .line 43
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 44
    .line 45
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 50
    .line 51
    .line 52
    move-result-wide v11

    .line 53
    cmp-long v7, v9, v11

    .line 54
    .line 55
    if-nez v7, :cond_2

    .line 56
    .line 57
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-nez v7, :cond_1

    .line 70
    .line 71
    :cond_2
    const/4 v13, 0x7

    .line 72
    const/4 v14, 0x0

    .line 73
    const-wide/16 v9, 0x0

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    const/4 v12, 0x0

    .line 77
    invoke-static/range {v8 .. v14}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->copy$default(Lcom/zykj/evaluation/ui/detail/mistake/TagData;JLjava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    iget v7, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->f:I

    .line 90
    .line 91
    if-ge v6, v7, :cond_4

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 99
    .line 100
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 101
    .line 102
    .line 103
    move-result-wide v7

    .line 104
    const-wide/16 v9, 0x0

    .line 105
    .line 106
    cmp-long v7, v7, v9

    .line 107
    .line 108
    if-eqz v7, :cond_4

    .line 109
    .line 110
    new-instance v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 111
    .line 112
    const/4 v13, 0x7

    .line 113
    const/4 v14, 0x0

    .line 114
    const-wide/16 v9, 0x0

    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    invoke-direct/range {v8 .. v14}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v6, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 125
    .line 126
    const/16 v17, 0x3ff

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    move-object/from16 v16, v5

    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    const-wide/16 v6, 0x0

    .line 134
    .line 135
    const/4 v8, 0x0

    .line 136
    const/4 v9, 0x0

    .line 137
    const/4 v10, 0x0

    .line 138
    const/4 v11, 0x0

    .line 139
    const/4 v12, 0x0

    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    invoke-static/range {v4 .. v18}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v1, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_0

    .line 152
    .line 153
    return-void
.end method

.method public final y(JLjava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "newName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move-wide v3, p1

    .line 11
    move-object v5, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$createOrUpdateTag$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;JLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    const/16 v8, 0x1f

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v7, v1

    .line 23
    move-object v1, p0

    .line 24
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final z(Lz5/f;)V
    .locals 10

    .line 1
    const-string v0, "deleteStem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p1, p0, v0}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1;-><init>(Lz5/f;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlin/coroutines/Continuation;)V

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
