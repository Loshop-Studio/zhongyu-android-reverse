.class public abstract Lcom/zykj/evaluation/ui/sheet/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/sheet/c$a;,
        Lcom/zykj/evaluation/ui/sheet/c$b;,
        Lcom/zykj/evaluation/ui/sheet/c$c;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/evaluation/ui/sheet/c;->a:J

    .line 4
    iput-wide p3, p0, Lcom/zykj/evaluation/ui/sheet/c;->b:J

    .line 5
    iput-wide p5, p0, Lcom/zykj/evaluation/ui/sheet/c;->c:J

    return-void
.end method

.method public synthetic constructor <init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/c;-><init>(JJJ)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/sheet/c;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/sheet/c;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/sheet/c;->a:J

    .line 2
    .line 3
    return-wide v0
.end method
