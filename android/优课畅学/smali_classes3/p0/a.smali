.class public final Lp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/a$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

.field public final b:Lp0/b;

.field public final c:Landroidx/recyclerview/widget/ListUpdateCallback;

.field public d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lp0/b;)V
    .locals 1

    .line 1
    const-string v0, "adapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lp0/a;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 15
    .line 16
    iput-object p2, p0, Lp0/a;->b:Lp0/b;

    .line 17
    .line 18
    new-instance v0, Lcom/chad/library/adapter/base/diff/BrvahListUpdateCallback;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/chad/library/adapter/base/diff/BrvahListUpdateCallback;-><init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lp0/a;->c:Landroidx/recyclerview/widget/ListUpdateCallback;

    .line 24
    .line 25
    new-instance p1, Lp0/a$a;

    .line 26
    .line 27
    invoke-direct {p1}, Lp0/a$a;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lp0/a;->e:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    invoke-virtual {p2}, Lp0/b;->b()Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-nez p2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object p1, p2

    .line 40
    :goto_0
    iput-object p1, p0, Lp0/a;->d:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lp0/a;->f:Ljava/util/List;

    .line 48
    .line 49
    return-void
.end method

.method public static final synthetic a(Lp0/a;)Lp0/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lp0/a;->b:Lp0/b;

    .line 2
    .line 3
    return-object p0
.end method
