.class public final Lp4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final serializer()Li7/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/b;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->access$get$cachedSerializer$delegate$cp()Ld6/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Li7/b;

    .line 10
    .line 11
    return-object v0
.end method
