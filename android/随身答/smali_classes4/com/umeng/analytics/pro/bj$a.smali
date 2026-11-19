.class public Lcom/umeng/analytics/pro/bj$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/br;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/bj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/umeng/analytics/pro/bj$a;->a:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public h(Lg2/c0;)Lg2/s;
    .locals 3

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/bj;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/umeng/analytics/pro/bj$a;->a:J

    .line 4
    .line 5
    invoke-direct {v0, p1, v1, v2}, Lcom/umeng/analytics/pro/bj;-><init>(Lg2/c0;J)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
