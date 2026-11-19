.class public final Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008\"\u0004\u0008\u000c\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;",
        "",
        "deviceNumber",
        "",
        "description",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getDeviceNumber",
        "()Ljava/lang/String;",
        "setDeviceNumber",
        "(Ljava/lang/String;)V",
        "getDescription",
        "setDescription",
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
.field public static final $stable:I = 0x8


# instance fields
.field private description:Ljava/lang/String;

.field private deviceNumber:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;->deviceNumber:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;->description:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDeviceNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;->deviceNumber:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDeviceNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;->deviceNumber:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
