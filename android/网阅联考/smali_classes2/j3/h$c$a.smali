.class public Lj3/h$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/h$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/CompletableFuture;

.field public final synthetic b:Lj3/h$c;


# direct methods
.method public constructor <init>(Lj3/h$c;Ljava/util/concurrent/CompletableFuture;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj3/h$c$a;->b:Lj3/h$c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lj3/h$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lj3/b;Lj3/d0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lj3/h$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lj3/g;->a(Ljava/util/concurrent/CompletableFuture;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lj3/b;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lj3/h$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lj3/f;->a(Ljava/util/concurrent/CompletableFuture;Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
