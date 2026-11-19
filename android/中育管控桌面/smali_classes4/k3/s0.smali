.class public abstract Lk3/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/s0$a;,
        Lk3/s0$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:J

.field public final h:I

.field public final i:Z

.field public final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZJIZZ)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tips"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delete"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lk3/s0;->a:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lk3/s0;->b:Z

    .line 5
    iput-object p3, p0, Lk3/s0;->c:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lk3/s0;->d:Z

    .line 7
    iput-object p5, p0, Lk3/s0;->e:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lk3/s0;->f:Z

    .line 9
    iput-wide p7, p0, Lk3/s0;->g:J

    .line 10
    iput p9, p0, Lk3/s0;->h:I

    .line 11
    iput-boolean p10, p0, Lk3/s0;->i:Z

    .line 12
    iput-boolean p11, p0, Lk3/s0;->j:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZJIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    .line 13
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move p2, v3

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move-object p3, v2

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_0

    :cond_3
    move v1, p4

    :goto_0
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, p5

    :goto_1
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_5

    move v4, v3

    goto :goto_2

    :cond_5
    move v4, p6

    :goto_2
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_6

    .line 14
    invoke-static {}, Ln3/a;->c()J

    move-result-wide v5

    goto :goto_3

    :cond_6
    move-wide/from16 v5, p7

    :goto_3
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    .line 15
    sget v7, Lcom/zykj/gallery/R$drawable;->gallery_icon_back:I

    goto :goto_4

    :cond_7
    move/from16 v7, p9

    :goto_4
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move/from16 v8, p10

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    goto :goto_6

    :cond_9
    move/from16 v3, p11

    :goto_6
    const/4 v0, 0x0

    move-object p4, p3

    move-object/from16 p13, v0

    move p5, v1

    move-object p6, v2

    move/from16 p12, v3

    move/from16 p7, v4

    move-wide/from16 p8, v5

    move/from16 p10, v7

    move/from16 p11, v8

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 16
    invoke-direct/range {p1 .. p13}, Lk3/s0;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZJIZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZJIZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lk3/s0;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZJIZZ)V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()J
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk3/s0;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/s0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Z
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk3/s0;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract h()Z
.end method

.method public abstract i()Z
.end method
