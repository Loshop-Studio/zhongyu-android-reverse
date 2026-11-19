# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/RecordEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000b\"\u0004\u0008\u001a\u0010\u0005R(\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R(\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R(\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008,\u0010&\u001a\u0004\u0008-\u0010(\"\u0004\u0008.\u0010*R(\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00080\u0010&\u001a\u0004\u00081\u0010(\"\u0004\u00082\u0010*R(\u00104\u001a\u0008\u0012\u0004\u0012\u0002030#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00084\u0010&\u001a\u0004\u00085\u0010(\"\u0004\u00086\u0010*R(\u00108\u001a\u0008\u0012\u0004\u0012\u0002070#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00088\u0010&\u001a\u0004\u00089\u0010(\"\u0004\u0008:\u0010*R(\u0010<\u001a\u0008\u0012\u0004\u0012\u00020;0#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008<\u0010&\u001a\u0004\u0008=\u0010(\"\u0004\u0008>\u0010*R(\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0#8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008@\u0010&\u001a\u0004\u0008A\u0010(\"\u0004\u0008B\u0010*\u00a8\u0006C"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "",
        "",
        "id",
        "<init>",
        "(J)V",
        "Ld6/s;",
        "put",
        "()V",
        "remove",
        "component1",
        "()J",
        "copy",
        "(J)Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getId",
        "setId",
        "Lio/objectbox/relation/ToOne;",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "page",
        "Lio/objectbox/relation/ToOne;",
        "getPage",
        "()Lio/objectbox/relation/ToOne;",
        "setPage",
        "(Lio/objectbox/relation/ToOne;)V",
        "Lio/objectbox/relation/ToMany;",
        "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
        "commandList",
        "Lio/objectbox/relation/ToMany;",
        "getCommandList",
        "()Lio/objectbox/relation/ToMany;",
        "setCommandList",
        "(Lio/objectbox/relation/ToMany;)V",
        "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;",
        "fileList",
        "getFileList",
        "setFileList",
        "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
        "touchList",
        "getTouchList",
        "setTouchList",
        "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;",
        "matrixList",
        "getMatrixList",
        "setMatrixList",
        "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
        "audioList",
        "getAudioList",
        "setAudioList",
        "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
        "textList",
        "getTextList",
        "setTextList",
        "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
        "geometryList",
        "getGeometryList",
        "setGeometryList",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field public audioList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field

.field public commandList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field

.field public fileList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field

.field public geometryList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field

.field private id:J
    .annotation build Lio/objectbox/annotation/Id;
    .end annotation
.end field

.field public matrixList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field

.field public page:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public textList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field

.field public touchList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/Backlink;
        to = "record"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(JILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->geometryList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->geometryList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->textList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->textList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->audioList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->audioList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->matrixList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->matrixList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->touchList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->touchList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->fileList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->fileList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->commandList:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->commandList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->page:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->page:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    return-void
.end method

.method public synthetic constructor <init>(JILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(J)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/core/data/dao/RecordEntity;JILjava/lang/Object;)Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->copy(J)Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    return-wide v0
.end method

.method public final copy(J)Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    invoke-direct {v0, p1, p2}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAudioList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->audioList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "audioList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getCommandList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->commandList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "commandList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getFileList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->fileList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "fileList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getGeometryList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->geometryList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "geometryList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMatrixList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->matrixList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "matrixList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getPage()Lio/objectbox/relation/ToOne;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->page:Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "page"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getTextList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->textList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "textList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getTouchList()Lio/objectbox/relation/ToMany;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->touchList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "touchList"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public final put()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final remove()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lio/objectbox/a;->j(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setAudioList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->audioList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public final setCommandList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->commandList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public final setFileList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->fileList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public final setGeometryList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->geometryList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setMatrixList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->matrixList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public final setPage(Lio/objectbox/relation/ToOne;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToOne;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->page:Lio/objectbox/relation/ToOne;

    .line 7
    .line 8
    return-void
.end method

.method public final setTextList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->textList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public final setTouchList(Lio/objectbox/relation/ToMany;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToMany;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->touchList:Lio/objectbox/relation/ToMany;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecordEntity(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
