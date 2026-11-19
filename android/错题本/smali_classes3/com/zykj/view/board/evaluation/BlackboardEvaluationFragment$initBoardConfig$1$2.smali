.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/proxy/ImageCropView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initBoardConfig()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2",
        "Lcom/zykj/blackboard/proxy/ImageCropView;",
        "",
        "imageLocalPath",
        "Lkotlin/Function1;",
        "Ld6/s;",
        "doneCallback",
        "Lkotlin/Function0;",
        "cancelCallback",
        "showCropView",
        "(Ljava/lang/String;Lr6/c;Lr6/a;)V",
        "view_release"
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
        "SMAP\nBlackboardEvaluationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackboardEvaluationFragment.kt\ncom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1042:1\n1#2:1043\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Ljava/io/File;Lr6/c;Lr6/a;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;->showCropView$lambda$3(Ljava/io/File;Lr6/c;Lr6/a;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final showCropView$lambda$3(Ljava/io/File;Lr6/c;Lr6/a;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p3, :cond_3

    .line 7
    .line 8
    invoke-static {p3}, Lcom/blankj/utilcode/util/c;->r(Landroid/net/Uri;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    :cond_1
    const-string p0, ""

    .line 21
    .line 22
    :cond_2
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    invoke-interface {p2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 30
    .line 31
    return-object p0
.end method


# virtual methods
.method public showCropView(Ljava/lang/String;Lr6/c;Lr6/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "imageLocalPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "doneCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "cancelCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 32
    .line 33
    invoke-static {v1, v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$createOpaqueCropTempFile(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-static {v0}, Lcom/blankj/utilcode/util/c;->c(Ljava/io/File;)Landroid/net/Uri;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    :cond_1
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/blankj/utilcode/util/c;->c(Ljava/io/File;)Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_2
    if-nez v1, :cond_4

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-static {v0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-interface {p3}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 66
    .line 67
    invoke-static {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getImagePicker$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/utils/ImagePicker;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v2, Landroidx/lifecycle/i;

    .line 72
    .line 73
    const/16 v3, 0xd

    .line 74
    .line 75
    invoke-direct {v2, v0, p2, p3, v3}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Lr6/c;Ld6/d;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1, v2}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    :goto_0
    invoke-interface {p3}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    return-void
.end method
