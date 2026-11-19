.class public final Lcom/friday/common/entity/SyncStateCode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/SyncStateCode$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final COMPLETED:I = 0x0

.field public static final Companion:Lcom/friday/common/entity/SyncStateCode$Companion;

.field public static final DELETE_ERROR:I = 0x1e

.field public static final INSERT_ERROR:I = 0xa

.field public static final STATE_EXCEPTION:I = 0x5

.field public static final TO_BE_DELETED:I = 0x3

.field public static final TO_BE_INSERTED:I = 0x1

.field public static final TO_BE_REPLACED:I = 0x4

.field public static final TO_BE_UPDATED:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/entity/SyncStateCode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/entity/SyncStateCode$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/entity/SyncStateCode;->Companion:Lcom/friday/common/entity/SyncStateCode$Companion;

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
