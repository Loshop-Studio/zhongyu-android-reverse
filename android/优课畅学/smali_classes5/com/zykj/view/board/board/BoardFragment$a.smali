.class public final Lcom/zykj/view/board/board/BoardFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/BoardFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/zykj/view/board/board/d;Lp5/b1;Lp5/a;)Lcom/zykj/view/board/board/BoardFragment;
    .locals 3

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "boardViewConfig"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "boardSketchConfig"

    .line 12
    .line 13
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "boardCallbackConfig"

    .line 17
    .line 18
    invoke-static {p4, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {v1, p2}, Lcom/zykj/view/board/board/BoardFragment;->x1(Lcom/zykj/view/board/board/d;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, p3}, Lcom/zykj/view/board/board/BoardFragment;->h0(Lcom/zykj/view/board/board/BoardFragment;Lp5/b1;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p4}, Lcom/zykj/view/board/board/BoardFragment;->v1(Lp5/a;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method
