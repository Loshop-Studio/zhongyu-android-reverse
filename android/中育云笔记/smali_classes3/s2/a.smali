.class public interface abstract Ls2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/common/entity/FileBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/Notes/GetAll"
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

.method public abstract c(Lcom/friday/common/entity/UpdateRequest;Lvc/c;)Ljava/lang/Object;
    .param p1    # Lcom/friday/common/entity/UpdateRequest;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/friday/common/entity/UpdateRequest;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/common/entity/UpdateResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "CloudNotes/api/Notes/AddOrUpdate"
    .end annotation
.end method

.method public abstract d(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "CloudNotes/api/Notes/Delete"
    .end annotation
.end method

.method public abstract e(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/friday/document/model/ResourceDeleteEntity;",
            ">;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "CloudNotes/api/Resources/Delete"
    .end annotation
.end method

.method public abstract f(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
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
        value = "CloudNotes/api/Notes/MoveToRecycleBin"
    .end annotation
.end method

.method public abstract g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/friday/common/entity/ResourceEntity;",
            ">;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "CloudNotes/api/Resources/AddOrUpdate"
    .end annotation
.end method

.method public abstract h(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lgf/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/o;
        value = "CloudNotes/api/Notes/ExpiredDelete"
    .end annotation
.end method
