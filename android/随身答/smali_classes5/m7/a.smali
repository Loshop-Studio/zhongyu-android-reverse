.class public final Lm7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm7/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm7/a;->a:Lm7/a;

    .line 7
    .line 8
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


# virtual methods
.method public final a(I)Z
    .locals 6

    .line 1
    shr-int/lit8 v0, p1, 0x10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    shr-int/lit8 v1, p1, 0x8

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    and-int/lit16 p1, p1, 0xff

    .line 10
    .line 11
    int-to-double v2, v0

    .line 12
    const-wide v4, 0x3fd322d0e5604189L    # 0.299

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr v2, v4

    .line 18
    int-to-double v0, v1

    .line 19
    const-wide v4, 0x3fe27ef9db22d0e5L    # 0.578

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    mul-double/2addr v0, v4

    .line 25
    add-double/2addr v2, v0

    .line 26
    int-to-double v0, p1

    .line 27
    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    mul-double/2addr v0, v4

    .line 33
    add-double/2addr v2, v0

    .line 34
    const-wide/high16 v0, 0x4068000000000000L    # 192.0

    .line 35
    .line 36
    cmpl-double p1, v2, v0

    .line 37
    .line 38
    if-ltz p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return p1
.end method
