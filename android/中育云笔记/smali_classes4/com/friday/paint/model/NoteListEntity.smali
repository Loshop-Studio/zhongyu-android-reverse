.class public final Lcom/friday/paint/model/NoteListEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private inClass:Z

.field private noteDir:Ljava/lang/String;

.field private selected:Z

.field private thumbnailFile:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "thumbnailFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noteDir"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    .line 4
    iput-boolean p3, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    .line 5
    iput-object p4, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 6
    const-string p4, ""

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/paint/model/NoteListEntity;Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/friday/paint/model/NoteListEntity;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/paint/model/NoteListEntity;->copy(Ljava/lang/String;ZZLjava/lang/String;)Lcom/friday/paint/model/NoteListEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZZLjava/lang/String;)Lcom/friday/paint/model/NoteListEntity;
    .locals 1

    const-string v0, "thumbnailFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noteDir"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/paint/model/NoteListEntity;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/paint/model/NoteListEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/paint/model/NoteListEntity;

    iget-object v1, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    iget-boolean v3, p1, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    iget-boolean v3, p1, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getInClass()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNoteDir()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getThumbnailFile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setInClass(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNoteDir(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setThumbnailFile(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/friday/paint/model/NoteListEntity;->thumbnailFile:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/friday/paint/model/NoteListEntity;->selected:Z

    iget-boolean v2, p0, Lcom/friday/paint/model/NoteListEntity;->inClass:Z

    iget-object v3, p0, Lcom/friday/paint/model/NoteListEntity;->noteDir:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "NoteListEntity(thumbnailFile="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", selected="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", inClass="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", noteDir="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
