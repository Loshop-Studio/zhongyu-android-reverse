.class public abstract Lcom/zykj/evaluation/bean/constant/MistakeTag;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/bean/constant/MistakeTag$Add;,
        Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;,
        Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;,
        Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u000c\r\u000e\u000fB\u001b\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/constant/MistakeTag;",
        "",
        "id",
        "",
        "name",
        "",
        "<init>",
        "(JLjava/lang/String;)V",
        "getId",
        "()J",
        "getName",
        "()Ljava/lang/String;",
        "Add",
        "Diff",
        "AttainedLevel",
        "ErrorReason",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$Add;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;",
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
.field private final id:J

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/zykj/evaluation/bean/constant/MistakeTag;->id:J

    iput-object p3, p0, Lcom/zykj/evaluation/bean/constant/MistakeTag;->name:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/bean/constant/MistakeTag;-><init>(JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/constant/MistakeTag;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/constant/MistakeTag;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
