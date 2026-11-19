.class public final Le5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le5/e;

    .line 2
    .line 3
    invoke-direct {v0}, Le5/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le5/e;->a:Le5/e;

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
.method public final a(IF)I
    .locals 1

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    int-to-float v0, v0

    .line 8
    mul-float/2addr p2, v0

    .line 9
    float-to-int p2, p2

    .line 10
    shl-int/lit8 p2, p2, 0x18

    .line 11
    .line 12
    or-int/2addr p1, p2

    .line 13
    return p1
.end method

.method public final b(I)I
    .locals 1

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    const/high16 v0, -0x1000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    return p1
.end method
