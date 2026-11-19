.class public final Lg2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:B

.field public final b:I


# direct methods
.method public constructor <init>(BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-byte p1, p0, Lg2/t;->a:B

    .line 3
    iput p2, p0, Lg2/t;->b:I

    return-void
.end method

.method public constructor <init>(Lg2/q;)V
    .locals 1

    .line 4
    iget-byte v0, p1, Lg2/q;->a:B

    iget p1, p1, Lg2/q;->b:I

    invoke-direct {p0, v0, p1}, Lg2/t;-><init>(BI)V

    return-void
.end method
