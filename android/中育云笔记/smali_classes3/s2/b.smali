.class public interface abstract Ls2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic g(Ls2/b;Ljava/lang/String;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x1

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2}, Ls2/b;->b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: getStudentSharedList"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lgf/t;
            value = "fileId"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime Lgf/t;
            value = "ownerId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/common/entity/GetResourceEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/SuperShare/GetResourceByFileId"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lgf/t;
            value = "keyword"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/document/model/StudentShareEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/SuperShare/SharedToMe"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lgf/t;
            value = "id"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime Lgf/t;
            value = "ownerId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/document/model/ShareFile;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/SuperShare/GetShareFileById"
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;JZLvc/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lgf/t;
            value = "parentId"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime Lgf/t;
            value = "ownerId"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lgf/t;
            value = "isNoteNode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JZ",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/document/model/StudentShareEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/SuperShare/GetByParentId"
    .end annotation
.end method

.method public abstract e(Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/document/model/TchListEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/SuperShare/RetrieveTeachers"
    .end annotation
.end method

.method public abstract f(JLvc/c;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lgf/t;
            value = "teacherId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lvc/c<",
            "-",
            "Lcom/friday/common/property/BaseResponse<",
            "Lcom/friday/document/model/StudentShareEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lgf/f;
        value = "CloudNotes/api/SuperShare/GetSharedToMeByTeacher"
    .end annotation
.end method
