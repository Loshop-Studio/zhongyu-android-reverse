.class public interface abstract Lu3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lcom/friday/main/model/RestoreReq;Lvc/c;)Ljava/lang/Object;
    .param p1    # Lcom/friday/main/model/RestoreReq;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/friday/main/model/RestoreReq;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Ljava/util/List<",
            "Lcom/friday/common/entity/RestoreResponse;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "CloudNotes/api/Notes/Restore"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lgf/t;
            value = "fileId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/common/entity/GetResourceEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/Resources/GetByFileId"
    .end annotation
.end method
