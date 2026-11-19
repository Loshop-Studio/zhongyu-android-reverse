.class public Lr9/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/CompletableFuture;

.field public final synthetic b:Lr9/g$c;


# direct methods
.method public constructor <init>(Lr9/g$c;Ljava/util/concurrent/CompletableFuture;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr9/g$c$a;->b:Lr9/g$c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lr9/g$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lr9/d;Lr9/c0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr9/g$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lr9/d;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr9/g$c$a;->a:Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
