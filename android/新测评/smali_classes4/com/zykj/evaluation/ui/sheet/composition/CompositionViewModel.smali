.class public final Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;
.super Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00102\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00152\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0015H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\"\u0010&\u001a\u00020\u001c8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u001d\u001a\u0004\u0008$\u0010\u001f\"\u0004\u0008%\u0010!\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;",
        "Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;",
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
        "",
        "index",
        "",
        "q",
        "(I)V",
        "Lb7/c1;",
        "result",
        "Lkotlin/Function0;",
        "callback",
        "G",
        "(Lb7/c1;Lkotlin/jvm/functions/Function0;)V",
        "failedCallback",
        "r",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "",
        "Ljava/lang/String;",
        "d0",
        "()Ljava/lang/String;",
        "f0",
        "(Ljava/lang/String;)V",
        "mUuid",
        "s",
        "c0",
        "e0",
        "mPath",
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
        "SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1563#2:172\n1634#2,3:173\n*S KotlinDebug\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel\n*L\n56#1:172\n56#1:173,3\n*E\n"
    }
.end annotation


# instance fields
.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V
    .locals 1

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
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic Y(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Lg7/e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->x()Lg7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic Z(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic a0(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)F
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

.method public static final synthetic b0(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->J()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
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
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;-><init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lb7/c1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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

.method public H(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z
    .locals 11

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
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getUuid()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->f0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getPath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->e0(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const p1, 0x4008a209

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->T(F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->u()Lv6/v;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lv6/w$a;->a:Lv6/w$a;

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p1, v0, v1, v2, v3}, Lv6/v;->b(Lv6/v;Lv6/w;IILjava/lang/Object;)Lv6/v;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->P(Lv6/v;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->y()[Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v0, 0x3

    .line 54
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v2, "copyOf(...)"

    .line 59
    .line 60
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, [Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->S([Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v7, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v0, 0xa

    .line 79
    .line 80
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    move-object v0, p1

    .line 98
    check-cast v0, Lkotlin/collections/IntIterator;

    .line 99
    .line 100
    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    new-instance v1, Lv6/z;

    .line 105
    .line 106
    if-nez v0, :cond_1

    .line 107
    .line 108
    sget-object v3, Lcom/zykj/evaluation/ui/sheet/c$a$b;->d:Lcom/zykj/evaluation/ui/sheet/c$a$b;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    sget-object v3, Lcom/zykj/evaluation/ui/sheet/c$c;->d:Lcom/zykj/evaluation/ui/sheet/c$c;

    .line 112
    .line 113
    :goto_1
    invoke-direct {v1, v0, v3}, Lv6/z;-><init>(ILcom/zykj/evaluation/ui/sheet/c;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    const/16 v9, 0x2f

    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    invoke-static/range {v2 .. v10}, Lcom/zykj/evaluation/ui/sheet/a;->b(Lcom/zykj/evaluation/ui/sheet/a;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Ljava/util/List;ZILjava/lang/Object;)Lcom/zykj/evaluation/ui/sheet/a;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->X(Lcom/zykj/evaluation/ui/sheet/a;)V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x1

    .line 136
    return p1
.end method

.method public final c0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->s:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mPath"

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

.method public final d0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->r:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mUuid"

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

.method public final e0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->s:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final f0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->r:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public q(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->u()Lv6/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, p1, v2, v1}, Lv6/v;->b(Lv6/v;Lv6/w;IILjava/lang/Object;)Lv6/v;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->P(Lv6/v;)V

    .line 12
    .line 13
    .line 14
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
    new-instance v7, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {v7, p1, p0, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$commit$1;-><init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lkotlin/coroutines/Continuation;)V

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
