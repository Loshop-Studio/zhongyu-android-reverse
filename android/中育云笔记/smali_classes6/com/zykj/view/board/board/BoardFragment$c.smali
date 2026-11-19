.class public final Lcom/zykj/view/board/board/BoardFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment;->F0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$c;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Lhd/l;Lhd/a;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$c;->c(Lhd/l;Lhd/a;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lhd/l;Lhd/a;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    invoke-static {p2}, Lcom/blankj/utilcode/util/UriUtils;->uri2File(Landroid/net/Uri;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    :cond_0
    const-string p1, ""

    .line 16
    .line 17
    :cond_1
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lhd/l;Lhd/a;)V
    .locals 2

    .line 1
    const-string v0, "imageLocalPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "doneCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "cancelCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$c;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->o0(Lcom/zykj/view/board/board/BoardFragment;)Lvb/l;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/io/File;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v1, "file2Uri(...)"

    .line 32
    .line 33
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lkb/a1;

    .line 37
    .line 38
    invoke-direct {v1, p2, p3}, Lkb/a1;-><init>(Lhd/l;Lhd/a;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, Lvb/l;->q(Landroid/net/Uri;Lhd/l;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
