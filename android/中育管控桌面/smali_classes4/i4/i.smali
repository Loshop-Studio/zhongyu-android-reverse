.class public final Li4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li4/i;

.field public static b:J

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li4/i;

    .line 2
    .line 3
    invoke-direct {v0}, Li4/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li4/i;->a:Li4/i;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Li4/i;->c:I

    .line 11
    .line 12
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
.method public final a()Z
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Li4/i;->b:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x1f4

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    sput-wide v0, Li4/i;->b:J

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method
