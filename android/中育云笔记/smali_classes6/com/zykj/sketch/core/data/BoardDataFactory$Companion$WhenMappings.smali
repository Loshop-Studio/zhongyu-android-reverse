.class public final synthetic Lcom/zykj/sketch/core/data/BoardDataFactory$Companion$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->values()[Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
