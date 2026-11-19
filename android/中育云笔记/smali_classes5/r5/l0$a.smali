.class public Lr5/l0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr5/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:J

.field public final synthetic d:Lr5/l0;


# direct methods
.method public constructor <init>(Lr5/l0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lr5/l0$a;->d:Lr5/l0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lr5/l0$a;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/l0$a;->d:Lr5/l0;

    .line 2
    .line 3
    invoke-static {v0}, Lr5/l0;->b(Lr5/l0;)Lr5/l0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-wide p1, v0, Lr5/l0$a;->c:J

    .line 8
    .line 9
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/l0$a;->d:Lr5/l0;

    .line 2
    .line 3
    invoke-static {v0}, Lr5/l0;->b(Lr5/l0;)Lr5/l0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object p1, v0, Lr5/l0$a;->b:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/l0$a;->d:Lr5/l0;

    .line 2
    .line 3
    invoke-static {v0}, Lr5/l0;->b(Lr5/l0;)Lr5/l0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object p1, v0, Lr5/l0$a;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method
