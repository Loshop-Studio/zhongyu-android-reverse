.class public abstract Lj6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/q$a;,
        Lj6/q$b;,
        Lj6/q$c;,
        Lj6/q$d;,
        Lj6/q$e;,
        Lj6/q$f;,
        Lj6/q$g;,
        Lj6/q$h;,
        Lj6/q$i;,
        Lj6/q$j;,
        Lj6/q$k;,
        Lj6/q$l;,
        Lj6/q$m;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;J)V
    .locals 1

    const-string v0, "name"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lj6/q;->a:J

    .line 4
    iput-wide p3, p0, Lj6/q;->b:J

    .line 5
    iput-object p5, p0, Lj6/q;->c:Ljava/lang/String;

    .line 6
    iput-wide p6, p0, Lj6/q;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lj6/q;-><init>(JJLjava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lj6/q;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/q;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lj6/q;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lj6/q;->d:J

    .line 2
    .line 3
    return-wide v0
.end method
