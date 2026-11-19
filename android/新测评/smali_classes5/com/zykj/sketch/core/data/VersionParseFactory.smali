.class public final Lcom/zykj/sketch/core/data/VersionParseFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/sketch/core/data/VersionParseFactory;",
        "",
        "()V",
        "Companion",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;

.field private static flag:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/sketch/core/data/VersionParseFactory;->Companion:Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getFlag$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/sketch/core/data/VersionParseFactory;->flag:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$setFlag$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/zykj/sketch/core/data/VersionParseFactory;->flag:I

    .line 2
    .line 3
    return-void
.end method
