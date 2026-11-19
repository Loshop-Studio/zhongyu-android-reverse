.class public final Lu7/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 6
    new-array v0, v0, [Lu7/y;

    iput-object v0, p0, Lu7/y;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lu7/y;->a:I

    .line 8
    iput v0, p0, Lu7/y;->b:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lu7/y;->c:Ljava/lang/Object;

    .line 11
    iput p1, p0, Lu7/y;->a:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 12
    :cond_0
    iput p1, p0, Lu7/y;->b:I

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lu7/y;->c:Ljava/lang/Object;

    .line 3
    iput p2, p0, Lu7/y;->a:I

    .line 4
    iput p3, p0, Lu7/y;->b:I

    return-void
.end method
