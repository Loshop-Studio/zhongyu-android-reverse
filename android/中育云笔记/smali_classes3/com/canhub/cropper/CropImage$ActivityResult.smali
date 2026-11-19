.class public Lcom/canhub/cropper/CropImage$ActivityResult;
.super Lcom/canhub/cropper/CropImageView$b;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropImage$ActivityResult$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/canhub/cropper/CropImage$ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Lcom/canhub/cropper/CropImage$ActivityResult$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/canhub/cropper/CropImage$ActivityResult$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/canhub/cropper/CropImage$ActivityResult$b;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/canhub/cropper/CropImage$ActivityResult;->m:Lcom/canhub/cropper/CropImage$ActivityResult$b;

    .line 8
    .line 9
    new-instance v0, Lcom/canhub/cropper/CropImage$ActivityResult$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/canhub/cropper/CropImage$ActivityResult$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/canhub/cropper/CropImage$ActivityResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;ILandroid/graphics/Rect;I)V
    .locals 11

    .line 1
    invoke-static {p4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move/from16 v9, p6

    move-object/from16 v8, p7

    move/from16 v10, p8

    .line 2
    invoke-direct/range {v0 .. v10}, Lcom/canhub/cropper/CropImageView$b;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 13

    const-string v0, "in"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/net/Uri;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/net/Uri;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Exception;

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->createFloatArray()[F

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 7
    const-class v0, Landroid/graphics/Rect;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/graphics/Rect;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/graphics/Rect;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    .line 11
    invoke-direct/range {v2 .. v12}, Lcom/canhub/cropper/CropImageView$b;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->g()Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->j()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->c()Ljava/lang/Exception;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->a()[F

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloatArray([F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->b()Landroid/graphics/Rect;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->k()Landroid/graphics/Rect;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->h()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView$b;->i()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
