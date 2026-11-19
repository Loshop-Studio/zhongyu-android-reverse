.class public final Lf3/y1;
.super Lkotlinx/coroutines/internal/i;
.source "SourceFile"

# interfaces
.implements Lf3/h1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf3/y1;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-super {p0}, Lkotlinx/coroutines/internal/k;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
