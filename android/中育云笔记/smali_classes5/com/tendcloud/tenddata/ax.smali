.class public Lcom/tendcloud/tenddata/ax;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field private static final a:J = 0x6db9dfe70a9994e4L


# instance fields
.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/tendcloud/tenddata/ax;->b:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    iput p1, p0, Lcom/tendcloud/tenddata/ax;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tendcloud/tenddata/ax;->b:I

    .line 2
    .line 3
    return v0
.end method
