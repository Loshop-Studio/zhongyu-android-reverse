.class public final Lvd/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/u;
.implements Lvd/c;
.implements Lwd/i;


# instance fields
.field public final synthetic c:Lvd/u;

.field public final d:Lkotlinx/coroutines/g;


# direct methods
.method public constructor <init>(Lvd/u;Lkotlinx/coroutines/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvd/n;->c:Lvd/u;

    .line 5
    .line 6
    iput-object p2, p0, Lvd/n;->d:Lkotlinx/coroutines/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lvd/c;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvd/v;->d(Lvd/u;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Lvd/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/n;->c:Lvd/u;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lvd/p;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/n;->c:Lvd/u;

    .line 2
    .line 3
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
