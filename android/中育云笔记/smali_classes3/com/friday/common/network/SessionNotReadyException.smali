.class public final Lcom/friday/common/network/SessionNotReadyException;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    const-string v0, "\u767b\u5f55\u4fe1\u606f\u6682\u672a\u5c31\u7eea\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lcom/friday/common/network/SessionNotReadyException;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method
