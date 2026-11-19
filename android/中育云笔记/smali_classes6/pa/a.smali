.class public interface abstract Lpa/a;
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
