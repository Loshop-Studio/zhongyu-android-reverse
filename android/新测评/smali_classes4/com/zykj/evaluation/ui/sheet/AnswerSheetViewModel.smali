.class public abstract Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;
.super Lcom/zykj/evaluation/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\'\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH$\u00a2\u0006\u0004\u0008 \u0010\u001dJ-\u0010\"\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000e\u0008\u0002\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H&\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010$\u001a\u00020\u0011\u00a2\u0006\u0004\u0008$\u0010\u0017J\r\u0010%\u001a\u00020\u0011\u00a2\u0006\u0004\u0008%\u0010\u0017R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R+\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020*8D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R+\u00107\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00083\u0010-\u001a\u0004\u00084\u00105\"\u0004\u00086\u0010\u001dR+\u0010>\u001a\u0002082\u0006\u0010+\u001a\u0002088D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00089\u0010-\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R+\u0010F\u001a\u00020?2\u0006\u0010+\u001a\u00020?8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER+\u0010M\u001a\u00020G2\u0006\u0010+\u001a\u00020G8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008H\u0010A\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR+\u0010T\u001a\u00020N2\u0006\u0010+\u001a\u00020N8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008O\u0010A\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR$\u0010[\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR*\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\\8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR\"\u0010l\u001a\u00020e8\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008f\u0010g\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010kR\u0016\u0010n\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010mR$\u0010r\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000b8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010m\u001a\u0004\u0008p\u0010qR\u0014\u0010v\u001a\u00020s8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008t\u0010uR\u0014\u0010x\u001a\u00020\u000b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008w\u0010qR\u0011\u0010z\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008y\u00105R\u0011\u0010|\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008{\u0010qR\u0014\u0010~\u001a\u00020\u000b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008}\u0010q\u00a8\u0006\u007f"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;",
        "Lcom/zykj/evaluation/base/BaseViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V",
        "Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;",
        "answerSheetBundle",
        "",
        "H",
        "(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z",
        "Lb7/c1;",
        "result",
        "Lkotlin/Function0;",
        "",
        "callback",
        "G",
        "(Lb7/c1;Lkotlin/jvm/functions/Function0;)V",
        "F",
        "Q",
        "()V",
        "n",
        "N",
        "",
        "index",
        "o",
        "(I)V",
        "s",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "q",
        "failedCallback",
        "r",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "I",
        "O",
        "c",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "d",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "",
        "<set-?>",
        "e",
        "Lkotlin/properties/ReadWriteProperty;",
        "A",
        "()J",
        "U",
        "(J)V",
        "mTaskId",
        "f",
        "B",
        "()I",
        "V",
        "mTaskState",
        "",
        "g",
        "z",
        "()F",
        "T",
        "(F)V",
        "mScaleSize",
        "Lv6/v;",
        "h",
        "Landroidx/compose/runtime/MutableState;",
        "u",
        "()Lv6/v;",
        "P",
        "(Lv6/v;)V",
        "answerSheetState",
        "Lcom/zykj/evaluation/ui/sheet/a;",
        "i",
        "D",
        "()Lcom/zykj/evaluation/ui/sheet/a;",
        "X",
        "(Lcom/zykj/evaluation/ui/sheet/a;)V",
        "previewState",
        "Lv6/k0;",
        "j",
        "C",
        "()Lv6/k0;",
        "W",
        "(Lv6/k0;)V",
        "manualPointState",
        "k",
        "Lb7/c1;",
        "E",
        "()Lb7/c1;",
        "setScanResult",
        "(Lb7/c1;)V",
        "scanResult",
        "",
        "",
        "l",
        "[Ljava/lang/String;",
        "y",
        "()[Ljava/lang/String;",
        "S",
        "([Ljava/lang/String;)V",
        "mPicArray",
        "Lg7/e;",
        "m",
        "Lg7/e;",
        "x",
        "()Lg7/e;",
        "R",
        "(Lg7/e;)V",
        "mPathManager",
        "Z",
        "isIndexChange",
        "value",
        "L",
        "()Z",
        "isFirstIn",
        "Landroid/graphics/Bitmap;",
        "w",
        "()Landroid/graphics/Bitmap;",
        "defaultImage",
        "M",
        "isInitialized",
        "v",
        "currentIndex",
        "K",
        "isDataEmpty",
        "J",
        "isAllComplete",
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
        "SMAP\nAnswerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n88#2:282\n85#3:283\n113#3,2:284\n85#3:286\n113#3,2:287\n85#3:289\n113#3,2:290\n360#4,7:292\n12434#5,2:299\n12434#5,2:301\n*S KotlinDebug\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel\n*L\n76#1:282\n85#1:283\n85#1:284,2\n88#1:286\n88#1:287,2\n91#1:289\n91#1:290,2\n109#1:292,7\n115#1:299,2\n118#1:301,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic p:[Lkotlin/reflect/KProperty;

.field public static final q:I


# instance fields
.field public final c:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final d:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final e:Lkotlin/properties/ReadWriteProperty;

.field public final f:Lkotlin/properties/ReadWriteProperty;

.field public final g:Lkotlin/properties/ReadWriteProperty;

.field public final h:Landroidx/compose/runtime/MutableState;

.field public final i:Landroidx/compose/runtime/MutableState;

.field public final j:Landroidx/compose/runtime/MutableState;

.field public k:Lb7/c1;

.field public l:[Ljava/lang/String;

.field public m:Lg7/e;

.field public n:Z

.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    const-string v2, "mTaskId"

    const-string v3, "getMTaskId()J"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v3, "mTaskState"

    const-string v5, "getMTaskState()I"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v5, "mScaleSize"

    const-string v6, "getMScaleSize()F"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lkotlin/reflect/KProperty;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->q:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V
    .locals 11

    .line 1
    const-string v0, "userInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ossTaskManger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/evaluation/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->d:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 17
    .line 18
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 19
    .line 20
    invoke-virtual {p1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 25
    .line 26
    invoke-virtual {p1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->f:Lkotlin/properties/ReadWriteProperty;

    .line 31
    .line 32
    invoke-virtual {p1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 37
    .line 38
    new-instance p1, Lv6/v;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    const/4 v0, 0x0

    .line 42
    const/4 v1, 0x3

    .line 43
    invoke-direct {p1, p2, v0, v1, p2}, Lv6/v;-><init>(Lv6/w;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 52
    .line 53
    new-instance v2, Lcom/zykj/evaluation/ui/sheet/a;

    .line 54
    .line 55
    const/16 v9, 0x3f

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v2 .. v10}, Lcom/zykj/evaluation/ui/sheet/a;-><init>(Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->i:Landroidx/compose/runtime/MutableState;

    .line 72
    .line 73
    new-instance p1, Lv6/k0;

    .line 74
    .line 75
    invoke-direct {p1, p2, p2, v1, p2}, Lv6/k0;-><init>(Landroid/graphics/Bitmap;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->j:Landroidx/compose/runtime/MutableState;

    .line 83
    .line 84
    const/16 p1, 0x14

    .line 85
    .line 86
    new-array p1, p1, [Ljava/lang/String;

    .line 87
    .line 88
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->l:[Ljava/lang/String;

    .line 89
    .line 90
    const/4 p1, 0x1

    .line 91
    iput-boolean p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o:Z

    .line 92
    .line 93
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->d:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;IILjava/lang/Object;)V
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
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Super calls with default arguments not supported in this target, function: changeIndex"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public static synthetic t(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method public final B()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->f:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

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
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final C()Lv6/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->j:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv6/k0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final D()Lcom/zykj/evaluation/ui/sheet/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->i:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/evaluation/ui/sheet/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final E()Lb7/c1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->k:Lb7/c1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F(Lb7/c1;Lkotlin/jvm/functions/Function0;)V
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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->k:Lb7/c1;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lb7/c1;->a()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 22
    .line 23
    const/4 v7, 0x7

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-direct/range {v3 .. v8}, Lcom/zykj/evaluation/ui/sheet/b$c;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    const/16 v8, 0x36

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    move-object v5, v3

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->C()Lv6/k0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1}, Lb7/c1;->b()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/4 v1, 0x1

    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-static {v0, v2, p1, v1, v2}, Lv6/k0;->b(Lv6/k0;Landroid/graphics/Bitmap;Ljava/util/List;ILjava/lang/Object;)Lv6/k0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->W(Lv6/k0;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V
    .locals 1

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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->k:Lb7/c1;

    .line 12
    .line 13
    return-void
.end method

.method public H(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z
    .locals 7

    .line 1
    const-string v0, "answerSheetBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->M()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getTaskId()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-virtual {p0, v0, v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->U(J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getTaskState()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->V(I)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lg7/e;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getTaskState()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p1}, Lcom/zykj/evaluation/bean/GetTaskListKt;->convertToTaskState(I)Lcom/zykj/evaluation/bean/TaskState;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 39
    .line 40
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v0, "getId(...)"

    .line 51
    .line 52
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->A()J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    invoke-direct/range {v1 .. v6}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->R(Lg7/e;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1
.end method

.method public final I()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->C()Lv6/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/a;->f()Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "copy(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-static {v0, v1, v2, v3, v2}, Lv6/k0;->b(Lv6/k0;Landroid/graphics/Bitmap;Ljava/util/List;ILjava/lang/Object;)Lv6/k0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->W(Lv6/k0;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final J()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->l:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_3

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    if-eqz v5, :cond_1

    .line 12
    .line 13
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v4, v2

    .line 21
    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    return v4
.end method

.method public final K()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->l:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_2

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    if-eqz v4, :cond_1

    .line 11
    .line 12
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    return v2

    .line 20
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 v0, 0x1

    .line 24
    return v0
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->m:Lg7/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final N()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->n:Z

    .line 3
    .line 4
    return-void
.end method

.method public final O()V
    .locals 9

    .line 1
    new-instance v3, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$reportError$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$reportError$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    new-instance v4, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$reportError$2;

    .line 8
    .line 9
    invoke-direct {v4, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$reportError$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    new-instance v6, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$reportError$3;

    .line 13
    .line 14
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$reportError$3;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/16 v7, 0x13

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    move-object v0, p0

    .line 24
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final P(Lv6/v;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final Q()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o:Z

    .line 3
    .line 4
    return-void
.end method

.method public final R(Lg7/e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->m:Lg7/e;

    .line 7
    .line 8
    return-void
.end method

.method public final S([Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->l:[Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final T(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

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

.method public final U(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

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

.method public final V(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->f:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

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

.method public final W(Lv6/k0;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->j:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final X(Lcom/zykj/evaluation/ui/sheet/a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->i:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o(I)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->n:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final o(I)V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, p1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;ILkotlin/coroutines/Continuation;)V

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

.method public abstract q(I)V
.end method

.method public abstract r(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
.end method

.method public s(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->t(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final u()Lv6/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv6/v;

    .line 8
    .line 9
    return-object v0
.end method

.method public final v()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sheet/a;->e()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lv6/z;

    .line 25
    .line 26
    invoke-virtual {v2}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    instance-of v2, v2, Lcom/zykj/evaluation/ui/sheet/c$a;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    return v1

    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, -0x1

    .line 39
    return v0
.end method

.method public final w()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 3
    .line 4
    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final x()Lg7/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->m:Lg7/e;

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

.method public final y()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->l:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->g:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p:[Lkotlin/reflect/KProperty;

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
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method
