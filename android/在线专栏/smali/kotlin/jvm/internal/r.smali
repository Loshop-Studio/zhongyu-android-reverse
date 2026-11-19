.class public abstract Lkotlin/jvm/internal/r;
.super Lkotlin/jvm/internal/t;
.source "SourceFile"

# interfaces
.implements Lc3/j;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/t;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lc3/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/y;->e(Lkotlin/jvm/internal/r;)Lc3/j;

    move-result-object v0

    return-object v0
.end method

.method public getGetter()Lc3/j$a;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/t;->getReflected()Lc3/h;

    move-result-object v0

    check-cast v0, Lc3/j;

    invoke-interface {v0}, Lc3/j;->getGetter()Lc3/j$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lc3/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
