.class public final synthetic Lkotlin/io/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lr6/e;


# direct methods
.method public synthetic constructor <init>(Lr6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/io/b;->a:Lr6/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    check-cast p2, Ljava/io/IOException;

    .line 4
    .line 5
    const-string v0, "f"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "e"

    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lkotlin/io/b;->a:Lr6/e;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    sget-object v0, Lkotlin/io/OnErrorAction;->TERMINATE:Lkotlin/io/OnErrorAction;

    .line 22
    .line 23
    if-eq p2, v0, :cond_0

    .line 24
    .line 25
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    new-instance p2, Lkotlin/io/TerminateException;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Lkotlin/io/TerminateException;-><init>(Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    throw p2
.end method
