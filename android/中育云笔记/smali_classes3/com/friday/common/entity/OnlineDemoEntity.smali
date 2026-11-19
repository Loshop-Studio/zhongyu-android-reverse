.class public final Lcom/friday/common/entity/OnlineDemoEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/OnlineDemoEntity$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/friday/common/entity/OnlineDemoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/friday/common/entity/OnlineDemoEntity$Companion;


# instance fields
.field private final accountId:Ljava/lang/String;

.field private add:Z

.field private handsUp:Z

.field private mikeEnable:Z

.field private final nickname:Ljava/lang/String;

.field private final roomId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/common/entity/OnlineDemoEntity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/common/entity/OnlineDemoEntity$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/common/entity/OnlineDemoEntity;->Companion:Lcom/friday/common/entity/OnlineDemoEntity$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/common/entity/OnlineDemoEntity;->$stable:I

    .line 12
    .line 13
    new-instance v0, Lcom/friday/common/entity/OnlineDemoEntity$Companion$CREATOR$1;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/friday/common/entity/OnlineDemoEntity$Companion$CREATOR$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/friday/common/entity/OnlineDemoEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 9

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v0

    .line 11
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v0

    .line 12
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v0

    .line 13
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v2, v0, :cond_3

    move v6, v2

    goto :goto_3

    :cond_3
    move v6, v1

    .line 14
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v2, v0, :cond_4

    move v7, v2

    goto :goto_4

    :cond_4
    move v7, v1

    .line 15
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-ne v2, p1, :cond_5

    move v8, v2

    :goto_5
    move-object v2, p0

    goto :goto_6

    :cond_5
    move v8, v1

    goto :goto_5

    .line 16
    :goto_6
    invoke-direct/range {v2 .. v8}, Lcom/friday/common/entity/OnlineDemoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 1

    const-string v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roomId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nickname"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    .line 6
    iput-boolean p5, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    .line 7
    iput-boolean p6, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 8
    const-string p3, ""

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    const/4 p8, 0x0

    if-eqz p3, :cond_1

    move v4, p8

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    move v5, p8

    goto :goto_1

    :cond_2
    move v5, p5

    :goto_1
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    const/4 p6, 0x1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/friday/common/entity/OnlineDemoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/OnlineDemoEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/Object;)Lcom/friday/common/entity/OnlineDemoEntity;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/friday/common/entity/OnlineDemoEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/friday/common/entity/OnlineDemoEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/friday/common/entity/OnlineDemoEntity;
    .locals 8

    const-string v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roomId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nickname"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/OnlineDemoEntity;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/friday/common/entity/OnlineDemoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v1
.end method

.method public describeContents()I
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
    instance-of v1, p1, Lcom/friday/common/entity/OnlineDemoEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/OnlineDemoEntity;

    iget-object v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    iget-boolean p1, p1, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAccountId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAdd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHandsUp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMikeEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRoomId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAdd(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHandsUp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMikeEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    iget-object v1, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    iget-object v2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    iget-boolean v4, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    iget-boolean v5, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OnlineDemoEntity(accountId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", roomId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nickname="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mikeEnable="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", handsUp="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", add="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    const-string p2, "dest"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->accountId:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->roomId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->nickname:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->mikeEnable:Z

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->handsUp:Z

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    iget-boolean p2, p0, Lcom/friday/common/entity/OnlineDemoEntity;->add:Z

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
