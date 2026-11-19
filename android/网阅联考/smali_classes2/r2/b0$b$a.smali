.class public final Lr2/b0$b$a;
.super Lr2/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/b0$b;->b(Lokio/BufferedSource;Lr2/v;J)Lr2/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lokio/BufferedSource;

.field public final synthetic d:Lr2/v;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lokio/BufferedSource;Lr2/v;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/b0$b$a;->c:Lokio/BufferedSource;

    .line 2
    .line 3
    iput-object p2, p0, Lr2/b0$b$a;->d:Lr2/v;

    .line 4
    .line 5
    iput-wide p3, p0, Lr2/b0$b$a;->e:J

    .line 6
    .line 7
    invoke-direct {p0}, Lr2/b0;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lr2/b0$b$a;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d()Lr2/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/b0$b$a;->d:Lr2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/b0$b$a;->c:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
