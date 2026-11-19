.class public final Lcom/zykj/evaluation/version/VersionResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0006\n\u0002\u00082\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\t\u0010<\u001a\u00020\u0006H\u00c6\u0003J\t\u0010=\u001a\u00020\u0013H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\u00bd\u0001\u0010B\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010C\u001a\u00020\u0003J\u0013\u0010D\u001a\u00020\n2\u0008\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001J\t\u0010H\u001a\u00020\u0006H\u00d6\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001bR\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001eR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001bR\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001eR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001e\u00a8\u0006N"
    }
    d2 = {
        "Lcom/zykj/evaluation/version/VersionResult;",
        "Landroid/os/Parcelable;",
        "appType",
        "",
        "appVersionId",
        "creationTime",
        "",
        "creatorUserId",
        "description",
        "disabled",
        "",
        "downloads",
        "fileUrl",
        "forceUpdate",
        "icon",
        "id",
        "name",
        "packageName",
        "score",
        "",
        "size",
        "summary",
        "versionCode",
        "versionName",
        "<init>",
        "(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)V",
        "getAppType",
        "()I",
        "getAppVersionId",
        "getCreationTime",
        "()Ljava/lang/String;",
        "getCreatorUserId",
        "getDescription",
        "getDisabled",
        "()Z",
        "getDownloads",
        "getFileUrl",
        "getForceUpdate",
        "getIcon",
        "getId",
        "getName",
        "getPackageName",
        "getScore",
        "()D",
        "getSize",
        "getSummary",
        "getVersionCode",
        "getVersionName",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/evaluation/version/VersionResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final appType:I

.field private final appVersionId:I

.field private final creationTime:Ljava/lang/String;

.field private final creatorUserId:I

.field private final description:Ljava/lang/String;

.field private final disabled:Z

.field private final downloads:I

.field private final fileUrl:Ljava/lang/String;

.field private final forceUpdate:Z

.field private final icon:Ljava/lang/String;

.field private final id:I

.field private final name:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;

.field private final score:D

.field private final size:I

.field private final summary:Ljava/lang/String;

.field private final versionCode:I

.field private final versionName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/version/VersionResult$a;

    invoke-direct {v0}, Lcom/zykj/evaluation/version/VersionResult$a;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/version/VersionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)V
    .locals 6

    move-object/from16 v0, p10

    move-object/from16 v1, p12

    move-object/from16 v2, p13

    move-object/from16 v3, p17

    move-object/from16 v4, p19

    const-string v5, "creationTime"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "description"

    invoke-static {p5, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "fileUrl"

    invoke-static {p8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "icon"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "name"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "packageName"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "summary"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "versionName"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    .line 3
    iput p2, p0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    .line 4
    iput-object p3, p0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    .line 5
    iput p4, p0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    .line 6
    iput-object p5, p0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    .line 7
    iput-boolean p6, p0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    .line 8
    iput p7, p0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    .line 9
    iput-object p8, p0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    move p1, p9

    .line 10
    iput-boolean p1, p0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    .line 11
    iput-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    move/from16 p1, p11

    .line 12
    iput p1, p0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    .line 13
    iput-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    .line 14
    iput-object v2, p0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    move-wide/from16 p1, p14

    .line 15
    iput-wide p1, p0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    move/from16 p1, p16

    .line 16
    iput p1, p0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    .line 17
    iput-object v3, p0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    move/from16 p1, p18

    .line 18
    iput p1, p0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    .line 19
    iput-object v4, p0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/version/VersionResult;IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/version/VersionResult;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    move/from16 p1, v2

    move/from16 p2, v3

    if-eqz v15, :cond_d

    iget-wide v2, v0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    goto :goto_d

    :cond_d
    move-wide/from16 v2, p14

    :goto_d
    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    goto :goto_e

    :cond_e
    move/from16 v15, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    if-eqz v16, :cond_11

    move/from16 p4, v1

    iget-object v1, v0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    move/from16 p19, p4

    move-object/from16 p20, v1

    :goto_11
    move-object/from16 p18, p3

    move-wide/from16 p15, v2

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p17, v15

    move/from16 p3, p2

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p20, p19

    move/from16 p19, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p20}, Lcom/zykj/evaluation/version/VersionResult;->copy(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)Lcom/zykj/evaluation/version/VersionResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    return-wide v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    return v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    return v0
.end method

.method public final copy(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)Lcom/zykj/evaluation/version/VersionResult;
    .locals 21

    const-string v0, "creationTime"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUrl"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageName"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summary"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionName"

    move-object/from16 v2, p19

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/version/VersionResult;

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p9

    move/from16 v12, p11

    move-wide/from16 v15, p14

    move/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v20}, Lcom/zykj/evaluation/version/VersionResult;-><init>(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/version/VersionResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/version/VersionResult;

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->id:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    iget-wide v5, p1, Lcom/zykj/evaluation/version/VersionResult;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->size:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    iget v3, p1, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getAppType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAppVersionId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCreationTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCreatorUserId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDisabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDownloads()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getForceUpdate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSummary()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersionCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    .line 2
    .line 3
    return v0
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    iget v2, v0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    iget-object v3, v0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    iget v4, v0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    iget-object v5, v0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    iget v7, v0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    iget-object v8, v0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    iget-boolean v9, v0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    iget-object v10, v0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    iget v11, v0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    iget-object v12, v0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    iget-object v13, v0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    iget-wide v14, v0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    move-wide/from16 v16, v14

    iget v14, v0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    iget-object v15, v0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    move-object/from16 v18, v15

    iget v15, v0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    move/from16 v19, v15

    iget-object v15, v0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v15

    const-string v15, "VersionResult(appType="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", appVersionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", creationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", creatorUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", downloads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fileUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", forceUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", summary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", versionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", versionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->appType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->appVersionId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->creationTime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->creatorUserId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->description:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/version/VersionResult;->disabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->downloads:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->fileUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/version/VersionResult;->forceUpdate:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->icon:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->packageName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/evaluation/version/VersionResult;->score:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->size:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->summary:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/evaluation/version/VersionResult;->versionCode:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/version/VersionResult;->versionName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
