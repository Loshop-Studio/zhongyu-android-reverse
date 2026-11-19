.class public final Lcom/zykj/evaluation/bean/bundle/DetailBundle$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/bean/bundle/DetailBundle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/zykj/evaluation/bean/bundle/DetailBundle;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v8, v2

    :goto_0
    if-eq v8, v1, :cond_0

    sget-object v9, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v9, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v9, 0x1

    if-eqz v1, :cond_1

    move v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    move v9, v2

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-eqz v10, :cond_2

    move v10, v1

    goto :goto_2

    :cond_2
    move v10, v2

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-eqz v11, :cond_3

    move v11, v1

    goto :goto_3

    :cond_3
    move v11, v2

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-eqz v12, :cond_4

    move v12, v1

    goto :goto_4

    :cond_4
    move v12, v2

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-eqz v14, :cond_5

    move v14, v1

    goto :goto_5

    :cond_5
    move v14, v2

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v17

    new-instance v2, Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    invoke-direct/range {v2 .. v18}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;-><init>(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/bean/bundle/DetailBundle$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/zykj/evaluation/bean/bundle/DetailBundle;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/bean/bundle/DetailBundle$Creator;->newArray(I)[Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    move-result-object p1

    return-object p1
.end method
