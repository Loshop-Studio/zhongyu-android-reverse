.class public final Lkotlinx/coroutines/JobSupport$b;
.super Lsd/p1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/JobSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final g:Lkotlinx/coroutines/JobSupport;

.field public final h:Lkotlinx/coroutines/JobSupport$c;

.field public final i:Lsd/q;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Lsd/q;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/p1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/JobSupport$b;->g:Lkotlinx/coroutines/JobSupport;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/JobSupport$b;->h:Lkotlinx/coroutines/JobSupport$c;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/JobSupport$b;->i:Lsd/q;

    .line 9
    .line 10
    iput-object p4, p0, Lkotlinx/coroutines/JobSupport$b;->j:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lkotlinx/coroutines/JobSupport$b;->g:Lkotlinx/coroutines/JobSupport;

    .line 2
    .line 3
    iget-object v0, p0, Lkotlinx/coroutines/JobSupport$b;->h:Lkotlinx/coroutines/JobSupport$c;

    .line 4
    .line 5
    iget-object v1, p0, Lkotlinx/coroutines/JobSupport$b;->i:Lsd/q;

    .line 6
    .line 7
    iget-object v2, p0, Lkotlinx/coroutines/JobSupport$b;->j:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, Lkotlinx/coroutines/JobSupport;->q(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Lsd/q;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
