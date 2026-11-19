.class public final synthetic Lxd/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/f2;

    check-cast p2, Lkotlin/coroutines/d$b;

    invoke-static {p1, p2}, Lxd/j0;->a(Lsd/f2;Lkotlin/coroutines/d$b;)Lsd/f2;

    move-result-object p1

    return-object p1
.end method
