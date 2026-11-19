.class public Ly8/b$l;
.super Ly8/b$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly8/b$k;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Ly8/b$k;->a:Ljava/util/List;

    .line 4
    .line 5
    iget-object p3, p1, Lz8/c;->B:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p2, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :goto_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget p3, p1, Lz8/c;->F:I

    .line 19
    .line 20
    or-int/lit8 p3, p3, 0x20

    .line 21
    .line 22
    iput p3, p1, Lz8/c;->F:I

    .line 23
    .line 24
    :cond_1
    return p2
.end method
