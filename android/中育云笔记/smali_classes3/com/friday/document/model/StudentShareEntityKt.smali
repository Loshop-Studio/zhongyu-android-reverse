.class public final Lcom/friday/document/model/StudentShareEntityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final toShareListEntity(Lcom/friday/document/model/ShareFile;ZZ)Lcom/friday/document/model/ShareListEntity;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/document/model/ShareListEntity;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p0}, Lcom/friday/document/model/ShareListEntity;-><init>(ZZLcom/friday/document/model/ShareFile;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
