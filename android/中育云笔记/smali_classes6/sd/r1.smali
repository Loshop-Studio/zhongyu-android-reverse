.class public final Lsd/r1;
.super Lsd/n0;
.source "SourceFile"


# instance fields
.field public final f:Lvc/c;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;Lhd/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lsd/n0;-><init>(Lkotlin/coroutines/d;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p0, p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->b(Lhd/p;Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lsd/r1;->f:Lvc/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public q0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsd/r1;->f:Lvc/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lyd/a;->c(Lvc/c;Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
