.class public Landroidx/room/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls0/c$c;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Landroidx/room/h0$d;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/room/h0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Z

.field public final h:Landroidx/room/h0$c;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Ljava/util/concurrent/Executor;

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field private final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/lang/String;

.field public final p:Ljava/io/File;

.field public final q:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ls0/c$c;Landroidx/room/h0$d;Ljava/util/List;ZLandroidx/room/h0$c;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/h0$e;Ljava/util/List;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ls0/c$c;",
            "Landroidx/room/h0$d;",
            "Ljava/util/List<",
            "Landroidx/room/h0$b;",
            ">;Z",
            "Landroidx/room/h0$c;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "ZZZ",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;",
            "Landroidx/room/h0$e;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p3

    .line 2
    iput-object v1, v0, Landroidx/room/i;->a:Ls0/c$c;

    move-object v1, p1

    .line 3
    iput-object v1, v0, Landroidx/room/i;->b:Landroid/content/Context;

    move-object v1, p2

    .line 4
    iput-object v1, v0, Landroidx/room/i;->c:Ljava/lang/String;

    move-object v1, p4

    .line 5
    iput-object v1, v0, Landroidx/room/i;->d:Landroidx/room/h0$d;

    move-object v1, p5

    .line 6
    iput-object v1, v0, Landroidx/room/i;->e:Ljava/util/List;

    move v1, p6

    .line 7
    iput-boolean v1, v0, Landroidx/room/i;->g:Z

    move-object v1, p7

    .line 8
    iput-object v1, v0, Landroidx/room/i;->h:Landroidx/room/h0$c;

    move-object v1, p8

    .line 9
    iput-object v1, v0, Landroidx/room/i;->i:Ljava/util/concurrent/Executor;

    move-object v1, p9

    .line 10
    iput-object v1, v0, Landroidx/room/i;->j:Ljava/util/concurrent/Executor;

    move v1, p10

    .line 11
    iput-boolean v1, v0, Landroidx/room/i;->k:Z

    move v1, p11

    .line 12
    iput-boolean v1, v0, Landroidx/room/i;->l:Z

    move v1, p12

    .line 13
    iput-boolean v1, v0, Landroidx/room/i;->m:Z

    move-object v1, p13

    .line 14
    iput-object v1, v0, Landroidx/room/i;->n:Ljava/util/Set;

    move-object/from16 v1, p14

    .line 15
    iput-object v1, v0, Landroidx/room/i;->o:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Landroidx/room/i;->p:Ljava/io/File;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Landroidx/room/i;->q:Ljava/util/concurrent/Callable;

    if-nez p18, :cond_0

    .line 18
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p18

    :goto_0
    iput-object v1, v0, Landroidx/room/i;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(II)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-le p1, p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 1
    iget-boolean p2, p0, Landroidx/room/i;->m:Z

    if-eqz p2, :cond_1

    return v1

    .line 2
    :cond_1
    iget-boolean p2, p0, Landroidx/room/i;->l:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Landroidx/room/i;->n:Ljava/util/Set;

    if-eqz p2, :cond_3

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_1
    return v0
.end method
