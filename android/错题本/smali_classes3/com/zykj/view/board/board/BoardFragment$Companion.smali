.class public final Lcom/zykj/view/board/board/BoardFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/BoardFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zykj/view/board/board/BoardFragment$Companion;",
        "",
        "<init>",
        "()V",
        "newInstance",
        "Lcom/zykj/view/board/board/BoardFragment;",
        "path",
        "",
        "boardViewConfig",
        "Lcom/zykj/view/board/board/BoardViewConfig;",
        "boardSketchConfig",
        "Lcom/zykj/view/board/board/BoardSketchConfig;",
        "boardCallbackConfig",
        "Lcom/zykj/view/board/board/BoardCallbackConfig;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment$Companion;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lcom/zykj/view/board/board/BoardFragment$Companion;Ljava/lang/String;Lcom/zykj/view/board/board/BoardViewConfig;Lcom/zykj/view/board/board/BoardSketchConfig;Lcom/zykj/view/board/board/BoardCallbackConfig;ILjava/lang/Object;)Lcom/zykj/view/board/board/BoardFragment;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardFragment$Companion;->newInstance(Ljava/lang/String;Lcom/zykj/view/board/board/BoardViewConfig;Lcom/zykj/view/board/board/BoardSketchConfig;Lcom/zykj/view/board/board/BoardCallbackConfig;)Lcom/zykj/view/board/board/BoardFragment;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final newInstance(Ljava/lang/String;Lcom/zykj/view/board/board/BoardViewConfig;Lcom/zykj/view/board/board/BoardSketchConfig;Lcom/zykj/view/board/board/BoardCallbackConfig;)Lcom/zykj/view/board/board/BoardFragment;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/view/board/board/BoardViewConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/view/board/board/BoardSketchConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/view/board/board/BoardCallbackConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "boardViewConfig"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "boardSketchConfig"

    .line 12
    .line 13
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "boardCallbackConfig"

    .line 17
    .line 18
    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment;

    .line 22
    .line 23
    invoke-direct {v1}, Lcom/zykj/view/board/board/BoardFragment;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v2, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p2}, Lcom/zykj/view/board/board/BoardFragment;->setBoardViewConfig(Lcom/zykj/view/board/board/BoardViewConfig;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, p3}, Lcom/zykj/view/board/board/BoardFragment;->access$setBoardSketchConfig(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/board/board/BoardSketchConfig;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p4}, Lcom/zykj/view/board/board/BoardFragment;->setBoardCallbackConfig(Lcom/zykj/view/board/board/BoardCallbackConfig;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method
