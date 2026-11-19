.class public final Lcom/zykj/lib/error/code/ErrorCodeHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/lib/error/code/ErrorCodeHandler;",
        "",
        "()V",
        "getErrorCode",
        "Lcom/zykj/lib/error/code/ErrorCode;",
        "code",
        "",
        "code_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/lib/error/code/ErrorCodeHandler;

    invoke-direct {v0}, Lcom/zykj/lib/error/code/ErrorCodeHandler;-><init>()V

    sput-object v0, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;
    .locals 4

    invoke-static {}, Lcom/zykj/lib/error/code/ErrorCode;->values()[Lcom/zykj/lib/error/code/ErrorCode;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x36

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    invoke-virtual {v2}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    move-result v3

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    return-object p1
.end method
