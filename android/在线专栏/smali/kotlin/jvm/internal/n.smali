.class public abstract Lkotlin/jvm/internal/n;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lc3/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/p;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lc3/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/y;->d(Lkotlin/jvm/internal/n;)Lc3/g;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/t;->getReflected()Lc3/h;

    move-result-object v0

    check-cast v0, Lc3/g;

    invoke-interface {v0}, Lc3/i;->getDelegate()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGetter()Lc3/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/n;->getGetter()Lc3/i$a;

    move-result-object v0

    return-object v0
.end method

.method public getGetter()Lc3/i$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/t;->getReflected()Lc3/h;

    move-result-object v0

    check-cast v0, Lc3/g;

    invoke-interface {v0}, Lc3/i;->getGetter()Lc3/i$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSetter()Lc3/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/n;->getSetter()Lc3/g$a;

    move-result-object v0

    return-object v0
.end method

.method public getSetter()Lc3/g$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/t;->getReflected()Lc3/h;

    move-result-object v0

    check-cast v0, Lc3/g;

    invoke-interface {v0}, Lc3/g;->getSetter()Lc3/g$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lc3/i;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
