.class public abstract synthetic Lcom/zykj/mistake/feature/ask/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->values()[Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->BOARD_NOTE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->STEM:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->PICTURE_NOTE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v4, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->TYPICAL_ERROR:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x4

    aput v5, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    sput-object v0, Lcom/zykj/mistake/feature/ask/n0;->a:[I

    invoke-static {}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->values()[Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4
    sget-object v4, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->IMAGE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v1, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->TEXT:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->WEB:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Lcom/zykj/mistake/feature/ask/n0;->b:[I

    return-void
.end method
