.class public final Lcom/friday/common/camera/CameraBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/friday/common/camera/CameraBean;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:I


# instance fields
.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/camera/CameraBean$a;

    invoke-direct {v0}, Lcom/friday/common/camera/CameraBean$a;-><init>()V

    sput-object v0, Lcom/friday/common/camera/CameraBean;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/camera/CameraBean;->k:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ZIIZLjava/lang/String;I)V
    .locals 1

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/friday/common/camera/CameraBean;->c:I

    .line 3
    iput-object p2, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    .line 5
    iput p4, p0, Lcom/friday/common/camera/CameraBean;->f:I

    .line 6
    iput p5, p0, Lcom/friday/common/camera/CameraBean;->g:I

    .line 7
    iput-boolean p6, p0, Lcom/friday/common/camera/CameraBean;->h:Z

    .line 8
    iput-object p7, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    .line 9
    iput p8, p0, Lcom/friday/common/camera/CameraBean;->j:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZIIZLjava/lang/String;IILkotlin/jvm/internal/n;)V
    .locals 3

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    .line 10
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    move-result-object p2

    sget-object p10, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ".jpg"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    const/4 p7, 0x0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    const/4 p8, 0x1

    :cond_7
    move p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 11
    invoke-direct/range {p1 .. p9}, Lcom/friday/common/camera/CameraBean;-><init>(ILjava/lang/String;ZIIZLjava/lang/String;I)V

    return-void
.end method

.method public static synthetic b(Lcom/friday/common/camera/CameraBean;ILjava/lang/String;ZIIZLjava/lang/String;IILjava/lang/Object;)Lcom/friday/common/camera/CameraBean;
    .locals 0

    .line 1
    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/friday/common/camera/CameraBean;->c:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-boolean p3, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/friday/common/camera/CameraBean;->f:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/friday/common/camera/CameraBean;->g:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lcom/friday/common/camera/CameraBean;->h:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget p8, p0, Lcom/friday/common/camera/CameraBean;->j:I

    :cond_7
    move-object p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/friday/common/camera/CameraBean;->a(ILjava/lang/String;ZIIZLjava/lang/String;I)Lcom/friday/common/camera/CameraBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;ZIIZLjava/lang/String;I)Lcom/friday/common/camera/CameraBean;
    .locals 10

    .line 1
    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/camera/CameraBean;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/friday/common/camera/CameraBean;-><init>(ILjava/lang/String;ZIIZLjava/lang/String;I)V

    return-object v1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
    instance-of v1, p1, Lcom/friday/common/camera/CameraBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/camera/CameraBean;

    iget v1, p0, Lcom/friday/common/camera/CameraBean;->c:I

    iget v3, p1, Lcom/friday/common/camera/CameraBean;->c:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    iget-boolean v3, p1, Lcom/friday/common/camera/CameraBean;->e:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/friday/common/camera/CameraBean;->f:I

    iget v3, p1, Lcom/friday/common/camera/CameraBean;->f:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/friday/common/camera/CameraBean;->g:I

    iget v3, p1, Lcom/friday/common/camera/CameraBean;->g:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/common/camera/CameraBean;->h:Z

    iget-boolean v3, p1, Lcom/friday/common/camera/CameraBean;->h:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/friday/common/camera/CameraBean;->j:I

    iget p1, p1, Lcom/friday/common/camera/CameraBean;->j:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/camera/CameraBean;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/friday/common/camera/CameraBean;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/camera/CameraBean;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/camera/CameraBean;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/camera/CameraBean;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/camera/CameraBean;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/camera/CameraBean;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/camera/CameraBean;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/camera/CameraBean;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/friday/common/camera/CameraBean;->c:I

    iget-object v1, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    iget v3, p0, Lcom/friday/common/camera/CameraBean;->f:I

    iget v4, p0, Lcom/friday/common/camera/CameraBean;->g:I

    iget-boolean v5, p0, Lcom/friday/common/camera/CameraBean;->h:Z

    iget-object v6, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    iget v7, p0, Lcom/friday/common/camera/CameraBean;->j:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "CameraBean(imageType="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fixAspectRatio="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", ratioX="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ratioY="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", compress="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", deviceCode="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/friday/common/camera/CameraBean;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/camera/CameraBean;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/friday/common/camera/CameraBean;->e:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/friday/common/camera/CameraBean;->f:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/friday/common/camera/CameraBean;->g:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/friday/common/camera/CameraBean;->h:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/friday/common/camera/CameraBean;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/friday/common/camera/CameraBean;->j:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
