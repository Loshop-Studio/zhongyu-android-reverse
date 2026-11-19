.class public Lu1/a$b$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu1/a$b;->g(Lcom/liulishuo/okdownload/a;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/liulishuo/okdownload/a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Lu1/a$b;


# direct methods
.method public constructor <init>(Lu1/a$b;Lcom/liulishuo/okdownload/a;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/a$b$k;->d:Lu1/a$b;

    .line 2
    .line 3
    iput-object p2, p0, Lu1/a$b$k;->a:Lcom/liulishuo/okdownload/a;

    .line 4
    .line 5
    iput p3, p0, Lu1/a$b$k;->b:I

    .line 6
    .line 7
    iput-wide p4, p0, Lu1/a$b$k;->c:J

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lu1/a$b$k;->a:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a;->r()Lq1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu1/a$b$k;->a:Lcom/liulishuo/okdownload/a;

    .line 8
    .line 9
    iget v2, p0, Lu1/a$b$k;->b:I

    .line 10
    .line 11
    iget-wide v3, p0, Lu1/a$b$k;->c:J

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3, v4}, Lq1/a;->g(Lcom/liulishuo/okdownload/a;IJ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
