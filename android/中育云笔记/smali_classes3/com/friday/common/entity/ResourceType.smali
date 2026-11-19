.class public final Lcom/friday/common/entity/ResourceType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/ResourceType$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final ADDED_IMAGE:I = 0x0

.field public static final BIN:I = 0x1

.field public static final Companion:Lcom/friday/common/entity/ResourceType$Companion;

.field public static final THUMBNAIL_IMAGE:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/entity/ResourceType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/entity/ResourceType$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/entity/ResourceType;->Companion:Lcom/friday/common/entity/ResourceType$Companion;

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
