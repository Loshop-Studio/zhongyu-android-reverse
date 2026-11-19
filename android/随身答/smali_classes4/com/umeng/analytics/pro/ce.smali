.class public Lcom/umeng/analytics/pro/ce;
.super Lcom/umeng/analytics/pro/aw;
.source "SourceFile"


# instance fields
.field public a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/aw;-><init>()V

    .line 2
    iput p1, p0, Lcom/umeng/analytics/pro/ce;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/ce;->a:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 0

    .line 7
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/Throwable;)V

    .line 8
    iput p1, p0, Lcom/umeng/analytics/pro/ce;->a:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/umeng/analytics/pro/ce;->a:I

    return-void
.end method
