.class public Le9/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le9/a;


# direct methods
.method public constructor <init>(Le9/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/a$a;->a:Le9/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lz8/c;FIZ)Z
    .locals 8

    .line 1
    iget-byte p2, p1, Lz8/c;->n:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    iget-object p2, p0, Le9/a$a;->a:Le9/a;

    .line 7
    .line 8
    invoke-static {p2}, Le9/a;->g(Le9/a;)Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-object v1, p2, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 13
    .line 14
    iget-object p2, p0, Le9/a$a;->a:Le9/a;

    .line 15
    .line 16
    invoke-static {p2}, Le9/a;->f(Le9/a;)Lz8/e;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iget-object p2, p0, Le9/a$a;->a:Le9/a;

    .line 21
    .line 22
    invoke-static {p2}, Le9/a;->g(Le9/a;)Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const/4 v4, 0x0

    .line 27
    move-object v2, p1

    .line 28
    move v3, p3

    .line 29
    move v6, p4

    .line 30
    invoke-virtual/range {v1 .. v7}, Ly8/b;->c(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Lz8/c;->D(Z)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    return v0
.end method
