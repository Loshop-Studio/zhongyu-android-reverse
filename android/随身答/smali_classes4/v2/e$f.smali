.class public Lv2/e$f;
.super Lv2/e$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static b:J = 0x3a98L

.field public static c:J = 0xbb8L

.field public static d:J = 0x15f90L


# instance fields
.field public a:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lv2/e$h;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Z)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv2/e$f;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d(J)V
    .locals 2

    .line 1
    sget-wide v0, Lv2/e$f;->c:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    sget-wide v0, Lv2/e$f;->d:J

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    iput-wide p1, p0, Lv2/e$f;->a:J

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-wide p1, Lv2/e$f;->b:J

    .line 17
    .line 18
    iput-wide p1, p0, Lv2/e$f;->a:J

    .line 19
    .line 20
    return-void
.end method
