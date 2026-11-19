.class public final Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bu\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u008d\u0001\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0011R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0011\u00a8\u0006."
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;",
        "",
        "fxDate",
        "",
        "tempMin",
        "tempMax",
        "textDay",
        "iconDay",
        "iconNight",
        "textNight",
        "windDirDay",
        "windScaleDay",
        "windDirNight",
        "windScaleNight",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getFxDate",
        "()Ljava/lang/String;",
        "getTempMin",
        "getTempMax",
        "getTextDay",
        "getIconDay",
        "getIconNight",
        "getTextNight",
        "getWindDirDay",
        "getWindScaleDay",
        "getWindDirNight",
        "getWindScaleNight",
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
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final fxDate:Ljava/lang/String;

.field private final iconDay:Ljava/lang/String;

.field private final iconNight:Ljava/lang/String;

.field private final tempMax:Ljava/lang/String;

.field private final tempMin:Ljava/lang/String;

.field private final textDay:Ljava/lang/String;

.field private final textNight:Ljava/lang/String;

.field private final windDirDay:Ljava/lang/String;

.field private final windDirNight:Ljava/lang/String;

.field private final windScaleDay:Ljava/lang/String;

.field private final windScaleNight:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 12

    new-instance v0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getFxDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIconDay()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIconNight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTempMax()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTempMin()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextDay()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextNight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWindDirDay()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWindDirNight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWindScaleDay()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWindScaleNight()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->fxDate:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMin:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->tempMax:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textDay:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconDay:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->iconNight:Ljava/lang/String;

    iget-object v6, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->textNight:Ljava/lang/String;

    iget-object v7, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirDay:Ljava/lang/String;

    iget-object v8, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleDay:Ljava/lang/String;

    iget-object v9, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windDirNight:Ljava/lang/String;

    iget-object v10, p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->windScaleNight:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "WeatherCityBean(fxDate="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tempMin="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tempMax="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", textDay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconDay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconNight="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", textNight="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", windDirDay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", windScaleDay="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", windDirNight="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", windScaleNight="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
