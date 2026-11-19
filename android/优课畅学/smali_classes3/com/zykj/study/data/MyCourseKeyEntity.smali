.class public final Lcom/zykj/study/data/MyCourseKeyEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Entity;
    tableName = "my_course_key"
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/data/MyCourseKeyEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private id:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private nextStartId:Ljava/lang/Integer;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private startId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private take:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private userId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/data/MyCourseKeyEntity$Creator;

    invoke-direct {v0}, Lcom/zykj/study/data/MyCourseKeyEntity$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/data/MyCourseKeyEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/data/MyCourseKeyEntity;->$stable:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IILjava/lang/Integer;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    .line 3
    iput-object p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    .line 5
    iput p4, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    .line 6
    iput-object p5, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/lang/Integer;ILkotlin/jvm/internal/n;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 7
    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v0, p0

    move v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/data/MyCourseKeyEntity;-><init>(ILjava/lang/String;IILjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/data/MyCourseKeyEntity;ILjava/lang/String;IILjava/lang/Integer;ILjava/lang/Object;)Lcom/zykj/study/data/MyCourseKeyEntity;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/study/data/MyCourseKeyEntity;->copy(ILjava/lang/String;IILjava/lang/Integer;)Lcom/zykj/study/data/MyCourseKeyEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;IILjava/lang/Integer;)Lcom/zykj/study/data/MyCourseKeyEntity;
    .locals 7

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/data/MyCourseKeyEntity;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/data/MyCourseKeyEntity;-><init>(ILjava/lang/String;IILjava/lang/Integer;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/data/MyCourseKeyEntity;

    iget v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    iget v3, p1, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    iget v3, p1, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    iget v3, p1, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getNextStartId()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStartId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTake()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    .line 2
    .line 3
    return-void
.end method

.method public final setNextStartId(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setStartId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTake(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    iget-object v1, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    iget v3, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    iget-object v4, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyCourseKeyEntity(id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", startId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", take="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", nextStartId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string p2, "dest"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->id:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->userId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->startId:I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->take:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lcom/zykj/study/data/MyCourseKeyEntity;->nextStartId:Ljava/lang/Integer;

    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/4 v0, 0x1

    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
